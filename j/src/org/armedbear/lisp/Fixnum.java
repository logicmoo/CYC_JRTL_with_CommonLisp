/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Fixnum.java,v 1.36 2003-05-31 18:12:44 piso Exp $
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
    public static final Fixnum TWO  = new Fixnum(2);

    private final int value;

    public Fixnum(int value)
    {
        this.value = value;
    }

    public static Fixnum getInstance(int value)
    {
        return new Fixnum(value);
    }

    public int getType()
    {
        return TYPE_FIXNUM;
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
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator).add(numerator),
                    denominator);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value + LispFloat.getValue(obj));
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
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator).subtract(numerator),
                    denominator);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value - LispFloat.getValue(obj));
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
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(numerator),
                    denominator);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value * LispFloat.getValue(obj));
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
                return number(getBigInteger(), ((Bignum)obj).getValue());
            if (obj instanceof Ratio) {
                BigInteger numerator = ((Ratio)obj).numerator();
                BigInteger denominator = ((Ratio)obj).denominator();
                return number(
                    getBigInteger().multiply(denominator),
                    numerator);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value / LispFloat.getValue(obj));
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
                return false;
            if (obj instanceof Ratio)
                return false;
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
                return true;
            if (obj instanceof Ratio)
                return true;
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
            if (obj instanceof Ratio) {
                BigInteger n =
                    getBigInteger().multiply(((Ratio)obj).denominator());
                return n.compareTo(((Ratio)obj).numerator()) < 0;
            }
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
            if (obj instanceof Ratio) {
                BigInteger n =
                    getBigInteger().multiply(((Ratio)obj).denominator());
                return n.compareTo(((Ratio)obj).numerator()) > 0;
            }
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
            if (obj instanceof Ratio) {
                BigInteger n =
                    getBigInteger().multiply(((Ratio)obj).denominator());
                return n.compareTo(((Ratio)obj).numerator()) <= 0;
            }
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
            if (obj instanceof Ratio) {
                BigInteger n =
                    getBigInteger().multiply(((Ratio)obj).denominator());
                return n.compareTo(((Ratio)obj).numerator()) >= 0;
            }
            if (obj instanceof LispFloat)
                return (float) value >= LispFloat.getValue(obj);
            throw new TypeError(obj, "number");
        }
    }

    public LispObject floor(LispObject obj) throws LispError
    {
        final LispThread thread = LispThread.currentThread();
        LispObject[] values = new LispObject[2];
        if (obj instanceof Fixnum) {
            long divisor = ((Fixnum)obj).value;
            long quotient = value / divisor;
            long remainder = value % divisor;
            if (remainder == 0) {
                values[0] = number(quotient);
                values[1] = Fixnum.ZERO;
                thread.setValues(values);
                return values[0];
            }
            // Remainder is non-zero.
            if (value > 0 && divisor > 0) {
                ;
            } else if (value < 0 && divisor < 0) {
                ;
            } else {
                --quotient;
                remainder = value - quotient * divisor;
            }
            values[0] = number(quotient);
            values[1] = number(remainder);
            thread.setValues(values);
            return values[0];
        }
        Thread.dumpStack();
        throw new LispError("not implemented");
    }

    public int hashCode()
    {
        return value;
    }

    public String toString()
    {
        int base;
        try {
            base = Fixnum.getValue(_PRINT_BASE_.symbolValueNoThrow());
        }
        catch (Throwable t) {
            Debug.trace(t);
            base = 10;
        }
        String s = Integer.toString(value, base).toUpperCase();
        if (_PRINT_RADIX_.symbolValueNoThrow() != NIL) {
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
