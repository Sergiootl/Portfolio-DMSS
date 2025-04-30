/**
 */
package dmss_pa_01;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Respuesta#getRespuestaanidada <em>Respuestaanidada</em>}</li>
 *   <li>{@link dmss_pa_01.Respuesta#getTexto <em>Texto</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getRespuesta()
 * @model annotation="gmf.node label='Texto'"
 * @generated
 */
public interface Respuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Respuestaanidada</b></em>' containment reference list.
	 * The list contents are of type {@link dmss_pa_01.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestaanidada</em>' containment reference list.
	 * @see dmss_pa_01.Dmss_pa_01Package#getRespuesta_Respuestaanidada()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Respuesta> getRespuestaanidada();

	/**
	 * Returns the value of the '<em><b>Texto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texto</em>' attribute.
	 * @see #setTexto(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getRespuesta_Texto()
	 * @model
	 * @generated
	 */
	String getTexto();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Respuesta#getTexto <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texto</em>' attribute.
	 * @see #getTexto()
	 * @generated
	 */
	void setTexto(String value);

} // Respuesta
