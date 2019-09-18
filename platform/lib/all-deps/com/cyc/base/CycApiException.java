package com.cyc.base;

/**
 * Class CycApiException indicates an error condition during a Cyc API call.
 * This type of exception is thrown when errors on the Java side are caught,
 * when errors on the Cyc server side are caught a CycApiServerSideException
 * is thrown instead.
 *
 * @version $Id: CycApiException.java 150723 2014-04-24 21:21:29Z nwinant $
 * @author Stephen L. Reed
 */
public class CycApiException extends RuntimeException {
  
  /**
   * Construct a CycApiException object with no specified message.
   */
  public CycApiException() {
    super();
  }
  
  /**
   * Construct a CycApiException object with a specified message.
   * @param s a message describing the exception.
   */
  public CycApiException(String s) {
    super(s);
  }
  
  /**
   * Construct a CycApiException object with a specified message
   * and throwable.
   * @param s the message string
   * @param cause the throwable that caused this exception
   */
  public CycApiException(String s, Throwable cause) {
    super(s, cause);
  }
  
  /**
   * Construct a CycApiException object with a specified throwable.
   * @param cause the throwable that caused this exception
   */
  public CycApiException(Throwable cause) {
    super(cause);
  }
}
