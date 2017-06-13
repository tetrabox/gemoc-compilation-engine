/**
 */
package ad2petritraceability;

import activitydiagram.ActivityNode;

import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Node Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.FinalNodeTrace#getOriginalNode <em>Original Node</em>}</li>
 *   <li>{@link ad2petritraceability.FinalNodeTrace#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getFinalNodeTrace()
 * @model
 * @generated
 */
public interface FinalNodeTrace extends Trace {
	/**
	 * Returns the value of the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Node</em>' reference.
	 * @see #setOriginalNode(ActivityNode)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getFinalNodeTrace_OriginalNode()
	 * @model
	 * @generated
	 */
	ActivityNode getOriginalNode();

	/**
	 * Sets the value of the '{@link ad2petritraceability.FinalNodeTrace#getOriginalNode <em>Original Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Node</em>' reference.
	 * @see #getOriginalNode()
	 * @generated
	 */
	void setOriginalNode(ActivityNode value);

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
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getFinalNodeTrace_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link ad2petritraceability.FinalNodeTrace#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // FinalNodeTrace
