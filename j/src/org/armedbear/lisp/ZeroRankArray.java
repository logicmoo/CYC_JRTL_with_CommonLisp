/*
 * ZeroRankArray.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ZeroRankArray.java,v 1.13 2005-10-23 18:11:10 piso Exp $
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

    public LispObject classOf()
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

    public LispObject AREF(int index) throws ConditionThrowable
    {
        if (index == 0)
            return data;
        else
            return signal(new TypeError("Bad row major index " + index + "."));
    }

    public void aset(int index, LispObject obj) throws ConditionThrowable
    {
        if (obj.typep(elementType) == NIL)
            signal(new TypeError(obj, elementType));
        if (index == 0)
            data = obj;
        else
            signal(new TypeError("Bad row major index " + index + "."));
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        if (obj.typep(elementType) == NIL)
            signal(new TypeError(obj, elementType));
        data = obj;
    }

    public String writeToString() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        boolean printReadably = (Symbol.PRINT_READABLY.symbolValue(thread) != NIL);
        if (printReadably) {
            if (elementType != T) {
                signal(new PrintNotReadable(list2(Keyword.OBJECT, this)));
                // Not reached.
                return null;
            }
        }
        if (printReadably || _PRINT_ARRAY_.symbolValue(thread) != NIL) {
            StringBuffer sb = new StringBuffer("#0A");
            if (data == this && Symbol.PRINT_CIRCLE.symbolValue(thread) != NIL) {
                StringOutputStream stream = new StringOutputStream();
                thread.execute(Symbol.OUTPUT_OBJECT.getSymbolFunction(),
                               data, stream);
                sb.append(stream.getString().getStringValue());
            } else
                sb.append(data.writeToString());
            return sb.toString();
        }
        StringBuffer sb = new StringBuffer();
        if (!adjustable)
            sb.append("SIMPLE-");
        sb.append("ARRAY ");
        sb.append(elementType.writeToString());
        sb.append(" NIL");
        return unreadableString(sb.toString());
    }
}
