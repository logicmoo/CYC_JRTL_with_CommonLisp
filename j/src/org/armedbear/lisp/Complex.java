/*
 * Complex.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Complex.java,v 1.10 2003-08-15 17:18:02 piso Exp $
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

    public LispObject getRealPart()
    {
        return realpart;
    }

    public LispObject getImaginaryPart()
    {
        return imagpart;
    }

    public int getType()
    {
        return TYPE_COMPLEX;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.COMPLEX)
            return T;
        if (typeSpecifier == Symbol.NUMBER)
            return T;
        return super.typep(typeSpecifier);
    }

    public boolean eql(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return realpart.eql(c.realpart) && imagpart.eql(c.imagpart);
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        return eql(obj);
    }

    public boolean equalp(LispObject obj) throws LispError
    {
        return isEqualTo(obj);
    }

    public LispObject add(LispObject obj) throws LispError
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return getInstance(realpart.add(c.realpart), imagpart.add(c.imagpart));
        }
        return getInstance(realpart.add(obj), imagpart);
    }

    public LispObject subtract(LispObject obj) throws LispError
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return getInstance(realpart.subtract(c.realpart), imagpart.subtract(c.imagpart));
        }
        return getInstance(realpart.subtract(obj), imagpart);
    }

    public boolean isEqualTo(LispObject obj) throws LispError
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return (realpart.isEqualTo(c.realpart) &&
                    imagpart.isEqualTo(c.imagpart));
        }
        if ((obj.getType() & TYPE_NUMBER) != 0) {
            // obj is a number, but not complex.
            if (imagpart instanceof LispFloat) {
                if (((LispFloat)imagpart).getValue() == 0) {
                    if (obj instanceof Fixnum)
                        return ((Fixnum)obj).getValue() == ((LispFloat)realpart).getValue();
                    if (obj instanceof LispFloat)
                        return ((LispFloat)obj).getValue() == ((LispFloat)realpart).getValue();
                }
            }
            return false;
        }
        throw new TypeError(obj, "number");
    }

    public boolean isNotEqualTo(LispObject obj) throws LispError
    {
        return !isEqualTo(obj);
    }

    public LispObject ABS() throws TypeError
    {
        float real = LispFloat.coerceToFloat(realpart).getValue();
        float imag = LispFloat.coerceToFloat(imagpart).getValue();
        return new LispFloat((float)Math.sqrt(real * real + imag * imag));
    }

    public LispObject ZEROP() throws TypeError
    {
        if (realpart.ZEROP() != NIL && imagpart.ZEROP() != NIL)
            return T;
        return NIL;
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
