/*
 * NilVector.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: NilVector.java,v 1.7 2004-02-24 16:33:33 piso Exp $
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

public final class NilVector extends AbstractString
{
    private int capacity;

    public NilVector(int capacity) throws ConditionThrowable
    {
        this.capacity = capacity;
    }

    public char[] chars() throws ConditionThrowable
    {
        if (capacity != 0)
            accessError();
        return new char[0];
    }

    public String getStringValue() throws ConditionThrowable
    {
        if (capacity != 0)
            accessError();
        return "";
    }

    public LispObject typeOf()
    {
        return Symbol.NIL_VECTOR;
    }

    public LispClass classOf()
    {
        return BuiltInClass.NIL_VECTOR;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type instanceof Symbol) {
            if (type == Symbol.NIL_VECTOR)
                return T;
            if (type == Symbol.SIMPLE_STRING)
                return T;
            if (type == Symbol.STRING)
                return T;
        }
        if (type instanceof LispClass) {
            if (type == BuiltInClass.NIL_VECTOR)
                return T;
            if (type == BuiltInClass.STRING)
                return T;
        }
        return super.typep(type);
    }

    public LispObject SIMPLE_STRING_P()
    {
        return T;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof NilVector) {
            if (capacity != ((NilVector)obj).capacity)
                return false;
            if (capacity != 0) {
                accessError();
                // Not reached.
                return false;
            }
            return true;
        }
        if (obj instanceof AbstractString) {
            if (capacity != obj.length())
                return false;
            if (capacity != 0) {
                accessError();
                // Not reached.
                return false;
            }
            return true;
        }
        return false;
    }

    public String getValue() throws ConditionThrowable
    {
        if (capacity == 0)
            return "";
        accessError();
        // Not reached.
        return null;
    }

    public int length()
    {
        return capacity;
    }

    public int capacity()
    {
        return capacity;
    }

    public LispObject getElementType()
    {
        return NIL;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        return accessError();
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        storeError(newValue);
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        return accessError();
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        storeError(newValue);
    }

    public char getChar(int index) throws ConditionThrowable
    {
        accessError();
        // Not reached.
        return 0;
    }

    public void setChar(int index, char c) throws ConditionThrowable
    {
        storeError(LispCharacter.getInstance(c));
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        if (capacity == 0 && start == 0 && end == 0)
            return this;
        return accessError();
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        storeError(obj);
    }

    public void fill(char c) throws ConditionThrowable
    {
        storeError(LispCharacter.getInstance(c));
    }

    public void shrink(int n) throws ConditionThrowable
    {
    }

    public LispObject reverse() throws ConditionThrowable
    {
        return accessError();
    }

    public LispObject accessError() throws ConditionThrowable
    {
        return signal(new TypeError("Attempt to access an array of element type NIL."));
    }

    private void storeError(LispObject obj) throws ConditionThrowable
    {
        signal(new TypeError(String.valueOf(obj) + " is not of type NIL."));
    }

    public String toString()
    {
        return unreadableString("NIL-VECTOR");
    }

    public Fixnum sxhash() throws ConditionThrowable
    {
        if (capacity == 0)
            return Fixnum.ZERO;
        accessError();
        // Not reached.
        return null;
    }
}
