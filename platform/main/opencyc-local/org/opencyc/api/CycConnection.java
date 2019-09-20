package org.opencyc.api;

import org.opencyc.cycobject.CycObject;
import org.opencyc.comm.CommException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import org.opencyc.cycobject.DefaultCycObject;
import java.util.Date;
import org.opencyc.cycobject.CycSymbol;
import javax.swing.SwingUtilities;
import org.opencyc.util.TimeOutException;
import java.util.Iterator;
import java.util.logging.Level;
import org.opencyc.cycobject.CycList;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.io.IOException;
import org.opencyc.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.text.DateFormat;
import java.util.logging.Logger;
import java.util.UUID;
import java.io.InputStream;
import java.util.Map;
import org.opencyc.comm.Comm;
import org.opencyc.util.Timer;
import java.net.Socket;

public class CycConnection implements CycConnectionInterface {
	public static String DEFAULT_HOSTNAME;
	public static final int DEFAULT_BASE_PORT = 3600;
	public static final int HTTP_PORT_OFFSET = 2;
	public static final int WEBAPP_PORT_OFFSET = 3;
	public static final int CFASL_PORT_OFFSET = 14;
	public static final int API_TRACE_NONE = 0;
	public static final int API_TRACE_MESSAGES = 1;
	public static final int API_TRACE_DETAILED = 2;
	protected int trace;
	public static final int BINARY_MODE = 2;
	protected CfaslInputStream cfaslInputStream;
	protected CfaslOutputStream cfaslOutputStream;
	protected String hostName;
	protected int basePort;
	protected int cfaslPort;
	protected Socket cfaslSocket;
	protected static final Timer notimeout;
	protected boolean isSymbolicExpression;
	protected CycAccess cycAccess;
	protected Comm comm;
	private static int apiRequestId;
	private volatile boolean isClosed;
	public static final Integer MAX_PRIORITY;
	public static final Integer CRITICAL_PRIORITY;
	public static final Integer NORMAL_PRIORITY;
	public static final Integer BACKGROUND_PRIORITY;
	public static final Integer MIN_PRIORITY;
	public static final int DEFAULT_PRIORITY;
	protected String myClientName;
	private final Map waitingReplyThreads;
	final ConnectionTimer connectionTimer;
	protected Map<String, TaskProcessorBinaryResponseHandler> taskProcessorBinaryResponseHandlerMap;
	protected Map<InputStream, TaskProcessorBinaryResponseHandler> taskProcessorBinaryResponseHandlerCommMap;
	protected Map<String, CycLeaseManager> cycLeaseManagerMap;
	protected Map<InputStream, CycLeaseManager> cycLeaseManagerCommMap;
	protected boolean taskProcessingEnded;
	protected volatile boolean taskProcessingThreadDead;
	protected UUID uuid;
	protected final Logger logger;
	public static final DateFormat df;
	public ApiThreadPool apiPool;

	public Map getWaitingReplyThreads() {
		return this.waitingReplyThreads;
	}

	public CycConnection(final Socket cfaslSocket) throws IOException {
		this.trace = 0;
		this.isSymbolicExpression = false;
		this.isClosed = false;
		this.myClientName = "api client";
		this.waitingReplyThreads = Collections.synchronizedMap(new HashMap<Object, Object>());
		this.connectionTimer = new ConnectionTimer(this);
		this.taskProcessorBinaryResponseHandlerMap = new HashMap<String, TaskProcessorBinaryResponseHandler>(32);
		this.taskProcessorBinaryResponseHandlerCommMap = new HashMap<InputStream, TaskProcessorBinaryResponseHandler>(32);
		this.cycLeaseManagerMap = new HashMap<String, CycLeaseManager>(32);
		this.cycLeaseManagerCommMap = new HashMap<InputStream, CycLeaseManager>(32);
		this.taskProcessingEnded = false;
		this.taskProcessingThreadDead = false;
		this.apiPool = new ApiThreadPool();
		if (Log.current == null) {
			Log.makeLog("cyc-api.log");
		}
		this.logger = Logger.getLogger("org.opencyc.CycConnection");
		this.cfaslSocket = cfaslSocket;
		this.hostName = cfaslSocket.getInetAddress().getHostName();
		this.basePort = cfaslSocket.getPort() - 14;
		this.cycAccess = null;
		this.cfaslOutputStream = new CfaslOutputStream(cfaslSocket.getOutputStream());
		this.cfaslOutputStream.trace = this.trace;
	}

	public CycConnection() throws IOException, UnknownHostException, CycApiException {
		this(CycConnection.DEFAULT_HOSTNAME, 3600, null);
	}

	public CycConnection(final CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException {
		this(CycConnection.DEFAULT_HOSTNAME, 3600, cycAccess);
	}

	public CycConnection(final String hostName, final int basePort, final CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException {
		this.trace = 0;
		this.isSymbolicExpression = false;
		this.isClosed = false;
		this.myClientName = "api client";
		this.waitingReplyThreads = Collections.synchronizedMap(new HashMap<Object, Object>());
		this.connectionTimer = new ConnectionTimer(this);
		this.taskProcessorBinaryResponseHandlerMap = new HashMap<String, TaskProcessorBinaryResponseHandler>(32);
		this.taskProcessorBinaryResponseHandlerCommMap = new HashMap<InputStream, TaskProcessorBinaryResponseHandler>(32);
		this.cycLeaseManagerMap = new HashMap<String, CycLeaseManager>(32);
		this.cycLeaseManagerCommMap = new HashMap<InputStream, CycLeaseManager>(32);
		this.taskProcessingEnded = false;
		this.taskProcessingThreadDead = false;
		this.apiPool = new ApiThreadPool();
		if (Log.current == null) {
			Log.makeLog("cyc-api.log");
		}
		this.logger = Logger.getLogger("org.opencyc.CycConnection");
		this.hostName = hostName;
		this.basePort = basePort;
		this.cfaslPort = basePort + 14;
		this.connectionTimer.start();
		this.cycAccess = cycAccess;
		this.initializeApiConnections();
		if (this.trace > 0) {
			Log.current.println("CFASL connection " + this.cfaslSocket);
		}
		this.uuid = UUID.randomUUID();
		this.initializeConcurrentProcessing();
		this.connectionTimer.isCycConnectionEstablished = true;
	}

	public CycConnection(final Comm comm, final CycAccess cycAccess) throws IOException, UnknownHostException, CycApiException {
		this.trace = 0;
		this.isSymbolicExpression = false;
		this.isClosed = false;
		this.myClientName = "api client";
		this.waitingReplyThreads = Collections.synchronizedMap(new HashMap<Object, Object>());
		this.connectionTimer = new ConnectionTimer(this);
		this.taskProcessorBinaryResponseHandlerMap = new HashMap<String, TaskProcessorBinaryResponseHandler>(32);
		this.taskProcessorBinaryResponseHandlerCommMap = new HashMap<InputStream, TaskProcessorBinaryResponseHandler>(32);
		this.cycLeaseManagerMap = new HashMap<String, CycLeaseManager>(32);
		this.cycLeaseManagerCommMap = new HashMap<InputStream, CycLeaseManager>(32);
		this.taskProcessingEnded = false;
		this.taskProcessingThreadDead = false;
		this.apiPool = new ApiThreadPool();
		this.uuid = UUID.randomUUID();
		if (Log.current == null) {
			Log.makeLog("cyc-api.log");
		}
		this.logger = Logger.getLogger("org.opencyc.CycConnection");
		this.comm = comm;
		this.connectionTimer.start();
		this.cycAccess = cycAccess;
		if (this.trace > 0) {
			Log.current.println("CFASL connection " + this.cfaslSocket);
		}
	}

	public int getConnectionType() {
		return 2;
	}

	private void initializeApiConnections() throws IOException, UnknownHostException {
		try {
			this.cfaslSocket = new Socket(this.hostName, this.cfaslPort);
			final int val = this.cfaslSocket.getReceiveBufferSize();
			this.cfaslSocket.setReceiveBufferSize(val * 2);
			this.cfaslSocket.setTcpNoDelay(true);
			this.cfaslSocket.setKeepAlive(true);
			this.cfaslInputStream = new CfaslInputStream(this.cfaslSocket.getInputStream());
			this.cfaslInputStream.trace = this.trace;
			this.cfaslOutputStream = new CfaslOutputStream(this.cfaslSocket.getOutputStream());
			this.cfaslOutputStream.trace = this.trace;
		} catch (ConnectException ex) {
			throw new IOException("Couldn't connect to " + this.hostName + ":" + this.cfaslPort, ex);
		}
	}

	public void initializeConcurrentProcessing() throws IOException, UnknownHostException, CycApiException {
		this.initializeConcurrentProcessing(this.hostName, this.cfaslPort);
	}

	protected void initializeConcurrentProcessing(final InputStream is) throws IOException, UnknownHostException, CycApiException {
		final TaskProcessorBinaryResponseHandler handler = new TaskProcessorBinaryResponseHandler(Thread.currentThread(), this, is);
		this.taskProcessorBinaryResponseHandlerCommMap.put(is, handler);
		handler.start();
		handler.waitOnSetupToComplete();
		final CycLeaseManager lease = new CycLeaseManager(this);
		lease.start();
		this.cycLeaseManagerCommMap.put(is, lease);
	}

	protected void initializeConcurrentProcessing(final String hostName, final int cfaslPort) throws IOException, UnknownHostException, CycApiException {
		if (this.comm != null) {
			return;
		}
		final String key = hostName + Integer.toString(cfaslPort);
		TaskProcessorBinaryResponseHandler handler = null;
		this.taskProcessorBinaryResponseHandlerMap.put(key, handler = new TaskProcessorBinaryResponseHandler(Thread.currentThread(), this, hostName, cfaslPort));
		handler.start();
		handler.waitOnSetupToComplete();
		final CycLeaseManager lease = new CycLeaseManager(this);
		lease.start();
		this.cycLeaseManagerMap.put(key, lease);
	}

	public Map<String, CycLeaseManager> getCycLeaseManagerMap() {
		return this.cycLeaseManagerMap;
	}

	public void setCycLeaseManagerMap(final Map<String, CycLeaseManager> cycLeaseManagerMap) {
		this.cycLeaseManagerMap = cycLeaseManagerMap;
	}

	public Map<InputStream, CycLeaseManager> getCycLeaseManagerCommMap() {
		return this.cycLeaseManagerCommMap;
	}

	public void setCycLeaseManagerCommMap(final Map<InputStream, CycLeaseManager> cycLeaseManagerCommMap) {
		this.cycLeaseManagerCommMap = cycLeaseManagerCommMap;
	}

	@Override
	protected void finalize() {
		this.close();
	}

	public synchronized void close() {
		if (this.isClosed) {
			return;
		}
		this.isClosed = true;
		for (final Map.Entry<String, CycLeaseManager> kv : this.cycLeaseManagerMap.entrySet()) {
			kv.getValue().interrupt();
		}
		for (final Map.Entry<InputStream, CycLeaseManager> kv2 : this.cycLeaseManagerCommMap.entrySet()) {
			kv2.getValue().interrupt();
		}
		for (final Map.Entry<String, TaskProcessorBinaryResponseHandler> kv3 : this.taskProcessorBinaryResponseHandlerMap.entrySet()) {
			kv3.getValue().isClosing = true;
		}
		for (final Map.Entry<InputStream, TaskProcessorBinaryResponseHandler> kv4 : this.taskProcessorBinaryResponseHandlerCommMap.entrySet()) {
			kv4.getValue().isClosing = true;
		}
		try {
			if (this.isValidBinaryConnection(true) && this.cfaslOutputStream != null) {
				if (this.trace > 0) {
					Log.current.println("Closing server's api response socket associated with uuid: " + this.uuid);
				}
				CycList command = new CycList();
				command.add((Object) CycObjectFactory.makeCycSymbol("RELEASE-RESOURCES-FOR-JAVA-API-CLIENT"));
				command.add((Object) this.uuid);
				try {
					this.cfaslOutputStream.writeObject((Object) command);
					this.cfaslOutputStream.flush();
				} catch (Exception e) {
					Log.current.printStackTrace(e);
					Log.current.println("Error closing server's api response socket " + e.getMessage());
				}
				if (this.trace > 0) {
					Log.current.println("Sending API-QUIT to server that will close its api request socket and its handling thread");
				}
				command = new CycList();
				command.add((Object) CycObjectFactory.makeCycSymbol("API-QUIT"));
				try {
					this.cfaslOutputStream.writeObject((Object) command);
					this.cfaslOutputStream.flush();
				} catch (Exception e) {
					Log.current.printStackTrace(e);
					Log.current.println("Error quitting the api connection " + e.getMessage());
				}
			}
			if (this.cfaslSocket != null) {
				if (this.trace > 0) {
					Log.current.println("Closing cfaslSocket");
				}
				try {
					this.cfaslSocket.close();
				} catch (Exception e2) {
					Log.current.printStackTrace(e2);
					Log.current.println("Error closing the api connection " + e2.getMessage());
				}
			}
			this.taskProcessingEnded = true;
			if (this.trace > 0) {
				Log.current.println("Interrupting any threads awaiting replies");
			}
			this.interruptAllWaitingReplyThreads();
			try {
				for (final Map.Entry<String, TaskProcessorBinaryResponseHandler> kv3 : this.taskProcessorBinaryResponseHandlerMap.entrySet()) {
					kv3.getValue().interrupt();
					kv3.getValue().close();
					if (this.trace > 0) {
						Log.current.println("Waiting at most 500 milliseconds for the taskProcessorBinaryResponseHandler thread to die");
					}
					kv3.getValue().join(500L);
					if (!this.taskProcessingThreadDead && this.trace > 0) {
						Log.current.println("The taskProcessorBinaryResponseHandler thread has not died, so continuing");
					}
				}
				for (final Map.Entry<InputStream, TaskProcessorBinaryResponseHandler> kv4 : this.taskProcessorBinaryResponseHandlerCommMap.entrySet()) {
					kv4.getValue().interrupt();
					kv4.getValue().close();
					if (this.trace > 0) {
						Log.current.println("Waiting at most 500 milliseconds for the taskProcessorBinaryResponseHandler thread to die");
					}
					kv4.getValue().join(500L);
					if (!this.taskProcessingThreadDead && this.trace > 0) {
						Log.current.println("The taskProcessorBinaryResponseHandler thread has not died, so continuing");
					}
				}
			} catch (Exception ex2) {
			}
			try {
				if (this.comm != null) {
					this.comm.close();
				}
			} catch (IOException ex) {
				Logger.getLogger(CycConnection.class.getName()).log(Level.SEVERE, null, ex);
			}
			if (this.trace > 0) {
				Log.current.println("Connection closed for " + this.connectionInfo());
			}
		} finally {
			this.isClosed = true;
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public int getBasePort() {
		return this.basePort;
	}

	public int getHttpPort() {
		return this.basePort + 2;
	}

	public int getCfaslPort() {
		return this.cfaslPort;
	}

	public Object[] converse(final Object message) throws IOException, CycApiException {
		return this.converse(message, CycConnection.notimeout);
	}

	public Object[] converse(final Object message, final Timer timeout) throws IOException, TimeOutException, CycApiException {
		CycList messageCycList;
		if (message instanceof CycList) {
			messageCycList = (CycList) message;
		} else {
			if (!(message instanceof String)) {
				throw new CycApiException("Invalid class for message " + message);
			}
			if (this.cycAccess == null) {
				throw new RuntimeException("CycAccess is required to process commands in string form");
			}
			messageCycList = this.cycAccess.makeCycList((String) message);
		}
		messageCycList = this.substituteForBackquote(messageCycList, timeout);
		return this.converseBinary(messageCycList, timeout);
	}

	protected CycList substituteForBackquote(final CycList messageCycList, final Timer timeout) throws IOException, CycApiException {
		if (!messageCycList.treeContains((Object) CycObjectFactory.backquote)) {
			return messageCycList;
		}
		final CycList substituteCycList = new CycList();
		substituteCycList.add((Object) CycObjectFactory.makeCycSymbol("read-from-string"));
		String tempString = messageCycList.cyclify();
		tempString = tempString.replaceAll("\\|\\,\\|", ",");
		substituteCycList.add((Object) tempString);
		final Object[] response = this.converseBinary(substituteCycList, timeout);
		if (response[0].equals(Boolean.TRUE) && response[1] instanceof CycList) {
			final CycList backquoteExpression = (CycList) response[1];
			return backquoteExpression.subst((Object) CycObjectFactory.makeCycSymbol("api-bq-list"), (Object) CycObjectFactory.makeCycSymbol("bq-list"));
		}
		throw new CycApiException("Invalid backquote substitution in " + messageCycList + "\nstatus" + response[0] + "\nmessage " + response[1]);
	}

	public void setupNewCommConnection(final InputStream is) throws IOException, UnknownHostException, CycApiException {
		this.initializeConcurrentProcessing(is);
		this.connectionTimer.isCycConnectionEstablished = true;
	}

	public boolean connectedToStaticCyc() {
		return this.comm == null;
	}

	public Object[] converseBinary(final CycList message, final Timer timeout) throws IOException, TimeOutException, CycApiException {
		final DefaultSubLWorkerSynch worker = new DefaultSubLWorkerSynch(message, this.cycAccess, timeout.getAllotedMSecs());
		final Object[] result = new Object[2];
		try {
			result[1] = worker.getWork();
		} catch (IOException xcpt) {
			throw xcpt;
		} catch (TimeOutException xcpt2) {
			throw xcpt2;
		} catch (CycApiServerSideException xcpt3) {
			result[0] = Boolean.FALSE;
			result[1] = xcpt3;
			return result;
		} catch (CycApiException xcpt4) {
			throw xcpt4;
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception xcpt5) {
			throw new RuntimeException(xcpt5);
		}
		result[0] = ((worker.getStatus() == SubLWorkerStatus.FINISHED_STATUS) ? Boolean.TRUE : Boolean.FALSE);
		return result;
	}

	public void cancelCommunication(final SubLWorker worker) throws IOException {
		final Integer id = worker.getId();
		if (id < 0) {
			return;
		}
		final String command = "(fif (terminate-active-task-process " + worker.getId() + " \"" + this.uuid + "\" " + ":cancel" + ") '(ignore) '(ignore))";
		this.sendBinary(this.cycAccess.makeCycList(command));
	}

	public void abortCommunication(final SubLWorker worker) throws IOException {
		final Integer id = worker.getId();
		if (id < 0) {
			return;
		}
		try {
			final String command = "(fif (terminate-active-task-process " + worker.getId() + " \"" + this.uuid + "\" " + ":abort" + ") '(ignore) '(ignore))";
			this.sendBinary(this.cycAccess.makeCycList(command));
		} finally {
			worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.ABORTED_STATUS, (Exception) null));
			this.waitingReplyThreads.remove(id);
		}
	}

	public static boolean inAWTEventThread() {
		try {
			return SwingUtilities.isEventDispatchThread();
		} catch (Throwable e) {
			return false;
		}
	}

	public void converseBinary(final SubLWorker worker) throws IOException, TimeOutException, CycApiException {
		this.logger.finest("API request: " + worker.toString());
		if (this.cycAccess.isClosed() || this.taskProcessingThreadDead) {
			throw new CycApiClosedConnectionException("Attempt to communicate to Cyc using a closed connection (" + this.cycAccess.getHostName() + ":" + this.cycAccess.getBasePort() + ")");
		}
		if (worker instanceof SubLWorkerSynch && inAWTEventThread()) {
			throw new CycApiException("Invalid attempt to synchronously communicate with Cyc from the AWT event thread.\n\n" + worker);
		}
		final CycSymbol taskProcessorRequestSymbol = CycObjectFactory.makeCycSymbol("task-processor-request");
		Integer id = null;
		CycList taskProcessorRequest = null;
		boolean isReturnWholeTaskProcessorResponse = false;
		CycList subLCommand = worker.getSubLCommand();
		final Integer priority = worker.getPriority();
		if (subLCommand.first().equals(CycObjectFactory.makeCycSymbol("return-whole-task-processor-response"))) {
			isReturnWholeTaskProcessorResponse = true;
			subLCommand = (CycList) subLCommand.second();
		}
		if (subLCommand.first().equals(taskProcessorRequestSymbol)) {
			taskProcessorRequest = subLCommand;
			id = (Integer) subLCommand.third();
			taskProcessorRequest.set(6, (Object) this.uuid.toString());
		} else {
			id = nextApiRequestId();
			taskProcessorRequest = new CycList();
			taskProcessorRequest.add((Object) taskProcessorRequestSymbol);
			taskProcessorRequest.add((Object) subLCommand);
			taskProcessorRequest.add((Object) id);
			taskProcessorRequest.add((Object) clampPriority(priority));
			taskProcessorRequest.add((Object) this.myClientName);
			taskProcessorRequest.add((Object) CycObjectFactory.nil);
			taskProcessorRequest.add((Object) this.uuid.toString());
		}
		final CycList actualRequest = (CycList) taskProcessorRequest.get(1);
		if (actualRequest.toString().startsWith("(FIF (TERMINATE-ACTIVE-TASK-PROCESS ")) {
			final CycList temp = (CycList) actualRequest.second();
			temp.set(2, (Object) this.uuid.toString());
		}
		this.logger.finest("taskProcessorRequest: " + taskProcessorRequest.toPrettyCyclifiedString(""));
		final WaitingWorkerInfo waitingWorkerInfo = new WaitingWorkerInfo(worker, taskProcessorRequest, isReturnWholeTaskProcessorResponse);
		this.waitingReplyThreads.put(id, waitingWorkerInfo);
		final SubLWorkerEvent event = new SubLWorkerEvent(worker, id);
		worker.fireSubLWorkerStartedEvent(event);
		this.sendBinary(taskProcessorRequest);
	}

	public static Integer clampPriority(Integer priority) {
		if (priority > CycConnection.MAX_PRIORITY) {
			priority = CycConnection.MAX_PRIORITY;
		} else if (priority < CycConnection.MIN_PRIORITY) {
			priority = CycConnection.MIN_PRIORITY;
		}
		return priority;
	}

	public boolean isClosed() {
		return this.isClosed;
	}

	public static synchronized Integer nextApiRequestId() {
		return new Integer(++CycConnection.apiRequestId);
	}

	public synchronized void sendBinary(final Object message) throws IOException {
		if (this.trace >= 1) {
			Log.current.println(CycConnection.df.format(new Date()) + "\n    Sending request: " + message + " to connection: " + this);
		}
		if (this.logger.isLoggable(Level.FINE)) {
			this.logger.fine("sendBinary: " + DefaultCycObject.stringApiValue(message));
		}
		if (this.comm == null) {
			this.cfaslOutputStream.writeObject(message);
			this.cfaslOutputStream.flush();
		} else {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
			final CfaslOutputStream cfo = new CfaslOutputStream((OutputStream) baos);
			cfo.writeObject(message);
			cfo.flush();
			try {
				final InputStream cisLocal = this.comm.sendRequest(baos.toByteArray(), this.comm.makeRequestSummary(message.toString()), Comm.RequestType.NORMAL);
			} catch (CommException e) {
				throw new IOException((Throwable) e);
			}
		}
	}

	public synchronized void sendBinaryApiResponse(final Object message) throws IOException, CycApiException {
		final CycList apiResponse = new CycList();
		apiResponse.add((Object) CycObjectFactory.t);
		apiResponse.add(message);
		if (this.comm == null) {
			this.cfaslOutputStream.writeObject((Object) apiResponse);
			this.cfaslOutputStream.flush();
		} else {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
			final CfaslOutputStream cfo = new CfaslOutputStream((OutputStream) baos);
			cfo.writeObject(message);
			cfo.flush();
			try {
				final InputStream cisLocal = this.comm.sendRequest(baos.toByteArray(), this.comm.makeRequestSummary(message.toString()), Comm.RequestType.NORMAL);
			} catch (Exception e) {
				throw new IOException(e);
			}
		}
	}

	public void traceOn() {
		this.trace = 1;
		if (this.comm == null) {
			this.cfaslOutputStream.trace = this.trace;
		}
	}

	public void traceOnDetailed() {
		this.setTrace(2);
	}

	public void traceOff() {
		this.setTrace(0);
	}

	public int getTrace() {
		return this.trace;
	}

	public void setTrace(final int trace) {
		this.trace = trace;
		if (this.comm == null) {
			this.cfaslOutputStream.trace = trace;
		}
		for (final Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : this.taskProcessorBinaryResponseHandlerMap.entrySet()) {
			if (kv.getValue() != null) {
				kv.getValue().inboundStream.trace = trace;
			}
		}
	}

	public boolean isValidBinaryConnection() {
		return this.isValidBinaryConnection(false);
	}

	public boolean isValidBinaryConnection(final boolean isQuiet) {
		if (this.comm != null) {
			return true;
		}
		if (this.cfaslSocket == null) {
			if (!isQuiet) {
				Log.current.println("Invalid binary connection because cfaslSocket is null");
			}
			return false;
		}
		if (!this.cfaslSocket.isConnected()) {
			if (!isQuiet) {
				Log.current.println("Invalid binary connection because cfaslSocket is not connected");
			}
			return false;
		}
		for (final Map.Entry<String, TaskProcessorBinaryResponseHandler> kv : this.taskProcessorBinaryResponseHandlerMap.entrySet()) {
			if (kv.getValue() == null || kv.getValue().inboundSocket == null) {
				if (!isQuiet) {
					Log.current.println("Invalid binary connection because taskProcessorBinaryResponseHandler.inboundSocket is null");
				}
				return false;
			}
			if (!kv.getValue().inboundSocket.isConnected()) {
				if (!isQuiet) {
					Log.current.println("Invalid binary connection because taskProcessorBinaryResponseHandler.inboundSocket is not connected");
				}
				return false;
			}
		}
		return true;
	}

	public String connectionInfo() {
		return "host " + this.hostName + ", cfaslPort " + this.cfaslPort;
	}

	public UUID getUuid() {
		return this.uuid;
	}

	public void setMyClientName(final String myClientName) {
		this.myClientName = myClientName;
	}

	public String getMyClientname() {
		return this.myClientName;
	}

	protected void interruptAllWaitingReplyThreads() {
		final Iterator iter = this.waitingReplyThreads.values().iterator();
		synchronized (this.waitingReplyThreads) {
			while (iter.hasNext()) {
				final WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) iter.next();
				if (this.trace > 0) {
					Log.current.println("Interrupting reply worker " + waitingWorkerInfo.getWorker());
				}
				try {
					waitingWorkerInfo.worker.cancel();
				} catch (IOException xcpt) {
					if (this.trace <= 0) {
						continue;
					}
					Log.current.println("Could not interrupt reply worker " + waitingWorkerInfo.getWorker() + ": exception: " + xcpt);
				}
			}
		}
	}

	protected synchronized void forciblyUnblockAllWaitingWorkers(Exception e) {
		final Iterator iter = this.waitingReplyThreads.values().iterator();
		if (e == null) {
			e = (Exception) new CfaslInputStreamClosedException("Communications terminated with Cyc.");
		}
		synchronized (this.waitingReplyThreads) {
			while (iter.hasNext()) {
				final WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) iter.next();
				if (this.trace > 0) {
					Log.current.println("Interrupting reply worker " + waitingWorkerInfo.getWorker());
				}
				final SubLWorkerEvent event = new SubLWorkerEvent(waitingWorkerInfo.getWorker(), SubLWorkerStatus.EXCEPTION_STATUS, e);
				waitingWorkerInfo.worker.fireSubLWorkerTerminatedEvent(event);
				iter.remove();
			}
		}
	}

	public void resetTaskProcessorById(final Integer id) throws CycApiException, IOException {
		this.resetTaskProcessorById((int) id);
	}

	public void resetTaskProcessorById(final int id) throws CycApiException, IOException {
		final String command = SubLAPIHelper.makeSubLStmt("reset-api-task-processor-by-id", new Object[] { this.myClientName, id });
		this.cycAccess.converseCycObject((Object) command);
	}

	static {
		CycConnection.DEFAULT_HOSTNAME = "localhost";
		notimeout = new Timer();
		CycConnection.apiRequestId = 0;
		MAX_PRIORITY = new Integer(10);
		CRITICAL_PRIORITY = new Integer(7);
		NORMAL_PRIORITY = new Integer(5);
		BACKGROUND_PRIORITY = new Integer(3);
		MIN_PRIORITY = new Integer(1);
		DEFAULT_PRIORITY = CycConnection.NORMAL_PRIORITY;
		df = DateFormat.getDateTimeInstance();
	}

	protected class WaitingWorkerInfo {
		final SubLWorker worker;
		final boolean isReturnWholeTaskProcessorResponse;
		final CycList taskProcessorRequest;

		WaitingWorkerInfo(final SubLWorker worker, final CycList taskProcessorRequest, final boolean isReturnWholeTaskProcessorResponse) {
			this.worker = worker;
			this.taskProcessorRequest = taskProcessorRequest;
			this.isReturnWholeTaskProcessorResponse = isReturnWholeTaskProcessorResponse;
		}

		SubLWorker getWorker() {
			return this.worker;
		}

		CycObject getMessage() {
			return (CycObject) this.taskProcessorRequest.get(1);
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 380 ms
	
	Decompiled with Procyon 0.5.32.
*/