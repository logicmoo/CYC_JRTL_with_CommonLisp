/*
 * DisplacedArray.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: DisplacedArray.java,v 1.2 2003-09-08 17:18:07 piso Exp $
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
    private final AbstractArray array;
    private final int offset;

    public DisplacedArray(AbstractArray array, int offset)
    {
        this.array = array;
        this.offset = offset;
    }

    public int length() throws LispError
    {
        if (getRank() == 1)
            return array.getDimension(0) - offset;
        throw new TypeError(this, "sequence");
    }

    public LispObject AREF(LispObject index) throws LispError
    {
        if (getRank() == 1)
            return getRowMajor(Fixnum.getValue(index));
        StringBuffer sb = new StringBuffer("AREF: ");
        sb.append("wrong number of subscripts (1) for array of rank ");
        sb.append(getRank());
        throw new ProgramError(sb.toString());
    }

    public int getRank()
    {
        return array.getRank();
    }

    public LispObject getDimensions()
    {
        return array.getDimensions();
    }

    public int getDimension(int n) throws LispError
    {
        return array.getDimension(n);
    }

    public LispObject getElementType()
    {
        return array.getElementType();
    }

    public int getTotalSize()
    {
        return array.getTotalSize() - offset;
    }

    public LispObject getRowMajor(int index) throws LispError
    {
        return array.getRowMajor(index + offset);
    }

    public void setRowMajor(int index, LispObject newValue) throws LispError
    {
        array.setRowMajor(index + offset, newValue);
    }

    // ### array-displacement
    // array-displacement array => displaced-to, displaced-index-offset
    private static final Primitive1 ARRAY_DISPLACEMENT =
        new Primitive1("array-displacement") {
        public LispObject execute(LispObject arg) throws LispError
        {
            AbstractArray array = checkArray(arg);
            LispObject[] values = new LispObject[2];
            if (array instanceof DisplacedArray) {
                DisplacedArray da = (DisplacedArray) array;
                values[0] = da.array;
                values[1] = new Fixnum(da.offset);
            } else {
                values[0] = NIL;
                values[1] = Fixnum.ZERO;
            }
            LispThread.currentThread().setValues(values);
            return values[0];
        }
    };
}
