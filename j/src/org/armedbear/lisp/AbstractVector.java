/*
 * AbstractVector.java
 *
 * Copyright (C) 2003 Peter Graves
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

public abstract class AbstractVector extends LispObject
{
    public int checkIndex(int index) throws LispException
    {
        if (index < 0 || index >= length())
            badIndex(index);
        return index;
    }

    public int checkIndex(LispObject index) throws LispException
    {
        long i = Fixnum.getValue(index);
        if (i < 0 || i >= length())
            badIndex(i);
        return (int) i;
    }

    protected void badIndex(long index) throws LispException
    {
        StringBuffer sb = new StringBuffer("invalid array index ");
        sb.append(index);
        sb.append(" for ");
        sb.append(toString());
        if (length() > 0) {
            sb.append(" (should be >= 0 and < ");
            sb.append(length());
            sb.append(')');
        }
        throw new LispException(sb.toString());
    }
}
