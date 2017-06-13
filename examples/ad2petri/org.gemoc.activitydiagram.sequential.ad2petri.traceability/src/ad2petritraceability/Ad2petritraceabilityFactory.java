/**
 */
package ad2petritraceability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ad2petritraceability.Ad2petritraceabilityPackage
 * @generated
 */
public interface Ad2petritraceabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ad2petritraceabilityFactory eINSTANCE = ad2petritraceability.impl.Ad2petritraceabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ad2petri Traceability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ad2petri Traceability</em>'.
	 * @generated
	 */
	Ad2petriTraceability createAd2petriTraceability();

	/**
	 * Returns a new object of class '<em>Activity Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Trace</em>'.
	 * @generated
	 */
	ActivityTrace createActivityTrace();

	/**
	 * Returns a new object of class '<em>Node To Place Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node To Place Trace</em>'.
	 * @generated
	 */
	NodeToPlaceTrace createNodeToPlaceTrace();

	/**
	 * Returns a new object of class '<em>Final Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Node Trace</em>'.
	 * @generated
	 */
	FinalNodeTrace createFinalNodeTrace();

	/**
	 * Returns a new object of class '<em>Control Flow Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Trace</em>'.
	 * @generated
	 */
	ControlFlowTrace createControlFlowTrace();

	/**
	 * Returns a new object of class '<em>Join Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node Trace</em>'.
	 * @generated
	 */
	JoinNodeTrace createJoinNodeTrace();

	/**
	 * Returns a new object of class '<em>Fork Node Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node Trace</em>'.
	 * @generated
	 */
	ForkNodeTrace createForkNodeTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ad2petritraceabilityPackage getAd2petritraceabilityPackage();

} //Ad2petritraceabilityFactory
