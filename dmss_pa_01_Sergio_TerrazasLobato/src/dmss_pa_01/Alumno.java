/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Alumno#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.Alumno#getMatriculadoenTU <em>Matriculadoen TU</em>}</li>
 *   <li>{@link dmss_pa_01.Alumno#getMatriculadoenASIG <em>Matriculadoen ASIG</em>}</li>
 *   <li>{@link dmss_pa_01.Alumno#getGruposdetrabajo <em>Gruposdetrabajo</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getAlumno()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface Alumno extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getAlumno_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Alumno#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Matriculadoen TU</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.TituloUniversitario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculadoen TU</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAlumno_MatriculadoenTU()
	 * @model required="true"
	 *        annotation="gmf.link source='Alumno' target='TituloUniversitario'"
	 * @generated
	 */
	EList<TituloUniversitario> getMatriculadoenTU();

	/**
	 * Returns the value of the '<em><b>Matriculadoen ASIG</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.Asignatura}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculadoen ASIG</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAlumno_MatriculadoenASIG()
	 * @model annotation="gmf.link source='Alumno' target='Asignatura'"
	 * @generated
	 */
	EList<Asignatura> getMatriculadoenASIG();

	/**
	 * Returns the value of the '<em><b>Gruposdetrabajo</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.GrupoTrabajo}.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.GrupoTrabajo#getAlumnosGT <em>Alumnos GT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gruposdetrabajo</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAlumno_Gruposdetrabajo()
	 * @see dmss_pa_01.GrupoTrabajo#getAlumnosGT
	 * @model opposite="alumnosGT"
	 *        annotation="gmf.link source='Alumno' target='GrupoTrabajo'"
	 * @generated
	 */
	EList<GrupoTrabajo> getGruposdetrabajo();

} // Alumno
