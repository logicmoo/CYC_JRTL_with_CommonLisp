package com.cyc.baseclient.comm;

import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.CycConnectionInterface;
import java.io.InputStream;

/** 
 * <P>Comm is an interface that can be used to create new CycAccess objects
 * such that the actual communications to Cyc is via InputStreams and OutputStreams 
 * managed by the Comm object. This can allow features such as the use of alternate 
 * communications protocols, load balancing, automated server recovery, and 
 * specialized logging without needing any changes to the OpenCyc Java API directly.
 * 
 * <P>Ex.:
 * <CODE><PRE>
 *  Comm comm = new SocketComm("localhost", 3600);
 *  CycAccess cycAccess = new CycAccess(comm);
 * </CODE></PRE>
 *
 * Created on : May 7, 2013, 12:19:20 PM
 * Author     : tbrussea
 * @version $Id: Comm.java 150536 2014-04-15 20:54:59Z nwinant $
 */
public interface Comm {

  enum RequestType {
    /**
     * The default request type and should be used nearly everywhere
     */
    NORMAL,
    /**
     *Only used to initialize communications with a particular Cyc server. 
     */
    INIT };

  /**
   * Send a request to Cyc.
   *
   * @param request The bytes in the request to send to Cyc.
   * @param requestSummary This should be the results of calling makeRequestSummary() on the text of the request.
   * @param requestType The type of request.
   * @return InputStream that should be used to read the requested results.
   * @throws CommException If a  problem with Cyc is encountered.
   * @throws IOException if a fundamental communications error occurs
   */
  InputStream sendRequest(byte request[], String requestSummary, RequestType requestType) throws CommException, CycConnectionException;

  /**
   * Given the text of a request to Cyc, generate a summary that can be used for logging the request. 
   *
   * @param request
   * @return The summary of the request.
   */
  String makeRequestSummary(String request);

  /**
   * Closes this Comm object gracefully.
   *
   * @throws IOException if a fundamental communications error occurs
   */
  void close() throws CycConnectionException;

  /**
   * Returns the CycConnection object used by this comm. 
   *
   * @return the CycConnection object used by this comm. 
   */
  CycConnectionInterface getCycConnection();

  /** 
   * Sets the CycConnection object used by this comm. It is set automatically during 
   * creation of a CycAccess that uses a  Comm object.
   *
   * @param conn
   */
  void setCycConnection(CycConnectionInterface conn);
  
}
