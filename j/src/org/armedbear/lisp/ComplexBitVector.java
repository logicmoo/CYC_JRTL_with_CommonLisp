/*
 * ComplexBitVector.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: ComplexBitVector.java,v 1.8 2004-03-15 17:02:47 piso Exp $
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

public final class ComplexBitVector extends AbstractBitVector
{
    private int fillPointer = -1; // -1 indicates no fill pointer.
    private boolean isDisplaced;

    // For displaced bit-vectors.
    private AbstractArray array;
    private int displacement;

    public ComplexBitVector(int capacity) throws ConditionThrowable
    {
        this.capacity = capacity;
        int size = capacity >>> 6;
        if ((capacity & LONG_MASK) != 0)
            ++size;
        bits = new long[size];
    }

    public ComplexBitVector(int capacity, AbstractArray array, int displacement)
    {
        this.capacity = capacity;
        this.array = array;
        this.displacement = displacement;
        isDisplaced = true;
    }

    public LispObject typeOf()
    {
        return list2(Symbol.BIT_VECTOR, new Fixnum(capacity));
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

    public LispObject arrayDisplacement()
    {
        LispObject value1, value2;
        if (array != null) {
            value1 = array;
            value2 = new Fixnum(displacement);
        } else {
            value1 = NIL;
            value2 = Fixnum.ZERO;
        }
        return LispThread.currentThread().setValues(value1, value2);
    }

    public int length()
    {
        return fillPointer >= 0 ? fillPointer : capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        // The index < 0 case is checked in get().
        if (index >= length())
            badIndex(index, length());
        return getRowMajor(index);
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        if (bits != null) {
            if (index < 0 || index >= capacity)
                badIndex(index, capacity);
            int offset = index >> 6;
            return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
        } else
            return array.getRowMajor(index + displacement);
    }

    protected int getBit(int index) throws ConditionThrowable
    {
        if (bits != null) {
            int offset = index >> 6;
            return (bits[offset] & (1L << index)) != 0 ? 1 : 0;
        } else
            return Fixnum.getValue(array.getRowMajor(index + displacement));
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        if (index < 0 || index >= capacity)
            badIndex(index, capacity);
        try {
            switch (((Fixnum)newValue).value) {
                case 0:
                    if (bits != null) {
                        final int offset = index >> 6;
                        bits[offset] &= ~(1L << index);
                    } else
                        clearBit(index);
                    return;
                case 1:
                    if (bits != null) {
                        final int offset = index >> 6;
                        bits[offset] |= 1L << index;
                    } else
                        setBit(index);
                    return;
            }
        }
        catch (ClassCastException e) {
            // Fall through...
        }
        signal(new TypeError(newValue, Symbol.BIT));
    }

    protected void setBit(int index) throws ConditionThrowable
    {
        if (bits != null) {
            int offset = index >> 6;
            bits[offset] |= 1L << index;
        } else
            array.setRowMajor(index + displacement, Fixnum.ONE);
    }

    protected void clearBit(int index) throws ConditionThrowable
    {
        if (bits != null) {
            int offset = index >> 6;
            bits[offset] &= ~(1L << index);
        } else
            array.setRowMajor(index + displacement, Fixnum.ZERO);
    }

    public void shrink(int n) throws ConditionThrowable
    {
        if (bits != null) {
            if (n < capacity) {
                int size = n >>> 6;
                if ((n & LONG_MASK) != 0)
                    ++size;
                if (size < bits.length) {
                    long[] newbits = new long[size];
                    System.arraycopy(bits, 0, newbits, 0, size);
                    bits = newbits;
                }
                capacity = n;
                return;
            }
            if (n == capacity)
                return;
        }
        signal(new LispError());
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    // FIXME
    public LispObject vectorPushExtend(LispObject element)
        throws ConditionThrowable
    {
        final int fp = getFillPointer();
        if (fp < 0)
            noFillPointer();
        if (fp >= capacity()) {
            // Need to extend vector.
            ensureCapacity(capacity() * 2 + 1);
        }
        setRowMajor(fp, element);
        setFillPointer(fp + 1);
        return new Fixnum(fp);
    }

    // FIXME
    public LispObject vectorPushExtend(LispObject element, LispObject extension)
        throws ConditionThrowable
    {
        int ext = Fixnum.getValue(extension);
        final int fp = getFillPointer();
        if (fp < 0)
            noFillPointer();
        if (fp >= capacity()) {
            // Need to extend vector.
            ext = Math.max(ext, capacity() + 1);
            ensureCapacity(capacity() + ext);
        }
        setRowMajor(fp, element);
        setFillPointer(fp + 1);
        return new Fixnum(fp);
    }

    private final void ensureCapacity(int minCapacity) throws ConditionThrowable
    {
        if (bits != null) {
            if (capacity < minCapacity) {
                int size = minCapacity >>> 6;
                if ((minCapacity & LONG_MASK) != 0)
                    ++size;
                long[] newBits = new long[size];
                System.arraycopy(bits, 0, newBits, 0, bits.length);
                bits = newBits;
                capacity = minCapacity;
            }
        } else {
            Debug.assertTrue(array != null);
            if (array.getTotalSize() - displacement < minCapacity) {
                // Copy array.
                int size = minCapacity >>> 6;
                if ((minCapacity & LONG_MASK) != 0)
                    ++size;
                bits = new long[size];
                for (int i = 0; i < capacity; i++) {
                    int n = Fixnum.getValue(array.getRowMajor(displacement + i));
                    if (n == 1)
                        setBit(i);
                    else
                        clearBit(i);
                }
                capacity = minCapacity;
                array = null;
                displacement = 0;
                isDisplaced = false;
            }
        }
    }

    public AbstractVector adjustVector(int newCapacity,
                                       LispObject initialElement,
                                       LispObject initialContents)
        throws ConditionThrowable
    {
        if (bits == null) {
            // Copy array.
            int size = capacity >>> 6;
            if ((capacity & LONG_MASK) != 0)
                ++size;
            bits = new long[size];
            for (int i = 0; i < capacity; i++) {
                int n = Fixnum.getValue(array.getRowMajor(displacement + i));
                if (n == 1)
                    setBit(i);
                else
                    clearBit(i);
            }
            array = null;
            displacement = 0;
            isDisplaced = false;
        }
        if (capacity != newCapacity) {
            int size = newCapacity >>> 6;
            if ((newCapacity & LONG_MASK) != 0)
                ++size;
            if (initialContents != NIL) {
                bits = new long[size];
                if (initialContents.listp()) {
                    LispObject list = initialContents;
                    for (int i = 0; i < newCapacity; i++) {
                        setRowMajor(i, list.car());
                        list = list.cdr();
                    }
                } else if (initialContents.vectorp()) {
                    for (int i = 0; i < newCapacity; i++)
                        setRowMajor(i, initialContents.elt(i));
                } else
                    signal(new TypeError(initialContents, Symbol.SEQUENCE));
            } else {
                long[] newBits = new long[size];
                System.arraycopy(bits, 0, newBits, 0,
                                 Math.min(bits.length, newBits.length));
                bits = newBits;
                if (newCapacity > capacity) {
                    int n = Fixnum.getValue(initialElement);
                    if (n == 1)
                        for (int i = capacity; i < newCapacity; i++)
                            setBit(i);
                    else
                        for (int i = capacity; i < newCapacity; i++)
                            clearBit(i);
                }
            }
            capacity = newCapacity;
        }
        return this;
    }

    public AbstractVector adjustVector(int size, AbstractArray displacedTo,
                                       int displacement)
        throws ConditionThrowable
    {
        capacity = size;
        array = displacedTo;
        this.displacement = displacement;
        bits = null;
        isDisplaced = true;
        return this;
    }
}
