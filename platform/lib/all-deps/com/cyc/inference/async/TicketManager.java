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

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nwinant
 */
public class TicketManager {
  
  // Constructors
  
  private TicketManager() {}
  
  /**
   * Get the ticket manager.
   * @return the singleton instance.
   */
  public static TicketManager get() {
    if (INSTANCE == null) {
      INSTANCE = new TicketManager();
    }
    return INSTANCE;
  }
          
          
  // Public
  
  /**
   * Find a ticket from its id.
   * @param id
   * @return the ticket
   */
  public Ticket findById(final int id) {
    return idTicketIndex.get(id);
  }
  
  /**
   * Fid a ticket from its query id.
   * @param queryID
   * @return the ticket
   */
  public Ticket findByQueryID(String queryID) {
    synchronized (queryTicketIndex) {
      final Ticket ticket = queryTicketIndex.get(queryID);
      if (ticket != null) {
        ticket.resetCleanupTask();
      }
      return ticket;
    }
  }
  
  /**
   * Create and return a new ticket.
   * @param queryId
   * @return the ticket
   */
  public Ticket create(String queryId) {
    final Ticket ticket = new Ticket(this, nextId(), queryId);
    return add(ticket);
  }
  
  /**
   * Forget all tickets hitherto managed by this manager.
   * @return the number of tickets forgotten.
   */
  public synchronized int clear() {
    final int size = queryTicketIndex.size();
    idTicketIndex.clear();
    queryTicketIndex.clear();
    return size;
  }
  
  /**
   * Set the delay time before inferences from reliquished tickets are released for garbage collection.
   * @param seconds
   * @see Ticket#relinquish() 
   */
  public void setInferenceCleanupDelaySeconds(long seconds) {
    inferenceCleanupDelaySeconds = seconds;
  }
  
  /**
   * Get the delay time before inferences from reliquished tickets are released for garbage collection.
   * @return the delay in seconds.
   * @see Ticket#relinquish() 
   */
  public long getInferenceCleanupDelaySeconds() {
    return this.inferenceCleanupDelaySeconds;
  }
  
  
  // Protected
  
  /**
   * Add a ticket to the set of tickets managed by this manager.
   * @param ticket
   * @return the ticket.
   */
  protected synchronized Ticket add(final Ticket ticket) {
    idTicketIndex.put(ticket.getId(), ticket);
    queryTicketIndex.put(ticket.getQueryId(), ticket);
    return ticket;
  }
  
  /**
   * Remove a ticket from the set of tickets managed by this manager.
   * @param ticket
   * @return the ticket.
   */
  protected synchronized Ticket remove(Ticket ticket) {
    idTicketIndex.remove(ticket.getId());
    queryTicketIndex.remove(ticket.getQueryId());
    return ticket;
  }
  
  
  // Private
  
  synchronized private int nextId() {
    return ticketCounter++;
  }
  
  
  // Internal
  
  static private TicketManager INSTANCE = null;
  
  private long inferenceCleanupDelaySeconds = 20 * 60;
  private int ticketCounter = 0;
  private final Map<Integer, Ticket> idTicketIndex = new HashMap<Integer, Ticket>();
  private final Map<String, Ticket> queryTicketIndex = new HashMap<String, Ticket>();
}
