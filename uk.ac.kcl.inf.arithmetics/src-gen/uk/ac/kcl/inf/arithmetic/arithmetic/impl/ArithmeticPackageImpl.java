/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticFactory;
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage;
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticsProgram;
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.Expression;
import uk.ac.kcl.inf.arithmetic.arithmetic.IntLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.MultiplicationStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.NumberExpression;
import uk.ac.kcl.inf.arithmetic.arithmetic.PowerStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.RealLiteral;
import uk.ac.kcl.inf.arithmetic.arithmetic.Statement;
import uk.ac.kcl.inf.arithmetic.arithmetic.SubtractionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticPackageImpl extends EPackageImpl implements ArithmeticPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticsProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtractionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divisionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass powerStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArithmeticPackageImpl()
  {
    super(eNS_URI, ArithmeticFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link ArithmeticPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArithmeticPackage init()
  {
    if (isInited) return (ArithmeticPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmeticPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredArithmeticPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ArithmeticPackageImpl theArithmeticPackage = registeredArithmeticPackage instanceof ArithmeticPackageImpl ? (ArithmeticPackageImpl)registeredArithmeticPackage : new ArithmeticPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theArithmeticPackage.createPackageContents();

    // Initialize created meta-data
    theArithmeticPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArithmeticPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArithmeticPackage.eNS_URI, theArithmeticPackage);
    return theArithmeticPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArithmeticsProgram()
  {
    return arithmeticsProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArithmeticsProgram_States()
  {
    return (EReference)arithmeticsProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAdditionStatement()
  {
    return additionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAdditionStatement_Addend1()
  {
    return (EReference)additionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAdditionStatement_Addend2()
  {
    return (EReference)additionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubtractionStatement()
  {
    return subtractionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubtractionStatement_Minuend()
  {
    return (EReference)subtractionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubtractionStatement_Subtrahend()
  {
    return (EReference)subtractionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMultiplicationStatement()
  {
    return multiplicationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplicationStatement_Multiplier1()
  {
    return (EReference)multiplicationStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMultiplicationStatement_Multiplier2()
  {
    return (EReference)multiplicationStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDivisionStatement()
  {
    return divisionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDivisionStatement_Dividend()
  {
    return (EReference)divisionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDivisionStatement_Divisor()
  {
    return (EReference)divisionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPowerStatement()
  {
    return powerStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPowerStatement_Basenumber()
  {
    return (EReference)powerStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPowerStatement_Times()
  {
    return (EAttribute)powerStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumberExpression()
  {
    return numberExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntLiteral()
  {
    return intLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntLiteral_Num()
  {
    return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRealLiteral()
  {
    return realLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRealLiteral_Num()
  {
    return (EAttribute)realLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticFactory getArithmeticFactory()
  {
    return (ArithmeticFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    arithmeticsProgramEClass = createEClass(ARITHMETICS_PROGRAM);
    createEReference(arithmeticsProgramEClass, ARITHMETICS_PROGRAM__STATES);

    statementEClass = createEClass(STATEMENT);

    expressionEClass = createEClass(EXPRESSION);

    additionStatementEClass = createEClass(ADDITION_STATEMENT);
    createEReference(additionStatementEClass, ADDITION_STATEMENT__ADDEND1);
    createEReference(additionStatementEClass, ADDITION_STATEMENT__ADDEND2);

    subtractionStatementEClass = createEClass(SUBTRACTION_STATEMENT);
    createEReference(subtractionStatementEClass, SUBTRACTION_STATEMENT__MINUEND);
    createEReference(subtractionStatementEClass, SUBTRACTION_STATEMENT__SUBTRAHEND);

    multiplicationStatementEClass = createEClass(MULTIPLICATION_STATEMENT);
    createEReference(multiplicationStatementEClass, MULTIPLICATION_STATEMENT__MULTIPLIER1);
    createEReference(multiplicationStatementEClass, MULTIPLICATION_STATEMENT__MULTIPLIER2);

    divisionStatementEClass = createEClass(DIVISION_STATEMENT);
    createEReference(divisionStatementEClass, DIVISION_STATEMENT__DIVIDEND);
    createEReference(divisionStatementEClass, DIVISION_STATEMENT__DIVISOR);

    powerStatementEClass = createEClass(POWER_STATEMENT);
    createEReference(powerStatementEClass, POWER_STATEMENT__BASENUMBER);
    createEAttribute(powerStatementEClass, POWER_STATEMENT__TIMES);

    numberExpressionEClass = createEClass(NUMBER_EXPRESSION);

    intLiteralEClass = createEClass(INT_LITERAL);
    createEAttribute(intLiteralEClass, INT_LITERAL__NUM);

    realLiteralEClass = createEClass(REAL_LITERAL);
    createEAttribute(realLiteralEClass, REAL_LITERAL__NUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    additionStatementEClass.getESuperTypes().add(this.getStatement());
    additionStatementEClass.getESuperTypes().add(this.getExpression());
    subtractionStatementEClass.getESuperTypes().add(this.getStatement());
    subtractionStatementEClass.getESuperTypes().add(this.getExpression());
    multiplicationStatementEClass.getESuperTypes().add(this.getStatement());
    multiplicationStatementEClass.getESuperTypes().add(this.getExpression());
    divisionStatementEClass.getESuperTypes().add(this.getStatement());
    divisionStatementEClass.getESuperTypes().add(this.getExpression());
    powerStatementEClass.getESuperTypes().add(this.getStatement());
    powerStatementEClass.getESuperTypes().add(this.getExpression());
    numberExpressionEClass.getESuperTypes().add(this.getExpression());
    intLiteralEClass.getESuperTypes().add(this.getNumberExpression());
    realLiteralEClass.getESuperTypes().add(this.getNumberExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(arithmeticsProgramEClass, ArithmeticsProgram.class, "ArithmeticsProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArithmeticsProgram_States(), this.getStatement(), null, "states", null, 0, -1, ArithmeticsProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additionStatementEClass, AdditionStatement.class, "AdditionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditionStatement_Addend1(), this.getExpression(), null, "addend1", null, 0, 1, AdditionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditionStatement_Addend2(), this.getExpression(), null, "addend2", null, 0, 1, AdditionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subtractionStatementEClass, SubtractionStatement.class, "SubtractionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubtractionStatement_Minuend(), this.getExpression(), null, "minuend", null, 0, 1, SubtractionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubtractionStatement_Subtrahend(), this.getExpression(), null, "subtrahend", null, 0, 1, SubtractionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationStatementEClass, MultiplicationStatement.class, "MultiplicationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicationStatement_Multiplier1(), this.getExpression(), null, "multiplier1", null, 0, 1, MultiplicationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicationStatement_Multiplier2(), this.getExpression(), null, "multiplier2", null, 0, 1, MultiplicationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divisionStatementEClass, DivisionStatement.class, "DivisionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDivisionStatement_Dividend(), this.getExpression(), null, "dividend", null, 0, 1, DivisionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDivisionStatement_Divisor(), this.getExpression(), null, "divisor", null, 0, 1, DivisionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(powerStatementEClass, PowerStatement.class, "PowerStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPowerStatement_Basenumber(), this.getNumberExpression(), null, "basenumber", null, 0, 1, PowerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPowerStatement_Times(), ecorePackage.getEInt(), "times", null, 0, 1, PowerStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberExpressionEClass, NumberExpression.class, "NumberExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntLiteral_Num(), ecorePackage.getEInt(), "num", null, 0, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(realLiteralEClass, RealLiteral.class, "RealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealLiteral_Num(), ecorePackage.getEFloat(), "num", null, 0, 1, RealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ArithmeticPackageImpl
