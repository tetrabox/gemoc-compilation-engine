/**
 */
package ad2petritraceability.util;

import ad2petritraceability.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ad2petritraceability.Ad2petritraceabilityPackage
 * @generated
 */
public class Ad2petritraceabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ad2petritraceabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ad2petritraceabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Ad2petritraceabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ad2petritraceabilitySwitch<Adapter> modelSwitch =
		new Ad2petritraceabilitySwitch<Adapter>() {
			@Override
			public Adapter caseAd2petriTraceability(Ad2petriTraceability object) {
				return createAd2petriTraceabilityAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseActivityTrace(ActivityTrace object) {
				return createActivityTraceAdapter();
			}
			@Override
			public Adapter caseNodeToPlaceTrace(NodeToPlaceTrace object) {
				return createNodeToPlaceTraceAdapter();
			}
			@Override
			public Adapter caseFinalNodeTrace(FinalNodeTrace object) {
				return createFinalNodeTraceAdapter();
			}
			@Override
			public Adapter caseForkOrJoinNodeTrace(ForkOrJoinNodeTrace object) {
				return createForkOrJoinNodeTraceAdapter();
			}
			@Override
			public Adapter caseControlFlowTrace(ControlFlowTrace object) {
				return createControlFlowTraceAdapter();
			}
			@Override
			public Adapter caseJoinNodeTrace(JoinNodeTrace object) {
				return createJoinNodeTraceAdapter();
			}
			@Override
			public Adapter caseForkNodeTrace(ForkNodeTrace object) {
				return createForkNodeTraceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.Ad2petriTraceability <em>Ad2petri Traceability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.Ad2petriTraceability
	 * @generated
	 */
	public Adapter createAd2petriTraceabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.ActivityTrace <em>Activity Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.ActivityTrace
	 * @generated
	 */
	public Adapter createActivityTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.NodeToPlaceTrace <em>Node To Place Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.NodeToPlaceTrace
	 * @generated
	 */
	public Adapter createNodeToPlaceTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.FinalNodeTrace <em>Final Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.FinalNodeTrace
	 * @generated
	 */
	public Adapter createFinalNodeTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.ForkOrJoinNodeTrace <em>Fork Or Join Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.ForkOrJoinNodeTrace
	 * @generated
	 */
	public Adapter createForkOrJoinNodeTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.ControlFlowTrace <em>Control Flow Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.ControlFlowTrace
	 * @generated
	 */
	public Adapter createControlFlowTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.JoinNodeTrace <em>Join Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.JoinNodeTrace
	 * @generated
	 */
	public Adapter createJoinNodeTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ad2petritraceability.ForkNodeTrace <em>Fork Node Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ad2petritraceability.ForkNodeTrace
	 * @generated
	 */
	public Adapter createForkNodeTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Ad2petritraceabilityAdapterFactory
