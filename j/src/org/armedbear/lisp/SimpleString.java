/*
 * SimpleString.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SimpleString.java,v 1.2 2004-02-23 15:04:36 piso Exp $
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

public final class SimpleString extends AbstractString
{
    private char[] chars;
    private int length;

    public SimpleString(LispCharacter c)
    {
        chars = new char[1];
        chars[0] = c.getValue();
        length = 1;
    }

    public SimpleString(char c)
    {
        chars = new char[1];
        chars[0] = c;
        length = 1;
    }

    public SimpleString(int length)
    {
        chars = new char[length];
        this.length = length;
    }

    public SimpleString(String s)
    {
        chars = s.toCharArray();
        length = s.length();
    }

    public char[] chars()
    {
        return chars;
    }

    // Used by jvm compiler.
    public static SimpleString getInstance(String s)
    {
        return new SimpleString(s);
    }

    public LispObject typeOf()
    {
        return list2(Symbol.SIMPLE_STRING, number(chars.length));
    }

    // FIXME BuiltInClass.SIMPLE_STRING
    public LispClass classOf()
    {
        return BuiltInClass.STRING;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type instanceof Symbol) {
            if (type == Symbol.SIMPLE_STRING)
                return T;
            if (type == Symbol.SIMPLE_BASE_STRING)
                return T;
        }
        // FIXME BuiltInClass.SIMPLE_STRING
        return super.typep(type);
    }

    public LispObject SIMPLE_STRING_P()
    {
        return T;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof SimpleString) {
            SimpleString string = (SimpleString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;)
                if (string.chars[i] != chars[i])
                    return false;
            return true;
        }
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;)
                if (string.getChar(i) != chars[i])
                    return false;
            return true;
        }
        if (obj instanceof NilVector)
            return obj.equal(this);
        return false;
    }

    public boolean equalp(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof SimpleString) {
            SimpleString string = (SimpleString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (string.chars[i] != chars[i]) {
                    if (Utilities.toLowerCase(string.chars[i]) != Utilities.toLowerCase(chars[i]))
                        return false;
                }
            }
            return true;
        }
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (string.getChar(i) != chars[i]) {
                    if (Utilities.toLowerCase(string.getChar(i)) != Utilities.toLowerCase(chars[i]))
                        return false;
                }
            }
            return true;
        }
        if (obj instanceof AbstractArray)
            return obj.equalp(this);
        return false;
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        SimpleString s = new SimpleString(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                s.chars[j++] = chars[i++];
            return s;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return signal(new TypeError("Array index out of bounds: " + i + "."));
        }
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        fill(LispCharacter.getValue(obj));
    }

    public void fill(char c)
    {
        for (int i = length; i-- > 0;)
            chars[i] = c;
    }

    public void shrink(int n) throws ConditionThrowable
    {
        if (n < length) {
            char[] newArray = new char[n];
            System.arraycopy(chars, 0, newArray, 0, n);
            chars = newArray;
            length = n;
            return;
        }
        if (n == length)
            return;
        signal(new LispError());
    }

    public LispObject reverse() throws ConditionThrowable
    {
        SimpleString result = new SimpleString(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.chars[i] = chars[j];
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            ++i;
            --j;
        }
        return this;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
        }
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
            return NIL; // Not reached.
        }
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
        }
    }

    public char getChar(int index) throws ConditionThrowable
    {
        try {
            return chars[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
            return 0; // Not reached.
        }
    }

    public void setChar(int index, char c) throws ConditionThrowable
    {
        try {
            chars[index] = c;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
        }
    }

//     public final String getValue()
//     {
//         return new String(chars);
//     }

    public String getStringValue()
    {
        return new String(chars);
    }

    public Object javaInstance()
    {
        return new String(chars);
    }

    public Object javaInstance(Class c)
    {
        return javaInstance();
    }

    public final int capacity()
    {
        return length;
    }

    // FIXME This is required by AbstractVector, but should be removed when
    // ComplexVector is implemented.
    public void ensureCapacity(int minCapacity)
    {
        Debug.assertTrue(false);
    }

    public final int length()
    {
        return length;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, length);
            return NIL; // Not reached.
        }
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[((Fixnum)index).value]);
        }
        catch (ClassCastException e) {
            return signal(new TypeError(index, Symbol.FIXNUM));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(Fixnum.getValue(index), chars.length);
            return NIL; // Not reached.
        }
    }

    private int cachedHashCode;

    public int hashCode()
    {
        if (cachedHashCode != 0)
            return cachedHashCode;
        int hashCode = 0;
        for (int i = 0; i < length; i++)
            hashCode = hashCode * 31 + chars[i];
        return cachedHashCode = hashCode;
    }
}
