/*
 * AbstractBitVector.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: AbstractBitVector.java,v 1.6 2004-04-26 17:28:18 piso Exp $
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

public abstract class AbstractBitVector extends AbstractVector
{
    protected static final int LONG_MASK = 0x3f;

    protected int capacity;

    // For non-displaced bit-vectors.
    protected long[] bits;

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.BIT_VECTOR)
            return T;
        if (type == BuiltInClass.BIT_VECTOR)
            return T;
        return super.typep(type);
    }

    public LispClass classOf()
    {
        return BuiltInClass.BIT_VECTOR;
    }

    public final LispObject BIT_VECTOR_P()
    {
        return T;
    }

    public final int capacity()
    {
        return capacity;
    }

    public final LispObject getElementType()
    {
        return Symbol.BIT;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof AbstractBitVector) {
            AbstractBitVector v = (AbstractBitVector) obj;
            if (length() != v.length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (getBit(i) != v.getBit(i))
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
        if (obj instanceof AbstractBitVector) {
            AbstractBitVector v = (AbstractBitVector) obj;
            if (length() != v.length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (getBit(i) != v.getBit(i))
                    return false;
            }
            return true;
        }
        if (obj instanceof AbstractVector)
            return ((AbstractVector)obj).equalp(this);
        return false;
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        try {
            switch (((Fixnum)obj).value) {
                case 0:
                    if (bits != null) {
                        for (int i = bits.length; i-- > 0;)
                            bits[i] = 0;
                    } else {
                        for (int i = capacity; i-- > 0;)
                            clearBit(i);
                    }
                    return;
                case 1:
                    if (bits != null) {
                        for (int i = bits.length; i-- > 0;)
                            bits[i] = -1L;
                    } else {
                        for (int i = capacity; i-- > 0;)
                            setBit(i);
                    }
                    return;
            }
        }
        catch (ClassCastException e) {
            // Fall through...
        }
        signal(new TypeError(obj, Symbol.BIT));
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        SimpleBitVector v = new SimpleBitVector(end - start);
        int i = start, j = 0;
        try {
            while (i < end) {
                if (getBit(i++) == 0)
                    v.clearBit(j++);
                else
                    v.setBit(j++);
            }
            return v;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new TypeError("Array index out of bounds: " + i + "."));
        }
    }

    public int hashCode()
    {
        int hashCode = 1;
        try {
            // Consider first 64 bits only.
            final int limit = Math.min(length(), 64);
            for (int i = 0; i < limit; i++)
                hashCode = hashCode * 31 + getBit(i);
        }
        catch (ConditionThrowable t) {
            // Shouldn't happen.
            Debug.trace(t);
        }
        return hashCode;
    }

    public String writeToString() throws ConditionThrowable
    {
        try {
            final int limit = length();
            StringBuffer sb = new StringBuffer(limit + 2);
            sb.append("#*");
            for (int i = 0; i < limit; i++)
                sb.append(getBit(i) == 1 ? '1' : '0');
            return sb.toString();
        }
        catch (ConditionThrowable t) {
            // Shouldn't happen.
            Debug.trace(t);
            return null;
        }
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        try {
            return getRowMajor(((Fixnum)index).value);
        }
        catch (ClassCastException e) {
            return signal(new TypeError(index, Symbol.FIXNUM));
        }
    }

    public LispObject reverse() throws ConditionThrowable
    {
        int length = length();
        SimpleBitVector result = new SimpleBitVector(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--) {
            if (getBit(j) == 1)
                result.setBit(i);
            else
                result.clearBit(i);
        }
        return result;
    }

    protected abstract int getBit(int index) throws ConditionThrowable;

    protected abstract void setBit(int index) throws ConditionThrowable;

    protected abstract void clearBit(int index) throws ConditionThrowable;
}
