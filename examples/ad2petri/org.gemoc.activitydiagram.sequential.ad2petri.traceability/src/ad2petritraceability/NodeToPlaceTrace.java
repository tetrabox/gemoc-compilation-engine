/**
 */
package ad2petritraceability;

import activitydiagram.ActivityNode;

import petrinetv1.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node To Place Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.NodeToPlaceTrace#getOriginalNode <em>Original Node</em>}</li>
 *   <li>{@link ad2petritraceability.NodeToPlaceTrace#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getNodeToPlaceTrace()
 * @model
 * @generated
 */
public interface NodeToPlaceTrace extends Trace {
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
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getNodeToPlaceTrace_OriginalNode()
	 * @model
	 * @generated
	 */
	ActivityNode getOriginalNode();

	/**
	 * Sets the value of the '{@link ad2petritraceability.NodeToPlaceTrace#getOriginalNode <em>Original Node</em>}' reference.
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
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getNodeToPlaceTrace_Place()
	 * @model
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link ad2petritraceability.NodeToPlaceTrace#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // NodeToPlaceTrace
