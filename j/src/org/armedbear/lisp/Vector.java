/*
 * Vector.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Vector.java,v 1.1 2003-01-17 19:43:34 piso Exp $
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

public final class Vector extends LispObject implements SequenceType,
    VectorType
{
    private final LispObject[] elements;
    private final int length;
    private int fillPointer = -1; // -1 indicates no fill pointer.

    public Vector(int length)
    {
        elements = new LispObject[length];
        for (int i = length; i-- > 0;)
            elements[i] = NIL;
        this.length = length;
    }

    public Vector(LispObject list) throws LispException
    {
        elements = list.copyToArray();
        length = elements.length;
    }

    public Vector(LispObject[] array)
    {
        elements = array;
        length = array.length;
    }

    public LispObject typeOf()
    {
        return list(Symbol.VECTOR, T, new Fixnum(length));
    }

    public boolean isSimpleVector()
    {
        return fillPointer < 0;
    }

    public int getFillPointer()
    {
        return fillPointer;
    }

    public void setFillPointer(LispObject obj) throws LispException
    {
        if (obj == T)
            fillPointer = 0;
        else {
            long n = Fixnum.getValue(obj);
            if (n > length) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the length of the vector (");
                sb.append(length);
                sb.append(")");
                throw new LispException(sb.toString());
            }
            if (n < 0) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") is negative");
                throw new LispException(sb.toString());
            }
            fillPointer = (int) n;
        }
    }

    public void setFillPointer(int n)
    {
        fillPointer = n;
    }

    public int length()
    {
        return fillPointer >= 0 ? fillPointer : length;
    }

    public LispObject elt(long index) throws LispException
    {
        long limit = fillPointer >= 0 ? fillPointer : length;
        if (index >= 0 && index < limit)
            return elements[(int)index];
        throw new LispException("ELT: invalid index " + index + " for " + this);
    }

    public LispObject remove(LispObject item) throws LispException
    {
        throw new LispException("not implemented");
    }

    public LispObject get(int index)
    {
        return elements[index];
    }

    public void set(int index, LispObject newValue)
    {
        elements[index] = newValue;
    }

    public void fill(LispObject obj)
    {
        for (int i = length; i-- > 0;)
            elements[i] = obj;
    }

    public int checkIndex(int index) throws LispException
    {
        if (index < 0 || index >= length)
            badIndex(index);
        return index;
    }

    public int checkIndex(LispObject index) throws LispException
    {
        long i = Fixnum.getValue(index);
        if (i < 0 || i >= length)
            badIndex(i);
        return (int) i;
    }

    private void badIndex(long index) throws LispException
    {
        StringBuffer sb = new StringBuffer("invalid array index ");
        sb.append(index);
        sb.append(" for ");
        sb.append(toString());
        if (length() > 0) {
            sb.append(" (should be >= 0 and < ");
            sb.append(length);
            sb.append(')');
        }
        throw new LispException(sb.toString());
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#(");
        // FIXME The limit should actually be the value of *PRINT-LENGTH*.
        final int limit = Math.min(length(), 10);
        for (int i = 0; i < limit; i++) {
            if (i > 0)
                sb.append(' ');
            sb.append(elements[i]);
        }
        if (limit < length())
            sb.append(" ...");
        sb.append(')');
        return sb.toString();
    }
}
