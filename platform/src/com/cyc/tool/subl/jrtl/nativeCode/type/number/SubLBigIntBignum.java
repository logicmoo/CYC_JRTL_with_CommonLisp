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

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public class SubLBigIntBignum extends AbstractSubLInteger implements SubLBignum, SubLInteger, SubLNumber, SubLObject {

	//// Constructors

	public static BigInteger ZERO_BIGINT = new BigInteger(0 + "");

	//// Public Area

	public static BigInteger ONE_BIGINT = new BigInteger(1 + "");
	public static String BIG_INT_TYPE_NAME = "REALLY-BIG-BIGNUM";

	private BigInteger theBigInt;

	/** Creates a new instance of SubLInteger. */
	SubLBigIntBignum(BigInteger theBigInt) {
		this.theBigInt = theBigInt;
	}

	public SubLNumber abs() {
		BigInteger result = this.theBigInt.abs();
		return SubLObjectFactory.makeInteger(result);
	}

	public SubLObject add(SubLObject num) {
		if (num.getNumSize() > SubLNumber.BIGINT_INTEGER)
			return num.add(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.add(num.bigIntegerValue()));
	}

	public SubLObject dec() {
		return SubLNumberFactory.makeInteger(this.theBigInt.subtract(SubLBigIntBignum.ONE_BIGINT));
	}

	public double doubleValue() {
		return this.theBigInt.doubleValue();
	}

	public boolean eql(SubLObject obj) {
		if (!obj.isBigIntegerBignum())
			return false;
		return this.theBigInt.equals(obj.bigIntegerValue());
	}

	public boolean equal(SubLObject obj) {
		if (!obj.isBigIntegerBignum())
			return false;
		return this.theBigInt.equals(obj.bigIntegerValue());
	}

	public boolean equalp(SubLObject obj) {
		if (!obj.isBigIntegerBignum())
			return false;
		return this.theBigInt.equals(obj.bigIntegerValue());
	}

	public float floatValue() {
		return this.theBigInt.floatValue();
	}

	public BigInteger getBigInt() {
		return this.theBigInt;
	}

	public Number getNativeNumber() {
		return this.theBigInt;
	}

	public int getNumSize() {
		return SubLNumber.BIGINT_INTEGER;
	}

	public SubLSymbol getType() {
		return Types.$dtp_bignum$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_FOUR_INTEGER;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean greaterThanInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) > 0;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) >= 0;
	}

	public SubLObject inc() {
		return SubLNumberFactory.makeInteger(this.theBigInt.add(SubLBigIntBignum.ONE_BIGINT));
	}

	public int intValue() {
		return this.theBigInt.intValue();
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return true;
	}

	public boolean isBignum() {
		return true;
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
		return false;
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
		return true;
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
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) < 0;
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
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) > 0;
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
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) == 0;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean lessThanInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) < 0;
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean lessThanOrEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) <= 0;
	}

	public long longValue() {
		return this.theBigInt.longValue();
	}

	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > SubLNumber.BIGINT_INTEGER)
			return num.mult(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.multiply(num.bigIntegerValue()));
	}

	/**
	 * use this version only if the arg is of same numerical type or smaller
	 * type than 'this'
	 */
	public boolean numericallyEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) == 0;
	}

	public SubLObject sub(SubLObject num) {
		if (num.getNumSize() > SubLNumber.BIGINT_INTEGER)
			return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.subtract(num.bigIntegerValue()));
	}

	/** Method created to avoid casting */
	public SubLFixnum toFixnum() { // SubLFixnum
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toTypeName() {
		return SubLBigIntBignum.BIG_INT_TYPE_NAME;
	}

}
