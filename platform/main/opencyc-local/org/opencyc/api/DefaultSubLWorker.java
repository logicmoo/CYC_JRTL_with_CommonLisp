package org.opencyc.api;

import java.util.EventListener;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.event.EventListenerList;
import java.util.concurrent.BlockingQueue;
import org.opencyc.cycobject.CycList;

public class DefaultSubLWorker implements SubLWorker
{
    private boolean shouldIgnoreInvalidLeases;
    private boolean expectIncrementalResults;
    private CycList subLCommand;
    private CycAccess access;
    private Integer id;
    private long timeoutMsecs;
    private volatile SubLWorkerStatus status;
    private BlockingQueue<NotificationTask> notificationQueue;
    private Integer priority;
    private EventListenerList listeners;
    private static Class listenerClass;
    private static boolean subLCommandProfiling;
    private static SubLWorkerListener subLCommandProfiler;
    
    public DefaultSubLWorker(final String subLCommand, final CycAccess access) {
        this(access.makeCycList(subLCommand), access);
    }
    
    public DefaultSubLWorker(final String subLCommand, final CycAccess access, final long timeoutMsecs) {
        this(access.makeCycList(subLCommand), access, timeoutMsecs);
    }
    
    public DefaultSubLWorker(final String subLCommand, final CycAccess access, final boolean expectIncrementalResults) {
        this(access.makeCycList(subLCommand), access, expectIncrementalResults);
    }
    
    public DefaultSubLWorker(final String subLCommand, final CycAccess access, final boolean expectIncrementalResults, final long timeoutMsec) {
        this(access.makeCycList(subLCommand), access, expectIncrementalResults, timeoutMsec, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access) {
        this(subLCommand, access, false);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final long timeoutMsecs) {
        this(subLCommand, access, false, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults) {
        this(subLCommand, access, expectIncrementalResults, 0L, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final Integer priority) {
        this(subLCommand, access, false, 0L, priority);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final long timeoutMsecs, final Integer priority) {
        this(subLCommand, access, false, timeoutMsecs, priority);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults, final Integer priority) {
        this(subLCommand, access, expectIncrementalResults, 0L, priority);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults, final long timeoutMsecs) {
        this(subLCommand, access, expectIncrementalResults, timeoutMsecs, CycConnection.NORMAL_PRIORITY);
    }
    
    public DefaultSubLWorker(final CycList subLCommand, final CycAccess access, final boolean expectIncrementalResults, final long timeoutMsecs, final Integer priority) {
        this.shouldIgnoreInvalidLeases = false;
        this.expectIncrementalResults = false;
        this.timeoutMsecs = 0L;
        this.status = SubLWorkerStatus.NOT_STARTED_STATUS;
        this.notificationQueue = new LinkedBlockingQueue<NotificationTask>();
        this.listeners = new EventListenerList();
        this.subLCommand = subLCommand;
        this.access = access;
        this.timeoutMsecs = timeoutMsecs;
        this.expectIncrementalResults = expectIncrementalResults;
        this.priority = priority;
        if (DefaultSubLWorker.subLCommandProfiler != null) {
            this.addListener(DefaultSubLWorker.subLCommandProfiler);
        }
    }
    
    public static synchronized void startProfiling() {
        DefaultSubLWorker.subLCommandProfiling = true;
        if (DefaultSubLWorker.subLCommandProfiler != null) {
            Logger.getLogger("org.opencyc.api.DefaultSubLWorker").log(Level.INFO, "SubL command profiling already started.");
            return;
        }
        Logger.getLogger("org.opencyc.api.DefaultSubLWorker").log(Level.INFO, "Start of SubL command profiling.");
        DefaultSubLWorker.subLCommandProfiler = (SubLWorkerListener)new SubLCommandProfiler();
    }
    
    public static synchronized void endProfiling(final String reportPath) throws IOException {
        if (reportPath == null) {
            throw new NullPointerException("reportPath must not be null");
        }
        if (reportPath.length() == 0) {
            throw new IllegalArgumentException("reportPath must not be an empty string");
        }
        DefaultSubLWorker.subLCommandProfiling = false;
        if (DefaultSubLWorker.subLCommandProfiler == null) {
            Logger.getLogger("org.opencyc.api.DefaultSubLWorker").log(Level.INFO, "SubL command profiling is not active.");
            return;
        }
        Logger.getLogger("org.opencyc.api.DefaultSubLWorker").log(Level.INFO, "End of SubL command profiling, writing report to " + reportPath);
        ((SubLCommandProfiler)DefaultSubLWorker.subLCommandProfiler).report(reportPath);
        DefaultSubLWorker.subLCommandProfiler = null;
    }
    
    public CycList getSubLCommand() {
        return this.subLCommand;
    }
    
    public void setSubLCommand(final CycList command) {
        if (this.getStatus().equals(SubLWorkerStatus.NOT_STARTED_STATUS)) {
            this.subLCommand = command;
            return;
        }
        throw new UnsupportedOperationException("Worker has already started.");
    }
    
    public CycAccess getCycServer() {
        return this.access;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public synchronized void start() throws IOException, TimeOutException, CycApiException {
        if (this.getStatus() != SubLWorkerStatus.NOT_STARTED_STATUS) {
            throw new RuntimeException("This communication has already been started.");
        }
        this.setStatus(SubLWorkerStatus.WORKING_STATUS);
        this.getCycServer().converseWithRetrying((Object)this);
    }
    
    public void cancel() throws IOException {
        if (this.getStatus() != SubLWorkerStatus.WORKING_STATUS) {
            return;
        }
        final CycAccess cycAccess = this.getCycServer();
        synchronized (cycAccess) {
            cycAccess.getCycConnection().cancelCommunication((SubLWorker)this);
        }
    }
    
    public void abort() throws IOException {
        if (this.getStatus() != SubLWorkerStatus.WORKING_STATUS) {
            return;
        }
        final CycAccess cycAccess = this.getCycServer();
        synchronized (cycAccess) {
            cycAccess.getCycConnection().abortCommunication((SubLWorker)this);
        }
    }
    
    public void cancelTask() {
        try {
            this.abort();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Integer getPriority() {
        return this.priority;
    }
    
    public SubLWorkerStatus getStatus() {
        return this.status;
    }
    
    public boolean isDone() {
        final SubLWorkerStatus status = this.getStatus();
        return status != SubLWorkerStatus.NOT_STARTED_STATUS && status != SubLWorkerStatus.WORKING_STATUS;
    }
    
    public long getTimeoutMsecs() {
        return this.timeoutMsecs;
    }
    
    public boolean expectIncrementalResults() {
        return this.expectIncrementalResults;
    }
    
    public Object[] getListeners() {
        return this.listeners.getListeners((Class)DefaultSubLWorker.listenerClass);
    }
    
    public void addListener(final SubLWorkerListener listener) {
        this.listeners.add(DefaultSubLWorker.listenerClass, listener);
    }
    
    public void removeListener(final SubLWorkerListener listener) {
        this.listeners.remove(DefaultSubLWorker.listenerClass, listener);
    }
    
    public void removeAllListeners() {
        final Object[] listenerArray = this.listeners.getListenerList();
        for (int i = 0, size = listenerArray.length; i < size; i += 2) {
            this.listeners.remove((Class<EventListener>)listenerArray[i], (EventListener)listenerArray[i + 1]);
        }
    }
    
    @Override
    public String toString() {
        return this.toString(2);
    }
    
    public String toString(final int indentLength) {
        final StringBuffer nlBuff = new StringBuffer();
        nlBuff.append(System.getProperty("line.separator"));
        for (int i = 1; i < indentLength; ++i) {
            nlBuff.append(" ");
        }
        final String nl = nlBuff.toString();
        final String sp = nl.substring(1);
        final StringBuffer buf = new StringBuffer(sp + this.getClass().getName());
        buf.append(":").append(nl).append("Id: ").append(this.getId()).append(nl).append("Server: ").append(this.getCycServer().toString()).append(nl).append("Status: ").append(this.getStatus().getName()).append(nl).append("Incremental results: ").append(this.expectIncrementalResults()).append(nl).append("Timeout: ").append(this.getTimeoutMsecs()).append(" msecs").append(nl).append("Command: \n").append(this.getSubLCommand().toPrettyCyclifiedString("")).append(nl);
        return buf.toString();
    }
    
    public void fireSubLWorkerStartedEvent(final SubLWorkerEvent event) {
        if (event.getEventType() != SubLWorkerEvent.STARTING_EVENT_TYPE) {
            throw new RuntimeException("Got bad event type; " + event.getEventType().getName());
        }
        this.setId(event.getId());
        synchronized (this.listeners) {
            final Object[] curListeners = this.listeners.getListenerList();
            for (int i = curListeners.length - 2; i >= 0; i -= 2) {
                if (curListeners[i] == DefaultSubLWorker.listenerClass) {
                    try {
                        ((SubLWorkerListener)curListeners[i + 1]).notifySubLWorkerStarted(event);
                    }
                    catch (Exception e) {
                        Logger.getLogger(this.getClass().toString()).log(Level.WARNING, e.getMessage(), e);
                    }
                }
            }
        }
    }
    
    public void fireSubLWorkerDataAvailableEvent(final SubLWorkerEvent event) {
        if (event.getEventType() != SubLWorkerEvent.DATA_AVAILABLE_EVENT_TYPE) {
            throw new RuntimeException("Got bad event type; " + event.getEventType().getName());
        }
        synchronized (this.listeners) {
            final Object[] curListeners = this.listeners.getListenerList();
            for (int i = curListeners.length - 2; i >= 0; i -= 2) {
                if (curListeners[i] == DefaultSubLWorker.listenerClass) {
                    try {
                        ((SubLWorkerListener)curListeners[i + 1]).notifySubLWorkerDataAvailable(event);
                    }
                    catch (Exception e) {
                        Logger.getLogger(this.getClass().toString()).log(Level.WARNING, e.getMessage(), e);
                    }
                }
            }
        }
    }
    
    public void fireSubLWorkerTerminatedEvent(final SubLWorkerEvent event) {
        if (event.getEventType() != SubLWorkerEvent.TERMINATION_EVENT_TYPE) {
            throw new RuntimeException("Got bad event type; " + event.getEventType().getName());
        }
        this.setStatus(event.getStatus());
        synchronized (this.listeners) {
            final Object[] curListeners = this.listeners.getListenerList();
            for (int i = curListeners.length - 2; i >= 0; i -= 2) {
                if (curListeners[i] == DefaultSubLWorker.listenerClass) {
                    try {
                        ((SubLWorkerListener)curListeners[i + 1]).notifySubLWorkerTerminated(event);
                    }
                    catch (Exception e) {
                        Logger.getLogger(this.getClass().toString()).log(Level.WARNING, e.getMessage(), e);
                    }
                }
            }
        }
    }
    
    public boolean shouldIgnoreInvalidLeases() {
        return this.shouldIgnoreInvalidLeases;
    }
    
    protected void setShouldIgnoreInvalidLeases(final boolean newVal) {
        this.shouldIgnoreInvalidLeases = newVal;
    }
    
    protected void setId(final Integer id) {
        this.id = id;
    }
    
    protected void setStatus(final SubLWorkerStatus status) {
        this.status = status;
    }
    
    public BlockingQueue<NotificationTask> getNotificationQueue() {
        return this.notificationQueue;
    }
    
    public static void main(final String[] args) {
        try {
            final CycAccess access = new CycAccess("localhost", 3640);
            final SubLWorker worker = (SubLWorker)new DefaultSubLWorker("(+ 1 1)", access);
            worker.addListener((SubLWorkerListener)new SubLWorkerListener() {
                public void notifySubLWorkerStarted(final SubLWorkerEvent event) {
                    System.out.println("Received SubL Worker Event: \n" + event.toString(2) + "\n");
                }
                
                public void notifySubLWorkerDataAvailable(final SubLWorkerEvent event) {
                    System.out.println("Received SubL Worker Event: \n" + event.toString(2) + "\n");
                }
                
                public void notifySubLWorkerTerminated(final SubLWorkerEvent event) {
                    System.out.println("Received SubL Worker Event: \n" + event.toString(2) + "\n");
                    System.exit(0);
                }
            });
            worker.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static {
        DefaultSubLWorker.listenerClass = SubLWorkerListener.class;
        DefaultSubLWorker.subLCommandProfiling = false;
        DefaultSubLWorker.subLCommandProfiler = null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 146 ms
	
	Decompiled with Procyon 0.5.32.
*/