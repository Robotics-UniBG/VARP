/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * Institute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, University of Bergamo
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
package org.hyperflex.rapyutacomponentmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.hyperflex.rapyutacomponentmodel.util.rapyutacomponentmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class rapyutacomponentmodelItemProviderAdapterFactory extends rapyutacomponentmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public rapyutacomponentmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.Composite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeItemProvider compositeItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeAdapter() {
		if (compositeItemProvider == null) {
			compositeItemProvider = new CompositeItemProvider(this);
		}

		return compositeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.MsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MsgInterfaceItemProvider msgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.MsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMsgInterfaceAdapter() {
		if (msgInterfaceItemProvider == null) {
			msgInterfaceItemProvider = new MsgInterfaceItemProvider(this);
		}

		return msgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMsgInterfaceItemProvider compositeMsgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeMsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeMsgInterfaceAdapter() {
		if (compositeMsgInterfaceItemProvider == null) {
			compositeMsgInterfaceItemProvider = new CompositeMsgInterfaceItemProvider(this);
		}

		return compositeMsgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodeMsgInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeMsgInterfaceItemProvider nodeMsgInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodeMsgInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeMsgInterfaceAdapter() {
		if (nodeMsgInterfaceItemProvider == null) {
			nodeMsgInterfaceItemProvider = new NodeMsgInterfaceItemProvider(this);
		}

		return nodeMsgInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodePublisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodePublisherItemProvider nodePublisherItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodePublisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodePublisherAdapter() {
		if (nodePublisherItemProvider == null) {
			nodePublisherItemProvider = new NodePublisherItemProvider(this);
		}

		return nodePublisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodeSubscriber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSubscriberItemProvider nodeSubscriberItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodeSubscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSubscriberAdapter() {
		if (nodeSubscriberItemProvider == null) {
			nodeSubscriberItemProvider = new NodeSubscriberItemProvider(this);
		}

		return nodeSubscriberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositePublisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePublisherItemProvider compositePublisherItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositePublisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositePublisherAdapter() {
		if (compositePublisherItemProvider == null) {
			compositePublisherItemProvider = new CompositePublisherItemProvider(this);
		}

		return compositePublisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeSubscriber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSubscriberItemProvider compositeSubscriberItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeSubscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSubscriberAdapter() {
		if (compositeSubscriberItemProvider == null) {
			compositeSubscriberItemProvider = new CompositeSubscriberItemProvider(this);
		}

		return compositeSubscriberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.Topic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicItemProvider topicItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopicAdapter() {
		if (topicItemProvider == null) {
			topicItemProvider = new TopicItemProvider(this);
		}

		return topicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeParameterItemProvider nodeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeParameterAdapter() {
		if (nodeParameterItemProvider == null) {
			nodeParameterItemProvider = new NodeParameterItemProvider(this);
		}

		return nodeParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeParameterItemProvider compositeParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeParameterAdapter() {
		if (compositeParameterItemProvider == null) {
			compositeParameterItemProvider = new CompositeParameterItemProvider(this);
		}

		return compositeParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.SrvServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvServerItemProvider srvServerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.SrvServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSrvServerAdapter() {
		if (srvServerItemProvider == null) {
			srvServerItemProvider = new SrvServerItemProvider(this);
		}

		return srvServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.SrvClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvClientItemProvider srvClientItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.SrvClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSrvClientAdapter() {
		if (srvClientItemProvider == null) {
			srvClientItemProvider = new SrvClientItemProvider(this);
		}

		return srvClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvServerItemProvider compositeSrvServerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSrvServerAdapter() {
		if (compositeSrvServerItemProvider == null) {
			compositeSrvServerItemProvider = new CompositeSrvServerItemProvider(this);
		}

		return compositeSrvServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodeSrvServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSrvServerItemProvider nodeSrvServerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodeSrvServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSrvServerAdapter() {
		if (nodeSrvServerItemProvider == null) {
			nodeSrvServerItemProvider = new NodeSrvServerItemProvider(this);
		}

		return nodeSrvServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvClientItemProvider compositeSrvClientItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSrvClientAdapter() {
		if (compositeSrvClientItemProvider == null) {
			compositeSrvClientItemProvider = new CompositeSrvClientItemProvider(this);
		}

		return compositeSrvClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.NodeSrvClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSrvClientItemProvider nodeSrvClientItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.NodeSrvClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeSrvClientAdapter() {
		if (nodeSrvClientItemProvider == null) {
			nodeSrvClientItemProvider = new NodeSrvClientItemProvider(this);
		}

		return nodeSrvClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.SrvConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvConnectionItemProvider srvConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.SrvConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSrvConnectionAdapter() {
		if (srvConnectionItemProvider == null) {
			srvConnectionItemProvider = new SrvConnectionItemProvider(this);
		}

		return srvConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotEndPointItemProvider robotEndPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.RobotEndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRobotEndPointAdapter() {
		if (robotEndPointItemProvider == null) {
			robotEndPointItemProvider = new RobotEndPointItemProvider(this);
		}

		return robotEndPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentEndPointItemProvider environmentEndPointItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EnvironmentEndPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentEndPointAdapter() {
		if (environmentEndPointItemProvider == null) {
			environmentEndPointItemProvider = new EnvironmentEndPointItemProvider(this);
		}

		return environmentEndPointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointPublisher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointPublisherItemProvider endPointPublisherItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointPublisher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointPublisherAdapter() {
		if (endPointPublisherItemProvider == null) {
			endPointPublisherItemProvider = new EndPointPublisherItemProvider(this);
		}

		return endPointPublisherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointSubscriber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointSubscriberItemProvider endPointSubscriberItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointSubscriber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointSubscriberAdapter() {
		if (endPointSubscriberItemProvider == null) {
			endPointSubscriberItemProvider = new EndPointSubscriberItemProvider(this);
		}

		return endPointSubscriberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointMsgConnectionItemProvider endPointMsgConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointMsgConnectionAdapter() {
		if (endPointMsgConnectionItemProvider == null) {
			endPointMsgConnectionItemProvider = new EndPointMsgConnectionItemProvider(this);
		}

		return endPointMsgConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvServer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointSrvServerItemProvider endPointSrvServerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvServer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointSrvServerAdapter() {
		if (endPointSrvServerItemProvider == null) {
			endPointSrvServerItemProvider = new EndPointSrvServerItemProvider(this);
		}

		return endPointSrvServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointSrvClientItemProvider endPointSrvClientItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointSrvClientAdapter() {
		if (endPointSrvClientItemProvider == null) {
			endPointSrvClientItemProvider = new EndPointSrvClientItemProvider(this);
		}

		return endPointSrvClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointSrvConnectionItemProvider endPointSrvConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointSrvConnectionAdapter() {
		if (endPointSrvConnectionItemProvider == null) {
			endPointSrvConnectionItemProvider = new EndPointSrvConnectionItemProvider(this);
		}

		return endPointSrvConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.EndPointParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointParameterItemProvider endPointParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.EndPointParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndPointParameterAdapter() {
		if (endPointParameterItemProvider == null) {
			endPointParameterItemProvider = new EndPointParameterItemProvider(this);
		}

		return endPointParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerSrvConnectionItemProvider containerSrvConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.ContainerSrvConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerSrvConnectionAdapter() {
		if (containerSrvConnectionItemProvider == null) {
			containerSrvConnectionItemProvider = new ContainerSrvConnectionItemProvider(this);
		}

		return containerSrvConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSrvConnectionItemProvider compositeSrvConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.rapyutacomponentmodel.CompositeSrvConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeSrvConnectionAdapter() {
		if (compositeSrvConnectionItemProvider == null) {
			compositeSrvConnectionItemProvider = new CompositeSrvConnectionItemProvider(this);
		}

		return compositeSrvConnectionItemProvider;
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
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (compositeItemProvider != null) compositeItemProvider.dispose();
		if (msgInterfaceItemProvider != null) msgInterfaceItemProvider.dispose();
		if (compositeMsgInterfaceItemProvider != null) compositeMsgInterfaceItemProvider.dispose();
		if (nodeMsgInterfaceItemProvider != null) nodeMsgInterfaceItemProvider.dispose();
		if (nodePublisherItemProvider != null) nodePublisherItemProvider.dispose();
		if (nodeSubscriberItemProvider != null) nodeSubscriberItemProvider.dispose();
		if (compositePublisherItemProvider != null) compositePublisherItemProvider.dispose();
		if (compositeSubscriberItemProvider != null) compositeSubscriberItemProvider.dispose();
		if (topicItemProvider != null) topicItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (nodeParameterItemProvider != null) nodeParameterItemProvider.dispose();
		if (compositeParameterItemProvider != null) compositeParameterItemProvider.dispose();
		if (srvServerItemProvider != null) srvServerItemProvider.dispose();
		if (srvClientItemProvider != null) srvClientItemProvider.dispose();
		if (compositeSrvServerItemProvider != null) compositeSrvServerItemProvider.dispose();
		if (nodeSrvServerItemProvider != null) nodeSrvServerItemProvider.dispose();
		if (compositeSrvClientItemProvider != null) compositeSrvClientItemProvider.dispose();
		if (nodeSrvClientItemProvider != null) nodeSrvClientItemProvider.dispose();
		if (srvConnectionItemProvider != null) srvConnectionItemProvider.dispose();
		if (robotEndPointItemProvider != null) robotEndPointItemProvider.dispose();
		if (environmentEndPointItemProvider != null) environmentEndPointItemProvider.dispose();
		if (endPointPublisherItemProvider != null) endPointPublisherItemProvider.dispose();
		if (endPointSubscriberItemProvider != null) endPointSubscriberItemProvider.dispose();
		if (endPointMsgConnectionItemProvider != null) endPointMsgConnectionItemProvider.dispose();
		if (endPointSrvServerItemProvider != null) endPointSrvServerItemProvider.dispose();
		if (endPointSrvClientItemProvider != null) endPointSrvClientItemProvider.dispose();
		if (endPointSrvConnectionItemProvider != null) endPointSrvConnectionItemProvider.dispose();
		if (endPointParameterItemProvider != null) endPointParameterItemProvider.dispose();
		if (containerSrvConnectionItemProvider != null) containerSrvConnectionItemProvider.dispose();
		if (compositeSrvConnectionItemProvider != null) compositeSrvConnectionItemProvider.dispose();
	}

}
