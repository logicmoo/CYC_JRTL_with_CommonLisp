/*
 * SimpleCondition.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: SimpleCondition.java,v 1.5 2003-09-21 02:03:01 piso Exp $
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

public class SimpleCondition extends Condition
{
    public SimpleCondition()
    {
    }

    public SimpleCondition(LispObject initArgs)
    {
        this(); // FIXME
    }

    public SimpleCondition(String message)
    {
        super(message);
    }

    public LispObject typeOf()
    {
        return Symbol.SIMPLE_CONDITION;
    }

    public LispClass classOf()
    {
        return BuiltInClass.SIMPLE_CONDITION;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CONDITION)
            return T;
        if (type == BuiltInClass.CONDITION)
            return T;
        return super.typep(type);
    }
}
