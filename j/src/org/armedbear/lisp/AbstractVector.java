/*
 * AbstractVector.java
 *
 * Copyright (C) 2003 Peter Graves
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

public abstract class AbstractVector extends AbstractArray
{
    protected int fillPointer = -1; // -1 indicates no fill pointer.

    public int getType()
    {
        return TYPE_VECTOR;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier instanceof Symbol) {
            if (typeSpecifier == Symbol.VECTOR)
                return T;
            if (typeSpecifier == Symbol.ARRAY)
                return T;
            if (typeSpecifier == Symbol.SEQUENCE)
                return T;
            if (typeSpecifier == Symbol.SIMPLE_VECTOR)
                return isSimpleVector() ? T : NIL;
            if (typeSpecifier == Symbol.SIMPLE_ARRAY)
                return fillPointer < 0 ? T : NIL;
        } else if (typeSpecifier instanceof LispClass) {
            final String name = typeSpecifier.getName();
            if (name.equals("VECTOR"))
                return T;
            if (name.equals("ARRAY"))
                return T;
        } else if (typeSpecifier instanceof Cons) {
            return CompoundTypeSpecifier.getInstance(typeSpecifier).test(this);
        }
        return super.typep(typeSpecifier);
    }

    public boolean equalp(LispObject obj) throws LispError
    {
        if (obj instanceof AbstractVector) {
            if (length() != obj.length())
                return false;
            AbstractVector v = (AbstractVector) obj;
            for (int i = length(); i-- > 0;)
                if (!get(i).equalp(v.get(i)))
                    return false;
            return true;
        }
        return false;
    }

    public int getRank()
    {
        return 1;
    }

    public final LispObject getDimensions()
    {
        return new Cons(new Fixnum(capacity()));
    }

    public final int getDimension(int n) throws LispError
    {
        if (n != 0)
            throw new TypeError("bad dimension for vector");
        return capacity();
    }

    public final int getTotalSize()
    {
        return capacity();
    }

    public abstract int capacity();

    public abstract void ensureCapacity(int minCapacity);

    public abstract LispObject get(int index) throws LispError;

    public abstract void set(int index, LispObject newValue) throws LispError;

    public abstract LispObject subseq(int start, int end) throws LispError;

    public abstract void fill(LispObject obj) throws LispError;

    public abstract void shrink(int n) throws LispError;

    public int checkIndex(int index) throws LispError
    {
        if (index < 0 || index >= capacity())
            badIndex(index, capacity());
        return index;
    }

    public int checkIndex(LispObject index) throws LispError
    {
        int i = Fixnum.getValue(index);
        if (i < 0 || i >= capacity())
            badIndex(i, capacity());
        return i;
    }

    protected void badIndex(int index, int limit) throws LispError
    {
        StringBuffer sb = new StringBuffer("invalid array index ");
        sb.append(index);
        sb.append(" for ");
        sb.append(toString());
        if (limit > 0) {
            sb.append(" (should be >= 0 and < ");
            sb.append(limit);
            sb.append(')');
        }
        throw new TypeError(sb.toString());
    }

    public int getFillPointer()
    {
        return fillPointer;
    }

    public void setFillPointer(int n)
    {
        fillPointer = n;
    }

    public void setFillPointer(LispObject obj) throws LispError
    {
        if (obj == T)
            fillPointer = capacity();
        else {
            int n = Fixnum.getValue(obj);
            if (n > capacity()) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the capacity of the vector (");
                sb.append(capacity());
                sb.append(")");
                throw new LispError(sb.toString());
            }
            if (n < 0) {
                StringBuffer sb = new StringBuffer("the new fill pointer (");
                sb.append(n);
                sb.append(") is negative");
                throw new LispError(sb.toString());
            }
            fillPointer = n;
        }
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    public abstract LispObject reverse() throws LispError;

    public void nreverse() throws LispError
    {
        int i = 0;
        int j = length() - 1;
        while (i < j) {
            LispObject temp = get(i);
            set(i, get(j));
            set(j, temp);
            ++i;
            --j;
        }
    }
}
