/**
 */
package THMicroservice.impl;

import THMicroservice.Event;
import THMicroservice.THMicroservicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.EventImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link THMicroservice.impl.EventImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link THMicroservice.impl.EventImpl#getValType <em>Val Type</em>}</li>
 *   <li>{@link THMicroservice.impl.EventImpl#getValName <em>Val Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getKeyType() <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected String keyType = KEY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValType() <em>Val Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValType()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValType() <em>Val Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValType()
	 * @generated
	 * @ordered
	 */
	protected String valType = VAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValName() <em>Val Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValName() <em>Val Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValName()
	 * @generated
	 * @ordered
	 */
	protected String valName = VAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyType() {
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyType(String newKeyType) {
		String oldKeyType = keyType;
		keyType = newKeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.EVENT__KEY_TYPE, oldKeyType, keyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.EVENT__KEY_NAME, oldKeyName, keyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValType() {
		return valType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValType(String newValType) {
		String oldValType = valType;
		valType = newValType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.EVENT__VAL_TYPE, oldValType, valType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValName() {
		return valName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValName(String newValName) {
		String oldValName = valName;
		valName = newValName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.EVENT__VAL_NAME, oldValName, valName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THMicroservicePackage.EVENT__KEY_TYPE:
				return getKeyType();
			case THMicroservicePackage.EVENT__KEY_NAME:
				return getKeyName();
			case THMicroservicePackage.EVENT__VAL_TYPE:
				return getValType();
			case THMicroservicePackage.EVENT__VAL_NAME:
				return getValName();
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
			case THMicroservicePackage.EVENT__KEY_TYPE:
				setKeyType((String)newValue);
				return;
			case THMicroservicePackage.EVENT__KEY_NAME:
				setKeyName((String)newValue);
				return;
			case THMicroservicePackage.EVENT__VAL_TYPE:
				setValType((String)newValue);
				return;
			case THMicroservicePackage.EVENT__VAL_NAME:
				setValName((String)newValue);
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
			case THMicroservicePackage.EVENT__KEY_TYPE:
				setKeyType(KEY_TYPE_EDEFAULT);
				return;
			case THMicroservicePackage.EVENT__KEY_NAME:
				setKeyName(KEY_NAME_EDEFAULT);
				return;
			case THMicroservicePackage.EVENT__VAL_TYPE:
				setValType(VAL_TYPE_EDEFAULT);
				return;
			case THMicroservicePackage.EVENT__VAL_NAME:
				setValName(VAL_NAME_EDEFAULT);
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
			case THMicroservicePackage.EVENT__KEY_TYPE:
				return KEY_TYPE_EDEFAULT == null ? keyType != null : !KEY_TYPE_EDEFAULT.equals(keyType);
			case THMicroservicePackage.EVENT__KEY_NAME:
				return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
			case THMicroservicePackage.EVENT__VAL_TYPE:
				return VAL_TYPE_EDEFAULT == null ? valType != null : !VAL_TYPE_EDEFAULT.equals(valType);
			case THMicroservicePackage.EVENT__VAL_NAME:
				return VAL_NAME_EDEFAULT == null ? valName != null : !VAL_NAME_EDEFAULT.equals(valName);
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
		result.append(" (keyType: ");
		result.append(keyType);
		result.append(", keyName: ");
		result.append(keyName);
		result.append(", valType: ");
		result.append(valType);
		result.append(", valName: ");
		result.append(valName);
		result.append(')');
		return result.toString();
	}

} //EventImpl
