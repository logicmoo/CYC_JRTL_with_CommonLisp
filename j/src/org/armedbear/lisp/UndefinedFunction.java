/*
 * UndefinedFunction.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: UndefinedFunction.java,v 1.1 2003-09-19 15:50:19 piso Exp $
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

public final class UndefinedFunction extends LispError
{
    private final LispObject object;
    private final String name;

    public UndefinedFunction()
    {
        object = null;
        name = null;
    }

    public UndefinedFunction(LispObject object)
    {
        this.object = object;
        this.name = null;
    }

    public UndefinedFunction(String name)
    {
        this.object = null;
        this.name = name;
    }

    public LispObject typeOf()
    {
        return Symbol.UNDEFINED_FUNCTION;
    }

    public LispClass classOf()
    {
        return LispClass.UNDEFINED_FUNCTION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.UNDEFINED_FUNCTION)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        StringBuffer sb = new StringBuffer("undefined function");
        if (name != null) {
            sb.append(' ');
            sb.append(name);
        } else if (object != null) {
            sb.append(' ');
            sb.append(String.valueOf(object));
        }
        return sb.toString();
    }
}
