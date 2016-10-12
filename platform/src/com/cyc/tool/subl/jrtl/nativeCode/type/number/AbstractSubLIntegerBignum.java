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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

//// External Imports

public abstract class AbstractSubLIntegerBignum extends AbstractSubLInteger implements SubLNumber, SubLObject {

	//// Constructors

	protected int value;

	//// Public Area

	AbstractSubLIntegerBignum(int value) {
		this.value = value;
	}

	public SubLNumber abs() {
		if (this.value == Integer.MIN_VALUE)
			return SubLObjectFactory.makeInteger(-(long) Integer.MIN_VALUE);
		int result = Math.abs(this.value);
		return SubLObjectFactory.makeInteger(result);
	}

	public SubLObject dec() {
		return SubLNumberFactory.makeInteger(this.value - (this.value == Integer.MIN_VALUE ? 1L : 1));
	}

	public double doubleValue() {
		return this.value;
	}

	public float floatValue() {
		return this.value;
	}

	public Integer getInteger() {
		return new Integer(this.value);
	}

	public Number getNativeNumber() {
		return this.getInteger();
	}

	public SubLObject inc() {
		return SubLNumberFactory.makeInteger(this.value + (this.value == Integer.MAX_VALUE ? 1L : 1));
	}

	public int integerDivide(int num) {
		int remainder = this.value % num;
		int quotient = (this.value - remainder) / num;
		return quotient;
	}

	public SubLInteger integerDivide(SubLInteger num) {
		int numTyped = num.intValue();
		return SubLNumberFactory.makeInteger(this.integerDivide(numTyped));
	}

	public int intValue() {
		return this.value;
	}

	public boolean isEven() {
		return this.value % 2 == 0;
	}

	public boolean isNegative() {
		return this.value < 0;
	}

	public boolean isOdd() {
		return this.value % 2 != 0;
	}

	public boolean isPositive() { // SubLNumber
		return this.value > 0;
	}

	public boolean isZero() {
		return this.value == 0;
	}

	public long longValue() {
		return this.value;
	}

	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > SubLNumber.FOUR_BYTE_INTEGER)
			return num.mult(this);
		return SubLNumberFactory.makeInteger((long) this.value * (long) num.intValue());
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toString() {
		return "" + this.value;
	}

}
