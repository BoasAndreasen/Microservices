/**
 */
package THMicroservice;

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
 *   <li>{@link THMicroservice.EventStream#getTopic <em>Topic</em>}</li>
 *   <li>{@link THMicroservice.EventStream#getName <em>Name</em>}</li>
 *   <li>{@link THMicroservice.EventStream#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getEventStream()
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
	 * @see THMicroservice.THMicroservicePackage#getEventStream_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link THMicroservice.EventStream#getTopic <em>Topic</em>}' attribute.
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
	 * @see THMicroservice.THMicroservicePackage#getEventStream_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link THMicroservice.EventStream#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' containment reference.
	 * @see #setEventType(Event)
	 * @see THMicroservice.THMicroservicePackage#getEventStream_EventType()
	 * @model containment="true"
	 * @generated
	 */
	Event getEventType();

	/**
	 * Sets the value of the '{@link THMicroservice.EventStream#getEventType <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' containment reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(Event value);

} // EventStream
