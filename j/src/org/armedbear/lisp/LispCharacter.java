/*
 * LispCharacter.java
 *
 * Copyright (C) 2002-2004 Peter Graves
 * $Id: LispCharacter.java,v 1.42 2004-03-11 10:28:07 piso Exp $
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

public final class LispCharacter extends LispObject
{
    private static final LispCharacter[] characters = new LispCharacter[CHAR_MAX];

    static {
        for (int i = characters.length; i-- > 0;)
            characters[i] = new LispCharacter((char)i);
    }

    public final char value;

    public static LispCharacter getInstance(char c)
    {
        try {
            return characters[c];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return new LispCharacter(c);
        }
    }

    private LispCharacter(char c)
    {
        this.value = c;
    }

    public LispObject typeOf()
    {
        return Symbol.CHARACTER;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CHARACTER;
    }

    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.CHARACTER)
            return T;
        if (type == BuiltInClass.CHARACTER)
            return T;
        if (type == Symbol.BASE_CHAR)
            return T;
        if (type == Symbol.STANDARD_CHAR)
            return isStandardChar();
        return super.typep(type);
    }

    public LispObject CHARACTERP()
    {
        return T;
    }

    public boolean characterp()
    {
        return true;
    }

    public LispObject isStandardChar()
    {
        if (value >= ' ' && value < 127)
            return T;
        if (value == '\n')
            return T;
        return NIL;
    }

    public boolean eql(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispCharacter) {
            if (value == ((LispCharacter)obj).value)
                return true;
        }
        return false;
    }

    public boolean equal(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispCharacter) {
            if (value == ((LispCharacter)obj).value)
                return true;
        }
        return false;
    }

    public boolean equalp(LispObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof LispCharacter) {
            if (value == ((LispCharacter)obj).value)
                return true;
            return Utilities.toLowerCase(value) == Utilities.toLowerCase(((LispCharacter)obj).value);
        }
        return false;
    }

    public static char getValue(LispObject obj) throws ConditionThrowable
    {
        try {
            return ((LispCharacter)obj).getValue();
        }
        catch (ClassCastException e) {
            signal(new TypeError(obj, "character"));
            // Not reached.
            return 0;
        }
    }

    public final char getValue()
    {
        return value;
    }

    public Object javaInstance()
    {
        return new Character(value);
    }

    public Object javaInstance(Class c)
    {
        return javaInstance();
    }

    public int hashCode()
    {
        return value;
    }

    public final String toString()
    {
        boolean printReadably = (_PRINT_READABLY_.symbolValueNoThrow() != NIL);
        // "Specifically, if *PRINT-READABLY* is true, printing proceeds as if
        // *PRINT-ESCAPE*, *PRINT-ARRAY*, and *PRINT-GENSYM* were also true,
        // and as if *PRINT-LENGTH*, *PRINT-LEVEL*, and *PRINT-LINES* were
        // false."
        boolean printEscape =
            printReadably || (_PRINT_ESCAPE_.symbolValueNoThrow() != NIL);
        StringBuffer sb = new StringBuffer();
        if (printEscape) {
            sb.append("#\\");
            switch (value) {
                case 0:
                    sb.append("Null");
                    break;
                case '\t':
                    sb.append("Tab");
                    break;
                case '\n':
                    sb.append("Newline");
                    break;
                case '\f':
                    sb.append("Page");
                    break;
                case '\r':
                    sb.append("Return");
                    break;
                case '\b':
                    sb.append("Backspace");
                    break;
                default:
                    sb.append(value);
                    break;
            }
        } else {
            sb.append(value);
        }
        return sb.toString();
    }

    private static final Primitive1 CHARACTER =
        new Primitive1("character", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispCharacter)
                return arg;
            if (arg instanceof AbstractString) {
                if (arg.length() == 1)
                    return ((AbstractString)arg).getRowMajor(0);
            } else if (arg instanceof Symbol) {
                String name = arg.getName();
                if (name.length() == 1)
                    return getInstance(name.charAt(0));
            }
            return signal(new TypeError());
        }
    };

    // ### whitespacep
    private static final Primitive1 WHITESPACEP =
        new Primitive1("whitespacep", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            LispCharacter character = checkCharacter(arg);
            return Character.isWhitespace(character.value) ? T : NIL;
        }
    };

    // ### char-code
    private static final Primitive1 CHAR_CODE = new Primitive1("char-code", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new Fixnum(((LispCharacter)arg).value);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.CHARACTER));
            }
        }
    };

    // ### char-int
    private static final Primitive1 CHAR_INT = new Primitive1("char-int", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return new Fixnum(getValue(arg));
        }
    };

    // ### code-char
    private static final Primitive1 CODE_CHAR = new Primitive1("code-char", "code")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                int n = ((Fixnum)arg).getValue();
                if (n < CHAR_MAX)
                    return characters[n];
            }
            catch (ClassCastException e) {
                ; // SBCL signals a type error here: "not of type (UNSIGNED-BYTE 8)".
            }
            return NIL;
        }
    };

    // ### characterp
    private static final Primitive1 CHARACTERP =
        new Primitive1("characterp", "object")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return arg instanceof LispCharacter ? T : NIL;
        }
    };

    // ### both-case-p
    private static final Primitive1 BOTH_CASE_P =
        new Primitive1("both-case-p", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            char c = getValue(arg);
            if (Character.isLowerCase(c) || Character.isUpperCase(c))
                return T;
            return NIL;
        }
    };

    // ### lower-case-p
    private static final Primitive1 LOWER_CASE_P =
        new Primitive1("lower-case-p", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return Character.isLowerCase(getValue(arg)) ? T : NIL;
        }
    };

    // ### upper-case-p
    private static final Primitive1 UPPER_CASE_P =
        new Primitive1("upper-case-p", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return Character.isUpperCase(getValue(arg)) ? T : NIL;
        }
    };

    // ### char-downcase
    private static final Primitive1 CHAR_DOWNCASE =
        new Primitive1("char-downcase", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return getInstance(Utilities.toLowerCase(getValue(arg)));
        }
    };

    // ### char-upcase
    private static final Primitive1 CHAR_UPCASE =
        new Primitive1("char-upcase", "character")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return getInstance(Utilities.toUpperCase(getValue(arg)));
        }
    };

    // ### digit-char
    private static final Primitive DIGIT_CHAR =
        new Primitive("digit-char", "weight &optional radix")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            int weight;
            try {
                weight = ((Fixnum)arg).value;
            }
            catch (ClassCastException e) {
                if (arg instanceof Bignum)
                    return NIL;
                return signal(new TypeError(arg, Symbol.INTEGER));
            }
            if (weight < 10)
                return characters['0' + weight];
            return NIL;
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            int radix;
            try {
                radix = ((Fixnum)second).value;
            }
            catch (ClassCastException e) {
                radix = -1;
            }
            if (radix < 2 || radix > 36)
                return signal(new TypeError(second,
                                            list3(Symbol.INTEGER, Fixnum.TWO,
                                                  new Fixnum(36))));
            int weight;
            try {
                weight = ((Fixnum)first).value;
            }
            catch (ClassCastException e) {
                if (first instanceof Bignum)
                    return NIL;
                return signal(new TypeError(first, Symbol.INTEGER));
            }
            if (weight >= radix)
                return NIL;
            if (weight < 10)
                return characters['0' + weight];
            return characters['A' + weight - 10];
        }
    };
}
