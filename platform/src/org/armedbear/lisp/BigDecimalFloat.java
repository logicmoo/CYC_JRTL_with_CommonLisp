/*
 * DoubleFloat.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: DoubleFloat.java 12431 2010-02-08 08:05:15Z mevenson $
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

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class BigDecimalFloat extends LispFloat {
	public static BigDecimalFloat ZERO = new BigDecimalFloat(0);
	public static BigDecimalFloat MINUS_ZERO = new BigDecimalFloat(-0.0d);
	public static BigDecimalFloat ONE = new BigDecimalFloat(1);
	public static BigDecimalFloat MINUS_ONE = new BigDecimalFloat(-1);

	public static BigDecimalFloat DOUBLE_FLOAT_POSITIVE_INFINITY = BigDecimalFloat.makeDouble(Double.POSITIVE_INFINITY);

	public static BigDecimalFloat DOUBLE_FLOAT_NEGATIVE_INFINITY = BigDecimalFloat.makeDouble(Double.NEGATIVE_INFINITY);

	static {
		LispSymbols.DOUBLE_FLOAT_POSITIVE_INFINITY.initializeConstant(BigDecimalFloat.DOUBLE_FLOAT_POSITIVE_INFINITY);
		LispSymbols.DOUBLE_FLOAT_NEGATIVE_INFINITY.initializeConstant(BigDecimalFloat.DOUBLE_FLOAT_NEGATIVE_INFINITY);
	}

	@DeclaredLispSymbol(name = "coerce-to-double-float", pkg = "SYSTEM", export = false)
	public static BigDecimalFloat coerceToFloat(SubLObject obj) {
		if (obj instanceof BigDecimalFloat)
			return (BigDecimalFloat) obj;
		if (obj instanceof Fixnum)
			return BigDecimalFloat.makeDouble(((Fixnum) obj).value);
		if (obj instanceof Bignum)
			return BigDecimalFloat.makeDouble(((Bignum) obj).doubleValue());
		if (obj instanceof SingleFloat)
			return BigDecimalFloat.makeDouble(((SingleFloat) obj).value);
		if (obj instanceof Ratio)
			return BigDecimalFloat.makeDouble(((Ratio) obj).doubleValue());
		Lisp.error(new TypeError("The value " + obj.writeToString() + " cannot be converted to type DOUBLE-FLOAT."));
		// Not reached.
		return null;
	}

	public static BigDecimalFloat makeDouble(double d) {
		if (d == 0) {
			long bits = Double.doubleToRawLongBits(d);
			if (bits < 0)
				return BigDecimalFloat.MINUS_ZERO;
			return BigDecimalFloat.ZERO;
		} else if (d == 1)
			return BigDecimalFloat.ONE;
		else if (d == -1)
			return BigDecimalFloat.MINUS_ONE;
		else
			return new BigDecimalFloat(d);
	}

	public double value;

	public BigDecimalFloat(double value) {
		this.value = value;
	}

	public SubLObject ABS() {
		if (this.value > 0)
			return this;
		if (this.value == 0) // 0.0 or -0.0
			return BigDecimalFloat.ZERO;
		return BigDecimalFloat.makeDouble(-this.value);
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Fixnum)
			return BigDecimalFloat.makeDouble(this.value + ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return BigDecimalFloat.makeDouble(this.value + ((SingleFloat) obj).value);
		if (obj instanceof BigDecimalFloat)
			return BigDecimalFloat.makeDouble(this.value + ((BigDecimalFloat) obj).value);
		if (obj instanceof Bignum)
			return BigDecimalFloat.makeDouble(this.value + ((Bignum) obj).doubleValue());
		if (obj instanceof Ratio)
			return BigDecimalFloat.makeDouble(this.value + ((Ratio) obj).doubleValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.add(c.getRealPart()), c.getImaginaryPart());
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject classOf() {
		return BuiltInClass.DOUBLE_FLOAT;
	}

	public SubLObject dec() {
		return BigDecimalFloat.makeDouble(this.value - 1);
	}

	public SubLObject divideBy(SubLObject obj) {
		if (obj instanceof Fixnum)
			return BigDecimalFloat.makeDouble(this.value / ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return BigDecimalFloat.makeDouble(this.value / ((SingleFloat) obj).value);
		if (obj instanceof BigDecimalFloat)
			return BigDecimalFloat.makeDouble(this.value / ((BigDecimalFloat) obj).value);
		if (obj instanceof Bignum)
			return BigDecimalFloat.makeDouble(this.value / ((Bignum) obj).doubleValue());
		if (obj instanceof Ratio)
			return BigDecimalFloat.makeDouble(this.value / ((Ratio) obj).doubleValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			SubLObject re = c.getRealPart();
			SubLObject im = c.getImaginaryPart();
			SubLObject denom = re.mult(re).add(im.mult(im));
			SubLObject resX = this.mult(re).divideBy(denom);
			SubLObject resY = this.mult(Fixnum.MINUS_ONE).mult(im).divideBy(denom);
			return LispObjectFactory.makeComplex(resX, resY);
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public double doubleValue() {
		return this.value;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof BigDecimalFloat) {
			if (this.value == 0) {
				// "If an implementation supports positive and negative zeros
				// as distinct values, then (EQL 0.0 -0.0) returns false."
				double d = ((BigDecimalFloat) obj).value;
				long bits = Double.doubleToRawLongBits(d);
				return bits == Double.doubleToRawLongBits(this.value);
			}
			if (this.value == ((BigDecimalFloat) obj).value)
				return true;
		}
		return false;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof BigDecimalFloat) {
			if (this.value == 0) {
				// same as EQL
				double d = ((BigDecimalFloat) obj).value;
				long bits = Double.doubleToRawLongBits(d);
				return bits == Double.doubleToRawLongBits(this.value);
			}
			if (this.value == ((BigDecimalFloat) obj).value)
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
		if (obj instanceof BigDecimalFloat)
			return this.value == ((BigDecimalFloat) obj).value;
		if (obj instanceof Fixnum)
			return this.value == ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.value == ((Bignum) obj).doubleValue();
		if (obj instanceof Ratio)
			return this.value == ((Ratio) obj).doubleValue();
		return false;
	}

	public int hashCodeLisp() {
		long bits = Double.doubleToLongBits(this.value);
		return (int) (bits ^ bits >>> 32);
	}

	public SubLObject inc() {
		return BigDecimalFloat.makeDouble(this.value + 1);
	}

	public boolean isDouble() {
		return true;
	}

	// public static double getValue(LispObject obj)
	// {
	// if (obj instanceof DoubleFloat)
	// return ((DoubleFloat)obj).value;
	// type_error(obj, LispSymbols.FLOAT);
	// // Not reached.
	// return 0;
	// }

	// public double getValue()
	// {
	// return value;
	// }

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
		return BigDecimal.valueOf(this.value);
	}

	public Object javaInstance(Class c) {
		String cn = c.getName();
		if (cn.equals("java.lang.Float") || cn.equals("float"))
			return Float.valueOf((float) this.value);
		if (cn.equals("java.lang.Double") || cn.equals("double"))
			return Float.valueOf((float) this.value);
		return this.javaInstance();
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Fixnum)
			return BigDecimalFloat.makeDouble(this.value * ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return BigDecimalFloat.makeDouble(this.value * ((SingleFloat) obj).value);
		if (obj instanceof BigDecimalFloat)
			return BigDecimalFloat.makeDouble(this.value * ((BigDecimalFloat) obj).value);
		if (obj instanceof Bignum)
			return BigDecimalFloat.makeDouble(this.value * ((Bignum) obj).doubleValue());
		if (obj instanceof Ratio)
			return BigDecimalFloat.makeDouble(this.value * ((Ratio) obj).doubleValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.mult(c.getRealPart()), this.mult(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject negate() {
		if (this.value == 0) {
			long bits = Double.doubleToRawLongBits(this.value);
			return bits < 0 ? BigDecimalFloat.ZERO : BigDecimalFloat.MINUS_ZERO;
		}
		return BigDecimalFloat.makeDouble(-this.value);
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value == ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value == ((SingleFloat) obj).value;
		if (obj instanceof BigDecimalFloat)
			return this.value == ((BigDecimalFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numE(obj);
		if (obj instanceof Ratio)
			return this.rational().numE(obj);
		if (obj instanceof Complex)
			return obj.numE(this);
		Lisp.type_error(obj, LispSymbols.NUMBER);
		// Not reached.
		return false;
	}

	public boolean numG(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value > ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value > ((SingleFloat) obj).value;
		if (obj instanceof BigDecimalFloat)
			return this.value > ((BigDecimalFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numG(obj);
		if (obj instanceof Ratio)
			return this.rational().numG(obj);
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numGE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value >= ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value >= ((SingleFloat) obj).value;
		if (obj instanceof BigDecimalFloat)
			return this.value >= ((BigDecimalFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numGE(obj);
		if (obj instanceof Ratio)
			return this.rational().numGE(obj);
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numL(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value < ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value < ((SingleFloat) obj).value;
		if (obj instanceof BigDecimalFloat)
			return this.value < ((BigDecimalFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numL(obj);
		if (obj instanceof Ratio)
			return this.rational().numL(obj);
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numLE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value <= ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value <= ((SingleFloat) obj).value;
		if (obj instanceof BigDecimalFloat)
			return this.value <= ((BigDecimalFloat) obj).value;
		if (obj instanceof Bignum)
			return this.rational().numLE(obj);
		if (obj instanceof Ratio)
			return this.rational().numLE(obj);
		Lisp.type_error(obj, LispSymbols.REAL);
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
		long bits = Double.doubleToRawLongBits(this.value);
		int sign = bits >> 63 == 0 ? 1 : -1;
		int storedExponent = (int) (bits >> 52 & 0x7ffL);
		long mantissa;
		if (storedExponent == 0)
			mantissa = (bits & 0xfffffffffffffL) << 1;
		else
			mantissa = bits & 0xfffffffffffffL | 0x10000000000000L;
		if (mantissa == 0)
			return Fixnum.ZERO;
		if (sign < 0)
			mantissa = -mantissa;
		// Subtract bias.
		int exponent = storedExponent - 1023;
		BigInteger numerator, denominator;
		if (exponent < 0) {
			numerator = BigInteger.valueOf(mantissa);
			denominator = BigInteger.valueOf(1).shiftLeft(52 - exponent);
		} else {
			numerator = BigInteger.valueOf(mantissa).shiftLeft(exponent);
			denominator = BigInteger.valueOf(0x10000000000000L); // (ash 1 52)
		}
		return Lisp.number(numerator, denominator);
	}

	public boolean realp() {
		return true;
	}

	public SubLObject sub(SubLObject obj) {
		if (obj instanceof Fixnum)
			return BigDecimalFloat.makeDouble(this.value - ((Fixnum) obj).value);
		if (obj instanceof SingleFloat)
			return BigDecimalFloat.makeDouble(this.value - ((SingleFloat) obj).value);
		if (obj instanceof BigDecimalFloat)
			return BigDecimalFloat.makeDouble(this.value - ((BigDecimalFloat) obj).value);
		if (obj instanceof Bignum)
			return BigDecimalFloat.makeDouble(this.value - ((Bignum) obj).doubleValue());
		if (obj instanceof Ratio)
			return BigDecimalFloat.makeDouble(this.value - ((Ratio) obj).doubleValue());
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.sub(c.getRealPart()),
					BigDecimalFloat.ZERO.sub(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject truncate(SubLObject obj) {
		// "When rationals and floats are combined by a numerical function,
		// the rational is first converted to a float of the same format."
		// 12.1.4.1
		if (obj instanceof Fixnum)
			return this.truncate(BigDecimalFloat.makeDouble(((Fixnum) obj).value));
		if (obj instanceof Bignum)
			return this.truncate(BigDecimalFloat.makeDouble(((Bignum) obj).doubleValue()));
		if (obj instanceof Ratio)
			return this.truncate(BigDecimalFloat.makeDouble(((Ratio) obj).doubleValue()));
		if (obj instanceof SingleFloat) {
			LispThread thread = LispThread.currentThread();
			double divisor = ((SingleFloat) obj).value;
			double quotient = this.value / divisor;
			if (this.value != 0)
				MathFunctions.OverUnderFlowCheck(quotient);
			if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
				int q = (int) quotient;
				return thread.setValues(LispObjectFactory.makeInteger(q),
						BigDecimalFloat.makeDouble(this.value - q * divisor));
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
		if (obj instanceof BigDecimalFloat) {
			// Debug.trace("value = " + value);
			LispThread thread = LispThread.currentThread();
			double divisor = ((BigDecimalFloat) obj).value;
			// Debug.trace("divisor = " + divisor);
			double quotient = this.value / divisor;
			if (this.value != 0)
				MathFunctions.OverUnderFlowCheck(quotient);
			// Debug.trace("quotient = " + quotient);
			if (quotient >= Integer.MIN_VALUE && quotient <= Integer.MAX_VALUE) {
				int q = (int) quotient;
				return thread.setValues(LispObjectFactory.makeInteger(q),
						BigDecimalFloat.makeDouble(this.value - q * divisor));
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
			// Debug.trace("significand = " + significand.writeToString());
			Fixnum exponent = LispObjectFactory.makeInteger(e - 1075);
			// Debug.trace("exponent = " + exponent.writeToString());
			Fixnum sign = LispObjectFactory.makeInteger(s);
			// Debug.trace("sign = " + sign.writeToString());
			SubLObject result = significand;
			// Debug.trace("result = " + result.writeToString());
			result = result.mult(MathFunctions.EXPT.execute(Fixnum.TWO, exponent));
			// Debug.trace("result = " + result.writeToString());

			result = result.truncate(Fixnum.ONE);
			SubLObject remainder = BigDecimalFloat.coerceToFloat(thread._values[1]);

			result = result.mult(sign);
			// Debug.trace("result = " + result.writeToString());
			// // Calculate remainder.
			// LispObject product = result.multiplyBy(obj);
			// Debug.trace("product = " + product.writeToString());
			// LispObject remainder = subtract(product);
			return thread.setValues(result, remainder);
		}
		return Lisp.type_error(obj, LispSymbols.REAL);
	}

	public SubLObject typeOf() {
		return LispSymbols.DOUBLE_FLOAT;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.FLOAT)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.REAL)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.NUMBER)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.DOUBLE_FLOAT)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.LONG_FLOAT)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.FLOAT)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.DOUBLE_FLOAT)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		if (this.value == Double.POSITIVE_INFINITY) {
			StringBuilder sb = new StringBuilder("#.");
			sb.append(LispSymbols.DOUBLE_FLOAT_POSITIVE_INFINITY.writeToString());
			return sb.toString();
		}
		if (this.value == Double.NEGATIVE_INFINITY) {
			StringBuilder sb = new StringBuilder("#.");
			sb.append(LispSymbols.DOUBLE_FLOAT_NEGATIVE_INFINITY.writeToString());
			return sb.toString();
		}

		LispThread thread = LispThread.currentThread();
		boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL;

		if (/* value != value */ Double.isNaN(this.value))
			if (printReadably)
				return "#.(progn \"Comment: create a NaN.\" (/ 0.0d0 0.0d0))";
			else
				return "#<DOUBLE-FLOAT NaN>";
		String s1 = String.valueOf(this.value);
		if (printReadably || !Lisp.memq(LispSymbols.READ_DEFAULT_FLOAT_FORMAT.symbolValue(thread),
				Lisp.list(LispSymbols.DOUBLE_FLOAT, LispSymbols.LONG_FLOAT))) {
			if (s1.indexOf('E') >= 0)
				return s1.replace('E', 'd');
			else
				return s1.concat("d0");
		} else
			return s1;
	}
}
