/**
 */
package ad2petritraceability.impl;

import ad2petritraceability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ad2petritraceabilityFactoryImpl extends EFactoryImpl implements Ad2petritraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ad2petritraceabilityFactory init() {
		try {
			Ad2petritraceabilityFactory theAd2petritraceabilityFactory = (Ad2petritraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(Ad2petritraceabilityPackage.eNS_URI);
			if (theAd2petritraceabilityFactory != null) {
				return theAd2petritraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ad2petritraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petritraceabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Ad2petritraceabilityPackage.AD2PETRI_TRACEABILITY: return createAd2petriTraceability();
			case Ad2petritraceabilityPackage.ACTIVITY_TRACE: return createActivityTrace();
			case Ad2petritraceabilityPackage.NODE_TO_PLACE_TRACE: return createNodeToPlaceTrace();
			case Ad2petritraceabilityPackage.FINAL_NODE_TRACE: return createFinalNodeTrace();
			case Ad2petritraceabilityPackage.CONTROL_FLOW_TRACE: return createControlFlowTrace();
			case Ad2petritraceabilityPackage.JOIN_NODE_TRACE: return createJoinNodeTrace();
			case Ad2petritraceabilityPackage.FORK_NODE_TRACE: return createForkNodeTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petriTraceability createAd2petriTraceability() {
		Ad2petriTraceabilityImpl ad2petriTraceability = new Ad2petriTraceabilityImpl();
		return ad2petriTraceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTrace createActivityTrace() {
		ActivityTraceImpl activityTrace = new ActivityTraceImpl();
		return activityTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeToPlaceTrace createNodeToPlaceTrace() {
		NodeToPlaceTraceImpl nodeToPlaceTrace = new NodeToPlaceTraceImpl();
		return nodeToPlaceTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNodeTrace createFinalNodeTrace() {
		FinalNodeTraceImpl finalNodeTrace = new FinalNodeTraceImpl();
		return finalNodeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowTrace createControlFlowTrace() {
		ControlFlowTraceImpl controlFlowTrace = new ControlFlowTraceImpl();
		return controlFlowTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNodeTrace createJoinNodeTrace() {
		JoinNodeTraceImpl joinNodeTrace = new JoinNodeTraceImpl();
		return joinNodeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNodeTrace createForkNodeTrace() {
		ForkNodeTraceImpl forkNodeTrace = new ForkNodeTraceImpl();
		return forkNodeTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petritraceabilityPackage getAd2petritraceabilityPackage() {
		return (Ad2petritraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ad2petritraceabilityPackage getPackage() {
		return Ad2petritraceabilityPackage.eINSTANCE;
	}

} //Ad2petritraceabilityFactoryImpl
