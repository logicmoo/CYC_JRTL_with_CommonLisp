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


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Dictionary;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateErrorListener;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.osgi.service.cm.ConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.util.DictionaryUtility;
import net.wimpi.telnetd.util.Mutex;


/**
 * Class implementing the styles manager.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class StylesManager {

  private StringTemplateGroup m_Styles;
  private StringTemplate m_EmbeddedStyle;
  private StringTemplate m_StartStyleTemplate;
  private StringTemplate m_NewStyleTemplate;
  private StringTemplateOutputListener m_STListener;
  private boolean m_Initialized = false;
  private Mutex m_LoadingLock = new Mutex();
  private String m_StylesFile = null;
  private String m_Identifier = "";

  public StylesManager() {
    m_STListener = new StringTemplateOutputListener();
  }//private constructor

  public void configure(Dictionary conf)
      throws ConfigurationException {
    //configure identifier
    m_Identifier = DictionaryUtility.getString(conf, CONFKEY_IDENTIFIER);
    m_StylesFile = DictionaryUtility.getString(conf, CONFKEY_STYLESFILE);
  }//configure

  public boolean isInitialized() {
    return m_Initialized;
  }//isInitialized

  /**
   * Initializes the <tt>StyleManager</tt>, preparing
   * the basic terminal output styles (colors, bgcolors and types)
   * as well as the custom defined styles as loaded from the configured
   * repository.
   */
  public final void initialize() {
    if (!m_Initialized) {
      try {
        m_Initialized = loadStyles();
      } catch (Exception ex) {
        Activator.getServices().error("initialize()", ex);
      }
    }
  }//initialize

  /**
   * Reloads the custom styles.
   *
   * @return true if loaded, false otherwise.
   */
  public final boolean reload() {
    Activator.getServices().debug("reloadTemplates():Reloading styles.");
    if (m_Initialized) {
      StringTemplateGroup backupStyles = m_Styles;
      if (!loadStyles()) {
        m_Styles = backupStyles;
      } else {
        backupStyles = null;
      }
    }
    return true;
  }//reloadTemplates

  private final boolean loadStyles() {
    boolean result = false;
    try {
      m_LoadingLock.acquire();
      //Basic styles and color
      prepareBaseStyles();
      //Style templates
      prepareCustomStyles();
      //done
      result = true;
    } catch (Exception ex) {
      Activator.getServices().error("loadStyles()", ex);
    } finally {
      m_LoadingLock.release();
    }

    return result;
  }//loadStyles

  /**
   * Formats a given content with the given style.
   * If the style is not defined, the content will be returned
   * unmodified.
   *
   * @param content the content to be formatted.
   * @param style   the style to be used.
   * @return the formatted content.
   */
  public String format(String content, String style) {
    if (m_Styles.isDefinedInThisGroup(style)) {
      StringTemplate st = m_Styles.lookupTemplate(style);
      st.reset();
      st.setAttribute("it", content);
      return st.toString();
    } else {
      return content;
    }
  }//format

  /**
   * Appends an embedded style to a content that has an encapsulating
   * style.
   * Note that this method is specifically designed for the template
   * file parser.
   *
   * @param sbuf     the <tt>StringBuffer</tt> to append to.
   * @param content  the content to be formatted.
   * @param style    the style to be used.
   * @param encstyle the encapsulating style name.
   */
  public void appendEmbeddedStyle(StringBuffer sbuf, String content,
                                  String style, String encstyle) {
    if (encstyle == null || encstyle.length() == 0) {
      sbuf.append(format(content, style));
    } else {
      //Activator.getServices().debug("appendEmbeddedStyle():content=" + content + " style=" + style + " encapstyle=" + encstyle);
      sbuf.append(m_Styles.lookupTemplate(END_TOKEN + encstyle).toString());
      //Activator.getServices().debug("Appended ==>" + m_Styles.lookupTemplate("end"+encstyle).toString() + "<==");
      sbuf.append(format(content, style));
      sbuf.append(m_Styles.lookupTemplate(START_TOKEN + encstyle).toString());
      //Activator.getServices().debug("Appended ==>" + m_Styles.lookupTemplate("end"+encstyle).toString() + "<==");
    }
  }//appendtEmbeddedStyle

  /**
   * Formats the given content with the given style as
   * template. Markups will be added as template, not
   * as internal telnetd markups.
   *
   * @param content the content string to be formatted.
   * @param style   the style to be used
   * @return the formatted template.
   */
  public String formatAsTemplate(String content, String style) {
    if (m_Styles.isDefinedInThisGroup(style)) {
      StringTemplate st = m_EmbeddedStyle.getInstanceOf();
      st.setAttribute("style", style);
      st.setAttribute("content", content);
      return st.toString();
    } else {
      return content;
    }
  }//formatAsTemplate

  /**
   * Adds a new style template to the repository.
   * Note that this method is specifically designed for
   * the custom style file parser.
   *
   * @param name    the name of the style.
   * @param type    the type of the style.
   * @param color   the color.
   * @param bgcolor the background color.
   */
  public void addStyle(String name, String type, String color, String bgcolor) {
    //create style
    StringTemplate newstyle = m_NewStyleTemplate.getInstanceOf();
    if (type != null && type.length() > 0) {
      newstyle.setAttribute("type", type);
    }
    if (color != null && color.length() > 0) {
      newstyle.setAttribute("color", color);
    }
    if (bgcolor != null && bgcolor.length() > 0) {
      newstyle.setAttribute("bgcolor", bgcolor);
    }
    m_Styles.defineTemplate(name, newstyle.toString());

    //create start and end styles
    newstyle = m_StartStyleTemplate.getInstanceOf();
    if (type != null && type.length() > 0) {
      newstyle.setAttribute("type", type);
    }
    if (color != null && color.length() > 0) {
      newstyle.setAttribute("color", color);
    }
    if (bgcolor != null && bgcolor.length() > 0) {
      newstyle.setAttribute("bgcolor", bgcolor);
    }
    m_Styles.defineTemplate(START_TOKEN + name, newstyle.toString());
    Activator.getServices().debug("addStyle():" + name);
    addStyleAlias(END_TOKEN + name, "reset");
  }//addStyle

  /**
   * Adds a style alias (lightweight name->target reference)
   * to the repository.
   *
   * @param name   the name of the style
   * @param target the target style.
   */
  public void addStyleAlias(String name, String target) {
    if (m_Styles.isDefinedInThisGroup(target)) {
      m_Styles.defineTemplateAlias(name, target);

      if (!target.startsWith(START_TOKEN) && !target.startsWith(END_TOKEN)
          && target.indexOf("reset") == -1) {
        m_Styles.defineTemplateAlias(START_TOKEN + name, START_TOKEN + target);
        m_Styles.defineTemplateAlias(END_TOKEN + name, END_TOKEN + target);
      }

      Activator.getServices().debug("addStyleAlias():" + name);
    }
  }//addStyleAlias

  /**
   * Tests if a given style is defined.
   *
   * @param name the name of the style.
   * @return true if defined, false otherwise.
   */
  public boolean isStyleDefined(String name) {
    return m_Styles.isDefinedInThisGroup(name);
  }//isStyleDefined

  /**
   * Returns the complete repository of styles.
   *
   * @return the repository of styles as <tt>StringTemplateGroups</tt>.
   */
  public StringTemplateGroup getStyles() {
    return m_Styles;
  }//getStyles

  private void prepareBaseStyles() {
    Activator.getServices().debug("prepareBaseStyles()::Preparing base styles.");
    m_Styles = new StringTemplateGroup("base");
    m_Styles.setErrorListener(m_STListener);
    m_Styles.defineTemplate("reset", "\001a");

    //Bold
    m_Styles.defineTemplate("bold", "\001f$it$\001d");
    m_Styles.defineTemplate("startbold", "\001f");
    m_Styles.defineTemplate("endbold", "\001d");
    //italic
    m_Styles.defineTemplate("italic", "\001i$it$\001j");
    m_Styles.defineTemplate("startitalic", "\001i");
    m_Styles.defineTemplate("enditalic", "\001j");
    //underlined
    m_Styles.defineTemplate("underlined", "\001u$it$\001v");
    m_Styles.defineTemplate("startunderlined", "\001u");
    m_Styles.defineTemplate("endunderlined", "\001v");
    //blink
    m_Styles.defineTemplate("blink", "\001e$it$\001n");
    m_Styles.defineTemplate("startblink", "\001e");
    m_Styles.defineTemplate("endblink", "\001n");
    //black
    m_Styles.defineTemplate("black", "\001S$it$\001a");
    m_Styles.defineTemplate("startblack", "\001S");
    m_Styles.defineTemplateAlias("endblack", "reset");
    m_Styles.defineTemplate("bgblack", "\001s$it$\001a");
    m_Styles.defineTemplate("startbgblack", "\001s");
    m_Styles.defineTemplateAlias("endbgblack", "reset");
    //red
    m_Styles.defineTemplate("red", "\001R$it$\001a");
    m_Styles.defineTemplate("startred", "\001R");
    m_Styles.defineTemplateAlias("endred", "reset");
    m_Styles.defineTemplate("bgred", "\001r$it$\001a");
    m_Styles.defineTemplate("startbgred", "\001r");
    m_Styles.defineTemplateAlias("endbgred", "reset");
    //green
    m_Styles.defineTemplate("green", "\001G$it$\001a");
    m_Styles.defineTemplate("startgreen", "\001G");
    m_Styles.defineTemplateAlias("endgreen", "reset");
    m_Styles.defineTemplate("bggreen", "\001g$it$\001a");
    m_Styles.defineTemplate("startbggreen", "\001g");
    m_Styles.defineTemplateAlias("endbggreen", "reset");
    //yellow
    m_Styles.defineTemplate("yellow", "\001Y$it$\001a");
    m_Styles.defineTemplate("startyellow", "\001Y");
    m_Styles.defineTemplateAlias("endyellow", "reset");
    m_Styles.defineTemplate("bgyellow", "\001y$it$\001a");
    m_Styles.defineTemplate("startbgyellow", "\001y");
    m_Styles.defineTemplateAlias("endbgyellow", "reset");
    //blue
    m_Styles.defineTemplate("blue", "\001B$it$\001a");
    m_Styles.defineTemplate("startblue", "\001B");
    m_Styles.defineTemplateAlias("endblue", "reset");
    m_Styles.defineTemplate("bgblue", "\001b$it$\001a");
    m_Styles.defineTemplate("startbgblue", "\001B");
    m_Styles.defineTemplateAlias("endbgblue", "reset");
    //magenta
    m_Styles.defineTemplate("magenta", "\001M$it$\001a");
    m_Styles.defineTemplate("startmagenta", "\001M");
    m_Styles.defineTemplateAlias("endmagenta", "reset");
    m_Styles.defineTemplate("bgmagenta", "\001m$it$\001a");
    m_Styles.defineTemplate("startbgmagenta", "\001m");
    m_Styles.defineTemplateAlias("endbgmagenta", "reset");
    //cyan
    m_Styles.defineTemplate("cyan", "\001C$it$\001a");
    m_Styles.defineTemplate("startcyan", "\001C");
    m_Styles.defineTemplateAlias("endcyan", "reset");
    m_Styles.defineTemplate("bgcyan", "\001c$it$\001a");
    m_Styles.defineTemplate("startbgcyan", "\001c");
    m_Styles.defineTemplateAlias("endbgcyan", "reset");
    //white
    m_Styles.defineTemplate("white", "\001W$it$\001a");
    m_Styles.defineTemplate("startwhite", "\001W");
    m_Styles.defineTemplateAlias("endwhite", "reset");
    m_Styles.defineTemplate("bgwhite", "\001w$it$\001a");
    m_Styles.defineTemplate("startbgwhite", "\001w");
    m_Styles.defineTemplateAlias("endbgwhite", "reset");

    m_EmbeddedStyle = new StringTemplate("\\$start$style$()\\$$content$\\$end$style$()\\$");
    m_StartStyleTemplate = new StringTemplate("$if(type)$" +
        "\\$start$type$()\\$" +
        "$endif$" +
        "$if(color)$" +
        "\\$start$color$()\\$" +
        "$endif$" +
        "$if(bgcolor)$" +
        "\\$start$bgcolor$()\\$" +
        "$endif$");
    //SystemName(it)::="$it:bold():black():bgyellow()$"
    m_NewStyleTemplate = new StringTemplate("\\$it" +
        "$if(type)$" +
        ":$type$()" +
        "$endif$" +
        "$if(color)$" +
        ":$color$()" +
        "$endif$" +
        "$if(bgcolor)$" +
        ":$bgcolor$()" +
        "$endif$" +
        "\\$");
    //m_Styles = new StringTemplateGroup("custom");
    //m_Styles.setSuperGroup(m_Styles);
  }//prepareBaseStyles

  /**
   * Prepares the custom defined styles from the configured
   * styles file.
   */
  private void prepareCustomStyles() throws Exception {
    File f = new File(m_StylesFile);
    InputStream in = new FileInputStream(f);
    XMLReader parser = Activator.getXMLReader();
    //XMLReader parser = XMLReaderFactory.createXMLReader();
    //Activate Namespaces
    parser.setFeature("http://xml.org/sax/features/namespaces", true);
    if (new Boolean(System.getProperty("sax.parser.verify")).booleanValue()) {
      parser.setFeature("http://xml.org/sax/features/validation", true);
    } else {
      Activator.getServices().debug("prepareCustomStyles()::Disabled DTD Validation.");
      parser.setFeature("http://xml.org/sax/features/validation", false);
    }
    Activator.getServices().debug("Have parser = " + parser.toString());
    InputSource src = new InputSource(in);
    Activator.getServices().debug("Have InputSource = " + src.toString());

    //set content handler for telnet styles
    parser.setContentHandler(new StylesHandler(this));
    parser.parse(src);
    in.close();

  }//prepareCustomStyles


  private final class StringTemplateOutputListener
      implements StringTemplateErrorListener {

    public void error(String msg, Throwable e) {
      Activator.getServices().error(m_Identifier + "::StringTemplate error:" + msg, e);
    }//error

    public void debug(String msg) {
      Activator.getServices().debug(m_Identifier + "::" + msg);
    }//debug

    public void warning(String msg) {
      Activator.getServices().warn(m_Identifier + "::" + msg);
    }//warning

  }//StringTemplateOutputListener

/*
  public static void main(String[] args) {
    //org.apache.log4j.BasicConfigurator.configure();
    initialize();
    //Test for basic styles
    print(StylesManager.format("Test", "bold"));
    print(StylesManager.format("Test", "underlined"));
    print(StylesManager.format("Test", "italic"));
    print(StylesManager.format("Test", "blink"));
    //Test for combined styles
    print(StylesManager.format("Hello $name$!", "bold"));

    //StringTemplate test with embedded format
    String test = formatAsTemplate("Hello $startblink()$$title$ $name$$endblink()$!", "yellow");
    print(test);

  }//main

  public static void print(String str) {
    System.out.println(Colorizer.getReference().colorize(str, true));
  }//print
*/


  /**
   * Key for the identifier configuration value.
   */
  public static final String CONFKEY_IDENTIFIER = "identifier";

  /**
   * Key for the templates files prefix configuration value.
   */
  public static final String CONFKEY_STYLESFILE = "styles.file";

  private static final String START_TOKEN = "start";
  private static final String END_TOKEN = "end";
}//class StylesManager
