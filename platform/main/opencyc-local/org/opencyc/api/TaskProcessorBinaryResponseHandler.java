package org.opencyc.api;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import java.util.Date;
import org.opencyc.util.StringUtils;
import java.util.logging.Level;
import org.opencyc.util.Log;
import java.io.InputStream;
import org.opencyc.cycobject.CycSymbol;
import java.util.concurrent.Semaphore;

import org.opencyc.api.CycConnection.WaitingWorkerInfo;
import org.opencyc.cycobject.CycList;
import java.net.Socket;
import java.net.ServerSocket;

class TaskProcessorBinaryResponseHandler extends Thread
{
    public static final int MAX_LOCAL_CLIENT_CLIENTS = 50;
    protected ServerSocket listenerSocket;
    protected Socket inboundSocket;
    public CfaslInputStream inboundStream;
    protected CfaslOutputStream inboundOutputStream;
    protected Thread parentThread;
    protected CycList ignoreMessage;
    private volatile boolean isClosed;
    volatile boolean isClosing;
    private Semaphore initializedSemaphore;
    private volatile boolean initialized;
    private volatile Exception initializationError;
    static final int TASK_PROCESSOR_RESPONSE_ID = 2;
    static final int TASK_PROCESSOR_RESPONSE_RESPONSE = 5;
    static final int TASK_PROCESSOR_RESPONSE_STATUS = 6;
    static final int TASK_PROCESSOR_RESPONSE_FINISHED_FLAG = 7;
    private final CycConnection cycConnection;
    private String hostName;
    private int port;
    
    public TaskProcessorBinaryResponseHandler(final Thread parentThread, final CycConnection cycConnection, final String hostName, final int port) {
        this.listenerSocket = null;
        this.inboundSocket = null;
        this.isClosed = false;
        this.isClosing = false;
        this.initializationError = null;
        this.cycConnection = cycConnection;
        this.parentThread = parentThread;
        (this.ignoreMessage = new CycList()).add((Object)new CycSymbol("IGNORE"));
        this.hostName = hostName;
        this.port = port;
        this.initializeSynchronization();
    }
    
    public TaskProcessorBinaryResponseHandler(final Thread parentThread, final CycConnection cycConnection, final InputStream is) {
        this.listenerSocket = null;
        this.inboundSocket = null;
        this.isClosed = false;
        this.isClosing = false;
        this.initializationError = null;
        this.cycConnection = cycConnection;
        this.parentThread = parentThread;
        (this.ignoreMessage = new CycList()).add((Object)new CycSymbol("IGNORE"));
        this.hostName = this.hostName;
        this.port = this.port;
        this.initializeSynchronization();
        this.inboundStream = new CfaslInputStream(is);
        this.inboundStream.trace = cycConnection.getTrace();
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName("TaskProcessorBinaryResponseHandler");
        Exception closingException = null;
        try {
            if (!this.isClosed && !this.isClosing) {
                try {
                    if (this.cycConnection.comm == null) {
                        final CycList request = new CycList();
                        request.add((Object)new CycSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET"));
                        request.add((Object)this.cycConnection.uuid.toString());
                        this.inboundSocket = new Socket(this.cycConnection.hostName, this.cycConnection.cfaslPort);
                        final int val = this.inboundSocket.getReceiveBufferSize();
                        this.inboundSocket.setReceiveBufferSize(val * 2);
                        this.inboundSocket.setTcpNoDelay(true);
                        this.inboundSocket.setKeepAlive(true);
                        this.inboundStream = new CfaslInputStream(this.inboundSocket.getInputStream());
                        this.inboundStream.trace = this.cycConnection.trace;
                        (this.inboundOutputStream = new CfaslOutputStream(this.inboundSocket.getOutputStream())).writeObject((Object)request);
                        this.inboundOutputStream.flush();
                        this.inboundStream.resetIsInvalidObject();
                        this.inboundStream.readObject();
                        this.inboundStream.resetIsInvalidObject();
                        this.inboundStream.readObject();
                        this.inboundStream.trace = this.cycConnection.getTrace();
                    }
                }
                catch (Exception e) {
                    if (!this.isClosed && !this.isClosing) {
                        closingException = e;
                        Log.current.printStackTrace(e);
                        Log.current.errorPrintln("Communication with Cyc cannot be started: host-" + this.cycConnection.hostName + " port-" + this.cycConnection.cfaslPort);
                        this.notifySetupCompleted(e);
                    }
                    return;
                }
            }
            this.notifySetupCompleted(null);
            while (!this.isClosed && !this.isClosing) {
                Object status = null;
                CycList taskProcessorResponse = null;
                boolean isInvalidObject = false;
                if (this.isClosed) {
                    break;
                }
                if (this.isClosing) {
                    break;
                }
                try {
                    this.inboundStream.resetIsInvalidObject();
                    status = this.inboundStream.readObject();
                    this.inboundStream.resetIsInvalidObject();
                    final Object currentResponse = this.inboundStream.readObject();
                    if (!(currentResponse instanceof CycList)) {
                        throw new Exception("Invalid task processor response: " + currentResponse);
                    }
                    taskProcessorResponse = (CycList)currentResponse;
                    if (this.cycConnection.logger.isLoggable(Level.FINE)) {
                        this.cycConnection.logger.fine("API response: " + taskProcessorResponse.stringApiValue());
                    }
                    isInvalidObject = this.inboundStream.isInvalidObject();
                }
                catch (Exception e2) {
                    if (this.cycConnection.taskProcessingEnded && this.cycConnection.trace > 0) {
                        Log.current.println("Ending binary mode task processor handler.");
                    }
                    if (!this.isClosed && !this.isClosing) {
                        this.cycConnection.logger.fine("Exception: " + e2.getMessage());
                        if (e2 instanceof CfaslInputStreamClosedException) {
                            if (this.cycConnection.trace > 0) {
                                Log.current.errorPrintln(e2.getMessage());
                                Log.current.printStackTrace(e2);
                            }
                        }
                        else if (e2 instanceof RuntimeException) {
                            Log.current.errorPrintln(e2.getMessage());
                            Log.current.printStackTrace(e2);
                            continue;
                        }
                        closingException = e2;
                        Log.current.println("Cyc Server ended binary mode task processor handler.\n" + StringUtils.getStringForException((Throwable)e2));
                    }
                    return;
                }
                final boolean objectIsInvalid = isInvalidObject;
                this.cycConnection.logger.finest("API status: " + status);
                if (this.cycConnection.trace >= 2) {
                    Log.current.println("cyc --> (" + status + ") " + taskProcessorResponse.toString());
                }
                if (taskProcessorResponse.equals((Object)this.ignoreMessage)) {
                    continue;
                }
                try {
                    if (this.cycConnection.trace >= 1) {
                        Log.current.println(CycConnection.df.format(new Date()) + "\n    Got response: (" + taskProcessorResponse + ")");
                    }
                    if (!(taskProcessorResponse.get(2) instanceof Integer)) {
                        Log.current.println(CycConnection.df.format(new Date()) + "\n    Got invalid response id: (" + taskProcessorResponse + ")");
                    }
                    final Integer id = (Integer)taskProcessorResponse.get(2);
                    final Object taskStatus = taskProcessorResponse.get(6);
                    final Object finishedFlag = (taskProcessorResponse.size() > 7) ? taskProcessorResponse.get(7) : CycObjectFactory.t;
                    final boolean finished = finishedFlag != CycObjectFactory.nil;
                    final CycConnection.WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) this.cycConnection.getWaitingReplyThreads().get(id);
                    if (waitingWorkerInfo == null) {
                        if (this.cycConnection.trace < 1) {
                            continue;
                        }
                        Log.current.println(CycConnection.df.format(new Date()) + "\n    Got response with no waiting working: (" + taskProcessorResponse + ")");
                    }
                    else {
                        final SubLWorker worker = waitingWorkerInfo.getWorker();
                        final Object response = StringUtils.cyclStringsToJavaStrings(waitingWorkerInfo.isReturnWholeTaskProcessorResponse ? taskProcessorResponse : taskProcessorResponse.get(5));
                        final Runnable notificationTask = (Runnable)new NotificationTask(taskStatus, objectIsInvalid, worker, response, finished, id, this.cycConnection);
                        try {
                            this.cycConnection.apiPool.execute(notificationTask);
                        }
                        catch (RejectedExecutionException e3) {
                            e3.printStackTrace();
                            System.err.println("Rejected notification from " + worker);
                        }
                    }
                }
                catch (Exception xcpt) {
                    if (this.isClosed || this.isClosing) {
                        continue;
                    }
                    Log.current.errorPrintln(xcpt.getMessage());
                    Log.current.printStackTrace(xcpt);
                }
            }
        }
        catch (Exception e) {
            closingException = e;
        }
        finally {
            if (closingException != null) {
                this.cycConnection.logger.log(Level.SEVERE, "TaskProcessor terminated because of exception.", closingException);
            }
            this.cycConnection.taskProcessingThreadDead = true;
            this.cycConnection.logger.finer("TaskProcessor is closing now.");
            this.notifySetupCompleted(closingException);
            this.cycConnection.forciblyUnblockAllWaitingWorkers(closingException);
            this.close();
        }
    }
    
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        if (this.cycConnection.apiPool != null) {
            try {
                this.cycConnection.apiPool.shutdownNow();
            }
            catch (Exception ex) {}
            try {
                this.cycConnection.apiPool.setMaximumPoolSize(0);
            }
            catch (Exception ex2) {}
            try {
                this.cycConnection.apiPool.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
            }
            catch (Exception ex3) {}
        }
        if (this.inboundOutputStream != null) {
            try {
                this.inboundOutputStream.close();
            }
            catch (Exception e) {}
            finally {
                this.inboundOutputStream = null;
            }
        }
        if (this.inboundStream != null) {
            try {
                this.inboundStream.close();
            }
            catch (Exception e) {}
            finally {
                this.inboundStream = null;
            }
        }
        if (this.cycConnection.trace > 0) {
            Log.current.println("closed inbound socket associated with " + this.cycConnection.uuid);
        }
    }
    
    public void waitOnSetupToComplete() {
        try {
            this.initializedSemaphore.acquire();
        }
        catch (InterruptedException xcpt) {
            this.initializationError = new IllegalStateException("Unable to initialize Cyc communication.");
            System.err.println("Interrupted during wait(): " + xcpt);
        }
        if (this.initializationError != null) {
            throw new CycApiException("Cannot start communications to Cyc.", (Throwable)this.initializationError);
        }
    }
    
    private void initializeSynchronization() {
        synchronized (this) {
            this.initialized = false;
            this.initializedSemaphore = new Semaphore(0);
        }
    }
    
    private void notifySetupCompleted(final Exception e) {
        synchronized (this) {
            this.initializationError = e;
            this.initialized = true;
        }
        this.initializedSemaphore.release();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 294 ms
	
	Decompiled with Procyon 0.5.32.
*/