/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage;
import uk.ac.kcl.inf.arithmetic.arithmetic.DivisionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl#getDividend <em>Dividend</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.DivisionStatementImpl#getDivisor <em>Divisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivisionStatementImpl extends StatementImpl implements DivisionStatement
{
  /**
   * The cached value of the '{@link #getDividend() <em>Dividend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDividend()
   * @generated
   * @ordered
   */
  protected Expression dividend;

  /**
   * The cached value of the '{@link #getDivisor() <em>Divisor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivisor()
   * @generated
   * @ordered
   */
  protected Expression divisor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DivisionStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArithmeticPackage.Literals.DIVISION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getDividend()
  {
    return dividend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDividend(Expression newDividend, NotificationChain msgs)
  {
    Expression oldDividend = dividend;
    dividend = newDividend;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND, oldDividend, newDividend);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDividend(Expression newDividend)
  {
    if (newDividend != dividend)
    {
      NotificationChain msgs = null;
      if (dividend != null)
        msgs = ((InternalEObject)dividend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND, null, msgs);
      if (newDividend != null)
        msgs = ((InternalEObject)newDividend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND, null, msgs);
      msgs = basicSetDividend(newDividend, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND, newDividend, newDividend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getDivisor()
  {
    return divisor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDivisor(Expression newDivisor, NotificationChain msgs)
  {
    Expression oldDivisor = divisor;
    divisor = newDivisor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticPackage.DIVISION_STATEMENT__DIVISOR, oldDivisor, newDivisor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDivisor(Expression newDivisor)
  {
    if (newDivisor != divisor)
    {
      NotificationChain msgs = null;
      if (divisor != null)
        msgs = ((InternalEObject)divisor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.DIVISION_STATEMENT__DIVISOR, null, msgs);
      if (newDivisor != null)
        msgs = ((InternalEObject)newDivisor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.DIVISION_STATEMENT__DIVISOR, null, msgs);
      msgs = basicSetDivisor(newDivisor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.DIVISION_STATEMENT__DIVISOR, newDivisor, newDivisor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND:
        return basicSetDividend(null, msgs);
      case ArithmeticPackage.DIVISION_STATEMENT__DIVISOR:
        return basicSetDivisor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND:
        return getDividend();
      case ArithmeticPackage.DIVISION_STATEMENT__DIVISOR:
        return getDivisor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND:
        setDividend((Expression)newValue);
        return;
      case ArithmeticPackage.DIVISION_STATEMENT__DIVISOR:
        setDivisor((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND:
        setDividend((Expression)null);
        return;
      case ArithmeticPackage.DIVISION_STATEMENT__DIVISOR:
        setDivisor((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArithmeticPackage.DIVISION_STATEMENT__DIVIDEND:
        return dividend != null;
      case ArithmeticPackage.DIVISION_STATEMENT__DIVISOR:
        return divisor != null;
    }
    return super.eIsSet(featureID);
  }

} //DivisionStatementImpl