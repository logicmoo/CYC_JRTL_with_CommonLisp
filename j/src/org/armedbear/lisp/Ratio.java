/*
 * Ratio.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Ratio.java,v 1.41 2004-05-27 17:00:13 piso Exp $
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
 */

package org.armedbear.lisp;

import java.math.BigInteger;

public final class Ratio extends LispObject
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

    public LispObject NUMERATOR()
    {
        return number(numerator);
    }

    public BigInteger denominator()
    {
        return denominator;
    }

    public LispObject DENOMINATOR()
    {
        return number(denominator);
    }

    public LispObject typeOf()
    {
        return Symbol.RATIO;
    }

    public LispClass classOf()
    {
        return BuiltInClass.RATIO;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.RATIO)
            return T;
        if (type == Symbol.RATIONAL)
            return T;
        if (type == Symbol.REAL)
            return T;
        if (type == Symbol.NUMBER)
            return T;
        if (type == BuiltInClass.RATIO)
            return T;
        return super.typep(type);
    }

    public LispObject NUMBERP()
    {
        return T;
    }

    public boolean numberp()
    {
        return true;
    }

    public boolean rationalp()
    {
        return true;
    }

    public boolean realp()
    {
        return true;
    }

    public boolean eql(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Ratio) {
            return numerator.equals(((Ratio)obj).numerator) &&
                denominator.equals(((Ratio)obj).denominator);
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        return eql(obj);
    }

    public boolean equalp(LispObject obj)
    {
        if (obj instanceof Ratio) {
            return numerator.equals(((Ratio)obj).numerator) &&
                denominator.equals(((Ratio)obj).denominator);
        }
        if (obj instanceof LispFloat) {
            return floatValue() == ((LispFloat)obj).getValue();
        }
        return false;
    }

    public LispObject ABS()
    {
        if (numerator.signum() > 0 && denominator.signum() > 0)
            return this;
        if (numerator.signum() < 0 && denominator.signum() < 0)
            return this;
        return new Ratio(numerator.negate(), denominator);
    }

    public boolean plusp()
    {
        return numerator.signum() == denominator.signum();
    }

    public boolean minusp()
    {
        return numerator.signum() != denominator.signum();
    }

    public boolean zerop()
    {
        return false;
    }

    public double floatValue()
    {
        double result = numerator.doubleValue() / denominator.doubleValue();
        if (!Double.isNaN(result))
            return result;
        boolean negative = numerator.signum() < 0;
        BigInteger n = negative ? numerator.negate() : numerator;
        BigInteger d = denominator;
        int numLen = n.bitLength();
        int denLen = d.bitLength();
        int maxLength = Math.max(numLen, denLen);
        int shift = maxLength - 52;
        n = n.shiftRight(shift);
        d = d.shiftRight(shift);
        result = n.doubleValue() / d.doubleValue();
        return negative ? -result : result;
    }

    public final LispObject incr() throws ConditionThrowable
    {
        return new Ratio(numerator.add(denominator), denominator);
    }

    public final LispObject decr() throws ConditionThrowable
    {
        return new Ratio(numerator.subtract(denominator), denominator);
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.add(BigInteger.valueOf(((Fixnum)obj).getValue()).multiply(denominator));
            return number(n, denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue();
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
        if (obj instanceof LispFloat) {
            return new LispFloat(floatValue() + ((LispFloat)obj).getValue());
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(add(c.getRealPart()), c.getImaginaryPart());
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.subtract(BigInteger.valueOf(((Fixnum)obj).getValue()).multiply(denominator));
            return number(n, denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue();
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
        if (obj instanceof LispFloat) {
            return new LispFloat(floatValue() - ((LispFloat)obj).getValue());
        }
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return Complex.getInstance(subtract(c.getRealPart()),
                                       Fixnum.ZERO.subtract(c.getImaginaryPart()));
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n = ((Fixnum)obj).getBigInteger();
            return number(numerator.multiply(n), denominator);
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue();
            return number(numerator.multiply(n), denominator);
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(n), denominator.multiply(d));
        }
        if (obj instanceof LispFloat) {
            return new LispFloat(floatValue() * ((LispFloat)obj).getValue());
        }
        return signal(new TypeError(obj, "number"));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n = ((Fixnum)obj).getBigInteger();
            return number(numerator, denominator.multiply(n));
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue();
            return number(numerator, denominator.multiply(n));
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(d), denominator.multiply(n));
        }
        if (obj instanceof LispFloat) {
            if (obj.zerop())
                return signal(new DivisionByZero());
            return new LispFloat(floatValue() / ((LispFloat)obj).getValue());
        }
        return signal(new TypeError(obj, "number"));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Ratio)
            return (numerator.equals(((Ratio)obj).numerator) &&
                    denominator.equals(((Ratio)obj).denominator));
        if (obj instanceof LispFloat)
            return floatValue() == ((LispFloat)obj).getValue();
        if (obj.numberp())
            return false;
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        return !isEqualTo(obj);
    }

    public boolean isLessThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).getBigInteger().multiply(denominator);
            return numerator.compareTo(n2) < 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue().multiply(denominator);
            return numerator.compareTo(n) < 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) < 0;
        }
        if (obj instanceof LispFloat) {
            return floatValue() < ((LispFloat)obj).getValue();
        }
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThan(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).getBigInteger().multiply(denominator);
            return numerator.compareTo(n2) > 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue().multiply(denominator);
            return numerator.compareTo(n) > 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) > 0;
        }
        if (obj instanceof LispFloat) {
            return floatValue() > ((LispFloat)obj).getValue();
        }
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).getBigInteger().multiply(denominator);
            return numerator.compareTo(n2) <= 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue().multiply(denominator);
            return numerator.compareTo(n) <= 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) <= 0;
        }
        if (obj instanceof LispFloat) {
            return floatValue() <= ((LispFloat)obj).getValue();
        }
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).getBigInteger().multiply(denominator);
            return numerator.compareTo(n2) >= 0;
        }
        if (obj instanceof Bignum) {
            BigInteger n = ((Bignum)obj).getValue().multiply(denominator);
            return numerator.compareTo(n) >= 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) >= 0;
        }
        if (obj instanceof LispFloat) {
            return floatValue() >= ((LispFloat)obj).getValue();
        }
        signal(new TypeError(obj, "real"));
        // Not reached.
        return false;
    }

    public LispObject truncate(LispObject obj) throws ConditionThrowable
    {
        BigInteger n, d;
	try {
	  if (obj instanceof Fixnum) {
            n = ((Fixnum)obj).getBigInteger();
            d = BigInteger.ONE;
	  } else if (obj instanceof Bignum) {
            n = ((Bignum)obj).getValue();
            d = BigInteger.ONE;
	  } else if (obj instanceof Ratio) {
            n = ((Ratio)obj).numerator();
            d = ((Ratio)obj).denominator();
	  } else {
            Thread.dumpStack();
            return signal(new TypeError(obj, "number"));
	  }

	  // Invert and multiply.
	  BigInteger num = numerator.multiply(d);
	  BigInteger den = denominator.multiply(n);
	  BigInteger quotient = num.divide(den);

	  // Multiply quotient by divisor.
	  LispObject product = number(quotient.multiply(n), d);

	  // Subtract to get remainder.
	  LispObject remainder = subtract(product);

          return LispThread.currentThread().setValues(number(quotient), remainder);
        }
        catch (ArithmeticException e) {
            if (obj.zerop())
                return signal(new DivisionByZero());
            return signal(new ArithmeticError(e.getMessage()));
        }
    }

    public int hashCode()
    {
        return numerator.hashCode() ^ denominator.hashCode();
    }

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        int base = Fixnum.getValue(_PRINT_BASE_.symbolValue(thread));
        StringBuffer sb = new StringBuffer(numerator.toString(base));
        sb.append('/');
        sb.append(denominator.toString(base));
        String s = sb.toString().toUpperCase();
        if (_PRINT_RADIX_.symbolValue(thread) != NIL) {
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
