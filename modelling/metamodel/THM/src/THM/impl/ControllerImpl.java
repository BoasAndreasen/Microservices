/**
 */
package THM.impl;

import THM.Api;
import THM.Controller;
import THM.Repository;
import THM.THMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THM.impl.ControllerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link THM.impl.ControllerImpl#getInjections <em>Injections</em>}</li>
 *   <li>{@link THM.impl.ControllerImpl#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends JavaClassImpl implements Controller {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInjections() <em>Injections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjections()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> injections;

	/**
	 * The cached value of the '{@link #getApis() <em>Apis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApis()
	 * @generated
	 * @ordered
	 */
	protected EList<Api> apis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMPackage.CONTROLLER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getInjections() {
		if (injections == null) {
			injections = new EObjectResolvingEList<Repository>(Repository.class, this, THMPackage.CONTROLLER__INJECTIONS);
		}
		return injections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Api> getApis() {
		if (apis == null) {
			apis = new EObjectContainmentEList<Api>(Api.class, this, THMPackage.CONTROLLER__APIS);
		}
		return apis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case THMPackage.CONTROLLER__APIS:
				return ((InternalEList<?>)getApis()).basicRemove(otherEnd, msgs);
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
			case THMPackage.CONTROLLER__PATH:
				return getPath();
			case THMPackage.CONTROLLER__INJECTIONS:
				return getInjections();
			case THMPackage.CONTROLLER__APIS:
				return getApis();
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
			case THMPackage.CONTROLLER__PATH:
				setPath((String)newValue);
				return;
			case THMPackage.CONTROLLER__INJECTIONS:
				getInjections().clear();
				getInjections().addAll((Collection<? extends Repository>)newValue);
				return;
			case THMPackage.CONTROLLER__APIS:
				getApis().clear();
				getApis().addAll((Collection<? extends Api>)newValue);
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
			case THMPackage.CONTROLLER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case THMPackage.CONTROLLER__INJECTIONS:
				getInjections().clear();
				return;
			case THMPackage.CONTROLLER__APIS:
				getApis().clear();
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
			case THMPackage.CONTROLLER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case THMPackage.CONTROLLER__INJECTIONS:
				return injections != null && !injections.isEmpty();
			case THMPackage.CONTROLLER__APIS:
				return apis != null && !apis.isEmpty();
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
