/**
 */
package ad2petritraceability;

import activitydiagram.ActivityNode;

import petrinetv1.Place;
import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Or Join Node Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.ForkOrJoinNodeTrace#getOriginalNode <em>Original Node</em>}</li>
 *   <li>{@link ad2petritraceability.ForkOrJoinNodeTrace#getPlace <em>Place</em>}</li>
 *   <li>{@link ad2petritraceability.ForkOrJoinNodeTrace#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getForkOrJoinNodeTrace()
 * @model abstract="true"
 * @generated
 */
public interface ForkOrJoinNodeTrace extends Trace {
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
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getForkOrJoinNodeTrace_OriginalNode()
	 * @model
	 * @generated
	 */
	ActivityNode getOriginalNode();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ForkOrJoinNodeTrace#getOriginalNode <em>Original Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Node</em>' reference.
	 * @see #getOriginalNode()
	 * @generated
	 */
	void setOriginalNode(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getForkOrJoinNodeTrace_Place()
	 * @model
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ForkOrJoinNodeTrace#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

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
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getForkOrJoinNodeTrace_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ForkOrJoinNodeTrace#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // ForkOrJoinNodeTrace
