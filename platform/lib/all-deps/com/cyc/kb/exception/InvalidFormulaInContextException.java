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
 * Thrown when the Cyc does not allow the specified
 * formula to be true in the specified context. It does not distinguish between
 * semantic and syntactic errors.
 *
 * @author Vijay Raj
 * @version $Id: InvalidFormulaInContextException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
public class InvalidFormulaInContextException extends CreateException {

  public InvalidFormulaInContextException(Throwable cause) {
    super(cause);
  }

  public InvalidFormulaInContextException(String msg) {
    super(msg);
  }

  public InvalidFormulaInContextException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
