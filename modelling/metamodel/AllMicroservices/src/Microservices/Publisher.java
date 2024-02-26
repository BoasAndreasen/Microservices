/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Publisher#getInjections <em>Injections</em>}</li>
 *   <li>{@link Microservices.Publisher#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link Microservices.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see Microservices.MicroservicesPackage#getPublisher_Injections()
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
	 * @see Microservices.MicroservicesPackage#getPublisher_EventStreams()
	 * @model
	 * @generated
	 */
	EList<EventStream> getEventStreams();

} // Publisher
