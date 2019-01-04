//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
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

public class condition_macros extends SubLTranslatedFile {
	public static SubLObject declare_condition_macros_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros", "with_simple_restart",
				"WITH-SIMPLE-RESTART");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"with_simple_restart_internal", "WITH-SIMPLE-RESTART-INTERNAL", 4, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"with_sublisp_error_handling", "WITH-SUBLISP-ERROR-HANDLING");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"with_sublisp_error_handling_internal", "WITH-SUBLISP-ERROR-HANDLING-INTERNAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"with_error_handler_internal", "WITH-ERROR-HANDLER-INTERNAL", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros", "ignore_errors",
				"IGNORE-ERRORS");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"ignore_errors_internal", "IGNORE-ERRORS-INTERNAL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros",
				"ignore_errors_handler", "IGNORE-ERRORS-HANDLER", 0, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 3219L)
	public static SubLObject ignore_errors(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ignore_errors_internal(body);
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 3839L)
	public static SubLObject ignore_errors_handler() {
		Dynamic.sublisp_throw(condition_macros.$kw14$IGNORE_ERRORS_TARGET, SubLNil.NIL);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 3586L)
	public static SubLObject ignore_errors_internal(SubLObject body) {
		SubLObject tag = Symbols.make_symbol(condition_macros.$str13$IGNORE_ERRORS_TAG);
		return ConsesLow.list(condition_macros.$sym3$CLET, ConsesLow.list(tag),
				ConsesLow.list(condition_macros.$sym10$CCATCH, condition_macros.$kw14$IGNORE_ERRORS_TARGET, tag,
						ConsesLow.list(condition_macros.$sym5$IGNORE, tag),
						ConsesLow.listS(condition_macros.$sym15$WITH_ERROR_HANDLER, condition_macros.$list16,
								ConsesLow.append(body, SubLNil.NIL))));
	}

	public static SubLObject init_condition_macros_file() {
		return SubLNil.NIL;
	}

	public static SubLObject setup_condition_macros_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 2532L)
	public static SubLObject with_error_handler_internal(SubLObject handler, SubLObject body) {
		return ConsesLow.listS(condition_macros.$sym3$CLET,
				ConsesLow.list(ConsesLow.list(condition_macros.$sym12$_ERROR_HANDLER_, handler)),
				ConsesLow.append(body, SubLNil.NIL));
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 820L)
	public static SubLObject with_simple_restart(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject name = SubLNil.NIL;
		SubLObject format_control = SubLNil.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, condition_macros.$list0);
		format_control = current.first();
		SubLObject format_arguments;
		current = format_arguments = current.rest();
		SubLObject body;
		current = body = temp;
		return with_simple_restart_internal(name, format_control, format_arguments, body);
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 1331L)
	public static SubLObject with_simple_restart_internal(SubLObject name, SubLObject format_control,
			SubLObject format_arguments, SubLObject body) {
		SubLObject tag = Symbols.make_symbol(condition_macros.$str1$RESTART_TAG);
		SubLObject dummy = Symbols.make_symbol(condition_macros.$str2$DUMMY);
		return ConsesLow.list(condition_macros.$sym3$CLET,
				ConsesLow.list(ConsesLow.list(tag,
						SubLNil.NIL != name ? ConsesLow.list(condition_macros.$sym4$QUOTE, name)
								: ConsesLow.list(condition_macros.$sym4$QUOTE, tag)),
						dummy),
				ConsesLow.list(condition_macros.$sym5$IGNORE, dummy),
				ConsesLow.list(condition_macros.$sym3$CLET,
						ConsesLow.list(ConsesLow.list(condition_macros.$sym6$_RESTARTS_,
								ConsesLow.listS(condition_macros.$sym7$CONS,
										ConsesLow.listS(condition_macros.$sym8$LIST, tag, format_control,
												ConsesLow.append(format_arguments, SubLNil.NIL)),
										condition_macros.$list9))),
						ConsesLow.listS(condition_macros.$sym10$CCATCH, tag, dummy,
								ConsesLow.append(body, SubLNil.NIL))));
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 1738L)
	public static SubLObject with_sublisp_error_handling(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return with_sublisp_error_handling_internal(body);
	}

	@SubL(source = "sublisp/condition-macros.lisp", position = 2440L)
	public static SubLObject with_sublisp_error_handling_internal(SubLObject body) {
		return reader.bq_cons(condition_macros.$sym11$PROGN, ConsesLow.append(body, SubLNil.NIL));
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros";
	private static SubLList $list0;
	private static SubLString $str1$RESTART_TAG;
	private static SubLString $str2$DUMMY;
	private static SubLSymbol $sym3$CLET;
	private static SubLSymbol $sym4$QUOTE;
	private static SubLSymbol $sym5$IGNORE;
	private static SubLSymbol $sym6$_RESTARTS_;
	private static SubLSymbol $sym7$CONS;
	private static SubLSymbol $sym8$LIST;
	private static SubLList $list9;
	private static SubLSymbol $sym10$CCATCH;
	private static SubLSymbol $sym11$PROGN;
	private static SubLSymbol $sym12$_ERROR_HANDLER_;
	private static SubLString $str13$IGNORE_ERRORS_TAG;
	private static SubLSymbol $kw14$IGNORE_ERRORS_TARGET;
	private static SubLSymbol $sym15$WITH_ERROR_HANDLER;
	private static SubLList $list16;
	static {
		me = new condition_macros();
		$list0 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("FORMAT-CONTROL"),
						SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("FORMAT-ARGUMENTS")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$str1$RESTART_TAG = SubLObjectFactory.makeString("RESTART-TAG");
		$str2$DUMMY = SubLObjectFactory.makeString("DUMMY");
		$sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym4$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		$sym5$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
		$sym6$_RESTARTS_ = SubLObjectFactory.makeSymbol("*RESTARTS*");
		$sym7$CONS = SubLObjectFactory.makeSymbol("CONS");
		$sym8$LIST = SubLObjectFactory.makeSymbol("LIST");
		$list9 = ConsesLow.list(SubLObjectFactory.makeSymbol("*RESTARTS*"));
		$sym10$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
		$sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym12$_ERROR_HANDLER_ = SubLObjectFactory.makeSymbol("*ERROR-HANDLER*");
		$str13$IGNORE_ERRORS_TAG = SubLObjectFactory.makeString("IGNORE-ERRORS-TAG");
		$kw14$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
		$sym15$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
		$list16 = ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"),
				SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER"));
	}

	@Override
	public void declareFunctions() {
		declare_condition_macros_file();
	}

	@Override
	public void initializeVariables() {
		init_condition_macros_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_condition_macros_file();
	}
}
