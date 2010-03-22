/*
 * java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: java 12290 2009-11-30 22:28:50Z vvoutilainen $
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

import java.util.HashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;


/**
 *  Description of the Class
 *
 * @author    Administrator
 */
public final class CharacterFunctions {
	/**  Description of the Field */
	public static final LispCharacter[] constants;
	/**  Description of the Field */
	public static final CharHashMap<LispCharacter> lispChars;

	static final char[] UPPER_CASE_CHARS = new char[128];
	static final char[] LOWER_CASE_CHARS = new char[128];

	static int maxNamedChar = 0;
	static Map<String, LispCharacter> namedToChar = new HashMap<String, LispCharacter>();

	// ### character
	private static final Primitive CHARACTER = new JavaPrimitive(LispSymbols.CHARACTER, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHARACTER_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHARACTER_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return arg;
		}
		if (arg instanceof SubLString) {
			if (arg.cl_length() == 1) {
				return ((SubLString) arg).AREF(0);
			}
		} else if (arg instanceof SubLSymbol) {
			String name = ((SubLSymbol) arg).getJavaSymbolName();
			if (name.length() == 1) {
				return LispCharacter.makeChar(name.charAt(0));
			}
		}
		return type_error(arg, LispSymbols.CHARACTER_DESIGNATOR);
	}

	// ### whitespacep
	private static final Primitive WHITESPACEP = new JavaPrimitive("whitespacep", PACKAGE_SYS, true) {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return WHITESPACEP_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject WHITESPACEP_execute(SubLObject arg) {
		return Character.isWhitespace(arg.charValue()) ? T : NIL;
	}

	// ### char-code
	private static final Primitive CHAR_CODE = new JavaPrimitive(LispSymbols.CHAR_CODE, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_CODE_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_CODE_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.charValue());
	}

	// ### char-int
	private static final Primitive CHAR_INT = new JavaPrimitive(LispSymbols.CHAR_INT, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_INT_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_INT_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.charValue());
	}

	// ### code-char
	private static final Primitive CODE_CHAR = new JavaPrimitive(LispSymbols.CODE_CHAR, "code") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CODE_CHAR_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CODE_CHAR_execute(SubLObject arg) {
		int n = arg.intValue();
		if (n < CHAR_MAX) {
			return lispChars.get((char) n);
		} else if (n <= Character.MAX_VALUE) {
			return new LispCharacter((char) n);
		}
		// SBCL signals a type-error here: "not of type (UNSIGNED-BYTE 8)"
		return NIL;
	}

	// ### characterp
	private static final Primitive CHARACTERP = new JavaPrimitive(LispSymbols.CHARACTERP, "object") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHARACTERP_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHARACTERP_execute(SubLObject arg) {
		return arg instanceof LispCharacter ? T : NIL;
	}

	// ### both-case-p
	private static final Primitive BOTH_CASE_P = new JavaPrimitive(LispSymbols.BOTH_CASE_P, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return BOTH_CASE_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject BOTH_CASE_P_execute(SubLObject arg) {
		char c = arg.charValue();
		if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
			return T;
		}
		return NIL;
	}

	// ### lower-case-p
	private static final Primitive LOWER_CASE_P = new JavaPrimitive(LispSymbols.LOWER_CASE_P, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return LOWER_CASE_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject LOWER_CASE_P_execute(SubLObject arg) {
		return Character.isLowerCase(arg.charValue()) ? T : NIL;
	}

	// ### upper-case-p
	private static final Primitive UPPER_CASE_P = new JavaPrimitive(LispSymbols.UPPER_CASE_P, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return UPPER_CASE_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject UPPER_CASE_P_execute(SubLObject arg) {
		return Character.isUpperCase(arg.charValue()) ? T : NIL;
	}

	// ### char-downcase
	private static final Primitive CHAR_DOWNCASE = new JavaPrimitive(LispSymbols.CHAR_DOWNCASE, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_DOWNCASE_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_DOWNCASE_execute(SubLObject arg) {
		final char c = arg.charValue();
		if (c < 128) {
			return constants[LOWER_CASE_CHARS[c]];
		}
		return LispCharacter.makeChar(toLowerCase(c));
	}

	// ### char-upcase
	private static final Primitive CHAR_UPCASE = new JavaPrimitive(LispSymbols.CHAR_UPCASE, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_UPCASE_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_UPCASE_execute(SubLObject arg) {
		final char c;
		c = arg.charValue();
		if (c < 128) {
			return constants[UPPER_CASE_CHARS[c]];
		}
		return LispCharacter.makeChar(toUpperCase(c));
	}

	// ### digit-char
	private static final Primitive DIGIT_CHAR = new JavaPrimitive(LispSymbols.DIGIT_CHAR, "weight &optional radix") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return DIGIT_CHAR_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return DIGIT_CHAR_execute(first, second);
		}
	};

	@InlinableMethod
	static final public SubLObject DIGIT_CHAR_execute(SubLObject arg) {
		if (arg instanceof Bignum) {
			return NIL;
		}

		int weight = arg.intValue();
		if (weight < 10) {
			return constants['0' + weight];
		}
		return NIL;
	}

	@InlinableMethod
	static final public SubLObject DIGIT_CHAR_execute(SubLObject first, SubLObject second) {
		int radix;
		if (second instanceof Fixnum) {
			radix = ((Fixnum) second).value;
		} else {
			radix = -1;
		}

		if (radix < 2 || radix > 36) {
			return type_error(second, list(LispSymbols.INTEGER, Fixnum.TWO, Fixnum.constants[36]));
		}
		if (first instanceof Bignum) {
			return NIL;
		}
		int weight = first.intValue();
		if (weight >= radix) {
			return NIL;
		}
		if (weight < 10) {
			return constants['0' + weight];
		}
		return constants['A' + weight - 10];
	}

	// ### digit-char-p char &optional radix => weight
	private static final Primitive DIGIT_CHAR_P = new JavaPrimitive(LispSymbols.DIGIT_CHAR_P, "char &optional radix") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return DIGIT_CHAR_P_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return DIGIT_CHAR_P_execute(first, second);
		}
	};

	@InlinableMethod
	static final public SubLObject DIGIT_CHAR_P_execute(SubLObject arg) {
		final int n = Character.digit(arg.charValue(), 10);
		return n < 0 ? NIL : LispObjectFactory.makeInteger(n);
	}

	@InlinableMethod
	static final public SubLObject DIGIT_CHAR_P_execute(SubLObject first, SubLObject second) {
		char c;
		c = first.charValue();
		if (second instanceof Fixnum) {
			int radix = ((Fixnum) second).value;
			if (radix >= 2 && radix <= 36) {
				int n = Character.digit(c, radix);
				return n < 0 ? NIL : Fixnum.constants[n];
			}
		}
		return type_error(second, list(LispSymbols.INTEGER, Fixnum.TWO, Fixnum.constants[36]));
	}

	// ### standard-char-p
	private static final Primitive STANDARD_CHAR_P = new JavaPrimitive(LispSymbols.STANDARD_CHAR_P, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return STANDARD_CHAR_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject STANDARD_CHAR_P_execute(SubLObject arg) {
		return checkCharacter(arg).isStandardChar() ? T : NIL;
	}

	// ### graphic-char-p
	private static final Primitive GRAPHIC_CHAR_P = new JavaPrimitive(LispSymbols.GRAPHIC_CHAR_P, "char") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return GRAPHIC_CHAR_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject GRAPHIC_CHAR_P_execute(SubLObject arg) {
		char c = arg.charValue();
		if (c >= ' ' && c < 127) {
			return T;
		}
		return Character.isISOControl(c) ? NIL : T;
	}

	// ### alpha-char-p
	private static final Primitive ALPHA_CHAR_P = new JavaPrimitive(LispSymbols.ALPHA_CHAR_P, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return ALPHA_CHAR_P_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject ALPHA_CHAR_P_execute(SubLObject arg) {
		return Character.isLetter(arg.charValue()) ? T : NIL;
	}

	// ### alphanumericp
	private static final Primitive ALPHANUMERICP = new JavaPrimitive(LispSymbols.ALPHANUMERICP, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return ALPHANUMERICP_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject ALPHANUMERICP_execute(SubLObject arg) {
		return Character.isLetterOrDigit(arg.charValue()) ? T : NIL;
	}

	// ### name-char
	private static final Primitive NAME_CHAR = new JavaPrimitive(LispSymbols.NAME_CHAR, "name") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return NAME_CHAR_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject NAME_CHAR_execute(SubLObject arg) {
		String s = arg.STRING().getString();
		int n = nameToChar(s);
		return n >= 0 ? LispCharacter.makeChar((char) n) : NIL;
	}

	// ### char-name
	private static final Primitive CHAR_NAME = new JavaPrimitive(LispSymbols.CHAR_NAME, "character") {
		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_NAME_execute(arg);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_NAME_execute(SubLObject arg) {
		String name = charToName(arg.charValue());
		return name != null ? makeString(name) : NIL;
	}

	// ### char=
	private static final Primitive CHAR_EQUALS = new JavaPrimitive("char=", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_EQUALS_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_EQUALS_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_EQUALS_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_EQUALS_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_EQUALS_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUALS_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUALS_execute(SubLObject first, SubLObject second) {
		return first.charValue() == second.charValue() ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUALS_execute(SubLObject[] array) {
		final int length = array.length;
		final char c0 = array[0].charValue();
		for (int i = 1; i < length; i++) {
			if (c0 != array[i].charValue()) {
				return NIL;
			}
		}
		return T;
	}

	// ### char-equal
	private static final Primitive CHAR_EQUAL = new JavaPrimitive("char-equal", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_EQUAL_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_EQUAL_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_EQUAL_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_EQUAL_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_EQUAL_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUAL_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUAL_execute(SubLObject first, SubLObject second) {
		final char c1;
		final char c2;
		c1 = first.charValue();
		c2 = second.charValue();
		if (c1 == c2) {
			return T;
		}
		if (toUpperCase(c1) == toUpperCase(c2)) {
			return T;
		}
		if (toLowerCase(c1) == toLowerCase(c2)) {
			return T;
		}
		return NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_EQUAL_execute(SubLObject[] array) {
		final int length = array.length;
		final char c0 = array[0].charValue();
		for (int i = 1; i < length; i++) {
			char c = array[i].charValue();
			if (c0 == c) {
				continue;
			}
			if (toUpperCase(c0) == toUpperCase(c)) {
				continue;
			}
			if (toLowerCase(c0) == toLowerCase(c)) {
				continue;
			}
			return NIL;
		}
		return T;
	}

	// ### char-greaterp
	private static final Primitive CHAR_GREATERP = new JavaPrimitive("char-greaterp", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_GREATERP_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_GREATERP_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_GREATERP_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_GREATERP_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_GREATERP_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_GREATERP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_GREATERP_execute(SubLObject first, SubLObject second) {
		char c1 = toUpperCase(first.charValue());
		char c2 = toUpperCase(second.charValue());
		return c1 > c2 ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_GREATERP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = toUpperCase(array[i].charValue());
		}
		for (int i = 1; i < length; i++) {
			if (chars[i - 1] <= chars[i]) {
				return NIL;
			}
		}
		return T;
	}

	// ### char-not-greaterp
	private static final Primitive CHAR_NOT_GREATERP = new JavaPrimitive("char-not-greaterp", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_NOT_GREATERP_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_NOT_GREATERP_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_NOT_GREATERP_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_NOT_GREATERP_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_NOT_GREATERP_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_GREATERP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_GREATERP_execute(SubLObject first, SubLObject second) {
		char c1 = toUpperCase(first.charValue());
		char c2 = toUpperCase(second.charValue());
		return c1 <= c2 ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_GREATERP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = toUpperCase(array[i].charValue());
		}
		for (int i = 1; i < length; i++) {
			if (chars[i] < chars[i - 1]) {
				return NIL;
			}
		}
		return T;
	}

	// ### char<
	private static final Primitive CHAR_LESS_THAN = new JavaPrimitive("char<", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_LESS_THAN_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_LESS_THAN_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_LESS_THAN_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] args) {
			return CHAR_LESS_THAN_execute(args);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_LESS_THAN_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESS_THAN_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESS_THAN_execute(SubLObject first, SubLObject second) {
		return first.charValue() < second.charValue() ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESS_THAN_execute(SubLObject[] args) {
		final int length = args.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = args[i].charValue();
		}
		for (int i = 1; i < length; i++) {
			if (chars[i - 1] >= chars[i]) {
				return NIL;
			}
		}
		return T;
	}

	// ### char<=
	private static final Primitive CHAR_LE = new JavaPrimitive("char<=", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_LE_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_LE_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_LE_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return CHAR_LE_execute(first, second, third);
		}

		//@Override
		public SubLObject execute(SubLObject[] args) {
			return CHAR_LE_execute(args);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_LE_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_LE_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_LE_execute(SubLObject first, SubLObject second) {
		return first.charValue() <= second.charValue() ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_LE_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.charValue() > second.charValue()) {
			return NIL;
		}
		if (second.charValue() > third.charValue()) {
			return NIL;
		}
		return T;
	}

	@InlinableMethod
	static final public SubLObject CHAR_LE_execute(SubLObject[] args) {
		final int length = args.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = args[i].charValue();
		}
		for (int i = 1; i < length; i++) {
			if (chars[i - 1] > chars[i]) {
				return NIL;
			}
		}
		return T;
	}

	// ### char-lessp
	private static final Primitive CHAR_LESSP = new JavaPrimitive("char-lessp", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_LESSP_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_LESSP_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_LESSP_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_LESSP_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_LESSP_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESSP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESSP_execute(SubLObject first, SubLObject second) {
		char c1 = toUpperCase(first.charValue());
		char c2 = toUpperCase(second.charValue());
		return c1 < c2 ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_LESSP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = toUpperCase(array[i].charValue());
		}
		for (int i = 1; i < length; i++) {
			if (chars[i - 1] >= chars[i]) {
				return NIL;
			}
		}
		return T;
	}

	// ### char-not-lessp
	private static final Primitive CHAR_NOT_LESSP = new JavaPrimitive("char-not-lessp", "&rest characters") {
		//@Override
		public SubLObject execute() {
			return CHAR_NOT_LESSP_execute();
		}

		//@Override
		public SubLObject execute(SubLObject arg) {
			return CHAR_NOT_LESSP_execute(arg);
		}

		//@Override
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CHAR_NOT_LESSP_execute(first, second);
		}

		//@Override
		public SubLObject execute(SubLObject[] array) {
			return CHAR_NOT_LESSP_execute(array);
		}
	};

	@InlinableMethod
	static final public SubLObject CHAR_NOT_LESSP_execute() {
		return wrongNumberOfArguments();
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_LESSP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter) {
			return T;
		}
		return type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_LESSP_execute(SubLObject first, SubLObject second) {
		char c1 = toUpperCase(first.charValue());
		char c2 = toUpperCase(second.charValue());
		return c1 >= c2 ? T : NIL;
	}

	@InlinableMethod
	static final public SubLObject CHAR_NOT_LESSP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++) {
			chars[i] = toUpperCase(array[i].charValue());
		}
		for (int i = 1; i < length; i++) {
			if (chars[i] > chars[i - 1]) {
				return NIL;
			}
		}
		return T;
	}

	/**
	 *  Description of the Method
	 *
	 * @param  c  Description of Parameter
	 * @return    Description of the Returned Value
	 */
	public static final char toUpperCase(char c) {
		if (c < 128) {
			return UPPER_CASE_CHARS[c];
		}
		return Character.toUpperCase(c);
	}

	/**
	 *  Description of the Method
	 *
	 * @param  c  Description of Parameter
	 * @return    Description of the Returned Value
	 */
	public static final char toLowerCase(char c) {
		if (c < 128) {
			return LOWER_CASE_CHARS[c];
		}
		return Character.toLowerCase(c);
	}

	/**
	 *  Description of the Method
	 *
	 * @param  s  Description of Parameter
	 * @return    Description of the Returned Value
	 */
	public static final int nameToChar(String s) {
		String lower = s.toLowerCase();
		LispCharacter lc = namedToChar.get(lower);
		if (lc != null) {
			return lc.value;
		}
		if (lower.equals("null")) {
			return 0;
		}
		if (lower.equals("bell")) {
			return 7;
		}
		if (lower.equals("backspace")) {
			return '\b';
		}
		if (lower.equals("tab")) {
			return '\t';
		}
		if (lower.equals("linefeed")) {
			return '\n';
		}
		if (lower.equals("newline")) {
			return '\n';
		}
		if (lower.equals("page")) {
			return '\f';
		}
		if (lower.equals("return")) {
			return '\r';
		}
		if (lower.equals("escape")) {
			return 27;
		}
		if (lower.equals("space")) {
			return ' ';
		}
		if (lower.equals("rubout")) {
			return 127;
		}
		// Unknown.
		return -1;
	}

	/**
	 *  Description of the Method
	 *
	 * @param  c  Description of Parameter
	 * @return    Description of the Returned Value
	 */
	public static final String charToName(char c) {
		switch (c) {
		case 0:
			return "Null";
		case 7:
			return "Bell";
		case '\b':
			return "Backspace";
		case '\t':
			return "Tab";
		case '\n':
			return "Newline";
		case '\f':
			return "Page";
		case '\r':
			return "Return";
		case 27:
			return "Escape";
		case ' ':
			return "Space";
		case 127:
			return "Rubout";
		}
		if (c < 0 || c > 255) {
			return null;
		}
		return lispChars.get(c).name;
	}

	/**
	 *  Sets the charNames attribute of the CharacterFunctions class
	 *
	 * @param  i       The new charNames value
	 * @param  string  The new charNames value
	 */
	static void setCharNames(int i, String[] string) {
		int settingChar = i;
		int index = 0;
		int stringLen = string.length;
		while (stringLen-- > 0) {
			setCharName(settingChar, string[index]);
			index++;
			settingChar++;
		}
		if (maxNamedChar < settingChar) {
			maxNamedChar = settingChar;
		}
	}

	/**
	 *  Sets the charName attribute of the CharacterFunctions class
	 *
	 * @param  settingChar  The new charName value
	 * @param  string       The new charName value
	 */
	static void setCharName(int settingChar, String string) {
		LispCharacter c = lispChars.get((char) settingChar);
		c.name = string;
		namedToChar.put(string.toLowerCase(), c);
	}

	/**
	 *  Description of the Class
	 *
	 * @author    Administrator
	 */
	static class CharNameMaker0 {
		{
			setCharNames(0, new String[] { "Null", "Soh", "Stx", "Etx", "Eot", "Enq", "Ack", "Bell", "Backspace", "Tab",
					"Newline", "Vt", "Page", "Return", "So", "Si", "Dle", "Dc1", "Dc2", "Dc3", "Dc4", "Nak", "Syn", "Etb", "Can",
					"Em", "Sub", "Escape", "Fs", "Gs", "Rs", "Us" });
			//setCharNames(32,new String[]{"Space"});
			setCharNames(128, new String[] { "U0080", "U0081", "U0082", "U0083", "U0084", "U0085", "U0086", "U0087", "U0088",
					"U0089", "U008a", "U008b", "U008c", "U008d", "U008e", "U008f", "U0090", "U0091", "U0092", "U0093", "U0094",
					"U0095", "U0096", "U0097", "U0098", "U0099", "U009a", "U009b", "U009c", "U009d", "U009e", "U009f" });
		}
	}

	static {
		lispChars = new CharHashMap<LispCharacter>(LispCharacter.class, null) {
			public LispCharacter get(char c) {
				LispCharacter lc = super.get(c);
				if (lc == null) {
					lc = new LispCharacter(c);
					put(c, lc);
				}
				return lc;
			}
		};
		constants = lispChars.constants;
		for (int i = constants.length; i-- > 0;) {
			constants[i] = new LispCharacter((char) i);
		}
	}

	static {
		for (int i = UPPER_CASE_CHARS.length; i-- > 0;) {
			UPPER_CASE_CHARS[i] = Character.toUpperCase((char) i);
		}
	}

	static {
		for (int i = LOWER_CASE_CHARS.length; i-- > 0;) {
			LOWER_CASE_CHARS[i] = Character.toLowerCase((char) i);
		}
	}

	static {
		new CharNameMaker0();
	}
	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(CharacterFunctions.class);
	}
}
