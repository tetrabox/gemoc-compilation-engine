/**
 */
package org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Activity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Activity#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Activity#getLocals <em>Locals</em>}</li>
 *   <li>{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Activity#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Nodes()
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivityNode#getActivity
	 * @model opposite="activity" containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locals</em>' containment reference list.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Locals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocals();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagrammt.activitydiagram.ActivitydiagramPackage#getActivity_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initialize(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ActivityNode findReadyNode();

} // Activity
