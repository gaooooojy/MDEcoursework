/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage
import uk.ac.kcl.inf.arithmetic.typing.validation.ArithmeticsTypeSystemValidator

//import uk.ac.kcl.inf.arithmetic.arithmetic.PowerStatement

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ArithmeticValidator extends ArithmeticsTypeSystemValidator { 
	
	public static val INVALID_NUMBER = 'uk.ac.kcl.inf.arithmetics.INVALID_NUMBER'
	
	@Check
	def checkIntLiteralIsPositiveNumber(IntLiteral intl){
		if(intl.num == 0){
			warning("All the numbers should be positive numbers", 
				ArithmeticPackage.Literals.INT_LITERAL__NUM,
				INVALID_NUMBER
			)
		}
	}
}