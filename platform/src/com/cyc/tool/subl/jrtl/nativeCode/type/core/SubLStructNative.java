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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.lang.reflect.Field;

public  abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct {
  
  //// Constructors
  
  /** Creates a new instance of SubLStructNative. */
  protected SubLStructNative() {}
  
  /** Creates a new instance of SubLStructNative given a property list of fieldName/fieldValue pairs. */
  protected SubLStructNative(SubLObject initValues) {
    if ((initValues == null) || (initValues == SubLNil.NIL) || (initValues == CommonSymbols.UNPROVIDED)) {
      return;
    }
    SubLObject next = SubLNil.NIL;
    SubLStructDeclNative structDecl = (SubLStructDeclNative)getStructDecl();
    for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next)) {
      {
        SubLObject currentField = ConsesLow.car(next);
        SubLObject currentValue = conses_high.cadr(next);
        structDecl.setFieldFromName(currentField.toSymbol(), currentValue);
      }
    }
  }
  
  //// Public Area
  
  public final SubLObject getField0() {
    return SubLNumberFactory.makeInteger(getFieldCount());
  }
  
  public final SubLObject getField1() {
    return getName();
  }
  
  public final SubLObject setField0(SubLObject newVal) {
    Errors.unimplementedMethod("SublStructNative.setField0()");
    return SubLNil.NIL;
  }
  
  public final SubLObject setField1(SubLObject newVal) {
    Errors.unimplementedMethod("SublStructNative.setField1()");
    return SubLNil.NIL;
  }
  
  public final SubLObject getField(int fieldNum) {
    if (fieldNum == 0) { return SubLNumberFactory.makeInteger(getFieldCount()); }
    if (fieldNum == 1) { return getName(); }
    fieldNum = fieldNum - 2;
    Field field =
            ((SubLStructDeclNative)getStructDecl()).getFieldDecl(fieldNum);
    try {
      return (SubLObject)field.get(this);
    } catch (IllegalAccessException iae) {
      return Errors.error("Unable to set table value", iae);
    }
  }
  
  public final void setField(int fieldNum, SubLObject value) {
    if (fieldNum == 0) { Errors.unimplementedMethod("SublStructNative.setField(0)"); }
    if (fieldNum == 1) { Errors.unimplementedMethod("SublStructNative.setField(1)"); }
    fieldNum = fieldNum - 2;
    Field field =
            ((SubLStructDeclNative)getStructDecl()).getFieldDecl(fieldNum);
    try {
      field.set(this, value);
    } catch (IllegalAccessException iae) {
      Errors.error("Unable to set table value", iae);
    }
  }
  
  public final void clear() {
    SubLStructDecl structDecl = getStructDecl();
    int size = structDecl.getFieldCount();
    for (int i = 0; i < size; i++) {
      setField(i, SubLNil.NIL);
    }
  }
  
  public final boolean canFastHash() {
    SubLStructDecl structDecl = getStructDecl();
    if (structDecl == null) { return false; }
    return structDecl.isInterned;
  }
  
  /** Method created to avoid instanceof tests */
  public final boolean structures_bag_p() {
    return true;
  }
  
  public final SubLSymbol getName() {
    return getStructDecl().getStructName();
  }
  
  public final void setName(SubLSymbol name) {
    getStructDecl().setStructName(name);
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
  public final boolean isStructure() { return true; }
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
