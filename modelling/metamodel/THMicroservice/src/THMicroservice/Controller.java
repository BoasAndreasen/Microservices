/**
 */
package THMicroservice;

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
 *   <li>{@link THMicroservice.Controller#getPath <em>Path</em>}</li>
 *   <li>{@link THMicroservice.Controller#getInjections <em>Injections</em>}</li>
 *   <li>{@link THMicroservice.Controller#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getController()
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
	 * @see THMicroservice.THMicroservicePackage#getController_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link THMicroservice.Controller#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link THMicroservice.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see THMicroservice.THMicroservicePackage#getController_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Apis</b></em>' containment reference list.
	 * The list contents are of type {@link THMicroservice.Api}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apis</em>' containment reference list.
	 * @see THMicroservice.THMicroservicePackage#getController_Apis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Api> getApis();

} // Controller
