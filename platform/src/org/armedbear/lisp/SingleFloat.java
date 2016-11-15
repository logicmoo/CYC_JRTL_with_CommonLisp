/*
 * SingleFloat.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: SingleFloat.java 12535 2010-03-14 19:17:37Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class SingleFloat extends LispFloat {
	public static SingleFloat ZERO = new SingleFloat(0);
	public static SingleFloat MINUS_ZERO = new SingleFloat(-0.0f);
	public static SingleFloat ONE = new SingleFloat(1);
	public static SingleFloat MINUS_ONE = new SingleFloat(-1);

	public static SingleFloat SINGLE_FLOAT_POSITIVE_INFINITY = LispObjectFactory.makeSingle(Float.POSITIVE_INFINITY);

	public static SingleFloat SINGLE_FLOAT_NEGATIVE_INFINITY = LispObjectFactory.makeSingle(Float.NEGATIVE_INFINITY);

	static {
		LispSymbols.SINGLE_FLOAT_POSITIVE_INFINITY.initializeConstant(SingleFloat.SINGLE_FLOAT_POSITIVE_INFINITY);
		LispSymbols.SINGLE_FLOAT_NEGATIVE_INFINITY.initializeConstant(SingleFloat.SINGLE_FLOAT_NEGATIVE_INFINITY);
	}

	public static SingleFloat coerceToFloat(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeSingle(((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return (SingleFloat) obj;
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeSingle((float) ((DoubleFloat) obj).value);
		if (obj instanceof Bignum)
			return LispObjectFactory.makeSingle(((Bignum) obj).floatValue());
		if (obj instanceof Ratio)
			return LispObjectFactory.makeSingle(((Ratio) obj).floatValue());
		Lisp.error(new TypeError("The value " + obj.writeToString() + " cannot be converted to type SINGLE-FLOAT."));
		// Not reached.
		return null;
	}

	public static SingleFloat makeFloat(float f) {
		if (f == 0) {
			int bits = Float.floatToRawIntBits(f);
			if (bits < 0)
				return SingleFloat.MINUS_ZERO;
			else
				return SingleFloat.ZERO;
		} else if (f == 1)
			return SingleFloat.ONE;
		else if (f == -1)
			return SingleFloat.MINUS_ONE;
		else
			return new SingleFloat(f);
	}

	public float value;

	public SingleFloat(float value) {
		this.value = value;
	}

	public SubLObject ABS() {
		if (this.value > 0)
			return this;
		if (this.value == 0) // 0.0 or -0.0
			return SingleFloat.ZERO;
		return LispObjectFactory.makeSingle(-this.value);
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeSingle(this.value + ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value + ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value + ((DoubleFloat) obj).value);
		if (obj instanceof Bignum)
			return LispObjectFactory.makeSingle(this.value + ((Bignum) obj).floatValue());
		if (obj instanceof Ratio)
			return LispObjectFactory.makeSingle(this.value + ((Ratio) obj).floatValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.add(c.getRealPart()), c.getImaginaryPart());
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public SubLObject classOf() {
		return BuiltInClass.SINGLE_FLOAT;
	}

	public SubLObject dec() {
		return LispObjectFactory.makeSingle(this.value - 1);
	}

	public SubLObject divideBy(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeSingle(this.value / ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value / ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value / ((DoubleFloat) obj).value);
		if (obj instanceof Bignum)
			return LispObjectFactory.makeSingle(this.value / ((Bignum) obj).floatValue());
		if (obj instanceof Ratio)
			return LispObjectFactory.makeSingle(this.value / ((Ratio) obj).floatValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			SubLObject re = c.getRealPart();
			SubLObject im = c.getImaginaryPart();
			SubLObject denom = re.mult(re).add(im.mult(im));
			SubLObject resX = this.mult(re).divideBy(denom);
			SubLObject resY = this.mult(Fixnum.MINUS_ONE).mult(im).divideBy(denom);
			return LispObjectFactory.makeComplex(resX, resY);
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public double doubleValue() {
		return this.value;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof SingleFloat) {
			if (this.value == 0) {
				// "If an implementation supports positive and negative zeros
				// as distinct values, then (EQL 0.0 -0.0) returns false."
				float f = ((SingleFloat) obj).value;
				int bits = Float.floatToRawIntBits(f);
				return bits == Float.floatToRawIntBits(this.value);
			}
			if (this.value == ((SingleFloat) obj).value)
				return true;
		}
		return false;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof SingleFloat) {
			if (this.value == 0) {
				// same as EQL
				float f = ((SingleFloat) obj).value;
				int bits = Float.floatToRawIntBits(f);
				return bits == Float.floatToRawIntBits(this.value);
			}
			if (this.value == ((SingleFloat) obj).value)
				return true;
		}
		return false;
	}

	public boolean equalp(int n) {
		// "If two numbers are the same under =."
		return this.value == n;
	}

	public boolean equalp(SubLObject obj) {
		if (obj instanceof SingleFloat)
			return this.value == ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value == ((DoubleFloat) obj).value;
		if (obj instanceof Fixnum)
			return this.value == ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.value == ((Bignum) obj).floatValue();
		if (obj instanceof Ratio)
			return this.value == ((Ratio) obj).floatValue();
		return false;
	}

	public float floatValue() {
		return this.value;
	}

	public int hashCodeLisp() {
		return Float.floatToIntBits(this.value);
	}

	public SubLObject inc() {
		return LispObjectFactory.makeSingle(this.value + 1);
	}

	// public static double getValue(LispObject obj)
	// {
	// if (obj instanceof SingleFloat)
	// return ((SingleFloat)obj).value;
	// type_error(obj, LispSymbols.FLOAT);
	// // not reached
	// return 0.0D;
	// }
	//
	// public float getValue()
	// {
	// return value;
	// }

	public boolean isDouble() {
		return true;
	}

	public boolean isNegative() {
		return this.value < 0;
	}

	public boolean isNotEqualTo(SubLObject obj) {
		return !this.numE(obj);
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isPositive() {
		return this.value > 0;
	}

	public boolean isZero() {
		return this.value == 0;
	}

	public Object javaInstance() {
		return Float.valueOf(this.value);
	}

	public Object javaInstance(Class c) {
		String cn = c.getName();
		if (cn.equals("java.lang.Float") || cn.equals("float"))
			return Float.valueOf(this.value);
		return this.javaInstance();
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeSingle(this.value * ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value * ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value * ((DoubleFloat) obj).value);
		if (obj instanceof Bignum)
			return LispObjectFactory.makeSingle(this.value * ((Bignum) obj).floatValue());
		if (obj instanceof Ratio)
			return LispObjectFactory.makeSingle(this.value * ((Ratio) obj).floatValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.mult(c.getRealPart()), this.mult(c.getImaginaryPart()));
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public SubLObject negate() {
		if (this.value == 0) {
			int bits = Float.floatToRawIntBits(this.value);
			return bits < 0 ? SingleFloat.ZERO : SingleFloat.MINUS_ZERO;
		}
		return LispObjectFactory.makeSingle(-this.value);
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.rational().numE(obj);
		if (obj instanceof SingleFloat)
			return this.value == ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value == ((DoubleFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numE(obj);
		if (obj instanceof Ratio)
			return this.rational().numE(obj);
		if (obj instanceof Complex)
			return obj.numE(this);
		Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
		// Not reached.
		return false;
	}

	public boolean numG(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.rational().numG(obj);
		if (obj instanceof SingleFloat)
			return this.value > ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value > ((DoubleFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numG(obj);
		if (obj instanceof Ratio)
			return this.rational().numG(obj);
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numGE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.rational().numGE(obj);
		if (obj instanceof SingleFloat)
			return this.value >= ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value >= ((DoubleFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numGE(obj);
		if (obj instanceof Ratio)
			return this.rational().numGE(obj);
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numL(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.rational().numL(obj);
		if (obj instanceof SingleFloat)
			return this.value < ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value < ((DoubleFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numL(obj);
		if (obj instanceof Ratio)
			return this.rational().numL(obj);
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numLE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.rational().numLE(obj);
		if (obj instanceof SingleFloat)
			return this.value <= ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value <= ((DoubleFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numLE(obj);
		if (obj instanceof Ratio)
			return this.rational().numLE(obj);
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public int psxhash() {
		if (this.value % 1 == 0)
			return (int) this.value & 0x7fffffff;
		else
			return this.hashCodeLisp() & 0x7fffffff;
	}

	public SubLObject rational() {
		int bits = Float.floatToRawIntBits(this.value);
		int sign = bits >> 31 == 0 ? 1 : -1;
		int storedExponent = bits >> 23 & 0xff;
		long mantissa;
		if (storedExponent == 0)
			mantissa = (bits & 0x7fffff) << 1;
		else
			mantissa = bits & 0x7fffff | 0x800000;
		if (mantissa == 0)
			return Fixnum.ZERO;
		if (sign < 0)
			mantissa = -mantissa;
		// Subtract bias.
		int exponent = storedExponent - 127;
		BigInteger numerator, denominator;
		if (exponent < 0) {
			numerator = BigInteger.valueOf(mantissa);
			denominator = BigInteger.valueOf(1).shiftLeft(23 - exponent);
		} else {
			numerator = BigInteger.valueOf(mantissa).shiftLeft(exponent);
			denominator = BigInteger.valueOf(0x800000); // (ash 1 23)
		}
		return Lisp.number(numerator, denominator);
	}

	public boolean realp() {
		return true;
	}

	public SubLObject sub(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeSingle(this.value - ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value - ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value - ((DoubleFloat) obj).value);
		if (obj instanceof Bignum)
			return LispObjectFactory.makeSingle(this.value - ((Bignum) obj).floatValue());
		if (obj instanceof Ratio)
			return LispObjectFactory.makeSingle(this.value - ((Ratio) obj).floatValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.sub(c.getRealPart()), SingleFloat.ZERO.sub(c.getImaginaryPart()));
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public SubLObject truncate(SubLObject obj) {
		// "When rationals and floats are combined by a numerical function,
		// the rational is first converted to a float of the same format."
		// 12.1.4.1
		if (obj instanceof Fixnum)
			return this.truncate(LispObjectFactory.makeSingle(((Fixnum) obj).value));
		if (obj instanceof Bignum)
			return this.truncate(LispObjectFactory.makeSingle(((Bignum) obj).floatValue()));
		if (obj instanceof Ratio)
			return this.truncate(LispObjectFactory.makeSingle(((Ratio) obj).floatValue()));
		if (obj instanceof SingleFloat) {
			LispThread thread = LispThread.currentThread();
			float divisor = ((SingleFloat) obj).value;
			float quotient = this.value / divisor;
			if (this.value != 0)
				MathFunctions.OverUnderFlowCheck(quotient);
			if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
				int q = (int) quotient;
				return thread.setValues(LispObjectFactory.makeInteger(q),
						LispObjectFactory.makeSingle(this.value - q * divisor));
			}
			// We need to convert the quotient to a bignum.
			int bits = Float.floatToRawIntBits(quotient);
			int s = bits >> 31 == 0 ? 1 : -1;
			int e = bits >> 23 & 0xff;
			long m;
			if (e == 0)
				m = (bits & 0x7fffff) << 1;
			else
				m = bits & 0x7fffff | 0x800000;
			SubLObject significand = Lisp.number(m);
			Fixnum exponent = LispObjectFactory.makeInteger(e - 150);
			Fixnum sign = LispObjectFactory.makeInteger(s);
			SubLObject result = significand;
			result = result.mult(MathFunctions.EXPT.execute(Fixnum.TWO, exponent));
			result = result.mult(sign);
			// Calculate remainder.
			SubLObject product = result.mult(obj);
			SubLObject remainder = this.sub(product);
			return thread.setValues(result, remainder);
		}
		if (obj instanceof DoubleFloat) {
			LispThread thread = LispThread.currentThread();
			double divisor = ((DoubleFloat) obj).value;
			double quotient = this.value / divisor;
			if (this.value != 0)
				MathFunctions.OverUnderFlowCheck(quotient);
			if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
				int q = (int) quotient;
				return thread.setValues(LispObjectFactory.makeInteger(q),
						LispObjectFactory.makeDouble(this.value - q * divisor));
			}
			// We need to convert the quotient to a bignum.
			long bits = Double.doubleToRawLongBits(quotient);
			int s = bits >> 63 == 0 ? 1 : -1;
			int e = (int) (bits >> 52 & 0x7ffL);
			long m;
			if (e == 0)
				m = (bits & 0xfffffffffffffL) << 1;
			else
				m = bits & 0xfffffffffffffL | 0x10000000000000L;
			SubLObject significand = Lisp.number(m);
			Fixnum exponent = LispObjectFactory.makeInteger(e - 1075);
			Fixnum sign = LispObjectFactory.makeInteger(s);
			SubLObject result = significand;
			result = result.mult(MathFunctions.EXPT.execute(Fixnum.TWO, exponent));
			result = result.mult(sign);
			// Calculate remainder.
			SubLObject product = result.mult(obj);
			SubLObject remainder = this.sub(product);
			return thread.setValues(result, remainder);
		}
		return Lisp.error(new TypeError(obj, LispSymbols.REAL));
	}

	public SubLObject typeOf() {
		return LispSymbols.SINGLE_FLOAT;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.FLOAT)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.REAL)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.NUMBER)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.SINGLE_FLOAT)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.SHORT_FLOAT)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.FLOAT)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.SINGLE_FLOAT)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		if (this.value == Float.POSITIVE_INFINITY) {
			StringBuffer sb = new StringBuffer("#.");
			sb.append(LispSymbols.SINGLE_FLOAT_POSITIVE_INFINITY.writeToString());
			return sb.toString();
		}
		if (this.value == Float.NEGATIVE_INFINITY) {
			StringBuffer sb = new StringBuffer("#.");
			sb.append(LispSymbols.SINGLE_FLOAT_NEGATIVE_INFINITY.writeToString());
			return sb.toString();
		}

		LispThread thread = LispThread.currentThread();
		boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL;

		if (/* value != value || */ Float.isNaN(this.value))
			if (printReadably)
				return "#.(progn \"Comment: create a NaN.\" (/ 0.0s0 0.0s0))";
			else
				return "#<SINGLE-FLOAT NaN>";
		String s1 = String.valueOf(this.value);
		if (printReadably || !Lisp.memq(LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue(thread),
				Lisp.list(LispSymbols.SINGLE_FLOAT, LispSymbols.SHORT_FLOAT))) {
			if (s1.indexOf('E') >= 0)
				return s1.replace('E', 'f');
			else
				return s1.concat("f0");
		} else
			return s1;
	}
}
