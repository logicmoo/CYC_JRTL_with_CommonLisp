package  com.cyc.base;

/**
 * Implements an exception class for notification when a Cyc server 
 * communication has timed out. When this is thrown, the outstanding
 * task on the Cyc server is arborted.
 *
 * @version $Id: CycTimeOutException.java 150295 2014-04-05 05:46:46Z nwinant $
 * @author Eric E. Allen<br>
 */
public class CycTimeOutException extends RuntimeException {
  
  /**
   * Construct a TimeOutException object with no 
   * specified message.
   */
  public CycTimeOutException () {
    super();
  }
  
  /**
  * Construct a TimeOutException object with a 
  * specified message.
  * @param message a message describing the exception.
  */
  public CycTimeOutException(String message) {
    super(message);
  }
  
  /**
   * Construct a TimeOutException object with a 
   * specified message and throwable.
   * @param message the message string
   * @param t the throwable that caused this exception
   */
  public CycTimeOutException(String message, Throwable t) {
    super(message, t);
  }
    
  /**
   * Construct a TimeOutException object with the 
   * specified throwable.
   * @param t the throwable that caused this exception
   */
  public CycTimeOutException(Throwable t) {
    super(t);
  }
  
}
