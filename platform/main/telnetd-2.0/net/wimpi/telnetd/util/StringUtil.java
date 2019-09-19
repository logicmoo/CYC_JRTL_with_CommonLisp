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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Utility class with string manipulation methods.
 *
 * @author Dieter Wimberger
 * @version @version@ (@date@)
 */
public final class StringUtil {

  private static final Random c_Random;
  private static final char[] c_CharMap;

  static {
    c_Random = new Random();
    c_CharMap = new char[35];
    int idx = 0;
    for (int n = 49; n < 123; n++) {
      //jump to a
      if (n == 58) {
        n = 97;
      }
      c_CharMap[idx++] = (char) n;
    }
  }//static initializer


  /**
   * Private constructor, to prevent construction.
   */
  private StringUtil() {
  }//constructor

  /**
   * Method that splits a string with delimited fields
   * into an array of field strings.
   *
   * @param str   String with delimited fields.
   * @param delim String that represents the delimiter.
   * @return String[] holding all fields.
   */
  public static String[] split(String str, String delim) {

    StringTokenizer strtok = new StringTokenizer(str, delim);
    String[] result = new String[strtok.countTokens()];

    for (int i = 0; i < result.length; i++) {
      result[i] = strtok.nextToken();
    }

    return result;
  }//split(String,String)

  /**
   * Method that splits a string with delimited fields
   * into an array of field strings.
   *
   * @param str   String with delimited fields.
   * @param delim char that represents the delimiter.
   * @return String[] holding all fields.
   */
  public static String[] split(String str, char delim) {
    return StringUtil.split(str, String.valueOf(delim));
  }//split(String,char)

  /**
   * Returns a <tt>String</tt> with the requested
   * number of spaces.
   *
   * @param num number of spaces required.
   * @return a <tt>String</tt> with <tt>num</tt> spaces.
   */
  public static final String getSpaces(int num) {
    StringBuffer sbuf = new StringBuffer(num);
    while (num-- > 0) {
      sbuf.append(' ');
    }
    return sbuf.toString();
  }//getSpaces

  /**
   * Appends a given number of spaces to the given <tt>StringBuffer</tt>.
   *
   * @param sbuf the <tt>StringBuffer</tt> to append.
   * @param num  the number of spaces to be appended.
   * @return the <tt>StringBuffer</tt> for convenience.
   */
  public static final StringBuffer appendSpaces(StringBuffer sbuf, int num) {
    while (num-- > 0) {
      sbuf.append(' ');
    }
    return sbuf;
  }//appendSpaces

  /**
   * Appends a given number of spaces to the given <tt>String</tt>.
   *
   * @param str the <tt>String</tt> to append to.
   * @param num the number of spaces to be appended.
   * @return the <tt>String</tt>.
   */
  public static final String appendSpaces(String str, int num) {
    StringBuffer sbuf = new StringBuffer(str);
    while (num-- > 0) {
      sbuf.append(' ');
    }
    return sbuf.toString();
  }//appendSpaces

  /**
   * Appends a given number of spaces to the given <tt>StringBuffer</tt>.
   *
   * @param sbuf the <tt>StringBuffer</tt> to append.
   * @param num  the number of spaces to be appended.
   * @return the <tt>StringBuffer</tt> for convenience.
   */
  public static final StringBuffer appendCharacter(StringBuffer sbuf, char c, int num) {
    while (num-- > 0) {
      sbuf.append(c);
    }
    return sbuf;
  }//appendCharacters

  /**
   * Iterates over the given <tt>Iterator</tt> producing
   * an array of <tt>String</tt> instances using <tt>toString()</tt>.
   *
   * @param iter the <tt>Iterator</tt> to be transformed.
   * @return an array of <tt>String</tt> instances.
   */
  public static final String[] toStringArray(Iterator iter) {
    ArrayList al = new ArrayList();
    while (iter.hasNext()) {
      al.add(iter.next().toString());
    }
    String[] rv = new String[al.size()];
    return (String[]) al.toArray(rv);
  }//toStringArray

  /**
   * Returns a random generated string of requested length.
   *
   * @param len the length of the string to be generated.
   * @return the random generated string.
   */
  public static String getRandomString(int len) {
    final StringBuffer sbuf = new StringBuffer();
    for (int i = 0; i < len; i++) {
      char ch = c_CharMap[c_Random.nextInt(35)];
      if (c_Random.nextBoolean()) {
        ch = Character.toUpperCase(ch);
      }
      sbuf.append(ch);
    }
    return sbuf.toString();
  }//getRandomString

}//class StringUtil

