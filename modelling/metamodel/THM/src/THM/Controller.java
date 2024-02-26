/**
 */
package THM;

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
 *   <li>{@link THM.Controller#getPath <em>Path</em>}</li>
 *   <li>{@link THM.Controller#getInjections <em>Injections</em>}</li>
 *   <li>{@link THM.Controller#getApis <em>Apis</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getController()
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
	 * @see THM.THMPackage#getController_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link THM.Controller#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Injections</b></em>' reference list.
	 * The list contents are of type {@link THM.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injections</em>' reference list.
	 * @see THM.THMPackage#getController_Injections()
	 * @model
	 * @generated
	 */
	EList<Repository> getInjections();

	/**
	 * Returns the value of the '<em><b>Apis</b></em>' containment reference list.
	 * The list contents are of type {@link THM.Api}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apis</em>' containment reference list.
	 * @see THM.THMPackage#getController_Apis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Api> getApis();

} // Controller
