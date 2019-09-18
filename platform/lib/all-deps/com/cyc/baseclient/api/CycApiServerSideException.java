package com.cyc.baseclient.api;

import com.cyc.base.CycApiException;

/**
 * Class CycApiServerException indicates an error condition during 
 * a Cyc API call that occurred on the Cyc server. If an error is 
 * detected on the Java client, then a CycApiException is thrown 
 * instead.
 *
 * @version $Id: CycApiServerSideException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author tbrussea
 */

public class CycApiServerSideException extends CycApiException {
  
  /**
   * Construct a CycApiServerSideException object with no 
   * specified message.
   */
  public CycApiServerSideException() {
    super();
  }
  
  /**
  * Construct a CycApiServerSideException object with a 
  * specified message.
  * @param s a message describing the exception.
  */
  public CycApiServerSideException(String s) {
    super(s);
  }
  
  /**
   * Construct a CycApiServerSideException object with a 
   * specified message and throwable.
   * @param s the message string
   * @param cause the throwable that caused this exception
   */
  public CycApiServerSideException(String s, Throwable cause) {
    super(s, cause);
  }
  
  /**
   * Construct a CycApiServerSideException object with the 
   * specified throwable.
   * @param cause the throwable that caused this exception
   */
  public CycApiServerSideException(Throwable cause) {
    super(cause);
  }
}
