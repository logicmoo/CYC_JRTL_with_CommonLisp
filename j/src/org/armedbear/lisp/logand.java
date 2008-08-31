/*
 * logand.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id$
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

// ### logand &rest integers => result-integer
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

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Fixnum || arg instanceof Bignum)
            return arg;
        return type_error(arg, Symbol.INTEGER);
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return first.LOGAND(second);
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        LispObject result = Fixnum.MINUS_ONE;
        for (int i = 0; i < args.length; i++)
            result = result.LOGAND(args[i]);
        return result;
    }

    private static final Primitive LOGAND = new logand();
}
