/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityEdge#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityEdge_Source()
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityEdge_Target()
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.compiledactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivityEdge_HeldTokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

} // ActivityEdge
