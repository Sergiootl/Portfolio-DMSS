/**
 */
package dmss_pa_01;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.Tarea#getNumMax <em>Num Max</em>}</li>
 *   <li>{@link dmss_pa_01.Tarea#getFechaLimite <em>Fecha Limite</em>}</li>
 *   <li>{@link dmss_pa_01.Tarea#getCalificacion <em>Calificacion</em>}</li>
 * </ul>
 *
 * @see dmss_pa_01.Dmss_pa_01Package#getTarea()
 * @model annotation="gmf.node label='Descripcion'"
 * @generated
 */
public interface Tarea extends Actividad {
	/**
	 * Returns the value of the '<em><b>Num Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Max</em>' attribute.
	 * @see #setNumMax(int)
	 * @see dmss_pa_01.Dmss_pa_01Package#getTarea_NumMax()
	 * @model
	 * @generated
	 */
	int getNumMax();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Tarea#getNumMax <em>Num Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Max</em>' attribute.
	 * @see #getNumMax()
	 * @generated
	 */
	void setNumMax(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Limite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Limite</em>' attribute.
	 * @see #setFechaLimite(String)
	 * @see dmss_pa_01.Dmss_pa_01Package#getTarea_FechaLimite()
	 * @model
	 * @generated
	 */
	String getFechaLimite();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Tarea#getFechaLimite <em>Fecha Limite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Limite</em>' attribute.
	 * @see #getFechaLimite()
	 * @generated
	 */
	void setFechaLimite(String value);

	/**
	 * Returns the value of the '<em><b>Calificacion</b></em>' attribute.
	 * The literals are from the enumeration {@link dmss_pa_01.NOTA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calificacion</em>' attribute.
	 * @see dmss_pa_01.NOTA
	 * @see #setCalificacion(NOTA)
	 * @see dmss_pa_01.Dmss_pa_01Package#getTarea_Calificacion()
	 * @model
	 * @generated
	 */
	NOTA getCalificacion();

	/**
	 * Sets the value of the '{@link dmss_pa_01.Tarea#getCalificacion <em>Calificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calificacion</em>' attribute.
	 * @see dmss_pa_01.NOTA
	 * @see #getCalificacion()
	 * @generated
	 */
	void setCalificacion(NOTA value);

} // Tarea
