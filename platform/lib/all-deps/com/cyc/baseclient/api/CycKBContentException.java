package com.cyc.baseclient.api;

/**
 * Class CycKBContentException indicates that there is some problem with
 * the knowledge currently stored in the KB.
 *
 * @version $Id: CycKBContentException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */

public class CycKBContentException extends RuntimeException {
  
  /**
   * Construct a CycApiException object with no specified message.
   */
  public CycKBContentException() {
    super();
  }
  
  /**
   * Construct a CycApiException object with a specified message.
   * @param s a message describing the exception.
   */
  public CycKBContentException(String s) {
    super(s);
  }
  
  /**
   * Construct a CycApiException object with a specified message
   * and throwable.
   * @param s the message string
   * @param cause the throwable that caused this exception
   */
  public CycKBContentException(String s, Throwable cause) {
    super(s, cause);
  }
  
  /**
   * Construct a CycApiException object with a specified throwable.
   * @param cause the throwable that caused this exception
   */
  public CycKBContentException(Throwable cause) {
    super(cause);
  }
}
