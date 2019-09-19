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
package net.wimpi.telnetd.util;

import java.util.Dictionary;

import org.osgi.service.cm.ConfigurationException;

/**
 * This class implements some helper methods to deal
 * with a <tt>Dictionary</tt> during the configuration
 * process.
 * <p/>
 *
 * @author Dieter Wimberger (wimpi)
 * @version @version@ (@date@)
 */
public class DictionaryUtility {


  public static final boolean containsKey(Dictionary props, String key) {
    return (props.get(key) != null);
  }//containsKey

  public static final String getString(Dictionary props, String key)
      throws ConfigurationException {
    Object o = props.get(key);
    if (o == null) {
      throw new ConfigurationException(key, "conf.missing");
    } else {
      return o.toString();
    }
  }//getString

  public static final String getString(Dictionary props, String key, String[] values)
      throws ConfigurationException {
    String str = getString(props, key);
    for (int i = 0; i < values.length; i++) {
      if (values[i].equalsIgnoreCase(str)) {
        return str;
      }
    }
    throw new ConfigurationException(key, "conf.invalid.value");
  }//getString

  public static final int getInt(Dictionary dict, String key)
      throws ConfigurationException {
    try {
      return Integer.parseInt(getString(dict, key));
    } catch (NumberFormatException ex) {
      throw new ConfigurationException(key, ex.toString());
    }
  }//getInt

  public static final int getInt(Dictionary dict, String key, int start, int stop)
      throws ConfigurationException {
    try {
      int i = Integer.parseInt(dict.get(key).toString());
      if (i <= start || i >= stop) {
        throw new ConfigurationException(key, "conf.outofrange");
      }
      return i;
    } catch (NumberFormatException ex) {
      throw new ConfigurationException(key, ex.toString());
    }
  }//getInt

  public static final long getLong(Dictionary dict, String key)
      throws ConfigurationException {
    try {
      long i = Long.parseLong(dict.get(key).toString());
      return i;
    } catch (NumberFormatException ex) {
      throw new ConfigurationException(key, ex.toString());
    }
  }//getLong

  public static final boolean getBool(Dictionary dict, String key)
      throws ConfigurationException {
    return "true".equalsIgnoreCase(getString(dict, key));
  }//getBool

}//class DictionaryUtility
