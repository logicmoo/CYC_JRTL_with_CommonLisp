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
import java.util.HashMap;
import java.util.NoSuchElementException;

import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.terminal.ColorHelper;
import net.wimpi.telnetd.util.IntHashMap;

/**
 * Class that implements a form for layouted I/O.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public class CheckboxGroup
    extends ActiveComponent {

  protected IntHashMap m_KeyCheckboxMap;
  protected HashMap m_Checkboxes;
  protected int m_LastIndex = 0;
  protected int m_EndKey = BasicTerminalIO.ENTER;
  protected String m_Prompt = "";

  public CheckboxGroup(BasicTerminalIO myio, String name) {
    super(myio, name, true);
    m_KeyCheckboxMap = new IntHashMap();
    m_Checkboxes = new HashMap();
  }//constructor

  public CheckboxGroup(BasicTerminalIO myio, String name, Point location) {
    super(myio, name, location);
    m_KeyCheckboxMap = new IntHashMap();
    m_Checkboxes = new HashMap();
    m_LastIndex = m_Location.getRow();
  }//constructor

  public void addCheckbox(String name, String label, char key, boolean state)
      throws IOException {
    int ll = (int) ColorHelper.getVisibleLength(label);
    Label l = new Label(this.m_IO, name, label, new Point(m_Location.getColumn(), m_LastIndex));
    Checkbox cb = new Checkbox(this.m_IO, name, new Point(m_Location.getColumn() + ll + 1, m_LastIndex));
    cb.setBoxStyle(Checkbox.SQUARED_BOXSTYLE);
    cb.setBoxStyle(Checkbox.LARGE_CHECKMARK);
    cb.initSelected(state);
    //("CBG ==> Adding " + name + " key=" + key + " state=" + state);
    l.draw();
    cb.draw();
    m_KeyCheckboxMap.put(key, cb);
    m_Checkboxes.put(name, cb);
    m_LastIndex++;
  }//addCheckbox

  public boolean get(String name) {
    if (m_Checkboxes.containsKey(name)) {
      return ((Checkbox) m_Checkboxes.get(name)).isSelected();
    }
    throw new NoSuchElementException(name);
  }//get

  public int getEndKey() {
    return m_EndKey;
  }//getEndKey

  public void setEndKey(int endKey) {
    m_EndKey = endKey;
  }//setEndKey

  public void setPrompt(String prompt) {
    m_Prompt = prompt;
  }//setPrompt

  public void run() throws IOException {
    storeAutoflush();

    try {
      boolean done = false;
      //2. Loop keys
      m_IO.setCursor(m_IO.getRows(), 1);
      m_IO.write(m_Prompt);
      m_IO.flush();
      do {
        int key = m_IO.read();
        //System.out.println("CBG ==> " + (char) key);
        if(key == BasicTerminalIO.IO_ERROR) {
          throw new IOException();
        } else if (key == m_EndKey) {
          done = true;
        } else if (m_KeyCheckboxMap.containsKey(key)) {
          Checkbox cb = (Checkbox) m_KeyCheckboxMap.get(key);

          cb.toggle();
        } else {
          m_IO.bell();
          m_IO.flush();
        }
      } while (!done);

    } finally {
      restoreAutoflush();
    }
  }//run

  public void draw() {
  }//draw

}//class CheckboxGroup
