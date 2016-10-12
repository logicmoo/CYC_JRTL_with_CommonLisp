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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class foreign extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new foreign();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign";
	@SubL(source = "sublisp/foreign.lisp", position = 783)
	public static SubLSymbol $foreign_shared_library_lock$ = null;

	//// Definitions

	@SubL(source = "sublisp/foreign.lisp", position = 918)
	public static SubLSymbol $char_pointer_idiom_declaration$ = null;

	@SubL(source = "sublisp/foreign.lisp", position = 993)
	public static SubLSymbol $pointer_idiom_declaration$ = null;

	@SubL(source = "sublisp/foreign.lisp", position = 1052)
	public static SubLSymbol $char_pointer_idiom_allegro$ = null;

	/** This is the list of foreign shared libraries that SL knows about. */
	@SubL(source = "sublisp/foreign.lisp", position = 1112)
	public static SubLSymbol $foreign_shared_libraries$ = null;

	@SubL(source = "sublisp/foreign.lisp", position = 4601)
	public static SubLSymbol $active_foreign_shared_library_lock$ = null;

	/**
	 * This is the list of monikers foreign shared libraries that SL maintains
	 * itself (beyond the ones that the system has itself and that are currently
	 * loaded.
	 */
	@SubL(source = "sublisp/foreign.lisp", position = 4779)
	public static SubLSymbol $active_foreign_shared_libraries$ = null;

	public static SubLString $str0$Foreign_Shared_Libraries_Lock = SubLObjectFactory
			.makeString("Foreign Shared Libraries Lock");

	public static SubLList $list1 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeKeyword("POINTER"), SubLObjectFactory.makeKeyword("CHAR")),
			SubLObjectFactory.makeKeyword("STRING"));

	public static SubLList $list2 = ConsesLow.list(SubLObjectFactory.makeKeyword("OPAQUE"),
			SubLObjectFactory.makeKeyword("ALIEN"));

	public static SubLList $list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("INT32"),
			SubLObjectFactory.makeKeyword("FIXNUM"));

	public static SubLSymbol $kw4$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");

	public static SubLString $str5$Foreign_shared_library_must_have_ = SubLObjectFactory
			.makeString("Foreign shared library must have :FILENAME property.");

	public static SubLSymbol $kw6$DEPENDS_ON = SubLObjectFactory.makeKeyword("DEPENDS-ON");

	public static SubLString $str7$_A_does_not_reference_a_known_for = SubLObjectFactory
			.makeString("~A does not reference a known foreign shared library.");

	public static SubLString $str8$Active_Foreign_Shared_Libraries = SubLObjectFactory
			.makeString("Active Foreign Shared Libraries");

	public static SubLString $str9$_S_is_not_associated_with_any_for = SubLObjectFactory
			.makeString("~S is not associated with any foreign shared library.");

	public static SubLString $str10$Shared_library__S___S__is_already = SubLObjectFactory
			.makeString("Shared library ~S (~S) is already loaded.");

	public static SubLString $str11$_S_does_not_designate_one_of_the_ = SubLObjectFactory
			.makeString("~S does not designate one of the libraries (~S) currently loaded.");

	public static SubLString $str12$_S_does_not_designate_a_known_sha = SubLObjectFactory
			.makeString("~S does not designate a known shared library.");

	public static SubLString $str13$_ = SubLObjectFactory.makeString("%");

	public static SubLList $list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("SYMBOL"),
			SubLObjectFactory.makeSymbol("ARGLIST"), SubLObjectFactory.makeSymbol("RULES"));

	public static SubLSymbol $sym15$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");

	public static SubLSymbol $sym16$LISTP = SubLObjectFactory.makeSymbol("LISTP");

	public static SubLList $list17 = ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("CALLING-CONVENTION"), SubLObjectFactory.makeKeyword("C")),
			SubLObjectFactory.makeSymbol("FOREIGN-SHARED-LIBRARY"), SubLObjectFactory.makeSymbol("FOREIGN-NAME"),
			SubLObjectFactory.makeSymbol("ARG-CONVERSION"),
			ConsesLow.list(SubLObjectFactory.makeSymbol("RETURN-TYPE"), SubLObjectFactory.makeKeyword("VOID")));

	public static SubLList $list18 = ConsesLow.list(SubLObjectFactory.makeKeyword("CALLING-CONVENTION"),
			SubLObjectFactory.makeKeyword("FOREIGN-SHARED-LIBRARY"), SubLObjectFactory.makeKeyword("FOREIGN-NAME"),
			SubLObjectFactory.makeKeyword("ARG-CONVERSION"), SubLObjectFactory.makeKeyword("RETURN-TYPE"));

	public static SubLSymbol $kw19$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");

	public static SubLSymbol $kw20$CALLING_CONVENTION = SubLObjectFactory.makeKeyword("CALLING-CONVENTION");

	public static SubLSymbol $kw21$C = SubLObjectFactory.makeKeyword("C");

	public static SubLSymbol $kw22$FOREIGN_SHARED_LIBRARY = SubLObjectFactory.makeKeyword("FOREIGN-SHARED-LIBRARY");

	public static SubLSymbol $kw23$FOREIGN_NAME = SubLObjectFactory.makeKeyword("FOREIGN-NAME");

	public static SubLSymbol $kw24$ARG_CONVERSION = SubLObjectFactory.makeKeyword("ARG-CONVERSION");

	public static SubLSymbol $kw25$RETURN_TYPE = SubLObjectFactory.makeKeyword("RETURN-TYPE");

	public static SubLSymbol $kw26$VOID = SubLObjectFactory.makeKeyword("VOID");

	public static SubLString $str27$Currently__only_calling_conventio = SubLObjectFactory
			.makeString("Currently, only calling-convention :C is supported.");

	public static SubLString $str28$_FOREIGN_NAME_expects_STRING__not = SubLObjectFactory
			.makeString(":FOREIGN-NAME expects STRING, not ~S.");

	public static SubLString $str29$The_argument_list__S_and_the__ARG = SubLObjectFactory
			.makeString("The argument list ~S and the :ARG-CONVERSION pattern ~S appear malaligned.");

	public static SubLString $str30$_S_is_not_a_valid__ARG_CONVERSION = SubLObjectFactory
			.makeString("~S is not a valid :ARG-CONVERSION argument.");

	public static SubLString $str31$_S_is_not_a_valid__RETURN_TYPE_ar = SubLObjectFactory
			.makeString("~S is not a valid :RETURN-TYPE argument.");

	public static SubLString $str32$Do_not_know_how_to_generate_a_for = SubLObjectFactory
			.makeString("Do not know how to generate a foreign name from ~S for ~S.");

	public static SubLList $list33 = ConsesLow.list(SubLObjectFactory.makeSymbol("SYMBOL"),
			SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("ARGS"));

	public static SubLSymbol $sym34$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");

	public static SubLSymbol $sym35$DEF_FOREIGN_FUNCTION = SubLObjectFactory.makeSymbol("DEF-FOREIGN-FUNCTION");

	public static SubLSymbol $sym36$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");

	//// Internal Constants

	public static SubLSymbol $sym37$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	public static SubLSymbol $sym38$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
	public static SubLSymbol $sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
	public static SubLSymbol $sym40$_VAL = SubLObjectFactory.makeSymbol("%VAL");
	public static SubLSymbol $sym41$FFUNCALL = SubLObjectFactory.makeSymbol("FFUNCALL");
	public static SubLSymbol $sym42$PIF = SubLObjectFactory.makeSymbol("PIF");
	public static SubLList $list43 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALIEN-NULL-PTR?"),
			SubLObjectFactory.makeSymbol("%VAL"), SubLObjectFactory.makeKeyword("C"));
	public static SubLSymbol $sym44$RET = SubLObjectFactory.makeSymbol("RET");
	public static SubLList $list45 = ConsesLow
			.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("%VAL")));

	@SubL(source = "sublisp/foreign.lisp", position = 3616)
	public static SubLObject all_foreign_shared_libraries() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return conses_high.copy_list(foreign.$foreign_shared_libraries$.getDynamicValue(thread));
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 10911)
	public static SubLObject analyze_define_foreign_function_arguments(SubLObject symbol, SubLObject arglist,
			SubLObject rules) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = rules;
				SubLObject current = datum;
				SubLObject allow_other_keys_p = CommonSymbols.NIL;
				SubLObject rest = current;
				SubLObject bad = CommonSymbols.NIL;
				SubLObject current_1 = CommonSymbols.NIL;
				for (; CommonSymbols.NIL != rest;) {
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, foreign.$list17);
					current_1 = rest.first();
					rest = rest.rest();
					cdestructuring_bind.destructuring_bind_must_consp(rest, datum, foreign.$list17);
					if (CommonSymbols.NIL == conses_high.member(current_1, foreign.$list18, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED))
						bad = CommonSymbols.T;
					if (current_1 == foreign.$kw19$ALLOW_OTHER_KEYS)
						allow_other_keys_p = rest.first();
					rest = rest.rest();
				}
				if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
					cdestructuring_bind.cdestructuring_bind_error(datum, foreign.$list17);
				{
					SubLObject calling_convention_tail = cdestructuring_bind
							.property_list_member(foreign.$kw20$CALLING_CONVENTION, current);
					SubLObject calling_convention = CommonSymbols.NIL != calling_convention_tail
							? (SubLObject) conses_high.cadr(calling_convention_tail) : foreign.$kw21$C;
					SubLObject foreign_shared_library_tail = cdestructuring_bind
							.property_list_member(foreign.$kw22$FOREIGN_SHARED_LIBRARY, current);
					SubLObject foreign_shared_library = CommonSymbols.NIL != foreign_shared_library_tail
							? (SubLObject) conses_high.cadr(foreign_shared_library_tail) : CommonSymbols.NIL;
					SubLObject foreign_name_tail = cdestructuring_bind.property_list_member(foreign.$kw23$FOREIGN_NAME,
							current);
					SubLObject foreign_name = CommonSymbols.NIL != foreign_name_tail
							? (SubLObject) conses_high.cadr(foreign_name_tail) : CommonSymbols.NIL;
					SubLObject arg_conversion_tail = cdestructuring_bind
							.property_list_member(foreign.$kw24$ARG_CONVERSION, current);
					SubLObject arg_conversion = CommonSymbols.NIL != arg_conversion_tail
							? (SubLObject) conses_high.cadr(arg_conversion_tail) : CommonSymbols.NIL;
					SubLObject return_type_tail = cdestructuring_bind.property_list_member(foreign.$kw25$RETURN_TYPE,
							current);
					SubLObject return_type = CommonSymbols.NIL != return_type_tail
							? (SubLObject) conses_high.cadr(return_type_tail) : foreign.$kw26$VOID;
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
						if (calling_convention != foreign.$kw21$C)
							Errors.error(foreign.$str27$Currently__only_calling_conventio);
					if (CommonSymbols.NIL == foreign_name)
						foreign_name = foreign.generate_foreign_name_from_sublisp_symbol(calling_convention, symbol);
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
						if (!foreign_name.isString())
							Errors.error(foreign.$str28$_FOREIGN_NAME_expects_STRING__not, foreign_name);
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
						if (!Sequences.length(arglist).numE(Sequences.length(arg_conversion)))
							Errors.error(foreign.$str29$The_argument_list__S_and_the__ARG, arglist, arg_conversion);
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
						if (CommonSymbols.NIL == foreign.valid_arg_conversion_pattern(arg_conversion))
							Errors.error(foreign.$str30$_S_is_not_a_valid__ARG_CONVERSION, arg_conversion);
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
						if (!(return_type.isKeyword() || return_type.isList()))
							Errors.error(foreign.$str31$_S_is_not_a_valid__RETURN_TYPE_ar, return_type);
					return Values.values(calling_convention, foreign_shared_library, foreign_name, arg_conversion,
							return_type);
				}
			}
		}
	}

	public static SubLObject declare_foreign_file() {
		SubLFiles.declareFunction(foreign.myName, "declare_foreign_shared_library", "DECLARE-FOREIGN-SHARED-LIBRARY", 2,
				0, false);
		SubLFiles.declareFunction(foreign.myName, "find_foreign_shared_library_by_pathname",
				"FIND-FOREIGN-SHARED-LIBRARY-BY-PATHNAME", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "get_foreign_shared_library_pathname",
				"GET-FOREIGN-SHARED-LIBRARY-PATHNAME", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "get_foreign_shared_library_dependencies",
				"GET-FOREIGN-SHARED-LIBRARY-DEPENDENCIES", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "get_foreign_shared_library_property",
				"GET-FOREIGN-SHARED-LIBRARY-PROPERTY", 2, 1, false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_p", "FOREIGN-SHARED-LIBRARY-P", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "undeclare_foreign_shared_library",
				"UNDECLARE-FOREIGN-SHARED-LIBRARY", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "all_foreign_shared_libraries", "ALL-FOREIGN-SHARED-LIBRARIES", 0, 0,
				false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_loadableP",
				"FOREIGN-SHARED-LIBRARY-LOADABLE?", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "find_foreign_shared_library_by_property",
				"FIND-FOREIGN-SHARED-LIBRARY-BY-PROPERTY", 2, 1, false);
		SubLFiles.declareFunction(foreign.myName, "find_foreign_shared_library_int", "FIND-FOREIGN-SHARED-LIBRARY-INT",
				1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "edit_foreign_shared_library", "EDIT-FOREIGN-SHARED-LIBRARY", 2, 0,
				false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_accessibleP",
				"FOREIGN-SHARED-LIBRARY-ACCESSIBLE?", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "load_foreign_shared_library", "LOAD-FOREIGN-SHARED-LIBRARY", 1, 1,
				false);
		SubLFiles.declareFunction(foreign.myName, "ensure_foreign_shared_library_loaded",
				"ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", 1, 1, false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_loadedP", "FOREIGN-SHARED-LIBRARY-LOADED?", 1,
				0, false);
		SubLFiles.declareFunction(foreign.myName, "unload_foreign_shared_library", "UNLOAD-FOREIGN-SHARED-LIBRARY", 1,
				0, false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_installedP",
				"FOREIGN-SHARED-LIBRARY-INSTALLED?", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "load_shared_library_int", "LOAD-SHARED-LIBRARY-INT", 3, 0, false);
		SubLFiles.declareFunction(foreign.myName, "unload_shared_library_int", "UNLOAD-SHARED-LIBRARY-INT", 2, 0,
				false);
		SubLFiles.declareFunction(foreign.myName, "foreign_shared_library_loaded_intP",
				"FOREIGN-SHARED-LIBRARY-LOADED-INT?", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "return_type_string_p", "RETURN-TYPE-STRING-P", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "return_type_pointer_p", "RETURN-TYPE-POINTER-P", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "default_return_value", "DEFAULT-RETURN-VALUE", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "make_helper_function_symbol", "MAKE-HELPER-FUNCTION-SYMBOL", 2, 0,
				false);
		SubLFiles.declareMacro(foreign.myName, "define_foreign_function", "DEFINE-FOREIGN-FUNCTION");
		SubLFiles.declareFunction(foreign.myName, "analyze_define_foreign_function_arguments",
				"ANALYZE-DEFINE-FOREIGN-FUNCTION-ARGUMENTS", 3, 0, false);
		SubLFiles.declareFunction(foreign.myName, "generate_foreign_name_from_sublisp_symbol",
				"GENERATE-FOREIGN-NAME-FROM-SUBLISP-SYMBOL", 2, 0, false);
		SubLFiles.declareFunction(foreign.myName, "valid_arg_conversion_pattern", "VALID-ARG-CONVERSION-PATTERN", 1, 0,
				false);
		SubLFiles.declareMacro(foreign.myName, "ffuncall", "FFUNCALL");
		SubLFiles.declareFunction(foreign.myName, "make_dummy_arg_list", "MAKE-DUMMY-ARG-LIST", 1, 0, false);
		SubLFiles.declareFunction(foreign.myName, "define_foreign_function_internal",
				"DEFINE-FOREIGN-FUNCTION-INTERNAL", 7, 0, false);
		SubLFiles.declareFunction(foreign.myName, "vector_for_marshalling", "VECTOR-FOR-MARSHALLING", 3, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/foreign.lisp", position = 1223)
	public static SubLObject declare_foreign_shared_library(SubLObject moniker, SubLObject properties) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject pathname = conses_high.getf(properties, foreign.$kw4$FILENAME, CommonSymbols.NIL);
				SubLObject result = CommonSymbols.NIL;
				if (CommonSymbols.NIL == pathname)
					Errors.error(foreign.$str5$Foreign_shared_library_must_have_);
				{
					SubLObject lock = foreign.$foreign_shared_library_lock$.getGlobalValue();
					SubLObject release = CommonSymbols.NIL;
					try {
						release = Locks.seize_lock(lock);
						if (CommonSymbols.NIL != foreign.foreign_shared_library_p(moniker))
							foreign.edit_foreign_shared_library(moniker, properties);
						else {
							foreign.$foreign_shared_libraries$.setDynamicValue(conses_high.acons(moniker, properties,
									foreign.$foreign_shared_libraries$.getDynamicValue(thread)), thread);
							result = foreign.$foreign_shared_libraries$.getDynamicValue(thread);
						}
					} finally {
						if (CommonSymbols.NIL != release)
							Locks.release_lock(lock);
					}
				}
				return result;
			}
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 9300)
	public static SubLObject default_return_value(SubLObject return_type) {
		if (CommonSymbols.NIL == foreign.return_type_pointer_p(return_type))
			return CommonSymbols.NIL;
		if (Sequences.length(return_type).numL(CommonSymbols.THREE_INTEGER))
			return CommonSymbols.NIL;
		return conses_high.third(return_type);
	}

	@SubL(source = "sublisp/foreign.lisp", position = 9669)
	public static SubLObject define_foreign_function(SubLObject macroform, SubLObject environment) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject datum = macroform.rest();
				SubLObject current = datum;
				SubLObject symbol = CommonSymbols.NIL;
				SubLObject arglist = CommonSymbols.NIL;
				SubLObject rules = CommonSymbols.NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
				symbol = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
				arglist = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
				rules = current.first();
				current = current.rest();
				if (CommonSymbols.NIL == current) {
					SubLTrampolineFile.checkType(symbol, foreign.$sym15$SYMBOLP);
					SubLTrampolineFile.checkType(arglist, foreign.$sym16$LISTP);
					SubLTrampolineFile.checkType(rules, foreign.$sym16$LISTP);
					thread.resetMultipleValues();
					{
						SubLObject calling_convention = foreign.analyze_define_foreign_function_arguments(symbol,
								arglist, rules);
						SubLObject foreign_shared_library = thread.secondMultipleValue();
						SubLObject foreign_name = thread.thirdMultipleValue();
						SubLObject arg_conversion = thread.fourthMultipleValue();
						SubLObject return_type = thread.fifthMultipleValue();
						thread.resetMultipleValues();
						return foreign.define_foreign_function_internal(symbol, arglist, calling_convention,
								foreign_shared_library, foreign_name, arg_conversion, return_type);
					}
				} else
					cdestructuring_bind.cdestructuring_bind_error(datum, foreign.$list14);
			}
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 14259)
	public static SubLObject define_foreign_function_internal(SubLObject symbol, SubLObject arglist,
			SubLObject calling_convention, SubLObject foreign_shared_library, SubLObject foreign_name,
			SubLObject arg_conversion, SubLObject return_type) {
		{
			SubLObject ret_type = return_type.isList() ? (SubLObject) return_type.first() : CommonSymbols.NIL;
			SubLObject symbol_ff = foreign.make_helper_function_symbol(symbol, return_type);
			SubLObject default_return_value = foreign.default_return_value(return_type);
			SubLObject main_function = ConsesLow.list(foreign.$sym35$DEF_FOREIGN_FUNCTION, foreign_shared_library,
					foreign_name, ConsesLow.list(foreign.$sym36$QUOTE, symbol_ff),
					ConsesLow.list(foreign.$sym36$QUOTE, arg_conversion),
					ConsesLow.list(foreign.$sym36$QUOTE, ret_type), calling_convention, default_return_value);
			if (!symbol.equal(symbol_ff)) {
				SubLObject dummy_arglist = foreign.make_dummy_arg_list(arglist);
				SubLObject retit = ConsesLow.list(foreign.$sym37$PROGN, main_function,
						ConsesLow.list(foreign.$sym38$DEFINE, symbol, dummy_arglist,
								ConsesLow.list(foreign.$sym39$CLET,
										ConsesLow.list(ConsesLow.list(foreign.$sym40$_VAL,
												ConsesLow.listS(foreign.$sym41$FFUNCALL,
														ConsesLow.list(foreign.$sym36$QUOTE, symbol_ff),
														ConsesLow.append(dummy_arglist, CommonSymbols.NIL)))),
										ConsesLow.listS(foreign.$sym42$PIF, foreign.$list43,
												ConsesLow.list(foreign.$sym44$RET, default_return_value),
												foreign.$list45))));
				return retit;
			} else
				return main_function;
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 4406)
	public static SubLObject edit_foreign_shared_library(SubLObject moniker, SubLObject properties) {
		{
			SubLObject tuple = foreign.find_foreign_shared_library_int(moniker);
			if (CommonSymbols.NIL != tuple)
				ConsesLow.rplacd(tuple, properties);
		}
		return moniker;
	}

	/** Ensure that a foreign shared library is ready for use. */
	@SubL(source = "sublisp/foreign.lisp", position = 5971)
	public static SubLObject ensure_foreign_shared_library_loaded(SubLObject moniker, SubLObject options) {
		if (options == CommonSymbols.UNPROVIDED)
			options = CommonSymbols.NIL;
		if (CommonSymbols.NIL == foreign.foreign_shared_library_loaded_intP(moniker)) {
			SubLObject lock = foreign.$active_foreign_shared_library_lock$.getGlobalValue();
			SubLObject release = CommonSymbols.NIL;
			try {
				release = Locks.seize_lock(lock);
				if (CommonSymbols.NIL == foreign.foreign_shared_library_loadedP(moniker)) {
					{
						SubLObject dependencies = foreign.get_foreign_shared_library_dependencies(moniker);
						SubLObject cdolist_list_var = dependencies;
						SubLObject dependency = CommonSymbols.NIL;
						for (dependency = cdolist_list_var
								.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
										.rest(), dependency = cdolist_list_var.first())
							foreign.ensure_foreign_shared_library_loaded(dependency, CommonSymbols.UNPROVIDED);
					}
					foreign.load_foreign_shared_library(moniker, options);
				}
			} finally {
				if (CommonSymbols.NIL != release)
					Locks.release_lock(lock);
			}
		}
		return moniker;
	}

	/** @hack: do better here eventually */
	@SubL(source = "sublisp/foreign.lisp", position = 14016)
	public static SubLObject ffuncall(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject symbol = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list33);
			symbol = current.first();
			current = current.rest();
			{
				SubLObject args = current;
				return ConsesLow.listS(foreign.$sym34$FUNCALL, symbol, ConsesLow.append(args, CommonSymbols.NIL));
			}
		}
	}

	/**
	 * Find the moniker for the foreign shared library associated with the
	 * pathname given.
	 */
	@SubL(source = "sublisp/foreign.lisp", position = 1810)
	public static SubLObject find_foreign_shared_library_by_pathname(SubLObject pathname) {
		{
			SubLObject tuple = CommonSymbols.NIL;
			SubLObject lock = foreign.$foreign_shared_library_lock$.getGlobalValue();
			SubLObject release = CommonSymbols.NIL;
			try {
				release = Locks.seize_lock(lock);
				tuple = foreign.find_foreign_shared_library_by_property(foreign.$kw4$FILENAME, pathname,
						CommonSymbols.EQUAL);
			} finally {
				if (CommonSymbols.NIL != release)
					Locks.release_lock(lock);
			}
			return tuple;
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 3916)
	public static SubLObject find_foreign_shared_library_by_property(SubLObject property, SubLObject value,
			SubLObject test) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject found = CommonSymbols.NIL;
				if (CommonSymbols.NIL == found) {
					SubLObject csome_list_var = foreign.$foreign_shared_libraries$.getDynamicValue(thread);
					SubLObject libinfo = CommonSymbols.NIL;
					for (libinfo = csome_list_var.first(); !(CommonSymbols.NIL != found
							|| CommonSymbols.NIL == csome_list_var); csome_list_var = csome_list_var
									.rest(), libinfo = csome_list_var.first()) {
						SubLObject moniker = libinfo.first();
						SubLObject properties = libinfo.rest();
						if (CommonSymbols.NIL != Functions.funcall(test, value,
								conses_high.getf(properties, property, CommonSymbols.UNPROVIDED)))
							found = moniker;
					}
				}
				return found;
			}
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 4302)
	public static SubLObject find_foreign_shared_library_int(SubLObject moniker) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return conses_high.assoc(moniker, foreign.$foreign_shared_libraries$.getDynamicValue(thread),
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
	}

	/**
	 * Return T iff the file associated with the shared library declared by
	 * MONIKER is accessible
	 */
	@SubL(source = "sublisp/foreign.lisp", position = 4988)
	public static SubLObject foreign_shared_library_accessibleP(SubLObject moniker) {
		return Filesys.probe_file(foreign.get_foreign_shared_library_pathname(moniker));
	}

	@SubL(source = "sublisp/foreign.lisp", position = 7660)
	public static SubLObject foreign_shared_library_installedP(SubLObject moniker) {
		return SubLObjectFactory.makeBoolean(CommonSymbols.NIL != foreign.foreign_shared_library_loadedP(moniker)
				|| CommonSymbols.NIL != foreign.foreign_shared_library_loadableP(moniker));
	}

	@SubL(source = "sublisp/foreign.lisp", position = 3706)
	public static SubLObject foreign_shared_library_loadableP(SubLObject moniker) {
		{
			SubLObject pathname = foreign.get_foreign_shared_library_pathname(moniker);
			if (CommonSymbols.NIL != pathname)
				return CommonSymbols.NIL != Filesys.probe_file(pathname) ? (SubLObject) CommonSymbols.T
						: CommonSymbols.NIL;
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/foreign.lisp", position = 8565)
	public static SubLObject foreign_shared_library_loaded_intP(SubLObject moniker) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return SubLObjectFactory.makeBoolean(CommonSymbols.NIL != conses_high.member(moniker,
					foreign.$active_foreign_shared_libraries$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED));
		}
	}

	/** Is this shared libary already loaded into the system? */
	@SubL(source = "sublisp/foreign.lisp", position = 6608)
	public static SubLObject foreign_shared_library_loadedP(SubLObject moniker) {
		{
			SubLObject result = CommonSymbols.NIL;
			SubLObject lock = foreign.$active_foreign_shared_library_lock$.getGlobalValue();
			SubLObject release = CommonSymbols.NIL;
			try {
				release = Locks.seize_lock(lock);
				result = foreign.foreign_shared_library_loaded_intP(moniker);
			} finally {
				if (CommonSymbols.NIL != release)
					Locks.release_lock(lock);
			}
			return result;
		}
	}

	/** Is this moniker known to represent a shared library. */
	@SubL(source = "sublisp/foreign.lisp", position = 2866)
	public static SubLObject foreign_shared_library_p(SubLObject moniker) {
		return SubLObjectFactory.makeBoolean(CommonSymbols.NIL != foreign.get_foreign_shared_library_pathname(moniker));
	}

	@SubL(source = "sublisp/foreign.lisp", position = 13607)
	public static SubLObject generate_foreign_name_from_sublisp_symbol(SubLObject calling_convention,
			SubLObject symbol) {
		{
			SubLObject pcase_var = calling_convention;
			if (pcase_var.eql(foreign.$kw21$C))
				return Strings.string_downcase(Symbols.symbol_name(symbol), CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
			else
				Errors.error(foreign.$str32$Do_not_know_how_to_generate_a_for, symbol, calling_convention);
		}
		return CommonSymbols.NIL;
	}

	/** Find the libraries that this shared library depends on. */
	@SubL(source = "sublisp/foreign.lisp", position = 2323)
	public static SubLObject get_foreign_shared_library_dependencies(SubLObject moniker) {
		return foreign.get_foreign_shared_library_property(moniker, foreign.$kw6$DEPENDS_ON, CommonSymbols.NIL);
	}

	/** Find the pathname of the shared library with the moniker. */
	@SubL(source = "sublisp/foreign.lisp", position = 2136)
	public static SubLObject get_foreign_shared_library_pathname(SubLObject moniker) {
		return foreign.get_foreign_shared_library_property(moniker, foreign.$kw4$FILENAME, CommonSymbols.NIL);
	}

	/** Find any property of a foreign shared library. */
	@SubL(source = "sublisp/foreign.lisp", position = 2513)
	public static SubLObject get_foreign_shared_library_property(SubLObject moniker, SubLObject property,
			SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLObject tuple = CommonSymbols.NIL;
			SubLObject lock = foreign.$foreign_shared_library_lock$.getGlobalValue();
			SubLObject release = CommonSymbols.NIL;
			try {
				release = Locks.seize_lock(lock);
				tuple = foreign.find_foreign_shared_library_int(moniker);
			} finally {
				if (CommonSymbols.NIL != release)
					Locks.release_lock(lock);
			}
			{
				SubLObject properties = tuple.rest();
				return conses_high.getf(properties, property, v_default);
			}
		}
	}

	public static SubLObject init_foreign_file() {
		foreign.$foreign_shared_library_lock$ = SubLFiles.deflexical("*FOREIGN-SHARED-LIBRARY-LOCK*",
				Locks.make_lock(foreign.$str0$Foreign_Shared_Libraries_Lock));
		foreign.$char_pointer_idiom_declaration$ = SubLFiles.deflexical("*CHAR-POINTER-IDIOM-DECLARATION*",
				foreign.$list1);
		foreign.$pointer_idiom_declaration$ = SubLFiles.deflexical("*POINTER-IDIOM-DECLARATION*", foreign.$list2);
		foreign.$char_pointer_idiom_allegro$ = SubLFiles.deflexical("*CHAR-POINTER-IDIOM-ALLEGRO*", foreign.$list3);
		foreign.$foreign_shared_libraries$ = SubLFiles.defvar("*FOREIGN-SHARED-LIBRARIES*", CommonSymbols.NIL);
		foreign.$active_foreign_shared_library_lock$ = SubLFiles.deflexical("*ACTIVE-FOREIGN-SHARED-LIBRARY-LOCK*",
				Locks.make_lock(foreign.$str8$Active_Foreign_Shared_Libraries));
		foreign.$active_foreign_shared_libraries$ = SubLFiles.defvar("*ACTIVE-FOREIGN-SHARED-LIBRARIES*",
				CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	/**
	 * Given the moniker fo a previously declared shared library, load the
	 * associated foreign shared library into the system, using the options
	 * passed in.
	 */
	@SubL(source = "sublisp/foreign.lisp", position = 5210)
	public static SubLObject load_foreign_shared_library(SubLObject moniker, SubLObject options) {
		if (options == CommonSymbols.UNPROVIDED)
			options = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject pathname = foreign.get_foreign_shared_library_pathname(moniker);
				if (CommonSymbols.NIL == pathname)
					Errors.error(foreign.$str9$_S_is_not_associated_with_any_for, moniker);
				{
					SubLObject lock = foreign.$active_foreign_shared_library_lock$.getGlobalValue();
					SubLObject release = CommonSymbols.NIL;
					try {
						release = Locks.seize_lock(lock);
						if (CommonSymbols.NIL != foreign.foreign_shared_library_loadedP(moniker))
							Errors.warn(foreign.$str10$Shared_library__S___S__is_already, moniker, pathname);
						else {
							foreign.load_shared_library_int(moniker, pathname, options);
							foreign.$active_foreign_shared_libraries$.setDynamicValue(ConsesLow.cons(moniker,
									foreign.$active_foreign_shared_libraries$.getDynamicValue(thread)), thread);
						}
					} finally {
						if (CommonSymbols.NIL != release)
							Locks.release_lock(lock);
					}
				}
				return moniker;
			}
		}
	}

	/** Fan out into the separate implementations. */
	@SubL(source = "sublisp/foreign.lisp", position = 7825)
	public static SubLObject load_shared_library_int(SubLObject moniker, SubLObject pathname, SubLObject options) {
		return Alien.load_shared_object(moniker, pathname, options);
	}

	@SubL(source = "sublisp/foreign.lisp", position = 14129)
	public static SubLObject make_dummy_arg_list(SubLObject arglist) {
		return arglist;
	}

	@SubL(source = "sublisp/foreign.lisp", position = 9479)
	public static SubLObject make_helper_function_symbol(SubLObject symbol, SubLObject return_type) {
		if (CommonSymbols.NIL != foreign.return_type_pointer_p(return_type))
			return Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(symbol), foreign.$str13$_));
		return symbol;
	}

	@SubL(source = "sublisp/foreign.lisp", position = 8977)
	public static SubLObject return_type_pointer_p(SubLObject return_type) {
		if (CommonSymbols.NIL != foreign.return_type_string_p(return_type))
			return CommonSymbols.T;
		if (!(return_type.isList() && Sequences.length(return_type).numG(CommonSymbols.ONE_INTEGER)))
			return CommonSymbols.NIL;
		return SubLObjectFactory
				.makeBoolean(foreign.$pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first())
						&& conses_high.second(foreign.$pointer_idiom_declaration$.getGlobalValue())
								.equal(conses_high.second(return_type)));
	}

	@SubL(source = "sublisp/foreign.lisp", position = 8696)
	public static SubLObject return_type_string_p(SubLObject return_type) {
		if (!(return_type.isList() && Sequences.length(return_type).numG(CommonSymbols.ONE_INTEGER)))
			return CommonSymbols.NIL;
		return SubLObjectFactory.makeBoolean(
				foreign.$char_pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first())
						&& conses_high.second(foreign.$char_pointer_idiom_declaration$.getGlobalValue())
								.equal(conses_high.second(return_type)));
	}

	public static SubLObject setup_foreign_file() {
		// CVS_ID("Id: foreign.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	/**
	 * Unassociate all knowledge of the foreign shared library identified by the
	 * moniker.
	 */
	@SubL(source = "sublisp/foreign.lisp", position = 3038)
	public static SubLObject undeclare_foreign_shared_library(SubLObject moniker) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject okP = CommonSymbols.NIL;
				SubLObject lock = foreign.$foreign_shared_library_lock$.getGlobalValue();
				SubLObject release = CommonSymbols.NIL;
				try {
					release = Locks.seize_lock(lock);
					if (CommonSymbols.NIL != foreign.foreign_shared_library_p(moniker)) {
						SubLObject tuple = foreign.find_foreign_shared_library_int(moniker);
						foreign.$foreign_shared_libraries$.setDynamicValue(
								Sequences.delete(tuple, foreign.$foreign_shared_libraries$.getDynamicValue(thread),
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED),
								thread);
						okP = CommonSymbols.T;
					}
				} finally {
					if (CommonSymbols.NIL != release)
						Locks.release_lock(lock);
				}
				if (CommonSymbols.NIL == okP)
					Errors.error(foreign.$str7$_A_does_not_reference_a_known_for, moniker);
				return okP;
			}
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 6879)
	public static SubLObject unload_foreign_shared_library(SubLObject moniker) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject success = CommonSymbols.NIL;
				SubLObject lock = foreign.$active_foreign_shared_library_lock$.getGlobalValue();
				SubLObject release = CommonSymbols.NIL;
				try {
					release = Locks.seize_lock(lock);
					if (CommonSymbols.NIL != foreign.foreign_shared_library_loadedP(moniker)) {
						{
							SubLObject pathname = foreign.get_foreign_shared_library_pathname(moniker);
							foreign.unload_shared_library_int(moniker, pathname);
						}
						foreign.$active_foreign_shared_libraries$.setDynamicValue(Sequences.delete(moniker,
								foreign.$active_foreign_shared_libraries$.getDynamicValue(thread),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), thread);
						success = CommonSymbols.T;
					}
				} finally {
					if (CommonSymbols.NIL != release)
						Locks.release_lock(lock);
				}
				if (CommonSymbols.NIL == success)
					if (CommonSymbols.NIL != foreign.foreign_shared_library_p(moniker))
						Errors.error(foreign.$str11$_S_does_not_designate_one_of_the_, moniker,
								foreign.all_foreign_shared_libraries());
					else
						Errors.error(foreign.$str12$_S_does_not_designate_a_known_sha, moniker);
				return success;
			}
		}
	}

	@SubL(source = "sublisp/foreign.lisp", position = 8180)
	public static SubLObject unload_shared_library_int(SubLObject moniker, SubLObject pathname) {
		return Alien.unload_shared_object(moniker);
	}

	/** @stub */
	@SubL(source = "sublisp/foreign.lisp", position = 13918)
	public static SubLObject valid_arg_conversion_pattern(SubLObject arg_conversion) {
		return Types.listp(arg_conversion);
	}

	@SubL(source = "sublisp/foreign.lisp", position = 15537)
	public static SubLObject vector_for_marshalling(SubLObject size, SubLObject type, SubLObject initial_value) {
		return Vectors.make_vector(size, initial_value);
	}

	private foreign() {
	}

	//// Initializers

	public void declareFunctions() {
		foreign.declare_foreign_file();
	}

	public void initializeVariables() {
		foreign.init_foreign_file();
	}

	public void runTopLevelForms() {
		foreign.setup_foreign_file();
	}

}
