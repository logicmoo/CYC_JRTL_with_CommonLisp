/*
 * UndefinedFunction.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: UndefinedFunction.java,v 1.15 2005-12-19 18:25:01 piso Exp $
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

public final class UndefinedFunction extends CellError
{
    // obj is either the name of the undefined function or an initArgs list.
    public UndefinedFunction(LispObject obj) throws ConditionThrowable
    {
        super(StandardClass.UNDEFINED_FUNCTION);
        if (obj instanceof Cons)
            initialize(obj);
        else
            setCellName(obj);
    }

    public LispObject typeOf()
    {
        return Symbol.UNDEFINED_FUNCTION;
    }

    public LispObject classOf()
    {
        return StandardClass.UNDEFINED_FUNCTION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.UNDEFINED_FUNCTION)
            return T;
        if (type == StandardClass.UNDEFINED_FUNCTION)
            return T;
        return super.typep(type);
    }

    public String getMessage() throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer("The function ");
        sb.append(getCellName().writeToString());
        sb.append(" is undefined.");
        return sb.toString();
    }
}
