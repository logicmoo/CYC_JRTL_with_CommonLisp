/*
 * StandardClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: StandardClass.java,v 1.21 2005-05-20 14:12:09 piso Exp $
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

public class StandardClass extends SlotClass
{
    public StandardClass()
    {
        setClassLayout(new Layout(this, NIL, NIL));
    }

    public StandardClass(Symbol symbol, LispObject directSuperclasses)
    {
        super(symbol, directSuperclasses);
        setClassLayout(new Layout(this, NIL, NIL));
    }

    public LispObject typeOf()
    {
        return Symbol.STANDARD_CLASS;
    }

    public LispObject classOf()
    {
        return BuiltInClass.STANDARD_CLASS;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.STANDARD_CLASS)
            return T;
        if (type == BuiltInClass.STANDARD_CLASS)
            return T;
        return super.typep(type);
    }

    public String writeToString() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer("STANDARD-CLASS");
        if (symbol != null) {
            sb.append(' ');
            sb.append(symbol.writeToString());
        }
        return unreadableString(sb.toString());
    }
}
