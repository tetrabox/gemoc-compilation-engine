/**
 */
package ad2petritraceability.impl;

import activitydiagram.ActivityNode;

import ad2petritraceability.Ad2petritraceabilityPackage;
import ad2petritraceability.ForkOrJoinNodeTrace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinetv1.Place;
import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork Or Join Node Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.impl.ForkOrJoinNodeTraceImpl#getOriginalNode <em>Original Node</em>}</li>
 *   <li>{@link ad2petritraceability.impl.ForkOrJoinNodeTraceImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link ad2petritraceability.impl.ForkOrJoinNodeTraceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ForkOrJoinNodeTraceImpl extends TraceImpl implements ForkOrJoinNodeTrace {
	/**
	 * The cached value of the '{@link #getOriginalNode() <em>Original Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode originalNode;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkOrJoinNodeTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ad2petritraceabilityPackage.Literals.FORK_OR_JOIN_NODE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getOriginalNode() {
		if (originalNode != null && originalNode.eIsProxy()) {
			InternalEObject oldOriginalNode = (InternalEObject)originalNode;
			originalNode = (ActivityNode)eResolveProxy(oldOriginalNode);
			if (originalNode != oldOriginalNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE, oldOriginalNode, originalNode));
			}
		}
		return originalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetOriginalNode() {
		return originalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalNode(ActivityNode newOriginalNode) {
		ActivityNode oldOriginalNode = originalNode;
		originalNode = newOriginalNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE, oldOriginalNode, originalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE:
				if (resolve) return getOriginalNode();
				return basicGetOriginalNode();
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
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
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE:
				setOriginalNode((ActivityNode)newValue);
				return;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE:
				setPlace((Place)newValue);
				return;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION:
				setTransition((Transition)newValue);
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
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE:
				setOriginalNode((ActivityNode)null);
				return;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE:
				setPlace((Place)null);
				return;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION:
				setTransition((Transition)null);
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
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE:
				return originalNode != null;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__PLACE:
				return place != null;
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE__TRANSITION:
				return transition != null;
		}
		return super.eIsSet(featureID);
	}

} //ForkOrJoinNodeTraceImpl
