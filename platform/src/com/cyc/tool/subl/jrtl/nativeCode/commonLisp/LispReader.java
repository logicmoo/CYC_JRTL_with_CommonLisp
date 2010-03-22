/*
 * LispReader.java
 *
 * Copyright (C) 2004-2007 Peter Graves
 * $Id: LispReader.java 12431 2010-02-08 08:05:15Z mevenson $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class LispReader
{
    // ### read-comment
    public static final ReaderMacroFunction READ_COMMENT =
        new ReaderMacroFunction("read-comment", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char ignored)

        {
          try 
            {
              while (true) {
                int n = stream._readChar();
                if (n < 0)
                  return null;
                if (n == '\n')
                  return null;
              }
            }
          catch (java.io.IOException e)
            {
              return null;
            }
        }
    };

    // ### read-string
    public static final ReaderMacroFunction READ_STRING =
        new ReaderMacroFunction("read-string", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char terminator)

        {
            final LispThread thread = LispThread.currentThread();
            final Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
            StringBuilder sb = new StringBuilder();
            try 
              {
                while (true) {
                  int n = stream._readChar();
                  if (n < 0) {
                    error(new EndOfFile(stream));
                    // Not reached.
                    return null;
                  }
                  char c = (char) n; // ### BUG: Codepoint conversion
                  if (rt.getSyntaxType(c) == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
                    // Single escape.
                    n = stream._readChar();
                    if (n < 0) {
                      error(new EndOfFile(stream));
                      // Not reached.
                      return null;
                    }
                    sb.append((char)n); // ### BUG: Codepoint conversion
                    continue;
                  }
                  if (Utilities.isPlatformWindows) {
                    if (c == '\r') {
                      n = stream._readChar();
                      if (n < 0) {
                        error(new EndOfFile(stream));
                        // Not reached.
                        return null;
                      }
                      if (n == '\n') {
                        sb.append('\n');
                      } else {
                        // '\r' was not followed by '\n'.
                        stream._unreadChar(n);
                        sb.append('\r');
                      }
                      continue;
                    }
                  }
                  if (c == terminator)
                    break;
                  // Default.
                  sb.append(c);
                }
              }
            catch (java.io.IOException e)
              {
                //error(new EndOfFile(stream));
		return makeString(sb);
              }
            return makeString(sb);
        }
    };

    // ### read-list
    public static final ReaderMacroFunction READ_LIST =
        new ReaderMacroFunction("read-list", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char ignored)

        {
            return stream.readList(false, false);
        }
    };

    // ### read-right-paren
    public static final ReaderMacroFunction READ_RIGHT_PAREN =
        new ReaderMacroFunction("read-right-paren", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char ignored)

        {
            return error(new ReaderError("Unmatched right parenthesis.", stream));
        }
    };

    // ### read-quote
    public static final ReaderMacroFunction READ_QUOTE =
        new ReaderMacroFunction("read-quote", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char ignored)

        {
            return makeCons(LispSymbols.QUOTE,
                            makeCons(stream.read(true, NIL, true,
                                                 LispThread.currentThread())));
        }
    };

    // ### read-dispatch-char
    public static final ReaderMacroFunction READ_DISPATCH_CHAR =
        new ReaderMacroFunction("read-dispatch-char", PACKAGE_SYS, false,
                                "stream character")
    {
        @Override
        public SubLObject execute(LispStream stream, char c)

        {
            return stream.readDispatchChar(c, false);
        }
    };

    // ### sharp-left-paren
    public static final DispatchMacroFunction SHARP_LEFT_PAREN =
        new DispatchMacroFunction("sharp-left-paren", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            final LispThread thread = LispThread.currentThread();
            SubLObject list = stream.readList(true, false);
            if (_BACKQUOTE_COUNT_.symbolValue(thread).isZero()) {
                if (n >= 0) {
                    SubLObject[] array = makeLispObjectArray(n);
                    for (int i = 0; i < n; i++) {
                        array[i] = list.first();
                        if (list.rest() != NIL)
                            list = list.rest();
                    }
                    return makeSimpleVector(array);
                } else
                    return makeSimpleVector(list);
            }
            return makeCons(_BQ_VECTOR_FLAG_.symbolValue(thread), list);
        }
    };

    // ### sharp-star
    public static final DispatchMacroFunction SHARP_STAR =
        new DispatchMacroFunction("sharp-star", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char ignored, int n)

        {
            final LispThread thread = LispThread.currentThread();
            final Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
            final boolean suppress = LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL;
            StringBuilder sb = new StringBuilder();
            try 
              {
                while (true) {
                  int ch = stream._readChar();
                  if (ch < 0)
                    break;
                  char c = (char) ch; // ### BUG: Codepoint conversion
                  if (c == '0' || c == '1')
                    sb.append(c);
                  else {
                    int syntaxType = rt.getSyntaxType(c);
                    if (syntaxType == Readtable.SYNTAX_TYPE_WHITESPACE ||
                        syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
                      stream._unreadChar(c);
                      break;
                    } else if (!suppress) {
                      String name = CharacterFunctions.charToName(c);
                      if (name == null)
                        name = "#\\" + c;
                      error(new ReaderError("Illegal element for bit-vector: " + name,
                                            stream));
                    }
                  }
                }
              }
            catch (java.io.IOException e)
              {
                error(new ReaderError("IO error-vector: ",
                                      stream));
              }
            if (suppress)
                return NIL;
            if (n >= 0) {
                // n was supplied.
                final int length = sb.length();
                if (length == 0) {
                    if (n > 0)
                        return error(new ReaderError("No element specified for bit vector of length " +
                                                      n + '.',
                                                      stream));
                }
                if (n > length) {
                    final char c = sb.charAt(length - 1);
                    for (int i = length; i < n; i++)
                        sb.append(c);
                } else if (n < length) {
                    return error(new ReaderError("Bit vector is longer than specified length: #" +
                                                  n + '*' + sb.toString(),
                                                  stream));
                }
            }
            return new SimpleBitVector(sb.toString());
        }
    };

    // ### sharp-dot
    public static final DispatchMacroFunction SHARP_DOT =
        new DispatchMacroFunction("sharp-dot", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            final LispThread thread = LispThread.currentThread();
            if (LispSymbols.READ_EVAL.symbolValue(thread) == NIL)
                return error(new ReaderError("Can't read #. when *READ-EVAL* is NIL.",
                                              stream));
            else
                return Lisp.eval(stream.read(true, NIL, true, thread),
                            new Environment(), thread);
        }
    };

    // ### sharp-colon
    public static final DispatchMacroFunction SHARP_COLON =
        new DispatchMacroFunction("sharp-colon", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readSymbol();
        }
    };

    // ### sharp-a
    public static final DispatchMacroFunction SHARP_A =
        new DispatchMacroFunction("sharp-a", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readArray(n);
        }
    };

    // ### sharp-b
    public static final DispatchMacroFunction SHARP_B =
        new DispatchMacroFunction("sharp-b", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readRadix(2);
        }
    };

    // ### sharp-c
    public static final DispatchMacroFunction SHARP_C =
        new DispatchMacroFunction("sharp-c", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readComplex();
        }
    };

    // ### sharp-o
    public static final DispatchMacroFunction SHARP_O =
        new DispatchMacroFunction("sharp-o", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readRadix(8);
        }
    };

    // ### sharp-p
    public static final DispatchMacroFunction SHARP_P =
        new DispatchMacroFunction("sharp-p", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readPathname();
        }
    };

    // ### sharp-r
    public static final DispatchMacroFunction SHARP_R =
        new DispatchMacroFunction("sharp-r", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readRadix(n);
        }
    };

    // ### sharp-s
    public static final DispatchMacroFunction SHARP_S =
        new DispatchMacroFunction("sharp-s", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readStructure();
        }
    };

    // ### sharp-x
    public static final DispatchMacroFunction SHARP_X =
        new DispatchMacroFunction("sharp-x", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readRadix(16);
        }
    };

    // ### sharp-quote
    public static final DispatchMacroFunction SHARP_QUOTE =
        new DispatchMacroFunction("sharp-quote", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return makeCons(LispSymbols.FUNCTION,
                            makeCons(stream.read(true, NIL, true,
                                                 LispThread.currentThread())));
        }
    };

    // ### sharp-backslash
    public static final DispatchMacroFunction SHARP_BACKSLASH =
        new DispatchMacroFunction("sharp-backslash", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            final LispThread thread = LispThread.currentThread();
            final Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
            return stream.readCharacterLiteral(rt, thread);
        }
    };

    // ### sharp-vertical-bar
    public static final DispatchMacroFunction SHARP_VERTICAL_BAR =
        new DispatchMacroFunction("sharp-vertical-bar", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            stream.skipBalancedComment();
            return null;
        }
    };

    // ### sharp-illegal
    public static final DispatchMacroFunction SHARP_ILLEGAL =
        new DispatchMacroFunction("sharp-illegal", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        @Override
        public SubLObject execute(LispStream stream, char c, int n)

        {
            StringBuilder sb = new StringBuilder("Illegal # macro character: #\\");
            String s = CharacterFunctions.charToName(c);
            if (s != null)
                sb.append(s);
            else
                sb.append(c);
            return error(new ReaderError(sb.toString(), stream));
        }
    };
}
