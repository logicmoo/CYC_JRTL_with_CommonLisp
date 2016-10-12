/*
 * Readtable.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Readtable.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.Iterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Readtable extends AbstractLispObject {
	protected static class DispatchTable {
		protected CharHashMap<SubLObject> functions;

		public DispatchTable() {
			this.functions = new CharHashMap<SubLObject>(SubLObject.class, null);
		}

		@SuppressWarnings("unchecked")
		public DispatchTable(DispatchTable dt) {
			this.functions = (CharHashMap<SubLObject>) dt.functions.clone();
		}
	}

	public static byte SYNTAX_TYPE_CONSTITUENT = 0;
	public static byte SYNTAX_TYPE_WHITESPACE = 1;
	public static byte SYNTAX_TYPE_TERMINATING_MACRO = 2;
	public static byte SYNTAX_TYPE_NON_TERMINATING_MACRO = 3;
	public static byte SYNTAX_TYPE_SINGLE_ESCAPE = 4;
	public static byte SYNTAX_TYPE_MULTIPLE_ESCAPE = 5;

	// ### readtablep
	private static Primitive READTABLEP = new JavaPrimitive("readtablep", "object") {

		public SubLObject execute(SubLObject arg) {
			return arg instanceof Readtable ? Lisp.T : Lisp.NIL;
		}
	};
	// ### copy-readtable
	private static Primitive COPY_READTABLE = new JavaPrimitive("copy-readtable",
			"&optional from-readtable to-readtable") {

		public SubLObject execute() {
			return new Readtable(Lisp.currentReadtable());
		}

		public SubLObject execute(SubLObject arg) {
			return new Readtable(arg);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			Readtable from = Lisp.designator_readtable(first);
			if (second == Lisp.NIL)
				return new Readtable(from);
			Readtable to = Lisp.checkReadtable(second);
			Readtable.copyReadtable(from, to);
			return to;
		}
	};
	// ### get-macro-character char &optional readtable
	// => function, non-terminating-p
	private static Primitive GET_MACRO_CHARACTER = new JavaPrimitive("get-macro-character",
			"char &optional readtable") {

		public SubLObject execute(SubLObject arg) {
			char c = arg.charValue();
			Readtable rt = Lisp.currentReadtable();
			return rt.getMacroCharacter(c);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			char c = first.charValue();
			Readtable rt = Lisp.designator_readtable(second);
			return rt.getMacroCharacter(c);
		}
	};

	// ### set-macro-character char new-function &optional non-terminating-p
	// readtable
	// => t
	private static Primitive SET_MACRO_CHARACTER = new JavaPrimitive("set-macro-character",
			"char new-function &optional non-terminating-p readtable") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return this.execute(first, second, Lisp.NIL, Lisp.currentReadtable());
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return this.execute(first, second, third, Lisp.currentReadtable());
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

		{
			char c = first.charValue();
			SubLObject designator;
			if (second instanceof Function || second instanceof StandardGenericFunction)
				designator = second;
			else if (second instanceof SubLSymbol)
				designator = second;
			else
				return Lisp.error(new LispError(second.writeToString() + " does not designate a function."));
			byte syntaxType;
			if (third != Lisp.NIL)
				syntaxType = Readtable.SYNTAX_TYPE_NON_TERMINATING_MACRO;
			else
				syntaxType = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
			Readtable rt = Lisp.designator_readtable(fourth);
			// REVIEW synchronization
			rt.syntax.put(c, syntaxType);
			rt.readerMacroFunctions.put(c, designator);
			return Lisp.T;
		}
	};

	// ### make-dispatch-macro-character char &optional non-terminating-p
	// readtable
	// => t
	private static Primitive MAKE_DISPATCH_MACRO_CHARACTER = new JavaPrimitive("make-dispatch-macro-character",
			"char &optional non-terminating-p readtable") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 1 || args.length > 3)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			char dispChar = args[0].charValue();
			SubLObject non_terminating_p;
			if (args.length > 1)
				non_terminating_p = args[1];
			else
				non_terminating_p = Lisp.NIL;
			Readtable readtable;
			if (args.length == 3)
				readtable = Lisp.checkReadtable(args[2]);
			else
				readtable = Lisp.currentReadtable();
			readtable.makeDispatchMacroCharacter(dispChar, non_terminating_p);
			return Lisp.T;
		}
	};

	// ### get-dispatch-macro-character disp-char sub-char &optional readtable
	// => function
	private static Primitive GET_DISPATCH_MACRO_CHARACTER = new JavaPrimitive("get-dispatch-macro-character",
			"disp-char sub-char &optional readtable") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 2 || args.length > 3)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			char dispChar = args[0].charValue();
			char subChar = args[1].charValue();
			Readtable readtable;
			if (args.length == 3)
				readtable = Lisp.designator_readtable(args[2]);
			else
				readtable = Lisp.currentReadtable();
			return readtable.getDispatchMacroCharacter(dispChar, subChar);
		}
	};

	// ### set-dispatch-macro-character disp-char sub-char new-function
	// &optional readtable
	// => t
	private static Primitive SET_DISPATCH_MACRO_CHARACTER = new JavaPrimitive("set-dispatch-macro-character",
			"disp-char sub-char new-function &optional readtable") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 3 || args.length > 4)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			char dispChar = args[0].charValue();
			char subChar = args[1].charValue();
			SubLObject function = Lisp.coerceToFunction(args[2]);
			Readtable readtable;
			if (args.length == 4)
				readtable = Lisp.designator_readtable(args[3]);
			else
				readtable = Lisp.currentReadtable();
			readtable.setDispatchMacroCharacter(dispChar, subChar, function);
			return Lisp.T;
		}
	};

	// ### set-syntax-from-char to-char from-char &optional to-readtable
	// from-readtable
	// => t
	private static Primitive SET_SYNTAX_FROM_CHAR = new JavaPrimitive("set-syntax-from-char",
			"to-char from-char &optional to-readtable from-readtable") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 2 || args.length > 4)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			char toChar = args[0].charValue();
			char fromChar = args[1].charValue();
			Readtable toReadtable;
			if (args.length > 2)
				toReadtable = Lisp.checkReadtable(args[2]);
			else
				toReadtable = Lisp.currentReadtable();
			Readtable fromReadtable;
			if (args.length > 3)
				fromReadtable = Lisp.designator_readtable(args[3]);
			else
				fromReadtable = Lisp.checkReadtable(Lisp.STANDARD_READTABLE.symbolValue());
			// REVIEW synchronization
			toReadtable.syntax.put(toChar, fromReadtable.syntax.get(fromChar));
			toReadtable.readerMacroFunctions.put(toChar, fromReadtable.readerMacroFunctions.get(fromChar));
			// "If the character is a dispatching macro character, its entire
			// dispatch table of reader macro functions is copied."
			DispatchTable found = fromReadtable.dispatchTables.get(fromChar);
			if (found != null)
				toReadtable.dispatchTables.put(toChar, new DispatchTable(found));
			else
				// Don't leave behind dispatch tables when fromChar
				// doesn't have one
				toReadtable.dispatchTables.put(toChar, null);
			return Lisp.T;
		}
	};

	// ### readtable-case readtable => mode
	private static Primitive READTABLE_CASE = new JavaPrimitive("readtable-case", "readtable") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkReadtable(arg).readtableCase;
		}
	};

	// ### %set-readtable-case readtable new-mode => new-mode
	private static Primitive _SET_READTABLE_CASE = new JavaPrimitive("%set-readtable-case", Lisp.PACKAGE_SYS, false,
			"readtable new-mode") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			Readtable readtable = Lisp.checkReadtable(first);
			if (second == Keyword.UPCASE || second == Keyword.DOWNCASE || second == Keyword.INVERT
					|| second == Keyword.PRESERVE) {
				readtable.readtableCase = second;
				return second;
			}
			return Lisp.type_error(second,
					Lisp.list(LispSymbols.MEMBER, Keyword.INVERT, Keyword.PRESERVE, Keyword.DOWNCASE, Keyword.UPCASE));
		}
	};

	// FIXME synchronization
	static void copyReadtable(Readtable from, Readtable to) {
		Iterator<Character> charIterator = from.syntax.getCharIterator();
		while (charIterator.hasNext()) {
			char c = charIterator.next();
			Byte dt = from.syntax.get(c);
			if (dt != null)
				to.syntax.put(c, dt);
			else
				to.syntax.put(c, null);
		}
		charIterator = from.readerMacroFunctions.getCharIterator();
		while (charIterator.hasNext()) {
			char c = charIterator.next();
			SubLObject dt = from.readerMacroFunctions.get(c);
			if (dt != null)
				to.readerMacroFunctions.put(c, dt);
			else
				to.readerMacroFunctions.put(c, null);
		}
		charIterator = from.dispatchTables.getCharIterator();
		while (charIterator.hasNext()) {
			char c = charIterator.next();
			DispatchTable dt = from.dispatchTables.get(c);
			if (dt != null)
				to.dispatchTables.put(c, new DispatchTable(dt));
			else
				to.dispatchTables.put(c, null);
		}
		to.readtableCase = from.readtableCase;
	}

	protected CharHashMap<Byte> syntax = new CharHashMap<Byte>(Byte.class, Readtable.SYNTAX_TYPE_CONSTITUENT);

	protected CharHashMap<SubLObject> readerMacroFunctions = new CharHashMap<SubLObject>(SubLObject.class, null);

	protected CharHashMap<DispatchTable> dispatchTables = new CharHashMap<DispatchTable>(DispatchTable.class, null);

	protected SubLObject readtableCase;

	public Readtable() {
		this.initialize();
	}

	public Readtable(SubLObject obj) {
		Readtable rt;
		if (obj == Lisp.NIL)
			rt = Lisp.checkReadtable(Lisp.STANDARD_READTABLE.symbolValue());
		else
			rt = Lisp.checkReadtable(obj);
		synchronized (rt) {
			Readtable.copyReadtable(rt, this);
		}
	}

	public void checkInvalid(char c, LispStream stream) {
		// "... no mechanism is provided for changing the constituent trait of a
		// character." (2.1.4.2)
		if (this.isInvalid(c)) {
			String name = CharacterFunctions.charToName(c);
			StringBuilder sb = new StringBuilder("Invalid character");
			if (name != null) {
				sb.append(" #\\");
				sb.append(name);
			}
			Lisp.error(new ReaderError(sb.toString(), stream));
		}
	}

	public SubLObject classOf() {
		return BuiltInClass.READTABLE;
	}

	public SubLObject getDispatchMacroCharacter(char dispChar, char subChar)

	{
		DispatchTable dispatchTable = this.dispatchTables.get(dispChar);
		if (dispatchTable == null) {
			LispCharacter c = LispCharacter.makeChar(dispChar);
			return Lisp.error(new LispError(c.writeToString() + " is not a dispatch character."));
		}
		SubLObject function = dispatchTable.functions.get(CharacterFunctions.toUpperCase(subChar));
		return function != null ? function : Lisp.NIL;
	}

	SubLObject getMacroCharacter(char c) {
		SubLObject function = this.getReaderMacroFunction(c);
		SubLObject non_terminating_p;
		if (function != null) {
			if (this.syntax.get(c) == Readtable.SYNTAX_TYPE_NON_TERMINATING_MACRO)
				non_terminating_p = Lisp.T;
			else
				non_terminating_p = Lisp.NIL;
		} else {
			function = Lisp.NIL;
			non_terminating_p = Lisp.NIL;
		}
		return LispThread.currentThread().setValues(function, non_terminating_p);
	}

	public SubLObject getReaderMacroFunction(char c) {
		return this.readerMacroFunctions.get(c);
	}

	public SubLObject getReadtableCase() {
		return this.readtableCase;
	}

	public byte getSyntaxType(char c) {
		return this.syntax.get(c);
	}

	protected void initialize() {
		Byte[] syntax = this.syntax.constants;
		syntax[9] = Readtable.SYNTAX_TYPE_WHITESPACE; // tab
		syntax[10] = Readtable.SYNTAX_TYPE_WHITESPACE; // linefeed
		syntax[12] = Readtable.SYNTAX_TYPE_WHITESPACE; // form feed
		syntax[13] = Readtable.SYNTAX_TYPE_WHITESPACE; // return
		syntax[' '] = Readtable.SYNTAX_TYPE_WHITESPACE;

		syntax['"'] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax['\''] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax['('] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax[')'] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax[','] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax[';'] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		syntax['`'] = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;

		syntax['#'] = Readtable.SYNTAX_TYPE_NON_TERMINATING_MACRO;

		syntax['\\'] = Readtable.SYNTAX_TYPE_SINGLE_ESCAPE;
		syntax['|'] = Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE;

		SubLObject[] readerMacroFunctions = this.readerMacroFunctions.constants;
		readerMacroFunctions[';'] = LispReader.READ_COMMENT;
		readerMacroFunctions['"'] = LispReader.READ_STRING;
		readerMacroFunctions['('] = LispReader.READ_LIST;
		readerMacroFunctions[')'] = LispReader.READ_RIGHT_PAREN;
		readerMacroFunctions['\''] = LispReader.READ_QUOTE;
		readerMacroFunctions['#'] = LispReader.READ_DISPATCH_CHAR;

		// BACKQUOTE-MACRO and COMMA-MACRO are defined in backquote.lisp.
		readerMacroFunctions['`'] = LispSymbols.BACKQUOTE_MACRO;
		readerMacroFunctions[','] = LispSymbols.COMMA_MACRO;

		DispatchTable dt = new DispatchTable();
		SubLObject[] dtfunctions = dt.functions.constants;
		dtfunctions['('] = LispReader.SHARP_LEFT_PAREN;
		dtfunctions['*'] = LispReader.SHARP_STAR;
		dtfunctions['.'] = LispReader.SHARP_DOT;
		dtfunctions[':'] = LispReader.SHARP_COLON;
		dtfunctions['A'] = LispReader.SHARP_A;
		dtfunctions['B'] = LispReader.SHARP_B;
		dtfunctions['C'] = LispReader.SHARP_C;
		dtfunctions['O'] = LispReader.SHARP_O;
		dtfunctions['P'] = LispReader.SHARP_P;
		dtfunctions['R'] = LispReader.SHARP_R;
		dtfunctions['S'] = LispReader.SHARP_S;
		dtfunctions['X'] = LispReader.SHARP_X;
		dtfunctions['\''] = LispReader.SHARP_QUOTE;
		dtfunctions['\\'] = LispReader.SHARP_BACKSLASH;
		dtfunctions['|'] = LispReader.SHARP_VERTICAL_BAR;
		dtfunctions[')'] = LispReader.SHARP_ILLEGAL;
		dtfunctions['<'] = LispReader.SHARP_ILLEGAL;
		dtfunctions[' '] = LispReader.SHARP_ILLEGAL;
		dtfunctions[8] = LispReader.SHARP_ILLEGAL; // backspace
		dtfunctions[9] = LispReader.SHARP_ILLEGAL; // tab
		dtfunctions[10] = LispReader.SHARP_ILLEGAL; // newline, linefeed
		dtfunctions[12] = LispReader.SHARP_ILLEGAL; // page
		dtfunctions[13] = LispReader.SHARP_ILLEGAL; // return

		this.dispatchTables.constants['#'] = dt;

		this.readtableCase = Keyword.UPCASE;
	}

	public boolean isInvalid(char c) {
		switch (c) {
		case 8:
		case 9:
		case 10:
		case 12:
		case 13:
		case 32:
		case 127:
			return true;
		default:
			return false;
		}
	}

	public boolean isWhitespace(char c) {
		return this.getSyntaxType(c) == Readtable.SYNTAX_TYPE_WHITESPACE;
	}

	void makeDispatchMacroCharacter(char dispChar, SubLObject non_terminating_p) {
		byte syntaxType;
		if (non_terminating_p != Lisp.NIL)
			syntaxType = Readtable.SYNTAX_TYPE_NON_TERMINATING_MACRO;
		else
			syntaxType = Readtable.SYNTAX_TYPE_TERMINATING_MACRO;
		// FIXME synchronization
		this.syntax.put(dispChar, syntaxType);
		this.readerMacroFunctions.put(dispChar, LispReader.READ_DISPATCH_CHAR);
		this.dispatchTables.put(dispChar, new DispatchTable());
	}

	public void setDispatchMacroCharacter(char dispChar, char subChar, SubLObject function)

	{
		DispatchTable dispatchTable = this.dispatchTables.get(dispChar);
		if (dispatchTable == null) {
			LispCharacter c = LispCharacter.makeChar(dispChar);
			Lisp.error(new LispError(c.writeToString() + " is not a dispatch character."));
		}
		dispatchTable.functions.put(CharacterFunctions.toUpperCase(subChar), function);
	}

	public String toString() {
		return this.unreadableString("READTABLE");
	}

	public SubLObject typeOf() {
		return LispSymbols.READTABLE;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.READTABLE)
			return Lisp.T;
		if (type == BuiltInClass.READTABLE)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		return this.unreadableString(this.getClass().getSimpleName());
	}
}
