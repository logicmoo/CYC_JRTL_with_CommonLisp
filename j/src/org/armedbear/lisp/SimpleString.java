/*
 * SimpleString.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SimpleString.java,v 1.4 2004-02-24 00:41:33 piso Exp $
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
    private int capacity;
    private char[] chars;

    public SimpleString(LispCharacter c)
    {
        chars = new char[1];
        chars[0] = c.getValue();
        capacity = 1;
    }

    public SimpleString(char c)
    {
        chars = new char[1];
        chars[0] = c;
        capacity = 1;
    }

    public SimpleString(int capacity)
    {
        this.capacity = capacity;
        chars = new char[capacity];
    }

    public SimpleString(String s)
    {
        chars = s.toCharArray();
        capacity = s.length();
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
        return list2(Symbol.SIMPLE_STRING, number(capacity));
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

    public boolean hasFillPointer()
    {
        return false;
    }

    public boolean isAdjustable()
    {
        return false;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof SimpleString) {
            SimpleString string = (SimpleString) obj;
            if (string.capacity != capacity)
                return false;
            for (int i = capacity; i-- > 0;)
                if (string.chars[i] != chars[i])
                    return false;
            return true;
        }
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != capacity)
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
            if (string.capacity != capacity)
                return false;
            for (int i = capacity; i-- > 0;) {
                if (string.chars[i] != chars[i]) {
                    if (Utilities.toLowerCase(string.chars[i]) != Utilities.toLowerCase(chars[i]))
                        return false;
                }
            }
            return true;
        }
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != capacity)
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
        for (int i = capacity; i-- > 0;)
            chars[i] = c;
    }

    public void shrink(int n) throws ConditionThrowable
    {
        if (n < capacity) {
            char[] newArray = new char[n];
            System.arraycopy(chars, 0, newArray, 0, n);
            chars = newArray;
            capacity = n;
            return;
        }
        if (n == capacity)
            return;
        signal(new LispError());
    }

    public LispObject reverse() throws ConditionThrowable
    {
        SimpleString result = new SimpleString(capacity);
        int i, j;
        for (i = 0, j = capacity - 1; i < capacity; i++, j--)
            result.chars[i] = chars[j];
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = capacity - 1;
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
            badIndex(index, capacity);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
            return NIL; // Not reached.
        }
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
    }

    public char getChar(int index) throws ConditionThrowable
    {
        try {
            return chars[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
            return 0; // Not reached.
        }
    }

    public void setChar(int index, char c) throws ConditionThrowable
    {
        try {
            chars[index] = c;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
    }

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
        return capacity;
    }

    // FIXME This is required by AbstractVector, but should be removed when
    // ComplexVector is implemented.
    public void ensureCapacity(int minCapacity)
    {
        Debug.assertTrue(false);
    }

    public AbstractArray adjustArray(int size, LispObject initialElement,
                                     LispObject initialContents)
        throws ConditionThrowable
    {
        SimpleString s = new SimpleString(size);
        if (initialContents != NIL) {
            if (initialContents.listp()) {
                LispObject list = initialContents;
                for (int i = 0; i < size; i++) {
                    s.chars[i] = LispCharacter.getValue(list.car());
                    list = list.cdr();
                }
            } else if (initialContents.vectorp()) {
                for (int i = 0; i < size; i++)
                    s.chars[i] = LispCharacter.getValue(initialContents.elt(i));
            } else
                signal(new TypeError(initialContents, Symbol.SEQUENCE));
        } else if (initialElement != NIL) {
            System.arraycopy(chars, 0, s.chars, 0, Math.min(size, capacity));
            if (size > capacity) {
                char c = LispCharacter.getValue(initialElement);
                for (int i = size; i-- > capacity;)
                    s.chars[i] = c;
            }
        } else
            System.arraycopy(chars, 0, s.chars, 0, Math.min(size, capacity));
        return s;
    }

    public AbstractArray adjustArray(int size, AbstractArray displacedTo,
                                     int displacement)
        throws ConditionThrowable
    {
        return new ComplexString(size, displacedTo, displacement);
    }

    public final int length()
    {
        return capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
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
            badIndex(((Fixnum)index).value, capacity);
            return NIL; // Not reached.
        }
    }

    private int cachedHashCode;

    public int hashCode()
    {
        if (cachedHashCode != 0)
            return cachedHashCode;
        int hashCode = 0;
        for (int i = 0; i < capacity; i++)
            hashCode = hashCode * 31 + chars[i];
        return cachedHashCode = hashCode;
    }
}
