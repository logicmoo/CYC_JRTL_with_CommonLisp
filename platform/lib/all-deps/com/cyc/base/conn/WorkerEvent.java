package com.cyc.base.conn;

/**
 *
 * @author nwinant
 */
public interface WorkerEvent {
  
  /**
   * Returns the type of event.
   *
   * @return the type of event
   */
  EventType getEventType();

  /**
   * Returns any exceptions thrown while processing the work. This value is only
   * set for TERMINATION_EVENT_TYPE events.
   *
   * @return any exceptions thrown while processing the work
   */
  Exception getException();

  /**
   * Returns the client-unique id for the communication with the Cyc server.
   * This value is only set for STARTING_EVENT_TYPE events.
   *
   * @return the client-unique id for the communication with the Cyc server
   */
  Integer getId();

  /**
   * Returns the percentage complete, or negative if the SubL code does not
   * maintain this information. This value is only set for
   * DATA_AVAILABLE_EVENT_TYPE events.
   *
   * @return percentage complete, or negative if the SubL code does not maintain
   * this information
   */
  float getPercentComplete();

  /**
   * Returns the worker status appropriate for this event. This value is only
   * set for TERMINATION_EVENT_TYPE events.
   *
   * @return the worker status appropriate for this event
   */
  WorkerStatus getStatus();

  /**
   * Returns the work (or subset if incrementally collecting results), that has
 been produced by the Worker. This value is only set for
   * DATA_AVAILABLE_EVENT_TYPE events.
   *
   * @return the work (or subset if incrementally collecting results), that has
 been produced by the Worker.
   */
  Object getWork();

  //// Public Area
  /**
   * Returns the worker that generated this event.
   *
   * @return the worker that generated this event
   */
  Worker getWorker();

  /**
   * Returns a string representation of the Worker.
   *
   * @return a string representation of the Worker
   */
  String toString();

  /**
   * Returns a string representation of the Worker.
   *
   * @param indentLength the number of spaces to preceed each line of output
   * String
   * @return a string representation of the Worker
   */
  String toString(int indentLength);
  
  
  public interface EventType {
    /**
     * Returns the name of the event type
     *
     * @return the name of the event type
     */
    public String getName();

    /**
     * Returns the name of the event type
     *
     * @return the name of the event type
     */
    public String toString();
  }
}
