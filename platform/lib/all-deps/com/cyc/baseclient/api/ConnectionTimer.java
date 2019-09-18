/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyc.baseclient.api;

import com.cyc.baseclient.util.Log;
import com.cyc.base.CycTimeOutException;

/** Provides a timer thread for cancelling the connection if it takes too long to establish. */
class ConnectionTimer extends Thread {
  private final CycConnection cycConnection;

  /** Constucts a new ConnectionTimer instance. */
  ConnectionTimer(final CycConnection cycConnection) {
    this.cycConnection = cycConnection;
  }

  /** Waits for either the CycConnection constructor thread to set the done indicator, or kills the
   * connection after the timeout is exceeded. */
  public void run() {
    try {
      while (!isCycConnectionEstablished) {
        Thread.sleep(WAIT_TIME_INCREMENT);
        timerMillis = timerMillis + WAIT_TIME_INCREMENT;
        if (timerMillis > TIMEOUT_MILLIS) {
          throw new CycTimeOutException("Timeout exceeded when connecting to Cyc.");
        }
      }
    } catch (InterruptedException e) {
      Log.current.println("Interruption while waiting on Cyc connection establishment, closing sockets");
      // close the socket connections to Cyc and kill any awaiting api request threads
      if (cycConnection.trace == CycConnection.API_TRACE_NONE) {
        cycConnection.trace = CycConnection.API_TRACE_MESSAGES;
      }
      cycConnection.close();
      Thread.currentThread().interrupt();
      throw new IllegalStateException("Interrupted while establishing Cyc connection.", e);
    } catch (CycTimeOutException e) {
      Log.current.println("Timed out while waiting Cyc connection establishment, closing sockets");
      // close the socket connections to Cyc and kill any awaiting api request threads
      if (cycConnection.trace == CycConnection.API_TRACE_NONE) {
        cycConnection.trace = CycConnection.API_TRACE_MESSAGES;
      }
      cycConnection.close();
      throw e;
    }
  }
  /** the timeout duration in milliseconds (one minute) */
  final long TIMEOUT_MILLIS = 60000;
  /** the wait time increment */
  final long WAIT_TIME_INCREMENT = 1000;
  /** the wait time so far in milliseconds */
  long timerMillis = 0;
  /** set by the CycConnection constructor process to indicate that the connection to Cyc is established */
  volatile boolean isCycConnectionEstablished = false;
  
}
