/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Asignatura;
import dmss_pa_01.Bloque;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.GrupoTrabajo;
import dmss_pa_01.Profesor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignatura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getBloques <em>Bloques</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getProfesores <em>Profesores</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getFicha12a <em>Ficha12a</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getGrupostrabajo <em>Grupostrabajo</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AsignaturaImpl#getEscoordinada <em>Escoordinada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignaturaImpl extends EObjectImpl implements Asignatura {
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
	 * The default value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected static final String CODIGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodigo() <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigo()
	 * @generated
	 * @ordered
	 */
	protected String codigo = CODIGO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBloques() <em>Bloques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloques()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloque> bloques;

	/**
	 * The cached value of the '{@link #getProfesores() <em>Profesores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfesores()
	 * @generated
	 * @ordered
	 */
	protected EList<Profesor> profesores;

	/**
	 * The default value of the '{@link #getFicha12a() <em>Ficha12a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFicha12a()
	 * @generated
	 * @ordered
	 */
	protected static final String FICHA12A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFicha12a() <em>Ficha12a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFicha12a()
	 * @generated
	 * @ordered
	 */
	protected String ficha12a = FICHA12A_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrupostrabajo() <em>Grupostrabajo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrupostrabajo()
	 * @generated
	 * @ordered
	 */
	protected EList<GrupoTrabajo> grupostrabajo;

	/**
	 * The cached value of the '{@link #getEscoordinada() <em>Escoordinada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscoordinada()
	 * @generated
	 * @ordered
	 */
	protected Profesor escoordinada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsignaturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.ASIGNATURA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ASIGNATURA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodigo() {
		return codigo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodigo(String newCodigo) {
		String oldCodigo = codigo;
		codigo = newCodigo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ASIGNATURA__CODIGO, oldCodigo, codigo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bloque> getBloques() {
		if (bloques == null) {
			bloques = new EObjectContainmentEList<Bloque>(Bloque.class, this, Dmss_pa_01Package.ASIGNATURA__BLOQUES);
		}
		return bloques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Profesor> getProfesores() {
		if (profesores == null) {
			profesores = new EObjectWithInverseResolvingEList.ManyInverse<Profesor>(Profesor.class, this, Dmss_pa_01Package.ASIGNATURA__PROFESORES, Dmss_pa_01Package.PROFESOR__ASIGNATURAS);
		}
		return profesores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFicha12a() {
		return ficha12a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFicha12a(String newFicha12a) {
		String oldFicha12a = ficha12a;
		ficha12a = newFicha12a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ASIGNATURA__FICHA12A, oldFicha12a, ficha12a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GrupoTrabajo> getGrupostrabajo() {
		if (grupostrabajo == null) {
			grupostrabajo = new EObjectContainmentEList<GrupoTrabajo>(GrupoTrabajo.class, this, Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO);
		}
		return grupostrabajo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Profesor getEscoordinada() {
		if (escoordinada != null && escoordinada.eIsProxy()) {
			InternalEObject oldEscoordinada = (InternalEObject)escoordinada;
			escoordinada = (Profesor)eResolveProxy(oldEscoordinada);
			if (escoordinada != oldEscoordinada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, oldEscoordinada, escoordinada));
			}
		}
		return escoordinada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profesor basicGetEscoordinada() {
		return escoordinada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscoordinada(Profesor newEscoordinada, NotificationChain msgs) {
		Profesor oldEscoordinada = escoordinada;
		escoordinada = newEscoordinada;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, oldEscoordinada, newEscoordinada);
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
	public void setEscoordinada(Profesor newEscoordinada) {
		if (newEscoordinada != escoordinada) {
			NotificationChain msgs = null;
			if (escoordinada != null)
				msgs = ((InternalEObject)escoordinada).eInverseRemove(this, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, Profesor.class, msgs);
			if (newEscoordinada != null)
				msgs = ((InternalEObject)newEscoordinada).eInverseAdd(this, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, Profesor.class, msgs);
			msgs = basicSetEscoordinada(newEscoordinada, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA, newEscoordinada, newEscoordinada));
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
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfesores()).basicAdd(otherEnd, msgs);
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				if (escoordinada != null)
					msgs = ((InternalEObject)escoordinada).eInverseRemove(this, Dmss_pa_01Package.PROFESOR__ESCOORDINADOR, Profesor.class, msgs);
				return basicSetEscoordinada((Profesor)otherEnd, msgs);
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
			case Dmss_pa_01Package.ASIGNATURA__BLOQUES:
				return ((InternalEList<?>)getBloques()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				return ((InternalEList<?>)getProfesores()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO:
				return ((InternalEList<?>)getGrupostrabajo()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				return basicSetEscoordinada(null, msgs);
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
			case Dmss_pa_01Package.ASIGNATURA__NOMBRE:
				return getNombre();
			case Dmss_pa_01Package.ASIGNATURA__CODIGO:
				return getCodigo();
			case Dmss_pa_01Package.ASIGNATURA__BLOQUES:
				return getBloques();
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				return getProfesores();
			case Dmss_pa_01Package.ASIGNATURA__FICHA12A:
				return getFicha12a();
			case Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO:
				return getGrupostrabajo();
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				if (resolve) return getEscoordinada();
				return basicGetEscoordinada();
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
			case Dmss_pa_01Package.ASIGNATURA__NOMBRE:
				setNombre((String)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__CODIGO:
				setCodigo((String)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__BLOQUES:
				getBloques().clear();
				getBloques().addAll((Collection<? extends Bloque>)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				getProfesores().clear();
				getProfesores().addAll((Collection<? extends Profesor>)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__FICHA12A:
				setFicha12a((String)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO:
				getGrupostrabajo().clear();
				getGrupostrabajo().addAll((Collection<? extends GrupoTrabajo>)newValue);
				return;
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				setEscoordinada((Profesor)newValue);
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
			case Dmss_pa_01Package.ASIGNATURA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Dmss_pa_01Package.ASIGNATURA__CODIGO:
				setCodigo(CODIGO_EDEFAULT);
				return;
			case Dmss_pa_01Package.ASIGNATURA__BLOQUES:
				getBloques().clear();
				return;
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				getProfesores().clear();
				return;
			case Dmss_pa_01Package.ASIGNATURA__FICHA12A:
				setFicha12a(FICHA12A_EDEFAULT);
				return;
			case Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO:
				getGrupostrabajo().clear();
				return;
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				setEscoordinada((Profesor)null);
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
			case Dmss_pa_01Package.ASIGNATURA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Dmss_pa_01Package.ASIGNATURA__CODIGO:
				return CODIGO_EDEFAULT == null ? codigo != null : !CODIGO_EDEFAULT.equals(codigo);
			case Dmss_pa_01Package.ASIGNATURA__BLOQUES:
				return bloques != null && !bloques.isEmpty();
			case Dmss_pa_01Package.ASIGNATURA__PROFESORES:
				return profesores != null && !profesores.isEmpty();
			case Dmss_pa_01Package.ASIGNATURA__FICHA12A:
				return FICHA12A_EDEFAULT == null ? ficha12a != null : !FICHA12A_EDEFAULT.equals(ficha12a);
			case Dmss_pa_01Package.ASIGNATURA__GRUPOSTRABAJO:
				return grupostrabajo != null && !grupostrabajo.isEmpty();
			case Dmss_pa_01Package.ASIGNATURA__ESCOORDINADA:
				return escoordinada != null;
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
		result.append(", Codigo: ");
		result.append(codigo);
		result.append(", Ficha12a: ");
		result.append(ficha12a);
		result.append(')');
		return result.toString();
	}

} //AsignaturaImpl
