/*
 * logeqv.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: logeqv.java,v 1.5 2003-12-13 00:58:51 piso Exp $
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

// ### logeqv
// logeqv &rest integers => result-integer
// equivalence (exclusive nor)
public final class logeqv extends Primitive
{
    private logeqv()
    {
        super("logeqv","&rest integers");
    }

    public LispObject execute()
    {
        return Fixnum.MINUS_ONE;
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum)
            return arg;
        if (arg instanceof Bignum)
            return arg;
        return signal(new TypeError(arg, "integer"));
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
                return signal(new TypeError(arg, "integer"));
            if (result == null)
                result = n;
            else
                result = result.xor(n).not();
        }
        return number(result);
    }

    private static final logeqv LOGEQV = new logeqv();
}
