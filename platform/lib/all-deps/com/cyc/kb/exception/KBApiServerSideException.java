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
 * Wrap all Cyc server and Base API errors, when a more specific semantic error
 * can not be thrown.
 * 
 * For now, all CycApiException and CycApiServerSideException
 * will be wrapped with KBApiServerSideException. This is because, the
 * KB API user is not expected to handle such exceptions. 
 *
 * @author Vijay Raj
 * @version $Id: KBApiServerSideException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class KBApiServerSideException extends KBApiRuntimeException{
  
  public KBApiServerSideException(Throwable cause) {
    super(cause);
  }

  public KBApiServerSideException(String msg) {
    super(msg);
  }

  public KBApiServerSideException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
