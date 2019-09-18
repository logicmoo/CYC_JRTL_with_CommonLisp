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
 * Root class for exceptions thrown by the KB API.
 *
 * @author David Baxter
 * @version $Id: KBApiException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class KBApiException extends Exception {

  public KBApiException(Throwable cause) {
    super(cause);
  }

  public KBApiException(String msg) {
    super(msg);
  }

  public KBApiException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
