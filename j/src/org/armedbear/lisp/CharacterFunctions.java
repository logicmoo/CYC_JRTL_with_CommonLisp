/*
 * CharacterFunctions.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: CharacterFunctions.java,v 1.8 2004-03-17 17:54:10 piso Exp $
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

public final class CharacterFunctions extends Lisp
{
    // ### char=
    private static final Primitive CHAR_EQUALS = new Primitive("char=","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return LispCharacter.getValue(first) == LispCharacter.getValue(second) ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                final char c0 = LispCharacter.getValue(array[0]);
                for (int i = 0; i < length; i++) {
                    if (c0 != LispCharacter.getValue(array[i]))
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### char-equal
    private static final Primitive CHAR_EQUAL = new Primitive("char-equal","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            char c1 = LispCharacter.getValue(first);
            char c2 = LispCharacter.getValue(second);
            if (c1 == c2)
                return T;
            if (Utilities.toUpperCase(c1) == Utilities.toUpperCase(c2))
                return T;
            if (Utilities.toLowerCase(c1) == Utilities.toLowerCase(c2))
                return T;
            return NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                final char c0 = LispCharacter.getValue(array[0]);
                for (int i = 1; i < length; i++) {
                    char c = LispCharacter.getValue(array[i]);
                    if (c0 == c)
                        continue;
                    if (Utilities.toUpperCase(c0) == Utilities.toUpperCase(c))
                        continue;
                    if (Utilities.toLowerCase(c0) == Utilities.toLowerCase(c))
                        continue;
                    return NIL;
                }
            }
            return T;
        }
    };

    // ### char-greaterp
    private static final Primitive CHAR_GREATERP =
        new Primitive("char-greaterp","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            char c1 = Utilities.toUpperCase(LispCharacter.getValue(first));
            char c2 = Utilities.toUpperCase(LispCharacter.getValue(second));
            return c1 > c2 ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                char[] chars = new char[length];
                for (int i = 0; i < length; i++)
                    chars[i] = Utilities.toUpperCase(LispCharacter.getValue(array[i]));
                for (int i = 1; i < length; i++) {
                    if (chars[i-1] <= chars[i])
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### char-not-greaterp
    private static final Primitive CHAR_NOT_GREATERP =
        new Primitive("char-not-greaterp","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            char c1 = Utilities.toUpperCase(LispCharacter.getValue(first));
            char c2 = Utilities.toUpperCase(LispCharacter.getValue(second));
            return c1 <= c2 ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                char[] chars = new char[length];
                for (int i = 0; i < length; i++)
                    chars[i] = Utilities.toUpperCase(LispCharacter.getValue(array[i]));
                for (int i = 1; i < length; i++) {
                    if (chars[i] < chars[i-1])
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### char<=
    private static final Primitive CHAR_LE =
        new Primitive("char<=", "&rest characters")
    {
        public LispObject execute() throws ConditionThrowable
        {
            return signal(new WrongNumberOfArgumentsException(this));
        }

        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispCharacter)
                return T;
            return signal(new TypeError(arg, Symbol.CHARACTER));
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            try {
                return ((LispCharacter)first).value <= ((LispCharacter)second).value ? T : NIL;
            }
            catch (ClassCastException e) {
                LispObject datum;
                if (first instanceof LispCharacter)
                    datum = second;
                else
                    datum = first;
                return signal(new TypeError(datum, Symbol.CHARACTER));
            }
        }

        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            char[] chars = new char[length];
            for (int i = 0; i < length; i++) {
                try {
                    chars[i] = ((LispCharacter)args[i]).value;
                }
                catch (ClassCastException e) {
                    return signal(new TypeError(args[i], Symbol.CHARACTER));
                }
            }
            for (int i = 1; i < length; i++) {
                if (chars[i-1] > chars[i])
                    return NIL;
            }
            return T;
        }
    };

    // ### char-lessp
    private static final Primitive CHAR_LESSP =
        new Primitive("char-lessp","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            char c1 = Utilities.toUpperCase(LispCharacter.getValue(first));
            char c2 = Utilities.toUpperCase(LispCharacter.getValue(second));
            return c1 < c2 ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                char[] chars = new char[length];
                for (int i = 0; i < length; i++)
                    chars[i] = Utilities.toUpperCase(LispCharacter.getValue(array[i]));
                for (int i = 1; i < length; i++) {
                    if (chars[i-1] >= chars[i])
                        return NIL;
                }
            }
            return T;
        }
    };

    // ### char-not-lessp
    private static final Primitive CHAR_NOT_LESSP =
        new Primitive("char-not-lessp","&rest characters") {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            char c1 = Utilities.toUpperCase(LispCharacter.getValue(first));
            char c2 = Utilities.toUpperCase(LispCharacter.getValue(second));
            return c1 >= c2 ? T : NIL;
        }
        public LispObject execute(LispObject[] array) throws ConditionThrowable
        {
            final int length = array.length;
            if (length == 0)
                return signal(new WrongNumberOfArgumentsException(this));
            if (length > 1) {
                char[] chars = new char[length];
                for (int i = 0; i < length; i++)
                    chars[i] = Utilities.toUpperCase(LispCharacter.getValue(array[i]));
                for (int i = 1; i < length; i++) {
                    if (chars[i] > chars[i-1])
                        return NIL;
                }
            }
            return T;
        }
    };
}
