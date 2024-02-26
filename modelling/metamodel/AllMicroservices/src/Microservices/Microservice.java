/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link Microservices.Microservice#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link Microservices.Microservice#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link Microservices.Microservice#getControllers <em>Controllers</em>}</li>
 *   <li>{@link Microservices.Microservice#getDomains <em>Domains</em>}</li>
 *   <li>{@link Microservices.Microservice#getDtos <em>Dtos</em>}</li>
 *   <li>{@link Microservices.Microservice#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Microservices.MicroservicesPackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Microservices.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Subscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Subscribers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscriber> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Publisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Domains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomains();

	/**
	 * Returns the value of the '<em><b>Dtos</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Dto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtos</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Dtos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dto> getDtos();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getMicroservice_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

} // Microservice
