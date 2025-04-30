/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Asignatura;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.Profesor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profesor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.ProfesorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.impl.ProfesorImpl#getAsignaturas <em>Asignaturas</em>}</li>
 *   <li>{@link dmss_pa_01.impl.ProfesorImpl#getEscoordinador <em>Escoordinador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfesorImpl extends EObjectImpl implements Profesor {
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
	 * The cached value of the '{@link #getAsignaturas() <em>Asignaturas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignaturas()
	 * @generated
	 * @ordered
	 */
	protected EList<Asignatura> asignaturas;

	/**
	 * The cached value of the '{@link #getEscoordinador() <em>Escoordinador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscoordinador()
	 * @generated
	 * @ordered
	 */
	protected Asignatura escoordinador;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfesorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.PROFESOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.PROFESOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asignatura> getAsignaturas() {
		if (asignaturas == null) {
			asignaturas = new EObjectWithInverseResolvingEList.ManyInverse<Asignatura>(Asignatura.class, this, Dmss_pa_01Package.PROFESOR__ASIGNATURAS, Dmss_pa_01Package.ASIGNATURA__PROFESORES);
		}
		return asignaturas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asignatura getEscoordinador() {
		if (escoordinador != null && escoordinador.eIsProxy()) {
			InternalEObject oldEscoordinador = (InternalEObject)escoordinador;
			escoordinador = (Asignatura)eResolveProxy(oldEscoordinador);
			if (escoordinador != oldEscoordinador) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, oldEscoordinador, escoordinador));
			}
		}
		return escoordinador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asignatura basicGetEscoordinador() {
		return escoordinador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscoordinador(Asignatura newEscoordinador, NotificationChain msgs) {
		Asignatura oldEscoordinador = escoordinador;
		escoordinador = newEscoordinador;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, oldEscoordinador, newEscoordinador);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscoordinador(Asignatura newEscoordinador) {
		if (newEscoordinador != escoordinador) {
			NotificationChain msgs = null;
			if (escoordinador != null)
				msgs = ((InternalEObject)escoordinador).eInverseRemove(this, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, Asignatura.class, msgs);
			if (newEscoordinador != null)
				msgs = ((InternalEObject)newEscoordinador).eInverseAdd(this, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, Asignatura.class, msgs);
			msgs = basicSetEscoordinador(newEscoordinador, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, newEscoordinador, newEscoordinador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAsignaturas()).basicAdd(otherEnd, msgs);
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				if (escoordinador != null)
					msgs = ((InternalEObject)escoordinador).eInverseRemove(this, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, Asignatura.class, msgs);
				return basicSetEscoordinador((Asignatura)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				return ((InternalEList<?>)getAsignaturas()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				return basicSetEscoordinador(null, msgs);
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
			case Dmss_pa_01Package.PROFESOR__NOMBRE:
				return getNombre();
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				return getAsignaturas();
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				if (resolve) return getEscoordinador();
				return basicGetEscoordinador();
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
			case Dmss_pa_01Package.PROFESOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				getAsignaturas().clear();
				getAsignaturas().addAll((Collection<? extends Asignatura>)newValue);
				return;
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				setEscoordinador((Asignatura)newValue);
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
			case Dmss_pa_01Package.PROFESOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				getAsignaturas().clear();
				return;
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				setEscoordinador((Asignatura)null);
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
			case Dmss_pa_01Package.PROFESOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Dmss_pa_01Package.PROFESOR__ASIGNATURAS:
				return asignaturas != null && !asignaturas.isEmpty();
			case Dmss_pa_01Package.PROFESOR__ESCOORDINADOR:
				return escoordinador != null;
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

} //ProfesorImpl
