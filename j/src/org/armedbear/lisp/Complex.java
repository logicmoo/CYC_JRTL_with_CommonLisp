/*
 * Complex.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Complex.java,v 1.1 2003-08-12 01:33:31 piso Exp $
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

public final class Complex extends LispObject
{
    private final LispObject realpart;
    private final LispObject imagpart;

    private Complex(LispObject realpart, LispObject imagpart)
    {
        this.realpart = realpart;
        this.imagpart = imagpart;
    }

    public static LispObject getInstance(LispObject realpart,
                                         LispObject imagpart)
        throws TypeError
    {
        if ((realpart.getType() & TYPE_REAL) == 0)
            throw new TypeError(realpart, "real number");
        if ((imagpart.getType() & TYPE_REAL) == 0)
            throw new TypeError(imagpart, "real number");
        if (realpart instanceof LispFloat)
            imagpart = LispFloat.coerceToFloat(imagpart);
        else if (imagpart instanceof LispFloat)
            realpart = LispFloat.coerceToFloat(realpart);
        if (imagpart instanceof Fixnum) {
            if (((Fixnum)imagpart).getValue() == 0)
                return realpart;
        }
        return new Complex(realpart, imagpart);
    }

    public int getType()
    {
        return TYPE_COMPLEX;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#C(");
        sb.append(String.valueOf(realpart));
        sb.append(' ');
        sb.append(String.valueOf(imagpart));
        sb.append(')');
        return sb.toString();
    }
}
