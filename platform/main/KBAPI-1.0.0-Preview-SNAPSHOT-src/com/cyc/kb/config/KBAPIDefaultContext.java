package com.cyc.kb.config;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.kb.Context;
import com.cyc.kb.client.ContextImpl;

public class KBAPIDefaultContext implements DefaultContext {
	

	private Context assertionContext;
	private Context queryContext;

	public KBAPIDefaultContext(Context assertionContext, Context queryContext) {
		this.assertionContext = assertionContext;
		this.queryContext = queryContext;
	}

	@Override
	public Context forAssertion() {
	  if (assertionContext == null){
	    throw new NullPointerException("ThreadLocal variable KBAPIConfiguration.defaultContext is not set. "
	        + "Set it by calling KBAPIConfiguration.setDefaultContext(DefaultContext) atleast once in this thread.");
	  }
		return assertionContext;
	}

	@Override
	public Context forQuery() {
	  if (queryContext == null){
      throw new NullPointerException("ThreadLocal variable KBAPIConfiguration.defaultContext is not set. "
          + "Set it by calling KBAPIConfiguration.setDefaultContext(DefaultContext) atleast once in this thread.");
    }
		return queryContext;
	}

}
