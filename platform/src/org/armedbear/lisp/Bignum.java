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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface Bignum extends SubLObject {

	BigInteger bigIntegerValue();

	double doubleValue();
	// private BigInteger value;
	//
	// static BigInteger MOST_NEGATIVE_FIXNUM =
	// BigInteger.valueOf(Integer.MIN_VALUE);
	// static BigInteger MOST_POSITIVE_FIXNUM =
	// BigInteger.valueOf(Integer.MAX_VALUE);
	// static BigInteger MOST_POSITIVE_FIXNUM_PLUS_ONE =
	// BigInteger.valueOf((long)Integer.MAX_VALUE+1);
	//
	// protected Bignum(BigInteger n)
	// {
	// value = n;
	// }
	//
	//
	// public Object javaInstance()
	// {
	// long lng = bigIntegerValue().longValue();
	// if (bigIntegerValue().equals(BigInteger.valueOf(lng))) return
	// Long.valueOf(lng);
	// return bigIntegerValue();
	// }
	//
	//
	// public Object javaInstance(Class c) {
	// if (c == Byte.class || c == Byte.TYPE)
	// return Byte.valueOf(bigIntegerValue().byteValue());
	// if (c == Short.class || c == Short.TYPE)
	// return Short.valueOf(bigIntegerValue().shortValue());
	// if (c == Integer.class || c == Integer.TYPE)
	// return Integer.valueOf(bigIntegerValue().intValue());
	// if (c == Long.class || c == Long.TYPE)
	// return Long.valueOf(bigIntegerValue().longValue());
	// return javaInstance();
	// }
	//
	//
	//
	// public SubLObject typeOf()
	// {
	// if (bigIntegerValue().signum() > 0)
	// return list(LispSymbols.INTEGER,
	// LispObjectFactory.makeInteger(MOST_POSITIVE_FIXNUM_PLUS_ONE));
	// return LispSymbols.BIGNUM;
	// }
	//
	//
	// public SubLObject classOf()
	// {
	// return BuiltInClass.BIGNUM;
	// }
	//
	//
	// public SubLObject typep(SubLObject type)
	// {
	// if (type instanceof SubLSymbol)
	// {
	// if (type == LispSymbols.BIGNUM)
	// return T;
	// if (type == LispSymbols.INTEGER)
	// return T;
	// if (type == LispSymbols.RATIONAL)
	// return T;
	// if (type == LispSymbols.REAL)
	// return T;
	// if (type == LispSymbols.NUMBER)
	// return T;
	// if (type == LispSymbols.SIGNED_BYTE)
	// return T;
	// if (type == LispSymbols.UNSIGNED_BYTE)
	// return bigIntegerValue().signum() >= 0 ? T : NIL;
	// }
	// else if (type instanceof LispClass)
	// {
	// if (type == BuiltInClass.BIGNUM)
	// return T;
	// if (type == BuiltInClass.INTEGER)
	// return T;
	// if (type == BuiltInClass.RATIONAL)
	// return T;
	// if (type == BuiltInClass.REAL)
	// return T;
	// if (type == BuiltInClass.NUMBER)
	// return T;
	// }
	// else if (type instanceof SubLCons)
	// {
	// if (type.equal(UNSIGNED_BYTE_8))
	// return NIL;
	// if (type.equal(UNSIGNED_BYTE_32))
	// {
	// if (isNegative())
	// return NIL;
	// return numL(UNSIGNED_BYTE_32_MAX_VALUE) ? T : NIL;
	// }
	// }
	// return super.typep(type);
	// }
	//
	//
	// public boolean isNumber()
	// {
	// return true;
	// }
	//
	//
	// public boolean isInteger()
	// {
	// return true;
	// }
	//
	//
	// public boolean rationalp()
	// {
	// return true;
	// }
	//
	//
	// public boolean realp()
	// {
	// return true;
	// }
	//
	//
	// public boolean eql(SubLObject obj)
	// {
	// if (this == obj)
	// return true;
	// if (obj instanceof Bignum)
	// {
	// if (bigIntegerValue().equals(((Bignum)obj).bigIntegerValue()))
	// return true;
	// }
	// return false;
	// }
	//
	//
	// public boolean equal(SubLObject obj)
	// {
	// if (this == obj)
	// return true;
	// if (obj instanceof Bignum)
	// {
	// if (bigIntegerValue().equals(((SubLObject)obj).bigIntegerValue()))
	// return true;
	// }
	// return false;
	// }
	//
	//
	// public boolean equalp(SubLObject obj)
	// {
	// if (obj instanceof Bignum)
	// return bigIntegerValue().equals(((Bignum)obj).bigIntegerValue());
	// if (obj instanceof SingleFloat)
	// return floatValue() == ((SingleFloat)obj).value;
	// if (obj instanceof DoubleFloat)
	// return doubleValue() == ((DoubleFloat)obj).value;
	// return false;
	// }
	//
	//
	// public SubLObject ABS()
	// {
	// if (bigIntegerValue().signum() >= 0)
	// return this;
	// return makeInteger(bigIntegerValue().negate());
	// }
	//
	//
	// public SubLObject NUMERATOR()
	// {
	// return this;
	// }
	//
	//
	// public SubLObject DENOMINATOR()
	// {
	// return Fixnum.ONE;
	// }
	//
	//
	// public boolean isEven()
	// {
	// return !bigIntegerValue().testBit(0);
	// }
	//
	//
	// public boolean isOdd()
	// {
	// return bigIntegerValue().testBit(0);
	// }
	//
	//
	// public boolean isPositive()
	// {
	// return bigIntegerValue().signum() > 0;
	// }
	//
	//
	// public boolean isNegative()
	// {
	// return bigIntegerValue().signum() < 0;
	// }
	//
	//
	// public boolean isZero()
	// {
	// return false;
	// }
	//
	//
	// public int intValue()
	// {
	// return bigIntegerValue().intValue();
	// }
	//
	//
	// public long longValue()
	// {
	// return bigIntegerValue().longValue();
	// }
	//
	//
	// public float floatValue()
	// {
	// float f = bigIntegerValue().floatValue();
	// if (Float.isInfinite(f))
	// error(new TypeError("The value " + writeToString() +
	// " is too large to be converted to a single float."));
	// return f;
	// }
	//
	//
	// public double doubleValue()
	// {
	// double d = bigIntegerValue().doubleValue();
	// if (Double.isInfinite(d))
	// error(new TypeError("The value " + writeToString() +
	// " is too large to be converted to a double float."));
	// return d;
	// }
	//
	// public static BigInteger getValue(SubLObject obj)
	// {
	//
	// if (obj instanceof Bignum)
	// {
	// return ((Bignum)obj).bigIntegerValue();
	// }
	// type_error(obj, LispSymbols.BIGNUM);
	// // Not reached.
	// return null;
	// }
	//
	//
	// public SubLObject inc()
	// {
	// return number(bigIntegerValue().add(BigInteger.ONE));
	// }
	//
	//
	// public SubLObject dec()
	// {
	// return number(bigIntegerValue().subtract(BigInteger.ONE));
	// }
	//
	//
	// public SubLObject add(int n)
	// {
	// return number(bigIntegerValue().add(BigInteger.valueOf(n)));
	// }
	//
	//
	// public SubLObject add(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return number(bigIntegerValue().add(Fixnum.getBigInteger(obj)));
	// if (obj instanceof Bignum)
	// return number(bigIntegerValue().add(((Bignum)obj).bigIntegerValue()));
	// if (obj instanceof Ratio)
	// {
	// BigInteger numerator = ((Ratio)obj).numerator();
	// BigInteger denominator = ((Ratio)obj).denominator();
	// return number(bigIntegerValue().multiply(denominator).add(numerator),
	// denominator);
	// }
	// if (obj instanceof SingleFloat)
	// return makeSingle(floatValue() + ((SingleFloat)obj).value);
	// if (obj instanceof DoubleFloat)
	// return makeDouble(doubleValue() + ((DoubleFloat)obj).value);
	// if (obj instanceof Complex)
	// {
	// Complex c = (Complex) obj;
	// return LispObjectFactory.makeComplex(add(c.getRealPart()),
	// c.getImaginaryPart());
	// }
	// return type_error(obj, LispSymbols.NUMBER);
	// }
	//
	//
	// public SubLObject sub(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return number(bigIntegerValue().subtract(Fixnum.getBigInteger(obj)));
	// if (obj instanceof Bignum)
	// return
	// number(bigIntegerValue().subtract(((Bignum)obj).bigIntegerValue()));
	// if (obj instanceof Ratio)
	// {
	// BigInteger numerator = ((Ratio)obj).numerator();
	// BigInteger denominator = ((Ratio)obj).denominator();
	// return
	// number(bigIntegerValue().multiply(denominator).subtract(numerator),
	// denominator);
	// }
	// if (obj instanceof SingleFloat)
	// return makeSingle(floatValue() - ((SingleFloat)obj).value);
	// if (obj instanceof DoubleFloat)
	// return makeDouble(doubleValue() - ((DoubleFloat)obj).value);
	// if (obj instanceof Complex)
	// {
	// Complex c = (Complex) obj;
	// return LispObjectFactory.makeComplex(sub(c.getRealPart()),
	// Fixnum.ZERO.sub(c.getImaginaryPart()));
	// }
	// return type_error(obj, LispSymbols.NUMBER);
	// }
	//
	//
	// public SubLObject multiplyBy(int n)
	// {
	// if (n == 0)
	// return Fixnum.ZERO;
	// if (n == 1)
	// return this;
	// return makeInteger(bigIntegerValue().multiply(BigInteger.valueOf(n)));
	// }
	//
	//
	// public SubLObject mult(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// {
	// int n = ((Fixnum)obj).value;
	// if (n == 0)
	// return Fixnum.ZERO;
	// if (n == 1)
	// return this;
	// return makeInteger(bigIntegerValue().multiply(BigInteger.valueOf(n)));
	// }
	// if (obj instanceof Bignum)
	// return
	// makeInteger(bigIntegerValue().multiply(((Bignum)obj).bigIntegerValue()));
	// if (obj instanceof Ratio)
	// {
	// BigInteger n = ((Ratio)obj).numerator();
	// return number(n.multiply(bigIntegerValue()), ((Ratio)obj).denominator());
	// }
	// if (obj instanceof SingleFloat)
	// return makeSingle(floatValue() * ((SingleFloat)obj).value);
	// if (obj instanceof DoubleFloat)
	// return makeDouble(doubleValue() * ((DoubleFloat)obj).value);
	// if (obj instanceof Complex)
	// {
	// Complex c = (Complex) obj;
	// return LispObjectFactory.makeComplex(mult(c.getRealPart()),
	// mult(c.getImaginaryPart()));
	// }
	// return type_error(obj, LispSymbols.NUMBER);
	// }
	//
	//
	// public SubLObject divideBy(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return number(bigIntegerValue(), Fixnum.getBigInteger(obj));
	// if (obj instanceof Bignum)
	// return number(bigIntegerValue(), ((Bignum)obj).bigIntegerValue());
	// if (obj instanceof Ratio)
	// {
	// BigInteger d = ((Ratio)obj).denominator();
	// return number(d.multiply(bigIntegerValue()), ((Ratio)obj).numerator());
	// }
	// if (obj instanceof SingleFloat)
	// return makeSingle(floatValue() / ((SingleFloat)obj).value);
	// if (obj instanceof DoubleFloat)
	// return makeDouble(doubleValue() / ((DoubleFloat)obj).value);
	// if (obj instanceof Complex)
	// {
	// Complex c = (Complex) obj;
	// SubLObject realPart = c.getRealPart();
	// SubLObject imagPart = c.getImaginaryPart();
	// SubLObject denominator =
	// realPart.mult(realPart).add(imagPart.mult(imagPart));
	// return
	// LispObjectFactory.makeComplex(mult(realPart).divideBy(denominator),
	// Fixnum.ZERO.sub(mult(imagPart).divideBy(denominator)));
	// }
	// return type_error(obj, LispSymbols.NUMBER);
	// }
	//
	//
	// public boolean numE(SubLObject obj)
	// {
	// if (obj instanceof Bignum)
	// return bigIntegerValue().equals(((Bignum)obj).bigIntegerValue());
	// if (obj instanceof SingleFloat)
	// return numE(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return numE(((DoubleFloat)obj).rational());
	// if (obj.isNumber())
	// return false;
	// type_error(obj, LispSymbols.NUMBER);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public boolean isNotEqualTo(SubLObject obj)
	// {
	// if (obj instanceof Bignum)
	// return !bigIntegerValue().equals(((Bignum)obj).bigIntegerValue());
	// if (obj instanceof SingleFloat)
	// return isNotEqualTo(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return isNotEqualTo(((DoubleFloat)obj).rational());
	// if (obj.isNumber())
	// return true;
	// type_error(obj, LispSymbols.NUMBER);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public boolean numL(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) < 0;
	// if (obj instanceof Bignum)
	// return bigIntegerValue().compareTo(((Bignum)obj).bigIntegerValue()) < 0;
	// if (obj instanceof Ratio)
	// {
	// BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
	// return n.compareTo(((Ratio)obj).numerator()) < 0;
	// }
	// if (obj instanceof SingleFloat)
	// return numL(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return numL(((DoubleFloat)obj).rational());
	// type_error(obj, LispSymbols.REAL);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public boolean numG(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) > 0;
	// if (obj instanceof Bignum)
	// return bigIntegerValue().compareTo(((Bignum)obj).bigIntegerValue()) > 0;
	// if (obj instanceof Ratio)
	// {
	// BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
	// return n.compareTo(((Ratio)obj).numerator()) > 0;
	// }
	// if (obj instanceof SingleFloat)
	// return numG(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return numG(((DoubleFloat)obj).rational());
	// type_error(obj, LispSymbols.REAL);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public boolean numLE(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) <= 0;
	// if (obj instanceof Bignum)
	// return bigIntegerValue().compareTo(((Bignum)obj).bigIntegerValue()) <= 0;
	// if (obj instanceof Ratio)
	// {
	// BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
	// return n.compareTo(((Ratio)obj).numerator()) <= 0;
	// }
	// if (obj instanceof SingleFloat)
	// return numLE(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return numLE(((DoubleFloat)obj).rational());
	// type_error(obj, LispSymbols.REAL);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public boolean numGE(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// return bigIntegerValue().compareTo(Fixnum.getBigInteger(obj)) >= 0;
	// if (obj instanceof Bignum)
	// return bigIntegerValue().compareTo(((Bignum)obj).bigIntegerValue()) >= 0;
	// if (obj instanceof Ratio)
	// {
	// BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
	// return n.compareTo(((Ratio)obj).numerator()) >= 0;
	// }
	// if (obj instanceof SingleFloat)
	// return numGE(((SingleFloat)obj).rational());
	// if (obj instanceof DoubleFloat)
	// return numGE(((DoubleFloat)obj).rational());
	// type_error(obj, LispSymbols.REAL);
	// // Not reached.
	// return false;
	// }
	//
	//
	// public SubLObject truncate(SubLObject obj)
	// {
	// LispThread thread = LispThread.currentThread();
	// SubLObject value1, value2;
	// try
	// {
	// if (obj instanceof Fixnum)
	// {
	// BigInteger divisor = ((Fixnum)obj).bigIntegerValue();
	// BigInteger[] results = bigIntegerValue().divideAndRemainder(divisor);
	// BigInteger quotient = results[0];
	// BigInteger remainder = results[1];
	// value1 = number(quotient);
	// value2 = (remainder.signum() == 0) ? Fixnum.ZERO : number(remainder);
	// }
	// else if (obj instanceof Bignum)
	// {
	// BigInteger divisor = ((Bignum)obj).bigIntegerValue();
	// BigInteger[] results = bigIntegerValue().divideAndRemainder(divisor);
	// BigInteger quotient = results[0];
	// BigInteger remainder = results[1];
	// value1 = number(quotient);
	// value2 = (remainder.signum() == 0) ? Fixnum.ZERO : number(remainder);
	// }
	// else if (obj instanceof Ratio)
	// {
	// Ratio divisor = (Ratio) obj;
	// SubLObject quotient =
	// mult(divisor.DENOMINATOR()).truncate(divisor.NUMERATOR());
	// SubLObject remainder =
	// sub(quotient.mult(divisor));
	// value1 = quotient;
	// value2 = remainder;
	// }
	// else if (obj instanceof SingleFloat)
	// {
	// // "When rationals and floats are combined by a numerical
	// // function, the rational is first converted to a float of the
	// // same format." 12.1.4.1
	// return makeSingle(floatValue()).truncate(obj);
	// }
	// else if (obj instanceof DoubleFloat)
	// {
	// // "When rationals and floats are combined by a numerical
	// // function, the rational is first converted to a float of the
	// // same format." 12.1.4.1
	// return makeDouble(doubleValue()).truncate(obj);
	// }
	// else
	// return type_error(obj, LispSymbols.REAL);
	// }
	// catch (ArithmeticException e)
	// {
	// if (obj.isZero())
	// return error(new DivisionByZero());
	// else
	// return error(new ArithmeticError(e.getMessage()));
	// }
	// return thread.setValues(value1, value2);
	// }
	//
	//
	// public SubLObject ash(SubLObject obj)
	// {
	// BigInteger n = bigIntegerValue();
	// if (obj instanceof Fixnum)
	// {
	// int count = ((Fixnum)obj).value;
	// if (count == 0)
	// return this;
	// // BigInteger.shiftLeft() succumbs to a stack overflow if count
	// // is Integer.MIN_VALUE, so...
	// if (count == Integer.MIN_VALUE)
	// return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
	// return number(n.shiftLeft(count));
	// }
	// if (obj instanceof Bignum)
	// {
	// BigInteger count = ((Bignum)obj).bigIntegerValue();
	// if (count.signum() > 0)
	// return error(new LispError("Can't represent result of left shift."));
	// if (count.signum() < 0)
	// return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
	// Debug.bug(); // Shouldn't happen.
	// }
	// return type_error(obj, LispSymbols.INTEGER);
	// }
	//
	//
	// public SubLObject LOGNOT()
	// {
	// return number(bigIntegerValue().not());
	// }
	//
	//
	// public SubLObject LOGAND(int n)
	// {
	// if (n >= 0)
	// return LispObjectFactory.makeInteger(bigIntegerValue().intValue() & n);
	// else
	// return number(bigIntegerValue().and(BigInteger.valueOf(n)));
	// }
	//
	//
	// public SubLObject LOGAND(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// {
	// int n = ((Fixnum)obj).value;
	// if (n >= 0)
	// return LispObjectFactory.makeInteger(bigIntegerValue().intValue() & n);
	// else
	// return number(bigIntegerValue().and(BigInteger.valueOf(n)));
	// }
	// else if (obj instanceof Bignum)
	// {
	// BigInteger n = ((Bignum)obj).bigIntegerValue();
	// return number(bigIntegerValue().and(n));
	// }
	// else
	// return type_error(obj, LispSymbols.INTEGER);
	// }
	//
	//
	// public SubLObject LOGIOR(int n)
	// {
	// return number(bigIntegerValue().or(BigInteger.valueOf(n)));
	// }
	//
	//
	// public SubLObject LOGIOR(SubLObject obj)
	// {
	// if (obj instanceof Fixnum)
	// {
	// BigInteger n = ((Fixnum)obj).bigIntegerValue();
	// return number(bigIntegerValue().or(n));
	// }
	// else if (obj instanceof Bignum)
	// {
	// BigInteger n = ((Bignum)obj).bigIntegerValue();
	// return number(bigIntegerValue().or(n));
	// }
	// else
	// return type_error(obj, LispSymbols.INTEGER);
	// }
	//
	//
	// public SubLObject LOGXOR(int n)
	// {
	// return number(bigIntegerValue().xor(BigInteger.valueOf(n)));
	// }
	//
	//
	// public SubLObject LOGXOR(SubLObject obj)
	// {
	// BigInteger n;
	// if (obj instanceof Fixnum)
	// n = ((Fixnum)obj).bigIntegerValue();
	// else if (obj instanceof Bignum)
	// n = ((Bignum)obj).bigIntegerValue();
	// else
	// return type_error(obj, LispSymbols.INTEGER);
	// return number(bigIntegerValue().xor(n));
	// }
	//
	//
	// public SubLObject LDB(int size, int position)
	// {
	// BigInteger n = bigIntegerValue().shiftRight(position);
	// BigInteger mask =
	// BigInteger.ONE.shiftLeft(size).subtract(BigInteger.ONE);
	// return number(n.and(mask));
	// }
	//
	//
	// public int hashCodeLisp()
	// {
	// return bigIntegerValue().hashCode();
	// }
	//
	//
	// public String writeToString()
	// {
	// LispThread thread = LispThread.currentThread();
	// int base = Fixnum.getValue(LispSymbols.PRINT_BASE.symbolValue(thread));
	// String s = bigIntegerValue().toString(base).toUpperCase();
	// if (LispSymbols.PRINT_RADIX.symbolValue(thread) != NIL)
	// {
	// StringBuffer sb = new StringBuffer();
	// switch (base)
	// {
	// case 2:
	// sb.append("#b");
	// sb.append(s);
	// break;
	// case 8:
	// sb.append("#o");
	// sb.append(s);
	// break;
	// case 10:
	// sb.append(s);
	// sb.append('.');
	// break;
	// case 16:
	// sb.append("#x");
	// sb.append(s);
	// break;
	// default:
	// sb.append('#');
	// sb.append(String.valueOf(base));
	// sb.append('r');
	// sb.append(s);
	// break;
	// }
	// s = sb.toString();
	// }
	// return s;
	// }
	//
	// public BigInteger bigIntegerValue() {
	// return value;
	// }
}
