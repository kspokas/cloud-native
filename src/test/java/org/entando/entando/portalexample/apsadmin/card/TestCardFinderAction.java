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
package org.entando.entando.portalexample.apsadmin.card;

import com.opensymphony.xwork2.Action;
import org.entando.entando.portalexample.aps.system.services.card.Card;
import org.entando.entando.portalexample.apsadmin.PortalexampleApsBaseTestCase;

/**
 * @author E.Santoboni
 */
public class TestCardFinderAction extends PortalexampleApsBaseTestCase {
	
	public void testListCard() throws Throwable {
		this.setUserOnSession("admin");
		this.initAction("/do/Card", "list");
		String result = this.executeAction();
		assertEquals(Action.SUCCESS, result);
		CardFinderAction action = (CardFinderAction) this.getAction();
		assertEquals(4, action.getCards().size());
	}
	
	public void testSearchCard_1() throws Throwable {
		this.setUserOnSession("admin");
		this.initAction("/do/Card", "search");
		this.addParameter("holder", "Nicola");
		String result = this.executeAction();
		assertEquals(Action.SUCCESS, result);
		CardFinderAction action = (CardFinderAction) this.getAction();
		assertEquals(1, action.getCards().size());
	}
	
	public void testSearchCard_2() throws Throwable {
		this.setUserOnSession("admin");
		this.initAction("/do/Card", "search");
		this.addParameter("holder", "Anna");
		String result = this.executeAction();
		assertEquals(Action.SUCCESS, result);
		CardFinderAction action = (CardFinderAction) this.getAction();
		assertEquals(1, action.getCards().size());
		Card card = action.getCards().get(0);
		assertEquals("Verdi Anna", card.getHolder());
	}
	
}
