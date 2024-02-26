/**
 */
package THMicroservice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.JavaClass#getClassPackage <em>Class Package</em>}</li>
 *   <li>{@link THMicroservice.JavaClass#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Package</em>' attribute.
	 * @see #setClassPackage(String)
	 * @see THMicroservice.THMicroservicePackage#getJavaClass_ClassPackage()
	 * @model
	 * @generated
	 */
	String getClassPackage();

	/**
	 * Sets the value of the '{@link THMicroservice.JavaClass#getClassPackage <em>Class Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Package</em>' attribute.
	 * @see #getClassPackage()
	 * @generated
	 */
	void setClassPackage(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see THMicroservice.THMicroservicePackage#getJavaClass_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link THMicroservice.JavaClass#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // JavaClass
