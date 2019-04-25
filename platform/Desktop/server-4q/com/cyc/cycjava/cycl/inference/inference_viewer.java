package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_viewer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_viewer";
    public static final String myFingerPrint = "3f594a970b64229c683287384d71f02dd7fd00815159d3f403dc6c7b9f5e5ae1";
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 4322L)
    private static SubLSymbol $cyc_term_working_set_query_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 4423L)
    private static SubLSymbol $cyc_term_working_set_query_inference$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 6158L)
    public static SubLSymbol $external_inference_monitor_time_increment_secs$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 6233L)
    public static SubLSymbol $external_inference_monitor_max_terms$;
    private static final SubLSymbol $sym0$TRUE;
    private static final SubLSymbol $sym1$POSITIVE_INTEGER_P;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_;
    private static final SubLSymbol $sym4$_CYC_TERM_WORKING_SET_QUERY_LOCK_;
    private static final SubLString $str5$cyc_term_working_set_query_lock;
    private static final SubLSymbol $sym6$_CYC_TERM_WORKING_SET_QUERY_INFERENCE_;
    private static final SubLSymbol $kw7$MAINTAIN_TERM_WORKING_SET_;
    private static final SubLSymbol $sym8$NON_NEGATIVE_NUMBER_P;
    private static final SubLString $str9$cyc_query_subprocess;
    private static final SubLSymbol $sym10$CYC_TERM_WORKING_SET_QUERY_INT;
    private static final SubLSymbol $sym11$_EXTERNAL_INFERENCE_MONITOR_TIME_INCREMENT_SECS_;
    private static final SubLFloat $float12$0_5;
    private static final SubLSymbol $sym13$_EXTERNAL_INFERENCE_MONITOR_MAX_TERMS_;
    private static final SubLInteger $int14$25;
    private static final SubLSymbol $sym15$EXTERNALLY_MONITOR_INFERENCE_TERM_WORKING_SET;
    private static final SubLSymbol $sym16$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLString $str19$____Time___s__;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 933L)
    public static SubLObject inference_term_working_set(final SubLObject inference, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (max_terms == inference_viewer.UNPROVIDED) {
            max_terms = (SubLObject)inference_viewer.NIL;
        }
        if (filter == inference_viewer.UNPROVIDED) {
            filter = Symbols.symbol_function((SubLObject)inference_viewer.$sym0$TRUE);
        }
        if (penetrate_hl_structuresP == inference_viewer.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)inference_viewer.T;
        }
        if (inference_viewer.NIL != max_terms && !inference_viewer.assertionsDisabledInClass && inference_viewer.NIL == subl_promotions.positive_integer_p(max_terms)) {
            throw new AssertionError(max_terms);
        }
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_viewer.EQL), (SubLObject)inference_viewer.UNPROVIDED);
        SubLObject problem_alist = (SubLObject)inference_viewer.NIL;
        if (inference_viewer.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            final SubLObject table = inference_datastructures_inference.inference_problem_working_time_table(inference);
            problem_alist = hash_table_utilities.hash_table_to_alist(table);
            final SubLObject forbidden_inference_viewer_fort_set = set_utilities.construct_set_from_list(forbidden_inference_viewer_forts(inference, penetrate_hl_structuresP), (SubLObject)inference_viewer.UNPROVIDED, (SubLObject)inference_viewer.UNPROVIDED);
            final SubLObject now = Time.get_internal_real_time();
            SubLObject cdolist_list_var = problem_alist;
            SubLObject cons = (SubLObject)inference_viewer.NIL;
            cons = cdolist_list_var.first();
            while (inference_viewer.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject problem = (SubLObject)inference_viewer.NIL;
                SubLObject time = (SubLObject)inference_viewer.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_viewer.$list2);
                problem = current.first();
                current = (time = current.rest());
                final SubLObject elapsed_internal_real_time = Numbers.subtract(now, time);
                SubLObject cdolist_list_var_$1 = cycl_utilities.expression_forts(inference_datastructures_problem.problem_query(problem), penetrate_hl_structuresP, (SubLObject)inference_viewer.UNPROVIDED, (SubLObject)inference_viewer.UNPROVIDED);
                SubLObject fort = (SubLObject)inference_viewer.NIL;
                fort = cdolist_list_var_$1.first();
                while (inference_viewer.NIL != cdolist_list_var_$1) {
                    if (inference_viewer.NIL == set.set_memberP(fort, forbidden_inference_viewer_fort_set) && inference_viewer.NIL != fort_passes_inference_viewer_filterP(fort, filter)) {
                        dictionary_utilities.dictionary_increment(dict, fort, elapsed_internal_real_time);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    fort = cdolist_list_var_$1.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        final SubLObject term_alist = dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function((SubLObject)inference_viewer.$sym3$_));
        if (inference_viewer.NIL != subl_promotions.positive_integer_p(max_terms)) {
            return list_utilities.first_n(max_terms, term_alist);
        }
        return term_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 4011L)
    public static SubLObject fort_passes_inference_viewer_filterP(final SubLObject fort, final SubLObject filter) {
        if (Symbols.symbol_function((SubLObject)inference_viewer.$sym0$TRUE).eql(filter)) {
            return (SubLObject)inference_viewer.T;
        }
        return Functions.funcall(filter, fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 4157L)
    public static SubLObject forbidden_inference_viewer_forts(final SubLObject inference, final SubLObject penetrate_hl_structuresP) {
        return cycl_utilities.expression_forts(inference_datastructures_inference.inference_mt(inference), penetrate_hl_structuresP, (SubLObject)inference_viewer.UNPROVIDED, (SubLObject)inference_viewer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 4486L)
    public static SubLObject cyc_term_working_set_query_int(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties) {
        final SubLObject new_query_properties = conses_high.putf(conses_high.copy_list(query_properties), (SubLObject)inference_viewer.$kw7$MAINTAIN_TERM_WORKING_SET_, (SubLObject)inference_viewer.T);
        final SubLObject inference = inference_kernel.new_continuable_inference(sentence, mt, inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(new_query_properties));
        SubLObject release = (SubLObject)inference_viewer.NIL;
        try {
            release = Locks.seize_lock(inference_viewer.$cyc_term_working_set_query_lock$.getGlobalValue());
            inference_viewer.$cyc_term_working_set_query_inference$.setGlobalValue(inference);
            inference_kernel.continue_inference(inference_viewer.$cyc_term_working_set_query_inference$.getGlobalValue(), inference_datastructures_enumerated_types.extract_query_dynamic_properties(new_query_properties));
        }
        finally {
            if (inference_viewer.NIL != release) {
                Locks.release_lock(inference_viewer.$cyc_term_working_set_query_lock$.getGlobalValue());
            }
        }
        return (SubLObject)inference_viewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 5037L)
    public static SubLObject cyc_term_working_set_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject time_increment, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (mt == inference_viewer.UNPROVIDED) {
            mt = (SubLObject)inference_viewer.NIL;
        }
        if (query_properties == inference_viewer.UNPROVIDED) {
            query_properties = (SubLObject)inference_viewer.NIL;
        }
        if (time_increment == inference_viewer.UNPROVIDED) {
            time_increment = (SubLObject)inference_viewer.NIL;
        }
        if (filter == inference_viewer.UNPROVIDED) {
            filter = Symbols.symbol_function((SubLObject)inference_viewer.$sym0$TRUE);
        }
        if (penetrate_hl_structuresP == inference_viewer.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)inference_viewer.T;
        }
        assert inference_viewer.NIL != number_utilities.non_negative_number_p(time_increment) : time_increment;
        SubLObject data = (SubLObject)inference_viewer.NIL;
        SubLObject release = (SubLObject)inference_viewer.NIL;
        try {
            release = Locks.seize_lock(inference_viewer.$cyc_term_working_set_query_lock$.getGlobalValue());
            inference_viewer.$cyc_term_working_set_query_inference$.setGlobalValue((SubLObject)inference_viewer.NIL);
        }
        finally {
            if (inference_viewer.NIL != release) {
                Locks.release_lock(inference_viewer.$cyc_term_working_set_query_lock$.getGlobalValue());
            }
        }
        subl_promotions.make_process_with_args((SubLObject)inference_viewer.$str9$cyc_query_subprocess, (SubLObject)inference_viewer.$sym10$CYC_TERM_WORKING_SET_QUERY_INT, (SubLObject)ConsesLow.list(sentence, mt, query_properties));
        while (inference_viewer.NIL == inference_datastructures_inference.inference_p(inference_viewer.$cyc_term_working_set_query_inference$.getGlobalValue()) || inference_viewer.NIL == inference_datastructures_inference.suspended_inference_p(inference_viewer.$cyc_term_working_set_query_inference$.getGlobalValue())) {
            if (inference_viewer.NIL != inference_datastructures_inference.inference_p(inference_viewer.$cyc_term_working_set_query_inference$.getGlobalValue())) {
                final SubLObject datum = (SubLObject)ConsesLow.list(Time.get_universal_time(), inference_term_working_set(inference_viewer.$cyc_term_working_set_query_inference$.getGlobalValue(), (SubLObject)inference_viewer.NIL, filter, penetrate_hl_structuresP));
                data = (SubLObject)ConsesLow.cons(datum, data);
            }
            Threads.sleep(time_increment);
        }
        return Sequences.nreverse(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 6297L)
    public static SubLObject externally_monitor_inference_term_working_set(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject time_increment_secs, SubLObject max_terms, SubLObject filter, SubLObject penetrate_hl_structuresP) {
        if (time_increment_secs == inference_viewer.UNPROVIDED) {
            time_increment_secs = inference_viewer.$external_inference_monitor_time_increment_secs$.getGlobalValue();
        }
        if (max_terms == inference_viewer.UNPROVIDED) {
            max_terms = inference_viewer.$external_inference_monitor_max_terms$.getGlobalValue();
        }
        if (filter == inference_viewer.UNPROVIDED) {
            filter = Symbols.symbol_function((SubLObject)inference_viewer.$sym0$TRUE);
        }
        if (penetrate_hl_structuresP == inference_viewer.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)inference_viewer.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_viewer.NIL != number_utilities.non_negative_number_p(time_increment_secs) : time_increment_secs;
        assert inference_viewer.NIL != subl_promotions.positive_integer_p(max_terms) : max_terms;
        SubLObject error = (SubLObject)inference_viewer.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)inference_viewer.$sym16$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
                    while (inference_viewer.NIL != inference_datastructures_inference.valid_inference_p(inference) && inference_viewer.NIL == inference_datastructures_inference.suspended_inference_p(inference)) {
                        if (inference_viewer.NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                            final SubLObject terms_alist = inference_term_working_set(inference, max_terms, filter, penetrate_hl_structuresP);
                            SubLObject terms_list_for_java = (SubLObject)inference_viewer.NIL;
                            SubLObject cdolist_list_var = terms_alist;
                            SubLObject cons = (SubLObject)inference_viewer.NIL;
                            cons = cdolist_list_var.first();
                            while (inference_viewer.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = cons;
                                SubLObject key = (SubLObject)inference_viewer.NIL;
                                SubLObject val = (SubLObject)inference_viewer.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_viewer.$list17);
                                key = current.first();
                                current = (val = current.rest());
                                terms_list_for_java = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_main.cached_paraphrase_for_java(key, (SubLObject)inference_viewer.UNPROVIDED), val), terms_list_for_java);
                                cdolist_list_var = cdolist_list_var.rest();
                                cons = cdolist_list_var.first();
                            }
                            terms_list_for_java = Sequences.nreverse(terms_list_for_java);
                            final SubLObject datum = (SubLObject)ConsesLow.list(Time.get_universal_time(), terms_list_for_java);
                            task_processor.post_task_info_processor_partial_results(datum);
                            Threads.sleep(time_increment_secs);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_viewer.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return error;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-viewer.lisp", position = 8729L)
    public static SubLObject print_term_working_set_data(final SubLObject data) {
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)inference_viewer.NIL;
        datum = cdolist_list_var.first();
        while (inference_viewer.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$2 = current = datum;
            SubLObject time = (SubLObject)inference_viewer.NIL;
            SubLObject alist = (SubLObject)inference_viewer.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$2, (SubLObject)inference_viewer.$list18);
            time = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$2, (SubLObject)inference_viewer.$list18);
            alist = current.first();
            current = current.rest();
            if (inference_viewer.NIL == current) {
                PrintLow.format((SubLObject)inference_viewer.T, (SubLObject)inference_viewer.$str19$____Time___s__, numeric_date_utilities.timestring(time));
                format_nil.print_one_per_line(alist, (SubLObject)inference_viewer.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)inference_viewer.$list18);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return (SubLObject)inference_viewer.NIL;
    }
    
    public static SubLObject declare_inference_viewer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "inference_term_working_set", "INFERENCE-TERM-WORKING-SET", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "fort_passes_inference_viewer_filterP", "FORT-PASSES-INFERENCE-VIEWER-FILTER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "forbidden_inference_viewer_forts", "FORBIDDEN-INFERENCE-VIEWER-FORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "cyc_term_working_set_query_int", "CYC-TERM-WORKING-SET-QUERY-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "cyc_term_working_set_query", "CYC-TERM-WORKING-SET-QUERY", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "externally_monitor_inference_term_working_set", "EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_viewer", "print_term_working_set_data", "PRINT-TERM-WORKING-SET-DATA", 1, 0, false);
        return (SubLObject)inference_viewer.NIL;
    }
    
    public static SubLObject init_inference_viewer_file() {
        inference_viewer.$cyc_term_working_set_query_lock$ = SubLFiles.deflexical("*CYC-TERM-WORKING-SET-QUERY-LOCK*", maybeDefault((SubLObject)inference_viewer.$sym4$_CYC_TERM_WORKING_SET_QUERY_LOCK_, inference_viewer.$cyc_term_working_set_query_lock$, ()->(Locks.make_lock((SubLObject)inference_viewer.$str5$cyc_term_working_set_query_lock))));
        inference_viewer.$cyc_term_working_set_query_inference$ = SubLFiles.deflexical("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*", (SubLObject)(maybeDefault((SubLObject)inference_viewer.$sym6$_CYC_TERM_WORKING_SET_QUERY_INFERENCE_, inference_viewer.$cyc_term_working_set_query_inference$, inference_viewer.NIL)));
        inference_viewer.$external_inference_monitor_time_increment_secs$ = SubLFiles.deflexical("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*", (SubLObject)inference_viewer.$float12$0_5);
        inference_viewer.$external_inference_monitor_max_terms$ = SubLFiles.deflexical("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*", (SubLObject)inference_viewer.$int14$25);
        return (SubLObject)inference_viewer.NIL;
    }
    
    public static SubLObject setup_inference_viewer_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)inference_viewer.$sym4$_CYC_TERM_WORKING_SET_QUERY_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_viewer.$sym6$_CYC_TERM_WORKING_SET_QUERY_INFERENCE_);
        access_macros.register_external_symbol((SubLObject)inference_viewer.$sym11$_EXTERNAL_INFERENCE_MONITOR_TIME_INCREMENT_SECS_);
        access_macros.register_external_symbol((SubLObject)inference_viewer.$sym13$_EXTERNAL_INFERENCE_MONITOR_MAX_TERMS_);
        access_macros.register_external_symbol((SubLObject)inference_viewer.$sym15$EXTERNALLY_MONITOR_INFERENCE_TERM_WORKING_SET);
        return (SubLObject)inference_viewer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_viewer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_viewer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_viewer_file();
    }
    
    static {
        me = (SubLFile)new inference_viewer();
        inference_viewer.$cyc_term_working_set_query_lock$ = null;
        inference_viewer.$cyc_term_working_set_query_inference$ = null;
        inference_viewer.$external_inference_monitor_time_increment_secs$ = null;
        inference_viewer.$external_inference_monitor_max_terms$ = null;
        $sym0$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym1$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $list2 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"));
        $sym3$_ = SubLObjectFactory.makeSymbol(">");
        $sym4$_CYC_TERM_WORKING_SET_QUERY_LOCK_ = SubLObjectFactory.makeSymbol("*CYC-TERM-WORKING-SET-QUERY-LOCK*");
        $str5$cyc_term_working_set_query_lock = SubLObjectFactory.makeString("cyc-term-working-set-query lock");
        $sym6$_CYC_TERM_WORKING_SET_QUERY_INFERENCE_ = SubLObjectFactory.makeSymbol("*CYC-TERM-WORKING-SET-QUERY-INFERENCE*");
        $kw7$MAINTAIN_TERM_WORKING_SET_ = SubLObjectFactory.makeKeyword("MAINTAIN-TERM-WORKING-SET?");
        $sym8$NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-NUMBER-P");
        $str9$cyc_query_subprocess = SubLObjectFactory.makeString("cyc-query subprocess");
        $sym10$CYC_TERM_WORKING_SET_QUERY_INT = SubLObjectFactory.makeSymbol("CYC-TERM-WORKING-SET-QUERY-INT");
        $sym11$_EXTERNAL_INFERENCE_MONITOR_TIME_INCREMENT_SECS_ = SubLObjectFactory.makeSymbol("*EXTERNAL-INFERENCE-MONITOR-TIME-INCREMENT-SECS*");
        $float12$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym13$_EXTERNAL_INFERENCE_MONITOR_MAX_TERMS_ = SubLObjectFactory.makeSymbol("*EXTERNAL-INFERENCE-MONITOR-MAX-TERMS*");
        $int14$25 = SubLObjectFactory.makeInteger(25);
        $sym15$EXTERNALLY_MONITOR_INFERENCE_TERM_WORKING_SET = SubLObjectFactory.makeSymbol("EXTERNALLY-MONITOR-INFERENCE-TERM-WORKING-SET");
        $sym16$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list17 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"));
        $str19$____Time___s__ = SubLObjectFactory.makeString("~%~%Time: ~s~%");
    }
}

/*

	Total time: 136 ms
	 synthetic 
*/