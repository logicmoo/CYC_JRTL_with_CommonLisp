/*
 * SimpleVector.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: SimpleVector.java,v 1.14 2004-07-14 17:01:10 piso Exp $
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

// "The type of a vector that is not displaced to another array, has no fill
// pointer, is not expressly adjustable and is able to hold elements of any
// type is a subtype of type SIMPLE-VECTOR."
public final class SimpleVector extends AbstractVector
{
    private int capacity;
    private LispObject[] elements;

    public SimpleVector(int capacity)
    {
        elements = new LispObject[capacity];
        for (int i = capacity; i-- > 0;)
            elements[i] = NIL;
        this.capacity = capacity;
    }

    public SimpleVector(LispObject list) throws ConditionThrowable
    {
        elements = list.copyToArray();
        capacity = elements.length;
    }

    public SimpleVector(LispObject[] array)
    {
        elements = array;
        capacity = array.length;
    }

    public LispObject typeOf()
    {
        return list2(Symbol.SIMPLE_VECTOR, new Fixnum(capacity));
    }

    public LispClass classOf()
    {
        return BuiltInClass.SIMPLE_VECTOR;
    }

    public LispObject getDescription()
    {
        StringBuffer sb = new StringBuffer("A simple vector with ");
        sb.append(capacity);
        sb.append(" elements");
        return new SimpleString(sb);
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SIMPLE_VECTOR)
            return T;
        if (type == Symbol.SIMPLE_ARRAY)
            return T;
        if (type == BuiltInClass.SIMPLE_VECTOR)
            return T;
        if (type == BuiltInClass.SIMPLE_ARRAY)
            return T;
        return super.typep(type);
    }

    public LispObject getElementType()
    {
        return T;
    }

    public boolean isSimpleVector()
    {
        return true;
    }

    public boolean hasFillPointer()
    {
        return false;
    }

    public boolean isAdjustable()
    {
        return false;
    }

    public int capacity()
    {
        return capacity;
    }

    public int length()
    {
        return capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        try {
            return elements[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
            return NIL; // Not reached.
        }
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        try {
            return elements[((Fixnum)index).value];
        }
        catch (ClassCastException e) {
            return signal(new TypeError(index, Symbol.FIXNUM));
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
            badIndex(index, capacity);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            elements[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        SimpleVector v = new SimpleVector(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                v.elements[j++] = elements[i++];
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
        if (n < capacity) {
            LispObject[] newArray = new LispObject[n];
            System.arraycopy(elements, 0, newArray, 0, n);
            elements = newArray;
            capacity = n;
            return;
        }
        if (n == capacity)
            return;
        signal(new LispError());
    }

    public LispObject reverse() throws ConditionThrowable
    {
        SimpleVector result = new SimpleVector(capacity);
        int i, j;
        for (i = 0, j = capacity - 1; i < capacity; i++, j--)
            result.elements[i] = elements[j];
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = capacity - 1;
        while (i < j) {
            LispObject temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
            ++i;
            --j;
        }
        return this;
    }

    public AbstractVector adjustVector(int newCapacity,
                                       LispObject initialElement,
                                       LispObject initialContents)
        throws ConditionThrowable
    {
        if (initialContents != NIL) {
            LispObject[] newElements = new LispObject[newCapacity];
            if (initialContents.listp()) {
                LispObject list = initialContents;
                for (int i = 0; i < newCapacity; i++) {
                    newElements[i] = list.car();
                    list = list.cdr();
                }
            } else if (initialContents.vectorp()) {
                for (int i = 0; i < newCapacity; i++)
                    newElements[i] = initialContents.elt(i);
            } else
                signal(new TypeError(initialContents, Symbol.SEQUENCE));
            return new SimpleVector(newElements);
        }
        if (capacity != newCapacity) {
            LispObject[] newElements = new LispObject[newCapacity];
            System.arraycopy(elements, 0, newElements, 0,
                             Math.min(capacity, newCapacity));
            for (int i = capacity; i < newCapacity; i++)
                newElements[i] = initialElement;
            return new SimpleVector(newElements);
        }
        // No change.
        return this;
    }

    public AbstractVector adjustVector(int newCapacity,
                                       AbstractArray displacedTo,
                                       int displacement)
    {
        return new ComplexVector(newCapacity, displacedTo, displacement);
    }

    // ### svref
    // svref simple-vector index => element
    private static final Primitive2 SVREF =
        new Primitive2("svref", "simple-vector index")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                return ((SimpleVector)first).elements[((Fixnum)second).value];
            }
            catch (ClassCastException e) {
                if (first instanceof SimpleVector)
                    return signal(new TypeError(second, Symbol.FIXNUM));
                else
                    return signal(new TypeError(first, Symbol.SIMPLE_VECTOR));
            }
        }
    };

    // ### %svset
    // %svset simple-vector index new-value => new-value
    private static final Primitive3 _SVSET =
        new Primitive3("%svset", PACKAGE_SYS, false, "simple-vector index new-value")
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            try {
                ((SimpleVector)first).elements[((Fixnum)second).value] = third;
                return third;
            }
            catch (ClassCastException e) {
                if (first instanceof SimpleVector)
                    return signal(new TypeError(second, Symbol.FIXNUM));
                else
                    return signal(new TypeError(first, Symbol.SIMPLE_VECTOR));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                int index = ((Fixnum)second).value;
                int capacity = ((SimpleVector)first).capacity;
                ((SimpleVector)first).badIndex(index, capacity);
                // Not reached.
                return NIL;
            }
        }
    };
}
