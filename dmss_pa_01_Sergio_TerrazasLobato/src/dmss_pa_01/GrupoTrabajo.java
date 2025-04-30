/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grupo Trabajo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getID <em>ID</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getNumgrupos <em>Numgrupos</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getNumMinEstu <em>Num Min Estu</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getNumMaxEstu <em>Num Max Estu</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getAlumnosGT <em>Alumnos GT</em>}</li>
 *   <li>{@link dmss_pa_01.GrupoTrabajo#getActividadobligatoria <em>Actividadobligatoria</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo()
 * @model annotation="gmf.node label='Descripcion'"
 * @generated
 */
public interface GrupoTrabajo extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link dmss_pa_01.GrupoTrabajo#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link dmss_pa_01.GrupoTrabajo#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Numgrupos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numgrupos</em>' attribute.
	 * @see #setNumgrupos(int)
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_Numgrupos()
	 * @model
	 * @generated
	 */
	int getNumgrupos();

	/**
	 * Sets the value of the '{@link dmss_pa_01.GrupoTrabajo#getNumgrupos <em>Numgrupos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numgrupos</em>' attribute.
	 * @see #getNumgrupos()
	 * @generated
	 */
	void setNumgrupos(int value);

	/**
	 * Returns the value of the '<em><b>Num Min Estu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Min Estu</em>' attribute.
	 * @see #setNumMinEstu(int)
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_NumMinEstu()
	 * @model
	 * @generated
	 */
	int getNumMinEstu();

	/**
	 * Sets the value of the '{@link dmss_pa_01.GrupoTrabajo#getNumMinEstu <em>Num Min Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Min Estu</em>' attribute.
	 * @see #getNumMinEstu()
	 * @generated
	 */
	void setNumMinEstu(int value);

	/**
	 * Returns the value of the '<em><b>Num Max Estu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Max Estu</em>' attribute.
	 * @see #setNumMaxEstu(int)
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_NumMaxEstu()
	 * @model
	 * @generated
	 */
	int getNumMaxEstu();

	/**
	 * Sets the value of the '{@link dmss_pa_01.GrupoTrabajo#getNumMaxEstu <em>Num Max Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Max Estu</em>' attribute.
	 * @see #getNumMaxEstu()
	 * @generated
	 */
	void setNumMaxEstu(int value);

	/**
	 * Returns the value of the '<em><b>Alumnos GT</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.Alumno}.
	 * It is bidirectional and its opposite is '{@link dmss_pa_01.Alumno#getGruposdetrabajo <em>Gruposdetrabajo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alumnos GT</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_AlumnosGT()
	 * @see dmss_pa_01.Alumno#getGruposdetrabajo
	 * @model opposite="gruposdetrabajo" required="true"
	 *        annotation="gmf.link source='GrupoTrabajo' target='Alumno'"
	 * @generated
	 */
	EList<Alumno> getAlumnosGT();

	/**
	 * Returns the value of the '<em><b>Actividadobligatoria</b></em>' reference list.
	 * The list contents are of type {@link dmss_pa_01.Actividad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actividadobligatoria</em>' reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getGrupoTrabajo_Actividadobligatoria()
	 * @model annotation="gmf.link source='GrupoTrabajo' target='Actividad'"
	 * @generated
	 */
	EList<Actividad> getActividadobligatoria();

} // GrupoTrabajo
