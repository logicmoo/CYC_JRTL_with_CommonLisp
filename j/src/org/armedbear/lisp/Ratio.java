/*
 * Ratio.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Ratio.java,v 1.11 2003-06-23 11:11:16 piso Exp $
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

    public BigInteger denominator()
    {
        return denominator;
    }

    public int getType()
    {
        return TYPE_RATIO;
    }

    public LispObject typeOf()
    {
        return Symbol.RATIO;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.RATIO)
            return T;
        if (typeSpecifier == Symbol.RATIONAL)
            return T;
        if (typeSpecifier == Symbol.REAL)
            return T;
        if (typeSpecifier == Symbol.NUMBER)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject constantp()
    {
        return T;
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

    public float floatValue()
    {
        return numerator.floatValue() / denominator.floatValue();
    }

    public LispObject add(LispObject obj) throws LispError
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
        throw new TypeError(obj, "number");
    }

    public LispObject subtract(LispObject obj) throws LispError
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
        throw new TypeError(obj, "number");
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
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
        throw new TypeError(obj, "number");
    }

    public LispObject divideBy(LispObject obj) throws LispError
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
            return new LispFloat(floatValue() / ((LispFloat)obj).getValue());
        }
        throw new TypeError(obj, "number");
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Ratio) {
            return numerator.equals(((Ratio)obj).numerator) &&
                denominator.equals(((Ratio)obj).denominator);
        }
        if (obj instanceof LispFloat) {
            return floatValue() == ((LispFloat)obj).getValue();
        }
        if (obj.typep(Symbol.NUMBER) == T)
            return false;
        throw new TypeError(obj, "number");
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        return !isEqualTo(obj);
    }

    public boolean isLessThan(LispObject obj) throws LispError
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
        throw new TypeError(obj, "real");
    }

    public boolean isGreaterThan(LispObject obj) throws LispError
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
        throw new TypeError(obj, "real");
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
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
        throw new TypeError(obj, "real");
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
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
        throw new TypeError(obj, "real");
    }

    public LispObject floor(LispObject obj) throws LispError
    {
        BigInteger n, d;
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
            throw new TypeError(obj, "number");
        }

        // Invert and multiply.
        BigInteger num = numerator.multiply(d);
        BigInteger den = denominator.multiply(n);

        BigInteger[] results = num.divideAndRemainder(den);
        BigInteger quotient = results[0];
        BigInteger remainder = results[1];
        final LispThread thread = LispThread.currentThread();
        LispObject[] values = new LispObject[2];
        if (remainder.signum() == 0) {
            values[0] = number(quotient);
            values[1] = Fixnum.ZERO;
            thread.setValues(values);
            return values[0];
        }

        // Remainder is non-zero.
        if (num.signum() != den.signum())
            quotient = quotient.subtract(BigInteger.ONE);

        LispObject q = number(quotient);
        values[0] = q;
        values[1] = subtract(q.multiplyBy(obj));

        thread.setValues(values);
        return values[0];
    }

    public int hashCode()
    {
        return numerator.hashCode() ^ denominator.hashCode();
    }

    public String toString()
    {
        final LispThread thread = LispThread.currentThread();
        int base;
        try {
            base = Fixnum.getValue(_PRINT_BASE_.symbolValueNoThrow(thread));
        }
        catch (Throwable t) {
            Debug.trace(t);
            base = 10;
        }
        StringBuffer sb = new StringBuffer(numerator.toString(base));
        sb.append('/');
        sb.append(denominator.toString(base));
        String s = sb.toString().toUpperCase();
        if (_PRINT_RADIX_.symbolValueNoThrow(thread) != NIL) {
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
