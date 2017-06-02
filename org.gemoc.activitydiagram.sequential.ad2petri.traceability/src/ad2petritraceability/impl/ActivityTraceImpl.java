/**
 */
package ad2petritraceability.impl;

import activitydiagram.Activity;

import ad2petritraceability.ActivityTrace;
import ad2petritraceability.Ad2petritraceabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinetv1.Net;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.impl.ActivityTraceImpl#getOriginalActivity <em>Original Activity</em>}</li>
 *   <li>{@link ad2petritraceability.impl.ActivityTraceImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityTraceImpl extends TraceImpl implements ActivityTrace {
	/**
	 * The cached value of the '{@link #getOriginalActivity() <em>Original Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity originalActivity;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Net net;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ad2petritraceabilityPackage.Literals.ACTIVITY_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOriginalActivity() {
		if (originalActivity != null && originalActivity.eIsProxy()) {
			InternalEObject oldOriginalActivity = (InternalEObject)originalActivity;
			originalActivity = (Activity)eResolveProxy(oldOriginalActivity);
			if (originalActivity != oldOriginalActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY, oldOriginalActivity, originalActivity));
			}
		}
		return originalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetOriginalActivity() {
		return originalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalActivity(Activity newOriginalActivity) {
		Activity oldOriginalActivity = originalActivity;
		originalActivity = newOriginalActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY, oldOriginalActivity, originalActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (Net)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Net newNet) {
		Net oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY:
				if (resolve) return getOriginalActivity();
				return basicGetOriginalActivity();
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET:
				if (resolve) return getNet();
				return basicGetNet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY:
				setOriginalActivity((Activity)newValue);
				return;
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET:
				setNet((Net)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY:
				setOriginalActivity((Activity)null);
				return;
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET:
				setNet((Net)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__ORIGINAL_ACTIVITY:
				return originalActivity != null;
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE__NET:
				return net != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityTraceImpl
