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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class stream_macros extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new stream_macros();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros";
	@SubL(source = "sublisp/stream-macros.lisp", position = 1051)
	public static SubLSymbol $stream_requires_locking$ = null;

	//// Definitions

	public static SubLSymbol $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLList $list1 = ConsesLow
			.list(ConsesLow.list(SubLObjectFactory.makeSymbol("*STREAM-REQUIRES-LOCKING*"), CommonSymbols.NIL));

	public static SubLList $list2 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM-VAR"), SubLObjectFactory.makeSymbol("RESULT-VAR")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	public static SubLSymbol $sym3$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");

	public static SubLSymbol $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	public static SubLSymbol $sym5$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");

	public static SubLList $list6 = ConsesLow
			.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")));

	public static SubLSymbol $sym7$CSETF = SubLObjectFactory.makeSymbol("CSETF");

	public static SubLSymbol $sym8$GET_OUTPUT_STREAM_STRING = SubLObjectFactory.makeSymbol("GET-OUTPUT-STREAM-STRING");

	public static SubLSymbol $sym9$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");

	public static SubLList $list10 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("STRING"),
					SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("INDEX"),
					ConsesLow.list(SubLObjectFactory.makeSymbol("START"), CommonSymbols.ZERO_INTEGER),
					SubLObjectFactory.makeSymbol("END")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	public static SubLList $list11 = ConsesLow.list(SubLObjectFactory.makeKeyword("INDEX"),
			SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeKeyword("END"));

	public static SubLSymbol $kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");

	public static SubLSymbol $kw13$INDEX = SubLObjectFactory.makeKeyword("INDEX");

	//// Internal Constants

	public static SubLSymbol $kw14$START = SubLObjectFactory.makeKeyword("START");
	public static SubLSymbol $kw15$END = SubLObjectFactory.makeKeyword("END");
	public static SubLSymbol $sym16$MAKE_PRIVATE_STRING_INPUT_STREAM = SubLObjectFactory
			.makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM");
	public static SubLSymbol $sym17$STREAM_INPUT_INDEX = SubLObjectFactory.makeSymbol("STREAM-INPUT-INDEX");
	public static SubLList $list18 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("STREAM")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLString $str19$STREAM_VAR = SubLObjectFactory.makeString("STREAM-VAR");
	public static SubLSymbol $sym20$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
	public static SubLList $list21 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILESPEC"),
					SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("KEYS")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLSymbol $sym22$WITH_OPEN_STREAM = SubLObjectFactory.makeSymbol("WITH-OPEN-STREAM");
	public static SubLSymbol $sym23$OPEN = SubLObjectFactory.makeSymbol("OPEN");
	public static SubLList $list24 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("SEQUENCE"), SubLObjectFactory.makeSymbol("START-VAR"),
					SubLObjectFactory.makeSymbol("END-VAR")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLString $str25$LENGTH = SubLObjectFactory.makeString("LENGTH");
	public static SubLSymbol $sym26$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
	public static SubLSymbol $sym27$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
	public static SubLList $list28 = ConsesLow.list(CommonSymbols.ZERO_INTEGER);
	public static SubLSymbol $sym29$MUST = SubLObjectFactory.makeSymbol("MUST");
	public static SubLSymbol $sym30$__ = SubLObjectFactory.makeSymbol(">=");
	public static SubLString $str31$Negative_start_index__D_given_for = SubLObjectFactory
			.makeString("Negative start index ~D given for ~S.");
	public static SubLSymbol $sym32$__ = SubLObjectFactory.makeSymbol("<=");
	public static SubLString $str33$The_end_index__D_given_for__S_is_ = SubLObjectFactory
			.makeString("The end index ~D given for ~S is greater than the length, ~D.");
	public static SubLString $str34$The_start_index__D_given_for__S_i = SubLObjectFactory
			.makeString("The start index ~D given for ~S is greater than the end index ~D.");
	public static SubLList $list35 = ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	public static SubLString $str36$LOCK_VAR = SubLObjectFactory.makeString("LOCK-VAR");
	public static SubLSymbol $sym37$STREAM_LOCK = SubLObjectFactory.makeSymbol("STREAM-LOCK");
	public static SubLSymbol $sym38$PIF = SubLObjectFactory.makeSymbol("PIF");
	public static SubLSymbol $sym39$LOCK_P = SubLObjectFactory.makeSymbol("LOCK-P");
	public static SubLSymbol $sym40$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
	public static SubLList $list41 = ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"));
	public static SubLSymbol $sym42$STREAM_STREAM_TYPE = SubLObjectFactory.makeSymbol("STREAM-STREAM-TYPE");
	public static SubLList $list43 = ConsesLow.list(SubLObjectFactory.makeKeyword("SYNONYM"));

	@SubL(source = "sublisp/stream-macros.lisp", position = 1321)
	public static SubLObject cwith_output_to_string(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream_var = CommonSymbols.NIL;
					SubLObject result_var = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
					stream_var = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
					result_var = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.list(stream_macros.$sym0$CLET, ConsesLow.list(stream_var), ConsesLow.list(
									stream_macros.$sym3$CUNWIND_PROTECT,
									ConsesLow.listS(stream_macros.$sym4$PROGN,
											ConsesLow.listS(stream_macros.$sym5$CSETQ, stream_var,
													stream_macros.$list6),
											ConsesLow.append(body,
													ConsesLow.list(ConsesLow.list(stream_macros.$sym7$CSETF, result_var,
															ConsesLow.list(stream_macros.$sym8$GET_OUTPUT_STREAM_STRING,
																	stream_var))))),
									ConsesLow.list(stream_macros.$sym9$CLOSE, stream_var)));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list2);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject declare_stream_macros_file() {
		SubLFiles.declareMacro(stream_macros.myName, "ensure_private_stream", "ENSURE-PRIVATE-STREAM");
		SubLFiles.declareFunction(stream_macros.myName, "ensure_private_stream_internal",
				"ENSURE-PRIVATE-STREAM-INTERNAL", 1, 0, false);
		SubLFiles.declareMacro(stream_macros.myName, "cwith_output_to_string", "CWITH-OUTPUT-TO-STRING");
		SubLFiles.declareMacro(stream_macros.myName, "with_input_from_string", "WITH-INPUT-FROM-STRING");
		SubLFiles.declareFunction(stream_macros.myName, "with_input_from_string_internal",
				"WITH-INPUT-FROM-STRING-INTERNAL", 6, 0, false);
		SubLFiles.declareMacro(stream_macros.myName, "with_open_stream", "WITH-OPEN-STREAM");
		SubLFiles.declareMacro(stream_macros.myName, "with_open_file", "WITH-OPEN-FILE");
		SubLFiles.declareMacro(stream_macros.myName, "with_bounding_index_designators",
				"WITH-BOUNDING-INDEX-DESIGNATORS");
		SubLFiles.declareMacro(stream_macros.myName, "with_stream_lock", "WITH-STREAM-LOCK");
		SubLFiles.declareMacro(stream_macros.myName, "synonym_stream_p", "SYNONYM-STREAM-P");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 702)
	public static SubLObject ensure_private_stream(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return stream_macros.ensure_private_stream_internal(body);
		}
	}

	/**
	 * Can be wrapped around existing functions to ensure a private stream
	 * handle.
	 */
	@SubL(source = "sublisp/stream-macros.lisp", position = 1123)
	public static SubLObject ensure_private_stream_internal(SubLObject body) {
		return ConsesLow.listS(stream_macros.$sym0$CLET, stream_macros.$list1,
				ConsesLow.append(body, CommonSymbols.NIL));
	}

	public static SubLObject init_stream_macros_file() {
		stream_macros.$stream_requires_locking$ = SubLFiles.defvar("*STREAM-REQUIRES-LOCKING*", CommonSymbols.T);
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_stream_macros_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 4457)
	public static SubLObject synonym_stream_p(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject stream = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list41);
			stream = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current)
				return ConsesLow.listS(CommonSymbols.EQ,
						ConsesLow.list(stream_macros.$sym42$STREAM_STREAM_TYPE, stream), stream_macros.$list43);
			else
				cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list41);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 3499)
	public static SubLObject with_bounding_index_designators(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject sequence = CommonSymbols.NIL;
					SubLObject start_var = CommonSymbols.NIL;
					SubLObject end_var = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
					sequence = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
					start_var = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
					end_var = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject length = Symbols.make_symbol(stream_macros.$str25$LENGTH);
							return ConsesLow.listS(stream_macros.$sym0$CLET,
									new SubLObject[] {
											ConsesLow.list(ConsesLow.list(length,
													ConsesLow.list(stream_macros.$sym26$LENGTH, sequence))),
											ConsesLow.list(stream_macros.$sym27$PUNLESS, start_var,
													ConsesLow.listS(stream_macros.$sym7$CSETF, start_var,
															stream_macros.$list28)),
											ConsesLow.list(stream_macros.$sym27$PUNLESS, end_var,
													ConsesLow.list(stream_macros.$sym7$CSETF, end_var, length)),
											ConsesLow.list(stream_macros.$sym29$MUST,
													ConsesLow.listS(stream_macros.$sym30$__, start_var,
															stream_macros.$list28),
													stream_macros.$str31$Negative_start_index__D_given_for, start_var,
													sequence),
											ConsesLow.list(stream_macros.$sym29$MUST,
													ConsesLow.list(stream_macros.$sym32$__, end_var, length),
													stream_macros.$str33$The_end_index__D_given_for__S_is_, end_var,
													sequence, length),
											ConsesLow.list(stream_macros.$sym29$MUST,
													ConsesLow.list(stream_macros.$sym32$__, start_var, end_var),
													stream_macros.$str34$The_start_index__D_given_for__S_i, start_var,
													sequence, end_var),
											ConsesLow.append(body, CommonSymbols.NIL) });
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list24);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 1688)
	public static SubLObject with_input_from_string(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject var = CommonSymbols.NIL;
					SubLObject string = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
					var = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
					string = current.first();
					current = current.rest();
					{
						SubLObject allow_other_keys_p = CommonSymbols.NIL;
						SubLObject rest = current;
						SubLObject bad = CommonSymbols.NIL;
						SubLObject current_1 = CommonSymbols.NIL;
						for (; CommonSymbols.NIL != rest;) {
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, stream_macros.$list10);
							current_1 = rest.first();
							rest = rest.rest();
							cdestructuring_bind.destructuring_bind_must_consp(rest, datum, stream_macros.$list10);
							if (CommonSymbols.NIL == conses_high.member(current_1, stream_macros.$list11,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
								bad = CommonSymbols.T;
							if (current_1 == stream_macros.$kw12$ALLOW_OTHER_KEYS)
								allow_other_keys_p = rest.first();
							rest = rest.rest();
						}
						if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
							cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list10);
						{
							SubLObject index_tail = cdestructuring_bind.property_list_member(stream_macros.$kw13$INDEX,
									current);
							SubLObject index = CommonSymbols.NIL != index_tail
									? (SubLObject) conses_high.cadr(index_tail) : CommonSymbols.NIL;
							SubLObject start_tail = cdestructuring_bind.property_list_member(stream_macros.$kw14$START,
									current);
							SubLObject start = CommonSymbols.NIL != start_tail
									? (SubLObject) conses_high.cadr(start_tail) : CommonSymbols.ZERO_INTEGER;
							SubLObject end_tail = cdestructuring_bind.property_list_member(stream_macros.$kw15$END,
									current);
							SubLObject end = CommonSymbols.NIL != end_tail ? (SubLObject) conses_high.cadr(end_tail)
									: CommonSymbols.NIL;
							current = temp;
							{
								SubLObject body = current;
								return stream_macros.with_input_from_string_internal(var, string, index, start, end,
										body);
							}
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 2184)
	public static SubLObject with_input_from_string_internal(SubLObject var, SubLObject string, SubLObject index,
			SubLObject start, SubLObject end, SubLObject body) {
		return ConsesLow
				.list(stream_macros.$sym0$CLET, ConsesLow.list(var),
						ConsesLow.list(stream_macros.$sym3$CUNWIND_PROTECT,
								ConsesLow.listS(stream_macros.$sym4$PROGN,
										ConsesLow.list(stream_macros.$sym5$CSETQ, var,
												ConsesLow.list(stream_macros.$sym16$MAKE_PRIVATE_STRING_INPUT_STREAM,
														string, start, end)),
										ConsesLow
												.append(body, CommonSymbols.NIL != index
														? (SubLObject) ConsesLow.list(ConsesLow.list(
																stream_macros.$sym7$CSETF, index, ConsesLow.list(
																		stream_macros.$sym17$STREAM_INPUT_INDEX, var)))
														: CommonSymbols.NIL, CommonSymbols.NIL)),
								ConsesLow.list(stream_macros.$sym9$CLOSE, var)));
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 3046)
	public static SubLObject with_open_file(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject stream = CommonSymbols.NIL;
					SubLObject filespec = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
					stream = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
					filespec = current.first();
					current = current.rest();
					{
						SubLObject keys = current;
						current = temp;
						{
							SubLObject body = current;
							return ConsesLow.listS(stream_macros.$sym22$WITH_OPEN_STREAM,
									ConsesLow.list(stream,
											ConsesLow.listS(stream_macros.$sym23$OPEN, filespec,
													ConsesLow.append(keys, CommonSymbols.NIL))),
									ConsesLow.append(body, CommonSymbols.NIL));
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 2512)
	public static SubLObject with_open_stream(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject var = CommonSymbols.NIL;
					SubLObject stream = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
					var = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
					stream = current.first();
					current = current.rest();
					if (CommonSymbols.NIL == current) {
						current = temp;
						{
							SubLObject body = current;
							SubLObject stream_var = Symbols.make_symbol(stream_macros.$str19$STREAM_VAR);
							return ConsesLow.list(stream_macros.$sym0$CLET, ConsesLow.list(stream_var),
									ConsesLow.list(stream_macros.$sym3$CUNWIND_PROTECT,
											ConsesLow.list(stream_macros.$sym4$PROGN,
													ConsesLow.list(stream_macros.$sym5$CSETQ, stream_var, stream),
													ConsesLow.listS(stream_macros.$sym0$CLET,
															ConsesLow.list(ConsesLow.list(var, stream_var)),
															ConsesLow.append(body, CommonSymbols.NIL))),
											ConsesLow.list(stream_macros.$sym20$PWHEN, stream_var,
													ConsesLow.list(stream_macros.$sym9$CLOSE, stream_var))));
						}
					} else
						cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list18);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 4170)
	public static SubLObject with_stream_lock(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject stream = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list35);
			stream = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				SubLObject lock = Symbols.make_symbol(stream_macros.$str36$LOCK_VAR);
				return ConsesLow.list(stream_macros.$sym0$CLET,
						ConsesLow.list(ConsesLow.list(lock, ConsesLow.list(stream_macros.$sym37$STREAM_LOCK, stream))),
						ConsesLow.list(stream_macros.$sym38$PIF, ConsesLow.list(stream_macros.$sym39$LOCK_P, lock),
								ConsesLow.list(stream_macros.$sym40$WITH_LOCK_HELD, ConsesLow.list(lock),
										reader.bq_cons(stream_macros.$sym4$PROGN,
												ConsesLow.append(body, CommonSymbols.NIL))),
								reader.bq_cons(stream_macros.$sym4$PROGN, ConsesLow.append(body, CommonSymbols.NIL))));
			}
		}
	}

	private stream_macros() {
	}

	//// Initializers

	public void declareFunctions() {
		stream_macros.declare_stream_macros_file();
	}

	public void initializeVariables() {
		stream_macros.init_stream_macros_file();
	}

	public void runTopLevelForms() {
		stream_macros.setup_stream_macros_file();
	}

}
