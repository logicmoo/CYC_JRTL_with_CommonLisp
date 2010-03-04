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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.math.BigInteger;

//// External Imports

public  final class SubLLongBignum 
extends AbstractSubLInteger 
implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLInteger. */
  SubLLongBignum(Long theLong) {
    this.longValue = theLong;
    this.value = theLong.longValue();
  }
  
  SubLLongBignum(long theLong) {
    this.value = theLong;
  }
  
  //// Public Area
  
  public final boolean isPositive() { // SubLNumber
    return value > 0;
  }
  
  public final boolean isNegative() {
    return value < 0;
  }
  
  public final boolean isZero() {
    return value == 0;
  }
  
  public static String LONG_TYPE_NAME = "SOMEWHAT-BIG-BIGNUM";
  
  public final int getNumSize() { return EIGHT_BYTE_INTEGER; }
  
  public final SubLObject inc() {
    if (value == Long.MAX_VALUE) {
      return SubLNumberFactory.makeInteger(new BigInteger(value + "").add(BigInteger.ONE));
    }
    return SubLNumberFactory.makeInteger(value + 1);
  }
  
  public final SubLObject dec() {
    if (value == Long.MIN_VALUE) {
      return SubLNumberFactory.makeInteger(new BigInteger(value + "").subtract(BigInteger.ONE));
    }
    return SubLNumberFactory.makeInteger(value - 1);
  }
  
  public final SubLObject add(SubLObject num) {
    if (num.getNumSize() > EIGHT_BYTE_INTEGER) {
      return num.add(this);
    }
    BigInteger a = bigIntegerValue();
    BigInteger b = num.bigIntegerValue();
    return SubLNumberFactory.makeInteger(a.add(b));
  }
  
  public final SubLObject sub(SubLObject num) {
    if (num.getNumSize() > EIGHT_BYTE_INTEGER) {
      return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
    }
    BigInteger a = bigIntegerValue();
    BigInteger b = num.bigIntegerValue();
    return SubLNumberFactory.makeInteger(a.subtract(b));
  }
  
  public final SubLObject mult(SubLObject num) {
    if (num.getNumSize() > EIGHT_BYTE_INTEGER) {
      return num.mult(this);
    }
    BigInteger a = bigIntegerValue();
    BigInteger b = num.bigIntegerValue();
    return SubLNumberFactory.makeInteger(a.multiply(b));
  }
   
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean numericallyEqualInternal(SubLObject num) {
    return value == num.longValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanInternal(SubLObject num) {
    return value < num.longValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanOrEqualInternal(SubLObject num) {
    return value <= num.longValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanInternal(SubLObject num) {
    return value > num.longValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanOrEqualInternal(SubLObject num) {
    return value >= num.longValue();
  }
  
  public String toString() {
    return "" + value;
  }
  
  public String toTypeName() {
    return LONG_TYPE_NAME;
  }
 
  public Number getNativeNumber() {
    return getLong();
  }
  
  public synchronized Long getLong() {
    if (longValue == null) {
      longValue = new Long(value);
    }
    return longValue;
  }
  
  public double doubleValue() {
    return (double)value;
  }
  
  public float floatValue() {
    return (float)value;
  }
  
  public int intValue() {
    return (int)value;
  }
  
  public long longValue() {
    return value;
  }
  
  public final boolean eql(SubLObject obj) {
    if (!obj.isLongBignum()) { return false; }
    return (value == obj.longValue());
  }
  
  public final boolean equal(SubLObject obj) {
    if (!obj.isLongBignum()) { return false; }
    return (value == obj.longValue());
  }
  
  public final boolean equalp(SubLObject obj) {
    if (!obj.isLongBignum()) { return false; }
    return (value == obj.longValue());
  }
  
  public final SubLNumber abs() {
    if (value == Long.MIN_VALUE) {
      return SubLObjectFactory.makeInteger(new BigInteger("" + Long.MIN_VALUE).abs());
    }
    long result = Math.abs(value);
    return SubLObjectFactory.makeInteger(result);
  }
  
  public final SubLSymbol getType(){ 
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
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return true; }
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
  
  private final long value;
  private Long longValue;
  
}
