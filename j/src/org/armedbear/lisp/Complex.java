/*
 * Complex.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Complex.java,v 1.26 2004-02-10 14:06:25 piso Exp $
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
        throws ConditionThrowable
    {
        if (!realpart.realp())
            return signal(new TypeError(realpart, Symbol.REAL));
        if (!imagpart.realp())
            return signal(new TypeError(imagpart, Symbol.REAL));
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

    public LispObject typeOf()
    {
        return Symbol.COMPLEX;
    }

    public LispClass classOf()
    {
        return BuiltInClass.COMPLEX;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.COMPLEX)
            return T;
        if (type == Symbol.NUMBER)
            return T;
        if (type == BuiltInClass.COMPLEX)
            return T;
        if (type == BuiltInClass.NUMBER)
            return T;
        return super.typep(type);
    }

    public LispObject NUMBERP()
    {
        return T;
    }

    public boolean numberp()
    {
        return true;
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

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        return isEqualTo(obj);
    }

    public final LispObject incr() throws ConditionThrowable
    {
        return new Complex(realpart.add(Fixnum.ONE), imagpart);
    }

    public final LispObject decr() throws ConditionThrowable
    {
        return new Complex(realpart.subtract(Fixnum.ONE), imagpart);
    }

    public LispObject add(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return getInstance(realpart.add(c.realpart), imagpart.add(c.imagpart));
        }
        return getInstance(realpart.add(obj), imagpart);
    }

    public LispObject subtract(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return getInstance(realpart.subtract(c.realpart), imagpart.subtract(c.imagpart));
        }
        return getInstance(realpart.subtract(obj), imagpart);
    }

    public LispObject multiplyBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Complex) {
            LispObject a = realpart;
            LispObject b = imagpart;
            LispObject c = ((Complex)obj).getRealPart();
            LispObject d = ((Complex)obj).getImaginaryPart();
            // xy = (ac - bd) + i(ad + bc)
            // real part = ac - bd
            // imag part = (a + b)(c + d) - ac - bd
            LispObject ac = a.multiplyBy(c);
            LispObject bd = b.multiplyBy(d);
            return Complex.getInstance(ac.subtract(bd),
                                       a.add(b).multiplyBy(c.add(d)).subtract(ac).subtract(bd));
        }
        return Complex.getInstance(realpart.multiplyBy(obj),
                                   imagpart.multiplyBy(obj));
    }

    public LispObject divideBy(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Complex) {
            LispObject a = realpart;
            LispObject b = imagpart;
            LispObject c = ((Complex)obj).getRealPart();
            LispObject d = ((Complex)obj).getImaginaryPart();
            LispObject ac = a.multiplyBy(c);
            LispObject bd = b.multiplyBy(d);
            LispObject bc = b.multiplyBy(c);
            LispObject ad = a.multiplyBy(d);
            LispObject denominator = c.multiplyBy(c).add(d.multiplyBy(d));
            return Complex.getInstance(ac.add(bd).divideBy(denominator),
                                       bc.subtract(ad).divideBy(denominator));
        }
        return Complex.getInstance(realpart.divideBy(obj),
                                   imagpart.divideBy(obj));
    }

    public boolean isEqualTo(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof Complex) {
            Complex c = (Complex) obj;
            return (realpart.isEqualTo(c.realpart) &&
                    imagpart.isEqualTo(c.imagpart));
        }
        if (obj.numberp()) {
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
        signal(new TypeError(obj, "number"));
        // Not reached.
        return false;
    }

    public boolean isNotEqualTo(LispObject obj) throws ConditionThrowable
    {
        return !isEqualTo(obj);
    }

    public LispObject ABS() throws ConditionThrowable
    {
        double real = LispFloat.coerceToFloat(realpart).getValue();
        double imag = LispFloat.coerceToFloat(imagpart).getValue();
        return new LispFloat(Math.sqrt(real * real + imag * imag));
    }

    public boolean zerop() throws ConditionThrowable
    {
        return realpart.zerop() && imagpart.zerop();
    }

    public LispObject COMPLEXP()
    {
        return T;
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
