/*
 * DivisionByZero.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: DivisionByZero.java,v 1.4 2004-06-05 19:16:38 piso Exp $
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

public class DivisionByZero extends ArithmeticError
{
    public DivisionByZero()
    {
    }

    public DivisionByZero(LispObject initArgs)
    {
    }

    public String getMessage()
    {
        return "Arithmetic error DIVISION-BY-ZERO signalled.";
    }

    public LispObject typeOf()
    {
        return Symbol.DIVISION_BY_ZERO;
    }

    public LispClass classOf()
    {
        return BuiltInClass.DIVISION_BY_ZERO;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.DIVISION_BY_ZERO)
            return T;
        if (type == BuiltInClass.DIVISION_BY_ZERO)
            return T;
        return super.typep(type);
    }
}
