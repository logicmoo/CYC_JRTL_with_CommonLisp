/*
 * CharacterFunctions.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: CharacterFunctions.java,v 1.1 2003-06-20 18:14:11 piso Exp $
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
    private static final Primitive CHAR_EQUALS = new Primitive("char=") {
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length == 2)
                return LispCharacter.getValue(array[0]) == LispCharacter.getValue(array[1]) ? T : NIL;
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            char[] chars = new char[length];
            // Make sure the arguments are all characters.
            for (int i = 0; i < length; i++)
                chars[i] = LispCharacter.getValue(array[i]);
            final char c1 = chars[0];
            for (int i = 1; i < length; i++) {
                if (c1 != chars[i])
                    return NIL;
            }
            return T;
        }
    };

    // ### char-equal
    private static final Primitive CHAR_EQUAL = new Primitive("char-equal") {
        public LispObject execute(LispObject[] array) throws LispError
        {
            final int length = array.length;
            if (length == 2) {
                char c1 = LispCharacter.getValue(array[0]);
                char c2 = LispCharacter.getValue(array[1]);
                if (c1 == c2)
                    return T;
                if (Character.toUpperCase(c1) == Character.toUpperCase(c2))
                    return T;
                if (Character.toLowerCase(c1) == Character.toLowerCase(c2))
                    return T;
                return NIL;
            }
            if (length < 1)
                throw new WrongNumberOfArgumentsException(this);
            char[] chars = new char[length];
            // Make sure the arguments are all characters.
            for (int i = 0; i < length; i++)
                chars[i] = LispCharacter.getValue(array[i]);
            final char c1 = chars[0];
            for (int i = 1; i < length; i++) {
                char c2 = chars[i];
                if (c1 == c2)
                    continue;
                if (Character.toUpperCase(c1) == Character.toUpperCase(c2))
                    return T;
                if (Character.toLowerCase(c1) == Character.toLowerCase(c2))
                    continue;
                return NIL;
            }
            return T;
        }
    };

    // ### char-not-greaterp
    private static final Primitive CHAR_NOT_GREATERP =
        new Primitive("char-not-greaterp") {
        public LispObject execute(LispObject[] array) throws LispError
        {
            switch (array.length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2: {
                    char c1 = Character.toUpperCase(LispCharacter.getValue(array[0]));
                    char c2 = Character.toUpperCase(LispCharacter.getValue(array[1]));
                    return c1 <= c2 ? T : NIL;
                }
                default: {
                    final int length = array.length;
                    char[] chars = new char[length];
                    for (int i = 0; i < length; i++)
                        chars[i] = Character.toUpperCase(LispCharacter.getValue(array[i]));
                    for (int i = 1; i < length; i++) {
                        if (chars[i] < chars[i-1])
                            return NIL;
                    }
                    return T;
                }
            }
        }
    };

    // ### char-not-lessp
    private static final Primitive CHAR_NOT_LESSP =
        new Primitive("char-not-lessp") {
        public LispObject execute(LispObject[] array) throws LispError
        {
            switch (array.length) {
                case 0:
                    throw new WrongNumberOfArgumentsException(this);
                case 1:
                    return T;
                case 2: {
                    char c1 = Character.toUpperCase(LispCharacter.getValue(array[0]));
                    char c2 = Character.toUpperCase(LispCharacter.getValue(array[1]));
                    return c1 >= c2 ? T : NIL;
                }
                default: {
                    final int length = array.length;
                    char[] chars = new char[length];
                    for (int i = 0; i < length; i++)
                        chars[i] = Character.toUpperCase(LispCharacter.getValue(array[i]));
                    for (int i = 1; i < length; i++) {
                        if (chars[i] > chars[i-1])
                            return NIL;
                    }
                    return T;
                }
            }
        }
    };
}
