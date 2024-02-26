/**
 */
package THMicroservice;

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
 *   <li>{@link THMicroservice.Publisher#getInjections <em>Injections</em>}</li>
 *   <li>{@link THMicroservice.Publisher#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link THMicroservice.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see THMicroservice.THMicroservicePackage#getPublisher_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Event Streams</b></em>' containment reference list.
	 * The list contents are of type {@link THMicroservice.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Streams</em>' containment reference list.
	 * @see THMicroservice.THMicroservicePackage#getPublisher_EventStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventStream> getEventStreams();

} // Publisher
