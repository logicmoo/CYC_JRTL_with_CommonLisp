/* $Id: SubLWorkerSynch.java 150787 2014-04-26 01:55:03Z nwinant $
 */

package com.cyc.baseclient.api;

//// Internal Imports
import com.cyc.base.CycApiException;
import com.cyc.baseclient.util.CycTaskInterruptedException;
import com.cyc.base.CycConnectionException;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.conn.Worker;

//// External Imports
import java.io.*;

/**
 * <P>WorkerSynch is designed to provide a handle for a particular 
 communication event with a Cyc server in a synchronous manner. 
 DefaultWorkerSynch provides the default
 implementation while Worker and DefaultWorker provide
 asynchronous communications capabilities. Currently, WorkerSynchs are one-shot,
 i.e., a new WorkerSynch needs to be created for every new communication.
 WorkerSynchs are cancelable, time-outable and provide means for incremental
 return results.
  
 <P>Example usage: <pre>
 try {
    CycAccess access = new CycAccess("localhost", 3640);
    WorkerSynch worker = new DefaultWorkerSynch("(+ 1 1)", access);
    Object work = worker.getWork();
    System.out.println("Got worker: " + worker + "\nGot result: " + work + ".");
  } catch (Exception e) {
    e.printStackTrace();
  }
 </pre>
 *
 * @author tbrussea
 * @date March 17, 2004, 11:26 AM
 * @version $Id: SubLWorkerSynch.java 150787 2014-04-26 01:55:03Z nwinant $
 */
public interface SubLWorkerSynch extends Worker {
  
  /** This method starts communications with the Cyc server, waits for the work
   * to be performed, then returns the resultant work.
   * @throws CycConnectionException thown when there is a problem with the communications
   * protocol with the CycServer
   * @throws CycTimeOutException thrown if the worker takes to long to return results
   * @throws CycApiException thrown if any other error occurs
   * @return The work produced by this WorkerSynch
   */  
  Object getWork() throws CycConnectionException, CycTimeOutException, CycApiException, CycTaskInterruptedException;
  
}
