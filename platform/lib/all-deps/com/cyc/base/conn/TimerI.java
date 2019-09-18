package com.cyc.base.conn;

import com.cyc.base.CycTimeOutException;
import java.util.Date;

/**
 *
 * @author nwinant
 */
public interface TimerI {
  Date APOCALYPSE = new Date(Long.MAX_VALUE);

  /**
   * Throws a @see CycTimeOutException if this timer has been running longer than
 the timeOut.
   *
   * @throws CycTimeOutException if this timer has run the specifier number of
 seconds.
   */
  void checkForTimeOut() throws CycTimeOutException;

  long getAllotedMSecs();

  /**
   * Returns the number of milliseconds that this timer has been running.
   *
   * @return the number of milliseconds that this timer has been running.
   */
  long getElapsedMilliSeconds();

  /**
   * Returns the number of seconds that this timer has been running.
   *
   * @return the number of seconds that this timer has been running.
   */
  int getElapsedSeconds();

  /**
   * Returns the number of milliseconds remaining till the timeout of this timer.
   *
   * @return the number of milliseconds remaining till the timeout of this timer.
   */
  long getRemainingMilliSeconds();

  /**
   * Returns the number of seconds remaining till the timeout of this timer.
   *
   * @return the number of seconds remaining till the timeout of this timer.
   */
  int getRemainingSeconds();

  /**
   * Returns <code>true</code> if this timer is timed out, <code>false</code> otherwise.
   *
   * @return <code>true</code> if this timer is timed out, <code>false</code> otherwise.
   */
  boolean isTimedOut();

  /**
   * Restarts this timer with the same timeout it had previously.
   */
  void start();
  
}
