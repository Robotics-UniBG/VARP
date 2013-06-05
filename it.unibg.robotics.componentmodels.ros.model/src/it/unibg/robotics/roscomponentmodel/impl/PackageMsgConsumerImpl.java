/**
 * Variability Modeling And Resolution Plugins (VARP)
 * 
 * Copyright (c) 2013
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
package it.unibg.robotics.roscomponentmodel.impl;

import it.unibg.robotics.roscomponentmodel.MsgConsumer;
import it.unibg.robotics.roscomponentmodel.NodeMsgConsumer;
import it.unibg.robotics.roscomponentmodel.PackageMsgConsumer;
import it.unibg.robotics.roscomponentmodel.roscomponentmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Msg Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscomponentmodel.impl.PackageMsgConsumerImpl#getPromote <em>Promote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageMsgConsumerImpl extends MsgConsumerImpl implements PackageMsgConsumer {
	/**
	 * The cached value of the '{@link #getPromote() <em>Promote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromote()
	 * @generated
	 * @ordered
	 */
	protected MsgConsumer promote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMsgConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return roscomponentmodelPackage.Literals.PACKAGE_MSG_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgConsumer getPromote() {
		if (promote != null && promote.eIsProxy()) {
			InternalEObject oldPromote = (InternalEObject)promote;
			promote = (MsgConsumer)eResolveProxy(oldPromote);
			if (promote != oldPromote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE, oldPromote, promote));
			}
		}
		return promote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgConsumer basicGetPromote() {
		return promote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromote(MsgConsumer newPromote) {
		MsgConsumer oldPromote = promote;
		promote = newPromote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE, oldPromote, promote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE:
				if (resolve) return getPromote();
				return basicGetPromote();
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
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE:
				setPromote((MsgConsumer)newValue);
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
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE:
				setPromote((MsgConsumer)null);
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
			case roscomponentmodelPackage.PACKAGE_MSG_CONSUMER__PROMOTE:
				return promote != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageMsgConsumerImpl
