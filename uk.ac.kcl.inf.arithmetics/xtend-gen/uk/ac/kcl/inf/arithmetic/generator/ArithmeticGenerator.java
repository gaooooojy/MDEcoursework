/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram;
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.Expression;
import uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.NumberExpression;
import uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.Statement;
import uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ArithmeticGenerator extends AbstractGenerator {
  private static class Environment {
    private int counter = 0;
    
    public CharSequence getFreshVarName() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i");
      int _plusPlus = this.counter++;
      _builder.append(_plusPlus);
      return _builder;
    }
    
    public int exit() {
      return this.counter--;
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final ArithmeticsProgram model = ((ArithmeticsProgram) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
    final String className = this.deriveClassName(resource);
    fsa.generateFile((className + ".java"), this.doGenerateClass(model, className));
  }
  
  public String deriveClassName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origFilename = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(origFilename.substring(0, origFilename.indexOf(".")));
      _xblockexpression = (_firstUpper + "Arithmetics");
    }
    return _xblockexpression;
  }
  
  public String deriveTargetFileNameFor(final ArithmeticsProgram program, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public CharSequence generate(final ArithmeticsProgram m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program contains:");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<AdditionStatement>filter(m.eAllContents(), AdditionStatement.class));
    _builder.append(_size, "    ");
    _builder.append(" add statements");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<SubtractionStatement>filter(m.eAllContents(), SubtractionStatement.class));
    _builder.append(_size_1, "    ");
    _builder.append(" subtract statements");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<MultiplicationStatement>filter(m.eAllContents(), MultiplicationStatement.class));
    _builder.append(_size_2, "    ");
    _builder.append(" multiple statements");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("- ");
    int _size_3 = IteratorExtensions.size(Iterators.<DivisionStatement>filter(m.eAllContents(), DivisionStatement.class));
    _builder.append(_size_3, "    ");
    _builder.append(" divide statements");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence doGenerateClass(final ArithmeticsProgram program, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("public static void main (String[] args){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    final Function1<Statement, String> _function = (Statement it) -> {
      ArithmeticGenerator.Environment _environment = new ArithmeticGenerator.Environment();
      return this.generateJavaStatement(it, _environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<Statement, String>map(program.getStates(), _function), "\n");
    _builder.append(_join, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected String _generateJavaStatement(final Statement stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final AdditionStatement stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    String _generateJavaExpression = this.generateJavaExpression(stmt.getAddend1());
    _builder.append(_generateJavaExpression);
    _builder.append("+");
    String _generateJavaExpression_1 = this.generateJavaExpression(stmt.getAddend2());
    _builder.append(_generateJavaExpression_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final SubtractionStatement stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    String _generateJavaExpression = this.generateJavaExpression(stmt.getMinuend());
    _builder.append(_generateJavaExpression);
    _builder.append("-");
    String _generateJavaExpression_1 = this.generateJavaExpression(stmt.getSubtrahend());
    _builder.append(_generateJavaExpression_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final MultiplicationStatement stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    String _generateJavaExpression = this.generateJavaExpression(stmt.getMultiplier1());
    _builder.append(_generateJavaExpression);
    _builder.append("*");
    String _generateJavaExpression_1 = this.generateJavaExpression(stmt.getMultiplier2());
    _builder.append(_generateJavaExpression_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final DivisionStatement stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    String _generateJavaExpression = this.generateJavaExpression(stmt.getDividend());
    _builder.append(_generateJavaExpression);
    _builder.append("/");
    String _generateJavaExpression_1 = this.generateJavaExpression(stmt.getDivisor());
    _builder.append(_generateJavaExpression_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final NumberExpression stmt, final ArithmeticGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final NumberExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final AdditionStatement exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(exp.getAddend1());
    _builder.append(_generateJavaExpression);
    _builder.append("+");
    String _generateJavaExpression_1 = this.generateJavaExpression(exp.getAddend2());
    _builder.append(_generateJavaExpression_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final SubtractionStatement exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(exp.getMinuend());
    _builder.append(_generateJavaExpression);
    _builder.append("-");
    String _generateJavaExpression_1 = this.generateJavaExpression(exp.getSubtrahend());
    _builder.append(_generateJavaExpression_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final MultiplicationStatement exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(exp.getMultiplier1());
    _builder.append(_generateJavaExpression);
    _builder.append("*");
    String _generateJavaExpression_1 = this.generateJavaExpression(exp.getMultiplier2());
    _builder.append(_generateJavaExpression_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final DivisionStatement exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(exp.getDividend());
    _builder.append(_generateJavaExpression);
    _builder.append("/");
    String _generateJavaExpression_1 = this.generateJavaExpression(exp.getDivisor());
    _builder.append(_generateJavaExpression_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final IntLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _num = exp.getNum();
    _builder.append(_num);
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final RealLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    float _num = exp.getNum();
    _builder.append(_num);
    return _builder.toString();
  }
  
  public String generateJavaStatement(final EObject stmt, final ArithmeticGenerator.Environment env) {
    if (stmt instanceof AdditionStatement) {
      return _generateJavaStatement((AdditionStatement)stmt, env);
    } else if (stmt instanceof DivisionStatement) {
      return _generateJavaStatement((DivisionStatement)stmt, env);
    } else if (stmt instanceof MultiplicationStatement) {
      return _generateJavaStatement((MultiplicationStatement)stmt, env);
    } else if (stmt instanceof NumberExpression) {
      return _generateJavaStatement((NumberExpression)stmt, env);
    } else if (stmt instanceof SubtractionStatement) {
      return _generateJavaStatement((SubtractionStatement)stmt, env);
    } else if (stmt instanceof Statement) {
      return _generateJavaStatement((Statement)stmt, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, env).toString());
    }
  }
  
  public String generateJavaExpression(final Expression exp) {
    if (exp instanceof IntLiteral) {
      return _generateJavaExpression((IntLiteral)exp);
    } else if (exp instanceof RealLiteral) {
      return _generateJavaExpression((RealLiteral)exp);
    } else if (exp instanceof AdditionStatement) {
      return _generateJavaExpression((AdditionStatement)exp);
    } else if (exp instanceof DivisionStatement) {
      return _generateJavaExpression((DivisionStatement)exp);
    } else if (exp instanceof MultiplicationStatement) {
      return _generateJavaExpression((MultiplicationStatement)exp);
    } else if (exp instanceof NumberExpression) {
      return _generateJavaExpression((NumberExpression)exp);
    } else if (exp instanceof SubtractionStatement) {
      return _generateJavaExpression((SubtractionStatement)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}