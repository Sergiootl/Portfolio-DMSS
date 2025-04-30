/**
 */
package dmss_pa_01.impl;

import dmss_pa_01.Dmss_pa_01Package;
import dmss_pa_01.Respuesta;

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
 * An implementation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dmss_pa_01.impl.RespuestaImpl#getRespuestaanidada <em>Respuestaanidada</em>}</li>
 *   <li>{@link dmss_pa_01.impl.RespuestaImpl#getTexto <em>Texto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RespuestaImpl extends EObjectImpl implements Respuesta {
	/**
	 * The cached value of the '{@link #getRespuestaanidada() <em>Respuestaanidada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespuestaanidada()
	 * @generated
	 * @ordered
	 */
	protected EList<Respuesta> respuestaanidada;

	/**
	 * The default value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexto() <em>Texto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexto()
	 * @generated
	 * @ordered
	 */
	protected String texto = TEXTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dmss_pa_01Package.Literals.RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Respuesta> getRespuestaanidada() {
		if (respuestaanidada == null) {
			respuestaanidada = new EObjectContainmentEList<Respuesta>(Respuesta.class, this, Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA);
		}
		return respuestaanidada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexto() {
		return texto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexto(String newTexto) {
		String oldTexto = texto;
		texto = newTexto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dmss_pa_01Package.RESPUESTA__TEXTO, oldTexto, texto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA:
				return ((InternalEList<?>)getRespuestaanidada()).basicRemove(otherEnd, msgs);
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
			case Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA:
				return getRespuestaanidada();
			case Dmss_pa_01Package.RESPUESTA__TEXTO:
				return getTexto();
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
			case Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA:
				getRespuestaanidada().clear();
				getRespuestaanidada().addAll((Collection<? extends Respuesta>)newValue);
				return;
			case Dmss_pa_01Package.RESPUESTA__TEXTO:
				setTexto((String)newValue);
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
			case Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA:
				getRespuestaanidada().clear();
				return;
			case Dmss_pa_01Package.RESPUESTA__TEXTO:
				setTexto(TEXTO_EDEFAULT);
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
			case Dmss_pa_01Package.RESPUESTA__RESPUESTAANIDADA:
				return respuestaanidada != null && !respuestaanidada.isEmpty();
			case Dmss_pa_01Package.RESPUESTA__TEXTO:
				return TEXTO_EDEFAULT == null ? texto != null : !TEXTO_EDEFAULT.equals(texto);
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
		result.append(" (Texto: ");
		result.append(texto);
		result.append(')');
		return result.toString();
	}

} //RespuestaImpl
