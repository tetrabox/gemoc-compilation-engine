/**
 */
package gemoctraceability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceability Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gemoctraceability.TraceabilityModel#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see gemoctraceability.GemoctraceabilityPackage#getTraceabilityModel()
 * @model
 * @generated
 */
public interface TraceabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link gemoctraceability.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see gemoctraceability.GemoctraceabilityPackage#getTraceabilityModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // TraceabilityModel
