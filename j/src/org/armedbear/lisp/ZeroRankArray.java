/*
 * ZeroRankArray.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ZeroRankArray.java,v 1.1 2004-02-25 18:33:59 piso Exp $
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

public final class ZeroRankArray extends AbstractArray
{
    private final LispObject elementType;
    private final boolean adjustable;

    private LispObject data;

    public ZeroRankArray(LispObject elementType, LispObject data,
                         boolean adjustable)
    {
        this.elementType = elementType;
        this.data = data;
        this.adjustable = adjustable;
    }

    public LispObject typeOf()
    {
        if (adjustable)
            return list3(Symbol.ARRAY, elementType, NIL);
        else
            return list3(Symbol.SIMPLE_ARRAY, elementType, NIL);
    }

    public LispClass classOf()
    {
        return BuiltInClass.ARRAY;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.SIMPLE_ARRAY)
            return adjustable ? NIL : T;
        return super.typep(type);
    }

    public int getRank()
    {
        return 0;
    }

    public LispObject getDimensions()
    {
        return NIL;
    }

    public int getDimension(int n) throws ConditionThrowable
    {
        signal(new TypeError("Bad array dimension (" + n + ") for array of rank 0."));
        // Not reached.
        return -1;
    }

    public LispObject getElementType()
    {
        return elementType;
    }

    public int getTotalSize()
    {
        return 1;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        if (index == 0)
            return data;
        else
            return signal(new TypeError("Bad row major index " + index + "."));
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        if (newValue.typep(elementType) == NIL)
            signal(new TypeError(newValue, elementType));
        if (index == 0)
            data = newValue;
        else
            signal(new TypeError("Bad row major index " + index + "."));
    }
}
