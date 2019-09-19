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

package net.wimpi.telnetd.io.util;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import net.wimpi.telnetd.io.terminal.ColorHelper;

/**
 * Class implementing a SAX handler for the templates defining
 * XML documents.
 * <p/>
 * This code is hand written, based on a simple state
 * machine. Note that it includes a whitespace handling
 * mechanism for convenience, that fill allow the document
 * to be structured much better (as TAG indents won't
 * hurt any longer).
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class TemplatesHandler
    extends DefaultHandler {

  //state
  protected int m_State = STATE_UNDEFINED;
  protected Stack m_Prefix;
  protected StringBuffer m_Buffer;
  protected TemplatesManager m_TemplatesManager;
  protected TemplatesManager.Template m_Template;
  protected TemplatesManager.TemplateMap m_TemplateMap;
  protected StylesManager m_StylesMgr;
  protected String m_Color = ColorHelper.WHITE;
  protected StringBuffer m_FormatBuffer;
  protected String m_Style;
  protected Stack m_SetStyle;
  protected boolean m_FilterWhiteSpace = true;
  protected int m_Lines;
  protected boolean m_EndSpaceSwallowed = false;

  public TemplatesHandler(TemplatesManager tmgr, TemplatesManager.TemplateMap poolset) {
    m_TemplateMap = poolset;
    m_Prefix = new Stack();
    m_SetStyle = new Stack();
    m_StylesMgr = tmgr.getStylesManager();
    m_TemplatesManager = tmgr;
  }//constructor

  public void startElement(String uri, String name,
                           String qualifiedName, Attributes attributes)
      throws SAXException {

    try {
      switch (m_State) {
        case STATE_UNDEFINED:
          if (Tokens.TEMPLATES.equals(name)) {
            m_State = STATE_TEMPLATES;
          } else {
            throw new SAXException("Root element not found.");
          }
          break;
        case STATE_TEMPLATES:
          if (Tokens.TEMPLATESET.equals(name)) {
            handleTemplateSet(attributes);
            m_State = STATE_TEMPLATESET;
          } else if (Tokens.TEMPLATE.equals(name)) {
            m_Template = m_TemplatesManager.createTemplate();
            handleTemplateAttributes(attributes);
            m_Buffer = new StringBuffer();
            m_State = STATE_TEMPLATE;
          }
          break;
        case STATE_TEMPLATESET:
          if (Tokens.TEMPLATE.equals(name)) {
            m_Template = m_TemplatesManager.createTemplate();
            handleTemplateAttributes(attributes);
            m_Buffer = new StringBuffer();
            m_State = STATE_TEMPLATE;
          } else if (Tokens.TEMPLATESET.equals(name)) {
            handleTemplateSet(attributes);
            m_State = STATE_TEMPLATESET;
          }
          break;
        case STATE_TEMPLATE:
          if (Tokens.BR.equals(name)) {
            handleBRAttributes(attributes);
            m_State = STATE_BR;
          } else if (Tokens.COLOR.equals(name)) {
            handleColorAttributes(attributes, true);
            m_FormatBuffer = new StringBuffer();
            m_State = STATE_COLOR;
          } else if (Tokens.BGCOLOR.equals(name)) {
            handleColorAttributes(attributes, false);
            m_FormatBuffer = new StringBuffer();
            m_State = STATE_BGCOLOR;
          } else if (Tokens.STYLE.equals(name)) {
            handleStyleAttributes(attributes);
            m_FormatBuffer = new StringBuffer();
            m_State = STATE_STYLE;
          }
      }
    } catch (Exception e) {
      throw new SAXException(e);
    }
  }//startElement

  public void characters(char[] chars, int start, int length)
      throws SAXException {

    switch (m_State) {
      case STATE_TEMPLATE:
        m_EndSpaceSwallowed = filter(m_Buffer, chars, start, length);
        break;
      case STATE_COLOR:
      case STATE_BGCOLOR:
      case STATE_STYLE:
        //System.out.println("characters()::" + m_State + " start=" + start +" length=" + length);
        filter(m_FormatBuffer, chars, start, length);
        //System.out.println(" start=" + start +" length=" + length + " ==>" + m_FormatBuffer.toString() + "<==");
        break;

    }
  }//characters

  private boolean filter(StringBuffer buf, char[] chars, int start, int length) {
    boolean result = false;
    //filter whitespace
    int end = start + length;
    for (int i = start; i < end; i++) {
      char aChar = chars[i];
      switch (aChar) {
        case 9:
        case 10:
        case 13:
        case 14:
          continue;
        case 32:
          if (m_FilterWhiteSpace) {
            //catch left edge space
            if (i == end - 1 && !(length == 1)) {
              result = true;
              continue;
            }
            int idx = i + 1;
            idx = ((idx > (chars.length - 1)) ? i : idx);
            if (chars[idx] != 32 && (!bufferEndsWithSpace())) {
              buf.append(aChar);
            }
          } else {
            buf.append(aChar);
          }
          break;
        default:
          buf.append(aChar);
          break;
      }
    }
    return result;
  }//filter

  public void ignorableWhitespace(char[] ch, int start, int length)
      throws SAXException {
    //skip

  }//ignorableWhiteSpace

  public void endElement(String namespaceURI, String localName, String qName)
      throws SAXException {
    //log.debug("endElement()::" + m_State + "::" + localName);
    switch (m_State) {
      case STATE_TEMPLATES:
        //parsing should be over

        break;
      case STATE_TEMPLATESET:
        //decrease prefix
        if (!m_Prefix.isEmpty()) {
          m_Prefix.pop();
        }
        if (!m_SetStyle.isEmpty()) {
          m_SetStyle.pop();
        }
        break;
      case STATE_TEMPLATE:
        m_Template.setContent(m_Buffer.toString());
        //add to database
        m_TemplateMap.add(m_Template);
        //turn on whitespace filter if off for template
        if (!m_FilterWhiteSpace) {
          m_FilterWhiteSpace = true;
        }
        //transition to template set
        m_State = STATE_TEMPLATESET;
        break;
      case STATE_BR:
        if (m_EndSpaceSwallowed) {
          m_Buffer.append(' ');
          m_EndSpaceSwallowed = false;
        }
        for (int i = 0; i < m_Lines; i++) {
          m_Buffer.append("\r\n");
        }
        m_State = STATE_TEMPLATE;
        break;
      case STATE_COLOR:
        if (m_EndSpaceSwallowed) {
          //System.out.println("Endspaceswallowed????");
          m_Buffer.append(' ');
          m_EndSpaceSwallowed = false;
        }
        //append embedded style
        m_StylesMgr.appendEmbeddedStyle(m_Buffer, m_FormatBuffer.toString(),
            m_Color, m_Template.getStyle());
        m_State = STATE_TEMPLATE;
        break;
      case STATE_BGCOLOR:
        if (m_EndSpaceSwallowed) {
          //System.out.println("Endspaceswallowed????");
          m_Buffer.append(' ');
          m_EndSpaceSwallowed = false;
        }
        m_StylesMgr.appendEmbeddedStyle(m_Buffer, m_FormatBuffer.toString(),
            m_Color, m_Template.getStyle());
        m_State = STATE_TEMPLATE;
        break;
      case STATE_STYLE:
        if (m_EndSpaceSwallowed) {
          //System.out.println("Endspaceswallowed????");
          m_Buffer.append(' ');
          m_EndSpaceSwallowed = false;
        }
        m_StylesMgr.appendEmbeddedStyle(m_Buffer, m_FormatBuffer.toString(),
            m_Style, m_Template.getStyle());
        m_State = STATE_TEMPLATE;
        break;
    }
  }//endElement

  private final void handleTemplateSet(Attributes attr)
      throws SAXException {
    //1. id
    String str = attr.getValue("", Tokens.ID);
    if (str == null || str.length() == 0) {
      throw new SAXException("id missing.");
    } else if (Tokens.DEFAULT.equals(str)) {
      return;
    } else {
      String prefix = "";
      if (m_Prefix.isEmpty()) {
        prefix = new StringBuffer()
            .append(str)
            .append(Tokens.SETSEPARATOR)
            .toString();
      } else {
        prefix = new StringBuffer((String) m_Prefix.peek().toString())
            .append(str)
            .append(Tokens.SETSEPARATOR)
            .toString();
      }
      m_Prefix.push(prefix);
    }
    //3.style
    str = attr.getValue("", Tokens.STYLE);
    if (str != null && str.length() > 0) {
      m_SetStyle.push(str);
    }
  }//handleTemplateSet

  private final void handleTemplateAttributes(Attributes attr)
      throws SAXException {
    //1. id
    String str = attr.getValue("", Tokens.KEY);
    if (str == null || str.length() == 0) {
      throw new SAXException("key missing");
    } else {
      if (m_Prefix.isEmpty()) {
        m_Template.setKey(str);
      } else {
        m_Template.setKey((String) m_Prefix.peek() + str);
      }
    }
    //2. type
    str = attr.getValue("", Tokens.TYPE);
    if (str == null || str.length() == 0) {
      m_Template.setStatic(false);
    } else if (Tokens.STATIC.equals(str)) {
      m_Template.setStatic(true);
    }
    //3.style
    str = attr.getValue("", Tokens.STYLE);
    if (str != null && str.length() > 0) {
      m_Template.setStyle(str);
    } else if (!m_SetStyle.isEmpty()) {
      m_Template.setStyle((String) m_SetStyle.peek());
    }
    str = attr.getValue("", Tokens.WSFILTER);
    if (str != null && str.length() > 0 && Tokens.OFF.equals(str)) {
      m_FilterWhiteSpace = false;
    } else {
      m_FilterWhiteSpace = true;
    }
  }//handleTemplateAttributes

  private final void handleColorAttributes(Attributes attr, boolean fg)
      throws SAXException {
    //1. value
    String str = attr.getValue("", Tokens.VALUE);
    if (str == null || str.length() == 0) {
      throw new SAXException("value missing");
    } else {
      if (fg) {
        m_Color = str;
      } else {
        m_Color = "bg" + str;
      }
    }
  }//handleColorAttributes

  private final void handleStyleAttributes(Attributes attr)
      throws SAXException {
    //1. value
    String str = attr.getValue("", Tokens.VALUE);
    if (str != null && str.length() != 0) {
      m_Style = str;
    } else {
      throw new SAXException("style value is missing.");
    }
  }//handleStyleAttributes


  private final void handleBRAttributes(Attributes attr) {
    //1. value
    String str = attr.getValue("", Tokens.LINES);
    if (str != null && str.length() > 0) {
      try {
        m_Lines = Integer.parseInt(str);
      } catch (NumberFormatException ex) {
        m_Lines = 1;
      }
    } else {
      m_Lines = 1;
    }
  }//handleBRAttributes

  private final boolean bufferEndsWithSpace() {
    if (m_Buffer == null || m_Buffer.length() == 0) {
      return true;
    } else {
      return (m_Buffer.charAt(m_Buffer.length() - 1) == 32);
    }
  }//getLastBufferChar

  private static final int STATE_UNDEFINED = -1;
  private static final int STATE_TEMPLATES = 1;
  private static final int STATE_TEMPLATESET = 2;
  private static final int STATE_TEMPLATE = 3;
  private static final int STATE_BR = 4;
  private static final int STATE_COLOR = 5;
  private static final int STATE_BGCOLOR = 6;
  private static final int STATE_STYLE = 7;

  /**
   * Inner class defining the tokens to be encountered in
   * the document.
   */
  private final class Tokens {

    static final String TEMPLATES = "templates";
    static final String TEMPLATESET = "template-set";
    static final String TEMPLATE = "template";
    static final String STATIC = "static";
    static final String DYNAMIC = "dynamic";
    static final String BR = "br";
    static final String COLOR = "color";
    static final String BGCOLOR = "bgcolor";
    static final String STYLE = "style";
    static final String KEY = "key";
    static final String VALUE = "value";
    static final String TYPE = "type";
    static final String ID = "id";
    static final String DEFAULT = "default";
    static final char SETSEPARATOR = '_';
    static final String WSFILTER = "wsfilter";
    static final String OFF = "off";
    static final String LINES = "lines";
  }//inner class Tokens

}//class TemplatesHandler
