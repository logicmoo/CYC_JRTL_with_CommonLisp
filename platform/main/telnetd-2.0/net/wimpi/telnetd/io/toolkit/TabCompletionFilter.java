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
package net.wimpi.telnetd.io.toolkit;

import java.io.IOException;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.util.StringCompletions;

/**
 * This abstract class implements a base for
 * <tt>TabCompletionFilter</tt> implementations.
 * <p/>
 * Implementations should provide a method that returns a
 * {@link StringCompletions} instance holding the completions
 * for a given <tt>String</tt> fragment.
 * </p>
 * <p/>
 * This base filter implementation will filter the
 * {@link BasicTerminalIO#TABULATOR} key, establishing
 * a new (on the first tab key) or maintaining (subsequent tab keys)
 * a completion sequence. The sequence of completions itself is
 * determined by the {@link StringCompletions} implementation.
 * </p>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public abstract class TabCompletionFilter extends ASCIIInputFilter
    implements InputFilter {

  protected Editfield m_Editfield;
  protected int m_LastKey = -1;
  protected StringCompletions m_Completions;
  protected boolean m_InSequence = false;
  protected String m_Prefix;

  public TabCompletionFilter() {

  }//TabCompletionFilter

  public TabCompletionFilter(Editfield ef) {
    m_Editfield = ef;
  }//TabCompletionFilter

  public void assignEditfield(Editfield ef) {
    m_Editfield = ef;
  }//assignEditfield

  public int filterInput(int key) throws IOException {
    if (key == BasicTerminalIO.TABULATOR) {
      if (!m_InSequence) {
        //create new completions sequence
        m_Prefix = m_Editfield.getValue();
        m_Completions = complete(m_Prefix);
        m_InSequence = true;
      }
      if (m_Completions == null) {
        return INPUT_HANDLED;
      }
      String next = m_Completions.nextCompletion();
      try {
        m_Editfield.appendValue(next,m_Prefix);
      } catch (BufferOverflowException ex) {
        try {
          m_Editfield.setValue(next.substring(0, m_Editfield.getLength()));
        } catch (BufferOverflowException nex) {
          Activator.getServices().error("filterInput()", nex);
        }
      } finally {
        return INPUT_HANDLED;
      }
    } else {
      m_InSequence = false;
      return key;
    }
  }//filterInput

  /**
   * Returns a {@link StringCompletions} instance that will provide
   * the completions for a given fragment.
   *
   * @param fragment <tt>String</tt> fragment to be completed.
   * @return a {@link StringCompletions} instance.
   */
  public abstract StringCompletions complete(String fragment);


}//class TabulationInputFilter
