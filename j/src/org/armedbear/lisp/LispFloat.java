/*
 * LispFloat.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispFloat.java,v 1.5 2003-03-26 21:51:39 piso Exp $
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

public final class LispFloat extends LispObject
{
    private final float value;

    public LispFloat(float value)
    {
        this.value = value;
    }

    public LispObject typeOf()
    {
        return Symbol.SINGLE_FLOAT;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.SINGLE_FLOAT)
            return T;
        if (typeSpecifier == Symbol.FLOAT)
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
        if (obj instanceof LispFloat) {
            if (value == ((LispFloat)obj).value)
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispFloat) {
            if (value == ((LispFloat)obj).value)
                return true;
        }
        return false;
    }

    public static float getValue(LispObject obj) throws LispError
    {
        try {
            return ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "float");
        }
    }

    public final float getValue()
    {
        return value;
    }

    public LispObject add(LispObject obj) throws LispError
    {
        try {
            return new LispFloat(value + ((LispFloat)obj).value);
        }
        catch (ClassCastException e) {
            // obj is not a float.
            if (obj instanceof Fixnum)
                return new LispFloat(value + Fixnum.getFloat(obj));
            throw new TypeError(obj, "number");
        }
    }

    public LispObject subtract(LispObject obj) throws LispError
    {
        try {
            return new LispFloat(value - ((LispFloat)obj).value);
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public LispObject multiplyBy(LispObject obj) throws LispError
    {
        try {
            return new LispFloat(value * ((LispFloat)obj).value);
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public LispObject divideBy(LispObject obj) throws LispError
    {
        try {
            return new LispFloat(value / ((LispFloat)obj).value);
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        try {
            return value == ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        try {
            return value != ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isLessThan(LispObject obj) throws LispError
    {
        try {
            return value < ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isGreaterThan(LispObject obj) throws LispError
    {
        try {
            return value > ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isLessThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value <= ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public boolean isGreaterThanOrEqualTo(LispObject obj) throws LispError
    {
        try {
            return value >= ((LispFloat)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "number");
        }
    }

    public LispObject floor(LispObject obj) throws LispError
    {
        throw new LispError("FLOOR is not yet implemented for floats");
    }

    public int hashCode()
    {
        return Float.floatToIntBits(value);
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
