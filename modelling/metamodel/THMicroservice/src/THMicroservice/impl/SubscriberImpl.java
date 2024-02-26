/**
 */
package THMicroservice.impl;

import THMicroservice.EventStream;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.SubscriberImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link THMicroservice.impl.SubscriberImpl#getInjections <em>Injections</em>}</li>
 *   <li>{@link THMicroservice.impl.SubscriberImpl#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriberImpl extends JavaClassImpl implements Subscriber {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

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
	protected SubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.SUBSCRIBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.SUBSCRIBER__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getInjections() {
		if (injections == null) {
			injections = new EObjectResolvingEList<Repository>(Repository.class, this, THMicroservicePackage.SUBSCRIBER__INJECTIONS);
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
			eventStreams = new EObjectContainmentEList<EventStream>(EventStream.class, this, THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS);
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
			case THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS:
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
			case THMicroservicePackage.SUBSCRIBER__GROUP_ID:
				return getGroupId();
			case THMicroservicePackage.SUBSCRIBER__INJECTIONS:
				return getInjections();
			case THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS:
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
			case THMicroservicePackage.SUBSCRIBER__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case THMicroservicePackage.SUBSCRIBER__INJECTIONS:
				getInjections().clear();
				getInjections().addAll((Collection<? extends Repository>)newValue);
				return;
			case THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS:
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
			case THMicroservicePackage.SUBSCRIBER__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case THMicroservicePackage.SUBSCRIBER__INJECTIONS:
				getInjections().clear();
				return;
			case THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS:
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
			case THMicroservicePackage.SUBSCRIBER__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case THMicroservicePackage.SUBSCRIBER__INJECTIONS:
				return injections != null && !injections.isEmpty();
			case THMicroservicePackage.SUBSCRIBER__EVENT_STREAMS:
				return eventStreams != null && !eventStreams.isEmpty();
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(')');
		return result.toString();
	}

} //SubscriberImpl
