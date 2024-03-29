/* $Id: SubLWorkerEvent.java 150787 2014-04-26 01:55:03Z nwinant $
 */
package com.cyc.baseclient.api;

// INTERNAL IMPORTS
import com.cyc.base.conn.WorkerEvent;
import com.cyc.base.conn.WorkerStatus;
import com.cyc.base.conn.Worker;
import com.cyc.baseclient.datatype.StringUtils;

// EXTERNAL IMPORTS
import java.util.*;

/**
 * <P>WorkerEvent is designed to represent the state of an event that can be
 generated by Workers and passed to the WorkerListener interface.
 *
 * @author tbrussea
 * @date March 25, 2004, 2:01 PM
 * @version $Id: SubLWorkerEvent.java 150787 2014-04-26 01:55:03Z nwinant $
 */
public class SubLWorkerEvent extends EventObject implements WorkerEvent {

  //// Constructors
  /**
   * Creates a new instance of WorkerEvent, this constructor is appropriate
 only for creating starting events.
   *
   * @param source the Worker that generates the event
   * @param workerId the client-unique id associated with this Worker
   */
  public SubLWorkerEvent(Worker source, Integer workerId) {
    super(source);
    this.workerId = workerId;
    this.eventType = STARTING_EVENT_TYPE;
  }

  /**
   * Creates a new instance of WorkerEvent, this constructor is appropriate
 only for creating data available events.
   *
   * @param source the Worker that generates the event
   * @param newData the work (or subset if incrementally collecting results),
 that has been produced by the Worker.
   * @param percentComplete percentage complete, or negative if the SubL code
   * does not maintain this information.
   */
  public SubLWorkerEvent(Worker source, Object newData, float percentComplete) {
    super(source);
    this.newData = newData;
    this.percentComplete = percentComplete;
    this.eventType = DATA_AVAILABLE_EVENT_TYPE;
  }

  /**
   * Creates a new instance of WorkerEvent, this constructor is appropriate
 only for creating termination events.
   *
   * @param source the Worker that generates the event
   * @param status why this Worker terminated
   * @param e exception thrown while doing work (or null if none thrown)
   */
  public SubLWorkerEvent(Worker source,
          WorkerStatus status, Exception e) {
    super(source);
    this.e = e;
    this.status = status;
    this.eventType = TERMINATION_EVENT_TYPE;
  }

  //// Public Area
  /**
   * Returns the worker that generated this event.
   *
   * @return the worker that generated this event
   */
  @Override
  public Worker getWorker() {
    return (Worker) getSource();
  }

  /**
   * Returns the type of event.
   *
   * @return the type of event
   */
  @Override
  public SubLWorkerEventType getEventType() {
    return eventType;
  }

  /**
   * Returns any exceptions thrown while processing the work. This value is only
   * set for TERMINATION_EVENT_TYPE events.
   *
   * @return any exceptions thrown while processing the work
   */
  @Override
  public Exception getException() {
    return e;
  }

  /**
   * Returns the worker status appropriate for this event. This value is only
   * set for TERMINATION_EVENT_TYPE events.
   *
   * @return the worker status appropriate for this event
   */
  @Override
  public WorkerStatus getStatus() {
    return status;
  }

  /**
   * Returns the percentage complete, or negative if the SubL code does not
   * maintain this information. This value is only set for
   * DATA_AVAILABLE_EVENT_TYPE events.
   *
   * @return percentage complete, or negative if the SubL code does not maintain
   * this information
   */
  @Override
  public float getPercentComplete() {
    return percentComplete;
  }

  /**
   * Returns the work (or subset if incrementally collecting results), that has
 been produced by the Worker. This value is only set for
   * DATA_AVAILABLE_EVENT_TYPE events.
   *
   * @return the work (or subset if incrementally collecting results), that has
 been produced by the Worker.
   */
  @Override
  public Object getWork() {
    return newData;
  }

  /**
   * Returns the client-unique id for the communication with the Cyc server.
   * This value is only set for STARTING_EVENT_TYPE events.
   *
   * @return the client-unique id for the communication with the Cyc server
   */
  @Override
  public Integer getId() {
    return workerId;
  }

  /**
   * Returns a string representation of the Worker.
   *
   * @return a string representation of the Worker
   */
  @Override
  public String toString() {
    return toString(2);
  }

  /**
   * Returns a string representation of the Worker.
   *
   * @param indentLength the number of spaces to preceed each line of output
   * String
   * @return a string representation of the Worker
   */
  @Override
  public String toString(int indentLength) {
    StringBuilder nlBuff = new StringBuilder();
    nlBuff.append(System.getProperty("line.separator"));
    for (int i = 1; i < indentLength; i++) {
      nlBuff.append(" ");
    }
    String nl = nlBuff.toString();
    String sp = " ";
    StringBuilder buf = new StringBuilder(sp + this.getClass().getName());
    buf.append(":").
            append(nl).append("Event type: ").append(getEventType().getName()).
            append(nl).append("SubLWorker: ").append(getWorker().toString(indentLength + 2));
    if (getEventType() == STARTING_EVENT_TYPE) {
      buf.append(nl).append("Worker id: ").append(getId());
    } else if (getEventType() == DATA_AVAILABLE_EVENT_TYPE) {
      buf.append(nl).append("Percent complete: ").append(getPercentComplete()).
              append(nl).append("Latest results: ").append(getWork());
    } else {
      buf.append(nl).append("Status: ").append(getStatus()).
              append(nl).append("Exception: ").append(StringUtils.
              getStringForException(getException()));
    }
    return buf.toString();
  }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private WorkerStatus status;
  private Exception e = null;
  private Object newData = null;
  private Integer workerId;
  private SubLWorkerEventType eventType;
  private float percentComplete;

  public static class SubLWorkerEventType implements EventType {

    private String name;

    /**
     * Returns the name of the event type
     *
     * @return the name of the event type
     */
    public String getName() {
      return name;
    }

    /**
     * Returns the name of the event type
     *
     * @return the name of the event type
     */
    @Override
    public String toString() {
      return getName();
    }

    /**
     * Constructor.
     *
     * @param name the name of the event type
     */
    private SubLWorkerEventType(String name) {
      this.name = name;
    }
  }
  /**
   * Indicates that this is a start event.
   */
  public static final SubLWorkerEventType STARTING_EVENT_TYPE =
          new SubLWorkerEventType("Starting");
  /**
   * Indicates that this is a data available event.
   */
  public static final SubLWorkerEventType DATA_AVAILABLE_EVENT_TYPE =
          new SubLWorkerEventType("Data available");
  /**
   * Indicates that this is a termination event.
   */
  public static final SubLWorkerEventType TERMINATION_EVENT_TYPE =
          new SubLWorkerEventType("Terminated");
}
