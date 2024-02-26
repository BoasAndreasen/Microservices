/**
 */
package THMicroservice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.Event#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link THMicroservice.Event#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link THMicroservice.Event#getValType <em>Val Type</em>}</li>
 *   <li>{@link THMicroservice.Event#getValName <em>Val Name</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' attribute.
	 * @see #setKeyType(String)
	 * @see THMicroservice.THMicroservicePackage#getEvent_KeyType()
	 * @model
	 * @generated
	 */
	String getKeyType();

	/**
	 * Sets the value of the '{@link THMicroservice.Event#getKeyType <em>Key Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' attribute.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(String value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see THMicroservice.THMicroservicePackage#getEvent_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link THMicroservice.Event#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Val Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Type</em>' attribute.
	 * @see #setValType(String)
	 * @see THMicroservice.THMicroservicePackage#getEvent_ValType()
	 * @model
	 * @generated
	 */
	String getValType();

	/**
	 * Sets the value of the '{@link THMicroservice.Event#getValType <em>Val Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Type</em>' attribute.
	 * @see #getValType()
	 * @generated
	 */
	void setValType(String value);

	/**
	 * Returns the value of the '<em><b>Val Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Name</em>' attribute.
	 * @see #setValName(String)
	 * @see THMicroservice.THMicroservicePackage#getEvent_ValName()
	 * @model
	 * @generated
	 */
	String getValName();

	/**
	 * Sets the value of the '{@link THMicroservice.Event#getValName <em>Val Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Name</em>' attribute.
	 * @see #getValName()
	 * @generated
	 */
	void setValName(String value);

} // Event
