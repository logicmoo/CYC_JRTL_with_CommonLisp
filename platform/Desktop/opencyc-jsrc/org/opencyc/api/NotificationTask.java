/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opencyc.api;

import java.util.concurrent.TimeUnit;
import org.opencyc.cycobject.CycSymbol;

/**
 *
 * @author vijay
 */
class NotificationTask implements Runnable {
  private final Object taskStatus;
  private final boolean objectIsInvalid;
  private final SubLWorker worker;
  private final Object response;
  private final boolean finished;
  private final Integer id;
  private volatile boolean workOnThisTask = false;
  private final CycConnection cycComm;

  public NotificationTask(final Object taskStatus, final boolean objectIsInvalid, final SubLWorker worker, final Object response, final boolean finished, final Integer id, final CycConnection cycComm) {
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
    while (worker.getNotificationQueue().peek() != this) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        return;
      }
    }
    try {
      if (taskStatus.equals(CycObjectFactory.nil)) {
        if (!objectIsInvalid) {
          // no error occurred, no exception
          worker.fireSubLWorkerDataAvailableEvent(new SubLWorkerEvent(worker, response, -1.0f));
          if (finished) {
            worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.FINISHED_STATUS, null));
          }
        } else {
          // no API error sent from the server but the response contains an invalid object
          worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.EXCEPTION_STATUS, new CycApiInvalidObjectException("API response contains an invalid object: " + response.toString())));
        }
      } else {
        // Error, status contains the error message
        //@ToDo need to diferrentiate between exceptions and cancel messages!!!!!!!!!
        if (taskStatus instanceof String) {
          worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.EXCEPTION_STATUS, new CycApiServerSideException(taskStatus.toString())));
        } else if (taskStatus instanceof CycSymbol) {
          worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, SubLWorkerStatus.CANCELED_STATUS, null));
        }
      }
      if (worker.isDone()) {
        cycComm.getWaitingReplyThreads().remove(id);
      }
    } finally {
      try {
        NotificationTask notification = worker.getNotificationQueue().poll(1, TimeUnit.MICROSECONDS);
        if (notification != this) {
          throw new RuntimeException("bad notification");
        }
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        return;
      }
    }
  }
  
}
