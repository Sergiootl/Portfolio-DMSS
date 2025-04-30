/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Foro#getPreguntas <em>Preguntas</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getForo()
 * @model annotation="gmf.node label='Descripcion'"
 * @generated
 */
public interface Foro extends Actividad {
	/**
	 * Returns the value of the '<em><b>Preguntas</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getForo_Preguntas()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Pregunta> getPreguntas();

} // Foro
