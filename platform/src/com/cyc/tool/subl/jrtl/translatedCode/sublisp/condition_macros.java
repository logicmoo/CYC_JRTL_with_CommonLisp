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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class condition_macros extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new condition_macros();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros";
	public static SubLList $list0 = ConsesLow.list(
			ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("FORMAT-CONTROL"),
					SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("FORMAT-ARGUMENTS")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));

	//// Definitions

	public static SubLString $str1$RESTART_TAG = SubLObjectFactory.makeString("RESTART-TAG");

	public static SubLString $str2$DUMMY = SubLObjectFactory.makeString("DUMMY");

	public static SubLSymbol $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");

	public static SubLSymbol $sym4$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");

	public static SubLSymbol $sym5$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");

	public static SubLSymbol $sym6$_RESTARTS_ = SubLObjectFactory.makeSymbol("*RESTARTS*");

	public static SubLSymbol $sym7$CONS = SubLObjectFactory.makeSymbol("CONS");

	public static SubLSymbol $sym8$LIST = SubLObjectFactory.makeSymbol("LIST");

	public static SubLList $list9 = ConsesLow.list(SubLObjectFactory.makeSymbol("*RESTARTS*"));

	public static SubLSymbol $sym10$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");

	public static SubLSymbol $sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");

	//// Internal Constants

	public static SubLSymbol $sym12$_ERROR_HANDLER_ = SubLObjectFactory.makeSymbol("*ERROR-HANDLER*");
	public static SubLString $str13$IGNORE_ERRORS_TAG = SubLObjectFactory.makeString("IGNORE-ERRORS-TAG");
	public static SubLSymbol $kw14$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
	public static SubLSymbol $sym15$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
	public static SubLList $list16 = ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"),
			SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER"));

	public static SubLObject declare_condition_macros_file() {
		SubLFiles.declareMacro(condition_macros.myName, "with_simple_restart", "WITH-SIMPLE-RESTART");
		SubLFiles.declareFunction(condition_macros.myName, "with_simple_restart_internal",
				"WITH-SIMPLE-RESTART-INTERNAL", 4, 0, false);
		SubLFiles.declareMacro(condition_macros.myName, "with_sublisp_error_handling", "WITH-SUBLISP-ERROR-HANDLING");
		SubLFiles.declareFunction(condition_macros.myName, "with_sublisp_error_handling_internal",
				"WITH-SUBLISP-ERROR-HANDLING-INTERNAL", 1, 0, false);
		SubLFiles.declareFunction(condition_macros.myName, "with_error_handler_internal", "WITH-ERROR-HANDLER-INTERNAL",
				2, 0, false);
		SubLFiles.declareMacro(condition_macros.myName, "ignore_errors", "IGNORE-ERRORS");
		SubLFiles.declareFunction(condition_macros.myName, "ignore_errors_internal", "IGNORE-ERRORS-INTERNAL", 1, 0,
				false);
		SubLFiles.declareFunction(condition_macros.myName, "ignore_errors_handler", "IGNORE-ERRORS-HANDLER", 0, 0,
				false);
		
		//assert $list16.second().toSymbol().getPackage().getName().equals("SUBLISP");
		if($list16.second().toSymbol().getPackage().getName().equals("CYC")) {
			Errors.error("Wrong package for IGNORE-ERRORS-HANDLER! ");
		}
		
		return CommonSymbols.NIL;
	}

	/**
	 * Execute BODY as an implicit progn, until it either finishes or any error
	 * occurs.
	 */
	@SubL(source = "sublisp/condition-macros.lisp", position = 3220)
	public static SubLObject ignore_errors(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return condition_macros.ignore_errors_internal(body);
		}
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 3840)
	public static SubLObject ignore_errors_handler() {
		Dynamic.sublisp_throw(condition_macros.$kw14$IGNORE_ERRORS_TARGET, CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 3587)
	public static SubLObject ignore_errors_internal(SubLObject body) {
		{
			SubLObject tag = Symbols.make_symbol(condition_macros.$str13$IGNORE_ERRORS_TAG);
			return ConsesLow.list(condition_macros.$sym3$CLET, ConsesLow.list(tag),
					ConsesLow.list(condition_macros.$sym10$CCATCH, condition_macros.$kw14$IGNORE_ERRORS_TARGET, tag,
							ConsesLow.list(condition_macros.$sym5$IGNORE, tag),
							ConsesLow.listS(condition_macros.$sym15$WITH_ERROR_HANDLER, condition_macros.$list16,
									ConsesLow.append(body, CommonSymbols.NIL))));
		}
	}

	public static SubLObject init_condition_macros_file() {
		SubLSymbol symbol = SubLSymbolFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*",SubLPackage.SUBLISP_PACKAGE);
		symbol.setValue(T);
		symbol = SubLSymbolFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*",SubLPackage.CYC_PACKAGE);
		symbol.setValue(T);
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_condition_macros_file() {
		// CVS_ID("Id: condition-macros.lisp 126834 2009-01-15 23:07:06Z
		// goolsbey ");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 2533)
	public static SubLObject with_error_handler_internal(SubLObject handler, SubLObject body) {
		return ConsesLow.listS(condition_macros.$sym3$CLET,
				ConsesLow.list(ConsesLow.list(condition_macros.$sym12$_ERROR_HANDLER_, handler)),
				ConsesLow.append(body, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 821)
	public static SubLObject with_simple_restart(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
			{
				SubLObject temp = current.rest();
				current = current.first();
				{
					SubLObject name = CommonSymbols.NIL;
					SubLObject format_control = CommonSymbols.NIL;
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
					name = current.first();
					current = current.rest();
					cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
					format_control = current.first();
					current = current.rest();
					{
						SubLObject format_arguments = current;
						current = temp;
						{
							SubLObject body = current;
							return condition_macros.with_simple_restart_internal(name, format_control, format_arguments,
									body);
						}
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 1332)
	public static SubLObject with_simple_restart_internal(SubLObject name, SubLObject format_control,
			SubLObject format_arguments, SubLObject body) {
		{
			SubLObject tag = Symbols.make_symbol(condition_macros.$str1$RESTART_TAG);
			SubLObject dummy = Symbols.make_symbol(condition_macros.$str2$DUMMY);
			return ConsesLow.list(condition_macros.$sym3$CLET,
					ConsesLow.list(ConsesLow.list(tag,
							CommonSymbols.NIL != name ? (SubLObject) ConsesLow.list(condition_macros.$sym4$QUOTE, name)
									: ConsesLow.list(condition_macros.$sym4$QUOTE, tag)),
							dummy),
					ConsesLow.list(condition_macros.$sym5$IGNORE, dummy),
					ConsesLow.list(condition_macros.$sym3$CLET,
							ConsesLow.list(ConsesLow.list(condition_macros.$sym6$_RESTARTS_,
									ConsesLow.listS(condition_macros.$sym7$CONS,
											ConsesLow.listS(condition_macros.$sym8$LIST, tag, format_control,
													ConsesLow.append(format_arguments, CommonSymbols.NIL)),
											condition_macros.$list9))),
							ConsesLow.listS(condition_macros.$sym10$CCATCH, tag, dummy,
									ConsesLow.append(body, CommonSymbols.NIL))));
		}
	}

	/** Trampoline CYC-LISP:ERROR to SL:ERROR. */
	@SubL(source = "sublisp/condition-macros.lisp", position = 1739)
	public static SubLObject with_sublisp_error_handling(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return condition_macros.with_sublisp_error_handling_internal(body);
		}
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 2441)
	public static SubLObject with_sublisp_error_handling_internal(SubLObject body) {
		return reader.bq_cons(condition_macros.$sym11$PROGN, ConsesLow.append(body, CommonSymbols.NIL));
	}

	private condition_macros() {
	}

	//// Initializers

	public void declareFunctions() {
		condition_macros.declare_condition_macros_file();
	}

	public void initializeVariables() {
		condition_macros.init_condition_macros_file();
	}

	public void runTopLevelForms() {
		condition_macros.setup_condition_macros_file();
	}

}
