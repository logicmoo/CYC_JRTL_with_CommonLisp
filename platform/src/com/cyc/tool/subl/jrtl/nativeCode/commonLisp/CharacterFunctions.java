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

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.InlinedPrimitiveRegistry.InlinableMethod;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/**
 * Description of the Class
 *
 * @author Administrator
 */
public class CharacterFunctions {
	/**
	 * Description of the Class
	 *
	 * @author Administrator
	 */
	static class CharNameMaker0 {
		{
			CharacterFunctions.setCharNames(0,
					new String[] { "Null", "Soh", "Stx", "Etx", "Eot", "Enq", "Ack", "Bell", "Backspace", "Tab",
							"Newline", "Vt", "Page", "Return", "So", "Si", "Dle", "Dc1", "Dc2", "Dc3", "Dc4", "Nak",
							"Syn", "Etb", "Can", "Em", "Sub", "Escape", "Fs", "Gs", "Rs", "Us" });
			// setCharNames(32,new String[]{"Space"});
			CharacterFunctions.setCharNames(128,
					new String[] { "U0080", "U0081", "U0082", "U0083", "U0084", "U0085", "U0086", "U0087", "U0088",
							"U0089", "U008a", "U008b", "U008c", "U008d", "U008e", "U008f", "U0090", "U0091", "U0092",
							"U0093", "U0094", "U0095", "U0096", "U0097", "U0098", "U0099", "U009a", "U009b", "U009c",
							"U009d", "U009e", "U009f" });
		}
	}

	/** Description of the Field */
	public static LispCharacter[] constants;

	/** Description of the Field */
	public static CharHashMap<LispCharacter> lispChars;
	static char[] UPPER_CASE_CHARS = new char[128];

	static char[] LOWER_CASE_CHARS = new char[128];
	static int maxNamedChar = 0;

	static Map<String, LispCharacter> namedToChar = new HashMap<String, LispCharacter>();

	// ### character
	private static Primitive CHARACTER = new JavaPrimitive(LispSymbols.CHARACTER, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHARACTER_execute(arg);
		}
	};

	// ### whitespacep
	private static Primitive WHITESPACEP = new JavaPrimitive("whitespacep", Lisp.PACKAGE_SYS, true) {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.WHITESPACEP_execute(arg);
		}
	};

	// ### char-code
	private static Primitive CHAR_CODE = new JavaPrimitive(LispSymbols.CHAR_CODE, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_CODE_execute(arg);
		}
	};

	// ### char-int
	private static Primitive CHAR_INT = new JavaPrimitive(LispSymbols.CHAR_INT, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_INT_execute(arg);
		}
	};

	// ### code-char
	private static Primitive CODE_CHAR = new JavaPrimitive(LispSymbols.CODE_CHAR, "code") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CODE_CHAR_execute(arg);
		}
	};

	// ### characterp
	private static Primitive CHARACTERP = new JavaPrimitive(LispSymbols.CHARACTERP, "object") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHARACTERP_execute(arg);
		}
	};

	// ### both-case-p
	private static Primitive BOTH_CASE_P = new JavaPrimitive(LispSymbols.BOTH_CASE_P, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.BOTH_CASE_P_execute(arg);
		}
	};

	// ### lower-case-p
	private static Primitive LOWER_CASE_P = new JavaPrimitive(LispSymbols.LOWER_CASE_P, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.LOWER_CASE_P_execute(arg);
		}
	};

	// ### upper-case-p
	private static Primitive UPPER_CASE_P = new JavaPrimitive(LispSymbols.UPPER_CASE_P, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.UPPER_CASE_P_execute(arg);
		}
	};

	// ### char-downcase
	private static Primitive CHAR_DOWNCASE = new JavaPrimitive(LispSymbols.CHAR_DOWNCASE, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_DOWNCASE_execute(arg);
		}
	};

	// ### char-upcase
	private static Primitive CHAR_UPCASE = new JavaPrimitive(LispSymbols.CHAR_UPCASE, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_UPCASE_execute(arg);
		}
	};

	// ### digit-char
	private static Primitive DIGIT_CHAR = new JavaPrimitive(LispSymbols.DIGIT_CHAR, "weight &optional radix") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.DIGIT_CHAR_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.DIGIT_CHAR_execute(first, second);
		}
	};

	// ### digit-char-p char &optional radix => weight
	private static Primitive DIGIT_CHAR_P = new JavaPrimitive(LispSymbols.DIGIT_CHAR_P, "char &optional radix") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.DIGIT_CHAR_P_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.DIGIT_CHAR_P_execute(first, second);
		}
	};

	// ### standard-char-p
	private static Primitive STANDARD_CHAR_P = new JavaPrimitive(LispSymbols.STANDARD_CHAR_P, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.STANDARD_CHAR_P_execute(arg);
		}
	};

	// ### graphic-char-p
	private static Primitive GRAPHIC_CHAR_P = new JavaPrimitive(LispSymbols.GRAPHIC_CHAR_P, "char") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.GRAPHIC_CHAR_P_execute(arg);
		}
	};

	// ### alpha-char-p
	private static Primitive ALPHA_CHAR_P = new JavaPrimitive(LispSymbols.ALPHA_CHAR_P, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.ALPHA_CHAR_P_execute(arg);
		}
	};

	// ### alphanumericp
	private static Primitive ALPHANUMERICP = new JavaPrimitive(LispSymbols.ALPHANUMERICP, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.ALPHANUMERICP_execute(arg);
		}
	};

	// ### name-char
	private static Primitive NAME_CHAR = new JavaPrimitive(LispSymbols.NAME_CHAR, "name") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.NAME_CHAR_execute(arg);
		}
	};

	// ### char-name
	private static Primitive CHAR_NAME = new JavaPrimitive(LispSymbols.CHAR_NAME, "character") {
		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_NAME_execute(arg);
		}
	};

	// ### char=
	private static Primitive CHAR_EQUALS = new JavaPrimitive("char=", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_EQUALS_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_EQUALS_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_EQUALS_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_EQUALS_execute(array);
		}
	};

	// ### char-equal
	private static Primitive CHAR_EQUAL = new JavaPrimitive("char-equal", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_EQUAL_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_EQUAL_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_EQUAL_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_EQUAL_execute(array);
		}
	};

	// ### char-greaterp
	private static Primitive CHAR_GREATERP = new JavaPrimitive("char-greaterp", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_GREATERP_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_GREATERP_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_GREATERP_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_GREATERP_execute(array);
		}
	};

	// ### char-not-greaterp
	private static Primitive CHAR_NOT_GREATERP = new JavaPrimitive("char-not-greaterp", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_NOT_GREATERP_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_NOT_GREATERP_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_NOT_GREATERP_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_NOT_GREATERP_execute(array);
		}
	};

	// ### char<
	private static Primitive CHAR_LESS_THAN = new JavaPrimitive("char<", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_LESS_THAN_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_LESS_THAN_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_LESS_THAN_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] args) {
			return CharacterFunctions.CHAR_LESS_THAN_execute(args);
		}
	};

	// ### char<=
	private static Primitive CHAR_LE = new JavaPrimitive("char<=", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_LE_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_LE_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_LE_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
			return CharacterFunctions.CHAR_LE_execute(first, second, third);
		}

		//
		public SubLObject execute(SubLObject[] args) {
			return CharacterFunctions.CHAR_LE_execute(args);
		}
	};

	// ### char-lessp
	private static Primitive CHAR_LESSP = new JavaPrimitive("char-lessp", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_LESSP_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_LESSP_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_LESSP_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_LESSP_execute(array);
		}
	};

	// ### char-not-lessp
	private static Primitive CHAR_NOT_LESSP = new JavaPrimitive("char-not-lessp", "&rest characters") {
		//
		public SubLObject execute() {
			return CharacterFunctions.CHAR_NOT_LESSP_execute();
		}

		//
		public SubLObject execute(SubLObject arg) {
			return CharacterFunctions.CHAR_NOT_LESSP_execute(arg);
		}

		//
		public SubLObject execute(SubLObject first, SubLObject second) {
			return CharacterFunctions.CHAR_NOT_LESSP_execute(first, second);
		}

		//
		public SubLObject execute(SubLObject[] array) {
			return CharacterFunctions.CHAR_NOT_LESSP_execute(array);
		}
	};

	static {
		CharacterFunctions.lispChars = new CharHashMap<LispCharacter>(LispCharacter.class, null) {
			public LispCharacter get(char c) {
				LispCharacter lc = super.get(c);
				if (lc == null) {
					lc = new LispCharacter(c);
					this.put(c, lc);
				}
				return lc;
			}
		};
		CharacterFunctions.constants = CharacterFunctions.lispChars.constants;
		for (int i = CharacterFunctions.constants.length; i-- > 0;)
			CharacterFunctions.constants[i] = new LispCharacter((char) i);
	}

	static {
		for (int i = CharacterFunctions.UPPER_CASE_CHARS.length; i-- > 0;)
			CharacterFunctions.UPPER_CASE_CHARS[i] = Character.toUpperCase((char) i);
	}

	static {
		for (int i = CharacterFunctions.LOWER_CASE_CHARS.length; i-- > 0;)
			CharacterFunctions.LOWER_CASE_CHARS[i] = Character.toLowerCase((char) i);
	}

	static {
		new CharNameMaker0();
	}

	static {
		InlinedPrimitiveRegistry.inlineStaticsNow(CharacterFunctions.class);
	}

	@InlinableMethod
	static public SubLObject ALPHA_CHAR_P_execute(SubLObject arg) {
		return Character.isLetter(arg.charValue()) ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject ALPHANUMERICP_execute(SubLObject arg) {
		return Character.isLetterOrDigit(arg.charValue()) ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject BOTH_CASE_P_execute(SubLObject arg) {
		char c = arg.charValue();
		if (Character.isLowerCase(c) || Character.isUpperCase(c))
			return Lisp.T;
		return Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_CODE_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.charValue());
	}

	@InlinableMethod
	static public SubLObject CHAR_DOWNCASE_execute(SubLObject arg) {
		final char c = arg.charValue();
		if (c < 128)
			return CharacterFunctions.constants[CharacterFunctions.LOWER_CASE_CHARS[c]];
		return LispCharacter.makeChar(CharacterFunctions.toLowerCase(c));
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUAL_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUAL_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUAL_execute(SubLObject first, SubLObject second) {
		final char c1;
		final char c2;
		c1 = first.charValue();
		c2 = second.charValue();
		if (c1 == c2)
			return Lisp.T;
		if (CharacterFunctions.toUpperCase(c1) == CharacterFunctions.toUpperCase(c2))
			return Lisp.T;
		if (CharacterFunctions.toLowerCase(c1) == CharacterFunctions.toLowerCase(c2))
			return Lisp.T;
		return Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUAL_execute(SubLObject[] array) {
		final int length = array.length;
		final char c0 = array[0].charValue();
		for (int i = 1; i < length; i++) {
			char c = array[i].charValue();
			if (c0 == c)
				continue;
			if (CharacterFunctions.toUpperCase(c0) == CharacterFunctions.toUpperCase(c))
				continue;
			if (CharacterFunctions.toLowerCase(c0) == CharacterFunctions.toLowerCase(c))
				continue;
			return Lisp.NIL;
		}
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUALS_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUALS_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUALS_execute(SubLObject first, SubLObject second) {
		return first.charValue() == second.charValue() ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_EQUALS_execute(SubLObject[] array) {
		final int length = array.length;
		final char c0 = array[0].charValue();
		for (int i = 1; i < length; i++)
			if (c0 != array[i].charValue())
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_GREATERP_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_GREATERP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_GREATERP_execute(SubLObject first, SubLObject second) {
		char c1 = CharacterFunctions.toUpperCase(first.charValue());
		char c2 = CharacterFunctions.toUpperCase(second.charValue());
		return c1 > c2 ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_GREATERP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = CharacterFunctions.toUpperCase(array[i].charValue());
		for (int i = 1; i < length; i++)
			if (chars[i - 1] <= chars[i])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_INT_execute(SubLObject arg) {
		return LispObjectFactory.makeInteger(arg.charValue());
	}

	@InlinableMethod
	static public SubLObject CHAR_LE_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_LE_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_LE_execute(SubLObject first, SubLObject second) {
		return first.charValue() <= second.charValue() ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_LE_execute(SubLObject first, SubLObject second, SubLObject third) {
		if (first.charValue() > second.charValue())
			return Lisp.NIL;
		if (second.charValue() > third.charValue())
			return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_LE_execute(SubLObject[] args) {
		final int length = args.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = args[i].charValue();
		for (int i = 1; i < length; i++)
			if (chars[i - 1] > chars[i])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_LESS_THAN_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_LESS_THAN_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_LESS_THAN_execute(SubLObject first, SubLObject second) {
		return first.charValue() < second.charValue() ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_LESS_THAN_execute(SubLObject[] args) {
		final int length = args.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = args[i].charValue();
		for (int i = 1; i < length; i++)
			if (chars[i - 1] >= chars[i])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_LESSP_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_LESSP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_LESSP_execute(SubLObject first, SubLObject second) {
		char c1 = CharacterFunctions.toUpperCase(first.charValue());
		char c2 = CharacterFunctions.toUpperCase(second.charValue());
		return c1 < c2 ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_LESSP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = CharacterFunctions.toUpperCase(array[i].charValue());
		for (int i = 1; i < length; i++)
			if (chars[i - 1] >= chars[i])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_NAME_execute(SubLObject arg) {
		String name = CharacterFunctions.charToName(arg.charValue());
		return name != null ? LispObjectFactory.makeString(name) : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_GREATERP_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_GREATERP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_GREATERP_execute(SubLObject first, SubLObject second) {
		char c1 = CharacterFunctions.toUpperCase(first.charValue());
		char c2 = CharacterFunctions.toUpperCase(second.charValue());
		return c1 <= c2 ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_GREATERP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = CharacterFunctions.toUpperCase(array[i].charValue());
		for (int i = 1; i < length; i++)
			if (chars[i] < chars[i - 1])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_LESSP_execute() {
		return InlinedPrimitiveRegistry.wrongNumberOfArguments();
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_LESSP_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return Lisp.T;
		return Lisp.type_error(arg, LispSymbols.CHARACTER);
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_LESSP_execute(SubLObject first, SubLObject second) {
		char c1 = CharacterFunctions.toUpperCase(first.charValue());
		char c2 = CharacterFunctions.toUpperCase(second.charValue());
		return c1 >= c2 ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject CHAR_NOT_LESSP_execute(SubLObject[] array) {
		final int length = array.length;
		char[] chars = new char[length];
		for (int i = 0; i < length; i++)
			chars[i] = CharacterFunctions.toUpperCase(array[i].charValue());
		for (int i = 1; i < length; i++)
			if (chars[i] > chars[i - 1])
				return Lisp.NIL;
		return Lisp.T;
	}

	@InlinableMethod
	static public SubLObject CHAR_UPCASE_execute(SubLObject arg) {
		final char c;
		c = arg.charValue();
		if (c < 128)
			return CharacterFunctions.constants[CharacterFunctions.UPPER_CASE_CHARS[c]];
		return LispCharacter.makeChar(CharacterFunctions.toUpperCase(c));
	}

	@InlinableMethod
	static public SubLObject CHARACTER_execute(SubLObject arg) {
		if (arg instanceof LispCharacter)
			return arg;
		if (arg instanceof SubLString) {
			if (arg.cl_length() == 1)
				return ((SubLString) arg).AREF(0);
		} else if (arg instanceof SubLSymbol) {
			String name = ((SubLSymbol) arg).getJavaSymbolName();
			if (name.length() == 1)
				return LispCharacter.makeChar(name.charAt(0));
		}
		return Lisp.type_error(arg, LispSymbols.CHARACTER_DESIGNATOR);
	}

	@InlinableMethod
	static public SubLObject CHARACTERP_execute(SubLObject arg) {
		return arg instanceof LispCharacter ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param c
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	public static String charToName(char c) {
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
		if (c < 0 || c > 255)
			return null;
		return CharacterFunctions.lispChars.get(c).name;
	}

	@InlinableMethod
	static public SubLObject CODE_CHAR_execute(SubLObject arg) {
		int n = arg.intValue();
		if (n < Lisp.CHAR_MAX)
			return CharacterFunctions.lispChars.get((char) n);
		else if (n <= Character.MAX_VALUE)
			return new LispCharacter((char) n);
		// SBCL signals a type-error here: "not of type (UNSIGNED-BYTE 8)"
		return Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject DIGIT_CHAR_execute(SubLObject arg) {
		if (arg instanceof Bignum)
			return Lisp.NIL;

		int weight = arg.intValue();
		if (weight < 10)
			return CharacterFunctions.constants['0' + weight];
		return Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject DIGIT_CHAR_execute(SubLObject first, SubLObject second) {
		int radix;
		if (second instanceof Fixnum)
			radix = ((Fixnum) second).value;
		else
			radix = -1;

		if (radix < 2 || radix > 36)
			return Lisp.type_error(second, Lisp.list(LispSymbols.INTEGER, Fixnum.TWO, Fixnum.constants[36]));
		if (first instanceof Bignum)
			return Lisp.NIL;
		int weight = first.intValue();
		if (weight >= radix)
			return Lisp.NIL;
		if (weight < 10)
			return CharacterFunctions.constants['0' + weight];
		return CharacterFunctions.constants['A' + weight - 10];
	}

	@InlinableMethod
	static public SubLObject DIGIT_CHAR_P_execute(SubLObject arg) {
		final int n = Character.digit(arg.charValue(), 10);
		return n < 0 ? Lisp.NIL : LispObjectFactory.makeInteger(n);
	}

	@InlinableMethod
	static public SubLObject DIGIT_CHAR_P_execute(SubLObject first, SubLObject second) {
		char c;
		c = first.charValue();
		if (second instanceof Fixnum) {
			int radix = ((Fixnum) second).value;
			if (radix >= 2 && radix <= 36) {
				int n = Character.digit(c, radix);
				return n < 0 ? Lisp.NIL : Fixnum.constants[n];
			}
		}
		return Lisp.type_error(second, Lisp.list(LispSymbols.INTEGER, Fixnum.TWO, Fixnum.constants[36]));
	}

	@InlinableMethod
	static public SubLObject GRAPHIC_CHAR_P_execute(SubLObject arg) {
		char c = arg.charValue();
		if (c >= ' ' && c < 127)
			return Lisp.T;
		return Character.isISOControl(c) ? Lisp.NIL : Lisp.T;
	}

	@InlinableMethod
	static public SubLObject LOWER_CASE_P_execute(SubLObject arg) {
		return Character.isLowerCase(arg.charValue()) ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject NAME_CHAR_execute(SubLObject arg) {
		String s = arg.STRING().getString();
		int n = CharacterFunctions.nameToChar(s);
		return n >= 0 ? LispCharacter.makeChar((char) n) : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param s
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	public static int nameToChar(String s) {
		String lower = s.toLowerCase();
		LispCharacter lc = CharacterFunctions.namedToChar.get(lower);
		if (lc != null)
			return lc.value;
		if (lower.equals("null"))
			return 0;
		if (lower.equals("bell"))
			return 7;
		if (lower.equals("backspace"))
			return '\b';
		if (lower.equals("tab"))
			return '\t';
		if (lower.equals("linefeed"))
			return '\n';
		if (lower.equals("newline"))
			return '\n';
		if (lower.equals("page"))
			return '\f';
		if (lower.equals("return"))
			return '\r';
		if (lower.equals("escape"))
			return 27;
		if (lower.equals("space"))
			return ' ';
		if (lower.equals("rubout"))
			return 127;
		// Unknown.
		return -1;
	}

	/**
	 * Sets the charName attribute of the CharacterFunctions class
	 *
	 * @param settingChar
	 *            The new charName value
	 * @param string
	 *            The new charName value
	 */
	static void setCharName(int settingChar, String string) {
		LispCharacter c = CharacterFunctions.lispChars.get((char) settingChar);
		c.name = string;
		CharacterFunctions.namedToChar.put(string.toLowerCase(), c);
	}

	/**
	 * Sets the charNames attribute of the CharacterFunctions class
	 *
	 * @param i
	 *            The new charNames value
	 * @param string
	 *            The new charNames value
	 */
	static void setCharNames(int i, String[] string) {
		int settingChar = i;
		int index = 0;
		int stringLen = string.length;
		while (stringLen-- > 0) {
			CharacterFunctions.setCharName(settingChar, string[index]);
			index++;
			settingChar++;
		}
		if (CharacterFunctions.maxNamedChar < settingChar)
			CharacterFunctions.maxNamedChar = settingChar;
	}

	@InlinableMethod
	static public SubLObject STANDARD_CHAR_P_execute(SubLObject arg) {
		return Lisp.checkCharacter(arg).isStandardChar() ? Lisp.T : Lisp.NIL;
	}

	/**
	 * Description of the Method
	 *
	 * @param c
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	public static char toLowerCase(char c) {
		if (c < 128)
			return CharacterFunctions.LOWER_CASE_CHARS[c];
		return Character.toLowerCase(c);
	}

	/**
	 * Description of the Method
	 *
	 * @param c
	 *            Description of Parameter
	 * @return Description of the Returned Value
	 */
	public static char toUpperCase(char c) {
		if (c < 128)
			return CharacterFunctions.UPPER_CASE_CHARS[c];
		return Character.toUpperCase(c);
	}

	@InlinableMethod
	static public SubLObject UPPER_CASE_P_execute(SubLObject arg) {
		return Character.isUpperCase(arg.charValue()) ? Lisp.T : Lisp.NIL;
	}

	@InlinableMethod
	static public SubLObject WHITESPACEP_execute(SubLObject arg) {
		return Character.isWhitespace(arg.charValue()) ? Lisp.T : Lisp.NIL;
	}
}
