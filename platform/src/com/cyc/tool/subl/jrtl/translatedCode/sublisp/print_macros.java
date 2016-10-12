/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class print_macros extends SubLTranslatedFile {
	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros";

	private static SubLList $list0;

	private static SubLList $list1;

	private static SubLSymbol $kw2$ALLOW_OTHER_KEYS;

	private static SubLSymbol $kw3$TYPE;

	private static SubLSymbol $kw4$IDENTITY;

	private static SubLString $str5$OBJECT;
	private static SubLSymbol $sym6$CLET;
	private static SubLString $str7$STREAM;
	private static SubLSymbol $sym8$PIF;
	private static SubLSymbol $sym9$_PRINT_READABLY_;
	private static SubLSymbol $sym10$PRINT_NOT_READABLE;
	private static SubLSymbol $sym11$PROGN;
	private static SubLSymbol $sym12$PRINT_UNREADABLE_OBJECT_PREAMBLE;
	private static SubLSymbol $sym13$PRINT_UNREADABLE_OBJECT_POSTAMBLE;
	private static SubLString $str14$__;
	private static SubLSymbol $kw15$STREAM;
	private static SubLSymbol $kw16$BASE;
	static {
		print_macros.me = new print_macros();
		print_macros.$list0 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"), SubLObjectFactory.makeSymbol("STREAM"),
						SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TYPE"),
						CommonSymbols.IDENTITY),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		print_macros.$list1 = ConsesLow.list(SubLObjectFactory.makeKeyword("TYPE"),
				SubLObjectFactory.makeKeyword("IDENTITY"));
		print_macros.$kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		print_macros.$kw3$TYPE = SubLObjectFactory.makeKeyword("TYPE");
		print_macros.$kw4$IDENTITY = SubLObjectFactory.makeKeyword("IDENTITY");
		print_macros.$str5$OBJECT = SubLObjectFactory.makeString("OBJECT");
		print_macros.$sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
		print_macros.$str7$STREAM = SubLObjectFactory.makeString("STREAM");
		print_macros.$sym8$PIF = SubLObjectFactory.makeSymbol("PIF");
		print_macros.$sym9$_PRINT_READABLY_ = SubLObjectFactory.makeSymbol("*PRINT-READABLY*");
		print_macros.$sym10$PRINT_NOT_READABLE = SubLObjectFactory.makeSymbol("PRINT-NOT-READABLE");
		print_macros.$sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		print_macros.$sym12$PRINT_UNREADABLE_OBJECT_PREAMBLE = SubLObjectFactory
				.makeSymbol("PRINT-UNREADABLE-OBJECT-PREAMBLE");
		print_macros.$sym13$PRINT_UNREADABLE_OBJECT_POSTAMBLE = SubLObjectFactory
				.makeSymbol("PRINT-UNREADABLE-OBJECT-POSTAMBLE");
		print_macros.$str14$__ = SubLObjectFactory.makeString("#<");
		print_macros.$kw15$STREAM = SubLObjectFactory.makeKeyword("STREAM");
		print_macros.$kw16$BASE = SubLObjectFactory.makeKeyword("BASE");
	}

	public static SubLObject declare_print_macros_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros", "print_unreadable_object",
				"PRINT-UNREADABLE-OBJECT");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros",
				"print_unreadable_object_internal", "PRINT-UNREADABLE-OBJECT-INTERNAL", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros",
				"print_unreadable_object_preamble", "PRINT-UNREADABLE-OBJECT-PREAMBLE", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros",
				"print_unreadable_object_postamble", "PRINT-UNREADABLE-OBJECT-POSTAMBLE", 4, 0, false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_print_macros_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/print-macros.lisp", position = 674L)
	public static SubLObject print_unreadable_object(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_macros.$list0);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject object = CommonSymbols.NIL;
		SubLObject stream = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_macros.$list0);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, print_macros.$list0);
		stream = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = CommonSymbols.NIL;
		SubLObject rest = current;
		SubLObject bad = CommonSymbols.NIL;
		SubLObject current_$1 = CommonSymbols.NIL;
		while (CommonSymbols.NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_macros.$list0);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, print_macros.$list0);
			if (CommonSymbols.NIL == conses_high.member(current_$1, print_macros.$list1, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				bad = CommonSymbols.T;
			if (current_$1 == print_macros.$kw2$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(datum, print_macros.$list0);
		SubLObject type_tail = cdestructuring_bind.property_list_member(print_macros.$kw3$TYPE, current);
		SubLObject type = CommonSymbols.NIL != type_tail ? conses_high.cadr(type_tail) : CommonSymbols.NIL;
		SubLObject identity_tail = cdestructuring_bind.property_list_member(print_macros.$kw4$IDENTITY, current);
		SubLObject identity = CommonSymbols.NIL != identity_tail ? conses_high.cadr(identity_tail) : CommonSymbols.NIL;
		SubLObject body;
		current = body = temp;
		return print_macros.print_unreadable_object_internal(object, stream, type, identity, body);
	}

	@SubL(source = "sublisp/print-macros.lisp", position = 1519L)
	public static SubLObject print_unreadable_object_internal(SubLObject object, SubLObject stream, SubLObject type,
			SubLObject identity, SubLObject body) {
		if (!object.isAtom()) {
			SubLObject object_var = Symbols.make_symbol(print_macros.$str5$OBJECT);
			return ConsesLow.list(print_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(object_var, object)),
					print_macros.print_unreadable_object_internal(object_var, stream, type, identity, body));
		}
		if (!stream.isAtom()) {
			SubLObject stream_var = Symbols.make_symbol(print_macros.$str7$STREAM);
			return ConsesLow.list(print_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(stream_var, stream)),
					print_macros.print_unreadable_object_internal(object, stream_var, type, identity, body));
		}
		SubLObject preamble_spaceP = SubLObjectFactory
				.makeBoolean(CommonSymbols.NIL != type && CommonSymbols.NIL != body);
		SubLObject postamble_spaceP = SubLObjectFactory
				.makeBoolean(CommonSymbols.NIL != identity && (CommonSymbols.NIL != type || CommonSymbols.NIL != body));
		return ConsesLow.list(print_macros.$sym8$PIF, print_macros.$sym9$_PRINT_READABLY_,
				ConsesLow.list(print_macros.$sym10$PRINT_NOT_READABLE, object, stream),
				ConsesLow.listS(print_macros.$sym11$PROGN,
						ConsesLow.list(print_macros.$sym12$PRINT_UNREADABLE_OBJECT_PREAMBLE, stream, object, type,
								preamble_spaceP),
						ConsesLow.append(body,
								ConsesLow.list(ConsesLow.list(print_macros.$sym13$PRINT_UNREADABLE_OBJECT_POSTAMBLE,
										stream, object, postamble_spaceP, identity)))));
	}

	@SubL(source = "sublisp/print-macros.lisp", position = 3000L)
	public static SubLObject print_unreadable_object_postamble(SubLObject stream, SubLObject object, SubLObject spaceP,
			SubLObject identityP) {
		if (CommonSymbols.NIL != identityP) {
			if (CommonSymbols.NIL != spaceP)
				streams_high.write_char(Characters.CHAR_space, stream);
			PrintLow.write(Equality.pointer(object), new SubLObject[] { print_macros.$kw15$STREAM, stream,
					print_macros.$kw16$BASE, CommonSymbols.SIXTEEN_INTEGER });
		}
		streams_high.write_char(Characters.CHAR_greater, stream);
		return object;
	}

	@SubL(source = "sublisp/print-macros.lisp", position = 2697L)
	public static SubLObject print_unreadable_object_preamble(SubLObject stream, SubLObject object, SubLObject typeP,
			SubLObject spaceP) {
		streams_high.write_string(print_macros.$str14$__, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != typeP) {
			PrintLow.write(Types.type_of(object), new SubLObject[] { print_macros.$kw15$STREAM, stream });
			if (CommonSymbols.NIL != spaceP)
				streams_high.write_char(Characters.CHAR_space, stream);
		}
		return object;
	}

	public static SubLObject setup_print_macros_file() {
		// CVS_ID("Id: print-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	public void declareFunctions() {
		print_macros.declare_print_macros_file();
	}

	public void initializeVariables() {
		print_macros.init_print_macros_file();
	}

	public void runTopLevelForms() {
		print_macros.setup_print_macros_file();
	}
}
