/**
 */
package THM;

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
 *   <li>{@link THM.Subscriber#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link THM.Subscriber#getInjections <em>Injections</em>}</li>
 *   <li>{@link THM.Subscriber#getEventStreams <em>Event Streams</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getSubscriber()
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
	 * @see THM.THMPackage#getSubscriber_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link THM.Subscriber#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link THM.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see THM.THMPackage#getSubscriber_Injections()
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
	 * @see THM.THMPackage#getSubscriber_EventStreams()
	 * @model
	 * @generated
	 */
	EList<EventStream> getEventStreams();

} // Subscriber
