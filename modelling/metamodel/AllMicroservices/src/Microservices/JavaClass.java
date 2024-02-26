/**
 */
package Microservices;

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
 *   <li>{@link Microservices.JavaClass#getClassPackage <em>Class Package</em>}</li>
 *   <li>{@link Microservices.JavaClass#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getJavaClass()
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
	 * @see Microservices.MicroservicesPackage#getJavaClass_ClassPackage()
	 * @model
	 * @generated
	 */
	String getClassPackage();

	/**
	 * Sets the value of the '{@link Microservices.JavaClass#getClassPackage <em>Class Package</em>}' attribute.
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
	 * @see Microservices.MicroservicesPackage#getJavaClass_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link Microservices.JavaClass#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // JavaClass
