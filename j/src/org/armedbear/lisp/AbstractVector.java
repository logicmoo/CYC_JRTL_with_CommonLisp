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
    protected int fillPointer = -1; // -1 indicates no fill pointer.

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.VECTOR)
            return T;
        if (typeSpecifier == Symbol.SEQUENCE)
            return T;
        return super.typep(typeSpecifier);
    }

    public abstract LispObject get(int index) throws LispError;

    public abstract void set(int index, LispObject newValue) throws LispError;

    public abstract void fill(LispObject obj) throws LispError;

    public int checkIndex(int index) throws LispError
    {
        if (index < 0 || index >= length())
            badIndex(index);
        return index;
    }

    public int checkIndex(LispObject index) throws LispError
    {
        long i = Fixnum.getValue(index);
        if (i < 0 || i >= length())
            badIndex(i);
        return (int) i;
    }

    protected void badIndex(long index) throws LispError
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
        throw new TypeError(sb.toString());
    }

    public int getFillPointer()
    {
        return fillPointer;
    }

    public void setFillPointer(int n)
    {
        fillPointer = n;
    }

    public void setFillPointer(LispObject obj) throws LispError
    {
        if (obj == T)
            fillPointer = 0;
        else {
            long n = Fixnum.getValue(obj);
            if (n > length()) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the length of the vector (");
                sb.append(length());
                sb.append(")");
                throw new LispError(sb.toString());
            }
            if (n < 0) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") is negative");
                throw new LispError(sb.toString());
            }
            fillPointer = (int) n;
        }
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    public void nreverse() throws LispError
    {
        int i = 0;
        int j = length() - 1;
        while (i < j) {
            LispObject temp = get(i);
            set(i, get(j));
            set(j, temp);
            ++i;
            --j;
        }
    }
}
