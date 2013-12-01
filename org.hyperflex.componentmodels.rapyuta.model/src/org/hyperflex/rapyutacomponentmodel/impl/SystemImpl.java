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
package org.hyperflex.rapyutacomponentmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hyperflex.rapyutacomponentmodel.Composite;
import org.hyperflex.rapyutacomponentmodel.Container;
import org.hyperflex.rapyutacomponentmodel.EndPointMsgConnection;
import org.hyperflex.rapyutacomponentmodel.EndPointSrvConnection;
import org.hyperflex.rapyutacomponentmodel.rapyutacomponentmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getEndPointSrvConnections <em>End Point Srv Connections</em>}</li>
 *   <li>{@link org.hyperflex.rapyutacomponentmodel.impl.SystemImpl#getEndPointMsgConnections <em>End Point Msg Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends EObjectImpl implements org.hyperflex.rapyutacomponentmodel.System {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> containers;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> composites;

	/**
	 * The cached value of the '{@link #getEndPointSrvConnections() <em>End Point Srv Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointSrvConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointSrvConnection> endPointSrvConnections;

	/**
	 * The cached value of the '{@link #getEndPointMsgConnections() <em>End Point Msg Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointMsgConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<EndPointMsgConnection> endPointMsgConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rapyutacomponentmodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<Container>(Container.class, this, rapyutacomponentmodelPackage.SYSTEM__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<Composite>(Composite.class, this, rapyutacomponentmodelPackage.SYSTEM__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointSrvConnection> getEndPointSrvConnections() {
		if (endPointSrvConnections == null) {
			endPointSrvConnections = new EObjectContainmentEList<EndPointSrvConnection>(EndPointSrvConnection.class, this, rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS);
		}
		return endPointSrvConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndPointMsgConnection> getEndPointMsgConnections() {
		if (endPointMsgConnections == null) {
			endPointMsgConnections = new EObjectContainmentEList<EndPointMsgConnection>(EndPointMsgConnection.class, this, rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS);
		}
		return endPointMsgConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.SYSTEM__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return ((InternalEList<?>)getEndPointSrvConnections()).basicRemove(otherEnd, msgs);
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return ((InternalEList<?>)getEndPointMsgConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rapyutacomponentmodelPackage.SYSTEM__CONTAINERS:
				return getContainers();
			case rapyutacomponentmodelPackage.SYSTEM__COMPOSITES:
				return getComposites();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return getEndPointSrvConnections();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return getEndPointMsgConnections();
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
			case rapyutacomponentmodelPackage.SYSTEM__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends Container>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends Composite>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				getEndPointSrvConnections().clear();
				getEndPointSrvConnections().addAll((Collection<? extends EndPointSrvConnection>)newValue);
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				getEndPointMsgConnections().clear();
				getEndPointMsgConnections().addAll((Collection<? extends EndPointMsgConnection>)newValue);
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
			case rapyutacomponentmodelPackage.SYSTEM__CONTAINERS:
				getContainers().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__COMPOSITES:
				getComposites().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				getEndPointSrvConnections().clear();
				return;
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				getEndPointMsgConnections().clear();
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
			case rapyutacomponentmodelPackage.SYSTEM__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_SRV_CONNECTIONS:
				return endPointSrvConnections != null && !endPointSrvConnections.isEmpty();
			case rapyutacomponentmodelPackage.SYSTEM__END_POINT_MSG_CONNECTIONS:
				return endPointMsgConnections != null && !endPointMsgConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
