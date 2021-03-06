/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDividend <em>Dividend</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDivisor <em>Divisor</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage#getDivisionStatement()
 * @model
 * @generated
 */
public interface DivisionStatement extends Statement, Expression
{
  /**
   * Returns the value of the '<em><b>Dividend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dividend</em>' containment reference.
   * @see #setDividend(Expression)
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage#getDivisionStatement_Dividend()
   * @model containment="true"
   * @generated
   */
  Expression getDividend();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDividend <em>Dividend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dividend</em>' containment reference.
   * @see #getDividend()
   * @generated
   */
  void setDividend(Expression value);

  /**
   * Returns the value of the '<em><b>Divisor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Divisor</em>' containment reference.
   * @see #setDivisor(Expression)
   * @see uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage#getDivisionStatement_Divisor()
   * @model containment="true"
   * @generated
   */
  Expression getDivisor();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement#getDivisor <em>Divisor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Divisor</em>' containment reference.
   * @see #getDivisor()
   * @generated
   */
  void setDivisor(Expression value);

} // DivisionStatement
