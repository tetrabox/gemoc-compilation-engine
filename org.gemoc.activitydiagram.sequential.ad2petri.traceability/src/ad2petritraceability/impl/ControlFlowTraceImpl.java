/**
 */
package ad2petritraceability.impl;

import activitydiagram.ControlFlow;

import ad2petritraceability.Ad2petritraceabilityPackage;
import ad2petritraceability.ControlFlowTrace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinetv1.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.impl.ControlFlowTraceImpl#getOriginalControlFlow <em>Original Control Flow</em>}</li>
 *   <li>{@link ad2petritraceability.impl.ControlFlowTraceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowTraceImpl extends TraceImpl implements ControlFlowTrace {
	/**
	 * The cached value of the '{@link #getOriginalControlFlow() <em>Original Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalControlFlow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow originalControlFlow;

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
	protected ControlFlowTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ad2petritraceabilityPackage.Literals.CONTROL_FLOW_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getOriginalControlFlow() {
		if (originalControlFlow != null && originalControlFlow.eIsProxy()) {
			InternalEObject oldOriginalControlFlow = (InternalEObject)originalControlFlow;
			originalControlFlow = (ControlFlow)eResolveProxy(oldOriginalControlFlow);
			if (originalControlFlow != oldOriginalControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW, oldOriginalControlFlow, originalControlFlow));
			}
		}
		return originalControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow basicGetOriginalControlFlow() {
		return originalControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalControlFlow(ControlFlow newOriginalControlFlow) {
		ControlFlow oldOriginalControlFlow = originalControlFlow;
		originalControlFlow = newOriginalControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW, oldOriginalControlFlow, originalControlFlow));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION, oldTransition, transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW:
				if (resolve) return getOriginalControlFlow();
				return basicGetOriginalControlFlow();
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION:
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
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW:
				setOriginalControlFlow((ControlFlow)newValue);
				return;
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION:
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
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW:
				setOriginalControlFlow((ControlFlow)null);
				return;
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION:
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
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW:
				return originalControlFlow != null;
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE__TRANSITION:
				return transition != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlFlowTraceImpl
