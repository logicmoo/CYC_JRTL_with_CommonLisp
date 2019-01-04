package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_suggestor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.query_suggestor";
    public static final String myFingerPrint = "6dbd3f02d8302c3e5fc2393c02078f6537475f084e4c4d8499b30fe729948178";
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 898L)
    public static SubLSymbol $query_suggestor_test_types$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1654L)
    private static SubLSymbol $query_suggestor_output_dir$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1747L)
    public static SubLSymbol $query_suggestor_file_name$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 3372L)
    private static SubLSymbol $query_suggestor_query_metrics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 3585L)
    private static SubLSymbol $query_suggestor_concept_metrics$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$TERM;
    private static final SubLSymbol $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_;
    private static final SubLString $str3$_cyc_projects_Topsail_query_sugge;
    private static final SubLSymbol $sym4$QUERY_SUGGESTOR_TEST_TYPE_;
    private static final SubLObject $const5$TKBSourceSpindleCollectorMt;
    private static final SubLSymbol $sym6$FAST_SKOLEM_NAT_;
    private static final SubLObject $const7$conceptPertinentToDegree;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$_QUERY;
    private static final SubLObject $const11$cycLQuerySpecificationPertinentTo;
    private static final SubLList $list12;
    private static final SubLObject $const13$TheSet;
    private static final SubLObject $const14$InferencePSC;
    private static final SubLObject $const15$formulaTemplateGloss;
    private static final SubLObject $const16$TemplateFromTestQueryFn;
    private static final SubLList $list17;
    private static final SubLObject $const18$TestVocabularyMt;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLInteger $int22$600;
    private static final SubLSymbol $kw23$QUIESCENCE;
    private static final SubLSymbol $kw24$ANSWERABLES;
    private static final SubLSymbol $kw25$UNANSWERABLES;
    private static final SubLSymbol $kw26$CONCEPT;
    private static final SubLString $str27$Concept_not_asserted_to_be_pertin;
    private static final SubLString $str28$_a__a;
    private static final SubLSymbol $kw29$TOTAL;
    private static final SubLSymbol $kw30$RATIO;
    private static final SubLString $str31$_a__a__a_htm;
    private static final SubLString $str32$_a__a;
    private static final SubLString $str33$_a;
    private static final SubLSymbol $kw34$OUTPUT;
    private static final SubLString $str35$Unable_to_open__S;
    private static final SubLString $str36$Test_Date__;
    private static final SubLString $str37$KB__;
    private static final SubLString $str38$System__;
    private static final SubLString $str39$Test_Type__;
    private static final SubLSymbol $kw40$APPEND;
    private static final SubLString $str41$_________________________________;
    private static final SubLString $str42$Concept__;
    private static final SubLString $str43$Time_to_Quiescence_;
    private static final SubLString $str44$Total_Number_of_Queries_;
    private static final SubLString $str45$Answerable_Unanswerable___A;
    private static final SubLString $str46$Answerable_Queries_;
    private static final SubLString $str47$Unanswerable_Queries_;
    private static final SubLSymbol $kw48$QUERY;
    private static final SubLSymbol $kw49$ANSWER_COUNT;
    private static final SubLSymbol $kw50$TOP;
    private static final SubLInteger $int51$150;
    private static final SubLString $str52$Number_of_Bindings__;
    private static final SubLString $str53$Bindings__;
    private static final SubLSymbol $kw54$RESULT;
    private static final SubLString $str55$Time_To_First_Answer__;
    private static final SubLSymbol $kw56$TIME_TO_FIRST_ANSWER;
    private static final SubLString $str57$Complete_Total_Time__;
    private static final SubLSymbol $kw58$COMPLETE_TOTAL_TIME;
    private static final SubLString $str59$n_a;
    private static final SubLString $str60$_a_extra_answers__a__a__a_htm;
    private static final SubLString $str61$Bindings_for_Query;
    private static final SubLString $str62$_a__a_htm;
    private static final SubLString $str63$Back_to_Main_Test_Run;
    private static final SubLString $str64$Query__;
    private static final SubLString $str65$Bindings_;
    private static final SubLString $str66$_________________________________;
    private static final SubLString $str67$Test_run_Summary;
    private static final SubLString $str68$Median_Quiescence_Time__;
    private static final SubLString $str69$Mean_Quiescence_Time__;
    private static final SubLString $str70$Median_Answerables__;
    private static final SubLString $str71$Mean_Answerables__;
    private static final SubLString $str72$Median_Unanswerables__;
    private static final SubLString $str73$Mean_Unanswerables__;
    private static final SubLString $str74$_a__a_concepts_cfasl;
    private static final SubLString $str75$_a__a_queries_cfasl;
    private static final SubLString $str76$_;
    private static final SubLString $str77$__Run_starting_at__A;
    private static final SubLString $str78$__Run_ended_at__A;
    private static final SubLString $str79$__Elapsed_time___A;
    private static final SubLSymbol $sym80$CONSTANT_P;
    private static final SubLSymbol $sym81$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym82$KBQ_QUERY_RUN_ANSWER_COUNT;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1164L)
    public static SubLObject query_suggestor_singleton_test_typeP(final SubLObject test_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(test_type.isCons() && query_suggestor.$kw1$TERM == test_type.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1299L)
    public static SubLObject query_suggestor_singleton_test_type_sole_instance(final SubLObject test_type) {
        assert query_suggestor.NIL != query_suggestor_singleton_test_typeP(test_type) : test_type;
        return conses_high.second(test_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1468L)
    public static SubLObject query_suggestor_test_typeP(final SubLObject test_type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_suggestor.NIL != query_suggestor_singleton_test_typeP(test_type) || (query_suggestor.NIL != constant_handles.constant_p(test_type) && query_suggestor.NIL != fort_types_interface.collection_p(test_type)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 1798L)
    public static SubLObject query_suggestor_concepts(final SubLObject test_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert query_suggestor.NIL != query_suggestor_test_typeP(test_type) : test_type;
        if (query_suggestor.NIL != query_suggestor_singleton_test_typeP(test_type)) {
            return (SubLObject)ConsesLow.list(query_suggestor_singleton_test_type_sole_instance(test_type));
        }
        SubLObject v_answer = (SubLObject)query_suggestor.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(query_suggestor.$const5$TKBSourceSpindleCollectorMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_answer = Sequences.remove_if((SubLObject)query_suggestor.$sym6$FAST_SKOLEM_NAT_, isa.all_fort_instances(test_type, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED), (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 2337L)
    public static SubLObject assert_query_suggestor_concept_info(final SubLObject concept) {
        SubLObject result = (SubLObject)query_suggestor.NIL;
        SubLObject time = (SubLObject)query_suggestor.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        result = cyc_kernel.cyc_assert((SubLObject)ConsesLow.listS(query_suggestor.$const7$conceptPertinentToDegree, concept, (SubLObject)query_suggestor.$list8), (SubLObject)query_suggestor.$list9, (SubLObject)query_suggestor.UNPROVIDED);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(result, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 2619L)
    public static SubLObject unassert_query_suggestor_concept_info(final SubLObject concept) {
        return cyc_kernel.cyc_unassert((SubLObject)ConsesLow.listS(query_suggestor.$const7$conceptPertinentToDegree, concept, (SubLObject)query_suggestor.$list8), (SubLObject)query_suggestor.$list9);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 2818L)
    public static SubLObject query_suggestor_relevant_queries(final SubLObject concept) {
        return backward.removal_ask_variable((SubLObject)query_suggestor.$sym10$_QUERY, (SubLObject)ConsesLow.list(query_suggestor.$const11$cycLQuerySpecificationPertinentTo, (SubLObject)query_suggestor.$sym10$_QUERY, narts_high.find_nart((SubLObject)query_suggestor.$list12), (SubLObject)ConsesLow.list(query_suggestor.$const13$TheSet, concept)), query_suggestor.$const14$InferencePSC, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 3094L)
    public static SubLObject english_gloss_for_relevant_query(final SubLObject query) {
        final SubLObject results = inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(query_suggestor.$const15$formulaTemplateGloss, (SubLObject)ConsesLow.list(query_suggestor.$const16$TemplateFromTestQueryFn, query), (SubLObject)query_suggestor.$list17), query_suggestor.$const18$TestVocabularyMt, (SubLObject)query_suggestor.$list19);
        if (query_suggestor.NIL != results) {
            return results.first();
        }
        return (SubLObject)query_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 3778L)
    public static SubLObject run_query_suggestor_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)query_suggestor.NIL;
        final SubLObject _prev_bind_0 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
        try {
            control_vars.$kbq_run_query_non_continuable_enabledP$.bind((SubLObject)query_suggestor.NIL, thread);
            result = kbq_query_run.kbq_run_query(query, query_suggestor.$query_suggestor_query_metrics$.getGlobalValue(), (SubLObject)query_suggestor.$int22$600, (SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.T, (SubLObject)query_suggestor.UNPROVIDED);
        }
        finally {
            control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 4012L)
    public static SubLObject query_suggestor_concept_computations(final SubLObject cfasl_concepts_file) {
        final SubLObject run_set = kbq_query_run.kbq_load_query_set_run(cfasl_concepts_file);
        final SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(run_set);
        SubLObject quiescence_times = (SubLObject)query_suggestor.NIL;
        SubLObject answerables_num_list = (SubLObject)query_suggestor.NIL;
        SubLObject unanswerables_num_list = (SubLObject)query_suggestor.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)query_suggestor.NIL;
        query_run = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            quiescence_times = (SubLObject)ConsesLow.cons(conses_high.getf(query_run, (SubLObject)query_suggestor.$kw23$QUIESCENCE, (SubLObject)query_suggestor.UNPROVIDED), quiescence_times);
            answerables_num_list = (SubLObject)ConsesLow.cons(conses_high.getf(query_run, (SubLObject)query_suggestor.$kw24$ANSWERABLES, (SubLObject)query_suggestor.UNPROVIDED), answerables_num_list);
            unanswerables_num_list = (SubLObject)ConsesLow.cons(conses_high.getf(query_run, (SubLObject)query_suggestor.$kw25$UNANSWERABLES, (SubLObject)query_suggestor.UNPROVIDED), unanswerables_num_list);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Values.values(quiescence_times, answerables_num_list, unanswerables_num_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 4592L)
    public static SubLObject query_suggestor_run_test_for_concept(final SubLObject concept, final SubLObject html_file, final SubLObject cfasl_concepts_stream, final SubLObject cfasl_queries_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw26$CONCEPT, concept), html_file);
        thread.resetMultipleValues();
        final SubLObject assertedP = assert_query_suggestor_concept_info(concept);
        final SubLObject quiescence_time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (query_suggestor.NIL == assertedP) {
            Errors.warn((SubLObject)query_suggestor.$str27$Concept_not_asserted_to_be_pertin);
            return (SubLObject)query_suggestor.NIL;
        }
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw23$QUIESCENCE, quiescence_time), html_file);
        final SubLObject relevant_queries = query_suggestor_relevant_queries(concept);
        SubLObject concept_result = (SubLObject)query_suggestor.NIL;
        SubLObject query_result = (SubLObject)query_suggestor.NIL;
        SubLObject query_results = (SubLObject)query_suggestor.NIL;
        SubLObject cdolist_list_var = relevant_queries;
        SubLObject relevant_query = (SubLObject)query_suggestor.NIL;
        relevant_query = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            query_result = run_query_suggestor_query(relevant_query);
            query_results = (SubLObject)ConsesLow.cons(query_result, query_results);
            kbq_query_run.kbq_save_query_run(query_result, cfasl_queries_stream);
            cdolist_list_var = cdolist_list_var.rest();
            relevant_query = cdolist_list_var.first();
        }
        final SubLObject total = Sequences.length(query_results);
        final SubLObject answerables = answerable_query_runs(query_results);
        final SubLObject unanswerables = unanswerable_query_runs(query_results);
        final SubLObject answerables_num = Sequences.length(answerables);
        final SubLObject unanswerables_num = Sequences.length(unanswerables);
        final SubLObject ratio_string = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str28$_a__a, answerables_num, unanswerables_num);
        concept_result = conses_high.putf(concept_result, (SubLObject)query_suggestor.$kw26$CONCEPT, concept);
        concept_result = conses_high.putf(concept_result, (SubLObject)query_suggestor.$kw23$QUIESCENCE, quiescence_time);
        concept_result = conses_high.putf(concept_result, (SubLObject)query_suggestor.$kw29$TOTAL, total);
        concept_result = conses_high.putf(concept_result, (SubLObject)query_suggestor.$kw24$ANSWERABLES, answerables_num);
        concept_result = conses_high.putf(concept_result, (SubLObject)query_suggestor.$kw25$UNANSWERABLES, unanswerables_num);
        kbq_query_run.kbq_save_query_run(concept_result, cfasl_concepts_stream);
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw29$TOTAL, total), html_file);
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw30$RATIO, ratio_string), html_file);
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw24$ANSWERABLES, answerables), html_file);
        update_query_suggestor_html_output(concept, (SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw25$UNANSWERABLES, unanswerables), html_file);
        unassert_query_suggestor_concept_info(concept);
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 6603L)
    public static SubLObject make_query_suggestor_html_file(SubLObject test_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (query_suggestor.NIL != query_suggestor_singleton_test_typeP(test_type)) {
            test_type = query_suggestor_singleton_test_type_sole_instance(test_type);
        }
        final SubLObject universal_date = Time.get_universal_time();
        final SubLObject html_file = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str31$_a__a__a_htm, new SubLObject[] { query_suggestor.$query_suggestor_output_dir$.getDynamicValue(thread), constants_high.constant_name(test_type), universal_date });
        update_query_suggestor_html_intro(test_type, html_file, universal_date);
        query_suggestor.$query_suggestor_file_name$.setDynamicValue(PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str32$_a__a, constants_high.constant_name(test_type), universal_date), thread);
        return html_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 7288L)
    public static SubLObject query_suggestor_html_strong_desc_row(final SubLObject desc, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                html_utilities.html_princ_strong(desc);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, value);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 7513L)
    public static SubLObject query_suggestor_html_row(final SubLObject desc, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                html_utilities.html_princ(desc);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, value);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 7719L)
    public static SubLObject update_query_suggestor_html_intro(final SubLObject test_type, final SubLObject html_file, final SubLObject universal_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)query_suggestor.NIL;
        try {
            stream = compatibility.open_text(html_file, (SubLObject)query_suggestor.$kw34$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)query_suggestor.$str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$5 = stream;
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$5, thread);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            html_utilities.html_princ_strong((SubLObject)query_suggestor.$str36$Test_Date__);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            cb_utilities.cb_show_date(numeric_date_utilities.get_universal_date(universal_time, (SubLObject)query_suggestor.UNPROVIDED));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                    query_suggestor_html_strong_desc_row((SubLObject)query_suggestor.$str37$KB__, control_vars.kb_loaded());
                    query_suggestor_html_strong_desc_row((SubLObject)query_suggestor.$str38$System__, system_info.cyc_revision_string());
                    query_suggestor_html_strong_desc_row((SubLObject)query_suggestor.$str39$Test_Type__, test_type);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_suggestor.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)query_suggestor.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return test_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 8353L)
    public static SubLObject update_query_suggestor_html_output(final SubLObject concept, final SubLObject data, final SubLObject html_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)query_suggestor.NIL;
        try {
            stream = compatibility.open_text(html_file, (SubLObject)query_suggestor.$kw40$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)query_suggestor.$str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$10 = stream;
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
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
                for (remainder = (SubLObject)query_suggestor.NIL, remainder = data; query_suggestor.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    property = remainder.first();
                    value = conses_high.cadr(remainder);
                    pcase_var = property;
                    if (pcase_var.eql((SubLObject)query_suggestor.$kw26$CONCEPT)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_string((SubLObject)query_suggestor.$str41$_________________________________, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)query_suggestor.TWO_INTEGER);
                        html_utilities.html_princ_strong((SubLObject)query_suggestor.$str42$Concept__);
                        html_utilities.html_spaces((SubLObject)query_suggestor.EIGHTEEN_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, value);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_flush();
                    }
                    else if (pcase_var.eql((SubLObject)query_suggestor.$kw23$QUIESCENCE)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)query_suggestor.$str43$Time_to_Quiescence_);
                        html_utilities.html_spaces((SubLObject)query_suggestor.EIGHT_INTEGER);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, value);
                        html_utilities.html_flush();
                    }
                    else if (pcase_var.eql((SubLObject)query_suggestor.$kw29$TOTAL)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)query_suggestor.$str44$Total_Number_of_Queries_);
                        html_utilities.html_spaces((SubLObject)query_suggestor.FOUR_INTEGER);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, value);
                    }
                    else if (pcase_var.eql((SubLObject)query_suggestor.$kw30$RATIO)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str45$Answerable_Unanswerable___A, value);
                    }
                    else if (pcase_var.eql((SubLObject)query_suggestor.$kw24$ANSWERABLES)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_string((SubLObject)query_suggestor.$str46$Answerable_Queries_, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_spaces((SubLObject)query_suggestor.FIVE_INTEGER);
                        query_num = (SubLObject)query_suggestor.ZERO_INTEGER;
                        cdolist_list_var = value;
                        answerable = (SubLObject)query_suggestor.NIL;
                        answerable = cdolist_list_var.first();
                        while (query_suggestor.NIL != cdolist_list_var) {
                            html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                            query_num = Numbers.add(query_num, (SubLObject)query_suggestor.ONE_INTEGER);
                            update_query_suggestor_html_with_query_result(concept, answerable, query_num);
                            cdolist_list_var = cdolist_list_var.rest();
                            answerable = cdolist_list_var.first();
                        }
                    }
                    else if (pcase_var.eql((SubLObject)query_suggestor.$kw25$UNANSWERABLES)) {
                        html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_string((SubLObject)query_suggestor.$str47$Unanswerable_Queries_, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
                        query_num = (SubLObject)query_suggestor.ZERO_INTEGER;
                        cdolist_list_var = value;
                        unanswerable = (SubLObject)query_suggestor.NIL;
                        unanswerable = cdolist_list_var.first();
                        while (query_suggestor.NIL != cdolist_list_var) {
                            html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                            query_num = Numbers.add(query_num, (SubLObject)query_suggestor.ONE_INTEGER);
                            update_query_suggestor_html_with_query_result(concept, unanswerable, query_num);
                            cdolist_list_var = cdolist_list_var.rest();
                            unanswerable = cdolist_list_var.first();
                        }
                    }
                }
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_suggestor.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)query_suggestor.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 9756L)
    public static SubLObject update_query_suggestor_html_with_query_result(final SubLObject concept, final SubLObject query_result, final SubLObject query_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = conses_high.getf(query_result, (SubLObject)query_suggestor.$kw48$QUERY, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject answer_count = conses_high.getf(query_result, (SubLObject)query_suggestor.$kw49$ANSWER_COUNT, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject query_gloss = english_gloss_for_relevant_query(query);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)query_suggestor.TEN_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    html_utilities.html_spaces((SubLObject)query_suggestor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)query_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, query_gloss);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)query_suggestor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                thread.resetMultipleValues();
                                final SubLObject sentence = kb_query.kbq_query_arguments(query, (SubLObject)query_suggestor.UNPROVIDED);
                                final SubLObject mt = thread.secondMultipleValue();
                                final SubLObject query_properties = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                html_utilities.html_princ(sentence);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)query_suggestor.TEN_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                html_utilities.html_spaces((SubLObject)query_suggestor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)query_suggestor.$kw50$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)query_suggestor.$int51$150);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            html_utilities.html_princ((SubLObject)query_suggestor.$str52$Number_of_Bindings__);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, answer_count);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)query_suggestor.$kw50$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)query_suggestor.$int51$150);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            html_utilities.html_princ((SubLObject)query_suggestor.$str53$Bindings__);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        final SubLObject results = conses_high.getf(query_result, (SubLObject)query_suggestor.$kw54$RESULT, (SubLObject)query_suggestor.UNPROVIDED);
                                        update_query_suggestor_html_with_results(concept, results, query_num, answer_count, query_gloss);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)query_suggestor.$kw50$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)query_suggestor.$int51$150);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            html_utilities.html_princ((SubLObject)query_suggestor.$str55$Time_To_First_Answer__);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, conses_high.getf(query_result, (SubLObject)query_suggestor.$kw56$TIME_TO_FIRST_ANSWER, (SubLObject)query_suggestor.UNPROVIDED));
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)query_suggestor.$kw50$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)query_suggestor.$int51$150);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            html_utilities.html_princ((SubLObject)query_suggestor.$str57$Complete_Total_Time__);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, conses_high.getf(query_result, (SubLObject)query_suggestor.$kw58$COMPLETE_TOTAL_TIME, (SubLObject)query_suggestor.UNPROVIDED));
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_flush();
        return query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 11576L)
    public static SubLObject update_query_suggestor_html_with_results(final SubLObject concept, final SubLObject results, final SubLObject query_num, final SubLObject answer_count, final SubLObject query_gloss) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (query_suggestor.NIL == results) {
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, results);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return (SubLObject)query_suggestor.NIL;
        }
        SubLObject concept_id = (SubLObject)query_suggestor.NIL;
        SubLObject html_file = (SubLObject)query_suggestor.NIL;
        if (answer_count.numG((SubLObject)query_suggestor.TEN_INTEGER)) {
            if (query_suggestor.NIL != constant_handles.constant_p(concept)) {
                concept_id = constants_high.constant_name(concept);
            }
            else if (query_suggestor.NIL != nart_handles.nart_p(concept)) {
                concept_id = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str59$n_a, nart_handles.nart_id(concept));
            }
            html_file = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str60$_a_extra_answers__a__a__a_htm, new SubLObject[] { query_suggestor.$query_suggestor_output_dir$.getDynamicValue(thread), query_suggestor.$query_suggestor_file_name$.getDynamicValue(thread), concept_id, query_num });
        }
        if (query_suggestor.NIL == concept_id) {
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                SubLObject cdolist_list_var = results;
                SubLObject result = (SubLObject)query_suggestor.NIL;
                result = cdolist_list_var.first();
                while (query_suggestor.NIL != cdolist_list_var) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, result);
                    html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return (SubLObject)query_suggestor.NIL;
        }
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
            html_utilities.html_markup(html_file);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                html_utilities.html_princ((SubLObject)query_suggestor.$str61$Bindings_for_Query);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        SubLObject stream = (SubLObject)query_suggestor.NIL;
        try {
            stream = compatibility.open_text(html_file, (SubLObject)query_suggestor.$kw34$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)query_suggestor.$str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$35 = stream;
            final SubLObject _prev_bind_3 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$35, thread);
                final SubLObject main_test = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str62$_a__a_htm, query_suggestor.$query_suggestor_output_dir$.getDynamicValue(thread), query_suggestor.$query_suggestor_file_name$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup(main_test);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    html_utilities.html_princ((SubLObject)query_suggestor.$str63$Back_to_Main_Test_Run);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)query_suggestor.TWO_INTEGER);
                html_utilities.html_princ_strong((SubLObject)query_suggestor.$str64$Query__);
                html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, query_gloss);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)query_suggestor.TWO_INTEGER);
                html_utilities.html_princ_strong((SubLObject)query_suggestor.$str65$Bindings_);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)query_suggestor.TEN_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            html_utilities.html_spaces((SubLObject)query_suggestor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                            SubLObject cdolist_list_var2 = results;
                            SubLObject result2 = (SubLObject)query_suggestor.NIL;
                            result2 = cdolist_list_var2.first();
                            while (query_suggestor.NIL != cdolist_list_var2) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)query_suggestor.$str33$_a, result2);
                                html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                result2 = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)query_suggestor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_flush();
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_3, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_suggestor.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)query_suggestor.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)query_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 13141L)
    public static SubLObject update_query_suggestor_html_with_computations(final SubLObject html_file, final SubLObject cfasl_concepts_file, final SubLObject cfasl_queries_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quiescence_times = query_suggestor_concept_computations(cfasl_concepts_file);
        final SubLObject answerables_num_list = thread.secondMultipleValue();
        final SubLObject unanswerables_num_list = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = (SubLObject)query_suggestor.NIL;
        try {
            stream = compatibility.open_text(html_file, (SubLObject)query_suggestor.$kw40$APPEND);
            if (!stream.isStream()) {
                Errors.error((SubLObject)query_suggestor.$str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$41 = stream;
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$41, thread);
                html_utilities.html_newline((SubLObject)query_suggestor.TWO_INTEGER);
                html_utilities.html_string((SubLObject)query_suggestor.$str66$_________________________________, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_princ_strong((SubLObject)query_suggestor.$str67$Test_run_Summary);
                html_utilities.html_newline((SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)query_suggestor.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)query_suggestor.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)query_suggestor.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)query_suggestor.T, thread);
                    query_suggestor_html_row((SubLObject)query_suggestor.$str68$Median_Quiescence_Time__, number_utilities.median(quiescence_times, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED));
                    query_suggestor_html_row((SubLObject)query_suggestor.$str69$Mean_Quiescence_Time__, number_utilities.mean(quiescence_times));
                    query_suggestor_html_row((SubLObject)query_suggestor.$str70$Median_Answerables__, number_utilities.median(answerables_num_list, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED));
                    query_suggestor_html_row((SubLObject)query_suggestor.$str71$Mean_Answerables__, number_utilities.mean(answerables_num_list));
                    query_suggestor_html_row((SubLObject)query_suggestor.$str72$Median_Unanswerables__, number_utilities.median(unanswerables_num_list, (SubLObject)query_suggestor.UNPROVIDED, (SubLObject)query_suggestor.UNPROVIDED));
                    query_suggestor_html_row((SubLObject)query_suggestor.$str73$Mean_Unanswerables__, number_utilities.mean(unanswerables_num_list));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_suggestor.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)query_suggestor.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 14223L)
    public static SubLObject query_suggestor_run_tests_for_test_type(final SubLObject test_type, SubLObject num) {
        if (num == query_suggestor.UNPROVIDED) {
            num = (SubLObject)query_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert query_suggestor.NIL != query_suggestor_test_typeP(test_type) : test_type;
        SubLObject concepts = query_suggestor_concepts(test_type);
        final SubLObject html_file = make_query_suggestor_html_file(test_type);
        final SubLObject cfasl_concepts_file = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str74$_a__a_concepts_cfasl, query_suggestor.$query_suggestor_output_dir$.getDynamicValue(thread), query_suggestor.$query_suggestor_file_name$.getDynamicValue(thread));
        final SubLObject cfasl_queries_file = PrintLow.format((SubLObject)query_suggestor.NIL, (SubLObject)query_suggestor.$str75$_a__a_queries_cfasl, query_suggestor.$query_suggestor_output_dir$.getDynamicValue(thread), query_suggestor.$query_suggestor_file_name$.getDynamicValue(thread));
        SubLObject cfasl_concepts_stream = (SubLObject)query_suggestor.NIL;
        SubLObject cfasl_queries_stream = (SubLObject)query_suggestor.NIL;
        if (num.isInteger()) {
            concepts = list_utilities.first_n(num, concepts);
        }
        if (query_suggestor.NIL != cfasl_concepts_file) {
            cfasl_concepts_stream = kbq_query_run.kbq_open_query_set_run_output_stream(cfasl_concepts_file, (SubLObject)query_suggestor.UNPROVIDED);
        }
        if (query_suggestor.NIL != cfasl_queries_file) {
            cfasl_queries_stream = kbq_query_run.kbq_open_query_set_run_output_stream(cfasl_queries_file, (SubLObject)query_suggestor.UNPROVIDED);
        }
        if (query_suggestor.NIL != cfasl_concepts_stream) {
            kbq_query_run.kbq_save_query_set_run_preamble(cfasl_concepts_stream, html_file);
        }
        if (query_suggestor.NIL != cfasl_queries_stream) {
            kbq_query_run.kbq_save_query_set_run_preamble(cfasl_queries_stream, html_file);
        }
        SubLObject cdolist_list_var = concepts;
        SubLObject concept = (SubLObject)query_suggestor.NIL;
        concept = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            if (query_suggestor.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
                print_high.princ((SubLObject)query_suggestor.$str76$_, StreamsLow.$standard_output$.getDynamicValue(thread));
                streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            query_suggestor_run_test_for_concept(concept, html_file, cfasl_concepts_stream, cfasl_queries_stream);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        }
        if (cfasl_concepts_stream.isStream()) {
            streams_high.close(cfasl_concepts_stream, (SubLObject)query_suggestor.UNPROVIDED);
        }
        if (cfasl_queries_stream.isStream()) {
            streams_high.close(cfasl_queries_stream, (SubLObject)query_suggestor.UNPROVIDED);
        }
        update_query_suggestor_html_with_computations(html_file, cfasl_concepts_file, cfasl_queries_file);
        return test_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 15994L)
    public static SubLObject query_suggestor_run_tests(SubLObject num) {
        if (num == query_suggestor.UNPROVIDED) {
            num = (SubLObject)query_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time = (SubLObject)query_suggestor.NIL;
        PrintLow.format((SubLObject)query_suggestor.T, (SubLObject)query_suggestor.$str77$__Run_starting_at__A, numeric_date_utilities.timestring((SubLObject)query_suggestor.UNPROVIDED));
        streams_high.force_output((SubLObject)query_suggestor.UNPROVIDED);
        final SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdolist_list_var = query_suggestor.$query_suggestor_test_types$.getDynamicValue(thread);
        SubLObject test_type = (SubLObject)query_suggestor.NIL;
        test_type = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            query_suggestor_run_tests_for_test_type(test_type, num);
            cdolist_list_var = cdolist_list_var.rest();
            test_type = cdolist_list_var.first();
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)query_suggestor.T, (SubLObject)query_suggestor.$str78$__Run_ended_at__A, numeric_date_utilities.timestring((SubLObject)query_suggestor.UNPROVIDED));
        streams_high.force_output((SubLObject)query_suggestor.UNPROVIDED);
        PrintLow.format((SubLObject)query_suggestor.T, (SubLObject)query_suggestor.$str79$__Elapsed_time___A, numeric_date_utilities.elapsed_seconds_string(Numbers.truncate(time, (SubLObject)query_suggestor.UNPROVIDED)));
        streams_high.force_output((SubLObject)query_suggestor.UNPROVIDED);
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 16448L)
    public static SubLObject query_suggestor_run_tests_for_instances_to_dir(final SubLObject col, final SubLObject dir, SubLObject num) {
        if (num == query_suggestor.UNPROVIDED) {
            num = (SubLObject)query_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)query_suggestor.NIL;
        final SubLObject _prev_bind_0 = query_suggestor.$query_suggestor_test_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = query_suggestor.$query_suggestor_output_dir$.currentBinding(thread);
        try {
            query_suggestor.$query_suggestor_test_types$.bind((SubLObject)ConsesLow.list(col), thread);
            query_suggestor.$query_suggestor_output_dir$.bind(dir, thread);
            result = query_suggestor_run_tests(num);
        }
        finally {
            query_suggestor.$query_suggestor_output_dir$.rebind(_prev_bind_2, thread);
            query_suggestor.$query_suggestor_test_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 16718L)
    public static SubLObject query_suggestor_run_tests_for_to_dir(final SubLObject v_term, final SubLObject dir, SubLObject num) {
        if (num == query_suggestor.UNPROVIDED) {
            num = (SubLObject)query_suggestor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert query_suggestor.NIL != constant_handles.constant_p(v_term) : v_term;
        SubLObject result = (SubLObject)query_suggestor.NIL;
        final SubLObject _prev_bind_0 = query_suggestor.$query_suggestor_test_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = query_suggestor.$query_suggestor_output_dir$.currentBinding(thread);
        try {
            query_suggestor.$query_suggestor_test_types$.bind((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)query_suggestor.$kw1$TERM, v_term)), thread);
            query_suggestor.$query_suggestor_output_dir$.bind(dir, thread);
            result = query_suggestor_run_tests(num);
        }
        finally {
            query_suggestor.$query_suggestor_output_dir$.rebind(_prev_bind_2, thread);
            query_suggestor.$query_suggestor_test_types$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 17022L)
    public static SubLObject query_suggestor_run_trial_test() {
        query_suggestor_run_tests((SubLObject)query_suggestor.TWO_INTEGER);
        return (SubLObject)query_suggestor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 17117L)
    public static SubLObject filter_query_runs_by_test(final SubLObject query_runs, final SubLObject test, SubLObject key) {
        if (key == query_suggestor.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)query_suggestor.IDENTITY);
        }
        SubLObject filtered_query_runs = (SubLObject)query_suggestor.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)query_suggestor.NIL;
        query_run = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            if (query_suggestor.NIL != Functions.funcall(test, Functions.funcall(key, query_run))) {
                filtered_query_runs = (SubLObject)ConsesLow.cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 17543L)
    public static SubLObject filter_query_runs_by_property_value(final SubLObject query_runs, final SubLObject property, final SubLObject value, SubLObject test) {
        if (test == query_suggestor.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)query_suggestor.EQUAL);
        }
        SubLObject filtered_query_runs = (SubLObject)query_suggestor.NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = (SubLObject)query_suggestor.NIL;
        query_run = cdolist_list_var.first();
        while (query_suggestor.NIL != cdolist_list_var) {
            if (query_suggestor.NIL != Functions.funcall(test, value, kbq_query_run.kbq_query_run_property_value(query_run, property, value))) {
                filtered_query_runs = (SubLObject)ConsesLow.cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        }
        return Sequences.nreverse(filtered_query_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 17984L)
    public static SubLObject answerable_query_runs(final SubLObject query_runs) {
        return filter_query_runs_by_test(query_runs, Symbols.symbol_function((SubLObject)query_suggestor.$sym81$POSITIVE_INTEGER_P), Symbols.symbol_function((SubLObject)query_suggestor.$sym82$KBQ_QUERY_RUN_ANSWER_COUNT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/query-suggestor.lisp", position = 18136L)
    public static SubLObject unanswerable_query_runs(final SubLObject query_runs) {
        return filter_query_runs_by_property_value(query_runs, (SubLObject)query_suggestor.$kw49$ANSWER_COUNT, (SubLObject)query_suggestor.ZERO_INTEGER, (SubLObject)query_suggestor.UNPROVIDED);
    }
    
    public static SubLObject declare_query_suggestor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_singleton_test_typeP", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_singleton_test_type_sole_instance", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE-SOLE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_test_typeP", "QUERY-SUGGESTOR-TEST-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_concepts", "QUERY-SUGGESTOR-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "assert_query_suggestor_concept_info", "ASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "unassert_query_suggestor_concept_info", "UNASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_relevant_queries", "QUERY-SUGGESTOR-RELEVANT-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "english_gloss_for_relevant_query", "ENGLISH-GLOSS-FOR-RELEVANT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "run_query_suggestor_query", "RUN-QUERY-SUGGESTOR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_concept_computations", "QUERY-SUGGESTOR-CONCEPT-COMPUTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_test_for_concept", "QUERY-SUGGESTOR-RUN-TEST-FOR-CONCEPT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "make_query_suggestor_html_file", "MAKE-QUERY-SUGGESTOR-HTML-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_html_strong_desc_row", "QUERY-SUGGESTOR-HTML-STRONG-DESC-ROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_html_row", "QUERY-SUGGESTOR-HTML-ROW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "update_query_suggestor_html_intro", "UPDATE-QUERY-SUGGESTOR-HTML-INTRO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "update_query_suggestor_html_output", "UPDATE-QUERY-SUGGESTOR-HTML-OUTPUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "update_query_suggestor_html_with_query_result", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-QUERY-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "update_query_suggestor_html_with_results", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-RESULTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "update_query_suggestor_html_with_computations", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-COMPUTATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_tests_for_test_type", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TEST-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_tests", "QUERY-SUGGESTOR-RUN-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_tests_for_instances_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-INSTANCES-TO-DIR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_tests_for_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TO-DIR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "query_suggestor_run_trial_test", "QUERY-SUGGESTOR-RUN-TRIAL-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "filter_query_runs_by_test", "FILTER-QUERY-RUNS-BY-TEST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "filter_query_runs_by_property_value", "FILTER-QUERY-RUNS-BY-PROPERTY-VALUE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "answerable_query_runs", "ANSWERABLE-QUERY-RUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.query_suggestor", "unanswerable_query_runs", "UNANSWERABLE-QUERY-RUNS", 1, 0, false);
        return (SubLObject)query_suggestor.NIL;
    }
    
    public static SubLObject init_query_suggestor_file() {
        query_suggestor.$query_suggestor_test_types$ = SubLFiles.defvar("*QUERY-SUGGESTOR-TEST-TYPES*", (SubLObject)query_suggestor.$list0);
        query_suggestor.$query_suggestor_output_dir$ = SubLFiles.defparameter("*QUERY-SUGGESTOR-OUTPUT-DIR*", (SubLObject)query_suggestor.$str3$_cyc_projects_Topsail_query_sugge);
        query_suggestor.$query_suggestor_file_name$ = SubLFiles.defvar("*QUERY-SUGGESTOR-FILE-NAME*", (SubLObject)query_suggestor.NIL);
        query_suggestor.$query_suggestor_query_metrics$ = SubLFiles.deflexical("*QUERY-SUGGESTOR-QUERY-METRICS*", (SubLObject)query_suggestor.$list20);
        query_suggestor.$query_suggestor_concept_metrics$ = SubLFiles.deflexical("*QUERY-SUGGESTOR-CONCEPT-METRICS*", (SubLObject)query_suggestor.$list21);
        return (SubLObject)query_suggestor.NIL;
    }
    
    public static SubLObject setup_query_suggestor_file() {
        return (SubLObject)query_suggestor.NIL;
    }
    
    public void declareFunctions() {
        declare_query_suggestor_file();
    }
    
    public void initializeVariables() {
        init_query_suggestor_file();
    }
    
    public void runTopLevelForms() {
        setup_query_suggestor_file();
    }
    
    static {
        me = (SubLFile)new query_suggestor();
        query_suggestor.$query_suggestor_test_types$ = null;
        query_suggestor.$query_suggestor_output_dir$ = null;
        query_suggestor.$query_suggestor_file_name$ = null;
        query_suggestor.$query_suggestor_query_metrics$ = null;
        query_suggestor.$query_suggestor_concept_metrics$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Terrorist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristGroup")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndependentCountry")));
        $kw1$TERM = SubLObjectFactory.makeKeyword("TERM");
        $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_ = SubLObjectFactory.makeSymbol("QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?");
        $str3$_cyc_projects_Topsail_query_sugge = SubLObjectFactory.makeString("/cyc/projects/Topsail/query-suggestor");
        $sym4$QUERY_SUGGESTOR_TEST_TYPE_ = SubLObjectFactory.makeSymbol("QUERY-SUGGESTOR-TEST-TYPE?");
        $const5$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $sym6$FAST_SKOLEM_NAT_ = SubLObjectFactory.makeSymbol("FAST-SKOLEM-NAT?");
        $const7$conceptPertinentToDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptPertinentToDegree"));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HighAmountFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relevance"))));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaskModelMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Allotment-8")));
        $sym10$_QUERY = SubLObjectFactory.makeSymbol("?QUERY");
        $const11$cycLQuerySpecificationPertinentTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cycLQuerySpecificationPertinentToDegree"));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VeryHighAmountFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relevance")));
        $const13$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const14$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const15$formulaTemplateGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $const16$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GLOSS"));
        $const18$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?GLOSS")));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUIESCENCE"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWERABLES"), (SubLObject)SubLObjectFactory.makeKeyword("UNANSWERABLES"));
        $int22$600 = SubLObjectFactory.makeInteger(600);
        $kw23$QUIESCENCE = SubLObjectFactory.makeKeyword("QUIESCENCE");
        $kw24$ANSWERABLES = SubLObjectFactory.makeKeyword("ANSWERABLES");
        $kw25$UNANSWERABLES = SubLObjectFactory.makeKeyword("UNANSWERABLES");
        $kw26$CONCEPT = SubLObjectFactory.makeKeyword("CONCEPT");
        $str27$Concept_not_asserted_to_be_pertin = SubLObjectFactory.makeString("Concept not asserted to be pertinent");
        $str28$_a__a = SubLObjectFactory.makeString("~a/~a");
        $kw29$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $kw30$RATIO = SubLObjectFactory.makeKeyword("RATIO");
        $str31$_a__a__a_htm = SubLObjectFactory.makeString("~a/~a-~a.htm");
        $str32$_a__a = SubLObjectFactory.makeString("~a-~a");
        $str33$_a = SubLObjectFactory.makeString("~a");
        $kw34$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str35$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str36$Test_Date__ = SubLObjectFactory.makeString("Test Date: ");
        $str37$KB__ = SubLObjectFactory.makeString("KB: ");
        $str38$System__ = SubLObjectFactory.makeString("System: ");
        $str39$Test_Type__ = SubLObjectFactory.makeString("Test Type: ");
        $kw40$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str41$_________________________________ = SubLObjectFactory.makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        $str42$Concept__ = SubLObjectFactory.makeString("Concept: ");
        $str43$Time_to_Quiescence_ = SubLObjectFactory.makeString("Time to Quiescence:");
        $str44$Total_Number_of_Queries_ = SubLObjectFactory.makeString("Total Number of Queries:");
        $str45$Answerable_Unanswerable___A = SubLObjectFactory.makeString("Answerable/Unanswerable: ~A");
        $str46$Answerable_Queries_ = SubLObjectFactory.makeString("Answerable Queries:");
        $str47$Unanswerable_Queries_ = SubLObjectFactory.makeString("Unanswerable Queries:");
        $kw48$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw49$ANSWER_COUNT = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $kw50$TOP = SubLObjectFactory.makeKeyword("TOP");
        $int51$150 = SubLObjectFactory.makeInteger(150);
        $str52$Number_of_Bindings__ = SubLObjectFactory.makeString("Number of Bindings: ");
        $str53$Bindings__ = SubLObjectFactory.makeString("Bindings: ");
        $kw54$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $str55$Time_To_First_Answer__ = SubLObjectFactory.makeString("Time To First Answer: ");
        $kw56$TIME_TO_FIRST_ANSWER = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $str57$Complete_Total_Time__ = SubLObjectFactory.makeString("Complete Total Time: ");
        $kw58$COMPLETE_TOTAL_TIME = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $str59$n_a = SubLObjectFactory.makeString("n~a");
        $str60$_a_extra_answers__a__a__a_htm = SubLObjectFactory.makeString("~a/extra-answers/~a-~a-~a.htm");
        $str61$Bindings_for_Query = SubLObjectFactory.makeString("Bindings for Query");
        $str62$_a__a_htm = SubLObjectFactory.makeString("~a/~a.htm");
        $str63$Back_to_Main_Test_Run = SubLObjectFactory.makeString("Back to Main Test Run");
        $str64$Query__ = SubLObjectFactory.makeString("Query: ");
        $str65$Bindings_ = SubLObjectFactory.makeString("Bindings:");
        $str66$_________________________________ = SubLObjectFactory.makeString("****************************************");
        $str67$Test_run_Summary = SubLObjectFactory.makeString("Test run Summary");
        $str68$Median_Quiescence_Time__ = SubLObjectFactory.makeString("Median Quiescence Time: ");
        $str69$Mean_Quiescence_Time__ = SubLObjectFactory.makeString("Mean Quiescence Time: ");
        $str70$Median_Answerables__ = SubLObjectFactory.makeString("Median Answerables: ");
        $str71$Mean_Answerables__ = SubLObjectFactory.makeString("Mean Answerables: ");
        $str72$Median_Unanswerables__ = SubLObjectFactory.makeString("Median Unanswerables: ");
        $str73$Mean_Unanswerables__ = SubLObjectFactory.makeString("Mean Unanswerables: ");
        $str74$_a__a_concepts_cfasl = SubLObjectFactory.makeString("~a/~a-concepts.cfasl");
        $str75$_a__a_queries_cfasl = SubLObjectFactory.makeString("~a/~a-queries.cfasl");
        $str76$_ = SubLObjectFactory.makeString("*");
        $str77$__Run_starting_at__A = SubLObjectFactory.makeString("~%Run starting at ~A");
        $str78$__Run_ended_at__A = SubLObjectFactory.makeString("~%Run ended at ~A");
        $str79$__Elapsed_time___A = SubLObjectFactory.makeString("~%Elapsed time: ~A");
        $sym80$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym81$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym82$KBQ_QUERY_RUN_ANSWER_COUNT = SubLObjectFactory.makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");
    }
}

/*

	Total time: 676 ms
	
*/