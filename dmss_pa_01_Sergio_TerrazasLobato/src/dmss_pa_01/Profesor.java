/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Profesor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.Profesor#getAsignaturas <em>Asignaturas</em>}</li>
 *   <li>{@link dmss_pa_01.Profesor#getEscoordinador <em>Escoordinador</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getProfesor()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface Profesor extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getProfesor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Profesor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Asignaturas</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.Asignatura}.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.Asignatura#getProfesores <em>Profesores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignaturas</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getProfesor_Asignaturas()
	 * @see dmss_pa_01.Asignatura#getProfesores
	 * @model opposite="profesores"
	 *        annotation="gmf.link source='Profesor' target='Asignatura'"
	 * @generated
	 */
	EList<Asignatura> getAsignaturas();

	/**
	 * Returns the value of the '<em><b>Escoordinador</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.Asignatura#getEscoordinada <em>Escoordinada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escoordinador</em>' reference.
	 * @see #setEscoordinador(Asignatura)
	 * @see dmss_pa_01.Dmss_pa_01Package#getProfesor_Escoordinador()
	 * @see dmss_pa_01.Asignatura#getEscoordinada
	 * @model opposite="escoordinada"
	 *        annotation="gmf.link source='Profesor' target='Asignatura'"
	 * @generated
	 */
	Asignatura getEscoordinador();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Profesor#getEscoordinador <em>Escoordinador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escoordinador</em>' reference.
	 * @see #getEscoordinador()
	 * @generated
	 */
	void setEscoordinador(Asignatura value);

} // Profesor
