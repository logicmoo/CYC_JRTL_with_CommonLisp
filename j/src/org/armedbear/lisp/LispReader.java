/*
 * LispReader.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: LispReader.java,v 1.23 2004-03-17 02:22:34 piso Exp $
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

public final class LispReader extends Lisp
{
    // ### read-comment
    public static final ReaderMacroFunction READ_COMMENT =
        new ReaderMacroFunction("read-comment", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            while (true) {
                int n = stream._readChar();
                if (n < 0)
                    return null;
                if (n == '\n')
                    return null;
            }
        }
    };

    // ### read-string
    public static final ReaderMacroFunction READ_STRING =
        new ReaderMacroFunction("read-string", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char terminator)
            throws ConditionThrowable
        {
            StringBuffer sb = new StringBuffer();
            while (true) {
                int n = stream._readChar();
                if (n < 0) {
                    signal(new EndOfFile(stream));
                    // Not reached.
                    return null;
                }
                char c = (char) n;
                if (c == '\\') {
                    // Single escape.
                    n = stream._readChar();
                    if (n < 0) {
                        signal(new EndOfFile(stream));
                        // Not reached.
                        return null;
                    }
                    sb.append((char)n);
                    continue;
                }
                if (c == terminator)
                    break;
                // Default.
                sb.append(c);
            }
            return new SimpleString(sb);
        }
    };

    // ### read-list
    public static final ReaderMacroFunction READ_LIST =
        new ReaderMacroFunction("read-list", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            return stream.readList();
        }
    };

    // ### read-right-paren
    public static final ReaderMacroFunction READ_RIGHT_PAREN =
        new ReaderMacroFunction("read-right-paren", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            return signal(new ReaderError("Unmatched right parenthesis."));
        }
    };

    // ### read-quote
    public static final ReaderMacroFunction READ_QUOTE =
        new ReaderMacroFunction("read-quote", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            return new Cons(Symbol.QUOTE,
                            new Cons(stream.read(true, NIL, true)));
        }
    };

    // ### read-dispatch-char
    public static final ReaderMacroFunction READ_DISPATCH_CHAR =
        new ReaderMacroFunction("read-dispatch-char", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char c)
            throws ConditionThrowable
        {
            return stream.readDispatchChar(c);
        }
    };

    // ### backquote-macro
    public static final ReaderMacroFunction BACKQUOTE_MACRO =
        new ReaderMacroFunction("backquote-macro", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            return new Cons(Symbol.BACKQUOTE,
                            new Cons(stream.read(true, NIL, true)));
        }
    };

    // ### comma-macro
    public static final ReaderMacroFunction COMMA_MACRO =
        new ReaderMacroFunction("comma-macro", PACKAGE_SYS, false,
                                "stream character")
    {
        public LispObject execute(Stream stream, char ignored)
            throws ConditionThrowable
        {
            return stream.readComma();
        }
    };

    // ### sharp-left-paren
    public static final DispatchMacroFunction SHARP_LEFT_PAREN =
        new DispatchMacroFunction("sharp-left-paren", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return new SimpleVector(stream.readList());
        }
    };

    // ### sharp-star
    public static final DispatchMacroFunction SHARP_STAR =
        new DispatchMacroFunction("sharp-star", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readBitVector();
        }
    };

    // ### sharp-dot
    public static final DispatchMacroFunction SHARP_DOT =
        new DispatchMacroFunction("sharp-dot", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            if (_READ_EVAL_.symbolValueNoThrow() == NIL)
                return signal(new ReaderError("Can't read #. when *READ-EVAL* is NIL."));
            else
                return eval(stream.read(true, NIL, true),
                            new Environment(),
                            LispThread.currentThread());
        }
    };

    // ### sharp-colon
    public static final DispatchMacroFunction SHARP_COLON =
        new DispatchMacroFunction("sharp-colon", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readSymbol();
        }
    };

    // ### sharp-a
    public static final DispatchMacroFunction SHARP_A =
        new DispatchMacroFunction("sharp-a", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readArray(n);
        }
    };

    // ### sharp-b
    public static final DispatchMacroFunction SHARP_B =
        new DispatchMacroFunction("sharp-b", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readRadix(2);
        }
    };

    // ### sharp-c
    public static final DispatchMacroFunction SHARP_C =
        new DispatchMacroFunction("sharp-c", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readComplex();
        }
    };

    // ### sharp-o
    public static final DispatchMacroFunction SHARP_O =
        new DispatchMacroFunction("sharp-o", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readRadix(8);
        }
    };

    // ### sharp-p
    public static final DispatchMacroFunction SHARP_P =
        new DispatchMacroFunction("sharp-p", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readPathname();
        }
    };

    // ### sharp-r
    public static final DispatchMacroFunction SHARP_R =
        new DispatchMacroFunction("sharp-r", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readRadix(n);
        }
    };

    // ### sharp-s
    public static final DispatchMacroFunction SHARP_S =
        new DispatchMacroFunction("sharp-s", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readStructure();
        }
    };

    // ### sharp-x
    public static final DispatchMacroFunction SHARP_X =
        new DispatchMacroFunction("sharp-x", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readRadix(16);
        }
    };

    // ### sharp-quote
    public static final DispatchMacroFunction SHARP_QUOTE =
        new DispatchMacroFunction("sharp-quote", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return new Cons(Symbol.FUNCTION,
                            new Cons(stream.read(true, NIL, true)));
        }
    };

    // ### sharp-backslash
    public static final DispatchMacroFunction SHARP_BACKSLASH =
        new DispatchMacroFunction("sharp-backslash", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            return stream.readCharacterLiteral();
        }
    };

    // ### sharp-vertical-bar
    public static final DispatchMacroFunction SHARP_VERTICAL_BAR =
        new DispatchMacroFunction("sharp-vertical-bar", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        public LispObject execute(Stream stream, char c, int n)
            throws ConditionThrowable
        {
            stream.skipBalancedComment();
            return null;
        }
    };
}
