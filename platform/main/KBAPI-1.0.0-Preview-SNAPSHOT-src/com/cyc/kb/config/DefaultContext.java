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

/**
 * An immutable object interface to store default contexts for assertions
 * and queries.
 * 
 * @author Vijay Raj
 * @version $Id: DefaultContext.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public interface DefaultContext {

  public Context forAssertion();
  public Context forQuery();
}
