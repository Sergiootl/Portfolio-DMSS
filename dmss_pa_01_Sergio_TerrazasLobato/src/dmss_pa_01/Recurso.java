/**
 */
package dmss_pa_01;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Recurso#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getRecurso()
 * @model annotation="gmf.node label='Extension'"
 * @generated
 */
public interface Recurso extends Actividad {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * The literals are from the enumeration {@link dmss_pa_01.TIPO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see dmss_pa_01.TIPO
	 * @see #setExtension(TIPO)
	 * @see dmss_pa_01.Dmss_pa_01Package#getRecurso_Extension()
	 * @model
	 * @generated
	 */
	TIPO getExtension();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Recurso#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see dmss_pa_01.TIPO
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(TIPO value);

} // Recurso
