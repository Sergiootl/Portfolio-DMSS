/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titulo Universitario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.TituloUniversitario#getAsignaturas <em>Asignaturas</em>}</li>
 *   <li>{@link dmss_pa_01.TituloUniversitario#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getTituloUniversitario()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface TituloUniversitario extends EObject {
	/**
	 * Returns the value of the '<em><b>Asignaturas</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Asignatura}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignaturas</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getTituloUniversitario_Asignaturas()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Asignatura> getAsignaturas();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getTituloUniversitario_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.TituloUniversitario#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // TituloUniversitario
