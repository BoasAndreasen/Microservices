/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Controller#getPath <em>Path</em>}</li>
 *   <li>{@link Microservices.Controller#getInjections <em>Injections</em>}</li>
 *   <li>{@link Microservices.Controller#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see Microservices.MicroservicesPackage#getController_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link Microservices.Controller#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link Microservices.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see Microservices.MicroservicesPackage#getController_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Apis</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Api}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apis</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getController_Apis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Api> getApis();

} // Controller
