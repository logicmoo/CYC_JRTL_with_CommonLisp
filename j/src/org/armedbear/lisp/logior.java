/*
 * logior.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: logior.java,v 1.6 2004-02-28 16:55:32 piso Exp $
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

// ### logior
// logior &rest integers => result-integer
public final class logior extends Primitive
{
    private logior()
    {
        super("logior", "&rest integers");
    }

    public LispObject execute()
    {
        return Fixnum.ZERO;
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum || arg instanceof Bignum)
            return arg;
        return signal(new TypeError(arg, Symbol.INTEGER));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        if (first instanceof Fixnum && second instanceof Fixnum)
            return new Fixnum(((Fixnum)first).value | ((Fixnum)second).value);
        BigInteger n1, n2;
        if (first instanceof Fixnum)
            n1 = ((Fixnum)first).getBigInteger();
        else if (first instanceof Bignum)
            n1 = ((Bignum)first).value;
        else
            return signal(new TypeError(first, Symbol.INTEGER));
        if (second instanceof Fixnum)
            n2 = ((Fixnum)second).getBigInteger();
        else if (second instanceof Bignum)
            n2 = ((Bignum)second).value;
        else
            return signal(new TypeError(second, Symbol.INTEGER));
        return number(n1.or(n2));
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        final int limit = args.length;
        int i = 0;
        // Maybe all the arguments are fixnums.
        int r = 0;
        do {
            if (args[i] instanceof Fixnum) {
                r |= ((Fixnum)args[i]).value;
                ++i;
            } else
                break;
        } while (i < limit);
        if (i == limit)
            return number(r);
        // Not all fixnums.
        BigInteger result = BigInteger.valueOf(r);
        while (i < limit) {
            BigInteger n;
            if (args[i] instanceof Fixnum)
                n = ((Fixnum)args[i]).getBigInteger();
            else if (args[i] instanceof Bignum)
                n = ((Bignum)args[i]).value;
            else
                return signal(new TypeError(args[i], Symbol.INTEGER));
            result = result.or(n);
            ++i;
        }
        return number(result);
    }

    private static final Primitive LOGIOR = new logior();
}
