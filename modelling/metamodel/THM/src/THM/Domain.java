/**
 */
package THM;

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
 *   <li>{@link THM.Domain#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link THM.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see THM.THMPackage#getDomain_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Domain
