package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ctest_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_macros";
    public static final String myFingerPrint = "b71f66b52e5855f86c1c7133cd3f10e7127b88d80148d2298e123bf083580afd";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 2807L)
    private static SubLSymbol $kct_metric_evaluator_methods$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym4$PROGN;
    private static final SubLSymbol $sym5$PWHEN;
    private static final SubLSymbol $sym6$ERROR;
    private static final SubLSymbol $sym7$CAND;
    private static final SubLSymbol $sym8$SQL_CONNECTION_P;
    private static final SubLSymbol $sym9$SQLC_OPEN_P;
    private static final SubLSymbol $sym10$CNOT;
    private static final SubLSymbol $sym11$SQLC_GET_AUTO_COMMIT;
    private static final SubLSymbol $sym12$ROLLBACK_CONNECTION;
    private static final SubLSymbol $sym13$KILL_SQL_CONNECTION;
    private static final SubLString $str14$_a__DB_CONNECTION__a_was_killed_;
    private static final SubLString $str15$_a__DB_CONNECTION__a_was_rolled_b;
    private static final SubLSymbol $sym16$_KCT_METRIC_EVALUATOR_METHODS_;
    private static final SubLSymbol $sym17$CAR;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CTEST_REGISTER_METRIC_EVALUATOR;
    private static final SubLSymbol $sym20$QUOTE;
    private static final SubLSymbol $sym21$DEF_INSTANCE_METHOD;
    private static final SubLList $list22;
    private static final SubLList $list23;

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 1537L)
    public static SubLObject with_db_connection_cleanup_on_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject db_connection = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list0);
        db_connection = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym1$CLET, (SubLObject)ctest_macros.$list2, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym3$CATCH_ERROR_MESSAGE, (SubLObject)ctest_macros.$list2, reader.bq_cons((SubLObject)ctest_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)ctest_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym5$PWHEN, (SubLObject)ctest_macros.$sym6$ERROR, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym5$PWHEN, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym7$CAND, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym8$SQL_CONNECTION_P, db_connection), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym9$SQLC_OPEN_P, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym5$PWHEN, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym10$CNOT, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym11$SQLC_GET_AUTO_COMMIT, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym12$ROLLBACK_CONNECTION, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym13$KILL_SQL_CONNECTION, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym6$ERROR, (SubLObject)ctest_macros.$str14$_a__DB_CONNECTION__a_was_killed_, (SubLObject)ctest_macros.$sym6$ERROR, db_connection)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 2215L)
    public static SubLObject with_db_connection_rollback_on_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject db_connection = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list0);
        db_connection = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym1$CLET, (SubLObject)ctest_macros.$list2, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym3$CATCH_ERROR_MESSAGE, (SubLObject)ctest_macros.$list2, reader.bq_cons((SubLObject)ctest_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)ctest_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym5$PWHEN, (SubLObject)ctest_macros.$sym6$ERROR, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym5$PWHEN, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym7$CAND, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym8$SQL_CONNECTION_P, db_connection), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym9$SQLC_OPEN_P, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym12$ROLLBACK_CONNECTION, db_connection)), (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym6$ERROR, (SubLObject)ctest_macros.$str15$_a__DB_CONNECTION__a_was_rolled_b, (SubLObject)ctest_macros.$sym6$ERROR, db_connection)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4397L)
    public static SubLObject ctest_register_metric_evaluator(final SubLObject metric_identifier, final SubLObject metric_method_symbol) {
        final SubLObject item_var = (SubLObject)ConsesLow.cons(metric_identifier, metric_method_symbol);
        if (ctest_macros.NIL == conses_high.member(item_var, ctest_macros.$kct_metric_evaluator_methods$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_macros.EQUAL), Symbols.symbol_function((SubLObject)ctest_macros.IDENTITY))) {
            ctest_macros.$kct_metric_evaluator_methods$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, ctest_macros.$kct_metric_evaluator_methods$.getGlobalValue()));
        }
        return ctest_macros.$kct_metric_evaluator_methods$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4633L)
    public static SubLObject ctest_get_evaluator_for_metric(final SubLObject metric_identifier) {
        return conses_high.assoc(metric_identifier, ctest_macros.$kct_metric_evaluator_methods$.getGlobalValue(), (SubLObject)ctest_macros.UNPROVIDED, (SubLObject)ctest_macros.UNPROVIDED).rest();
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4780L)
    public static SubLObject ctest_metric_identifier_p(final SubLObject v_object) {
        return Sequences.find(v_object, ctest_macros.$kct_metric_evaluator_methods$.getGlobalValue(), Symbols.symbol_function((SubLObject)ctest_macros.EQL), Symbols.symbol_function((SubLObject)ctest_macros.$sym17$CAR), (SubLObject)ctest_macros.UNPROVIDED, (SubLObject)ctest_macros.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4900L)
    public static SubLObject define_metric_evaluator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject metric_method_symbol = (SubLObject)ctest_macros.NIL;
        SubLObject metric_identifier = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        metric_method_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        metric_identifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        arg = current.first();
        current = current.rest();
        if (ctest_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym19$CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym20$QUOTE, metric_method_symbol)), (SubLObject)ConsesLow.listS((SubLObject)ctest_macros.$sym21$DEF_INSTANCE_METHOD, reader.bq_cons(metric_method_symbol, (SubLObject)ctest_macros.$list22), (SubLObject)ConsesLow.list(arg), ConsesLow.append(body, (SubLObject)ctest_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ctest_macros.$list18);
        return (SubLObject)ctest_macros.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 5483L)
    public static SubLObject define_collection_metric_evaluator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject metric_method_symbol = (SubLObject)ctest_macros.NIL;
        SubLObject metric_identifier = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        metric_method_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        metric_identifier = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = (SubLObject)ctest_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)ctest_macros.$list18);
        arg = current.first();
        current = current.rest();
        if (ctest_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym19$CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, (SubLObject)ConsesLow.list((SubLObject)ctest_macros.$sym20$QUOTE, metric_method_symbol)), (SubLObject)ConsesLow.listS((SubLObject)ctest_macros.$sym21$DEF_INSTANCE_METHOD, reader.bq_cons(metric_method_symbol, (SubLObject)ctest_macros.$list23), (SubLObject)ConsesLow.list(arg), ConsesLow.append(body, (SubLObject)ctest_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)ctest_macros.$list18);
        return (SubLObject)ctest_macros.NIL;
    }

    public static SubLObject declare_ctest_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "with_db_connection_cleanup_on_error", "WITH-DB-CONNECTION-CLEANUP-ON-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "with_db_connection_rollback_on_error", "WITH-DB-CONNECTION-ROLLBACK-ON-ERROR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "ctest_register_metric_evaluator", "CTEST-REGISTER-METRIC-EVALUATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "ctest_get_evaluator_for_metric", "CTEST-GET-EVALUATOR-FOR-METRIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "ctest_metric_identifier_p", "CTEST-METRIC-IDENTIFIER-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "define_metric_evaluator", "DEFINE-METRIC-EVALUATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.ctest_macros", "define_collection_metric_evaluator", "DEFINE-COLLECTION-METRIC-EVALUATOR");
        return (SubLObject)ctest_macros.NIL;
    }

    public static SubLObject init_ctest_macros_file() {
        ctest_macros.$kct_metric_evaluator_methods$ = SubLFiles.deflexical("*KCT-METRIC-EVALUATOR-METHODS*", (SubLObject)(maybeDefault((SubLObject)ctest_macros.$sym16$_KCT_METRIC_EVALUATOR_METHODS_, ctest_macros.$kct_metric_evaluator_methods$, ctest_macros.NIL)));
        return (SubLObject)ctest_macros.NIL;
    }

    public static SubLObject setup_ctest_macros_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)ctest_macros.$sym16$_KCT_METRIC_EVALUATOR_METHODS_);
        return (SubLObject)ctest_macros.NIL;
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
        me = (SubLFile)new ctest_macros();
        ctest_macros.$kct_metric_evaluator_methods$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DB-CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"));
        $sym3$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym5$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym6$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $sym7$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym8$SQL_CONNECTION_P = SubLObjectFactory.makeSymbol("SQL-CONNECTION-P");
        $sym9$SQLC_OPEN_P = SubLObjectFactory.makeSymbol("SQLC-OPEN-P");
        $sym10$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym11$SQLC_GET_AUTO_COMMIT = SubLObjectFactory.makeSymbol("SQLC-GET-AUTO-COMMIT");
        $sym12$ROLLBACK_CONNECTION = SubLObjectFactory.makeSymbol("ROLLBACK-CONNECTION");
        $sym13$KILL_SQL_CONNECTION = SubLObjectFactory.makeSymbol("KILL-SQL-CONNECTION");
        $str14$_a__DB_CONNECTION__a_was_killed_ = SubLObjectFactory.makeString("~a (DB-CONNECTION ~a was killed)");
        $str15$_a__DB_CONNECTION__a_was_rolled_b = SubLObjectFactory.makeString("~a (DB-CONNECTION ~a was rolled back)");
        $sym16$_KCT_METRIC_EVALUATOR_METHODS_ = SubLObjectFactory.makeSymbol("*KCT-METRIC-EVALUATOR-METHODS*");
        $sym17$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METRIC-METHOD-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("METRIC-IDENTIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym19$CTEST_REGISTER_METRIC_EVALUATOR = SubLObjectFactory.makeSymbol("CTEST-REGISTER-METRIC-EVALUATOR");
        $sym20$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym21$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-METRIC-RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-COLLECTION-METRIC-RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
    }
}

/*

	Total time: 86 ms

*/