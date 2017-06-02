/**
 */
package ad2petritraceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ad2petri Traceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getNonFinalNodeTraces <em>Non Final Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getFinalNodeTraces <em>Final Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getActivityTraces <em>Activity Traces</em>}</li>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getControlFlowTraces <em>Control Flow Traces</em>}</li>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getJoinNodeTraces <em>Join Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.Ad2petriTraceability#getForkNodeTraces <em>Fork Node Traces</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability()
 * @model
 * @generated
 */
public interface Ad2petriTraceability extends EObject {
	/**
	 * Returns the value of the '<em><b>Non Final Node Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.NodeToPlaceTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Final Node Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Final Node Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_NonFinalNodeTraces()
	 * @model
	 * @generated
	 */
	EList<NodeToPlaceTrace> getNonFinalNodeTraces();

	/**
	 * Returns the value of the '<em><b>Final Node Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.FinalNodeTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Node Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Node Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_FinalNodeTraces()
	 * @model
	 * @generated
	 */
	EList<FinalNodeTrace> getFinalNodeTraces();

	/**
	 * Returns the value of the '<em><b>Activity Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.ActivityTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_ActivityTraces()
	 * @model
	 * @generated
	 */
	EList<ActivityTrace> getActivityTraces();

	/**
	 * Returns the value of the '<em><b>Control Flow Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.ControlFlowTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_ControlFlowTraces()
	 * @model
	 * @generated
	 */
	EList<ControlFlowTrace> getControlFlowTraces();

	/**
	 * Returns the value of the '<em><b>Join Node Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.JoinNodeTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Node Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Node Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_JoinNodeTraces()
	 * @model
	 * @generated
	 */
	EList<JoinNodeTrace> getJoinNodeTraces();

	/**
	 * Returns the value of the '<em><b>Fork Node Traces</b></em>' reference list.
	 * The list contents are of type {@link ad2petritraceability.ForkNodeTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork Node Traces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Node Traces</em>' reference list.
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getAd2petriTraceability_ForkNodeTraces()
	 * @model
	 * @generated
	 */
	EList<ForkNodeTrace> getForkNodeTraces();

} // Ad2petriTraceability
