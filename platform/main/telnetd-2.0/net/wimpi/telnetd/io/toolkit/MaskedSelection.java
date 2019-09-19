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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.terminal.ColorHelper;


/**
 * Class implementing a maskable selection menu.
 * <p>
 * The options are standard objects and will be masked
 * with a corresponding textual description on the terminal.
 * </p>
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public class MaskedSelection extends ActiveComponent {

  //Members & Associations
  private HashMap m_Descriptions;
  private List m_Values;
  private int m_Selected;
  private int m_LastSelected;

  /**
   * Constructs a Selection instance.
   *
   * @param io   Object instance implementing the BasicTerminalIO interface.
   * @param name String representing this instances name.
   */
  public MaskedSelection(BasicTerminalIO io, String name) {
    super(io, name);
    m_Values = new ArrayList(10);
    m_Descriptions = new HashMap();
    m_LastSelected = 0;
    m_Selected = 0;
  }//constructor

  /**
   * Constructs a Selection instance.
   *
   * @param io       Object instance implementing the BasicTerminalIO interface.
   * @param name     String representing this instances name.
   * @param location a {@link Point} that determines the location.
   */
  public MaskedSelection(BasicTerminalIO io, String name, Point location) {
    super(io, name, location);
    m_Values = new ArrayList(10);
    m_Descriptions = new HashMap();
    m_LastSelected = 0;
    m_Selected = 0;
  }//constructor

  /**
   * Method to add an Option to a Selection instance.
   *
   * @param val value representing the option.
   */
  public void addOption(Object val) {
    m_Values.add(val);
    m_Descriptions.put(val, val.toString());
  }//addOption

  /**
   * Method to add an Option to a Selection instance.
   *
   * @param val  value representing the option.
   * @param desc String representing the option.
   */
  public void addOption(Object val, String desc) {
    m_Values.add(val);
    m_Descriptions.put(val, desc);
  }//addOption

  /**
   * Method to add an Option to a Selection instance.
   *
   * @param val  value representing the option.
   * @param desc String representing the option.
   */
  public void addOptions(Object val, String desc) {
    m_Values.add(val);
    m_Descriptions.put(val, desc);
  }//addOption

  /**
   * Method to insert an Option to a Selection instance at a specific
   * index. Falls back to add, if index is corrupt.
   *
   * @param val   Object representing the option.
   * @param index int representing the desired index.
   */
  public void insertOption(Object val, int index) {
    try {
      m_Values.add(index, val);
      m_Descriptions.put(val, val.toString());

    } catch (ArrayIndexOutOfBoundsException aex) {
      addOption(val);
      m_Descriptions.put(val, val.toString());
    }
  }//insertOption

  /**
   * Method to insert an Option to a Selection instance at a specific
   * index. Falls back to add, if index is corrupt.
   *
   * @param val   Object representing the option.
   * @param desc  String for displaying the option.
   * @param index int representing the desired index.
   */
  public void insertOption(Object val, String desc, int index) {
    try {
      m_Values.add(index, val);
      m_Descriptions.put(val, val.toString());

    } catch (ArrayIndexOutOfBoundsException aex) {
      addOption(val);
      m_Descriptions.put(val, val.toString());
    }
  }//insertOption

  /**
   * Method to remove an existing Option from a Selection instance.
   *
   * @param val Object representing the option.
   */
  public void removeOption(Object val) {
    m_Values.remove(val);
    m_Descriptions.remove(val);
  }//removeOption

  /**
   * Method to remove an existing Option from a Selection instance.
   * Does nothing if the index is corrupt.
   *
   * @param index int representing the options index.
   */
  public void removeOption(int index) {
    try {
      Object key = m_Values.remove(index);
      if (key != null) {
        m_Descriptions.remove(key);
      }
    } catch (ArrayIndexOutOfBoundsException aex) {
      //nothing
    }
  }//removeOption

  /**
   * Accessor method for an option of this selection.
   * Returns null if index is corrupt.
   *
   * @param index int representing the options index.
   * @return Object that represents the option.
   */
  public Object getOption(int index) {
    try {
      Object o = m_Values.get(index);
      if (o != null) {
        return o;
      }
    } catch (ArrayIndexOutOfBoundsException aex) {
      //nothing
    }
    return null;
  }//getOption


  /**
   * Accessor method to retrieve the selected option.
   * Returns -1 if no option exists.
   *
   * @return index int representing index of the the selected option.
   */
  public int getSelected() {
    return m_Selected;
  }//getSelected

  /**
   * Accessor method to retrieve the selected option.
   * Returns null if no option exists.
   *
   * @return Object representing the value of the selected option.
   */
  public Object getSelectedValue() {
    return m_Values.get(m_Selected);
  }//getSelected

  /**
   * Mutator method to set selected option programatically.
   * Does nothing if the index is corrupt.
   *
   * @param index int representing an options index.
   */
  public void setSelected(int index) throws IOException {
    if (index < 0 || index > m_Values.size()) {
      return;
    } else {
      m_LastSelected = m_Selected;
      m_Selected = index;
      //needs redraw
      draw();
    }
  }//setSelected

  public void initialSelect(Object val) {
    m_Selected = m_Values.indexOf(val);
    m_LastSelected = m_Selected;
  }//initialSelect

  /**
   * Method that will make the selection active,
   * reading and processing input.
   */
  public void run() throws IOException {
    int in = 0;
    storeAutoflush();
    try {
      draw();
      m_IO.flush();
      do {
        //get next key
        in = m_IO.read();
        switch (in) {
          case BasicTerminalIO.IO_ERROR:
            in = -1;
            throw new IOException();          
          case BasicTerminalIO.LEFT:
          case BasicTerminalIO.UP:
            if (!selectPrevious()) {
              m_IO.bell();
            }
            break;
          case BasicTerminalIO.RIGHT:
          case BasicTerminalIO.DOWN:
            if (!selectNext()) {
              m_IO.bell();
            }
            break;
          case BasicTerminalIO.TABULATOR:
          case BasicTerminalIO.ENTER:
            in = -1;
            break;
          default:
            m_IO.bell();
        }
        m_IO.flush();
      } while (in != -1);
    } finally {
      restoreAutoflush();
    }
  }//run

  /**
   * Method that draws the component.
   */
  public void draw() throws IOException {

    String opttext = (String) m_Descriptions.get(getSelectedValue());
    int lastlen = (int) ColorHelper.getVisibleLength(
        (String) m_Descriptions.get(getOption(m_LastSelected)));
    int thislen = (int) ColorHelper.getVisibleLength(opttext);

    int diff = lastlen - thislen;

    //System.out.println("DEBUG: selected="+selected+"/"+opttext.length()+" last="+lastselected+"/"+lastlength+" diff="+diff);
    if (diff > 0) {
      StringBuffer sbuf = new StringBuffer();
      sbuf.append(opttext);
      for (int i = 0; i < diff; i++) {
        sbuf.append(" ");
      }
      opttext = sbuf.toString();
    }

    if (m_Location != null) {
      m_IO.setCursor(m_Location.getRow(), m_Location.getColumn());
    }
    m_IO.write(opttext);
    m_IO.moveLeft(thislen);
  }//draw


  private boolean selectNext() throws IOException {
    if (m_Selected < (m_Values.size() - 1)) {
      setSelected(m_Selected + 1);
      return true;
    } else {
      return false;
    }
  }//selectNext


  private boolean selectPrevious() throws IOException {
    if (m_Selected > 0) {
      setSelected(m_Selected - 1);
      return true;
    } else {
      return false;
    }
  }//selectPrevious

  public static final int ALIGN_LEFT = 1;
  public static final int ALIGN_RIGHT = 2;


}//class Selection

