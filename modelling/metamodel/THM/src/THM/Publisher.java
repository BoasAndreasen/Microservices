/**
 */
package THM;

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
 *   <li>{@link THM.Publisher#getInjections <em>Injections</em>}</li>
 *   <li>{@link THM.Publisher#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link THM.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see THM.THMPackage#getPublisher_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Event Streams</b></em>' reference list.
	 * The list contents are of type {@link THM.EventStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Streams</em>' reference list.
	 * @see THM.THMPackage#getPublisher_EventStreams()
	 * @model
	 * @generated
	 */
	EList<EventStream> getEventStreams();

} // Publisher
