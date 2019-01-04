//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cdestructuring_bind extends SubLTranslatedFile {
	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2360L)
	public static SubLObject bogus_unless(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject form = SubLNil.NIL;
		destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list11);
		form = current.first();
		current = current.rest();
		if (SubLNil.NIL == current)
			return ConsesLow.listS(cdestructuring_bind.$sym3$PUNLESS, form, cdestructuring_bind.$list12);
		cdestructuring_bind_error(datum, cdestructuring_bind.$list11);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 991L)
	public static SubLObject cdestructuring_bind(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject pattern = SubLNil.NIL;
		SubLObject datum_$1 = SubLNil.NIL;
		destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list0);
		pattern = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list0);
		datum_$1 = current.first();
		SubLObject body;
		current = body = current.rest();
		if (SubLNil.NIL == pattern) {
			SubLObject datum_var = Symbols.make_symbol(cdestructuring_bind.$str1$DATUM);
			return ConsesLow
					.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.list(ConsesLow.list(datum_var, datum_$1)),
							ConsesLow
									.list(cdestructuring_bind.$sym3$PUNLESS,
											ConsesLow.list(cdestructuring_bind.$sym4$NULL, datum_var),
											ConsesLow.listS(cdestructuring_bind.$sym5$CDESTRUCTURING_BIND_ERROR,
													datum_var, cdestructuring_bind.$list6)),
							ConsesLow.append(body, SubLNil.NIL));
		}
		SubLObject original = Symbols.make_symbol(cdestructuring_bind.$str1$DATUM);
		SubLObject datum_var2 = Symbols.make_symbol(cdestructuring_bind.$str7$CURRENT);
		return ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
				ConsesLow.list(ConsesLow.list(original, datum_$1), ConsesLow.list(datum_var2, original)),
				ConsesLow.append(
						destructuring_bind_Xwhole(pattern, datum_var2,
								ConsesLow.list(cdestructuring_bind.$sym5$CDESTRUCTURING_BIND_ERROR, original,
										ConsesLow.list(cdestructuring_bind.$sym8$QUOTE, pattern)),
								body),
						SubLNil.NIL));
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1599L)
	public static SubLObject cdestructuring_bind_error(SubLObject original, SubLObject pattern) {
		return Errors.error(cdestructuring_bind.$str9$The_value__S_failed_to_match_the_, original,
				cdestructuring_bind.$sym10$CDESTRUCTURING_BIND, pattern);
	}

	public static SubLObject declare_cdestructuring_bind_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"cdestructuring_bind", "CDESTRUCTURING-BIND");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"cdestructuring_bind_error", "CDESTRUCTURING-BIND-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_must_consp", "DESTRUCTURING-BIND-MUST-CONSP", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_must_listp", "DESTRUCTURING-BIND-MUST-LISTP", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"property_list_member", "PROPERTY-LIST-MEMBER", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind", "bogus_unless",
				"BOGUS-UNLESS");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_Xwhole", "DESTRUCTURING-BIND-&WHOLE", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_required_args", "DESTRUCTURING-BIND-REQUIRED-ARGS", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_Xoptional", "DESTRUCTURING-BIND-&OPTIONAL", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_end_of_the_line", "DESTRUCTURING-BIND-END-OF-THE-LINE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_more_Xoptional", "DESTRUCTURING-BIND-MORE-&OPTIONAL", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_Xrest", "DESTRUCTURING-BIND-&REST", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_Xkey", "DESTRUCTURING-BIND-&KEY", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_more_Xkey", "DESTRUCTURING-BIND-MORE-&KEY", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_Xaux", "DESTRUCTURING-BIND-&AUX", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind",
				"destructuring_bind_more_Xaux", "DESTRUCTURING-BIND-MORE-&AUX", 4, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4917L)
	public static SubLObject destructuring_bind_end_of_the_line(SubLObject datum, SubLObject error, SubLObject body) {
		return ConsesLow
				.list(ConsesLow
						.list(cdestructuring_bind.$sym24$PCOND,
								reader.bq_cons(ConsesLow.list(cdestructuring_bind.$sym4$NULL, datum),
										ConsesLow.append(body, SubLNil.NIL)),
								ConsesLow.list(CommonSymbols.T, error)));
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10939L)
	public static SubLObject destructuring_bind_more_Xaux(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (SubLNil.NIL == pattern)
			return body;
		if (pattern.isCons()) {
			SubLObject current = pattern.first();
			SubLObject var = SubLNil.NIL;
			SubLObject init = SubLNil.NIL;
			if (current.isCons()) {
				var = current.first();
				current = current.rest();
				if (SubLNil.NIL != current) {
					if (!current.isCons())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					init = current.first();
					if (SubLNil.NIL != current.rest())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				}
			} else
				var = current;
			if (!var.isSymbol())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return ConsesLow
					.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.list(ConsesLow.list(var, init)),
							ConsesLow.append(destructuring_bind_more_Xaux(pattern.rest(), datum, error, body),
									SubLNil.NIL)));
		}
		Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 8658L)
	public static SubLObject destructuring_bind_more_Xkey(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == pattern)
			return Values.values(body, SubLNil.NIL);
		if (!pattern.isCons()) {
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return SubLNil.NIL;
		}
		SubLObject current = pattern.first();
		if (SubLNil.NIL != conses_high.member(current, cdestructuring_bind.$list43, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED))
			return destructuring_bind_Xaux(pattern, datum, error, body);
		SubLObject var = SubLNil.NIL;
		SubLObject v_default = SubLNil.NIL;
		SubLObject keyword = SubLNil.NIL;
		SubLObject suppliedp = SubLNil.NIL;
		pattern = pattern.rest();
		if (current.isCons()) {
			var = current.first();
			if (var.isCons()) {
				keyword = var.first();
				if (!keyword.isSymbol())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				if (!var.rest().isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				var = conses_high.second(var);
			} else
				keyword = Symbols.make_keyword(var);
			current = current.rest();
			if (SubLNil.NIL != current) {
				if (!current.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				v_default = current.first();
				current = current.rest();
				if (SubLNil.NIL != current) {
					if (!current.isCons())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					suppliedp = current.first();
					if (!suppliedp.isSymbol())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				}
			}
		} else {
			var = current;
			keyword = Symbols.make_keyword(var);
		}
		if (!var.isSymbol())
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		thread.resetMultipleValues();
		SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
		SubLObject keywords = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject var_tail = Symbols
				.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(var), cdestructuring_bind.$str44$_TAIL));
		if (SubLNil.NIL != suppliedp) {
			SubLObject temp = Symbols.make_symbol(cdestructuring_bind.$str21$TEMP);
			return Values.values(
					ConsesLow.list(ConsesLow.list(cdestructuring_bind.$sym2$CLET,
							ConsesLow.list(
									ConsesLow.list(
											var_tail,
											ConsesLow.list(cdestructuring_bind.$sym45$PROPERTY_LIST_MEMBER,
													ConsesLow.list(cdestructuring_bind.$sym8$QUOTE, keyword), datum)),
									ConsesLow.list(var, ConsesLow.list(cdestructuring_bind.$sym26$FIF, var_tail,
											ConsesLow.list(cdestructuring_bind.$sym46$CADR, var_tail), v_default)),
									ConsesLow.list(temp, var_tail)),
							ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
									ConsesLow.list(ConsesLow.list(suppliedp,
											ConsesLow.listS(cdestructuring_bind.$sym26$FIF, temp,
													cdestructuring_bind.$list47))),
									ConsesLow.append(form, SubLNil.NIL)))),
					ConsesLow.cons(keyword, keywords));
		}
		return Values
				.values(ConsesLow
						.list(ConsesLow
								.listS(cdestructuring_bind.$sym2$CLET,
										ConsesLow.list(
												ConsesLow.list(var_tail,
														ConsesLow.list(cdestructuring_bind.$sym45$PROPERTY_LIST_MEMBER,
																ConsesLow.list(cdestructuring_bind.$sym8$QUOTE,
																		keyword),
																datum)),
												ConsesLow.list(var,
														ConsesLow.list(cdestructuring_bind.$sym26$FIF, var_tail,
																ConsesLow.list(cdestructuring_bind.$sym46$CADR,
																		var_tail),
																v_default))),
										ConsesLow.append(form, SubLNil.NIL))),
						ConsesLow.cons(keyword, keywords));
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 5044L)
	public static SubLObject destructuring_bind_more_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (SubLNil.NIL == pattern)
			return destructuring_bind_end_of_the_line(datum, error, body);
		if (pattern.isCons()) {
			SubLObject current = pattern.first();
			if (SubLNil.NIL != conses_high.member(current, cdestructuring_bind.$list25, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				return destructuring_bind_Xrest(pattern, datum, error, body);
			SubLObject var = SubLNil.NIL;
			SubLObject v_default = SubLNil.NIL;
			SubLObject suppliedp = SubLNil.NIL;
			if (current.isCons()) {
				var = current.first();
				current = current.rest();
				if (SubLNil.NIL != current) {
					if (!current.isCons())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					v_default = current.first();
					current = current.rest();
					if (SubLNil.NIL != current) {
						if (!current.isCons())
							Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
						suppliedp = current.first();
						if (!suppliedp.isSymbol())
							Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					}
				}
			} else
				var = current;
			if (!var.isSymbol())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return ConsesLow.list(
					ConsesLow.listS(
							cdestructuring_bind.$sym2$CLET, reader
									.bq_cons(
											ConsesLow.list(var, ConsesLow.list(cdestructuring_bind.$sym26$FIF,
													ConsesLow.list(cdestructuring_bind.$sym27$CONSP, datum), ConsesLow
															.list(cdestructuring_bind.$sym19$FIRST, datum),
													v_default)),
											ConsesLow.append(
													SubLNil.NIL != suppliedp
															? ConsesLow.list(ConsesLow.list(suppliedp,
																	ConsesLow.list(cdestructuring_bind.$sym27$CONSP,
																			datum)))
															: SubLNil.NIL,
													SubLNil.NIL)),
							ConsesLow.listS(cdestructuring_bind.$sym28$DESTRUCTURING_BIND_MUST_LISTP, datum,
									ConsesLow.append(error.rest(), SubLNil.NIL)),
							ConsesLow.list(cdestructuring_bind.$sym20$CPOP, datum),
							ConsesLow.append(destructuring_bind_more_Xoptional(pattern.rest(), datum, error, body),
									SubLNil.NIL)));
		} else {
			if (pattern.isSymbol())
				return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
						ConsesLow.list(ConsesLow.list(pattern, datum)), ConsesLow.append(body, SubLNil.NIL)));
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return SubLNil.NIL;
		}
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1783L)
	public static SubLObject destructuring_bind_must_consp(SubLObject object, SubLObject original, SubLObject pattern) {
		if (!object.isCons())
			return cdestructuring_bind_error(original, pattern);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1949L)
	public static SubLObject destructuring_bind_must_listp(SubLObject object, SubLObject original, SubLObject pattern) {
		if (!object.isList())
			return cdestructuring_bind_error(original, pattern);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2926L)
	public static SubLObject destructuring_bind_required_args(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		SubLObject vars = SubLNil.NIL;
		SubLObject setqs = SubLNil.NIL;
		SubLObject done = SubLNil.NIL;
		while (SubLNil.NIL == done && pattern.isCons()) {
			SubLObject current = pattern.first();
			if (SubLNil.NIL != conses_high.member(current, cdestructuring_bind.$list15, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				done = CommonSymbols.T;
			else {
				if (!current.isSymbol()) {
					SubLObject temp = Symbols.make_symbol(cdestructuring_bind.$str21$TEMP);
					return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, Sequences.nreverse(vars),
							ConsesLow.append(Sequences.nreverse(setqs), ConsesLow.list(
									ConsesLow.listS(
											cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, datum,
											ConsesLow.append(error.rest(), SubLNil.NIL)),
									ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
											ConsesLow.list(ConsesLow.list(temp,
													ConsesLow.list(cdestructuring_bind.$sym22$REST, datum))),
											ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, datum,
													ConsesLow.list(cdestructuring_bind.$sym19$FIRST, datum)),
											ConsesLow.append(
													destructuring_bind_Xwhole(pattern.first(), datum, error,
															reader.bq_cons(
																	ConsesLow.list(cdestructuring_bind.$sym18$CSETQ,
																			datum, temp),
																	ConsesLow.append(
																			destructuring_bind_required_args(
																					pattern.rest(), datum, error, body),
																			SubLNil.NIL))),
													SubLNil.NIL))))));
				}
				vars = ConsesLow.cons(current, vars);
				setqs = ConsesLow.cons(ConsesLow.list(cdestructuring_bind.$sym16$PROGN,
						ConsesLow.listS(cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, datum,
								ConsesLow.append(error.rest(), SubLNil.NIL)),
						ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, current,
								ConsesLow.list(cdestructuring_bind.$sym19$FIRST, datum)),
						ConsesLow.list(cdestructuring_bind.$sym20$CPOP, datum)), setqs);
				pattern = pattern.rest();
			}
		}
		vars = Sequences.nreverse(vars);
		setqs = Sequences.nreverse(setqs);
		if (SubLNil.NIL == vars)
			return destructuring_bind_Xoptional(pattern, datum, error, body);
		if (pattern.isList())
			return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, vars, ConsesLow.append(setqs,
					destructuring_bind_Xoptional(pattern, datum, error, body), SubLNil.NIL)));
		if (pattern.isSymbol())
			return ConsesLow.list(
					ConsesLow.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.append(vars, ConsesLow.list(pattern)),
							ConsesLow.append(setqs,
									reader.bq_cons(ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, pattern, datum),
											ConsesLow.append(body, SubLNil.NIL)))));
		Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10580L)
	public static SubLObject destructuring_bind_Xaux(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (SubLNil.NIL == pattern)
			return body;
		if (pattern.isCons()) {
			if (pattern.first() == cdestructuring_bind.$sym32$_AUX) {
				pattern = pattern.rest();
				if (!pattern.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				return destructuring_bind_more_Xaux(pattern, datum, error, body);
			}
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		} else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6836L)
	public static SubLObject destructuring_bind_Xkey(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (SubLNil.NIL == pattern)
			return destructuring_bind_end_of_the_line(datum, error, body);
		if (!pattern.isCons()) {
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return SubLNil.NIL;
		}
		if (pattern.first() != cdestructuring_bind.$sym30$_KEY)
			return destructuring_bind_Xaux(pattern, datum, error, body);
		pattern = pattern.rest();
		if (!pattern.isCons())
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		SubLObject allow_other_keys_p;
		SubLObject done;
		SubLObject rest;
		for (allow_other_keys_p = SubLNil.NIL, done = SubLNil.NIL, rest = SubLNil.NIL, rest = pattern; SubLNil.NIL == done
				&& SubLNil.NIL == allow_other_keys_p && SubLNil.NIL != rest; rest = rest.rest()) {
			if (!rest.isCons())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			if (rest.first() == cdestructuring_bind.$sym31$_ALLOW_OTHER_KEYS)
				allow_other_keys_p = CommonSymbols.T;
			if (rest.first() == cdestructuring_bind.$sym32$_AUX)
				done = CommonSymbols.T;
		}
		if (SubLNil.NIL != allow_other_keys_p)
			return destructuring_bind_more_Xkey(Sequences.remove(cdestructuring_bind.$sym31$_ALLOW_OTHER_KEYS, pattern,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), datum, error, body);
		thread.resetMultipleValues();
		SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
		SubLObject keywords = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject allow_other_keys_var = Symbols.make_symbol(cdestructuring_bind.$str33$ALLOW_OTHER_KEYS_P);
		SubLObject rest2 = Symbols.make_symbol(cdestructuring_bind.$str34$REST);
		SubLObject bad = Symbols.make_symbol(cdestructuring_bind.$str35$BAD);
		SubLObject current = Symbols.make_symbol(cdestructuring_bind.$str7$CURRENT);
		return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
				ConsesLow.list(reader.bq_cons(allow_other_keys_var, cdestructuring_bind.$list6)),
				ConsesLow.list(cdestructuring_bind.$sym2$CLET,
						ConsesLow.list(ConsesLow.list(rest2, datum), reader.bq_cons(bad, cdestructuring_bind.$list6),
								current),
						ConsesLow.list(new SubLObject[] { cdestructuring_bind.$sym36$CDO, SubLNil.NIL,
								ConsesLow.list(ConsesLow.list(cdestructuring_bind.$sym4$NULL, rest2)),
								ConsesLow.listS(cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, rest2,
										ConsesLow.append(error.rest(), SubLNil.NIL)),
								ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, current,
										ConsesLow.list(cdestructuring_bind.$sym19$FIRST, rest2)),
								ConsesLow.list(cdestructuring_bind.$sym20$CPOP, rest2),
								ConsesLow.listS(cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, rest2,
										ConsesLow.append(error.rest(), SubLNil.NIL)),
								ConsesLow.list(cdestructuring_bind.$sym3$PUNLESS,
										ConsesLow.list(cdestructuring_bind.$sym37$MEMBER, current,
												ConsesLow.list(cdestructuring_bind.$sym8$QUOTE, keywords)),
										ConsesLow.listS(cdestructuring_bind.$sym18$CSETQ, bad,
												cdestructuring_bind.$list38)),
								ConsesLow.list(cdestructuring_bind.$sym39$PWHEN,
										ConsesLow.listS(CommonSymbols.EQ, current, cdestructuring_bind.$list40),
										ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, allow_other_keys_var,
												ConsesLow.list(cdestructuring_bind.$sym19$FIRST, rest2))),
								ConsesLow.list(cdestructuring_bind.$sym20$CPOP, rest2) }),
						ConsesLow.list(cdestructuring_bind.$sym39$PWHEN,
								ConsesLow.list(cdestructuring_bind.$sym41$CAND, bad,
										ConsesLow.list(cdestructuring_bind.$sym42$CNOT, allow_other_keys_var)),
								error)),
				ConsesLow.append(form, SubLNil.NIL)));
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4379L)
	public static SubLObject destructuring_bind_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (SubLNil.NIL == pattern)
			return destructuring_bind_end_of_the_line(datum, error, body);
		if (pattern.isCons()) {
			if (pattern.first() == cdestructuring_bind.$sym23$_OPTIONAL) {
				pattern = pattern.rest();
				if (!pattern.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				return destructuring_bind_more_Xoptional(pattern, datum, error, body);
			}
			return destructuring_bind_Xrest(pattern, datum, error, body);
		} else {
			if (pattern.isSymbol())
				return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
						ConsesLow.list(ConsesLow.list(pattern, datum)), ConsesLow.append(body, SubLNil.NIL)));
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return SubLNil.NIL;
		}
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6284L)
	public static SubLObject destructuring_bind_Xrest(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (SubLNil.NIL == pattern)
			return destructuring_bind_end_of_the_line(datum, error, body);
		if (!pattern.isCons()) {
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return SubLNil.NIL;
		}
		if (SubLNil.NIL != conses_high.member(pattern.first(), cdestructuring_bind.$list29,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
			pattern = pattern.rest();
			if (!pattern.isCons())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
					ConsesLow.list(ConsesLow.list(pattern.first(), datum)),
					ConsesLow.append(
							SubLNil.NIL != pattern.rest()
									? destructuring_bind_Xkey(pattern.rest(), datum, error, body) : body,
							SubLNil.NIL)));
		}
		return destructuring_bind_Xkey(pattern, datum, error, body);
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2460L)
	public static SubLObject destructuring_bind_Xwhole(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (!pattern.isCons())
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		if (pattern.first() == cdestructuring_bind.$sym14$_WHOLE) {
			pattern = pattern.rest();
			SubLObject var = pattern.first();
			if (!var.isSymbol())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			pattern = pattern.rest();
			return ConsesLow
					.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.list(ConsesLow.list(var, datum)),
							ConsesLow.append(
									SubLNil.NIL != pattern
											? destructuring_bind_required_args(pattern, datum, error, body) : body,
									SubLNil.NIL)));
		}
		return destructuring_bind_required_args(pattern, datum, error, body);
	}

	public static SubLObject init_cdestructuring_bind_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2115L)
	public static SubLObject property_list_member(SubLObject property, SubLObject plist) {
		SubLObject rest;
		SubLObject candidate_property;
		for (rest = SubLNil.NIL, rest = plist; SubLNil.NIL != rest; rest = conses_high.cddr(rest)) {
			candidate_property = rest.first();
			if (property.eql(candidate_property))
				return rest;
		}
		return SubLNil.NIL;
	}

	public static SubLObject setup_cdestructuring_bind_file() {
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind";
	private static SubLList $list0;
	private static SubLString $str1$DATUM;
	private static SubLSymbol $sym2$CLET;
	private static SubLSymbol $sym3$PUNLESS;
	private static SubLSymbol $sym4$NULL;
	private static SubLSymbol $sym5$CDESTRUCTURING_BIND_ERROR;
	private static SubLList $list6;
	private static SubLString $str7$CURRENT;
	private static SubLSymbol $sym8$QUOTE;
	private static SubLString $str9$The_value__S_failed_to_match_the_;
	private static SubLSymbol $sym10$CDESTRUCTURING_BIND;
	private static SubLList $list11;
	private static SubLList $list12;
	private static SubLString $str13$Malformed_pattern__S_;
	private static SubLSymbol $sym14$_WHOLE;
	private static SubLList $list15;
	private static SubLSymbol $sym16$PROGN;
	private static SubLSymbol $sym17$DESTRUCTURING_BIND_MUST_CONSP;
	private static SubLSymbol $sym18$CSETQ;
	private static SubLSymbol $sym19$FIRST;
	private static SubLSymbol $sym20$CPOP;
	private static SubLString $str21$TEMP;
	private static SubLSymbol $sym22$REST;
	private static SubLSymbol $sym23$_OPTIONAL;
	private static SubLSymbol $sym24$PCOND;
	private static SubLList $list25;
	private static SubLSymbol $sym26$FIF;
	private static SubLSymbol $sym27$CONSP;
	private static SubLSymbol $sym28$DESTRUCTURING_BIND_MUST_LISTP;
	private static SubLList $list29;
	private static SubLSymbol $sym30$_KEY;
	private static SubLSymbol $sym31$_ALLOW_OTHER_KEYS;
	private static SubLSymbol $sym32$_AUX;
	private static SubLString $str33$ALLOW_OTHER_KEYS_P;
	private static SubLString $str34$REST;
	private static SubLString $str35$BAD;
	private static SubLSymbol $sym36$CDO;
	private static SubLSymbol $sym37$MEMBER;
	private static SubLList $list38;
	private static SubLSymbol $sym39$PWHEN;
	private static SubLList $list40;
	private static SubLSymbol $sym41$CAND;
	private static SubLSymbol $sym42$CNOT;
	private static SubLList $list43;
	private static SubLString $str44$_TAIL;
	private static SubLSymbol $sym45$PROPERTY_LIST_MEMBER;
	private static SubLSymbol $sym46$CADR;
	private static SubLList $list47;
	static {
		me = new cdestructuring_bind();
		$list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("PATTERN"), SubLObjectFactory.makeSymbol("DATUM"),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str1$DATUM = SubLObjectFactory.makeString("DATUM");
		$sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym3$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
		$sym4$NULL = SubLObjectFactory.makeSymbol("NULL");
		$sym5$CDESTRUCTURING_BIND_ERROR = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND-ERROR");
		$list6 = ConsesLow.list(SubLNil.NIL);
		$str7$CURRENT = SubLObjectFactory.makeString("CURRENT");
		$sym8$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		$str9$The_value__S_failed_to_match_the_ = SubLObjectFactory
				.makeString("The value ~S failed to match the ~S pattern ~S.");
		$sym10$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
		$list11 = ConsesLow.list(SubLObjectFactory.makeSymbol("FORM"));
		$list12 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("ERROR"),
				SubLObjectFactory.makeString("Malformed pattern ~S."), SubLObjectFactory.makeSymbol("PATTERN")));
		$str13$Malformed_pattern__S_ = SubLObjectFactory.makeString("Malformed pattern ~S.");
		$sym14$_WHOLE = SubLObjectFactory.makeSymbol("&WHOLE");
		$list15 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("&REST"),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("&KEY"),
				SubLObjectFactory.makeSymbol("&AUX"));
		$sym16$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym17$DESTRUCTURING_BIND_MUST_CONSP = SubLObjectFactory.makeSymbol("DESTRUCTURING-BIND-MUST-CONSP");
		$sym18$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		$sym19$FIRST = SubLObjectFactory.makeSymbol("FIRST");
		$sym20$CPOP = SubLObjectFactory.makeSymbol("CPOP");
		$str21$TEMP = SubLObjectFactory.makeString("TEMP");
		$sym22$REST = SubLObjectFactory.makeSymbol("REST");
		$sym23$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
		$sym24$PCOND = SubLObjectFactory.makeSymbol("PCOND");
		$list25 = ConsesLow.list(SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("&AUX"));
		$sym26$FIF = SubLObjectFactory.makeSymbol("FIF");
		$sym27$CONSP = SubLObjectFactory.makeSymbol("CONSP");
		$sym28$DESTRUCTURING_BIND_MUST_LISTP = SubLObjectFactory.makeSymbol("DESTRUCTURING-BIND-MUST-LISTP");
		$list29 = ConsesLow.list(SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("&BODY"));
		$sym30$_KEY = SubLObjectFactory.makeSymbol("&KEY");
		$sym31$_ALLOW_OTHER_KEYS = SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS");
		$sym32$_AUX = SubLObjectFactory.makeSymbol("&AUX");
		$str33$ALLOW_OTHER_KEYS_P = SubLObjectFactory.makeString("ALLOW-OTHER-KEYS-P");
		$str34$REST = SubLObjectFactory.makeString("REST");
		$str35$BAD = SubLObjectFactory.makeString("BAD");
		$sym36$CDO = SubLObjectFactory.makeSymbol("CDO");
		$sym37$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
		$list38 = ConsesLow.list(CommonSymbols.T);
		$sym39$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$list40 = ConsesLow.list(SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS"));
		$sym41$CAND = SubLObjectFactory.makeSymbol("CAND");
		$sym42$CNOT = SubLObjectFactory.makeSymbol("CNOT");
		$list43 = ConsesLow.list(SubLObjectFactory.makeSymbol("&AUX"));
		$str44$_TAIL = SubLObjectFactory.makeString("-TAIL");
		$sym45$PROPERTY_LIST_MEMBER = SubLObjectFactory.makeSymbol("PROPERTY-LIST-MEMBER");
		$sym46$CADR = SubLObjectFactory.makeSymbol("CADR");
		$list47 = ConsesLow.list(CommonSymbols.T, SubLNil.NIL);
	}

	@Override
	public void declareFunctions() {
		declare_cdestructuring_bind_file();
	}

	@Override
	public void initializeVariables() {
		init_cdestructuring_bind_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_cdestructuring_bind_file();
	}
}
