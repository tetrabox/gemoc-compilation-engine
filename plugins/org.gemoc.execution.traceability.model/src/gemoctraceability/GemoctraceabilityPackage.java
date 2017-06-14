/**
 */
package gemoctraceability;

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
 * @see gemoctraceability.GemoctraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface GemoctraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gemoctraceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "gemoctraceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gemoctraceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemoctraceabilityPackage eINSTANCE = gemoctraceability.impl.GemoctraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link gemoctraceability.impl.TraceabilityModelImpl <em>Traceability Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemoctraceability.impl.TraceabilityModelImpl
	 * @see gemoctraceability.impl.GemoctraceabilityPackageImpl#getTraceabilityModel()
	 * @generated
	 */
	int TRACEABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Traceability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Traceability Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemoctraceability.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemoctraceability.impl.LinkImpl
	 * @see gemoctraceability.impl.GemoctraceabilityPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gemoctraceability.TraceabilityModel <em>Traceability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Model</em>'.
	 * @see gemoctraceability.TraceabilityModel
	 * @generated
	 */
	EClass getTraceabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link gemoctraceability.TraceabilityModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see gemoctraceability.TraceabilityModel#getLinks()
	 * @see #getTraceabilityModel()
	 * @generated
	 */
	EReference getTraceabilityModel_Links();

	/**
	 * Returns the meta object for class '{@link gemoctraceability.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see gemoctraceability.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link gemoctraceability.Link#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Elements</em>'.
	 * @see gemoctraceability.Link#getSourceElements()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_SourceElements();

	/**
	 * Returns the meta object for the reference list '{@link gemoctraceability.Link#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Elements</em>'.
	 * @see gemoctraceability.Link#getTargetElements()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_TargetElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GemoctraceabilityFactory getGemoctraceabilityFactory();

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
		 * The meta object literal for the '{@link gemoctraceability.impl.TraceabilityModelImpl <em>Traceability Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemoctraceability.impl.TraceabilityModelImpl
		 * @see gemoctraceability.impl.GemoctraceabilityPackageImpl#getTraceabilityModel()
		 * @generated
		 */
		EClass TRACEABILITY_MODEL = eINSTANCE.getTraceabilityModel();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MODEL__LINKS = eINSTANCE.getTraceabilityModel_Links();

		/**
		 * The meta object literal for the '{@link gemoctraceability.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemoctraceability.impl.LinkImpl
		 * @see gemoctraceability.impl.GemoctraceabilityPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE_ELEMENTS = eINSTANCE.getLink_SourceElements();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET_ELEMENTS = eINSTANCE.getLink_TargetElements();

	}

} //GemoctraceabilityPackage
