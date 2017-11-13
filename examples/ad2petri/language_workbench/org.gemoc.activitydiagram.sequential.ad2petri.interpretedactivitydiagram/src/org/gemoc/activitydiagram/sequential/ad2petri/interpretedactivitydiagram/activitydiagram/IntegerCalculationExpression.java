/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Calculation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage#getIntegerCalculationExpression()
 * @model
 * @generated
 */
public interface IntegerCalculationExpression extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(IntegerVariable)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage#getIntegerCalculationExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	IntegerVariable getAssignee();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(IntegerVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @see #setOperator(IntegerCalculationOperator)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramPackage#getIntegerCalculationExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerCalculationOperator getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerCalculationOperator value);

} // IntegerCalculationExpression
