/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Bloque#getActividades <em>Actividades</em>}</li>
 *   <li>{@link dmss_pa_01.Bloque#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getBloque()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface Bloque extends EObject {
	/**
	 * Returns the value of the '<em><b>Actividades</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Actividad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividades</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getBloque_Actividades()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Actividad> getActividades();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getBloque_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Bloque#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Bloque
