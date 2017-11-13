/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getBooleanUnaryExpression()
 * @model
 * @generated
 */
public interface BooleanUnaryExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(BooleanVariable)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getBooleanUnaryExpression_Operand()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryExpression#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryOperator
	 * @see #setOperator(BooleanUnaryOperator)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getBooleanUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BooleanUnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.BooleanUnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanUnaryOperator value);

} // BooleanUnaryExpression
