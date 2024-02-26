/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Repository#getCrudRepository <em>Crud Repository</em>}</li>
 *   <li>{@link Microservices.Repository#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Crud Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Repository</em>' containment reference.
	 * @see #setCrudRepository(Variable)
	 * @see Microservices.MicroservicesPackage#getRepository_CrudRepository()
	 * @model containment="true"
	 * @generated
	 */
	Variable getCrudRepository();

	/**
	 * Sets the value of the '{@link Microservices.Repository#getCrudRepository <em>Crud Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Repository</em>' containment reference.
	 * @see #getCrudRepository()
	 * @generated
	 */
	void setCrudRepository(Variable value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getRepository_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Repository
