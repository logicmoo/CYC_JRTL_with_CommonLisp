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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class Fixnum extends LispInteger
{
  public static final int MAX_POS_CACHE = 256;//just like before - however never set this to less than 256
  public static final Fixnum[] constants = new Fixnum[MAX_POS_CACHE];
  static
  {
    for (int i = 0; i < MAX_POS_CACHE; i++)
      constants[i] = new Fixnum(i);
  }

  public static final Fixnum ZERO      = constants[0];
  public static final Fixnum ONE       = constants[1];
  public static final Fixnum TWO       = constants[2];
  public static final Fixnum THREE     = constants[3];

  public static final Fixnum MINUS_ONE = LispObjectFactory.makeInteger(-1);

  @Deprecated
  final public int getValue(SubLObject a) throws Throwable {
  	return a.intValue();
  }
  
  public final int value;

  // set to private to hunt down sneaky creators
  protected Fixnum(int value)
  {
    this.value = value;
  }

  @Override
  public Object javaInstance()
  {
    return Integer.valueOf(value);
  }

  @Override
  public Object javaInstance(Class c)
  {
    String cn = c.getName();
    if (cn.equals("java.lang.Byte") || cn.equals("byte"))
      return Byte.valueOf((byte)value);
    if (cn.equals("java.lang.Short") || cn.equals("short"))
      return Short.valueOf((short)value);
    if (cn.equals("java.lang.Long") || cn.equals("long"))
      return Long.valueOf((long)value);
    return javaInstance();
  }

  @Override
  public SubLObject typeOf()
  {
    if (value == 0 || value == 1)
      return LispSymbols.BIT;
    if (value > 1)
      return list(LispSymbols.INTEGER, ZERO, LispObjectFactory.makeInteger(Integer.MAX_VALUE));
    return LispSymbols.FIXNUM;
  }

  @Override
  public SubLObject classOf()
  {
    return BuiltInClass.FIXNUM;
  }

  @Override
  public SubLObject getDescription()
  {
    StringBuffer sb = new StringBuffer("The fixnum ");
    sb.append(value);
    return makeString(sb);
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type instanceof SubLSymbol)
      {
        if (type == LispSymbols.FIXNUM)
          return T;
        if (type == LispSymbols.INTEGER)
          return T;
        if (type == LispSymbols.RATIONAL)
          return T;
        if (type == LispSymbols.REAL)
          return T;
        if (type == LispSymbols.NUMBER)
          return T;
        if (type == LispSymbols.SIGNED_BYTE)
          return T;
        if (type == LispSymbols.UNSIGNED_BYTE)
          return value >= 0 ? T : NIL;
        if (type == LispSymbols.BIT)
          return (value == 0 || value == 1) ? T : NIL;
      }
    else if (type instanceof LispClass)
      {
        if (type == BuiltInClass.FIXNUM)
          return T;
        if (type == BuiltInClass.INTEGER)
          return T;
        if (type == BuiltInClass.RATIONAL)
          return T;
        if (type == BuiltInClass.REAL)
          return T;
        if (type == BuiltInClass.NUMBER)
          return T;
      }
    else if (type instanceof SubLCons)
      {
        if (type.equal(UNSIGNED_BYTE_8))
          return (value >= 0 && value <= 255) ? T : NIL;
        if (type.equal(UNSIGNED_BYTE_16))
          return (value >= 0 && value <= 65535) ? T : NIL;
        if (type.equal(UNSIGNED_BYTE_32))
          return value >= 0 ? T : NIL;
      }
    return super.typep(type);
  }

  @Override
  public boolean isNumber()
  {
    return true;
  }

  @Override
  public boolean isInteger()
  {
    return true;
  }

  @Override
  public boolean rationalp()
  {
    return true;
  }

  @Override
  public boolean realp()
  {
    return true;
  }

  @Override
  public boolean eql(int n)
  {
    return value == n;
  }

  @Override
  public boolean eql(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof Fixnum)
      {
        if (value == ((Fixnum)obj).value)
          return true;
      }
    return false;
  }

  @Override
  public boolean equal(int n)
  {
    return value == n;
  }

  @Override
  public boolean equal(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof Fixnum)
      {
        if (value == ((Fixnum)obj).value)
          return true;
      }
    return false;
  }

  @Override
  public boolean equalp(int n)
  {
    return value == n;
  }

  @Override
  public boolean equalp(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value == ((Fixnum)obj).value;
    if (obj instanceof SingleFloat)
      return value == ((SingleFloat)obj).value;
    if (obj instanceof DoubleFloat)
      return value == ((DoubleFloat)obj).value;
    return false;
  }

  @Override
  public SubLObject ABS()
  {
    if (value >= 0)
      return this;
    return LispObjectFactory.makeInteger(-(long)value);
  }

  @Override
  public SubLObject NUMERATOR()
  {
    return this;
  }

  @Override
  public SubLObject DENOMINATOR()
  {
    return ONE;
  }

  @Override
  public boolean isEven()
  {
    return (value & 0x01) == 0;
  }

  @Override
  public boolean isOdd()
  {
    return (value & 0x01) != 0;
  }

  @Override
  public boolean isPositive()
  {
    return value > 0;
  }

  @Override
  public boolean isNegative()
  {
    return value < 0;
  }

  @Override
  public boolean isZero()
  {
    return value == 0;
  }

  @Override
  public float floatValue() {
    return (float)value;
  }

  @Override
  public double doubleValue() {
    return (double)value;
  }
  
// not used anywhere
//  public static int getInt(LispObject obj)
//  {
//          if (obj instanceof Fixnum) return ((Fixnum)obj).value;
//          type_error(obj, LispSymbols.FIXNUM);
//      // Not reached.
//          return 0;
//  }

  public static BigInteger getBigInteger(SubLObject obj)
  {
          if (obj instanceof Fixnum) return BigInteger.valueOf(((Fixnum)obj).value);
          type_error(obj, LispSymbols.FIXNUM);
      // Not reached.
          return null;
  }

  @Override
  public int intValue()
  {
    return value;
  }

  @Override
  public long longValue()
  {
    return (long) value;
  }

  public final BigInteger bigIntegerValue()
  {
    return BigInteger.valueOf(value);
  }

  @Override
  public final SubLObject inc()
  {
    return LispObjectFactory.makeInteger(1 + (long)value);
  }

  @Override
  public final SubLObject dec()
  {
    return LispObjectFactory.makeInteger(-1 + (long)value);
  }

  @Override
  public SubLObject negate()
  {
    return LispObjectFactory.makeInteger((-(long)value));
  }

  @Override
  public SubLObject add(int n)
  {
    return LispObjectFactory.makeInteger((long) value + n);
  }

  @Override
  public SubLObject add(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      {
        long result = (long) value + ((Fixnum)obj).value;
        return LispObjectFactory.makeInteger(result);
      }
    if (obj instanceof Bignum)
      return number(bigIntegerValue().add(((Bignum)obj).bigIntegerValue()));
    if (obj instanceof Ratio)
      {
        BigInteger numerator = ((Ratio)obj).numerator();
        BigInteger denominator = ((Ratio)obj).denominator();
        return number(bigIntegerValue().multiply(denominator).add(numerator),
                      denominator);
      }
    if (obj instanceof SingleFloat)
      return makeSingle(value + ((SingleFloat)obj).value);
    if (obj instanceof DoubleFloat)
      return makeDouble(value + ((DoubleFloat)obj).value);
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return LispObjectFactory.makeComplex(add(c.getRealPart()), c.getImaginaryPart());
      }
    return type_error(obj, LispSymbols.NUMBER);
  }

  @Override
  public SubLObject subtract(int n)
  {
    return LispObjectFactory.makeInteger((long)value - n);
  }

  @Override
  public SubLObject sub(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return number((long) value - ((Fixnum)obj).value);
    if (obj instanceof Bignum)
      return number(bigIntegerValue().subtract(obj.bigIntegerValue()));
    if (obj instanceof Ratio)
      {
        BigInteger numerator = ((Ratio)obj).numerator();
        BigInteger denominator = ((Ratio)obj).denominator();
        return number(
          bigIntegerValue().multiply(denominator).subtract(numerator),
          denominator);
      }
    if (obj instanceof SingleFloat)
      return makeSingle(value - ((SingleFloat)obj).value);
    if (obj instanceof DoubleFloat)
      return makeDouble(value - ((DoubleFloat)obj).value);
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return LispObjectFactory.makeComplex(sub(c.getRealPart()),
                                   ZERO.sub(c.getImaginaryPart()));
      }
    return type_error(obj, LispSymbols.NUMBER);
  }

  @Override
  public SubLObject multiplyBy(int n)
  {
    long result = (long) value * n;
    return LispObjectFactory.makeInteger(result);
  }

  @Override
  public SubLObject mult(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      {
        long result = (long) value * ((Fixnum)obj).value;
        return LispObjectFactory.makeInteger(result);
      }
    if (obj instanceof Bignum)
      return number(bigIntegerValue().multiply(((Bignum)obj).bigIntegerValue()));
    if (obj instanceof Ratio)
      {
        BigInteger numerator = ((Ratio)obj).numerator();
        BigInteger denominator = ((Ratio)obj).denominator();
        return number(
          bigIntegerValue().multiply(numerator),
          denominator);
      }
    if (obj instanceof SingleFloat)
      return makeSingle(value * ((SingleFloat)obj).value);
    if (obj instanceof DoubleFloat)
      return makeDouble(value * ((DoubleFloat)obj).value);
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return LispObjectFactory.makeComplex(mult(c.getRealPart()),
                                   mult(c.getImaginaryPart()));
      }
    return type_error(obj, LispSymbols.NUMBER);
  }

  @Override
  public SubLObject divideBy(SubLObject obj)
  {
    try
      {
        if (obj instanceof Fixnum)
          {
            final int divisor = ((Fixnum)obj).value;
            // (/ MOST-NEGATIVE-FIXNUM -1) is a bignum.
            if (value > Integer.MIN_VALUE)
              if (value % divisor == 0)
                return LispObjectFactory.makeInteger(value / divisor);
            return number(BigInteger.valueOf(value),
                          BigInteger.valueOf(divisor));
          }
        if (obj instanceof Bignum)
          return number(bigIntegerValue(), ((Bignum)obj).bigIntegerValue());
        if (obj instanceof Ratio)
          {
            BigInteger numerator = ((Ratio)obj).numerator();
            BigInteger denominator = ((Ratio)obj).denominator();
            return number(bigIntegerValue().multiply(denominator),
                          numerator);
          }
        if (obj instanceof SingleFloat)
          return makeSingle(value / ((SingleFloat)obj).value);
        if (obj instanceof DoubleFloat)
          return makeDouble(value / ((DoubleFloat)obj).value);
        if (obj instanceof Complex)
          {
            Complex c = (Complex) obj;
            SubLObject realPart = c.getRealPart();
            SubLObject imagPart = c.getImaginaryPart();
            SubLObject denominator =
              realPart.mult(realPart).add(imagPart.mult(imagPart));
            return LispObjectFactory.makeComplex(mult(realPart).divideBy(denominator),
                                       Fixnum.ZERO.sub(mult(imagPart).divideBy(denominator)));
          }
        return type_error(obj, LispSymbols.NUMBER);
      }
    catch (ArithmeticException e)
      {
        if (obj.isZero())
          return error(new DivisionByZero());
        return error(new ArithmeticError(e.getMessage()));
      }
  }

  @Override
  public boolean isEqualTo(int n)
  {
    return value == n;
  }

  @Override
  public boolean numE(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value == ((Fixnum)obj).value;
    if (obj instanceof SingleFloat)
      return numE(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return value == ((DoubleFloat)obj).value;
    if (obj instanceof Complex)
      return obj.numE(this);
    if (obj.isNumber())
      return false;
    type_error(obj, LispSymbols.NUMBER);
    // Not reached.
    return false;
  }

  @Override
  public boolean isNotEqualTo(int n)
  {
    return value != n;
  }

  @Override
  public boolean isNotEqualTo(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value != ((Fixnum)obj).value;
    // obj is not a fixnum.
    if (obj instanceof SingleFloat)
      return isNotEqualTo(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return value != ((DoubleFloat)obj).value;
    if (obj instanceof Complex)
      return obj.isNotEqualTo(this);
    if (obj.isNumber())
      return true;
    type_error(obj, LispSymbols.NUMBER);
    // Not reached.
    return false;
  }

  @Override
  public boolean isLessThan(int n)
  {
    return value < n;
  }

  @Override
  public boolean numL(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value < ((Fixnum)obj).value;
    if (obj instanceof Bignum)
      return bigIntegerValue().compareTo(obj.bigIntegerValue()) < 0;
    if (obj instanceof Ratio)
      {
        BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
        return n.compareTo(((Ratio)obj).numerator()) < 0;
      }
    if (obj instanceof SingleFloat)
      return numL(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return numL(((DoubleFloat)obj).rational());
    type_error(obj, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  @Override
  public boolean isGreaterThan(int n)
  {
    return value > n;
  }

  @Override
  public boolean numG(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value > ((Fixnum)obj).value;
    if (obj instanceof Bignum)
      return bigIntegerValue().compareTo(obj.bigIntegerValue()) > 0;
    if (obj instanceof Ratio)
      {
        BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
        return n.compareTo(((Ratio)obj).numerator()) > 0;
      }
    if (obj instanceof SingleFloat)
      return numG(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return numG(((DoubleFloat)obj).rational());
    type_error(obj, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  @Override
  public boolean isLessThanOrEqualTo(int n)
  {
    return value <= n;
  }

  @Override
  public boolean numLE(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value <= ((Fixnum)obj).value;
    if (obj instanceof Bignum)
      return bigIntegerValue().compareTo(obj.bigIntegerValue()) <= 0;
    if (obj instanceof Ratio)
      {
        BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
        return n.compareTo(((Ratio)obj).numerator()) <= 0;
      }
    if (obj instanceof SingleFloat)
      return numLE(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return numLE(((DoubleFloat)obj).rational());
    type_error(obj, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  @Override
  public boolean isGreaterThanOrEqualTo(int n)
  {
    return value >= n;
  }

  @Override
  public boolean numGE(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return value >= ((Fixnum)obj).value;
    if (obj instanceof Bignum)
      return bigIntegerValue().compareTo(obj.bigIntegerValue()) >= 0;
    if (obj instanceof Ratio)
      {
        BigInteger n = bigIntegerValue().multiply(((Ratio)obj).denominator());
        return n.compareTo(((Ratio)obj).numerator()) >= 0;
      }
    if (obj instanceof SingleFloat)
      return numGE(((SingleFloat)obj).rational());
    if (obj instanceof DoubleFloat)
      return numGE(((DoubleFloat)obj).rational());
    type_error(obj, LispSymbols.REAL);
    // Not reached.
    return false;
  }

  @Override
  public SubLObject truncate(SubLObject obj)
  {
    final LispThread thread = LispThread.currentThread();
    final SubLObject value1, value2;
    try
      {
        if (obj instanceof Fixnum)
          {
            int divisor = ((Fixnum)obj).value;
            int quotient = value / divisor;
            int remainder = value % divisor;
            value1 = LispObjectFactory.makeInteger(quotient);
            value2 = remainder == 0 ? Fixnum.ZERO : LispObjectFactory.makeInteger(remainder);
          }
        else if (obj instanceof Bignum)
          {
            BigInteger val = bigIntegerValue();
            BigInteger divisor = ((Bignum)obj).bigIntegerValue();
            BigInteger[] results = val.divideAndRemainder(divisor);
            BigInteger quotient = results[0];
            BigInteger remainder = results[1];
            value1 = number(quotient);
            value2 = (remainder.signum() == 0) ? Fixnum.ZERO : number(remainder);
          }
        else if (obj instanceof Ratio)
          {
            Ratio divisor = (Ratio) obj;
            SubLObject quotient =
              mult(divisor.DENOMINATOR()).truncate(divisor.NUMERATOR());
            SubLObject remainder =
              sub(quotient.mult(divisor));
            value1 = quotient;
            value2 = remainder;
          }
        else if (obj instanceof SingleFloat)
          {
            // "When rationals and floats are combined by a numerical function,
            // the rational is first converted to a float of the same format."
            // 12.1.4.1
            return makeSingle(value).truncate(obj);
          }
        else if (obj instanceof DoubleFloat)
          {
            // "When rationals and floats are combined by a numerical function,
            // the rational is first converted to a float of the same format."
            // 12.1.4.1
            return makeDouble(value).truncate(obj);
          }
        else
          return type_error(obj, LispSymbols.REAL);
      }
    catch (ArithmeticException e)
      {
        if (obj.isZero())
          return error(new DivisionByZero());
        else
          return error(new ArithmeticError(e.getMessage()));
      }
    return thread.setValues(value1, value2);
  }

  @Override
  public SubLObject MOD(SubLObject divisor)
  {
    if (divisor instanceof Fixnum)
      return MOD(((Fixnum)divisor).value);
    return super.MOD(divisor);
  }

  @Override
  public SubLObject MOD(int divisor)
  {
    final int r;
    try
      {
        r = value % divisor;
      }
    catch (ArithmeticException e)
      {
        return error(new ArithmeticError("Division by zero."));
      }
    if (r == 0)
      return Fixnum.ZERO;
    if (divisor < 0)
      {
        if (value > 0)
          return LispObjectFactory.makeInteger(r + divisor);
      }
    else
      {
        if (value < 0)
          return LispObjectFactory.makeInteger(r + divisor);
      }
    return LispObjectFactory.makeInteger(r);
  }

  @Override
  public SubLObject ash(int shift)
  {
    if (value == 0)
      return this;
    if (shift == 0)
      return this;
    long n = value;
    if (shift <= -32)
      {
        // Right shift.
        return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
      }
    if (shift < 0)
      return LispObjectFactory.makeInteger((int)(n >> -shift));
    if (shift <= 32)
      {
        n = n << shift;
        return LispObjectFactory.makeInteger(n);
      }
    // BigInteger.shiftLeft() succumbs to a stack overflow if shift
    // is Integer.MIN_VALUE, so...
    if (shift == Integer.MIN_VALUE)
      return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
    return number(BigInteger.valueOf(value).shiftLeft(shift));
  }

  @Override
  public SubLObject ash(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return ash(((Fixnum)obj).value);
    if (obj instanceof Bignum)
      {
        if (value == 0)
          return this;
        BigInteger n = BigInteger.valueOf(value);
        BigInteger shift = ((Bignum)obj).bigIntegerValue();
        if (shift.signum() > 0)
          return error(new LispError("Can't represent result of left shift."));
        if (shift.signum() < 0)
          return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
        Debug.bug(); // Shouldn't happen.
      }
    return type_error(obj, LispSymbols.INTEGER);
  }

  @Override
  public SubLObject LOGNOT()
  {
    return LispObjectFactory.makeInteger(~value);
  }

  @Override
  public SubLObject LOGAND(int n)
  {
    return LispObjectFactory.makeInteger(value & n);
  }

  @Override
  public SubLObject LOGAND(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return LispObjectFactory.makeInteger(value & ((Fixnum)obj).value);
    if (obj instanceof Bignum)
      {
        if (value >= 0)
          {
            int n2 = (((Bignum)obj).bigIntegerValue()).intValue();
            return LispObjectFactory.makeInteger(value & n2);
          }
        else
          {
            BigInteger n1 = bigIntegerValue();
            BigInteger n2 = ((Bignum)obj).bigIntegerValue();
            return number(n1.and(n2));
          }
      }
    return type_error(obj, LispSymbols.INTEGER);
  }

  @Override
  public SubLObject LOGIOR(int n)
  {
    return LispObjectFactory.makeInteger(value | n);
  }

  @Override
  public SubLObject LOGIOR(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return LispObjectFactory.makeInteger(value | ((Fixnum)obj).value);
    if (obj instanceof Bignum)
      {
        BigInteger n1 = bigIntegerValue();
        BigInteger n2 = ((Bignum)obj).bigIntegerValue();
        return number(n1.or(n2));
      }
    return type_error(obj, LispSymbols.INTEGER);
  }

  @Override
  public SubLObject LOGXOR(int n)
  {
    return LispObjectFactory.makeInteger(value ^ n);
  }

  @Override
  public SubLObject LOGXOR(SubLObject obj)
  {
    if (obj instanceof Fixnum)
      return LispObjectFactory.makeInteger(value ^ ((Fixnum)obj).value);
    if (obj instanceof Bignum)
      {
        BigInteger n1 = bigIntegerValue();
        BigInteger n2 = ((Bignum)obj).bigIntegerValue();
        return number(n1.xor(n2));
      }
    return type_error(obj, LispSymbols.INTEGER);
  }

  @Override
  public SubLObject LDB(int size, int position)
  {
    long n = (long) value >> position;
    long mask = (1L << size) - 1;
    return number(n & mask);
  }

  final static BigInteger BIGINTEGER_TWO = new BigInteger ("2");

  /** Computes fixnum^bignum, returning a fixnum or a bignum.
    */
  public SubLObject pow(SubLObject obj)
  {
    BigInteger y = obj.bigIntegerValue();

    if (y.compareTo (BigInteger.ZERO) < 0)
      return (LispObjectFactory.makeInteger(1)).divideBy(this.pow(LispObjectFactory.makeInteger(y.negate())));

    if (y.compareTo(BigInteger.ZERO) == 0)
      // No need to test base here; CLHS says 0^0 == 1.
      return LispObjectFactory.makeInteger(1);
      
    int x = this.value;

    if (x == 0)
      return LispObjectFactory.makeInteger(0);

    if (x == 1)
      return LispObjectFactory.makeInteger(1);

    BigInteger xy = BigInteger.ONE;
    BigInteger term = BigInteger.valueOf((long) x);

    while (! y.equals(BigInteger.ZERO))
    {
      if (y.testBit(0))
        xy = xy.multiply(term);

      term = term.multiply(term);
      y = y.shiftLeft(1);
    }

    return LispObjectFactory.makeInteger(xy);
  }

  @Override
  public int hashCodeLisp()
  {
    return value;
  }

  @Override
  public String writeToString()
  {
    final LispThread thread = LispThread.currentThread();
    int base = LispSymbols.PRINT_BASE.symbolValue(thread).intValue();
    String s = Integer.toString(value, base).toUpperCase();
    if (LispSymbols.PRINT_RADIX.symbolValue(thread) != NIL)
      {
        StringBuilder sb = new StringBuilder();
        switch (base)
          {
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
