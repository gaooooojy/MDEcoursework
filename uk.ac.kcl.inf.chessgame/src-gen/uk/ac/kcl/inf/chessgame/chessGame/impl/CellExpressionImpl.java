/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.chessGame.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.chessgame.chessGame.CellExpression;
import uk.ac.kcl.inf.chessgame.chessGame.ChessGamePackage;
import uk.ac.kcl.inf.chessgame.chessGame.EmptyExpression;
import uk.ac.kcl.inf.chessgame.chessGame.StateCheck;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.chessgame.chessGame.impl.CellExpressionImpl#getState <em>State</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.chessgame.chessGame.impl.CellExpressionImpl#getCellState <em>Cell State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellExpressionImpl extends MinimalEObjectImpl.Container implements CellExpression
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected StateCheck state;

  /**
   * The cached value of the '{@link #getCellState() <em>Cell State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCellState()
   * @generated
   * @ordered
   */
  protected EmptyExpression cellState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellExpressionImpl()
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
    return ChessGamePackage.Literals.CELL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateCheck getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(StateCheck newState, NotificationChain msgs)
  {
    StateCheck oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessGamePackage.CELL_EXPRESSION__STATE, oldState, newState);
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
  public void setState(StateCheck newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessGamePackage.CELL_EXPRESSION__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessGamePackage.CELL_EXPRESSION__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessGamePackage.CELL_EXPRESSION__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmptyExpression getCellState()
  {
    return cellState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCellState(EmptyExpression newCellState, NotificationChain msgs)
  {
    EmptyExpression oldCellState = cellState;
    cellState = newCellState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChessGamePackage.CELL_EXPRESSION__CELL_STATE, oldCellState, newCellState);
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
  public void setCellState(EmptyExpression newCellState)
  {
    if (newCellState != cellState)
    {
      NotificationChain msgs = null;
      if (cellState != null)
        msgs = ((InternalEObject)cellState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChessGamePackage.CELL_EXPRESSION__CELL_STATE, null, msgs);
      if (newCellState != null)
        msgs = ((InternalEObject)newCellState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChessGamePackage.CELL_EXPRESSION__CELL_STATE, null, msgs);
      msgs = basicSetCellState(newCellState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChessGamePackage.CELL_EXPRESSION__CELL_STATE, newCellState, newCellState));
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
      case ChessGamePackage.CELL_EXPRESSION__STATE:
        return basicSetState(null, msgs);
      case ChessGamePackage.CELL_EXPRESSION__CELL_STATE:
        return basicSetCellState(null, msgs);
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
      case ChessGamePackage.CELL_EXPRESSION__STATE:
        return getState();
      case ChessGamePackage.CELL_EXPRESSION__CELL_STATE:
        return getCellState();
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
      case ChessGamePackage.CELL_EXPRESSION__STATE:
        setState((StateCheck)newValue);
        return;
      case ChessGamePackage.CELL_EXPRESSION__CELL_STATE:
        setCellState((EmptyExpression)newValue);
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
      case ChessGamePackage.CELL_EXPRESSION__STATE:
        setState((StateCheck)null);
        return;
      case ChessGamePackage.CELL_EXPRESSION__CELL_STATE:
        setCellState((EmptyExpression)null);
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
      case ChessGamePackage.CELL_EXPRESSION__STATE:
        return state != null;
      case ChessGamePackage.CELL_EXPRESSION__CELL_STATE:
        return cellState != null;
    }
    return super.eIsSet(featureID);
  }

} //CellExpressionImpl