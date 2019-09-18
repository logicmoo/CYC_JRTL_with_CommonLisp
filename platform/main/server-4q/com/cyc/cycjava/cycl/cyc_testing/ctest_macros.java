package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ctest_macros extends SubLTranslatedFile {
    public static final SubLFile me = new ctest_macros();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_macros";

    public static final String myFingerPrint = "b71f66b52e5855f86c1c7133cd3f10e7127b88d80148d2298e123bf083580afd";



    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("DB-CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list2 = list(makeSymbol("ERROR"));











    public static final SubLSymbol SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");

    public static final SubLSymbol SQLC_OPEN_P = makeSymbol("SQLC-OPEN-P");



    public static final SubLSymbol SQLC_GET_AUTO_COMMIT = makeSymbol("SQLC-GET-AUTO-COMMIT");

    public static final SubLSymbol ROLLBACK_CONNECTION = makeSymbol("ROLLBACK-CONNECTION");

    public static final SubLSymbol KILL_SQL_CONNECTION = makeSymbol("KILL-SQL-CONNECTION");

    public static final SubLString $str14$_a__DB_CONNECTION__a_was_killed_ = makeString("~a (DB-CONNECTION ~a was killed)");

    public static final SubLString $str15$_a__DB_CONNECTION__a_was_rolled_b = makeString("~a (DB-CONNECTION ~a was rolled back)");

    public static final SubLSymbol $kct_metric_evaluator_methods$ = makeSymbol("*KCT-METRIC-EVALUATOR-METHODS*");



    public static final SubLList $list18 = list(makeSymbol("METRIC-METHOD-SYMBOL"), makeSymbol("METRIC-IDENTIFIER"), list(makeSymbol("ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol CTEST_REGISTER_METRIC_EVALUATOR = makeSymbol("CTEST-REGISTER-METRIC-EVALUATOR");





    public static final SubLList $list22 = list(makeSymbol("TEST-METRIC-RESULT"), makeKeyword("PUBLIC"));

    public static final SubLList $list23 = list(makeSymbol("TEST-COLLECTION-METRIC-RESULT"), makeKeyword("PUBLIC"));

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

    public static SubLObject ctest_register_metric_evaluator(final SubLObject metric_identifier, final SubLObject metric_method_symbol) {
        final SubLObject item_var = cons(metric_identifier, metric_method_symbol);
        if (NIL == member(item_var, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            $kct_metric_evaluator_methods$.setGlobalValue(cons(item_var, $kct_metric_evaluator_methods$.getGlobalValue()));
        }
        return $kct_metric_evaluator_methods$.getGlobalValue();
    }

    public static SubLObject ctest_get_evaluator_for_metric(final SubLObject metric_identifier) {
        return assoc(metric_identifier, $kct_metric_evaluator_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject ctest_metric_identifier_p(final SubLObject v_object) {
        return find(v_object, $kct_metric_evaluator_methods$.getGlobalValue(), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

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
        declareMacro(me, "with_db_connection_cleanup_on_error", "WITH-DB-CONNECTION-CLEANUP-ON-ERROR");
        declareMacro(me, "with_db_connection_rollback_on_error", "WITH-DB-CONNECTION-ROLLBACK-ON-ERROR");
        declareFunction(me, "ctest_register_metric_evaluator", "CTEST-REGISTER-METRIC-EVALUATOR", 2, 0, false);
        declareFunction(me, "ctest_get_evaluator_for_metric", "CTEST-GET-EVALUATOR-FOR-METRIC", 1, 0, false);
        declareFunction(me, "ctest_metric_identifier_p", "CTEST-METRIC-IDENTIFIER-P", 1, 0, false);
        declareMacro(me, "define_metric_evaluator", "DEFINE-METRIC-EVALUATOR");
        declareMacro(me, "define_collection_metric_evaluator", "DEFINE-COLLECTION-METRIC-EVALUATOR");
        return NIL;
    }

    public static SubLObject init_ctest_macros_file() {
        deflexical("*KCT-METRIC-EVALUATOR-METHODS*", SubLSystemTrampolineFile.maybeDefault($kct_metric_evaluator_methods$, $kct_metric_evaluator_methods$, NIL));
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

    
}

/**
 * Total time: 86 ms
 */
