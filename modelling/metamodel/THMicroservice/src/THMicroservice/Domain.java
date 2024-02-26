/**
 */
package THMicroservice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.Domain#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link THMicroservice.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see THMicroservice.THMicroservicePackage#getDomain_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Domain
