/*
 * SimpleBitVector.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SimpleBitVector.java,v 1.6 2004-02-25 16:58:19 piso Exp $
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

// "The type of a bit vector that is not displaced to another array, has no
// fill pointer, and is not expressly adjustable is a subtype of type SIMPLE-
// BIT-VECTOR."
public final class SimpleBitVector extends AbstractBitVector
{
    public SimpleBitVector(int capacity) // throws ConditionThrowable
    {
        this.capacity = capacity;
        int size = capacity >>> 6;
        if ((capacity & LONG_MASK) != 0)
            ++size;
        bits = new long[size];
    }

    public SimpleBitVector(String s) throws ConditionThrowable
    {
        this(s.length());
        for (int i = capacity; i-- > 0;) {
            char c = s.charAt(i);
            if (c == '0')
                ;
            else if (c == '1')
                setBit(i);
            else
                Debug.assertTrue(false);
        }
    }

    public LispObject typeOf()
    {
        return list2(Symbol.SIMPLE_BIT_VECTOR, new Fixnum(capacity));
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SIMPLE_BIT_VECTOR)
            return isSimpleVector() ? T : NIL;
        if (type == Symbol.SIMPLE_ARRAY)
            return T;
        return super.typep(type);
    }

    public boolean hasFillPointer()
    {
        return false;
    }

    public boolean isAdjustable()
    {
        return false;
    }

    public boolean isSimpleVector()
    {
        return true;
    }

    public int length()
    {
        return capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        if (index < 0 || index >= length())
            badIndex(index, length());
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        if (index < 0 || index >= capacity)
            badIndex(index, capacity);
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        if (index < 0 || index >= capacity)
            badIndex(index, capacity);
        final int offset = index >> 6;
        try {
            switch (((Fixnum)newValue).value) {
                case 0:
                    bits[offset] &= ~(1L << index);
                    return;
                case 1:
                    bits[offset] |= 1L << index;
                    return;
            }
        }
        catch (ClassCastException e) {
            // Fall through...
        }
        signal(new TypeError(newValue, Symbol.BIT));
    }

    protected int getBit(int index)
    {
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? 1 : 0;
    }

    protected void setBit(int index)
    {
        int offset = index >> 6;
        bits[offset] |= 1L << index;
    }

    protected void clearBit(int index)
    {
        int offset = index >> 6;
        bits[offset] &= ~(1L << index);
    }

    public void shrink(int n) throws ConditionThrowable
    {
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
        signal(new LispError());
    }

    public AbstractVector adjustVector(int newCapacity, LispObject initialElement,
                                       LispObject initialContents)
        throws ConditionThrowable
    {
        SimpleBitVector v = new SimpleBitVector(newCapacity);
        if (initialContents != NIL) {
            if (initialContents.listp()) {
                LispObject list = initialContents;
                for (int i = 0; i < newCapacity; i++) {
                    v.set(i, list.car());
                    list = list.cdr();
                }
            } else if (initialContents.vectorp()) {
                for (int i = 0; i < newCapacity; i++)
                    v.set(i, initialContents.elt(i));
            } else
                signal(new TypeError(initialContents, Symbol.SEQUENCE));
        } else {
            final int limit = Math.min(capacity, newCapacity);
            for (int i = limit; i-- > 0;) {
                if (getBit(i) == 1)
                    v.setBit(i);
                else
                    v.clearBit(i);
            }
            if (newCapacity > capacity) {
                int n = Fixnum.getValue(initialElement);
                if (n == 1)
                    for (int i = capacity; i < newCapacity; i++)
                        v.setBit(i);
                else
                    for (int i = capacity; i < newCapacity; i++)
                        v.clearBit(i);
            }
        }
        return v;
    }

    public AbstractVector adjustVector(int newCapacity, AbstractArray displacedTo,
                                       int displacement)
        throws ConditionThrowable
    {
        return new ComplexBitVector(newCapacity, displacedTo, displacement);
    }
}
