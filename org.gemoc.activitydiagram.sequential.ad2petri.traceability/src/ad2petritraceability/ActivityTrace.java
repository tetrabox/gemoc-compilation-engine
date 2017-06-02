/**
 */
package ad2petritraceability;

import activitydiagram.Activity;

import petrinetv1.Net;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.ActivityTrace#getOriginalActivity <em>Original Activity</em>}</li>
 *   <li>{@link ad2petritraceability.ActivityTrace#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see ad2petritraceability.Ad2petritraceabilityPackage#getActivityTrace()
 * @model
 * @generated
 */
public interface ActivityTrace extends Trace {
	/**
	 * Returns the value of the '<em><b>Original Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Activity</em>' reference.
	 * @see #setOriginalActivity(Activity)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getActivityTrace_OriginalActivity()
	 * @model
	 * @generated
	 */
	Activity getOriginalActivity();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ActivityTrace#getOriginalActivity <em>Original Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Activity</em>' reference.
	 * @see #getOriginalActivity()
	 * @generated
	 */
	void setOriginalActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Net)
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#getActivityTrace_Net()
	 * @model
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link ad2petritraceability.ActivityTrace#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // ActivityTrace
