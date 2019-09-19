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

import java.util.Iterator;

import net.wimpi.telnetd.shell.NoSuchShellServiceException;
import net.wimpi.telnetd.shell.Shell;
import net.wimpi.telnetd.shell.ShellService;

/**
 * This interface defines a <tt>ShellServiceManager</tt>
 * for the OSGi specific implementation.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface ShellServiceManager {

  /**
   * Registers a {@link ShellService} instance with this
   * <tt>ShellServiceManager</tt>.
   * <p/>
   * Note that implementations might also support the white-board model
   * which means that shell service bundles would automatically
   * be registered.
   * </p>
   *
   * @param sf a {@link ShellService} instance for creating shell
   *           instances.
   * @return true if registered, false otherwise.
   */
  public boolean register(ShellService sf);

  /**
   * Unregisters a {@link ShellService} instance
   * from this <tt>ShellServiceManager</tt>.
   * <p/>
   * Note that implementations might also support the white-board model
   * which means that shell service bundles would automatically
   * be registered.
   * </p>
   *
   * @param id a unique identifier for a {@link Shell} implementation.
   * @return true if unregistered, false otherwise.
   */
  public boolean unregister(String id);

  /**
   * Returns a {@link ShellService} instance corresponding to the given
   * identifier.
   *
   * @param id a unique identifier for a {@link Shell} implementation.
   * @return a {@link Shell} instance.
   * @throws NoSuchShellServiceException if no {@link ShellService} is
   *                                     bound for the given identifier.
   * @see #isAvailable(String)
   */
  public ShellService get(String id) throws NoSuchShellServiceException;

  /**
   * Tests if a {@link Shell} with the given identifier is available.
   *
   * @param id a unique identifier for a {@link Shell} implementation.
   * @return true if available, false otherwise.
   */
  public boolean isAvailable(String id);

  /**
   * Returns an <tt>Iterator</tt> over the identifiers of all
   * available {@link Shell} implementations.
   *
   * @return an <tt>Iterator</tt> over <tt>String</tt> elements representing
   *         the identifiers.
   */
  public Iterator listAvailable();

}//interface ShellServiceManager
