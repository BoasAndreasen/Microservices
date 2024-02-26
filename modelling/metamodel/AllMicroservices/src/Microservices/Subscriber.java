/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Subscriber#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link Microservices.Subscriber#getInjections <em>Injections</em>}</li>
 *   <li>{@link Microservices.Subscriber#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getSubscriber()
 * @model
 * @generated
 */
public interface Subscriber extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see Microservices.MicroservicesPackage#getSubscriber_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link Microservices.Subscriber#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link Microservices.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see Microservices.MicroservicesPackage#getSubscriber_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Event Streams</b></em>' reference list.
	 * The list contents are of type {@link Microservices.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Streams</em>' reference list.
	 * @see Microservices.MicroservicesPackage#getSubscriber_EventStreams()
	 * @model
	 * @generated
	 */
	EList<EventStream> getEventStreams();

} // Subscriber
