/*
 * float_sign.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: float_sign.java,v 1.1 2004-06-06 19:31:53 piso Exp $
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

public final class float_sign extends Primitive
{
    private float_sign()
    {
        super("float-sign", "float-1 &optional float-2");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        try {
            double d = ((LispFloat)arg).value;
            long bits = Double.doubleToRawLongBits(d);
            return bits < 0 ? LispFloat.MINUS_ONE : LispFloat.ONE;
        }
        catch (ClassCastException e) {
            return signal(new TypeError(arg, Symbol.FLOAT));
        }
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        double d1, d2;
        try {
            d1 = ((LispFloat)first).value;
        }
        catch (ClassCastException e) {
            return signal(new TypeError(first, Symbol.FLOAT));
        }
        try {
            d2 = Math.abs(((LispFloat)second).value);
        }
        catch (ClassCastException e) {
            return signal(new TypeError(second, Symbol.FLOAT));
        }
        long bits = Double.doubleToRawLongBits(d1);
        return bits < 0 ? new LispFloat(-d2) : new LispFloat(d2);
    }

    private static final Primitive FLOAT_SIGN = new float_sign();
}
