/*
 * Ratio.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Ratio.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
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

public class Ratio extends LispFloat {
	private BigInteger numerator;
	private BigInteger denominator;

	public Ratio(BigInteger numerator, BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public SubLObject ABS() {
		if (this.numerator.signum() > 0 && this.denominator.signum() > 0)
			return this;
		if (this.numerator.signum() < 0 && this.denominator.signum() < 0)
			return this;
		return new Ratio(this.numerator.negate(), this.denominator);
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n = this.numerator.add(BigInteger.valueOf(((Fixnum) obj).value).multiply(this.denominator));
			return Lisp.number(n, this.denominator);
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.numerator.add(n.multiply(this.denominator)), this.denominator);
		}
		if (obj instanceof Ratio) {
			BigInteger n = ((Ratio) obj).numerator;
			BigInteger d = ((Ratio) obj).denominator;
			if (this.denominator.equals(d))
				return Lisp.number(this.numerator.add(n), this.denominator);
			BigInteger common = this.denominator.multiply(d);
			return Lisp.number(this.numerator.multiply(d).add(n.multiply(this.denominator)), common);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() + ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() + ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.add(c.getRealPart()), c.getImaginaryPart());
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public SubLObject classOf() {
		return BuiltInClass.RATIO;
	}

	public SubLObject dec() {
		return new Ratio(this.numerator.subtract(this.denominator), this.denominator);
	}

	public BigInteger denominator() {
		return this.denominator;
	}

	public SubLObject DENOMINATOR() {
		return Lisp.number(this.denominator);
	}

	public SubLObject divideBy(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n = ((Fixnum) obj).bigIntegerValue();
			return Lisp.number(this.numerator, this.denominator.multiply(n));
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.numerator, this.denominator.multiply(n));
		}
		if (obj instanceof Ratio) {
			BigInteger n = ((Ratio) obj).numerator;
			BigInteger d = ((Ratio) obj).denominator;
			return Lisp.number(this.numerator.multiply(d), this.denominator.multiply(n));
		}
		if (obj instanceof SingleFloat) {
			if (obj.isZero())
				return Lisp.error(new DivisionByZero());
			return LispObjectFactory.makeSingle(this.floatValue() / ((SingleFloat) obj).value);
		}
		if (obj instanceof DoubleFloat) {
			if (obj.isZero())
				return Lisp.error(new DivisionByZero());
			return LispObjectFactory.makeDouble(this.doubleValue() / ((DoubleFloat) obj).value);
		}
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			// numerator
			SubLObject realPart = this.mult(c.getRealPart());
			SubLObject imagPart = Fixnum.ZERO.sub(this).mult(c.getImaginaryPart());
			// denominator
			SubLObject d = c.getRealPart().mult(c.getRealPart());
			d = d.add(c.getImaginaryPart().mult(c.getImaginaryPart()));
			return LispObjectFactory.makeComplex(realPart.divideBy(d), imagPart.divideBy(d));
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public double doubleValue() {
		double result = this.numerator.doubleValue() / this.denominator.doubleValue();
		if (result != 0 && !Double.isNaN(result) && !Double.isInfinite(result))
			return result;
		boolean negative = this.numerator.signum() < 0;
		BigInteger num = negative ? this.numerator.negate() : this.numerator;
		BigInteger den = this.denominator;
		int numLen = num.bitLength();
		int denLen = den.bitLength();
		int length = Math.min(numLen, denLen);
		if (length <= 1)
			return result;
		BigInteger n = num;
		BigInteger d = den;
		int digits = 54;
		if (length > digits) {
			n = n.shiftRight(length - digits);
			d = d.shiftRight(length - digits);
			length -= digits;
		} else {
			n = n.shiftRight(1);
			d = d.shiftRight(1);
			--length;
		}
		for (int i = 0; i < length; i++) {
			result = n.doubleValue() / d.doubleValue();
			if (result != 0 && !Double.isNaN(result) && !Double.isInfinite(result))
				break;
			n = n.shiftRight(1);
			d = d.shiftRight(1);
		}
		return negative ? -result : result;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Ratio)
			return this.numerator.equals(((Ratio) obj).numerator) && this.denominator.equals(((Ratio) obj).denominator);
		return false;
	}

	public boolean equal(SubLObject obj) {
		return this.eql(obj);
	}

	public boolean equalp(SubLObject obj) {
		if (obj instanceof Ratio)
			return this.numerator.equals(((Ratio) obj).numerator) && this.denominator.equals(((Ratio) obj).denominator);
		if (obj instanceof SingleFloat)
			return this.floatValue() == ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.doubleValue() == ((DoubleFloat) obj).value;
		return false;
	}

	public float floatValue() {
		return (float) this.doubleValue();
	}

	public int hashCodeLisp() {
		return this.numerator.hashCode() ^ this.denominator.hashCode();
	}

	public SubLObject inc() {
		return new Ratio(this.numerator.add(this.denominator), this.denominator);
	}

	public boolean isNegative() {
		return this.numerator.signum() != this.denominator.signum();
	}

	public boolean isNotEqualTo(SubLObject obj) {
		return !this.numE(obj);
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isPositive() {
		return this.numerator.signum() == this.denominator.signum();
	}

	public boolean isZero() {
		return false;
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n = ((Fixnum) obj).bigIntegerValue();
			return Lisp.number(this.numerator.multiply(n), this.denominator);
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.numerator.multiply(n), this.denominator);
		}
		if (obj instanceof Ratio) {
			BigInteger n = ((Ratio) obj).numerator;
			BigInteger d = ((Ratio) obj).denominator;
			return Lisp.number(this.numerator.multiply(n), this.denominator.multiply(d));
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() * ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() * ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.mult(c.getRealPart()), this.mult(c.getImaginaryPart()));
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Ratio)
			return this.numerator.equals(((Ratio) obj).numerator) && this.denominator.equals(((Ratio) obj).denominator);
		if (obj instanceof SingleFloat)
			return this.numE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numE(((DoubleFloat) obj).rational());
		if (obj.isNumber())
			return false;
		Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
		// Not reached.
		return false;
	}

	public BigInteger numerator() {
		return this.numerator;
	}

	public SubLObject NUMERATOR() {
		return Lisp.number(this.numerator);
	}

	public boolean numG(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n2 = ((Fixnum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n2) > 0;
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n) > 0;
		}
		if (obj instanceof Ratio) {
			BigInteger n1 = this.numerator.multiply(((Ratio) obj).denominator);
			BigInteger n2 = ((Ratio) obj).numerator.multiply(this.denominator);
			return n1.compareTo(n2) > 0;
		}
		if (obj instanceof SingleFloat)
			return this.numG(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numG(((DoubleFloat) obj).rational());
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numGE(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n2 = ((Fixnum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n2) >= 0;
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n) >= 0;
		}
		if (obj instanceof Ratio) {
			BigInteger n1 = this.numerator.multiply(((Ratio) obj).denominator);
			BigInteger n2 = ((Ratio) obj).numerator.multiply(this.denominator);
			return n1.compareTo(n2) >= 0;
		}
		if (obj instanceof SingleFloat)
			return this.numGE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numGE(((DoubleFloat) obj).rational());
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numL(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n2 = ((Fixnum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n2) < 0;
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n) < 0;
		}
		if (obj instanceof Ratio) {
			BigInteger n1 = this.numerator.multiply(((Ratio) obj).denominator);
			BigInteger n2 = ((Ratio) obj).numerator.multiply(this.denominator);
			return n1.compareTo(n2) < 0;
		}
		if (obj instanceof SingleFloat)
			return this.numL(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numL(((DoubleFloat) obj).rational());
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean numLE(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n2 = ((Fixnum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n2) <= 0;
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue().multiply(this.denominator);
			return this.numerator.compareTo(n) <= 0;
		}
		if (obj instanceof Ratio) {
			BigInteger n1 = this.numerator.multiply(((Ratio) obj).denominator);
			BigInteger n2 = ((Ratio) obj).numerator.multiply(this.denominator);
			return n1.compareTo(n2) <= 0;
		}
		if (obj instanceof SingleFloat)
			return this.numLE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numLE(((DoubleFloat) obj).rational());
		Lisp.error(new TypeError(obj, LispSymbols.REAL));
		// Not reached.
		return false;
	}

	public boolean rationalp() {
		return true;
	}

	public boolean realp() {
		return true;
	}

	public SubLObject sub(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n = this.numerator.subtract(BigInteger.valueOf(((Fixnum) obj).value).multiply(this.denominator));
			return Lisp.number(n, this.denominator);
		}
		if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.numerator.subtract(n.multiply(this.denominator)), this.denominator);
		}
		if (obj instanceof Ratio) {
			BigInteger n = ((Ratio) obj).numerator;
			BigInteger d = ((Ratio) obj).denominator;
			if (this.denominator.equals(d))
				return Lisp.number(this.numerator.subtract(n), this.denominator);
			BigInteger common = this.denominator.multiply(d);
			return Lisp.number(this.numerator.multiply(d).subtract(n.multiply(this.denominator)), common);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() - ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() - ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.sub(c.getRealPart()), Fixnum.ZERO.sub(c.getImaginaryPart()));
		}
		return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
	}

	public SubLObject truncate(SubLObject obj) {
		// "When rationals and floats are combined by a numerical function,
		// the rational is first converted to a float of the same format."
		// 12.1.4.1
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue()).truncate(obj);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue()).truncate(obj);
		BigInteger n, d;
		try {
			if (obj instanceof Fixnum) {
				n = ((Fixnum) obj).bigIntegerValue();
				d = BigInteger.ONE;
			} else if (obj instanceof Bignum) {
				n = ((Bignum) obj).bigIntegerValue();
				d = BigInteger.ONE;
			} else if (obj instanceof Ratio) {
				n = ((Ratio) obj).numerator();
				d = ((Ratio) obj).denominator();
			} else
				return Lisp.error(new TypeError(obj, LispSymbols.NUMBER));
			// Invert and multiply.
			BigInteger num = this.numerator.multiply(d);
			BigInteger den = this.denominator.multiply(n);
			BigInteger quotient = num.divide(den);
			// Multiply quotient by divisor.
			SubLObject product = Lisp.number(quotient.multiply(n), d);
			// Subtract to get remainder.
			SubLObject remainder = this.sub(product);
			return LispThread.currentThread().setValues(Lisp.number(quotient), remainder);
		} catch (ArithmeticException e) {
			if (obj.isZero())
				return Lisp.error(new DivisionByZero());
			return Lisp.error(new ArithmeticError(e.getMessage()));
		}
	}

	public SubLObject typeOf() {
		return LispSymbols.RATIO;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.RATIO)
			return Lisp.T;
		if (type == LispSymbols.RATIONAL)
			return Lisp.T;
		if (type == LispSymbols.REAL)
			return Lisp.T;
		if (type == LispSymbols.NUMBER)
			return Lisp.T;
		if (type == BuiltInClass.RATIO)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		int base = LispSymbols.PRINT_BASE.symbolValue(thread).intValue();
		StringBuffer sb = new StringBuffer(this.numerator.toString(base));
		sb.append('/');
		sb.append(this.denominator.toString(base));
		String s = sb.toString().toUpperCase();
		if (LispSymbols.PRINT_RADIX.symbolValue(thread) != Lisp.NIL) {
			sb.setLength(0);
			switch (base) {
			case 2:
				sb.append("#b");
				sb.append(s);
				break;
			case 8:
				sb.append("#o");
				sb.append(s);
				break;
			case 10:
				sb.append("#10r");
				sb.append(s);
				break;
			case 16:
				sb.append("#x");
				sb.append(s);
				break;
			default:
				sb.append('#');
				sb.append(String.valueOf(base));
				sb.append('r');
				sb.append(s);
				break;
			}
			s = sb.toString();
		}
		return s;
	}
}
