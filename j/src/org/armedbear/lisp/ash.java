/*
 * ash.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: ash.java,v 1.5 2004-02-23 19:56:58 piso Exp $
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

// ### ash
// ash integer count => shifted-integer
public final class ash extends Primitive2
{
    private ash()
    {
        super("ash", "integer count");
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (first instanceof Fixnum && second instanceof Fixnum) {
            int count = ((Fixnum)second).value;
            if (count == 0)
                return first;
            long n = ((Fixnum)first).value;
            if (n == 0)
                return first;
            if (count < -32) {
                // Right shift.
                return n >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            }
            if (count <= 32)
                return number(count > 0 ? (n << count) : (n >> -count));
        }
        BigInteger n;
        if (first instanceof Fixnum)
            n = BigInteger.valueOf(((Fixnum)first).value);
        else if (first instanceof Bignum)
            n = ((Bignum)first).getValue();
        else
            return signal(new TypeError(first, "integer"));
        if (second instanceof Fixnum) {
            int count = ((Fixnum)second).value;
            if (count == 0)
                return first;
            // BigInteger.shiftLeft() succumbs to a stack overflow if count
            // is Integer.MIN_VALUE, so...
            if (count == Integer.MIN_VALUE)
                return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            return number(n.shiftLeft(count));
        }
        if (second instanceof Bignum) {
            BigInteger count = ((Bignum)second).getValue();
            if (count.signum() > 0)
                return signal(new LispError("can't represent result of left shift"));
            if (count.signum() < 0)
                return n.signum() >= 0 ? Fixnum.ZERO : Fixnum.MINUS_ONE;
            Debug.bug(); // Shouldn't happen.
        }
        return signal(new TypeError(second, "integer"));
    }

    private static final ash ASH = new ash();
}
