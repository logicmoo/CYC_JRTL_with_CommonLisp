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

public  final class SubLDoubleFloat 
extends AbstractSubLFloat 
implements SubLFloat, SubLNumber, SubLObject {
  
  //// Constructors
  
  /** Creates a new instance of SubLFloat. */
  SubLDoubleFloat(Double theDouble) {
    this.doubleValue = theDouble;
    this.value = theDouble.doubleValue();
  }
  
  SubLDoubleFloat(double value) {
    this.value = value;
  }
  
  //// Public Area
  
  public final boolean isPositive() { // SubLNumber
    return value > 0.0;
  }
  
  public final boolean isNegative() {
    return value < 0.0;
  }
  
  public final boolean isZero() {
    return value == 0.0;
  }
  
  
  public final int getNumSize() { return FLOATING_POINT; }
  
  public final SubLObject inc() {
    return SubLNumberFactory.makeDouble(value + 1.0);
  }
  
  public final SubLObject dec() {
    return SubLNumberFactory.makeDouble(value - 1.0);
  }
  
  public final SubLObject add(SubLObject num) {
    return SubLNumberFactory.makeDouble(value + num.doubleValue());
  }
  
  public final SubLObject sub(SubLObject num) {
    return SubLNumberFactory.makeDouble(value - num.doubleValue());
  }
  
  public final SubLObject mult(SubLObject num) {
    return SubLNumberFactory.makeDouble(value * num.doubleValue());
  }
  
  public String toString() {
    return "" + value;
  }
  
  public Double getDouble() {
    return (Double)getNativeNumber();
  }
  
  public static String NUMBER_TYPE_NAME = "LONG-FLOAT";
  
  public String toTypeName() {
    return NUMBER_TYPE_NAME;
  }
  
  private static final int SXHASH_TYPE_FLOAT = 89;
  
  public int sxhash() {
    return doubleValue.hashCode();// + SXHASH_TYPE_FLOAT;
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean numericallyEqualInternal(SubLObject num) {
    return value == num.doubleValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanInternal(SubLObject num) {
    return value < num.doubleValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean lessThanOrEqualInternal(SubLObject num) {
    return value <= num.doubleValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanInternal(SubLObject num) {
    return value > num.doubleValue();
  }
  
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public final boolean greaterThanOrEqualInternal(SubLObject num) {
    return value >= num.doubleValue();
  }
  
  public Number getNativeNumber() {
    if (doubleValue == null) {
      doubleValue = new Double(value);
    }
    return doubleValue;
  }
   
  public double doubleValue() {
    return value;
  }
  
  public float floatValue() {
    return (float)value;
  }
  
  public int intValue() {
    return (int)value;
  }
  
  public long longValue() {
    return (long)value;
  }
  
  public final boolean eql(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  
  public final boolean equal(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  
  public final boolean equalp(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_float$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.SEVEN_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLDoubleFloat toDouble() { // SubLDoubleFloat
    return this;
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
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return true; }
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
  
  private Double doubleValue;
  private final double value;
  
}
