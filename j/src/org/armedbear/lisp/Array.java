/*
 * Array.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Array.java,v 1.18 2004-02-25 23:56:58 piso Exp $
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

public final class Array extends AbstractArray
{
    private final int[] dimv;
    private final LispObject[] data;

    public Array(int[] dimv)
    {
        this.dimv = dimv;
        int size = computeTotalSize(dimv);
        data = new LispObject[size];
        for (int i = 0; i < size; i++)
            data[i] = NIL;
    }

    public Array(int[] dimv, LispObject initialContents) throws ConditionThrowable
    {
        this.dimv = dimv;
        final int rank = dimv.length;
        LispObject rest = initialContents;
        for (int i = 0; i < rank; i++) {
            dimv[i] = rest.length();
            rest = rest.elt(0);
        }
        int size = computeTotalSize(dimv);
        data = new LispObject[size];
        setInitialContents(0, dimv, initialContents, 0);
    }

    public Array(int rank, LispObject initialContents) throws ConditionThrowable
    {
        if (rank == 0) {
            dimv = new int[0];
            data = new LispObject[1];
            data[0] = initialContents;
        } else {
            dimv = new int[rank];
            LispObject rest = initialContents;
            for (int i = 0; i < rank; i++) {
                dimv[i] = rest.length();
                if (rest == NIL)
                    break;
                rest = rest.elt(0);
            }
            int size = computeTotalSize(dimv);
            data = new LispObject[size];
            setInitialContents(0, dimv, initialContents, 0);
        }
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
                    LispObject content = v.get(i);
                    index =
                        setInitialContents(axis + 1, newDims, content, index);
                }
            }
        }
        return index;
    }

    // FIXME Need to detect overflow.
    private static int computeTotalSize(int[] dimensions)
    {
        int size = 1;
        for (int i = dimensions.length; i-- > 0;)
            size *= dimensions[i];
        return size;
    }

    public LispObject typeOf()
    {
        return list3(Symbol.SIMPLE_ARRAY, T, getDimensions());
    }

    public LispClass classOf()
    {
        return BuiltInClass.ARRAY;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.SIMPLE_ARRAY)
            return T;
        return super.typep(typeSpecifier);
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
            signal(new TypeError("bad array dimension"));
            return -1;
        }
    }

    public LispObject getElementType()
    {
        return T;
    }

    public int getTotalSize()
    {
        return data.length;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        try {
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new TypeError("Bad row major index " + index + "."));
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            data[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            signal(new TypeError("Bad row major index " + index + "."));
        }
    }

    public void fill(LispObject obj)
    {
        for (int i = data.length; i-- > 0;)
            data[i] = obj;
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
