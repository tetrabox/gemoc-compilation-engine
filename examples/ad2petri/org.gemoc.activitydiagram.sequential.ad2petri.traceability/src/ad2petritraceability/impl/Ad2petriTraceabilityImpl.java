/**
 */
package ad2petritraceability.impl;

import ad2petritraceability.ActivityTrace;
import ad2petritraceability.Ad2petriTraceability;
import ad2petritraceability.Ad2petritraceabilityPackage;
import ad2petritraceability.ControlFlowTrace;
import ad2petritraceability.FinalNodeTrace;
import ad2petritraceability.ForkNodeTrace;
import ad2petritraceability.JoinNodeTrace;
import ad2petritraceability.NodeToPlaceTrace;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad2petri Traceability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getNonFinalNodeTraces <em>Non Final Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getFinalNodeTraces <em>Final Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getActivityTraces <em>Activity Traces</em>}</li>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getControlFlowTraces <em>Control Flow Traces</em>}</li>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getJoinNodeTraces <em>Join Node Traces</em>}</li>
 *   <li>{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl#getForkNodeTraces <em>Fork Node Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ad2petriTraceabilityImpl extends MinimalEObjectImpl.Container implements Ad2petriTraceability {
	/**
	 * The cached value of the '{@link #getNonFinalNodeTraces() <em>Non Final Node Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonFinalNodeTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeToPlaceTrace> nonFinalNodeTraces;

	/**
	 * The cached value of the '{@link #getFinalNodeTraces() <em>Final Node Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalNodeTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<FinalNodeTrace> finalNodeTraces;

	/**
	 * The cached value of the '{@link #getActivityTraces() <em>Activity Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityTrace> activityTraces;

	/**
	 * The cached value of the '{@link #getControlFlowTraces() <em>Control Flow Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlowTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowTrace> controlFlowTraces;

	/**
	 * The cached value of the '{@link #getJoinNodeTraces() <em>Join Node Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinNodeTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinNodeTrace> joinNodeTraces;

	/**
	 * The cached value of the '{@link #getForkNodeTraces() <em>Fork Node Traces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkNodeTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkNodeTrace> forkNodeTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ad2petriTraceabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ad2petritraceabilityPackage.Literals.AD2PETRI_TRACEABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeToPlaceTrace> getNonFinalNodeTraces() {
		if (nonFinalNodeTraces == null) {
			nonFinalNodeTraces = new EObjectResolvingEList<NodeToPlaceTrace>(NodeToPlaceTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES);
		}
		return nonFinalNodeTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FinalNodeTrace> getFinalNodeTraces() {
		if (finalNodeTraces == null) {
			finalNodeTraces = new EObjectResolvingEList<FinalNodeTrace>(FinalNodeTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES);
		}
		return finalNodeTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityTrace> getActivityTraces() {
		if (activityTraces == null) {
			activityTraces = new EObjectResolvingEList<ActivityTrace>(ActivityTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__ACTIVITY_TRACES);
		}
		return activityTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowTrace> getControlFlowTraces() {
		if (controlFlowTraces == null) {
			controlFlowTraces = new EObjectResolvingEList<ControlFlowTrace>(ControlFlowTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES);
		}
		return controlFlowTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinNodeTrace> getJoinNodeTraces() {
		if (joinNodeTraces == null) {
			joinNodeTraces = new EObjectResolvingEList<JoinNodeTrace>(JoinNodeTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES);
		}
		return joinNodeTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkNodeTrace> getForkNodeTraces() {
		if (forkNodeTraces == null) {
			forkNodeTraces = new EObjectResolvingEList<ForkNodeTrace>(ForkNodeTrace.class, this, Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FORK_NODE_TRACES);
		}
		return forkNodeTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES:
				return getNonFinalNodeTraces();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES:
				return getFinalNodeTraces();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__ACTIVITY_TRACES:
				return getActivityTraces();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES:
				return getControlFlowTraces();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES:
				return getJoinNodeTraces();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FORK_NODE_TRACES:
				return getForkNodeTraces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES:
				getNonFinalNodeTraces().clear();
				getNonFinalNodeTraces().addAll((Collection<? extends NodeToPlaceTrace>)newValue);
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES:
				getFinalNodeTraces().clear();
				getFinalNodeTraces().addAll((Collection<? extends FinalNodeTrace>)newValue);
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__ACTIVITY_TRACES:
				getActivityTraces().clear();
				getActivityTraces().addAll((Collection<? extends ActivityTrace>)newValue);
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES:
				getControlFlowTraces().clear();
				getControlFlowTraces().addAll((Collection<? extends ControlFlowTrace>)newValue);
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES:
				getJoinNodeTraces().clear();
				getJoinNodeTraces().addAll((Collection<? extends JoinNodeTrace>)newValue);
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FORK_NODE_TRACES:
				getForkNodeTraces().clear();
				getForkNodeTraces().addAll((Collection<? extends ForkNodeTrace>)newValue);
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
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES:
				getNonFinalNodeTraces().clear();
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES:
				getFinalNodeTraces().clear();
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__ACTIVITY_TRACES:
				getActivityTraces().clear();
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES:
				getControlFlowTraces().clear();
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES:
				getJoinNodeTraces().clear();
				return;
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FORK_NODE_TRACES:
				getForkNodeTraces().clear();
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
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES:
				return nonFinalNodeTraces != null && !nonFinalNodeTraces.isEmpty();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES:
				return finalNodeTraces != null && !finalNodeTraces.isEmpty();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__ACTIVITY_TRACES:
				return activityTraces != null && !activityTraces.isEmpty();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES:
				return controlFlowTraces != null && !controlFlowTraces.isEmpty();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES:
				return joinNodeTraces != null && !joinNodeTraces.isEmpty();
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY__FORK_NODE_TRACES:
				return forkNodeTraces != null && !forkNodeTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Ad2petriTraceabilityImpl
