/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Root#getUniversidad <em>Universidad</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getRoot()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Universidad</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Universidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universidad</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getRoot_Universidad()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Universidad> getUniversidad();

} // Root
