/*
 * Copyright 2015-Present Entando Inc. (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.entando.entando.portalexample;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.entando.entando.portalexample.aps.internalservlet.card.TestFrontCardFindingAction;
import org.entando.entando.portalexample.aps.system.services.card.TestCardDAO;
import org.entando.entando.portalexample.aps.system.services.card.TestCardManager;
import org.entando.entando.portalexample.apsadmin.card.TestCardAction;
import org.entando.entando.portalexample.apsadmin.card.TestCardFinderAction;

public class AllTests {
	
    public static Test suite() {
		TestSuite suite = new TestSuite("Test for portalexample");
		System.out.println("Test for portalexample");
		
		suite.addTestSuite(TestFrontCardFindingAction.class);
		
		suite.addTestSuite(TestCardDAO.class);
		suite.addTestSuite(TestCardManager.class);
		
		suite.addTestSuite(TestCardAction.class);
		suite.addTestSuite(TestCardFinderAction.class);
		
		return suite;
	}
    
}
