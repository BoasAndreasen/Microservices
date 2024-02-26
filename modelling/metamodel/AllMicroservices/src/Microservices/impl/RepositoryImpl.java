/**
 */
package Microservices.impl;

import Microservices.Function;
import Microservices.MicroservicesPackage;
import Microservices.Repository;
import Microservices.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Microservices.impl.RepositoryImpl#getCrudRepository <em>Crud Repository</em>}</li>
 *   <li>{@link Microservices.impl.RepositoryImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends JavaClassImpl implements Repository {
	/**
	 * The cached value of the '{@link #getCrudRepository() <em>Crud Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrudRepository()
	 * @generated
	 * @ordered
	 */
	protected Variable crudRepository;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getCrudRepository() {
		return crudRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrudRepository(Variable newCrudRepository, NotificationChain msgs) {
		Variable oldCrudRepository = crudRepository;
		crudRepository = newCrudRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY, oldCrudRepository, newCrudRepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrudRepository(Variable newCrudRepository) {
		if (newCrudRepository != crudRepository) {
			NotificationChain msgs = null;
			if (crudRepository != null)
				msgs = ((InternalEObject)crudRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY, null, msgs);
			if (newCrudRepository != null)
				msgs = ((InternalEObject)newCrudRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY, null, msgs);
			msgs = basicSetCrudRepository(newCrudRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY, newCrudRepository, newCrudRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, MicroservicesPackage.REPOSITORY__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY:
				return basicSetCrudRepository(null, msgs);
			case MicroservicesPackage.REPOSITORY__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
			case MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY:
				return getCrudRepository();
			case MicroservicesPackage.REPOSITORY__FUNCTIONS:
				return getFunctions();
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
			case MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY:
				setCrudRepository((Variable)newValue);
				return;
			case MicroservicesPackage.REPOSITORY__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
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
			case MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY:
				setCrudRepository((Variable)null);
				return;
			case MicroservicesPackage.REPOSITORY__FUNCTIONS:
				getFunctions().clear();
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
			case MicroservicesPackage.REPOSITORY__CRUD_REPOSITORY:
				return crudRepository != null;
			case MicroservicesPackage.REPOSITORY__FUNCTIONS:
				return functions != null && !functions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
