/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator;
import org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanUnaryExpressionImpl extends BooleanExpressionImpl implements BooleanUnaryExpression {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected BooleanVariable operand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanUnaryOperator OPERATOR_EDEFAULT = BooleanUnaryOperator.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanUnaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanUnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.BOOLEAN_UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable getOperand() {
		if (operand != null && operand.eIsProxy()) {
			InternalEObject oldOperand = (InternalEObject)operand;
			operand = (BooleanVariable)eResolveProxy(oldOperand);
			if (operand != oldOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND, oldOperand, operand));
			}
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable basicGetOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(BooleanVariable newOperand) {
		BooleanVariable oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND, oldOperand, operand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BooleanUnaryOperator newOperator) {
		BooleanUnaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
				if (resolve) return getOperand();
				return basicGetOperand();
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
				setOperand((BooleanVariable)newValue);
				return;
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
				setOperator((BooleanUnaryOperator)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
				setOperand((BooleanVariable)null);
				return;
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERAND:
				return operand != null;
			case ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BooleanUnaryExpressionImpl
