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
 * Root class for runtime exceptions thrown by the KB API.
 * 
 * For now, all UnknowHostException and IOExceptions from OpenCyc API
 * will be wrapped with KBApiRuntimeException. This is because, the
 * KB API user is not expected to handle such exceptions. 
 *
 * @author Vijay Raj
 * @version $Id: KBApiRuntimeException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class KBApiRuntimeException extends RuntimeException {

  public KBApiRuntimeException(Throwable cause) {
    super(cause);
  }

  public KBApiRuntimeException(String msg) {
    super(msg);
  }

  public KBApiRuntimeException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
