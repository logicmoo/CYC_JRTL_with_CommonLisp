/*
 * LispString.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: LispString.java,v 1.80 2004-02-16 00:46:22 piso Exp $
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

public final class LispString extends AbstractVector
{
    private char[] chars;

    public LispString(LispCharacter c)
    {
        chars = new char[1];
        chars[0] = c.getValue();
    }

    public LispString(char c)
    {
        chars = new char[1];
        chars[0] = c;
    }

    public LispString(int length)
    {
        chars = new char[length];
    }

    public LispString(String s)
    {
        chars = s.toCharArray();
    }

    public char[] chars()
    {
        return chars;
    }

    // Used by jvm compiler.
    public static LispString getInstance(String s)
    {
        return new LispString(s);
    }

    public LispObject typeOf()
    {
        return list2(fillPointer < 0 ? Symbol.SIMPLE_STRING : Symbol.STRING,
                     number(chars.length));
    }

    public LispClass classOf()
    {
        return BuiltInClass.STRING;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type instanceof Symbol) {
            if (type == Symbol.STRING)
                return T;
            if (type == Symbol.BASE_STRING)
                return T;
            if (type == Symbol.SIMPLE_STRING ||
                type == Symbol.SIMPLE_BASE_STRING)
                return fillPointer < 0 ? T : NIL;
        }
        if (type == BuiltInClass.STRING)
            return T;
        return super.typep(type);
    }

    public LispObject STRINGP()
    {
        return T;
    }

    public boolean stringp()
    {
        return true;
    }

    public LispObject SIMPLE_STRING_P()
    {
        return fillPointer < 0 ? T : NIL;
    }

    public LispObject getElementType()
    {
        return Symbol.CHARACTER;
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    public boolean equal(LispObject obj) throws ConditionThrowable
    {
        if (this == obj)
            return true;
        if (obj instanceof LispString) {
            LispString string = (LispString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;)
                if (string.chars[i] != chars[i])
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
        if (obj instanceof LispString) {
            LispString string = (LispString) obj;
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
        if (obj instanceof AbstractArray)
            return obj.equalp(this);
        return false;
    }

    public LispObject subseq(int start, int end) throws ConditionThrowable
    {
        LispString s = new LispString(end - start);
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
        final int limit = fillPointer >= 0 ? fillPointer : chars.length;
        for (int i = limit; i-- > 0;)
            chars[i] = c;
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
        LispString result = new LispString(length);
        int i, j;
        for (i = 0, j = length - 1; i < length; i++, j--)
            result.chars[i] = chars[j];
        return result;
    }

    public LispObject nreverse() throws ConditionThrowable
    {
        int i = 0;
        int j = length() - 1;
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
            badIndex(index, chars.length);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, chars.length);
        }
    }

    public LispObject get(int index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, chars.length);
            return NIL; // Not reached.
        }
    }

    public void set(int index, LispObject newValue) throws ConditionThrowable
    {
        try {
            chars[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, chars.length);
        }
    }

    public void set(int index, char c)
    {
        chars[index] = c;
    }

    public static String getValue(LispObject obj) throws ConditionThrowable
    {
        try {
            return ((LispString)obj).getValue();
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, Symbol.STRING));
            // Not reached.
            return null;
        }
    }

    public final String getValue()
    {
        if (fillPointer >= 0)
            return new String(chars, 0, fillPointer);
        else
            return new String(chars);
    }

    public String getStringValue()
    {
        if (fillPointer >= 0)
            return new String(chars, 0, fillPointer);
        else
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
        return chars.length;
    }

    public final void ensureCapacity(int minCapacity)
    {
        if (chars.length < minCapacity) {
            char[] newArray = new char[minCapacity];
            System.arraycopy(chars, 0, newArray, 0, chars.length);
            chars = newArray;
        }
    }

    public LispString adjustArray(int size, LispObject initialElement)
        throws ConditionThrowable
    {
        if (chars.length != size) {
            char[] newArray = new char[size];
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
            chars = newArray;
        }
        return this;
    }

    public final int length()
    {
        return fillPointer >= 0 ? fillPointer : chars.length;
    }

    public LispObject elt(int index) throws ConditionThrowable
    {
        int limit = fillPointer >= 0 ? fillPointer : chars.length;
        if (index < 0 || index >= limit)
            badIndex(index, limit);
        return LispCharacter.getInstance(chars[index]);
    }

    // Ignores fill pointer.
    public LispObject AREF(LispObject index) throws ConditionThrowable
    {
        try {
            return LispCharacter.getInstance(chars[Fixnum.getValue(index)]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(Fixnum.getValue(index), chars.length);
            return NIL; // Not reached.
        }
    }

    public LispObject remove(LispObject item) throws ConditionThrowable
    {
        return signal(new LispError("not implemented"));
    }

    private int cachedHashCode;

    public int hashCode()
    {
        if (cachedHashCode != 0)
            return cachedHashCode;
        int hashCode = 0;
        final int limit = length();
        for (int i = 0; i < limit; i++)
            hashCode = hashCode * 31 + chars[i];
        return cachedHashCode = hashCode;
    }

    public final String toString(int beginIndex, int endIndex)
    {
        if (beginIndex < 0)
            beginIndex = 0;
        final int limit = fillPointer >= 0 ? fillPointer : chars.length;
        if (endIndex > limit)
            endIndex = limit;
        if (_PRINT_ESCAPE_.symbolValueNoThrow() != NIL) {
            StringBuffer sb = new StringBuffer();
            sb.append('"');
            for (int i = beginIndex; i < endIndex; i++) {
                char c = chars[i];
                if (c == '\"' || c == '\\')
                    sb.append('\\');
                sb.append(c);
            }
            sb.append('"');
            return sb.toString();
        } else
            return getValue().substring(beginIndex, endIndex);
    }

    public final String toString()
    {
        return toString(0, chars.length);
    }

    // ### string-p
    public static final Primitive1 STRINGP = new Primitive1("stringp", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            // Displaced arrays might be strings.
            return arg.STRINGP();
        }
    };

    // ### simple-string-p
    public static final Primitive1 SIMPLE_STRING_P =
        new Primitive1("simple-string-p", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg.SIMPLE_STRING_P();
        }
    };

    // ### %make-string
    // %make-string size initial-element element-type => string
    // Returns a simple string.
    private static final Primitive3 _MAKE_STRING =
        new Primitive3("%make-string", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject size, LispObject initialElement,
                                  LispObject elementType) throws ConditionThrowable
        {
            final int n = Fixnum.getValue(size);
            final int limit =
                Fixnum.getValue(Symbol.ARRAY_DIMENSION_LIMIT.getSymbolValue());
            if (n < 0 || n >= limit) {
                StringBuffer sb = new StringBuffer();
                sb.append("the size specified for this string (");
                sb.append(n);
                sb.append(')');
                if (n >= limit) {
                    sb.append(" is >= ARRAY-DIMENSION-LIMIT (");
                    sb.append(limit);
                    sb.append(')');
                } else
                    sb.append(" is negative");
                return signal(new LispError(sb.toString()));
            }
            // Ignore elementType.
            LispString string = new LispString(n);
            if (initialElement != NIL) {
                // Initial element was specified.
                char c = checkCharacter(initialElement).getValue();
                string.fill(c);
            }
            return string;
        }
    };

    // ### char
    private static final Primitive2 CHAR = new Primitive2("char", "string index")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (first.stringp())
                return ((AbstractArray)first).getRowMajor(Fixnum.getInt(second));
            return signal(new TypeError(first, Symbol.STRING));
        }
    };

    // ### %set-char
    private static final Primitive3 _SET_CHAR =
        new Primitive3("%set-char", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third) throws ConditionThrowable
        {
            if (first.stringp()) {
                ((AbstractArray)first).setRowMajor(Fixnum.getInt(second),
                                                   checkCharacter(third));
                return third;
            }
            return signal(new TypeError(first, Symbol.STRING));
        }
    };

    // ### schar
    private static final Primitive2 SCHAR = new Primitive2("schar", "string index") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return checkString(first).get(Fixnum.getInt(second));
        }
    };

    // ### %set-schar
    private static final Primitive3 _SET_SCHAR =
        new Primitive3("%set-schar", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third) throws ConditionThrowable
        {
            checkString(first).set(Fixnum.getInt(second), checkCharacter(third));
            return third;
        }
    };

    private static final Primitive3 STRING_POSITION =
        new Primitive3("string-position", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third)
            throws ConditionThrowable
        {
            char c = LispCharacter.getValue(first);
            LispString string = checkString(second);
            int start = Fixnum.getValue(third);
            char[] chars = string.chars();
            for (int i = start, limit = chars.length; i < limit; i++) {
                if (chars[i] == c)
                    return number(i);
            }
            return NIL;
        }
    };

    // ### simple-string-search pattern string => position
    // Searches string for a substring that matches pattern.
    private static final Primitive2 SIMPLE_STRING_SEARCH =
        new Primitive2("simple-string-search", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            int index = getValue(second).indexOf(getValue(first));
            return index >= 0 ? new Fixnum(index) : NIL;
        }
    };

    // ### simple-string-fill string character => string
    private static final Primitive2 STRING_FILL =
        new Primitive2("simple-string-fill", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            checkString(first).fill(LispCharacter.getValue(second));
            return first;
        }
    };
}
