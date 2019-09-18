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
 * Thrown when code attempts to create a KB entity with an invalid name.
 * 
 * @author Nathan Winant
 * @version $Id: InvalidNameException.java 150832 2014-04-30 16:02:51Z jmoszko $ 
 */
// @todo specify what the requirements are for a Constant name.

public class InvalidNameException extends CreateException {
  
  public InvalidNameException(Throwable cause) {
    super(cause);
  }

  public InvalidNameException(String msg) {
    super(msg);
  }

  public InvalidNameException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
