/*
 * Vector.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: Vector.java,v 1.29 2003-12-13 00:28:08 piso Exp $
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

public class Vector extends AbstractVector
{
    private LispObject[] elements;
    private int capacity;

    public Vector(int capacity)
    {
        elements = new LispObject[capacity];
        for (int i = capacity; i-- > 0;)
            elements[i] = NIL;
        this.capacity = capacity;
    }

    public Vector(LispObject list) throws ConditionThrowable
    {
        elements = list.copyToArray();
        capacity = elements.length;
    }

    public Vector(LispObject[] array)
    {
        elements = array;
        capacity = array.length;
    }

    public LispObject typeOf()
    {
        return list3(Symbol.VECTOR, T, new Fixnum(capacity));
    }

    public LispClass classOf()
    {
        return BuiltInClass.VECTOR;
    }

    public LispObject getElementType()
    {
        return T;
    }

    public boolean isSimpleVector()
    {
        return fillPointer < 0;
    }

    public int capacity()
    {
        return capacity;
    }

    public final void ensureCapacity(int minCapacity)
    {
        if (elements.length < minCapacity) {
            LispObject[] newArray = new LispObject[minCapacity];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
            capacity = minCapacity;
        }
    }

    public Vector adjustArray(int size)
    {
        if (elements.length != size) {
            LispObject[] newArray = new LispObject[size];
            System.arraycopy(elements, 0, newArray, 0,
                             Math.min(elements.length, size));
            elements = newArray;
            capacity = size;
        }
        return this;
    }

    public int length()
    {
        return fillPointer >= 0 ? fillPointer : capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        final int limit = length();
        if (index < 0 || index >= limit)
            badIndex(index, limit);
        return elements[index];
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        try {
            return elements[Fixnum.getValue(index)];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(Fixnum.getValue(index), elements.length);
            return NIL; // Not reached.
        }
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        try {
            return elements[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            elements[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
        }
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        try {
            return elements[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
            return NIL; // Not reached.
        }
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            elements[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
        }
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        Vector v = new Vector(end - start);
        int i = start, j = 0;
        while (i < end)
            v.elements[j++] = elements[i++];
        return v;
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        for (int i = capacity; i-- > 0;)
            elements[i] = obj;
    }

    public void shrink(int n) throws ConditionThrowable
    {
        if (n < elements.length) {
            LispObject[] newArray = new LispObject[n];
            System.arraycopy(elements, 0, newArray, 0, n);
            elements = newArray;
            capacity = n;
            return;
        }
        if (n == elements.length)
            return;
        signal(new LispError());
    }

    public LispObject reverse() throws ConditionThrowable
    {
        int length = length();
        Vector result = new Vector(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.elements[i] = elements[j];
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = length() - 1;
        while (i < j) {
            LispObject temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
            ++i;
            --j;
        }
        return this;
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#(");
        // FIXME The limit should be based on the value of *PRINT-LENGTH*.
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
