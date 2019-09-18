package  com.cyc.baseclient.util;

/**
 * Implements an exception class for notification when a Cyc server 
 * communication has timed out. When this is thrown, the outstanding
 * task on the Cyc server is aborted.
 *
 * @version $Id: CycTaskInterruptedException.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Eric E. Allen<br>
 */
public class CycTaskInterruptedException extends RuntimeException {
    
  /**
   * Construct a TimeOutException object with the 
   * specified throwable.
   * @param ie the throwable that caused this exception
   */
  public CycTaskInterruptedException(InterruptedException ie) {
    super(ie);
  }
  
}
