/*
 * Ratio.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Ratio.java,v 1.2 2003-03-26 21:50:29 piso Exp $
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

    public LispObject typeOf()
    {
        return Symbol.RATIO;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.RATIO)
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

    public LispObject add(LispObject obj) throws LispError
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.add(BigInteger.valueOf(((Fixnum)obj).getValue()).multiply(denominator));
            return number(n, denominator);
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
        throw new TypeError(obj, "number");
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        if (obj instanceof Fixnum) {
            BigInteger n =
                numerator.multiply(BigInteger.valueOf(((Fixnum)obj).getValue()));
            return number(n, denominator);
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(n), denominator.multiply(d));
        }
        throw new TypeError(obj, "number");
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        if (obj instanceof Fixnum) {
            return number(numerator,
                denominator.multiply(BigInteger.valueOf(((Fixnum)obj).getValue())));
        }
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator;
            BigInteger d = ((Ratio)obj).denominator;
            return number(numerator.multiply(d), denominator.multiply(n));
        }
        throw new TypeError(obj, "number");
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Ratio) {
            return numerator.equals(((Ratio)obj).numerator) &&
                denominator.equals(((Ratio)obj).denominator);
        }
        if (obj.typep(Symbol.NUMBER) == T)
            return false;
        throw new TypeError(obj, "number");
    }

//     public boolean isNotEqualTo(LispObject obj) throws LispError
//     {
//         try {
//             return value != ((Fixnum)obj).value;
//         }
//         catch (ClassCastException e) {
//             // obj is not a fixnum.
//             if (obj instanceof Bignum)
//                 return !getBigInteger().equals(Bignum.getValue(obj));
//             if (obj instanceof LispFloat)
//                 return (float) value != LispFloat.getValue(obj);
//             throw new TypeError(obj, "number");
//         }
//     }

//     public boolean isLessThan(LispObject obj) throws LispError
//     {
//         try {
//             return value < ((Fixnum)obj).value;
//         }
//         catch (ClassCastException e) {
//             // obj is not a fixnum.
//             if (obj instanceof Bignum)
//                 return getBigInteger().compareTo(Bignum.getValue(obj)) < 0;
//             if (obj instanceof LispFloat)
//                 return (float) value < LispFloat.getValue(obj);
//             throw new TypeError(obj, "number");
//         }
//     }

    public boolean isGreaterThan(LispObject obj) throws LispError
    {
        if (obj instanceof Fixnum) {
            BigInteger n2 = ((Fixnum)obj).getBigInteger().multiply(denominator);
            return numerator.compareTo(n2) > 0;
        }
        if (obj instanceof Ratio) {
            BigInteger n1 = numerator.multiply(((Ratio)obj).denominator);
            BigInteger n2 = ((Ratio)obj).numerator.multiply(denominator);
            return n1.compareTo(n2) > 0;
        }
        Thread.dumpStack();
        throw new TypeError(obj, "number");
    }

//     public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
//     {
//         try {
//             return value <= ((Fixnum)obj).value;
//         }
//         catch (ClassCastException e) {
//             // obj is not a fixnum.
//             if (obj instanceof Bignum)
//                 return getBigInteger().compareTo(Bignum.getValue(obj)) <= 0;
//             if (obj instanceof LispFloat)
//                 return (float) value <= LispFloat.getValue(obj);
//             throw new TypeError(obj, "number");
//         }
//     }

//     public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
//     {
//         try {
//             return value >= ((Fixnum)obj).value;
//         }
//         catch (ClassCastException e) {
//             // obj is not a fixnum.
//             if (obj instanceof Bignum)
//                 return getBigInteger().compareTo(Bignum.getValue(obj)) >= 0;
//             if (obj instanceof LispFloat)
//                 return (float) value >= LispFloat.getValue(obj);
//             throw new TypeError(obj, "number");
//         }
//     }

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
        LispObject[] values = new LispObject[2];
        if (remainder.signum() == 0) {
            values[0] = number(quotient);
            values[1] = Fixnum.ZERO;
            setValues(values);
            return values[0];
        }

        // Remainder is non-zero.
        if (num.signum() != den.signum())
            quotient = quotient.subtract(BigInteger.ONE);

        LispObject q = number(quotient);
        values[0] = q;
        values[1] = subtract(q.multiplyBy(obj));

        setValues(values);
        return values[0];
    }

    public int hashCode()
    {
        return numerator.hashCode() ^ denominator.hashCode();
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer(String.valueOf(numerator));
        sb.append('/');
        sb.append(String.valueOf(denominator));
        return sb.toString();
    }
}
