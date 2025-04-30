/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Alumno;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.Profesor;
import dmss_pa_01.TituloUniversitario;
import dmss_pa_01.Universidad;

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
 * An implementation of the model object '<em><b>Universidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.UniversidadImpl#getTitulosuniversitarios <em>Titulosuniversitarios</em>}</li>
 *   <li>{@link dmss_pa_01.impl.UniversidadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.impl.UniversidadImpl#getAlumnos <em>Alumnos</em>}</li>
 *   <li>{@link dmss_pa_01.impl.UniversidadImpl#getProfesores <em>Profesores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversidadImpl extends EObjectImpl implements Universidad {
	/**
	 * The cached value of the '{@link #getTitulosuniversitarios() <em>Titulosuniversitarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulosuniversitarios()
	 * @generated
	 * @ordered
	 */
	protected EList<TituloUniversitario> titulosuniversitarios;

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
	 * The cached value of the '{@link #getAlumnos() <em>Alumnos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlumnos()
	 * @generated
	 * @ordered
	 */
	protected EList<Alumno> alumnos;

	/**
	 * The cached value of the '{@link #getProfesores() <em>Profesores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfesores()
	 * @generated
	 * @ordered
	 */
	protected EList<Profesor> profesores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.UNIVERSIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TituloUniversitario> getTitulosuniversitarios() {
		if (titulosuniversitarios == null) {
			titulosuniversitarios = new EObjectContainmentEList<TituloUniversitario>(TituloUniversitario.class, this, Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS);
		}
		return titulosuniversitarios;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.UNIVERSIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alumno> getAlumnos() {
		if (alumnos == null) {
			alumnos = new EObjectContainmentEList<Alumno>(Alumno.class, this, Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS);
		}
		return alumnos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Profesor> getProfesores() {
		if (profesores == null) {
			profesores = new EObjectContainmentEList<Profesor>(Profesor.class, this, Dmss_pa_01Package.UNIVERSIDAD__PROFESORES);
		}
		return profesores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS:
				return ((InternalEList<?>)getTitulosuniversitarios()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS:
				return ((InternalEList<?>)getAlumnos()).basicRemove(otherEnd, msgs);
			case Dmss_pa_01Package.UNIVERSIDAD__PROFESORES:
				return ((InternalEList<?>)getProfesores()).basicRemove(otherEnd, msgs);
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
			case Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS:
				return getTitulosuniversitarios();
			case Dmss_pa_01Package.UNIVERSIDAD__NOMBRE:
				return getNombre();
			case Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS:
				return getAlumnos();
			case Dmss_pa_01Package.UNIVERSIDAD__PROFESORES:
				return getProfesores();
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
			case Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS:
				getTitulosuniversitarios().clear();
				getTitulosuniversitarios().addAll((Collection<? extends TituloUniversitario>)newValue);
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__NOMBRE:
				setNombre((String)newValue);
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS:
				getAlumnos().clear();
				getAlumnos().addAll((Collection<? extends Alumno>)newValue);
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__PROFESORES:
				getProfesores().clear();
				getProfesores().addAll((Collection<? extends Profesor>)newValue);
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
			case Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS:
				getTitulosuniversitarios().clear();
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS:
				getAlumnos().clear();
				return;
			case Dmss_pa_01Package.UNIVERSIDAD__PROFESORES:
				getProfesores().clear();
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
			case Dmss_pa_01Package.UNIVERSIDAD__TITULOSUNIVERSITARIOS:
				return titulosuniversitarios != null && !titulosuniversitarios.isEmpty();
			case Dmss_pa_01Package.UNIVERSIDAD__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Dmss_pa_01Package.UNIVERSIDAD__ALUMNOS:
				return alumnos != null && !alumnos.isEmpty();
			case Dmss_pa_01Package.UNIVERSIDAD__PROFESORES:
				return profesores != null && !profesores.isEmpty();
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

} //UniversidadImpl
