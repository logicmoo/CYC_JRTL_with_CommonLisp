package com.cyc.inference.async;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//import org.opencyc.inference.InferenceIdentifier;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyc.base.inference.InferenceIdentifier;

/**
 * One ticket per inference. Has an ID and stashes important info.
 */
public class Ticket {
  
  // Constructors
  
  /**
   *
   * @param manager
   * @param id
   * @param queryID
   */
  protected Ticket(TicketManager manager, Integer id, String queryID) {
    this.manager = manager;
    this.id = id;
    this.queryID = queryID;
    cleanupTask = new CleanupTask(this);
  }
  
  
  // Public

  /**
   * Get this ticket's id.
   * @return the id
   */
  public Integer getId() {
    return this.id;
  }
  
  /**
   * Get the id of this ticket's query.
   * @return the query id.
   */
  public String getQueryId() {
    return this.queryID;
  }
  
  /**
   * Get the NL form of the question this ticket is for.
   * @return the NL question.
   */
  public String getQuestionNL() {
    return this.questionNL;
  }

  /**
   * Set the NL form of the question this ticket is for.
   * @param questionNL
   */
  public void setQuestionNL(String questionNL) {
    this.questionNL = questionNL;
  }

  /**
    * @return the XML result of the inference, as soon as it is available.
    */
  public synchronized String getResult() {
    if (result == null) {
      try {
        result = resultQueue.take();
      } catch (InterruptedException ex) {
        handleInterruption(ex);
        return null;
      }
    }
    return result;
  }

  /**
    * @return the XML identifier of the inference, as soon as it is available.
    */
  public InferenceIdentifier getInferenceIdentifier() {
    try {
      return inferenceIdentifierQueue.take();
    } catch (InterruptedException ex) {
      handleInterruption(ex);
      return null;
    }
  }


  /**
   *
   * @return an XML identifier for this ticket.
   */
  public String toXML() {
    return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<ticket>"
            + "  <id>" + id + "</id>"
            + "</ticket>";
  }

  /**
   *
   * @param result
   */
  public void noteResult(final String result) {
    try {
      resultQueue.put(result);
    } catch (InterruptedException ex) {
      handleInterruption(ex);
    }
  }

  /**
   *
   * @param inferenceIdentifier
   */
  public void noteInferenceIdentifier(InferenceIdentifier inferenceIdentifier) {
    try {
      this.inferenceIdentifierQueue.put(inferenceIdentifier);
    } catch (InterruptedException ex) {
      handleInterruption(ex);
    }
  }

  /**
   * Note that this ticket and its associated inference resources are no longer required.
   */
  public void relinquish() {
    while (!inferenceIdentifierQueue.isEmpty()) {
      final InferenceIdentifier inferenceIdentifier = inferenceIdentifierQueue.poll();
      scheduleInferenceForCleanup(inferenceIdentifier, manager.getInferenceCleanupDelaySeconds() * 1000);
    }
  }
  
  /**
   * Cancels existing CleanupTask and replaces it with a new one.
   */
  public void resetCleanupTask() {
    if (this.cleanupTask != null) {
      this.cleanupTask.cancel();
    }
    this.cleanupTask = new CleanupTask(this);
  }
  
  
  // Private
  
  private void scheduleInferenceForCleanup(final InferenceIdentifier inferenceIdentifier, final long delayMillis) {
    timer.schedule(cleanupTask, delayMillis);
  }

    /**
   * @STUB Don't know what we should do if one of these exceptions gets thrown.
   */
  private static void handleInterruption(InterruptedException ex) {
    LOGGER.error("Process interrupted.", ex);
  }
  
  
  // Inner Classes
  
  /**
   *
   */
  protected static class CleanupTask extends TimerTask {

    private final Ticket ticket;

    /**
     *
     * @param ticket
     */
    public CleanupTask(final Ticket ticket) {
      this.ticket = ticket;
    }

    @Override
    public void run() {
      final InferenceIdentifier inferenceIdentifier = ticket.getInferenceIdentifier();
      ticket.manager.remove(ticket);
      LOGGER.debug("Releasing inference " + inferenceIdentifier);
      inferenceIdentifier.close();
    }
  }
  
  
  // Internal
  
  private static final Timer timer = new Timer();
  private static final Logger LOGGER = LoggerFactory.getLogger(Ticket.class);
  
  final private TicketManager manager;
  final private BlockingQueue<String> resultQueue = new ArrayBlockingQueue<String>(1);
  final private int id;
  final private String queryID;
  
  private BlockingQueue<InferenceIdentifier> inferenceIdentifierQueue = new ArrayBlockingQueue<InferenceIdentifier>(1);
  private String result = null;
  private TimerTask cleanupTask = null;
  private String questionNL = "";
}
