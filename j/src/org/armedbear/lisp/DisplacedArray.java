/*
 * DisplacedArray.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: DisplacedArray.java,v 1.22 2004-02-14 17:28:26 piso Exp $
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

public final class DisplacedArray extends AbstractArray
{
    private final int[] dimv;
    private final int size;
    private final AbstractArray array;
    private final int offset;
    private final boolean stringp;

    private int fillPointer = -1; // -1 indicates no fill pointer.

    public DisplacedArray(int[] dimv, AbstractArray array, int offset)
    {
        this.dimv = dimv;
        size = computeTotalSize(dimv);
        this.array = array;
        this.offset = offset;
        stringp = (dimv.length == 1 && array.stringp());
    }

    private static int computeTotalSize(int[] dimensions)
    {
        int size = 1;
        for (int i = dimensions.length; i-- > 0;)
            size *= dimensions[i];
        return size;
    }

    public LispObject typeOf()
    {
        if (dimv.length == 1) {
            if (array instanceof LispString)
                return Symbol.STRING;
            if (array instanceof BitVector)
                return Symbol.BIT_VECTOR;
            return list3(Symbol.VECTOR, T, new Fixnum(size));
        }
        return list3(Symbol.ARRAY, T, getDimensions());
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.VECTOR || type == BuiltInClass.VECTOR)
            return VECTORP();
        if (type == Symbol.BIT_VECTOR || type == BuiltInClass.BIT_VECTOR)
            return BIT_VECTOR_P();
        if (type == Symbol.SEQUENCE || type == BuiltInClass.SEQUENCE)
            return VECTORP();
        return super.typep(type);
    }

    public LispObject BIT_VECTOR_P()
    {
        if (dimv.length == 1)
            return array.BIT_VECTOR_P();
        return NIL;
    }

    public LispObject STRINGP()
    {
        return stringp ? T : NIL;
    }

    public boolean stringp()
    {
        return stringp;
    }

    public char[] chars() throws ConditionThrowable
    {
        if (!stringp)
            signal(new TypeError(this, Symbol.STRING));
        char[] chars = new char[size];
        Debug.assertTrue(array.stringp());
        System.arraycopy(array.chars(), offset, chars, 0, size);
        return chars;
    }

    public boolean vectorp()
    {
        return dimv.length == 1;
    }

    public int length() throws ConditionThrowable
    {
        if (dimv.length == 1)
            return fillPointer >= 0 ? fillPointer : size;
        signal(new TypeError(this, Symbol.SEQUENCE));
        // Not reached.
        return 0;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        if (dimv.length == 1)
            return getRowMajor(index);
        return signal(new TypeError(this, Symbol.SEQUENCE));
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        if (dimv.length == 1)
            return getRowMajor(Fixnum.getValue(index));
        StringBuffer sb = new StringBuffer("AREF: ");
        sb.append("wrong number of subscripts (1) for array of rank ");
        sb.append(getRank());
        return signal(new ProgramError(sb.toString()));
    }

    public int getRank()
    {
        return dimv.length;
    }

    public LispObject getDimensions()
    {
        LispObject result = NIL;
        for (int i = dimv.length; i-- > 0;)
            result = new Cons(new Fixnum(dimv[i]), result);
        return result;
    }

    public int getDimension(int n) throws ConditionThrowable
    {
        try {
            return dimv[n];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            signal(new TypeError("Bad array dimension."));
            // Not reached.
            return 0;
        }
    }

    public LispObject getElementType()
    {
        return array.getElementType();
    }

    public int getTotalSize()
    {
        return size;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        if (index >= 0 && index < size)
            return array.getRowMajor(index + offset);
        return signal(new TypeError("Bad row major index " + index + "."));
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        if (index >= 0 && index < size)
            array.setRowMajor(index + offset, newValue);
        else
            signal(new TypeError("Bad row major index " + index + "."));
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
            fillPointer = size;
        else {
            int n = Fixnum.getValue(obj);
            if (n > size) {
                StringBuffer sb = new StringBuffer("The new fill pointer (");
                sb.append(n);
                sb.append(") exceeds the capacity of the vector (");
                sb.append(size);
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

    public String toString()
    {
        if (array instanceof LispString) {
            LispString s = (LispString) array;
            return s.toString(offset, offset + size);
        }
        StringBuffer sb = new StringBuffer();
        sb.append('#');
        sb.append(dimv.length);
        sb.append('A');
        appendContents(dimv, 0, sb);
        return sb.toString();
    }

    // ### array-displacement
    // array-displacement array => displaced-to, displaced-index-offset
    private static final Primitive1 ARRAY_DISPLACEMENT =
        new Primitive1("array-displacement","array")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            AbstractArray array = checkArray(arg);
            final LispObject value1, value2;
            if (array instanceof DisplacedArray) {
                DisplacedArray da = (DisplacedArray) array;
                value1 = da.array;
                value2 = new Fixnum(da.offset);
            } else {
                value1 = NIL;
                value2 = Fixnum.ZERO;
            }
            return LispThread.currentThread().setValues(value1, value2);
        }
    };
}
