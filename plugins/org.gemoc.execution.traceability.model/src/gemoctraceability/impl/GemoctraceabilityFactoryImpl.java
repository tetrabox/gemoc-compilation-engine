/**
 */
package gemoctraceability.impl;

import gemoctraceability.*;

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
public class GemoctraceabilityFactoryImpl extends EFactoryImpl implements GemoctraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GemoctraceabilityFactory init() {
		try {
			GemoctraceabilityFactory theGemoctraceabilityFactory = (GemoctraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(GemoctraceabilityPackage.eNS_URI);
			if (theGemoctraceabilityFactory != null) {
				return theGemoctraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GemoctraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemoctraceabilityFactoryImpl() {
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
			case GemoctraceabilityPackage.TRACEABILITY_MODEL: return createTraceabilityModel();
			case GemoctraceabilityPackage.LINK: return createLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityModel createTraceabilityModel() {
		TraceabilityModelImpl traceabilityModel = new TraceabilityModelImpl();
		return traceabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemoctraceabilityPackage getGemoctraceabilityPackage() {
		return (GemoctraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GemoctraceabilityPackage getPackage() {
		return GemoctraceabilityPackage.eINSTANCE;
	}

} //GemoctraceabilityFactoryImpl
