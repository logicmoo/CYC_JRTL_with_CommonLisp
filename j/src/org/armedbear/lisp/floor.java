/*
 * floor.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: floor.java,v 1.1 2004-03-09 11:49:37 piso Exp $
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

// ### floor number &optional divisor
public final class floor extends Primitive
{
    private floor()
    {
        super("floor", "number &optional divisor");
    }

    public LispObject execute(LispObject number)
        throws ConditionThrowable
    {
        LispObject quotient = number.truncate(Fixnum.ONE);
        final LispThread thread = LispThread.currentThread();
        LispObject remainder = thread._values[1];
        if (!remainder.zerop()) {
            if (number.minusp()) {
                quotient = quotient.decr();
                remainder = remainder.incr();
                thread._values[0] = quotient;
                thread._values[1] = remainder;
            }
        }
        return quotient;
    }

    public LispObject execute(LispObject number, LispObject divisor)
        throws ConditionThrowable
    {
        LispObject quotient = number.truncate(divisor);
        final LispThread thread = LispThread.currentThread();
        LispObject remainder = thread._values[1];
        boolean adjust = false;
        if (!remainder.zerop()) {
            if (divisor.minusp()) {
                if (number.plusp())
                    adjust = true;
            } else {
                if (number.minusp())
                    adjust = true;
            }
        }
        if (adjust) {
            quotient = quotient.decr();
            remainder = remainder.add(divisor);
            thread._values[0] = quotient;
            thread._values[1] = remainder;
        }
        return quotient;
    }

    private static final Primitive FLOOR = new floor();
}
