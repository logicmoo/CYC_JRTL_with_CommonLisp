/*
 * logxor.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: logxor.java,v 1.3 2003-12-10 08:55:00 asimon Exp $
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

// ### logxor
// logxor &rest integers => result-integer
// exclusive or
public final class logxor extends Primitive
{
    private logxor(String name, String arglist)
    {
        super(name,arglist);
    }

    public LispObject execute()
    {
        return Fixnum.ZERO;
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum)
            return arg;
        if (arg instanceof Bignum)
            return arg;
        throw new ConditionThrowable(new TypeError(arg, "integer"));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        BigInteger result = null;
        for (int i = 0; i < args.length; i++) {
            LispObject arg = args[i];
            BigInteger n;
            if (arg instanceof Fixnum)
                n = ((Fixnum)arg).getBigInteger();
            else if (arg instanceof Bignum)
                n = ((Bignum)arg).getValue();
            else
                throw new ConditionThrowable(new TypeError(arg, "integer"));
            if (result == null)
                result = n;
            else
                result = result.xor(n);
        }
        return number(result);
    }

    private static final logxor LOGXOR = new logxor("logxor","&rest integers");
}
