/**
 */
package THMicroservice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.Dto#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getDto()
 * @model
 * @generated
 */
public interface Dto extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link THMicroservice.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see THMicroservice.THMicroservicePackage#getDto_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Dto
