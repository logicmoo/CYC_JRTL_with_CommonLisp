package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.document;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.api_widgets;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class open_cyc_simple_inference_api extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api";
    public static final String myFingerPrint = "146335e13ec352d6dde2420b329a049e5d8e0c91bbff5e1ae6c9ffa2deef250f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 980L)
    private static SubLSymbol $simple_query_default_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1170L)
    private static SubLSymbol $simple_query_default_nl_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1245L)
    private static SubLSymbol $simple_boolean_default_time$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1301L)
    private static SubLSymbol $simple_boolean_nl_default_time$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    private static SubLSymbol $nl_query_denots_of_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    private static SubLSymbol $first_order_collectionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    private static SubLSymbol $variable_order_collectionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    private static SubLSymbol $get_simple_inference_semtrans_lexicon$;
    private static final SubLList $list0;
    private static final SubLObject $const1$RelationParaphraseMt;
    private static final SubLSymbol $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID;
    private static final SubLSymbol $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym4$SIMPLE_BOOLEAN_QUERY_CYCL;
    private static final SubLSymbol $kw5$ERROR;
    private static final SubLString $str6$The_sentence_contains_an_open_var;
    private static final SubLString $str7$The_sentence_;
    private static final SubLString $str8$_is_not_a_valid_CycL_sentence_;
    private static final SubLSymbol $kw9$FALSE;
    private static final SubLString $str10$_is_not_semantically_well_formed;
    private static final SubLSymbol $kw11$MAX_TIME;
    private static final SubLSymbol $kw12$PROBLEM_STORE;
    private static final SubLList $list13;
    private static final SubLString $str14$Timed_out;
    private static final SubLSymbol $kw15$TRUE;
    private static final SubLObject $const16$not;
    private static final SubLSymbol $kw17$UNKNOWN;
    private static final SubLSymbol $sym18$SIMPLE_BOOLEAN_QUERY_NL;
    private static final SubLObject $const19$is_Underspecified;
    private static final SubLSymbol $sym20$PREDICATE_P;
    private static final SubLSymbol $sym21$NL_QUERY_DENOTS_OF_STRING;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$WFF;
    private static final SubLString $str24$Timed_out_before_completion;
    private static final SubLSymbol $sym25$SECOND;
    private static final SubLObject $const26$Thing;
    private static final SubLObject $const27$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym28$BAD_FOR_TAGGING_;
    private static final SubLSymbol $kw29$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym30$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str31$_cyc_projects_doc_annotation_comp;
    private static final SubLSymbol $kw32$APPEND;
    private static final SubLString $str33$Unable_to_open__S;
    private static final SubLString $str34$_S_A_S_A_S__;
    private static final SubLSymbol $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_;
    private static final SubLInteger $int36$128000;
    private static final SubLObject $const37$relationExistsInstance;
    private static final SubLObject $const38$relationInstanceExists;
    private static final SubLObject $const39$relationExistsExists;
    private static final SubLSymbol $kw40$VARIABLE;
    private static final SubLSymbol $sym41$FIRST_ORDER_COLLECTION_;
    private static final SubLObject $const42$FirstOrderCollection;
    private static final SubLSymbol $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_;
    private static final SubLSymbol $sym44$VARIABLE_ORDER_COLLECTION_;
    private static final SubLObject $const45$VariedOrderCollection;
    private static final SubLSymbol $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_;
    private static final SubLSymbol $sym47$GET;
    private static final SubLSymbol $kw48$SEMTRANS;
    private static final SubLSymbol $kw49$CYC_POS;
    private static final SubLSymbol $kw50$FRAME;
    private static final SubLObject $const51$Verb;
    private static final SubLObject $const52$TransitiveNPFrame;
    private static final SubLSymbol $kw53$ACTION;
    private static final SubLObject $const54$thereExists;
    private static final SubLSymbol $sym55$_EVENT;
    private static final SubLSymbol $sym56$KEYWORDP;
    private static final SubLSymbol $kw57$SUBJECT;
    private static final SubLSymbol $kw58$OBJECT;
    private static final SubLSymbol $sym59$_SUBJ;
    private static final SubLObject $const60$and;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$_FIRST_ORDER_SUBJ;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$_OBJ;
    private static final SubLList $list66;
    private static final SubLObject $const67$genls;
    private static final SubLObject $const68$isa;
    private static final SubLSymbol $kw69$UNINITIALIZED;
    private static final SubLString $str70$Unable_to_initialize__A__;
    private static final SubLSymbol $sym71$IGNORE_CACHE;
    private static final SubLSymbol $sym72$COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym73$SIMPLE_BOOLEAN_QUERY_TEST;
    private static final SubLSymbol $kw74$TEST;
    private static final SubLSymbol $kw75$OWNER;
    private static final SubLSymbol $kw76$CLASSES;
    private static final SubLSymbol $kw77$KB;
    private static final SubLSymbol $kw78$FULL;
    private static final SubLSymbol $kw79$WORKING_;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST;
    private static final SubLList $list82;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1360L)
    public static SubLObject get_simple_query_default_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return open_cyc_simple_inference_api.$simple_query_default_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1442L)
    public static SubLObject get_simple_query_default_nl_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return open_cyc_simple_inference_api.$simple_query_default_nl_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 1530L)
    public static SubLObject simple_boolean_query_external_id(final SubLObject pred_id, final SubLObject arg_ids, SubLObject max_time_sec, SubLObject mt_id) {
        if (max_time_sec == open_cyc_simple_inference_api.UNPROVIDED) {
            max_time_sec = (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER;
        }
        if (mt_id == open_cyc_simple_inference_api.UNPROVIDED) {
            mt_id = (SubLObject)open_cyc_simple_inference_api.NIL;
        }
        final SubLObject pred = kb_utilities.find_object_by_compact_hl_external_id_string(pred_id);
        final SubLObject args = Mapping.mapcar((SubLObject)open_cyc_simple_inference_api.$sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, arg_ids);
        final SubLObject mt = (open_cyc_simple_inference_api.NIL != mt_id) ? kb_utilities.find_object_by_compact_hl_external_id_string(mt_id) : get_simple_query_default_mt();
        return simple_boolean_query_cycl(pred, args, max_time_sec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 2555L)
    public static SubLObject simple_boolean_query_cycl(final SubLObject pred, final SubLObject args, SubLObject max_time_sec, SubLObject mt) {
        if (max_time_sec == open_cyc_simple_inference_api.UNPROVIDED) {
            max_time_sec = open_cyc_simple_inference_api.$simple_boolean_default_time$.getDynamicValue();
        }
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)open_cyc_simple_inference_api.NIL;
        SubLObject result2 = (SubLObject)open_cyc_simple_inference_api.NIL;
        final SubLObject sentence = (SubLObject)ConsesLow.cons(pred, args);
        if (open_cyc_simple_inference_api.NIL == el_utilities.closedP(sentence, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) {
            result = (SubLObject)open_cyc_simple_inference_api.$kw5$ERROR;
            result2 = (SubLObject)open_cyc_simple_inference_api.$str6$The_sentence_contains_an_open_var;
        }
        if (open_cyc_simple_inference_api.NIL == collection_defns.cycl_sentenceP(sentence)) {
            result = (SubLObject)open_cyc_simple_inference_api.$kw5$ERROR;
            result2 = Sequences.cconcatenate((SubLObject)open_cyc_simple_inference_api.$str7$The_sentence_, new SubLObject[] { format_nil.format_nil_s_no_copy(sentence), open_cyc_simple_inference_api.$str8$_is_not_a_valid_CycL_sentence_ });
        }
        if (open_cyc_simple_inference_api.NIL == result && open_cyc_simple_inference_api.NIL == wff.el_wffP(verbosifier.el_expansion(sentence, mt), mt, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) {
            result = (SubLObject)open_cyc_simple_inference_api.$kw9$FALSE;
            result2 = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(sentence), (SubLObject)open_cyc_simple_inference_api.$str10$_is_not_semantically_well_formed);
        }
        if (open_cyc_simple_inference_api.NIL == result) {
            final SubLObject problem_store = inference_datastructures_problem_store.new_problem_store((SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
            final SubLObject positive_query_max_time = Numbers.divide(max_time_sec, (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER);
            final SubLObject inference_props = (SubLObject)ConsesLow.listS((SubLObject)open_cyc_simple_inference_api.$kw11$MAX_TIME, positive_query_max_time, (SubLObject)open_cyc_simple_inference_api.$kw12$PROBLEM_STORE, problem_store, (SubLObject)open_cyc_simple_inference_api.$list13);
            thread.resetMultipleValues();
            SubLObject temp_result = inference_kernel.new_cyc_query(sentence, mt, inference_props);
            final SubLObject halt_reason = thread.secondMultipleValue();
            final SubLObject inference = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (halt_reason == open_cyc_simple_inference_api.$kw11$MAX_TIME) {
                result = (SubLObject)open_cyc_simple_inference_api.$kw5$ERROR;
                result2 = Sequences.copy_seq((SubLObject)open_cyc_simple_inference_api.$str14$Timed_out);
            }
            if (open_cyc_simple_inference_api.NIL != cyc_kernel.closed_query_success_token_p(temp_result)) {
                result = (SubLObject)open_cyc_simple_inference_api.$kw15$TRUE;
            }
            if (open_cyc_simple_inference_api.NIL == result) {
                final SubLObject negative_query_max_time = Numbers.subtract(max_time_sec, inference_datastructures_inference.inference_cumulative_time_so_far(inference, (SubLObject)open_cyc_simple_inference_api.NIL));
                final SubLObject negative_query = (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const16$not, sentence);
                final SubLObject inference_props_$1 = (SubLObject)ConsesLow.list((SubLObject)open_cyc_simple_inference_api.$kw11$MAX_TIME, negative_query_max_time, (SubLObject)open_cyc_simple_inference_api.$kw12$PROBLEM_STORE, problem_store);
                inference_datastructures_inference.destroy_inference(inference);
                temp_result = inference_kernel.new_cyc_query(negative_query, mt, inference_props_$1);
                if (open_cyc_simple_inference_api.NIL != cyc_kernel.closed_query_success_token_p(temp_result)) {
                    result = (SubLObject)open_cyc_simple_inference_api.$kw9$FALSE;
                }
            }
            inference_datastructures_problem_store.destroy_problem_store(problem_store);
        }
        if (open_cyc_simple_inference_api.NIL == result) {
            result = (SubLObject)open_cyc_simple_inference_api.$kw17$UNKNOWN;
        }
        return (SubLObject)ConsesLow.list(result, result2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject simple_boolean_query_nl(final SubLObject pred_string, final SubLObject arg_strings, SubLObject max_time_sec, SubLObject mt, SubLObject language_mt) {
        if (max_time_sec == open_cyc_simple_inference_api.UNPROVIDED) {
            max_time_sec = open_cyc_simple_inference_api.$simple_boolean_nl_default_time$.getDynamicValue();
        }
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        if (language_mt == open_cyc_simple_inference_api.UNPROVIDED) {
            language_mt = get_simple_query_default_nl_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)open_cyc_simple_inference_api.NIL;
        SubLObject timed_out = (SubLObject)open_cyc_simple_inference_api.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(language_mt, thread);
            parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER, thread);
            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(max_time_sec), thread);
            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
            if (open_cyc_simple_inference_api.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                final SubLObject pred_interps = Sequences.remove(open_cyc_simple_inference_api.$const19$is_Underspecified, list_utilities.remove_if_not((SubLObject)open_cyc_simple_inference_api.$sym20$PREDICATE_P, lexicon_accessors.denots_of_string(pred_string, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                final SubLObject args_interps = Mapping.mapcar((SubLObject)open_cyc_simple_inference_api.$sym21$NL_QUERY_DENOTS_OF_STRING, arg_strings);
                final SubLObject all_raw_semtrans_sentences = get_semtrans_sentences(pred_string, args_interps);
                final SubLObject all_raw_pred_sentences = list_utilities.cartesian_product((SubLObject)ConsesLow.cons(pred_interps, args_interps), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                final SubLObject all_pred_sentences = add_quantifiers_if_needed(all_raw_pred_sentences, mt);
                final SubLObject all_sentences = Sequences.cconcatenate(all_raw_semtrans_sentences, all_pred_sentences);
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)open_cyc_simple_inference_api.T, thread);
                        SubLObject timer = (SubLObject)open_cyc_simple_inference_api.NIL;
                        try {
                            final SubLObject _prev_bind_0_$3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)open_cyc_simple_inference_api.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer(max_time_sec, tag);
                                SubLObject cdolist_list_var = all_sentences;
                                SubLObject query_sentence = (SubLObject)open_cyc_simple_inference_api.NIL;
                                query_sentence = cdolist_list_var.first();
                                while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                                    SubLObject current;
                                    final SubLObject datum = current = simple_boolean_query_cycl(query_sentence.first(), query_sentence.rest(), max_time_sec, mt);
                                    SubLObject result = (SubLObject)open_cyc_simple_inference_api.NIL;
                                    SubLObject error_msg = (SubLObject)open_cyc_simple_inference_api.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)open_cyc_simple_inference_api.$list22);
                                    result = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)open_cyc_simple_inference_api.$list22);
                                    error_msg = current.first();
                                    current = current.rest();
                                    if (open_cyc_simple_inference_api.NIL == current) {
                                        final SubLObject pcase_var = result;
                                        if (pcase_var.eql((SubLObject)open_cyc_simple_inference_api.$kw5$ERROR)) {
                                            result = (SubLObject)open_cyc_simple_inference_api.$kw17$UNKNOWN;
                                        }
                                        else if (pcase_var.eql((SubLObject)open_cyc_simple_inference_api.$kw17$UNKNOWN)) {
                                            result = (SubLObject)open_cyc_simple_inference_api.$kw23$WFF;
                                        }
                                        results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_sentence, result, error_msg), results);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)open_cyc_simple_inference_api.$list22);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    query_sentence = cdolist_list_var.first();
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)open_cyc_simple_inference_api.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            timed_out = parsing_macros.parsing_timeout_time_reachedP();
        }
        finally {
            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_4, thread);
            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_3, thread);
            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_2, thread);
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        if (open_cyc_simple_inference_api.NIL != timed_out) {
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)open_cyc_simple_inference_api.NIL, (SubLObject)open_cyc_simple_inference_api.$kw17$UNKNOWN, (SubLObject)open_cyc_simple_inference_api.$str24$Timed_out_before_completion), results);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject clear_nl_query_denots_of_string() {
        final SubLObject cs = open_cyc_simple_inference_api.$nl_query_denots_of_string_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject remove_nl_query_denots_of_string(final SubLObject string, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = (SubLObject)open_cyc_simple_inference_api.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(open_cyc_simple_inference_api.$nl_query_denots_of_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string, mt), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject nl_query_denots_of_string_internal(final SubLObject string, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject determiner_free = lexicon_utilities.strip_determiner(string, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        final SubLObject possible_denots = Mapping.mapcar((SubLObject)open_cyc_simple_inference_api.$sym25$SECOND, api_widgets.get_constrained_cycl_for_string(determiner_free, open_cyc_simple_inference_api.$const26$Thing, open_cyc_simple_inference_api.$const27$CurrentWorldDataCollectorMt_NonHo, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED));
        final SubLObject usable_denots = Sequences.remove_if((SubLObject)open_cyc_simple_inference_api.$sym28$BAD_FOR_TAGGING_, possible_denots, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        SubLObject ignore_errors_tag = (SubLObject)open_cyc_simple_inference_api.NIL;
        try {
            thread.throwStack.push(open_cyc_simple_inference_api.$kw29$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)open_cyc_simple_inference_api.$sym30$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject compound_file = (SubLObject)open_cyc_simple_inference_api.$str31$_cyc_projects_doc_annotation_comp;
                    final SubLObject non_lexical = conses_high.set_difference(usable_denots, concept_tagger.all_tagged_concepts(document.new_document(string, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = print_high.$print_pretty$.currentBinding(thread);
                    try {
                        print_high.$print_pretty$.bind((SubLObject)open_cyc_simple_inference_api.NIL, thread);
                        if (open_cyc_simple_inference_api.NIL != non_lexical) {
                            SubLObject stream = (SubLObject)open_cyc_simple_inference_api.NIL;
                            try {
                                final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind((SubLObject)open_cyc_simple_inference_api.NIL, thread);
                                    stream = compatibility.open_text(compound_file, (SubLObject)open_cyc_simple_inference_api.$kw32$APPEND);
                                }
                                finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$6, thread);
                                }
                                if (!stream.isStream()) {
                                    Errors.error((SubLObject)open_cyc_simple_inference_api.$str33$Unable_to_open__S, compound_file);
                                }
                                final SubLObject s = stream;
                                PrintLow.format(s, (SubLObject)open_cyc_simple_inference_api.$str34$_S_A_S_A_S__, new SubLObject[] { string, Characters.CHAR_tab, non_lexical, Characters.CHAR_tab, kb_utilities.compact_hl_external_id_string(non_lexical) });
                            }
                            finally {
                                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)open_cyc_simple_inference_api.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (stream.isStream()) {
                                        streams_high.close(stream, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                        }
                    }
                    finally {
                        print_high.$print_pretty$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)open_cyc_simple_inference_api.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)open_cyc_simple_inference_api.$kw29$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return usable_denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject nl_query_denots_of_string(final SubLObject string, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = (SubLObject)open_cyc_simple_inference_api.NIL;
        }
        SubLObject caching_state = open_cyc_simple_inference_api.$nl_query_denots_of_string_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)open_cyc_simple_inference_api.$sym21$NL_QUERY_DENOTS_OF_STRING, (SubLObject)open_cyc_simple_inference_api.$sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_, (SubLObject)open_cyc_simple_inference_api.$int36$128000, (SubLObject)open_cyc_simple_inference_api.EQUALP, (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER, (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)open_cyc_simple_inference_api.NIL;
            collision = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (open_cyc_simple_inference_api.NIL != cached_args && open_cyc_simple_inference_api.NIL == cached_args.rest() && mt.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(nl_query_denots_of_string_internal(string, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject add_quantifiers_if_needed(final SubLObject sentences, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_sentences = (SubLObject)open_cyc_simple_inference_api.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)open_cyc_simple_inference_api.NIL;
            sentence = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                final SubLObject pred = cycl_utilities.formula_arg0(sentence);
                if (open_cyc_simple_inference_api.NIL != kb_accessors.binary_predicateP(pred)) {
                    final SubLObject arg1_predicted_order = pred_arg_expected_order(pred, (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER);
                    final SubLObject arg2_predicted_order = pred_arg_expected_order(pred, (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER);
                    final SubLObject arg1_order = term_order_integer(cycl_utilities.formula_arg1(sentence, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED));
                    final SubLObject arg2_order = term_order_integer(cycl_utilities.formula_arg2(sentence, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED));
                    if (arg1_predicted_order.eql(arg1_order) && arg2_predicted_order.eql(arg2_order)) {
                        all_sentences = (SubLObject)ConsesLow.cons(sentence, all_sentences);
                    }
                    else if (arg1_predicted_order.numL(arg1_order) && arg2_predicted_order.eql(arg2_order)) {
                        all_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(open_cyc_simple_inference_api.$const37$relationExistsInstance, sentence), all_sentences);
                    }
                    else if (arg2_predicted_order.numL(arg2_order) && arg1_predicted_order.eql(arg1_order)) {
                        all_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(open_cyc_simple_inference_api.$const38$relationInstanceExists, sentence), all_sentences);
                    }
                    else if (arg2_predicted_order.numL(arg2_order) && arg2_predicted_order.numL(arg2_order)) {
                        all_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(open_cyc_simple_inference_api.$const39$relationExistsExists, sentence), all_sentences);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return all_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject term_order_integer(final SubLObject v_term) {
        final SubLObject canon_term = czer_main.canonicalize_term(v_term, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        if (open_cyc_simple_inference_api.NIL != kb_accessors.individualP(canon_term)) {
            return (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER;
        }
        if (open_cyc_simple_inference_api.NIL != first_order_collectionP(canon_term, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) {
            return (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER;
        }
        if (open_cyc_simple_inference_api.NIL != builder_utilities.higher_order_collectionP(canon_term)) {
            return (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER;
        }
        if (open_cyc_simple_inference_api.NIL != variable_order_collectionP(canon_term, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) {
            return (SubLObject)open_cyc_simple_inference_api.$kw40$VARIABLE;
        }
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject clear_first_order_collectionP() {
        final SubLObject cs = open_cyc_simple_inference_api.$first_order_collectionP_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject remove_first_order_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(open_cyc_simple_inference_api.$first_order_collectionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject first_order_collectionP_internal(final SubLObject v_term, final SubLObject mt) {
        return isa.isaP(v_term, open_cyc_simple_inference_api.$const42$FirstOrderCollection, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject first_order_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = open_cyc_simple_inference_api.$first_order_collectionP_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)open_cyc_simple_inference_api.$sym41$FIRST_ORDER_COLLECTION_, (SubLObject)open_cyc_simple_inference_api.$sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_, (SubLObject)open_cyc_simple_inference_api.NIL, (SubLObject)open_cyc_simple_inference_api.EQUAL, (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER, (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)open_cyc_simple_inference_api.NIL;
            collision = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (open_cyc_simple_inference_api.NIL != cached_args && open_cyc_simple_inference_api.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(first_order_collectionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject clear_variable_order_collectionP() {
        final SubLObject cs = open_cyc_simple_inference_api.$variable_order_collectionP_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject remove_variable_order_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(open_cyc_simple_inference_api.$variable_order_collectionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject variable_order_collectionP_internal(final SubLObject v_term, final SubLObject mt) {
        return isa.isaP(v_term, open_cyc_simple_inference_api.$const45$VariedOrderCollection, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject variable_order_collectionP(final SubLObject v_term, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = open_cyc_simple_inference_api.$variable_order_collectionP_caching_state$.getGlobalValue();
        if (open_cyc_simple_inference_api.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)open_cyc_simple_inference_api.$sym44$VARIABLE_ORDER_COLLECTION_, (SubLObject)open_cyc_simple_inference_api.$sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_, (SubLObject)open_cyc_simple_inference_api.NIL, (SubLObject)open_cyc_simple_inference_api.EQUAL, (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER, (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)open_cyc_simple_inference_api.NIL;
            collision = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (open_cyc_simple_inference_api.NIL != cached_args && open_cyc_simple_inference_api.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(variable_order_collectionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject pred_arg_expected_order(final SubLObject pred, final SubLObject argnum) {
        SubLObject cdolist_list_var = kb_accessors.argn_isa(pred, argnum, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        SubLObject arg_isa_constraint = (SubLObject)open_cyc_simple_inference_api.NIL;
        arg_isa_constraint = cdolist_list_var.first();
        while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
            if (open_cyc_simple_inference_api.NIL != builder_utilities.higher_order_collectionP(arg_isa_constraint)) {
                return (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER;
            }
            if (open_cyc_simple_inference_api.NIL != fort_types_interface.collectionP(arg_isa_constraint)) {
                return (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa_constraint = cdolist_list_var.first();
        }
        cdolist_list_var = kb_accessors.argn_genl(pred, argnum, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        SubLObject arg_genl_constraint = (SubLObject)open_cyc_simple_inference_api.NIL;
        arg_genl_constraint = cdolist_list_var.first();
        while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
            if (open_cyc_simple_inference_api.NIL != builder_utilities.higher_order_collectionP(arg_genl_constraint)) {
                return (SubLObject)open_cyc_simple_inference_api.TWO_INTEGER;
            }
            if (open_cyc_simple_inference_api.NIL != fort_types_interface.collectionP(arg_genl_constraint)) {
                return (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_genl_constraint = cdolist_list_var.first();
        }
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject get_semtrans_sentences(final SubLObject pred_string, final SubLObject arg_cycls) {
        final SubLObject lex = get_simple_inference_semtrans_lexicon();
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lex, (SubLObject)open_cyc_simple_inference_api.$sym47$GET, pred_string);
        SubLObject semtrans_sentences = (SubLObject)open_cyc_simple_inference_api.NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject entry = (SubLObject)open_cyc_simple_inference_api.NIL;
        entry = cdolist_list_var.first();
        while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
            final SubLObject semtrans = methods.funcall_instance_method_with_1_args(entry, (SubLObject)open_cyc_simple_inference_api.$sym47$GET, (SubLObject)open_cyc_simple_inference_api.$kw48$SEMTRANS);
            final SubLObject pos = methods.funcall_instance_method_with_1_args(entry, (SubLObject)open_cyc_simple_inference_api.$sym47$GET, (SubLObject)open_cyc_simple_inference_api.$kw49$CYC_POS);
            final SubLObject frame = methods.funcall_instance_method_with_1_args(entry, (SubLObject)open_cyc_simple_inference_api.$sym47$GET, (SubLObject)open_cyc_simple_inference_api.$kw50$FRAME);
            if (open_cyc_simple_inference_api.NIL != lexicon_accessors.genl_posP(pos, open_cyc_simple_inference_api.$const51$Verb, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED) && frame.eql(open_cyc_simple_inference_api.$const52$TransitiveNPFrame)) {
                SubLObject cdolist_list_var_$8 = arg_cycls.first();
                SubLObject arg1 = (SubLObject)open_cyc_simple_inference_api.NIL;
                arg1 = cdolist_list_var_$8.first();
                while (open_cyc_simple_inference_api.NIL != cdolist_list_var_$8) {
                    SubLObject cdolist_list_var_$9 = conses_high.second(arg_cycls);
                    SubLObject arg2 = (SubLObject)open_cyc_simple_inference_api.NIL;
                    arg2 = cdolist_list_var_$9.first();
                    while (open_cyc_simple_inference_api.NIL != cdolist_list_var_$9) {
                        SubLObject cdolist_list_var_$10 = add_quantifiers_to_semtrans_if_needed(semtrans, arg1, arg2, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                        SubLObject quantified = (SubLObject)open_cyc_simple_inference_api.NIL;
                        quantified = cdolist_list_var_$10.first();
                        while (open_cyc_simple_inference_api.NIL != cdolist_list_var_$10) {
                            final SubLObject verb_substituted = (open_cyc_simple_inference_api.NIL != cycl_utilities.expression_find((SubLObject)open_cyc_simple_inference_api.$kw53$ACTION, quantified, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) ? el_utilities.make_formula(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)ConsesLow.list((SubLObject)open_cyc_simple_inference_api.$sym55$_EVENT, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym55$_EVENT, (SubLObject)open_cyc_simple_inference_api.$kw53$ACTION, quantified, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED) : quantified;
                            if (open_cyc_simple_inference_api.NIL == cycl_utilities.expression_find_if((SubLObject)open_cyc_simple_inference_api.$sym56$KEYWORDP, verb_substituted, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED)) {
                                semtrans_sentences = (SubLObject)ConsesLow.cons(verb_substituted, semtrans_sentences);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject add_quantifiers_to_semtrans_if_needed(final SubLObject semtrans_template, final SubLObject subj, final SubLObject obj, SubLObject mt) {
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject quantified = (SubLObject)open_cyc_simple_inference_api.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject constraints = at_var_types.inter_formula_variables_arg_constraints(semtrans_template, mt, (SubLObject)open_cyc_simple_inference_api.$sym56$KEYWORDP);
            final SubLObject subj_predicted_order = arg_expected_order_from_constraints(constraints, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT);
            final SubLObject obj_predicted_order = arg_expected_order_from_constraints(constraints, (SubLObject)open_cyc_simple_inference_api.$kw58$OBJECT);
            final SubLObject subj_order = term_order_integer(subj);
            final SubLObject obj_order = term_order_integer(obj);
            if (open_cyc_simple_inference_api.NIL == subj_order) {
                quantified = (SubLObject)ConsesLow.cons(semtrans_template, quantified);
            }
            else if (subj_predicted_order == open_cyc_simple_inference_api.$kw40$VARIABLE) {
                quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list61, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT, semtrans_template, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))), quantified);
                quantified = (SubLObject)ConsesLow.cons(semtrans_template, quantified);
            }
            else if (number_utilities.f_1X(subj_predicted_order).numE(subj_order)) {
                quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list61, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT, semtrans_template, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))), quantified);
            }
            else if (Numbers.add((SubLObject)open_cyc_simple_inference_api.TWO_INTEGER, subj_predicted_order).numE(subj_order)) {
                quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list61, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT, semtrans_template, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))), quantified);
                quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym62$_FIRST_ORDER_SUBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list63, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list64, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym59$_SUBJ, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT, semtrans_template, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))))), quantified);
            }
            else {
                quantified = (SubLObject)ConsesLow.cons(semtrans_template, quantified);
            }
            SubLObject obj_quantified = (SubLObject)open_cyc_simple_inference_api.NIL;
            SubLObject cdolist_list_var = quantified;
            SubLObject curr_quantified = (SubLObject)open_cyc_simple_inference_api.NIL;
            curr_quantified = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                if (open_cyc_simple_inference_api.NIL == obj_order) {
                    obj_quantified = (SubLObject)ConsesLow.cons(curr_quantified, obj_quantified);
                }
                else if (obj_predicted_order == open_cyc_simple_inference_api.$kw40$VARIABLE) {
                    obj_quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym65$_OBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list66, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym65$_OBJ, (SubLObject)open_cyc_simple_inference_api.$kw58$OBJECT, curr_quantified, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))), obj_quantified);
                    obj_quantified = (SubLObject)ConsesLow.cons(curr_quantified, obj_quantified);
                }
                else if (obj_predicted_order.numL(obj_order)) {
                    obj_quantified = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const54$thereExists, (SubLObject)open_cyc_simple_inference_api.$sym65$_OBJ, (SubLObject)ConsesLow.list(open_cyc_simple_inference_api.$const60$and, (SubLObject)open_cyc_simple_inference_api.$list66, cycl_utilities.expression_subst((SubLObject)open_cyc_simple_inference_api.$sym65$_OBJ, (SubLObject)open_cyc_simple_inference_api.$kw58$OBJECT, curr_quantified, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED))), obj_quantified);
                }
                else {
                    obj_quantified = (SubLObject)ConsesLow.cons(curr_quantified, obj_quantified);
                }
                cdolist_list_var = cdolist_list_var.rest();
                curr_quantified = cdolist_list_var.first();
            }
            quantified = obj_quantified;
            SubLObject substituted = (SubLObject)open_cyc_simple_inference_api.NIL;
            cdolist_list_var = quantified;
            SubLObject sent = (SubLObject)open_cyc_simple_inference_api.NIL;
            sent = cdolist_list_var.first();
            while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
                sent = cycl_utilities.expression_subst(subj, (SubLObject)open_cyc_simple_inference_api.$kw57$SUBJECT, sent, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
                substituted = (SubLObject)ConsesLow.cons(cycl_utilities.expression_subst(obj, (SubLObject)open_cyc_simple_inference_api.$kw58$OBJECT, sent, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), substituted);
                cdolist_list_var = cdolist_list_var.rest();
                sent = cdolist_list_var.first();
            }
            quantified = substituted;
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return quantified;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject arg_expected_order_from_constraints(final SubLObject constraints, final SubLObject v_term) {
        SubLObject cdolist_list_var;
        final SubLObject term_arg_poses = cdolist_list_var = cycl_utilities.arg_positions_bfs(v_term, constraints, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
        SubLObject term_arg_pos = (SubLObject)open_cyc_simple_inference_api.NIL;
        term_arg_pos = cdolist_list_var.first();
        while (open_cyc_simple_inference_api.NIL != cdolist_list_var) {
            final SubLObject constraint = cycl_utilities.formula_arg_position(constraints, conses_high.butlast(term_arg_pos, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED), (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
            final SubLObject constraint_order = term_order_integer(cycl_utilities.formula_arg2(constraint, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED));
            if (constraint_order.isKeyword()) {
                return constraint_order;
            }
            if (cycl_utilities.formula_arg0(constraint).eql(open_cyc_simple_inference_api.$const67$genls)) {
                return constraint_order;
            }
            if (cycl_utilities.formula_arg0(constraint).eql(open_cyc_simple_inference_api.$const68$isa)) {
                return constraint_order.isNumber() ? Numbers.subtract(constraint_order, (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER) : constraint_order;
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_arg_pos = cdolist_list_var.first();
        }
        return (SubLObject)open_cyc_simple_inference_api.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject get_simple_inference_semtrans_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$.getDynamicValue(thread) == open_cyc_simple_inference_api.$kw69$UNINITIALIZED) {
            final SubLObject init_value = make_simple_inference_semtrans_lexicon();
            if (init_value == open_cyc_simple_inference_api.$kw69$UNINITIALIZED) {
                Errors.error((SubLObject)open_cyc_simple_inference_api.$str70$Unable_to_initialize__A__, open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$.getDynamicValue(thread));
            }
            open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$.setDynamicValue(init_value, thread);
        }
        return open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 4401L)
    public static SubLObject make_simple_inference_semtrans_lexicon() {
        final SubLObject lex = semtrans_lexicon.new_semtrans_lexicon();
        methods.funcall_instance_method_with_0_args(lex, (SubLObject)open_cyc_simple_inference_api.$sym71$IGNORE_CACHE);
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
    public static SubLObject simple_boolean_query_test(final SubLObject pred, final SubLObject args, SubLObject time, SubLObject mt) {
        if (time == open_cyc_simple_inference_api.UNPROVIDED) {
            time = (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER;
        }
        if (mt == open_cyc_simple_inference_api.UNPROVIDED) {
            mt = get_simple_query_default_mt();
        }
        return simple_boolean_query_external_id(kb_utilities.compact_hl_external_id_string(pred), Mapping.mapcar((SubLObject)open_cyc_simple_inference_api.$sym72$COMPACT_HL_EXTERNAL_ID_STRING, args), time, kb_utilities.compact_hl_external_id_string(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/open-cyc-simple-inference-api.lisp", position = 15400L)
    public static SubLObject simple_boolean_query_nl_test(final SubLObject expected, final SubLObject actual) {
        return cycl_utilities.expression_find(actual, expected, (SubLObject)open_cyc_simple_inference_api.EQUAL, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED, (SubLObject)open_cyc_simple_inference_api.UNPROVIDED);
    }
    
    public static SubLObject declare_open_cyc_simple_inference_api_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "get_simple_query_default_mt", "GET-SIMPLE-QUERY-DEFAULT-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "get_simple_query_default_nl_mt", "GET-SIMPLE-QUERY-DEFAULT-NL-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "simple_boolean_query_external_id", "SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "simple_boolean_query_cycl", "SIMPLE-BOOLEAN-QUERY-CYCL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "simple_boolean_query_nl", "SIMPLE-BOOLEAN-QUERY-NL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "clear_nl_query_denots_of_string", "CLEAR-NL-QUERY-DENOTS-OF-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "remove_nl_query_denots_of_string", "REMOVE-NL-QUERY-DENOTS-OF-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "nl_query_denots_of_string_internal", "NL-QUERY-DENOTS-OF-STRING-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "nl_query_denots_of_string", "NL-QUERY-DENOTS-OF-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "add_quantifiers_if_needed", "ADD-QUANTIFIERS-IF-NEEDED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "term_order_integer", "TERM-ORDER-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "clear_first_order_collectionP", "CLEAR-FIRST-ORDER-COLLECTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "remove_first_order_collectionP", "REMOVE-FIRST-ORDER-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "first_order_collectionP_internal", "FIRST-ORDER-COLLECTION?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "first_order_collectionP", "FIRST-ORDER-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "clear_variable_order_collectionP", "CLEAR-VARIABLE-ORDER-COLLECTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "remove_variable_order_collectionP", "REMOVE-VARIABLE-ORDER-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "variable_order_collectionP_internal", "VARIABLE-ORDER-COLLECTION?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "variable_order_collectionP", "VARIABLE-ORDER-COLLECTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "pred_arg_expected_order", "PRED-ARG-EXPECTED-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "get_semtrans_sentences", "GET-SEMTRANS-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "add_quantifiers_to_semtrans_if_needed", "ADD-QUANTIFIERS-TO-SEMTRANS-IF-NEEDED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "arg_expected_order_from_constraints", "ARG-EXPECTED-ORDER-FROM-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "get_simple_inference_semtrans_lexicon", "GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "make_simple_inference_semtrans_lexicon", "MAKE-SIMPLE-INFERENCE-SEMTRANS-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "simple_boolean_query_test", "SIMPLE-BOOLEAN-QUERY-TEST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.open_cyc_simple_inference_api", "simple_boolean_query_nl_test", "SIMPLE-BOOLEAN-QUERY-NL-TEST", 2, 0, false);
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    public static SubLObject init_open_cyc_simple_inference_api_file() {
        open_cyc_simple_inference_api.$simple_query_default_mt$ = SubLFiles.defparameter("*SIMPLE-QUERY-DEFAULT-MT*", (SubLObject)open_cyc_simple_inference_api.$list0);
        open_cyc_simple_inference_api.$simple_query_default_nl_mt$ = SubLFiles.defparameter("*SIMPLE-QUERY-DEFAULT-NL-MT*", open_cyc_simple_inference_api.$const1$RelationParaphraseMt);
        open_cyc_simple_inference_api.$simple_boolean_default_time$ = SubLFiles.defparameter("*SIMPLE-BOOLEAN-DEFAULT-TIME*", (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER);
        open_cyc_simple_inference_api.$simple_boolean_nl_default_time$ = SubLFiles.defparameter("*SIMPLE-BOOLEAN-NL-DEFAULT-TIME*", (SubLObject)open_cyc_simple_inference_api.TWENTY_INTEGER);
        open_cyc_simple_inference_api.$nl_query_denots_of_string_caching_state$ = SubLFiles.deflexical("*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*", (SubLObject)open_cyc_simple_inference_api.NIL);
        open_cyc_simple_inference_api.$first_order_collectionP_caching_state$ = SubLFiles.deflexical("*FIRST-ORDER-COLLECTION?-CACHING-STATE*", (SubLObject)open_cyc_simple_inference_api.NIL);
        open_cyc_simple_inference_api.$variable_order_collectionP_caching_state$ = SubLFiles.deflexical("*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*", (SubLObject)open_cyc_simple_inference_api.NIL);
        open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$ = SubLFiles.defparameter("*GET-SIMPLE-INFERENCE-SEMTRANS-LEXICON*", (SubLObject)open_cyc_simple_inference_api.$kw69$UNINITIALIZED);
        return (SubLObject)open_cyc_simple_inference_api.NIL;
    }
    
    public static SubLObject setup_open_cyc_simple_inference_api_file() {
        access_macros.register_external_symbol((SubLObject)open_cyc_simple_inference_api.$sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID);
        access_macros.register_external_symbol((SubLObject)open_cyc_simple_inference_api.$sym4$SIMPLE_BOOLEAN_QUERY_CYCL);
        access_macros.register_external_symbol((SubLObject)open_cyc_simple_inference_api.$sym18$SIMPLE_BOOLEAN_QUERY_NL);
        memoization_state.note_globally_cached_function((SubLObject)open_cyc_simple_inference_api.$sym21$NL_QUERY_DENOTS_OF_STRING);
        memoization_state.note_globally_cached_function((SubLObject)open_cyc_simple_inference_api.$sym41$FIRST_ORDER_COLLECTION_);
        memoization_state.note_globally_cached_function((SubLObject)open_cyc_simple_inference_api.$sym44$VARIABLE_ORDER_COLLECTION_);
        generic_testing.define_test_case_table_int((SubLObject)open_cyc_simple_inference_api.$sym73$SIMPLE_BOOLEAN_QUERY_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { open_cyc_simple_inference_api.$kw74$TEST, open_cyc_simple_inference_api.EQUALP, open_cyc_simple_inference_api.$kw75$OWNER, open_cyc_simple_inference_api.NIL, open_cyc_simple_inference_api.$kw76$CLASSES, open_cyc_simple_inference_api.NIL, open_cyc_simple_inference_api.$kw77$KB, open_cyc_simple_inference_api.$kw78$FULL, open_cyc_simple_inference_api.$kw79$WORKING_, open_cyc_simple_inference_api.T }), (SubLObject)open_cyc_simple_inference_api.$list80);
        generic_testing.define_test_case_table_int((SubLObject)open_cyc_simple_inference_api.$sym18$SIMPLE_BOOLEAN_QUERY_NL, (SubLObject)ConsesLow.list(new SubLObject[] { open_cyc_simple_inference_api.$kw74$TEST, open_cyc_simple_inference_api.$sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST, open_cyc_simple_inference_api.$kw75$OWNER, open_cyc_simple_inference_api.NIL, open_cyc_simple_inference_api.$kw76$CLASSES, open_cyc_simple_inference_api.NIL, open_cyc_simple_inference_api.$kw77$KB, open_cyc_simple_inference_api.$kw78$FULL, open_cyc_simple_inference_api.$kw79$WORKING_, open_cyc_simple_inference_api.NIL }), (SubLObject)open_cyc_simple_inference_api.$list82);
        return (SubLObject)open_cyc_simple_inference_api.NIL;
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
        me = (SubLFile)new open_cyc_simple_inference_api();
        open_cyc_simple_inference_api.$simple_query_default_mt$ = null;
        open_cyc_simple_inference_api.$simple_query_default_nl_mt$ = null;
        open_cyc_simple_inference_api.$simple_boolean_default_time$ = null;
        open_cyc_simple_inference_api.$simple_boolean_nl_default_time$ = null;
        open_cyc_simple_inference_api.$nl_query_denots_of_string_caching_state$ = null;
        open_cyc_simple_inference_api.$first_order_collectionP_caching_state$ = null;
        open_cyc_simple_inference_api.$variable_order_collectionP_caching_state$ = null;
        open_cyc_simple_inference_api.$get_simple_inference_semtrans_lexicon$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssistedReaderSourceSpindleCollectorMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))));
        $const1$RelationParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt"));
        $sym2$SIMPLE_BOOLEAN_QUERY_EXTERNAL_ID = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-EXTERNAL-ID");
        $sym3$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $sym4$SIMPLE_BOOLEAN_QUERY_CYCL = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-CYCL");
        $kw5$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str6$The_sentence_contains_an_open_var = SubLObjectFactory.makeString("The sentence contains an open variable.");
        $str7$The_sentence_ = SubLObjectFactory.makeString("The sentence ");
        $str8$_is_not_a_valid_CycL_sentence_ = SubLObjectFactory.makeString(" is not a valid CycL sentence.");
        $kw9$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str10$_is_not_semantically_well_formed = SubLObjectFactory.makeString(" is not semantically well-formed");
        $kw11$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw12$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)open_cyc_simple_inference_api.T);
        $str14$Timed_out = SubLObjectFactory.makeString("Timed out");
        $kw15$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const16$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw17$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym18$SIMPLE_BOOLEAN_QUERY_NL = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-NL");
        $const19$is_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified"));
        $sym20$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $sym21$NL_QUERY_DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("NL-QUERY-DENOTS-OF-STRING");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-MSG"));
        $kw23$WFF = SubLObjectFactory.makeKeyword("WFF");
        $str24$Timed_out_before_completion = SubLObjectFactory.makeString("Timed out before completion");
        $sym25$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $const26$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const27$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym28$BAD_FOR_TAGGING_ = SubLObjectFactory.makeSymbol("BAD-FOR-TAGGING?");
        $kw29$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym30$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str31$_cyc_projects_doc_annotation_comp = SubLObjectFactory.makeString("/cyc/projects/doc-annotation/compounds.txt");
        $kw32$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str33$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str34$_S_A_S_A_S__ = SubLObjectFactory.makeString("~S~A~S~A~S~%");
        $sym35$_NL_QUERY_DENOTS_OF_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NL-QUERY-DENOTS-OF-STRING-CACHING-STATE*");
        $int36$128000 = SubLObjectFactory.makeInteger(128000);
        $const37$relationExistsInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsInstance"));
        $const38$relationInstanceExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExists"));
        $const39$relationExistsExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsExists"));
        $kw40$VARIABLE = SubLObjectFactory.makeKeyword("VARIABLE");
        $sym41$FIRST_ORDER_COLLECTION_ = SubLObjectFactory.makeSymbol("FIRST-ORDER-COLLECTION?");
        $const42$FirstOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $sym43$_FIRST_ORDER_COLLECTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FIRST-ORDER-COLLECTION?-CACHING-STATE*");
        $sym44$VARIABLE_ORDER_COLLECTION_ = SubLObjectFactory.makeSymbol("VARIABLE-ORDER-COLLECTION?");
        $const45$VariedOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariedOrderCollection"));
        $sym46$_VARIABLE_ORDER_COLLECTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VARIABLE-ORDER-COLLECTION?-CACHING-STATE*");
        $sym47$GET = SubLObjectFactory.makeSymbol("GET");
        $kw48$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $kw49$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $kw50$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $const51$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const52$TransitiveNPFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame"));
        $kw53$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $const54$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym55$_EVENT = SubLObjectFactory.makeSymbol("?EVENT");
        $sym56$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw57$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw58$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $sym59$_SUBJ = SubLObjectFactory.makeSymbol("?SUBJ");
        $const60$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"));
        $sym62$_FIRST_ORDER_SUBJ = SubLObjectFactory.makeSymbol("?FIRST-ORDER-SUBJ");
        $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?FIRST-ORDER-SUBJ"), (SubLObject)SubLObjectFactory.makeKeyword("SUBJECT"));
        $list64 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?SUBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?FIRST-ORDER-SUBJ"));
        $sym65$_OBJ = SubLObjectFactory.makeSymbol("?OBJ");
        $list66 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"));
        $const67$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const68$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw69$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str70$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $sym71$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $sym72$COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $sym73$SIMPLE_BOOLEAN_QUERY_TEST = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-TEST");
        $kw74$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw75$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw76$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw77$KB = SubLObjectFactory.makeKeyword("KB");
        $kw78$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw79$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list80 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)open_cyc_simple_inference_api.NIL)), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"))), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)open_cyc_simple_inference_api.NIL)), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeString("(#$isa #$Microtheory #$EnglishMt) is not semantically well-formed"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)SubLObjectFactory.makeString("(#$likesAsFriend #$Microtheory #$EnglishMt) is not semantically well-formed"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ERROR"), (SubLObject)SubLObjectFactory.makeString("The sentence contains an open variable."))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RichardNixon")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plumber")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)open_cyc_simple_inference_api.NIL)), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BradPitt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plumber")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"), (SubLObject)open_cyc_simple_inference_api.NIL)), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BarackObama")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedStatesPresident")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)open_cyc_simple_inference_api.NIL)), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RichardNixon")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitedStatesPresident"))), (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FALSE"), (SubLObject)open_cyc_simple_inference_api.NIL)) });
        $sym81$SIMPLE_BOOLEAN_QUERY_NL_TEST = SubLObjectFactory.makeSymbol("SIMPLE-BOOLEAN-QUERY-NL-TEST");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Tony Brusseau"), (SubLObject)SubLObjectFactory.makeString("person"))), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("employs"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Cycorp"), (SubLObject)SubLObjectFactory.makeString("computer scientist")), (SubLObject)SubLObjectFactory.makeInteger(1000)), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Richard Nixon"), (SubLObject)SubLObjectFactory.makeString("plumber"))), (SubLObject)SubLObjectFactory.makeKeyword("FALSE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Brad Pitt"), (SubLObject)SubLObjectFactory.makeString("plumber"))), (SubLObject)SubLObjectFactory.makeKeyword("WFF")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Barack Obama"), (SubLObject)SubLObjectFactory.makeString("US President"))), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hates"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Richard Nixon"), (SubLObject)SubLObjectFactory.makeString("World War II")), (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"))), (SubLObject)SubLObjectFactory.makeKeyword("FALSE")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("hates"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Richard Nixon"), (SubLObject)SubLObjectFactory.makeString("World War II")), (SubLObject)open_cyc_simple_inference_api.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)SubLObjectFactory.makeKeyword("WFF")));
    }
}

/*

	Total time: 310 ms
	
*/