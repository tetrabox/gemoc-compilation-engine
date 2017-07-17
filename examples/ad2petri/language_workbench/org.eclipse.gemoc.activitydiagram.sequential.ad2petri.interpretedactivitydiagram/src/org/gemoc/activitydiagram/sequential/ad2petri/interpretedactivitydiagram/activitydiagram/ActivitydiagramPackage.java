/**
 */
package org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivitydiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ActivitydiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activitydiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram/activitydiagram/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activitydiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramPackage eINSTANCE = org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.NamedElementImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__HELD_TOKENS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityEdgeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__HELD_TOKENS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlFlowImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HELD_TOKENS = ACTIVITY_EDGE__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__HELD_TOKENS = ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExecutableNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__HELD_TOKENS = ACTIVITY_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RUNNING = EXECUTABLE_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HELD_TOKENS = EXECUTABLE_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OpaqueActionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__RUNNING = ACTION__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__HELD_TOKENS = ACTION__HELD_TOKENS;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__EXPRESSIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InitialNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.FinalNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__RUNNING = FINAL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__HELD_TOKENS = FINAL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.JoinNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.MergeNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.DecisionNodeImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The feature id for the '<em><b>Held Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__HELD_TOKENS = CONTROL_NODE__HELD_TOKENS;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.VariableImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerVariableImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 17;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanVariableImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ValueImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 19;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanValueImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerValueImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 22;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND2 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__OPERAND1 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ASSIGNEE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression()
	 * @generated
	 */
	int INTEGER_CALCULATION_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CALCULATION_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression()
	 * @generated
	 */
	int INTEGER_COMPARISON_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND2 = INTEGER_EXPRESSION__OPERAND2;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERAND1 = INTEGER_EXPRESSION__OPERAND1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION__OPERATOR = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Comparison Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_EXPRESSION_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression()
	 * @generated
	 */
	int BOOLEAN_UNARY_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERAND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_UNARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__ASSIGNEE = BOOLEAN_EXPRESSION__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND1 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERAND2 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__OPERATOR = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TokenImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 29;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OfferImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 30;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputValueImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 31;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 32;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlTokenImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
	 * @generated
	 */
	int CONTROL_TOKEN = 33;

	/**
	 * The number of structural features of the '<em>Control Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkedTokenImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
	 * @generated
	 */
	int FORKED_TOKEN = 34;

	/**
	 * The number of structural features of the '<em>Forked Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORKED_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TraceImpl
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 35;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationOperator()
	 * @generated
	 */
	int INTEGER_CALCULATION_OPERATOR = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonOperator()
	 * @generated
	 */
	int INTEGER_COMPARISON_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryOperator()
	 * @generated
	 */
	int BOOLEAN_UNARY_OPERATOR = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryOperator()
	 * @generated
	 */
	int BOOLEAN_BINARY_OPERATOR = 39;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getLocals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#isRunning()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Running();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityNode#getHeldTokens()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_HeldTokens();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getHeldTokens <em>Held Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Held Tokens</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityEdge#getHeldTokens()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_HeldTokens();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlFlow#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlFlow#getGuard()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Guard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.OpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.OpaqueAction#getExpressions()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Expressions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression#getOperand2()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerExpression#getOperand1()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EReference getIntegerExpression_Operand1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanExpression#getAssignee()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Assignee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression <em>Integer Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Calculation Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression
	 * @generated
	 */
	EClass getIntegerCalculationExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getAssignee()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EReference getIntegerCalculationExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationExpression#getOperator()
	 * @see #getIntegerCalculationExpression()
	 * @generated
	 */
	EAttribute getIntegerCalculationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression <em>Integer Comparison Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression
	 * @generated
	 */
	EClass getIntegerComparisonExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression#getAssignee()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EReference getIntegerComparisonExpression_Assignee();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonExpression#getOperator()
	 * @see #getIntegerComparisonExpression()
	 * @generated
	 */
	EAttribute getIntegerComparisonExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression <em>Boolean Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Unary Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression
	 * @generated
	 */
	EClass getBooleanUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperand()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EReference getBooleanUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryExpression#getOperator()
	 * @see #getBooleanUnaryExpression()
	 * @generated
	 */
	EAttribute getBooleanUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression
	 * @generated
	 */
	EClass getBooleanBinaryExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand1</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand1()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operand2</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperand2()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_Operand2();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryExpression#getOperator()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EAttribute getBooleanBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlToken <em>Control Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Token</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ControlToken
	 * @generated
	 */
	EClass getControlToken();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ForkedToken <em>Forked Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forked Token</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.ForkedToken
	 * @generated
	 */
	EClass getForkedToken();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Calculation Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator
	 * @generated
	 */
	EEnum getIntegerCalculationOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Comparison Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator
	 * @generated
	 */
	EEnum getIntegerComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Unary Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator
	 * @generated
	 */
	EEnum getBooleanUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Binary Operator</em>'.
	 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator
	 * @generated
	 */
	EEnum getBooleanBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitydiagramFactory getActivitydiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NODES = eINSTANCE.getActivity_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGES = eINSTANCE.getActivity_Edges();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOCALS = eINSTANCE.getActivity_Locals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITY = eINSTANCE.getActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE__RUNNING = eINSTANCE.getActivityNode_Running();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__HELD_TOKENS = eINSTANCE.getActivityNode_HeldTokens();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityEdgeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Held Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__HELD_TOKENS = eINSTANCE.getActivityEdge_HeldTokens();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlFlowImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__GUARD = eINSTANCE.getControlFlow_Guard();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExecutableNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OpaqueActionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.NamedElementImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InitialNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.FinalNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivityFinalNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.JoinNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.MergeNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.DecisionNodeImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.VariableImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerVariableImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanVariableImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ValueImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanValueImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerValueImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND2 = eINSTANCE.getIntegerExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_EXPRESSION__OPERAND1 = eINSTANCE.getIntegerExpression_Operand1();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__ASSIGNEE = eINSTANCE.getBooleanExpression_Assignee();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl <em>Integer Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerCalculationExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationExpression()
		 * @generated
		 */
		EClass INTEGER_CALCULATION_EXPRESSION = eINSTANCE.getIntegerCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CALCULATION_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerCalculationExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CALCULATION_EXPRESSION__OPERATOR = eINSTANCE.getIntegerCalculationExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl <em>Integer Comparison Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.IntegerComparisonExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonExpression()
		 * @generated
		 */
		EClass INTEGER_COMPARISON_EXPRESSION = eINSTANCE.getIntegerComparisonExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON_EXPRESSION__ASSIGNEE = eINSTANCE.getIntegerComparisonExpression_Assignee();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COMPARISON_EXPRESSION__OPERATOR = eINSTANCE.getIntegerComparisonExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl <em>Boolean Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanUnaryExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_UNARY_EXPRESSION = eINSTANCE.getBooleanUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_UNARY_EXPRESSION__OPERAND = eINSTANCE.getBooleanUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.BooleanBinaryExpressionImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND1 = eINSTANCE.getBooleanBinaryExpression_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__OPERAND2 = eINSTANCE.getBooleanBinaryExpression_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBooleanBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TokenImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.OfferImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputValueImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.InputImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlTokenImpl <em>Control Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ControlTokenImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getControlToken()
		 * @generated
		 */
		EClass CONTROL_TOKEN = eINSTANCE.getControlToken();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkedTokenImpl <em>Forked Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ForkedTokenImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getForkedToken()
		 * @generated
		 */
		EClass FORKED_TOKEN = eINSTANCE.getForkedToken();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.TraceImpl
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator <em>Integer Calculation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerCalculationOperator
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerCalculationOperator()
		 * @generated
		 */
		EEnum INTEGER_CALCULATION_OPERATOR = eINSTANCE.getIntegerCalculationOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator <em>Integer Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.IntegerComparisonOperator
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getIntegerComparisonOperator()
		 * @generated
		 */
		EEnum INTEGER_COMPARISON_OPERATOR = eINSTANCE.getIntegerComparisonOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator <em>Boolean Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanUnaryOperator
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanUnaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_UNARY_OPERATOR = eINSTANCE.getBooleanUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator <em>Boolean Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.BooleanBinaryOperator
		 * @see org.eclipse.gemoc.activitydiagram.sequential.ad2petri.interpretedactivitydiagram.activitydiagram.impl.ActivitydiagramPackageImpl#getBooleanBinaryOperator()
		 * @generated
		 */
		EEnum BOOLEAN_BINARY_OPERATOR = eINSTANCE.getBooleanBinaryOperator();

	}

} //ActivitydiagramPackage
