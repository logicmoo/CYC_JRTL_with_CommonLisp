/*
 * lognot.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: lognot.java,v 1.4 2003-12-10 08:55:00 asimon Exp $
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

// ### lognot
public final class lognot extends Primitive
{
    private lognot(String name, String arglist)
    {
        super(name,arglist);
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum)
            return new Fixnum(~((Fixnum)arg).getValue());
        if (arg instanceof Bignum)
            return number(((Bignum)arg).getValue().not());
        throw new ConditionThrowable(new TypeError(arg, "integer"));
    }

    private static final lognot LOGNOT = new lognot("lognot","integer");
}
