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

/**
 * Thrown when an entity exists in the KB, but does not currently meet the
 * requirements of a particular semantic object type.
 * 
 * @author Nathan Winant
 * @version $Id: KBTypeException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class KBTypeException extends KBApiException {
  
  public KBTypeException(Throwable cause) {
    super(cause);
  }

  public KBTypeException(String msg) {
    super(msg);
  }

  public KBTypeException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
