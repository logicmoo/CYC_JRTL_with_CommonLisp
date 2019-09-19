/***
 * Java TelnetD library (embeddable telnet daemon)
 * Copyright (c) Dieter Wimberger * All rights reserved.
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
package net.wimpi.telnetd.io.toolkit;import java.io.IOException;

import net.wimpi.telnetd.io.BasicTerminalIO;/** * Provides a base class for active toolkit components. * Components derived from this class can be activated and will * take control over the I/O. * * @author Dieter Wimberger * @version @version@ (@date@) */public abstract class ActiveComponent    extends Component {  private boolean m_RemAutoFlush;  private boolean m_RemLineWrapping;  /**   * Contructs an active toolkit component.   *   * @param io   the {@link BasicTerminalIO} used for this component.   * @param name the name of the component.   */  public ActiveComponent(BasicTerminalIO io, String name) {    super(io, name);  }//constructor  /**   * Contructs an active toolkit component.   *   * @param io       the {@link BasicTerminalIO} used for this component.   * @param name     the name of the component.   * @param location a {@link Point} determining the location of the component.   */  public ActiveComponent(BasicTerminalIO io, String name, Point location) {    super(io, name, location);  }//constructor  /**   * Contructs an active toolkit component.   *   * @param io         the {@link BasicTerminalIO} used for this component.   * @param name       the name of the component.   * @param autolocate true if to be autolocated, false otherwise.   */  public ActiveComponent(BasicTerminalIO io, String name, boolean autolocate) {    super(io, name, autolocate);  }//constructor  /**   * Stores the actual I/O flushing behaviour.   */  public void storeAutoflush() {    m_RemAutoFlush = m_IO.isAutoflushing();  }//storeAutoflush  /**   * Restores the last stored actual I/O   * flushing behavior.   */  public void restoreAutoflush() {    m_IO.setAutoflushing(m_RemAutoFlush);  }//restoreAutoflush  /**   * Stores the actual terminal line wrapping behavior.   *   * @throws IOException terminal I/O fails.   */  public void storeLineWrapping()      throws IOException {    m_RemLineWrapping = m_IO.isLineWrapping();  }//storeLineWrapping  /**   * Restores the last stored line wrapping behavior.   *   * @throws IOException terminal I/O fails.   */  public void restoreLineWrapping()      throws IOException {    m_IO.setLineWrapping(m_RemLineWrapping);  }//restoreLineWrapping  /**   * Method to make the instance the active object.   *   * @throws Exception if the terminal I/O or the component mechanics   *                   fail.   */  public abstract void run() throws Exception;}//class ActiveComponent