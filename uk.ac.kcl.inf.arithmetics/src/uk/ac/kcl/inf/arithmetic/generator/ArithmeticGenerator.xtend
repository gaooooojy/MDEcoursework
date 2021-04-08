/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram
import uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement
import uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement
import uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement
import uk.ac.kcl.inf.arithmetic.arithmetic.Statement
import uk.ac.kcl.inf.arithmetic.arithmetic.NumberExpression
import uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral
import uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral
import uk.ac.kcl.inf.arithmetic.arithmetic.PowerStatement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ArithmeticGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as ArithmeticsProgram
		
		fsa.generateFile(deriveTargetFileNameFor(model, resource), model.generate)
		
		val className = resource.deriveClassName
		
		fsa.generateFile(className + '.java', model.doGenerateClass(className))
	}
	
	def deriveClassName(Resource resource){
		val origFilename = resource.URI.lastSegment
		
		origFilename.substring(0, origFilename.indexOf('.')).toFirstUpper + 'Arithmetics'
	}
	
	def deriveTargetFileNameFor(ArithmeticsProgram program, Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def generate(ArithmeticsProgram m)'''
		Program contains:
		    
		    - «m.eAllContents.filter(AdditionStatement).size» add statements
		    - «m.eAllContents.filter(SubtractionStatement).size» subtract statements
		    - «m.eAllContents.filter(MultiplicationStatement).size» multiple statements
		    - «m.eAllContents.filter(DivisionStatement).size» divide statements
	'''
	
	def doGenerateClass(ArithmeticsProgram program, String className)'''
		public class «className»{
				    public static void main (String[] args){
						«program.states.map[generateJavaStatement(new Environment)].join('\n')»
				    }
		}
	'''
	
	private static class Environment{
		var int counter = 0
		
		def getFreshVarName() '''i«counter++»'''
		
		def exit() { counter--}
	}
	
	dispatch def String generateJavaStatement(Statement stmt, Environment env)''''''
	
	dispatch def String generateJavaStatement(AdditionStatement stmt, Environment env)'''
	System.out.println(«stmt.addend1.generateJavaExpression»+«stmt.addend2.generateJavaExpression»);'''
	
	dispatch def String generateJavaStatement(SubtractionStatement stmt, Environment env)'''
	System.out.println(«stmt.minuend.generateJavaExpression»-«stmt.subtrahend.generateJavaExpression»);'''
	
	dispatch def String generateJavaStatement(MultiplicationStatement stmt, Environment env)'''
	System.out.println(«stmt.multiplier1.generateJavaExpression»*«stmt.multiplier2.generateJavaExpression»);'''
	
	dispatch def String generateJavaStatement(DivisionStatement stmt, Environment env)'''
	System.out.println(«stmt.dividend.generateJavaExpression»/«stmt.divisor.generateJavaExpression»);'''
	
	dispatch def String generateJavaStatement(PowerStatement stmt, Environment env)'''
«««	«IF stmt.times==0 »System.out.println(1)«ENDIF»
	«IF stmt.times==0 »System.out.println(1)«ELSEIF stmt.times==1»System.out.println(«stmt.basenumber.generateJavaExpression»)«ELSE»System.out.println(«stmt.basenumber.generateJavaExpression»«FOR idx:(0..stmt.times-2)»*«stmt.basenumber.generateJavaExpression»«ENDFOR»);«ENDIF»'''
	
	dispatch def String generateJavaStatement(NumberExpression stmt, Environment env)''''''
	
	dispatch def String generateJavaExpression(NumberExpression exp) ''''''
	
	dispatch def String generateJavaExpression(AdditionStatement exp) '''
	(«exp.addend1.generateJavaExpression»+«exp.addend2.generateJavaExpression»)'''
	
	dispatch def String generateJavaExpression(SubtractionStatement exp) '''
	(«exp.minuend.generateJavaExpression»-«exp.subtrahend.generateJavaExpression»)'''
	
	dispatch def String generateJavaExpression(MultiplicationStatement exp) '''
	(«exp.multiplier1.generateJavaExpression»*«exp.multiplier2.generateJavaExpression»)'''
	
	dispatch def String generateJavaExpression(DivisionStatement exp) '''
	(«exp.dividend.generateJavaExpression»/«exp.divisor.generateJavaExpression»)'''
	
	dispatch def String generateJavaExpression(PowerStatement exp)'''
«««	(«exp.basenumber.generateJavaExpression»«FOR idx:(0..exp.times-1)»*«exp.basenumber.generateJavaExpression»«ENDFOR»)
«««	Math.pow(«exp.basenumber.generateJavaExpression»,«exp.times»)
	«IF exp.times==0 »1«ELSEIF exp.times==1»(«exp.basenumber.generateJavaExpression»)«ELSE»(«exp.basenumber.generateJavaExpression»«FOR idx:(0..exp.times-2)»*«exp.basenumber.generateJavaExpression»«ENDFOR»)«ENDIF»'''
	
	dispatch def String generateJavaExpression(IntLiteral exp) '''«exp.num»'''
	
	dispatch def String generateJavaExpression(RealLiteral exp) '''«exp.num»'''
}
