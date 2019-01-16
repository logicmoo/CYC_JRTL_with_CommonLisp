package org.opencyc.api;

//// External Imports
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

//// Internal Imports
import static org.opencyc.api.SubLWorkerStatus.*;
import static org.opencyc.api.SubLAPIHelper.makeSubLStmt;
import org.opencyc.comm.Comm;
import org.opencyc.comm.CommException;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.DefaultCycObject;
import org.opencyc.util.Log;
import org.opencyc.util.TimeOutException;
import org.opencyc.util.Timer;

/**
 * Provides a binary connection and an ascii connection to the OpenCyc server. The ascii connection
 * is legacy and its use is deprecated.
 *
 * <p>
 * Collaborates with the <tt>CycAccess</tt> class which wraps the api functions. CycAccess may be
 * specified as null in the CycConnection constructors when the binary api is used. Concurrent api
 * requests are supported for binary (cfasl) mode. This is implemented by two socket connections,
 * the first being for asynchronous api requests sent to Cyc, and the second for the asychronous
 * api responses received from Cyc.
 * </p>
 *
 * @version $Id: CycConnection.java 150565 2014-04-16 21:52:36Z nwinant $
 * @author Stephen L. Reed <p><p><p><p><p>
 */
public class CycConnection implements CycConnectionInterface {

  public static boolean DEFAULT_GETS_RESETED = true;	
  
  /** Default host name for the OpenCyc server. */
  public static String DEFAULT_HOSTNAME = "cycserver";
  
  /** Default base tcp port for the OpenCyc server. */
  public static int DEFAULT_BASE_PORT = 3600;
  /** HTTP port offset for the OpenCyc server. */
  public static final int HTTP_PORT_OFFSET = 2;
  /** HTTP port offset for the OpenCyc webapp server. */
  public static final int WEBAPP_PORT_OFFSET = 3;
  /** CFASL (binary) port offset for the OpenCyc server. */
  public static final int CFASL_PORT_OFFSET = 14;
  /** No api trace. */
  public static final int API_TRACE_NONE = 0;
  /** Message-level api trace. */
  public static final int API_TRACE_MESSAGES = 1;
  /** Detailed api trace. */
  public static final int API_TRACE_DETAILED = 2;
  /** Parameter that, when true, causes a trace of the messages to and from the server. */
  protected int trace = API_TRACE_NONE;
//  protected int trace = API_TRACE_MESSAGES;
//  protected int trace = API_TRACE_DETAILED;
  /** CFASL (binary) mode connnection to the Cyc server (preferred). */
  public static final int BINARY_MODE = 2;
  /** The binary interface input stream. */
  protected CfaslInputStream cfaslInputStream;
  /** The binary interface output stream. */
  protected CfaslOutputStream cfaslOutputStream;
  /** The name of the computer hosting the OpenCyc server. */
  protected String hostName;
  /** The tcp port from which the asciiPort and cfaslPorts are derived. */
  protected int basePort;
  /** The tcp port assigned to the binary connection to the OpenCyc server. */
  protected int cfaslPort;
  /** The tcp socket assigned to the binary connection to the OpenCyc server. */
  protected Socket cfaslSocket;
  /** The timer which optionally monitors the duration of requests to the OpenCyc server. */
  protected static final Timer notimeout = new Timer();
  /**
   * Indicates if the response from the OpenCyc server is a symbolic expression (enclosed in
   * parentheses).
   */
  protected boolean isSymbolicExpression = false;
  /**
   * A reference to the parent CycAccess object for dereferencing constants in ascii symbolic
   * expressions.
   */
  protected CycAccess cycAccess;
  protected Comm comm;
  /** outbound request serial id */
  static private int apiRequestId = 0;
  private volatile boolean isClosed = false;
  /** The priorities for the task processors. These correspond to the
   * SubL priorities for SL:SET-PROCESS-PRIORITY */
  public static final Integer MAX_PRIORITY = new Integer(10);
  public static final Integer CRITICAL_PRIORITY = new Integer(7);
  public static final Integer NORMAL_PRIORITY = new Integer(5);
  public static final Integer BACKGROUND_PRIORITY = new Integer(3);
  public static final Integer MIN_PRIORITY = new Integer(1);
  // @legacy
  public static final int DEFAULT_PRIORITY = NORMAL_PRIORITY.intValue();
  /** name of my api client */
  protected String myClientName = "api client";
  /**
   * Implements an association: apiRequestId --> waiting thread info, where waiting thread info is
   * an array of two objects: 1. the latch waiting for the response from the Cyc server
   * (number 1 is no longer valid
   *
   * @todo fix this description) 2. the
   * api-request in CycList form Used when submitting concurrent requests to the task-processor.
   */
  private final Map waitingReplyThreads = Collections.synchronizedMap(
          new HashMap());

  final ConnectionTimer connectionTimer = new ConnectionTimer(this);
          
  public Map getWaitingReplyThreads() {
    return waitingReplyThreads;
  }
  
  /** handles responses from task-processor requests in binary communication mode. */
  protected Map<String, TaskProcessorBinaryResponseHandler> taskProcessorBinaryResponseHandlerMap =
          new HashMap<String, TaskProcessorBinaryResponseHandler>(32);
  
  /** handles responses from task-processor requests in binary communication mode when dealing with comm objects. */
  protected Map<InputStream, TaskProcessorBinaryResponseHandler> taskProcessorBinaryResponseHandlerCommMap =
          new HashMap<InputStream, TaskProcessorBinaryResponseHandler>(32);
  

  protected Map<String, CycLeaseManager> cycLeaseManagerMap = 
          new HashMap<String, CycLeaseManager>(32);

  protected Map<InputStream, CycLeaseManager> cycLeaseManagerCommMap = 
          new HashMap<InputStream, CycLeaseManager>(32);
  
  
  /** Indicates to the taskProcessor response handlers that the server connection is closed. */
  protected boolean taskProcessingEnded = false;
  /** Indicates that the task processing thread is dead */
  protected volatile boolean taskProcessingThreadDead = false;
  /**
   * Universally Unique ID that identifies this CycConnection to the Cyc server. It is used when
   * establishing the (second) asychronous socket connection.
   */
  protected UUID uuid;
  /** the logger */
  protected final Logger logger;

  /**
   * Constructs a new CycConnection using the given socket obtained from the parent AgentManager
   * listener.
   *
   * @param cfaslSocket tcp socket which forms the binary connection to the OpenCyc server
   *
   * @throws IOException when communication error occurs
   */
  public CycConnection(Socket cfaslSocket) throws IOException {
    if (Log.current == null) {
      Log.makeLog("cyc-api.log");
    }
    logger = Logger.getLogger("org.opencyc.CycConnection");
    this.cfaslSocket = cfaslSocket;
    hostName = cfaslSocket.getInetAddress().getHostName();
    basePort = cfaslSocket.getPort() - CFASL_PORT_OFFSET;
    cycAccess = null;
//    cfaslInputStream = new CfaslInputStream(cfaslSocket.getInputStream());
//    cfaslInputStream.trace = trace;
    cfaslOutputStream = new CfaslOutputStream(cfaslSocket.getOutputStream());
    cfaslOutputStream.trace = trace;
  }

  /**
   * Constructs a new CycConnection object using the default host name and default base port numbe.
   * When CycAccess is null as in this case, diagnostic output is reduced.
   *
   * @throws UnknownHostException when the cyc server cannot be found
   * @throws IOException when communications error occurs
   * @throws CycApiException when an api error occurs
   */
  public CycConnection() throws IOException, UnknownHostException, CycApiException {
    this(DEFAULT_HOSTNAME, DEFAULT_BASE_PORT, null);
  }

  /**
   * Constructs a new CycConnection object using the default host name, default base port number
   * and the given CycAccess object.
   *
   * @param cycAccess the given CycAccess object which provides api services over this
   * CycConnection object
   *
   * @throws CycApiException when a Cyc api exception occurs
   * @throws IOException when communication error occurs
   * @throws UnknownHostException when the cyc server cannot be found
   */
  public CycConnection(CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException {
    this(DEFAULT_HOSTNAME, DEFAULT_BASE_PORT, cycAccess);
  }

  /**
   * Constructs a new CycConnection object using a given host name, the given base port number, the
   * given communication mode, and the given CycAccess object
   *
   * @param hostName the cyc server host name
   * @param basePort the base tcp port on which the OpenCyc server is listening for connections.
   * @param cycAccess the given CycAccess object which provides api services over this
   * CycConnection object
   *
   * @throws IOException when a communications error occurs
   * @throws UnknownHostException when the cyc server cannot be found
   * @throws CycApiException when a Cyc API error occurs
   */
  public CycConnection(String hostName, int basePort, CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException {
    if (Log.current == null) {
      Log.makeLog("cyc-api.log");
    }
    logger = Logger.getLogger("org.opencyc.CycConnection");
    if(DEFAULT_GETS_RESETED) {
    	DEFAULT_HOSTNAME = hostName;
    	DEFAULT_BASE_PORT = basePort;
    }
    this.hostName = hostName;
    this.basePort = basePort;
    cfaslPort = basePort + CFASL_PORT_OFFSET;
    //final ConnectionTimer connectionTimer = new ConnectionTimer(this);
    connectionTimer.start();
    this.cycAccess = cycAccess;
    initializeApiConnections();
    if (trace > API_TRACE_NONE) {
      Log.current.println("CFASL connection " + cfaslSocket);
    }
    uuid = UUID.randomUUID();
    initializeConcurrentProcessing();
    connectionTimer.isCycConnectionEstablished = true;
  }
  
  /**
   *
   * @param comm
   * @param cycAccess
   * @throws IOException
   * @throws UnknownHostException
   * @throws CycApiException
   */
  public CycConnection(Comm comm, CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException { 
    uuid = UUID.randomUUID();
    if (Log.current == null) {
      Log.makeLog("cyc-api.log");
    }
    logger = Logger.getLogger("org.opencyc.CycConnection");
    this.comm = comm;
    //comm.sendRe
    //final ConnectionTimer connectionTimer = new ConnectionTimer(this);
    connectionTimer.start();
    this.cycAccess = cycAccess;
    if (trace > API_TRACE_NONE) {
      Log.current.println("CFASL connection " + cfaslSocket);
    }
  }

  public int getConnectionType() {
    return CycAccess.PERSISTENT_CONNECTION;
  }

  /**
   * Initializes the OpenCyc CFASL socket connections.
   *
   * @throws IOException when a communications error occurs
   * @throws UnknownHostException when the cyc server cannot be found
   */
  private void initializeApiConnections()
          throws IOException, UnknownHostException {
    try {
      cfaslSocket = new Socket(hostName, cfaslPort);
      int val = cfaslSocket.getReceiveBufferSize();
      cfaslSocket.setReceiveBufferSize(val * 2);
      cfaslSocket.setTcpNoDelay(true);
      cfaslSocket.setKeepAlive(true);
      cfaslInputStream = new CfaslInputStream(cfaslSocket.getInputStream());
      cfaslInputStream.trace = trace;
      cfaslOutputStream = new CfaslOutputStream(cfaslSocket.getOutputStream());
      cfaslOutputStream.trace = trace;
    } catch (ConnectException ex) {
      throw new IOException("Couldn't connect to " + hostName + ":" + cfaslPort, ex);
    }
  }

  /**
   * Initializes the concurrent processing mode. Use serial messaging mode to ensure the Cyc task
   * processors are initialized, then start this connection's taskProcessor response handler
   * thread.
   *
   * @throws IOException when a communications error occurs
   * @throws UnknownHostException when the cyc server cannot be found
   * @throws CycApiException when a Cyc API error occurs
   */
  public void initializeConcurrentProcessing()
          throws IOException, UnknownHostException, CycApiException {
    initializeConcurrentProcessing(this.hostName, this.cfaslPort);
  }
  
  protected void initializeConcurrentProcessing(InputStream is)
          throws IOException, UnknownHostException, CycApiException {
    TaskProcessorBinaryResponseHandler handler =  new TaskProcessorBinaryResponseHandler(Thread.currentThread(), 
        this, is);
    taskProcessorBinaryResponseHandlerCommMap.put(is, handler);
    handler.start();
    handler.waitOnSetupToComplete();
    
    CycLeaseManager lease = new CycLeaseManager(this);
    lease.start();
    cycLeaseManagerCommMap.put(is, lease);
  }
  
  protected void initializeConcurrentProcessing(String hostName, int cfaslPort)
          throws IOException, UnknownHostException, CycApiException {
    if (comm != null) {
      return;
    }
    String key = hostName + Integer.toString(cfaslPort);
    TaskProcessorBinaryResponseHandler handler = null;
    taskProcessorBinaryResponseHandlerMap.put(
            key, 
            handler = new TaskProcessorBinaryResponseHandler(Thread.currentThread(), this, hostName, cfaslPort));
    handler.start();
    handler.waitOnSetupToComplete();
    
    CycLeaseManager lease = new CycLeaseManager(this);
    lease.start();
    cycLeaseManagerMap.put(key, lease);
  }

  public Map<String, CycLeaseManager> getCycLeaseManagerMap() {
    return cycLeaseManagerMap;
  }

  public void setCycLeaseManagerMap(Map<String, CycLeaseManager> cycLeaseManagerMap) {
    this.cycLeaseManagerMap = cycLeaseManagerMap;
  }

  public Map<InputStream, CycLeaseManager> getCycLeaseManagerCommMap() {
    return cycLeaseManagerCommMap;
  }

  public void setCycLeaseManagerCommMap(Map<InputStream, CycLeaseManager> cycLeaseManagerCommMap) {
    this.cycLeaseManagerCommMap = cycLeaseManagerCommMap;
  }

  
  
  /**
   * Ensures that the api socket connections are closed when this object is garbage collected.
   */
  protected void finalize() {
    close();
  }

  /**
   * Close the api sockets and streams.
   */
  public synchronized void close() {
    if (isClosed) {
      return;
    }
    isClosed = true;
    
    for(Map.Entry<String, CycLeaseManager> kv : cycLeaseManagerMap.entrySet()){
      kv.getValue().interrupt();
      //TODO: Should we join the thread here?
      // kv.getValue().join(500);
    }
    
    for(Map.Entry<InputStream, CycLeaseManager> kv : cycLeaseManagerCommMap.entrySet()){
      kv.getValue().interrupt();
    }
    
    for (Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerMap.entrySet()) {
      kv.getValue().isClosing = true;
    }
    
    for (Map.Entry<InputStream, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerCommMap.entrySet()) {
      kv.getValue().isClosing = true;
    }
    
    try {
      if (isValidBinaryConnection(true)) {
        if (cfaslOutputStream != null) {
          CycList command;
          if (trace > API_TRACE_NONE) {
            Log.current.println(
                    "Closing server's api response socket associated with uuid: " + uuid);
          }
          command = new CycList();
          command.add(CycObjectFactory.makeCycSymbol(
                  "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT"));
          command.add(uuid);
          try {
            cfaslOutputStream.writeObject(command);
            cfaslOutputStream.flush();
          } catch (Exception e) {
            Log.current.printStackTrace(e);
            Log.current.println(
                    "Error closing server's api response socket " + e.getMessage());
          }
          if (trace > API_TRACE_NONE) {
            Log.current.println(
                    "Sending API-QUIT to server that will close its api request socket and its handling thread");
          }
          command = new CycList();
          command.add(CycObjectFactory.makeCycSymbol("API-QUIT"));

          try {
            cfaslOutputStream.writeObject(command);
            cfaslOutputStream.flush();
          } catch (Exception e) {
            Log.current.printStackTrace(e);
            Log.current.println(
                    "Error quitting the api connection " + e.getMessage());
          }
        }
      }
      /*
      if (cfaslInputStream != null) {
        if (trace > API_TRACE_NONE) {
          Log.current.println("Closing cfaslInputStream");
        }

        try {
          cfaslInputStream.close();
        } catch (Exception e) {
          Log.current.printStackTrace(e);
          Log.current.println(
                  "Error finalizing the api connection " + e.getMessage());
        }
      }*/

      if (cfaslSocket != null) {
        if (trace > API_TRACE_NONE) {
          Log.current.println("Closing cfaslSocket");
        }

        try {
          cfaslSocket.close();
        } catch (Exception e) {
          Log.current.printStackTrace(e);
          Log.current.println(
                  "Error closing the api connection " + e.getMessage());
        }
      }

      taskProcessingEnded = true;

      if (trace > API_TRACE_NONE) {
        Log.current.println("Interrupting any threads awaiting replies");
      }

      interruptAllWaitingReplyThreads();

      try {
        for (Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerMap.entrySet()) {

          kv.getValue().interrupt();
          kv.getValue().close();
          if (trace > API_TRACE_NONE) {
            Log.current.println(
                    "Waiting at most 500 milliseconds for the taskProcessorBinaryResponseHandler thread to die");
          }

          kv.getValue().join(500);

          if (!taskProcessingThreadDead) {
            if (trace > API_TRACE_NONE) {
              Log.current.println(
                      "The taskProcessorBinaryResponseHandler thread has not died, so continuing");
            }
          }
        }

        for (Map.Entry<InputStream, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerCommMap.entrySet()) {

          kv.getValue().interrupt();
          kv.getValue().close();
          if (trace > API_TRACE_NONE) {
            Log.current.println(
                    "Waiting at most 500 milliseconds for the taskProcessorBinaryResponseHandler thread to die");
          }

          kv.getValue().join(500);

          if (!taskProcessingThreadDead) {
            if (trace > API_TRACE_NONE) {
              Log.current.println(
                      "The taskProcessorBinaryResponseHandler thread has not died, so continuing");
            }
          }
        }

      } catch (Exception e) {
      }
      
      try {
        if (this.comm != null) {
          this.comm.close();
        }
      } catch (IOException ex) {
        Logger.getLogger(CycConnection.class.getName()).log(Level.SEVERE, null, ex);
      }
      if (trace > API_TRACE_NONE) {
        Log.current.println("Connection closed for " + connectionInfo());
      }
    } finally {
      isClosed = true;
    }

  }

  /**
   * Return the name of the host to which the CycConnection is established.
   *
   * @return the name of the Host to which this <tt>CycConnection</tt> is connected.
   */
  @Override
  public String getHostName() {
    return this.hostName;
  }

  /**
   * Return the base port to which the CycConnection is established.
   *
   * @return the port to which this <tt>CycConnection</tt> is connected.
   */
  @Override
  public int getBasePort() {
    return this.basePort;
  }

  /**
   * Return the http port of the Cyc server to which the CycConnection is established.
   *
   * @return the http port of the server to which this <tt>CycConnection</tt> is connected.
   */
  @Override
  public int getHttpPort() {
    return this.basePort + HTTP_PORT_OFFSET;
  }

  /**
   * Return the CFASL port to which the CycConnection is established.
   *
   * @return the CFASL port to which this <tt>CycConnection</tt> is connected.
   */
  public int getCfaslPort() {
    return this.cfaslPort;
  }

  /**
   * Send a message to Cyc and return the <tt>Boolean</tt> true as the first element of an object
   * array, and the cyc response Symbolic Expression as the second element. If an error occurs
   * the first element is <tt>Boolean</tt> false and the second element is the error message
   * string.
   *
   * @param message the api command
   *
   * @return an array of two objects, the first is an response status object either a Boolean
   * (binary mode) or Integer (ascii mode), and the second is the response object or error
   * string.
   *
   * @throws IOException when a commuications error occurs
   * @throws CycApiException when a Cyc API error occurs
   */
  public Object[] converse(Object message)
          throws IOException, CycApiException {
    return converse(message,
            notimeout);
  }

  /**
   * Send a message to Cyc and return the response code as the first element of an object array,
   * and the cyc response Symbolic Expression as the second element, spending no less time than
   * the specified timer allows but throwing a
   * <code>TimeOutException</code> at the first
   * opportunity where that time limit is exceeded. If an error occurs the second element is the
   * error message string.
   *
   * @param message the api command which must be a String or a CycList
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   *
   * @return an array of two objects, the first is a Boolean response status object, and the second
   * is the response object or error string.
   *
   * @throws IOException when a communications error occurs
   * @throws TimeOutException when the time limit is exceeded
   * @throws CycApiException when a Cyc api error occurs
   * @throws RuntimeException if CycAccess is not present
   */
  public Object[] converse(Object message,
          Timer timeout)
          throws IOException, TimeOutException, CycApiException {
    CycList messageCycList;
    if (message instanceof CycList) {
      messageCycList = (CycList) message;
    } else if (message instanceof String) {
      if (cycAccess == null) {
        throw new RuntimeException(
                "CycAccess is required to process commands in string form");
      }
      messageCycList = cycAccess.makeCycList((String) message);
    } else {
      throw new CycApiException("Invalid class for message " + message);
    }
    messageCycList = substituteForBackquote(messageCycList,
            timeout);
    return converseBinary(messageCycList, timeout);
  }

  /**
   * Substitute a READ-FROM-STRING expression for expressions directly containing a backquote
   * symbol. This transformation is only required for the binary api, which does not parse the
   * backquoted expression.
   *
   * @param messageCycList the given expression
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   *
   * @return the expression with a READ-FROM-STRING expression substituted for expressions directly
   * containing a backquote symbol
   *
   * @throws IOException when a communication error occurs
   * @throws CycApiException when a Cyc api error occurs
   */
  protected CycList substituteForBackquote(CycList messageCycList,
          Timer timeout)
          throws IOException, CycApiException {
    if (messageCycList.treeContains(CycObjectFactory.backquote)) {
      CycList substituteCycList = new CycList();
      substituteCycList.add(CycObjectFactory.makeCycSymbol("read-from-string"));
      String tempString = messageCycList.cyclify();
      tempString = tempString.replaceAll("\\|\\,\\|", ",");
      substituteCycList.add(tempString);
      Object[] response = converseBinary(substituteCycList,
              timeout);
      if ((response[0].equals(Boolean.TRUE)) && (response[1] instanceof CycList)) {
        CycList backquoteExpression = (CycList) response[1];
        return backquoteExpression.subst(CycObjectFactory.makeCycSymbol(
                "api-bq-list"),
                CycObjectFactory.makeCycSymbol("bq-list"));
      }
      throw new CycApiException("Invalid backquote substitution in " + messageCycList
              + "\nstatus" + response[0] + "\nmessage " + response[1]);
    }
    return messageCycList;
  }

  @Override
  public void setupNewCommConnection(InputStream is) throws IOException, UnknownHostException, CycApiException {
    initializeConcurrentProcessing(is);
    connectionTimer.isCycConnectionEstablished = true;
  }

    @Override
    public boolean connectedToStaticCyc() {
        return (comm == null);
    }

  protected class WaitingWorkerInfo {

    final SubLWorker worker;
    final boolean isReturnWholeTaskProcessorResponse;
    final CycList taskProcessorRequest;

    WaitingWorkerInfo(final SubLWorker worker,
            final CycList taskProcessorRequest,
            final boolean isReturnWholeTaskProcessorResponse) {
      this.worker = worker;
      this.taskProcessorRequest = taskProcessorRequest;
      this.isReturnWholeTaskProcessorResponse = isReturnWholeTaskProcessorResponse;
    }

    SubLWorker getWorker() {
      return worker;
    }

    CycObject getMessage() {
      return (CycObject) taskProcessorRequest.get(1);
    }
  }

  /**
   * Send a message to Cyc and return the response code as the first element of an object array,
   * and the cyc response Symbolic Expression as the second element, spending no less time than
   * the specified timer allows but throwing a
   * <code>TimeOutException</code> at the first
   * opportunity where that time limit is exceeded. If an error occurs the second element is the
   * error message string. The concurrent mode of Cyc server communication is supported by Cyc's
   * pool of transaction processor threads, each of which can concurrently process an api request.
   *
   * @param message the api command
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   *
   * @return an array of two objects, the first is an Boolean response code, and the second is the
   * response object or error string.
   *
   * @throws IOException when a communication error occurs
   * @throws TimeOutException when the time limit is exceeded
   * @throws CycApiException when a Cyc api error occurs
   */
  @Override
  public Object[] converseBinary(CycList message, Timer timeout) throws IOException, TimeOutException, CycApiException {
    DefaultSubLWorkerSynch worker = new DefaultSubLWorkerSynch(message,
            cycAccess,
            timeout.getAllotedMSecs());
    Object[] result = new Object[2];
    try {
      result[1] = worker.getWork();
    } catch (IOException xcpt) {
      throw xcpt;
    } catch (TimeOutException xcpt) {
      throw xcpt;
    } catch (CycApiServerSideException xcpt) {
      // @note: this implements a legacy API of converseBinary()
      result[0] = Boolean.FALSE;
      result[1] = xcpt;
      return result;
    } catch (CycApiException xcpt) {
      throw xcpt;
    } catch (RuntimeException re) {
      throw re;
    } catch (Exception xcpt) {
      throw new RuntimeException(xcpt);
    }
    result[0] = worker.getStatus() == FINISHED_STATUS ? Boolean.TRUE : Boolean.FALSE;
    return result;
  }

  public void cancelCommunication(SubLWorker worker) throws java.io.IOException {
    Integer id = worker.getId();
    if (id.intValue() < 0) {
      //@note serial communications cannot be canceled right now
      return;
    }
    String command = "(fif (" + "terminate-active-task-process" + " " + worker.getId() + " \"" + uuid + "\" " + ":cancel"
            + ") '(ignore) '(ignore))";
    sendBinary(cycAccess.makeCycList(command));
    // the SubL implementation of CANCEL will send a CANCEL event back,
    // which will cleanup the waiting thread info and signal the termination
    // event, so no need to perform event signaling and cleanup
  }

  public void abortCommunication(SubLWorker worker) throws java.io.IOException {
    Integer id = worker.getId();
    if (id.intValue() < 0) {
      //@note serial communications cannot be canceled right now
      return;
    }
    try {
      String command = "(fif (" + "terminate-active-task-process" + " " + worker.getId() + " \"" + uuid + "\" " + ":abort"
              + ") '(ignore) '(ignore))";
      sendBinary(cycAccess.makeCycList(command));
    } finally {
      // the SubL implementation of ABORT will not send anything back,
      // so we do need to perform event signaling and cleanup
      worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker,
              ABORTED_STATUS, null));
      waitingReplyThreads.remove(id);
    }
  }

  public static boolean inAWTEventThread() {
    try {
      return javax.swing.SwingUtilities.isEventDispatchThread();
    } catch (Throwable e) {
      return false;
    }
  }

  /**
   * Send a message to Cyc spending no less time than the specified timer allows but throwing a
   * <code>TimeOutException</code>
   * at the first opportunity where that time limit is exceeded. The concurrent mode of Cyc server communication
   * is supported by Cyc's pool of transaction processor threads, each of which can concurrently process an api request. The
   * SubLWorker object notifies the caller when the api response is asychronously received.
   *
   * @param worker a <tt>SubLWorker</tt> object that notifies the caller when work is done
   *
   * @throws IOException when a communication error occurs
   * @throws TimeOutException when the time limit is exceeded
   * @throws CycApiException when a Cyc api error occurs
   */
  public void converseBinary(final SubLWorker worker)
          throws IOException, TimeOutException, CycApiException {
    logger.finest("API request: " + worker.toString());
    if (cycAccess.isClosed() || taskProcessingThreadDead) {
      throw new CycApiClosedConnectionException(
              "Attempt to communicate to Cyc using a closed connection (" + cycAccess.getHostName() + ":" + cycAccess.getBasePort() + ")");
    }
    /*if ((!worker.shouldIgnoreInvalidLeases()) && (!cycAccess.hasValidLease())) {
     throw new CycApiException("Attempt to communicate to Cyc using a connection with an invalid lease." +
     "\nSubLCommand: " + worker.getSubLCommandCycList().toPrettyCyclifiedString(""));
     }*/
    //System.out.println("worker: " + worker);
    if ((worker instanceof SubLWorkerSynch) && inAWTEventThread()) {
      throw new CycApiException("Invalid attempt to synchronously communicate with Cyc "
              + "from the AWT event thread.\n\n" + worker);
    }
    CycSymbol taskProcessorRequestSymbol = CycObjectFactory.makeCycSymbol(
            "task-processor-request");
    Integer id = null;
    CycList taskProcessorRequest = null;
    boolean isReturnWholeTaskProcessorResponse = false;
    CycList subLCommand = worker.getSubLCommand();
    final Integer priority = worker.getPriority();
    if (subLCommand.first().equals(CycObjectFactory.makeCycSymbol(
            "return-whole-task-processor-response"))) {
      isReturnWholeTaskProcessorResponse = true;
      subLCommand = (CycList) subLCommand.second();
    }
    if (subLCommand.first().equals(taskProcessorRequestSymbol)) {
      // client has supplied the task-processor-request form
      taskProcessorRequest = subLCommand;
      id = (Integer) subLCommand.third();
      taskProcessorRequest.set(6, uuid.toString());  // override the uuid to identify this client
    } else {
      id = nextApiRequestId();
      taskProcessorRequest = new CycList();
      taskProcessorRequest.add(taskProcessorRequestSymbol); // function
      taskProcessorRequest.add(subLCommand); // request
      taskProcessorRequest.add(id); // id
      taskProcessorRequest.add(clampPriority(priority)); // priority
      taskProcessorRequest.add(myClientName); // requestor
      taskProcessorRequest.add(CycObjectFactory.nil); // client-bindings
      taskProcessorRequest.add(uuid.toString()); // uuid to identify this client
    }
    final CycList actualRequest = (CycList) taskProcessorRequest.get(1);
    if (actualRequest.toString().startsWith(
            "(FIF (TERMINATE-ACTIVE-TASK-PROCESS ")) {
      // override the uuid used to identify this client
      // (fif (terminate-active-task-process id uuid :cancel) (quote (ignore)) (quote (ignore)))
      final CycList temp = (CycList) actualRequest.second();
      temp.set(2, uuid.toString());
    }
    logger.finest("taskProcessorRequest: " + taskProcessorRequest.toPrettyCyclifiedString(
            ""));
    WaitingWorkerInfo waitingWorkerInfo = new WaitingWorkerInfo(worker,
            taskProcessorRequest, isReturnWholeTaskProcessorResponse);
    // tell everyone this is getting started
    waitingReplyThreads.put(id, waitingWorkerInfo);
    SubLWorkerEvent event = new SubLWorkerEvent(worker, id);
    worker.fireSubLWorkerStartedEvent(event);
    //start communication
    sendBinary(taskProcessorRequest);
  }

  static public Integer clampPriority(Integer priority) {
    if (priority.intValue() > MAX_PRIORITY.intValue()) {
      priority = MAX_PRIORITY;
    } else if (priority.intValue() < MIN_PRIORITY.intValue()) {
      priority = MIN_PRIORITY;
    }
    return priority;
  }

  public boolean isClosed() {
    return isClosed;
  }

  /**
   * Returns the next apiRequestId.
   *
   * @return the next apiRequestId
   */
  static public synchronized Integer nextApiRequestId() {
    return new Integer(++apiRequestId);
  }

  /**
   * Sends an object to the CYC server. If the connection is not already open, it is opened. The
   * object must be a valid CFASL-translatable: an Integer, Float, Double, Boolean, String, or cyc
   * object.
   *
   * @param message the api command
   *
   * @throws IOException when a communication error occurs
   */
  public synchronized void sendBinary(Object message)
          throws IOException {
    if (trace >= API_TRACE_MESSAGES) {
      Log.current.println(
              df.format(new Date()) + "\n    Sending request: " + message + " to connection: " + this);
    }
    if (logger.isLoggable(Level.FINE)) {
      logger.fine("sendBinary: " + DefaultCycObject.stringApiValue(message));
    }

    if (this.comm == null) {
      cfaslOutputStream.writeObject(message);
      cfaslOutputStream.flush();
    } else {
      ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
      CfaslOutputStream cfo = new CfaslOutputStream(baos);
      cfo.writeObject(message);
      cfo.flush();
      
      // Catching CommException and throwing an IO to avoid adding CommException in all upper level methods
      try {
          InputStream cisLocal = comm.sendRequest(baos.toByteArray(), 
            comm.makeRequestSummary(message.toString()), Comm.RequestType.NORMAL);
      } catch (CommException e) {
        throw new IOException(e);
      }
    }
  }

  /**
   * Receives an object from the CYC server.
   *
   * @return an array of three objects, the first is a Boolean response, the second is the
   * response object or error string, and the third is an indication that the otherwise
   * good response contains an invalid object.
   *
   * @throws IOException when a communications error occurs
   * @throws CycApiException when a Cyc API error occurs
   */
  /*
  public synchronized Object[] receiveBinary()
          throws IOException, CycApiException {
    cfaslInputStream.resetIsInvalidObject();
    final Object status = cfaslInputStream.readObject();
    cfaslInputStream.resetIsInvalidObject();
    final Object response = cfaslInputStream.readObject();
    final Object[] answer = {null, null, null};
    answer[1] = response;
    // TODO handle the invalid object in the callers of this seldom-used method.
    answer[2] = new Boolean(cfaslInputStream.isInvalidObject());
    if ((status == null) || status.equals(CycObjectFactory.nil)) {
      answer[0] = Boolean.FALSE;

      if (trace > API_TRACE_NONE) {
        final String responseString = response.toString();
        Log.current.println(
                "received error = (" + status + ") " + responseString);
      }
      return answer;
    }
    answer[0] = Boolean.TRUE;
    return answer;
  }*/

  /**
   * Receives a binary (cfasl) api request from a cyc server. Unlike the api response handled by
   * the receiveBinary method, this method does not expect an input status object.
   *
   * @return the api request expression.
   *
   * @throws IOException when a communication error occurs
   * @throws CycApiException when a Cyc API exception occurs
   */
  /*
  public synchronized CycList receiveBinaryApiRequest()
          throws IOException, CycApiException {
    cfaslInputStream.resetIsInvalidObject();
    CycList apiRequest = (CycList) cfaslInputStream.readObject();
    return apiRequest;
  }*/

    
  /**
   * Sends a binary (cfasl) api response to a cyc server. This method prepends a status object
   * (the symbol T) to the message.
   *
   * @param message the given binary api response
   *
   * @throws IOException when a communication error occurs
   * @throws CycApiException when a Cyc API error occurs
   */  
  public synchronized void sendBinaryApiResponse(Object message)
          throws IOException, CycApiException {
    CycList apiResponse = new CycList();
    apiResponse.add(CycObjectFactory.t);
    apiResponse.add(message);
    if (comm == null) {
      cfaslOutputStream.writeObject(apiResponse);
      cfaslOutputStream.flush();
    } else {
      ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
      CfaslOutputStream cfo = new CfaslOutputStream(baos);
      cfo.writeObject(message);
      cfo.flush();

      try {
        InputStream cisLocal = comm.sendRequest(baos.toByteArray(), 
            comm.makeRequestSummary(message.toString()), Comm.RequestType.NORMAL);
      } catch (Exception e) {
        throw new IOException(e);
      }
    }
  }

  /**
   * Turns on the diagnostic trace of socket messages.
   */
  public void traceOn() {
    trace = API_TRACE_MESSAGES;
//    cfaslInputStream.trace = trace;
    if (this.comm == null) {
      cfaslOutputStream.trace = trace;
    }
  }

  /**
   * Turns on the detailed diagnostic trace of socket messages.
   */
  public void traceOnDetailed() {
    setTrace(API_TRACE_DETAILED);
  }

  /**
   * Turns off the diagnostic trace of socket messages.
   */
  public void traceOff() {
    setTrace(API_TRACE_NONE);
  }

  /**
   * Returns the trace value.
   *
   * @return the trace value
   */
  public int getTrace() {
    return trace;
  }

  /**
   * Sets the socket messages diagnostic trace value.
   *
   * @param trace the new socket messages diagnostic trace value
   */
  public void setTrace(int trace) {
    this.trace = trace;
//    cfaslInputStream.trace = trace;
    if (this.comm == null) {
      cfaslOutputStream.trace = trace;
    }
    for (Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerMap.entrySet()) {
      if (kv.getValue() != null) {
        kv.getValue().inboundStream.trace = trace;
      }
    }
  }

  /** Answers true iff this is a valid binary (cfasl) connection to Cyc.
   *
   * @return true iff this is a valid binary (cfasl) connection to Cyc
   */
  public boolean isValidBinaryConnection() {
    return isValidBinaryConnection(false);
  }

  /** Answers true iff this is a valid binary (cfasl) connection to Cyc.
   *
   * @param isQuiet the indicator for no informational logging
   * @return true iff this is a valid binary (cfasl) connection to Cyc
   */
  public boolean isValidBinaryConnection(final boolean isQuiet) {
    if (comm != null){
      return true;
    }
    
    if (cfaslSocket == null) {
      if (!isQuiet) {
        Log.current.println(
                "Invalid binary connection because cfaslSocket is null");
      }
      return false;
    }

    if (!cfaslSocket.isConnected()) {
      if (!isQuiet) {
        Log.current.println(
                "Invalid binary connection because cfaslSocket is not connected");
      }
      return false;
    }
    
    for (Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : taskProcessorBinaryResponseHandlerMap.entrySet()) {

      if ((kv.getValue() == null)
              || (kv.getValue().inboundSocket == null)) {
        if (!isQuiet) {
          Log.current.println(
                  "Invalid binary connection because taskProcessorBinaryResponseHandler.inboundSocket is null");
        }
        return false;
      }
      if (!kv.getValue().inboundSocket.isConnected()) {
        if (!isQuiet) {
          Log.current.println(
                  "Invalid binary connection because taskProcessorBinaryResponseHandler.inboundSocket is not connected");
        }
        return false;
      }
    }
    return true;
  }

  /**
   * Returns connection information, suitable for diagnostics.
   *
   * @return connection information, suitable for diagnostics
   */
  public String connectionInfo() {
    return "host " + hostName + ", cfaslPort " + cfaslPort;
  }

  /**
   * Gets the UUID that identifies this java api client connection.
   *
   * @return the UUID that identifies this java api client connection
   */
  @Override
  public UUID getUuid() {
    return uuid;
  }

  /**
   * Sets the client name of this api connection.
   *
   * @param myClientName the client name of this api connection
   */
  public void setMyClientName(String myClientName) {
    this.myClientName = myClientName;
  }

  /**
   * Gets the client name of this api connection.
   *
   * @return the client name of this api connection
   */
  public String getMyClientname() {
    return myClientName;
  }

  /**
   * Recovers from a socket error by interrupting all the waiting reply threads. Each awakened
   * thread will detect the error condition and throw an IOExecption.
   */
  protected void interruptAllWaitingReplyThreads() {
    Iterator iter = waitingReplyThreads.values().iterator();

    synchronized (waitingReplyThreads) {
      while (iter.hasNext()) {
        WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) iter.next();
        if (trace > API_TRACE_NONE) {
          Log.current.println(
                  "Interrupting reply worker " + waitingWorkerInfo.getWorker());
        }
        try {
          waitingWorkerInfo.worker.cancel();
        } catch (java.io.IOException xcpt) {
          if (trace > API_TRACE_NONE) {
            Log.current.println(
                    "Could not interrupt reply worker " + waitingWorkerInfo.getWorker() + ": exception: " + xcpt);
          }
        }
      }
    }
  }

  /**
   * Recovers from a socket error by interrupting all the waiting reply threads. Each awakened
   * thread will detect the error condition and throw an IOExecption.
   */
  protected synchronized void forciblyUnblockAllWaitingWorkers(Exception e) {
    Iterator iter = waitingReplyThreads.values().iterator();
    if (e == null) {
      e = new CfaslInputStreamClosedException(
              "Communications terminated with Cyc.");
    }
    synchronized (waitingReplyThreads) {
      while (iter.hasNext()) {
        WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) iter.next();
        if (trace > API_TRACE_NONE) {
          Log.current.println(
                  "Interrupting reply worker " + waitingWorkerInfo.getWorker());
        }
        SubLWorkerEvent event = new SubLWorkerEvent(
                waitingWorkerInfo.getWorker(),
                SubLWorkerStatus.EXCEPTION_STATUS, e);
        waitingWorkerInfo.worker.fireSubLWorkerTerminatedEvent(event);
        iter.remove();
      }
    }
  }

  /**
   * Resets the Cyc task processor which is currently processing the api-request specified by the
   * given id. If none of the task processors is currently processessing the specified
   * api-request, then the reset request is ignored. When reset, the Cyc task processor returns
   * an error message to the waiting client thread. The error message consists of
   * "reset\nTHE-API-REQUEST".
   *
   * @param id the id of the api-request which is to be interrupted and cancelled
   *
   * @throws CycApiException when a Cyc API error occurs
   * @throws IOException when a communication error occurs
   */
  public void resetTaskProcessorById(Integer id)
          throws CycApiException, IOException {
    resetTaskProcessorById(id.intValue());
  }

  /**
   * Resets the Cyc task processor which is currently processing the api-request specified by the
   * given id. If none of the task processors is currently processessing the specified
   * api-request, then the reset request is ignored. When reset, the Cyc task processor returns
   * an error message to the waiting client thread.
   *
   * @param id the id of the api-request which is to be interrupted and cancelled
   *
   * @throws CycApiException when a Cyc API error occurs
   * @throws IOException when a communications error occurs
   */
  public void resetTaskProcessorById(int id)
          throws CycApiException, IOException {
    String command = makeSubLStmt("reset-api-task-processor-by-id", myClientName,
            id);
    cycAccess.converseCycObject(command);
  }
  public static final DateFormat df = DateFormat.getDateTimeInstance();
  public ApiThreadPool apiPool = new ApiThreadPool();
}
