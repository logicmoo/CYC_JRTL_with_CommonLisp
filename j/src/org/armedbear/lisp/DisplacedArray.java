/*
 * DisplacedArray.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: DisplacedArray.java,v 1.17 2003-12-09 20:26:22 asimon Exp $
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

    public DisplacedArray(int[] dimv, AbstractArray array, int offset)
    {
        this.dimv = dimv;
        size = computeTotalSize(dimv);
        this.array = array;
        this.offset = offset;
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
        if (dimv.length == 1)
            return array.STRINGP();
        return NIL;
    }

    public boolean vectorp()
    {
        return dimv.length == 1;
    }

    public int length() throws ConditionThrowable
    {
        if (dimv.length == 1)
            return size;
        throw new ConditionThrowable(new TypeError(this, "sequence"));
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        if (dimv.length == 1)
            return getRowMajor(index);
        throw new ConditionThrowable(new TypeError(this, "sequence"));
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        if (dimv.length == 1)
            return getRowMajor(Fixnum.getValue(index));
        StringBuffer sb = new StringBuffer("AREF: ");
        sb.append("wrong number of subscripts (1) for array of rank ");
        sb.append(getRank());
        throw new ConditionThrowable(new ProgramError(sb.toString()));
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
            throw new ConditionThrowable(new TypeError("bad array dimension"));
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
        throw new ConditionThrowable(new TypeError("bad row major index " + index));
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        if (index >= 0 && index < size)
            array.setRowMajor(index + offset, newValue);
        else
            throw new ConditionThrowable(new TypeError("bad row major index " + index));
    }

    public String toString()
    {
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
