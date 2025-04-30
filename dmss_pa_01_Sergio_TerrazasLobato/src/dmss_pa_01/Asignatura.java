/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignatura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Asignatura#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getBloques <em>Bloques</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getProfesores <em>Profesores</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getFicha12a <em>Ficha12a</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getGrupostrabajo <em>Grupostrabajo</em>}</li>
 *   <li>{@link dmss_pa_01.Asignatura#getEscoordinada <em>Escoordinada</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura()
 * @model annotation="gmf.node label='Nombre'"
 * @generated
 */
public interface Asignatura extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Asignatura#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Asignatura#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Bloques</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Bloque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloques</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Bloques()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Bloque> getBloques();

	/**
	 * Returns the value of the '<em><b>Profesores</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.Profesor}.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.Profesor#getAsignaturas <em>Asignaturas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profesores</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Profesores()
	 * @see dmss_pa_01.Profesor#getAsignaturas
	 * @model opposite="asignaturas" required="true"
	 *        annotation="gmf.link source='Asignatura' target='Profesor'"
	 * @generated
	 */
	EList<Profesor> getProfesores();

	/**
	 * Returns the value of the '<em><b>Ficha12a</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ficha12a</em>' attribute.
	 * @see #setFicha12a(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Ficha12a()
	 * @model
	 * @generated
	 */
	String getFicha12a();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Asignatura#getFicha12a <em>Ficha12a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ficha12a</em>' attribute.
	 * @see #getFicha12a()
	 * @generated
	 */
	void setFicha12a(String value);

	/**
	 * Returns the value of the '<em><b>Grupostrabajo</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.GrupoTrabajo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grupostrabajo</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Grupostrabajo()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<GrupoTrabajo> getGrupostrabajo();

	/**
	 * Returns the value of the '<em><b>Escoordinada</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.Profesor#getEscoordinador <em>Escoordinador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escoordinada</em>' reference.
	 * @see #setEscoordinada(Profesor)
	 * @see dmss_pa_01.Dmss_pa_01Package#getAsignatura_Escoordinada()
	 * @see dmss_pa_01.Profesor#getEscoordinador
	 * @model opposite="escoordinador"
	 *        annotation="gmf.link source='Asignatura' target='Profesor'"
	 * @generated
	 */
	Profesor getEscoordinada();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Asignatura#getEscoordinada <em>Escoordinada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escoordinada</em>' reference.
	 * @see #getEscoordinada()
	 * @generated
	 */
	void setEscoordinada(Profesor value);

} // Asignatura
