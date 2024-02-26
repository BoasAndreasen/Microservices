/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.TopNode#getEvents <em>Events</em>}</li>
 *   <li>{@link Microservices.TopNode#getEventStreams <em>Event Streams</em>}</li>
 *   <li>{@link Microservices.TopNode#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getTopNode()
 * @model
 * @generated
 */
public interface TopNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getTopNode_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Event Streams</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Streams</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getTopNode_EventStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventStream> getEventStreams();

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getTopNode_Microservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

} // TopNode
