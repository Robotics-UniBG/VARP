/**
 * HyperFlex toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * ETH Zurich
 * Institute for Dynamic Systems and Control
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
package it.unibg.robotics.roscompositionmodel;

import it.unibg.robotics.compositionmodel.CompRequiredInterf;

import it.unibg.robotics.roscomponentmodel.CompositeSrvConsumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROS Srv Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibg.robotics.roscompositionmodel.ROSSrvConsumer#getSrvConsumer <em>Srv Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibg.robotics.roscompositionmodel.roscompositionmodelPackage#getROSSrvConsumer()
 * @model
 * @generated
 */
public interface ROSSrvConsumer extends CompRequiredInterf {
	/**
	 * Returns the value of the '<em><b>Srv Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Srv Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Srv Consumer</em>' reference.
	 * @see #setSrvConsumer(CompositeSrvConsumer)
	 * @see it.unibg.robotics.roscompositionmodel.roscompositionmodelPackage#getROSSrvConsumer_SrvConsumer()
	 * @model required="true"
	 * @generated
	 */
	CompositeSrvConsumer getSrvConsumer();

	/**
	 * Sets the value of the '{@link it.unibg.robotics.roscompositionmodel.ROSSrvConsumer#getSrvConsumer <em>Srv Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srv Consumer</em>' reference.
	 * @see #getSrvConsumer()
	 * @generated
	 */
	void setSrvConsumer(CompositeSrvConsumer value);

} // ROSSrvConsumer