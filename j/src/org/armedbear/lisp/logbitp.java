/*
 * logbitp.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: logbitp.java,v 1.5 2003-12-13 00:58:51 piso Exp $
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

// ### logbitp
// logbitp index integer => generalized-boolean
public final class logbitp extends Primitive2
{
    private logbitp(String name, String arglist)
    {
        super(name,arglist);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        int index = -1;
        if (first instanceof Fixnum) {
            index = ((Fixnum)first).getValue();
        } else if (first instanceof Bignum) {
            // FIXME If the number is really big, we're not checking the right
            // bit...
            if (((Bignum)first).getValue().signum() > 0)
                index = Integer.MAX_VALUE;
        }
        if (index < 0)
            return signal(new TypeError(first, "non-negative integer"));
        BigInteger n;
        if (second instanceof Fixnum)
            n = ((Fixnum)second).getBigInteger();
        else if (second instanceof Bignum)
            n = ((Bignum)second).getValue();
        else
            return signal(new TypeError(second, "integer"));
        // FIXME See above.
        if (index == Integer.MAX_VALUE)
            return n.signum() < 0 ? T : NIL;
        return n.testBit(index) ? T : NIL;
    }

    private static final logbitp LOGBITP = new logbitp("logbitp","index integer");
}
