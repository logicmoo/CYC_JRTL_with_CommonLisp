/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Fixnum.java,v 1.23 2003-03-24 18:02:37 piso Exp $
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

public final class Fixnum extends LispObject
{
    public static final Fixnum ZERO = new Fixnum(0);
    public static final Fixnum ONE  = new Fixnum(1);

    private final int value;

    public Fixnum(int value)
    {
        this.value = value;
    }

    public LispObject typeOf()
    {
        return Symbol.FIXNUM;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.FIXNUM)
            return T;
        if (typeSpecifier == Symbol.INTEGER)
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
        if (obj instanceof Fixnum) {
            if (value == ((Fixnum)obj).value)
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Fixnum) {
            if (value == ((Fixnum)obj).value)
                return true;
        }
        return false;
    }

    public static int getValue(LispObject obj) throws LispError
    {
        try {
            return ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public static int getInt(LispObject obj) throws LispError
    {
        try {
            return (int) ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public static BigInteger getBigInteger(LispObject obj) throws LispError
    {
        try {
            return BigInteger.valueOf(((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public static float getFloat(LispObject obj) throws LispError
    {
        try {
            return (float) ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public final int getValue()
    {
        return value;
    }

    public final BigInteger getBigInteger()
    {
        return BigInteger.valueOf(value);
    }

    public final LispObject incr()
    {
        if (value < Integer.MAX_VALUE)
            return new Fixnum(value + 1);
        return new Bignum((long) value + 1);
    }

    public final LispObject decr()
    {
        if (value > Integer.MIN_VALUE)
            return new Fixnum(value - 1);
        return new Bignum((long) value - 1);
    }

    public LispObject add(LispObject obj) throws LispError
    {
        try {
            return number((long) value + ((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return number(getBigInteger().add(Bignum.getValue(obj)));
            if (obj instanceof LispFloat)
                return new LispFloat(value + LispFloat.getValue(obj));
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator).add(numerator),
                    denominator);
            }
            throw new TypeError(obj, "number");
        }
    }

    public LispObject subtract(LispObject obj) throws LispError
    {
        try {
            return number((long) value - ((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return number(getBigInteger().subtract(Bignum.getValue(obj)));
            if (obj instanceof LispFloat)
                return new LispFloat(value - LispFloat.getValue(obj));
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator).subtract(numerator),
                    denominator);
            }
            throw new TypeError(obj, "number");
        }
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        try {
            return number((long) value * ((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return number(getBigInteger().multiply(Bignum.getValue(obj)));
            if (obj instanceof LispFloat)
                return new LispFloat(value * LispFloat.getValue(obj));
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(numerator),
                    denominator);
            }
            throw new TypeError(obj, "number");
        }
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        try {
            final int divisor = ((Fixnum)obj).value;
            if (value % divisor == 0)
                return new Fixnum(value / divisor);
            return number(BigInteger.valueOf(value),
                BigInteger.valueOf(divisor));
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return number(getBigInteger().divide(Bignum.getValue(obj)));
            if (obj instanceof LispFloat)
                return new LispFloat(value / LispFloat.getValue(obj));
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator),
                    numerator);
            }
            throw new TypeError(obj, "number");
        }
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        try {
            return value == ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return getBigInteger().equals(Bignum.getValue(obj));
            if (obj instanceof LispFloat)
                return (float) value == LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        try {
            return value != ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return !getBigInteger().equals(Bignum.getValue(obj));
            if (obj instanceof LispFloat)
                return (float) value != LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public boolean isLessThan(LispObject obj) throws LispError
    {
        try {
            return value < ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return getBigInteger().compareTo(Bignum.getValue(obj)) < 0;
            if (obj instanceof LispFloat)
                return (float) value < LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public boolean isGreaterThan(LispObject obj) throws LispError
    {
        try {
            return value > ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return getBigInteger().compareTo(Bignum.getValue(obj)) > 0;
            if (obj instanceof LispFloat)
                return (float) value > LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value <= ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return getBigInteger().compareTo(Bignum.getValue(obj)) <= 0;
            if (obj instanceof LispFloat)
                return (float) value <= LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value >= ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            // obj is not a fixnum.
            if (obj instanceof Bignum)
                return getBigInteger().compareTo(Bignum.getValue(obj)) >= 0;
            if (obj instanceof LispFloat)
                return (float) value >= LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public int hashCode()
    {
        return (int) (value ^ (value >>> 32));
    }

    public String toString()
    {
        return String.valueOf(value);
    }

    // ### ash
    // ash integer count => shifted-integer
    private static final Primitive2 ASH = new Primitive2("ash") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            if (second instanceof Fixnum) {
                int count = Fixnum.getInt(second);
                BigInteger n;
                if (first instanceof Fixnum)
                    n = BigInteger.valueOf(((Fixnum)first).getValue());
                else if (first instanceof Bignum)
                    n = ((Bignum)first).getValue();
                else
                    throw new TypeError(first, "integer");
                if (count == 0)
                    return first; // No change.
                return number(n.shiftLeft(count));
            }
            throw new LispError("ASH: unsupported case");
        }
    };

    // ### expt
    // expt base-number power-number => result
    private static final Primitive2 EXPT = new Primitive2("expt") {
        public LispObject execute(LispObject n, LispObject power)
            throws LispError
        {
            if (power instanceof Fixnum) {
                LispObject result = null;
                if (n instanceof Fixnum || n instanceof Bignum)
                    result = new Fixnum(1);
                else
                    result = new LispFloat((float)1);
                for (int i = Fixnum.getInt(power); i-- > 0;)
                    result = result.multiplyBy(n);
                return result;
            }
            throw new LispError("EXPT: unsupported case");
        }
    };
}
