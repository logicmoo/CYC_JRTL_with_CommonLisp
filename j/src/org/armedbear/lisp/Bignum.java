/*
 * Bignum.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Bignum.java,v 1.7 2003-03-27 13:55:40 piso Exp $
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

public final class Bignum extends LispObject
{
    private final BigInteger value;

    public Bignum(long l)
    {
        value = BigInteger.valueOf(l);
    }

    public Bignum(BigInteger n)
    {
        value = n;
    }

    public LispObject typeOf()
    {
        return Symbol.BIGNUM;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.BIGNUM)
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
        if (obj instanceof Bignum) {
            if (value.equals(((Bignum)obj).value))
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Bignum) {
            if (value.equals(((Bignum)obj).value))
                return true;
        }
        return false;
    }

    public static BigInteger getValue(LispObject obj) throws LispError
    {
        try {
            return ((Bignum)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "bignum");
        }
    }

    public final BigInteger getValue()
    {
        return value;
    }

    public final LispObject incr()
    {
        return new Bignum(value.add(BigInteger.ONE));
    }

    public final LispObject decr()
    {
        return new Bignum(value.subtract(BigInteger.ONE));
    }

    public LispObject add(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return new Bignum(value.add(((Bignum)obj).value));
        if (obj instanceof Fixnum)
            return new Bignum(value.add(Fixnum.getBigInteger(obj)));
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() + ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public LispObject subtract(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return number(value.subtract(((Bignum)obj).value));
        if (obj instanceof Fixnum)
            return number(value.subtract(Fixnum.getBigInteger(obj)));
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() - ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return new Bignum(value.multiply(((Bignum)obj).value));
        if (obj instanceof Fixnum)
            return new Bignum(value.multiply(Fixnum.getBigInteger(obj)));
        if (obj instanceof Ratio) {
            BigInteger n = ((Ratio)obj).numerator();
            return number(n.multiply(value), ((Ratio)obj).denominator());
        }
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() * ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return number(value, ((Bignum)obj).value);
        if (obj instanceof Fixnum)
            return new Bignum(value.divide(Fixnum.getBigInteger(obj)));
        if (obj instanceof Ratio) {
            BigInteger d = ((Ratio)obj).denominator();
            return number(d.multiply(value), ((Ratio)obj).numerator());
        }
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() / ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.equals(((Bignum)obj).value);
        if (obj instanceof Fixnum)
            return value.equals(Fixnum.getBigInteger(obj));
        if (obj instanceof LispFloat)
            return value.floatValue() == ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return !value.equals(((Bignum)obj).value);
        if (obj instanceof Fixnum)
            return !value.equals(Fixnum.getBigInteger(obj));
        if (obj instanceof LispFloat)
            return value.floatValue() != ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public boolean isLessThan(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) < 0;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) < 0;
        if (obj instanceof LispFloat)
            return value.floatValue() < ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public boolean isGreaterThan(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) > 0;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) > 0;
        if (obj instanceof LispFloat)
            return value.floatValue() > ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) <= 0;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) <= 0;
        if (obj instanceof LispFloat)
            return value.floatValue() <= ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) >= 0;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) >= 0;
        if (obj instanceof LispFloat)
            return value.floatValue() >= ((LispFloat)obj).getValue();
        throw new TypeError(obj, "number");
    }

    public LispObject floor(LispObject obj) throws LispError
    {
        BigInteger divisor;
        if (obj instanceof Bignum)
            divisor = ((Bignum)obj).getValue();
        else if (obj instanceof Fixnum)
            divisor = ((Fixnum)obj).getBigInteger();
        else
            throw new LispError("not implemented");

        BigInteger[] results = value.divideAndRemainder(divisor);
        BigInteger quotient = results[0];
        BigInteger remainder = results[1];
        LispObject[] values = new LispObject[2];
        if (remainder.signum() == 0) {
            values[0] = number(quotient);
            values[1] = Fixnum.ZERO;
            setValues(values);
            return values[0];
        }

        if (value.signum() != divisor.signum())
            quotient = quotient.subtract(BigInteger.ONE);

        LispObject q = number(quotient);
        values[0] = q;
        values[1] = subtract(q.multiplyBy(obj));

        setValues(values);
        return values[0];
    }

    public int hashCode()
    {
        return value.hashCode();
    }

    public String toString()
    {
        return value.toString();
    }
}
