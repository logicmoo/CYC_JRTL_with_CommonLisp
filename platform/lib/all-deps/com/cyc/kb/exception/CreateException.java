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

import com.cyc.kb.exception.KBApiException;

/**
 * Thrown when code fails to find or create something from the Cyc KB.
 * The KBTypeException and KBTypeConflictException are not subclasses because
 * they do not indicate if the underlying object is not in the KB.
 * 
 * @author Vijay Raj
 * @version $Id: CreateException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class CreateException extends KBApiException {
  
  public CreateException(Throwable cause) {
    super(cause);
  }

  public CreateException(String msg) {
    super(msg);
  }

  public CreateException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
