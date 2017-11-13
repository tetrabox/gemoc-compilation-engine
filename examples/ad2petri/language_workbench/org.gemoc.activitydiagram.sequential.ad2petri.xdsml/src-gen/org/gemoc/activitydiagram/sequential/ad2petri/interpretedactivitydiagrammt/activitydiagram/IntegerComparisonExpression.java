/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonExpression#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getIntegerComparisonExpression()
 * @model
 * @generated
 */
public interface IntegerComparisonExpression extends IntegerExpression {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(BooleanVariable)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getIntegerComparisonExpression_Assignee()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getAssignee();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonExpression#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonOperator
	 * @see #setOperator(IntegerComparisonOperator)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getIntegerComparisonExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	IntegerComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.IntegerComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IntegerComparisonOperator value);

} // IntegerComparisonExpression
