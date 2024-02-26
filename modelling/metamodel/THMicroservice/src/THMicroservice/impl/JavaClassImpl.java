/**
 */
package THMicroservice.impl;

import THMicroservice.JavaClass;
import THMicroservice.THMicroservicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.JavaClassImpl#getClassPackage <em>Class Package</em>}</li>
 *   <li>{@link THMicroservice.impl.JavaClassImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaClassImpl extends MinimalEObjectImpl.Container implements JavaClass {
	/**
	 * The default value of the '{@link #getClassPackage() <em>Class Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassPackage() <em>Class Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPackage()
	 * @generated
	 * @ordered
	 */
	protected String classPackage = CLASS_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.JAVA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassPackage() {
		return classPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPackage(String newClassPackage) {
		String oldClassPackage = classPackage;
		classPackage = newClassPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.JAVA_CLASS__CLASS_PACKAGE, oldClassPackage, classPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.JAVA_CLASS__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THMicroservicePackage.JAVA_CLASS__CLASS_PACKAGE:
				return getClassPackage();
			case THMicroservicePackage.JAVA_CLASS__CLASS_NAME:
				return getClassName();
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
			case THMicroservicePackage.JAVA_CLASS__CLASS_PACKAGE:
				setClassPackage((String)newValue);
				return;
			case THMicroservicePackage.JAVA_CLASS__CLASS_NAME:
				setClassName((String)newValue);
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
			case THMicroservicePackage.JAVA_CLASS__CLASS_PACKAGE:
				setClassPackage(CLASS_PACKAGE_EDEFAULT);
				return;
			case THMicroservicePackage.JAVA_CLASS__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
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
			case THMicroservicePackage.JAVA_CLASS__CLASS_PACKAGE:
				return CLASS_PACKAGE_EDEFAULT == null ? classPackage != null : !CLASS_PACKAGE_EDEFAULT.equals(classPackage);
			case THMicroservicePackage.JAVA_CLASS__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
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
		result.append(" (classPackage: ");
		result.append(classPackage);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //JavaClassImpl
