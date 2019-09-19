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
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.commons.collections.buffer.UnboundedFifoBuffer;
import org.apache.commons.pool.BasePoolableObjectFactory;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.osgi.service.cm.ConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import net.wimpi.telnetd.impl.Activator;
import net.wimpi.telnetd.io.TemplateAttributes;
import net.wimpi.telnetd.io.Templates;
import net.wimpi.telnetd.io.TemplatesUpdateListener;
import net.wimpi.telnetd.util.DictionaryUtility;
import net.wimpi.telnetd.util.Mutex;
import net.wimpi.telnetd.util.StringUtil;

/**
 * Class that implements a <tt>TemplatesManager</tt>.
 * <p/>
 * There is some intelligence placed in here, that should
 * help to reduce resource usage and speed up execution.
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class TemplatesManager
    implements Templates {

  private GenericObjectPool.Config m_AttrPoolConfig;
  private GenericObjectPool.Config m_PoolConfig;
  private GenericObjectPool m_TemplateAttributes;
  private String m_Identifier;
  private TemplateMap[] m_TemplateMaps;
  private int m_Size;
  private List m_Languages;
  private boolean m_Initialized = false;
  private Set m_UpdateListeners;
  private String m_TemplatesPath;
  private String m_TemplatePrefix;
  private String m_LanguageCodes;
  private Mutex m_LoadingLock = new Mutex();
  private StylesManager m_StylesManager;

  public TemplatesManager() {

    //Default Attribute pool config
    m_AttrPoolConfig = new GenericObjectPool.Config();
    m_AttrPoolConfig.maxActive = 50;
    m_AttrPoolConfig.maxIdle = 25;
    m_AttrPoolConfig.maxWait = -1;
    m_AttrPoolConfig.testOnBorrow = false;
    m_AttrPoolConfig.testOnReturn = false;
    m_AttrPoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_GROW;

    //default template pool configurations
    m_PoolConfig = new GenericObjectPool.Config();
    m_PoolConfig.maxActive = 50;
    m_PoolConfig.maxIdle = 25;
    m_PoolConfig.maxWait = -1;
    m_PoolConfig.testOnBorrow = false;
    m_PoolConfig.testOnReturn = false;
    m_PoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_GROW;

    //update listeners
    m_UpdateListeners = new HashSet();

    //styles manager
    m_StylesManager = new StylesManager();
  }//constructor

  public StylesManager getStylesManager() {
    return m_StylesManager;
  }//getStylesManager


  public String getIdentifier() {
    return m_Identifier;
  }//getIdentifier

  public void configure(Dictionary conf)
      throws ConfigurationException {

    //configure identifier
    m_Identifier = DictionaryUtility.getString(conf, CONFKEY_IDENTIFIER);

    //configure path from url, discover languages
    m_TemplatePrefix = DictionaryUtility.getString(conf, CONFKEY_BASENAME);
    m_TemplatesPath = DictionaryUtility.getString(conf, CONFKEY_PATH);
    m_LanguageCodes = DictionaryUtility.getString(conf, CONFKEY_LANGUAGES);

    //obtain template pool configuration
    if (DictionaryUtility.containsKey(conf, CONFKEY_POOL_MAXACTIVE)) {
      m_PoolConfig.maxActive = DictionaryUtility.getInt(conf, CONFKEY_POOL_MAXACTIVE);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_POOL_MAXIDLE)) {
      m_PoolConfig.maxIdle = DictionaryUtility.getInt(conf, CONFKEY_POOL_MAXIDLE);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_POOL_MAXWAIT)) {
      m_PoolConfig.maxWait = DictionaryUtility.getInt(conf, CONFKEY_POOL_MAXWAIT);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_POOL_EXHAUSTACTION)) {
      String ea = DictionaryUtility.getString(conf, CONFKEY_POOL_EXHAUSTACTION, CONF_POOL_EXHAUSTACTIONS);
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[0])) {
        m_PoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_GROW;
      }
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[1])) {
        m_PoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_FAIL;
      }
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[2])) {
        m_PoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_BLOCK;
      }
    }

    //obtain attribute pool configuration
    if (DictionaryUtility.containsKey(conf, CONFKEY_ATTRPOOL_MAXACTIVE)) {
      m_AttrPoolConfig.maxActive = DictionaryUtility.getInt(conf, CONFKEY_ATTRPOOL_MAXACTIVE);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_ATTRPOOL_MAXIDLE)) {
      m_AttrPoolConfig.maxIdle = DictionaryUtility.getInt(conf, CONFKEY_ATTRPOOL_MAXIDLE);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_ATTRPOOL_MAXWAIT)) {
      m_AttrPoolConfig.maxWait = DictionaryUtility.getInt(conf, CONFKEY_ATTRPOOL_MAXWAIT);
    }
    if (DictionaryUtility.containsKey(conf, CONFKEY_ATTRPOOL_EXHAUSTACTION)) {
      String ea = DictionaryUtility.getString(conf, CONFKEY_ATTRPOOL_EXHAUSTACTION, CONF_POOL_EXHAUSTACTIONS);
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[0])) {
        m_AttrPoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_GROW;
      }
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[1])) {
        m_AttrPoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_FAIL;
      }
      if (ea.equals(CONF_POOL_EXHAUSTACTIONS[2])) {
        m_AttrPoolConfig.whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_BLOCK;
      }
    }
    //configure styles manager
    m_StylesManager.configure(conf);

  }//configure

  /**
   * Initializes this <tt>TemplateManager</tt> loading and
   * preparing templates from a configured XML repository.
   */
  public boolean initialize() {
    //1. initialize Style manager
    if (!m_Initialized) {
      //prepare attributes pool
      m_TemplateAttributes = new GenericObjectPool(new TemplateAttributesImpl(), m_AttrPoolConfig);
      //initialize styles manager
      m_StylesManager.initialize();
      m_Initialized = prepareTemplates();
      return true;
    }
    return false;
  }//initialize

  /**
   * Tests if this <tt>TemplatesManager</tt> is initialized.
   *
   * @return true if initialized, false otherwise.
   */
  public boolean isInitialized() {
    return m_Initialized;
  }//isInitialized

  public boolean reloadTemplates() {
    if (prepareTemplates()) {
      for (Iterator iterator = m_UpdateListeners.iterator(); iterator.hasNext();) {
        ((TemplatesUpdateListener) iterator.next()).updatedTemplates();
      }
      return true;
    } else {
      return false;
    }
  }//reloadTemplates

  public boolean reloadStyles() {
    return m_StylesManager.reload();
  }//reloadStyles

  public void dispose() {

  }//dispose

  public void registerUpdateListener(TemplatesUpdateListener l) {
    m_UpdateListeners.add(l);
    Activator.getServices().debug("registerUpdateListener() ::" + l.toString());
  }//registerUpdateListener

  public void removeUpdateListener(TemplatesUpdateListener l) {
    m_UpdateListeners.remove(l);
    Activator.getServices().debug("removeUpdateListener() ::" + l.toString());
  }//removeConfigUpdateListener

  /**
   * Returns an iterator over available languages.
   *
   * @return an <tt>Iterator</tt> instance.
   */
  public Iterator getLanguages() {
    return m_Languages.iterator();
  }//getLanguages

  /**
   * Returns the index of the given language, or
   * -1 if the language is not found.
   * <p/>
   * Note that the returned String should be an ISO
   * two letter language code, as accepted by
   * the Locale.
   * </p>
   *
   * @param str the ISO two letter language code.
   * @return the index of the language as <tt>int</tt>.
   */
  public int getIndexOfLanguage(String str) {
    return m_Languages.indexOf(str);
  }//getIndexOfLanguage

  /**
   * Returns the index of the given language, or
   * -1 if the language is not found.
   * <p/>
   * Note that the returned String should be an ISO
   * two letter language code, as accepted by
   * the Locale.
   * </p>
   *
   * @param l a <tt>Locale</tt> instance that can return the ISO
   *          two letter language code.
   * @return the index of the language as <tt>int</tt>.
   */
  public int getIndexOfLanguage(Locale l) {
    return m_Languages.indexOf(l.getLanguage());
  }//getIndexOfLanguage


  /**
   * Returns the ISO two letter code of the
   * language at the given index.
   *
   * @param i the index of the language.
   * @return the ISO two letter code of the language.
   * @throws IndexOutOfBoundsException if the index is
   *                                   out of bounds.
   */
  public String getLanguageCode(int i) {
    return (String) m_Languages.get(i);
  }//getLanguageCode

  /**
   * Fetches the templates for all available languages and
   * returns an array of formatted strings.
   *
   * @param tkey the template key.
   * @param attr the attributes for the template.
   * @return an array of formatted strings with markups (if required).
   */
  public String[] formatAll(String tkey, TemplateAttributes attr) {
    String[] res = new String[m_TemplateMaps.length];
    for (int i = 0; i < m_TemplateMaps.length; i++) {
      try {
        res[i] = m_TemplateMaps[i].get(tkey).toString(attr);
      } catch (Exception ex) {
        Activator.getServices().error("formatAll()", ex);
        res[i] = "FAILED TO FORMAT TEMPLATE";
      }
    }
    return res;
  }//formatAll

  /**
   * Fetches the templates for all available languages and
   * returns an array of formatted strings.
   * <p/>
   * This is a convenience method that will call
   * {@link #formatAll(String,TemplateAttributes)}
   * with <tt>null</tt> for the attributes reference.
   *
   * @param tkey the template key.
   * @return an array of formatted strings with markups (if required).
   */
  public String[] formatAll(String tkey) {
    return formatAll(tkey, null);
  }//formatAll


  /**
   * Fetches the template specified by the given key and
   * language and returns a formatted string.
   * Note that the language will automatically fall back to the
   * default if a wrong language is specified.
   * This is a convenience method that will call
   * {@link #formatAll(String,net.wimpi.telnetd.io.TemplateAttributes)}
   * with <tt>null</tt> for the attributes reference.
   *
   * @param lang the language index.
   * @param tkey the template key.
   * @return the string formatted with markups (if required).
   */
  public String format(int lang, String tkey) {
    return format(lang, tkey, null);
  }//format

  /**
   * Fetches the template specified by the given key and
   * language, fills in the attributes and returns a formatted
   * string.
   * <p/>
   * Note that dynamic templates will be pooled and that the operation
   * will automatically release the template attributes, that should have been
   * obtained using {@link #leaseAttributes()}.<br/>
   * Static templates will not cost more then the lookup for a String reference
   * in a hashmap (they are cached).
   * </p>
   * Note also that the language will automatically fall back to the
   * default if a wrong language is specified.<br/>
   *
   * @param lang the language index.
   * @param tkey the template key.
   * @param attr the attributes for the template.
   * @return the string formatted with markups (if required).
   * @see #leaseAttributes()
   */
  public String format(int lang, String tkey, TemplateAttributes attr) {
    try {
      return m_TemplateMaps[verifyLanguageIndex(lang)]
          .get(tkey).toString(attr);
    } catch (Exception ex) {
      Activator.getServices().error("format()::key=" + tkey, ex);
      return "FAILED TO FORMAT TEMPLATE";
    }
  }//format

  public boolean isStyleDefined(String name) {
    return m_StylesManager.isStyleDefined(name);
  }//isStyleDefined

  public String formatStyle(String content, String style) {
    return m_StylesManager.format(content, style);
  }//formatStyle

  /**
   * Returns a leased {@link TemplateAttributes} instance.
   * This instance should be used immediately and passed to
   * {@link #format(int,String,net.wimpi.telnetd.io.TemplateAttributes)}, which will
   * recycle the instance returning it to the originating pool.
   *
   * @return a {@link net.wimpi.telnetd.io.TemplateAttributes}  instance.
   */
  public TemplateAttributes leaseAttributes() {
    try {
      return (TemplateAttributes) m_TemplateAttributes.borrowObject();
    } catch (Exception ex) {
      return new TemplateAttributesImpl();
    }
  }//leaseAttributes

  public TemplatesManager.Template createTemplate() {
    return new Template();
  }//createTemplate

  /**
   * Verifies the language index correcting it if not
   * available with the default (=0).
   *
   * @param lang the language index.
   * @return the verified language index.
   */
  private final int verifyLanguageIndex(int lang) {
    if (lang < 0 || lang >= m_Size) {
      return 0;
    } else {
      return lang;
    }
  }//verifyLanguageIndex

  /**
   * Prepares the templates, loading them from the configured path
   * for each language configured in the languages list.
   */
  private boolean prepareTemplates() {
    boolean result = false;
    try {
      m_LoadingLock.acquire();
      try {
        String[] lang = StringUtil.split(m_LanguageCodes, ",");
        m_Size = lang.length;
        TemplateMap[] newTMaps = new TemplateMap[m_Size]; //new templates
        File dir = new File(m_TemplatesPath);
        if (!dir.exists()) {
          throw new Exception("Templates dir doesnt exist.");
        }
        for (int i = 0; i < m_Size; i++) {

          File tfile = new File(dir, m_TemplatePrefix + "_" + lang[i] + ".xml");
          Activator.getServices().debug("prepareTemplates(): Loading and parsing templates file " + tfile);
          InputStream in = new FileInputStream(tfile);
          //XMLReader parser = XMLReaderFactory.createXMLReader();
          XMLReader parser = Activator.getXMLReader();
          //Activate Namespaces
          parser.setFeature("http://xml.org/sax/features/namespaces", true);
          if (new Boolean(System.getProperty("sax.parser.verify")).booleanValue()) {
            parser.setFeature("http://xml.org/sax/features/validation", true);
          } else {
            Activator.getServices().debug("prepareTemplates()::Disabled DTD Validation.");
            parser.setFeature("http://xml.org/sax/features/validation", false);
          }
          Activator.getServices().debug("Have parser = " + parser.toString());
          InputSource src = new InputSource(in);
          Activator.getServices().debug("Have InputSource = " + src.toString());
          //set content handler for the telnet templates
          newTMaps[i] = new TemplateMap();
          parser.setContentHandler(new TemplatesHandler(this, newTMaps[i]));
          parser.parse(src);
        }
        m_Languages = Arrays.asList(lang);
        m_TemplateMaps = newTMaps; //replace old
        result = true;
      } catch (Exception ex) {
        Activator.getServices().error("prepareTemplates()", ex);
      }

    } catch (InterruptedException ex) {
      Activator.getServices().error("prepareTemplates()::Interrupted.", ex);
    } finally {
      m_LoadingLock.release();
    }
    return result;
  }// prepareTemplates

  /**
   * Inner class implementing a language specific map
   * of templates, relating a key with a {@link TemplatesManager.Template}
   * instance.
   */
  protected class TemplateMap {

    private HashMap m_Templates;
    private StringTemplateGroup m_Group;

    public TemplateMap() {
      m_Templates = new HashMap();
      m_Group = new StringTemplateGroup("templates");
      m_Group.setSuperGroup(m_StylesManager.getStyles());
    }//TemplateSet

    /**
     * Adds a pool for a template to this map.
     * The key will be retrieved from the {@link TemplatesManager.Template}
     * instance itself.
     *
     * @param t the template to be added.
     */
    public void add(Template t) {
      Activator.getServices().debug("TemplateMap::add():template " + t.getKey());
      //1. prepare template accordingly
      t.prepareTemplate(m_Group);
      //2. add template to hashmap
      m_Templates.put(t.getKey(), t);
    }//add

    /**
     * Returns a {@link TemplatesManager.Template} instance if one
     * is mapped to the given key.
     *
     * @param key the key for the template as <tt>String</tt>
     * @return a {@link TemplatesManager.Template} instance.
     * @throws Exception if the template cannot be retrieved, or
     *                   the given key does not map to a template.
     */
    public Template get(String key) throws Exception {
      return (Template) m_Templates.get(key);
    }//get

  }//TemplateMap

  /**
   * Inner class implementing a <tt>Template</tt>.
   * <p/>
   * This class will automatically cache static template
   * products, and pool dynamic templates for reuse.
   */
  protected class Template {

    private boolean m_Static;
    private String m_Key;
    private String m_Style;
    private String m_Content;
    private StringTemplatePool m_STPool;
    private String m_Cached;

    public Template() {
    }//constructor

    /**
     * Formats the template with the given attributes.
     * For static templates, the attributes reference
     * should be <tt>null</tt>.
     * Dynamic templates might be called without attributes,
     * with varying success.
     * Note that this method will release the passed in
     * {@link net.wimpi.telnetd.io.TemplateAttributes} instance to the lokal
     * pool.
     *
     * @param attr a {@link TemplateAttributes} instance.
     * @return the formatted string with internal markup.
     */
    public String toString(TemplateAttributes attr) {
      if (m_Static) {
        return m_Cached;
      } else {
        //lease make string
        StringTemplate st = null;
        try {
          st = m_STPool.lease();
          if (attr != null) {
            for (Iterator iter = ((TemplateAttributesImpl) attr).iterator(); iter.hasNext();) {
              Object[] attrs = (Object[]) iter.next();
              String key = attrs[0].toString();
              if (attrs[1] instanceof String) {
                st.setAttribute(key, attrs[1].toString());
              } else if (attrs[1] instanceof String[]) {
                String[] values = (String[]) attrs[1];
                int i = values.length;
                if (i == 2) {
                  st.setAttribute(key, values[0], values[1]);
                } else if (i == 3) {
                  st.setAttribute(key, values[0], values[1], values[2]);
                } else if (i == 4) {
                  st.setAttribute(key, values[0], values[1], values[2], values[3]);
                } else if (i==5) {
                  st.setAttribute(key, values[0], values[1], values[2], values[3], values[4]);
                } else {
                  //Split of aggregate name
                  String agkey = key.substring(0,key.indexOf('.'));
                  //Split varnames
                  String[] varnames = key.substring(key.indexOf('{')+1,key.indexOf('}')).split(",");
                  HashMap<String,String> m = new HashMap<String,String>(20);
                  for (int n = 0; n < varnames.length; n++) {
                    m.put(varnames[n].trim(),values[n]);
                  }
                  st.setAttribute(agkey, m);
                }
              } else {
                //no attributes
                Activator.getServices().error("toString()::Can only handle String and String[]::" + key);
              }

              //st.setAttribute(str[0], str[1]);
              try {
                m_TemplateAttributes.returnObject(attr);
              } catch (Exception ex) {
                //ignore
              }
            }
          }
          return st.toString();
        } catch (Exception ex) {
          //ignore
        } finally {
          try {
            m_STPool.release(st);
          } catch (Exception ex) {
            //ignore
          }
        }
      }
      return "";
    }//toString

    /**
     * Returns the key to this <tt>Template</tt>.
     *
     * @return the key as <tt>String</tt>.
     */
    public String getKey() {
      return m_Key;
    }//getKey

    /**
     * Sets the key for this <tt>Template</tt>.
     *
     * @param key
     */
    public void setKey(String key) {
      m_Key = key;
    }//setKey

    /**
     * Returns the style for this template.
     *
     * @return the style as <tt>String</tt>.
     */
    public String getStyle() {
      return m_Style;
    }//getStyle

    /**
     * Sets the style for this template.
     *
     * @param style the style as <tt>String</tt>
     */
    public void setStyle(String style) {
      m_Style = style;
    }//setStyle

    /**
     * Tests if this template is static.
     * Static means, that it does not require any attributes
     * for generating the output.
     *
     * @return true if static, false otherwise.
     */
    public boolean isStatic() {
      return m_Static;
    }//isStatic

    /**
     * Sets the flag for this <tt>Template</tt> that indicates
     * if static or dynamic.
     *
     * @param b true if static, false otherwise.
     * @see #isStatic()
     */
    public void setStatic(boolean b) {
      m_Static = b;
    }//setStatic

    /**
     * Returns the content for this <tt>Template</tt>.
     *
     * @return the content as <tt>String</tt>.
     */
    public String getContent() {
      return m_Content;
    }//getContent

    /**
     * Sets the content of this <tt>Template</tt>.
     *
     * @param content the content as StringTemplate template string.
     */
    public void setContent(String content) {
      m_Content = content;
    }//setContent

    /**
     * Prepares this template, applying the style, caching the static one,
     * and preparing the dynamic template's pool.
     * This method should really only be called by an {@link TemplatesManager.TemplateMap} instance.
     * Each map has an associated language specific group to allow
     * cross references within the template file (although references need to
     * be defined before).
     *
     * @param group the group to be used for cross referencing templates.
     * @see TemplatesManager.TemplateMap#add(TemplatesManager.Template)
     */
    public void prepareTemplate(StringTemplateGroup group) {
      //apply style
      if (m_Style != null && m_Style.length() > 0 && m_StylesManager.isStyleDefined(m_Style)) {
        m_Content = m_StylesManager.formatAsTemplate(m_Content, m_Style);
      }
      StringTemplate st = group.defineTemplate(m_Key, m_Content);
      if (m_Static) {
        //prepare cached version
        m_Cached = st.toString();
      } else {
        //prepare pool
        m_STPool = new StringTemplatePool(st);
      }
    }//prepareTemplate

  }//inner class Template

  /**
   * FIFO implementation for template attributes.
   * This class implements a container that can be
   * used to set attributes on the actual template
   * (<tt>StringTemplate</tt> instance) in a deferred
   * manner (i.e. without direct access, so the lease/release pool
   * mechanism can all be handled in one place).
   */
  private static class TemplateAttributesImpl
      extends BasePoolableObjectFactory
      implements TemplateAttributes {

    private UnboundedFifoBuffer m_FIFOBuffer;

    /**
     * Constructs a new <tt>TemplateAttributesImpl</tt> instance.
     */
    public TemplateAttributesImpl() {
      m_FIFOBuffer = new UnboundedFifoBuffer(10);
    }//TemplateAttributes

    public Object makeObject() throws Exception {
      return new TemplateAttributesImpl();
    }//makeObject

    public void passivateObject(Object o) {
      ((UnboundedFifoBuffer) o).clear();
    }//passivateObject

    public void add(String name, String value) {
      m_FIFOBuffer.add(new Object[]{name, value});
    }//add

    public void add(String aggrname, String[] values) {
      m_FIFOBuffer.add(new Object[]{aggrname, values});
    }//add

    /**
     * Returns an ordered (FIFO) iterator over
     * the stored elements.
     *
     * @return an <tt>Iterator</tt> instance.
     */
    public Iterator iterator() {
      return m_FIFOBuffer.iterator();
    }//iterator

  }//inner class TemplateAttributesImpl

  /**
   * Inner class implementing a pool of
   * <tt>StringTemplate</tt> instances.
   */
  private class StringTemplatePool {

    private ObjectPool m_Pool;

    public StringTemplatePool(StringTemplate st) {
      m_Pool = new GenericObjectPool(new StringTemplateFactory(st), m_PoolConfig);
    }//constructor

    public StringTemplate lease()
        throws Exception {
      return (StringTemplate) m_Pool.borrowObject();
    }//lease

    public void release(StringTemplate t) throws Exception {
      m_Pool.returnObject(t);
    }//release

  }//StringTemplatePool

  /**
   * Inner class implementing a factory for the
   * {@link StringTemplatePool} instances.
   */
  private static class StringTemplateFactory
      extends BasePoolableObjectFactory {

    private StringTemplate m_Template;

    public StringTemplateFactory(StringTemplate st) {
      m_Template = st;
    }//constructor

    public Object makeObject() throws Exception {
      return m_Template.getInstanceOf();
    }//makeObject


    public void passivateObject(Object o) {
      ((StringTemplate) o).reset();
    }//passivateObject

  }//class StringTemplateFactory

/*
 public static void main(String[] args) {
   //Fake setup from telnetd, placing system properties
   //org.apache.log4j.BasicConfigurator.configure();
   //StringTemplate.setDebugMode(true);
   StylesManager.initialize();
   StylesManager.isStyleDefined("SystemName");
   TemplatesManager.initialize();

   System.out.println(Colorizer.getReference().colorize(TemplatesManager.format(0, "login_logo", null), true));
   //System.out.println(Colorizer.getReference().colorize(TemplatesManager.format(0,"newuser_welcome",null),true));
   String email = TemplatesManager.format(0, "newuser_error_password_mismatch");
   System.out.println("==>" + Colorizer.getReference().colorize(email, true) + "<==");
   email = TemplatesManager.format(0, "newuser_prompt_continue");
   System.out.println("==>" + Colorizer.getReference().colorize(email, true) + "<==");
   email = TemplatesManager.format(0, "connection_event_idle_warning");
   System.out.println("==>" + Colorizer.getReference().colorize(email, true, true) + "<==");

   TemplateAttributes ta = TemplatesManager.leaseAttributes();
   ta.add("username", "Wimpi");
   email = TemplatesManager.format(0, "newuser_startpassword", ta);
   System.out.println("==>" + Colorizer.getReference().colorize(email, true) + "<==");

 }//main
*/

  /**
   * Key for the identifier configuration value.
   */
  public static final String CONFKEY_IDENTIFIER = "identifier";

  /**
   * Key for the templates files prefix configuration value.
   */
  public static final String CONFKEY_STYLESFILE = "styles.file";

  /**
   * Key for the templates files prefix configuration value.
   */
  public static final String CONFKEY_BASENAME = "templates.basename";

  /**
   * Key for the templates path url configuration value.
   */
  public static final String CONFKEY_PATH = "templates.path";

  /**
   * Key for the templates languages configuration value.
   */
  public static final String CONFKEY_LANGUAGES = "templates.languages";

  /**
   * Key for the template attributes pool maximum active instances
   * parameter.
   */
  public static final String CONFKEY_ATTRPOOL_MAXACTIVE = "attributes.pool.maxactive";

  /**
   * Key for the template attributes pool maximum idle instances
   * parameter.
   */
  public static final String CONFKEY_ATTRPOOL_MAXIDLE = "attributes.pool.maxidle";

  /**
   * Key for the template attributes pool minimum idle instances
   * parameter.
   */
  public static final String CONFKEY_ATTRPOOL_MINIDLE = "attributes.pool.minidle";

  /**
   * Key for the template attributes pool maximum wait parameter,
   * that will be used if the exhaust action is configured with <tt>block</tt>.
   *
   * @see #CONFKEY_POOL_EXHAUSTACTION
   */
  public static final String CONFKEY_ATTRPOOL_MAXWAIT = "attributes.pool.maxwait";

  /**
   * Key for the template attributes pool exhaust action parameter.
   *
   * @see #CONF_POOL_EXHAUSTACTIONS
   */
  public static final String CONFKEY_ATTRPOOL_EXHAUSTACTION = "attributes.pool.exhaustaction";

  /**
   * Key for the template pool maximum active instances
   * parameter.
   */
  public static final String CONFKEY_POOL_MAXACTIVE = "template.pool.maxactive";

  /**
   * Key for the template pool maximum idle instances
   * parameter.
   */
  public static final String CONFKEY_POOL_MAXIDLE = "template.pool.maxidle";

  /**
   * Key for the template pool minimum idle instances
   * parameter.
   */
  public static final String CONFKEY_POOL_MINIDLE = "template.pool.minidle";

  /**
   * Key for the template pool maximum wait parameter,
   * that will be used if the exhaust action is configured with <tt>block</tt>.
   *
   * @see #CONFKEY_POOL_EXHAUSTACTION
   */
  public static final String CONFKEY_POOL_MAXWAIT = "template.pool.maxwait";

  /**
   * Key for the template pool exhaust action parameter.
   *
   * @see #CONF_POOL_EXHAUSTACTIONS
   */
  public static final String CONFKEY_POOL_EXHAUSTACTION = "template.pool.exhaustaction";

  /**
   * Defines  valid values for {@link #CONFKEY_POOL_EXHAUSTACTION}.
   * <ul>
   * <li>
   * <tt>block</tt>: Wait maximum wait time {@link #CONFKEY_POOL_MAXWAIT} for an
   * instance to be returned before failing.
   * </li>
   * <li>
   * <tt>grow</tt>: Grow when exhausted.
   * </li>
   * <li>
   * <tt>fail</tt>: Fail when exhausted; an Exception will be thrown.
   * </li>
   * </ul>
   */
  public static final String[] CONF_POOL_EXHAUSTACTIONS = {"grow", "fail", "block"};

}//class TemplatesManager
