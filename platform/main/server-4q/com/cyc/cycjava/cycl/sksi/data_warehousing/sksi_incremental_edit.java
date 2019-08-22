package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$inference_debugP$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_incremental_edit extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_incremental_edit();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit";

    public static final String myFingerPrint = "3d9364cd58dd6c84fdb63aa68b3cda835d820681c96b8f1c9fba0d0f07075f7c";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("RAW-TUPLE"), makeSymbol("&OPTIONAL"), makeSymbol("CSQL-CONDITIONS"));





    private static final SubLString $str3$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str4$_sksi_translate_logical_sentence_ = makeString("(sksi-translate-logical-sentence-to-raw-tuples ~S ~S ~S ~S ~S ~S)~%");

    private static final SubLSymbol PHYSICAL_FIELD_INDEXICAL_P = makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");

    private static final SubLString $str6$Could_not_find_indexical_for_phys = makeString("Could not find indexical for physical field ");

    private static final SubLSymbol $sym7$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list8 = list(makeSymbol("DECODED-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("CSQL-CONDITIONS"));

    private static final SubLString $str9$sksi_translate_logical_sentence_t = makeString("sksi-translate-logical-sentence-to-raw-tuples -> ~S ~S~%");

    private static final SubLSymbol $sym10$EQUAL_DUPLICATES_ = makeSymbol("EQUAL-DUPLICATES?");

    private static final SubLSymbol $sym11$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");

    private static final SubLSymbol $sym12$EQUALS_ = makeSymbol("EQUALS?");





    private static final SubLSymbol FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL = makeSymbol("FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL");

    private static final SubLObject $$fieldEncoding = reader_make_constant_shell(makeString("fieldEncoding"));



    private static final SubLList $list18 = list(makeKeyword("WHAT"));











    private static final SubLObject $const24$conditionalMeaningSentenceOfSchem = reader_make_constant_shell(makeString("conditionalMeaningSentenceOfSchema"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));



    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_SCHEMA = makeSymbol("LOGICAL-FIELD-INDEXICAL-SCHEMA");





    private static final SubLList $list30 = list(makeSymbol("FIELD-ENCODING"), makeSymbol("PF-INDEXICAL"));

    private static final SubLObject $$TheCurrentKnowledgeSource = reader_make_constant_shell(makeString("TheCurrentKnowledgeSource"));

    private static final SubLString $str32$sksi_incremental_edit_reformulate = makeString("sksi-incremental-edit-reformulate-decoded-sentence could not encode ~S as ~S using encoding ~S");

    private static final SubLObject $$indexicalReferent = reader_make_constant_shell(makeString("indexicalReferent"));

    private static final SubLList $list34 = list(makeSymbol("TRANSLATION-PATTERN"), makeSymbol("&OPTIONAL"), makeSymbol("RELEVANT-CMSES"));

    private static final SubLSymbol CSQL_TABLE_EXPRESSION_P = makeSymbol("CSQL-TABLE-EXPRESSION-P");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");







    private static final SubLList $list40 = list(makeSymbol("MEANING-SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("CMS-LIST"));



    private static final SubLSymbol RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS = makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS");





    private static final SubLSymbol $sym45$FAST_INTERSECT_ = makeSymbol("FAST-INTERSECT?");

    private static final SubLSymbol MEANING_SENTENCE_LOGICAL_FIELD_INDEXICALS = makeSymbol("MEANING-SENTENCE-LOGICAL-FIELD-INDEXICALS");



    private static final SubLSymbol $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L = makeSymbol("PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA");

    private static final SubLSymbol SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN = makeSymbol("SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN");

    private static final SubLSymbol LFI_FORT_FOR_LFI = makeSymbol("LFI-FORT-FOR-LFI");

    private static final SubLObject $$fieldValue = reader_make_constant_shell(makeString("fieldValue"));

    private static final SubLList $list52 = list(makeKeyword("NO-VALUE"));

    private static final SubLSymbol MAYBE_EVALUATE_FIELD_TRANSLATION = makeSymbol("MAYBE-EVALUATE-FIELD-TRANSLATION");

    private static final SubLSymbol $sym54$NON_SKSI_EVALUATABLE_EXPRESSION_ = makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?");

    private static final SubLSymbol MAYBE_EVALUATE_EXPRESSION = makeSymbol("MAYBE-EVALUATE-EXPRESSION");



    private static final SubLSymbol SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN = makeSymbol("SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN");

    private static final SubLString $str58$_sksi_store_or_delete_raw_value__ = makeString("(sksi-store-or-delete-raw-value  ~S ~S ~S ~S ~S ~S ~S ~S)~%");

    private static final SubLString $str59$sksi_store_or_delete_raw_value_CS = makeString("sksi-store-or-delete-raw-value CSQL = ~S~%");



    private static final SubLSymbol VALID_SKSI_ERROR_HANDLING_MODE_P = makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");

    private static final SubLString $str62$sksi_store_or_delete_raw_value___ = makeString("sksi-store-or-delete-raw-value -> ~A~%");

    private static final SubLString $str63$Invalid_CSQL_expression_at__sksi_ = makeString("Invalid CSQL expression at (sksi-store-or-delete-raw-value-int ~S ~S ~S) -> NIL~%");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $$FileHashTable_File = reader_make_constant_shell(makeString("FileHashTable-File"));



    private static final SubLString $str67$_sksi_store_or_delete_raw_value_d = makeString("(sksi-store-or-delete-raw-value-db ~S ~S)~%");

    private static final SubLString $str68$sksi_store_or_delete_raw_value_db = makeString("sksi-store-or-delete-raw-value-db -> ~A~%");

    private static final SubLList $list69 = list(makeKeyword("INSERT"), makeKeyword("DELETE"));

    private static final SubLString $str70$malformed_csql_subexpression__a__ = makeString("malformed csql subexpression ~a, expected :insert or :delete");

    private static final SubLList $list71 = list(makeSymbol("OPERATOR-KEYWORD"), makeSymbol("INTO"), makeSymbol("FIELDS"), makeSymbol("FIELD-VALUES"));

    private static final SubLString $str72$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :insert or :delete");

    private static final SubLList $list73 = list(makeKeyword("TABLE"), makeString("Language_Spoken"));

    private static final SubLString $str74$unknown_cache_for_csql__a_and_acc = makeString("unknown cache for csql ~a and access path ~a");

    public static SubLObject sksi_store_ist_logical_sentence(final SubLObject ist_logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_ist_logical_sentence_to_raw_tuples(ist_logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list0);
            current = current.rest();
            if (NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, $INSERT, csql_conditions);
                if (NIL != partial_successP) {
                    successP = partial_successP;
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        } 
        return values(successP, raw_tuples, physical_fields);
    }

    public static SubLObject sksi_delete_ist_logical_sentence(final SubLObject ist_logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_ist_logical_sentence_to_raw_tuples(ist_logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list0);
            current = current.rest();
            if (NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, $DELETE, csql_conditions);
                if (NIL != partial_successP) {
                    successP = partial_successP;
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        } 
        return values(successP, raw_tuples, physical_fields);
    }

    public static SubLObject sksi_store_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list0);
            current = current.rest();
            if (NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, $INSERT, csql_conditions);
                if (NIL != partial_successP) {
                    successP = partial_successP;
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        } 
        return values(successP, raw_tuples, physical_fields);
    }

    public static SubLObject sksi_delete_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list0);
            current = current.rest();
            if (NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, $DELETE, csql_conditions);
                if (NIL != partial_successP) {
                    successP = partial_successP;
                }
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        } 
        return values(successP, raw_tuples, physical_fields);
    }

    public static SubLObject sksi_translate_ist_logical_sentence_to_raw_tuples(final SubLObject ist_logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_sentence = cycl_utilities.formula_arg2(ist_logical_sentence, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(raw_tuples, physical_fields);
    }

    public static SubLObject sksi_translate_logical_sentence_to_raw_tuples(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject sk_source, SubLObject rewrite_cmses_with_set_arg3sP) {
        if (rewrite_cmses_with_set_arg3sP == UNPROVIDED) {
            rewrite_cmses_with_set_arg3sP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str4$_sksi_translate_logical_sentence_), new SubLObject[]{ NINE_INTEGER, logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, rewrite_cmses_with_set_arg3sP });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject raw_tuples = NIL;
        SubLObject physical_fields = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    physical_fields = sksi_kb_accessors.physical_schema_ordered_field_list(physical_schema);
                    final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
                    final SubLObject relevant_pf_indexicals = sksi_kb_accessors.physical_fields_to_indexicals(physical_fields);
                    if (NIL == list_utilities.every_in_list(PHYSICAL_FIELD_INDEXICAL_P, relevant_pf_indexicals, UNPROVIDED)) {
                        SubLObject physical_field = NIL;
                        SubLObject physical_field_$2 = NIL;
                        SubLObject relevant_pf_indexical = NIL;
                        SubLObject relevant_pf_indexical_$3 = NIL;
                        physical_field = physical_fields;
                        physical_field_$2 = physical_field.first();
                        relevant_pf_indexical = relevant_pf_indexicals;
                        relevant_pf_indexical_$3 = relevant_pf_indexical.first();
                        while ((NIL != relevant_pf_indexical) || (NIL != physical_field)) {
                            if (NIL == sksi_kb_accessors.physical_field_indexical_p(relevant_pf_indexical_$3)) {
                                sksi_debugging.sksi_error(cconcatenate($str6$Could_not_find_indexical_for_phys, format_nil.format_nil_s_no_copy(physical_field_$2)));
                            }
                            physical_field = physical_field.rest();
                            physical_field_$2 = physical_field.first();
                            relevant_pf_indexical = relevant_pf_indexical.rest();
                            relevant_pf_indexical_$3 = relevant_pf_indexical.first();
                        } 
                        return values(NIL, NIL);
                    }
                    thread.resetMultipleValues();
                    final SubLObject relevant_logical_field_indexicals_lists = logical_schema_field_indexicals_relevant_to_logical_sentence(logical_sentence, logical_schema, physical_schema, sk_source, rewrite_cmses_with_set_arg3sP);
                    final SubLObject ambiguous_variants_of_logical_sentence = thread.secondMultipleValue();
                    final SubLObject new_cms_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var = relevant_logical_field_indexicals_lists;
                    SubLObject relevant_logical_field_indexicals_list = NIL;
                    relevant_logical_field_indexicals_list = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$4 = ambiguous_variants_of_logical_sentence;
                        SubLObject each_logical_sentence = NIL;
                        each_logical_sentence = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            SubLObject cdolist_list_var_$5;
                            final SubLObject decoded_sentences = cdolist_list_var_$5 = sksi_translate_logical_sentence_to_decoded_sentences(each_logical_sentence, logical_schema, physical_schema, relevant_logical_field_indexicals_list, content_mt, meta_mt, new_cms_list);
                            SubLObject decoded_sentence_conditions_pair = NIL;
                            decoded_sentence_conditions_pair = cdolist_list_var_$5.first();
                            while (NIL != cdolist_list_var_$5) {
                                SubLObject current;
                                final SubLObject datum = current = decoded_sentence_conditions_pair;
                                SubLObject decoded_sentence = NIL;
                                destructuring_bind_must_consp(current, datum, $list8);
                                decoded_sentence = current.first();
                                current = current.rest();
                                final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
                                destructuring_bind_must_listp(current, datum, $list8);
                                current = current.rest();
                                if (NIL == current) {
                                    SubLObject cdolist_list_var_$6;
                                    final SubLObject reformulated_decoded_sentences = cdolist_list_var_$6 = sksi_incremental_edit_reformulate_decoded_sentence(decoded_sentence, logical_schema, physical_schema, sk_source);
                                    SubLObject ref_decoded_sentence = NIL;
                                    ref_decoded_sentence = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        final SubLObject raw_sentence = sksi_translate_decoded_sentence_to_raw_sentence(ref_decoded_sentence, physical_schema, relevant_pf_indexicals, logical_schema, relevant_logical_field_indexicals_list, sk_source);
                                        if (NIL != raw_sentence) {
                                            final SubLObject raw_tuple = sksi_translate_raw_sentence_to_raw_tuple(raw_sentence, relevant_pf_indexicals);
                                            if (NIL != csql_conditions) {
                                                raw_tuples = cons(list(raw_tuple, csql_conditions), raw_tuples);
                                            } else {
                                                raw_tuples = cons(list(raw_tuple), raw_tuples);
                                            }
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        ref_decoded_sentence = cdolist_list_var_$6.first();
                                    } 
                                } else {
                                    cdestructuring_bind_error(datum, $list8);
                                }
                                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                decoded_sentence_conditions_pair = cdolist_list_var_$5.first();
                            } 
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            each_logical_sentence = cdolist_list_var_$4.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        relevant_logical_field_indexicals_list = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        raw_tuples = list_utilities.fast_delete_duplicates(raw_tuples, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str9$sksi_translate_logical_sentence_t), new SubLObject[]{ NINE_INTEGER, raw_tuples, physical_schema });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return values(raw_tuples, physical_fields);
    }

    public static SubLObject logical_schema_field_indexicals_relevant_to_logical_sentence(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject rewrite_cmses_with_set_arg3sP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subsentences = (NIL != el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, UNPROVIDED) : list(logical_sentence);
        final SubLObject ambiguous_subsentences_table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject unambiguous_subsentences = NIL;
        SubLObject unambiguous_logical_field_indexicals = NIL;
        SubLObject ambiguous_logical_field_indexicals = NIL;
        SubLObject exclusive_lfi_list = NIL;
        SubLObject logical_field_indexicals_lists = NIL;
        SubLObject ambiguous_variants_of_logical_sentence = NIL;
        thread.resetMultipleValues();
        final SubLObject pred_to_meaning_sentences_table = meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema(logical_sentence, logical_schema, physical_schema, sk_source, rewrite_cmses_with_set_arg3sP);
        final SubLObject new_cms_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = subsentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(sentence);
            final SubLObject meaning_sentence_args_lists = map_pred_to_logical_field_indexical_tuples_from_meaning_sentences(pred_to_meaning_sentences_table, pred);
            SubLObject logical_field_indexicals_appearing_in_all = list_utilities.intersect_all(meaning_sentence_args_lists, symbol_function(EQUAL), UNPROVIDED);
            SubLObject logical_field_indexicals_appearing_in_some = NIL;
            if (NIL != list_utilities.singletonP(meaning_sentence_args_lists)) {
                unambiguous_subsentences = cons(sentence, unambiguous_subsentences);
                if (NIL != list_utilities.singletonP(subsentences)) {
                    logical_field_indexicals_appearing_in_all = NIL;
                }
            }
            SubLObject cdolist_list_var_$8 = meaning_sentence_args_lists;
            SubLObject arg_list = NIL;
            arg_list = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                final SubLObject lfis_appearing_in_some = list_utilities.fast_set_difference(arg_list, logical_field_indexicals_appearing_in_all, symbol_function(EQUAL));
                if (NIL != lfis_appearing_in_some) {
                    logical_field_indexicals_appearing_in_some = cons(lfis_appearing_in_some, logical_field_indexicals_appearing_in_some);
                    dictionary_utilities.dictionary_push(ambiguous_subsentences_table, pred, sentence);
                } else
                    if (NIL != list_utilities.fast_sets_equalP(arg_list, logical_field_indexicals_appearing_in_all, UNPROVIDED)) {
                        exclusive_lfi_list = arg_list;
                    }

                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                arg_list = cdolist_list_var_$8.first();
            } 
            unambiguous_logical_field_indexicals = nconc(unambiguous_logical_field_indexicals, logical_field_indexicals_appearing_in_all);
            if (NIL != logical_field_indexicals_appearing_in_some) {
                ambiguous_logical_field_indexicals = cons(logical_field_indexicals_appearing_in_some, ambiguous_logical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        unambiguous_subsentences = list_utilities.fast_delete_duplicates(unambiguous_subsentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        ambiguous_variants_of_logical_sentence = compute_ambiguous_variants_of_logical_sentence(logical_sentence, ambiguous_subsentences_table, unambiguous_subsentences);
        unambiguous_logical_field_indexicals = list_utilities.fast_delete_duplicates(unambiguous_logical_field_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        ambiguous_logical_field_indexicals = list_utilities.fast_delete_duplicates(remove_if($sym10$EQUAL_DUPLICATES_, list_utilities.cross_products(ambiguous_logical_field_indexicals), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym11$SETS_EQUAL_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        logical_field_indexicals_lists = compute_possible_logical_field_indexicals_lists(ambiguous_logical_field_indexicals, unambiguous_logical_field_indexicals, NIL != list_utilities.lengthE(subsentences, ONE_INTEGER, UNPROVIDED) ? exclusive_lfi_list : NIL);
        return values(list_utilities.fast_delete_duplicates(logical_field_indexicals_lists, $sym11$SETS_EQUAL_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(ambiguous_variants_of_logical_sentence, $sym12$EQUALS_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_cms_list);
    }

    public static SubLObject map_pred_to_logical_field_indexical_tuples_from_meaning_sentences(final SubLObject pred_to_meaning_sentences_table, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dictionary_result = dictionary.dictionary_lookup_without_values(pred_to_meaning_sentences_table, pred, UNPROVIDED);
        if (NIL != dictionary_result) {
            return extract_logical_field_indexicals_from_meaning_sentences(dictionary_result);
        }
        SubLObject new_result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pred_to_meaning_sentences_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject meaning_sentences = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred)) {
                final SubLObject filtered_meaning_sentences = filter_meaning_sentences_by_pred_arity(meaning_sentences, pred);
                new_result = append(filtered_meaning_sentences, new_result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return extract_logical_field_indexicals_from_meaning_sentences(new_result);
    }

    public static SubLObject filter_meaning_sentences_by_pred_arity(final SubLObject meaning_sentences, final SubLObject pred) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject meaning_sentence_arity = formula_arity(sentence, UNPROVIDED);
            if (NIL != arity.arity_admitsP(pred, meaning_sentence_arity)) {
                result = cons(sentence, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject extract_logical_field_indexicals_from_meaning_sentences(final SubLObject meaning_sentences) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject compute_possible_logical_field_indexicals_lists(final SubLObject ambiguous_logical_field_indexicals, final SubLObject unambiguous_logical_field_indexicals, final SubLObject exclusive_lfi_list) {
        SubLObject result = NIL;
        if (NIL == ambiguous_logical_field_indexicals) {
            result = list(Mapping.mapcar(symbol_function(LIST), unambiguous_logical_field_indexicals));
        }
        SubLObject cdolist_list_var = ambiguous_logical_field_indexicals;
        SubLObject each_ambiguous_lfi_set = NIL;
        each_ambiguous_lfi_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(append(each_ambiguous_lfi_set, unambiguous_logical_field_indexicals), result);
            cdolist_list_var = cdolist_list_var.rest();
            each_ambiguous_lfi_set = cdolist_list_var.first();
        } 
        if (NIL != exclusive_lfi_list) {
            result = cons(exclusive_lfi_list, result);
        }
        return result;
    }

    public static SubLObject meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject rewrite_cmses_with_set_arg3sP) {
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, NIL, T, UNPROVIDED);
        final SubLObject cms_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, NIL, NIL);
        SubLObject pred_to_meaning_sentences_table = dictionary.new_dictionary(symbol_function(EQ), length(meaning_sentences));
        SubLObject new_cms_list = NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject meaning_sentence = NIL;
        meaning_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != meaning_sentence_appropriate_for_logical_sentenceP(meaning_sentence, logical_sentence, sk_source)) {
                pred_to_meaning_sentences_table = add_meaning_sentence_to_meaning_sentence_predicate_table(meaning_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        } 
        cdolist_list_var = cms_gafs;
        SubLObject cms_gaf = NIL;
        cms_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.singletonP(sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf))) {
                pred_to_meaning_sentences_table = maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED), logical_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema, sk_source);
            } else
                if (NIL != rewrite_cmses_with_set_arg3sP) {
                    final SubLObject new_sentence = rewrite_conditional_meaning_sentence(cms_gaf);
                    if (NIL != new_sentence) {
                        pred_to_meaning_sentences_table = maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(cycl_utilities.formula_arg4(new_sentence, UNPROVIDED), logical_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema, sk_source);
                        new_cms_list = cons(new_sentence, new_cms_list);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            cms_gaf = cdolist_list_var.first();
        } 
        if (NIL != sksi_database_fusion.sksi_database_fusion_debugP()) {
            dictionary_utilities.print_dictionary_contents(pred_to_meaning_sentences_table, UNPROVIDED);
        }
        return values(pred_to_meaning_sentences_table, new_cms_list);
    }

    public static SubLObject maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(final SubLObject meaning_sentence, final SubLObject logical_sentence, SubLObject pred_to_meaning_sentences_table, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source) {
        if (NIL != meaning_sentence_appropriate_for_logical_sentenceP(meaning_sentence, logical_sentence, sk_source)) {
            pred_to_meaning_sentences_table = add_meaning_sentence_to_meaning_sentence_predicate_table(meaning_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema);
        }
        return pred_to_meaning_sentences_table;
    }

    public static SubLObject add_meaning_sentence_to_meaning_sentence_predicate_table(final SubLObject meaning_sentence, final SubLObject pred_to_meaning_sentences_table, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
        if (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
            SubLObject cdolist_list_var;
            final SubLObject pred_list = cdolist_list_var = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED);
            SubLObject each_pred = NIL;
            each_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, each_pred, meaning_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                each_pred = cdolist_list_var.first();
            } 
            dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, pred, meaning_sentence);
        } else {
            dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, pred, meaning_sentence);
        }
        return pred_to_meaning_sentences_table;
    }

    public static SubLObject meaning_sentence_pred_appropriate_for_logical_sentence_predP(final SubLObject meaning_sentence_pred, final SubLObject asent_pred) {
        return makeBoolean(meaning_sentence_pred.eql(asent_pred) || (NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred)));
    }

    public static SubLObject meaning_sentence_appropriate_for_logical_sentenceP(final SubLObject meaning_sentence, final SubLObject logical_sentence, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == el_conjunction_p(logical_sentence)) && (NIL == meaning_sentence_pred_appropriate_for_logical_sentence_predP(cycl_utilities.formula_operator(meaning_sentence), cycl_utilities.formula_operator(logical_sentence)))) {
            return NIL;
        }
        final SubLObject logical_sentence_conjuncts = (NIL != el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, UNPROVIDED) : list(logical_sentence);
        SubLObject appropriateP = NIL;
        if (NIL == appropriateP) {
            SubLObject csome_list_var;
            SubLObject conjunct;
            for (csome_list_var = logical_sentence_conjuncts, conjunct = NIL, conjunct = csome_list_var.first(); (NIL == appropriateP) && (NIL != csome_list_var); appropriateP = sksi_meaning_sentence_utilities.meaning_sentence_type_check(conjunct, meaning_sentence, NIL, sksi_kb_accessors.sk_source_content_mt(sk_source), mt_relevance_macros.$mt$.getDynamicValue(thread), $RAW, T, T) , csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
            }
        }
        return appropriateP;
    }

    public static SubLObject compute_ambiguous_variants_of_logical_sentence(final SubLObject logical_sentence, final SubLObject ambiguous_subsentences_table, final SubLObject unambiguous_subsentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject complex_operator = (NIL != el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_operator(logical_sentence) : NIL;
        SubLObject ambiguous_subsentences = NIL;
        SubLObject ambiguous_variants_of_logical_sentence = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(ambiguous_subsentences_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject ambiguous_subsentences_with_pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ambiguous_subsentences = nconc(ambiguous_subsentences, list_utilities.permute_list(list_utilities.fast_delete_duplicates(ambiguous_subsentences_with_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var;
        ambiguous_subsentences = cdolist_list_var = remove_if($sym10$EQUAL_DUPLICATES_, list_utilities.cross_products(ambiguous_subsentences), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject each_ambiguous_permutation = NIL;
        each_ambiguous_permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject each_logical_variant = append(each_ambiguous_permutation, unambiguous_subsentences);
            if (NIL != complex_operator) {
                each_logical_variant = make_formula(complex_operator, each_logical_variant, UNPROVIDED);
            }
            if (NIL != el_conjunction_p(each_logical_variant)) {
                ambiguous_variants_of_logical_sentence = cons(each_logical_variant, ambiguous_variants_of_logical_sentence);
            } else {
                ambiguous_variants_of_logical_sentence = nconc(ambiguous_variants_of_logical_sentence, each_logical_variant);
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_ambiguous_permutation = cdolist_list_var.first();
        } 
        if (NIL == ambiguous_variants_of_logical_sentence) {
            ambiguous_variants_of_logical_sentence = list(logical_sentence);
        }
        return ambiguous_variants_of_logical_sentence;
    }

    public static SubLObject field_encodings_relevant_to_logical_field_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical);
        SubLObject v_answer = NIL;
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(listS($$fieldEncoding, physical_schema, $WHAT, logical_schema, $list18), $TRUE, NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql($GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != argnum) {
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$9 = NIL;
                                    final SubLObject token_var_$10 = NIL;
                                    while (NIL == done_var_$9) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                        final SubLObject valid_$11 = makeBoolean(!token_var_$10.eql(ass));
                                        if ((((NIL != valid_$11) && physical_schema.eql(assertions_high.gaf_arg1(ass))) && logical_schema.eql(assertions_high.gaf_arg3(ass))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), UNPROVIDED, UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = cons(list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$9 = makeBoolean(NIL == valid_$11);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$10 = NIL;
                                    final SubLObject token_var_$11 = NIL;
                                    while (NIL == done_var_$10) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(ass));
                                        if ((((NIL != valid_$12) && physical_schema.eql(assertions_high.gaf_arg1(ass))) && logical_schema.eql(assertions_high.gaf_arg3(ass))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), UNPROVIDED, UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = cons(list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$10 = makeBoolean(NIL == valid_$12);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }
            } else
                if (NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$11 = NIL;
                                    final SubLObject token_var_$12 = NIL;
                                    while (NIL == done_var_$11) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                        final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(ass));
                                        if ((((NIL != valid_$13) && physical_schema.eql(assertions_high.gaf_arg1(ass))) && logical_schema.eql(assertions_high.gaf_arg3(ass))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), UNPROVIDED, UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = cons(list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$11 = makeBoolean(NIL == valid_$13);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } else {
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$12 = NIL;
                                    final SubLObject token_var_$13 = NIL;
                                    while (NIL == done_var_$12) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                        final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(ass));
                                        if ((((NIL != valid_$14) && physical_schema.eql(assertions_high.gaf_arg1(ass))) && logical_schema.eql(assertions_high.gaf_arg3(ass))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), UNPROVIDED, UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = cons(list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$12 = makeBoolean(NIL == valid_$14);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                }

        } else
            if (pcase_var.eql($PREDICATE_EXTENT)) {
                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                note_progress();
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$13 = NIL;
                                    final SubLObject token_var_$14 = NIL;
                                    while (NIL == done_var_$13) {
                                        final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$14);
                                        final SubLObject valid_$15 = makeBoolean(!token_var_$14.eql(ass2));
                                        if ((((NIL != valid_$15) && physical_schema.eql(assertions_high.gaf_arg1(ass2))) && logical_schema.eql(assertions_high.gaf_arg3(ass2))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass2), UNPROVIDED, UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe2 = assertions_high.gaf_arg4(ass2);
                                            final SubLObject pf_indexical2 = assertions_high.gaf_arg2(ass2);
                                            v_answer = cons(list(logical_recipe2, pf_indexical2), v_answer);
                                        }
                                        done_var_$13 = makeBoolean(NIL == valid_$15);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_12, thread);
                        $is_noting_progressP$.rebind(_prev_bind_11, thread);
                        $progress_count$.rebind(_prev_bind_10, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                        $progress_notification_count$.rebind(_prev_bind_8, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                        $progress_start_time$.rebind(_prev_bind_5, thread);
                    }
                }
            } else
                if (pcase_var.eql($OVERLAP)) {
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED);
                    SubLObject ass3 = NIL;
                    ass3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL != assertions_high.assertion_has_truth(ass3, $TRUE)) && physical_schema.eql(assertions_high.gaf_arg1(ass3))) && logical_schema.eql(assertions_high.gaf_arg3(ass3))) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass3), UNPROVIDED, UNPROVIDED).isPositive()) {
                            final SubLObject logical_recipe3 = assertions_high.gaf_arg4(ass3);
                            final SubLObject pf_indexical3 = assertions_high.gaf_arg2(ass3);
                            v_answer = cons(list(logical_recipe3, pf_indexical3), v_answer);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ass3 = cdolist_list_var.first();
                    } 
                } else {
                    kb_mapping_macros.do_gli_method_error(l_index, method);
                }


        return v_answer;
    }

    public static SubLObject field_encodings_relevant_to_logical_field_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return field_encodings_relevant_to_logical_field_indexical_internal(logical_field_indexical, logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_field_indexical, logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_field_indexical.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schema.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schema.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(field_encodings_relevant_to_logical_field_indexical_internal(logical_field_indexical, logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_field_indexical, logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject rewrite_conditional_meaning_sentence(final SubLObject cms_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cms = NIL;
        final SubLObject antecedent_logical_schemata = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
        final SubLObject consequent_logical_schemata = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED);
        final SubLObject asent_arg = sksi_cross_editing.asent_args_of_sentence(consequent_meaning_sentence).first();
        if (NIL != asent_arg) {
            final SubLObject asent_arg_ls = guess_ls_for_meaning_sentence(asent_arg);
            if (NIL != asent_arg_ls) {
                final SubLObject ls_ps_list = sksi_kb_accessors.logical_schema_physical_schemata(asent_arg_ls);
                SubLObject asent_arg_ps = NIL;
                if (NIL == asent_arg_ps) {
                    SubLObject csome_list_var = ls_ps_list;
                    SubLObject ps = NIL;
                    ps = csome_list_var.first();
                    while ((NIL == asent_arg_ps) && (NIL != csome_list_var)) {
                        if (NIL != sksi_kb_accessors.physical_schema_sk_sources_memoized(ps)) {
                            asent_arg_ps = ps;
                        }
                        csome_list_var = csome_list_var.rest();
                        ps = csome_list_var.first();
                    } 
                }
                if (NIL != asent_arg_ps) {
                    final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key(asent_arg_ps);
                    if (NIL != primary_key) {
                        final SubLObject pkey_elem = primary_key.first();
                        final SubLObject pkey_elem_pfi = sksi_kb_accessors.indexical_for_physical_field(pkey_elem);
                        final SubLObject pkey_elem_lfi = physical_field_indexical_logical_field_indexicals(pkey_elem_pfi, asent_arg_ps, asent_arg_ls).first();
                        thread.resetMultipleValues();
                        final SubLObject new_lfi = antecedent_meaning_sentence_constraining_lfi_as_lfi(antecedent_meaning_sentence, pkey_elem_lfi, consequent_logical_schemata);
                        final SubLObject new_antecedent = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject new_lfi_ls = sksi_kb_accessors.logical_field_indexical_schema(new_lfi);
                        new_cms = make_el_formula($const24$conditionalMeaningSentenceOfSchem, list(make_el_set(antecedent_logical_schemata, UNPROVIDED), new_antecedent, new_lfi_ls, cycl_utilities.expression_subst(new_lfi, asent_arg, consequent_meaning_sentence, symbol_function(EQUAL), UNPROVIDED)), UNPROVIDED);
                    }
                }
            }
        }
        return new_cms;
    }

    public static SubLObject antecedent_meaning_sentence_constraining_lfi_as_lfi(final SubLObject sentence, final SubLObject lfi, final SubLObject logical_schemata) {
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$equals)) {
            return values(atomic_sentence_constraining_lfi_as_lfi(sentence, lfi, logical_schemata), NIL);
        }
        if (NIL != el_conjunction_p(sentence)) {
            SubLObject constrained_lfi = NIL;
            SubLObject new_sentence = NIL;
            final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject rest;
            SubLObject subsentence;
            for (rest = NIL, rest = args; (NIL == constrained_lfi) && (NIL != rest); constrained_lfi = antecedent_meaning_sentence_constraining_lfi_as_lfi(subsentence, lfi, logical_schemata) , new_sentence = make_el_formula(cycl_utilities.formula_operator(sentence), remove(subsentence, cycl_utilities.formula_args(sentence, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED) , rest = rest.rest()) {
                subsentence = rest.first();
            }
            return values(constrained_lfi, new_sentence);
        }
        return NIL;
    }

    public static SubLObject atomic_sentence_constraining_lfi_as_lfi(final SubLObject sentence, final SubLObject lfi, final SubLObject logical_schemata) {
        if ((cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED).eql(lfi) && (NIL != sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)))) && (NIL != list_utilities.member_eqP(sksi_kb_accessors.logical_field_indexical_schema(cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED)), logical_schemata))) {
            return cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED);
        }
        if ((cycl_utilities.atomic_sentence_arg2(sentence, UNPROVIDED).eql(lfi) && (NIL != sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)))) && (NIL != list_utilities.member_eqP(sksi_kb_accessors.logical_field_indexical_schema(cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED)), logical_schemata))) {
            return cycl_utilities.atomic_sentence_arg1(sentence, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject physical_field_indexical_logical_field_indexicals(final SubLObject pfi, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, list(logical_schema), list(physical_schema));
        SubLObject lfi_list = NIL;
        SubLObject cdolist_list_var = field_encodings;
        SubLObject encoding = NIL;
        encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lfi_list = append(sksi_infrastructure_utilities.expression_logical_field_indexicals(encoding, UNPROVIDED, UNPROVIDED), lfi_list);
            cdolist_list_var = cdolist_list_var.rest();
            encoding = cdolist_list_var.first();
        } 
        return lfi_list;
    }

    public static SubLObject guess_ls_for_meaning_sentence(final SubLObject sentence) {
        final SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, UNPROVIDED, UNPROVIDED);
        final SubLObject ls_list = list_utilities.fast_delete_duplicates(Mapping.mapcar(LOGICAL_FIELD_INDEXICAL_SCHEMA, lfi_list), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject ls = (NIL != list_utilities.singletonP(ls_list)) ? ls_list.first() : NIL;
        return ls;
    }

    public static SubLObject sksi_incremental_edit_reformulate(final SubLObject logical_value, final SubLObject logical_field_indexical, final SubLObject field_encoding, final SubLObject sk_source) {
        SubLObject pf_indexical_subst = NIL;
        if (NIL != sksi_infrastructure_utilities.code_mapping_expressionP(field_encoding)) {
            pf_indexical_subst = sksi_data_warehousing_utilities.sksi_encode_memoized(logical_value, cycl_utilities.formula_arg1(field_encoding, UNPROVIDED), sk_source, UNPROVIDED);
        }
        if ((NIL == pf_indexical_subst) || (pf_indexical_subst == $UNREFORMULATABLE)) {
            final SubLObject temp_pf_indexical_subst = cycl_utilities.expression_subst(logical_value, sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical), field_encoding, UNPROVIDED, UNPROVIDED);
            pf_indexical_subst = sksi_reformulate.sksi_reformulate(temp_pf_indexical_subst, $ENCODE, sk_source);
        }
        return pf_indexical_subst;
    }

    public static SubLObject sksi_incremental_edit_reformulate_decoded_sentence(final SubLObject decoded_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == decoded_sentence) {
            return NIL;
        }
        final SubLObject sub_sentences = cycl_utilities.formula_args(decoded_sentence, UNPROVIDED);
        SubLObject result_sub_sentences = NIL;
        final SubLObject genl_ks = sksi_kb_accessors.max_genl_ks(sk_source);
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = sub_sentences;
            SubLObject sub_sentence = NIL;
            sub_sentence = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject result_sub_sentence_list = NIL;
                final SubLObject logical_field_indexical = cycl_utilities.formula_arg1(sub_sentence, UNPROVIDED);
                final SubLObject logical_value = cycl_utilities.formula_arg2(sub_sentence, UNPROVIDED);
                final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(logical_field_indexical, list(logical_schema), list(physical_schema));
                final SubLObject relevant_field_encoding_pf_indexical_pairs = field_encodings_relevant_to_logical_field_indexical(logical_field_indexical, logical_schema, physical_schema);
                if (NIL == result_sub_sentence_list) {
                    SubLObject csome_list_var_$25 = field_decodings;
                    SubLObject field_decoding = NIL;
                    field_decoding = csome_list_var_$25.first();
                    while ((NIL == result_sub_sentence_list) && (NIL != csome_list_var_$25)) {
                        final SubLObject simplified_decoding = maybe_evaluate_field_translation(field_decoding);
                        SubLObject logical_value_substs = list(copy_expression(simplified_decoding));
                        SubLObject foundP = NIL;
                        SubLObject cdolist_list_var = relevant_field_encoding_pf_indexical_pairs;
                        SubLObject relevant_field_encoding_pf_indexical_pair = NIL;
                        relevant_field_encoding_pf_indexical_pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = relevant_field_encoding_pf_indexical_pair;
                            SubLObject field_encoding = NIL;
                            SubLObject pf_indexical = NIL;
                            destructuring_bind_must_consp(current, datum, $list30);
                            field_encoding = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list30);
                            pf_indexical = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject pf_indexical_subst = sksi_incremental_edit_reformulate(logical_value, logical_field_indexical, field_encoding, sk_source);
                                if ((NIL != pf_indexical_subst) && (pf_indexical_subst != $UNREFORMULATABLE)) {
                                    foundP = T;
                                    if (NIL != sksi_reformulate.sksi_true_list_p(pf_indexical_subst)) {
                                        final SubLObject copy_logical_value_substs = copy_list(logical_value_substs);
                                        logical_value_substs = NIL;
                                        SubLObject cdolist_list_var_$26 = copy_logical_value_substs;
                                        SubLObject each_logical_value_subst = NIL;
                                        each_logical_value_subst = cdolist_list_var_$26.first();
                                        while (NIL != cdolist_list_var_$26) {
                                            SubLObject cdolist_list_var_$27 = pf_indexical_subst;
                                            SubLObject each_ref = NIL;
                                            each_ref = cdolist_list_var_$27.first();
                                            while (NIL != cdolist_list_var_$27) {
                                                logical_value_substs = cons(cycl_utilities.expression_subst(each_ref, pf_indexical, each_logical_value_subst, UNPROVIDED, UNPROVIDED), logical_value_substs);
                                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                each_ref = cdolist_list_var_$27.first();
                                            } 
                                            cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                            each_logical_value_subst = cdolist_list_var_$26.first();
                                        } 
                                    } else {
                                        final SubLObject copy_logical_value_substs = copy_list(logical_value_substs);
                                        logical_value_substs = NIL;
                                        SubLObject cdolist_list_var_$28 = copy_logical_value_substs;
                                        SubLObject each_logical_value_subst = NIL;
                                        each_logical_value_subst = cdolist_list_var_$28.first();
                                        while (NIL != cdolist_list_var_$28) {
                                            logical_value_substs = cons(cycl_utilities.expression_subst(genl_ks, $$TheCurrentKnowledgeSource, cycl_utilities.expression_subst(pf_indexical_subst, pf_indexical, each_logical_value_subst, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), logical_value_substs);
                                            cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                            each_logical_value_subst = cdolist_list_var_$28.first();
                                        } 
                                    }
                                } else
                                    if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(TEN_INTEGER)) {
                                        format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str32$sksi_incremental_edit_reformulate), new SubLObject[]{ TEN_INTEGER, logical_value, logical_field_indexical, field_encoding });
                                        force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                                    }

                            } else {
                                cdestructuring_bind_error(datum, $list30);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            relevant_field_encoding_pf_indexical_pair = cdolist_list_var.first();
                        } 
                        if (NIL != foundP) {
                            cdolist_list_var = logical_value_substs;
                            SubLObject each_logical_value_subst2 = NIL;
                            each_logical_value_subst2 = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                result_sub_sentence_list = cons(make_binary_formula($$indexicalReferent, logical_field_indexical, each_logical_value_subst2), result_sub_sentence_list);
                                cdolist_list_var = cdolist_list_var.rest();
                                each_logical_value_subst2 = cdolist_list_var.first();
                            } 
                        }
                        csome_list_var_$25 = csome_list_var_$25.rest();
                        field_decoding = csome_list_var_$25.first();
                    } 
                }
                if (NIL != result_sub_sentence_list) {
                    result_sub_sentences = (NIL != result_sub_sentences) ? multiply_reformulation_lists(result_sub_sentence_list, result_sub_sentences) : NIL != list_utilities.singletonP(result_sub_sentence_list) ? cons(result_sub_sentence_list, result_sub_sentences) : result_sub_sentence_list;
                } else {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub_sentence = csome_list_var.first();
            } 
        }
        if (NIL != failP) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var2 = result_sub_sentences;
        SubLObject each_result_sub_sentences = NIL;
        each_result_sub_sentences = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            result = cons(make_conjunction(reverse(each_result_sub_sentences)), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            each_result_sub_sentences = cdolist_list_var2.first();
        } 
        return result;
    }

    public static SubLObject multiply_reformulation_lists(final SubLObject a_list, final SubLObject b_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = a_list;
        SubLObject a_el = NIL;
        a_el = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$29 = b_list;
            SubLObject b_el = NIL;
            b_el = cdolist_list_var_$29.first();
            while (NIL != cdolist_list_var_$29) {
                result = cons(NIL != el_formula_with_operator_p(b_el, $$indexicalReferent) ? list(a_el, b_el) : cons(a_el, b_el), result);
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                b_el = cdolist_list_var_$29.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            a_el = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sksi_translate_logical_sentence_to_decoded_sentences(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject content_mt, final SubLObject meta_mt, final SubLObject new_cms_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject translation_pattern_cmses_list = sksi_logical_sentence_to_decoded_sentence_translation_patterns(logical_schema, physical_schema, relevant_logical_field_indexicals, logical_sentence, new_cms_list);
        SubLObject decoded_sentences = NIL;
        SubLObject cdolist_list_var = translation_pattern_cmses_list;
        SubLObject translation_pattern_cmses_pair = NIL;
        translation_pattern_cmses_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = translation_pattern_cmses_pair;
            SubLObject translation_pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list34);
            translation_pattern = current.first();
            current = current.rest();
            final SubLObject relevant_cmses = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list34);
            current = current.rest();
            if (NIL == current) {
                final SubLObject decoded_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, logical_sentence, UNPROVIDED);
                if (NIL != decoded_sentence) {
                    thread.resetMultipleValues();
                    final SubLObject successP = decoded_sentence_satisfies_conditionsP(decoded_sentence, relevant_cmses, content_mt, meta_mt);
                    final SubLObject csql_conditions = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        if (NIL != csql_conditions) {
                            decoded_sentences = cons(list(decoded_sentence, csql_conditions), decoded_sentences);
                        } else {
                            decoded_sentences = cons(list(decoded_sentence), decoded_sentences);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list34);
            }
            cdolist_list_var = cdolist_list_var.rest();
            translation_pattern_cmses_pair = cdolist_list_var.first();
        } 
        return nreverse(decoded_sentences);
    }

    public static SubLObject decoded_sentence_satisfies_conditionsP(final SubLObject decoded_sentence, final SubLObject relevant_cmses, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lfi_value_cache = sksi_data_warehousing_utilities.construct_lfi_value_cache(decoded_sentence);
        SubLObject failP = NIL;
        SubLObject conditions = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = relevant_cmses;
            SubLObject cms = NIL;
            cms = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject possibly_from_expression = sksi_data_warehousing_utilities.decoded_sentence_satisfies_conditionP(cms, lfi_value_cache, content_mt, meta_mt);
                final SubLObject possibly_where_expression = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (possibly_from_expression != T) {
                    if (NIL == possibly_from_expression) {
                        failP = T;
                    } else
                        if ((NIL != list_utilities.list_of_type_p(CSQL_TABLE_EXPRESSION_P, possibly_from_expression)) && (NIL != possibly_where_expression)) {
                            conditions = cons(list(possibly_from_expression, possibly_where_expression), conditions);
                        }

                }
                csome_list_var = csome_list_var.rest();
                cms = csome_list_var.first();
            } 
        }
        return values(makeBoolean(NIL == failP), conditions);
    }

    public static SubLObject sksi_logical_sentence_to_decoded_sentence_translation_patterns(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject logical_sentence, final SubLObject new_cms_list) {
        final SubLObject flat_logical_field_indexical_list = list_utilities.tree_find_all_if(LOGICAL_FIELD_INDEXICAL_P, relevant_logical_field_indexicals, UNPROVIDED);
        SubLObject arg_var_map = NIL;
        SubLObject indexical_referent_literals = NIL;
        SubLObject result = NIL;
        SubLObject list_var = NIL;
        SubLObject logical_field_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = flat_logical_field_indexical_list;
        logical_field_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , logical_field_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject arg_var = sksi_batch_translate.sksi_get_arg_var(field_number);
            final SubLObject indexical_referent_literal = list($$indexicalReferent, logical_field_indexical, list($VALUE, arg_var));
            arg_var_map = cons(cons(logical_field_indexical, list($BIND, arg_var)), arg_var_map);
            indexical_referent_literals = cons(indexical_referent_literal, indexical_referent_literals);
        }
        arg_var_map = nreverse(arg_var_map);
        indexical_referent_literals = nreverse(indexical_referent_literals);
        final SubLObject logical_sentence_conjuncts = (NIL != el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, UNPROVIDED) : list(logical_sentence);
        final SubLObject logical_sentence_predicates = Mapping.mapcar(FORMULA_OPERATOR, logical_sentence_conjuncts);
        final SubLObject relevant_predicates = remove_duplicates(logical_sentence_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject relevant_meaning_sentences_lists = cdolist_list_var = relevant_logical_schema_meaning_sentences_with_preds(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_predicates, logical_sentence_predicates, new_cms_list, UNPROVIDED, UNPROVIDED);
        SubLObject relevant_meaning_sentences = NIL;
        relevant_meaning_sentences = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject meaning_sentence_list = NIL;
            SubLObject sorted_meaning_sentences = NIL;
            SubLObject logical_sentence_recipe = NIL;
            SubLObject logical_sentence_template = NIL;
            SubLObject relevant_cmses = NIL;
            SubLObject pattern = NIL;
            SubLObject cdolist_list_var_$30 = relevant_meaning_sentences;
            SubLObject meaning_sentence_cms_list_pair = NIL;
            meaning_sentence_cms_list_pair = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                SubLObject current;
                final SubLObject datum = current = meaning_sentence_cms_list_pair;
                SubLObject meaning_sentence = NIL;
                destructuring_bind_must_consp(current, datum, $list40);
                meaning_sentence = current.first();
                current = current.rest();
                final SubLObject cms_list = (current.isCons()) ? current.first() : NIL;
                destructuring_bind_must_listp(current, datum, $list40);
                current = current.rest();
                if (NIL == current) {
                    meaning_sentence_list = cons(meaning_sentence, meaning_sentence_list);
                    if (NIL != cms_list) {
                        relevant_cmses = cons(cms_list, relevant_cmses);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list40);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                meaning_sentence_cms_list_pair = cdolist_list_var_$30.first();
            } 
            sorted_meaning_sentences = list_utilities.sort_via_position(meaning_sentence_list, logical_sentence_predicates, symbol_function(EQ), FORMULA_OPERATOR);
            logical_sentence_recipe = simplifier.simplify_cycl_sentence_syntax(make_conjunction(sorted_meaning_sentences), UNPROVIDED);
            logical_sentence_template = sublis(arg_var_map, logical_sentence_recipe, symbol_function(EQUAL), UNPROVIDED);
            pattern = list($TEMPLATE, logical_sentence_template, NIL != indexical_referent_literals ? make_conjunction(indexical_referent_literals) : NIL);
            result = cons(NIL != relevant_cmses ? list(pattern, relevant_cmses) : list(pattern), result);
            cdolist_list_var = cdolist_list_var.rest();
            relevant_meaning_sentences = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject relevant_logical_schema_meaning_sentences_with_preds_internal(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject relevant_preds, final SubLObject logical_sentence_predicates, final SubLObject new_cms_list, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        SubLObject relevant_sentences = NIL;
        thread.resetMultipleValues();
        final SubLObject relevant_logical_field_indexicals_lists = list_utilities.partition_list(relevant_logical_field_indexicals, symbol_function(LISTP));
        final SubLObject relevant_logical_field_indexical_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject irrelevant_logical_field_indexicals = set_difference(all_logical_field_indexicals, relevant_logical_field_indexical_list, UNPROVIDED, UNPROVIDED);
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, asserted_meaning_sentences_onlyP, unwrap_istsP, UNPROVIDED);
        final SubLObject conditional_meaning_sentences = append(Mapping.mapcar(GAF_FORMULA, sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, NIL, NIL)), new_cms_list);
        SubLObject cdolist_list_var = relevant_preds;
        SubLObject relevant_pred = NIL;
        relevant_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject relevant_pred_sentences = NIL;
            SubLObject cdolist_list_var_$31 = meaning_sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var_$31.first();
            while (NIL != cdolist_list_var_$31) {
                if (NIL != relevant_logical_schema_meaning_sentenceP(sentence, relevant_pred, relevant_logical_field_indexicals_lists, irrelevant_logical_field_indexicals, logical_schema, physical_schema)) {
                    relevant_pred_sentences = cons(list(sentence), relevant_pred_sentences);
                }
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                sentence = cdolist_list_var_$31.first();
            } 
            if ((NIL != list_utilities.lengthG(relevant_pred_sentences, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.occurs_exactly_n_timesP(relevant_pred, logical_sentence_predicates, length(relevant_pred_sentences), UNPROVIDED))) {
                relevant_pred_sentences = list(relevant_pred_sentences);
            }
            SubLObject cdolist_list_var_$32 = conditional_meaning_sentences;
            SubLObject cms = NIL;
            cms = cdolist_list_var_$32.first();
            while (NIL != cdolist_list_var_$32) {
                if (NIL == el_set_p(cycl_utilities.formula_arg3(cms, UNPROVIDED))) {
                    final SubLObject consequent_meaning_sentence = cycl_utilities.formula_arg4(cms, UNPROVIDED);
                    if (NIL != relevant_logical_schema_meaning_sentenceP(consequent_meaning_sentence, relevant_pred, relevant_logical_field_indexicals_lists, irrelevant_logical_field_indexicals, logical_schema, physical_schema)) {
                        final SubLObject sentence_lfis = sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(consequent_meaning_sentence);
                        final SubLObject same_lfis_sentences = list_utilities.find_all(sentence_lfis, relevant_pred_sentences, $sym45$FAST_INTERSECT_, MEANING_SENTENCE_LOGICAL_FIELD_INDEXICALS);
                        if (NIL != same_lfis_sentences) {
                            SubLObject new_same_lfis_sentences = NIL;
                            SubLObject cdolist_list_var_$33 = same_lfis_sentences;
                            SubLObject same_lfis_sentence = NIL;
                            same_lfis_sentence = cdolist_list_var_$33.first();
                            while (NIL != cdolist_list_var_$33) {
                                relevant_pred_sentences = delete(same_lfis_sentence, relevant_pred_sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != sksi_reformulate.sksi_true_list_p(same_lfis_sentence.first())) {
                                    new_same_lfis_sentences = cons(same_lfis_sentence, new_same_lfis_sentences);
                                } else {
                                    new_same_lfis_sentences = cons(list(same_lfis_sentence), new_same_lfis_sentences);
                                }
                                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                same_lfis_sentence = cdolist_list_var_$33.first();
                            } 
                            new_same_lfis_sentences = nreverse(new_same_lfis_sentences);
                            relevant_pred_sentences = multiply_meaning_sentence_lists(list_utilities.nadd_to_end(list(list(consequent_meaning_sentence, cms)), new_same_lfis_sentences), relevant_pred_sentences);
                        } else {
                            relevant_pred_sentences = cons(list(consequent_meaning_sentence, cms), relevant_pred_sentences);
                        }
                    }
                }
                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                cms = cdolist_list_var_$32.first();
            } 
            relevant_sentences = multiply_meaning_sentence_lists(relevant_pred_sentences, relevant_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            relevant_pred = cdolist_list_var.first();
        } 
        return nreverse(relevant_sentences);
    }

    public static SubLObject relevant_logical_schema_meaning_sentences_with_preds(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject relevant_preds, final SubLObject logical_sentence_predicates, final SubLObject new_cms_list, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == UNPROVIDED) {
            asserted_meaning_sentences_onlyP = NIL;
        }
        if (unwrap_istsP == UNPROVIDED) {
            unwrap_istsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentences_with_preds_internal(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, EIGHT_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (physical_schema.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (relevant_preds.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (logical_sentence_predicates.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (new_cms_list.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (asserted_meaning_sentences_onlyP.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && unwrap_istsP.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relevant_logical_schema_meaning_sentences_with_preds_internal(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject multiply_meaning_sentence_lists(final SubLObject a_list, final SubLObject b_list) {
        if (NIL != b_list) {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = a_list;
            SubLObject a_el = NIL;
            a_el = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$34 = b_list;
                SubLObject b_el = NIL;
                b_el = cdolist_list_var_$34.first();
                while (NIL != cdolist_list_var_$34) {
                    result = cons(NIL != sksi_reformulate.sksi_true_list_p(a_el.first()) ? NIL != sksi_reformulate.sksi_true_list_p(b_el.first()) ? append(a_el, b_el) : list_utilities.nadd_to_end(b_el, a_el) : NIL != sksi_reformulate.sksi_true_list_p(b_el.first()) ? cons(a_el, b_el) : list(a_el, b_el), result);
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    b_el = cdolist_list_var_$34.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                a_el = cdolist_list_var.first();
            } 
            result = list_utilities.fast_delete_duplicates(result, $sym11$SETS_EQUAL_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
        if (NIL != sksi_reformulate.sksi_true_list_p(caar(a_list))) {
            return a_list;
        }
        return list(a_list);
    }

    public static SubLObject relevant_logical_schema_meaning_sentenceP(final SubLObject meaning_sentence, final SubLObject relevant_pred, final SubLObject relevant_logical_field_indexicals_lists, final SubLObject irrelevant_logical_field_indexicals, final SubLObject logical_schema, final SubLObject physical_schema) {
        if (NIL != sksi_meaning_sentence_has_relevant_predP(meaning_sentence, relevant_pred, logical_schema, physical_schema)) {
            SubLObject relevantP = NIL;
            if (NIL == relevantP) {
                SubLObject csome_list_var = relevant_logical_field_indexicals_lists;
                SubLObject relevant_logical_field_indexicals_list = NIL;
                relevant_logical_field_indexicals_list = csome_list_var.first();
                while ((NIL == relevantP) && (NIL != csome_list_var)) {
                    SubLObject failP = NIL;
                    if (NIL == failP) {
                        SubLObject csome_list_var_$35;
                        SubLObject lfi;
                        for (csome_list_var_$35 = relevant_logical_field_indexicals_list, lfi = NIL, lfi = csome_list_var_$35.first(); (NIL == failP) && (NIL != csome_list_var_$35); failP = makeBoolean(NIL == sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p(lfi, meaning_sentence)) , csome_list_var_$35 = csome_list_var_$35.rest() , lfi = csome_list_var_$35.first()) {
                        }
                    }
                    relevantP = makeBoolean(NIL == failP);
                    csome_list_var = csome_list_var.rest();
                    relevant_logical_field_indexicals_list = csome_list_var.first();
                } 
            }
            if (NIL == relevantP) {
                SubLObject irrelevantP = NIL;
                if (NIL == irrelevantP) {
                    SubLObject csome_list_var2;
                    SubLObject irrelevant_field_indexical;
                    for (csome_list_var2 = irrelevant_logical_field_indexicals, irrelevant_field_indexical = NIL, irrelevant_field_indexical = csome_list_var2.first(); (NIL == irrelevantP) && (NIL != csome_list_var2); irrelevantP = sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p(irrelevant_field_indexical, meaning_sentence) , csome_list_var2 = csome_list_var2.rest() , irrelevant_field_indexical = csome_list_var2.first()) {
                    }
                }
                relevantP = makeBoolean(NIL == irrelevantP);
            }
            return relevantP;
        }
        return NIL;
    }

    public static SubLObject sksi_meaning_sentence_has_relevant_predP(final SubLObject sentence, final SubLObject relevant_pred, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        if (pred.eql(relevant_pred)) {
            return T;
        }
        if (NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
            return NIL;
        }
        final SubLObject pred_list = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED);
        if (NIL == pred_list) {
            return T;
        }
        return list_utilities.member_eqP(relevant_pred, pred_list);
    }

    public static SubLObject sksi_translate_decoded_sentence_to_raw_sentence(final SubLObject decoded_sentence, final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLObject translation_pattern = sksi_decoded_sentence_to_raw_sentence_translation_pattern(physical_schema, pf_indexicals, logical_schema, Mapping.mapcar(FORMULA_ARG1, cycl_utilities.formula_args(decoded_sentence, UNPROVIDED)), sk_source);
        SubLObject raw_sentence = NIL;
        raw_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, decoded_sentence, UNPROVIDED);
        return raw_sentence;
    }

    public static SubLObject physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject physical_fields = sksi_kb_accessors.physical_schema_fields(physical_schema);
        final SubLObject mappings_cache = dictionary.new_dictionary(symbol_function(EQ), length(physical_fields));
        SubLObject cdolist_list_var = physical_fields;
        SubLObject pf = NIL;
        pf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject relevant_logical_field_indexicals = sksi_kb_accessors.sksi_determine_logical_field_indexicals_relevant_to_physical_field(pf, physical_schema, logical_schema);
            final SubLObject pf_indexical = sksi_kb_accessors.indexical_for_physical_field(pf);
            dictionary.dictionary_enter(mappings_cache, pf_indexical, relevant_logical_field_indexicals);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        } 
        return mappings_cache;
    }

    public static SubLObject physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schema.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLObject pf_indexical_lf_mappings_cache = physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata(logical_schema, physical_schema);
        final SubLObject relevant_logical_field_indexical_forts = Mapping.mapcar(LFI_FORT_FOR_LFI, relevant_logical_field_indexicals);
        final SubLObject genl_ks = sksi_kb_accessors.max_genl_ks(sk_source);
        SubLObject raw_var_map = NIL;
        SubLObject field_value_literals = NIL;
        SubLObject list_var = NIL;
        SubLObject pf_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pf_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject pf_indexical_usedP = list_utilities.intersectP(dictionary.dictionary_lookup_without_values(pf_indexical_lf_mappings_cache, pf_indexical, UNPROVIDED), relevant_logical_field_indexical_forts, UNPROVIDED, UNPROVIDED);
            final SubLObject raw_var = sksi_batch_translate.sksi_get_raw_var(field_number);
            SubLObject field_value_literal = NIL;
            if (NIL != pf_indexical_usedP) {
                field_value_literal = list($$fieldValue, pf_indexical, list($VALUE, raw_var));
                raw_var_map = cons(cons(pf_indexical, list($BIND, raw_var)), raw_var_map);
            } else {
                field_value_literal = listS($$fieldValue, pf_indexical, $list52);
            }
            field_value_literals = cons(field_value_literal, field_value_literals);
        }
        raw_var_map = nreverse(raw_var_map);
        field_value_literals = nreverse(field_value_literals);
        SubLObject indexical_referent_literals = NIL;
        SubLObject cdolist_list_var = relevant_logical_field_indexicals;
        SubLObject logical_field_indexical = NIL;
        logical_field_indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$36;
            final SubLObject recipes = cdolist_list_var_$36 = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(logical_field_indexical, list(logical_schema), list(physical_schema));
            SubLObject recipe = NIL;
            recipe = cdolist_list_var_$36.first();
            while (NIL != cdolist_list_var_$36) {
                final SubLObject decoding = cycl_utilities.expression_subst(genl_ks, $$TheCurrentKnowledgeSource, sublis(raw_var_map, maybe_evaluate_field_translation(recipe), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                final SubLObject indexical_referent_literal = list($$indexicalReferent, logical_field_indexical, decoding);
                indexical_referent_literals = cons(indexical_referent_literal, indexical_referent_literals);
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                recipe = cdolist_list_var_$36.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            logical_field_indexical = cdolist_list_var.first();
        } 
        indexical_referent_literals = nreverse(delete_duplicates(indexical_referent_literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject translation_pattern = list($TEMPLATE, make_conjunction(indexical_referent_literals), make_conjunction(field_value_literals));
        return values(translation_pattern, relevant_logical_field_indexicals);
    }

    public static SubLObject sksi_decoded_sentence_to_raw_sentence_translation_pattern(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (physical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pf_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (logical_schema.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && sk_source.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject maybe_evaluate_field_translation_internal(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, $sym54$NON_SKSI_EVALUATABLE_EXPRESSION_, MAYBE_EVALUATE_EXPRESSION, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject maybe_evaluate_field_translation(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return maybe_evaluate_field_translation_internal(expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MAYBE_EVALUATE_FIELD_TRANSLATION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MAYBE_EVALUATE_FIELD_TRANSLATION, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MAYBE_EVALUATE_FIELD_TRANSLATION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(maybe_evaluate_field_translation_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject maybe_evaluate_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = expression;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject eval_result = relation_evaluation.cyc_evaluate(expression);
                    final SubLObject validP = thread.secondMultipleValue();
                    final SubLObject contextualizedP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == error) && (NIL != validP)) {
                        result = eval_result;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject sksi_translate_raw_sentence_to_raw_tuple(final SubLObject raw_sentence, final SubLObject relevant_pf_indexicals) {
        final SubLObject translation_pattern = sksi_raw_sentence_to_raw_tuple_translation_pattern(relevant_pf_indexicals);
        SubLObject raw_tuple = NIL;
        raw_tuple = pattern_match.pattern_transform_tree(translation_pattern, raw_sentence, UNPROVIDED);
        return raw_tuple;
    }

    public static SubLObject sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(SubLObject pf_indexicals) {
        SubLObject datum_vars = NIL;
        SubLObject field_value_literals = NIL;
        SubLObject list_var = NIL;
        SubLObject pf_indexical = NIL;
        SubLObject field_number = NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pf_indexical = list_var.first() , field_number = add(ONE_INTEGER, field_number)) {
            final SubLObject datum_var = sksi_batch_translate.sksi_get_datum_var(field_number);
            datum_vars = cons(list($VALUE, datum_var), datum_vars);
            if (NIL != pf_indexical) {
                final SubLObject field_value_literal = list($$fieldValue, pf_indexical, list($BIND, datum_var));
                field_value_literals = cons(field_value_literal, field_value_literals);
            }
        }
        datum_vars = nreverse(datum_vars);
        field_value_literals = nreverse(field_value_literals);
        pf_indexicals = delete(NIL, pf_indexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject translation_pattern = list($TEMPLATE, make_conjunction(field_value_literals), datum_vars);
        return translation_pattern;
    }

    public static SubLObject sksi_raw_sentence_to_raw_tuple_translation_pattern(final SubLObject pf_indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(pf_indexicals);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf_indexicals, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(pf_indexicals)));
            memoization_state.caching_state_put(caching_state, pf_indexicals, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_store_or_delete_raw_value(final SubLObject sk_source, final SubLObject access_path, final SubLObject raw_tuple, final SubLObject physical_fields, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str58$_sksi_store_or_delete_raw_value__), new SubLObject[]{ NINE_INTEGER, sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, operator, csql_conditions });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject successP = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
            SubLObject error_message = NIL;
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str59$sksi_store_or_delete_raw_value_CS), NINE_INTEGER, csql);
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (NIL != csql) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$38 = $inference_debugP$.currentBinding(thread);
                            try {
                                $inference_debugP$.bind(T, thread);
                                assert NIL != sksi_debugging.valid_sksi_error_handling_mode_p($BREAK) : "sksi_debugging.valid_sksi_error_handling_mode_p(sksi_incremental_edit.$kw60$BREAK) " + "CommonSymbols.NIL != sksi_debugging.valid_sksi_error_handling_mode_p(sksi_incremental_edit.$kw60$BREAK) " + $BREAK;
                                final SubLObject _prev_bind_0_$39 = sksi_debugging.$sksi_sks_error_handling_mode$.currentBinding(thread);
                                try {
                                    sksi_debugging.$sksi_sks_error_handling_mode$.bind($BREAK, thread);
                                    successP = sksi_store_or_delete_raw_value_int(access_path, csql, physical_schema);
                                } finally {
                                    sksi_debugging.$sksi_sks_error_handling_mode$.rebind(_prev_bind_0_$39, thread);
                                }
                            } finally {
                                $inference_debugP$.rebind(_prev_bind_0_$38, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error_message) {
                    successP = NIL;
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str62$sksi_store_or_delete_raw_value___), NINE_INTEGER, successP);
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }

    public static SubLObject sksi_store_or_delete_raw_value_int(final SubLObject access_path, final SubLObject csql, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_csql_utilities.invalid_csql_expressionP(csql)) {
            if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
                format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str63$Invalid_CSQL_expression_at__sksi_), new SubLObject[]{ NINE_INTEGER, access_path, csql, physical_schema });
                force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.structured_knowledge_source_type(access_path);
        if (pcase_var.eql($$Database_Physical)) {
            return sksi_store_or_delete_raw_value_db(csql, access_path);
        }
        if (pcase_var.eql($$FileHashTable_File)) {
            return sksi_store_or_delete_raw_value_fht(csql, access_path, physical_schema);
        }
        if (pcase_var.eql($CACHE)) {
            return sksi_store_or_delete_raw_value_cache(csql, access_path);
        }
        return NIL;
    }

    public static SubLObject sksi_store_or_delete_raw_value_db(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str67$_sksi_store_or_delete_raw_value_d), new SubLObject[]{ NINE_INTEGER, csql, access_path });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, UNPROVIDED);
        final SubLObject result = sksi_store_or_delete_raw_value_db_int(sql, access_path);
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str3$__SKSI__A_, $str68$sksi_store_or_delete_raw_value_db), NINE_INTEGER, result);
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return result;
    }

    public static SubLObject sksi_store_or_delete_raw_value_db_int(final SubLObject sql, final SubLObject access_path) {
        final SubLObject result = sksi_sks_interaction.sksi_execute_sql_update(sql, access_path);
        return plusp(result);
    }

    public static SubLObject sksi_store_or_delete_raw_value_fht(final SubLObject csql, final SubLObject access_path, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key = sksi_csql_interpretation.csql_to_key_and_value_expressions(csql, physical_schema);
        final SubLObject key_value = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject operator_keyword = csql.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(operator_keyword, $list69, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str70$malformed_csql_subexpression__a__, operator_keyword);
        }
        final SubLObject pcase_var = operator_keyword;
        if (pcase_var.eql($INSERT)) {
            return sksi_sks_interaction.put_key_value_under_key_in_fht_source(key, key_value, access_path);
        }
        if (pcase_var.eql($DELETE)) {
            return sksi_sks_interaction.remove_key_value_under_key_in_fht_source(key, key_value, access_path);
        }
        return NIL;
    }

    public static SubLObject sksi_store_or_delete_raw_value_cache(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator_keyword = NIL;
        SubLObject into = NIL;
        SubLObject fields = NIL;
        SubLObject field_values = NIL;
        destructuring_bind_must_consp(csql, csql, $list71);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        destructuring_bind_must_consp(current, csql, $list71);
        into = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list71);
        fields = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, csql, $list71);
        field_values = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(csql, $list71);
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(operator_keyword, $list69, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str72$malformed_csql_expression__a__exp, operator_keyword);
        }
        final SubLObject tables = second(into);
        if ((NIL != list_utilities.singletonP(tables)) && $list73.equal(tables.first())) {
            return sksi_cache.sksi_store_or_delete_raw_value_in_language_spoken_cache(csql);
        }
        Errors.error($str74$unknown_cache_for_csql__a_and_acc, csql, access_path);
        return NIL;
    }

    public static SubLObject declare_sksi_incremental_edit_file() {
        declareFunction(me, "sksi_store_ist_logical_sentence", "SKSI-STORE-IST-LOGICAL-SENTENCE", 4, 2, false);
        declareFunction(me, "sksi_delete_ist_logical_sentence", "SKSI-DELETE-IST-LOGICAL-SENTENCE", 4, 2, false);
        declareFunction(me, "sksi_store_logical_sentence", "SKSI-STORE-LOGICAL-SENTENCE", 4, 2, false);
        declareFunction(me, "sksi_delete_logical_sentence", "SKSI-DELETE-LOGICAL-SENTENCE", 4, 2, false);
        declareFunction(me, "sksi_translate_ist_logical_sentence_to_raw_tuples", "SKSI-TRANSLATE-IST-LOGICAL-SENTENCE-TO-RAW-TUPLES", 5, 0, false);
        declareFunction(me, "sksi_translate_logical_sentence_to_raw_tuples", "SKSI-TRANSLATE-LOGICAL-SENTENCE-TO-RAW-TUPLES", 5, 1, false);
        declareFunction(me, "logical_schema_field_indexicals_relevant_to_logical_sentence", "LOGICAL-SCHEMA-FIELD-INDEXICALS-RELEVANT-TO-LOGICAL-SENTENCE", 5, 0, false);
        declareFunction(me, "map_pred_to_logical_field_indexical_tuples_from_meaning_sentences", "MAP-PRED-TO-LOGICAL-FIELD-INDEXICAL-TUPLES-FROM-MEANING-SENTENCES", 2, 0, false);
        declareFunction(me, "filter_meaning_sentences_by_pred_arity", "FILTER-MEANING-SENTENCES-BY-PRED-ARITY", 2, 0, false);
        declareFunction(me, "extract_logical_field_indexicals_from_meaning_sentences", "EXTRACT-LOGICAL-FIELD-INDEXICALS-FROM-MEANING-SENTENCES", 1, 0, false);
        declareFunction(me, "compute_possible_logical_field_indexicals_lists", "COMPUTE-POSSIBLE-LOGICAL-FIELD-INDEXICALS-LISTS", 3, 0, false);
        declareFunction(me, "meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema", "MEANING-SENTENCE-PREDICATE-TABLE-FOR-LOGICAL-SENTENCE-LOGICAL-SCHEMA-PHYSICAL-SCHEMA", 5, 0, false);
        declareFunction(me, "maybe_add_meaning_sentence_to_meaning_sentence_predicate_table", "MAYBE-ADD-MEANING-SENTENCE-TO-MEANING-SENTENCE-PREDICATE-TABLE", 6, 0, false);
        declareFunction(me, "add_meaning_sentence_to_meaning_sentence_predicate_table", "ADD-MEANING-SENTENCE-TO-MEANING-SENTENCE-PREDICATE-TABLE", 4, 0, false);
        declareFunction(me, "meaning_sentence_pred_appropriate_for_logical_sentence_predP", "MEANING-SENTENCE-PRED-APPROPRIATE-FOR-LOGICAL-SENTENCE-PRED?", 2, 0, false);
        declareFunction(me, "meaning_sentence_appropriate_for_logical_sentenceP", "MEANING-SENTENCE-APPROPRIATE-FOR-LOGICAL-SENTENCE?", 3, 0, false);
        declareFunction(me, "compute_ambiguous_variants_of_logical_sentence", "COMPUTE-AMBIGUOUS-VARIANTS-OF-LOGICAL-SENTENCE", 3, 0, false);
        declareFunction(me, "field_encodings_relevant_to_logical_field_indexical_internal", "FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL-INTERNAL", 3, 0, false);
        declareFunction(me, "field_encodings_relevant_to_logical_field_indexical", "FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        declareFunction(me, "rewrite_conditional_meaning_sentence", "REWRITE-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction(me, "antecedent_meaning_sentence_constraining_lfi_as_lfi", "ANTECEDENT-MEANING-SENTENCE-CONSTRAINING-LFI-AS-LFI", 3, 0, false);
        declareFunction(me, "atomic_sentence_constraining_lfi_as_lfi", "ATOMIC-SENTENCE-CONSTRAINING-LFI-AS-LFI", 3, 0, false);
        declareFunction(me, "physical_field_indexical_logical_field_indexicals", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICALS", 3, 0, false);
        declareFunction(me, "guess_ls_for_meaning_sentence", "GUESS-LS-FOR-MEANING-SENTENCE", 1, 0, false);
        declareFunction(me, "sksi_incremental_edit_reformulate", "SKSI-INCREMENTAL-EDIT-REFORMULATE", 4, 0, false);
        declareFunction(me, "sksi_incremental_edit_reformulate_decoded_sentence", "SKSI-INCREMENTAL-EDIT-REFORMULATE-DECODED-SENTENCE", 4, 0, false);
        declareFunction(me, "multiply_reformulation_lists", "MULTIPLY-REFORMULATION-LISTS", 2, 0, false);
        declareFunction(me, "sksi_translate_logical_sentence_to_decoded_sentences", "SKSI-TRANSLATE-LOGICAL-SENTENCE-TO-DECODED-SENTENCES", 7, 0, false);
        declareFunction(me, "decoded_sentence_satisfies_conditionsP", "DECODED-SENTENCE-SATISFIES-CONDITIONS?", 4, 0, false);
        declareFunction(me, "sksi_logical_sentence_to_decoded_sentence_translation_patterns", "SKSI-LOGICAL-SENTENCE-TO-DECODED-SENTENCE-TRANSLATION-PATTERNS", 5, 0, false);
        declareFunction(me, "relevant_logical_schema_meaning_sentences_with_preds_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS-INTERNAL", 6, 2, false);
        declareFunction(me, "relevant_logical_schema_meaning_sentences_with_preds", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS", 6, 2, false);
        declareFunction(me, "multiply_meaning_sentence_lists", "MULTIPLY-MEANING-SENTENCE-LISTS", 2, 0, false);
        declareFunction(me, "relevant_logical_schema_meaning_sentenceP", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE?", 6, 0, false);
        declareFunction(me, "sksi_meaning_sentence_has_relevant_predP", "SKSI-MEANING-SENTENCE-HAS-RELEVANT-PRED?", 4, 0, false);
        declareFunction(me, "sksi_translate_decoded_sentence_to_raw_sentence", "SKSI-TRANSLATE-DECODED-SENTENCE-TO-RAW-SENTENCE", 6, 0, false);
        declareFunction(me, "physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL", 2, 0, false);
        declareFunction(me, "physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false);
        declareFunction(me, "sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal", "SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN-INTERNAL", 5, 0, false);
        declareFunction(me, "sksi_decoded_sentence_to_raw_sentence_translation_pattern", "SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN", 5, 0, false);
        declareFunction(me, "maybe_evaluate_field_translation_internal", "MAYBE-EVALUATE-FIELD-TRANSLATION-INTERNAL", 1, 0, false);
        declareFunction(me, "maybe_evaluate_field_translation", "MAYBE-EVALUATE-FIELD-TRANSLATION", 1, 0, false);
        declareFunction(me, "maybe_evaluate_expression", "MAYBE-EVALUATE-EXPRESSION", 1, 0, false);
        declareFunction(me, "sksi_translate_raw_sentence_to_raw_tuple", "SKSI-TRANSLATE-RAW-SENTENCE-TO-RAW-TUPLE", 2, 0, false);
        declareFunction(me, "sksi_raw_sentence_to_raw_tuple_translation_pattern_internal", "SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_raw_sentence_to_raw_tuple_translation_pattern", "SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN", 1, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value", "SKSI-STORE-OR-DELETE-RAW-VALUE", 8, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value_int", "SKSI-STORE-OR-DELETE-RAW-VALUE-INT", 3, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value_db", "SKSI-STORE-OR-DELETE-RAW-VALUE-DB", 2, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value_db_int", "SKSI-STORE-OR-DELETE-RAW-VALUE-DB-INT", 2, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value_fht", "SKSI-STORE-OR-DELETE-RAW-VALUE-FHT", 3, 0, false);
        declareFunction(me, "sksi_store_or_delete_raw_value_cache", "SKSI-STORE-OR-DELETE-RAW-VALUE-CACHE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_incremental_edit_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_incremental_edit_file() {
        memoization_state.note_memoized_function(FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function(RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS);
        memoization_state.note_memoized_function($sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L);
        memoization_state.note_memoized_function(SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN);
        memoization_state.note_memoized_function(MAYBE_EVALUATE_FIELD_TRANSLATION);
        memoization_state.note_memoized_function(SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_incremental_edit_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_incremental_edit_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_incremental_edit_file();
    }

    
}

/**
 * Total time: 805 ms
 */
