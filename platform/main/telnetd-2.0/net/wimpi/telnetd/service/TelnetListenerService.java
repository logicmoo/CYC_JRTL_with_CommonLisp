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
package net.wimpi.telnetd.service;


/**
 * This interface defines....
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface TelnetListenerService {

  /**
   * Starts this <tt>TelnetListenerService</tt>.
   */
  public void start();

  /**
   * Stops this <tt>TelnetListenerService</tt>.
   */
  public void stop();

  /**
   * Tests if this <tt>TelnetListenerService</tt>
   * is started.
   *
   * @return true if started, false otherwise.
   */
  public boolean isStarted();

  /**
   * Set a {@link ConnectionFilter} instance for this
   * service.
   * The filter is used to handle IP level allow/deny
   * of incoming connections.
   *
   * @param filter a {@link ConnectionFilter} instance.
   */
  public void setConnectionFilter(ConnectionFilter filter);

  /**
   * Returns the active {@link ConnectionFilter}
   * instance.
   *
   * @return a {@link ConnectionFilter} instance or null
   *         if none is used.
   */
  public ConnectionFilter getConnectionFilter();

  public static final String CONFKEY_NAME = "name";
  public static final String CONFKEY_PORT = "port";
  public static final String CONFKEY_FLOODPROT = "floodprotection";
  public static final String CONFKEY_SECURE = "secure";
  public static final String CONFKEY_PKEY = "pkey";
  public static final String CONFKEY_PKEYPASS = "pkeypass";

}//interface TelnetListenerService
