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
package net.wimpi.telnetd.shell;

import org.osgi.framework.BundleContext;

/**
 * This interface defines a <tt>ShellService</tt>.
 * <p/>
 * It defines a single factory method for creating
 * {@link Shell} instances for the specific implementation.
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 * @see net.wimpi.telnetd.shell.PoolingShellService
 */
public interface ShellService {

  /**
   * Activates this <tt>ShellService</tt>.
   *
   * @return true if activated, false otherwise
   */
  public boolean activate(BundleContext bc);

  /**
   * Deactivate this <tt>ShellService</tt>.
   * Note that this should dispose all resources
   * (be careful about static references). All instances
   * AND classes need to be recyclable for a bundle reload.
   */
  public void deactivate();

  /**
   * Returns a unique identifier for the {@link Shell}
   * implementation of this <tt>ShellService</tt>.
   *
   * @return a <tt>String</tt> representing a unique identifier.
   */
  public String getIdentifier();

  /**
   * Creates and returns a new {@link Shell} instance.
   *
   * @return a {@link Shell} instance.
   */
  public Shell createShell();

}//interface ShellService
