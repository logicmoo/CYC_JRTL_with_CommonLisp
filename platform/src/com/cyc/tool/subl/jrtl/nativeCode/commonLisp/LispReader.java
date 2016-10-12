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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class LispReader {
	// ### read-comment
	public static ReaderMacroFunction READ_COMMENT = new ReaderMacroFunction("read-comment", Lisp.PACKAGE_SYS, false,
			"stream character") {

		public SubLObject execute(LispStream stream, char ignored)

		{
			try {
				while (true) {
					int n = stream._readChar();
					if (n < 0)
						return null;
					if (n == '\n')
						return null;
				}
			} catch (java.io.IOException e) {
				return null;
			}
		}
	};

	// ### read-string
	public static ReaderMacroFunction READ_STRING = new ReaderMacroFunction("read-string", Lisp.PACKAGE_SYS, false,
			"stream character") {

		public SubLObject execute(LispStream stream, char terminator)

		{
			LispThread thread = LispThread.currentThread();
			Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
			StringBuilder sb = new StringBuilder();
			try {
				while (true) {
					int n = stream._readChar();
					if (n < 0) {
						Lisp.error(new EndOfFile(stream));
						// Not reached.
						return null;
					}
					char c = (char) n; // ### BUG: Codepoint conversion
					if (rt.getSyntaxType(c) == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
						// Single escape.
						n = stream._readChar();
						if (n < 0) {
							Lisp.error(new EndOfFile(stream));
							// Not reached.
							return null;
						}
						sb.append((char) n); // ### BUG: Codepoint conversion
						continue;
					}
					if (Utilities.isPlatformWindows)
						if (c == '\r') {
							n = stream._readChar();
							if (n < 0) {
								Lisp.error(new EndOfFile(stream));
								// Not reached.
								return null;
							}
							if (n == '\n')
								sb.append('\n');
							else {
								// '\r' was not followed by '\n'.
								stream._unreadChar(n);
								sb.append('\r');
							}
							continue;
						}
					if (c == terminator)
						break;
					// Default.
					sb.append(c);
				}
			} catch (java.io.IOException e) {
				// error(new EndOfFile(stream));
				return LispObjectFactory.makeString(sb);
			}
			return LispObjectFactory.makeString(sb);
		}
	};

	// ### read-list
	public static ReaderMacroFunction READ_LIST = new ReaderMacroFunction("read-list", Lisp.PACKAGE_SYS, false,
			"stream character") {

		public SubLObject execute(LispStream stream, char ignored)

		{
			return stream.readList(false, false);
		}
	};

	// ### read-right-paren
	public static ReaderMacroFunction READ_RIGHT_PAREN = new ReaderMacroFunction("read-right-paren", Lisp.PACKAGE_SYS,
			false, "stream character") {

		public SubLObject execute(LispStream stream, char ignored)

		{
			return Lisp.error(new ReaderError("Unmatched right parenthesis.", stream));
		}
	};

	// ### read-quote
	public static ReaderMacroFunction READ_QUOTE = new ReaderMacroFunction("read-quote", Lisp.PACKAGE_SYS, false,
			"stream character") {

		public SubLObject execute(LispStream stream, char ignored)

		{
			return LispObjectFactory.makeCons(LispSymbols.QUOTE,
					LispObjectFactory.makeCons(stream.read(true, Lisp.NIL, true, LispThread.currentThread())));
		}
	};

	// ### read-dispatch-char
	public static ReaderMacroFunction READ_DISPATCH_CHAR = new ReaderMacroFunction("read-dispatch-char",
			Lisp.PACKAGE_SYS, false, "stream character") {

		public SubLObject execute(LispStream stream, char c)

		{
			return stream.readDispatchChar(c, false);
		}
	};

	// ### sharp-left-paren
	public static DispatchMacroFunction SHARP_LEFT_PAREN = new DispatchMacroFunction("sharp-left-paren",
			Lisp.PACKAGE_SYS, false, "stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			LispThread thread = LispThread.currentThread();
			SubLObject list = stream.readList(true, false);
			if (Lisp._BACKQUOTE_COUNT_.symbolValue(thread).isZero())
				if (n >= 0) {
					SubLObject[] array = LispObjectFactory.makeLispObjectArray(n);
					for (int i = 0; i < n; i++) {
						array[i] = list.first();
						if (list.rest() != Lisp.NIL)
							list = list.rest();
					}
					return LispObjectFactory.makeSimpleVector(array);
				} else
					return LispObjectFactory.makeSimpleVector(list);
			return LispObjectFactory.makeCons(Lisp._BQ_VECTOR_FLAG_.symbolValue(thread), list);
		}
	};

	// ### sharp-star
	public static DispatchMacroFunction SHARP_STAR = new DispatchMacroFunction("sharp-star", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char ignored, int n)

		{
			LispThread thread = LispThread.currentThread();
			Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
			boolean suppress = LispSymbols.READ_SUPPRESS.symbolValue(thread) != Lisp.NIL;
			StringBuilder sb = new StringBuilder();
			try {
				while (true) {
					int ch = stream._readChar();
					if (ch < 0)
						break;
					char c = (char) ch; // ### BUG: Codepoint conversion
					if (c == '0' || c == '1')
						sb.append(c);
					else {
						int syntaxType = rt.getSyntaxType(c);
						if (syntaxType == Readtable.SYNTAX_TYPE_WHITESPACE
								|| syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
							stream._unreadChar(c);
							break;
						} else if (!suppress) {
							String name = CharacterFunctions.charToName(c);
							if (name == null)
								name = "#\\" + c;
							Lisp.error(new ReaderError("Illegal element for bit-vector: " + name, stream));
						}
					}
				}
			} catch (java.io.IOException e) {
				Lisp.error(new ReaderError("IO error-vector: ", stream));
			}
			if (suppress)
				return Lisp.NIL;
			if (n >= 0) {
				// n was supplied.
				int length = sb.length();
				if (length == 0)
					if (n > 0)
						return Lisp.error(
								new ReaderError("No element specified for bit vector of length " + n + '.', stream));
				if (n > length) {
					char c = sb.charAt(length - 1);
					for (int i = length; i < n; i++)
						sb.append(c);
				} else if (n < length)
					return Lisp.error(new ReaderError(
							"Bit vector is longer than specified length: #" + n + '*' + sb.toString(), stream));
			}
			return new SimpleBitVector(sb.toString());
		}
	};

	// ### sharp-dot
	public static DispatchMacroFunction SHARP_DOT = new DispatchMacroFunction("sharp-dot", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			LispThread thread = LispThread.currentThread();
			if (LispSymbols.READ_EVAL.symbolValue(thread) == Lisp.NIL)
				return Lisp.error(new ReaderError("Can't read #. when *READ-EVAL* is NIL.", stream));
			else
				return Lisp.eval(stream.read(true, Lisp.NIL, true, thread), new Environment(), thread);
		}
	};

	// ### sharp-colon
	public static DispatchMacroFunction SHARP_COLON = new DispatchMacroFunction("sharp-colon", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readSymbol();
		}
	};

	// ### sharp-a
	public static DispatchMacroFunction SHARP_A = new DispatchMacroFunction("sharp-a", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readArray(n);
		}
	};

	// ### sharp-b
	public static DispatchMacroFunction SHARP_B = new DispatchMacroFunction("sharp-b", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readRadix(2);
		}
	};

	// ### sharp-c
	public static DispatchMacroFunction SHARP_C = new DispatchMacroFunction("sharp-c", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readComplex();
		}
	};

	// ### sharp-o
	public static DispatchMacroFunction SHARP_O = new DispatchMacroFunction("sharp-o", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readRadix(8);
		}
	};

	// ### sharp-p
	public static DispatchMacroFunction SHARP_P = new DispatchMacroFunction("sharp-p", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readPathname();
		}
	};

	// ### sharp-r
	public static DispatchMacroFunction SHARP_R = new DispatchMacroFunction("sharp-r", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readRadix(n);
		}
	};

	// ### sharp-s
	public static DispatchMacroFunction SHARP_S = new DispatchMacroFunction("sharp-s", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readStructure();
		}
	};

	// ### sharp-x
	public static DispatchMacroFunction SHARP_X = new DispatchMacroFunction("sharp-x", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return stream.readRadix(16);
		}
	};

	// ### sharp-quote
	public static DispatchMacroFunction SHARP_QUOTE = new DispatchMacroFunction("sharp-quote", Lisp.PACKAGE_SYS, false,
			"stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			return LispObjectFactory.makeCons(LispSymbols.FUNCTION,
					LispObjectFactory.makeCons(stream.read(true, Lisp.NIL, true, LispThread.currentThread())));
		}
	};

	// ### sharp-backslash
	public static DispatchMacroFunction SHARP_BACKSLASH = new DispatchMacroFunction("sharp-backslash", Lisp.PACKAGE_SYS,
			false, "stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			LispThread thread = LispThread.currentThread();
			Readtable rt = (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread);
			return stream.readCharacterLiteral(rt, thread);
		}
	};

	// ### sharp-vertical-bar
	public static DispatchMacroFunction SHARP_VERTICAL_BAR = new DispatchMacroFunction("sharp-vertical-bar",
			Lisp.PACKAGE_SYS, false, "stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			stream.skipBalancedComment();
			return null;
		}
	};

	// ### sharp-illegal
	public static DispatchMacroFunction SHARP_ILLEGAL = new DispatchMacroFunction("sharp-illegal", Lisp.PACKAGE_SYS,
			false, "stream sub-char numarg") {

		public SubLObject execute(LispStream stream, char c, int n)

		{
			StringBuilder sb = new StringBuilder("Illegal # macro character: #\\");
			String s = CharacterFunctions.charToName(c);
			if (s != null)
				sb.append(s);
			else
				sb.append(c);
			return Lisp.error(new ReaderError(sb.toString(), stream));
		}
	};
}
