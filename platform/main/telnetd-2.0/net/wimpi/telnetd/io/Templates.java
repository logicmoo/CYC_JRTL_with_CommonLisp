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
package net.wimpi.telnetd.io;

import java.util.Iterator;
import java.util.Locale;

/**
 * Defines an interface for working with templates.
 * <p>
 * Implementations provide utility methods to help
 * with localized, formatted and styled terminal output:
 * <ul>
 * <li>Template (static, no runtime attributes)</li>
 * <li>Template (dynamic, with runtime attributes)</li>
 * <li>Style (a template that <em>just</em> applies style to)</li>
 * </ul>
 * Note that templates might call and emply style templates. The two are
 * just separated to break down the complexity.
 * </p>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 * @see TemplatesUpdateListener
 */
public interface Templates {

  /**
   * Reloads all available template files.
   *
   * @return true if successfull, false otherwise.
   */
  public boolean reloadTemplates();

  /**
   * Reloads the styles.
   *
   * @return true if successful, false otherwise.
   */
  public boolean reloadStyles();

  /**
   * Register a {@link TemplatesUpdateListener} that
   * will be notified on template updates.
   *
   * @param l a {@link TemplatesUpdateListener} instance.
   */
  public void registerUpdateListener(TemplatesUpdateListener l);

  /**
   * Removes a formerly registered {@link TemplatesUpdateListener}
   * instance.
   *
   * @param l a {@link TemplatesUpdateListener} instance.
   */
  public void removeUpdateListener(TemplatesUpdateListener l);

  /**
   * Returns an iterator over available languages.
   *
   * @return an <tt>Iterator</tt> instance.
   */
  public Iterator getLanguages();

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
  public int getIndexOfLanguage(String str);

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
  public int getIndexOfLanguage(Locale l);

  /**
   * Returns the ISO two letter code of the
   * language at the given index.
   *
   * @param i the index of the language.
   * @return the ISO two letter code of the language.
   * @throws IndexOutOfBoundsException if the index is
   *                                   out of bounds.
   */
  public String getLanguageCode(int i);

  /**
   * Fetches the templates for all available languages and
   * returns an array of formatted strings.
   *
   * @param tkey the template key.
   * @param attr the attributes for the template.
   * @return an array of formatted strings with markups (if required).
   */
  public String[] formatAll(String tkey, TemplateAttributes attr);

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
  public String[] formatAll(String tkey);

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
  public String format(int lang, String tkey);

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
  public String format(int lang, String tkey, TemplateAttributes attr);

  /**
   * Tests if a given style is defined.
   *
   * @param name the name of the style.
   * @return true if defined, false otherwise.
   */
  public boolean isStyleDefined(String name);

  /**
   * Formats a given content with the given style.
   * If the style is not defined, the content will be returned
   * unmodified.
   *
   * @param content the content to be formatted.
   * @param style   the style to be used.
   * @return the formatted content.
   */
  public String formatStyle(String content, String style);

  /**
   * Returns a leased {@link TemplateAttributes} instance.
   * This instance should be used immediately and passed to
   * {@link #format(int,String,TemplateAttributes)}, which will
   * recycle the instance returning it to the originating pool.
   *
   * @return a {@link net.wimpi.telnetd.io.TemplateAttributes}  instance.
   */
  public TemplateAttributes leaseAttributes();

}//interface Templates
