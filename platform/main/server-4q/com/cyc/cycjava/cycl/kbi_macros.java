/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-MACROS
 *  source file: /cyc/top/cycl/kbi-macros.lisp
 *  created:     2019/07/03 17:37:19
 */
public final class kbi_macros extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_macros() {
    }

    public static final SubLFile me = new kbi_macros();




    // defparameter
    public static final SubLSymbol $kbi_doneP_fn$ = makeSymbol("*KBI-DONE?-FN*");







    // defparameter
    public static final SubLSymbol $kbi_booleanP$ = makeSymbol("*KBI-BOOLEAN?*");

    /**
     * this macro should only appear in forms following KBI-MACROS.LISP in sysdcl
     */
    public static final SubLObject with_kbi_result(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt14, list(CATCH_ERROR_MESSAGE, $list_alt16, bq_cons(CUNWIND_PROTECT, append(body, list(listS(CSETQ, result_var, $list_alt19))))), $list_alt20);
            }
        }
    }

    /**
     * this macro should only appear in forms following KBI-MACROS.LISP in sysdcl
     */
    public static final SubLObject any_kbi_resultP(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt21, list(CATCH_ERROR_MESSAGE, $list_alt16, bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, $kbi_result$, listS(CSETQ, result_var, $list_alt23)))))), $list_alt20);
            }
        }
    }

    public static final SubLObject kbi_concept_predicate_checks(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return bq_cons(CUNWIND_PROTECT, append(body, $list_alt24));
        }
    }

    /**
     * Execute BODY with ARGNUM bound iteratively to each integer from START to MAX,
     * halting execution when DONE? is non-nil.
     */
    public static final SubLObject kbi_do_argnums(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argnum = NIL;
                    SubLObject start = NIL;
                    SubLObject max = NIL;
                    SubLObject doneP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    argnum = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    start = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    max = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    doneP = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_NUMBERS, list(argnum, $START, start, $END, list($sym29$1_, max), $DONE, doneP), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt25);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_kbi_macros_file() {
        declareMacro("with_kbi_result", "WITH-KBI-RESULT");
        declareMacro("any_kbi_resultP", "ANY-KBI-RESULT?");
        declareMacro("kbi_concept_predicate_checks", "KBI-CONCEPT-PREDICATE-CHECKS");
        declareMacro("kbi_do_argnums", "KBI-DO-ARGNUMS");
        return NIL;
    }

    public static final SubLObject init_kbi_macros_file() {
        defparameter("*KBI-RESULT*", NIL);
        defparameter("*KBI-DONE?-FN*", NIL);
        defparameter("*KBI-MODULE*", NIL);
        defparameter("*KBI-ARG*", NIL);
        defparameter("*KBI-ERRORS*", NIL);
        defparameter("*KBI-BOOLEAN?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kbi_macros_file() {
                {
            SubLObject item_var = $kbi_result$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_result$, $str_alt1$variable_to_accumulate_kbi_result);
        {
            SubLObject item_var = $sym2$_KBI_DONE__FN_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym2$_KBI_DONE__FN_, $str_alt3$function_to_determine_if_kbi_curr);
        {
            SubLObject item_var = $kbi_module$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_module$, $$$current_kbi_module);
        {
            SubLObject item_var = $kbi_arg$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_arg$, $$$argument_of_current_kbi_module);
        {
            SubLObject item_var = $kbi_errors$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_errors$, $str_alt9$errors_accumulated_during_evaluat);
        {
            SubLObject item_var = $sym10$_KBI_BOOLEAN__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym10$_KBI_BOOLEAN__, $str_alt11$only_determine_if_kbi_condition_h);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $kbi_result$ = makeSymbol("*KBI-RESULT*");

    static private final SubLString $str_alt1$variable_to_accumulate_kbi_result = makeString("variable to accumulate kbi results");

    static private final SubLSymbol $sym2$_KBI_DONE__FN_ = makeSymbol("*KBI-DONE?-FN*");

    static private final SubLString $str_alt3$function_to_determine_if_kbi_curr = makeString("function to determine if kbi current analysis is complete");

    public static final SubLSymbol $kbi_module$ = makeSymbol("*KBI-MODULE*");

    static private final SubLString $$$current_kbi_module = makeString("current kbi module");

    public static final SubLSymbol $kbi_arg$ = makeSymbol("*KBI-ARG*");

    static private final SubLString $$$argument_of_current_kbi_module = makeString("argument of current kbi module");

    public static final SubLSymbol $kbi_errors$ = makeSymbol("*KBI-ERRORS*");

    static private final SubLString $str_alt9$errors_accumulated_during_evaluat = makeString("errors accumulated during evaluation of kbi tests");

    static private final SubLSymbol $sym10$_KBI_BOOLEAN__ = makeSymbol("*KBI-BOOLEAN?*");

    static private final SubLString $str_alt11$only_determine_if_kbi_condition_h = makeString("only determine if kbi condition holds (ignore explanation)?");

    static private final SubLList $list_alt12 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    static private final SubLList $list_alt14 = list(makeSymbol("*KBI-RESULT*"), makeSymbol("ERROR-MESSAGE"));



    static private final SubLList $list_alt16 = list(makeSymbol("ERROR-MESSAGE"));





    static private final SubLList $list_alt19 = list(list(makeSymbol("FIF"), list(makeSymbol("CONSP"), makeSymbol("*KBI-RESULT*")), list(makeSymbol("NREVERSE"), makeSymbol("*KBI-RESULT*")), makeSymbol("*KBI-RESULT*")));

    static private final SubLList $list_alt20 = list(list(makeSymbol("PWHEN"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeKeyword("KBI-ERROR"), makeSymbol("*KBI-MODULE*"), makeSymbol("*KBI-ARG*"), makeSymbol("ERROR-MESSAGE")), makeSymbol("*KBI-ERRORS*"))));

    static private final SubLList $list_alt21 = list(list(makeSymbol("*KBI-DONE?-FN*"), list(makeSymbol("FUNCTION"), makeSymbol("KBI-DONE-IF-ANY-RESULT"))), list(makeSymbol("*KBI-BOOLEAN?*"), T), makeSymbol("*KBI-RESULT*"), makeSymbol("ERROR-MESSAGE"));



    static private final SubLList $list_alt23 = list(T);

    static private final SubLList $list_alt24 = list(list(makeSymbol("CLRHASH"), makeSymbol("*KBI-PREDICATE-TABLE*")));

    static private final SubLList $list_alt25 = list(list(makeSymbol("ARGNUM"), makeSymbol("START"), makeSymbol("MAX"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");





    static private final SubLSymbol $sym29$1_ = makeSymbol("1+");



    // // Initializers
    public void declareFunctions() {
        declare_kbi_macros_file();
    }

    public void initializeVariables() {
        init_kbi_macros_file();
    }

    public void runTopLevelForms() {
        setup_kbi_macros_file();
    }
}

