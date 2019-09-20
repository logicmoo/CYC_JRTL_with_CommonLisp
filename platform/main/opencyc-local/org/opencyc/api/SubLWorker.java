package org.opencyc.api;

import java.util.concurrent.BlockingQueue;
import org.opencyc.util.TimeOutException;
import java.io.IOException;
import org.opencyc.cycobject.CycList;
import org.opencyc.util.Cancelable;

public interface SubLWorker extends Cancelable
{
    CycList getSubLCommand();
    
    CycAccess getCycServer();
    
    Integer getId();
    
    Integer getPriority();
    
    void start() throws IOException, TimeOutException, CycApiException;
    
    void cancel() throws IOException;
    
    void abort() throws IOException;
    
    SubLWorkerStatus getStatus();
    
    boolean isDone();
    
    long getTimeoutMsecs();
    
    boolean expectIncrementalResults();
    
    Object[] getListeners();
    
    void addListener(final SubLWorkerListener p0);
    
    void removeListener(final SubLWorkerListener p0);
    
    void removeAllListeners();
    
    String toString();
    
    String toString(final int p0);
    
    boolean shouldIgnoreInvalidLeases();
    
    void fireSubLWorkerStartedEvent(final SubLWorkerEvent p0);
    
    void fireSubLWorkerDataAvailableEvent(final SubLWorkerEvent p0);
    
    void fireSubLWorkerTerminatedEvent(final SubLWorkerEvent p0);
    
    BlockingQueue<NotificationTask> getNotificationQueue();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 9 ms
	
	Decompiled with Procyon 0.5.32.
*/