/*
 * ControlError.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: ControlError.java,v 1.8 2003-12-18 18:04:18 piso Exp $
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

public class ControlError extends LispError
{
    public ControlError()
    {
    }

    public ControlError(LispObject initArgs) throws ConditionThrowable
    {
        super(initArgs);
    }

    public ControlError(String message)
    {
        super(message);
    }

    public LispObject typeOf()
    {
        return Symbol.CONTROL_ERROR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CONTROL_ERROR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CONTROL_ERROR)
            return T;
        if (type == BuiltInClass.CONTROL_ERROR)
            return T;
        return super.typep(type);
    }
}
