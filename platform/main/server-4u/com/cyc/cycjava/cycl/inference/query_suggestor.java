/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.cb_utilities.cb_show_date;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$kbq_run_query_non_continuable_enabledP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_flush;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_spaces;
import static com.cyc.cycjava.cycl.html_utilities.html_string;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class query_suggestor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new query_suggestor();

 public static final String myName = "com.cyc.cycjava.cycl.inference.query_suggestor";


    // defvar
    // Definitions
    /**
     * A list of collections or the special token (:term TERM) which denotes the
     * singleton collection whose sole instance is TERM.
     */
    @LispMethod(comment = "A list of collections or the special token (:term TERM) which denotes the\r\nsingleton collection whose sole instance is TERM.\ndefvar\nA list of collections or the special token (:term TERM) which denotes the\nsingleton collection whose sole instance is TERM.")
    public static final SubLSymbol $query_suggestor_test_types$ = makeSymbol("*QUERY-SUGGESTOR-TEST-TYPES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $query_suggestor_output_dir$ = makeSymbol("*QUERY-SUGGESTOR-OUTPUT-DIR*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $query_suggestor_file_name$ = makeSymbol("*QUERY-SUGGESTOR-FILE-NAME*");

    // deflexical
    // Metrics to gather for query suggestor queries.
    /**
     * Metrics to gather for query suggestor queries.
     */
    @LispMethod(comment = "Metrics to gather for query suggestor queries.\ndeflexical")
    private static final SubLSymbol $query_suggestor_query_metrics$ = makeSymbol("*QUERY-SUGGESTOR-QUERY-METRICS*");

    // deflexical
    // Metrics to gather for query suggestor concept.
    /**
     * Metrics to gather for query suggestor concept.
     */
    @LispMethod(comment = "Metrics to gather for query suggestor concept.\ndeflexical")
    private static final SubLSymbol $query_suggestor_concept_metrics$ = makeSymbol("*QUERY-SUGGESTOR-CONCEPT-METRICS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("Terrorist"), reader_make_constant_shell("TerroristGroup"), reader_make_constant_shell("IndependentCountry"));

    static private final SubLSymbol $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_ = makeSymbol("QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?");

    static private final SubLString $str3$_cyc_projects_Topsail_query_sugge = makeString("/cyc/projects/Topsail/query-suggestor");

    static private final SubLSymbol $sym4$QUERY_SUGGESTOR_TEST_TYPE_ = makeSymbol("QUERY-SUGGESTOR-TEST-TYPE?");



    static private final SubLSymbol $sym6$FAST_SKOLEM_NAT_ = makeSymbol("FAST-SKOLEM-NAT?");



    static private final SubLList $list8 = list(list(reader_make_constant_shell("HighAmountFn"), reader_make_constant_shell("Relevance")));

    static private final SubLList $list9 = list(reader_make_constant_shell("TaskModelMtFn"), reader_make_constant_shell("Allotment-8"));

    static private final SubLSymbol $sym10$_QUERY = makeSymbol("?QUERY");

    private static final SubLObject $const11$cycLQuerySpecificationPertinentTo = reader_make_constant_shell("cycLQuerySpecificationPertinentToDegree");

    static private final SubLList $list12 = list(reader_make_constant_shell("VeryHighAmountFn"), reader_make_constant_shell("Relevance"));









    static private final SubLList $list17 = list(makeSymbol("?GLOSS"));



    static private final SubLList $list19 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")));

    static private final SubLList $list20 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLList $list21 = list(makeKeyword("QUIESCENCE"), makeKeyword("TOTAL"), makeKeyword("ANSWERABLES"), makeKeyword("UNANSWERABLES"));

    private static final SubLInteger $int$600 = makeInteger(600);

    static private final SubLString $str27$Concept_not_asserted_to_be_pertin = makeString("Concept not asserted to be pertinent");

    static private final SubLString $str28$_a__a = makeString("~a/~a");

    static private final SubLString $str31$_a__a__a_htm = makeString("~a/~a-~a.htm");

    static private final SubLString $str32$_a__a = makeString("~a-~a");

    static private final SubLString $str33$_a = makeString("~a");

    static private final SubLString $str35$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str36$Test_Date__ = makeString("Test Date: ");

    static private final SubLString $str37$KB__ = makeString("KB: ");

    static private final SubLString $str38$System__ = makeString("System: ");

    static private final SubLString $str39$Test_Type__ = makeString("Test Type: ");

    static private final SubLString $str41$_________________________________ = makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    static private final SubLString $str42$Concept__ = makeString("Concept: ");

    static private final SubLString $str43$Time_to_Quiescence_ = makeString("Time to Quiescence:");

    static private final SubLString $str44$Total_Number_of_Queries_ = makeString("Total Number of Queries:");

    static private final SubLString $str45$Answerable_Unanswerable___A = makeString("Answerable/Unanswerable: ~A");

    static private final SubLString $str46$Answerable_Queries_ = makeString("Answerable Queries:");

    static private final SubLString $str47$Unanswerable_Queries_ = makeString("Unanswerable Queries:");

    private static final SubLInteger $int$150 = makeInteger(150);

    static private final SubLString $str52$Number_of_Bindings__ = makeString("Number of Bindings: ");

    static private final SubLString $str53$Bindings__ = makeString("Bindings: ");

    static private final SubLString $str55$Time_To_First_Answer__ = makeString("Time To First Answer: ");

    private static final SubLSymbol $TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");

    static private final SubLString $str57$Complete_Total_Time__ = makeString("Complete Total Time: ");

    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");

    static private final SubLString $str59$n_a = makeString("n~a");

    static private final SubLString $str60$_a_extra_answers__a__a__a_htm = makeString("~a/extra-answers/~a-~a-~a.htm");

    static private final SubLString $$$Bindings_for_Query = makeString("Bindings for Query");

    static private final SubLString $str62$_a__a_htm = makeString("~a/~a.htm");

    static private final SubLString $$$Back_to_Main_Test_Run = makeString("Back to Main Test Run");

    static private final SubLString $str64$Query__ = makeString("Query: ");

    static private final SubLString $str65$Bindings_ = makeString("Bindings:");

    static private final SubLString $str66$_________________________________ = makeString("****************************************");

    static private final SubLString $$$Test_run_Summary = makeString("Test run Summary");

    static private final SubLString $str68$Median_Quiescence_Time__ = makeString("Median Quiescence Time: ");

    static private final SubLString $str69$Mean_Quiescence_Time__ = makeString("Mean Quiescence Time: ");

    static private final SubLString $str70$Median_Answerables__ = makeString("Median Answerables: ");

    static private final SubLString $str71$Mean_Answerables__ = makeString("Mean Answerables: ");

    static private final SubLString $str72$Median_Unanswerables__ = makeString("Median Unanswerables: ");

    static private final SubLString $str73$Mean_Unanswerables__ = makeString("Mean Unanswerables: ");

    static private final SubLString $str74$_a__a_concepts_cfasl = makeString("~a/~a-concepts.cfasl");

    static private final SubLString $str75$_a__a_queries_cfasl = makeString("~a/~a-queries.cfasl");

    static private final SubLString $str76$_ = makeString("*");

    static private final SubLString $str77$__Run_starting_at__A = makeString("~%Run starting at ~A");

    static private final SubLString $str78$__Run_ended_at__A = makeString("~%Run ended at ~A");

    static private final SubLString $str79$__Elapsed_time___A = makeString("~%Elapsed time: ~A");

    private static final SubLSymbol KBQ_QUERY_RUN_ANSWER_COUNT = makeSymbol("KBQ-QUERY-RUN-ANSWER-COUNT");

    public static final SubLObject query_suggestor_singleton_test_typeP_alt(SubLObject test_type) {
        return makeBoolean(test_type.isCons() && ($TERM == test_type.first()));
    }

    public static SubLObject query_suggestor_singleton_test_typeP(final SubLObject test_type) {
        return makeBoolean(test_type.isCons() && ($TERM == test_type.first()));
    }

    public static final SubLObject query_suggestor_singleton_test_type_sole_instance_alt(SubLObject test_type) {
        SubLTrampolineFile.checkType(test_type, $sym2$QUERY_SUGGESTOR_SINGLETON_TEST_TYPE_);
        return second(test_type);
    }

    public static SubLObject query_suggestor_singleton_test_type_sole_instance(final SubLObject test_type) {
        assert NIL != query_suggestor_singleton_test_typeP(test_type) : "! query_suggestor.query_suggestor_singleton_test_typeP(test_type) " + ("query_suggestor.query_suggestor_singleton_test_typeP(test_type) " + "CommonSymbols.NIL != query_suggestor.query_suggestor_singleton_test_typeP(test_type) ") + test_type;
        return second(test_type);
    }

    public static final SubLObject query_suggestor_test_typeP_alt(SubLObject test_type) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_singleton_test_typeP(test_type)) || ((NIL != constant_p(test_type)) && (NIL != fort_types_interface.collection_p(test_type))));
    }

    public static SubLObject query_suggestor_test_typeP(final SubLObject test_type) {
        return makeBoolean((NIL != query_suggestor_singleton_test_typeP(test_type)) || ((NIL != constant_p(test_type)) && (NIL != fort_types_interface.collection_p(test_type))));
    }

    /**
     * TEST-TYPE can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry
     */
    @LispMethod(comment = "TEST-TYPE can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry")
    public static final SubLObject query_suggestor_concepts_alt(SubLObject test_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test_type, $sym4$QUERY_SUGGESTOR_TEST_TYPE_);
            if (NIL != com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_singleton_test_typeP(test_type)) {
                return list(com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_singleton_test_type_sole_instance(test_type));
            } else {
                {
                    SubLObject v_answer = NIL;
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$TKBSourceSpindleCollectorMt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            v_answer = remove_if($sym6$FAST_SKOLEM_NAT_, isa.all_fort_instances(test_type, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return v_answer;
                }
            }
        }
    }

    /**
     * TEST-TYPE can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry
     */
    @LispMethod(comment = "TEST-TYPE can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry")
    public static SubLObject query_suggestor_concepts(final SubLObject test_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_suggestor_test_typeP(test_type) : "! query_suggestor.query_suggestor_test_typeP(test_type) " + ("query_suggestor.query_suggestor_test_typeP(test_type) " + "CommonSymbols.NIL != query_suggestor.query_suggestor_test_typeP(test_type) ") + test_type;
        if (NIL != query_suggestor_singleton_test_typeP(test_type)) {
            return list(query_suggestor_singleton_test_type_sole_instance(test_type));
        }
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$TKBSourceSpindleCollectorMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            v_answer = remove_if($sym6$FAST_SKOLEM_NAT_, isa.all_fort_instances(test_type, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject assert_query_suggestor_concept_info_alt(SubLObject concept) {
        {
            SubLObject result = NIL;
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            result = cyc_kernel.cyc_assert(listS($$conceptPertinentToDegree, concept, $list_alt8), $list_alt9, UNPROVIDED);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return values(result, time);
        }
    }

    public static SubLObject assert_query_suggestor_concept_info(final SubLObject concept) {
        SubLObject result = NIL;
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        result = cyc_kernel.cyc_assert(listS($$conceptPertinentToDegree, concept, $list8), $list9, UNPROVIDED);
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(result, time);
    }

    public static final SubLObject unassert_query_suggestor_concept_info_alt(SubLObject concept) {
        return cyc_kernel.cyc_unassert(listS($$conceptPertinentToDegree, concept, $list_alt8), $list_alt9);
    }

    public static SubLObject unassert_query_suggestor_concept_info(final SubLObject concept) {
        return cyc_kernel.cyc_unassert(listS($$conceptPertinentToDegree, concept, $list8), $list9);
    }

    public static final SubLObject query_suggestor_relevant_queries_alt(SubLObject concept) {
        return backward.removal_ask_variable($sym10$_QUERY, list($const11$cycLQuerySpecificationPertinentTo, $sym10$_QUERY, narts_high.find_nart($list_alt12), list($$TheSet, concept)), $$InferencePSC, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_suggestor_relevant_queries(final SubLObject concept) {
        return backward.removal_ask_variable($sym10$_QUERY, list($const11$cycLQuerySpecificationPertinentTo, $sym10$_QUERY, narts_high.find_nart($list12), list($$TheSet, concept)), $$InferencePSC, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject english_gloss_for_relevant_query_alt(SubLObject query) {
        {
            SubLObject results = inference_kernel.new_cyc_query(listS($$formulaTemplateGloss, list($$TemplateFromTestQueryFn, query), $list_alt17), $$TestVocabularyMt, $list_alt19);
            if (NIL != results) {
                return results.first();
            }
        }
        return NIL;
    }

    public static SubLObject english_gloss_for_relevant_query(final SubLObject query) {
        final SubLObject results = inference_kernel.new_cyc_query(listS($$formulaTemplateGloss, list($$TemplateFromTestQueryFn, query), $list17), $$TestVocabularyMt, $list19);
        if (NIL != results) {
            return results.first();
        }
        return NIL;
    }

    public static final SubLObject run_query_suggestor_query_alt(SubLObject query) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        $kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                        result = kbq_query_run.kbq_run_query(query, $query_suggestor_query_metrics$.getGlobalValue(), $int$600, NIL, T);
                    } finally {
                        $kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject run_query_suggestor_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
        try {
            $kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
            result = kbq_query_run.kbq_run_query(query, $query_suggestor_query_metrics$.getGlobalValue(), $int$600, NIL, T, UNPROVIDED);
        } finally {
            $kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject query_suggestor_concept_computations_alt(SubLObject cfasl_concepts_file) {
        {
            SubLObject run_set = kbq_query_run.kbq_load_query_set_run(cfasl_concepts_file);
            SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(run_set);
            SubLObject quiescence_times = NIL;
            SubLObject answerables_num_list = NIL;
            SubLObject unanswerables_num_list = NIL;
            SubLObject cdolist_list_var = query_runs;
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                quiescence_times = cons(getf(query_run, $QUIESCENCE, UNPROVIDED), quiescence_times);
                answerables_num_list = cons(getf(query_run, $ANSWERABLES, UNPROVIDED), answerables_num_list);
                unanswerables_num_list = cons(getf(query_run, $UNANSWERABLES, UNPROVIDED), unanswerables_num_list);
            }
            return values(quiescence_times, answerables_num_list, unanswerables_num_list);
        }
    }

    public static SubLObject query_suggestor_concept_computations(final SubLObject cfasl_concepts_file) {
        final SubLObject run_set = kbq_query_run.kbq_load_query_set_run(cfasl_concepts_file);
        final SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(run_set);
        SubLObject quiescence_times = NIL;
        SubLObject answerables_num_list = NIL;
        SubLObject unanswerables_num_list = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            quiescence_times = cons(getf(query_run, $QUIESCENCE, UNPROVIDED), quiescence_times);
            answerables_num_list = cons(getf(query_run, $ANSWERABLES, UNPROVIDED), answerables_num_list);
            unanswerables_num_list = cons(getf(query_run, $UNANSWERABLES, UNPROVIDED), unanswerables_num_list);
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return values(quiescence_times, answerables_num_list, unanswerables_num_list);
    }

    public static final SubLObject query_suggestor_run_test_for_concept_alt(SubLObject concept, SubLObject html_file, SubLObject cfasl_concepts_stream, SubLObject cfasl_queries_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($CONCEPT, concept), html_file);
            thread.resetMultipleValues();
            {
                SubLObject assertedP = com.cyc.cycjava.cycl.inference.query_suggestor.assert_query_suggestor_concept_info(concept);
                SubLObject quiescence_time = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == assertedP) {
                    Errors.warn($str_alt27$Concept_not_asserted_to_be_pertin);
                    return NIL;
                }
                com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($QUIESCENCE, quiescence_time), html_file);
                {
                    SubLObject relevant_queries = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_relevant_queries(concept);
                    SubLObject concept_result = NIL;
                    SubLObject query_result = NIL;
                    SubLObject query_results = NIL;
                    SubLObject cdolist_list_var = relevant_queries;
                    SubLObject relevant_query = NIL;
                    for (relevant_query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relevant_query = cdolist_list_var.first()) {
                        query_result = com.cyc.cycjava.cycl.inference.query_suggestor.run_query_suggestor_query(relevant_query);
                        query_results = cons(query_result, query_results);
                        kbq_query_run.kbq_save_query_run(query_result, cfasl_queries_stream);
                    }
                    {
                        SubLObject total = length(query_results);
                        SubLObject answerables = com.cyc.cycjava.cycl.inference.query_suggestor.answerable_query_runs(query_results);
                        SubLObject unanswerables = com.cyc.cycjava.cycl.inference.query_suggestor.unanswerable_query_runs(query_results);
                        SubLObject answerables_num = length(answerables);
                        SubLObject unanswerables_num = length(unanswerables);
                        SubLObject ratio_string = format(NIL, $str_alt28$_a__a, answerables_num, unanswerables_num);
                        concept_result = putf(concept_result, $CONCEPT, concept);
                        concept_result = putf(concept_result, $QUIESCENCE, quiescence_time);
                        concept_result = putf(concept_result, $TOTAL, total);
                        concept_result = putf(concept_result, $ANSWERABLES, answerables_num);
                        concept_result = putf(concept_result, $UNANSWERABLES, unanswerables_num);
                        kbq_query_run.kbq_save_query_run(concept_result, cfasl_concepts_stream);
                        com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($TOTAL, total), html_file);
                        com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($RATIO, ratio_string), html_file);
                        com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($ANSWERABLES, answerables), html_file);
                        com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_output(concept, list($UNANSWERABLES, unanswerables), html_file);
                    }
                }
                com.cyc.cycjava.cycl.inference.query_suggestor.unassert_query_suggestor_concept_info(concept);
            }
            return concept;
        }
    }

    public static SubLObject query_suggestor_run_test_for_concept(final SubLObject concept, final SubLObject html_file, final SubLObject cfasl_concepts_stream, final SubLObject cfasl_queries_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        update_query_suggestor_html_output(concept, list($CONCEPT, concept), html_file);
        thread.resetMultipleValues();
        final SubLObject assertedP = assert_query_suggestor_concept_info(concept);
        final SubLObject quiescence_time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == assertedP) {
            Errors.warn($str27$Concept_not_asserted_to_be_pertin);
            return NIL;
        }
        update_query_suggestor_html_output(concept, list($QUIESCENCE, quiescence_time), html_file);
        final SubLObject relevant_queries = query_suggestor_relevant_queries(concept);
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
        final SubLObject total = length(query_results);
        final SubLObject answerables = answerable_query_runs(query_results);
        final SubLObject unanswerables = unanswerable_query_runs(query_results);
        final SubLObject answerables_num = length(answerables);
        final SubLObject unanswerables_num = length(unanswerables);
        final SubLObject ratio_string = format(NIL, $str28$_a__a, answerables_num, unanswerables_num);
        concept_result = putf(concept_result, $CONCEPT, concept);
        concept_result = putf(concept_result, $QUIESCENCE, quiescence_time);
        concept_result = putf(concept_result, $TOTAL, total);
        concept_result = putf(concept_result, $ANSWERABLES, answerables_num);
        concept_result = putf(concept_result, $UNANSWERABLES, unanswerables_num);
        kbq_query_run.kbq_save_query_run(concept_result, cfasl_concepts_stream);
        update_query_suggestor_html_output(concept, list($TOTAL, total), html_file);
        update_query_suggestor_html_output(concept, list($RATIO, ratio_string), html_file);
        update_query_suggestor_html_output(concept, list($ANSWERABLES, answerables), html_file);
        update_query_suggestor_html_output(concept, list($UNANSWERABLES, unanswerables), html_file);
        unassert_query_suggestor_concept_info(concept);
        return concept;
    }

    public static final SubLObject make_query_suggestor_html_file_alt(SubLObject test_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_singleton_test_typeP(test_type)) {
                test_type = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_singleton_test_type_sole_instance(test_type);
            }
            {
                SubLObject universal_date = get_universal_time();
                SubLObject html_file = format(NIL, $str_alt31$_a__a__a_htm, new SubLObject[]{ $query_suggestor_output_dir$.getDynamicValue(thread), constants_high.constant_name(test_type), universal_date });
                com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_intro(test_type, html_file, universal_date);
                $query_suggestor_file_name$.setDynamicValue(format(NIL, $str_alt32$_a__a, constants_high.constant_name(test_type), universal_date), thread);
                return html_file;
            }
        }
    }

    public static SubLObject make_query_suggestor_html_file(SubLObject test_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != query_suggestor_singleton_test_typeP(test_type)) {
            test_type = query_suggestor_singleton_test_type_sole_instance(test_type);
        }
        final SubLObject universal_date = get_universal_time();
        final SubLObject html_file = format(NIL, $str31$_a__a__a_htm, new SubLObject[]{ $query_suggestor_output_dir$.getDynamicValue(thread), constants_high.constant_name(test_type), universal_date });
        update_query_suggestor_html_intro(test_type, html_file, universal_date);
        $query_suggestor_file_name$.setDynamicValue(format(NIL, $str32$_a__a, constants_high.constant_name(test_type), universal_date), thread);
        return html_file;
    }

    public static final SubLObject query_suggestor_html_strong_desc_row_alt(SubLObject desc, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong(desc);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, value);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return value;
        }
    }

    public static SubLObject query_suggestor_html_strong_desc_row(final SubLObject desc, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong(desc);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return value;
    }

    public static final SubLObject query_suggestor_html_row_alt(SubLObject desc, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(desc);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, value);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            return value;
        }
    }

    public static SubLObject query_suggestor_html_row(final SubLObject desc, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(desc);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return value;
    }

    public static final SubLObject update_query_suggestor_html_intro_alt(SubLObject test_type, SubLObject html_file, SubLObject universal_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(html_file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt35$Unable_to_open__S, html_file);
                    }
                    {
                        SubLObject stream_5 = stream;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                            try {
                                html_macros.$html_stream$.bind(stream_5, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ZERO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ_strong($str_alt36$Test_Date__);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_show_date(numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED));
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_strong_desc_row($str_alt37$KB__, kb_loaded());
                                        com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_strong_desc_row($str_alt38$System__, system_info.cyc_revision_string());
                                        com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_strong_desc_row($str_alt39$Test_Type__, test_type);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return test_type;
        }
    }

    public static SubLObject update_query_suggestor_html_intro(final SubLObject test_type, final SubLObject html_file, final SubLObject universal_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$5 = stream;
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$5, thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ_strong($str36$Test_Date__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_date(numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    query_suggestor_html_strong_desc_row($str37$KB__, kb_loaded());
                    query_suggestor_html_strong_desc_row($str38$System__, system_info.cyc_revision_string());
                    query_suggestor_html_strong_desc_row($str39$Test_Type__, test_type);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return test_type;
    }

    public static final SubLObject update_query_suggestor_html_output_alt(SubLObject concept, SubLObject data, SubLObject html_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(html_file, $APPEND, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt35$Unable_to_open__S, html_file);
                    }
                    {
                        SubLObject stream_10 = stream;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                            try {
                                html_macros.$html_stream$.bind(stream_10, thread);
                                {
                                    SubLObject remainder = NIL;
                                    for (remainder = data; NIL != remainder; remainder = cddr(remainder)) {
                                        {
                                            SubLObject property = remainder.first();
                                            SubLObject value = cadr(remainder);
                                            SubLObject pcase_var = property;
                                            if (pcase_var.eql($CONCEPT)) {
                                                html_newline(UNPROVIDED);
                                                html_string($str_alt41$_________________________________, UNPROVIDED, UNPROVIDED);
                                                html_newline(TWO_INTEGER);
                                                html_princ_strong($str_alt42$Concept__);
                                                html_spaces(EIGHTEEN_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, value);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_flush();
                                            } else {
                                                if (pcase_var.eql($QUIESCENCE)) {
                                                    html_newline(UNPROVIDED);
                                                    html_princ($str_alt43$Time_to_Quiescence_);
                                                    html_spaces(EIGHT_INTEGER);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, value);
                                                    html_flush();
                                                } else {
                                                    if (pcase_var.eql($TOTAL)) {
                                                        html_newline(UNPROVIDED);
                                                        html_princ($str_alt44$Total_Number_of_Queries_);
                                                        html_spaces(FOUR_INTEGER);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, value);
                                                    } else {
                                                        if (pcase_var.eql($RATIO)) {
                                                            html_newline(UNPROVIDED);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt45$Answerable_Unanswerable___A, value);
                                                        } else {
                                                            if (pcase_var.eql($ANSWERABLES)) {
                                                                html_newline(UNPROVIDED);
                                                                html_string($str_alt46$Answerable_Queries_, UNPROVIDED, UNPROVIDED);
                                                                html_spaces(FIVE_INTEGER);
                                                                {
                                                                    SubLObject query_num = ZERO_INTEGER;
                                                                    SubLObject cdolist_list_var = value;
                                                                    SubLObject answerable = NIL;
                                                                    for (answerable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , answerable = cdolist_list_var.first()) {
                                                                        html_newline(UNPROVIDED);
                                                                        query_num = add(query_num, ONE_INTEGER);
                                                                        com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_with_query_result(concept, answerable, query_num);
                                                                    }
                                                                }
                                                            } else {
                                                                if (pcase_var.eql($UNANSWERABLES)) {
                                                                    html_newline(UNPROVIDED);
                                                                    html_string($str_alt47$Unanswerable_Queries_, UNPROVIDED, UNPROVIDED);
                                                                    {
                                                                        SubLObject query_num = ZERO_INTEGER;
                                                                        SubLObject cdolist_list_var = value;
                                                                        SubLObject unanswerable = NIL;
                                                                        for (unanswerable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unanswerable = cdolist_list_var.first()) {
                                                                            html_newline(UNPROVIDED);
                                                                            query_num = add(query_num, ONE_INTEGER);
                                                                            com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_with_query_result(concept, unanswerable, query_num);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return concept;
        }
    }

    public static SubLObject update_query_suggestor_html_output(final SubLObject concept, final SubLObject data, final SubLObject html_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
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
                for (remainder = NIL, remainder = data; NIL != remainder; remainder = cddr(remainder)) {
                    property = remainder.first();
                    value = cadr(remainder);
                    pcase_var = property;
                    if (pcase_var.eql($CONCEPT)) {
                        html_newline(UNPROVIDED);
                        html_string($str41$_________________________________, UNPROVIDED, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        html_princ_strong($str42$Concept__);
                        html_spaces(EIGHTEEN_INTEGER);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_flush();
                    } else
                        if (pcase_var.eql($QUIESCENCE)) {
                            html_newline(UNPROVIDED);
                            html_princ($str43$Time_to_Quiescence_);
                            html_spaces(EIGHT_INTEGER);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                            html_flush();
                        } else
                            if (pcase_var.eql($TOTAL)) {
                                html_newline(UNPROVIDED);
                                html_princ($str44$Total_Number_of_Queries_);
                                html_spaces(FOUR_INTEGER);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, value);
                            } else
                                if (pcase_var.eql($RATIO)) {
                                    html_newline(UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str45$Answerable_Unanswerable___A, value);
                                } else
                                    if (pcase_var.eql($ANSWERABLES)) {
                                        html_newline(UNPROVIDED);
                                        html_string($str46$Answerable_Queries_, UNPROVIDED, UNPROVIDED);
                                        html_spaces(FIVE_INTEGER);
                                        query_num = ZERO_INTEGER;
                                        cdolist_list_var = value;
                                        answerable = NIL;
                                        answerable = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            html_newline(UNPROVIDED);
                                            query_num = add(query_num, ONE_INTEGER);
                                            update_query_suggestor_html_with_query_result(concept, answerable, query_num);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            answerable = cdolist_list_var.first();
                                        } 
                                    } else
                                        if (pcase_var.eql($UNANSWERABLES)) {
                                            html_newline(UNPROVIDED);
                                            html_string($str47$Unanswerable_Queries_, UNPROVIDED, UNPROVIDED);
                                            query_num = ZERO_INTEGER;
                                            cdolist_list_var = value;
                                            unanswerable = NIL;
                                            unanswerable = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                html_newline(UNPROVIDED);
                                                query_num = add(query_num, ONE_INTEGER);
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
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return concept;
    }

    public static final SubLObject update_query_suggestor_html_with_query_result_alt(SubLObject concept, SubLObject query_result, SubLObject query_num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query = getf(query_result, $QUERY, UNPROVIDED);
                SubLObject answer_count = getf(query_result, $ANSWER_COUNT, UNPROVIDED);
                SubLObject query_gloss = com.cyc.cycjava.cycl.inference.query_suggestor.english_gloss_for_relevant_query(query);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TEN_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_spaces(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, query_gloss);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TWO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject sentence = kb_query.kbq_query_arguments(query);
                                                                    SubLObject mt = thread.secondMultipleValue();
                                                                    SubLObject query_properties = thread.thirdMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    html_princ(sentence);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TEN_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_spaces(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                if (true) {
                                                                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_markup(ZERO_INTEGER);
                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                }
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(html_align($TOP));
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup($int$150);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt52$Number_of_Bindings__);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, answer_count);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(html_align($TOP));
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup($int$150);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt53$Bindings__);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                {
                                                                                    SubLObject results = getf(query_result, $RESULT, UNPROVIDED);
                                                                                    com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_with_results(concept, results, query_num, answer_count, query_gloss);
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(html_align($TOP));
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup($int$150);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt55$Time_To_First_Answer__);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, getf(query_result, $TIME_TO_FIRST_ANSWER, UNPROVIDED));
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup(html_align($TOP));
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                if (true) {
                                                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_markup($int$150);
                                                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_princ($str_alt57$Complete_Total_Time__);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, getf(query_result, $COMPLETE_TOTAL_TIME, UNPROVIDED));
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                                                    }
                                                                                }
                                                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_flush();
                return query;
            }
        }
    }

    public static SubLObject update_query_suggestor_html_with_query_result(final SubLObject concept, final SubLObject query_result, final SubLObject query_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = getf(query_result, $QUERY, UNPROVIDED);
        final SubLObject answer_count = getf(query_result, $ANSWER_COUNT, UNPROVIDED);
        final SubLObject query_gloss = english_gloss_for_relevant_query(query);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TEN_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_spaces(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, query_gloss);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                thread.resetMultipleValues();
                                final SubLObject sentence = kb_query.kbq_query_arguments(query, UNPROVIDED);
                                final SubLObject mt = thread.secondMultipleValue();
                                final SubLObject query_properties = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                html_princ(sentence);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_spaces(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$150);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str52$Number_of_Bindings__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, answer_count);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$150);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str53$Bindings__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        final SubLObject results = getf(query_result, $RESULT, UNPROVIDED);
                                        update_query_suggestor_html_with_results(concept, results, query_num, answer_count, query_gloss);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$150);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str55$Time_To_First_Answer__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, getf(query_result, $TIME_TO_FIRST_ANSWER, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$150);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str57$Complete_Total_Time__);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, getf(query_result, $COMPLETE_TOTAL_TIME, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_flush();
        return query;
    }

    public static final SubLObject update_query_suggestor_html_with_results_alt(SubLObject concept, SubLObject results, SubLObject query_num, SubLObject answer_count, SubLObject query_gloss) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == results) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, results);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                return NIL;
            }
            {
                SubLObject concept_id = NIL;
                SubLObject html_file = NIL;
                if (answer_count.numG(TEN_INTEGER)) {
                    if (NIL != constant_p(concept)) {
                        concept_id = constants_high.constant_name(concept);
                    } else {
                        if (NIL != nart_handles.nart_p(concept)) {
                            concept_id = format(NIL, $str_alt59$n_a, nart_handles.nart_id(concept));
                        }
                    }
                    html_file = format(NIL, $str_alt60$_a_extra_answers__a__a__a_htm, new SubLObject[]{ $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread), concept_id, query_num });
                }
                if (NIL == concept_id) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = results;
                                SubLObject result = NIL;
                                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, result);
                                    html_newline(UNPROVIDED);
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    return NIL;
                }
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_file);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($$$Bindings_for_Query);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                            }
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(html_file, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt35$Unable_to_open__S, html_file);
                        }
                        {
                            SubLObject stream_35 = stream;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream_35, thread);
                                    {
                                        SubLObject main_test = format(NIL, $str_alt62$_a__a_htm, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(main_test);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$Back_to_Main_Test_Run);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_newline(TWO_INTEGER);
                                        html_princ_strong($str_alt64$Query__);
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, query_gloss);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_newline(TWO_INTEGER);
                                        html_princ_strong($str_alt65$Bindings_);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(TEN_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_spaces(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject cdolist_list_var = results;
                                                                    SubLObject result = NIL;
                                                                    for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt33$_a, result);
                                                                        html_newline(UNPROVIDED);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_flush();
                                    }
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject update_query_suggestor_html_with_results(final SubLObject concept, final SubLObject results, final SubLObject query_num, final SubLObject answer_count, final SubLObject query_gloss) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == results) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, results);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
        SubLObject concept_id = NIL;
        SubLObject html_file = NIL;
        if (answer_count.numG(TEN_INTEGER)) {
            if (NIL != constant_p(concept)) {
                concept_id = constants_high.constant_name(concept);
            } else
                if (NIL != nart_handles.nart_p(concept)) {
                    concept_id = format(NIL, $str59$n_a, nart_handles.nart_id(concept));
                }

            html_file = format(NIL, $str60$_a_extra_answers__a__a__a_htm, new SubLObject[]{ $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread), concept_id, query_num });
        }
        if (NIL == concept_id) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject cdolist_list_var = results;
                SubLObject result = NIL;
                result = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, result);
                    html_newline(UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    result = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return NIL;
        }
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_file);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$Bindings_for_Query);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$35 = stream;
            final SubLObject _prev_bind_3 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$35, thread);
                final SubLObject main_test = format(NIL, $str62$_a__a_htm, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(main_test);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Back_to_Main_Test_Run);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                html_princ_strong($str64$Query__);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, query_gloss);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                html_princ_strong($str65$Bindings_);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TEN_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_spaces(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var2 = results;
                            SubLObject result2 = NIL;
                            result2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str33$_a, result2);
                                html_newline(UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                result2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_flush();
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_3, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject update_query_suggestor_html_with_computations_alt(SubLObject html_file, SubLObject cfasl_concepts_file, SubLObject cfasl_queries_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject quiescence_times = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_concept_computations(cfasl_concepts_file);
                SubLObject answerables_num_list = thread.secondMultipleValue();
                SubLObject unanswerables_num_list = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(html_file, $APPEND, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt35$Unable_to_open__S, html_file);
                        }
                        {
                            SubLObject stream_41 = stream;
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                                try {
                                    html_macros.$html_stream$.bind(stream_41, thread);
                                    html_newline(TWO_INTEGER);
                                    html_string($str_alt66$_________________________________, UNPROVIDED, UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    html_princ_strong($$$Test_run_Summary);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ZERO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt68$Median_Quiescence_Time__, number_utilities.median(quiescence_times, UNPROVIDED));
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt69$Mean_Quiescence_Time__, number_utilities.mean(quiescence_times));
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt70$Median_Answerables__, number_utilities.median(answerables_num_list, UNPROVIDED));
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt71$Mean_Answerables__, number_utilities.mean(answerables_num_list));
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt72$Median_Unanswerables__, number_utilities.median(unanswerables_num_list, UNPROVIDED));
                                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_html_row($str_alt73$Mean_Unanswerables__, number_utilities.mean(unanswerables_num_list));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return html_file;
        }
    }

    public static SubLObject update_query_suggestor_html_with_computations(final SubLObject html_file, final SubLObject cfasl_concepts_file, final SubLObject cfasl_queries_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject quiescence_times = query_suggestor_concept_computations(cfasl_concepts_file);
        final SubLObject answerables_num_list = thread.secondMultipleValue();
        final SubLObject unanswerables_num_list = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(html_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str35$Unable_to_open__S, html_file);
            }
            final SubLObject stream_$41 = stream;
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream_$41, thread);
                html_newline(TWO_INTEGER);
                html_string($str66$_________________________________, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                html_princ_strong($$$Test_run_Summary);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
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
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html_file;
    }

    /**
     * Test type can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry, or something else entirely
     */
    @LispMethod(comment = "Test type can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry, or something else entirely")
    public static final SubLObject query_suggestor_run_tests_for_test_type_alt(SubLObject test_type, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test_type, $sym4$QUERY_SUGGESTOR_TEST_TYPE_);
            {
                SubLObject concepts = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_concepts(test_type);
                SubLObject html_file = com.cyc.cycjava.cycl.inference.query_suggestor.make_query_suggestor_html_file(test_type);
                SubLObject cfasl_concepts_file = format(NIL, $str_alt74$_a__a_concepts_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
                SubLObject cfasl_queries_file = format(NIL, $str_alt75$_a__a_queries_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
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
                {
                    SubLObject cdolist_list_var = concepts;
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                        if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                            princ($str_alt76$_, StreamsLow.$standard_output$.getDynamicValue(thread));
                            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                        }
                        com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_run_test_for_concept(concept, html_file, cfasl_concepts_stream, cfasl_queries_stream);
                    }
                }
                if (cfasl_concepts_stream.isStream()) {
                    close(cfasl_concepts_stream, UNPROVIDED);
                }
                if (cfasl_queries_stream.isStream()) {
                    close(cfasl_queries_stream, UNPROVIDED);
                }
                com.cyc.cycjava.cycl.inference.query_suggestor.update_query_suggestor_html_with_computations(html_file, cfasl_concepts_file, cfasl_queries_file);
            }
            return test_type;
        }
    }

    @LispMethod(comment = "Test type can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry, or something else entirely")
    public static SubLObject query_suggestor_run_tests_for_test_type(final SubLObject test_type, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != query_suggestor_test_typeP(test_type) : "! query_suggestor.query_suggestor_test_typeP(test_type) " + ("query_suggestor.query_suggestor_test_typeP(test_type) " + "CommonSymbols.NIL != query_suggestor.query_suggestor_test_typeP(test_type) ") + test_type;
        SubLObject concepts = query_suggestor_concepts(test_type);
        final SubLObject html_file = make_query_suggestor_html_file(test_type);
        final SubLObject cfasl_concepts_file = format(NIL, $str74$_a__a_concepts_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
        final SubLObject cfasl_queries_file = format(NIL, $str75$_a__a_queries_cfasl, $query_suggestor_output_dir$.getDynamicValue(thread), $query_suggestor_file_name$.getDynamicValue(thread));
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
            if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                princ($str76$_, StreamsLow.$standard_output$.getDynamicValue(thread));
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            query_suggestor_run_test_for_concept(concept, html_file, cfasl_concepts_stream, cfasl_queries_stream);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        } 
        if (cfasl_concepts_stream.isStream()) {
            close(cfasl_concepts_stream, UNPROVIDED);
        }
        if (cfasl_queries_stream.isStream()) {
            close(cfasl_queries_stream, UNPROVIDED);
        }
        update_query_suggestor_html_with_computations(html_file, cfasl_concepts_file, cfasl_queries_file);
        return test_type;
    }/**
     * Test type can be one of #$Terrorist, #$TerroristGroup or #$IndependentCountry, or something else entirely
     */


    public static final SubLObject query_suggestor_run_tests_alt(SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = NIL;
                format(T, $str_alt77$__Run_starting_at__A, numeric_date_utilities.timestring(UNPROVIDED));
                force_output(UNPROVIDED);
                {
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject cdolist_list_var = $query_suggestor_test_types$.getDynamicValue(thread);
                        SubLObject test_type = NIL;
                        for (test_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_type = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_run_tests_for_test_type(test_type, num);
                        }
                    }
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                format(T, $str_alt78$__Run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
                force_output(UNPROVIDED);
                format(T, $str_alt79$__Elapsed_time___A, numeric_date_utilities.elapsed_seconds_string(truncate(time, UNPROVIDED)));
                force_output(UNPROVIDED);
                return time;
            }
        }
    }

    public static SubLObject query_suggestor_run_tests(SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time = NIL;
        format(T, $str77$__Run_starting_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        force_output(UNPROVIDED);
        final SubLObject time_var = get_internal_real_time();
        SubLObject cdolist_list_var = $query_suggestor_test_types$.getDynamicValue(thread);
        SubLObject test_type = NIL;
        test_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_suggestor_run_tests_for_test_type(test_type, num);
            cdolist_list_var = cdolist_list_var.rest();
            test_type = cdolist_list_var.first();
        } 
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        format(T, $str78$__Run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
        force_output(UNPROVIDED);
        format(T, $str79$__Elapsed_time___A, numeric_date_utilities.elapsed_seconds_string(truncate(time, UNPROVIDED)));
        force_output(UNPROVIDED);
        return time;
    }

    public static final SubLObject query_suggestor_run_tests_for_instances_to_dir_alt(SubLObject col, SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $query_suggestor_output_dir$.currentBinding(thread);
                    try {
                        $query_suggestor_test_types$.bind(list(col), thread);
                        $query_suggestor_output_dir$.bind(dir, thread);
                        result = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_run_tests(num);
                    } finally {
                        $query_suggestor_output_dir$.rebind(_prev_bind_1, thread);
                        $query_suggestor_test_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject query_suggestor_run_tests_for_instances_to_dir(final SubLObject col, final SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $query_suggestor_output_dir$.currentBinding(thread);
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

    public static final SubLObject query_suggestor_run_tests_for_to_dir_alt(SubLObject v_term, SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, CONSTANT_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $query_suggestor_output_dir$.currentBinding(thread);
                    try {
                        $query_suggestor_test_types$.bind(list(list($TERM, v_term)), thread);
                        $query_suggestor_output_dir$.bind(dir, thread);
                        result = com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_run_tests(num);
                    } finally {
                        $query_suggestor_output_dir$.rebind(_prev_bind_1, thread);
                        $query_suggestor_test_types$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject query_suggestor_run_tests_for_to_dir(final SubLObject v_term, final SubLObject dir, SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != constant_p(v_term) : "! constant_handles.constant_p(v_term) " + ("constant_handles.constant_p(v_term) " + "CommonSymbols.NIL != constant_handles.constant_p(v_term) ") + v_term;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $query_suggestor_test_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $query_suggestor_output_dir$.currentBinding(thread);
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

    public static final SubLObject query_suggestor_run_trial_test_alt() {
        com.cyc.cycjava.cycl.inference.query_suggestor.query_suggestor_run_tests(TWO_INTEGER);
        return NIL;
    }

    public static SubLObject query_suggestor_run_trial_test() {
        query_suggestor_run_tests(TWO_INTEGER);
        return NIL;
    }

    /**
     * Filter the query runs in QUERY-RESULTS to only those known to satisfy TEST (assuming KEY).
     */
    @LispMethod(comment = "Filter the query runs in QUERY-RESULTS to only those known to satisfy TEST (assuming KEY).")
    public static final SubLObject filter_query_runs_by_test_alt(SubLObject query_runs, SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject filtered_query_runs = NIL;
            SubLObject cdolist_list_var = query_runs;
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                if (NIL != funcall(test, funcall(key, query_run))) {
                    filtered_query_runs = cons(query_run, filtered_query_runs);
                }
            }
            return nreverse(filtered_query_runs);
        }
    }

    @LispMethod(comment = "Filter the query runs in QUERY-RESULTS to only those known to satisfy TEST (assuming KEY).")
    public static SubLObject filter_query_runs_by_test(final SubLObject query_runs, final SubLObject test, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(test, funcall(key, query_run))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return nreverse(filtered_query_runs);
    }/**
     * Filter the query runs in QUERY-RESULTS to only those known to satisfy TEST (assuming KEY).
     */


    /**
     * Filter the query runs in QUERY-RUNS to only those known to have VALUE for PROPERTY.
     */
    @LispMethod(comment = "Filter the query runs in QUERY-RUNS to only those known to have VALUE for PROPERTY.")
    public static final SubLObject filter_query_runs_by_property_value_alt(SubLObject query_runs, SubLObject property, SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            SubLObject filtered_query_runs = NIL;
            SubLObject cdolist_list_var = query_runs;
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                if (NIL != funcall(test, value, kbq_query_run.kbq_query_run_property_value(query_run, property, value))) {
                    filtered_query_runs = cons(query_run, filtered_query_runs);
                }
            }
            return nreverse(filtered_query_runs);
        }
    }

    @LispMethod(comment = "Filter the query runs in QUERY-RUNS to only those known to have VALUE for PROPERTY.")
    public static SubLObject filter_query_runs_by_property_value(final SubLObject query_runs, final SubLObject property, final SubLObject value, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLObject filtered_query_runs = NIL;
        SubLObject cdolist_list_var = query_runs;
        SubLObject query_run = NIL;
        query_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(test, value, kbq_query_run.kbq_query_run_property_value(query_run, property, value))) {
                filtered_query_runs = cons(query_run, filtered_query_runs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_run = cdolist_list_var.first();
        } 
        return nreverse(filtered_query_runs);
    }/**
     * Filter the query runs in QUERY-RUNS to only those known to have VALUE for PROPERTY.
     */


    public static final SubLObject answerable_query_runs_alt(SubLObject query_runs) {
        return com.cyc.cycjava.cycl.inference.query_suggestor.filter_query_runs_by_test(query_runs, symbol_function(POSITIVE_INTEGER_P), symbol_function(KBQ_QUERY_RUN_ANSWER_COUNT));
    }

    public static SubLObject answerable_query_runs(final SubLObject query_runs) {
        return filter_query_runs_by_test(query_runs, symbol_function(POSITIVE_INTEGER_P), symbol_function(KBQ_QUERY_RUN_ANSWER_COUNT));
    }

    public static final SubLObject unanswerable_query_runs_alt(SubLObject query_runs) {
        return com.cyc.cycjava.cycl.inference.query_suggestor.filter_query_runs_by_property_value(query_runs, $ANSWER_COUNT, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject unanswerable_query_runs(final SubLObject query_runs) {
        return filter_query_runs_by_property_value(query_runs, $ANSWER_COUNT, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject declare_query_suggestor_file() {
        declareFunction("query_suggestor_singleton_test_typeP", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE?", 1, 0, false);
        declareFunction("query_suggestor_singleton_test_type_sole_instance", "QUERY-SUGGESTOR-SINGLETON-TEST-TYPE-SOLE-INSTANCE", 1, 0, false);
        declareFunction("query_suggestor_test_typeP", "QUERY-SUGGESTOR-TEST-TYPE?", 1, 0, false);
        declareFunction("query_suggestor_concepts", "QUERY-SUGGESTOR-CONCEPTS", 1, 0, false);
        declareFunction("assert_query_suggestor_concept_info", "ASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        declareFunction("unassert_query_suggestor_concept_info", "UNASSERT-QUERY-SUGGESTOR-CONCEPT-INFO", 1, 0, false);
        declareFunction("query_suggestor_relevant_queries", "QUERY-SUGGESTOR-RELEVANT-QUERIES", 1, 0, false);
        declareFunction("english_gloss_for_relevant_query", "ENGLISH-GLOSS-FOR-RELEVANT-QUERY", 1, 0, false);
        declareFunction("run_query_suggestor_query", "RUN-QUERY-SUGGESTOR-QUERY", 1, 0, false);
        declareFunction("query_suggestor_concept_computations", "QUERY-SUGGESTOR-CONCEPT-COMPUTATIONS", 1, 0, false);
        declareFunction("query_suggestor_run_test_for_concept", "QUERY-SUGGESTOR-RUN-TEST-FOR-CONCEPT", 4, 0, false);
        declareFunction("make_query_suggestor_html_file", "MAKE-QUERY-SUGGESTOR-HTML-FILE", 1, 0, false);
        declareFunction("query_suggestor_html_strong_desc_row", "QUERY-SUGGESTOR-HTML-STRONG-DESC-ROW", 2, 0, false);
        declareFunction("query_suggestor_html_row", "QUERY-SUGGESTOR-HTML-ROW", 2, 0, false);
        declareFunction("update_query_suggestor_html_intro", "UPDATE-QUERY-SUGGESTOR-HTML-INTRO", 3, 0, false);
        declareFunction("update_query_suggestor_html_output", "UPDATE-QUERY-SUGGESTOR-HTML-OUTPUT", 3, 0, false);
        declareFunction("update_query_suggestor_html_with_query_result", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-QUERY-RESULT", 3, 0, false);
        declareFunction("update_query_suggestor_html_with_results", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-RESULTS", 5, 0, false);
        declareFunction("update_query_suggestor_html_with_computations", "UPDATE-QUERY-SUGGESTOR-HTML-WITH-COMPUTATIONS", 3, 0, false);
        declareFunction("query_suggestor_run_tests_for_test_type", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TEST-TYPE", 1, 1, false);
        declareFunction("query_suggestor_run_tests", "QUERY-SUGGESTOR-RUN-TESTS", 0, 1, false);
        declareFunction("query_suggestor_run_tests_for_instances_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-INSTANCES-TO-DIR", 2, 1, false);
        declareFunction("query_suggestor_run_tests_for_to_dir", "QUERY-SUGGESTOR-RUN-TESTS-FOR-TO-DIR", 2, 1, false);
        declareFunction("query_suggestor_run_trial_test", "QUERY-SUGGESTOR-RUN-TRIAL-TEST", 0, 0, false);
        declareFunction("filter_query_runs_by_test", "FILTER-QUERY-RUNS-BY-TEST", 2, 1, false);
        declareFunction("filter_query_runs_by_property_value", "FILTER-QUERY-RUNS-BY-PROPERTY-VALUE", 3, 1, false);
        declareFunction("answerable_query_runs", "ANSWERABLE-QUERY-RUNS", 1, 0, false);
        declareFunction("unanswerable_query_runs", "UNANSWERABLE-QUERY-RUNS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_query_suggestor_file() {
        defvar("*QUERY-SUGGESTOR-TEST-TYPES*", $list0);
        defparameter("*QUERY-SUGGESTOR-OUTPUT-DIR*", $str3$_cyc_projects_Topsail_query_sugge);
        defvar("*QUERY-SUGGESTOR-FILE-NAME*", NIL);
        deflexical("*QUERY-SUGGESTOR-QUERY-METRICS*", $list20);
        deflexical("*QUERY-SUGGESTOR-CONCEPT-METRICS*", $list21);
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
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("Terrorist"), reader_make_constant_shell("TerroristGroup"), reader_make_constant_shell("IndependentCountry"));

    static private final SubLString $str_alt3$_cyc_projects_Topsail_query_sugge = makeString("/cyc/projects/Topsail/query-suggestor");

    static private final SubLList $list_alt8 = list(list(reader_make_constant_shell("HighAmountFn"), reader_make_constant_shell("Relevance")));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("TaskModelMtFn"), reader_make_constant_shell("Allotment-8"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("VeryHighAmountFn"), reader_make_constant_shell("Relevance"));

    static private final SubLList $list_alt17 = list(makeSymbol("?GLOSS"));

    static private final SubLList $list_alt19 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?GLOSS")));

    static private final SubLList $list_alt20 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"));

    static private final SubLList $list_alt21 = list(makeKeyword("QUIESCENCE"), makeKeyword("TOTAL"), makeKeyword("ANSWERABLES"), makeKeyword("UNANSWERABLES"));

    static private final SubLString $str_alt27$Concept_not_asserted_to_be_pertin = makeString("Concept not asserted to be pertinent");

    static private final SubLString $str_alt28$_a__a = makeString("~a/~a");

    static private final SubLString $str_alt31$_a__a__a_htm = makeString("~a/~a-~a.htm");

    static private final SubLString $str_alt32$_a__a = makeString("~a-~a");

    static private final SubLString $str_alt33$_a = makeString("~a");

    static private final SubLString $str_alt35$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt36$Test_Date__ = makeString("Test Date: ");

    static private final SubLString $str_alt37$KB__ = makeString("KB: ");

    static private final SubLString $str_alt38$System__ = makeString("System: ");

    static private final SubLString $str_alt39$Test_Type__ = makeString("Test Type: ");

    static private final SubLString $str_alt41$_________________________________ = makeString(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

    static private final SubLString $str_alt42$Concept__ = makeString("Concept: ");

    static private final SubLString $str_alt43$Time_to_Quiescence_ = makeString("Time to Quiescence:");

    static private final SubLString $str_alt44$Total_Number_of_Queries_ = makeString("Total Number of Queries:");

    static private final SubLString $str_alt45$Answerable_Unanswerable___A = makeString("Answerable/Unanswerable: ~A");

    static private final SubLString $str_alt46$Answerable_Queries_ = makeString("Answerable Queries:");

    static private final SubLString $str_alt47$Unanswerable_Queries_ = makeString("Unanswerable Queries:");

    static private final SubLString $str_alt52$Number_of_Bindings__ = makeString("Number of Bindings: ");

    static private final SubLString $str_alt53$Bindings__ = makeString("Bindings: ");

    static private final SubLString $str_alt55$Time_To_First_Answer__ = makeString("Time To First Answer: ");

    static private final SubLString $str_alt57$Complete_Total_Time__ = makeString("Complete Total Time: ");

    static private final SubLString $str_alt59$n_a = makeString("n~a");

    static private final SubLString $str_alt60$_a_extra_answers__a__a__a_htm = makeString("~a/extra-answers/~a-~a-~a.htm");

    static private final SubLString $str_alt62$_a__a_htm = makeString("~a/~a.htm");

    static private final SubLString $str_alt64$Query__ = makeString("Query: ");

    static private final SubLString $str_alt65$Bindings_ = makeString("Bindings:");

    static private final SubLString $str_alt66$_________________________________ = makeString("****************************************");

    static private final SubLString $str_alt68$Median_Quiescence_Time__ = makeString("Median Quiescence Time: ");

    static private final SubLString $str_alt69$Mean_Quiescence_Time__ = makeString("Mean Quiescence Time: ");

    static private final SubLString $str_alt70$Median_Answerables__ = makeString("Median Answerables: ");

    static private final SubLString $str_alt71$Mean_Answerables__ = makeString("Mean Answerables: ");

    static private final SubLString $str_alt72$Median_Unanswerables__ = makeString("Median Unanswerables: ");

    static private final SubLString $str_alt73$Mean_Unanswerables__ = makeString("Mean Unanswerables: ");

    static private final SubLString $str_alt74$_a__a_concepts_cfasl = makeString("~a/~a-concepts.cfasl");

    static private final SubLString $str_alt75$_a__a_queries_cfasl = makeString("~a/~a-queries.cfasl");

    static private final SubLString $str_alt76$_ = makeString("*");

    static private final SubLString $str_alt77$__Run_starting_at__A = makeString("~%Run starting at ~A");

    static private final SubLString $str_alt78$__Run_ended_at__A = makeString("~%Run ended at ~A");

    static private final SubLString $str_alt79$__Elapsed_time___A = makeString("~%Elapsed time: ~A");
}

/**
 * Total time: 676 ms
 */
