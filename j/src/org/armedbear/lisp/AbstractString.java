/*
 * AbstractString.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: AbstractString.java,v 1.4 2004-04-24 12:44:09 piso Exp $
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

public abstract class AbstractString extends AbstractVector
{
    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type instanceof Symbol) {
            if (type == Symbol.STRING)
                return T;
            if (type == Symbol.BASE_STRING)
                return T;
        }
        if (type == BuiltInClass.STRING)
            return T;
        return super.typep(type);
    }

    public final LispObject STRINGP()
    {
        return T;
    }

    public final boolean stringp()
    {
        return true;
    }

    public LispObject getElementType()
    {
        return Symbol.CHARACTER;
    }

    public final boolean isSimpleVector()
    {
        return false;
    }

    public abstract void fill(char c) throws ConditionThrowable;

    public abstract char getChar(int index) throws ConditionThrowable;

    public abstract void setChar(int index, char c) throws ConditionThrowable;

    public final String writeToString(int beginIndex, int endIndex)
        throws ConditionThrowable
    {
        if (beginIndex < 0)
            beginIndex = 0;
        final int limit;
        limit = length();
        if (endIndex > limit)
            endIndex = limit;
        if (_PRINT_ESCAPE_.symbolValue() != NIL) {
            StringBuffer sb = new StringBuffer();
            sb.append('"');
            for (int i = beginIndex; i < endIndex; i++) {
                char c = getChar(i);
                if (c == '\"' || c == '\\')
                    sb.append('\\');
                sb.append(c);
            }
            sb.append('"');
            return sb.toString();
        } else
            return getStringValue().substring(beginIndex, endIndex);
    }

    public String writeToString() throws ConditionThrowable
    {
        return writeToString(0, length());
    }
}
