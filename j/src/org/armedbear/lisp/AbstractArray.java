/*
 * AbstractArray.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: AbstractArray.java,v 1.10 2003-09-20 17:01:58 piso Exp $
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

public abstract class AbstractArray extends LispObject
{
    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.ARRAY)
            return T;
        if (type == BuiltInClass.ARRAY)
            return T;
        return super.typep(type);
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof AbstractArray) {
            AbstractArray a = (AbstractArray) obj;
            if (getRank() != a.getRank())
                return false;
            for (int i = getRank(); i-- > 0;) {
                if (getDimension(i) != a.getDimension(i))
                    return false;
            }
            for (int i = getTotalSize(); i--> 0;) {
                if (!getRowMajor(i).equalp(a.getRowMajor(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer("AREF: ");
        sb.append("wrong number of subscripts (1) for array of rank ");
        sb.append(getRank());
        throw new ConditionThrowable(new ProgramError(sb.toString()));
    }

    public abstract int getRank();

    public abstract LispObject getDimensions();

    public abstract int getDimension(int n) throws ConditionThrowable;

    public abstract LispObject getElementType();

    public abstract int getTotalSize();

    public abstract LispObject getRowMajor(int index) throws ConditionThrowable;

    public abstract void setRowMajor(int index, LispObject newValue) throws ConditionThrowable;
}
