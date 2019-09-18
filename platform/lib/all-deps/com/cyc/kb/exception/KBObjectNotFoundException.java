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
 * Thrown when a term or a formula cannot be found from the specified
 * context.    
 * 
 * @author Vijay Raj
 * @version $Id: KBObjectNotFoundException.java 150832 2014-04-30 16:02:51Z jmoszko $
 */
/*
* @todo add documentation
* @todo DaveS review documentation
*/
public class KBObjectNotFoundException extends CreateException {

  public KBObjectNotFoundException(Throwable cause) {
    super(cause);
  }

  public KBObjectNotFoundException(String msg) {
    super(msg);
  }

  public KBObjectNotFoundException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
