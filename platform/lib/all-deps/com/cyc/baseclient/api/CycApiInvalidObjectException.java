package com.cyc.baseclient.api;

/**
 * Class CycApiInvalidObjectException indicates that an invalid object of
 * some sort was detected during a Cyc API call that occurred on the Cyc
 * server. If an error is detected on the Java client, then a CycApiException
 * is thrown instead.
 *
 * @version $Id: CycApiInvalidObjectException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author daves
 */

public class CycApiInvalidObjectException extends CycApiServerSideException {

  /**
   * Construct a CycApiInvalidObjectException object with no
   * specified message.
   */
  public CycApiInvalidObjectException() {
    super();
  }

  /**
  * Construct a CycApiInvalidObjectException object with a
  * specified message.
  * @param s a message describing the exception.
  */
  public CycApiInvalidObjectException(String s) {
    super(s);
  }

  /**
   * Construct a CycApiInvalidObjectException object with a
   * specified message and throwable.
   * @param s the message string
   * @param cause the throwable that caused this exception
   */
  public CycApiInvalidObjectException(String s, Throwable cause) {
    super(s, cause);
  }

  /**
   * Construct a CycApiInvalidObjectException object with the
   * specified throwable.
   * @param cause the throwable that caused this exception
   */
  public CycApiInvalidObjectException(Throwable cause) {
    super(cause);
  }
}
