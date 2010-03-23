/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public  final class SubLRegexPattern extends AbstractSubLObject implements SubLObject, CommonSymbols {
  
	// common lisp additions
	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  
  /** Creates a new instance of SubLProcess. */
  public SubLRegexPattern(String patternStr, int options) {
    int newOptions = 0;
    if ((options & REGEX_COMPOPT_ANCHORED) != 0) {
      Errors.error("*regex-comopt-anchored* is not supported.");
    }
    if ((options & REGEX_COMPOPT_CASELESS) != 0) {
      newOptions = newOptions | Pattern.CASE_INSENSITIVE;
    }
    if ((options & REGEX_COMPOPT_DOLLAR_END_ONLY) != 0) {
      Errors.error("*regex-compopt-dollar-endonly* is not supported.");
    }
    if ((options & REGEX_COMPOPT_DOTALL) != 0) {
      newOptions = newOptions | Pattern.DOTALL;
    }
    if ((options & REGEX_COMPOPT_EXTEND) != 0) {
      newOptions = newOptions | Pattern.COMMENTS;
    }
    if ((options & REGEX_COMPOPT_MULTILINE) != 0) {
      newOptions = newOptions | Pattern.MULTILINE;
    }
    if ((options & REGEX_COMPOPT_EXTRA) != 0) {
      Errors.error("*regex-compopt-extra* is not supported.");
    }
    if ((options & REGEX_COMPOPT_UNGREEDY) != 0) {
      Errors.error("*regex-compopt-ungreedy* is not supported.");
    }
    if ((options & REGEX_COMPOPT_UTF8) != 0) {
      ; //ignore
    }
    if ((options & REGEX_COMPOPT_NO_AUTO_CAPTURE) != 0) {
      Errors.error("*regex-compopt-no-auto-capture* is not supported.");
    }
    if ((options & REGEX_COMPOPT_NO_UTF8_CHECK) != 0) {
      Errors.error("*regex-compopt-no-utf8-check* is not supported.");
    }
    this.patternStr = patternStr;
    pattern = Pattern.compile(patternStr, newOptions);
    matcher = pattern.matcher("");
  }
  
  //// Public Area
  
  public String toString() {
    return new String("<#" + toTypeName() + " pattern: \"" + patternStr + "\" @" + hashCode(0) + ">");
  }
  
  public ArrayList<String> getAllMatches(CharSequence str, int options, int maxNumMatches) {
    if (options != 0) {
      Errors.error("No options supported on regex match under this implementation.");
    }
    matcher.reset(str);
    ArrayList<String> result = new ArrayList<String>();
    int nFound = 0;
    while ((nFound < maxNumMatches) && (matcher.find())) {
      int start = matcher.start();
      int end = matcher.end();
      result.add(str.subSequence(start, end).toString());
      nFound++;
      for (int i = 1, size = matcher.groupCount(); (i <= size)  && (nFound < maxNumMatches); i++) {
        start = matcher.start(i);
        end = matcher.end(i);
        result.add(str.subSequence(start, end).toString());
        nFound++;
      }
    }
    return result;
  }
  
  public ArrayList<Integer> getAllMatchesOffsets(CharSequence str, int options, int maxNumMatches) {
    if (options != 0) {
      Errors.error("No options supported on regex match under this implementation.");
    }
    matcher.reset(str);
    ArrayList<Integer> result = new ArrayList<Integer>();
    int nFound = 0;
    while ((nFound < maxNumMatches) && (matcher.find())) {
      int start = matcher.start();
      int end = matcher.end();
      result.add(new Integer(start));
      result.add(new Integer(end));
      nFound++;
      for (int i = 1, size = matcher.groupCount(); (i <= size)  && (nFound < maxNumMatches); i++) {
        start = matcher.start(i);
        end = matcher.end(i);
        result.add(new Integer(start));
        result.add(new Integer(end));
        nFound++;
      }
    }
    return result;
  }
  
    public boolean canFastHash() {
    return true;
  }
  
  public int hashCode(int depth) {
    return super.superHash();
  }
  
 public static final String REGEX_PATTERN_NAME = "REGEX-PATTERN";
  
  public String toTypeName() {
    return REGEX_PATTERN_NAME;
  }
  
  public final SubLSymbol getType(){
    return Types.$dtp_alien$; // @hack to minimize Java/C differences
  }
  
  public final SubLFixnum getTypeCode() {
    return THIRTEEN_INTEGER; // @hack to minimize Java/C differences
  }
  
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return true; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  public final SubLRegexPattern toRegexPattern() { return this; }
  
  //// Protected Area
  
  //// Private Area
  
  private String patternStr;
  private Pattern pattern;
  private Matcher matcher;
  
  // @Note These are really defined in regular-expressions.lisp.
  private static final int REGEX_COMPOPT_ANCHORED = 0x0010;
  private static final int REGEX_COMPOPT_CASELESS = 0x0001;
  private static final int REGEX_COMPOPT_DOLLAR_END_ONLY = 0x0020;
  private static final int REGEX_COMPOPT_DOTALL = 0x0004;
  private static final int REGEX_COMPOPT_EXTEND = 0x0008;
  private static final int REGEX_COMPOPT_MULTILINE = 0x0002;
  private static final int REGEX_COMPOPT_EXTRA = 0x0040;
  private static final int REGEX_COMPOPT_UNGREEDY = 0x0200;
  private static final int REGEX_COMPOPT_UTF8 = 0x0800;
  private static final int REGEX_COMPOPT_NO_AUTO_CAPTURE = 0x1000;
  private static final int REGEX_COMPOPT_NO_UTF8_CHECK = 0x2000;
  
  
  //// Internal Rep
  
}
