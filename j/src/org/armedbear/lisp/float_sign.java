/*
 * float_sign.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: float_sign.java,v 1.4 2007-02-23 21:17:35 piso Exp $
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

// ### float-sign
public final class float_sign extends Primitive
{
    private float_sign()
    {
        super("float-sign", "float-1 &optional float-2");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof SingleFloat) {
            float f = ((SingleFloat)arg).value;
            int bits = Float.floatToRawIntBits(f);
            return bits < 0 ? SingleFloat.MINUS_ONE : SingleFloat.ONE;
        }
        if (arg instanceof DoubleFloat) {
            double d = ((DoubleFloat)arg).value;
            long bits = Double.doubleToRawLongBits(d);
            return bits < 0 ? DoubleFloat.MINUS_ONE : DoubleFloat.ONE;
        }
        return type_error(arg, Symbol.FLOAT);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (!first.floatp())
            return type_error(first, Symbol.FLOAT);
        if (!second.floatp())
            return type_error(second, Symbol.FLOAT);
        if (first.minusp()) {
            if (second.minusp())
                return second;
            else
                return Fixnum.ZERO.subtract(second);
        } else
            return second.ABS();
    }

    private static final Primitive FLOAT_SIGN = new float_sign();
}
