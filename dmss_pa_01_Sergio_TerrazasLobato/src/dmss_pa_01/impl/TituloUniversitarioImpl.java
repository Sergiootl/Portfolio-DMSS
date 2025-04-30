/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Asignatura;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.TituloUniversitario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titulo Universitario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.TituloUniversitarioImpl#getAsignaturas <em>Asignaturas</em>}</li>
 *   <li>{@link dmss_pa_01.impl.TituloUniversitarioImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TituloUniversitarioImpl extends EObjectImpl implements TituloUniversitario {
	/**
	 * The cached value of the '{@link #getAsignaturas() <em>Asignaturas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignaturas()
	 * @generated
	 * @ordered
	 */
	protected EList<Asignatura> asignaturas;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TituloUniversitarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.TITULO_UNIVERSITARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asignatura> getAsignaturas() {
		if (asignaturas == null) {
			asignaturas = new EObjectContainmentEList<Asignatura>(Asignatura.class, this, Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS);
		}
		return asignaturas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.TITULO_UNIVERSITARIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS:
				return ((InternalEList<?>)getAsignaturas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS:
				return getAsignaturas();
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS:
				getAsignaturas().clear();
				getAsignaturas().addAll((Collection<? extends Asignatura>)newValue);
				return;
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__NOMBRE:
				setNombre((String)newValue);
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
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS:
				getAsignaturas().clear();
				return;
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__ASIGNATURAS:
				return asignaturas != null && !asignaturas.isEmpty();
			case Dmss_pa_01Package.TITULO_UNIVERSITARIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //TituloUniversitarioImpl
