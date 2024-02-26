/**
 */
package THMicroservice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see THMicroservice.THMicroserviceFactory
 * @model kind="package"
 * @generated
 */
public interface THMicroservicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "THMicroservice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "THMicroservice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	THMicroservicePackage eINSTANCE = THMicroservice.impl.THMicroservicePackageImpl.init();

	/**
	 * The meta object id for the '{@link THMicroservice.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.EventImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KEY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KEY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Val Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Val Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VAL_NAME = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.EventStreamImpl <em>Event Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.EventStreamImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getEventStream()
	 * @generated
	 */
	int EVENT_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM__TOPIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM__EVENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Event Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.MicroserviceImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SUBSCRIBERS = 1;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PUBLISHERS = 2;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONTROLLERS = 3;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DOMAINS = 4;

	/**
	 * The feature id for the '<em><b>Dtos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DTOS = 5;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__REPOSITORIES = 6;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.JavaClassImpl <em>Java Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.JavaClassImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getJavaClass()
	 * @generated
	 */
	int JAVA_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__CLASS_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS__CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>Java Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.ControllerImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PATH = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Injections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__INJECTIONS = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Apis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__APIS = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.DomainImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VARIABLES = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.DtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.DtoImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getDto()
	 * @generated
	 */
	int DTO = 6;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__VARIABLES = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.PublisherImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Injections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__INJECTIONS = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__EVENT_STREAMS = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.SubscriberImpl <em>Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.SubscriberImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getSubscriber()
	 * @generated
	 */
	int SUBSCRIBER = 8;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__GROUP_ID = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Injections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__INJECTIONS = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER__EVENT_STREAMS = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBER_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.RepositoryImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Class Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CLASS_PACKAGE = JAVA_CLASS__CLASS_PACKAGE;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FUNCTIONS = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.VariableImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.FunctionImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link THMicroservice.impl.ApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see THMicroservice.impl.ApiImpl
	 * @see THMicroservice.impl.THMicroservicePackageImpl#getApi()
	 * @generated
	 */
	int API = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__OUTPUT_TYPE = FUNCTION__OUTPUT_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BODY = FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__ANNOTATION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PATH = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link THMicroservice.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see THMicroservice.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Event#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Type</em>'.
	 * @see THMicroservice.Event#getKeyType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_KeyType();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Event#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see THMicroservice.Event#getKeyName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Event#getValType <em>Val Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Type</em>'.
	 * @see THMicroservice.Event#getValType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ValType();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Event#getValName <em>Val Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val Name</em>'.
	 * @see THMicroservice.Event#getValName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ValName();

	/**
	 * Returns the meta object for class '{@link THMicroservice.EventStream <em>Event Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Stream</em>'.
	 * @see THMicroservice.EventStream
	 * @generated
	 */
	EClass getEventStream();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.EventStream#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see THMicroservice.EventStream#getTopic()
	 * @see #getEventStream()
	 * @generated
	 */
	EAttribute getEventStream_Topic();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.EventStream#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see THMicroservice.EventStream#getName()
	 * @see #getEventStream()
	 * @generated
	 */
	EAttribute getEventStream_Name();

	/**
	 * Returns the meta object for the containment reference '{@link THMicroservice.EventStream#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Type</em>'.
	 * @see THMicroservice.EventStream#getEventType()
	 * @see #getEventStream()
	 * @generated
	 */
	EReference getEventStream_EventType();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see THMicroservice.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see THMicroservice.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see THMicroservice.Microservice#getSubscribers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Subscribers();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see THMicroservice.Microservice#getPublishers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see THMicroservice.Microservice#getControllers()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Controllers();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see THMicroservice.Microservice#getDomains()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Domains();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getDtos <em>Dtos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dtos</em>'.
	 * @see THMicroservice.Microservice#getDtos()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Dtos();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Microservice#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see THMicroservice.Microservice#getRepositories()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Repositories();

	/**
	 * Returns the meta object for class '{@link THMicroservice.JavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class</em>'.
	 * @see THMicroservice.JavaClass
	 * @generated
	 */
	EClass getJavaClass();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.JavaClass#getClassPackage <em>Class Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Package</em>'.
	 * @see THMicroservice.JavaClass#getClassPackage()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_ClassPackage();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.JavaClass#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see THMicroservice.JavaClass#getClassName()
	 * @see #getJavaClass()
	 * @generated
	 */
	EAttribute getJavaClass_ClassName();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see THMicroservice.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Controller#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see THMicroservice.Controller#getPath()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Path();

	/**
	 * Returns the meta object for the reference list '{@link THMicroservice.Controller#getInjections <em>Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Injections</em>'.
	 * @see THMicroservice.Controller#getInjections()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Injections();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Controller#getApis <em>Apis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apis</em>'.
	 * @see THMicroservice.Controller#getApis()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Apis();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see THMicroservice.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Domain#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see THMicroservice.Domain#getVariables()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Variables();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto</em>'.
	 * @see THMicroservice.Dto
	 * @generated
	 */
	EClass getDto();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Dto#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see THMicroservice.Dto#getVariables()
	 * @see #getDto()
	 * @generated
	 */
	EReference getDto_Variables();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see THMicroservice.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the reference list '{@link THMicroservice.Publisher#getInjections <em>Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Injections</em>'.
	 * @see THMicroservice.Publisher#getInjections()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Injections();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Publisher#getEventStreams <em>Event Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Streams</em>'.
	 * @see THMicroservice.Publisher#getEventStreams()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_EventStreams();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Subscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscriber</em>'.
	 * @see THMicroservice.Subscriber
	 * @generated
	 */
	EClass getSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Subscriber#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see THMicroservice.Subscriber#getGroupId()
	 * @see #getSubscriber()
	 * @generated
	 */
	EAttribute getSubscriber_GroupId();

	/**
	 * Returns the meta object for the reference list '{@link THMicroservice.Subscriber#getInjections <em>Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Injections</em>'.
	 * @see THMicroservice.Subscriber#getInjections()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_Injections();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Subscriber#getEventStreams <em>Event Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Streams</em>'.
	 * @see THMicroservice.Subscriber#getEventStreams()
	 * @see #getSubscriber()
	 * @generated
	 */
	EReference getSubscriber_EventStreams();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see THMicroservice.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link THMicroservice.Repository#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see THMicroservice.Repository#getFunctions()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Functions();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see THMicroservice.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see THMicroservice.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see THMicroservice.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see THMicroservice.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see THMicroservice.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Function#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see THMicroservice.Function#getOutputType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_OutputType();

	/**
	 * Returns the meta object for the attribute list '{@link THMicroservice.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see THMicroservice.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Function#isBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see THMicroservice.Function#isBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for class '{@link THMicroservice.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see THMicroservice.Api
	 * @generated
	 */
	EClass getApi();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Api#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see THMicroservice.Api#getAnnotation()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link THMicroservice.Api#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see THMicroservice.Api#getPath()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	THMicroserviceFactory getTHMicroserviceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link THMicroservice.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.EventImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KEY_TYPE = eINSTANCE.getEvent_KeyType();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__KEY_NAME = eINSTANCE.getEvent_KeyName();

		/**
		 * The meta object literal for the '<em><b>Val Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VAL_TYPE = eINSTANCE.getEvent_ValType();

		/**
		 * The meta object literal for the '<em><b>Val Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VAL_NAME = eINSTANCE.getEvent_ValName();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.EventStreamImpl <em>Event Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.EventStreamImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getEventStream()
		 * @generated
		 */
		EClass EVENT_STREAM = eINSTANCE.getEventStream();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_STREAM__TOPIC = eINSTANCE.getEventStream_Topic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_STREAM__NAME = eINSTANCE.getEventStream_Name();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_STREAM__EVENT_TYPE = eINSTANCE.getEventStream_EventType();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.MicroserviceImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SUBSCRIBERS = eINSTANCE.getMicroservice_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PUBLISHERS = eINSTANCE.getMicroservice_Publishers();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CONTROLLERS = eINSTANCE.getMicroservice_Controllers();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DOMAINS = eINSTANCE.getMicroservice_Domains();

		/**
		 * The meta object literal for the '<em><b>Dtos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DTOS = eINSTANCE.getMicroservice_Dtos();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__REPOSITORIES = eINSTANCE.getMicroservice_Repositories();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.JavaClassImpl <em>Java Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.JavaClassImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getJavaClass()
		 * @generated
		 */
		EClass JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
		 * The meta object literal for the '<em><b>Class Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__CLASS_PACKAGE = eINSTANCE.getJavaClass_ClassPackage();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS__CLASS_NAME = eINSTANCE.getJavaClass_ClassName();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.ControllerImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__PATH = eINSTANCE.getController_Path();

		/**
		 * The meta object literal for the '<em><b>Injections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__INJECTIONS = eINSTANCE.getController_Injections();

		/**
		 * The meta object literal for the '<em><b>Apis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__APIS = eINSTANCE.getController_Apis();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.DomainImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__VARIABLES = eINSTANCE.getDomain_Variables();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.DtoImpl <em>Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.DtoImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getDto()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDto();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO__VARIABLES = eINSTANCE.getDto_Variables();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.PublisherImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Injections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__INJECTIONS = eINSTANCE.getPublisher_Injections();

		/**
		 * The meta object literal for the '<em><b>Event Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__EVENT_STREAMS = eINSTANCE.getPublisher_EventStreams();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.SubscriberImpl <em>Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.SubscriberImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getSubscriber()
		 * @generated
		 */
		EClass SUBSCRIBER = eINSTANCE.getSubscriber();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBER__GROUP_ID = eINSTANCE.getSubscriber_GroupId();

		/**
		 * The meta object literal for the '<em><b>Injections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__INJECTIONS = eINSTANCE.getSubscriber_Injections();

		/**
		 * The meta object literal for the '<em><b>Event Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBER__EVENT_STREAMS = eINSTANCE.getSubscriber_EventStreams();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.RepositoryImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__FUNCTIONS = eINSTANCE.getRepository_Functions();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.VariableImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.FunctionImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__OUTPUT_TYPE = eINSTANCE.getFunction_OutputType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link THMicroservice.impl.ApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see THMicroservice.impl.ApiImpl
		 * @see THMicroservice.impl.THMicroservicePackageImpl#getApi()
		 * @generated
		 */
		EClass API = eINSTANCE.getApi();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__ANNOTATION = eINSTANCE.getApi_Annotation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__PATH = eINSTANCE.getApi_Path();

	}

} //THMicroservicePackage
