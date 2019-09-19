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
 * <p/>
 *
 * @author Doug Lea
 * @version @version@ (@date@)
 */
public class ReentrantLock {

  protected Thread m_Owner = null;
  protected long m_Holds = 0;

  public void acquire() throws InterruptedException {
    //log.debug("acquire()::" + Thread.currentThread().toString());
    if (Thread.interrupted()) throw new InterruptedException();
    Thread caller = Thread.currentThread();
    synchronized (this) {
      if (caller == m_Owner)
        ++m_Holds;
      else {
        try {
          while (m_Owner != null) wait();
          m_Owner = caller;
          m_Holds = 1;
        } catch (InterruptedException ex) {
          notify();
          throw ex;
        }
      }
    }
  }//acquire

  public boolean attempt(long msecs) throws InterruptedException {
    //log.debug("attempt()::" + Thread.currentThread().toString());
    if (Thread.interrupted()) throw new InterruptedException();
    Thread caller = Thread.currentThread();
    synchronized (this) {
      if (caller == m_Owner) {
        ++m_Holds;
        return true;
      } else if (m_Owner == null) {
        m_Owner = caller;
        m_Holds = 1;
        return true;
      } else if (msecs <= 0)
        return false;
      else {
        long waitTime = msecs;
        long start = System.currentTimeMillis();
        try {
          for (; ;) {
            wait(waitTime);
            if (caller == m_Owner) {
              ++m_Holds;
              return true;
            } else if (m_Owner == null) {
              m_Owner = caller;
              m_Holds = 1;
              return true;
            } else {
              waitTime = msecs - (System.currentTimeMillis() - start);
              if (waitTime <= 0)
                return false;
            }
          }
        } catch (InterruptedException ex) {
          notify();
          throw ex;
        }
      }
    }
  }//attempt

  /**
   * Release the lock.
   *
   * @throws Error thrown if not current owner of lock
   */
  public synchronized void release() {
    //log.debug("release()::" + Thread.currentThread().toString());
    if (Thread.currentThread() != m_Owner)
      throw new Error("Illegal Lock usage");

    if (--m_Holds == 0) {
      m_Owner = null;
      notify();
    }
  }//release

  /**
   * Release the lock N times. <code>release(n)</code> is
   * equivalent in effect to:
   * <pre>
   *   for (int i = 0; i < n; ++i) release();
   * </pre>
   * <p/>
   *
   * @throws Error thrown if not current owner of lock
   *               or has fewer than N holds on the lock
   */
  public synchronized void release(long n) {
    if (Thread.currentThread() != m_Owner || n > m_Holds)
      throw new Error("Illegal Lock usage");

    m_Holds -= n;
    if (m_Holds == 0) {
      m_Owner = null;
      notify();
    }
  }//release


  /**
   * Return the number of unreleased acquires performed
   * by the current thread.
   * Returns zero if current thread does not hold lock.
   */
  public synchronized long holds() {
    if (Thread.currentThread() != m_Owner) return 0;
    return m_Holds;
  }//holds

}//class ReentrantLock
