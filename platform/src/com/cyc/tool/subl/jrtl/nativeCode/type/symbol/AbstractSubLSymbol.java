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

package  com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbolImpl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import java.util.LinkedHashMap;
import java.util.Map;


public  abstract class AbstractSubLSymbol extends LispSymbolImpl implements SubLSymbol {
  
  //// Constructors
  
  /** Creates a new instance of SubLSymbol. 
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  AbstractSubLSymbol(SubLString symbolName, SubLPackage thePackage) {
  	super(symbolName, thePackage);
    this.thePackage = thePackage;
    this.symbolName = symbolName;
    hashCode = ((thePackage == null) ? 0 : thePackage.hashCode()) ^ symbolName.hashCode();
    if ((thePackage!=null && thePackage == SubLPackage.KEYWORD_PACKAGE) && (!isKeyword())) { //@todo get rid of this test
      Errors.error("Got invalid keyword: '" + thePackage + ":" + symbolName + "'");
    }
  }
  
  //// Public Area
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_symbol$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_INTEGER;
  }
  
  public final String getName() { 
    return symbolName.getString(); 
  }
  
  public final SubLString getSubLName() { 
    return symbolName; 
  }
  
  public final SubLPackage getPackage() { 
    return thePackage; 
  }
  
  public final void setPackage(SubLPackage thePackage) {
    this.thePackage = thePackage;
  }
  
  public final boolean boundp() {
    return (value != UNBOUND) || (thePackage == SubLPackage.KEYWORD_PACKAGE);
  }
  
  public final boolean fboundp() { 
    return (operator != UNBOUND); 
  }
  
  public final SubLFunction getFunc() {
    if (operator == UNBOUND) {
      Errors.error(this + " is not fboundp.");
    }
    return operator.getFunc();
  }
  
  public final SubLOperator getFunction() {
    if (operator == UNBOUND) {
      Errors.error(this + " is not fboundp.");
    }
    return operator;
  }
  
  public final void setFunction(SubLOperator func) {
    operator = func;
  }
  
  public final SubLList getPlist() { 
    synchronized (plist) {
      return plist;
    }
  }
  
  public final void setProperty(SubLObject indicator, SubLObject value) {
    synchronized (plist) {
      plist = plist.putf(indicator, value);
    }
  }
  
  public final void removeProperty(SubLObject indicator) {
    synchronized (plist) {
      plist = plist.remf(indicator);
    }
  }
  
  public final SubLObject getProperty(SubLObject indicator) {
    synchronized (plist) {
      return plist.getf(indicator, null);
    }
  }
  
  public final Object clone() {
    return this;
  }
  
  public final SubLObject makeCopy() {
    return this;
  }
  
  public final SubLObject makeDeepCopy() {
    return this;
  }

  public final String toFullString() {
    return getPackageNamePrecise() + PACKAGE_SEPARATOR + getSymbolNamePrecise();
  }
  
  public final String toString() {
    if (isKeyword()) {
      return PACKAGE_SEPARATOR + getSymbolNamePrecise();
    }
    SubLPackage thePackage = null;
    try {
      thePackage = SubLPackage.getCurrentPackage();
    } catch (Exception e) {
      return getPackageNamePrecise() + ":" + getSymbolNamePrecise();
    }
    if (thePackage == null) {
      return "#:" + getSymbolNamePrecise();
    } else if (thePackage.retrieveSymbol(getName()) == null) {
      return getPackageNamePrecise() + ":" + getSymbolNamePrecise();
    }
    return getSymbolNamePrecise().toString();
  }
  
  public final int hashCode(int currentDepth) {
    return hashCode;
  }
  
  public static final SubLObject gensym(SubLObject val) {
    StringBuilder buf = new StringBuilder();
    if (val == SubLNil.NIL) {
      buf.append(GENSYM_PREFIX.getString());
      buf.append(Symbols.$gensym_counter$.getValue().intValue());
      Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
    } else if (val.isString()) {
      buf.append(val.getString());
      buf.append(Symbols.$gensym_counter$.getValue().intValue());
      Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
    } else if (val.isFixnum()) {
      buf.append(GENSYM_PREFIX.getString());
      buf.append(val.intValue());
      Symbols.$gensym_counter$.setValue(val);
    } else {
      Errors.error("Invalid argument to gensym -- exptected "
        + "NIL, a string or a fixnum.\n Got: " + val + ".");
    }
    SubLSymbol symbol = SubLObjectFactory.makeUninternedSymbol(buf.toString());
    return symbol;
  }
  
  public static synchronized final SubLObject gentemp(SubLObject prefix, SubLPackage thePackage) {
    SubLString prefixTyped = (prefix == SubLNil.NIL) ? GENTEMP_PREFIX : prefix.toStr();
    int counterVal = Symbols.$gentemp_counter$.getValue().intValue();
    String pre = prefixTyped.getString();
    SubLSymbol symbol = null;
    String curSymbolName;
    do {
      curSymbolName = pre + counterVal++;
    } while (null != (symbol = thePackage.retrieveSymbol(curSymbolName)));
    Symbols.$gentemp_counter$.setValue(SubLObjectFactory.makeInteger(counterVal));
    return SubLObjectFactory.makeSymbol(curSymbolName, thePackage);
  }
  
  /** this function strips symbol name quotes "|" when they are not necessary
   * -- assumes that the name given is a valid symbol name in all other respects
   * also deals with backslashes and adds "|" when necessary
   * average case should be 2 passes and 1 memory alloc */
  public static final String canonicalizeName(String name) {
    String canonicalizedName = (String)symbolCanonicalizerCache.get(name);
    if (canonicalizedName != null) { return canonicalizedName; }
    canonicalizedName = name;
    if (!doesSymbolNameNeedQuotes(canonicalizedName)) {   //1 pass
      symbolCanonicalizerCache.put(name, canonicalizedName.toUpperCase());   //1 pass 1 mem
      return canonicalizedName;
    }
    boolean hasExplicitQuotes = (canonicalizedName.charAt(0) == SYMBOL_NAME_QUOTE);
    boolean hasQuotes = hasExplicitQuotes;
    if (canonicalizedName.indexOf('\\') >= 0) {  //1 pass
      char[] origChars = canonicalizedName.toCharArray();   //1 pass 1 mem
      char curChar = '\uFFFF', prevChar = '\uFFFF';
      int newSize = 0;
      for (int i = 0, size = origChars.length; i < size; i++) {  //1 pass
        curChar = origChars[i];
        if (prevChar != '\\') {
          origChars[newSize++] = Character.toUpperCase(curChar);
        } else {
          origChars[newSize - 1] = curChar;
          if ((!isConstituentUpperCaseChar(curChar)) && (!hasQuotes)) {
            hasQuotes = true;
          }
        }
        prevChar = curChar;
      }
      canonicalizedName = new String(origChars, 0, newSize);  //1 pass 1 mem
    } else if (!hasExplicitQuotes) {
      canonicalizedName = canonicalizedName.toUpperCase();
    }
    if (hasQuotes && (!hasExplicitQuotes)) {
      canonicalizedName = "|" + canonicalizedName + "|";   // 2 mem
    }
    if (hasQuotes) {
      String innerName = canonicalizedName.substring(1, canonicalizedName.length() - 1);
      if (!doesSymbolNameNeedQuotes(innerName)) {   //1 pass
        canonicalizedName = innerName;
      }
    }
    symbolCanonicalizerCache.put(name, canonicalizedName);
    return canonicalizedName; //7 passes and 5 memory allocs
  }
  
  public static final boolean doesSymbolNameNeedQuotes(String symbolName) {
    char curChar;
    for (int i = 0, size = symbolName.length(); i < size; i++) {
      curChar = symbolName.charAt(i);
      if (!isConstituentUpperCaseChar(curChar)) {
        return true;
      }
    }
    return false;
  }
  
  public static final boolean isConstituentChar(char curChar) {
    if ((curChar <= ' ') || (curChar >= '\u007F')) {
      return false;
    }
    for (int j = 0, size2 = printableNonStandardSymbolChars.length; j < size2; j++) {
      if (curChar == printableNonStandardSymbolChars[j]) {
        return false;
      }
    }
    return true;
  }
  
  public static final boolean isConstituentUpperCaseChar(char curChar) {
    if (!isConstituentChar(curChar)) { return false; }
    if ((curChar >= 'a') && (curChar <= 'z')) {
      return false;
    }
    return true;
  }
  
  public void forceGlobalValue(SubLObject newValue) {
    value = newValue;
  }
  
  abstract public boolean isDynamic();
  
  public final void setConstantValue(SubLObject value) {
    Errors.error("Can't set the value of a constant symbol: " + this);
  }
  
  //// Protected Area
  
  protected SubLSymbol getBindingType() {
    return CommonSymbols.LEXICAL;
  }
  
  //// Private Area
    
  /** this version will not contain outer symbol quotes ("|") */
  // @ToDo get rid of me --APB
  private final CharSequence getPackageName() {
    return thePackage == null ? "#" : thePackage.getName();
  }
  
  /** this version will not contain outer symbol quotes ("|") */
  // @ToDo get rid of me --APB
  private final SubLString getSymbolName() {
    return (SubLString) getSymbolStringRep(getName(), isSpecialSymbol(getName()));
  }
  
  /** this version will include "|" around name when needed */
  // @ToDo get rid of me --APB
  private final CharSequence getPackageNamePrecise() {
    return getPackageName();
  }
  
  /* this version will include "|" aruond name when needed */
  // @ToDo get rid of me --APB
  private final CharSequence getSymbolNamePrecise() {
    return getSymbolStringRep(getName(), isSpecialSymbol(getName()));
  }
  
  private static final CharSequence getSymbolStringRep(String str, boolean isSpecial) {
    if (isSpecial) {
      new StringBuilder(SYMBOL_NAME_QUOTE).append(str).append(SYMBOL_NAME_QUOTE).toString();
    }
    return str;
  }
  
  // @hack
  private final boolean isSpecialSymbol(CharSequence str) {
    if (hasCheckedSymbolStatus) {
      return isSpecialSymbolName;
    }
    for (int i = 0, size = str.length(); i < size; i++) {
      char curChar = str.charAt(i);
      if (Character.isWhitespace(curChar)) { 
        return isSpecialSymbolName = hasCheckedSymbolStatus = true;
      }
      if (Character.isLowerCase(curChar)) {
        return isSpecialSymbolName = hasCheckedSymbolStatus = true;
      }
    }
    hasCheckedSymbolStatus = true;
    return isSpecialSymbolName = false;
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public SubLStream getStream(boolean followSynonymStream) { // SubLStream
    return getValue().getStream(followSynonymStream);
  }
  
  public SubLInputStream toInputStream() { // SubLStream
    return getStream(false).toInputStream();
  }
  
  public SubLInputTextStream toInputTextStream() { // SubLStream
    return getStream(false).toInputTextStream();
  }
  
  public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
    return getStream(false).toInputBinaryStream();
  }
  
  public SubLOutputStream toOutputStream() { // SubLStream
    return getStream(false).toOutputStream();
  }
  
  public SubLOutputTextStream toOutputTextStream() { // SubLStream
    return getStream(false).toOutputTextStream();
  }
  
  public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
    return getStream(false).toOutputBinaryStream();
  }
  
  //// Internal Rep
  
  private int hashCode = -1;

  // @todo volatile is probably overkill here
  // @todo definitely don't need volatile for constants!!!
  volatile protected SubLObject value = UNBOUND;
  
  private SubLPackage thePackage; // this should be volatile, but in general 
                                  // it almost never changes so not doing so
                                  // for performance reasons
  
  private SubLString symbolName;
  
  private boolean isSpecialSymbolName = false;
  
  private boolean hasCheckedSymbolStatus = false;
  
  protected SubLOperator operator; // this should be volatile, but in general 
                                   // it almost never changes so not doing so
                                   // for performance reasons
  
  private SubLList plist = SubLNil.NIL; // all references to this should be explicitly synchronized
  
  private static final int MAX_CANONICALIZER_CACHE_SIZE = 5000;
  private static final SubLString GENTEMP_PREFIX = SubLObjectFactory.makeString("T");
  private static final SubLString GENSYM_PREFIX = SubLObjectFactory.makeString("G");
  
  // @note if this cache is to be used in multiple threads then a synchronized version must be made -APB
  private static final Map<String, String> symbolCanonicalizerCache
      = new LinkedHashMap<String, String>(MAX_CANONICALIZER_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_CANONICALIZER_CACHE_SIZE;
    }
  };
  
  private static final char[] printableNonStandardSymbolChars =
  { '#', ':', ';', '|', '"', '\'', '`', ',', '(', ')', '\\' };
  
}
