// remove package stmt when deploying as jws (java web service)
package com.cyc.baseclient.soap;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import java.io.IOException;
import com.cyc.baseclient.CycClientManager;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.api.CycConnection;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.util.Base64;
import com.cyc.baseclient.util.Log;
import com.cyc.baseclient.datatype.StringUtils;
import java.util.Hashtable;

/**
 * Provides the Cyc API as an XML SOAP service.  Note that Tomcat/AXIS
 * deployment via Java Web Service (JWS) does not work if this module is part of
 * a package.<p>
 *
 * @version $Id: CycSOAPService.java 138070 2012-01-10 19:46:08Z sbrown $
 * @author Stephen L. Reed
 */
public class CycSOAPService {
  
/*
 
    Required jars:
 
    jakarta-oro-2.0.3.jar
    jug.jar
    OpenCyc.jar
 
 
 */
  /**
   * the maximum number of connection timeouts allowed before sending the
   * exception back to the client
   */
  protected static final int MAX_CONNECTION_TIMEOUTS = 2;
  
  /**
   * the CycAccess object which manages the Ascii Cyc server connection and provides
 the API methods
   */
  protected static CycAccess asciiCycAccess = null;
  
  /**
   * the dictionary where host/port string --> [CycAccess object, start timestamp]
   */
  protected static final Hashtable cycAccesses = new Hashtable();
  
  /**
   * the maximum time that the CycAccess connection is allowed to be unused before
 estabishing a fresh connection (an hour)
   */
  protected static final long MAX_UNACCESSED_MILLIS = 3600000;
  
  
  /** the dictionary of ontologies,  ontology KB subcollection --> list of terms comprising the ontology */
  protected static final Hashtable ontologies = new Hashtable();
  
  /**
   * Construct a new CycSOAPService object.
   */
  public CycSOAPService() {
    System.out.println("CycSoapService");
    if (Log.current == null)
      Log.makeLog("cyc-soap-service.log");
  }
  
  /** Provides a simple message to test the CycSOAPService without accessing
   * the Cyc server.
   * @param name the given client name
   * @return the hello world message to the client
   */
  public String getHelloWorldMessage(String name) {
    return "Hello World to " + name;
  }
  
  /**
   * Provides the main method for the CycSOAPService application without the Tomcat server.
   *
   * @param args the command line arguments (not used)
   */
  public static void main(String[] args) {
    CycSOAPService cycSOAPService = new CycSOAPService();
    
    try {
      CycArrayList query = new CycArrayList();
      query.add(CycObjectFactory.makeCycSymbol("+"));
      query.add(new Integer(1));
      query.add(new Integer(1));
      Log.current.println("binary query=" + query.toString());
      String hostname = "localhost";
      String port = "3600";
      Base64 base64 = new Base64();
      String base64Query = base64.encodeCycObject(query, 0);
      String base64Response =
      cycSOAPService.binarySubLInteractorAtHostPort(base64Query, hostname, port);
      Object cycObject = base64.decodeCycObject(base64Response, 0);
      Log.current.println("result=" + cycObject);
      CycArrayList query4 = new CycArrayList();
      query4.add(CycObjectFactory.quote);
      CycArrayList cycList2 = new CycArrayList();
      query4.add(cycList2);
      cycList2.add(CycObjectFactory.makeCycSymbol("A"));
      cycList2.setDottedElement(CycObjectFactory.makeCycSymbol(
                                    "B"));
      base64Query = base64.encodeCycObject(query4, 0);
      base64Response = cycSOAPService.binarySubLInteractorAtHostPort(base64Query, hostname, port);
      Log.current.println("(A . B)=" + base64.decodeCycObject(base64Response, 0));
      
      query = new CycArrayList();
      query.add(CycObjectFactory.makeCycSymbol("an-error"));
      base64Query = base64.encodeCycObject(query, 0);
      base64Response =
      cycSOAPService.binarySubLInteractorAtHostPort(base64Query, hostname, port);
      Log.current.println("error=" + base64.decodeCycObject(base64Response, 0));
    }
    catch (IOException e) {
      Log.current.println(e.getMessage());
      Log.current.printStackTrace(e);
      System.exit(1);
    }
        
    // End all threads
    System.exit(0);
  }
  
  /** Provides a binary (CFASL) SubL interactor service directed to the given Cyc host
   * and listener port.
   * @param base64SubLRequest the given binary (CFASL) SubL request encoded as a Base64 string
   * which will be submitted to the Cyc server for evaluation
   * @return the Base64 encoded result of evaluating the given SubL request
   * @param hostname the given host name
   * @param port the given port
   */
  public String binarySubLInteractorAtHostPort(String base64SubLRequest, String hostname, String port) {
    int timeoutCount = 0;
    Base64 base64 = new Base64();
    while (true) {
      try {
        CycAccess cycAccess = establishAndVerifyCycAccess(hostname, port);        
        CycArrayList subLRequest = (CycArrayList) base64.decodeCycObject(base64SubLRequest, 0);
        subLRequest = unescape(subLRequest);
        Log.current.println("subLRequest " + subLRequest.toString() + "\n");
        Object response = null;
        try {
          response = cycAccess.converse().converseObject(subLRequest);
        }
        catch (Exception e) {
          Log.current.println("CycApiException " + e.getMessage());
          if (e.getMessage().equals("Connection timed out") && 
            (++timeoutCount < MAX_CONNECTION_TIMEOUTS)) {
            Log.current.println("Connection timeout handled for " + cycAccess);
            Log.current.println("Retry attempt " + timeoutCount);
            cycAccess.close();
            cycAccess = null;
            continue;
          }
          CycArrayList exception = new CycArrayList();
          exception.add(CycObjectFactory.makeCycSymbol("CycApiException"));
          exception.add(e.getMessage());
          return base64.encodeCycObject(exception, 0);
        }
        return base64.encodeCycObject(response, 0);
      }
      catch (Exception e) {
        Log.current.println("Exception " + e.getMessage());
        try {
          CycArrayList exception = new CycArrayList();
          exception.add(CycObjectFactory.makeCycSymbol("CycApiException"));
          exception.add(e.getMessage() + "\n" + StringUtils.getStringForException(e));
          return base64.encodeCycObject(exception, 0);
        }
        catch (Exception e1) {
        }
        return null;
      }
    }
  }
  
  /**
   * Unescapes strings contained in the given CycArrayList.
   *
   * @param cycList the SubL given CycArrayList
   * @return the request with escape sequences changed from SubL to java format
   */
  protected CycArrayList unescape(CycArrayList cycList) {
    CycArrayList unescapedCycList = new CycArrayList();
    final int cycList_size = cycList.getProperListSize();
    for (int i = 0; i < cycList_size; i++) {
      Object obj = cycList.get(i);
      if (obj instanceof CycArrayList)
        unescapedCycList.add(unescape((CycArrayList) obj));
      else if (obj instanceof String) {
        unescapedCycList.add(StringUtils.unescapeDoubleQuotes((String) obj));
      }
      else
        unescapedCycList.add(obj);
    }
    if (! cycList.isProperList()) {
      Object dottedElement = cycList.getDottedElement();
      if (dottedElement instanceof CycArrayList)
        dottedElement = unescape((CycArrayList) dottedElement);
      else if (dottedElement instanceof String) {
        dottedElement = StringUtils.unescapeDoubleQuotes((String) dottedElement);
      }
      unescapedCycList.setDottedElement(dottedElement);
    }
    return unescapedCycList;
  }
  
  
  /** Establish and verify the binary CycAccess connection.
   *
   * @param hostname the Cyc host name
   * @param port the TCP base port (e.g. 3600) at which Cyc listens for cfasl API requests
   * @return the verified CycAccess connection
   */
  private CycAccess establishAndVerifyCycAccess(final String hostname, final String port) 
    throws CycConnectionException, CycApiException {
    final StringBuffer hostnamePortBuffer = new StringBuffer();
    hostnamePortBuffer.append(hostname);
    hostnamePortBuffer.append("/");
    hostnamePortBuffer.append(port);
    final String hostnamePort = hostnamePortBuffer.toString();
    Log.current.print("hostname/port:  " + hostnamePort);
    // obtain the existing cycAccess if this is not the first time
    Object[] cycAccessInfo = (Object[]) cycAccesses.get(hostnamePort);
    CycAccess cycAccess = null;
    if (cycAccessInfo != null)
      cycAccess = (CycAccess) cycAccessInfo[0];
    Log.current.println(" cycAccess: " + cycAccess);
    if (cycAccess != null) {
      // verify that the existing connection is valid, or too-long unused
      if (! ((CycConnection) cycAccess.getCycConnection()).isValidBinaryConnection()) {
        Log.current.println("Socket not connected for " + cycAccess);
        cycAccess.close();
        cycAccess = null;
      }
      else if (((Long) cycAccessInfo[1]).longValue() + MAX_UNACCESSED_MILLIS < System.currentTimeMillis()) {
        Log.current.println("Maximum unused time exceeded for " + cycAccess);
        cycAccess.traceOn();
        cycAccess.close();
        cycAccess = null;
      }
    }
    if (cycAccess == null) {
      Log.current.println("Creating new cycAccess for " + hostnamePort);
      cycAccess = CycClientManager.get().getAccess(hostname, Integer.parseInt(port));
      Log.current.println("Created cycAccess for " + hostnamePort);
      cycAccessInfo = new Object[2];
      cycAccessInfo[0] = cycAccess;
    }
    cycAccessInfo[1] = new Long(System.currentTimeMillis());
    cycAccesses.put(hostnamePort, cycAccessInfo);
    return cycAccess;
  }
  
}
