/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.resolutionmodel.ros.impl;

import it.unibg.robotics.resolutionmodel.ros.ROSServiceConnection;
import it.unibg.robotics.resolutionmodel.ros.rosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ros.model.ros.Service;
import org.ros.model.ros.ServiceClient;
import org.ros.model.ros.ServiceServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSServiceConnectionImpl#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSServiceConnectionImpl#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.ros.impl.ROSServiceConnectionImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSServiceConnectionImpl extends ROSAbstractConnectionImpl implements ROSServiceConnection {
	/**
	 * The cached value of the '{@link #getServiceServer() <em>Service Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceServer()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer serviceServer;

	/**
	 * The cached value of the '{@link #getServiceClient() <em>Service Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClient()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient serviceClient;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosPackage.Literals.ROS_SERVICE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer getServiceServer() {
		if (serviceServer != null && serviceServer.eIsProxy()) {
			InternalEObject oldServiceServer = (InternalEObject)serviceServer;
			serviceServer = (ServiceServer)eResolveProxy(oldServiceServer);
			if (serviceServer != oldServiceServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
			}
		}
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetServiceServer() {
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceServer(ServiceServer newServiceServer) {
		ServiceServer oldServiceServer = serviceServer;
		serviceServer = newServiceServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getServiceClient() {
		if (serviceClient != null && serviceClient.eIsProxy()) {
			InternalEObject oldServiceClient = (InternalEObject)serviceClient;
			serviceClient = (ServiceClient)eResolveProxy(oldServiceClient);
			if (serviceClient != oldServiceClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
			}
		}
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetServiceClient() {
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClient(ServiceClient newServiceClient) {
		ServiceClient oldServiceClient = serviceClient;
		serviceClient = newServiceClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosPackage.ROS_SERVICE_CONNECTION__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosPackage.ROS_SERVICE_CONNECTION__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				if (resolve) return getServiceServer();
				return basicGetServiceServer();
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				if (resolve) return getServiceClient();
				return basicGetServiceClient();
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE:
				if (resolve) return getService();
				return basicGetService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)newValue);
				return;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)newValue);
				return;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE:
				setService((Service)newValue);
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
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)null);
				return;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)null);
				return;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE:
				setService((Service)null);
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
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				return serviceServer != null;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				return serviceClient != null;
			case rosPackage.ROS_SERVICE_CONNECTION__SERVICE:
				return service != null;
		}
		return super.eIsSet(featureID);
	}

} //ROSServiceConnectionImpl