/**
 */
package Microservices.impl;

import Microservices.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroservicesFactoryImpl extends EFactoryImpl implements MicroservicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicroservicesFactory init() {
		try {
			MicroservicesFactory theMicroservicesFactory = (MicroservicesFactory)EPackage.Registry.INSTANCE.getEFactory(MicroservicesPackage.eNS_URI);
			if (theMicroservicesFactory != null) {
				return theMicroservicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicroservicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MicroservicesPackage.TOP_NODE: return createTopNode();
			case MicroservicesPackage.EVENT: return createEvent();
			case MicroservicesPackage.EVENT_STREAM: return createEventStream();
			case MicroservicesPackage.MICROSERVICE: return createMicroservice();
			case MicroservicesPackage.JAVA_CLASS: return createJavaClass();
			case MicroservicesPackage.CONTROLLER: return createController();
			case MicroservicesPackage.DOMAIN: return createDomain();
			case MicroservicesPackage.DTO: return createDto();
			case MicroservicesPackage.PUBLISHER: return createPublisher();
			case MicroservicesPackage.SUBSCRIBER: return createSubscriber();
			case MicroservicesPackage.REPOSITORY: return createRepository();
			case MicroservicesPackage.VARIABLE: return createVariable();
			case MicroservicesPackage.FUNCTION: return createFunction();
			case MicroservicesPackage.API: return createApi();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopNode createTopNode() {
		TopNodeImpl topNode = new TopNodeImpl();
		return topNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventStream createEventStream() {
		EventStreamImpl eventStream = new EventStreamImpl();
		return eventStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass createJavaClass() {
		JavaClassImpl javaClass = new JavaClassImpl();
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dto createDto() {
		DtoImpl dto = new DtoImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber createSubscriber() {
		SubscriberImpl subscriber = new SubscriberImpl();
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api createApi() {
		ApiImpl api = new ApiImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesPackage getMicroservicesPackage() {
		return (MicroservicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicroservicesPackage getPackage() {
		return MicroservicesPackage.eINSTANCE;
	}

} //MicroservicesFactoryImpl
