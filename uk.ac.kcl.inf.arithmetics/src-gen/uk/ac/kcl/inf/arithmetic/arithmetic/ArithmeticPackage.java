/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticFactory
 * @model kind="package"
 * @generated
 */
public interface ArithmeticPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arithmetic";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/arithmetic/Arithmetic";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "arithmetic";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArithmeticPackage eINSTANCE = uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticsProgramImpl <em>Arithmetics Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticsProgramImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getArithmeticsProgram()
   * @generated
   */
  int ARITHMETICS_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETICS_PROGRAM__STATES = 0;

  /**
   * The number of structural features of the '<em>Arithmetics Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETICS_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.StatementImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ExpressionImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl <em>Addition Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getAdditionStatement()
   * @generated
   */
  int ADDITION_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Addend1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_STATEMENT__ADDEND1 = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_STATEMENT__OPERATOR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Addend2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_STATEMENT__ADDEND2 = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Addition Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.SubtractionStatementImpl <em>Subtraction Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.SubtractionStatementImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getSubtractionStatement()
   * @generated
   */
  int SUBTRACTION_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Minuend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_STATEMENT__MINUEND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subtrahend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_STATEMENT__SUBTRAHEND = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subtraction Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.MultiplicationStatementImpl <em>Multiplication Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.MultiplicationStatementImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getMultiplicationStatement()
   * @generated
   */
  int MULTIPLICATION_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Multiplier1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_STATEMENT__MULTIPLIER1 = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplier2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_STATEMENT__MULTIPLIER2 = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl <em>Division Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getDivisionStatement()
   * @generated
   */
  int DIVISION_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Dividend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_STATEMENT__DIVIDEND = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Divisor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_STATEMENT__DIVISOR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.NumberExpressionImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getNumberExpression()
   * @generated
   */
  int NUMBER_EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Number Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.IntLiteralImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__NUM = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.RealLiteralImpl
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__NUM = NUMBER_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = NUMBER_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram <em>Arithmetics Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetics Program</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram
   * @generated
   */
  EClass getArithmeticsProgram();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram#getStates()
   * @see #getArithmeticsProgram()
   * @generated
   */
  EReference getArithmeticsProgram_States();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement <em>Addition Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Statement</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement
   * @generated
   */
  EClass getAdditionStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getAddend1 <em>Addend1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addend1</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getAddend1()
   * @see #getAdditionStatement()
   * @generated
   */
  EReference getAdditionStatement_Addend1();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getOperator()
   * @see #getAdditionStatement()
   * @generated
   */
  EAttribute getAdditionStatement_Operator();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getAddend2 <em>Addend2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addend2</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement#getAddend2()
   * @see #getAdditionStatement()
   * @generated
   */
  EReference getAdditionStatement_Addend2();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement <em>Subtraction Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtraction Statement</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement
   * @generated
   */
  EClass getSubtractionStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement#getMinuend <em>Minuend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Minuend</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement#getMinuend()
   * @see #getSubtractionStatement()
   * @generated
   */
  EReference getSubtractionStatement_Minuend();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement#getSubtrahend <em>Subtrahend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtrahend</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement#getSubtrahend()
   * @see #getSubtractionStatement()
   * @generated
   */
  EReference getSubtractionStatement_Subtrahend();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement <em>Multiplication Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Statement</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement
   * @generated
   */
  EClass getMultiplicationStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement#getMultiplier1 <em>Multiplier1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplier1</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement#getMultiplier1()
   * @see #getMultiplicationStatement()
   * @generated
   */
  EReference getMultiplicationStatement_Multiplier1();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement#getMultiplier2 <em>Multiplier2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplier2</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement#getMultiplier2()
   * @see #getMultiplicationStatement()
   * @generated
   */
  EReference getMultiplicationStatement_Multiplier2();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement <em>Division Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division Statement</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement
   * @generated
   */
  EClass getDivisionStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDividend <em>Dividend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dividend</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDividend()
   * @see #getDivisionStatement()
   * @generated
   */
  EReference getDivisionStatement_Dividend();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDivisor <em>Divisor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Divisor</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDivisor()
   * @see #getDivisionStatement()
   * @generated
   */
  EReference getDivisionStatement_Divisor();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Expression</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.NumberExpression
   * @generated
   */
  EClass getNumberExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral#getNum()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Num();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral#getNum()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Num();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArithmeticFactory getArithmeticFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticsProgramImpl <em>Arithmetics Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticsProgramImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getArithmeticsProgram()
     * @generated
     */
    EClass ARITHMETICS_PROGRAM = eINSTANCE.getArithmeticsProgram();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETICS_PROGRAM__STATES = eINSTANCE.getArithmeticsProgram_States();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.StatementImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ExpressionImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl <em>Addition Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getAdditionStatement()
     * @generated
     */
    EClass ADDITION_STATEMENT = eINSTANCE.getAdditionStatement();

    /**
     * The meta object literal for the '<em><b>Addend1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_STATEMENT__ADDEND1 = eINSTANCE.getAdditionStatement_Addend1();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITION_STATEMENT__OPERATOR = eINSTANCE.getAdditionStatement_Operator();

    /**
     * The meta object literal for the '<em><b>Addend2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION_STATEMENT__ADDEND2 = eINSTANCE.getAdditionStatement_Addend2();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.SubtractionStatementImpl <em>Subtraction Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.SubtractionStatementImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getSubtractionStatement()
     * @generated
     */
    EClass SUBTRACTION_STATEMENT = eINSTANCE.getSubtractionStatement();

    /**
     * The meta object literal for the '<em><b>Minuend</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION_STATEMENT__MINUEND = eINSTANCE.getSubtractionStatement_Minuend();

    /**
     * The meta object literal for the '<em><b>Subtrahend</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBTRACTION_STATEMENT__SUBTRAHEND = eINSTANCE.getSubtractionStatement_Subtrahend();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.MultiplicationStatementImpl <em>Multiplication Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.MultiplicationStatementImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getMultiplicationStatement()
     * @generated
     */
    EClass MULTIPLICATION_STATEMENT = eINSTANCE.getMultiplicationStatement();

    /**
     * The meta object literal for the '<em><b>Multiplier1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_STATEMENT__MULTIPLIER1 = eINSTANCE.getMultiplicationStatement_Multiplier1();

    /**
     * The meta object literal for the '<em><b>Multiplier2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_STATEMENT__MULTIPLIER2 = eINSTANCE.getMultiplicationStatement_Multiplier2();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl <em>Division Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getDivisionStatement()
     * @generated
     */
    EClass DIVISION_STATEMENT = eINSTANCE.getDivisionStatement();

    /**
     * The meta object literal for the '<em><b>Dividend</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_STATEMENT__DIVIDEND = eINSTANCE.getDivisionStatement_Dividend();

    /**
     * The meta object literal for the '<em><b>Divisor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION_STATEMENT__DIVISOR = eINSTANCE.getDivisionStatement_Divisor();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.NumberExpressionImpl <em>Number Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.NumberExpressionImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getNumberExpression()
     * @generated
     */
    EClass NUMBER_EXPRESSION = eINSTANCE.getNumberExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.IntLiteralImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__NUM = eINSTANCE.getIntLiteral_Num();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.RealLiteralImpl
     * @see uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticPackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__NUM = eINSTANCE.getRealLiteral_Num();

  }

} //ArithmeticPackage
