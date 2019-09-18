package com.cyc.base;

/**
 *
 * @author nwinant
 */
public class CycConnectionException extends Exception {
  /**
   * Construct a CycApiException object with no specified message.
   */
  public CycConnectionException() {
    super();
  }
  
  /**
   * Construct a CycApiException object with a specified message.
   * @param s a message describing the exception.
   */
  public CycConnectionException(String s) {
    super(s);
  }
  
  /**
   * Construct a CycApiException object with a specified message
   * and throwable.
   * @param s the message string
   * @param cause the throwable that caused this exception
   */
  public CycConnectionException(String s, Throwable cause) {
    super(s, cause);
  }
  
  /**
   * Construct a CycApiException object with a specified throwable.
   * @param cause the throwable that caused this exception
   */
  public CycConnectionException(Throwable cause) {
    super(cause);
  }
}
