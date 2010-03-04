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
import java.math.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  final class SubLBigIntBignum 
extends AbstractSubLInteger 
implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLInteger. */
  SubLBigIntBignum(BigInteger theBigInt) {
    this.theBigInt = theBigInt;
  }
  
  //// Public Area
  
  public static final BigInteger ZERO_BIGINT = new BigInteger(0 + "");
  public static final BigInteger ONE_BIGINT = new BigInteger(1 + "");
  
  public final boolean isPositive() { // SubLNumber
    return theBigInt.compareTo(ZERO_BIGINT) > 0;
  }
  
  public final boolean isNegative() {
    return theBigInt.compareTo(ZERO_BIGINT) < 0;
  }
  
  public final boolean isZero() {
    return theBigInt.compareTo(ZERO_BIGINT) == 0;
  }
  
  public final int getNumSize() { return BIGINT_INTEGER; }
  
  public final SubLObject inc() {
    return SubLNumberFactory.makeInteger(theBigInt.add(ONE_BIGINT));
  }
  
  public final SubLObject dec() {
    return SubLNumberFactory.makeInteger(theBigInt.subtract(ONE_BIGINT));
  }
  
  public final SubLObject add(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.add(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.add(num.bigIntegerValue()));
  }
  
  public final SubLObject sub(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.subtract(num.bigIntegerValue()));
  }
  
  public final SubLObject mult(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.mult(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.multiply(num.bigIntegerValue()));
  }
  
  public BigInteger getBigInt() {
    return theBigInt;
  }
  
  public static String BIG_INT_TYPE_NAME = "REALLY-BIG-BIGNUM";
  
  public String toTypeName() {
    return BIG_INT_TYPE_NAME;
  }
 
  public Number getNativeNumber() {
    return theBigInt;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean numericallyEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) == 0;
  }
 
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) < 0;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanOrEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) <= 0;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) > 0;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanOrEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) >= 0;
  }
  
  public final boolean eql(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  
  public final boolean equal(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  
  public final boolean equalp(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  
  public final double doubleValue() {
    return theBigInt.doubleValue();
  }
  
  public final float floatValue() {
    return theBigInt.floatValue();
  }
  
  public final int intValue() {
    return theBigInt.intValue();
  }
  
  public final long longValue() {
    return theBigInt.longValue();
  }
  
  public final SubLNumber abs() {
    BigInteger result = theBigInt.abs();
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
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return true; }
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
  
  private BigInteger theBigInt;
  
}
