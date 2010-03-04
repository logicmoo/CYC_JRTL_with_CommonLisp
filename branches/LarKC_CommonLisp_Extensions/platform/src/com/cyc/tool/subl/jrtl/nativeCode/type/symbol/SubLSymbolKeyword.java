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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.util.SubLFiles.*;

//// External Imports

public  final class SubLSymbolKeyword extends AbstractSubLSymbol implements SubLSymbol {
  
  //// Constructors
  
  /** Creates a new instance of SubLSymbol. 
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  SubLSymbolKeyword(SubLString symbolName) {
    super(symbolName, SubLPackage.KEYWORD_PACKAGE);
  }
  
  /** Creates a new instance of SubLSymbol. 
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  SubLSymbolKeyword(String symbolName) {
    super(SubLObjectFactory.makeString(symbolName), SubLPackage.KEYWORD_PACKAGE);
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLSymbol toSymbol() {
    return this;
  }
  
  public final int getBindingId() {
    return INVALID_BINDING_INDEX;
  }
  
  public SubLObject getValue() {
    return this;
  }
  
  public void setValue(SubLObject value) {
    Errors.error("Can't change the value of keyword symbol: " + this);
  }
 
  public final SubLObject getDynamicValue(SubLObject[] bindings) {
    return Errors.error(this + " is not boundp.");
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't change the value of keyword symbol: " + this);
  }
 
  public final SubLObject getDynamicValue(SubLThread thread) {
    return Errors.error(this + " is not boundp.");
  }
  
  public final void setDynamicValue(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't change the value of keyword symbol: " + this);
  }
      
  public SubLObject getDynamicValue() {
    Errors.error(this + " is not boundp.");
    return null;
  }
  
  public void setDynamicValue(SubLObject value) {
    Errors.error("Can't change the value of keyword symbol: " + this);
  }
  
  public SubLObject getGlobalValue() {
    Errors.error(this + " is not boundp.");
    return null;
  }
  
  public void setGlobalValue(SubLObject value) {
    Errors.error("Can't change the value of keyword symbol: " + this);
  }
  
  public final SubLObject currentBinding(SubLObject[] bindings) {
    return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
  }
  
  public final void bind(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Keyword: " + this + " cannot be dynamically bound.");
  }
  
  public final void rebind(SubLObject oldValue, SubLObject[] bindings) {
    Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
  }
  
  public final SubLObject currentBinding(SubLThread thread) {
    return Errors.error("Keyword: " + this + " does not have a dynamic binding.");
  }
  
  public final void bind(SubLObject newValue, SubLThread thread) {
    Errors.error("Keyword: " + this + " cannot be dynamically bound.");
  }
  
  public final void rebind(SubLObject oldValue, SubLThread thread) {
    Errors.error("Keyword: " + this + " cannot be dynamically rebound.");
  }
 
  public boolean isDynamic() {
    return false;
  }
  
  public boolean isGlobal() {
    return true;
  }
  
  public boolean isUndeclared() {
    return false;
  }
  
  public final boolean isConstantSymbol() {
    return true;
  }

  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return this;
  }
  
  public static String SYMBOL_TYPE_NAME = "SYMBOL";
  
  public String toTypeName() {
    return SYMBOL_TYPE_NAME;
  }
  
  public void forceGlobalValue(SubLObject newValue) {
    Errors.error("Cannot set the value of keyword: " + this + ".");
  }
  
  public void setAccessMode(VariableAccessMode accessMode) {}
  
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return true; }
  public final boolean isKeyword() { return true; }
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
  
}
