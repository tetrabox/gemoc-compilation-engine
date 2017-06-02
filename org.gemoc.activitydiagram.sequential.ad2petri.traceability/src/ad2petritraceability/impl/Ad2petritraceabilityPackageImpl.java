/**
 */
package ad2petritraceability.impl;

import activitydiagram.ActivitydiagramPackage;

import ad2petritraceability.ActivityTrace;
import ad2petritraceability.Ad2petriTraceability;
import ad2petritraceability.Ad2petritraceabilityFactory;
import ad2petritraceability.Ad2petritraceabilityPackage;
import ad2petritraceability.ControlFlowTrace;
import ad2petritraceability.FinalNodeTrace;
import ad2petritraceability.ForkNodeTrace;
import ad2petritraceability.ForkOrJoinNodeTrace;
import ad2petritraceability.JoinNodeTrace;
import ad2petritraceability.NodeToPlaceTrace;
import ad2petritraceability.Trace;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petrinetv1.PetrinetV1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ad2petritraceabilityPackageImpl extends EPackageImpl implements Ad2petritraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ad2petriTraceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeToPlaceTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkOrJoinNodeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ad2petritraceability.Ad2petritraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ad2petritraceabilityPackageImpl() {
		super(eNS_URI, Ad2petritraceabilityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Ad2petritraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ad2petritraceabilityPackage init() {
		if (isInited) return (Ad2petritraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(Ad2petritraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		Ad2petritraceabilityPackageImpl theAd2petritraceabilityPackage = (Ad2petritraceabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ad2petritraceabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ad2petritraceabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActivitydiagramPackage.eINSTANCE.eClass();
		PetrinetV1Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAd2petritraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theAd2petritraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAd2petritraceabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ad2petritraceabilityPackage.eNS_URI, theAd2petritraceabilityPackage);
		return theAd2petritraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAd2petriTraceability() {
		return ad2petriTraceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_NonFinalNodeTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_FinalNodeTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_ActivityTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_ControlFlowTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_JoinNodeTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAd2petriTraceability_ForkNodeTraces() {
		return (EReference)ad2petriTraceabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityTrace() {
		return activityTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityTrace_OriginalActivity() {
		return (EReference)activityTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityTrace_Net() {
		return (EReference)activityTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeToPlaceTrace() {
		return nodeToPlaceTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeToPlaceTrace_OriginalNode() {
		return (EReference)nodeToPlaceTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeToPlaceTrace_Place() {
		return (EReference)nodeToPlaceTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNodeTrace() {
		return finalNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalNodeTrace_OriginalNode() {
		return (EReference)finalNodeTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalNodeTrace_Transition() {
		return (EReference)finalNodeTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkOrJoinNodeTrace() {
		return forkOrJoinNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkOrJoinNodeTrace_OriginalNode() {
		return (EReference)forkOrJoinNodeTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkOrJoinNodeTrace_Place() {
		return (EReference)forkOrJoinNodeTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForkOrJoinNodeTrace_Transition() {
		return (EReference)forkOrJoinNodeTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowTrace() {
		return controlFlowTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowTrace_OriginalControlFlow() {
		return (EReference)controlFlowTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowTrace_Transition() {
		return (EReference)controlFlowTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNodeTrace() {
		return joinNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNodeTrace() {
		return forkNodeTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petritraceabilityFactory getAd2petritraceabilityFactory() {
		return (Ad2petritraceabilityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ad2petriTraceabilityEClass = createEClass(AD2PETRI_TRACEABILITY);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__NON_FINAL_NODE_TRACES);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__FINAL_NODE_TRACES);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__ACTIVITY_TRACES);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__CONTROL_FLOW_TRACES);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__JOIN_NODE_TRACES);
		createEReference(ad2petriTraceabilityEClass, AD2PETRI_TRACEABILITY__FORK_NODE_TRACES);

		traceEClass = createEClass(TRACE);

		activityTraceEClass = createEClass(ACTIVITY_TRACE);
		createEReference(activityTraceEClass, ACTIVITY_TRACE__ORIGINAL_ACTIVITY);
		createEReference(activityTraceEClass, ACTIVITY_TRACE__NET);

		nodeToPlaceTraceEClass = createEClass(NODE_TO_PLACE_TRACE);
		createEReference(nodeToPlaceTraceEClass, NODE_TO_PLACE_TRACE__ORIGINAL_NODE);
		createEReference(nodeToPlaceTraceEClass, NODE_TO_PLACE_TRACE__PLACE);

		finalNodeTraceEClass = createEClass(FINAL_NODE_TRACE);
		createEReference(finalNodeTraceEClass, FINAL_NODE_TRACE__ORIGINAL_NODE);
		createEReference(finalNodeTraceEClass, FINAL_NODE_TRACE__TRANSITION);

		forkOrJoinNodeTraceEClass = createEClass(FORK_OR_JOIN_NODE_TRACE);
		createEReference(forkOrJoinNodeTraceEClass, FORK_OR_JOIN_NODE_TRACE__ORIGINAL_NODE);
		createEReference(forkOrJoinNodeTraceEClass, FORK_OR_JOIN_NODE_TRACE__PLACE);
		createEReference(forkOrJoinNodeTraceEClass, FORK_OR_JOIN_NODE_TRACE__TRANSITION);

		controlFlowTraceEClass = createEClass(CONTROL_FLOW_TRACE);
		createEReference(controlFlowTraceEClass, CONTROL_FLOW_TRACE__ORIGINAL_CONTROL_FLOW);
		createEReference(controlFlowTraceEClass, CONTROL_FLOW_TRACE__TRANSITION);

		joinNodeTraceEClass = createEClass(JOIN_NODE_TRACE);

		forkNodeTraceEClass = createEClass(FORK_NODE_TRACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ActivitydiagramPackage theActivitydiagramPackage = (ActivitydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitydiagramPackage.eNS_URI);
		PetrinetV1Package thePetrinetV1Package = (PetrinetV1Package)EPackage.Registry.INSTANCE.getEPackage(PetrinetV1Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityTraceEClass.getESuperTypes().add(this.getTrace());
		nodeToPlaceTraceEClass.getESuperTypes().add(this.getTrace());
		finalNodeTraceEClass.getESuperTypes().add(this.getTrace());
		forkOrJoinNodeTraceEClass.getESuperTypes().add(this.getTrace());
		controlFlowTraceEClass.getESuperTypes().add(this.getTrace());
		joinNodeTraceEClass.getESuperTypes().add(this.getForkOrJoinNodeTrace());
		forkNodeTraceEClass.getESuperTypes().add(this.getForkOrJoinNodeTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(ad2petriTraceabilityEClass, Ad2petriTraceability.class, "Ad2petriTraceability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAd2petriTraceability_NonFinalNodeTraces(), this.getNodeToPlaceTrace(), null, "nonFinalNodeTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAd2petriTraceability_FinalNodeTraces(), this.getFinalNodeTrace(), null, "finalNodeTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAd2petriTraceability_ActivityTraces(), this.getActivityTrace(), null, "activityTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAd2petriTraceability_ControlFlowTraces(), this.getControlFlowTrace(), null, "controlFlowTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAd2petriTraceability_JoinNodeTraces(), this.getJoinNodeTrace(), null, "joinNodeTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAd2petriTraceability_ForkNodeTraces(), this.getForkNodeTrace(), null, "forkNodeTraces", null, 0, -1, Ad2petriTraceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityTraceEClass, ActivityTrace.class, "ActivityTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityTrace_OriginalActivity(), theActivitydiagramPackage.getActivity(), null, "originalActivity", null, 0, 1, ActivityTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityTrace_Net(), thePetrinetV1Package.getNet(), null, "net", null, 0, 1, ActivityTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeToPlaceTraceEClass, NodeToPlaceTrace.class, "NodeToPlaceTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeToPlaceTrace_OriginalNode(), theActivitydiagramPackage.getActivityNode(), null, "originalNode", null, 0, 1, NodeToPlaceTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeToPlaceTrace_Place(), thePetrinetV1Package.getPlace(), null, "place", null, 0, 1, NodeToPlaceTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalNodeTraceEClass, FinalNodeTrace.class, "FinalNodeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalNodeTrace_OriginalNode(), theActivitydiagramPackage.getActivityNode(), null, "originalNode", null, 0, 1, FinalNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalNodeTrace_Transition(), thePetrinetV1Package.getTransition(), null, "transition", null, 0, 1, FinalNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkOrJoinNodeTraceEClass, ForkOrJoinNodeTrace.class, "ForkOrJoinNodeTrace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkOrJoinNodeTrace_OriginalNode(), theActivitydiagramPackage.getActivityNode(), null, "originalNode", null, 0, 1, ForkOrJoinNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkOrJoinNodeTrace_Place(), thePetrinetV1Package.getPlace(), null, "place", null, 0, 1, ForkOrJoinNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkOrJoinNodeTrace_Transition(), thePetrinetV1Package.getTransition(), null, "transition", null, 0, 1, ForkOrJoinNodeTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowTraceEClass, ControlFlowTrace.class, "ControlFlowTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlowTrace_OriginalControlFlow(), theActivitydiagramPackage.getControlFlow(), null, "originalControlFlow", null, 0, 1, ControlFlowTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlowTrace_Transition(), thePetrinetV1Package.getTransition(), null, "transition", null, 0, 1, ControlFlowTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinNodeTraceEClass, JoinNodeTrace.class, "JoinNodeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeTraceEClass, ForkNodeTrace.class, "ForkNodeTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Ad2petritraceabilityPackageImpl
