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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cdestructuring_bind extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new cdestructuring_bind();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind";
	public static SubLList $list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("PATTERN"),
			SubLObjectFactory.makeSymbol("DATUM"), SubLObjectFactory.makeSymbol("&BODY"),
			SubLObjectFactory.makeSymbol("BODY"));

	//// Definitions

	public static SubLString $str1$DATUM = SubLObjectFactory.makeString("DATUM");

	public static SubLSymbol $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLSymbol $sym3$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");

	public static SubLSymbol $sym4$NULL = SubLObjectFactory.makeSymbol("NULL");

	public static SubLSymbol $sym5$CDESTRUCTURING_BIND_ERROR = SubLObjectFactory
			.makeSymbol("CDESTRUCTURING-BIND-ERROR");

	public static SubLList $list6 = ConsesLow.list(CommonSymbols.NIL);

	public static SubLString $str7$CURRENT = SubLObjectFactory.makeString("CURRENT");

	public static SubLSymbol $sym8$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");

	public static SubLString $str9$The_value__S_failed_to_match_the_ = SubLObjectFactory
			.makeString("The value ~S failed to match the ~S pattern ~S.");

	public static SubLSymbol $sym10$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");

	public static SubLList $list11 = ConsesLow.list(SubLObjectFactory.makeSymbol("FORM"));

	public static SubLList $list12 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("ERROR"),
			SubLObjectFactory.makeString("Malformed pattern ~S."), SubLObjectFactory.makeSymbol("PATTERN")));

	public static SubLString $str13$Malformed_pattern__S_ = SubLObjectFactory.makeString("Malformed pattern ~S.");

	public static SubLSymbol $sym14$_WHOLE = SubLObjectFactory.makeSymbol("&WHOLE");

	public static SubLList $list15 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"),
			SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("&BODY"),
			SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("&AUX"));

	public static SubLSymbol $sym16$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	public static SubLSymbol $sym17$DESTRUCTURING_BIND_MUST_CONSP = SubLObjectFactory
			.makeSymbol("DESTRUCTURING-BIND-MUST-CONSP");

	public static SubLSymbol $sym18$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");

	public static SubLSymbol $sym19$FIRST = SubLObjectFactory.makeSymbol("FIRST");

	//// Internal Constants

	public static SubLSymbol $sym20$CPOP = SubLObjectFactory.makeSymbol("CPOP");
	public static SubLString $str21$TEMP = SubLObjectFactory.makeString("TEMP");
	public static SubLSymbol $sym22$REST = SubLObjectFactory.makeSymbol("REST");
	public static SubLSymbol $sym23$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
	public static SubLSymbol $sym24$PCOND = SubLObjectFactory.makeSymbol("PCOND");
	public static SubLList $list25 = ConsesLow.list(SubLObjectFactory.makeSymbol("&REST"),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("&KEY"),
			SubLObjectFactory.makeSymbol("&AUX"));
	public static SubLSymbol $sym26$FIF = SubLObjectFactory.makeSymbol("FIF");
	public static SubLSymbol $sym27$CONSP = SubLObjectFactory.makeSymbol("CONSP");
	public static SubLSymbol $sym28$DESTRUCTURING_BIND_MUST_LISTP = SubLObjectFactory
			.makeSymbol("DESTRUCTURING-BIND-MUST-LISTP");
	public static SubLList $list29 = ConsesLow.list(SubLObjectFactory.makeSymbol("&REST"),
			SubLObjectFactory.makeSymbol("&BODY"));
	public static SubLSymbol $sym30$_KEY = SubLObjectFactory.makeSymbol("&KEY");
	public static SubLSymbol $sym31$_ALLOW_OTHER_KEYS = SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS");
	public static SubLSymbol $sym32$_AUX = SubLObjectFactory.makeSymbol("&AUX");
	public static SubLString $str33$ALLOW_OTHER_KEYS_P = SubLObjectFactory.makeString("ALLOW-OTHER-KEYS-P");
	public static SubLString $str34$REST = SubLObjectFactory.makeString("REST");
	public static SubLString $str35$BAD = SubLObjectFactory.makeString("BAD");
	public static SubLSymbol $sym36$CDO = SubLObjectFactory.makeSymbol("CDO");
	public static SubLSymbol $sym37$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
	public static SubLList $list38 = ConsesLow.list(CommonSymbols.T);
	public static SubLSymbol $sym39$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
	public static SubLList $list40 = ConsesLow.list(SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS"));
	public static SubLSymbol $sym41$CAND = SubLObjectFactory.makeSymbol("CAND");
	public static SubLSymbol $sym42$CNOT = SubLObjectFactory.makeSymbol("CNOT");
	public static SubLList $list43 = ConsesLow.list(SubLObjectFactory.makeSymbol("&AUX"));
	public static SubLString $str44$_TAIL = SubLObjectFactory.makeString("-TAIL");
	public static SubLSymbol $sym45$PROPERTY_LIST_MEMBER = SubLObjectFactory.makeSymbol("PROPERTY-LIST-MEMBER");
	public static SubLSymbol $sym46$CADR = SubLObjectFactory.makeSymbol("CADR");
	public static SubLList $list47 = ConsesLow.list(CommonSymbols.T, CommonSymbols.NIL);

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2361)
	public static SubLObject bogus_unless(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject form = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list11);
			form = current.first();
			current = current.rest();
			if (CommonSymbols.NIL == current)
				return ConsesLow.listS(cdestructuring_bind.$sym3$PUNLESS, form, cdestructuring_bind.$list12);
			else
				cdestructuring_bind.cdestructuring_bind_error(datum, cdestructuring_bind.$list11);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 992)
	public static SubLObject cdestructuring_bind(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject pattern = CommonSymbols.NIL;
			SubLObject datum_1 = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list0);
			pattern = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, cdestructuring_bind.$list0);
			datum_1 = current.first();
			current = current.rest();
			{
				SubLObject body = current;
				if (CommonSymbols.NIL == pattern) {
					SubLObject datum_var = Symbols.make_symbol(cdestructuring_bind.$str1$DATUM);
					return ConsesLow
							.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.list(ConsesLow.list(datum_var, datum_1)),
									ConsesLow.list(cdestructuring_bind.$sym3$PUNLESS,
											ConsesLow.list(cdestructuring_bind.$sym4$NULL, datum_var),
											ConsesLow.listS(cdestructuring_bind.$sym5$CDESTRUCTURING_BIND_ERROR,
													datum_var, cdestructuring_bind.$list6)),
									ConsesLow.append(body, CommonSymbols.NIL));
				} else {
					SubLObject original = Symbols.make_symbol(cdestructuring_bind.$str1$DATUM);
					SubLObject datum_var = Symbols.make_symbol(cdestructuring_bind.$str7$CURRENT);
					return ConsesLow
							.listS(cdestructuring_bind.$sym2$CLET,
									ConsesLow.list(ConsesLow.list(original, datum_1),
											ConsesLow.list(datum_var, original)),
									ConsesLow.append(cdestructuring_bind.destructuring_bind_Xwhole(pattern, datum_var,
											ConsesLow.list(cdestructuring_bind.$sym5$CDESTRUCTURING_BIND_ERROR,
													original, ConsesLow.list(cdestructuring_bind.$sym8$QUOTE, pattern)),
											body), CommonSymbols.NIL));
				}
			}
		}
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1600)
	public static SubLObject cdestructuring_bind_error(SubLObject original, SubLObject pattern) {
		return Errors.error(cdestructuring_bind.$str9$The_value__S_failed_to_match_the_, original,
				cdestructuring_bind.$sym10$CDESTRUCTURING_BIND, pattern);
	}

	public static SubLObject declare_cdestructuring_bind_file() {
		SubLFiles.declareMacro(cdestructuring_bind.myName, "cdestructuring_bind", "CDESTRUCTURING-BIND");
		SubLFiles.declareFunction(cdestructuring_bind.myName, "cdestructuring_bind_error", "CDESTRUCTURING-BIND-ERROR",
				2, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_must_consp",
				"DESTRUCTURING-BIND-MUST-CONSP", 3, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_must_listp",
				"DESTRUCTURING-BIND-MUST-LISTP", 3, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "property_list_member", "PROPERTY-LIST-MEMBER", 2, 0,
				false);
		SubLFiles.declareMacro(cdestructuring_bind.myName, "bogus_unless", "BOGUS-UNLESS");
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_Xwhole", "DESTRUCTURING-BIND-&WHOLE",
				4, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_required_args",
				"DESTRUCTURING-BIND-REQUIRED-ARGS", 4, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_Xoptional",
				"DESTRUCTURING-BIND-&OPTIONAL", 4, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_end_of_the_line",
				"DESTRUCTURING-BIND-END-OF-THE-LINE", 3, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_more_Xoptional",
				"DESTRUCTURING-BIND-MORE-&OPTIONAL", 4, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_Xrest", "DESTRUCTURING-BIND-&REST", 4,
				0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_Xkey", "DESTRUCTURING-BIND-&KEY", 4,
				0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_more_Xkey",
				"DESTRUCTURING-BIND-MORE-&KEY", 4, 0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_Xaux", "DESTRUCTURING-BIND-&AUX", 4,
				0, false);
		SubLFiles.declareFunction(cdestructuring_bind.myName, "destructuring_bind_more_Xaux",
				"DESTRUCTURING-BIND-MORE-&AUX", 4, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4918)
	public static SubLObject destructuring_bind_end_of_the_line(SubLObject datum, SubLObject error, SubLObject body) {
		return ConsesLow
				.list(ConsesLow
						.list(cdestructuring_bind.$sym24$PCOND,
								reader.bq_cons(ConsesLow.list(cdestructuring_bind.$sym4$NULL, datum),
										ConsesLow.append(body, CommonSymbols.NIL)),
								ConsesLow.list(CommonSymbols.T, error)));
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10940)
	public static SubLObject destructuring_bind_more_Xaux(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (CommonSymbols.NIL == pattern)
			return body;
		else if (pattern.isCons()) {
			SubLObject current = pattern.first();
			SubLObject var = CommonSymbols.NIL;
			SubLObject init = CommonSymbols.NIL;
			if (current.isCons()) {
				var = current.first();
				current = current.rest();
				if (CommonSymbols.NIL != current) {
					if (!current.isCons())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					init = current.first();
					if (CommonSymbols.NIL != current.rest())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				}
			} else
				var = current;
			if (!var.isSymbol())
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
					ConsesLow.list(ConsesLow.list(var, init)),
					ConsesLow.append(
							cdestructuring_bind.destructuring_bind_more_Xaux(pattern.rest(), datum, error, body),
							CommonSymbols.NIL)));
		} else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 8659)
	public static SubLObject destructuring_bind_more_Xkey(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == pattern)
				return Values.values(body, CommonSymbols.NIL);
			else if (pattern.isCons()) {
				SubLObject current = pattern.first();
				if (CommonSymbols.NIL != conses_high.member(current, cdestructuring_bind.$list43,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
					return cdestructuring_bind.destructuring_bind_Xaux(pattern, datum, error, body);
				else {
					SubLObject var = CommonSymbols.NIL;
					SubLObject v_default = CommonSymbols.NIL;
					SubLObject keyword = CommonSymbols.NIL;
					SubLObject suppliedp = CommonSymbols.NIL;
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
						if (CommonSymbols.NIL != current) {
							if (!current.isCons())
								Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
							v_default = current.first();
							current = current.rest();
							if (CommonSymbols.NIL != current) {
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
					{
						SubLObject form = cdestructuring_bind.destructuring_bind_more_Xkey(pattern, datum, error, body);
						SubLObject keywords = thread.secondMultipleValue();
						thread.resetMultipleValues();
						{
							SubLObject var_tail = Symbols.make_symbol(
									Sequences.cconcatenate(Symbols.symbol_name(var), cdestructuring_bind.$str44$_TAIL));
							if (CommonSymbols.NIL != suppliedp) {
								SubLObject temp = Symbols.make_symbol(cdestructuring_bind.$str21$TEMP);
								return Values.values(
										ConsesLow.list(ConsesLow.list(cdestructuring_bind.$sym2$CLET, ConsesLow.list(
												ConsesLow.list(var_tail,
														ConsesLow.list(cdestructuring_bind.$sym45$PROPERTY_LIST_MEMBER,
																ConsesLow.list(cdestructuring_bind.$sym8$QUOTE,
																		keyword),
																datum)),
												ConsesLow.list(var,
														ConsesLow.list(cdestructuring_bind.$sym26$FIF, var_tail,
																ConsesLow.list(cdestructuring_bind.$sym46$CADR,
																		var_tail),
																v_default)),
												ConsesLow.list(temp, var_tail)),
												ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
														ConsesLow.list(ConsesLow.list(suppliedp,
																ConsesLow.listS(cdestructuring_bind.$sym26$FIF, temp,
																		cdestructuring_bind.$list47))),
														ConsesLow.append(form, CommonSymbols.NIL)))),
										ConsesLow.cons(keyword, keywords));
							} else
								return Values.values(
										ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.list(
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
												ConsesLow.append(form, CommonSymbols.NIL))),
										ConsesLow.cons(keyword, keywords));
						}
					}
				}
			} else
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 5045)
	public static SubLObject destructuring_bind_more_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (CommonSymbols.NIL == pattern)
			return cdestructuring_bind.destructuring_bind_end_of_the_line(datum, error, body);
		else if (pattern.isCons()) {
			SubLObject current = pattern.first();
			if (CommonSymbols.NIL != conses_high.member(current, cdestructuring_bind.$list25, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				return cdestructuring_bind.destructuring_bind_Xrest(pattern, datum, error, body);
			else {
				SubLObject var = CommonSymbols.NIL;
				SubLObject v_default = CommonSymbols.NIL;
				SubLObject suppliedp = CommonSymbols.NIL;
				if (current.isCons()) {
					var = current.first();
					current = current.rest();
					if (CommonSymbols.NIL != current) {
						if (!current.isCons())
							Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
						v_default = current.first();
						current = current.rest();
						if (CommonSymbols.NIL != current) {
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
				return ConsesLow.list(ConsesLow.listS(
						cdestructuring_bind.$sym2$CLET, reader.bq_cons(
								ConsesLow.list(var,
										ConsesLow.list(cdestructuring_bind.$sym26$FIF, ConsesLow
												.list(cdestructuring_bind.$sym27$CONSP, datum),
												ConsesLow.list(cdestructuring_bind.$sym19$FIRST, datum), v_default)),
								ConsesLow.append(CommonSymbols.NIL != suppliedp
										? (SubLObject) ConsesLow.list(ConsesLow.list(suppliedp,
												ConsesLow.list(cdestructuring_bind.$sym27$CONSP, datum)))
										: CommonSymbols.NIL, CommonSymbols.NIL)),
						ConsesLow.listS(cdestructuring_bind.$sym28$DESTRUCTURING_BIND_MUST_LISTP, datum,
								ConsesLow.append(error.rest(), CommonSymbols.NIL)),
						ConsesLow.list(cdestructuring_bind.$sym20$CPOP, datum),
						ConsesLow.append(cdestructuring_bind.destructuring_bind_more_Xoptional(pattern.rest(), datum,
								error, body), CommonSymbols.NIL)));
			}
		} else if (pattern.isSymbol())
			return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
					ConsesLow.list(ConsesLow.list(pattern, datum)), ConsesLow.append(body, CommonSymbols.NIL)));
		else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1784)
	public static SubLObject destructuring_bind_must_consp(SubLObject object, SubLObject original, SubLObject pattern) {
		if (!object.isCons())
			return cdestructuring_bind.cdestructuring_bind_error(original, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 1950)
	public static SubLObject destructuring_bind_must_listp(SubLObject object, SubLObject original, SubLObject pattern) {
		if (!object.isList())
			return cdestructuring_bind.cdestructuring_bind_error(original, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2927)
	public static SubLObject destructuring_bind_required_args(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		{
			SubLObject vars = CommonSymbols.NIL;
			SubLObject setqs = CommonSymbols.NIL;
			SubLObject done = CommonSymbols.NIL;
			for (; !(CommonSymbols.NIL != done || !pattern.isCons());) {
				SubLObject current = pattern.first();
				if (CommonSymbols.NIL != conses_high.member(current, cdestructuring_bind.$list15,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
					done = CommonSymbols.T;
				else if (current.isSymbol()) {
					vars = ConsesLow.cons(current, vars);
					setqs = ConsesLow.cons(ConsesLow.list(cdestructuring_bind.$sym16$PROGN,
							ConsesLow.listS(cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, datum,
									ConsesLow.append(error.rest(), CommonSymbols.NIL)),
							ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, current,
									ConsesLow.list(cdestructuring_bind.$sym19$FIRST, datum)),
							ConsesLow.list(cdestructuring_bind.$sym20$CPOP, datum)), setqs);
					pattern = pattern.rest();
				} else {
					SubLObject temp = Symbols.make_symbol(cdestructuring_bind.$str21$TEMP);
					return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, Sequences.nreverse(vars),
							ConsesLow.append(Sequences.nreverse(setqs), ConsesLow.list(
									ConsesLow.listS(
											cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP, datum,
											ConsesLow.append(error.rest(), CommonSymbols.NIL)),
									ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
											ConsesLow.list(ConsesLow.list(temp,
													ConsesLow.list(cdestructuring_bind.$sym22$REST, datum))),
											ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, datum,
													ConsesLow.list(cdestructuring_bind.$sym19$FIRST, datum)),
											ConsesLow.append(
													cdestructuring_bind.destructuring_bind_Xwhole(pattern.first(),
															datum, error,
															reader.bq_cons(
																	ConsesLow.list(cdestructuring_bind.$sym18$CSETQ,
																			datum, temp),
																	ConsesLow.append(cdestructuring_bind
																			.destructuring_bind_required_args(
																					pattern.rest(), datum, error, body),
																			CommonSymbols.NIL))),
													CommonSymbols.NIL))))));
				}
			}
			vars = Sequences.nreverse(vars);
			setqs = Sequences.nreverse(setqs);
			if (CommonSymbols.NIL == vars)
				return cdestructuring_bind.destructuring_bind_Xoptional(pattern, datum, error, body);
			else if (pattern.isList())
				return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET, vars,
						ConsesLow.append(setqs,
								cdestructuring_bind.destructuring_bind_Xoptional(pattern, datum, error, body),
								CommonSymbols.NIL)));
			else if (pattern.isSymbol())
				return ConsesLow.list(
						ConsesLow.listS(cdestructuring_bind.$sym2$CLET, ConsesLow.append(vars, ConsesLow.list(pattern)),
								ConsesLow.append(setqs,
										reader.bq_cons(ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, pattern, datum),
												ConsesLow.append(body, CommonSymbols.NIL)))));
			else
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 10581)
	public static SubLObject destructuring_bind_Xaux(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (CommonSymbols.NIL == pattern)
			return body;
		else if (pattern.isCons()) {
			if (pattern.first() == cdestructuring_bind.$sym32$_AUX) {
				pattern = pattern.rest();
				if (!pattern.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				return cdestructuring_bind.destructuring_bind_more_Xaux(pattern, datum, error, body);
			} else
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		} else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6837)
	public static SubLObject destructuring_bind_Xkey(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == pattern)
				return cdestructuring_bind.destructuring_bind_end_of_the_line(datum, error, body);
			else if (pattern.isCons()) {
				if (pattern.first() == cdestructuring_bind.$sym30$_KEY) {
					pattern = pattern.rest();
					if (!pattern.isCons())
						Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
					{
						SubLObject allow_other_keys_p = CommonSymbols.NIL;
						{
							SubLObject done = CommonSymbols.NIL;
							SubLObject rest = CommonSymbols.NIL;
							for (rest = pattern; !(CommonSymbols.NIL != done || CommonSymbols.NIL != allow_other_keys_p
									|| CommonSymbols.NIL == rest); rest = rest.rest()) {
								if (!rest.isCons())
									Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
								if (rest.first() == cdestructuring_bind.$sym31$_ALLOW_OTHER_KEYS)
									allow_other_keys_p = CommonSymbols.T;
								if (rest.first() == cdestructuring_bind.$sym32$_AUX)
									done = CommonSymbols.T;
							}
						}
						if (CommonSymbols.NIL != allow_other_keys_p)
							return cdestructuring_bind.destructuring_bind_more_Xkey(Sequences.remove(
									cdestructuring_bind.$sym31$_ALLOW_OTHER_KEYS, pattern, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
									CommonSymbols.UNPROVIDED), datum, error, body);
						else {
							thread.resetMultipleValues();
							{
								SubLObject form = cdestructuring_bind.destructuring_bind_more_Xkey(pattern, datum,
										error, body);
								SubLObject keywords = thread.secondMultipleValue();
								thread.resetMultipleValues();
								{
									SubLObject allow_other_keys_var = Symbols
											.make_symbol(cdestructuring_bind.$str33$ALLOW_OTHER_KEYS_P);
									SubLObject rest = Symbols.make_symbol(cdestructuring_bind.$str34$REST);
									SubLObject bad = Symbols.make_symbol(cdestructuring_bind.$str35$BAD);
									SubLObject current = Symbols.make_symbol(cdestructuring_bind.$str7$CURRENT);
									return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
											ConsesLow.list(
													reader.bq_cons(allow_other_keys_var, cdestructuring_bind.$list6)),
											ConsesLow.list(cdestructuring_bind.$sym2$CLET,
													ConsesLow.list(ConsesLow.list(rest, datum),
															reader.bq_cons(bad, cdestructuring_bind.$list6), current),
													ConsesLow.list(new SubLObject[] { cdestructuring_bind.$sym36$CDO,
															CommonSymbols.NIL,
															ConsesLow.list(ConsesLow
																	.list(cdestructuring_bind.$sym4$NULL, rest)),
															ConsesLow.listS(
																	cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP,
																	rest,
																	ConsesLow.append(error.rest(), CommonSymbols.NIL)),
															ConsesLow.list(cdestructuring_bind.$sym18$CSETQ, current,
																	ConsesLow.list(cdestructuring_bind.$sym19$FIRST,
																			rest)),
															ConsesLow.list(cdestructuring_bind.$sym20$CPOP, rest),
															ConsesLow.listS(
																	cdestructuring_bind.$sym17$DESTRUCTURING_BIND_MUST_CONSP,
																	rest,
																	ConsesLow.append(error.rest(), CommonSymbols.NIL)),
															ConsesLow.list(cdestructuring_bind.$sym3$PUNLESS,
																	ConsesLow.list(cdestructuring_bind.$sym37$MEMBER,
																			current, ConsesLow
																					.list(cdestructuring_bind.$sym8$QUOTE,
																							keywords)),
																	ConsesLow.listS(cdestructuring_bind.$sym18$CSETQ,
																			bad, cdestructuring_bind.$list38)),
															ConsesLow.list(
																	cdestructuring_bind.$sym39$PWHEN,
																	ConsesLow.listS(
																			CommonSymbols.EQ, current,
																			cdestructuring_bind.$list40),
																	ConsesLow.list(cdestructuring_bind.$sym18$CSETQ,
																			allow_other_keys_var,
																			ConsesLow.list(
																					cdestructuring_bind.$sym19$FIRST,
																					rest))),
															ConsesLow.list(cdestructuring_bind.$sym20$CPOP, rest) }),
													ConsesLow.list(cdestructuring_bind.$sym39$PWHEN,
															ConsesLow.list(cdestructuring_bind.$sym41$CAND, bad,
																	ConsesLow.list(cdestructuring_bind.$sym42$CNOT,
																			allow_other_keys_var)),
															error)),
											ConsesLow.append(form, CommonSymbols.NIL)));
								}
							}
						}
					}
				} else
					return cdestructuring_bind.destructuring_bind_Xaux(pattern, datum, error, body);
			} else
				Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 4380)
	public static SubLObject destructuring_bind_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (CommonSymbols.NIL == pattern)
			return cdestructuring_bind.destructuring_bind_end_of_the_line(datum, error, body);
		else if (pattern.isCons()) {
			if (pattern.first() == cdestructuring_bind.$sym23$_OPTIONAL) {
				pattern = pattern.rest();
				if (!pattern.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				return cdestructuring_bind.destructuring_bind_more_Xoptional(pattern, datum, error, body);
			} else
				return cdestructuring_bind.destructuring_bind_Xrest(pattern, datum, error, body);
		} else if (pattern.isSymbol())
			return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
					ConsesLow.list(ConsesLow.list(pattern, datum)), ConsesLow.append(body, CommonSymbols.NIL)));
		else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 6285)
	public static SubLObject destructuring_bind_Xrest(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (CommonSymbols.NIL == pattern)
			return cdestructuring_bind.destructuring_bind_end_of_the_line(datum, error, body);
		else if (pattern.isCons()) {
			if (CommonSymbols.NIL != conses_high.member(pattern.first(), cdestructuring_bind.$list29,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
				pattern = pattern.rest();
				if (!pattern.isCons())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
						ConsesLow.list(ConsesLow.list(pattern.first(), datum)),
						ConsesLow.append(
								CommonSymbols.NIL != pattern.rest() ? (SubLObject) cdestructuring_bind
										.destructuring_bind_Xkey(pattern.rest(), datum, error, body) : body,
								CommonSymbols.NIL)));
			} else
				return cdestructuring_bind.destructuring_bind_Xkey(pattern, datum, error, body);
		} else
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2461)
	public static SubLObject destructuring_bind_Xwhole(SubLObject pattern, SubLObject datum, SubLObject error,
			SubLObject body) {
		if (!pattern.isCons())
			Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
		if (pattern.first() == cdestructuring_bind.$sym14$_WHOLE) {
			pattern = pattern.rest();
			{
				SubLObject var = pattern.first();
				if (!var.isSymbol())
					Errors.error(cdestructuring_bind.$str13$Malformed_pattern__S_, pattern);
				pattern = pattern.rest();
				return ConsesLow.list(ConsesLow.listS(cdestructuring_bind.$sym2$CLET,
						ConsesLow.list(ConsesLow.list(var, datum)),
						ConsesLow.append(
								CommonSymbols.NIL != pattern ? (SubLObject) cdestructuring_bind
										.destructuring_bind_required_args(pattern, datum, error, body) : body,
								CommonSymbols.NIL)));
			}
		} else
			return cdestructuring_bind.destructuring_bind_required_args(pattern, datum, error, body);
	}

	public static SubLObject init_cdestructuring_bind_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/cdestructuring-bind.lisp", position = 2116)
	public static SubLObject property_list_member(SubLObject property, SubLObject plist) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = plist; CommonSymbols.NIL != rest; rest = conses_high.cddr(rest)) {
				SubLObject candidate_property = rest.first();
				if (property == candidate_property)
					return rest;
			}
			return CommonSymbols.NIL;
		}
	}

	public static SubLObject setup_cdestructuring_bind_file() {
		// CVS_ID("Id: cdestructuring-bind.lisp 126834 2009-01-15 23:07:06Z
		// goolsbey ");
		return CommonSymbols.NIL;
	}

	private cdestructuring_bind() {
	}

	//// Initializers

	public void declareFunctions() {
		cdestructuring_bind.declare_cdestructuring_bind_file();
	}

	public void initializeVariables() {
		cdestructuring_bind.init_cdestructuring_bind_file();
	}

	public void runTopLevelForms() {
		cdestructuring_bind.setup_cdestructuring_bind_file();
	}

}
