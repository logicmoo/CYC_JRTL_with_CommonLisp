package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class open_cyc_simple_inference_api extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api";
    public static String myFingerPrint = "146335e13ec352d6dde2420b329a049e5d8e0c91bbff5e1ae6c9ffa2deef250f";
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 900L)
    private static SubLSymbol $simple_query_default_mt$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1100L)
    private static SubLSymbol $simple_query_default_nl_mt$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1200L)
    private static SubLSymbol $simple_boolean_default_time$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1300L)
    private static SubLSymbol $simple_boolean_nl_default_time$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    private static SubLSymbol $nl_query_denots_of_string_caching_state$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    private static SubLSymbol $first_order_collectionP_caching_state$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    private static SubLSymbol $variable_order_collectionP_caching_state$;
    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    private static SubLSymbol $get_simple_inference_semtrans_lexicon$;
    private static SubLList $list0;
    private static SubLObject $$RelationParaphraseMt;
    private static SubLSymbol $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID;
    private static SubLSymbol $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static SubLSymbol $sym4$SIMPLE_BOOLEAN_QUERY_CYCL;
    private static SubLSymbol $ERROR;
    private static SubLString $str6$The_sentence_contains_an_open_var;
    private static SubLString $str7$The_sentence_;
    private static SubLString $str8$_is_not_a_valid_CycL_sentence_;
    private static SubLSymbol $FALSE;
    private static SubLString $str10$_is_not_semantically_well_formed;
    private static SubLSymbol $MAX_TIME;
    private static SubLSymbol $PROBLEM_STORE;
    private static SubLList $list13;
    private static SubLString $str14$Timed_out;
    private static SubLSymbol $TRUE;
    private static SubLObject $$not;
    private static SubLSymbol $UNKNOWN;
    private static SubLSymbol $sym18$SIMPLE_BOOLEAN_QUERY_NL;
    private static SubLObject $$is_Underspecified;
    private static SubLSymbol $sym20$PREDICATE_P;
    private static SubLSymbol $sym21$NL_QUERY_DENOTS_OF_STRING;
    private static SubLList $list22;
    private static SubLSymbol $WFF;
    private static SubLString $str24$Timed_out_before_completion;
    private static SubLSymbol $sym25$SECOND;
    private static SubLObject $$Thing;
    private static SubLObject $$CurrentWorldDataCollectorMt_NonHo;
    private static SubLSymbol $sym28$BAD_FOR_TAGGING_;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym30$IGNORE_ERRORS_HANDLER;
    private static SubLString $str31$_cyc_projects_doc_annotation_comp;
    private static SubLSymbol $APPEND;
    private static SubLString $str33$Unable_to_open__S;
    private static SubLString $str34$_S_A_S_A_S__;
    private static SubLSymbol $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_;
    private static SubLInteger $int$128000;
    private static SubLObject $$relationExistsInstance;
    private static SubLObject $$relationInstanceExists;
    private static SubLObject $$relationExistsExists;
    private static SubLSymbol $VARIABLE;
    private static SubLSymbol $sym41$FIRST_ORDER_COLLECTION_;
    private static SubLObject $$FirstOrderCollection;
    private static SubLSymbol $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_;
    private static SubLSymbol $sym44$VARIABLE_ORDER_COLLECTION_;
    private static SubLObject $$VariedOrderCollection;
    private static SubLSymbol $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_;
    private static SubLSymbol $sym47$GET;
    private static SubLSymbol $SEMTRANS;
    private static SubLSymbol $CYC_POS;
    private static SubLSymbol $FRAME;
    private static SubLObject $$Verb;
    private static SubLObject $$TransitiveNPFrame;
    private static SubLSymbol $ACTION;
    private static SubLObject $$thereExists;
    private static SubLSymbol $sym55$_EVENT;
    private static SubLSymbol $sym56$KEYWORDP;
    private static SubLSymbol $SUBJECT;
    private static SubLSymbol $OBJECT;
    private static SubLSymbol $sym59$_SUBJ;
    private static SubLObject $$and;
    private static SubLList $list61;
    private static SubLSymbol $sym62$_FIRST_ORDER_SUBJ;
    private static SubLList $list63;
    private static SubLList $list64;
    private static SubLSymbol $sym65$_OBJ;
    private static SubLList $list66;
    private static SubLObject $$genls;
    private static SubLObject $$isa;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLString $str70$Unable_to_initialize__A__;
    private static SubLSymbol $sym71$IGNORE_CACHE;
    private static SubLSymbol $sym72$COMPACT_HL_EXTERNAL_ID_STRING;
    private static SubLSymbol $sym73$SIMPLE_BOOLEAN_QUERY_TEST;
    private static SubLSymbol $TEST;
    private static SubLSymbol $OWNER;
    private static SubLSymbol $CLASSES;
    private static SubLSymbol $KB;
    private static SubLSymbol $FULL;
    private static SubLSymbol $WORKING_;
    private static SubLList $list80;
    private static SubLSymbol $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST;
    private static SubLList $list82;

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1300L)
    public static SubLObject get_simple_query_default_mt() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $simple_query_default_mt$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1400L)
    public static SubLObject get_simple_query_default_nl_mt() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return $simple_query_default_nl_mt$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1500L)
    public static SubLObject simple_boolean_query_external_id(SubLObject pred_id, SubLObject arg_ids, SubLObject max_time_sec, SubLObject mt_id) {
        if (max_time_sec == UNPROVIDED) {
            max_time_sec = ONE_INTEGER;
        }
        if (mt_id == UNPROVIDED) {
            mt_id = NIL;
        }
        SubLObject pred = kb_utilities.find_object_by_compact_hl_external_id_string(pred_id);
        SubLObject args = Mapping.mapcar($sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, arg_ids);
        SubLObject mt = (NIL != mt_id) ? kb_utilities.find_object_by_compact_hl_external_id_string(mt_id) : get_simple_query_default_mt();
        return simple_boolean_query_cycl(pred, args, max_time_sec, mt);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 2500L)
    public static SubLObject simple_boolean_query_cycl(SubLObject pred, SubLObject args, SubLObject max_time_sec, SubLObject mt) {
        if (max_time_sec == UNPROVIDED) {
            max_time_sec = $simple_boolean_default_time$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject result2 = NIL;
        SubLObject sentence = cons(pred, args);
        if (NIL == el_utilities.closedP(sentence, UNPROVIDED)) {
            result = $ERROR;
            result2 = $str6$The_sentence_contains_an_open_var;
        }
        if (NIL == collection_defns.cycl_sentenceP(sentence)) {
            result = $ERROR;
            result2 = Sequences.cconcatenate($str7$The_sentence_, new SubLObject[] { format_nil.format_nil_s_no_copy(sentence), $str8$_is_not_a_valid_CycL_sentence_ });
        }
        if (NIL == result && NIL == wff.el_wffP(verbosifier.el_expansion(sentence, mt), mt, UNPROVIDED)) {
            result = $FALSE;
            result2 = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(sentence), $str10$_is_not_semantically_well_formed);
        }
        if (NIL == result) {
            SubLObject problem_store = inference_datastructures_problem_store.new_problem_store(UNPROVIDED);
            SubLObject positive_query_max_time = Numbers.divide(max_time_sec, TWO_INTEGER);
            SubLObject inference_props = listS($MAX_TIME, positive_query_max_time, $PROBLEM_STORE, problem_store, $list13);
            thread.resetMultipleValues();
            SubLObject temp_result = inference_kernel.new_cyc_query(sentence, mt, inference_props);
            SubLObject halt_reason = thread.secondMultipleValue();
            SubLObject inference = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (halt_reason == $MAX_TIME) {
                result = $ERROR;
                result2 = Sequences.copy_seq($str14$Timed_out);
            }
            if (NIL != cyc_kernel.closed_query_success_token_p(temp_result)) {
                result = $TRUE;
            }
            if (NIL == result) {
                SubLObject negative_query_max_time = Numbers.subtract(max_time_sec, inference_datastructures_inference.inference_cumulative_time_so_far(inference, NIL));
                SubLObject negative_query = list($$not, sentence);
                SubLObject inference_props_$1 = list($MAX_TIME, negative_query_max_time, $PROBLEM_STORE, problem_store);
                inference_datastructures_inference.destroy_inference(inference);
                temp_result = inference_kernel.new_cyc_query(negative_query, mt, inference_props_$1);
                if (NIL != cyc_kernel.closed_query_success_token_p(temp_result)) {
                    result = $FALSE;
                }
            }
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        if (NIL == result) {
            result = $UNKNOWN;
        }
        return list(result, result2);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject simple_boolean_query_nl(SubLObject pred_string, SubLObject arg_strings, SubLObject max_time_sec, SubLObject mt, SubLObject language_mt) {
        if (max_time_sec == UNPROVIDED) {
            max_time_sec = $simple_boolean_nl_default_time$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = get_simple_query_default_nl_mt();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        SubLObject timed_out = NIL;
        SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
        SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
        SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(language_mt, thread);
            parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time_sec), thread);
            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
            if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                SubLObject pred_interps = Sequences.remove($$is_Underspecified,
                        list_utilities.remove_if_not($sym20$PREDICATE_P, lexicon_accessors.denots_of_string(pred_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED,
                        UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject args_interps = Mapping.mapcar($sym21$NL_QUERY_DENOTS_OF_STRING, arg_strings);
                SubLObject all_raw_semtrans_sentences = get_semtrans_sentences(pred_string, args_interps);
                SubLObject all_raw_pred_sentences = list_utilities.cartesian_product(cons(pred_interps, args_interps), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject all_pred_sentences = add_quantifiers_if_needed(all_raw_pred_sentences, mt);
                SubLObject all_sentences = Sequences.cconcatenate(all_raw_semtrans_sentences, all_pred_sentences);
                SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer(max_time_sec, tag);
                                SubLObject cdolist_list_var = all_sentences;
                                SubLObject query_sentence = NIL;
                                query_sentence = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    SubLObject current;
                                    SubLObject datum = current = simple_boolean_query_cycl(query_sentence.first(), query_sentence.rest(), max_time_sec, mt);
                                    SubLObject result = NIL;
                                    SubLObject error_msg = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
                                    result = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
                                    error_msg = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        SubLObject pcase_var = result;
                                        if (pcase_var.eql($ERROR)) {
                                            result = $UNKNOWN;
                                        } else if (pcase_var.eql($UNKNOWN)) {
                                            result = $WFF;
                                        }
                                        results = cons(list(query_sentence, result, error_msg), results);
                                    } else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    query_sentence = cdolist_list_var.first();
                                }
                            } finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    } finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                    }
                } catch (Throwable ccatch_env_var) {
                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            }
            timed_out = parsing_macros.parsing_timeout_time_reachedP();
        } finally {
            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_4, thread);
            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_3, thread);
            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_2, thread);
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != timed_out) {
            results = cons(list(NIL, $UNKNOWN, $str24$Timed_out_before_completion), results);
        }
        return results;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject clear_nl_query_denots_of_string() {
        SubLObject cs = $nl_query_denots_of_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject remove_nl_query_denots_of_string(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($nl_query_denots_of_string_caching_state$.getGlobalValue(), list(string, mt), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject nl_query_denots_of_string_internal(SubLObject string, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject determiner_free = lexicon_utilities.strip_determiner(string, UNPROVIDED);
        SubLObject possible_denots = Mapping.mapcar($sym25$SECOND,
                api_widgets.get_constrained_cycl_for_string(determiner_free, $$Thing, $$CurrentWorldDataCollectorMt_NonHo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject usable_denots = Sequences.remove_if($sym28$BAD_FOR_TAGGING_, possible_denots, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym30$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject compound_file = $str31$_cyc_projects_doc_annotation_comp;
                    SubLObject non_lexical = conses_high.set_difference(usable_denots, concept_tagger.all_tagged_concepts(document.new_document(string, UNPROVIDED, UNPROVIDED), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    SubLObject _prev_bind_0_$5 = print_high.$print_pretty$.currentBinding(thread);
                    try {
                        print_high.$print_pretty$.bind(NIL, thread);
                        if (NIL != non_lexical) {
                            SubLObject stream = NIL;
                            try {
                                SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_text(compound_file, $APPEND);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$6, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str33$Unable_to_open__S, compound_file);
                                }
                                SubLObject s = stream;
                                PrintLow.format(s, $str34$_S_A_S_A_S__, new SubLObject[] { string, Characters.CHAR_tab, non_lexical, Characters.CHAR_tab, kb_utilities.compact_hl_external_id_string(non_lexical) });
                            } finally {
                                SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                    } finally {
                        print_high.$print_pretty$.rebind(_prev_bind_0_$5, thread);
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return usable_denots;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject nl_query_denots_of_string(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject caching_state = $nl_query_denots_of_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym21$NL_QUERY_DENOTS_OF_STRING, $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_, $int$128000, EQUALP, TWO_INTEGER, ZERO_INTEGER);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(string, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(nl_query_denots_of_string_internal(string, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject add_quantifiers_if_needed(SubLObject sentences, SubLObject mt) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_sentences = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject pred = cycl_utilities.formula_arg0(sentence);
                if (NIL != kb_accessors.binary_predicateP(pred)) {
                    SubLObject arg1_predicted_order = pred_arg_expected_order(pred, ONE_INTEGER);
                    SubLObject arg2_predicted_order = pred_arg_expected_order(pred, TWO_INTEGER);
                    SubLObject arg1_order = term_order_integer(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
                    SubLObject arg2_order = term_order_integer(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
                    if (arg1_predicted_order.eql(arg1_order) && arg2_predicted_order.eql(arg2_order)) {
                        all_sentences = cons(sentence, all_sentences);
                    } else if (arg1_predicted_order.numL(arg1_order) && arg2_predicted_order.eql(arg2_order)) {
                        all_sentences = cons(cons($$relationExistsInstance, sentence), all_sentences);
                    } else if (arg2_predicted_order.numL(arg2_order) && arg1_predicted_order.eql(arg1_order)) {
                        all_sentences = cons(cons($$relationInstanceExists, sentence), all_sentences);
                    } else if (arg2_predicted_order.numL(arg2_order) && arg2_predicted_order.numL(arg2_order)) {
                        all_sentences = cons(cons($$relationExistsExists, sentence), all_sentences);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return all_sentences;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject term_order_integer(SubLObject v_term) {
        SubLObject canon_term = czer_main.canonicalize_term(v_term, UNPROVIDED);
        if (NIL != kb_accessors.individualP(canon_term)) {
            return ZERO_INTEGER;
        }
        if (NIL != first_order_collectionP(canon_term, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        if (NIL != builder_utilities.higher_order_collectionP(canon_term)) {
            return TWO_INTEGER;
        }
        if (NIL != variable_order_collectionP(canon_term, UNPROVIDED)) {
            return $VARIABLE;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject clear_first_order_collectionP() {
        SubLObject cs = $first_order_collectionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject remove_first_order_collectionP(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($first_order_collectionP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject first_order_collectionP_internal(SubLObject v_term, SubLObject mt) {
        return isa.isaP(v_term, $$FirstOrderCollection, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject first_order_collectionP(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $first_order_collectionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym41$FIRST_ORDER_COLLECTION_, $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(first_order_collectionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject clear_variable_order_collectionP() {
        SubLObject cs = $variable_order_collectionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject remove_variable_order_collectionP(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($variable_order_collectionP_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject variable_order_collectionP_internal(SubLObject v_term, SubLObject mt) {
        return isa.isaP(v_term, $$VariedOrderCollection, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject variable_order_collectionP(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = $variable_order_collectionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym44$VARIABLE_ORDER_COLLECTION_, $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(variable_order_collectionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject pred_arg_expected_order(SubLObject pred, SubLObject argnum) {
        SubLObject cdolist_list_var = kb_accessors.argn_isa(pred, argnum, UNPROVIDED);
        SubLObject arg_isa_constraint = NIL;
        arg_isa_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != builder_utilities.higher_order_collectionP(arg_isa_constraint)) {
                return ONE_INTEGER;
            }
            if (NIL != fort_types_interface.collectionP(arg_isa_constraint)) {
                return ZERO_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = kb_accessors.argn_genl(pred, argnum, UNPROVIDED);
        SubLObject arg_genl_constraint = NIL;
        arg_genl_constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != builder_utilities.higher_order_collectionP(arg_genl_constraint)) {
                return TWO_INTEGER;
            }
            if (NIL != fort_types_interface.collectionP(arg_genl_constraint)) {
                return ONE_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_genl_constraint = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject get_semtrans_sentences(SubLObject pred_string, SubLObject arg_cycls) {
        SubLObject lex = get_simple_inference_semtrans_lexicon();
        SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lex, $sym47$GET, pred_string);
        SubLObject semtrans_sentences = NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject semtrans = methods.funcall_instance_method_with_1_args(entry, $sym47$GET, $SEMTRANS);
            SubLObject pos = methods.funcall_instance_method_with_1_args(entry, $sym47$GET, $CYC_POS);
            SubLObject frame = methods.funcall_instance_method_with_1_args(entry, $sym47$GET, $FRAME);
            if (NIL != lexicon_accessors.genl_posP(pos, $$Verb, UNPROVIDED) && frame.eql($$TransitiveNPFrame)) {
                SubLObject cdolist_list_var_$8 = arg_cycls.first();
                SubLObject arg1 = NIL;
                arg1 = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    SubLObject cdolist_list_var_$9 = conses_high.second(arg_cycls);
                    SubLObject arg2 = NIL;
                    arg2 = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        SubLObject cdolist_list_var_$10 = add_quantifiers_to_semtrans_if_needed(semtrans, arg1, arg2, UNPROVIDED);
                        SubLObject quantified = NIL;
                        quantified = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            SubLObject verb_substituted = (NIL != cycl_utilities.expression_find($ACTION, quantified, UNPROVIDED, UNPROVIDED, UNPROVIDED))
                                    ? el_utilities.make_formula($$thereExists, list($sym55$_EVENT, cycl_utilities.expression_subst($sym55$_EVENT, $ACTION, quantified, UNPROVIDED, UNPROVIDED)), UNPROVIDED)
                                    : quantified;
                            if (NIL == cycl_utilities.expression_find_if($sym56$KEYWORDP, verb_substituted, UNPROVIDED, UNPROVIDED)) {
                                semtrans_sentences = cons(verb_substituted, semtrans_sentences);
                            }
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            quantified = cdolist_list_var_$10.first();
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        arg2 = cdolist_list_var_$9.first();
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    arg1 = cdolist_list_var_$8.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return semtrans_sentences;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject add_quantifiers_to_semtrans_if_needed(SubLObject semtrans_template, SubLObject subj, SubLObject obj, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject quantified = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject constraints = at_var_types.inter_formula_variables_arg_constraints(semtrans_template, mt, $sym56$KEYWORDP);
            SubLObject subj_predicted_order = arg_expected_order_from_constraints(constraints, $SUBJECT);
            SubLObject obj_predicted_order = arg_expected_order_from_constraints(constraints, $OBJECT);
            SubLObject subj_order = term_order_integer(subj);
            SubLObject obj_order = term_order_integer(obj);
            if (NIL == subj_order) {
                quantified = cons(semtrans_template, quantified);
            } else if (subj_predicted_order == $VARIABLE) {
                quantified = cons(ConsesLow.list($$thereExists, $sym59$_SUBJ, ConsesLow.list($$and, $list61, cycl_utilities.expression_subst($sym59$_SUBJ, $SUBJECT, semtrans_template, UNPROVIDED, UNPROVIDED))), quantified);
                quantified = cons(semtrans_template, quantified);
            } else if (number_utilities.f_1X(subj_predicted_order).numE(subj_order)) {
                quantified = cons(ConsesLow.list($$thereExists, $sym59$_SUBJ, ConsesLow.list($$and, $list61, cycl_utilities.expression_subst($sym59$_SUBJ, $SUBJECT, semtrans_template, UNPROVIDED, UNPROVIDED))), quantified);
            } else if (Numbers.add(TWO_INTEGER, subj_predicted_order).numE(subj_order)) {
                quantified = cons(ConsesLow.list($$thereExists, $sym59$_SUBJ, ConsesLow.list($$and, $list61, cycl_utilities.expression_subst($sym59$_SUBJ, $SUBJECT, semtrans_template, UNPROVIDED, UNPROVIDED))), quantified);
                quantified = cons(list($$thereExists, $sym62$_FIRST_ORDER_SUBJ, list($$and, $list63, list($$thereExists, $sym59$_SUBJ, list($$and, $list64, cycl_utilities.expression_subst($sym59$_SUBJ, $SUBJECT, semtrans_template, UNPROVIDED, UNPROVIDED))))),
                        quantified);
            } else {
                quantified = cons(semtrans_template, quantified);
            }
            SubLObject obj_quantified = NIL;
            SubLObject cdolist_list_var = quantified;
            SubLObject curr_quantified = NIL;
            curr_quantified = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == obj_order) {
                    obj_quantified = cons(curr_quantified, obj_quantified);
                } else if (obj_predicted_order == $VARIABLE) {
                    obj_quantified = cons(ConsesLow.list($$thereExists, $sym65$_OBJ, ConsesLow.list($$and, $list66, cycl_utilities.expression_subst($sym65$_OBJ, $OBJECT, curr_quantified, UNPROVIDED, UNPROVIDED))), obj_quantified);
                    obj_quantified = cons(curr_quantified, obj_quantified);
                } else if (obj_predicted_order.numL(obj_order)) {
                    obj_quantified = cons(ConsesLow.list($$thereExists, $sym65$_OBJ, ConsesLow.list($$and, $list66, cycl_utilities.expression_subst($sym65$_OBJ, $OBJECT, curr_quantified, UNPROVIDED, UNPROVIDED))), obj_quantified);
                } else {
                    obj_quantified = cons(curr_quantified, obj_quantified);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr_quantified = cdolist_list_var.first();
            }
            quantified = obj_quantified;
            SubLObject substituted = NIL;
            cdolist_list_var = quantified;
            SubLObject sent = NIL;
            sent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sent = cycl_utilities.expression_subst(subj, $SUBJECT, sent, UNPROVIDED, UNPROVIDED);
                substituted = cons(cycl_utilities.expression_subst(obj, $OBJECT, sent, UNPROVIDED, UNPROVIDED), substituted);
                cdolist_list_var = cdolist_list_var.rest();
                sent = cdolist_list_var.first();
            }
            quantified = substituted;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return quantified;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject arg_expected_order_from_constraints(SubLObject constraints, SubLObject v_term) {
        SubLObject cdolist_list_var;
        SubLObject term_arg_poses = cdolist_list_var = cycl_utilities.arg_positions_bfs(v_term, constraints, UNPROVIDED);
        SubLObject term_arg_pos = NIL;
        term_arg_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject constraint = cycl_utilities.formula_arg_position(constraints, conses_high.butlast(term_arg_pos, UNPROVIDED), UNPROVIDED);
            SubLObject constraint_order = term_order_integer(cycl_utilities.formula_arg2(constraint, UNPROVIDED));
            if (constraint_order.isKeyword()) {
                return constraint_order;
            }
            if (cycl_utilities.formula_arg0(constraint).eql($$genls)) {
                return constraint_order;
            }
            if (cycl_utilities.formula_arg0(constraint).eql($$isa)) {
                return constraint_order.isNumber() ? Numbers.subtract(constraint_order, ONE_INTEGER) : constraint_order;
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_arg_pos = cdolist_list_var.first();
        }
        return ZERO_INTEGER;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject get_simple_inference_semtrans_lexicon() {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ($get_simple_inference_semtrans_lexicon$.getDynamicValue(thread) == $UNINITIALIZED) {
            SubLObject init_value = make_simple_inference_semtrans_lexicon();
            if (init_value == $UNINITIALIZED) {
                Errors.error($str70$Unable_to_initialize__A__, $get_simple_inference_semtrans_lexicon$.getDynamicValue(thread));
            }
            $get_simple_inference_semtrans_lexicon$.setDynamicValue(init_value, thread);
        }
        return $get_simple_inference_semtrans_lexicon$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4400L)
    public static SubLObject make_simple_inference_semtrans_lexicon() {
        SubLObject lex = semtrans_lexicon.new_semtrans_lexicon();
        methods.funcall_instance_method_with_0_args(lex, $sym71$IGNORE_CACHE);
        return lex;
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
    public static SubLObject simple_boolean_query_test(SubLObject pred, SubLObject args, SubLObject time, SubLObject mt) {
        if (time == UNPROVIDED) {
            time = ONE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        return simple_boolean_query_external_id(kb_utilities.compact_hl_external_id_string(pred), Mapping.mapcar($sym72$COMPACT_HL_EXTERNAL_ID_STRING, args), time, kb_utilities.compact_hl_external_id_string(mt));
    }

    @SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
    public static SubLObject simple_boolean_query_nl_test(SubLObject expected, SubLObject actual) {
        return cycl_utilities.expression_find(actual, expected, EQUAL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_open_cyc_simple_inference_api_file() {
        declareFunction(myName, "get_simple_query_default_mt", "GET-SIMPLE-QUERY-DEFAULT-MT", 0, 0, false);
        declareFunction(myName, "get_simple_query_default_nl_mt", "GET-SIMPLE-QUERY-DEFAULT-NL-MT", 0, 0, false);
        declareFunction(myName, "simple_boolean_query_external_id", "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID", 2, 2, false);
        declareFunction(myName, "simple_boolean_query_cycl", "SIMPLE-BOOLEAN-QUERY-CYCL", 2, 2, false);
        declareFunction(myName, "simple_boolean_query_nl", "SIMPLE-BOOLEAN-QUERY-NL", 2, 3, false);
        declareFunction(myName, "clear_nl_query_denots_of_string", "CLEAR-NL-QUERY-DENOTS-OF-STRING", 0, 0, false);
        declareFunction(myName, "remove_nl_query_denots_of_string", "REMOVE-NL-QUERY-DENOTS-OF-STRING", 1, 1, false);
        declareFunction(myName, "nl_query_denots_of_string_internal", "NL-QUERY-DENOTS-OF-STRING-INTERNAL", 2, 0, false);
        declareFunction(myName, "nl_query_denots_of_string", "NL-QUERY-DENOTS-OF-STRING", 1, 1, false);
        declareFunction(myName, "add_quantifiers_if_needed", "ADD-QUANTIFIERS-IF-NEEDED", 2, 0, false);
        declareFunction(myName, "term_order_integer", "TERM-ORDER-INTEGER", 1, 0, false);
        declareFunction(myName, "clear_first_order_collectionP", "CLEAR-FIRST-ORDER-COLLECTION?", 0, 0, false);
        declareFunction(myName, "remove_first_order_collectionP", "REMOVE-FIRST-ORDER-COLLECTION?", 1, 1, false);
        declareFunction(myName, "first_order_collectionP_internal", "FIRST-ORDER-COLLECTION?-INTERNAL", 2, 0, false);
        declareFunction(myName, "first_order_collectionP", "FIRST-ORDER-COLLECTION?", 1, 1, false);
        declareFunction(myName, "clear_variable_order_collectionP", "CLEAR-VARIABLE-ORDER-COLLECTION?", 0, 0, false);
        declareFunction(myName, "remove_variable_order_collectionP", "REMOVE-VARIABLE-ORDER-COLLECTION?", 1, 1, false);
        declareFunction(myName, "variable_order_collectionP_internal", "VARIABLE-ORDER-COLLECTION?-INTERNAL", 2, 0, false);
        declareFunction(myName, "variable_order_collectionP", "VARIABLE-ORDER-COLLECTION?", 1, 1, false);
        declareFunction(myName, "pred_arg_expected_order", "PRED-ARG-EXPECTED-ORDER", 2, 0, false);
        declareFunction(myName, "get_semtrans_sentences", "GET-SEMTRANS-SENTENCES", 2, 0, false);
        declareFunction(myName, "add_quantifiers_to_semtrans_if_needed", "ADD-QUANTIFIERS-TO-SEMTRANS-IF-NEEDED", 3, 1, false);
        declareFunction(myName, "arg_expected_order_from_constraints", "ARG-EXPECTED-ORDER-FROM-CONSTRAINTS", 2, 0, false);
        declareFunction(myName, "get_simple_inference_semtrans_lexicon", "GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction(myName, "make_simple_inference_semtrans_lexicon", "MAKE-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction(myName, "simple_boolean_query_test", "SIMPLE-BOOLEAN-QUERY-TEST", 2, 2, false);
        declareFunction(myName, "simple_boolean_query_nl_test", "SIMPLE-BOOLEAN-QUERY-NL-TEST", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_open_cyc_simple_inference_api_file() {
        $simple_query_default_mt$ = defparameter("*SIMPLE-QUERY-DEFAULT-MT*", $list0);
        $simple_query_default_nl_mt$ = defparameter("*SIMPLE-QUERY-DEFAULT-NL-MT*", $$RelationParaphraseMt);
        $simple_boolean_default_time$ = defparameter("*SIMPLE-BOOLEAN-DEFAULT-TIME*", ONE_INTEGER);
        $simple_boolean_nl_default_time$ = defparameter("*SIMPLE-BOOLEAN-NL-DEFAULT-TIME*", TWENTY_INTEGER);
        $nl_query_denots_of_string_caching_state$ = deflexical("*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*", NIL);
        $first_order_collectionP_caching_state$ = deflexical("*FIRST-ORDER-COLLECTION?-CACHING-STATE*", NIL);
        $variable_order_collectionP_caching_state$ = deflexical("*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*", NIL);
        $get_simple_inference_semtrans_lexicon$ = defparameter("*GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_open_cyc_simple_inference_api_file() {
        access_macros.register_external_symbol($sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID);
        access_macros.register_external_symbol($sym4$SIMPLE_BOOLEAN_QUERY_CYCL);
        access_macros.register_external_symbol($sym18$SIMPLE_BOOLEAN_QUERY_NL);
        memoization_state.note_globally_cached_function($sym21$NL_QUERY_DENOTS_OF_STRING);
        memoization_state.note_globally_cached_function($sym41$FIRST_ORDER_COLLECTION_);
        memoization_state.note_globally_cached_function($sym44$VARIABLE_ORDER_COLLECTION_);
        generic_testing.define_test_case_table_int($sym73$SIMPLE_BOOLEAN_QUERY_TEST, list(new SubLObject[] { $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list80);
        generic_testing.define_test_case_table_int($sym18$SIMPLE_BOOLEAN_QUERY_NL, list(new SubLObject[] { $TEST, $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list82);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_open_cyc_simple_inference_api_file();
    }

    @Override
    public void initializeVariables() {
        init_open_cyc_simple_inference_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_open_cyc_simple_inference_api_file();
    }

    static {
        me = new open_cyc_simple_inference_api();
        $simple_query_default_mt$ = null;
        $simple_query_default_nl_mt$ = null;
        $simple_boolean_default_time$ = null;
        $simple_boolean_nl_default_time$ = null;
        $nl_query_denots_of_string_caching_state$ = null;
        $first_order_collectionP_caching_state$ = null;
        $variable_order_collectionP_caching_state$ = null;
        $get_simple_inference_semtrans_lexicon$ = null;
        $list0 = list(makeConstSym(("MtSpace")), list(makeConstSym(("MtTimeDimFn")), makeConstSym(("Now"))), list(makeConstSym(("MtUnionFn")), makeConstSym(("AssistedReaderSourceSpindleCollectorMt")), makeConstSym(("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))));
        $$RelationParaphraseMt = makeConstSym(("RelationParaphraseMt"));
        $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID = makeSymbol("SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID");
        $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $sym4$SIMPLE_BOOLEAN_QUERY_CYCL = makeSymbol("SIMPLE-BOOLEAN-QUERY-CYCL");
        $ERROR = makeKeyword("ERROR");
        $str6$The_sentence_contains_an_open_var = makeString("The sentence contains an open variable.");
        $str7$The_sentence_ = makeString("The sentence ");
        $str8$_is_not_a_valid_CycL_sentence_ = makeString(" is not a valid CycL sentence.");
        $FALSE = makeKeyword("FALSE");
        $str10$_is_not_semantically_well_formed = makeString(" is not semantically well-formed");
        $MAX_TIME = makeKeyword("MAX-TIME");
        $PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
        $list13 = list(makeKeyword("BROWSABLE?"), T);
        $str14$Timed_out = makeString("Timed out");
        $TRUE = makeKeyword("TRUE");
        $$not = makeConstSym(("not"));
        $UNKNOWN = makeKeyword("UNKNOWN");
        $sym18$SIMPLE_BOOLEAN_QUERY_NL = makeSymbol("SIMPLE-BOOLEAN-QUERY-NL");
        $$is_Underspecified = makeConstSym(("is-Underspecified"));
        $sym20$PREDICATE_P = makeSymbol("PREDICATE-P");
        $sym21$NL_QUERY_DENOTS_OF_STRING = makeSymbol("NL-QUERY-DENOTS-OF-STRING");
        $list22 = list(makeSymbol("RESULT"), makeSymbol("ERROR-MSG"));
        $WFF = makeKeyword("WFF");
        $str24$Timed_out_before_completion = makeString("Timed out before completion");
        $sym25$SECOND = makeSymbol("SECOND");
        $$Thing = makeConstSym(("Thing"));
        $$CurrentWorldDataCollectorMt_NonHo = makeConstSym(("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym28$BAD_FOR_TAGGING_ = makeSymbol("BAD-FOR-TAGGING?");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym30$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str31$_cyc_projects_doc_annotation_comp = makeString("/cyc/projects/doc-annotation/compounds.txt");
        $APPEND = makeKeyword("APPEND");
        $str33$Unable_to_open__S = makeString("Unable to open ~S");
        $str34$_S_A_S_A_S__ = makeString("~S~A~S~A~S~%");
        $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_ = makeSymbol("*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*");
        $int$128000 = makeInteger(128000);
        $$relationExistsInstance = makeConstSym(("relationExistsInstance"));
        $$relationInstanceExists = makeConstSym(("relationInstanceExists"));
        $$relationExistsExists = makeConstSym(("relationExistsExists"));
        $VARIABLE = makeKeyword("VARIABLE");
        $sym41$FIRST_ORDER_COLLECTION_ = makeSymbol("FIRST-ORDER-COLLECTION?");
        $$FirstOrderCollection = makeConstSym(("FirstOrderCollection"));
        $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_ = makeSymbol("*FIRST-ORDER-COLLECTION?-CACHING-STATE*");
        $sym44$VARIABLE_ORDER_COLLECTION_ = makeSymbol("VARIABLE-ORDER-COLLECTION?");
        $$VariedOrderCollection = makeConstSym(("VariedOrderCollection"));
        $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_ = makeSymbol("*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*");
        $sym47$GET = makeSymbol("GET");
        $SEMTRANS = makeKeyword("SEMTRANS");
        $CYC_POS = makeKeyword("CYC-POS");
        $FRAME = makeKeyword("FRAME");
        $$Verb = makeConstSym(("Verb"));
        $$TransitiveNPFrame = makeConstSym(("TransitiveNPFrame"));
        $ACTION = makeKeyword("ACTION");
        $$thereExists = makeConstSym(("thereExists"));
        $sym55$_EVENT = makeSymbol("?EVENT");
        $sym56$KEYWORDP = makeSymbol("KEYWORDP");
        $SUBJECT = makeKeyword("SUBJECT");
        $OBJECT = makeKeyword("OBJECT");
        $sym59$_SUBJ = makeSymbol("?SUBJ");
        $$and = makeConstSym(("and"));
        $list61 = list(makeConstSym(("isa")), makeSymbol("?SUBJ"), makeKeyword("SUBJECT"));
        $sym62$_FIRST_ORDER_SUBJ = makeSymbol("?FIRST-ORDER-SUBJ");
        $list63 = list(makeConstSym(("isa")), makeSymbol("?FIRST-ORDER-SUBJ"), makeKeyword("SUBJECT"));
        $list64 = list(makeConstSym(("isa")), makeSymbol("?SUBJ"), makeSymbol("?FIRST-ORDER-SUBJ"));
        $sym65$_OBJ = makeSymbol("?OBJ");
        $list66 = list(makeConstSym(("isa")), makeSymbol("?OBJ"), makeKeyword("OBJECT"));
        $$genls = makeConstSym(("genls"));
        $$isa = makeConstSym(("isa"));
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $str70$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");
        $sym71$IGNORE_CACHE = makeSymbol("IGNORE-CACHE");
        $sym72$COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $sym73$SIMPLE_BOOLEAN_QUERY_TEST = makeSymbol("SIMPLE-BOOLEAN-QUERY-TEST");
        $TEST = makeKeyword("TEST");
        $OWNER = makeKeyword("OWNER");
        $CLASSES = makeKeyword("CLASSES");
        $KB = makeKeyword("KB");
        $FULL = makeKeyword("FULL");
        $WORKING_ = makeKeyword("WORKING?");
        $list80 = ConsesLow.list(new SubLObject[] { list(list(makeConstSym(("isa")), list(makeConstSym(("EnglishMt")), makeConstSym(("Microtheory")))), list(makeKeyword("TRUE"), NIL)),
                list(list(makeConstSym(("isa")), list(makeConstSym(("EnglishMt")), makeConstSym(("Microtheory"))), makeInteger(1000)), list(makeKeyword("TRUE"), NIL)),
                list(list(makeConstSym(("isa")), list(makeConstSym(("Microtheory")), makeConstSym(("EnglishMt")))), list(makeKeyword("FALSE"), makeString("(#$isa #$Microtheory #$EnglishMt) is not semantically well-formed"))),
                list(list(makeConstSym(("likesAsFriend")), ConsesLow.list(makeConstSym(("Microtheory")), makeConstSym(("EnglishMt")))), list(makeKeyword("FALSE"), makeString("(#$likesAsFriend #$Microtheory #$EnglishMt) is not semantically well-formed"))),
                list(list(makeConstSym(("isa")), list(makeConstSym(("Microtheory")), makeSymbol("?X"))), ConsesLow.list(makeKeyword("ERROR"), makeString("The sentence contains an open variable."))),
                list(list(makeConstSym(("isa")), list(makeConstSym(("RichardNixon")), makeConstSym(("Plumber")))), list(makeKeyword("FALSE"), NIL)), list(list(makeConstSym(("isa")), list(makeConstSym(("BradPitt")), makeConstSym(("Plumber")))), list(makeKeyword("UNKNOWN"), NIL)),
                list(list(makeConstSym(("isa")), list(makeConstSym(("BarackObama")), makeConstSym(("UnitedStatesPresident")))), list(makeKeyword("TRUE"), NIL)),
                list(list(makeConstSym(("isa")), list(makeConstSym(("RichardNixon")), makeConstSym(("UnitedStatesPresident"))), ONE_INTEGER, makeConstSym(("BaseKB"))), list(makeKeyword("FALSE"), NIL)) });
        $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST = makeSymbol("SIMPLE-BOOLEAN-QUERY-NL-TEST");
        $list82 = list(list(list(makeString("is"), list(makeString("Tony Brusseau"), makeString("person"))), makeKeyword("TRUE")), list(list(makeString("employs"), list(makeString("Cycorp"), makeString("computer scientist")), makeInteger(1000)), makeKeyword("TRUE")),
                list(list(makeString("is"), list(makeString("Richard Nixon"), makeString("plumber"))), makeKeyword("FALSE")), list(list(makeString("is"), list(makeString("Brad Pitt"), makeString("plumber"))), makeKeyword("WFF")),
                list(list(makeString("is"), list(makeString("Barack Obama"), makeString("US President"))), makeKeyword("TRUE")), list(list(makeString("hates"), list(makeString("Richard Nixon"), makeString("World War II")), ONE_INTEGER, makeConstSym(("BaseKB"))), makeKeyword("FALSE")),
                list(list(makeString("hates"), list(makeString("Richard Nixon"), makeString("World War II")), ONE_INTEGER, makeConstSym(("InferencePSC"))), makeKeyword("WFF")));
    }
}
/*
 *
 * Total time: 310 ms
 *
 */