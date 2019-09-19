/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * Neither the name of the author nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDER AND CONTRIBUTORS ``AS
 * IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ***/
package net.wimpi.telnetd.util;

/**
 * A latch is a boolean condition that is set at most once, ever.
 * Once a single release is issued, all acquires will pass.
 * <p/>
 * <b>Sample usage.</b> Here are a set of classes that use
 * a latch as a start signal for a group of worker threads that
 * are created and started beforehand, and then later enabled.
 * <pre>
 * class Worker implements Runnable {
 *   private final Latch startSignal;
 *   Worker(Latch l) { startSignal = l; }
 *    public void run() {
 *      startSignal.acquire();
 *      doWork();
 *   }
 *   void doWork() { ... }
 * }
 * <p/>
 * class Driver { // ...
 *   void main() {
 *     Latch go = new Latch();
 *     for (int i = 0; i < N; ++i) // make threads
 *       new Thread(new Worker(go)).start();
 *     doSomethingElse();         // don't let run yet
 *     go.release();              // let all threads proceed
 *   }
 * }
 * </pre>
 *
 * @author Doug Lea
 * @version @version@ (@date@)
 */
public class Latch {

  protected boolean latched_ = false;

  /*
    This could use double-check, but doesn't.
    If the latch is being used as an indicator of
    the presence or state of an object, the user would
    not necessarily get the memory barrier that comes with synch
    that would be needed to correctly use that object. This
    would lead to errors that users would be very hard to track down. So, to
    be conservative, we always use synch.
  */

  public void acquire() throws InterruptedException {
    if (Thread.interrupted()) throw new InterruptedException();
    synchronized (this) {
      while (!latched_) wait();
    }
  }//acquire

  public boolean attempt(long msecs) throws InterruptedException {
    if (Thread.interrupted()) throw new InterruptedException();
    synchronized (this) {
      if (latched_)
        return true;
      else if (msecs <= 0)
        return false;
      else {
        long waitTime = msecs;
        long start = System.currentTimeMillis();
        for (; ;) {
          wait(waitTime);
          if (latched_)
            return true;
          else {
            waitTime = msecs - (System.currentTimeMillis() - start);
            if (waitTime <= 0)
              return false;
          }
        }
      }
    }
  }//attempt

  /**
   * Enable all current and future acquires to pass *
   */
  public synchronized void release() {
    latched_ = true;
    notifyAll();
  }//release

}//class Latch

