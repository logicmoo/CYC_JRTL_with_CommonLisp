/*
 * TypeError.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: TypeError.java,v 1.4 2003-09-19 12:10:28 piso Exp $
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

public final class TypeError extends Condition
{
    private final String message;
    private final LispObject object;
    private final String expectedType;

    public TypeError()
    {
        this(null, null);
    }

    public TypeError(String message)
    {
        this.message = message;
        object = null;
        expectedType = null;
    }

    public TypeError(LispObject object)
    {
        this(object, null);
    }

    public TypeError(LispObject object, String expectedType)
    {
        message = null;
        this.object = object;
        this.expectedType = expectedType;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.TYPE_ERROR)
            return T;
        if (type == Symbol.ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        if (message != null)
            return message;
        StringBuffer sb = new StringBuffer("wrong type");
        String name = object != null ? String.valueOf(object) : null;
        if (expectedType != null) {
            if (name == null)
                name = "object";
            sb.append(": ");
            sb.append(name);
            sb.append(" is not a");
            if ("aeiou".indexOf(expectedType.charAt(0)) >= 0)
                sb.append('n');
            sb.append(' ');
            sb.append(expectedType);
        } else if (name != null) {
            sb.append(": ");
            sb.append(name);
        }
        return sb.toString();
    }
}
