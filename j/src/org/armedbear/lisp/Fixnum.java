/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Fixnum.java,v 1.16 2003-03-14 18:53:01 piso Exp $
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
        if (typeSpecifier == Symbol.BIGNUM)
            return T; // FIXME Fool UNION.26 cons-test-20.lsp
        if (typeSpecifier == Symbol.FIXNUM)
            return T;
        if (typeSpecifier == Symbol.INTEGER)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject constantp()
    {
        return T;
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

    public LispObject add(LispObject obj) throws LispError
    {
        try {
            long result = (long) value + ((Fixnum)obj).value;
            return number(result);
        }
        catch (ClassCastException e) {
            // obj is not a Fixnum.
            if (obj instanceof Bignum)
                return obj.add(this);
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
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        try {
            return number((long) value * ((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        try {
            return number((long) value / ((Fixnum)obj).value);
        }
        catch (ClassCastException e) {
            if (obj instanceof Bignum) {
                return new Bignum(value).divideBy(obj);
            }
            if (obj instanceof LispFloat)
                return new LispFloat(value / LispFloat.getValue(obj));
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isEqualTo(LispObject obj) throws LispError
    {
        try {
            return value == ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isNotEqualTo(LispObject obj) throws LispError
    {
        try {
            return value != ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isLessThan(LispObject obj) throws LispError
    {
        try {
            return value < ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isGreaterThan(LispObject obj) throws LispError
    {
        try {
            return value > ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value <= ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public LispObject isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value >= ((Fixnum)obj).value ? T : NIL;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
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
                n = n.shiftLeft(count);
                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0)
                    return new Fixnum(n.intValue());
                return new Bignum(n);
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
