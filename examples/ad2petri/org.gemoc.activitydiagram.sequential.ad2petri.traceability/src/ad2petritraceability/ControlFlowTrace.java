/**
 */
package ad2petritraceability;

import activitydiagram.ControlFlow;

import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.ControlFlowTrace#getOriginalControlFlow <em>Original Control Flow</em>}</li>
 *   <li>{@link ad2petritraceability.ControlFlowTrace#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getControlFlowTrace()
 * @model
 * @generated
 */
public interface ControlFlowTrace extends Trace {
	/**
	 * Returns the value of the '<em><b>Original Control Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Control Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Control Flow</em>' reference.
	 * @see #setOriginalControlFlow(ControlFlow)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getControlFlowTrace_OriginalControlFlow()
	 * @model
	 * @generated
	 */
	ControlFlow getOriginalControlFlow();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ControlFlowTrace#getOriginalControlFlow <em>Original Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Control Flow</em>' reference.
	 * @see #getOriginalControlFlow()
	 * @generated
	 */
	void setOriginalControlFlow(ControlFlow value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getControlFlowTrace_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ControlFlowTrace#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // ControlFlowTrace
