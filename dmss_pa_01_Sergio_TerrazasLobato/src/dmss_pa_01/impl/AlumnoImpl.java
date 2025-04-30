/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Alumno;
import dmss_pa_01.Asignatura;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.GrupoTrabajo;
import dmss_pa_01.TituloUniversitario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.AlumnoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AlumnoImpl#getMatriculadoenTU <em>Matriculadoen TU</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AlumnoImpl#getMatriculadoenASIG <em>Matriculadoen ASIG</em>}</li>
 *   <li>{@link dmss_pa_01.impl.AlumnoImpl#getGruposdetrabajo <em>Gruposdetrabajo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlumnoImpl extends EObjectImpl implements Alumno {
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
	 * The cached value of the '{@link #getMatriculadoenTU() <em>Matriculadoen TU</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculadoenTU()
	 * @generated
	 * @ordered
	 */
	protected EList<TituloUniversitario> matriculadoenTU;

	/**
	 * The cached value of the '{@link #getMatriculadoenASIG() <em>Matriculadoen ASIG</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculadoenASIG()
	 * @generated
	 * @ordered
	 */
	protected EList<Asignatura> matriculadoenASIG;

	/**
	 * The cached value of the '{@link #getGruposdetrabajo() <em>Gruposdetrabajo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruposdetrabajo()
	 * @generated
	 * @ordered
	 */
	protected EList<GrupoTrabajo> gruposdetrabajo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlumnoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.ALUMNO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.ALUMNO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TituloUniversitario> getMatriculadoenTU() {
		if (matriculadoenTU == null) {
			matriculadoenTU = new EObjectResolvingEList<TituloUniversitario>(TituloUniversitario.class, this, Dmss_pa_01Package.ALUMNO__MATRICULADOEN_TU);
		}
		return matriculadoenTU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asignatura> getMatriculadoenASIG() {
		if (matriculadoenASIG == null) {
			matriculadoenASIG = new EObjectResolvingEList<Asignatura>(Asignatura.class, this, Dmss_pa_01Package.ALUMNO__MATRICULADOEN_ASIG);
		}
		return matriculadoenASIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GrupoTrabajo> getGruposdetrabajo() {
		if (gruposdetrabajo == null) {
			gruposdetrabajo = new EObjectWithInverseResolvingEList.ManyInverse<GrupoTrabajo>(GrupoTrabajo.class, this, Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO, Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT);
		}
		return gruposdetrabajo;
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
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGruposdetrabajo()).basicAdd(otherEnd, msgs);
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
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				return ((InternalEList<?>)getGruposdetrabajo()).basicRemove(otherEnd, msgs);
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
			case Dmss_pa_01Package.ALUMNO__NOMBRE:
				return getNombre();
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_TU:
				return getMatriculadoenTU();
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_ASIG:
				return getMatriculadoenASIG();
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				return getGruposdetrabajo();
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
			case Dmss_pa_01Package.ALUMNO__NOMBRE:
				setNombre((String)newValue);
				return;
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_TU:
				getMatriculadoenTU().clear();
				getMatriculadoenTU().addAll((Collection<? extends TituloUniversitario>)newValue);
				return;
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_ASIG:
				getMatriculadoenASIG().clear();
				getMatriculadoenASIG().addAll((Collection<? extends Asignatura>)newValue);
				return;
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				getGruposdetrabajo().clear();
				getGruposdetrabajo().addAll((Collection<? extends GrupoTrabajo>)newValue);
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
			case Dmss_pa_01Package.ALUMNO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_TU:
				getMatriculadoenTU().clear();
				return;
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_ASIG:
				getMatriculadoenASIG().clear();
				return;
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				getGruposdetrabajo().clear();
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
			case Dmss_pa_01Package.ALUMNO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_TU:
				return matriculadoenTU != null && !matriculadoenTU.isEmpty();
			case Dmss_pa_01Package.ALUMNO__MATRICULADOEN_ASIG:
				return matriculadoenASIG != null && !matriculadoenASIG.isEmpty();
			case Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO:
				return gruposdetrabajo != null && !gruposdetrabajo.isEmpty();
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

} //AlumnoImpl
