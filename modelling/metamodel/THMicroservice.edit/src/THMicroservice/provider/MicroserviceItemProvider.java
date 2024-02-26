/**
 */
package THMicroservice.provider;


import THMicroservice.Microservice;
import THMicroservice.THMicroserviceFactory;
import THMicroservice.THMicroservicePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link THMicroservice.Microservice} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microservice_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microservice_name_feature", "_UI_Microservice_type"),
				 THMicroservicePackage.Literals.MICROSERVICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__SUBSCRIBERS);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__PUBLISHERS);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__CONTROLLERS);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__DOMAINS);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__DTOS);
			childrenFeatures.add(THMicroservicePackage.Literals.MICROSERVICE__REPOSITORIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Microservice.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Microservice"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Microservice)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Microservice_type") :
			getString("_UI_Microservice_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Microservice.class)) {
			case THMicroservicePackage.MICROSERVICE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case THMicroservicePackage.MICROSERVICE__SUBSCRIBERS:
			case THMicroservicePackage.MICROSERVICE__PUBLISHERS:
			case THMicroservicePackage.MICROSERVICE__CONTROLLERS:
			case THMicroservicePackage.MICROSERVICE__DOMAINS:
			case THMicroservicePackage.MICROSERVICE__DTOS:
			case THMicroservicePackage.MICROSERVICE__REPOSITORIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__SUBSCRIBERS,
				 THMicroserviceFactory.eINSTANCE.createSubscriber()));

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__PUBLISHERS,
				 THMicroserviceFactory.eINSTANCE.createPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__CONTROLLERS,
				 THMicroserviceFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__DOMAINS,
				 THMicroserviceFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__DTOS,
				 THMicroserviceFactory.eINSTANCE.createDto()));

		newChildDescriptors.add
			(createChildParameter
				(THMicroservicePackage.Literals.MICROSERVICE__REPOSITORIES,
				 THMicroserviceFactory.eINSTANCE.createRepository()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return THMicroserviceEditPlugin.INSTANCE;
	}

}
