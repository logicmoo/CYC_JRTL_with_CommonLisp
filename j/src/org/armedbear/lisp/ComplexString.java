/*
 * ComplexString.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: ComplexString.java,v 1.3 2004-02-23 19:56:55 piso Exp $
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

public final class ComplexString extends AbstractString
{
    private int capacity;

    // For non-displaced arrays.
    private char[] chars;

    // For displaced arrays.
    private AbstractArray array;
    private int displacement;

    public ComplexString(int capacity)
    {
        this.capacity = capacity;
        chars = new char[capacity];
        isDisplaced = false;
    }

    public ComplexString(int capacity, AbstractArray array, int displacement)
    {
        this.capacity = capacity;
        this.array = array;
        this.displacement = displacement;
        isDisplaced = true;
    }

    public LispObject typeOf()
    {
        return list2(Symbol.STRING, number(capacity()));
    }

    public LispClass classOf()
    {
        return BuiltInClass.STRING;
    }

    public LispObject arrayDisplacement()
    {
        if (array != null)
            return LispThread.currentThread().setValues(array, new Fixnum(displacement));
        return super.arrayDisplacement();
    }

    public char[] chars() throws ConditionThrowable
    {
        if (chars != null)
            return chars;
        Debug.assertTrue(array != null);
        char[] chars = new char[capacity];
        System.arraycopy(array.chars(), displacement, chars, 0, capacity);
        return chars;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;)
                if (string.getChar(i) != getChar(i))
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
        if (obj instanceof AbstractString) {
            AbstractString string = (AbstractString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;) {
                if (string.getChar(i) != getChar(i)) {
                    if (Utilities.toLowerCase(string.getChar(i)) != Utilities.toLowerCase(getChar(i)))
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
        while (i < end)
            s.setChar(j++, getChar(i++));
        return s;
    }

    public void fill(LispObject obj) throws ConditionThrowable
    {
        fill(LispCharacter.getValue(obj));
    }

    public void fill(char c) throws ConditionThrowable
    {
        for (int i = length(); i-- > 0;)
            setChar(i, c);
    }

    public void shrink(int n) throws ConditionThrowable
    {
        if (n < chars.length) {
            char[] newArray = new char[n];
            System.arraycopy(chars, 0, newArray, 0, n);
            chars = newArray;
            return;
        }
        if (n == chars.length)
            return;
        signal(new LispError());
    }

    public LispObject reverse() throws ConditionThrowable
    {
        int length = length();
        SimpleString result = new SimpleString(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.setChar(i, getChar(j));
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = length() - 1;
        while (i < j) {
            char temp = getChar(i);
            setChar(i, getChar(j));
            setChar(j, temp);
            ++i;
            --j;
        }
        return this;
    }

    public LispObject getRowMajor(int index) throws ConditionThrowable
    {
        return LispCharacter.getInstance(getChar(index));
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        setChar(index, LispCharacter.getValue(newValue));
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        return LispCharacter.getInstance(getChar(index));
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        setChar(index, LispCharacter.getValue(newValue));
    }

    public char getChar(int index) throws ConditionThrowable
    {
        if (chars != null) {
            try {
                return chars[index];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                badIndex(index, chars.length);
                return 0; // Not reached.
            }
        } else
            return LispCharacter.getValue(array.getRowMajor(index + displacement));
    }

    public void setChar(int index, char c) throws ConditionThrowable
    {
        if (chars != null) {
            try {
                chars[index] = c;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                badIndex(index, chars.length);
            }
        } else
            array.setRowMajor(index + displacement, LispCharacter.getInstance(c));
    }

    public String getStringValue() throws ConditionThrowable
    {
        if (fillPointer >= 0)
            return new String(chars(), 0, fillPointer);
        else
            return new String(chars());
    }

    public Object javaInstance() throws ConditionThrowable
    {
        return new String(chars());
    }

    public Object javaInstance(Class c) throws ConditionThrowable
    {
        return javaInstance();
    }

    public final int capacity()
    {
        return capacity;
    }

    public final void ensureCapacity(int minCapacity) throws ConditionThrowable
    {
        if (chars != null) {
            if (chars.length < minCapacity) {
                char[] newArray = new char[minCapacity];
                System.arraycopy(chars, 0, newArray, 0, chars.length);
                chars = newArray;
                capacity = minCapacity;
            }
        } else {
            Debug.assertTrue(array != null);
            if (array.length() - displacement < minCapacity) {
                // Copy array.
                char[] chars = new char[minCapacity];
                System.arraycopy(array.chars(), displacement, chars, 0,
                                 array.length() - displacement);
                capacity = minCapacity;
                array = null;
                displacement = 0;
                isDisplaced = false;
            }
        }
    }

    public AbstractArray adjustArray(int size, LispObject initialElement,
                                     LispObject initialContents)
        throws ConditionThrowable
    {
        if (chars == null) {
            // Copy array.
            chars = new char[capacity];
            System.arraycopy(array.chars(), displacement, chars, 0, capacity);
            array = null;
            displacement = 0;
            isDisplaced = false;
        }
        if (chars.length != size) {
            char[] newArray = new char[size];
            if (initialContents != NIL) {
                if (initialContents.listp()) {
                    LispObject list = initialContents;
                    for (int i = 0; i < size; i++) {
                        newArray[i] = LispCharacter.getValue(list.car());
                        list = list.cdr();
                    }
                } else if (initialContents.vectorp()) {
                    for (int i = 0; i < size; i++)
                        newArray[i] = LispCharacter.getValue(initialContents.elt(i));
                } else
                    signal(new TypeError(initialContents, Symbol.SEQUENCE));
            } else {
                System.arraycopy(chars, 0, newArray, 0,
                                 Math.min(chars.length, size));
                if (size > chars.length) {
                    final char c;
                    if (initialElement != NIL)
                        c = LispCharacter.getValue(initialElement);
                    else
                        c = 0;
                    for (int i = chars.length; i < size; i++)
                        newArray[i] = c;
                }
            }
            chars = newArray;
            capacity = chars.length;
        }
        return this;
    }

    public AbstractArray adjustArray(int size, AbstractArray displacedTo,
                                     int displacement)
        throws ConditionThrowable
    {
        capacity = size;
        array = displacedTo;
        this.displacement = displacement;
        chars = null;
        isDisplaced = true;
        return this;
    }

    public final int length()
    {
        return fillPointer >= 0 ? fillPointer : capacity;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        final int limit = length();
        if (index < 0 || index >= limit)
            badIndex(index, limit);
        return LispCharacter.getInstance(getChar(index));
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        return LispCharacter.getInstance(getChar(Fixnum.getValue(index)));
    }

    public LispObject vectorPushExtend(LispObject element)
        throws ConditionThrowable
    {
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= chars.length) {
            // Need to extend vector.
            ensureCapacity(chars.length * 2 + 1);
        }
        chars[fillPointer] = LispCharacter.getValue(element);
        return new Fixnum(fillPointer++);
    }

    public LispObject vectorPushExtend(LispObject element, LispObject extension)
        throws ConditionThrowable
    {
        int ext = Fixnum.getValue(extension);
        if (fillPointer < 0)
            noFillPointer();
        if (fillPointer >= chars.length) {
            // Need to extend vector.
            ext = Math.max(ext, chars.length + 1);
            ensureCapacity(chars.length + ext);
        }
        chars[fillPointer] = LispCharacter.getValue(element);
        return new Fixnum(fillPointer++);
    }

    private int cachedHashCode;

    public int hashCode()
    {
        if (cachedHashCode != 0)
            return cachedHashCode;
        int hashCode = 0;
        try {
            final int limit = length();
            for (int i = 0; i < limit; i++)
                hashCode = hashCode * 31 + getChar(i);
        }
        catch (ConditionThrowable t) {
            // Shouldn't happen.
            Debug.trace(t);
        }
        return cachedHashCode = hashCode;
    }
}
