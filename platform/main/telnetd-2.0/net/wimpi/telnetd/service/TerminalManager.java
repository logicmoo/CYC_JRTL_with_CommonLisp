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

import net.wimpi.telnetd.io.terminal.NoSuchTerminalException;
import net.wimpi.telnetd.io.terminal.Terminal;

/**
 * This interface defines the <tt>TerminalManagerImpl</tt>.
 * Extends <tt>ManagedService</tt> for configuration storage
 * purposes.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public interface TerminalManager {

  /**
   * Registers a {@link Terminal} instance with this
   * <tt>TerminalManagerImpl</tt>.
   *
   * @param termid the {@link Terminal} instance identifer.
   * @param term   a {@link Terminal} instance.
   * @return true if registered, false otherwise.
   */
  public boolean register(String termid, Terminal term);

  /**
   * Registers an alias for a given {@link Terminal}
   * identifier.
   *
   * @param termid a {@link Terminal} instance identifer.
   * @param alias  the alias to be registered.
   * @return true if registered, false otherwise.
   * @throws NoSuchTerminalException if the given {@link Terminal}
   *                                 instance identifier is non-existant.
   */
  public boolean registerAlias(String termid, String alias)
      throws NoSuchTerminalException;

  /**
   * Unregisters a {@link Terminal} instance from this
   * <tt>TerminalManagerImpl</tt>.
   * <p/>
   * If the given identifier represents an alias, the
   * alias will be unregistered.
   * </p>
   *
   * @param id a unique identifier for a {@link Terminal} implementation.
   * @return true if unregistered, false otherwise.
   */
  public boolean unregister(String id);

  /**
   * Returns the reference to a {@link Terminal}
   * class instance with the given identifier.
   * <p/>
   * If no instance is available for the given identifier,
   * the default {@link Terminal} class instance is returned.
   *
   * @param termid String that represents a terminal name or an alias.
   * @return Terminal instance or null if the key was invalid.
   * @throws NoSuchTerminalException if the given {@link Terminal}
   *                                 instance identifier (or alias) is non-existant.
   * @see #isAvailable(String)
   */
  public Terminal get(String termid) throws NoSuchTerminalException;

  /**
   * Returns the default {@link Terminal} class
   * identifier.
   *
   * @return a <tt>String</tt> representing the identifier.
   */
  public String getDefault();

  /**
   * Sets the default {@link Terminal} class identifier.
   *
   * @param termid a {@link Terminal} instance identifer.
   * @throws NoSuchTerminalException if the given {@link Terminal}
   *                                 instance identifier (or alias) is non-existant.
   * @see #isAvailable(String)
   */
  public void setDefault(String termid) throws NoSuchTerminalException;

  /**
   * Tests if a {@link Terminal} with the given identifier
   * is available.
   *
   * @param id a unique identifier for a {@link Terminal}
   *           implementation.
   * @return true if available, false otherwise.
   */
  public boolean isAvailable(String id);

  /**
   * Tests if a given {@link Terminal} identifier
   * is actually an alias.
   *
   * @param id a unique identifier for a {@link Terminal}
   *           implementation.
   * @return true if available, false otherwise.
   */
  public boolean isAlias(String id);

  /**
   * Returns an <tt>Iterator</tt> over the identifiers of all
   * available {@link Terminal} implementations.
   *
   * @return an <tt>Iterator</tt> over <tt>String</tt> elements representing
   *         the identifiers.
   */
  public Iterator listAvailable();


}//interface TerminalManagerImpl
