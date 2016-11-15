/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Fixnum.java 12431 2010-02-08 08:05:15Z mevenson $
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

public class Fixnum extends LispInteger {
	public static int MAX_POS_CACHE = 256;// just like before - however never
											// set this to less than 256
	public static Fixnum[] constants = new Fixnum[Fixnum.MAX_POS_CACHE];
	static {
		for (int i = 0; i < Fixnum.MAX_POS_CACHE; i++)
			Fixnum.constants[i] = new Fixnum(i);
	}

	public static Fixnum ZERO = Fixnum.constants[0];
	public static Fixnum ONE = Fixnum.constants[1];
	public static Fixnum TWO = Fixnum.constants[2];
	public static Fixnum THREE = Fixnum.constants[3];

	public static Fixnum MINUS_ONE = LispObjectFactory.makeInteger(-1);

	static BigInteger BIGINTEGER_TWO = new BigInteger("2");

	public static BigInteger getBigInteger(SubLObject obj) {
		if (obj instanceof Fixnum)
			return BigInteger.valueOf(((Fixnum) obj).value);
		Lisp.type_error(obj, LispSymbols.FIXNUM);
		// Not reached.
		return null;
	}

	public int value;

	// set to private to hunt down sneaky creators
	protected Fixnum(int value) {
		this.value = value;
	}

	public SubLObject ABS() {
		if (this.value >= 0)
			return this;
		return LispObjectFactory.makeInteger(-(long) this.value);
	}

	public SubLObject add(int n) {
		return LispObjectFactory.makeInteger((long) this.value + n);
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Fixnum) {
			long result = (long) this.value + ((Fixnum) obj).value;
			return LispObjectFactory.makeInteger(result);
		}
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue().add(((Bignum) obj).bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger numerator = ((Ratio) obj).numerator();
			BigInteger denominator = ((Ratio) obj).denominator();
			return Lisp.number(this.bigIntegerValue().multiply(denominator).add(numerator), denominator);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value + ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value + ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.add(c.getRealPart()), c.getImaginaryPart());
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject ash(int shift) {
		if (this.value == 0)
			return this;
		if (shift == 0)
			return this;
		long n = this.value;
		if (shift <= -32)
			// Right shift.
			return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
		if (shift < 0)
			return LispObjectFactory.makeInteger((int) (n >> -shift));
		if (shift <= 32) {
			n = n << shift;
			return LispObjectFactory.makeInteger(n);
		}
		// BigInteger.shiftLeft() succumbs to a stack overflow if shift
		// is Integer.MIN_VALUE, so...
		if (shift == Integer.MIN_VALUE)
			return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
		return Lisp.number(BigInteger.valueOf(this.value).shiftLeft(shift));
	}

	public SubLObject ash(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.ash(((Fixnum) obj).value);
		if (obj instanceof Bignum) {
			if (this.value == 0)
				return this;
			BigInteger n = BigInteger.valueOf(this.value);
			BigInteger shift = ((Bignum) obj).bigIntegerValue();
			if (shift.signum() > 0)
				return Lisp.error(new LispError("Can't represent result of left shift."));
			if (shift.signum() < 0)
				return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
			Debug.bug(); // Shouldn't happen.
		}
		return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public BigInteger bigIntegerValue() {
		return BigInteger.valueOf(this.value);
	}

	public SubLObject classOf() {
		return BuiltInClass.FIXNUM;
	}

	public SubLObject dec() {
		return LispObjectFactory.makeInteger(-1 + (long) this.value);
	}

	public SubLObject DENOMINATOR() {
		return Fixnum.ONE;
	}

	public SubLObject divideBy(SubLObject obj) {
		try {
			if (obj instanceof Fixnum) {
				int divisor = ((Fixnum) obj).value;
				// (/ MOST-NEGATIVE-FIXNUM -1) is a bignum.
				if (this.value > Integer.MIN_VALUE)
					if (this.value % divisor == 0)
						return LispObjectFactory.makeInteger(this.value / divisor);
				return Lisp.number(BigInteger.valueOf(this.value), BigInteger.valueOf(divisor));
			}
			if (obj instanceof Bignum)
				return Lisp.number(this.bigIntegerValue(), ((Bignum) obj).bigIntegerValue());
			if (obj instanceof Ratio) {
				BigInteger numerator = ((Ratio) obj).numerator();
				BigInteger denominator = ((Ratio) obj).denominator();
				return Lisp.number(this.bigIntegerValue().multiply(denominator), numerator);
			}
			if (obj instanceof SingleFloat)
				return LispObjectFactory.makeSingle(this.value / ((SingleFloat) obj).value);
			if (obj instanceof DoubleFloat)
				return LispObjectFactory.makeDouble(this.value / ((DoubleFloat) obj).value);
			if (obj instanceof Complex) {
				Complex c = (Complex) obj;
				SubLObject realPart = c.getRealPart();
				SubLObject imagPart = c.getImaginaryPart();
				SubLObject denominator = realPart.mult(realPart).add(imagPart.mult(imagPart));
				return LispObjectFactory.makeComplex(this.mult(realPart).divideBy(denominator),
						Fixnum.ZERO.sub(this.mult(imagPart).divideBy(denominator)));
			}
			return Lisp.type_error(obj, LispSymbols.NUMBER);
		} catch (ArithmeticException e) {
			if (obj.isZero())
				return Lisp.error(new DivisionByZero());
			return Lisp.error(new ArithmeticError(e.getMessage()));
		}
	}

	public double doubleValue() {
		return this.value;
	}

	public boolean eql(int n) {
		return this.value == n;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Fixnum)
			if (this.value == ((Fixnum) obj).value)
				return true;
		return false;
	}

	public boolean equal(int n) {
		return this.value == n;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Fixnum)
			if (this.value == ((Fixnum) obj).value)
				return true;
		return false;
	}

	public boolean equalp(int n) {
		return this.value == n;
	}

	public boolean equalp(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value == ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.value == ((SingleFloat) obj).value;
		if (obj instanceof DoubleFloat)
			return this.value == ((DoubleFloat) obj).value;
		return false;
	}

	public float floatValue() {
		return this.value;
	}

	public SubLObject getDescription() {
		StringBuffer sb = new StringBuffer("The fixnum ");
		sb.append(this.value);
		return LispObjectFactory.makeString(sb);
	}

	@Deprecated
	public int getValue(SubLObject a) throws Throwable {
		return a.intValue();
	}

	public int hashCodeLisp() {
		return this.value;
	}

	public SubLObject inc() {
		return LispObjectFactory.makeInteger(1 + (long) this.value);
	}

	public int intValue() {
		return this.value;
	}

	public boolean isEqualTo(int n) {
		return this.value == n;
	}

	public boolean isEven() {
		return (this.value & 0x01) == 0;
	}

	// not used anywhere
	// public static int getInt(LispObject obj)
	// {
	// if (obj instanceof Fixnum) return ((Fixnum)obj).value;
	// type_error(obj, LispSymbols.FIXNUM);
	// // Not reached.
	// return 0;
	// }

	public boolean isGreaterThan(int n) {
		return this.value > n;
	}

	public boolean isGreaterThanOrEqualTo(int n) {
		return this.value >= n;
	}

	public boolean isInteger() {
		return true;
	}

	public boolean isLessThan(int n) {
		return this.value < n;
	}

	public boolean isLessThanOrEqualTo(int n) {
		return this.value <= n;
	}

	public boolean isNegative() {
		return this.value < 0;
	}

	public boolean isNotEqualTo(int n) {
		return this.value != n;
	}

	public boolean isNotEqualTo(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value != ((Fixnum) obj).value;
		// obj is not a fixnum.
		if (obj instanceof SingleFloat)
			return this.isNotEqualTo(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.value != ((DoubleFloat) obj).value;
		if (obj instanceof Complex)
			return obj.isNotEqualTo(this);
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
		return (this.value & 0x01) != 0;
	}

	public boolean isPositive() {
		return this.value > 0;
	}

	public boolean isZero() {
		return this.value == 0;
	}

	public Object javaInstance() {
		return Integer.valueOf(this.value);
	}

	public Object javaInstance(Class c) {
		String cn = c.getName();
		if (cn.equals("java.lang.Byte") || cn.equals("byte"))
			return Byte.valueOf((byte) this.value);
		if (cn.equals("java.lang.Short") || cn.equals("short"))
			return Short.valueOf((short) this.value);
		if (cn.equals("java.lang.Long") || cn.equals("long"))
			return Long.valueOf(this.value);
		return this.javaInstance();
	}

	public SubLObject LDB(int size, int position) {
		long n = (long) this.value >> position;
		long mask = (1L << size) - 1;
		return Lisp.number(n & mask);
	}

	public SubLObject LOGAND(int n) {
		return LispObjectFactory.makeInteger(this.value & n);
	}

	public SubLObject LOGAND(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeInteger(this.value & ((Fixnum) obj).value);
		if (obj instanceof Bignum)
			if (this.value >= 0) {
				int n2 = ((Bignum) obj).bigIntegerValue().intValue();
				return LispObjectFactory.makeInteger(this.value & n2);
			} else {
				BigInteger n1 = this.bigIntegerValue();
				BigInteger n2 = ((Bignum) obj).bigIntegerValue();
				return Lisp.number(n1.and(n2));
			}
		return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public SubLObject LOGIOR(int n) {
		return LispObjectFactory.makeInteger(this.value | n);
	}

	public SubLObject LOGIOR(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeInteger(this.value | ((Fixnum) obj).value);
		if (obj instanceof Bignum) {
			BigInteger n1 = this.bigIntegerValue();
			BigInteger n2 = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(n1.or(n2));
		}
		return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public SubLObject LOGNOT() {
		return LispObjectFactory.makeInteger(~this.value);
	}

	public SubLObject LOGXOR(int n) {
		return LispObjectFactory.makeInteger(this.value ^ n);
	}

	public SubLObject LOGXOR(SubLObject obj) {
		if (obj instanceof Fixnum)
			return LispObjectFactory.makeInteger(this.value ^ ((Fixnum) obj).value);
		if (obj instanceof Bignum) {
			BigInteger n1 = this.bigIntegerValue();
			BigInteger n2 = ((Bignum) obj).bigIntegerValue();
			return Lisp.number(n1.xor(n2));
		}
		return Lisp.type_error(obj, LispSymbols.INTEGER);
	}

	public long longValue() {
		return this.value;
	}

	public SubLObject MOD(int divisor) {
		int r;
		try {
			r = this.value % divisor;
		} catch (ArithmeticException e) {
			return Lisp.error(new ArithmeticError("Division by zero."));
		}
		if (r == 0)
			return Fixnum.ZERO;
		if (divisor < 0) {
			if (this.value > 0)
				return LispObjectFactory.makeInteger(r + divisor);
		} else if (this.value < 0)
			return LispObjectFactory.makeInteger(r + divisor);
		return LispObjectFactory.makeInteger(r);
	}

	public SubLObject MOD(SubLObject divisor) {
		if (divisor instanceof Fixnum)
			return this.MOD(((Fixnum) divisor).value);
		return super.MOD(divisor);
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Fixnum) {
			long result = (long) this.value * ((Fixnum) obj).value;
			return LispObjectFactory.makeInteger(result);
		}
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue().multiply(((Bignum) obj).bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger numerator = ((Ratio) obj).numerator();
			BigInteger denominator = ((Ratio) obj).denominator();
			return Lisp.number(this.bigIntegerValue().multiply(numerator), denominator);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value * ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value * ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.mult(c.getRealPart()), this.mult(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject multiplyBy(int n) {
		long result = (long) this.value * n;
		return LispObjectFactory.makeInteger(result);
	}

	public SubLObject negate() {
		return LispObjectFactory.makeInteger(-(long) this.value);
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Fixnum)
			return this.value == ((Fixnum) obj).value;
		if (obj instanceof SingleFloat)
			return this.numE(((SingleFloat) obj).rational());
		if (obj instanceof DoubleFloat)
			return this.value == ((DoubleFloat) obj).value;
		if (obj instanceof Complex)
			return obj.numE(this);
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
			return this.value > ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(obj.bigIntegerValue()) > 0;
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
			return this.value >= ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(obj.bigIntegerValue()) >= 0;
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
			return this.value < ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(obj.bigIntegerValue()) < 0;
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
			return this.value <= ((Fixnum) obj).value;
		if (obj instanceof Bignum)
			return this.bigIntegerValue().compareTo(obj.bigIntegerValue()) <= 0;
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

	/**
	 * Computes fixnum^bignum, returning a fixnum or a bignum.
	 */
	public SubLObject pow(SubLObject obj) {
		BigInteger y = obj.bigIntegerValue();

		if (y.compareTo(BigInteger.ZERO) < 0)
			return LispObjectFactory.makeInteger(1).divideBy(this.pow(LispObjectFactory.makeInteger(y.negate())));

		if (y.compareTo(BigInteger.ZERO) == 0)
			// No need to test base here; CLHS says 0^0 == 1.
			return LispObjectFactory.makeInteger(1);

		int x = this.value;

		if (x == 0)
			return LispObjectFactory.makeInteger(0);

		if (x == 1)
			return LispObjectFactory.makeInteger(1);

		BigInteger xy = BigInteger.ONE;
		BigInteger term = BigInteger.valueOf(x);

		while (!y.equals(BigInteger.ZERO)) {
			if (y.testBit(0))
				xy = xy.multiply(term);

			term = term.multiply(term);
			y = y.shiftLeft(1);
		}

		return LispObjectFactory.makeInteger(xy);
	}

	public boolean rationalp() {
		return true;
	}

	public boolean realp() {
		return true;
	}

	public SubLObject sub(SubLObject obj) {
		if (obj instanceof Fixnum)
			return Lisp.number((long) this.value - ((Fixnum) obj).value);
		if (obj instanceof Bignum)
			return Lisp.number(this.bigIntegerValue().subtract(obj.bigIntegerValue()));
		if (obj instanceof Ratio) {
			BigInteger numerator = ((Ratio) obj).numerator();
			BigInteger denominator = ((Ratio) obj).denominator();
			return Lisp.number(this.bigIntegerValue().multiply(denominator).subtract(numerator), denominator);
		}
		if (obj instanceof SingleFloat)
			return LispObjectFactory.makeSingle(this.value - ((SingleFloat) obj).value);
		if (obj instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(this.value - ((DoubleFloat) obj).value);
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.sub(c.getRealPart()), Fixnum.ZERO.sub(c.getImaginaryPart()));
		}
		return Lisp.type_error(obj, LispSymbols.NUMBER);
	}

	public SubLObject subtract(int n) {
		return LispObjectFactory.makeInteger((long) this.value - n);
	}

	public SubLObject truncate(SubLObject obj) {
		LispThread thread = LispThread.currentThread();
		SubLObject value1, value2;
		try {
			if (obj instanceof Fixnum) {
				int divisor = ((Fixnum) obj).value;
				int quotient = this.value / divisor;
				int remainder = this.value % divisor;
				value1 = LispObjectFactory.makeInteger(quotient);
				value2 = remainder == 0 ? Fixnum.ZERO : LispObjectFactory.makeInteger(remainder);
			} else if (obj instanceof Bignum) {
				BigInteger val = this.bigIntegerValue();
				BigInteger divisor = ((Bignum) obj).bigIntegerValue();
				BigInteger[] results = val.divideAndRemainder(divisor);
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
				// function,
				// the rational is first converted to a float of the same
				// format."
				// 12.1.4.1
				return LispObjectFactory.makeSingle(this.value).truncate(obj);
			else if (obj instanceof DoubleFloat)
				// "When rationals and floats are combined by a numerical
				// function,
				// the rational is first converted to a float of the same
				// format."
				// 12.1.4.1
				return LispObjectFactory.makeDouble(this.value).truncate(obj);
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
		if (this.value == 0 || this.value == 1)
			return LispSymbols.BIT;
		if (this.value > 1)
			return Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO, LispObjectFactory.makeInteger(Integer.MAX_VALUE));
		return LispSymbols.FIXNUM;
	}

	public SubLObject typep(SubLObject type) {
		if (type instanceof SubLSymbol) {
			if (type == LispSymbols.FIXNUM)
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
				return this.value >= 0 ? Lisp.T : Lisp.NIL;
			if (type == LispSymbols.BIT)
				return this.value == 0 || this.value == 1 ? Lisp.T : Lisp.NIL;
		} else if (type instanceof LispClass) {
			if (type == BuiltInClass.FIXNUM)
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
				return this.value >= 0 && this.value <= 255 ? Lisp.T : Lisp.NIL;
			if (type.equal(Lisp.UNSIGNED_BYTE_16))
				return this.value >= 0 && this.value <= 65535 ? Lisp.T : Lisp.NIL;
			if (type.equal(Lisp.UNSIGNED_BYTE_32))
				return this.value >= 0 ? Lisp.T : Lisp.NIL;
		}
		return super.typep(type);
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		int base = LispSymbols.PRINT_BASE.symbolValue(thread).intValue();
		String s = Integer.toString(this.value, base).toUpperCase();
		if (LispSymbols.PRINT_RADIX.symbolValue(thread) != Lisp.NIL) {
			StringBuilder sb = new StringBuilder();
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
