/*
 * SimpleBitVector.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SimpleBitVector.java,v 1.1 2004-02-24 22:21:00 piso Exp $
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

public final class SimpleBitVector extends AbstractBitVector
{
    private int capacity;
    private long[] bits;

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
        if (index < 0 || index >= length())
            badIndex(index, length());
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        if (index >= capacity)
            badIndex(index, capacity);
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    protected int getBit(int index)
    {
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? 1 : 0;
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        if (index >= capacity)
            badIndex(index, capacity);
        try {
            int n = Fixnum.getValue(newValue);
            if (n == 1) {
                setBit(index);
                return;
            }
            if (n == 0) {
                clearBit(index);
                return;
            }
            // None of the above...
        }
        catch (ConditionThrowable t) {}
        signal(new TypeError(newValue, "bit"));
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

    public void fill(LispObject obj) throws ConditionThrowable
    {
        try {
            int n = Fixnum.getValue(obj);
            if (n == 1) {
                for (int i = bits.length; i-- > 0;)
                    bits[i] = -1L;
                return;
            }
            if (n == 0) {
                for (int i = bits.length; i-- > 0;)
                    bits[i] = 0;
                return;
            }
            // None of the above...
        }
        catch (ConditionThrowable t) {}
        signal(new TypeError(obj, Symbol.BIT));
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

    public boolean isSimpleVector()
    {
        return true;
    }
}
