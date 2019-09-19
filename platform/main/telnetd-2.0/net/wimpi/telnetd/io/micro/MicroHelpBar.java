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
package net.wimpi.telnetd.io.micro;

import java.io.IOException;
import java.util.ResourceBundle;

import net.wimpi.telnetd.io.BasicTerminalIO;
import net.wimpi.telnetd.io.terminal.ColorHelper;
import net.wimpi.telnetd.io.toolkit.InertComponent;
import net.wimpi.telnetd.util.StringUtil;


/**
 * Class that implements a statusbar, for the bottom of the
 * Terminal Window.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
class MicroHelpBar
    extends InertComponent {

  //Members
  private String m_Line1;
  private String m_Line2;
  private String m_BgColor;
  private String m_FgColor;
  private ResourceBundle m_Resources;


  /**
   * Constructor for a simple statusbar instance.
   */
  public MicroHelpBar(BasicTerminalIO io, String name, ResourceBundle rb) {
    super(io, name);
    m_Resources = rb;
  }//constructor

  /**
   * Mutator method for the SoregroundColor property.
   *
   * @param color String, valid if it is a ColorHelper color constant.
   */
  public void setForegroundColor(String color) {
    m_FgColor = color;
  }//setForegroundColor

  /**
   * Mutator method for the BackgroundColor property.
   *
   * @param color String, valid if it is a ColorHelper color constant.
   */
  public void setBackgroundColor(String color) {
    m_BgColor = color;
  }//setBackgroundColor


  /**
   * Method that draws the statusbar on the screen.
   */
  public void draw() throws IOException {
    final int end = m_IO.getRows();
    m_IO.storeCursor();
    m_IO.setCursor(end - 1, 1);
    m_IO.write(getLine1());
    m_IO.setCursor(end, 1);
    m_IO.write(getLine2());
    m_IO.restoreCursor();
  }//draw


  /**
   * Internal method that creates the true titlebarstring displayed
   * on the terminal.
   */
  private String getLine1() {
    if (m_Line1 != null) {
      return m_Line1;
    }
    final StringBuffer sbuf = new StringBuffer();
    appendField(sbuf, Micro.PASTE_MODE_KEY, m_Resources.getString(Micro.PASTE_MODE_KEY));
    appendField(sbuf, Micro.PREV_PAGE_KEY, m_Resources.getString(Micro.PREV_PAGE_KEY));
    appendField(sbuf, Micro.TO_TOP_KEY, m_Resources.getString(Micro.TO_TOP_KEY));
    appendField(sbuf, Micro.CUT_TEXT_KEY, m_Resources.getString(Micro.CUT_TEXT_KEY));
    appendField(sbuf, Micro.CLEAR_BUFFER_KEY, m_Resources.getString(Micro.CLEAR_BUFFER_KEY));
    pad(sbuf);
    m_Line1 = sbuf.toString();
    return m_Line1;
  }//getLine1

  private String getLine2() {
    if (m_Line2 != null) {
      return m_Line2;
    }
    final StringBuffer sbuf = new StringBuffer();
    appendField(sbuf, Micro.EXIT_KEY, m_Resources.getString(Micro.EXIT_KEY));
    appendField(sbuf, Micro.NEXT_PAGE_KEY, m_Resources.getString(Micro.NEXT_PAGE_KEY));
    appendField(sbuf, Micro.TO_BOTTOM_KEY, m_Resources.getString(Micro.TO_BOTTOM_KEY));
    appendField(sbuf, Micro.UNCUT_TEXT_KEY, m_Resources.getString(Micro.UNCUT_TEXT_KEY));
    pad(sbuf);
    m_Line2 = sbuf.toString();
    return m_Line2;
  }//getLine2

  private void appendField(StringBuffer sbuf, String key, String desc) {
    sbuf.append(prepareKey(key));
    sbuf.append(getSpace());
    sbuf.append(prepareDescription(desc));
    sbuf.append(getSpace());
  }//getField

  private String prepareKey(String key) {
    //return inverted
    return ColorHelper.colorizeText(key, m_BgColor, m_FgColor);
  }//prepareKey

  private void appendEmptyField(StringBuffer sbuf) {
    sbuf.append(ColorHelper.colorizeText("             ", m_FgColor, m_BgColor));
  }//appendEmptyField

  private String prepareDescription(String desc) {
    final StringBuffer sbuf = new StringBuffer();
    if (desc.length() > 9) {
      sbuf.append(desc.substring(0, 9));
    }
    sbuf.append(desc);
    StringUtil.appendSpaces(sbuf, 9 - desc.length());
    return ColorHelper.colorizeText(sbuf.toString(), m_FgColor, m_BgColor);
  }//prepareDescription

  private void pad(StringBuffer sbuf) {
    final int l = m_IO.getColumns() - (int) ColorHelper.getVisibleLength(sbuf.toString());
    if (l > 0) {
      sbuf.append(ColorHelper.colorizeText(StringUtil.getSpaces(l), m_FgColor, m_BgColor));
    }
  }//append

  private String getSpace() {
    return ColorHelper.colorizeText(" ", m_FgColor, m_BgColor);
  }//getSpace

}//class MicroHelpBar
