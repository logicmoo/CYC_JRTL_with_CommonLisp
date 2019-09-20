package org.opencyc.api;

import java.util.concurrent.TimeUnit;
import org.opencyc.cycobject.CycSymbol;

class NotificationTask implements Runnable
{
    private final Object taskStatus;
    private final boolean objectIsInvalid;
    private final SubLWorker worker;
    private final Object response;
    private final boolean finished;
    private final Integer id;
    private volatile boolean workOnThisTask;
    private final CycConnection cycComm;
    
    public NotificationTask(final Object taskStatus, final boolean objectIsInvalid, final SubLWorker worker, final Object response, final boolean finished, final Integer id, final CycConnection cycComm) {
        this.workOnThisTask = false;
        this.cycComm = cycComm;
        this.taskStatus = taskStatus;
        this.objectIsInvalid = objectIsInvalid;
        this.worker = worker;
        this.response = response;
        this.finished = finished;
        this.id = id;
        worker.getNotificationQueue().add(this);
    }
    
    @Override
    public void run() {
        while (this.worker.getNotificationQueue().peek() != this) {
            try {
                Thread.sleep(1L);
                continue;
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                return;
            }
           // break;
        }
        try {
            if (this.taskStatus.equals(CycObjectFactory.nil)) {
                if (!this.objectIsInvalid) {
                    this.worker.fireSubLWorkerDataAvailableEvent(new SubLWorkerEvent(this.worker, this.response, -1.0f));
                    if (this.finished) {
                        this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.FINISHED_STATUS, (Exception)null));
                    }
                }
                else {
                    this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new CycApiInvalidObjectException("API response contains an invalid object: " + this.response.toString())));
                }
            }
            else if (this.taskStatus instanceof String) {
                this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.EXCEPTION_STATUS, (Exception)new CycApiServerSideException(this.taskStatus.toString())));
            }
            else if (this.taskStatus instanceof CycSymbol) {
                this.worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(this.worker, SubLWorkerStatus.CANCELED_STATUS, (Exception)null));
            }
            if (this.worker.isDone()) {
                this.cycComm.getWaitingReplyThreads().remove(this.id);
            }
            try {
                final NotificationTask notification = this.worker.getNotificationQueue().poll(1L, TimeUnit.MICROSECONDS);
                if (notification != this) {
                    throw new RuntimeException("bad notification");
                }
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
        finally {
            try {
                final NotificationTask notification2 = this.worker.getNotificationQueue().poll(1L, TimeUnit.MICROSECONDS);
                if (notification2 != this) {
                    throw new RuntimeException("bad notification");
                }
            }
            catch (InterruptedException ie2) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 48 ms
	
	Decompiled with Procyon 0.5.32.
*/