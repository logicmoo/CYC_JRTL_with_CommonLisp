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

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.VECTOR)
            return T;
        if (type == BuiltInClass.VECTOR)
            return T;
        if (type == Symbol.SEQUENCE)
            return T;
        if (type == BuiltInClass.SEQUENCE)
            return T;
        if (type == Symbol.SIMPLE_VECTOR)
            return isSimpleVector() ? T : NIL;
        if (type == Symbol.SIMPLE_ARRAY)
            return fillPointer < 0 ? T : NIL;
        return super.typep(type);
    }

    public final boolean vectorp()
    {
        return true;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
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

    public final int getDimension(int n) throws ConditionThrowable
    {
        if (n != 0) {
            signal(new TypeError("bad dimension for vector"));
            // Not reached.
            return 0;
        }
        return capacity();
    }

    public final int getTotalSize()
    {
        return capacity();
    }

    public abstract int capacity();

    public abstract void ensureCapacity(int minCapacity);

    public abstract LispObject get(int index) throws ConditionThrowable;

    public abstract void set(int index, LispObject newValue) throws ConditionThrowable;

    public abstract LispObject subseq(int start, int end) throws ConditionThrowable;

    public abstract void fill(LispObject obj) throws ConditionThrowable;

    public abstract void shrink(int n) throws ConditionThrowable;

    public int checkIndex(int index) throws ConditionThrowable
    {
        if (index < 0 || index >= capacity())
            badIndex(index, capacity());
        return index;
    }

    public int checkIndex(LispObject index) throws ConditionThrowable
    {
        int i = Fixnum.getValue(index);
        if (i < 0 || i >= capacity())
            badIndex(i, capacity());
        return i;
    }

    protected void badIndex(int index, int limit) throws ConditionThrowable
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
        signal(new TypeError(sb.toString()));
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

    public boolean isSimpleVector()
    {
        return false;
    }

    public abstract LispObject reverse() throws ConditionThrowable;

    public LispObject nreverse() throws ConditionThrowable
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
        return this;
    }

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
}
