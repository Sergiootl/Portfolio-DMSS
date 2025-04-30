/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Actividad;
import dmss_pa_01.Alumno;
import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.GrupoTrabajo;

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
 * An implementation of the model object '<em><b>Grupo Trabajo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getID <em>ID</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getNumgrupos <em>Numgrupos</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getNumMinEstu <em>Num Min Estu</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getNumMaxEstu <em>Num Max Estu</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getAlumnosGT <em>Alumnos GT</em>}</li>
 *   <li>{@link dmss_pa_01.impl.GrupoTrabajoImpl#getActividadobligatoria <em>Actividadobligatoria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrupoTrabajoImpl extends EObjectImpl implements GrupoTrabajo {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumgrupos() <em>Numgrupos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumgrupos()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMGRUPOS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumgrupos() <em>Numgrupos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumgrupos()
	 * @generated
	 * @ordered
	 */
	protected int numgrupos = NUMGRUPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumMinEstu() <em>Num Min Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMinEstu()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MIN_ESTU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumMinEstu() <em>Num Min Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMinEstu()
	 * @generated
	 * @ordered
	 */
	protected int numMinEstu = NUM_MIN_ESTU_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumMaxEstu() <em>Num Max Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMaxEstu()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MAX_ESTU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumMaxEstu() <em>Num Max Estu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumMaxEstu()
	 * @generated
	 * @ordered
	 */
	protected int numMaxEstu = NUM_MAX_ESTU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlumnosGT() <em>Alumnos GT</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlumnosGT()
	 * @generated
	 * @ordered
	 */
	protected EList<Alumno> alumnosGT;

	/**
	 * The cached value of the '{@link #getActividadobligatoria() <em>Actividadobligatoria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActividadobligatoria()
	 * @generated
	 * @ordered
	 */
	protected EList<Actividad> actividadobligatoria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoTrabajoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.GRUPO_TRABAJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.GRUPO_TRABAJO__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.GRUPO_TRABAJO__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumgrupos() {
		return numgrupos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumgrupos(int newNumgrupos) {
		int oldNumgrupos = numgrupos;
		numgrupos = newNumgrupos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.GRUPO_TRABAJO__NUMGRUPOS, oldNumgrupos, numgrupos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMinEstu() {
		return numMinEstu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMinEstu(int newNumMinEstu) {
		int oldNumMinEstu = numMinEstu;
		numMinEstu = newNumMinEstu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MIN_ESTU, oldNumMinEstu, numMinEstu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumMaxEstu() {
		return numMaxEstu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumMaxEstu(int newNumMaxEstu) {
		int oldNumMaxEstu = numMaxEstu;
		numMaxEstu = newNumMaxEstu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MAX_ESTU, oldNumMaxEstu, numMaxEstu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alumno> getAlumnosGT() {
		if (alumnosGT == null) {
			alumnosGT = new EObjectWithInverseResolvingEList.ManyInverse<Alumno>(Alumno.class, this, Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT, Dmss_pa_01Package.ALUMNO__GRUPOSDETRABAJO);
		}
		return alumnosGT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actividad> getActividadobligatoria() {
		if (actividadobligatoria == null) {
			actividadobligatoria = new EObjectResolvingEList<Actividad>(Actividad.class, this, Dmss_pa_01Package.GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA);
		}
		return actividadobligatoria;
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlumnosGT()).basicAdd(otherEnd, msgs);
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				return ((InternalEList<?>)getAlumnosGT()).basicRemove(otherEnd, msgs);
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ID:
				return getID();
			case Dmss_pa_01Package.GRUPO_TRABAJO__DESCRIPCION:
				return getDescripcion();
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUMGRUPOS:
				return getNumgrupos();
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MIN_ESTU:
				return getNumMinEstu();
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MAX_ESTU:
				return getNumMaxEstu();
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				return getAlumnosGT();
			case Dmss_pa_01Package.GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA:
				return getActividadobligatoria();
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ID:
				setID((Integer)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUMGRUPOS:
				setNumgrupos((Integer)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MIN_ESTU:
				setNumMinEstu((Integer)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MAX_ESTU:
				setNumMaxEstu((Integer)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				getAlumnosGT().clear();
				getAlumnosGT().addAll((Collection<? extends Alumno>)newValue);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA:
				getActividadobligatoria().clear();
				getActividadobligatoria().addAll((Collection<? extends Actividad>)newValue);
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ID:
				setID(ID_EDEFAULT);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUMGRUPOS:
				setNumgrupos(NUMGRUPOS_EDEFAULT);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MIN_ESTU:
				setNumMinEstu(NUM_MIN_ESTU_EDEFAULT);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MAX_ESTU:
				setNumMaxEstu(NUM_MAX_ESTU_EDEFAULT);
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				getAlumnosGT().clear();
				return;
			case Dmss_pa_01Package.GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA:
				getActividadobligatoria().clear();
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
			case Dmss_pa_01Package.GRUPO_TRABAJO__ID:
				return id != ID_EDEFAULT;
			case Dmss_pa_01Package.GRUPO_TRABAJO__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUMGRUPOS:
				return numgrupos != NUMGRUPOS_EDEFAULT;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MIN_ESTU:
				return numMinEstu != NUM_MIN_ESTU_EDEFAULT;
			case Dmss_pa_01Package.GRUPO_TRABAJO__NUM_MAX_ESTU:
				return numMaxEstu != NUM_MAX_ESTU_EDEFAULT;
			case Dmss_pa_01Package.GRUPO_TRABAJO__ALUMNOS_GT:
				return alumnosGT != null && !alumnosGT.isEmpty();
			case Dmss_pa_01Package.GRUPO_TRABAJO__ACTIVIDADOBLIGATORIA:
				return actividadobligatoria != null && !actividadobligatoria.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Descripcion: ");
		result.append(descripcion);
		result.append(", Numgrupos: ");
		result.append(numgrupos);
		result.append(", NumMinEstu: ");
		result.append(numMinEstu);
		result.append(", NumMaxEstu: ");
		result.append(numMaxEstu);
		result.append(')');
		return result.toString();
	}

} //GrupoTrabajoImpl
