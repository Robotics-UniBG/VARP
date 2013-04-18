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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels;

import it.unibg.robotics.resolutionmodels.RMRequiredConnections;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Required Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredTopicConnections <em>Required Topic Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredServiceConnections <em>Required Service Connections</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections#getRequiredActionConnections <em>Required Action Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections()
 * @model
 * @generated
 */
public interface ROSRequiredConnections extends RMRequiredConnections {
	/**
	 * Returns the value of the '<em><b>Required Topic Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTopicConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Topic Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Topic Connections</em>' containment reference list.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredTopicConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSTopicConnection> getRequiredTopicConnections();

	/**
	 * Returns the value of the '<em><b>Required Service Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSServiceConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Service Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Service Connections</em>' containment reference list.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredServiceConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSServiceConnection> getRequiredServiceConnections();

	/**
	 * Returns the value of the '<em><b>Required Action Connections</b></em>' containment reference list.
	 * The list contents are of type {@link it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSActionConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Action Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Action Connections</em>' containment reference list.
	 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage#getROSRequiredConnections_RequiredActionConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ROSActionConnection> getRequiredActionConnections();

} // ROSRequiredConnections