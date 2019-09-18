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
 * Thrown when code fails to delete something from the Cyc KB.
 * 
 * @author Nathan Winant
 * @version $Id: DeleteException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class DeleteException extends KBApiException {
  
  public DeleteException(Throwable cause) {
    super(cause);
  }

  public DeleteException(String msg) {
    super(msg);
  }

  public DeleteException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
