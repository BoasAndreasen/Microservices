/**
 */
package THM;

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
 *   <li>{@link THM.Repository#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see THM.THMPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link THM.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see THM.THMPackage#getRepository_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Repository
