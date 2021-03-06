/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage
 * @generated
 */
public interface ArithmeticFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArithmeticFactory eINSTANCE = uk.ac.kcl.inf.arithmetic.arithmetic.impl.ArithmeticFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Arithmetics Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetics Program</em>'.
   * @generated
   */
  ArithmeticsProgram createArithmeticsProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Addition Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Statement</em>'.
   * @generated
   */
  AdditionStatement createAdditionStatement();

  /**
   * Returns a new object of class '<em>Subtraction Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtraction Statement</em>'.
   * @generated
   */
  SubtractionStatement createSubtractionStatement();

  /**
   * Returns a new object of class '<em>Multiplication Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Statement</em>'.
   * @generated
   */
  MultiplicationStatement createMultiplicationStatement();

  /**
   * Returns a new object of class '<em>Division Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Division Statement</em>'.
   * @generated
   */
  DivisionStatement createDivisionStatement();

  /**
   * Returns a new object of class '<em>Power Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Statement</em>'.
   * @generated
   */
  PowerStatement createPowerStatement();

  /**
   * Returns a new object of class '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Expression</em>'.
   * @generated
   */
  NumberExpression createNumberExpression();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArithmeticPackage getArithmeticPackage();

} //ArithmeticFactory
