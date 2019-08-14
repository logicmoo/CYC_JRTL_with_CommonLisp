/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class condition_macros extends SubLTranslatedFile {
    public static SubLObject declare_condition_macros_file() {
        declareMacro("with_simple_restart", "WITH-SIMPLE-RESTART");
        declareFunction("with_simple_restart_internal", "WITH-SIMPLE-RESTART-INTERNAL", 4, 0, false);
        declareMacro("with_sublisp_error_handling", "WITH-SUBLISP-ERROR-HANDLING");
        declareFunction("with_sublisp_error_handling_internal", "WITH-SUBLISP-ERROR-HANDLING-INTERNAL", 1, 0, false);
        declareFunction("with_error_handler_internal", "WITH-ERROR-HANDLER-INTERNAL", 2, 0, false);
        declareMacro("ignore_errors", "IGNORE-ERRORS");
        declareFunction("ignore_errors_internal", "IGNORE-ERRORS-INTERNAL", 1, 0, false);
        declareFunction("ignore_errors_handler", "IGNORE-ERRORS-HANDLER", 0, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject ignore_errors(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return ignore_errors_internal(body);
    }

    public static SubLObject ignore_errors_handler() {
        sublisp_throw($IGNORE_ERRORS_TARGET, SubLNil.NIL);
        return SubLNil.NIL;
    }

    public static SubLObject ignore_errors_internal(SubLObject body) {
        SubLObject tag = make_symbol($str13$IGNORE_ERRORS_TAG);
        return list(CLET, list(tag), list(CCATCH, $IGNORE_ERRORS_TARGET, tag, list(IGNORE, tag), listS(WITH_ERROR_HANDLER, $list16, append(body, SubLNil.NIL))));
    }

    public static SubLObject init_condition_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject setup_condition_macros_file() {
        return SubLNil.NIL;
    }

    public static SubLObject with_error_handler_internal(SubLObject handler, SubLObject body) {
        return listS(CLET, list(list($error_handler$, handler)), append(body, SubLNil.NIL));
    }

    public static SubLObject with_simple_restart(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = SubLNil.NIL;
        SubLObject format_control = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        format_control = current.first();
        SubLObject format_arguments;
        current = format_arguments = current.rest();
        SubLObject body;
        current = body = temp;
        return with_simple_restart_internal(name, format_control, format_arguments, body);
    }

    public static SubLObject with_simple_restart_internal(SubLObject name, SubLObject format_control, SubLObject format_arguments, SubLObject body) {
        SubLObject tag = make_symbol($str1$RESTART_TAG);
        SubLObject dummy = make_symbol($$$DUMMY);
        return list(CLET, list(list(tag, SubLNil.NIL != name ? list(QUOTE, name) : list(QUOTE, tag)), dummy), list(IGNORE, dummy), list(CLET, list(list($restarts$, listS(CONS, listS(LIST, tag, format_control, append(format_arguments, SubLNil.NIL)), $list9))), listS(CCATCH, tag, dummy, append(body, SubLNil.NIL))));
    }

    public static SubLObject with_sublisp_error_handling(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return with_sublisp_error_handling_internal(body);
    }

    public static SubLObject with_sublisp_error_handling_internal(SubLObject body) {
        return bq_cons(PROGN, append(body, SubLNil.NIL));
    }

    public static final SubLFile me = new condition_macros();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros";

    public static final SubLList $list0 = list(list(makeSymbol("NAME"), makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $str1$RESTART_TAG = makeString("RESTART-TAG");

    public static final SubLString $$$DUMMY = makeString("DUMMY");







    public static final SubLSymbol $restarts$ = makeSymbol("*RESTARTS*");





    public static final SubLList $list9 = list(makeSymbol("*RESTARTS*"));





    public static final SubLSymbol $error_handler$ = makeSymbol("*ERROR-HANDLER*");

    public static final SubLString $str13$IGNORE_ERRORS_TAG = makeString("IGNORE-ERRORS-TAG");

    public static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");



    public static final SubLList $list16 = list(makeSymbol("FUNCTION"), makeSymbol("IGNORE-ERRORS-HANDLER"));

    static {


















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

