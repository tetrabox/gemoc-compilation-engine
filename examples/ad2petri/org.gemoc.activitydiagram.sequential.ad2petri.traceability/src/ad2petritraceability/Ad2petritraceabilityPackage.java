/**
 */
package ad2petritraceability;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ad2petritraceability.Ad2petritraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface Ad2petritraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ad2petritraceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ad2petritraceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ad2petritraceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ad2petritraceabilityPackage eINSTANCE = ad2petritraceability.impl.Ad2petritraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl <em>Ad2petri Traceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.Ad2petriTraceabilityImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getAd2petriTraceability()
	 * @generated
	 */
	int AD2PETRI_TRACEABILITY = 0;

	/**
	 * The feature id for the '<em><b>Non Final Node Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES = 0;

	/**
	 * The feature id for the '<em><b>Final Node Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES = 1;

	/**
	 * The feature id for the '<em><b>Activity Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__ACTIVITY_TRACES = 2;

	/**
	 * The feature id for the '<em><b>Control Flow Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES = 3;

	/**
	 * The feature id for the '<em><b>Join Node Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES = 4;

	/**
	 * The feature id for the '<em><b>Fork Node Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY__FORK_NODE_TRACES = 5;

	/**
	 * The number of structural features of the '<em>Ad2petri Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Ad2petri Traceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD2PETRI_TRACEABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.TraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.ActivityTraceImpl <em>Activity Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.ActivityTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getActivityTrace()
	 * @generated
	 */
	int ACTIVITY_TRACE = 2;

	/**
	 * The feature id for the '<em><b>Original Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE__ORIGINAL_ACTIVITY = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE__NET = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.NodeToPlaceTraceImpl <em>Node To Place Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.NodeToPlaceTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getNodeToPlaceTrace()
	 * @generated
	 */
	int NODE_TO_PLACE_TRACE = 3;

	/**
	 * The feature id for the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PLACE_TRACE__ORIGINAL_NODE = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PLACE_TRACE__PLACE = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node To Place Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PLACE_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node To Place Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_PLACE_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.FinalNodeTraceImpl <em>Final Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.FinalNodeTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getFinalNodeTrace()
	 * @generated
	 */
	int FINAL_NODE_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_TRACE__ORIGINAL_NODE = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_TRACE__TRANSITION = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Final Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.ForkOrJoinNodeTraceImpl <em>Fork Or Join Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.ForkOrJoinNodeTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getForkOrJoinNodeTrace()
	 * @generated
	 */
	int FORK_OR_JOIN_NODE_TRACE = 5;

	/**
	 * The feature id for the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OR_JOIN_NODE_TRACE__PLACE = TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OR_JOIN_NODE_TRACE__TRANSITION = TRACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fork Or Join Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OR_JOIN_NODE_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Fork Or Join Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OR_JOIN_NODE_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.ControlFlowTraceImpl <em>Control Flow Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.ControlFlowTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getControlFlowTrace()
	 * @generated
	 */
	int CONTROL_FLOW_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Original Control Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TRACE__TRANSITION = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Flow Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Flow Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.JoinNodeTraceImpl <em>Join Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.JoinNodeTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getJoinNodeTrace()
	 * @generated
	 */
	int JOIN_NODE_TRACE = 7;

	/**
	 * The feature id for the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_TRACE__ORIGINAL_NODE = FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_TRACE__PLACE = FORK_OR_JOIN_NODE_TRACE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_TRACE__TRANSITION = FORK_OR_JOIN_NODE_TRACE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Join Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_TRACE_FEATURE_COUNT = FORK_OR_JOIN_NODE_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_TRACE_OPERATION_COUNT = FORK_OR_JOIN_NODE_TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ad2petritraceability.impl.ForkNodeTraceImpl <em>Fork Node Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ad2petritraceability.impl.ForkNodeTraceImpl
	 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getForkNodeTrace()
	 * @generated
	 */
	int FORK_NODE_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Original Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_TRACE__ORIGINAL_NODE = FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_TRACE__PLACE = FORK_OR_JOIN_NODE_TRACE__PLACE;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_TRACE__TRANSITION = FORK_OR_JOIN_NODE_TRACE__TRANSITION;

	/**
	 * The number of structural features of the '<em>Fork Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_TRACE_FEATURE_COUNT = FORK_OR_JOIN_NODE_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork Node Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_TRACE_OPERATION_COUNT = FORK_OR_JOIN_NODE_TRACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ad2petritraceability.Ad2petriTraceability <em>Ad2petri Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ad2petri Traceability</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability
	 * @generated
	 */
	EClass getAd2petriTraceability();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getNonFinalNodeTraces <em>Non Final Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Final Node Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getNonFinalNodeTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_NonFinalNodeTraces();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getFinalNodeTraces <em>Final Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Final Node Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getFinalNodeTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_FinalNodeTraces();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getActivityTraces <em>Activity Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getActivityTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_ActivityTraces();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getControlFlowTraces <em>Control Flow Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Flow Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getControlFlowTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_ControlFlowTraces();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getJoinNodeTraces <em>Join Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Join Node Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getJoinNodeTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_JoinNodeTraces();

	/**
	 * Returns the meta object for the reference list '{@link ad2petritraceability.Ad2petriTraceability#getForkNodeTraces <em>Fork Node Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fork Node Traces</em>'.
	 * @see ad2petritraceability.Ad2petriTraceability#getForkNodeTraces()
	 * @see #getAd2petriTraceability()
	 * @generated
	 */
	EReference getAd2petriTraceability_ForkNodeTraces();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see ad2petritraceability.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.ActivityTrace <em>Activity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Trace</em>'.
	 * @see ad2petritraceability.ActivityTrace
	 * @generated
	 */
	EClass getActivityTrace();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ActivityTrace#getOriginalActivity <em>Original Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Activity</em>'.
	 * @see ad2petritraceability.ActivityTrace#getOriginalActivity()
	 * @see #getActivityTrace()
	 * @generated
	 */
	EReference getActivityTrace_OriginalActivity();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ActivityTrace#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see ad2petritraceability.ActivityTrace#getNet()
	 * @see #getActivityTrace()
	 * @generated
	 */
	EReference getActivityTrace_Net();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.NodeToPlaceTrace <em>Node To Place Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node To Place Trace</em>'.
	 * @see ad2petritraceability.NodeToPlaceTrace
	 * @generated
	 */
	EClass getNodeToPlaceTrace();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.NodeToPlaceTrace#getOriginalNode <em>Original Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Node</em>'.
	 * @see ad2petritraceability.NodeToPlaceTrace#getOriginalNode()
	 * @see #getNodeToPlaceTrace()
	 * @generated
	 */
	EReference getNodeToPlaceTrace_OriginalNode();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.NodeToPlaceTrace#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ad2petritraceability.NodeToPlaceTrace#getPlace()
	 * @see #getNodeToPlaceTrace()
	 * @generated
	 */
	EReference getNodeToPlaceTrace_Place();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.FinalNodeTrace <em>Final Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node Trace</em>'.
	 * @see ad2petritraceability.FinalNodeTrace
	 * @generated
	 */
	EClass getFinalNodeTrace();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.FinalNodeTrace#getOriginalNode <em>Original Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Node</em>'.
	 * @see ad2petritraceability.FinalNodeTrace#getOriginalNode()
	 * @see #getFinalNodeTrace()
	 * @generated
	 */
	EReference getFinalNodeTrace_OriginalNode();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.FinalNodeTrace#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see ad2petritraceability.FinalNodeTrace#getTransition()
	 * @see #getFinalNodeTrace()
	 * @generated
	 */
	EReference getFinalNodeTrace_Transition();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.ForkOrJoinNodeTrace <em>Fork Or Join Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Or Join Node Trace</em>'.
	 * @see ad2petritraceability.ForkOrJoinNodeTrace
	 * @generated
	 */
	EClass getForkOrJoinNodeTrace();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ForkOrJoinNodeTrace#getOriginalNode <em>Original Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Node</em>'.
	 * @see ad2petritraceability.ForkOrJoinNodeTrace#getOriginalNode()
	 * @see #getForkOrJoinNodeTrace()
	 * @generated
	 */
	EReference getForkOrJoinNodeTrace_OriginalNode();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ForkOrJoinNodeTrace#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see ad2petritraceability.ForkOrJoinNodeTrace#getPlace()
	 * @see #getForkOrJoinNodeTrace()
	 * @generated
	 */
	EReference getForkOrJoinNodeTrace_Place();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ForkOrJoinNodeTrace#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see ad2petritraceability.ForkOrJoinNodeTrace#getTransition()
	 * @see #getForkOrJoinNodeTrace()
	 * @generated
	 */
	EReference getForkOrJoinNodeTrace_Transition();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.ControlFlowTrace <em>Control Flow Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Trace</em>'.
	 * @see ad2petritraceability.ControlFlowTrace
	 * @generated
	 */
	EClass getControlFlowTrace();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ControlFlowTrace#getOriginalControlFlow <em>Original Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Control Flow</em>'.
	 * @see ad2petritraceability.ControlFlowTrace#getOriginalControlFlow()
	 * @see #getControlFlowTrace()
	 * @generated
	 */
	EReference getControlFlowTrace_OriginalControlFlow();

	/**
	 * Returns the meta object for the reference '{@link ad2petritraceability.ControlFlowTrace#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see ad2petritraceability.ControlFlowTrace#getTransition()
	 * @see #getControlFlowTrace()
	 * @generated
	 */
	EReference getControlFlowTrace_Transition();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.JoinNodeTrace <em>Join Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node Trace</em>'.
	 * @see ad2petritraceability.JoinNodeTrace
	 * @generated
	 */
	EClass getJoinNodeTrace();

	/**
	 * Returns the meta object for class '{@link ad2petritraceability.ForkNodeTrace <em>Fork Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node Trace</em>'.
	 * @see ad2petritraceability.ForkNodeTrace
	 * @generated
	 */
	EClass getForkNodeTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ad2petritraceabilityFactory getAd2petritraceabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.Ad2petriTraceabilityImpl <em>Ad2petri Traceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.Ad2petriTraceabilityImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getAd2petriTraceability()
		 * @generated
		 */
		EClass AD2PETRI_TRACEABILITY = eINSTANCE.getAd2petriTraceability();

		/**
		 * The meta object literal for the '<em><b>Non Final Node Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES = eINSTANCE.getAd2petriTraceability_NonFinalNodeTraces();

		/**
		 * The meta object literal for the '<em><b>Final Node Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES = eINSTANCE.getAd2petriTraceability_FinalNodeTraces();

		/**
		 * The meta object literal for the '<em><b>Activity Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__ACTIVITY_TRACES = eINSTANCE.getAd2petriTraceability_ActivityTraces();

		/**
		 * The meta object literal for the '<em><b>Control Flow Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES = eINSTANCE.getAd2petriTraceability_ControlFlowTraces();

		/**
		 * The meta object literal for the '<em><b>Join Node Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES = eINSTANCE.getAd2petriTraceability_JoinNodeTraces();

		/**
		 * The meta object literal for the '<em><b>Fork Node Traces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD2PETRI_TRACEABILITY__FORK_NODE_TRACES = eINSTANCE.getAd2petriTraceability_ForkNodeTraces();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.TraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.ActivityTraceImpl <em>Activity Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.ActivityTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getActivityTrace()
		 * @generated
		 */
		EClass ACTIVITY_TRACE = eINSTANCE.getActivityTrace();

		/**
		 * The meta object literal for the '<em><b>Original Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE__ORIGINAL_ACTIVITY = eINSTANCE.getActivityTrace_OriginalActivity();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TRACE__NET = eINSTANCE.getActivityTrace_Net();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.NodeToPlaceTraceImpl <em>Node To Place Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.NodeToPlaceTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getNodeToPlaceTrace()
		 * @generated
		 */
		EClass NODE_TO_PLACE_TRACE = eINSTANCE.getNodeToPlaceTrace();

		/**
		 * The meta object literal for the '<em><b>Original Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TO_PLACE_TRACE__ORIGINAL_NODE = eINSTANCE.getNodeToPlaceTrace_OriginalNode();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_TO_PLACE_TRACE__PLACE = eINSTANCE.getNodeToPlaceTrace_Place();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.FinalNodeTraceImpl <em>Final Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.FinalNodeTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getFinalNodeTrace()
		 * @generated
		 */
		EClass FINAL_NODE_TRACE = eINSTANCE.getFinalNodeTrace();

		/**
		 * The meta object literal for the '<em><b>Original Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_NODE_TRACE__ORIGINAL_NODE = eINSTANCE.getFinalNodeTrace_OriginalNode();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_NODE_TRACE__TRANSITION = eINSTANCE.getFinalNodeTrace_Transition();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.ForkOrJoinNodeTraceImpl <em>Fork Or Join Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.ForkOrJoinNodeTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getForkOrJoinNodeTrace()
		 * @generated
		 */
		EClass FORK_OR_JOIN_NODE_TRACE = eINSTANCE.getForkOrJoinNodeTrace();

		/**
		 * The meta object literal for the '<em><b>Original Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE = eINSTANCE.getForkOrJoinNodeTrace_OriginalNode();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_OR_JOIN_NODE_TRACE__PLACE = eINSTANCE.getForkOrJoinNodeTrace_Place();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK_OR_JOIN_NODE_TRACE__TRANSITION = eINSTANCE.getForkOrJoinNodeTrace_Transition();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.ControlFlowTraceImpl <em>Control Flow Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.ControlFlowTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getControlFlowTrace()
		 * @generated
		 */
		EClass CONTROL_FLOW_TRACE = eINSTANCE.getControlFlowTrace();

		/**
		 * The meta object literal for the '<em><b>Original Control Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW = eINSTANCE.getControlFlowTrace_OriginalControlFlow();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_TRACE__TRANSITION = eINSTANCE.getControlFlowTrace_Transition();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.JoinNodeTraceImpl <em>Join Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.JoinNodeTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getJoinNodeTrace()
		 * @generated
		 */
		EClass JOIN_NODE_TRACE = eINSTANCE.getJoinNodeTrace();

		/**
		 * The meta object literal for the '{@link ad2petritraceability.impl.ForkNodeTraceImpl <em>Fork Node Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ad2petritraceability.impl.ForkNodeTraceImpl
		 * @see ad2petritraceability.impl.Ad2petritraceabilityPackageImpl#getForkNodeTrace()
		 * @generated
		 */
		EClass FORK_NODE_TRACE = eINSTANCE.getForkNodeTrace();

	}

} //Ad2petritraceabilityPackage
