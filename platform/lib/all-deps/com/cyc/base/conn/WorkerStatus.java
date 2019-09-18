/* $Id: WorkerStatus.java 150301 2014-04-07 05:15:42Z nwinant $
 */

package com.cyc.base.conn;

//// Internal Imports

//// External Imports

/**
 * <P>WorkerStatus is designed to be a type-safe enumeration
 of the status of a SubLWorker.
 *
 * @author tbrussea
 * @date March 26, 2004, 10:40 AM
 * @version $Id: WorkerStatus.java 150301 2014-04-07 05:15:42Z nwinant $
 */
public class WorkerStatus {
  
  //// Constructors
  
  /** Creates a new instance of SubLWorkerStatus.
   * @param name the name of this status
   */
  private WorkerStatus(String name) { this.name = name; }
  
  //// Public Area
  
  /** Returns the name of this status as a String.
   * @return the name of this status as a String
   */  
  public String getName() { return name; }
  
   /** Returns the name of this status as a String.
   * @return the name of this status as a String
   */  
  public String toString() { return getName(); }
  
  /** Indicates that the SubLWorker has not yet been started. */
  public static final WorkerStatus NOT_STARTED_STATUS =
    new WorkerStatus("Not started");

  /** Indicates that the SubLWorker is currently processing
   * the SubL task.*/
  public static final WorkerStatus WORKING_STATUS =
    new WorkerStatus("Working");

  /** Indicates that the SubLWorker was canceled. */
  public static final WorkerStatus CANCELED_STATUS =
    new WorkerStatus("Canceled");

  /** Indicates that the SubLWorker was aborted. */
  public static final WorkerStatus ABORTED_STATUS =
    new WorkerStatus("Aborted");

  /** Indicates that the SubLWorker has finished processing 
   the SubL task normally. */
  public static final WorkerStatus FINISHED_STATUS =
    new WorkerStatus("Finished");

  /** Indicates that the SubLWorker has finished processing 
   the SubL task abnormally because an exception was thrown. */
  public static final WorkerStatus EXCEPTION_STATUS =
    new WorkerStatus("Exception");
    
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private String name;
  
  //// Main
  
}
