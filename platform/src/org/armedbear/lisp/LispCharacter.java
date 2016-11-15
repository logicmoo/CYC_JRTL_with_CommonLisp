/*
 * LispCharacter.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispCharacter.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class LispCharacter extends AbstractLispObject {

	public static LispCharacter makeChar(char c) {
		try {
			return CharacterFunctions.lispChars.get(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			return new LispCharacter(c);
		}
	}

	public char value;
	String name;

	// This needs to be public for the compiler.
	public LispCharacter(char c) {
		this.value = c;
	}

	public char charValue() {
		return this.value;
	}

	public SubLObject classOf() {
		return BuiltInClass.CHARACTER;
	}

	public boolean eql(char c) {
		return this.value == c;
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof LispCharacter)
			if (this.value == ((LispCharacter) obj).value)
				return true;
		return false;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof LispCharacter)
			if (this.value == ((LispCharacter) obj).value)
				return true;
		return false;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof LispCharacter) {
			if (this.value == ((LispCharacter) obj).value)
				return true;
			return CharacterFunctions.toLowerCase(this.value) == CharacterFunctions
					.toLowerCase(((LispCharacter) obj).value);
		}
		return false;
	}

	public SubLObject getDescription() {
		StringBuilder sb = new StringBuilder("character #\\");
		sb.append(this.value);
		sb.append(" char-code #x");
		sb.append(Integer.toHexString(this.value));
		return LispObjectFactory.makeString(sb);
	}

	/** See LispObject.getStringValue() */

	public String getString() {
		return String.valueOf(this.value);
	}

	public boolean isCharacter() {
		return true;
	}

	boolean isStandardChar() {
		if (this.value >= ' ' && this.value < 127)
			return true;
		if (this.value == '\n')
			return true;
		return false;
	}

	public Object javaInstance() {
		return Character.valueOf(this.value);
	}

	public Object javaInstance(Class c) {
		return this.javaInstance();
	}

	public int psxhash() {
		return Character.toUpperCase(this.value);
	}

	// public char getValue() {
	// return value;
	// }

	public SubLObject STRING() {
		return LispObjectFactory.makeString(this.value);
	}

	public int sxhash() {
		return this.value;
	}

	final public String toString() {
		return this.writeToString();
	}

	public SubLObject typeOf() {
		if (this.isStandardChar())
			return LispSymbols.STANDARD_CHAR;
		return LispSymbols.CHARACTER;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.CHARACTER)
			return Lisp.T;
		if (type == BuiltInClass.CHARACTER)
			return Lisp.T;
		if (type == LispSymbols.BASE_CHAR)
			return Lisp.T;
		if (type == LispSymbols.STANDARD_CHAR)
			return this.isStandardChar() ? Lisp.T : Lisp.NIL;
		return super.typep(type);
	}

	public String writeToString() {
		final LispThread thread = LispThread.currentThread();
		boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL;
		// "Specifically, if *PRINT-READABLY* is true, printing proceeds as if
		// *PRINT-ESCAPE*, *PRINT-ARRAY*, and *PRINT-GENSYM* were also true,
		// and as if *PRINT-LENGTH*, *PRINT-LEVEL*, and *PRINT-LINES* were
		// false."
		boolean printEscape = printReadably || LispSymbols.PRINT_ESCAPE.symbolValue(thread) != Lisp.NIL;
		StringBuilder sb = new StringBuilder();
		if (printEscape) {
			sb.append("#\\");
			switch (this.value) {
			case 0:
				sb.append("Null");
				break;
			case 7:
				sb.append("Bell");
				break;
			case '\b':
				sb.append("Backspace");
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
			case 27:
				sb.append("Escape");
				break;
			/*
			 * case 32: sb.append("Space"); break;
			 */
			case 127:
				sb.append("Rubout");
				break;
			default:
				if (this.name != null)
					sb.append(this.name);
				else
					sb.append(this.value);
				break;
			}
		} else
			sb.append(this.value);
		return sb.toString();
	}

	// public static char getValue(LispObject obj) {
	// return obj.charValue();
	// }

}
