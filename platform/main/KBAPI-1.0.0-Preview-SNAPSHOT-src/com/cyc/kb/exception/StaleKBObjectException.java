package com.cyc.kb.exception;

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

import com.cyc.kb.client.KBObjectFactory;
import com.cyc.kb.client.KBObjectImpl;

/**
 * The KB API factory methods, that find or create terms and assertions, cache 
 * the KB Object they return. Multiple get/findOrCreate requests to the same object
 * will be returned identical underlying object from the cache. The cache can be
 * cleared using {@link KBObjectFactory#clearKBObjectCache()}. 
 * 
 * When an object is delete using {@link KBObjectImpl#delete()}, the object is marked 
 * "invalid". The validity of the object can be checked using {@link KBObjectImpl#isValid()}
 * method. 
 * 
 * When an invalid object is used in any method, this exception is thrown. 
 * 
 * @author Vijay Raj
 * @version $Id: StaleKBObjectException.java 151340 2014-05-19 15:55:29Z vijay $
 */
public class StaleKBObjectException extends KBApiRuntimeException {

  public StaleKBObjectException(String msg) {
    super(msg);
  }

  public StaleKBObjectException(Throwable cause) {
    super(cause);
  }

  public StaleKBObjectException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
