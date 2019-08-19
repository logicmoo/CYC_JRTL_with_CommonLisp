package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class query_suggestor extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.query_suggestor";
    public static String myFingerPrint = "6dbd3f02d8302c3e5fc2393c02078f6537475f084e4c4d8499b30fe729948178";
    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 800L)
    public static SubLSymbol $query_suggestor_test_types$;
    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1600L)
    private static SubLSymbol $query_suggestor_output_dir$;
    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1700L)
    public static SubLSymbol $query_suggestor_file_name$;
    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 3300L)
    private static SubLSymbol $query_suggestor_query_metrics$;
    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 3500L)
    private static SubLSymbol $query_suggestor_concept_metrics$;
    private static SubLList $list0;
    private static SubLSymbol $TERM;
    private static SubLSymbol $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_;
    private static SubLString $str3$_cyc_projects_Topsail_query_sugge;
    private static SubLSymbol $sym4$QUERY_SUGGESTOR_TEST_TYPE_;
    private static SubLObject $$TKBSourceSpindleCollectorMt;
    private static SubLSymbol $sym6$FAST_SKOLEM_NAT_;
    private static SubLObject $$conceptPertinentToDegree;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLSymbol $sym10$_QUERY;
    private static SubLObject $$cycLQuerySpecificationPertinentTo;
    private static SubLList $list12;
    private static SubLObject $$TheSet;
    private static SubLObject $$InferencePSC;
    private static SubLObject $$formulaTemplateGloss;
    private static SubLObject $$TemplateFromTestQueryFn;
    private static SubLList $list17;
    private static SubLObject $$TestVocabularyMt;
    private static SubLList $list19;
    private static SubLList $list20;
    private static SubLList $list21;
    private static SubLInteger $int$600;
    private static SubLSymbol $QUIESCENCE;
    private static SubLSymbol $ANSWERABLES;
    private static SubLSymbol $UNANSWERABLES;
    private static SubLSymbol $CONCEPT;
    private static SubLString $str27$Concept_not_asserted_to_be_pertin;
    private static SubLString $str28$_a__a;
    private static SubLSymbol $TOTAL;
    private static SubLSymbol $RATIO;
    private static SubLString $str31$_a__a__a_htm;
    private static SubLString $str32$_a__a;
    private static SubLString $str33$_a;
    private static SubLSymbol $OUTPUT;
    private static SubLString $str35$Unable_to_open__S;
    private static SubLString $str36$Test_Date__;
    private static SubLString $str37$KB__;
    private static SubLString $str38$System__;
    private static SubLString $str39$Test_Type__;
    private static SubLSymbol $APPEND;
    private static SubLString $str41$_________________________________;
    private static SubLString $str42$Concept__;
    private static SubLString $str43$Time_to_Quiescence_;
    private static SubLString $str44$Total_Number_of_Queries_;
    private static SubLString $str45$Answerable_Unanswerable___A;
    private static SubLString $str46$Answerable_Queries_;
    private static SubLString $str47$Unanswerable_Queries_;
    private static SubLSymbol $QUERY;
    private static SubLSymbol $ANSWER_COUNT;
    private static SubLSymbol $TOP;
    private static SubLInteger $int$150;
    private static SubLString $str52$Number_of_Bindings__;
    private static SubLString $str53$Bindings__;
    private static SubLSymbol $RESULT;
    private static SubLString $str55$Time_To_First_Answer__;
    private static SubLSymbol $TIME_TO_FIRST_ANSWER;
    private static SubLString $str57$Complete_Total_Time__;
    private static SubLSymbol $COMPLETE_TOTAL_TIME;
    private static SubLString $str59$n_a;
    private static SubLString $str60$_a_extra_answers__a__a__a_htm;
    private static SubLString $str61$Bindings_for_Query;
    private static SubLString $str62$_a__a_htm;
    private static SubLString $str63$Back_to_Main_Test_Run;
    private static SubLString $str64$Query__;
    private static SubLString $str65$Bindings_;
    private static SubLString $str66$_________________________________;
    private static SubLString $str67$Test_run_Summary;
    private static SubLString $str68$Median_Quiescence_Time__;
    private static SubLString $str69$Mean_Quiescence_Time__;
    private static SubLString $str70$Median_Answerables__;
    private static SubLString $str71$Mean_Answerables__;
    private static SubLString $str72$Median_Unanswerables__;
    private static SubLString $str73$Mean_Unanswerables__;
    private static SubLString $str74$_a__a_concepts_cfasl;
    private static SubLString $str75$_a__a_queries_cfasl;
    private static SubLString $str76$_;
    private static SubLString $str77$__Run_starting_at__A;
    private static SubLString $str78$__Run_ended_at__A;
    private static SubLString $str79$__Elapsed_time___A;
    private static SubLSymbol $sym80$CONSTANT_P;
    private static SubLSymbol $sym81$POSITIVE_INTEGER_P;
    private static SubLSymbol $sym82$KBQ_QUERY_RUN_ANSWER_COUNT;

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1100L)
    public static SubLObject query_suggestor_singleton_test_typeP(SubLObject test_type) {
        return makeBoolean(test_type.isCons() && $TERM == test_type.first());
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1200L)
    public static SubLObject query_suggestor_singleton_test_type_sole_instance(SubLObject test_type) {
        assert NIL != query_suggestor_singleton_test_typeP(test_type) : test_type;
        return conses_high.second(test_type);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1400L)
    public static SubLObject query_suggestor_test_typeP(SubLObject test_type) {
        return makeBoolean(NIL != query_suggestor_singleton_test_typeP(test_type) || (isConstSym(test_type) && NIL != fort_types_interface.collection_p(test_type)));
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 1700L)
    public static SubLObject query_suggestor_concepts(SubLObject test_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_suggestor_test_typeP(test_type) : test_type;
        if (NIL != query_suggestor_singleton_test_typeP(test_type)) {
            return list(query_suggestor_singleton_test_type_sole_instance(test_type));
        }
        SubLObject v_answer = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$TKBSourceSpindleCollectorMt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_answer = Sequences.remove_if($sym6$FAST_SKOLEM_NAT_, isa.all_fort_instances(test_type, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 2300L)
    public static SubLObject assert_query_suggestor_concept_info(SubLObject concept) {
        SubLObject result = NIL;
        SubLObject time = NIL;
        SubLObject time_var = Time.get_internal_real_time();
        result = cyc_kernel.cyc_assert(listS($$conceptPertinentToDegree, concept, $list8), $list9, UNPROVIDED);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(result, time);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 2600L)
    public static SubLObject unassert_query_suggestor_concept_info(SubLObject concept) {
        return cyc_kernel.cyc_unassert(listS($$conceptPertinentToDegree, concept, $list8), $list9);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 2800L)
    public static SubLObject query_suggestor_relevant_queries(SubLObject concept) {
        return backward.removal_ask_variable($sym10$_QUERY, list($$cycLQuerySpecificationPertinentTo, $sym10$_QUERY, narts_high.find_nart($list12), list($$TheSet, concept)), $$InferencePSC, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 3000L)
    public static SubLObject english_gloss_for_relevant_query(SubLObject query) {
        SubLObject results = inference_kernel.new_cyc_query(listS($$formulaTemplateGloss, list($$TemplateFromTestQueryFn, query), $list17), $$TestVocabularyMt, $list19);
        if (NIL != results) {
            return results.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 3700L)
    public static SubLObject run_query_suggestor_query(SubLObject query) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
        try {
            control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
            result = kbq_query_run.kbq_run_query(query, $query_suggestor_query_metrics$.getGlobalValue(), $int$600, NIL, T, UNPROVIDED);
        } finally {
            control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 4000L)
    public static SubLObject query_suggestor_concept_computations(SubLObject cfasl_concepts_file) {
        SubLObject run_set = kbq_query_run.kbq_load_query_set_run(cfasl_concepts_file);
        SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(run_set);
        SubLObject quiescence_times = NIL;
        SubLObject answerables_num_list = NIL;
        SubLObject unanswerables_num_list = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            quiescence_times = cons(conses_high.getf(query_run, $QUIESCENCE, UNPROVIDED), quiescence_times);
            answerables_num_list = cons(conses_high.getf(query_run, $ANSWERABLES, UNPROVIDED), answerables_num_list);
            unanswerables_num_list = cons(conses_high.getf(query_run, $UNANSWERABLES, UNPROVIDED), unanswerables_num_list);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Values.values(quiescence_times, answerables_num_list, unanswerables_num_list);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 4500L)
    public static SubLObject query_suggestor_run_test_for_concept(SubLObject concept, SubLObject html_file, SubLObject cfasl_concepts_stream, SubLObject cfasl_queries_stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        update_query_suggestor_html_output(concept, list($CONCEPT, concept), html_file);
        thread.resetMultipleValues();
        SubLObject assertedP = assert_query_suggestor_concept_info(concept);
        SubLObject quiescence_time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == assertedP) {
            Errors.warn($str27$Concept_not_asserted_to_be_pertin);
            return NIL;
        }
        update_query_suggestor_html_output(concept, list($QUIESCENCE, quiescence_time), html_file);
        SubLObject relevant_queries = query_suggestor_relevant_queries(concept);
        SubLObject concept_result = NIL;
        SubLObject query_result = NIL;
        SubLObject query_results = NIL;
        SubLObject cdolist_list_var = relevant_queries;
        SubLObject relevant_query = NIL;
        relevant_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_result = run_query_suggestor_query(relevant_query);
            query_results = cons(query_result, query_results);
            kbq_query_run.kbq_save_query_run(query_result, cfasl_queries_stream);
            cdolist_list_var = cdolist_list_var.rest();
            relevant_query = cdolist_list_var.first();
        }
        SubLObject total = Sequences.length(query_results);
        SubLObject answerables = answerable_query_runs(query_results);
        SubLObject unanswerables = unanswerable_query_runs(query_results);
        SubLObject answerables_num = Sequences.length(answerables);
        SubLObject unanswerables_num = Sequences.length(unanswerables);
        SubLObject ratio_string = PrintLow.format(NIL, $str28$_a__a, answerables_num, unanswerables_num);
        concept_result = conses_high.putf(concept_result, $CONCEPT, concept);
        concept_result = conses_high.putf(concept_result, $QUIESCENCE, quiescence_time);
        concept_result = conses_high.putf(concept_result, $TOTAL, total);
        concept_result = conses_high.putf(concept_result, $ANSWERABLES, answerables_num);
        concept_result = conses_high.putf(concept_result, $UNANSWERABLES, unanswerables_num);
        kbq_query_run.kbq_save_query_run(concept_result, cfasl_concepts_stream);
        update_query_suggestor_html_output(concept, list($TOTAL, total), html_file);
        update_query_suggestor_html_output(concept, list($RATIO, ratio_string), html_file);
        update_query_suggestor_html_output(concept, list($ANSWERABLES, answerables), html_file);
        update_query_suggestor_html_output(concept, list($UNANSWERABLES, unanswerables), html_file);
        unassert_query_suggestor_concept_info(concept);
        return concept;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 6600L)
    public static SubLObject make_query_suggestor_html_file(SubLObject test_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != query_suggestor_singleton_test_typeP(test_type)) {
            test_type = query_suggestor_singleton_test_type_sole_instance(test_type);
        }
        SubLObject universal_date = Time.get_universal_time();
        SubLObject html_file = PrintLow.format(NIL, $str31$_a__a__a_htm, new SubLObject[] { $query_suggestor_output_dir$.getDynamicValue(thread), constants_high.constant_name(test_type), universal_date });
        update_query_suggestor_html_intro(test_type, html_file, universal_date);
        $query_suggestor_file_name$.setDynamicValue(PrintLow.format(NIL, $str32$_a__a, constants_high.constant_name(test_type), universal_date), thread);
        return html_file;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 7200L)
    public static SubLObject query_suggestor_html_strong_desc_row(SubLObject desc, SubLObject value) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_princ_strong(desc);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return value;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 7500L)
    public static SubLObject query_suggestor_html_row(SubLObject desc, SubLObject value) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_princ(desc);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return value;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 7700L)
    public static SubLObject update_query_suggestor_html_intro(SubLObject test_type, SubLObject html_file, SubLObject universal_time) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            SubLObject stream_$5 = stream;
            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$5, thread);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_princ_strong($str36$Test_Date__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_utilities.cb_show_date(numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    query_suggestor_html_strong_desc_row($str37$KB__, control_vars.kb_loaded());
                    query_suggestor_html_strong_desc_row($str38$System__, system_info.cyc_revision_string());
                    query_suggestor_html_strong_desc_row($str39$Test_Type__, test_type);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return test_type;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 8300L)
    public static SubLObject update_query_suggestor_html_output(SubLObject concept, SubLObject data, SubLObject html_file) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            SubLObject stream_$10 = stream;
            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$10, thread);
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                SubLObject pcase_var;
                SubLObject query_num;
                SubLObject cdolist_list_var;
                SubLObject answerable;
                SubLObject unanswerable;
                for (remainder = NIL, remainder = data; NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    pcase_var = property;
                    if (pcase_var.eql($CONCEPT)) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_string($str41$_________________________________, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_newline(TWO_INTEGER);
                        html_utilities.html_princ_strong($str42$Concept__);
                        html_utilities.html_spaces(EIGHTEEN_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_flush();
                    } else if (pcase_var.eql($QUIESCENCE)) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ($str43$Time_to_Quiescence_);
                        html_utilities.html_spaces(EIGHT_INTEGER);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                        html_utilities.html_flush();
                    } else if (pcase_var.eql($TOTAL)) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_princ($str44$Total_Number_of_Queries_);
                        html_utilities.html_spaces(FOUR_INTEGER);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                    } else if (pcase_var.eql($RATIO)) {
                        html_utilities.html_newline(UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str45$Answerable_Unanswerable___A, value);
                    } else if (pcase_var.eql($ANSWERABLES)) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_string($str46$Answerable_Queries_, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_spaces(FIVE_INTEGER);
                        query_num = ZERO_INTEGER;
                        cdolist_list_var = value;
                        answerable = NIL;
                        answerable = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_utilities.html_newline(UNPROVIDED);
                            query_num = Numbers.add(query_num, ONE_INTEGER);
                            update_query_suggestor_html_with_query_result(concept, answerable, query_num);
                            cdolist_list_var = cdolist_list_var.rest();
                            answerable = cdolist_list_var.first();
                        }
                    } else if (pcase_var.eql($UNANSWERABLES)) {
                        html_utilities.html_newline(UNPROVIDED);
                        html_utilities.html_string($str47$Unanswerable_Queries_, UNPROVIDED, UNPROVIDED);
                        query_num = ZERO_INTEGER;
                        cdolist_list_var = value;
                        unanswerable = NIL;
                        unanswerable = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_utilities.html_newline(UNPROVIDED);
                            query_num = Numbers.add(query_num, ONE_INTEGER);
                            update_query_suggestor_html_with_query_result(concept, unanswerable, query_num);
                            cdolist_list_var = cdolist_list_var.rest();
                            unanswerable = cdolist_list_var.first();
                        }
                    }
                }
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return concept;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 9700L)
    public static SubLObject update_query_suggestor_html_with_query_result(SubLObject concept, SubLObject query_result, SubLObject query_num) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query = conses_high.getf(query_result, $QUERY, UNPROVIDED);
        SubLObject answer_count = conses_high.getf(query_result, $ANSWER_COUNT, UNPROVIDED);
        SubLObject query_gloss = english_gloss_for_relevant_query(query);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(ZERO_INTEGER);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(TEN_INTEGER);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_spaces(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ZERO_INTEGER);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, query_gloss);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(TWO_INTEGER);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                thread.resetMultipleValues();
                                SubLObject sentence = kb_query.kbq_query_arguments(query, UNPROVIDED);
                                SubLObject mt = thread.secondMultipleValue();
                                SubLObject query_properties = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                html_utilities.html_princ(sentence);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(TEN_INTEGER);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_spaces(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                            SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(ZERO_INTEGER);
                                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($int$150);
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str52$Number_of_Bindings__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, answer_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($int$150);
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str53$Bindings__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        SubLObject results = conses_high.getf(query_result, $RESULT, UNPROVIDED);
                                        update_query_suggestor_html_with_results(concept, results, query_num, answer_count, query_gloss);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($int$150);
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str55$Time_To_First_Answer__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, conses_high.getf(query_result, $TIME_TO_FIRST_ANSWER, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                    SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($TOP));
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($int$150);
                                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ($str57$Complete_Total_Time__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                                        SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, conses_high.getf(query_result, $COMPLETE_TOTAL_TIME, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_flush();
        return query;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 11500L)
    public static SubLObject update_query_suggestor_html_with_results(SubLObject concept, SubLObject results, SubLObject query_num, SubLObject answer_count, SubLObject query_gloss) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == results) {
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, results);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
        SubLObject concept_id = NIL;
        SubLObject html_file = NIL;
        if (answer_count.numG(TEN_INTEGER)) {
            if (isConstSym(concept)) {
                concept_id = constants_high.constant_name(concept);
            } else if (NIL != nart_handles.nart_p(concept)) {
                concept_id = PrintLow.format(NIL, $str59$n_a, nart_handles.nart_id(concept));
            }
            html_file = PrintLow.format(NIL, $str60$_a_extra_answers__a__a__a_htm, new SubLObject[] { $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread), concept_id, query_num });
        }
        if (NIL == concept_id) {
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                result = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, result);
                    html_utilities.html_newline(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_file);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_utilities.html_princ($str61$Bindings_for_Query);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            SubLObject stream_$35 = stream;
            SubLObject _prev_bind_3 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$35, thread);
                SubLObject main_test = PrintLow.format(NIL, $str62$_a__a_htm, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(main_test);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_princ($str63$Back_to_Main_Test_Run);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_princ_strong($str64$Query__);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, query_gloss);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_princ_strong($str65$Bindings_);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(TEN_INTEGER);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_spaces(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var2 = results;
                            SubLObject result2 = NIL;
                            result2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, result2);
                                html_utilities.html_newline(UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                result2 = cdolist_list_var2.first();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_flush();
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_3, thread);
            }
        } finally {
            SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 13100L)
    public static SubLObject update_query_suggestor_html_with_computations(SubLObject html_file, SubLObject cfasl_concepts_file, SubLObject cfasl_queries_file) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject quiescence_times = query_suggestor_concept_computations(cfasl_concepts_file);
        SubLObject answerables_num_list = thread.secondMultipleValue();
        SubLObject unanswerables_num_list = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            SubLObject stream_$41 = stream;
            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$41, thread);
                html_utilities.html_newline(TWO_INTEGER);
                html_utilities.html_string($str66$_________________________________, UNPROVIDED, UNPROVIDED);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_princ_strong($str67$Test_run_Summary);
                html_utilities.html_newline(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(ZERO_INTEGER);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    query_suggestor_html_row($str68$Median_Quiescence_Time__, number_utilities.median(quiescence_times, UNPROVIDED, UNPROVIDED));
                    query_suggestor_html_row($str69$Mean_Quiescence_Time__, number_utilities.mean(quiescence_times));
                    query_suggestor_html_row($str70$Median_Answerables__, number_utilities.median(answerables_num_list, UNPROVIDED, UNPROVIDED));
                    query_suggestor_html_row($str71$Mean_Answerables__, number_utilities.mean(answerables_num_list));
                    query_suggestor_html_row($str72$Median_Unanswerables__, number_utilities.median(unanswerables_num_list, UNPROVIDED, UNPROVIDED));
                    query_suggestor_html_row($str73$Mean_Unanswerables__, number_utilities.mean(unanswerables_num_list));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html_file;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 14200L)
    public static SubLObject query_suggestor_run_tests_for_test_type(SubLObject test_type, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_suggestor_test_typeP(test_type) : test_type;
        SubLObject concepts = query_suggestor_concepts(test_type);
        SubLObject html_file = make_query_suggestor_html_file(test_type);
        SubLObject cfasl_concepts_file = PrintLow.format(NIL, $str74$_a__a_concepts_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
        SubLObject cfasl_queries_file = PrintLow.format(NIL, $str75$_a__a_queries_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
        SubLObject cfasl_concepts_stream = NIL;
        SubLObject cfasl_queries_stream = NIL;
        if (num.isInteger()) {
            concepts = list_utilities.first_n(num, concepts);
        }
        if (NIL != cfasl_concepts_file) {
            cfasl_concepts_stream = kbq_query_run.kbq_open_query_set_run_output_stream(cfasl_concepts_file, UNPROVIDED);
        }
        if (NIL != cfasl_queries_file) {
            cfasl_queries_stream = kbq_query_run.kbq_open_query_set_run_output_stream(cfasl_queries_file, UNPROVIDED);
        }
        if (NIL != cfasl_concepts_stream) {
            kbq_query_run.kbq_save_query_set_run_preamble(cfasl_concepts_stream, html_file);
        }
        if (NIL != cfasl_queries_stream) {
            kbq_query_run.kbq_save_query_set_run_preamble(cfasl_queries_stream, html_file);
        }
        SubLObject cdolist_list_var = concepts;
        SubLObject concept = NIL;
        concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
                print_high.princ($str76$_, StreamsLow.$standard_output$.getDynamicValue(thread));
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            query_suggestor_run_test_for_concept(concept, html_file, cfasl_concepts_stream, cfasl_queries_stream);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        }
        if (cfasl_concepts_stream.isStream()) {
            streams_high.close(cfasl_concepts_stream, UNPROVIDED);
        }
        if (cfasl_queries_stream.isStream()) {
            streams_high.close(cfasl_queries_stream, UNPROVIDED);
        }
        update_query_suggestor_html_with_computations(html_file, cfasl_concepts_file, cfasl_queries_file);
        return test_type;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 15900L)
    public static SubLObject query_suggestor_run_tests(SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time = NIL;
        PrintLow.format(T, $str77$__Run_starting_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        streams_high.force_output(UNPROVIDED);
        SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdolist_list_var = $query_suggestor_test_types$.getDynamicValue(thread);
        SubLObject test_type = NIL;
        test_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_suggestor_run_tests_for_test_type(test_type, num);
            cdolist_list_var = cdolist_list_var.rest();
            test_type = cdolist_list_var.first();
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format(T, $str78$__Run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        streams_high.force_output(UNPROVIDED);
        PrintLow.format(T, $str79$__Elapsed_time___A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, UNPROVIDED)));
        streams_high.force_output(UNPROVIDED);
        return time;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 16400L)
    public static SubLObject query_suggestor_run_tests_for_instances_to_dir(SubLObject col, SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
        SubLObject _prev_bind_2 = $query_suggestor_output_dir$.currentBinding(thread);
        try {
            $query_suggestor_test_types$.bind(list(col), thread);
            $query_suggestor_output_dir$.bind(dir, thread);
            result = query_suggestor_run_tests(num);
        } finally {
            $query_suggestor_output_dir$.rebind(_prev_bind_2, thread);
            $query_suggestor_test_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 16700L)
    public static SubLObject query_suggestor_run_tests_for_to_dir(SubLObject v_term, SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert isConstSym(v_term) : v_term;
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
        SubLObject _prev_bind_2 = $query_suggestor_output_dir$.currentBinding(thread);
        try {
            $query_suggestor_test_types$.bind(list(list($TERM, v_term)), thread);
            $query_suggestor_output_dir$.bind(dir, thread);
            result = query_suggestor_run_tests(num);
        } finally {
            $query_suggestor_output_dir$.rebind(_prev_bind_2, thread);
            $query_suggestor_test_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 17000L)
    public static SubLObject query_suggestor_run_trial_test() {
        query_suggestor_run_tests(TWO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 17100L)
    public static SubLObject filter_query_runs_by_test(SubLObject query_runs, SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = Symbols.symbol_function(IDENTITY);
        }
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Functions.funcall(test, Functions.funcall(key, query_run))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_runs);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 17500L)
    public static SubLObject filter_query_runs_by_property_value(SubLObject query_runs, SubLObject property, SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = Symbols.symbol_function(EQUAL);
        }
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Functions.funcall(test, value, kbq_query_run.kbq_query_run_property_value(query_run, property, value))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_runs);
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 17900L)
    public static SubLObject answerable_query_runs(SubLObject query_runs) {
        return filter_query_runs_by_test(query_runs, Symbols.symbol_function($sym81$POSITIVE_INTEGER_P), Symbols.symbol_function($sym82$KBQ_QUERY_RUN_ANSWER_COUNT));
    }

    @SubL(source = "cycl/inference/query-suggestor.lisp", position = 18100L)
    public static SubLObject unanswerable_query_runs(SubLObject query_runs) {
        return filter_query_runs_by_property_value(query_runs, $ANSWER_COUNT, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject declare_query_suggestor_file() {
        declareFunction(myName, "query_suggestor_singleton_test_typeP", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?", 1, 0, false);
        declareFunction(myName, "query_suggestor_singleton_test_type_sole_instance", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE-SOLE-INSTANCE", 1, 0, false);
        declareFunction(myName, "query_suggestor_test_typeP", "QUERY-SUGGESTOR-TEST-TYPE?", 1, 0, false);
        declareFunction(myName, "query_suggestor_concepts", "QUERY-SUGGESTOR-CONCEPTS", 1, 0, false);
        declareFunction(myName, "assert_query_suggestor_concept_info", "ASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        declareFunction(myName, "unassert_query_suggestor_concept_info", "UNASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        declareFunction(myName, "query_suggestor_relevant_queries", "QUERY-SUGGESTOR-RELEVANT-QUERIES", 1, 0, false);
        declareFunction(myName, "english_gloss_for_relevant_query", "ENGLISH-GLOSS-FOR-RELEVANT-QUERY", 1, 0, false);
        declareFunction(myName, "run_query_suggestor_query", "RUN-QUERY-SUGGESTOR-QUERY", 1, 0, false);
        declareFunction(myName, "query_suggestor_concept_computations", "QUERY-SUGGESTOR-CONCEPT-COMPUTATIONS", 1, 0, false);
        declareFunction(myName, "query_suggestor_run_test_for_concept", "QUERY-SUGGESTOR-RUN-TEST-FOR-CONCEPT", 4, 0, false);
        declareFunction(myName, "make_query_suggestor_html_file", "MAKE-QUERY-SUGGESTOR-HTML-FILE", 1, 0, false);
        declareFunction(myName, "query_suggestor_html_strong_desc_row", "QUERY-SUGGESTOR-HTML-STRONG-DESC-ROW", 2, 0, false);
        declareFunction(myName, "query_suggestor_html_row", "QUERY-SUGGESTOR-HTML-ROW", 2, 0, false);
        declareFunction(myName, "update_query_suggestor_html_intro", "UPDATE-QUERY-SUGGESTOR-HTML-INTRO", 3, 0, false);
        declareFunction(myName, "update_query_suggestor_html_output", "UPDATE-QUERY-SUGGESTOR-HTML-OUTPUT", 3, 0, false);
        declareFunction(myName, "update_query_suggestor_html_with_query_result", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-QUERY-RESULT", 3, 0, false);
        declareFunction(myName, "update_query_suggestor_html_with_results", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-RESULTS", 5, 0, false);
        declareFunction(myName, "update_query_suggestor_html_with_computations", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-COMPUTATIONS", 3, 0, false);
        declareFunction(myName, "query_suggestor_run_tests_for_test_type", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TEST-TYPE", 1, 1, false);
        declareFunction(myName, "query_suggestor_run_tests", "QUERY-SUGGESTOR-RUN-TESTS", 0, 1, false);
        declareFunction(myName, "query_suggestor_run_tests_for_instances_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-INSTANCES-TO-DIR", 2, 1, false);
        declareFunction(myName, "query_suggestor_run_tests_for_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TO-DIR", 2, 1, false);
        declareFunction(myName, "query_suggestor_run_trial_test", "QUERY-SUGGESTOR-RUN-TRIAL-TEST", 0, 0, false);
        declareFunction(myName, "filter_query_runs_by_test", "FILTER-QUERY-RUNS-BY-TEST", 2, 1, false);
        declareFunction(myName, "filter_query_runs_by_property_value", "FILTER-QUERY-RUNS-BY-PROPERTY-VALUE", 3, 1, false);
        declareFunction(myName, "answerable_query_runs", "ANSWERABLE-QUERY-RUNS", 1, 0, false);
        declareFunction(myName, "unanswerable_query_runs", "UNANSWERABLE-QUERY-RUNS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_query_suggestor_file() {
        $query_suggestor_test_types$ = defvar("*QUERY-SUGGESTOR-TEST-TYPES*", $list0);
        $query_suggestor_output_dir$ = defparameter("*QUERY-SUGGESTOR-OUTPUT-DIR*", $str3$_cyc_projects_Topsail_query_sugge);
        $query_suggestor_file_name$ = defvar("*QUERY-SUGGESTOR-FILE-NAME*", NIL);
        $query_suggestor_query_metrics$ = deflexical("*QUERY-SUGGESTOR-QUERY-METRICS*", $list20);
        $query_suggestor_concept_metrics$ = deflexical("*QUERY-SUGGESTOR-CONCEPT-METRICS*", $list21);
        return NIL;
    }

    public static SubLObject setup_query_suggestor_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_query_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_query_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_query_suggestor_file();
    }

    static {
        me = new query_suggestor();
        $query_suggestor_test_types$ = null;
        $query_suggestor_output_dir$ = null;
        $query_suggestor_file_name$ = null;
        $query_suggestor_query_metrics$ = null;
        $query_suggestor_concept_metrics$ = null;
        $list0 = list(makeConstSym(("Terrorist")), makeConstSym(("TerroristGroup")), makeConstSym(("IndependentCountry")));
        $TERM = makeKeyword("TERM");
        $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_ = makeSymbol("QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?");
        $str3$_cyc_projects_Topsail_query_sugge = makeString("/cyc/projects/Topsail/query-suggestor");
        $sym4$QUERY_SUGGESTOR_TEST_TYPE_ = makeSymbol("QUERY-SUGGESTOR-TEST-TYPE?");
        $$TKBSourceSpindleCollectorMt = makeConstSym(("TKBSourceSpindleCollectorMt"));
        $sym6$FAST_SKOLEM_NAT_ = makeSymbol("FAST-SKOLEM-NAT?");
        $$conceptPertinentToDegree = makeConstSym(("conceptPertinentToDegree"));
        $list8 = list(list(makeConstSym(("HighAmountFn")), makeConstSym(("Relevance"))));
        $list9 = list(makeConstSym(("TaskModelMtFn")), makeConstSym(("Allotment-8")));
        $sym10$_QUERY = makeSymbol("?QUERY");
        $$cycLQuerySpecificationPertinentTo = makeConstSym(("cycLQuerySpecificationPertinentToDegree"));
        $list12 = list(makeConstSym(("VeryHighAmountFn")), makeConstSym(("Relevance")));
        $$TheSet = makeConstSym(("TheSet"));
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $$formulaTemplateGloss = makeConstSym(("formulaTemplateGloss"));
        $$TemplateFromTestQueryFn = makeConstSym(("TemplateFromTestQueryFn"));
        $list17 = list(makeSymbol("?GLOSS"));
        $$TestVocabularyMt = makeConstSym(("TestVocabularyMt"));
        $list19 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")));
        $list20 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));
        $list21 = list(makeKeyword("QUIESCENCE"), makeKeyword("TOTAL"), makeKeyword("ANSWERABLES"), makeKeyword("UNANSWERABLES"));
        $int$600 = makeInteger(600);
        $QUIESCENCE = makeKeyword("QUIESCENCE");
        $ANSWERABLES = makeKeyword("ANSWERABLES");
        $UNANSWERABLES = makeKeyword("UNANSWERABLES");
        $CONCEPT = makeKeyword("CONCEPT");
        $str27$Concept_not_asserted_to_be_pertin = makeString("Concept not asserted to be pertinent");
        $str28$_a__a = makeString("~a/~a");
        $TOTAL = makeKeyword("TOTAL");
        $RATIO = makeKeyword("RATIO");
        $str31$_a__a__a_htm = makeString("~a/~a-~a.htm");
        $str32$_a__a = makeString("~a-~a");
        $str33$_a = makeString("~a");
        $OUTPUT = makeKeyword("OUTPUT");
        $str35$Unable_to_open__S = makeString("Unable to open ~S");
        $str36$Test_Date__ = makeString("Test Date: ");
        $str37$KB__ = makeString("KB: ");
        $str38$System__ = makeString("System: ");
        $str39$Test_Type__ = makeString("Test Type: ");
        $APPEND = makeKeyword("APPEND");
        $str41$_________________________________ = makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $str42$Concept__ = makeString("Concept: ");
        $str43$Time_to_Quiescence_ = makeString("Time to Quiescence:");
        $str44$Total_Number_of_Queries_ = makeString("Total Number of Queries:");
        $str45$Answerable_Unanswerable___A = makeString("Answerable/Unanswerable: ~A");
        $str46$Answerable_Queries_ = makeString("Answerable Queries:");
        $str47$Unanswerable_Queries_ = makeString("Unanswerable Queries:");
        $QUERY = makeKeyword("QUERY");
        $ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
        $TOP = makeKeyword("TOP");
        $int$150 = makeInteger(150);
        $str52$Number_of_Bindings__ = makeString("Number of Bindings: ");
        $str53$Bindings__ = makeString("Bindings: ");
        $RESULT = makeKeyword("RESULT");
        $str55$Time_To_First_Answer__ = makeString("Time To First Answer: ");
        $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
        $str57$Complete_Total_Time__ = makeString("Complete Total Time: ");
        $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
        $str59$n_a = makeString("n~a");
        $str60$_a_extra_answers__a__a__a_htm = makeString("~a/extra-answers/~a-~a-~a.htm");
        $str61$Bindings_for_Query = makeString("Bindings for Query");
        $str62$_a__a_htm = makeString("~a/~a.htm");
        $str63$Back_to_Main_Test_Run = makeString("Back to Main Test Run");
        $str64$Query__ = makeString("Query: ");
        $str65$Bindings_ = makeString("Bindings:");
        $str66$_________________________________ = makeString("****************************************");
        $str67$Test_run_Summary = makeString("Test run Summary");
        $str68$Median_Quiescence_Time__ = makeString("Median Quiescence Time: ");
        $str69$Mean_Quiescence_Time__ = makeString("Mean Quiescence Time: ");
        $str70$Median_Answerables__ = makeString("Median Answerables: ");
        $str71$Mean_Answerables__ = makeString("Mean Answerables: ");
        $str72$Median_Unanswerables__ = makeString("Median Unanswerables: ");
        $str73$Mean_Unanswerables__ = makeString("Mean Unanswerables: ");
        $str74$_a__a_concepts_cfasl = makeString("~a/~a-concepts.cfasl");
        $str75$_a__a_queries_cfasl = makeString("~a/~a-queries.cfasl");
        $str76$_ = makeString("*");
        $str77$__Run_starting_at__A = makeString("~%Run starting at ~A");
        $str78$__Run_ended_at__A = makeString("~%Run ended at ~A");
        $str79$__Elapsed_time___A = makeString("~%Elapsed time: ~A");
        $sym80$CONSTANT_P = makeSymbol("CONSTANT-P");
        $sym81$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
        $sym82$KBQ_QUERY_RUN_ANSWER_COUNT = makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");
    }
}
/*
 *
 * Total time: 676 ms
 *
 */