/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-MACROS
 *  source file: /cyc/top/cycl/cyblack/cyblack-macros.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_macros extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_macros() {
    }

    public static final SubLFile me = new cyblack_macros();


    // // Definitions
    public static final SubLObject define_plist_key_checker_internal(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject defform = NIL;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defform = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject current_cons = make_symbol($str_alt1$CURRENT_CONS);
                    SubLObject key = make_symbol($$$KEY);
                    return listS(defform, function_name, $list_alt3, list(PWHEN, $list_alt5, $list_alt6, listS(CLET, list(bq_cons(current_cons, $list_alt3), key), list(WHILE, current_cons, list(CSETQ, key, list(CAR, current_cons)), listS(PUNLESS, list(predicate, key), $list_alt12), listS(PIF, list(CAND, list(CONSP, list(CDR, current_cons)), list(LISTP, list(CDDR, current_cons))), list(CSETQ, current_cons, list(CDDR, current_cons)), $list_alt12)), $list_alt19)), $list_alt12);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject define_plist_key_checker_private(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFINE_PLIST_KEY_CHECKER_INTERNAL, DEFINE_PRIVATE, function_name, predicate);
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        return NIL;
    }

    public static final SubLObject define_plist_key_checker_protected(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFINE_PLIST_KEY_CHECKER_INTERNAL, DEFINE_PROTECTED, function_name, predicate);
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        return NIL;
    }

    public static final SubLObject define_plist_key_checker_public(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFINE_PLIST_KEY_CHECKER_INTERNAL, DEFINE_PUBLIC, function_name, predicate);
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        return NIL;
    }

    public static final SubLObject define_list_of_checker_internal(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject defform = NIL;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            defform = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject current_cons = make_symbol($str_alt1$CURRENT_CONS);
                    SubLObject current_element = make_symbol($str_alt25$CURRENT_ELEMENT);
                    return list(defform, function_name, $list_alt3, list(CLET, list(bq_cons(current_cons, $list_alt3), current_element), listS(CSETQ, current_cons, $list_alt3), list(WHILE, list(CONSP, current_cons), list(CSETQ, current_element, list(CAR, current_cons)), listS(PUNLESS, list(predicate, current_element), $list_alt12), list(CSETQ, current_cons, list(CDR, current_cons))), list(RET, list(NULL, current_cons))));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject define_list_of_checker_private(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFINE_LIST_OF_CHECKER_INTERNAL, DEFINE_PRIVATE, function_name, predicate);
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        return NIL;
    }

    public static final SubLObject define_list_of_checker_protected(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            SubLObject predicate = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt20);
            predicate = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(DEFINE_LIST_OF_CHECKER_INTERNAL, DEFINE_PROTECTED, function_name, predicate);
            } else {
                cdestructuring_bind_error(datum, $list_alt20);
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cyblack_process_wait_on_values_wait_interval$ = makeSymbol("*CYBLACK-PROCESS-WAIT-ON-VALUES-WAIT-INTERVAL*");

    public static final SubLObject cyblack_process_wait_on_values(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject form_value_pairs = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt30);
                form_value_pairs = current.first();
                current = current.rest();
                {
                    SubLObject body = current;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!form_value_pairs.isList()) {
                            Errors.error($str_alt31$CYBLACK_PROCESS_WAIT_ON_VALUES___, form_value_pairs);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = form_value_pairs;
                        SubLObject pair = NIL;
                        for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!(((NIL != pair) && pair.isSymbol()) || (((pair.isCons() && (NIL != pair.first())) && pair.first().isSymbol()) && ((NIL == pair.rest()) || (pair.rest().isCons() && (NIL == cddr(pair))))))) {
                                    Errors.error($str_alt32$CYBLACK_PROCESS_WAIT_ON_VALUES___, pair);
                                }
                            }
                        }
                    }
                    {
                        SubLObject disjuncts = NIL;
                        SubLObject list_expression = form_value_pairs;
                        if (NIL == list_expression) {
                            disjuncts = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                disjuncts = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject pair = list_expression.first();
                                        disjuncts = list(pair.isCons() ? ((SubLObject) (pair.rest().isCons() ? ((SubLObject) (list(CNOT, list(EQ, pair.first(), cadr(pair))))) : list(CNOT, pair.first()))) : list(CNOT, pair));
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        {
                                            SubLObject pair = list_expression.first();
                                            disjuncts = list(pair.isCons() ? ((SubLObject) (pair.rest().isCons() ? ((SubLObject) (list(CNOT, list(EQ, pair.first(), cadr(pair))))) : list(CNOT, pair.first()))) : list(CNOT, pair));
                                            tail_cons = disjuncts;
                                        }
                                        {
                                            SubLObject cdolist_list_var = list_expression.rest();
                                            SubLObject pair = NIL;
                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                result = list(pair.isCons() ? ((SubLObject) (pair.rest().isCons() ? ((SubLObject) (list(CNOT, list(EQ, pair.first(), cadr(pair))))) : list(CNOT, pair.first()))) : list(CNOT, pair));
                                                rplacd(tail_cons, result);
                                                tail_cons = result;
                                            }
                                        }
                                    }
                                }


                        return listS(PROGN, list(WHILE, bq_cons(COR, disjuncts), list(SLEEP, $cyblack_process_wait_on_values_wait_interval$.getDynamicValue(thread))), body);
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_format(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject stream_expression = NIL;
            SubLObject format_string_expression = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            stream_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt37);
            format_string_expression = current.first();
            current = current.rest();
            {
                SubLObject arg_expressions = current;
                return list(PROGN, listS(FORMAT, stream_expression, format_string_expression, arg_expressions), list(FORCE_OUTPUT, stream_expression));
            }
        }
    }

    public static final SubLObject cyblack_must(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject test_expression = NIL;
                SubLObject format_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt40);
                test_expression = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt40);
                format_string = current.first();
                current = current.rest();
                {
                    SubLObject args = current;
                    if (NIL != cyblack_globals.$cyblack_type_checking_on$.getDynamicValue(thread)) {
                        return listS(MUST, test_expression, format_string, append(args, NIL));
                    } else {
                        return $list_alt42;
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_do_must(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject list = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    list = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject test_expression = NIL;
                            SubLObject format_string = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt43);
                            test_expression = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt43);
                            format_string = current.first();
                            current = current.rest();
                            {
                                SubLObject args = current;
                                return list(CDOLIST, list(var, list(QUOTE, list)), listS(MUST, test_expression, format_string, append(args, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_warn(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_expression = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt40);
            test_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt40);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PUNLESS, test_expression, listS(WARN, format_string, append(args, NIL)));
            }
        }
    }

    public static final SubLObject when_cyblack_type_checking_on(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject body = current;
                if (NIL != cyblack_globals.$cyblack_type_checking_on$.getDynamicValue(thread)) {
                    return bq_cons(PROGN, append(body, NIL));
                } else {
                    return $list_alt42;
                }
            }
        }
    }

    public static final SubLObject unless_cyblack_type_checking_on(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject body = current;
                if (NIL != cyblack_globals.$cyblack_type_checking_on$.getDynamicValue(thread)) {
                    return $list_alt42;
                } else {
                    return bq_cons(PROGN, append(body, NIL));
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_macros_file() {
        declareMacro("define_plist_key_checker_internal", "DEFINE-PLIST-KEY-CHECKER-INTERNAL");
        declareMacro("define_plist_key_checker_private", "DEFINE-PLIST-KEY-CHECKER-PRIVATE");
        declareMacro("define_plist_key_checker_protected", "DEFINE-PLIST-KEY-CHECKER-PROTECTED");
        declareMacro("define_plist_key_checker_public", "DEFINE-PLIST-KEY-CHECKER-PUBLIC");
        declareMacro("define_list_of_checker_internal", "DEFINE-LIST-OF-CHECKER-INTERNAL");
        declareMacro("define_list_of_checker_private", "DEFINE-LIST-OF-CHECKER-PRIVATE");
        declareMacro("define_list_of_checker_protected", "DEFINE-LIST-OF-CHECKER-PROTECTED");
        declareMacro("cyblack_process_wait_on_values", "CYBLACK-PROCESS-WAIT-ON-VALUES");
        declareMacro("cyblack_format", "CYBLACK-FORMAT");
        declareMacro("cyblack_must", "CYBLACK-MUST");
        declareMacro("cyblack_do_must", "CYBLACK-DO-MUST");
        declareMacro("cyblack_warn", "CYBLACK-WARN");
        declareMacro("when_cyblack_type_checking_on", "WHEN-CYBLACK-TYPE-CHECKING-ON");
        declareMacro("unless_cyblack_type_checking_on", "UNLESS-CYBLACK-TYPE-CHECKING-ON");
        return NIL;
    }

    public static final SubLObject init_cyblack_macros_file() {
        defparameter("*CYBLACK-PROCESS-WAIT-ON-VALUES-WAIT-INTERVAL*", $float$0_5);
        return NIL;
    }

    public static final SubLObject setup_cyblack_macros_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("DEFFORM"), makeSymbol("FUNCTION-NAME"), makeSymbol("PREDICATE"));

    static private final SubLString $str_alt1$CURRENT_CONS = makeString("CURRENT-CONS");

    static private final SubLString $$$KEY = makeString("KEY");

    static private final SubLList $list_alt3 = list(makeSymbol("OBJECT"));



    static private final SubLList $list_alt5 = list(makeSymbol("LISTP"), makeSymbol("OBJECT"));

    static private final SubLList $list_alt6 = list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OBJECT")), list(RET, T));











    static private final SubLList $list_alt12 = list(list(RET, NIL));













    static private final SubLList $list_alt19 = list(list(RET, T));

    static private final SubLList $list_alt20 = list(makeSymbol("FUNCTION-NAME"), makeSymbol("PREDICATE"));

    private static final SubLSymbol DEFINE_PLIST_KEY_CHECKER_INTERNAL = makeSymbol("DEFINE-PLIST-KEY-CHECKER-INTERNAL");







    static private final SubLString $str_alt25$CURRENT_ELEMENT = makeString("CURRENT-ELEMENT");





    private static final SubLSymbol DEFINE_LIST_OF_CHECKER_INTERNAL = makeSymbol("DEFINE-LIST-OF-CHECKER-INTERNAL");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    static private final SubLList $list_alt30 = list(makeSymbol("FORM-VALUE-PAIRS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt31$CYBLACK_PROCESS_WAIT_ON_VALUES___ = makeString("CYBLACK-PROCESS-WAIT-ON-VALUES: ~S is not a legal form-value-pairs list.");

    static private final SubLString $str_alt32$CYBLACK_PROCESS_WAIT_ON_VALUES___ = makeString("CYBLACK-PROCESS-WAIT-ON-VALUES: ~S is not a legal form-value-pair.");









    static private final SubLList $list_alt37 = list(makeSymbol("STREAM-EXPRESSION"), makeSymbol("FORMAT-STRING-EXPRESSION"), makeSymbol("&BODY"), makeSymbol("ARG-EXPRESSIONS"));





    static private final SubLList $list_alt40 = list(makeSymbol("TEST-EXPRESSION"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    static private final SubLList $list_alt42 = list(makeSymbol("IGNORE"));

    static private final SubLList $list_alt43 = list(list(makeSymbol("VAR"), makeSymbol("LIST")), makeSymbol("TEST-EXPRESSION"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));







    // // Initializers
    public void declareFunctions() {
        declare_cyblack_macros_file();
    }

    public void initializeVariables() {
        init_cyblack_macros_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_macros_file();
    }
}

