/**
 */
package gemoctraceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gemoctraceability.Link#getSourceElements <em>Source Elements</em>}</li>
 *   <li>{@link gemoctraceability.Link#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @see gemoctraceability.GemoctraceabilityPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' containment reference list.
	 * The list contents are of type {@link gemoctraceability.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' containment reference list.
	 * @see gemoctraceability.GemoctraceabilityPackage#getLink_SourceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotatedElement> getSourceElements();

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' containment reference list.
	 * The list contents are of type {@link gemoctraceability.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' containment reference list.
	 * @see gemoctraceability.GemoctraceabilityPackage#getLink_TargetElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotatedElement> getTargetElements();

} // Link
