/*
 * ComplexVector.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: ComplexVector.java,v 1.3 2004-02-24 16:35:08 piso Exp $
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

// A vector that is displaced to another array, has a fill pointer, and/or is
// expressly adjustable. It can hold elements of any type.
public final class ComplexVector extends AbstractVector
{
    private int capacity;
    private int fillPointer = -1; // -1 indicates no fill pointer.
    private boolean isDisplaced;

    // For non-displaced arrays.
    private LispObject[] elements;

    // For displaced arrays.
    private AbstractArray array;
    private int displacement;

    public ComplexVector(int capacity)
    {
        elements = new LispObject[capacity];
        for (int i = capacity; i-- > 0;)
            elements[i] = NIL;
        this.capacity = capacity;
    }

    public ComplexVector(LispObject list) throws ConditionThrowable
    {
        elements = list.copyToArray();
        capacity = elements.length;
    }

    public ComplexVector(LispObject[] array)
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

    public boolean hasFillPointer()
    {
        return fillPointer >= 0;
    }

    public int getFillPointer()
    {
        return fillPointer;
    }

    public void setFillPointer(int n)
    {
        fillPointer = n;
    }

    public void setFillPointer(LispObject obj) throws ConditionThrowable
    {
        if (obj == T)
            fillPointer = capacity();
        else {
            int n = Fixnum.getValue(obj);
            if (n > capacity()) {
                StringBuffer sb = new StringBuffer("The new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the capacity of the vector (");
                sb.append(capacity());
                sb.append(").");
                signal(new LispError(sb.toString()));
            } else if (n < 0) {
                StringBuffer sb = new StringBuffer("The new fill pointer (");
                sb.append(n);
                sb.append(") is negative.");
                signal(new LispError(sb.toString()));
            } else
                fillPointer = n;
        }
    }

    public boolean isDisplaced()
    {
        return isDisplaced;
    }

    public LispObject getElementType()
    {
        return T;
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    public int capacity()
    {
        return capacity;
    }

    public AbstractArray adjustArray(int size, LispObject initialElement,
                                     LispObject initialContents)
        throws ConditionThrowable
    {
        if (elements.length != size) {
            LispObject[] newArray = new LispObject[size];
            if (initialContents != NIL) {
                if (initialContents.listp()) {
                    LispObject list = initialContents;
                    for (int i = 0; i < size; i++) {
                        newArray[i] = list.car();
                        list = list.cdr();
                    }
                } else if (initialContents.vectorp()) {
                    for (int i = 0; i < size; i++)
                        newArray[i] = initialContents.elt(i);
                } else
                    signal(new TypeError(initialContents, Symbol.SEQUENCE));
            } else {
                System.arraycopy(elements, 0, newArray, 0,
                                 Math.min(elements.length, size));
                if (size > elements.length) {
                    for (int i = elements.length; i < size; i++)
                        newArray[i] = initialElement;
                }
            }
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
        SimpleVector v = new SimpleVector(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                v.set(j++, get(i++));
            return v;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new TypeError("Array index out of bounds: " + i + "."));
        }
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
        SimpleVector result = new SimpleVector(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.set(i, get(j));
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

    public LispObject vectorPushExtend(LispObject element)
        throws ConditionThrowable
    {
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= capacity) {
            // Need to extend vector.
            ensureCapacity(capacity * 2 + 1);
        }
        set(fillPointer, element);
        return new Fixnum(fillPointer++);
    }

    public LispObject vectorPushExtend(LispObject element, LispObject extension)
        throws ConditionThrowable
    {
        int ext = Fixnum.getValue(extension);
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= capacity) {
            // Need to extend vector.
            ext = Math.max(ext, capacity + 1);
            ensureCapacity(capacity + ext);
        }
        set(fillPointer, element);
        return new Fixnum(fillPointer++);
    }

    private final void ensureCapacity(int minCapacity) throws ConditionThrowable
    {
        if (elements != null) {
            if (capacity < minCapacity) {
                LispObject[] newArray = new LispObject[minCapacity];
                System.arraycopy(elements, 0, newArray, 0, capacity);
                elements = newArray;
                capacity = minCapacity;
            }
        } else {
            Debug.assertTrue(array != null);
            if (array.getTotalSize() - displacement < minCapacity) {
                // Copy array.
                elements = new LispObject[minCapacity];
                final int limit = array.getTotalSize() - displacement;
                for (int i = 0; i < limit; i++)
                    elements[i] = array.getRowMajor(displacement + i);
                capacity = minCapacity;
                array = null;
                displacement = 0;
                isDisplaced = false;
            }
        }
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
