/*
 * logand.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: logand.java,v 1.9 2004-02-28 14:45:36 piso Exp $
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

// ### logand
// logand &rest integers => result-integer
public final class logand extends Primitive
{
    private logand()
    {
        super("logand", "&rest integers");
    }

    public LispObject execute()
    {
        return Fixnum.MINUS_ONE;
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (first instanceof Fixnum && second instanceof Fixnum) {
            return new Fixnum(((Fixnum)first).value &
                              ((Fixnum)second).value);
        } else {
            BigInteger n1, n2;
            if (first instanceof Fixnum)
                n1 = ((Fixnum)first).getBigInteger();
            else if (first instanceof Bignum)
                n1 = ((Bignum)first).getValue();
            else
                return signal(new TypeError(first, Symbol.INTEGER));
            if (second instanceof Fixnum)
                n2 = ((Fixnum)second).getBigInteger();
            else if (second instanceof Bignum)
                n2 = ((Bignum)second).getValue();
            else
                return signal(new TypeError(second, Symbol.INTEGER));
            return number(n1.and(n2));
        }
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        BigInteger result = BigInteger.valueOf(-1);
        for (int i = 0; i < args.length; i++) {
            BigInteger n;
            if (args[i] instanceof Fixnum)
                n = ((Fixnum)args[i]).getBigInteger();
            else if (args[i] instanceof Bignum)
                n = ((Bignum)args[i]).getValue();
            else
                return signal(new TypeError(args[i], Symbol.INTEGER));
            result = result.and(n);
        }
        return number(result);
    }

    private static final Primitive LOGAND = new logand();
}
