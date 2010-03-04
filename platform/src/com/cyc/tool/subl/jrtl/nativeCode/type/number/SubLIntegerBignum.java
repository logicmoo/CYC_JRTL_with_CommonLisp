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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  final class SubLIntegerBignum extends AbstractSubLIntegerBignum implements SubLBignum, SubLNumber, SubLObject {
  
  //// Constructors
  
  /**
   * Creates a new instance of SubLIntegerBignum.
   */
  SubLIntegerBignum(Integer theInteger) {
    super(theInteger);
  }
  
  SubLIntegerBignum(int theInteger) {
    super(theInteger);
  }
  
  //// Public Area
  
  public final int getNumSize() { return FOUR_BYTE_INTEGER; }
  
  public final SubLObject add(SubLObject num) {
    if (num.getNumSize() <= FOUR_BYTE_INTEGER) {
      return SubLNumberFactory.makeInteger((long)value + (long)num.intValue());
    }
      return num.add(this);
  }
  
  public final SubLObject sub(SubLObject num) {
    if (num.getNumSize() <= FOUR_BYTE_INTEGER) {
      return SubLNumberFactory.makeInteger((long)value - (long)num.intValue());
    }
    return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
  }
  
  // @ToDo think of better names -APB
  public static final String INTEGER_TYPE_NAME = "MARGINALLY-BIG-BIGNUM";
  
  public final String toTypeName() {
    return INTEGER_TYPE_NAME;
  }
  
  public final boolean eql(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  
  public final boolean equal(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  
  public final boolean equalp(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  
  public final int hashCode(int currentDepth) {
    return value;
  }
  
  /** @Note This should only ever by used by caching */
  /*public static final class MutableSubLIntegerBignum extends SubLIntegerBignum {
    // @Note This should only ever by used by caching 
    public MutableSubLIntegerBignum(Integer theInteger) {
      super(theInteger);
    }
    
    // @Note This should only ever by used by caching 
    public MutableSubLIntegerBignum(int theInteger) {
      super(theInteger);
    }
    
    public void setValue(int newValue) {
      value = newValue;
    }
  } */
  
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
  
  public final SubLSymbol getType() { 
    return Types.$dtp_bignum$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.THIRTY_FOUR_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLFixnum toFixnum() { // SubLFixnum
    Errors.error(this + " is not of type: FIXNUM.");
    return null;
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
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return true; }
  public final boolean isIntBignum() { return true; }
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
