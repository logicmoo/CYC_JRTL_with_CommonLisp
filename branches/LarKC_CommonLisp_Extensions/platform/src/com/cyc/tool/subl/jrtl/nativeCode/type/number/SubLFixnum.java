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

package  com.cyc.tool.subl.jrtl.nativeCode.type.number;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  final class SubLFixnum extends AbstractSubLIntegerBignum implements  SubLBignum, SubLInteger, SubLNumber, SubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLInteger. */
  SubLFixnum(Integer theInteger) {
    super(theInteger);
  }
  
  SubLFixnum(int theInteger) {
    super(theInteger);
  }
  
  //// Public Area
  
  public final int hashCode(int currentDepth) {
    return value;
  }
  
  public final int getNumSize() { return FOUR_BYTE_INTEGER; }
  
  public final SubLObject add(SubLObject num) {
    if (num.isFixnum()) {
      return SubLNumberFactory.makeInteger(value + num.intValue());
    }
    return num.add(this);
  }
  
  public final SubLObject sub(SubLObject num) {
    if (num.isFixnum()) {
      return SubLNumberFactory.makeInteger(value - num.intValue());
    }
    return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
  }
  
  public static final String FIXNUM_TYPE_NAME = "FIXNUM";
  
  public final String toTypeName() {
    return FIXNUM_TYPE_NAME;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean numericallyEqualInternal(SubLObject num) {
    return value == num.intValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanInternal(SubLObject num) {
    return value < num.intValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanOrEqualInternal(SubLObject num) {
    return value <= num.intValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanInternal(SubLObject num) {
    return value > num.intValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanOrEqualInternal(SubLObject num) {
    return value >= num.intValue();
  }
  
  public final boolean eql(SubLObject obj) {
    return (this == obj);
  } 
  
  public final boolean equal(SubLObject obj) {
    return (this == obj);
  } 
  
  public final boolean equalp(SubLObject obj) {
    return (this == obj);
  }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_fixnum$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.SIX_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLFixnum toFixnum() { // SubLFixnum
    return this;
  }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return true; }
  public final boolean isFixnum() { return true; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return true; }
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
