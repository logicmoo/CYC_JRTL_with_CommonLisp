/*
 * ComplexArray.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: ComplexArray.java,v 1.7 2004-03-15 17:47:06 piso Exp $
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

public final class ComplexArray extends AbstractArray
{
    private final int[] dimv;
    private final LispObject elementType;
    private final int totalSize;

    // For non-displaced arrays.
    private LispObject[] data;

    // For displaced arrays.
    private AbstractArray array;
    private int displacement;

    public ComplexArray(int[] dimv, LispObject elementType)
    {
        this.dimv = dimv;
        this.elementType = elementType;
        totalSize = computeTotalSize(dimv);
        data = new LispObject[totalSize];
        for (int i = totalSize; i-- > 0;)
            data[i] = NIL;
    }

    public ComplexArray(int[] dimv,
                        LispObject elementType,
                        LispObject initialContents)
        throws ConditionThrowable
    {
        this.dimv = dimv;
        this.elementType = elementType;
        final int rank = dimv.length;
        LispObject rest = initialContents;
        for (int i = 0; i < rank; i++) {
            dimv[i] = rest.length();
            rest = rest.elt(0);
        }
        totalSize = computeTotalSize(dimv);
        data = new LispObject[totalSize];
        setInitialContents(0, dimv, initialContents, 0);
    }

    public ComplexArray(int[] dimv, AbstractArray array, int displacement)
    {
        this.dimv = dimv;
        this.elementType = array.getElementType();
        this.array = array;
        this.displacement = displacement;
        totalSize = computeTotalSize(dimv);
    }

    private int setInitialContents(int axis, int[] dims, LispObject contents,
                                   int index)
        throws ConditionThrowable
    {
        if (dims.length == 0) {
            try {
                data[index] = contents;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                signal(new LispError("Bad initial contents for array."));
                return -1;
            }
            ++index;
        } else {
            int dim = dims[0];
            if (dim != contents.length()) {
                signal(new LispError("Bad initial contents for array."));
                return -1;
            }
            int[] newDims = new int[dims.length-1];
            for (int i = 1; i < dims.length; i++)
                newDims[i-1] = dims[i];
            if (contents.listp()) {
                for (int i = contents.length();i-- > 0;) {
                    LispObject content = contents.car();
                    index =
                        setInitialContents(axis + 1, newDims, content, index);
                    contents = contents.cdr();
                }
            } else {
                AbstractVector v = checkVector(contents);
                final int length = v.length();
                for (int i = 0; i < length; i++) {
                    LispObject content = v.getRowMajor(i);
                    index =
                        setInitialContents(axis + 1, newDims, content, index);
                }
            }
        }
        return index;
    }

    public LispObject typeOf()
    {
        return list3(Symbol.ARRAY, elementType, getDimensions());
    }

    public LispClass classOf()
    {
        return BuiltInClass.ARRAY;
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
            signal(new TypeError("Bad array dimension " + n + "."));
            return -1;
        }
    }

    public LispObject getElementType()
    {
        return elementType;
    }

    public int getTotalSize()
    {
        return totalSize;
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

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        if (data != null) {
            try {
                return data[index];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                return signal(new TypeError("Bad row major index " + index + "."));
            }
        } else
            return array.getRowMajor(index + displacement);
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        if (data != null) {
            try {
                data[index] = newValue;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                signal(new TypeError("Bad row major index " + index + "."));
            }
        } else
            array.setRowMajor(index + displacement, newValue);
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        if (data != null) {
            for (int i = data.length; i-- > 0;)
                data[i] = obj;
        } else {
            for (int i = totalSize; i-- > 0;)
                setRowMajor(i, obj);
        }
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
}
