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

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public class SubLDoubleFloat extends AbstractSubLFloat implements SubLFloat, SubLNumber, SubLObject {

	//// Constructors

	public static String NUMBER_TYPE_NAME = "LONG-FLOAT";

	private static int SXHASH_TYPE_FLOAT = 89;

	//// Public Area

	private Double doubleValue;

	private double value;

	SubLDoubleFloat(double value) {
		this.value = value;
	}

	/** Creates a new instance of SubLFloat. */
	SubLDoubleFloat(Double theDouble) {
		this.doubleValue = theDouble;
		this.value = theDouble.doubleValue();
	}

	public SubLObject add(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value + num.doubleValue());
	}

	public SubLObject dec() {
		return SubLNumberFactory.makeDouble(this.value - 1.0);
	}

	public double doubleValue() {
		return this.value;
	}

	public boolean eql(SubLObject obj) {
		if (!obj.isDouble())
			return false;
		return this.value == obj.doubleValue();
	}

	public boolean equal(SubLObject obj) {
		if (!obj.isDouble())
			return false;
		return this.value == obj.doubleValue();
	}

	public boolean equalp(SubLObject obj) {
		if (!obj.isDouble())
			return false;
		return this.value == obj.doubleValue();
	}

	public float floatValue() {
		return (float) this.value;
	}

	public Double getDouble() {
		return (Double) this.getNativeNumber();
	}

	public Number getNativeNumber() {
		if (this.doubleValue == null)
			this.doubleValue = new Double(this.value);
		return this.doubleValue;
	}

	public int getNumSize() {
		return SubLNumber.FLOATING_POINT;
	}

	public SubLSymbol getType() {
		return Types.$dtp_float$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.SEVEN_INTEGER;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean greaterThanInternal(SubLObject num) {
		return this.value > num.doubleValue();
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return this.value >= num.doubleValue();
	}

	public SubLObject inc() {
		return SubLNumberFactory.makeDouble(this.value + 1.0);
	}

	public int intValue() {
		return (int) this.value;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return true;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNegative() {
		return this.value < 0.0;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPositive() { // SubLNumber
		return this.value > 0.0;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public boolean isZero() {
		return this.value == 0.0;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean lessThanInternal(SubLObject num) {
		return this.value < num.doubleValue();
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean lessThanOrEqualInternal(SubLObject num) {
		return this.value <= num.doubleValue();
	}

	public long longValue() {
		return (long) this.value;
	}

	public SubLObject mult(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value * num.doubleValue());
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean numericallyEqualInternal(SubLObject num) {
		return this.value == num.doubleValue();
	}

	public SubLObject sub(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value - num.doubleValue());
	}

	public int sxhash() {
		return this.doubleValue.hashCode();// + SXHASH_TYPE_FLOAT;
	}

	/** Method created to avoid casting */
	public SubLDoubleFloat toDouble() { // SubLDoubleFloat
		return this;
	}

	/** Method created to avoid casting */
	public SubLFixnum toFixnum() { // SubLFixnum
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toString() {
		return "" + this.value;
	}

	public String toTypeName() {
		return SubLDoubleFloat.NUMBER_TYPE_NAME;
	}

}
