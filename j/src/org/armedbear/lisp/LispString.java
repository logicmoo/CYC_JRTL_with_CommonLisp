/*
 * LispString.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispString.java,v 1.30 2003-04-06 19:20:46 piso Exp $
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

public final class LispString extends AbstractVector implements SequenceType,
    VectorType
{
    private char[] array;

    public LispString(LispCharacter c)
    {
        array = new char[1];
        array[0] = c.getValue();
    }

    public LispString(char c)
    {
        array = new char[1];
        array[0] = c;
    }

    public LispString(int length)
    {
        array = new char[length];
    }

    public LispString(String s)
    {
        array = s.toCharArray();
    }

    public LispObject typeOf()
    {
        return Symbol.STRING;
    }

    public LispObject typep(LispObject typeSpecifier) throws LispError
    {
        if (typeSpecifier instanceof Symbol) {
            if (typeSpecifier == Symbol.STRING)
                return T;
            if (typeSpecifier == Symbol.BASE_STRING)
                return T;
            if (typeSpecifier == Symbol.SIMPLE_STRING ||
                typeSpecifier == Symbol.SIMPLE_BASE_STRING)
                return fillPointer < 0 ? T : NIL;
        } else if (typeSpecifier instanceof Cons) {
            ;
        }
        return super.typep(typeSpecifier);
    }

    public LispObject getElementType()
    {
        return Symbol.BASE_CHAR;
    }

    public boolean isSimpleVector()
    {
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispString) {
            LispString string = (LispString) obj;
            if (string.length() != length())
                return false;
            for (int i = length(); i-- > 0;)
                if (string.array[i] != array[i])
                    return false;
            return true;
        }
        return false;
    }

    public void fill(LispObject obj) throws LispError
    {
        fill(LispCharacter.getValue(obj));
    }

    public void fill(char c)
    {
        for (int i = array.length; i-- > 0;)
            array[i] = c;
    }

    public void shrink(int n) throws LispError
    {
        if (n < array.length) {
            char[] newArray = new char[n];
            System.arraycopy(array, 0, newArray, 0, n);
            array = newArray;
            return;
        }
        if (n == array.length)
            return;
        throw new LispError();
    }

    public void nreverse() throws LispError
    {
        int i = 0;
        int j = length() - 1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            ++i;
            --j;
        }
    }

    public LispObject getRowMajor(int index) throws LispError
    {
        try {
            return new LispCharacter(array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, array.length);
            return NIL; // Not reached.
        }
    }

    public void setRowMajor(int index, LispObject newValue) throws LispError
    {
        try {
            array[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, array.length);
        }
    }

    public LispObject get(int index) throws LispError
    {
        try {
            return new LispCharacter(array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, array.length);
            return NIL; // Not reached.
        }
    }

    public void set(int index, LispObject newValue) throws LispError
    {
        try {
            array[index] = LispCharacter.getValue(newValue);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, array.length);
        }
    }

    public static String getValue(LispObject obj) throws LispError
    {
        try {
            return ((LispString)obj).getValue();
        }
        catch (ClassCastException e) {
            throw new TypeError(obj, "string");
        }
    }

    public final String getValue()
    {
        return new String(array);
    }

    public final int capacity()
    {
        return array.length;
    }

    public final int length()
    {
        return fillPointer >= 0 ? fillPointer : array.length;
    }

    public LispObject elt(int index) throws LispError
    {
        int limit = fillPointer >= 0 ? fillPointer : array.length;
        if (index < 0 || index >= limit)
            badIndex(index, limit);
        return new LispCharacter(array[index]);
    }

    public LispObject remove(LispObject item) throws LispError
    {
        throw new LispError("not implemented");
    }

    private int cachedHashCode;

    public int hashCode()
    {
        if (cachedHashCode != 0)
            return cachedHashCode;
        int hashCode = 0;
        final int limit = array.length;
        for (int i = 0; i < limit; i++)
            hashCode = hashCode * 31 + array[i];
        return cachedHashCode = hashCode;
    }

    public final String toString()
    {
        if (_PRINT_ESCAPE_.symbolValueNoThrow() != NIL) {
            StringBuffer sb = new StringBuffer();
            sb.append('"');
            sb.append(getValue());
            sb.append('"');
            return sb.toString();
        } else
            return getValue();
    }

    // ### %string=
    // Case sensitive.
    private static final Primitive _STRING_EQUAL =
        new Primitive("%string=") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            if ((end1 - start1) != (end2 - start2))
                return NIL;
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                if (array1[i] != array2[j])
                    return NIL;
            }
            return T;
        }
    };

    // ### %string/=
    // Case sensitive.
    private static final Primitive _STRING_NOT_EQUAL =
        new Primitive("%string/=") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                if (array1[i] != array2[j])
                    return new Fixnum(i);
            }
            return NIL;
        }
    };

    // ### %string-equal
    // Case insensitive.
    private static final Primitive _STRING_EQUAL_IGNORE_CASE =
        new Primitive("%string-equal") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            if ((end1 - start1) != (end2 - start2))
                return NIL;
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (Character.toUpperCase(c1) == Character.toUpperCase(c2))
                    continue;
                if (Character.toLowerCase(c1) == Character.toLowerCase(c2))
                    continue;
                return NIL;
            }
            return T;
        }
    };

    // ### %string-not-equal
    // Case sensitive.
    private static final Primitive _STRING_NOT_EQUAL_IGNORE_CASE =
        new Primitive("%string-not-equal") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (Character.toUpperCase(c1) == Character.toUpperCase(c2))
                    continue;
                if (Character.toLowerCase(c1) == Character.toLowerCase(c2))
                    continue;
                return new Fixnum(i);
            }
            return NIL;
        }
    };

    // ### %string<
    // Case sensitive.
    private static final Primitive _STRING_LESS_THAN =
        new Primitive("%string<") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (c1 > c2)
                    return NIL;
                if (c1 < c2)
                    return new Fixnum(i);
            }
            // Strings are equal.
            return NIL;
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_GREATER_THAN =
        new Primitive("%string>") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (c1 < c2)
                    return NIL;
                if (c1 > c2)
                    return new Fixnum(i);
            }
            // Strings are equal.
            return NIL;
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_LE =
        new Primitive("%string<=") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (c1 > c2)
                    return NIL;
                if (c1 < c2)
                    return new Fixnum(i);
            }
            return new Fixnum(i);
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_GE =
        new Primitive("%string>=") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2)
                    continue;
                if (c1 < c2)
                    return NIL;
                if (c1 > c2)
                    return new Fixnum(i);
            }
            return new Fixnum(i);
            //             return LispString.equals(string(args[0]), string(args[1]),
            //                 start1, end1, start2, end2);
        }
    };

    // ### %string-lessp
    // Case insensitive.
    private static final Primitive _STRING_LESSP =
        new Primitive("%string-lessp") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = Character.toUpperCase(array1[i]);
                char c2 = Character.toUpperCase(array2[j]);
                if (c1 == c2)
                    continue;
                if (c1 > c2)
                    return NIL;
                if (c1 < c2)
                    return new Fixnum(i);
            }
            // Strings are equal.
            return NIL;
        }
    };

    // ### %string-greaterp
    // Case insensitive.
    private static final Primitive _STRING_GREATERP =
        new Primitive("%string-greaterp") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = Character.toUpperCase(array1[i]);
                char c2 = Character.toUpperCase(array2[j]);
                if (c1 == c2)
                    continue;
                if (c1 < c2)
                    return NIL;
                if (c1 > c2)
                    return new Fixnum(i);
            }
            // Strings are equal.
            return NIL;
        }
    };

    // ### %string-not-lessp
    // Case insensitive.
    private static final Primitive _STRING_NOT_LESSP =
        new Primitive("%string-not-lessp") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = Character.toUpperCase(array1[i]);
                char c2 = Character.toUpperCase(array2[j]);
                if (c1 == c2)
                    continue;
                if (c1 > c2)
                    return new Fixnum(i);
                if (c1 < c2)
                    return NIL;
            }
            // Strings are equal.
            return new Fixnum(i);
        }
    };

    // ### %string-not-greaterp
    // Case insensitive.
    private static final Primitive _STRING_NOT_GREATERP =
        new Primitive("%string-not-greaterp") {
        public LispObject execute(LispObject[] args) throws LispError
        {
            if (args.length != 6)
                throw new WrongNumberOfArgumentsException(this);
            char[] array1 = string(args[0]).array;
            char[] array2 = string(args[1]).array;
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i, j;
            for (i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                char c1 = Character.toUpperCase(array1[i]);
                char c2 = Character.toUpperCase(array2[j]);
                if (c1 == c2)
                    continue;
                if (c1 < c2)
                    return new Fixnum(i);
                if (c1 > c2)
                    return NIL;
            }
            // Strings are equal.
            return new Fixnum(i);
        }
    };

    private static final Primitive2 CHAR = new Primitive2("char") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return checkString(first).get(Fixnum.getInt(second));
        }
    };

    private static final Primitive3 _SET_CHAR = new Primitive3("%set-char") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            checkString(first).set(Fixnum.getInt(second), checkCharacter(third));
            return third;
        }
    };

    private static final Primitive2 SCHAR = new Primitive2("schar") {
        public LispObject execute(LispObject first, LispObject second)
            throws LispError
        {
            return checkString(first).get(Fixnum.getInt(second));
        }
    };

    private static final Primitive3 _SET_SCHAR = new Primitive3("%set-schar") {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws LispError
        {
            checkString(first).set(Fixnum.getInt(second), checkCharacter(third));
            return third;
        }
    };
}
