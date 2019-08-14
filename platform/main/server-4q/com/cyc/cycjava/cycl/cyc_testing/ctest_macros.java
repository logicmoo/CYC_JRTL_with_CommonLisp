/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CTEST-MACROS
 * source file: /cyc/top/cycl/cyc-testing/ctest-macros.lisp
 * created:     2019/07/03 17:37:56
 */
public final class ctest_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new ctest_macros();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("DB-CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list(makeSymbol("ERROR"));

    private static final SubLSymbol SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");

    private static final SubLSymbol SQLC_OPEN_P = makeSymbol("SQLC-OPEN-P");

    private static final SubLSymbol SQLC_GET_AUTO_COMMIT = makeSymbol("SQLC-GET-AUTO-COMMIT");

    private static final SubLSymbol ROLLBACK_CONNECTION = makeSymbol("ROLLBACK-CONNECTION");

    private static final SubLSymbol KILL_SQL_CONNECTION = makeSymbol("KILL-SQL-CONNECTION");

    static private final SubLString $str14$_a__DB_CONNECTION__a_was_killed_ = makeString("~a (DB-CONNECTION ~a was killed)");

    static private final SubLString $str15$_a__DB_CONNECTION__a_was_rolled_b = makeString("~a (DB-CONNECTION ~a was rolled back)");

    public static final SubLSymbol $kct_metric_evaluator_methods$ = makeSymbol("*KCT-METRIC-EVALUATOR-METHODS*");

    static private final SubLList $list18 = list(makeSymbol("METRIC-METHOD-SYMBOL"), makeSymbol("METRIC-IDENTIFIER"), list(makeSymbol("ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CTEST_REGISTER_METRIC_EVALUATOR = makeSymbol("CTEST-REGISTER-METRIC-EVALUATOR");

    static private final SubLList $list22 = list(makeSymbol("TEST-METRIC-RESULT"), makeKeyword("PUBLIC"));

    static private final SubLList $list23 = list(makeSymbol("TEST-COLLECTION-METRIC-RESULT"), makeKeyword("PUBLIC"));

    // Definitions
    /**
     * Execute BODY.  If error, kill DB-CONNECTION before signaling an error
     */
    @LispMethod(comment = "Execute BODY.  If error, kill DB-CONNECTION before signaling an error")
    public static final SubLObject with_db_connection_cleanup_on_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject db_connection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            db_connection = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt2, list(CATCH_ERROR_MESSAGE, $list_alt2, bq_cons(PROGN, append(body, NIL))), list(PWHEN, ERROR, list(PWHEN, list(CAND, list(SQL_CONNECTION_P, db_connection), list(SQLC_OPEN_P, db_connection)), list(PWHEN, list(CNOT, list(SQLC_GET_AUTO_COMMIT, db_connection)), list(ROLLBACK_CONNECTION, db_connection)), list(KILL_SQL_CONNECTION, db_connection)), list(ERROR, $str_alt14$_a__DB_CONNECTION__a_was_killed_, ERROR, db_connection)));
            }
        }
    }

    // Definitions
    /**
     * Execute BODY.  If error, kill DB-CONNECTION before signaling an error
     */
    @LispMethod(comment = "Execute BODY.  If error, kill DB-CONNECTION before signaling an error")
    public static SubLObject with_db_connection_cleanup_on_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject db_connection = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        db_connection = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list2, list(CATCH_ERROR_MESSAGE, $list2, bq_cons(PROGN, append(body, NIL))), list(PWHEN, ERROR, list(PWHEN, list(CAND, list(SQL_CONNECTION_P, db_connection), list(SQLC_OPEN_P, db_connection)), list(PWHEN, list(CNOT, list(SQLC_GET_AUTO_COMMIT, db_connection)), list(ROLLBACK_CONNECTION, db_connection)), list(KILL_SQL_CONNECTION, db_connection)), list(ERROR, $str14$_a__DB_CONNECTION__a_was_killed_, ERROR, db_connection)));
    }

    /**
     * Execute BODY.  If error, roll-back DB-CONNECTION before signaling an error
     */
    @LispMethod(comment = "Execute BODY.  If error, roll-back DB-CONNECTION before signaling an error")
    public static final SubLObject with_db_connection_rollback_on_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject db_connection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            db_connection = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, $list_alt2, list(CATCH_ERROR_MESSAGE, $list_alt2, bq_cons(PROGN, append(body, NIL))), list(PWHEN, ERROR, list(PWHEN, list(CAND, list(SQL_CONNECTION_P, db_connection), list(SQLC_OPEN_P, db_connection)), list(ROLLBACK_CONNECTION, db_connection)), list(ERROR, $str_alt15$_a__DB_CONNECTION__a_was_rolled_b, ERROR, db_connection)));
            }
        }
    }

    /**
     * Execute BODY.  If error, roll-back DB-CONNECTION before signaling an error
     */
    @LispMethod(comment = "Execute BODY.  If error, roll-back DB-CONNECTION before signaling an error")
    public static SubLObject with_db_connection_rollback_on_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject db_connection = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        db_connection = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, $list2, list(CATCH_ERROR_MESSAGE, $list2, bq_cons(PROGN, append(body, NIL))), list(PWHEN, ERROR, list(PWHEN, list(CAND, list(SQL_CONNECTION_P, db_connection), list(SQLC_OPEN_P, db_connection)), list(ROLLBACK_CONNECTION, db_connection)), list(ERROR, $str15$_a__DB_CONNECTION__a_was_rolled_b, ERROR, db_connection)));
    }

    public static final SubLObject ctest_register_metric_evaluator_alt(SubLObject metric_identifier, SubLObject metric_method_symbol) {
        {
            SubLObject item_var = cons(metric_identifier, metric_method_symbol);
            if (NIL == member(item_var, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                $kct_metric_evaluator_methods$.setGlobalValue(cons(item_var, $kct_metric_evaluator_methods$.getGlobalValue()));
            }
        }
        return $kct_metric_evaluator_methods$.getGlobalValue();
    }

    public static SubLObject ctest_register_metric_evaluator(final SubLObject metric_identifier, final SubLObject metric_method_symbol) {
        final SubLObject item_var = cons(metric_identifier, metric_method_symbol);
        if (NIL == member(item_var, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            $kct_metric_evaluator_methods$.setGlobalValue(cons(item_var, $kct_metric_evaluator_methods$.getGlobalValue()));
        }
        return $kct_metric_evaluator_methods$.getGlobalValue();
    }

    public static final SubLObject ctest_get_evaluator_for_metric_alt(SubLObject metric_identifier) {
        return assoc(metric_identifier, $kct_metric_evaluator_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject ctest_get_evaluator_for_metric(final SubLObject metric_identifier) {
        return assoc(metric_identifier, $kct_metric_evaluator_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static final SubLObject ctest_metric_identifier_p_alt(SubLObject v_object) {
        return find(v_object, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ctest_metric_identifier_p(final SubLObject v_object) {
        return find(v_object, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Register test metric evaluator name.  Define the metric evaluator method, which will be
     * a method on the TEST-METRIC-RESULT object, and will take a single arg, which is an
     * instance of KCT-ACTIVE-EXECUTION-MEMBER.
     */
    @LispMethod(comment = "Register test metric evaluator name.  Define the metric evaluator method, which will be\r\na method on the TEST-METRIC-RESULT object, and will take a single arg, which is an\r\ninstance of KCT-ACTIVE-EXECUTION-MEMBER.\nRegister test metric evaluator name.  Define the metric evaluator method, which will be\na method on the TEST-METRIC-RESULT object, and will take a single arg, which is an\ninstance of KCT-ACTIVE-EXECUTION-MEMBER.")
    public static final SubLObject define_metric_evaluator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject metric_method_symbol = NIL;
            SubLObject metric_identifier = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            metric_method_symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt18);
            metric_identifier = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, list(CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, list(QUOTE, metric_method_symbol)), listS(DEF_INSTANCE_METHOD, bq_cons(metric_method_symbol, $list_alt22), list(arg), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt18);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Register test metric evaluator name.  Define the metric evaluator method, which will be
     * a method on the TEST-METRIC-RESULT object, and will take a single arg, which is an
     * instance of KCT-ACTIVE-EXECUTION-MEMBER.
     */
    @LispMethod(comment = "Register test metric evaluator name.  Define the metric evaluator method, which will be\r\na method on the TEST-METRIC-RESULT object, and will take a single arg, which is an\r\ninstance of KCT-ACTIVE-EXECUTION-MEMBER.\nRegister test metric evaluator name.  Define the metric evaluator method, which will be\na method on the TEST-METRIC-RESULT object, and will take a single arg, which is an\ninstance of KCT-ACTIVE-EXECUTION-MEMBER.")
    public static SubLObject define_metric_evaluator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject metric_method_symbol = NIL;
        SubLObject metric_identifier = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        metric_method_symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        metric_identifier = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        arg = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, list(CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, list(QUOTE, metric_method_symbol)), listS(DEF_INSTANCE_METHOD, bq_cons(metric_method_symbol, $list22), list(arg), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list18);
        return NIL;
    }

    /**
     * Register collection metric evaluator name.  Define the collection metric evaluator
     * method, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will
     * take a single arg, which is an instance of KCT-ACTIVE-EXECUTION.
     */
    @LispMethod(comment = "Register collection metric evaluator name.  Define the collection metric evaluator\r\nmethod, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will\r\ntake a single arg, which is an instance of KCT-ACTIVE-EXECUTION.\nRegister collection metric evaluator name.  Define the collection metric evaluator\nmethod, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will\ntake a single arg, which is an instance of KCT-ACTIVE-EXECUTION.")
    public static final SubLObject define_collection_metric_evaluator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject metric_method_symbol = NIL;
            SubLObject metric_identifier = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            metric_method_symbol = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt18);
            metric_identifier = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arg = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    arg = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, list(CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, list(QUOTE, metric_method_symbol)), listS(DEF_INSTANCE_METHOD, bq_cons(metric_method_symbol, $list_alt23), list(arg), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt18);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Register collection metric evaluator name.  Define the collection metric evaluator
     * method, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will
     * take a single arg, which is an instance of KCT-ACTIVE-EXECUTION.
     */
    @LispMethod(comment = "Register collection metric evaluator name.  Define the collection metric evaluator\r\nmethod, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will\r\ntake a single arg, which is an instance of KCT-ACTIVE-EXECUTION.\nRegister collection metric evaluator name.  Define the collection metric evaluator\nmethod, which will be a method on the TEST-COLLECTION-METRIC-RESULT object, and will\ntake a single arg, which is an instance of KCT-ACTIVE-EXECUTION.")
    public static SubLObject define_collection_metric_evaluator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject metric_method_symbol = NIL;
        SubLObject metric_identifier = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        metric_method_symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        metric_identifier = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        arg = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, list(CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, list(QUOTE, metric_method_symbol)), listS(DEF_INSTANCE_METHOD, bq_cons(metric_method_symbol, $list23), list(arg), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list18);
        return NIL;
    }

    public static SubLObject declare_ctest_macros_file() {
        declareMacro("with_db_connection_cleanup_on_error", "WITH-DB-CONNECTION-CLEANUP-ON-ERROR");
        declareMacro("with_db_connection_rollback_on_error", "WITH-DB-CONNECTION-ROLLBACK-ON-ERROR");
        declareFunction("ctest_register_metric_evaluator", "CTEST-REGISTER-METRIC-EVALUATOR", 2, 0, false);
        declareFunction("ctest_get_evaluator_for_metric", "CTEST-GET-EVALUATOR-FOR-METRIC", 1, 0, false);
        declareFunction("ctest_metric_identifier_p", "CTEST-METRIC-IDENTIFIER-P", 1, 0, false);
        declareMacro("define_metric_evaluator", "DEFINE-METRIC-EVALUATOR");
        declareMacro("define_collection_metric_evaluator", "DEFINE-COLLECTION-METRIC-EVALUATOR");
        return NIL;
    }

    public static final SubLObject init_ctest_macros_file_alt() {
        deflexical("*KCT-METRIC-EVALUATOR-METHODS*", NIL != boundp($kct_metric_evaluator_methods$) ? ((SubLObject) ($kct_metric_evaluator_methods$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_ctest_macros_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*KCT-METRIC-EVALUATOR-METHODS*", SubLTrampolineFile.maybeDefault($kct_metric_evaluator_methods$, $kct_metric_evaluator_methods$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KCT-METRIC-EVALUATOR-METHODS*", NIL != boundp($kct_metric_evaluator_methods$) ? ((SubLObject) ($kct_metric_evaluator_methods$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_ctest_macros_file_Previous() {
        deflexical("*KCT-METRIC-EVALUATOR-METHODS*", SubLTrampolineFile.maybeDefault($kct_metric_evaluator_methods$, $kct_metric_evaluator_methods$, NIL));
        return NIL;
    }

    public static SubLObject setup_ctest_macros_file() {
        declare_defglobal($kct_metric_evaluator_methods$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ctest_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_ctest_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ctest_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("DB-CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list(makeSymbol("ERROR"));

    static private final SubLString $str_alt14$_a__DB_CONNECTION__a_was_killed_ = makeString("~a (DB-CONNECTION ~a was killed)");

    static private final SubLString $str_alt15$_a__DB_CONNECTION__a_was_rolled_b = makeString("~a (DB-CONNECTION ~a was rolled back)");

    static private final SubLList $list_alt18 = list(makeSymbol("METRIC-METHOD-SYMBOL"), makeSymbol("METRIC-IDENTIFIER"), list(makeSymbol("ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeSymbol("TEST-METRIC-RESULT"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt23 = list(makeSymbol("TEST-COLLECTION-METRIC-RESULT"), makeKeyword("PUBLIC"));
}

/**
 * Total time: 86 ms
 */
