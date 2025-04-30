/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Universidad#getTitulosuniversitarios <em>Titulosuniversitarios</em>}</li>
 *   <li>{@link dmss_pa_01.Universidad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.Universidad#getAlumnos <em>Alumnos</em>}</li>
 *   <li>{@link dmss_pa_01.Universidad#getProfesores <em>Profesores</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getUniversidad()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface Universidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Titulosuniversitarios</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.TituloUniversitario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulosuniversitarios</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getUniversidad_Titulosuniversitarios()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<TituloUniversitario> getTitulosuniversitarios();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getUniversidad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Universidad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Alumnos</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Alumno}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alumnos</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getUniversidad_Alumnos()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Alumno> getAlumnos();

	/**
	 * Returns the value of the '<em><b>Profesores</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Profesor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profesores</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getUniversidad_Profesores()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Profesor> getProfesores();

} // Universidad
