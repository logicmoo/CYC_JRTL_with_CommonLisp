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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class Ratio extends LispFloat
{
    private BigInteger numerator;
    private BigInteger denominator;

    public Ratio(BigInteger numerator, BigInteger denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public BigInteger numerator()
    {
        return numerator;
    }

    @Override
    public SubLObject NUMERATOR()
    {
        return number(numerator);
    }

    public BigInteger denominator()
    {
        return denominator;
    }

    @Override
    public SubLObject DENOMINATOR()
    {
        return number(denominator);
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.RATIO;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.RATIO;
    }

    @Override
    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.RATIO)
            return T;
        if (type == LispSymbols.RATIONAL)
            return T;
        if (type == LispSymbols.REAL)
            return T;
        if (type == LispSymbols.NUMBER)
            return T;
        if (type == BuiltInClass.RATIO)
            return T;
        return super.typep(type);
    }

    @Override
    public boolean isNumber()
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
    public boolean eql(SubLObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Ratio) {
            return (numerator.equals(((Ratio)obj).numerator) &&
                    denominator.equals(((Ratio)obj).denominator));
        }
        return false;
    }

    @Override
    public boolean equal(SubLObject obj)
    {
        return eql(obj);
    }

    @Override
    public boolean equalp(SubLObject obj)
    {
        if (obj instanceof Ratio) {
            return numerator.equals(((Ratio)obj).numerator) &&
                denominator.equals(((Ratio)obj).denominator);
        }
        if (obj instanceof SingleFloat) {
            return floatValue() == ((SingleFloat)obj).value;
        }
        if (obj instanceof DoubleFloat) {
            return doubleValue() == ((DoubleFloat)obj).value;
        }
        return false;
    }

    @Override
    public SubLObject ABS()
    {
        if (numerator.signum() > 0 && denominator.signum() > 0)
            return this;
        if (numerator.signum() < 0 && denominator.signum() < 0)
            return this;
        return new Ratio(numerator.negate(), denominator);
    }

    @Override
    public boolean isPositive()
    {
        return numerator.signum() == denominator.signum();
    }

    @Override
    public boolean isNegative()
    {
        return numerator.signum() != denominator.signum();
    }

    @Override
    public boolean isZero()
    {
        return false;
    }

    @Override
    public float floatValue()
    {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue()
    {
        double result = numerator.doubleValue() / denominator.doubleValue();
        if (result != 0 && !Double.isNaN(result) && !Double.isInfinite(result))
            return result;
        final boolean negative = numerator.signum() < 0;
        final BigInteger num = negative ? numerator.negate() : numerator;
        final BigInteger den = denominator;
        final int numLen = num.bitLength();
        final int denLen = den.bitLength();
        int length = Math.min(numLen, denLen);
        if (length <= 1)
            return result;
        BigInteger n = num;
        BigInteger d = den;
        final int digits = 54;
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

    @Override
    public final SubLObject inc()
    {
        return new Ratio(numerator.add(denominator), denominator);
    }

    @Override
    public final SubLObject dec()
    {
        return new Ratio(numerator.subtract(denominator), denominator);
    }

    @Override
    public SubLObject add(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.add(BigInteger.valueOf(((Fixnum)obj).value).multiply(denominator));
            return number(n, denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue();
            return number(numerator.add(n.multiply(denominator)),
                denominator);
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            if (denominator.equals(d))
                return number(numerator.add(n), denominator);
            BigInteger common = denominator.multiply(d);
            return number(numerator.multiply(d).add(n.multiply(denominator)),
                common);
        }
        if (obj instanceof SingleFloat) {
            return makeSingle(floatValue() + ((SingleFloat)obj).value);
        }
        if (obj instanceof DoubleFloat) {
            return makeDouble(doubleValue() + ((DoubleFloat)obj).value);
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(add(c.getRealPart()), c.getImaginaryPart());
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject sub(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.subtract(BigInteger.valueOf(((Fixnum)obj).value).multiply(denominator));
            return number(n, denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue();
            return number(numerator.subtract(n.multiply(denominator)),
                denominator);
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            if (denominator.equals(d))
                return number(numerator.subtract(n), denominator);
            BigInteger common = denominator.multiply(d);
            return number(numerator.multiply(d).subtract(n.multiply(denominator)),
                common);
        }
        if (obj instanceof SingleFloat) {
            return makeSingle(floatValue() - ((SingleFloat)obj).value);
        }
        if (obj instanceof DoubleFloat) {
            return makeDouble(doubleValue() - ((DoubleFloat)obj).value);
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(sub(c.getRealPart()),
                                       Fixnum.ZERO.sub(c.getImaginaryPart()));
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject mult(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n = ((Fixnum)obj).bigIntegerValue();
            return number(numerator.multiply(n), denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue();
            return number(numerator.multiply(n), denominator);
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(n), denominator.multiply(d));
        }
        if (obj instanceof SingleFloat) {
            return makeSingle(floatValue() * ((SingleFloat)obj).value);
        }
        if (obj instanceof DoubleFloat) {
            return makeDouble(doubleValue() * ((DoubleFloat)obj).value);
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return LispObjectFactory.makeComplex(mult(c.getRealPart()),
                                       mult(c.getImaginaryPart()));
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public SubLObject divideBy(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n = ((Fixnum)obj).bigIntegerValue();
            return number(numerator, denominator.multiply(n));
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue();
            return number(numerator, denominator.multiply(n));
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(d), denominator.multiply(n));
        }
        if (obj instanceof SingleFloat) {
            if (obj.isZero())
                return error(new DivisionByZero());
            return makeSingle(floatValue() / ((SingleFloat)obj).value);
        }
        if (obj instanceof DoubleFloat) {
            if (obj.isZero())
                return error(new DivisionByZero());
            return makeDouble(doubleValue() / ((DoubleFloat)obj).value);
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            // numerator
            SubLObject realPart = this.mult(c.getRealPart());
            SubLObject imagPart =
                Fixnum.ZERO.sub(this).mult(c.getImaginaryPart());
            // denominator
            SubLObject d =
                c.getRealPart().mult(c.getRealPart());
            d = d.add(c.getImaginaryPart().mult(c.getImaginaryPart()));
            return LispObjectFactory.makeComplex(realPart.divideBy(d),
                                       imagPart.divideBy(d));
        }
        return error(new TypeError(obj, LispSymbols.NUMBER));
    }

    @Override
    public boolean numE(SubLObject obj)
    {
        if (obj instanceof Ratio)
            return (numerator.equals(((Ratio)obj).numerator) &&
                    denominator.equals(((Ratio)obj).denominator));
        if (obj instanceof SingleFloat)
            return numE(((SingleFloat)obj).rational());
        if (obj instanceof DoubleFloat)
            return numE(((DoubleFloat)obj).rational());
        if (obj.isNumber())
            return false;
        error(new TypeError(obj, LispSymbols.NUMBER));
        // Not reached.
        return false;
    }

    @Override
    public boolean isNotEqualTo(SubLObject obj)
    {
        return !numE(obj);
    }

    @Override
    public boolean numL(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n2) < 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n) < 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) < 0;
        }
        if (obj instanceof SingleFloat)
            return numL(((SingleFloat)obj).rational());
        if (obj instanceof DoubleFloat)
            return numL(((DoubleFloat)obj).rational());
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numG(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n2) > 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n) > 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) > 0;
        }
        if (obj instanceof SingleFloat)
            return numG(((SingleFloat)obj).rational());
        if (obj instanceof DoubleFloat)
            return numG(((DoubleFloat)obj).rational());
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numLE(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n2) <= 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n) <= 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) <= 0;
        }
        if (obj instanceof SingleFloat)
            return numLE(((SingleFloat)obj).rational());
        if (obj instanceof DoubleFloat)
            return numLE(((DoubleFloat)obj).rational());
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public boolean numGE(SubLObject obj)
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n2) >= 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).bigIntegerValue().multiply(denominator);
            return numerator.compareTo(n) >= 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) >= 0;
        }
        if (obj instanceof SingleFloat)
            return numGE(((SingleFloat)obj).rational());
        if (obj instanceof DoubleFloat)
            return numGE(((DoubleFloat)obj).rational());
        error(new TypeError(obj, LispSymbols.REAL));
        // Not reached.
        return false;
    }

    @Override
    public SubLObject truncate(SubLObject obj)
    {
        // "When rationals and floats are combined by a numerical function,
        // the rational is first converted to a float of the same format."
        // 12.1.4.1
        if (obj instanceof SingleFloat)
            return makeSingle(floatValue()).truncate(obj);
        if (obj instanceof DoubleFloat)
            return makeDouble(doubleValue()).truncate(obj);
        BigInteger n, d;
	try {
	  if (obj instanceof Fixnum) {
            n = ((Fixnum)obj).bigIntegerValue();
            d = BigInteger.ONE;
	  } else if (obj instanceof Bignum) {
            n = ((Bignum)obj).bigIntegerValue();
            d = BigInteger.ONE;
	  } else if (obj instanceof Ratio) {
            n = ((Ratio)obj).numerator();
            d = ((Ratio)obj).denominator();
	  } else {
            return error(new TypeError(obj, LispSymbols.NUMBER));
	  }
	  // Invert and multiply.
	  BigInteger num = numerator.multiply(d);
	  BigInteger den = denominator.multiply(n);
	  BigInteger quotient = num.divide(den);
	  // Multiply quotient by divisor.
	  SubLObject product = number(quotient.multiply(n), d);
	  // Subtract to get remainder.
	  SubLObject remainder = sub(product);
          return LispThread.currentThread().setValues(number(quotient), remainder);
        }
        catch (ArithmeticException e) {
            if (obj.isZero())
                return error(new DivisionByZero());
            return error(new ArithmeticError(e.getMessage()));
        }
    }

    @Override
    public int hashCodeLisp()
    {
        return numerator.hashCode() ^ denominator.hashCode();
    }

    @Override
    public String writeToString()
    {
        final LispThread thread = LispThread.currentThread();
        int base = LispSymbols.PRINT_BASE.symbolValue(thread).intValue();
        StringBuffer sb = new StringBuffer(numerator.toString(base));
        sb.append('/');
        sb.append(denominator.toString(base));
        String s = sb.toString().toUpperCase();
        if (LispSymbols.PRINT_RADIX.symbolValue(thread) != NIL) {
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
