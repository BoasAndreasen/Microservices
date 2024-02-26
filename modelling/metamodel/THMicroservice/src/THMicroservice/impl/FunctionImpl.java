/**
 */
package THMicroservice.impl;

import THMicroservice.Function;
import THMicroservice.THMicroservicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link THMicroservice.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link THMicroservice.impl.FunctionImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link THMicroservice.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link THMicroservice.impl.FunctionImpl#isBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputType()
	 * @generated
	 * @ordered
	 */
	protected String outputType = OUTPUT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The default value of the '{@link #isBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBody()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BODY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBody()
	 * @generated
	 * @ordered
	 */
	protected boolean body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THMicroservicePackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputType() {
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(String newOutputType) {
		String oldOutputType = outputType;
		outputType = newOutputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.FUNCTION__OUTPUT_TYPE, oldOutputType, outputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, THMicroservicePackage.FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(boolean newBody) {
		boolean oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THMicroservicePackage.FUNCTION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THMicroservicePackage.FUNCTION__NAME:
				return getName();
			case THMicroservicePackage.FUNCTION__OUTPUT_TYPE:
				return getOutputType();
			case THMicroservicePackage.FUNCTION__PARAMETERS:
				return getParameters();
			case THMicroservicePackage.FUNCTION__BODY:
				return isBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case THMicroservicePackage.FUNCTION__NAME:
				setName((String)newValue);
				return;
			case THMicroservicePackage.FUNCTION__OUTPUT_TYPE:
				setOutputType((String)newValue);
				return;
			case THMicroservicePackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case THMicroservicePackage.FUNCTION__BODY:
				setBody((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case THMicroservicePackage.FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case THMicroservicePackage.FUNCTION__OUTPUT_TYPE:
				setOutputType(OUTPUT_TYPE_EDEFAULT);
				return;
			case THMicroservicePackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case THMicroservicePackage.FUNCTION__BODY:
				setBody(BODY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case THMicroservicePackage.FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case THMicroservicePackage.FUNCTION__OUTPUT_TYPE:
				return OUTPUT_TYPE_EDEFAULT == null ? outputType != null : !OUTPUT_TYPE_EDEFAULT.equals(outputType);
			case THMicroservicePackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case THMicroservicePackage.FUNCTION__BODY:
				return body != BODY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", outputType: ");
		result.append(outputType);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
