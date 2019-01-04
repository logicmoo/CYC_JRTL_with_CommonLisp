//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class stream_macros extends SubLTranslatedFile {
	@SubL(source = "sublisp/stream-macros.lisp", position = 1321L)
	public static SubLObject cwith_output_to_string(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream_var = SubLNil.NIL;
		SubLObject result_var = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
		stream_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list2);
		result_var = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			return ConsesLow.list(stream_macros.$sym0$CLET, ConsesLow.list(stream_var),
					ConsesLow.list(stream_macros.$sym3$CUNWIND_PROTECT,
							ConsesLow
									.listS(stream_macros.$sym4$PROGN,
											ConsesLow.listS(stream_macros.$sym5$CSETQ, stream_var,
													stream_macros.$list6),
											ConsesLow.append(body,
													ConsesLow.list(ConsesLow.list(stream_macros.$sym7$CSETF, result_var,
															ConsesLow.list(stream_macros.$sym8$GET_OUTPUT_STREAM_STRING,
																	stream_var))))),
							ConsesLow.list(stream_macros.$sym9$CLOSE, stream_var)));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list2);
		return SubLNil.NIL;
	}

	public static SubLObject declare_stream_macros_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "ensure_private_stream",
				"ENSURE-PRIVATE-STREAM");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros",
				"ensure_private_stream_internal", "ENSURE-PRIVATE-STREAM-INTERNAL", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "cwith_output_to_string",
				"CWITH-OUTPUT-TO-STRING");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "with_input_from_string",
				"WITH-INPUT-FROM-STRING");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros",
				"with_input_from_string_internal", "WITH-INPUT-FROM-STRING-INTERNAL", 6, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "with_open_stream",
				"WITH-OPEN-STREAM");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "with_open_file",
				"WITH-OPEN-FILE");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros",
				"with_bounding_index_designators", "WITH-BOUNDING-INDEX-DESIGNATORS");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "with_stream_lock",
				"WITH-STREAM-LOCK");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros", "synonym_stream_p",
				"SYNONYM-STREAM-P");
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 702L)
	public static SubLObject ensure_private_stream(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ensure_private_stream_internal(body);
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 1123L)
	public static SubLObject ensure_private_stream_internal(SubLObject body) {
		return ConsesLow.listS(stream_macros.$sym0$CLET, stream_macros.$list1,
				ConsesLow.append(body, SubLNil.NIL));
	}

	public static SubLObject init_stream_macros_file() {
		stream_macros.$stream_requires_locking$ = SubLFiles.defvar("*STREAM-REQUIRES-LOCKING*", CommonSymbols.T);
		return SubLNil.NIL;
	}

	public static SubLObject setup_stream_macros_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 4457L)
	public static SubLObject synonym_stream_p(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject stream = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list41);
		stream = current.first();
		current = current.rest();
		if (SubLNil.NIL == current)
			return ConsesLow.listS(CommonSymbols.EQ, ConsesLow.list(stream_macros.$sym42$STREAM_STREAM_TYPE, stream),
					stream_macros.$list43);
		cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list41);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 3499L)
	public static SubLObject with_bounding_index_designators(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject sequence = SubLNil.NIL;
		SubLObject start_var = SubLNil.NIL;
		SubLObject end_var = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
		sequence = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
		start_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list24);
		end_var = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			SubLObject length = Symbols.make_symbol(stream_macros.$str25$LENGTH);
			return ConsesLow.listS(stream_macros.$sym0$CLET, new SubLObject[] {
					ConsesLow.list(ConsesLow.list(length, ConsesLow.list(stream_macros.$sym26$LENGTH, sequence))),
					ConsesLow.list(stream_macros.$sym27$PUNLESS, start_var,
							ConsesLow.listS(stream_macros.$sym7$CSETF, start_var, stream_macros.$list28)),
					ConsesLow.list(stream_macros.$sym27$PUNLESS, end_var,
							ConsesLow.list(stream_macros.$sym7$CSETF, end_var, length)),
					ConsesLow.list(stream_macros.$sym29$MUST,
							ConsesLow.listS(stream_macros.$sym30$__, start_var, stream_macros.$list28),
							stream_macros.$str31$Negative_start_index__D_given_for, start_var, sequence),
					ConsesLow.list(stream_macros.$sym29$MUST, ConsesLow.list(stream_macros.$sym32$__, end_var, length),
							stream_macros.$str33$The_end_index__D_given_for__S_is_, end_var, sequence, length),
					ConsesLow.list(stream_macros.$sym29$MUST,
							ConsesLow.list(stream_macros.$sym32$__, start_var, end_var),
							stream_macros.$str34$The_start_index__D_given_for__S_i, start_var, sequence, end_var),
					ConsesLow.append(body, SubLNil.NIL) });
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list24);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 1688L)
	public static SubLObject with_input_from_string(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = SubLNil.NIL;
		SubLObject string = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
		var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list10);
		string = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = SubLNil.NIL;
		SubLObject rest = current;
		SubLObject bad = SubLNil.NIL;
		SubLObject current_$1 = SubLNil.NIL;
		while (SubLNil.NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, stream_macros.$list10);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, stream_macros.$list10);
			if (SubLNil.NIL == conses_high.member(current_$1, stream_macros.$list11, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				bad = CommonSymbols.T;
			if (current_$1 == stream_macros.$kw12$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (SubLNil.NIL != bad && SubLNil.NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list10);
		SubLObject index_tail = cdestructuring_bind.property_list_member(stream_macros.$kw13$INDEX, current);
		SubLObject index = SubLNil.NIL != index_tail ? conses_high.cadr(index_tail) : SubLNil.NIL;
		SubLObject start_tail = cdestructuring_bind.property_list_member(stream_macros.$kw14$START, current);
		SubLObject start = SubLNil.NIL != start_tail ? conses_high.cadr(start_tail) : CommonSymbols.ZERO_INTEGER;
		SubLObject end_tail = cdestructuring_bind.property_list_member(stream_macros.$kw15$END, current);
		SubLObject end = SubLNil.NIL != end_tail ? conses_high.cadr(end_tail) : SubLNil.NIL;
		SubLObject body;
		current = body = temp;
		return with_input_from_string_internal(var, string, index, start, end, body);
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 2184L)
	public static SubLObject with_input_from_string_internal(SubLObject var, SubLObject string, SubLObject index,
			SubLObject start, SubLObject end, SubLObject body) {
		return ConsesLow
				.list(stream_macros.$sym0$CLET,
						ConsesLow
								.list(var),
						ConsesLow.list(stream_macros.$sym3$CUNWIND_PROTECT,
								ConsesLow.listS(stream_macros.$sym4$PROGN,
										ConsesLow.list(stream_macros.$sym5$CSETQ, var,
												ConsesLow.list(stream_macros.$sym16$MAKE_PRIVATE_STRING_INPUT_STREAM,
														string, start, end)),
										ConsesLow.append(body,
												SubLNil.NIL != index
														? ConsesLow.list(ConsesLow.list(stream_macros.$sym7$CSETF,
																index,
																ConsesLow.list(stream_macros.$sym17$STREAM_INPUT_INDEX,
																		var)))
														: SubLNil.NIL,
												SubLNil.NIL)),
								ConsesLow.list(stream_macros.$sym9$CLOSE, var)));
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 3046L)
	public static SubLObject with_open_file(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject stream = SubLNil.NIL;
		SubLObject filespec = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
		stream = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list21);
		filespec = current.first();
		SubLObject keys;
		current = keys = current.rest();
		SubLObject body;
		current = body = temp;
		return ConsesLow.listS(stream_macros.$sym22$WITH_OPEN_STREAM, ConsesLow.list(stream,
				ConsesLow.listS(stream_macros.$sym23$OPEN, filespec, ConsesLow.append(keys, SubLNil.NIL))),
				ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 2512L)
	public static SubLObject with_open_stream(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject var = SubLNil.NIL;
		SubLObject stream = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
		var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list18);
		stream = current.first();
		current = current.rest();
		if (SubLNil.NIL == current) {
			SubLObject body;
			current = body = temp;
			SubLObject stream_var = Symbols.make_symbol(stream_macros.$str19$STREAM_VAR);
			return ConsesLow.list(stream_macros.$sym0$CLET, ConsesLow.list(stream_var),
					ConsesLow.list(stream_macros.$sym3$CUNWIND_PROTECT, ConsesLow.list(stream_macros.$sym4$PROGN,
							ConsesLow.list(stream_macros.$sym5$CSETQ, stream_var, stream),
							ConsesLow.listS(stream_macros.$sym0$CLET, ConsesLow.list(ConsesLow.list(var, stream_var)),
									ConsesLow.append(body, SubLNil.NIL))),
							ConsesLow.list(stream_macros.$sym20$PWHEN, stream_var,
									ConsesLow.list(stream_macros.$sym9$CLOSE, stream_var))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, stream_macros.$list18);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/stream-macros.lisp", position = 4170L)
	public static SubLObject with_stream_lock(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject stream = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, stream_macros.$list35);
		stream = current.first();
		SubLObject body;
		current = body = current.rest();
		SubLObject lock = Symbols.make_symbol(stream_macros.$str36$LOCK_VAR);
		return ConsesLow.list(stream_macros.$sym0$CLET,
				ConsesLow.list(ConsesLow.list(lock, ConsesLow.list(stream_macros.$sym37$STREAM_LOCK, stream))),
				ConsesLow.list(stream_macros.$sym38$PIF, ConsesLow.list(stream_macros.$sym39$LOCK_P, lock),
						ConsesLow.list(stream_macros.$sym40$WITH_LOCK_HELD, ConsesLow.list(lock),
								reader.bq_cons(stream_macros.$sym4$PROGN, ConsesLow.append(body, SubLNil.NIL))),
						reader.bq_cons(stream_macros.$sym4$PROGN, ConsesLow.append(body, SubLNil.NIL))));
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros";
	@SubL(source = "sublisp/stream-macros.lisp", position = 1051L)
	public static SubLSymbol $stream_requires_locking$;
	private static SubLSymbol $sym0$CLET;
	private static SubLList $list1;
	private static SubLList $list2;
	private static SubLSymbol $sym3$CUNWIND_PROTECT;
	private static SubLSymbol $sym4$PROGN;
	private static SubLSymbol $sym5$CSETQ;
	private static SubLList $list6;
	private static SubLSymbol $sym7$CSETF;
	private static SubLSymbol $sym8$GET_OUTPUT_STREAM_STRING;
	private static SubLSymbol $sym9$CLOSE;
	private static SubLList $list10;
	private static SubLList $list11;
	private static SubLSymbol $kw12$ALLOW_OTHER_KEYS;
	private static SubLSymbol $kw13$INDEX;
	private static SubLSymbol $kw14$START;
	private static SubLSymbol $kw15$END;
	private static SubLSymbol $sym16$MAKE_PRIVATE_STRING_INPUT_STREAM;
	private static SubLSymbol $sym17$STREAM_INPUT_INDEX;
	private static SubLList $list18;
	private static SubLString $str19$STREAM_VAR;
	private static SubLSymbol $sym20$PWHEN;
	private static SubLList $list21;
	private static SubLSymbol $sym22$WITH_OPEN_STREAM;
	private static SubLSymbol $sym23$OPEN;
	private static SubLList $list24;
	private static SubLString $str25$LENGTH;
	private static SubLSymbol $sym26$LENGTH;
	private static SubLSymbol $sym27$PUNLESS;
	private static SubLList $list28;
	private static SubLSymbol $sym29$MUST;
	private static SubLSymbol $sym30$__;
	private static SubLString $str31$Negative_start_index__D_given_for;
	private static SubLSymbol $sym32$__;
	private static SubLString $str33$The_end_index__D_given_for__S_is_;
	private static SubLString $str34$The_start_index__D_given_for__S_i;
	private static SubLList $list35;
	private static SubLString $str36$LOCK_VAR;
	private static SubLSymbol $sym37$STREAM_LOCK;
	private static SubLSymbol $sym38$PIF;
	private static SubLSymbol $sym39$LOCK_P;
	private static SubLSymbol $sym40$WITH_LOCK_HELD;
	private static SubLList $list41;
	private static SubLSymbol $sym42$STREAM_STREAM_TYPE;
	private static SubLList $list43;
	static {
		me = new stream_macros();
		stream_macros.$stream_requires_locking$ = null;
		$sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
		$list1 = ConsesLow
				.list(ConsesLow.list(SubLObjectFactory.makeSymbol("*STREAM-REQUIRES-LOCKING*"), SubLNil.NIL));
		$list2 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM-VAR"), SubLObjectFactory.makeSymbol("RESULT-VAR")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$sym3$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		$sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym5$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		$list6 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")));
		$sym7$CSETF = SubLObjectFactory.makeSymbol("CSETF");
		$sym8$GET_OUTPUT_STREAM_STRING = SubLObjectFactory.makeSymbol("GET-OUTPUT-STREAM-STRING");
		$sym9$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
		$list10 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("STRING"),
						SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("INDEX"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("START"), CommonSymbols.ZERO_INTEGER),
						SubLObjectFactory.makeSymbol("END")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$list11 = ConsesLow.list(SubLObjectFactory.makeKeyword("INDEX"), SubLObjectFactory.makeKeyword("START"),
				SubLObjectFactory.makeKeyword("END"));
		$kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		$kw13$INDEX = SubLObjectFactory.makeKeyword("INDEX");
		$kw14$START = SubLObjectFactory.makeKeyword("START");
		$kw15$END = SubLObjectFactory.makeKeyword("END");
		$sym16$MAKE_PRIVATE_STRING_INPUT_STREAM = SubLObjectFactory.makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM");
		$sym17$STREAM_INPUT_INDEX = SubLObjectFactory.makeSymbol("STREAM-INPUT-INDEX");
		$list18 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("STREAM")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str19$STREAM_VAR = SubLObjectFactory.makeString("STREAM-VAR");
		$sym20$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$list21 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("FILESPEC"),
						SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("KEYS")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$sym22$WITH_OPEN_STREAM = SubLObjectFactory.makeSymbol("WITH-OPEN-STREAM");
		$sym23$OPEN = SubLObjectFactory.makeSymbol("OPEN");
		$list24 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("SEQUENCE"), SubLObjectFactory.makeSymbol("START-VAR"),
						SubLObjectFactory.makeSymbol("END-VAR")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str25$LENGTH = SubLObjectFactory.makeString("LENGTH");
		$sym26$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
		$sym27$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
		$list28 = ConsesLow.list(CommonSymbols.ZERO_INTEGER);
		$sym29$MUST = SubLObjectFactory.makeSymbol("MUST");
		$sym30$__ = SubLObjectFactory.makeSymbol(">=");
		$str31$Negative_start_index__D_given_for = SubLObjectFactory
				.makeString("Negative start index ~D given for ~S.");
		$sym32$__ = SubLObjectFactory.makeSymbol("<=");
		$str33$The_end_index__D_given_for__S_is_ = SubLObjectFactory
				.makeString("The end index ~D given for ~S is greater than the length, ~D.");
		$str34$The_start_index__D_given_for__S_i = SubLObjectFactory
				.makeString("The start index ~D given for ~S is greater than the end index ~D.");
		$list35 = ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		$str36$LOCK_VAR = SubLObjectFactory.makeString("LOCK-VAR");
		$sym37$STREAM_LOCK = SubLObjectFactory.makeSymbol("STREAM-LOCK");
		$sym38$PIF = SubLObjectFactory.makeSymbol("PIF");
		$sym39$LOCK_P = SubLObjectFactory.makeSymbol("LOCK-P");
		$sym40$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
		$list41 = ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"));
		$sym42$STREAM_STREAM_TYPE = SubLObjectFactory.makeSymbol("STREAM-STREAM-TYPE");
		$list43 = ConsesLow.list(SubLObjectFactory.makeKeyword("SYNONYM"));
	}

	@Override
	public void declareFunctions() {
		declare_stream_macros_file();
	}

	@Override
	public void initializeVariables() {
		init_stream_macros_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_stream_macros_file();
	}
}
