/*
 * BitVector.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: BitVector.java,v 1.19 2003-08-17 15:02:20 piso Exp $
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
    private long[] bits;

    public BitVector(int length) throws LispError
    {
        if (length < 0)
            throw new NegativeArraySizeException();
        capacity = length;
        int size = length >>> 6;
        if ((length & LONG_MASK) != 0)
            ++size;
        bits = new long[size];
    }

    public BitVector(String s) throws LispError
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

    public int getType()
    {
        return TYPE_BIT_VECTOR | TYPE_VECTOR;
    }

    public LispObject typeOf()
    {
        if (isSimpleVector())
            return list(Symbol.SIMPLE_BIT_VECTOR, new Fixnum(length()));
        return list(Symbol.BIT_VECTOR, new Fixnum(length()));
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier == Symbol.BIT_VECTOR)
            return T;
        if (typeSpecifier == Symbol.SIMPLE_BIT_VECTOR)
            return isSimpleVector() ? T : NIL;
        if (typeSpecifier == Symbol.SIMPLE_VECTOR)
            return NIL; // Can't hold elements of any type, only bits.
        if (typeSpecifier instanceof LispClass) {
            if (typeSpecifier.getName().equals("BIT-VECTOR"))
                return T;
        } else if (typeSpecifier instanceof Cons && typeSpecifier.length() == 2) {
            LispObject first = typeSpecifier.car();
            if (first == Symbol.BIT_VECTOR ||
                (first == Symbol.SIMPLE_BIT_VECTOR && isSimpleVector())) {
                LispObject second = typeSpecifier.cadr();
                if (second instanceof Fixnum)
                    return ((Fixnum)second).getValue() == length() ? T : NIL;
                if (second == Symbol.UNSPECIFIED)
                    return T;
            }
        }
        return super.typep(typeSpecifier);
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

    public LispObject elt(int index) throws LispError
    {
        if (index < 0 || index >= length())
            badIndex(index, length());
        int offset = index >> 6;
        return (bits[offset] & (1L << index)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws LispError
    {
        return get(Fixnum.getValue(index));
    }

    public LispObject reverse() throws LispError
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

    public LispObject getRowMajor(int index) throws LispError
    {
        return get(index);
    }

    public void setRowMajor(int index, LispObject newValue) throws LispError
    {
        set(index, newValue);
    }

    public LispObject get(int index) throws LispError
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

    public void set(int index, LispObject newValue) throws LispError
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
        catch (TypeError e) {}
        throw new TypeError(newValue, "bit");
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

    public LispObject subseq(int start, int end) throws LispError
    {
        BitVector v = new BitVector(end - start);
        int i = start, j = 0;
        while (i < end) {
            if (_get(i++) == 0)
                v.clear(j++);
            else
                v.set(j++);
        }
        return v;
    }

    public void fill(LispObject obj) throws LispError
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
        catch (TypeError e) {}
        throw new TypeError(obj, "bit");
    }

    public void shrink(int n) throws LispError
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
        throw new LispError();
    }

    public boolean isSimpleVector()
    {
        return fillPointer < 0;
    }

    public boolean equal(LispObject obj) throws LispError
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

    public boolean equalp(LispObject obj) throws LispError
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
