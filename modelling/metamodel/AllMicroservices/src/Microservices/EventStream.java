/**
 */
package Microservices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.EventStream#getTopic <em>Topic</em>}</li>
 *   <li>{@link Microservices.EventStream#getName <em>Name</em>}</li>
 *   <li>{@link Microservices.EventStream#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getEventStream()
 * @model
 * @generated
 */
public interface EventStream extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see Microservices.MicroservicesPackage#getEventStream_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link Microservices.EventStream#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Microservices.MicroservicesPackage#getEventStream_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Microservices.EventStream#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' reference.
	 * @see #setEventType(Event)
	 * @see Microservices.MicroservicesPackage#getEventStream_EventType()
	 * @model
	 * @generated
	 */
	Event getEventType();

	/**
	 * Sets the value of the '{@link Microservices.EventStream#getEventType <em>Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(Event value);

} // EventStream
