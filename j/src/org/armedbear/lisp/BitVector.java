/*
 * BitVector.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: BitVector.java,v 1.31 2004-02-24 12:56:09 piso Exp $
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

public final class BitVector extends AbstractVector
{
    private static final int LONG_MASK = 0x3f;

    private int capacity;
    private int fillPointer = -1; // -1 indicates no fill pointer.
    private long[] bits;

    public BitVector(int length) throws ConditionThrowable
    {
        if (length < 0)
            throw new NegativeArraySizeException();
        capacity = length;
        int size = length >>> 6;
        if ((length & LONG_MASK) != 0)
            ++size;
        bits = new long[size];
    }

    public BitVector(String s) throws ConditionThrowable
    {
        this(s.length());
        for (int i = s.length(); i-- > 0;) {
            char c = s.charAt(i);
            if (c == '0')
                ;
            else if (c == '1')
                set(i);
            else
                Debug.assertTrue(false);
        }
    }

    public LispObject typeOf()
    {
        if (isSimpleVector())
            return list2(Symbol.SIMPLE_BIT_VECTOR, new Fixnum(length()));
        return list2(Symbol.BIT_VECTOR, new Fixnum(length()));
    }

    public LispClass classOf()
    {
        return BuiltInClass.BIT_VECTOR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.BIT_VECTOR)
            return T;
        if (type == Symbol.SIMPLE_BIT_VECTOR)
            return isSimpleVector() ? T : NIL;
        if (type == BuiltInClass.BIT_VECTOR)
            return T;
        if (type == Symbol.SIMPLE_ARRAY)
            return fillPointer < 0 ? T : NIL; // FIXME displaced, adjustable
        return super.typep(type);
    }

    public LispObject BIT_VECTOR_P()
    {
        return T;
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

    public LispObject getElementType()
    {
        return Symbol.BIT;
    }

    public int capacity()
    {
        return capacity;
    }

    public final void ensureCapacity(int minCapacity)
    {
        if (capacity < minCapacity) {
            int size = minCapacity >>> 6;
            if ((minCapacity & LONG_MASK) != 0)
                ++size;
            long[] newBits = new long[size];
            System.arraycopy(bits, 0, newBits, 0, bits.length);
            bits = newBits;
            capacity = minCapacity;
        }
    }

    public int length()
    {
        return fillPointer >= 0 ? fillPointer : capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        if (index < 0 || index >= length())
            badIndex(index, length());
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        return get(Fixnum.getValue(index));
    }

    public LispObject reverse() throws ConditionThrowable
    {
        int length = length();
        BitVector result = new BitVector(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--) {
            if (_get(j) == 1)
                result.set(i);
            else
                result.clear(i);
        }
        return result;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        return get(index);
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        set(index, newValue);
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        if (index >= capacity)
            badIndex(index, capacity);
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    private int _get(int index)
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
                set(index);
                return;
            }
            if (n == 0) {
                clear(index);
                return;
            }
            // None of the above...
        }
        catch (ConditionThrowable t) {}
        signal(new TypeError(newValue, "bit"));
    }

    public void set(int index)
    {
        int offset = index >> 6;
        bits[offset] |= 1L << index;
    }

    public void clear(int index)
    {
        int offset = index >> 6;
        bits[offset] &= ~(1L << index);
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        BitVector v = new BitVector(end - start);
        int i = start, j = 0;
        try {
            while (i < end) {
                if (_get(i++) == 0)
                    v.clear(j++);
                else
                    v.set(j++);
            }
            return v;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new TypeError("Array index out of bounds: " + i + "."));
        }
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
        signal(new TypeError(obj, "bit"));
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
        return fillPointer < 0;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof BitVector) {
            BitVector v = (BitVector) obj;
            if (length() != v.length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (_get(i) != v._get(i))
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof BitVector) {
            BitVector v = (BitVector) obj;
            if (length() != v.length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (_get(i) != v._get(i))
                    return false;
            }
            return true;
        }
        if (obj instanceof AbstractVector)
            return ((AbstractVector)obj).equalp(this);
        return false;
    }

    public int hashCode()
    {
        int hashCode = 1;
        // Consider first 64 bits only.
        final int limit = Math.min(length(), 64);
        for (int i = 0; i < limit; i++)
            hashCode = hashCode * 31 + _get(i);
        return hashCode;
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
        set(fp, element);
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
        set(fp, element);
        setFillPointer(fp + 1);
        return new Fixnum(fp);
    }

    public String toString()
    {
        final int limit = length();
        StringBuffer sb = new StringBuffer(limit + 2);
        sb.append("#*");
        for (int i = 0; i < limit; i++)
            sb.append(_get(i) == 1 ? '1' : '0');
        return sb.toString();
    }
}
