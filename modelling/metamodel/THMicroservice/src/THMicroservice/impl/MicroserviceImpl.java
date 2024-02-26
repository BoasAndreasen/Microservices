/**
 */
package THMicroservice.impl;

import THMicroservice.Controller;
import THMicroservice.Domain;
import THMicroservice.Dto;
import THMicroservice.Microservice;
import THMicroservice.Publisher;
import THMicroservice.Repository;
import THMicroservice.Subscriber;
import THMicroservice.THMicroservicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getDtos <em>Dtos</em>}</li>
 *   <li>{@link THMicroservice.impl.MicroserviceImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<Subscriber> subscribers;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> publishers;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * The cached value of the '{@link #getDtos() <em>Dtos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtos()
	 * @generated
	 * @ordered
	 */
	protected EList<Dto> dtos;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<Subscriber>(Subscriber.class, this, THMicroservicePackage.MICROSERVICE__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<Publisher>(Publisher.class, this, THMicroservicePackage.MICROSERVICE__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<Controller>(Controller.class, this, THMicroservicePackage.MICROSERVICE__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentEList<Domain>(Domain.class, this, THMicroservicePackage.MICROSERVICE__DOMAINS);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dto> getDtos() {
		if (dtos == null) {
			dtos = new EObjectContainmentEList<Dto>(Dto.class, this, THMicroservicePackage.MICROSERVICE__DTOS);
		}
		return dtos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, THMicroservicePackage.MICROSERVICE__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case THMicroservicePackage.MICROSERVICE__DTOS:
				return ((InternalEList<?>)getDtos()).basicRemove(otherEnd, msgs);
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
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
			case THMicroservicePackage.MICROSERVICE__NAME:
				return getName();
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
				return getSubscribers();
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
				return getPublishers();
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
				return getControllers();
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
				return getDomains();
			case THMicroservicePackage.MICROSERVICE__DTOS:
				return getDtos();
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				return getRepositories();
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
			case THMicroservicePackage.MICROSERVICE__NAME:
				setName((String)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends Subscriber>)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends Publisher>)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends Controller>)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__DTOS:
				getDtos().clear();
				getDtos().addAll((Collection<? extends Dto>)newValue);
				return;
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
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
			case THMicroservicePackage.MICROSERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
				getPublishers().clear();
				return;
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
				getControllers().clear();
				return;
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
				getDomains().clear();
				return;
			case THMicroservicePackage.MICROSERVICE__DTOS:
				getDtos().clear();
				return;
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				getRepositories().clear();
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
			case THMicroservicePackage.MICROSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
				return domains != null && !domains.isEmpty();
			case THMicroservicePackage.MICROSERVICE__DTOS:
				return dtos != null && !dtos.isEmpty();
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
