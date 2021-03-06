/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * In collaboration with by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.resolutionmodels.rttresolutionmodels.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.ResolutionModel;
import org.hyperflex.resolutionmodels.resolutionmodelsPackage;

import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsFactory;

import org.hyperflex.resolutionmodels.rttresolutionmodels.util.rttresolutionmodelsAdapterFactory;

import org.hyperflex.resolutionmodels.util.resolutionmodelsSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class rttresolutionmodelsItemProviderAdapterFactory extends rttresolutionmodelsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTransfImplementationItemProvider orocosTransfImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosTransfImplementationAdapter() {
		if (orocosTransfImplementationItemProvider == null) {
			orocosTransfImplementationItemProvider = new OrocosTransfImplementationItemProvider(this);
		}

		return orocosTransfImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTransfPropertyItemProvider orocosTransfPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosTransfPropertyAdapter() {
		if (orocosTransfPropertyItemProvider == null) {
			orocosTransfPropertyItemProvider = new OrocosTransfPropertyItemProvider(this);
		}

		return orocosTransfPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTransfConnectionItemProvider orocosTransfConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTransfConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosTransfConnectionAdapter() {
		if (orocosTransfConnectionItemProvider == null) {
			orocosTransfConnectionItemProvider = new OrocosTransfConnectionItemProvider(this);
		}

		return orocosTransfConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosConnectionPolicyItemProvider orocosConnectionPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosConnectionPolicyAdapter() {
		if (orocosConnectionPolicyItemProvider == null) {
			orocosConnectionPolicyItemProvider = new OrocosConnectionPolicyItemProvider(this);
		}

		return orocosConnectionPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosPeersConnectionItemProvider orocosPeersConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosPeersConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosPeersConnectionAdapter() {
		if (orocosPeersConnectionItemProvider == null) {
			orocosPeersConnectionItemProvider = new OrocosPeersConnectionItemProvider(this);
		}

		return orocosPeersConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosRequiredElementsItemProvider orocosRequiredElementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosRequiredElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosRequiredElementsAdapter() {
		if (orocosRequiredElementsItemProvider == null) {
			orocosRequiredElementsItemProvider = new OrocosRequiredElementsItemProvider(this);
		}

		return orocosRequiredElementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrocosTemplateSystemModelItemProvider orocosTemplateSystemModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.resolutionmodels.rttresolutionmodels.OrocosTemplateSystemModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrocosTemplateSystemModelAdapter() {
		if (orocosTemplateSystemModelItemProvider == null) {
			orocosTemplateSystemModelItemProvider = new OrocosTemplateSystemModelItemProvider(this);
		}

		return orocosTemplateSystemModelItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (orocosTransfImplementationItemProvider != null) orocosTransfImplementationItemProvider.dispose();
		if (orocosTransfPropertyItemProvider != null) orocosTransfPropertyItemProvider.dispose();
		if (orocosTransfConnectionItemProvider != null) orocosTransfConnectionItemProvider.dispose();
		if (orocosConnectionPolicyItemProvider != null) orocosConnectionPolicyItemProvider.dispose();
		if (orocosPeersConnectionItemProvider != null) orocosPeersConnectionItemProvider.dispose();
		if (orocosRequiredElementsItemProvider != null) orocosRequiredElementsItemProvider.dispose();
		if (orocosTemplateSystemModelItemProvider != null) orocosTemplateSystemModelItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link resolutionmodelsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class resolutionmodelsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends resolutionmodelsSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseResolutionModel(ResolutionModel object) {
				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelsPackage.Literals.RESOLUTION_MODEL__TEMPLATE_SYSTEM_MODEL,
						 rttresolutionmodelsFactory.eINSTANCE.createOrocosTemplateSystemModel()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseRMResolutionElement(RMResolutionElement object) {
				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelsPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rttresolutionmodelsFactory.eINSTANCE.createOrocosTransfImplementation()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelsPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rttresolutionmodelsFactory.eINSTANCE.createOrocosTransfProperty()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelsPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rttresolutionmodelsFactory.eINSTANCE.createOrocosTransfConnection()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelsPackage.Literals.RM_RESOLUTION_ELEMENT__REQUIRED_ELEMENTS,
						 rttresolutionmodelsFactory.eINSTANCE.createOrocosRequiredElements()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return RttResolutionModelEditPlugin.INSTANCE;
		}
	}

}
