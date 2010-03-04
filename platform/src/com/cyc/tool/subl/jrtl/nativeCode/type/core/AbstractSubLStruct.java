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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import java.util.HashMap;
import java.util.Map;

public  abstract class AbstractSubLStruct extends AbstractSubLObject implements SubLStruct {
  
  //// Constructors
  
  /** Creates a new instance of SubLStruct. */
  AbstractSubLStruct() {}
  
  //// Public Area
  
  public void init(int size) {
  }
  
  public final SubLObject getField(SubLSymbol fieldName) {
    int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
    return getField(fieldNum);
  }
  
  public final void setField(SubLSymbol fieldName, SubLObject value) {
    int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
    setField(fieldNum, value);
  }
  
  public int id() {
    return getStructDecl().getId();
  }
  
  public SubLSymbol getName() {
    return getStructDecl().getStructName();
  }
  
  public final String toString() {
    try {
      return print_high.princ_to_string(this).getString();
    } catch (Exception e) {
      return "#<" + toTypeName() + " " + getName() + " @ " + hashCode() + ">";
    }
  }
  
  // @note make this final once StructDecls start getting set properly
  public int getFieldCount() {
    SubLStructDecl decl =  getStructDecl();
    if (decl == null) {
      return 0;
    }
    return decl.getFieldCount();
  }
  
  public final int hashCode(int currentDepth) {
    return Sxhash.sxhash(this).intValue();
  }
  
  /*public final SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    throw new InvalidSubLExpressionException("Error: Attempt to take the "
        + "value of a structure '" + this + "'.");
  }*/
  
  public final boolean equals(Object obj) {
    if (obj == this) { return true; }
    if (obj == null) { return false; }
    if (!(obj instanceof SubLObject)) { return false; }
    SubLObject sublObj = (SubLObject)obj;
    if (!sublObj.isStructure()) { return false; }
    SubLStruct other = sublObj.toStruct();
    if (getName() != other.getName()) { return false; }
    if (getFieldCount() != other.getFieldCount()) { return false; }
    for (int i = 0, size = getFieldCount(); i < size; i++) {
      final int index = i+2;
      if (!getField(index).equals(other.getField(index))) {
        return false;
      }
    }
    return true;
  }
  
  /** Two structs are equalp iff all their fields are equalp. */
  public final boolean equalp(SubLObject obj) {
    if (obj == this) { return true; }
    if (getStructDecl().isInterned) { return false; }
    if (obj == null) { return false; }
    if (!obj.isStructure()) { return false; }
    SubLStruct otherStuct = obj.toStruct();
    if (getStructDecl() != otherStuct.getStructDecl()) { return false; }
    int fieldCount = getFieldCount();
    switch (fieldCount) {
      case 19:
        if (!getField20().equalp(otherStuct.getField20())) { return false; }
      case 18:
        if (!getField19().equalp(otherStuct.getField19())) { return false; }
      case 17:
        if (!getField18().equalp(otherStuct.getField18())) { return false; }
      case 16:
        if (!getField17().equalp(otherStuct.getField17())) { return false; }
      case 15:
        if (!getField16().equalp(otherStuct.getField16())) { return false; }
      case 14:
        if (!getField15().equalp(otherStuct.getField15())) { return false; }
      case 13:
        if (!getField14().equalp(otherStuct.getField14())) { return false; }
      case 12:
        if (!getField13().equalp(otherStuct.getField13())) { return false; }
      case 11:
        if (!getField12().equalp(otherStuct.getField12())) { return false; }
      case 10:
        if (!getField11().equalp(otherStuct.getField11())) { return false; }
      case 9:
        if (!getField10().equalp(otherStuct.getField10())) { return false; }
      case 8:
        if (!getField9().equalp(otherStuct.getField9())) { return false; }
      case 7:
        if (!getField8().equalp(otherStuct.getField8())) { return false; }
      case 6:
        if (!getField7().equalp(otherStuct.getField7())) { return false; }
      case 5:
        if (!getField6().equalp(otherStuct.getField6())) { return false; }
      case 4:
        if (!getField5().equalp(otherStuct.getField5())) { return false; }
      case 3:
        if (!getField4().equalp(otherStuct.getField4())) { return false; }
      case 2:
        if (!getField3().equalp(otherStuct.getField3())) { return false; }
      case 1:
        if (!getField2().equalp(otherStuct.getField2())) { return false; }
    }
    if (fieldCount >= 20) {
      for (int i = 19; i < fieldCount; i++) {
        int index = i + 1;
        if (!getField(index).equalp(otherStuct.getField(index))) { 
          return false; 
        }
      }
    }
    return true;
  }
  
  public static final String STRUCT_TYPE_NAME = "STRUCT";
  
  public final String toTypeName() {
    return STRUCT_TYPE_NAME;
  }
  
  public final SubLSymbol getType(){
    return getName();
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_HUNDRED_FIFTY_FOUR_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLStruct toStruct() { // SubLStruct
    return this;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
}
