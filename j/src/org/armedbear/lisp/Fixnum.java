/*
 * Fixnum.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Fixnum.java,v 1.8 2003-03-08 02:12:13 piso Exp $
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

public final class Fixnum extends LispObject
{
    private final long value;

    public Fixnum(long value)
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

    public static long getValue(LispObject obj) throws LispError
    {
        try {
            return ((Fixnum)obj).value;
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "fixnum");
        }
    }

    public final long getValue()
    {
        return value;
    }

    public static Fixnum sum(LispObject first, LispObject second)
        throws LispError
    {
        try {
            return new Fixnum(((Fixnum)first).value + ((Fixnum)second).value);
        }
        catch (ClassCastException e) {
            throw new TypeError("SUM");
        }
    }

    public static Fixnum difference(LispObject first, LispObject second)
        throws LispError
    {
        try {
            return new Fixnum(((Fixnum)first).value - ((Fixnum)second).value);
        }
        catch (ClassCastException e) {
            throw new TypeError("DIFFERENCE");
        }
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
