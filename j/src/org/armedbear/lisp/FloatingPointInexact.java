/*
 * FloatingPointInexact.java
 *
 * Copyright (C) 2004-2005 Peter Graves
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

public final class FloatingPointInexact extends ArithmeticError
{
    public FloatingPointInexact(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.FLOATING_POINT_INEXACT);
        initialize(initArgs);
    }

    public LispObject typeOf()
    {
        return Symbol.FLOATING_POINT_INEXACT;
    }

    public LispObject classOf()
    {
        return StandardClass.FLOATING_POINT_INEXACT;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.FLOATING_POINT_INEXACT)
            return T;
        if (type == StandardClass.FLOATING_POINT_INEXACT)
            return T;
        return super.typep(type);
    }
}
