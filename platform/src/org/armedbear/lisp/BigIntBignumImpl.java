/*
 * Bignum.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Bignum.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class BigIntBignumImpl extends LispInteger implements Bignum {
	static BigInteger MOST_NEGATIVE_FIXNUM = BigInteger.valueOf(Integer.MIN_VALUE);

	static BigInteger MOST_POSITIVE_FIXNUM = BigInteger.valueOf(Integer.MAX_VALUE);
	static BigInteger MOST_POSITIVE_FIXNUM_PLUS_ONE = BigInteger.valueOf((long) Integer.MAX_VALUE + 1);

	public static BigInteger getValue(SubLObject obj) {

		if (obj instanceof Bignum)
			return ((Bignum) obj).bigIntegerValue();
		Lisp.type_error(obj, LispSymbols.BIGNUM);
		// Not reached.
		return null;
	}

	private BigInteger value;

	protected BigIntBignumImpl(BigInteger n) {
		this.value = n;
	}

	public SubLObject ABS() {
		if (this.bigIntegerValue().signum() >= 0)
			return this;
		return LispObjectFactory.makeInteger(this.bigIntegerValue().negate());
	}

	public SubLObject add(int n) {
		return Lisp.number(this.bigIntegerValue().add(BigInteger.valueOf(n)));
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Fixnum)
			return Lisp.number(this.bigIntegerValue().add(Fixnum.getBigInteger(obj)));
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue().add(((Bignum) obj).bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger numerator = ((Ratio) obj).numerator();
			BigInteger denominator = ((Ratio) obj).denominator();
			return Lisp.number(this.bigIntegerValue().multiply(denominator).add(numerator), denominator);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() + ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() + ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.add(c.getRealPart()), c.getImaginaryPart());
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject ash(SubLObject obj) {
		BigInteger n = this.bigIntegerValue();
		if (obj instanceof Fixnum) {
			int count = ((Fixnum) obj).value;
			if (count == 0)
				return this;
			// BigInteger.shiftLeft() succumbs to a stack overflow if count
			// is Integer.MIN_VALUE, so...
			if (count == Integer.MIN_VALUE)
				return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
			return Lisp.number(n.shiftLeft(count));
		}
		if (obj instanceof Bignum) {
			BigInteger count = ((Bignum) obj).bigIntegerValue();
			if (count.signum() > 0)
				return Lisp.error(new LispError("Can't represent result of left shift."));
			if (count.signum() < 0)
				return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
			Debug.bug(); // Shouldn't happen.
		}
		return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public BigInteger bigIntegerValue() {
		return this.value;
	}

	public SubLObject classOf() {
		return BuiltInClass.BIGNUM;
	}

	public SubLObject dec() {
		return Lisp.number(this.bigIntegerValue().subtract(BigInteger.ONE));
	}

	public SubLObject DENOMINATOR() {
		return Fixnum.ONE;
	}

	public SubLObject divideBy(SubLObject obj) {
		if (obj instanceof Fixnum)
			return Lisp.number(this.bigIntegerValue(), Fixnum.getBigInteger(obj));
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue(), ((Bignum) obj).bigIntegerValue());
		if (obj instanceof Ratio) {
			BigInteger d = ((Ratio) obj).denominator();
			return Lisp.number(d.multiply(this.bigIntegerValue()), ((Ratio) obj).numerator());
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() / ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() / ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			SubLObject realPart = c.getRealPart();
			SubLObject imagPart = c.getImaginaryPart();
			SubLObject denominator = realPart.mult(realPart).add(imagPart.mult(imagPart));
			return LispObjectFactory.makeComplex(this.mult(realPart).divideBy(denominator),
					Fixnum.ZERO.sub(this.mult(imagPart).divideBy(denominator)));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public double doubleValue() {
		double d = this.bigIntegerValue().doubleValue();
		if (Double.isInfinite(d))
			Lisp.error(new TypeError(
					"The value " + this.writeToString() + " is too large to be converted to a double float."));
		return d;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Bignum)
			if (this.bigIntegerValue().equals(((Bignum) obj).bigIntegerValue()))
				return true;
		return false;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Bignum)
			if (this.bigIntegerValue().equals(obj.bigIntegerValue()))
				return true;
		return false;
	}

	public boolean equalp(SubLObject obj) {
		if (obj instanceof Bignum)
			return this.bigIntegerValue().equals(((Bignum) obj).bigIntegerValue());
		if (obj instanceof SingleFloat)
			return this.floatValue() == ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.doubleValue() == ((DoubleFloat) obj).value;
		return false;
	}

	public float floatValue() {
		float f = this.bigIntegerValue().floatValue();
		if (Float.isInfinite(f))
			Lisp.error(new TypeError(
					"The value " + this.writeToString() + " is too large to be converted to a single float."));
		return f;
	}

	public int hashCodeLisp() {
		return this.bigIntegerValue().hashCode();
	}

	public SubLObject inc() {
		return Lisp.number(this.bigIntegerValue().add(BigInteger.ONE));
	}

	public int intValue() {
		return this.bigIntegerValue().intValue();
	}

	public boolean isEven() {
		return !this.bigIntegerValue().testBit(0);
	}

	public boolean isInteger() {
		return true;
	}

	public boolean isNegative() {
		return this.bigIntegerValue().signum() < 0;
	}

	public boolean isNotEqualTo(SubLObject obj) {
		if (obj instanceof Bignum)
			return !this.bigIntegerValue().equals(((Bignum) obj).bigIntegerValue());
		if (obj instanceof SingleFloat)
			return this.isNotEqualTo(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.isNotEqualTo(((DoubleFloat) obj).rational());
		if (obj.isNumber())
			return true;
		Lisp.type_error(obj, LispSymbols.NUMBER);
		// Not reached.
		return false;
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isOdd() {
		return this.bigIntegerValue().testBit(0);
	}

	public boolean isPositive() {
		return this.bigIntegerValue().signum() > 0;
	}

	public boolean isZero() {
		return false;
	}

	public Object javaInstance() {
		long lng = this.bigIntegerValue().longValue();
		if (this.bigIntegerValue().equals(BigInteger.valueOf(lng)))
			return Long.valueOf(lng);
		return this.bigIntegerValue();
	}

	public Object javaInstance(Class c) {
		if (c == Byte.class || c == Byte.TYPE)
			return Byte.valueOf(this.bigIntegerValue().byteValue());
		if (c == Short.class || c == Short.TYPE)
			return Short.valueOf(this.bigIntegerValue().shortValue());
		if (c == Integer.class || c == Integer.TYPE)
			return Integer.valueOf(this.bigIntegerValue().intValue());
		if (c == Long.class || c == Long.TYPE)
			return Long.valueOf(this.bigIntegerValue().longValue());
		return this.javaInstance();
	}

	public SubLObject LDB(int size, int position) {
		BigInteger n = this.bigIntegerValue().shiftRight(position);
		BigInteger mask = BigInteger.ONE.shiftLeft(size).subtract(BigInteger.ONE);
		return Lisp.number(n.and(mask));
	}

	public SubLObject LOGAND(int n) {
		if (n >= 0)
			return LispObjectFactory.makeInteger(this.bigIntegerValue().intValue() & n);
		else
			return Lisp.number(this.bigIntegerValue().and(BigInteger.valueOf(n)));
	}

	public SubLObject LOGAND(SubLObject obj) {
		if (obj instanceof Fixnum) {
			int n = ((Fixnum) obj).value;
			if (n >= 0)
				return LispObjectFactory.makeInteger(this.bigIntegerValue().intValue() & n);
			else
				return Lisp.number(this.bigIntegerValue().and(BigInteger.valueOf(n)));
		} else if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.bigIntegerValue().and(n));
		} else
			return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public SubLObject LOGIOR(int n) {
		return Lisp.number(this.bigIntegerValue().or(BigInteger.valueOf(n)));
	}

	public SubLObject LOGIOR(SubLObject obj) {
		if (obj instanceof Fixnum) {
			BigInteger n = ((Fixnum) obj).bigIntegerValue();
			return Lisp.number(this.bigIntegerValue().or(n));
		} else if (obj instanceof Bignum) {
			BigInteger n = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(this.bigIntegerValue().or(n));
		} else
			return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public SubLObject LOGNOT() {
		return Lisp.number(this.bigIntegerValue().not());
	}

	public SubLObject LOGXOR(int n) {
		return Lisp.number(this.bigIntegerValue().xor(BigInteger.valueOf(n)));
	}

	public SubLObject LOGXOR(SubLObject obj) {
		BigInteger n;
		if (obj instanceof Fixnum)
			n = ((Fixnum) obj).bigIntegerValue();
		else if (obj instanceof Bignum)
			n = ((Bignum) obj).bigIntegerValue();
		else
			return Lisp.type_error(obj, LispSymbols.INTEGER);
		return Lisp.number(this.bigIntegerValue().xor(n));
	}

	public long longValue() {
		return this.bigIntegerValue().longValue();
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Fixnum) {
			int n = ((Fixnum) obj).value;
			if (n == 0)
				return Fixnum.ZERO;
			if (n == 1)
				return this;
			return LispObjectFactory.makeInteger(this.bigIntegerValue().multiply(BigInteger.valueOf(n)));
		}
		if (obj instanceof Bignum)
			return LispObjectFactory.makeInteger(this.bigIntegerValue().multiply(((Bignum) obj).bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger n = ((Ratio) obj).numerator();
			return Lisp.number(n.multiply(this.bigIntegerValue()), ((Ratio) obj).denominator());
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() * ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() * ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.mult(c.getRealPart()), this.mult(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject multiplyBy(int n) {
		if (n == 0)
			return Fixnum.ZERO;
		if (n == 1)
			return this;
		return LispObjectFactory.makeInteger(this.bigIntegerValue().multiply(BigInteger.valueOf(n)));
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Bignum)
			return this.bigIntegerValue().equals(((Bignum) obj).bigIntegerValue());
		if (obj instanceof SingleFloat)
			return this.numE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numE(((DoubleFloat) obj).rational());
		if (obj.isNumber())
			return false;
		Lisp.type_error(obj, LispSymbols.NUMBER);
		// Not reached.
		return false;
	}

	public SubLObject NUMERATOR() {
		return this;
	}

	public boolean numG(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) > 0;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(((Bignum) obj).bigIntegerValue()) > 0;
		if (obj instanceof Ratio) {
			BigInteger n = this.bigIntegerValue().multiply(((Ratio) obj).denominator());
			return n.compareTo(((Ratio) obj).numerator()) > 0;
		}
		if (obj instanceof SingleFloat)
			return this.numG(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numG(((DoubleFloat) obj).rational());
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numGE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) >= 0;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(((Bignum) obj).bigIntegerValue()) >= 0;
		if (obj instanceof Ratio) {
			BigInteger n = this.bigIntegerValue().multiply(((Ratio) obj).denominator());
			return n.compareTo(((Ratio) obj).numerator()) >= 0;
		}
		if (obj instanceof SingleFloat)
			return this.numGE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numGE(((DoubleFloat) obj).rational());
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numL(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) < 0;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(((Bignum) obj).bigIntegerValue()) < 0;
		if (obj instanceof Ratio) {
			BigInteger n = this.bigIntegerValue().multiply(((Ratio) obj).denominator());
			return n.compareTo(((Ratio) obj).numerator()) < 0;
		}
		if (obj instanceof SingleFloat)
			return this.numL(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numL(((DoubleFloat) obj).rational());
		Lisp.type_error(obj, LispSymbols.REAL);
		// Not reached.
		return false;
	}

	public boolean numLE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) <= 0;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(((Bignum) obj).bigIntegerValue()) <= 0;
		if (obj instanceof Ratio) {
			BigInteger n = this.bigIntegerValue().multiply(((Ratio) obj).denominator());
			return n.compareTo(((Ratio) obj).numerator()) <= 0;
		}
		if (obj instanceof SingleFloat)
			return this.numLE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.numLE(((DoubleFloat) obj).rational());
		Lisp.type_error(obj, LispSymbols.REAL);
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
		if (obj instanceof Fixnum)
			return Lisp.number(this.bigIntegerValue().subtract(Fixnum.getBigInteger(obj)));
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue().subtract(((Bignum) obj).bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger numerator = ((Ratio) obj).numerator();
			BigInteger denominator = ((Ratio) obj).denominator();
			return Lisp.number(this.bigIntegerValue().multiply(denominator).subtract(numerator), denominator);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.floatValue() - ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.doubleValue() - ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.sub(c.getRealPart()), Fixnum.ZERO.sub(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject truncate(SubLObject obj) {
		LispThread thread = LispThread.currentThread();
		SubLObject value1, value2;
		try {
			if (obj instanceof Fixnum) {
				BigInteger divisor = ((Fixnum) obj).bigIntegerValue();
				BigInteger[] results = this.bigIntegerValue().divideAndRemainder(divisor);
				BigInteger quotient = results[0];
				BigInteger remainder = results[1];
				value1 = Lisp.number(quotient);
				value2 = remainder.signum() == 0 ? Fixnum.ZERO : Lisp.number(remainder);
			} else if (obj instanceof Bignum) {
				BigInteger divisor = ((Bignum) obj).bigIntegerValue();
				BigInteger[] results = this.bigIntegerValue().divideAndRemainder(divisor);
				BigInteger quotient = results[0];
				BigInteger remainder = results[1];
				value1 = Lisp.number(quotient);
				value2 = remainder.signum() == 0 ? Fixnum.ZERO : Lisp.number(remainder);
			} else if (obj instanceof Ratio) {
				Ratio divisor = (Ratio) obj;
				SubLObject quotient = this.mult(divisor.DENOMINATOR()).truncate(divisor.NUMERATOR());
				SubLObject remainder = this.sub(quotient.mult(divisor));
				value1 = quotient;
				value2 = remainder;
			} else if (obj instanceof SingleFloat)
				// "When rationals and floats are combined by a numerical
				// function, the rational is first converted to a float of the
				// same format." 12.1.4.1
				return LispObjectFactory.makeSingle(this.floatValue()).truncate(obj);
			else if (obj instanceof DoubleFloat)
				// "When rationals and floats are combined by a numerical
				// function, the rational is first converted to a float of the
				// same format." 12.1.4.1
				return LispObjectFactory.makeDouble(this.doubleValue()).truncate(obj);
			else
				return Lisp.type_error(obj, LispSymbols.REAL);
		} catch (ArithmeticException e) {
			if (obj.isZero())
				return Lisp.error(new DivisionByZero());
			else
				return Lisp.error(new ArithmeticError(e.getMessage()));
		}
		return thread.setValues(value1, value2);
	}

	public SubLObject typeOf() {
		if (this.bigIntegerValue().signum() > 0)
			return Lisp.list(LispSymbols.INTEGER,
					LispObjectFactory.makeInteger(BigIntBignumImpl.MOST_POSITIVE_FIXNUM_PLUS_ONE));
		return LispSymbols.BIGNUM;
	}

	public SubLObject typep(SubLObject type) {
		if (type instanceof SubLSymbol) {
			if (type == LispSymbols.BIGNUM)
				return Lisp.T;
			if (type == LispSymbols.INTEGER)
				return Lisp.T;
			if (type == LispSymbols.RATIONAL)
				return Lisp.T;
			if (type == LispSymbols.REAL)
				return Lisp.T;
			if (type == LispSymbols.NUMBER)
				return Lisp.T;
			if (type == LispSymbols.SIGNED_BYTE)
				return Lisp.T;
			if (type == LispSymbols.UNSIGNED_BYTE)
				return this.bigIntegerValue().signum() >= 0 ? Lisp.T : Lisp.NIL;
		} else if (type instanceof LispClass) {
			if (type == BuiltInClass.BIGNUM)
				return Lisp.T;
			if (type == BuiltInClass.INTEGER)
				return Lisp.T;
			if (type == BuiltInClass.RATIONAL)
				return Lisp.T;
			if (type == BuiltInClass.REAL)
				return Lisp.T;
			if (type == BuiltInClass.NUMBER)
				return Lisp.T;
		} else if (type instanceof SubLCons) {
			if (type.equal(Lisp.UNSIGNED_BYTE_8))
				return Lisp.NIL;
			if (type.equal(Lisp.UNSIGNED_BYTE_32)) {
				if (this.isNegative())
					return Lisp.NIL;
				return this.numL(Lisp.UNSIGNED_BYTE_32_MAX_VALUE) ? Lisp.T : Lisp.NIL;
			}
		}
		return super.typep(type);
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		int base = LispSymbols.PRINT_BASE.symbolValue(thread).intValue();
		String s = this.bigIntegerValue().toString(base).toUpperCase();
		if (LispSymbols.PRINT_RADIX.symbolValue(thread) != Lisp.NIL) {
			StringBuffer sb = new StringBuffer();
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
				sb.append(s);
				sb.append('.');
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
