/**
 */
package THMicroservice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.Api#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link THMicroservice.Api#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see THMicroservice.THMicroservicePackage#getApi()
 * @model
 * @generated
 */
public interface Api extends Function {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' attribute.
	 * @see #setAnnotation(String)
	 * @see THMicroservice.THMicroservicePackage#getApi_Annotation()
	 * @model
	 * @generated
	 */
	String getAnnotation();

	/**
	 * Sets the value of the '{@link THMicroservice.Api#getAnnotation <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' attribute.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see THMicroservice.THMicroservicePackage#getApi_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link THMicroservice.Api#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Api
