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

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public  final class SubLStructInterpreted extends AbstractSubLStruct implements SubLStruct, CommonSymbols {
  
  //// Constructors
  
  /** Creates a new instance of SubLStructInterpreted. */
  SubLStructInterpreted(int size) {
    fieldValues = new SubLObject[size + 2];
    clear();
  }
  
  //// Public Area
  
  public final void clear() {
    Arrays.fill(fieldValues, NIL);
  }
  
  public final SubLObject getField(int slotNum) {
    return fieldValues[slotNum];
  }

  public final void setField(int slotNum, SubLObject value) {
    fieldValues[slotNum] = value;
  }
  
  public int id() {
    return id;
  }
  
  public final SubLSymbol getName() {
    // for C compatibility
    return fieldValues[1].toSymbol();
  }
  
  public final void setName(SubLSymbol type) { // @Note this should probably be synchronized
    // for C compatibility
    fieldValues[1] = type;
    // @note move this hack to native structs once implemented if 
    // a better solution hasn't come around before then
    // @hack
    /*String name = type.toString();
    if (name.equals("CONSTANT")) {
      canFastHash = true;
    } else if (name.equals("PROBLEM")) {
      canFastHash = true;
    } else if (name.equals("PROOF")) {
      canFastHash = true;
    } else if (name.equals("PROBLEM-LINK")) {
      canFastHash = true;
    } else if (name.equals("TACTIC")) {
      canFastHash = true;
    } else if (name.equals("NART")) {
      canFastHash = true;
    } else if (name.equals("ASSERTION")) {
      canFastHash = true;
    } else if (name.equals("DEDUCTION")) {
      canFastHash = true;
    } else if (name.equals("KB-HL-SUPPORT")) {
      canFastHash = true;
    } else if (name.equals("VARIABLE")) {
      canFastHash = true;
    }*/
    id = SubLStructDecl.getTypeID(type);
   }
  
  //boolean canFastHash = false;
  
  public final SubLStructDecl getStructDecl() {
    return structDecl;
  }
  
  public final void setStructDecl(SubLStructDecl structDecl) {
    this.structDecl = structDecl;
  }
  
  // @hack get rid of this once we have structDecls being set correctly
  public final int getFieldCount() {
    if (fieldValues == null) { return 0; }
    return fieldValues.length;
  }
  
  public final boolean canFastHash() {
    // @hack to experiment if we actually get a speedup
    //return canFastHash;
    if (structDecl == null) { return false; }
    return structDecl.isInterned;
  }
  
  /** Method created to avoid casting */
  public final SubLObject getField0()  {
    return getField(0);
  }
  /** Method created to avoid casting */
  public SubLObject setField0(SubLObject newVal) {
    setField(0, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public final SubLObject getField1()  {
    return getField(1);
  }
  /** Method created to avoid casting */
  public SubLObject setField1(SubLObject newVal) {
    setField(1, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField2() {
    return getField(2);
  }
  /** Method created to avoid casting */
  public SubLObject setField2(SubLObject newVal) {
    setField(2, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField3() {
    return getField(3);
  }
  /** Method created to avoid casting */
  public SubLObject setField3(SubLObject newVal) {
    setField(3, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField4() {
    return getField(4);
  }
  /** Method created to avoid casting */
  public SubLObject setField4(SubLObject newVal) {
    setField(4, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField5() {
    return getField(5);
  }
  /** Method created to avoid casting */
  public SubLObject setField5(SubLObject newVal) {
    setField(5, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField6() {
    return getField(6);
  }
  /** Method created to avoid casting */
  public SubLObject setField6(SubLObject newVal) {
    setField(6, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField7() {
    return getField(7);
  }
  /** Method created to avoid casting */
  public SubLObject setField7(SubLObject newVal) {
    setField(7, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField8() {
    return getField(8);
  }
  /** Method created to avoid casting */
  public SubLObject setField8(SubLObject newVal) {
    setField(8, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField9() {
    return getField(9);
  }
  /** Method created to avoid casting */
  public SubLObject setField9(SubLObject newVal) {
    setField(9, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField10() {
    return getField(10);
  }
  /** Method created to avoid casting */
  public SubLObject setField10(SubLObject newVal) {
    setField(10, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField11() {
    return getField(11);
  }
  /** Method created to avoid casting */
  public SubLObject setField11(SubLObject newVal) {
    setField(11, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField12() {
    return getField(12);
  }
  /** Method created to avoid casting */
  public SubLObject setField12(SubLObject newVal) {
    setField(12, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField13() {
    return getField(13);
  }
  /** Method created to avoid casting */
  public SubLObject setField13(SubLObject newVal) {
    setField(13, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField14() {
    return getField(14);
  }
  /** Method created to avoid casting */
  public SubLObject setField14(SubLObject newVal) {
    setField(14, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField15() {
    return getField(15);
  }
  /** Method created to avoid casting */
  public SubLObject setField15(SubLObject newVal) {
    setField(15, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField16() {
    return getField(16);
  }
  /** Method created to avoid casting */
  public SubLObject setField16(SubLObject newVal) {
    setField(16, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField17() {
    return getField(17);
  }
  /** Method created to avoid casting */
  public SubLObject setField17(SubLObject newVal) {
    setField(17, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField18() {
    return getField(18);
  }
  /** Method created to avoid casting */
  public SubLObject setField18(SubLObject newVal) {
    setField(18, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField19() {
    return getField(19);
  }
  /** Method created to avoid casting */
  public SubLObject setField19(SubLObject newVal) {
    setField(19, newVal);
    return newVal;
  }
  /** Method created to avoid casting */
  public SubLObject getField20() {
    return getField(20);
  }
  /** Method created to avoid casting */
  public SubLObject setField20(SubLObject newVal) {
    setField(20, newVal);
    return newVal;
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
  
  private int id; // @todo temp until structDecl is assured to be non-nil
  
  private SubLStructDecl structDecl;
  
  private SubLObject[] fieldValues;
}
