/**
 */
package Microservices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Microservices.Function#getName <em>Name</em>}</li>
 *   <li>{@link Microservices.Function#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link Microservices.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link Microservices.Function#isBody <em>Body</em>}</li>
 * </ul>
 *
 * @see Microservices.MicroservicesPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Microservices.MicroservicesPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Microservices.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' attribute.
	 * @see #setOutputType(String)
	 * @see Microservices.MicroservicesPackage#getFunction_OutputType()
	 * @model
	 * @generated
	 */
	String getOutputType();

	/**
	 * Sets the value of the '{@link Microservices.Function#getOutputType <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' attribute.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Microservices.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Microservices.MicroservicesPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(boolean)
	 * @see Microservices.MicroservicesPackage#getFunction_Body()
	 * @model
	 * @generated
	 */
	boolean isBody();

	/**
	 * Sets the value of the '{@link Microservices.Function#isBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #isBody()
	 * @generated
	 */
	void setBody(boolean value);

} // Function
