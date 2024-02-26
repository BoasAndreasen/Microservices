/**
 */
package THMicroservice.impl;

import THMicroservice.EventStream;
import THMicroservice.Publisher;
import THMicroservice.Repository;
import THMicroservice.THMicroservicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.PublisherImpl#getInjections <em>Injections</em>}</li>
 *   <li>{@link THMicroservice.impl.PublisherImpl#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherImpl extends JavaClassImpl implements Publisher {
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
	 * The cached value of the '{@link #getEventStreams() <em>Event Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<EventStream> eventStreams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getInjections() {
		if (injections == null) {
			injections = new EObjectResolvingEList<Repository>(Repository.class, this, THMicroservicePackage.PUBLISHER__INJECTIONS);
		}
		return injections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStream> getEventStreams() {
		if (eventStreams == null) {
			eventStreams = new EObjectContainmentEList<EventStream>(EventStream.class, this, THMicroservicePackage.PUBLISHER__EVENT_STREAMS);
		}
		return eventStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case THMicroservicePackage.PUBLISHER__EVENT_STREAMS:
				return ((InternalEList<?>)getEventStreams()).basicRemove(otherEnd, msgs);
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
			case THMicroservicePackage.PUBLISHER__INJECTIONS:
				return getInjections();
			case THMicroservicePackage.PUBLISHER__EVENT_STREAMS:
				return getEventStreams();
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
			case THMicroservicePackage.PUBLISHER__INJECTIONS:
				getInjections().clear();
				getInjections().addAll((Collection<? extends Repository>)newValue);
				return;
			case THMicroservicePackage.PUBLISHER__EVENT_STREAMS:
				getEventStreams().clear();
				getEventStreams().addAll((Collection<? extends EventStream>)newValue);
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
			case THMicroservicePackage.PUBLISHER__INJECTIONS:
				getInjections().clear();
				return;
			case THMicroservicePackage.PUBLISHER__EVENT_STREAMS:
				getEventStreams().clear();
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
			case THMicroservicePackage.PUBLISHER__INJECTIONS:
				return injections != null && !injections.isEmpty();
			case THMicroservicePackage.PUBLISHER__EVENT_STREAMS:
				return eventStreams != null && !eventStreams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PublisherImpl
