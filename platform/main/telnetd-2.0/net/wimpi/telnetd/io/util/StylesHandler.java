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

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Class implementing a SAX handler for the custom
 * style definition XML document.
 * <p/>
 * This code is hand written, based on a simple state
 * machine.
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class StylesHandler
    extends DefaultHandler {

  //state
  protected int m_State = STATE_UNDEFINED;
  protected String m_Name;
  protected String m_Type;
  protected String m_Color;
  protected String m_BGColor;
  protected String m_Target;

  protected StylesManager m_StylesMgr;

  public StylesHandler(StylesManager mgr) {
    m_StylesMgr = mgr;
  }//constructor


  public void startElement(String uri, String name,
                           String qualifiedName, Attributes attributes)
      throws SAXException {

    try {
      switch (m_State) {
        case STATE_UNDEFINED:
          if (Tokens.STYLES.equals(name)) {
            m_State = STATE_STYLES;
          } else {
            throw new SAXException("Root element not found.");
          }
          break;
        case STATE_STYLES:
          if (Tokens.STYLE.equals(name)) {
            handleAttributes(attributes, false);
            m_State = STATE_STYLE;
          } else if (Tokens.STYLEALIAS.equals(name)) {
            handleAttributes(attributes, true);
            m_State = STATE_STYLEALIAS;
          }
          break;

      }
    } catch (Exception e) {
      throw new SAXException(e);
    }
  }//startElement

  public void endElement(String namespaceURI, String localName, String qName)
      throws SAXException {
    //log.debug("endElement()::" + m_State + "::" + localName);
    switch (m_State) {
      case STATE_STYLES:
        //parsing should be over

        break;
      case STATE_STYLE:
        m_StylesMgr.addStyle(m_Name, m_Type, m_Color, m_BGColor);
        m_Name = null;
        m_Type = null;
        m_Color = null;
        m_BGColor = null;
        m_State = STATE_STYLES;
        break;
      case STATE_STYLEALIAS:
        if (m_StylesMgr.isStyleDefined(m_Target)) {
          m_StylesMgr.addStyleAlias(m_Name, m_Target);
        } else {
          throw new SAXException("Alias target undefined.");
        }
        m_State = STATE_STYLES;
        break;
    }
  }//endElement


  private final void handleAttributes(Attributes attr, boolean alias)
      throws SAXException {
    //1. id
    String str = attr.getValue("", Tokens.ID);
    if (str == null || str.length() == 0) {
      throw new SAXException("id missing.");
    } else {
      m_Name = str;
    }
    if (alias) {
      m_Target = attr.getValue("", Tokens.REF);
    } else {
      m_Type = attr.getValue("", Tokens.TYPE);
      m_Color = attr.getValue("", Tokens.COLOR);
      m_BGColor = attr.getValue("", Tokens.BGCOLOR);
      m_BGColor = ((m_BGColor == null) ? null : "bg" + m_BGColor);
    }
  }//handleAttributes

  private static final int STATE_UNDEFINED = -1;
  private static final int STATE_STYLES = 1;
  private static final int STATE_STYLE = 2;
  private static final int STATE_STYLEALIAS = 3;

  /**
   * Inner class defining the tokens to be encountered in
   * the document.
   */
  private static final class Tokens {

    static final String STYLES = "styles";
    static final String STYLE = "style";
    static final String STYLEALIAS = "style-alias";
    static final String COLOR = "color";
    static final String BGCOLOR = "bgcolor";

    static final String VALUE = "value";
    static final String ID = "id";
    static final String REF = "ref";
    static final String TYPE = "type";
  }//inner class Tokens

}//class StylesHandler
