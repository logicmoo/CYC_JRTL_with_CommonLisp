/*
 * Array.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Array.java,v 1.1 2003-03-18 03:46:44 piso Exp $
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
    private final int totalSize;
    private final LispObject[] data;

    public Array()
    {
        dimv = new int[0];
        totalSize = 1;
        data = new LispObject[totalSize];
        for (int i = 0; i < totalSize; i++)
            data[i] = NIL;
    }

    public Array(int[] dimv)
    {
        this.dimv = dimv;
        int totalSize = 1;
        for (int i = 0; i < dimv.length; i++)
            totalSize *= dimv[i];
        this.totalSize = totalSize;
        data = new LispObject[totalSize];
        for (int i = 0; i < totalSize; i++)
            data[i] = NIL;
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

    public int getDimension(int n) throws LispError
    {
        try {
            return dimv[n];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new TypeError("bad array dimension");
        }
    }

    public LispObject getElementType()
    {
        return T;
    }

    public int getTotalSize()
    {
        return totalSize;
    }

    public LispObject getRowMajor(int index) throws LispError
    {
        try {
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new TypeError("bad array index");
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws LispError
    {
        try {
            data[index] = newValue;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new TypeError("bad array index");
        }
    }

    public String toString()
    {
        int rank = getRank();
        StringBuffer sb = new StringBuffer();
        sb.append('#');
        sb.append(rank);
        sb.append('A');
        if (rank == 0) {
            sb.append(" NIL");
        } else {
            sb.append('(');
            sb.append(" # ");
            sb.append(')');
        }
        return sb.toString();
    }
}
