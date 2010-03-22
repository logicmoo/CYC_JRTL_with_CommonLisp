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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter.CharCompareDesc;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractArray;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractString;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;
import java.util.Arrays;
import java.util.List;

//// External Imports

public  /*final*/ class SubLString extends AbstractString implements SubLObject, SubLSequence, Cloneable, CharSequence  {
  
  //// Constructors
	protected SubLString() {
		
	}
  
  /** Creates a new instance of SubLString. */
  SubLString(String str) {
    if (str == null) { str = ""; }
    buf = str.toCharArray();
    size = buf.length;
    string = str;
  }
  
  SubLString(int length, char defaultChar) {
    if (size < 0) {
      Errors.error("Attempt to create string with negative size: " + size);
    }
    buf = new char[length];
    size = length;
    Arrays.fill(buf, defaultChar);
  }
  
  /** Creates a new instance of SubLString. */
  private SubLString(char[] chars) {
    buf = chars;
    size = buf.length;
  }
  
  /** Creates a new instance of SubLString. */
  private SubLString(char[] chars, int length) {
    if (chars.length < length) {
      Errors.error("Error in string constructor.");
    }
    buf = new char[length];
    size = length;
    System.arraycopy(chars, 0, buf, 0, length);
  }
  
  /** Creates a new instance of SubLString. */
  private SubLString(char[] chars, int start, int end) {
    size = end - start;
    if (chars.length < size) {
      Errors.error("Error in string constructor.");
    }
    buf = new char[size];
    System.arraycopy(chars, start, buf, 0, size);
  }
  
  //// Public Area
  
  /** Method created to avoid instanceof tests */
  public final String getFileDesignator() {
    return getString();
  }
  
  /** Method created to avoid casting */
  public final SubLString toStr() {
    return this;
  }
  
  public CharSequence subSequence(int start, int end) {
    return subSeq(start, end).toStr();
  }
  
  public char charAt(int index) {
    return buf[index];
  }
  
  /** Method created to avoid casting */
  public final SubLCharacter getCharacter(int index) {
    return SubLCharacter.charArray[buf[index]];
  }
  
  public SubLSequence sort(boolean isDestructive, final BinaryFunction pred,
      final UnaryFunction key) {
    SubLCharacter[] chars = (SubLCharacter[])toArray();
    if (key == IDENTITY_UNARY_FUNC) {
      Arrays.sort(chars, new ComparatorIdentityKey<SubLCharacter>(pred));  //@todo get rid of new
    } else {
      Arrays.sort(chars, new ComparatorGenericKey<SubLCharacter>(pred, key));  //@todo get rid of new
    }
    for (int i = 0, size = buf.length; i < size; i++) {
      buf[i] = chars[i].getChar();
    }
    setMutated();
    return this;
  }
  
  public final Object clone() {
    return makeCopy();
  }
  
  public final SubLObject makeCopy() {
    return new SubLString(getString());
  }
  
  public final boolean isArrayBased() {
    return true;
  }
  
  public final SubLObject makeDeepCopy() {
    Errors.unimplementedMethod("SubLString.makeDeepCopy()");
    return null;
  }
  
  public final SubLSequence makeSequenceFromJavaList(List newBuf) {
    int size = newBuf.size();
    char[] theBuff = new char[size];
    for (int i = 0; i < size; i++) {
      SubLObject obj = (SubLObject)newBuf.get(i);
      theBuff[i] = obj.charValue();
    }
    return new SubLString(theBuff);
  }
  
  public String getString() {
    if (string == null) {
      string = new String(buf, 0, size);
    }
    return string;
  }
  
  /** @Note this is dangerous...returns internals...*/
  public char[] toCharArray() {
    return buf;
  }
  
  public Object[] toArray(Object a[]) {
    if (a.length < buf.length) {
      Errors.error("Unable to duplicate string.");
    }
    for (int i = 0, size = buf.length; i < size; i++) {
      a[i] = getCharacter(i);
    }
    return a;
  }
  
  public Object[] toArray() {
    return toArray(new SubLCharacter[buf.length]);
  }
  
  public String toString() {
    // @Note see if escapeQuoteChars is more appropriate here -APB
    return "\"" + escapeDoubleQuotes(getString()) + "\"";
  }
  
  public static String convertSubLStringToJavaString(String string) {
    if (string == null) { return null; }
    String result = string.replaceAll("\\\\", "\\\\\\\\");
    result = result.replaceAll("\\$", "\\\\\\$"); // $ is a reserved regex character
    return result;
  }
  
  /**
   * Escapes embedded double quote and backslash characters in the given string.
   *
   * @param string the given string
   * @return the given string with embeded double quote characters
   * preceded by a backslash character, and with embedded backslash
   * characters preceded by another (escaping) backslash character
   * @note this is a copy from StringUtils under opencyc, move somewhere better,
   * if it's even really needed -APB
   */
  public static String escapeDoubleQuotes(String string) {
    if (string == null) { return null; }
    String result = string.replaceAll("\\\\", "\\\\\\\\");
    return result.replaceAll("\\\"", "\\\\\\\"");
  }
  
  /**
   * Un-escapes embedded double quote and backslash characters in the given string.
   *
   * @param string the given string
   * @return the given string with un-escaped backslash and double quote characters
   * @note this is a copy from StringUtils under opencyc, move somewhere better,
   * if it's even really needed -APB
   */
  public static String unescapeDoubleQuotes(String string) {
    if (string == null) { return null; }
    String result = string.replaceAll("\\\\\\\"", "\\\"");
    return result.replaceAll("\\\\\\\\", "\\\\");
  }
  
  public boolean equals(Object obj) {
    if (obj == null) { return false; }
    if (obj instanceof CharSequence) {
      final CharSequence obj2 = (CharSequence)obj;
      if (length() != obj2.length()) {
        return false;
      }
      for (int i = 0, size = obj2.length(); i < size; i++) {
        if (charAt(i) != obj2.charAt(i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean equal(SubLObject obj) {
    if (obj == null) { return false; }
    if (!obj.isString()) { return false; }
    final SubLString other = obj.toStr();
    if (other.size != size) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (buf[i] != other.buf[i]) {
        return false;
      }
    }
    return true;
  }
  
  /** Two strings are equalp iff they are case-insensitively equal. */
  public boolean equalp(SubLObject obj) {
    if (obj == null) { return false; }//   
    if (!obj.isString()) { return super.equalp(obj); }
    final SubLString other = obj.toStr();
    if (other.size != size) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (Character.toUpperCase(buf[i]) != Character.toUpperCase(other.buf[i])) {
        return false;
      }
    }
    return true;
  }
  
  public static final String STRING_TYPE_NAME = "STRING";
  
  public String toTypeName() {
    return STRING_TYPE_NAME;
  }
  
  public SubLString toLowerCase() {
    String str = getString();
    return SubLObjectFactory.makeString(str.toLowerCase());
  }
  
  public SubLString toUpperCase() {
    String str = getString();
    return SubLObjectFactory.makeString(str.toUpperCase());
  }
  
  public int hashCode(int currentDepth) {
    int h = hash;
    if (h == 0) {
      for (int i = 0, curSize = size(); i < curSize; i++) {
        h = 31*h + Character.toUpperCase(buf[i]);
      }
      hash = h;
    }
    return h;
  }
  
  public final int size() {
    return size;
  }
  
  public final int length() {
    return size;
  }
  
  public int compare(SubLString compareString, CharCompareDesc compareDesc,
          int start1, int start2, int end1, int end2) {
    int curIndex1 = start1 = (start1 < 0) ? 0 : start1;
    int curIndex2 = start2 = (start2 < 0) ? 0 : start2;
    int fin1 = end1 > size ? size : end1;
    int fin2 = end2 > compareString.size ? compareString.size : end2;
    if (fin1 < 0) { fin1 = size; }
    if (fin2 < 0) { fin2 = compareString.size; }
    /* first gobble up common prefix */
    int answer = 0;
    if (!compareDesc.isCaseSensitive()) {
      while ((curIndex1 < fin1) && (curIndex2 < fin2) &&
              (SubLCharacter.caseInsensitiveConvert(buf[curIndex1]) ==
               SubLCharacter.caseInsensitiveConvert(compareString.buf[curIndex2]))) {
        answer++;
        curIndex1++;
        curIndex2++;
      }
    } else {
      while ((curIndex1 < fin1) && (curIndex2 < fin2) &&
              (buf[curIndex1] == compareString.buf[curIndex2])) {
        answer++;
        curIndex1++;
        curIndex2++;
      }
    }
    /* if the strings are both not at the end, compare the remainders */
    if ((curIndex1 != fin1) && (curIndex2 != fin2)) {
      if (!compareDesc.compare(buf[curIndex1], compareString.buf[curIndex2])) {
        answer = -1;
      }
    } else {
      answer =  compareDesc.process(answer, fin1-curIndex1, fin2-curIndex2);
    }
    return answer >= 0 ? answer + start1 : answer;
  }
  
  public final SubLSequence subSeq(int start, int end) {
    if (start < 0) { start = 0; }
    int size = length();
    if (end > size) { end = size; }
    if (start >= end) { return SubLObjectFactory.makeString(""); }
    char[] charArray = new char[end - start];
    getString().getChars(start, end, charArray, 0);
    return SubLObjectFactory.makeString(new String(charArray));
  }
  
  public final SubLString toUpperCase(boolean isDestructive) {
    return toUpperCase(isDestructive, 0, size());
  }
  
  public final SubLString toLowerCase(boolean isDestructive) {
    return toLowerCase(isDestructive, 0, size());
  }
  
  public final SubLString capitalize(boolean isDestructive) {
    return capitalize(isDestructive, 0, size());
  }
  
  public final SubLString toUpperCase(boolean isDestructive, int start, int end) {
    SubLString result = isDestructive ? this : makeCopy().toStr();
    if (start < 0) { start = 0; }
    if ((end < 0) || (end > size())) { end = size(); }
    for (int i = start; i < end; i++) {
      result.setChar(i, Character.toUpperCase(charAt(i)));
    }
    return result;
  }
  
  public final SubLString toLowerCase(boolean isDestructive, int start, int end) {
    SubLString result = isDestructive ? this : makeCopy().toStr();
    if (start < 0) { start = 0; }
    if ((end < 0) || (end > size())) { end = size(); }
    for (int i = start; i < end; i++) {
      result.setChar(i, Character.toLowerCase(charAt(i)));
    }
    return result;
  }
  
  public final SubLString capitalize(boolean isDestructive, int start, int end) {
    SubLString result = isDestructive ? this : makeCopy().toStr();
    if (start < 0) { start = 0; }
    if ((end < 0) || (end > size())) { end = size(); }
    boolean lastWasAlphNumeric = false;
    for (int i = start; i < end; i++) {
      if (lastWasAlphNumeric) {
        result.setChar(i, Character.toLowerCase(result.charAt(i)));
      } else {
        result.setChar(i, Character.toUpperCase(result.charAt(i)));
      }
      lastWasAlphNumeric = Character.isLetterOrDigit(result.charAt(i));
    }
    return result;
  }
  
  public SubLString leftTrim(SubLSequence charsToTrim) {
    int trimCount = calCharsToTrim(charsToTrim, true);
    return new SubLString(toCharArray(), trimCount, size());
  }
  
  public SubLString rightTrim(SubLSequence charsToTrim) {
    int trimCount = calCharsToTrim(charsToTrim, false);
    return new SubLString(toCharArray(), 0, size() - trimCount);
  }
  
  public SubLString trim(SubLSequence charsToTrim) {
    int startTrimCount = calCharsToTrim(charsToTrim, true);
    if (startTrimCount == size()) {
      return SubLObjectFactory.makeString("");
    }
    int endTrimCount = calCharsToTrim(charsToTrim, false);
    int size = size();
    SubLString result = new SubLString(toCharArray(), startTrimCount, size - endTrimCount);
    return result;
  }
  
  public final SubLObject get(int index) {
    return SubLCharacter.charArray[buf[index]];
  }
  
  public final char getChar(int index) {
    return buf[index];
  }
  
 // non final in order to let ComplexString override
  public void setChar(int index, char newChar) {
    buf[index] = newChar;
    setMutated();
  }
  
  public final void set(int index, SubLObject newVal) {
    buf[index] = newVal.charValue();
    setMutated();
  }
  
  public final void set(int index, char newVal) {
    buf[index] = newVal;
    setMutated();
  }
  
  public final SubLSequence delete(int startIndex, int endIndexExclusive) {
    if (endIndexExclusive <= startIndex) { return this; }
    int deleteCount = endIndexExclusive - startIndex;
    for (int i = endIndexExclusive, j = startIndex; i < size; i++, j++) {
      buf[j] = buf[i];
    }
    for (int i = size - deleteCount; i < size; i++) {
      buf[i] = ' ';
    }
    size -= deleteCount;
    setMutated();
    return this;
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_string$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.THIRTY_TWO_INTEGER;
  }
  
   public SubLInputStream toInputStream() {
    return toInputTextStream();
  }
  
  public SubLInputTextStream toInputTextStream() {
    if ("/dev/null".equals(getString())) {
      SubLStreamFactory.makeStringInputStream("");
    }
    return SubLStreamFactory.makeInputTextStream(getString(), CommonSymbols.OVERWRITE_KEYWORD, CommonSymbols.CREATE_KEYWORD);
  }
  
  public SubLInputBinaryStream toInputBinaryStream() {
    if ("/dev/null".equals(getString())) {
      return SubLStreamFactory.makeStringInputStream("");
    }
    return SubLStreamFactory.makeInputBinaryStream(getString(), CommonSymbols.OVERWRITE_KEYWORD, CommonSymbols.CREATE_KEYWORD);
  }
  
  public SubLOutputStream toOutputStream() {
    return toOutputTextStream();
  }
  
  public SubLOutputTextStream toOutputTextStream() {
    if ("/dev/null".equals(getString())) {
      return SubLStreamFactory.makeBroadcastStream();
    }
    return SubLStreamFactory.makeOutputTextStream(getString(), CommonSymbols.OVERWRITE_KEYWORD, CommonSymbols.CREATE_KEYWORD);
  }
  
  public SubLOutputBinaryStream toOutputBinaryStream() {
    if ("/dev/null".equals(getString())) {
      return SubLStreamFactory.makeBroadcastStream();
    }
    return SubLStreamFactory.makeOutputBinaryStream(getString(), CommonSymbols.OVERWRITE_KEYWORD, CommonSymbols.CREATE_KEYWORD);
  }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return true; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return true; }
  public final boolean isVector() { return true; } //per HyperSpec
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
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  protected void setMutated() {
    string = null;
    hash = 0;
  }
  
  //// Private Area
  
  private int calCharsToTrim(SubLSequence charsToTrim, boolean atStart) {
    int result = 0;
    if (atStart) {
      for(int i = 0, size = size(); i < size; i++) {
        if (charsToTrim.positionOf(SubLCharacter.charArray[buf[i]]) >= 0) {
          result++;
        } else {
          break;
        }
      }
    } else {
      for(int i = size()-1; i >= 0; i--) {
        if (charsToTrim.positionOf(SubLCharacter.charArray[buf[i]]) >= 0) {
          result++;
        } else {
          break;
        }
      }
    }
    return result;
  }
  
  //// Internal Rep
  
  protected char[] buf;
  protected int size = 0;
  private String string = null;
  int hash = 0;

	@Override
	public void fill(char c) {
		Arrays.fill(buf, c);
		string = null;
	}

	@Override
	public AbstractArray adjustArray(int size, SubLObject initialElement, SubLObject initialContents) {
		unimplimentedLispFunction();
		return null;
	}

	@Override
	public AbstractArray adjustArray(int size, AbstractArray displacedTo, int displacement) {
		unimplimentedLispFunction();
		return null;
	}

	@Override
	public int capacity() {
		unimplimentedLispFunction();
		return 0;
	}

	@Override
	public SubLObject reverse() {
		unimplimentedLispFunction();
		return null;
	}

	@Override
	public void shrink(int n) {
		unimplimentedLispFunction();
		
	}

	@Override
	public SubLObject subseq(int start, int end) {
		unimplimentedLispFunction();
		return null;
	}

	@Override
	public void aset(int index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	@Override
	public void fillVoid(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

}
