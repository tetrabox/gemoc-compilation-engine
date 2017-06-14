/**
 */
package gemoctraceability.impl;

import gemoctraceability.GemoctraceabilityPackage;
import gemoctraceability.Link;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gemoctraceability.impl.LinkImpl#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link gemoctraceability.impl.LinkImpl#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getSourceElements() <em>Source Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> sourceElements;

	/**
	 * The cached value of the '{@link #getTargetElements() <em>Target Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> targetElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemoctraceabilityPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSourceElements() {
		if (sourceElements == null) {
			sourceElements = new EObjectResolvingEList<EObject>(EObject.class, this, GemoctraceabilityPackage.LINK__SOURCE_ELEMENTS);
		}
		return sourceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTargetElements() {
		if (targetElements == null) {
			targetElements = new EObjectResolvingEList<EObject>(EObject.class, this, GemoctraceabilityPackage.LINK__TARGET_ELEMENTS);
		}
		return targetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemoctraceabilityPackage.LINK__SOURCE_ELEMENTS:
				return getSourceElements();
			case GemoctraceabilityPackage.LINK__TARGET_ELEMENTS:
				return getTargetElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemoctraceabilityPackage.LINK__SOURCE_ELEMENTS:
				getSourceElements().clear();
				getSourceElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case GemoctraceabilityPackage.LINK__TARGET_ELEMENTS:
				getTargetElements().clear();
				getTargetElements().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GemoctraceabilityPackage.LINK__SOURCE_ELEMENTS:
				getSourceElements().clear();
				return;
			case GemoctraceabilityPackage.LINK__TARGET_ELEMENTS:
				getTargetElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GemoctraceabilityPackage.LINK__SOURCE_ELEMENTS:
				return sourceElements != null && !sourceElements.isEmpty();
			case GemoctraceabilityPackage.LINK__TARGET_ELEMENTS:
				return targetElements != null && !targetElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
