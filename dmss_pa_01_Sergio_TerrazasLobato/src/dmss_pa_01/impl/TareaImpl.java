/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.NOTA;
import dmss_pa_01.Tarea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.TareaImpl#getNumMax <em>Num Max</em>}</li>
 *   <li>{@link dmss_pa_01.impl.TareaImpl#getFechaLimite <em>Fecha Limite</em>}</li>
 *   <li>{@link dmss_pa_01.impl.TareaImpl#getCalificacion <em>Calificacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaImpl extends ActividadImpl implements Tarea {
	/**
	 * The default value of the '{@link #getNumMax() <em>Num Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMax()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumMax() <em>Num Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMax()
	 * @generated
	 * @ordered
	 */
	protected int numMax = NUM_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaLimite() <em>Fecha Limite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaLimite()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_LIMITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaLimite() <em>Fecha Limite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaLimite()
	 * @generated
	 * @ordered
	 */
	protected String fechaLimite = FECHA_LIMITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalificacion() <em>Calificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalificacion()
	 * @generated
	 * @ordered
	 */
	protected static final NOTA CALIFICACION_EDEFAULT = NOTA.ESCALA5;

	/**
	 * The cached value of the '{@link #getCalificacion() <em>Calificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalificacion()
	 * @generated
	 * @ordered
	 */
	protected NOTA calificacion = CALIFICACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.TAREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMax() {
		return numMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMax(int newNumMax) {
		int oldNumMax = numMax;
		numMax = newNumMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.TAREA__NUM_MAX, oldNumMax, numMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFechaLimite() {
		return fechaLimite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaLimite(String newFechaLimite) {
		String oldFechaLimite = fechaLimite;
		fechaLimite = newFechaLimite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.TAREA__FECHA_LIMITE, oldFechaLimite, fechaLimite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NOTA getCalificacion() {
		return calificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalificacion(NOTA newCalificacion) {
		NOTA oldCalificacion = calificacion;
		calificacion = newCalificacion == null ? CALIFICACION_EDEFAULT : newCalificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.TAREA__CALIFICACION, oldCalificacion, calificacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dmss_pa_01Package.TAREA__NUM_MAX:
				return getNumMax();
			case Dmss_pa_01Package.TAREA__FECHA_LIMITE:
				return getFechaLimite();
			case Dmss_pa_01Package.TAREA__CALIFICACION:
				return getCalificacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dmss_pa_01Package.TAREA__NUM_MAX:
				setNumMax((Integer)newValue);
				return;
			case Dmss_pa_01Package.TAREA__FECHA_LIMITE:
				setFechaLimite((String)newValue);
				return;
			case Dmss_pa_01Package.TAREA__CALIFICACION:
				setCalificacion((NOTA)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Dmss_pa_01Package.TAREA__NUM_MAX:
				setNumMax(NUM_MAX_EDEFAULT);
				return;
			case Dmss_pa_01Package.TAREA__FECHA_LIMITE:
				setFechaLimite(FECHA_LIMITE_EDEFAULT);
				return;
			case Dmss_pa_01Package.TAREA__CALIFICACION:
				setCalificacion(CALIFICACION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Dmss_pa_01Package.TAREA__NUM_MAX:
				return numMax != NUM_MAX_EDEFAULT;
			case Dmss_pa_01Package.TAREA__FECHA_LIMITE:
				return FECHA_LIMITE_EDEFAULT == null ? fechaLimite != null : !FECHA_LIMITE_EDEFAULT.equals(fechaLimite);
			case Dmss_pa_01Package.TAREA__CALIFICACION:
				return calificacion != CALIFICACION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (NumMax: ");
		result.append(numMax);
		result.append(", FechaLimite: ");
		result.append(fechaLimite);
		result.append(", Calificacion: ");
		result.append(calificacion);
		result.append(')');
		return result.toString();
	}

} //TareaImpl
