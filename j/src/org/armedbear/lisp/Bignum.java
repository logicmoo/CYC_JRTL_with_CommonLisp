/*
 * Bignum.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Bignum.java,v 1.1 2003-03-14 18:44:57 piso Exp $
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
        return super.typep(typeSpecifier);
    }

    public LispObject constantp()
    {
        return T;
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
            return new Bignum(value.subtract(((Bignum)obj).value));
        if (obj instanceof Fixnum)
            return new Bignum(value.subtract(Fixnum.getBigInteger(obj)));
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
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() * ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return new Bignum(value.divide(((Bignum)obj).value));
        if (obj instanceof Fixnum)
            return new Bignum(value.divide(Fixnum.getBigInteger(obj)));
        if (obj instanceof LispFloat)
            return new LispFloat(value.floatValue() / ((LispFloat)obj).getValue());
        throw new TypeError(obj, "number");
    }

    public LispObject isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.equals(((Bignum)obj).value) ? T : NIL;
        if (obj instanceof Fixnum)
            return value.equals(Fixnum.getBigInteger(obj)) ? T : NIL;
        if (obj instanceof LispFloat)
            return value.floatValue() == ((LispFloat)obj).getValue() ? T : NIL;
        throw new TypeError(obj, "number");
    }

    public LispObject isNotEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.equals(((Bignum)obj).value) ? NIL : T;
        if (obj instanceof Fixnum)
            return value.equals(Fixnum.getBigInteger(obj)) ? NIL : T;
        if (obj instanceof LispFloat)
            return value.floatValue() == ((LispFloat)obj).getValue() ? NIL : T;
        throw new TypeError(obj, "number");
    }

    public LispObject isLessThan(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) < 0 ? T : NIL;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) < 0 ? T : NIL;
        if (obj instanceof LispFloat)
            return value.floatValue() < ((LispFloat)obj).getValue() ? T : NIL;
        throw new TypeError(obj, "number");
    }

    public LispObject isGreaterThan(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) > 0 ? T : NIL;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) > 0 ? T : NIL;
        if (obj instanceof LispFloat)
            return value.floatValue() > ((LispFloat)obj).getValue() ? T : NIL;
        throw new TypeError(obj, "number");
    }

    public LispObject isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) <= 0 ? T : NIL;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) <= 0 ? T : NIL;
        if (obj instanceof LispFloat)
            return value.floatValue() <= ((LispFloat)obj).getValue() ? T : NIL;
        throw new TypeError(obj, "number");
    }

    public LispObject isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Bignum)
            return value.compareTo(((Bignum)obj).value) >= 0 ? T : NIL;
        if (obj instanceof Fixnum)
            return value.compareTo(Fixnum.getBigInteger(obj)) >= 0 ? T : NIL;
        if (obj instanceof LispFloat)
            return value.floatValue() >= ((LispFloat)obj).getValue() ? T : NIL;
        throw new TypeError(obj, "number");
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
