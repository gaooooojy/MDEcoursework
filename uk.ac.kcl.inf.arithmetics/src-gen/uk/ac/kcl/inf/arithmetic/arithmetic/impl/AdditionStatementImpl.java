/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.arithmetic.arithmetic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.arithmetic.arithmetic.AdditionStatement;
import uk.ac.kcl.inf.arithmetic.arithmetic.ArithmeticPackage;
import uk.ac.kcl.inf.arithmetic.arithmetic.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addition Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl#getAddend1 <em>Addend1</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.arithmetic.arithmetic.impl.AdditionStatementImpl#getAddend2 <em>Addend2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionStatementImpl extends StatementImpl implements AdditionStatement
{
  /**
   * The cached value of the '{@link #getAddend1() <em>Addend1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddend1()
   * @generated
   * @ordered
   */
  protected Expression addend1;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddend2() <em>Addend2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddend2()
   * @generated
   * @ordered
   */
  protected Expression addend2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditionStatementImpl()
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
    return ArithmeticPackage.Literals.ADDITION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getAddend1()
  {
    return addend1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddend1(Expression newAddend1, NotificationChain msgs)
  {
    Expression oldAddend1 = addend1;
    addend1 = newAddend1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticPackage.ADDITION_STATEMENT__ADDEND1, oldAddend1, newAddend1);
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
  public void setAddend1(Expression newAddend1)
  {
    if (newAddend1 != addend1)
    {
      NotificationChain msgs = null;
      if (addend1 != null)
        msgs = ((InternalEObject)addend1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.ADDITION_STATEMENT__ADDEND1, null, msgs);
      if (newAddend1 != null)
        msgs = ((InternalEObject)newAddend1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.ADDITION_STATEMENT__ADDEND1, null, msgs);
      msgs = basicSetAddend1(newAddend1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.ADDITION_STATEMENT__ADDEND1, newAddend1, newAddend1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.ADDITION_STATEMENT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getAddend2()
  {
    return addend2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddend2(Expression newAddend2, NotificationChain msgs)
  {
    Expression oldAddend2 = addend2;
    addend2 = newAddend2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArithmeticPackage.ADDITION_STATEMENT__ADDEND2, oldAddend2, newAddend2);
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
  public void setAddend2(Expression newAddend2)
  {
    if (newAddend2 != addend2)
    {
      NotificationChain msgs = null;
      if (addend2 != null)
        msgs = ((InternalEObject)addend2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.ADDITION_STATEMENT__ADDEND2, null, msgs);
      if (newAddend2 != null)
        msgs = ((InternalEObject)newAddend2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArithmeticPackage.ADDITION_STATEMENT__ADDEND2, null, msgs);
      msgs = basicSetAddend2(newAddend2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.ADDITION_STATEMENT__ADDEND2, newAddend2, newAddend2));
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
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND1:
        return basicSetAddend1(null, msgs);
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND2:
        return basicSetAddend2(null, msgs);
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
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND1:
        return getAddend1();
      case ArithmeticPackage.ADDITION_STATEMENT__OPERATOR:
        return getOperator();
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND2:
        return getAddend2();
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
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND1:
        setAddend1((Expression)newValue);
        return;
      case ArithmeticPackage.ADDITION_STATEMENT__OPERATOR:
        setOperator((String)newValue);
        return;
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND2:
        setAddend2((Expression)newValue);
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
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND1:
        setAddend1((Expression)null);
        return;
      case ArithmeticPackage.ADDITION_STATEMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND2:
        setAddend2((Expression)null);
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
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND1:
        return addend1 != null;
      case ArithmeticPackage.ADDITION_STATEMENT__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case ArithmeticPackage.ADDITION_STATEMENT__ADDEND2:
        return addend2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //AdditionStatementImpl
