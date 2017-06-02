/**
 */
package ad2petritraceability.util;

import ad2petritraceability.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ad2petritraceability.Ad2petritraceabilityPackage
 * @generated
 */
public class Ad2petritraceabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ad2petritraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petritraceabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = Ad2petritraceabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY: {
				Ad2petriTraceability ad2petriTraceability = (Ad2petriTraceability)theEObject;
				T result = caseAd2petriTraceability(ad2petriTraceability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE: {
				ActivityTrace activityTrace = (ActivityTrace)theEObject;
				T result = caseActivityTrace(activityTrace);
				if (result == null) result = caseTrace(activityTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.NODE_TO_PLACE_TRACE: {
				NodeToPlaceTrace nodeToPlaceTrace = (NodeToPlaceTrace)theEObject;
				T result = caseNodeToPlaceTrace(nodeToPlaceTrace);
				if (result == null) result = caseTrace(nodeToPlaceTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.FINAL_NODE_TRACE: {
				FinalNodeTrace finalNodeTrace = (FinalNodeTrace)theEObject;
				T result = caseFinalNodeTrace(finalNodeTrace);
				if (result == null) result = caseTrace(finalNodeTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.FORK_OR_JOIN_NODE_TRACE: {
				ForkOrJoinNodeTrace forkOrJoinNodeTrace = (ForkOrJoinNodeTrace)theEObject;
				T result = caseForkOrJoinNodeTrace(forkOrJoinNodeTrace);
				if (result == null) result = caseTrace(forkOrJoinNodeTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE: {
				ControlFlowTrace controlFlowTrace = (ControlFlowTrace)theEObject;
				T result = caseControlFlowTrace(controlFlowTrace);
				if (result == null) result = caseTrace(controlFlowTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.JOIN_NODE_TRACE: {
				JoinNodeTrace joinNodeTrace = (JoinNodeTrace)theEObject;
				T result = caseJoinNodeTrace(joinNodeTrace);
				if (result == null) result = caseForkOrJoinNodeTrace(joinNodeTrace);
				if (result == null) result = caseTrace(joinNodeTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ad2petritraceabilityPackage.FORK_NODE_TRACE: {
				ForkNodeTrace forkNodeTrace = (ForkNodeTrace)theEObject;
				T result = caseForkNodeTrace(forkNodeTrace);
				if (result == null) result = caseForkOrJoinNodeTrace(forkNodeTrace);
				if (result == null) result = caseTrace(forkNodeTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ad2petri Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ad2petri Traceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAd2petriTraceability(Ad2petriTraceability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityTrace(ActivityTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node To Place Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node To Place Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeToPlaceTrace(NodeToPlaceTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNodeTrace(FinalNodeTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Or Join Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Or Join Node Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkOrJoinNodeTrace(ForkOrJoinNodeTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlowTrace(ControlFlowTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNodeTrace(JoinNodeTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNodeTrace(ForkNodeTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ad2petritraceabilitySwitch
