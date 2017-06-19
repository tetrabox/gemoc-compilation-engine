/**
 */
package gemoctraceability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gemoctraceability.GemoctraceabilityPackage
 * @generated
 */
public interface GemoctraceabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemoctraceabilityFactory eINSTANCE = gemoctraceability.impl.GemoctraceabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traceability Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traceability Model</em>'.
	 * @generated
	 */
	TraceabilityModel createTraceabilityModel();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Element</em>'.
	 * @generated
	 */
	AnnotatedElement createAnnotatedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GemoctraceabilityPackage getGemoctraceabilityPackage();

} //GemoctraceabilityFactory
