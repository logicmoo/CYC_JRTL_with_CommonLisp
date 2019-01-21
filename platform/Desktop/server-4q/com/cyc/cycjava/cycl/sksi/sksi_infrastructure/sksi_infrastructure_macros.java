package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_infrastructure_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros";
    public static final String myFingerPrint = "627fbf73b76d5c7325959fa19e04f1d6e0a5c328cf35abcc795faf9afe081e8d";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1508L)
    public static SubLSymbol $sksi_profiling_onP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1630L)
    public static SubLSymbol $sksi_sql_query_time$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1682L)
    public static SubLSymbol $sksi_sql_query_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1734L)
    public static SubLSymbol $sksi_sql_update_time$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1786L)
    public static SubLSymbol $sksi_sql_update_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1839L)
    public static SubLSymbol $sksi_sql_batch_update_count$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$DONE;
    private static final SubLSymbol $sym4$DO_PREDICATE_EXTENT_INDEX;
    private static final SubLSymbol $kw5$TRUTH;
    private static final SubLSymbol $kw6$TRUE;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$INDEX;
    private static final SubLSymbol $kw10$PREDICATE;
    private static final SubLSymbol $sym11$DO_GAF_ARG_INDEX;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$METHODS;
    private static final SubLSymbol $sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$START_TIME;
    private static final SubLSymbol $sym19$END_TIME;
    private static final SubLSymbol $sym20$TOTAL_TIME;
    private static final SubLSymbol $sym21$RESULT;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$WITH_SKSI_PROFILING_ON;
    private static final SubLSymbol $sym24$PROGN;
    private static final SubLSymbol $sym25$CSETQ;
    private static final SubLSymbol $sym26$FORMAT;
    private static final SubLString $str27$Result_____A__;
    private static final SubLSymbol $sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES;
    private static final SubLString $str29$__Query_time____A_sec__;
    private static final SubLString $str30$_Cyc_side____A_sec__;
    private static final SubLSymbol $sym31$_;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLString $str35$___bindings____A__;
    private static final SubLSymbol $sym36$FIF;
    private static final SubLSymbol $sym37$CONSP;
    private static final SubLSymbol $sym38$LIST_LENGTH;
    private static final SubLList $list39;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 862L)
    public static SubLObject sksi_do_predicate_extent_index_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject predicate = (SubLObject)sksi_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list0);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list0);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject current_$1 = (SubLObject)sksi_infrastructure_macros.NIL;
        while (sksi_infrastructure_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list0);
            if (sksi_infrastructure_macros.NIL == conses_high.member(current_$1, (SubLObject)sksi_infrastructure_macros.$list1, (SubLObject)sksi_infrastructure_macros.UNPROVIDED, (SubLObject)sksi_infrastructure_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_infrastructure_macros.T;
            }
            if (current_$1 == sksi_infrastructure_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_infrastructure_macros.NIL != bad && sksi_infrastructure_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_infrastructure_macros.$list0);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_infrastructure_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym4$DO_PREDICATE_EXTENT_INDEX, (SubLObject)ConsesLow.list(var, predicate, (SubLObject)sksi_infrastructure_macros.$kw5$TRUTH, (SubLObject)sksi_infrastructure_macros.$kw6$TRUE, (SubLObject)sksi_infrastructure_macros.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)sksi_infrastructure_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1050L)
    public static SubLObject sksi_do_gaf_arg_index_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject v_term = (SubLObject)sksi_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list7);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list7);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject current_$2 = (SubLObject)sksi_infrastructure_macros.NIL;
        while (sksi_infrastructure_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list7);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list7);
            if (sksi_infrastructure_macros.NIL == conses_high.member(current_$2, (SubLObject)sksi_infrastructure_macros.$list8, (SubLObject)sksi_infrastructure_macros.UNPROVIDED, (SubLObject)sksi_infrastructure_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_infrastructure_macros.T;
            }
            if (current_$2 == sksi_infrastructure_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_infrastructure_macros.NIL != bad && sksi_infrastructure_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_infrastructure_macros.$list7);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw9$INDEX, current);
        final SubLObject index = (SubLObject)((sksi_infrastructure_macros.NIL != index_tail) ? conses_high.cadr(index_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw10$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((sksi_infrastructure_macros.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_infrastructure_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym11$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { var, v_term, sksi_infrastructure_macros.$kw9$INDEX, index, sksi_infrastructure_macros.$kw10$PREDICATE, predicate, sksi_infrastructure_macros.$kw5$TRUTH, sksi_infrastructure_macros.$kw6$TRUE, sksi_infrastructure_macros.$kw3$DONE, done }), ConsesLow.append(body, (SubLObject)sksi_infrastructure_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1261L)
    public static SubLObject sksi_do_gafs_potentially_matching_formula_true(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject asent = (SubLObject)sksi_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list12);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_infrastructure_macros.$list12);
        asent = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sksi_infrastructure_macros.NIL;
        SubLObject current_$3 = (SubLObject)sksi_infrastructure_macros.NIL;
        while (sksi_infrastructure_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list12);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sksi_infrastructure_macros.$list12);
            if (sksi_infrastructure_macros.NIL == conses_high.member(current_$3, (SubLObject)sksi_infrastructure_macros.$list13, (SubLObject)sksi_infrastructure_macros.UNPROVIDED, (SubLObject)sksi_infrastructure_macros.UNPROVIDED)) {
                bad = (SubLObject)sksi_infrastructure_macros.T;
            }
            if (current_$3 == sksi_infrastructure_macros.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sksi_infrastructure_macros.NIL != bad && sksi_infrastructure_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_infrastructure_macros.$list12);
        }
        final SubLObject methods_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw14$METHODS, current);
        final SubLObject v_methods = (SubLObject)((sksi_infrastructure_macros.NIL != methods_tail) ? conses_high.cadr(methods_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sksi_infrastructure_macros.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((sksi_infrastructure_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : sksi_infrastructure_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA, (SubLObject)ConsesLow.list(assertion_var, asent, (SubLObject)sksi_infrastructure_macros.$kw14$METHODS, v_methods, (SubLObject)sksi_infrastructure_macros.$kw5$TRUTH, (SubLObject)sksi_infrastructure_macros.$kw6$TRUE, (SubLObject)sksi_infrastructure_macros.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)sksi_infrastructure_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1560L)
    public static SubLObject sksi_profiling_onP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_infrastructure_macros.$sksi_profiling_onP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1898L)
    public static SubLObject with_sksi_profiling_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym16$CLET, (SubLObject)sksi_infrastructure_macros.$list17, ConsesLow.append(body, (SubLObject)sksi_infrastructure_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 2200L)
    public static SubLObject with_sksi_query_profiling_results(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject start_time = (SubLObject)sksi_infrastructure_macros.$sym18$START_TIME;
        final SubLObject end_time = (SubLObject)sksi_infrastructure_macros.$sym19$END_TIME;
        final SubLObject total_time = (SubLObject)sksi_infrastructure_macros.$sym20$TOTAL_TIME;
        final SubLObject result = (SubLObject)sksi_infrastructure_macros.$sym21$RESULT;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym16$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start_time, (SubLObject)sksi_infrastructure_macros.$list22), end_time, total_time, result), (SubLObject)ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym23$WITH_SKSI_PROFILING_ON, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_infrastructure_macros.$sym24$PROGN, ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym25$CSETQ, result, ConsesLow.append(body, (SubLObject)sksi_infrastructure_macros.NIL)), ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym25$CSETQ, end_time, (SubLObject)sksi_infrastructure_macros.$list22), ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym26$FORMAT, (SubLObject)sksi_infrastructure_macros.T, (SubLObject)sksi_infrastructure_macros.$str27$Result_____A__, result), ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym25$CSETQ, total_time, (SubLObject)ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES, start_time, end_time)), ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym26$FORMAT, (SubLObject)sksi_infrastructure_macros.T, (SubLObject)sksi_infrastructure_macros.$str29$__Query_time____A_sec__, total_time), ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym26$FORMAT, (SubLObject)sksi_infrastructure_macros.T, (SubLObject)sksi_infrastructure_macros.$str30$_Cyc_side____A_sec__, (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym31$_, total_time, (SubLObject)sksi_infrastructure_macros.$list32)), sksi_infrastructure_macros.$list33, sksi_infrastructure_macros.$list34, ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym26$FORMAT, (SubLObject)sksi_infrastructure_macros.T, (SubLObject)sksi_infrastructure_macros.$str35$___bindings____A__, (SubLObject)ConsesLow.listS((SubLObject)sksi_infrastructure_macros.$sym36$FIF, (SubLObject)ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym37$CONSP, result), (SubLObject)ConsesLow.list((SubLObject)sksi_infrastructure_macros.$sym38$LIST_LENGTH, result), (SubLObject)sksi_infrastructure_macros.$list39)) })));
    }
    
    public static SubLObject declare_sksi_infrastructure_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "sksi_do_predicate_extent_index_true", "SKSI-DO-PREDICATE-EXTENT-INDEX-TRUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "sksi_do_gaf_arg_index_true", "SKSI-DO-GAF-ARG-INDEX-TRUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "sksi_do_gafs_potentially_matching_formula_true", "SKSI-DO-GAFS-POTENTIALLY-MATCHING-FORMULA-TRUE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "sksi_profiling_onP", "SKSI-PROFILING-ON?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "with_sksi_profiling_on", "WITH-SKSI-PROFILING-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros", "with_sksi_query_profiling_results", "WITH-SKSI-QUERY-PROFILING-RESULTS");
        return (SubLObject)sksi_infrastructure_macros.NIL;
    }
    
    public static SubLObject init_sksi_infrastructure_macros_file() {
        sksi_infrastructure_macros.$sksi_profiling_onP$ = SubLFiles.defparameter("*SKSI-PROFILING-ON?*", (SubLObject)sksi_infrastructure_macros.NIL);
        sksi_infrastructure_macros.$sksi_sql_query_time$ = SubLFiles.defparameter("*SKSI-SQL-QUERY-TIME*", (SubLObject)sksi_infrastructure_macros.NIL);
        sksi_infrastructure_macros.$sksi_sql_query_count$ = SubLFiles.defparameter("*SKSI-SQL-QUERY-COUNT*", (SubLObject)sksi_infrastructure_macros.NIL);
        sksi_infrastructure_macros.$sksi_sql_update_time$ = SubLFiles.defparameter("*SKSI-SQL-UPDATE-TIME*", (SubLObject)sksi_infrastructure_macros.NIL);
        sksi_infrastructure_macros.$sksi_sql_update_count$ = SubLFiles.defparameter("*SKSI-SQL-UPDATE-COUNT*", (SubLObject)sksi_infrastructure_macros.NIL);
        sksi_infrastructure_macros.$sksi_sql_batch_update_count$ = SubLFiles.defparameter("*SKSI-SQL-BATCH-UPDATE-COUNT*", (SubLObject)sksi_infrastructure_macros.NIL);
        return (SubLObject)sksi_infrastructure_macros.NIL;
    }
    
    public static SubLObject setup_sksi_infrastructure_macros_file() {
        return (SubLObject)sksi_infrastructure_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_infrastructure_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_infrastructure_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_infrastructure_macros_file();
    }
    
    static {
        me = (SubLFile)new sksi_infrastructure_macros();
        sksi_infrastructure_macros.$sksi_profiling_onP$ = null;
        sksi_infrastructure_macros.$sksi_sql_query_time$ = null;
        sksi_infrastructure_macros.$sksi_sql_query_count$ = null;
        sksi_infrastructure_macros.$sksi_sql_update_time$ = null;
        sksi_infrastructure_macros.$sksi_sql_update_count$ = null;
        sksi_infrastructure_macros.$sksi_sql_batch_update_count$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym4$DO_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $kw5$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw6$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw9$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw10$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $sym11$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw14$METHODS = SubLObjectFactory.makeKeyword("METHODS");
        $sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA = SubLObjectFactory.makeSymbol("DO-GAFS-POTENTIALLY-MATCHING-FORMULA");
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-PROFILING-ON?*"), (SubLObject)sksi_infrastructure_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-QUERY-TIME*"), (SubLObject)sksi_infrastructure_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-QUERY-COUNT*"), (SubLObject)sksi_infrastructure_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-UPDATE-TIME*"), (SubLObject)sksi_infrastructure_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-UPDATE-COUNT*"), (SubLObject)sksi_infrastructure_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-BATCH-UPDATE-COUNT*"), (SubLObject)sksi_infrastructure_macros.ZERO_INTEGER));
        $sym18$START_TIME = SubLObjectFactory.makeUninternedSymbol("START-TIME");
        $sym19$END_TIME = SubLObjectFactory.makeUninternedSymbol("END-TIME");
        $sym20$TOTAL_TIME = SubLObjectFactory.makeUninternedSymbol("TOTAL-TIME");
        $sym21$RESULT = SubLObjectFactory.makeUninternedSymbol("RESULT");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME")));
        $sym23$WITH_SKSI_PROFILING_ON = SubLObjectFactory.makeSymbol("WITH-SKSI-PROFILING-ON");
        $sym24$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym25$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym26$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str27$Result_____A__ = SubLObjectFactory.makeString("Result: ~%~A~%");
        $sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES = SubLObjectFactory.makeSymbol("ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES");
        $str29$__Query_time____A_sec__ = SubLObjectFactory.makeString("~%Query time : ~A sec~%");
        $str30$_Cyc_side____A_sec__ = SubLObjectFactory.makeString(" Cyc side : ~A sec~%");
        $sym31$_ = SubLObjectFactory.makeSymbol("-");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-QUERY-TIME*"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)sksi_infrastructure_macros.T, (SubLObject)SubLObjectFactory.makeString(" DB side : ~A sec~%"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-QUERY-TIME*"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)sksi_infrastructure_macros.T, (SubLObject)SubLObjectFactory.makeString(" # queries : ~A~%"), (SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-QUERY-COUNT*"));
        $str35$___bindings____A__ = SubLObjectFactory.makeString(" # bindings : ~A~%");
        $sym36$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym37$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym38$LIST_LENGTH = SubLObjectFactory.makeSymbol("LIST-LENGTH");
        $list39 = ConsesLow.list((SubLObject)sksi_infrastructure_macros.ZERO_INTEGER);
    }
}

/*

	Total time: 108 ms
	
*/