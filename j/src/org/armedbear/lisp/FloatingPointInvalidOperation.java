/*
 * FloatingPointInvalidOperation.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: FloatingPointInvalidOperation.java,v 1.1 2004-02-02 18:42:14 piso Exp $
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

public class FloatingPointInvalidOperation extends ArithmeticError
{
    public FloatingPointInvalidOperation()
    {
    }

    public FloatingPointInvalidOperation(LispObject initArgs)
        throws ConditionThrowable
    {
        super(initArgs);
    }

    public FloatingPointInvalidOperation(String message)
    {
        super(message);
    }

    public LispObject typeOf()
    {
        return Symbol.FLOATING_POINT_INVALID_OPERATION;
    }

    public LispClass classOf()
    {
        return BuiltInClass.FLOATING_POINT_INVALID_OPERATION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.FLOATING_POINT_INVALID_OPERATION)
            return T;
        if (type == BuiltInClass.FLOATING_POINT_INVALID_OPERATION)
            return T;
        return super.typep(type);
    }
}
