/**
 */
package THM;

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
 *   <li>{@link THM.Event#getName <em>Name</em>}</li>
 *   <li>{@link THM.Event#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link THM.Event#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link THM.Event#getValType <em>Val Type</em>}</li>
 *   <li>{@link THM.Event#getValName <em>Val Name</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see THM.THMPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link THM.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' attribute.
	 * @see #setKeyType(String)
	 * @see THM.THMPackage#getEvent_KeyType()
	 * @model
	 * @generated
	 */
	String getKeyType();

	/**
	 * Sets the value of the '{@link THM.Event#getKeyType <em>Key Type</em>}' attribute.
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
	 * @see THM.THMPackage#getEvent_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link THM.Event#getKeyName <em>Key Name</em>}' attribute.
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
	 * @see THM.THMPackage#getEvent_ValType()
	 * @model
	 * @generated
	 */
	String getValType();

	/**
	 * Sets the value of the '{@link THM.Event#getValType <em>Val Type</em>}' attribute.
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
	 * @see THM.THMPackage#getEvent_ValName()
	 * @model
	 * @generated
	 */
	String getValName();

	/**
	 * Sets the value of the '{@link THM.Event#getValName <em>Val Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Name</em>' attribute.
	 * @see #getValName()
	 * @generated
	 */
	void setValName(String value);

} // Event
