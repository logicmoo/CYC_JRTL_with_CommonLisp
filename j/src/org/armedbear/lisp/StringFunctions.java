/*
 * StringFunctions.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StringFunctions.java,v 1.16 2004-02-14 18:58:02 piso Exp $
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

public final class StringFunctions extends Lisp
{
    // ### %string=
    // Case sensitive.
    private static final Primitive _STRING_EQUAL =
        new Primitive("%string=", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            if ((end1 - start1) != (end2 - start2))
                return NIL;
            try {
                for (int i = start1, j = start2; i < end1 && j < end2; i++, j++) {
                    if (array1[i] != array2[j])
                        return NIL;
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                return NIL;
            }
            return T;
        }
    };

    // ### %string/=
    // Case sensitive.
    private static final Primitive _STRING_NOT_EQUAL =
        new Primitive("%string/=", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return NIL; // Strings are identical.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2 before end of string1.
                    return new Fixnum(i);
                }
                if (array1[i] != array2[j])
                    return new Fixnum(i);
                ++i;
                ++j;
            }
        }
    };

    // ### %string-equal
    // Case insensitive.
    private static final Primitive _STRING_EQUAL_IGNORE_CASE =
        new Primitive("%string-equal", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
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
                if (Utilities.toUpperCase(c1) == Utilities.toUpperCase(c2))
                    continue;
                if (Utilities.toLowerCase(c1) == Utilities.toLowerCase(c2))
                    continue;
                return NIL;
            }
            return T;
        }
    };

    // ### %string-not-equal
    // Case sensitive.
    private static final Primitive _STRING_NOT_EQUAL_IGNORE_CASE =
        new Primitive("%string-not-equal", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return NIL; // Strings are identical.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2.
                    return new Fixnum(i);
                }
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2 ||
                    Utilities.toUpperCase(c1) == Utilities.toUpperCase(c2) ||
                    Utilities.toLowerCase(c1) == Utilities.toLowerCase(c2))
                {
                    ++i;
                    ++j;
                    continue;
                }
                return new Fixnum(i);
            }
        }
    };

    // ### %string<
    // Case sensitive.
    private static final Primitive _STRING_LESS_THAN =
        new Primitive("%string<", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return NIL; // Strings are identical.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2.
                    return NIL;
                }
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 < c2)
                    return new Fixnum(i);
                // c1 > c2
                return NIL;
            }
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_GREATER_THAN =
        new Primitive("%string>", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    return NIL;
                }
                if (j == end2) {
                    // Reached end of string2.
                    return new Fixnum(i);
                }
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 < c2)
                    return NIL;
                // c1 > c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_LE =
        new Primitive("%string<=", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2.
                    return NIL;
                }
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 > c2)
                    return NIL;
                // c1 < c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string<=
    // Case sensitive.
    private static final Primitive _STRING_GE =
        new Primitive("%string>=", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return new Fixnum(i); // Strings are identical.
                    return NIL;
                }
                if (j == end2) {
                    // Reached end of string2.
                    return new Fixnum(i);
                }
                char c1 = array1[i];
                char c2 = array2[j];
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 < c2)
                    return NIL;
                // c1 > c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string-lessp
    // Case insensitive.
    private static final Primitive _STRING_LESSP =
        new Primitive("%string-lessp", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return NIL; // Strings are identical.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2.
                    return NIL;
                }
                char c1 = Utilities.toUpperCase(array1[i]);
                char c2 = Utilities.toUpperCase(array2[j]);
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 > c2)
                    return NIL;
                // c1 < c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string-greaterp
    // Case insensitive.
    private static final Primitive _STRING_GREATERP =
        new Primitive("%string-greaterp", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    return NIL;
                }
                if (j == end2) {
                    // Reached end of string2.
                    return new Fixnum(i);
                }
                char c1 = Utilities.toUpperCase(array1[i]);
                char c2 = Utilities.toUpperCase(array2[j]);
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 < c2)
                    return NIL;
                // c1 > c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string-not-lessp
    // Case insensitive.
    private static final Primitive _STRING_NOT_LESSP =
        new Primitive("%string-not-lessp", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    if (j == end2)
                        return new Fixnum(i); // Strings are identical.
                    return NIL;
                }
                if (j == end2) {
                    // Reached end of string2.
                    return new Fixnum(i);
                }
                char c1 = Utilities.toUpperCase(array1[i]);
                char c2 = Utilities.toUpperCase(array2[j]);
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 > c2)
                    return new Fixnum(i);
                // c1 < c2
                return NIL;
            }
        }
    };

    // ### %string-not-greaterp
    // Case insensitive.
    private static final Primitive _STRING_NOT_GREATERP =
        new Primitive("%string-not-greaterp", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length != 6)
                return signal(new WrongNumberOfArgumentsException(this));
            char[] array1 = string(args[0]).chars();
            char[] array2 = string(args[1]).chars();
            int start1 = Fixnum.getInt(args[2]);
            int end1 = Fixnum.getInt(args[3]);
            int start2 = Fixnum.getInt(args[4]);
            int end2 = Fixnum.getInt(args[5]);
            int i = start1;
            int j = start2;
            while (true) {
                if (i == end1) {
                    // Reached end of string1.
                    return new Fixnum(i);
                }
                if (j == end2) {
                    // Reached end of string2.
                    return NIL;
                }
                char c1 = Utilities.toUpperCase(array1[i]);
                char c2 = Utilities.toUpperCase(array2[j]);
                if (c1 == c2) {
                    ++i;
                    ++j;
                    continue;
                }
                if (c1 > c2)
                    return NIL;
                // c1 < c2
                return new Fixnum(i);
            }
        }
    };

    // ### %string-upcase
    private static final Primitive3 _STRING_UPCASE =
        new Primitive3("%string-upcase", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            LispObject s = string(first);
            final int length = s.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            StringBuffer sb = new StringBuffer(length);
            char[] array = s.chars();
            int i;
            for (i = 0; i < start; i++)
                sb.append(array[i]);
            for (i = start; i < end; i++)
                sb.append(Utilities.toUpperCase(array[i]));
            for (i = end; i < length; i++)
                sb.append(array[i]);
            return new LispString(sb.toString());
        }
    };

    // ### %string-downcase
    private static final Primitive3 _STRING_DOWNCASE =
        new Primitive3("%string-downcase", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            LispObject s = string(first);
            final int length = s.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            StringBuffer sb = new StringBuffer(length);
            char[] array = s.chars();
            int i;
            for (i = 0; i < start; i++)
                sb.append(array[i]);
            for (i = start; i < end; i++)
                sb.append(Utilities.toLowerCase(array[i]));
            for (i = end; i < length; i++)
                sb.append(array[i]);
            return new LispString(sb.toString());
        }
    };

    // ### %string-capitalize
    private static final Primitive3 _STRING_CAPITALIZE=
        new Primitive3("%string-capitalize", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            LispObject s = string(first);
            final int length = s.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            StringBuffer sb = new StringBuffer(length);
            char[] array = s.chars();
            boolean lastCharWasAlphanumeric = false;
            int i;
            for (i = 0; i < start; i++)
                sb.append(array[i]);
            for (i = start; i < end; i++) {
                char c = array[i];
                if (Character.isLowerCase(c)) {
                    sb.append(lastCharWasAlphanumeric ? c : Utilities.toUpperCase(c));
                    lastCharWasAlphanumeric = true;
                } else if (Character.isUpperCase(c)) {
                    sb.append(lastCharWasAlphanumeric ? Utilities.toLowerCase(c) : c);
                    lastCharWasAlphanumeric = true;
                } else {
                    sb.append(c);
                    lastCharWasAlphanumeric = Character.isDigit(c);
                }
            }
            for (i = end; i < length; i++)
                sb.append(array[i]);
            return new LispString(sb.toString());
        }
    };

    // ### %nstring-upcase
    private static final Primitive3 _NSTRING_UPCASE =
        new Primitive3("%nstring-upcase", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            if (!first.stringp())
                signal(new TypeError(first, Symbol.STRING));
            final int length = first.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            if (first instanceof DisplacedArray) {
                DisplacedArray array = (DisplacedArray) first;
                for (int i = start; i < end; i++) {
                    char c = LispCharacter.getValue(array.getRowMajor(i));
                    c = Utilities.toUpperCase(c);
                    array.setRowMajor(i, LispCharacter.getInstance(c));
                }
            } else {
                char[] chars = first.chars();
                for (int i = start; i < end; i++)
                    chars[i] = Utilities.toUpperCase(chars[i]);
            }
            return first;
        }
    };

    // ### %nstring-downcase
    private static final Primitive3 _NSTRING_DOWNCASE =
        new Primitive3("%nstring-downcase", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            if (!first.stringp())
                signal(new TypeError(first, Symbol.STRING));
            final int length = first.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            if (first instanceof DisplacedArray) {
                DisplacedArray array = (DisplacedArray) first;
                for (int i = start; i < end; i++) {
                    char c = LispCharacter.getValue(array.getRowMajor(i));
                    c = Utilities.toLowerCase(c);
                    array.setRowMajor(i, LispCharacter.getInstance(c));
                }
            } else {
                char[] chars = first.chars();
                for (int i = start; i < end; i++)
                    chars[i] = Utilities.toLowerCase(chars[i]);
            }
            return first;
        }
    };

    // ### %nstring-capitalize
    private static final Primitive3 _NSTRING_CAPITALIZE =
        new Primitive3("%nstring-capitalize", PACKAGE_SYS, true)
    {
        public LispObject execute(LispObject first, LispObject second,
            LispObject third) throws ConditionThrowable
        {
            if (!first.stringp())
                signal(new TypeError(first, Symbol.STRING));
            final int length = first.length();
            int start = (int) Fixnum.getValue(second);
            if (start < 0 || start > length)
                return signal(new TypeError("Invalid start position " + start + "."));
            int end;
            if (third == NIL)
                end = length;
            else
                end = (int) Fixnum.getValue(third);
            if (end < 0 || end > length)
                return signal(new TypeError("Invalid end position " + start + "."));
            if (start > end)
                return signal(new TypeError("Start (" + start + ") is greater than end (" + end + ")."));
            if (first instanceof DisplacedArray) {
                DisplacedArray array = (DisplacedArray) first;
                boolean lastCharWasAlphanumeric = false;
                for (int i = start; i < end; i++) {
                    char c = LispCharacter.getValue(array.getRowMajor(i));
                    if (Character.isLowerCase(c)) {
                        if (!lastCharWasAlphanumeric) {
                            c = Utilities.toUpperCase(c);
                            array.setRowMajor(i, LispCharacter.getInstance(c));
                        }
                        lastCharWasAlphanumeric = true;
                    } else if (Character.isUpperCase(c)) {
                        if (lastCharWasAlphanumeric) {
                            c = Utilities.toLowerCase(c);
                            array.setRowMajor(i, LispCharacter.getInstance(c));
                        }
                        lastCharWasAlphanumeric = true;
                    } else
                        lastCharWasAlphanumeric = Character.isDigit(c);
                }
            } else {
                char[] chars = first.chars();
                boolean lastCharWasAlphanumeric = false;
                for (int i = start; i < end; i++) {
                    char c = chars[i];
                    if (Character.isLowerCase(c)) {
                        if (!lastCharWasAlphanumeric)
                            chars[i] = Utilities.toUpperCase(c);
                        lastCharWasAlphanumeric = true;
                    } else if (Character.isUpperCase(c)) {
                        if (lastCharWasAlphanumeric)
                            chars[i] = Utilities.toLowerCase(c);
                        lastCharWasAlphanumeric = true;
                    } else
                        lastCharWasAlphanumeric = Character.isDigit(c);
                }
            }
            return first;
        }
    };
}
