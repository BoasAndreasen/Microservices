/**
 */
package Microservices.impl;

import Microservices.Event;
import Microservices.EventStream;
import Microservices.Microservice;
import Microservices.MicroservicesPackage;
import Microservices.TopNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Microservices.impl.TopNodeImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link Microservices.impl.TopNodeImpl#getEventStreams <em>Event Streams</em>}</li>
 *   <li>{@link Microservices.impl.TopNodeImpl#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopNodeImpl extends MinimalEObjectImpl.Container implements TopNode {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

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
	 * The cached value of the '{@link #getMicroservices() <em>Microservices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> microservices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.TOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, MicroservicesPackage.TOP_NODE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventStream> getEventStreams() {
		if (eventStreams == null) {
			eventStreams = new EObjectContainmentEList<EventStream>(EventStream.class, this, MicroservicesPackage.TOP_NODE__EVENT_STREAMS);
		}
		return eventStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getMicroservices() {
		if (microservices == null) {
			microservices = new EObjectContainmentEList<Microservice>(Microservice.class, this, MicroservicesPackage.TOP_NODE__MICROSERVICES);
		}
		return microservices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesPackage.TOP_NODE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case MicroservicesPackage.TOP_NODE__EVENT_STREAMS:
				return ((InternalEList<?>)getEventStreams()).basicRemove(otherEnd, msgs);
			case MicroservicesPackage.TOP_NODE__MICROSERVICES:
				return ((InternalEList<?>)getMicroservices()).basicRemove(otherEnd, msgs);
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
			case MicroservicesPackage.TOP_NODE__EVENTS:
				return getEvents();
			case MicroservicesPackage.TOP_NODE__EVENT_STREAMS:
				return getEventStreams();
			case MicroservicesPackage.TOP_NODE__MICROSERVICES:
				return getMicroservices();
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
			case MicroservicesPackage.TOP_NODE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case MicroservicesPackage.TOP_NODE__EVENT_STREAMS:
				getEventStreams().clear();
				getEventStreams().addAll((Collection<? extends EventStream>)newValue);
				return;
			case MicroservicesPackage.TOP_NODE__MICROSERVICES:
				getMicroservices().clear();
				getMicroservices().addAll((Collection<? extends Microservice>)newValue);
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
			case MicroservicesPackage.TOP_NODE__EVENTS:
				getEvents().clear();
				return;
			case MicroservicesPackage.TOP_NODE__EVENT_STREAMS:
				getEventStreams().clear();
				return;
			case MicroservicesPackage.TOP_NODE__MICROSERVICES:
				getMicroservices().clear();
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
			case MicroservicesPackage.TOP_NODE__EVENTS:
				return events != null && !events.isEmpty();
			case MicroservicesPackage.TOP_NODE__EVENT_STREAMS:
				return eventStreams != null && !eventStreams.isEmpty();
			case MicroservicesPackage.TOP_NODE__MICROSERVICES:
				return microservices != null && !microservices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopNodeImpl
