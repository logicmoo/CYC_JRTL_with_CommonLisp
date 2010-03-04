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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles.*;

//// External Imports

/**
 * <P>SubLQuote is designed to to be a temporary hack until we
 * get the JRTL bootstrapped, then it should be removed.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 10, 2005, 7:44 PM
 * @version $Id: SubLQuote.java 126764 2009-01-07 22:27:23Z tbrussea $
 */
final public class SubLQuote extends AbstractSubLObject implements SubLObject, SubLSymbol {
  
  //// Constructors
  
  /** Creates a new instance of SubLQuote. */
  // @todo swap packageName, symbolName arg order
  private SubLQuote(String packageName, String symbolName, String alternateRep) {
    symbol = SubLObjectFactory.makeSymbol(symbolName, packageName);
    alternateSymbol = SubLObjectFactory.makeSymbol(alternateRep, packageName);
  }
  
  //// Public Area
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_symbol$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_INTEGER;
  }
  
  public static final SubLQuote QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "QUOTE", "'");
  public static final SubLQuote BACK_QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "BACKQUOTE", "`");
  public static final SubLQuote UNQUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "UNQUOTE", ",");
  public static final SubLQuote SPLICING_UNQUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "SPLICING-UNQUOTE", ",@");
  public static final SubLQuote FUNCTION_QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "FUNCTION", "#'");
  
  
  /** Method created to avoid casting */
  public final SubLSymbol toSymbol() {
    return symbol;
  }
  
  public static String uniqueQuoteName(String packageName, String symbolName, String alternateRep) {
    String lookupName = packageName + ":" + symbolName + " (" + alternateRep + ")";
    return lookupName;
  }
  
  public final int getBindingId() {
    return symbol.getBindingId();
  }
  
  public final SubLObject currentBinding(SubLObject[] bindings) {
    return symbol.currentBinding(bindings);
  }
  
  public final void bind(SubLObject newValue, SubLObject[] bindings) {
    symbol.bind(newValue, bindings);
  }
  
  public final void rebind(SubLObject oldValue, SubLObject[] bindings) {
    symbol.rebind(oldValue, bindings);
  }
  
  public final SubLObject currentBinding(SubLThread thread) {
    return symbol.currentBinding(thread);
  }
  
  public final void bind(SubLObject newValue, SubLThread thread) {
    symbol.bind(newValue, thread);
  }
  
  public final void rebind(SubLObject oldValue, SubLThread thread) {
    symbol.rebind(oldValue, thread);
  }
  
  public SubLPackage getPackage() {
    return symbol.getPackage();
  }
  
  public String getName() {
    return symbol.getName();
  }
  
  public SubLString getSubLName() {
    return symbol.getSubLName();
  }
  
  public boolean fboundp() {
    return symbol.fboundp();
  }
  
  public boolean boundp() {
    return symbol.boundp();
  }
  
  public boolean isDynamic() {
    return symbol.isDynamic();
  }
  
  public boolean isGlobal() {
    return symbol.isGlobal();
  }
  
  public boolean isUndeclared() {
    return symbol.isUndeclared();
  }
  
  public boolean isConstantSymbol() {
    return symbol.isConstantSymbol();
  }

  public SubLSymbol getSymbol() {
    return symbol;
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public SubLOperator getFunction() {
    return symbol.getFunction();
  }
  
  public SubLFunction getFunc() {
    return symbol.getFunc();
  }
  
  public SubLObject getValue() {
    return symbol.getValue();
  }
 
  public final SubLObject getDynamicValue(SubLObject[] bindings) {
    return symbol.getDynamicValue(bindings);
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    symbol.setDynamicValue(newValue, bindings);
  }
 
  public final SubLObject getDynamicValue(SubLThread thread) {
    return symbol.getDynamicValue(thread);
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLThread thread) {
    symbol.setDynamicValue(newValue, thread);
  }
  
  public SubLObject getDynamicValue() {
    return symbol.getDynamicValue();
  }
  
  public void setDynamicValue(SubLObject value) {
    symbol.setDynamicValue(value);
  }
  
  public SubLObject getGlobalValue() {
    return symbol.getGlobalValue();
  }
  
  public void setGlobalValue(SubLObject value) {
    symbol.setGlobalValue(value);
  }
  
  public void setConstantValue(SubLObject value) {
    symbol.setConstantValue(value);
  }
  
  public SubLList getPlist() {
    return symbol.getPlist();
  }
  
  public void setPackage(SubLPackage thePackage) {
    Errors.error("Can't set package on symbol: " + getName());
  }
  
  public void setFunction(SubLOperator func) {
    symbol.setFunction(func);
  }
  
  public void setValue(SubLObject value) {
    symbol.setValue(value);
  }
  
  public void setProperty(SubLObject indicator, SubLObject value) {
    symbol.setProperty(indicator, value);
  }
  
  public void removeProperty(SubLObject indicator) {
    symbol.removeProperty(indicator);
  }
  
  public SubLObject getProperty(SubLObject indicator) {
    return symbol.getProperty(indicator);
  }
  
  public SubLSymbol getAlternateSymbol() {
    return alternateSymbol;
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
  
  public String toString() {
    return symbol.toString();
  }
  
  public boolean equals(Object obj) {
    return symbol.equals(obj);
  }
  
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    throw new InvalidSubLExpressionException("Error: Attempt to take the "
        + "value of the unbound variable '" + this + "'.");
  }
  
  public static String QUOTE_TYPE_NAME = "QUOTE";
  
  public String toTypeName() {
    return QUOTE_TYPE_NAME;
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return symbol.hashCode(currentDepth + 1);
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public void forceGlobalValue(SubLObject newValue) {
    symbol.forceGlobalValue(newValue);
  }
  
  public void setAccessMode(VariableAccessMode accessMode) {
    symbol.setAccessMode(accessMode);
  }
  
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return true; }
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
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private SubLSymbol symbol;
  
  private SubLSymbol alternateSymbol;
  
}
