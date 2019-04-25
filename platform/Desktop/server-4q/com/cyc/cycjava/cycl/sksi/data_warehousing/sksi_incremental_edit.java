package com.cyc.cycjava.cycl.sksi.data_warehousing;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_testing.sksi_cache;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_incremental_edit extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit";
    public static final String myFingerPrint = "3d9364cd58dd6c84fdb63aa68b3cda835d820681c96b8f1c9fba0d0f07075f7c";
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$INSERT;
    private static final SubLSymbol $kw2$DELETE;
    private static final SubLString $str3$__SKSI__A_;
    private static final SubLString $str4$_sksi_translate_logical_sentence_;
    private static final SubLSymbol $sym5$PHYSICAL_FIELD_INDEXICAL_P;
    private static final SubLString $str6$Could_not_find_indexical_for_phys;
    private static final SubLSymbol $sym7$_EXIT;
    private static final SubLList $list8;
    private static final SubLString $str9$sksi_translate_logical_sentence_t;
    private static final SubLSymbol $sym10$EQUAL_DUPLICATES_;
    private static final SubLSymbol $sym11$SETS_EQUAL_EQUAL_;
    private static final SubLSymbol $sym12$EQUALS_;
    private static final SubLSymbol $sym13$LIST;
    private static final SubLSymbol $kw14$RAW;
    private static final SubLSymbol $sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL;
    private static final SubLObject $const16$fieldEncoding;
    private static final SubLSymbol $kw17$WHAT;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$TRUE;
    private static final SubLSymbol $kw20$GAF_ARG;
    private static final SubLSymbol $kw21$GAF;
    private static final SubLSymbol $kw22$PREDICATE_EXTENT;
    private static final SubLSymbol $kw23$OVERLAP;
    private static final SubLObject $const24$conditionalMeaningSentenceOfSchem;
    private static final SubLObject $const25$equals;
    private static final SubLSymbol $kw26$IGNORE;
    private static final SubLSymbol $sym27$LOGICAL_FIELD_INDEXICAL_SCHEMA;
    private static final SubLSymbol $kw28$UNREFORMULATABLE;
    private static final SubLSymbol $kw29$ENCODE;
    private static final SubLList $list30;
    private static final SubLObject $const31$TheCurrentKnowledgeSource;
    private static final SubLString $str32$sksi_incremental_edit_reformulate;
    private static final SubLObject $const33$indexicalReferent;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$CSQL_TABLE_EXPRESSION_P;
    private static final SubLSymbol $sym36$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $kw37$VALUE;
    private static final SubLSymbol $kw38$BIND;
    private static final SubLSymbol $sym39$FORMULA_OPERATOR;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$TEMPLATE;
    private static final SubLSymbol $sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS;
    private static final SubLSymbol $sym43$LISTP;
    private static final SubLSymbol $sym44$GAF_FORMULA;
    private static final SubLSymbol $sym45$FAST_INTERSECT_;
    private static final SubLSymbol $sym46$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICALS;
    private static final SubLSymbol $sym47$FORMULA_ARG1;
    private static final SubLSymbol $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L;
    private static final SubLSymbol $sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN;
    private static final SubLSymbol $sym50$LFI_FORT_FOR_LFI;
    private static final SubLObject $const51$fieldValue;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$MAYBE_EVALUATE_FIELD_TRANSLATION;
    private static final SubLSymbol $sym54$NON_SKSI_EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $sym55$MAYBE_EVALUATE_EXPRESSION;
    private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN;
    private static final SubLString $str58$_sksi_store_or_delete_raw_value__;
    private static final SubLString $str59$sksi_store_or_delete_raw_value_CS;
    private static final SubLSymbol $kw60$BREAK;
    private static final SubLSymbol $sym61$VALID_SKSI_ERROR_HANDLING_MODE_P;
    private static final SubLString $str62$sksi_store_or_delete_raw_value___;
    private static final SubLString $str63$Invalid_CSQL_expression_at__sksi_;
    private static final SubLObject $const64$Database_Physical;
    private static final SubLObject $const65$FileHashTable_File;
    private static final SubLSymbol $kw66$CACHE;
    private static final SubLString $str67$_sksi_store_or_delete_raw_value_d;
    private static final SubLString $str68$sksi_store_or_delete_raw_value_db;
    private static final SubLList $list69;
    private static final SubLString $str70$malformed_csql_subexpression__a__;
    private static final SubLList $list71;
    private static final SubLString $str72$malformed_csql_expression__a__exp;
    private static final SubLList $list73;
    private static final SubLString $str74$unknown_cache_for_csql__a_and_acc;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 2570L)
    public static SubLObject sksi_store_ist_logical_sentence(final SubLObject ist_logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_incremental_edit.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_incremental_edit.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_ist_logical_sentence_to_raw_tuples(ist_logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_incremental_edit.NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = (SubLObject)sksi_incremental_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            current = current.rest();
            if (sksi_incremental_edit.NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, (SubLObject)sksi_incremental_edit.$kw1$INSERT, csql_conditions);
                if (sksi_incremental_edit.NIL != partial_successP) {
                    successP = partial_successP;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        }
        return Values.values(successP, raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 4057L)
    public static SubLObject sksi_delete_ist_logical_sentence(final SubLObject ist_logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_incremental_edit.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_incremental_edit.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_ist_logical_sentence_to_raw_tuples(ist_logical_sentence, logical_schema, physical_schema, meta_mt, sk_source);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_incremental_edit.NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = (SubLObject)sksi_incremental_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            current = current.rest();
            if (sksi_incremental_edit.NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, (SubLObject)sksi_incremental_edit.$kw2$DELETE, csql_conditions);
                if (sksi_incremental_edit.NIL != partial_successP) {
                    successP = partial_successP;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        }
        return Values.values(successP, raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 5221L)
    public static SubLObject sksi_store_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_incremental_edit.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_incremental_edit.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_incremental_edit.NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = (SubLObject)sksi_incremental_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            current = current.rest();
            if (sksi_incremental_edit.NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, (SubLObject)sksi_incremental_edit.$kw1$INSERT, csql_conditions);
                if (sksi_incremental_edit.NIL != partial_successP) {
                    successP = partial_successP;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        }
        return Values.values(successP, raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 6484L)
    public static SubLObject sksi_delete_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject meta_mt, SubLObject access_path) {
        if (meta_mt == sksi_incremental_edit.UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        if (access_path == sksi_incremental_edit.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = raw_tuples;
        SubLObject raw_tuple_conditions_pair = (SubLObject)sksi_incremental_edit.NIL;
        raw_tuple_conditions_pair = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = raw_tuple_conditions_pair;
            SubLObject raw_tuple = (SubLObject)sksi_incremental_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            raw_tuple = current.first();
            current = current.rest();
            final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list0);
            current = current.rest();
            if (sksi_incremental_edit.NIL == current) {
                final SubLObject partial_successP = sksi_store_or_delete_raw_value(sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, (SubLObject)sksi_incremental_edit.$kw2$DELETE, csql_conditions);
                if (sksi_incremental_edit.NIL != partial_successP) {
                    successP = partial_successP;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_tuple_conditions_pair = cdolist_list_var.first();
        }
        return Values.values(successP, raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 7630L)
    public static SubLObject sksi_translate_ist_logical_sentence_to_raw_tuples(final SubLObject ist_logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_sentence = cycl_utilities.formula_arg2(ist_logical_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject raw_tuples = sksi_translate_logical_sentence_to_raw_tuples(logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject physical_fields = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 8412L)
    public static SubLObject sksi_translate_logical_sentence_to_raw_tuples(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject sk_source, SubLObject rewrite_cmses_with_set_arg3sP) {
        if (rewrite_cmses_with_set_arg3sP == sksi_incremental_edit.UNPROVIDED) {
            rewrite_cmses_with_set_arg3sP = (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str4$_sksi_translate_logical_sentence_), new SubLObject[] { sksi_incremental_edit.NINE_INTEGER, logical_sentence, logical_schema, physical_schema, meta_mt, sk_source, rewrite_cmses_with_set_arg3sP });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject raw_tuples = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject physical_fields = (SubLObject)sksi_incremental_edit.NIL;
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
                    if (sksi_incremental_edit.NIL == list_utilities.every_in_list((SubLObject)sksi_incremental_edit.$sym5$PHYSICAL_FIELD_INDEXICAL_P, relevant_pf_indexicals, (SubLObject)sksi_incremental_edit.UNPROVIDED)) {
                        SubLObject physical_field = (SubLObject)sksi_incremental_edit.NIL;
                        SubLObject physical_field_$2 = (SubLObject)sksi_incremental_edit.NIL;
                        SubLObject relevant_pf_indexical = (SubLObject)sksi_incremental_edit.NIL;
                        SubLObject relevant_pf_indexical_$3 = (SubLObject)sksi_incremental_edit.NIL;
                        physical_field = physical_fields;
                        physical_field_$2 = physical_field.first();
                        relevant_pf_indexical = relevant_pf_indexicals;
                        relevant_pf_indexical_$3 = relevant_pf_indexical.first();
                        while (sksi_incremental_edit.NIL != relevant_pf_indexical || sksi_incremental_edit.NIL != physical_field) {
                            if (sksi_incremental_edit.NIL == sksi_kb_accessors.physical_field_indexical_p(relevant_pf_indexical_$3)) {
                                sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str6$Could_not_find_indexical_for_phys, format_nil.format_nil_s_no_copy(physical_field_$2)));
                            }
                            physical_field = physical_field.rest();
                            physical_field_$2 = physical_field.first();
                            relevant_pf_indexical = relevant_pf_indexical.rest();
                            relevant_pf_indexical_$3 = relevant_pf_indexical.first();
                        }
                        return Values.values((SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.NIL);
                    }
                    thread.resetMultipleValues();
                    final SubLObject relevant_logical_field_indexicals_lists = logical_schema_field_indexicals_relevant_to_logical_sentence(logical_sentence, logical_schema, physical_schema, sk_source, rewrite_cmses_with_set_arg3sP);
                    final SubLObject ambiguous_variants_of_logical_sentence = thread.secondMultipleValue();
                    final SubLObject new_cms_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var = relevant_logical_field_indexicals_lists;
                    SubLObject relevant_logical_field_indexicals_list = (SubLObject)sksi_incremental_edit.NIL;
                    relevant_logical_field_indexicals_list = cdolist_list_var.first();
                    while (sksi_incremental_edit.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$4 = ambiguous_variants_of_logical_sentence;
                        SubLObject each_logical_sentence = (SubLObject)sksi_incremental_edit.NIL;
                        each_logical_sentence = cdolist_list_var_$4.first();
                        while (sksi_incremental_edit.NIL != cdolist_list_var_$4) {
                            SubLObject cdolist_list_var_$5;
                            final SubLObject decoded_sentences = cdolist_list_var_$5 = sksi_translate_logical_sentence_to_decoded_sentences(each_logical_sentence, logical_schema, physical_schema, relevant_logical_field_indexicals_list, content_mt, meta_mt, new_cms_list);
                            SubLObject decoded_sentence_conditions_pair = (SubLObject)sksi_incremental_edit.NIL;
                            decoded_sentence_conditions_pair = cdolist_list_var_$5.first();
                            while (sksi_incremental_edit.NIL != cdolist_list_var_$5) {
                                SubLObject current;
                                final SubLObject datum = current = decoded_sentence_conditions_pair;
                                SubLObject decoded_sentence = (SubLObject)sksi_incremental_edit.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list8);
                                decoded_sentence = current.first();
                                current = current.rest();
                                final SubLObject csql_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list8);
                                current = current.rest();
                                if (sksi_incremental_edit.NIL == current) {
                                    SubLObject cdolist_list_var_$6;
                                    final SubLObject reformulated_decoded_sentences = cdolist_list_var_$6 = sksi_incremental_edit_reformulate_decoded_sentence(decoded_sentence, logical_schema, physical_schema, sk_source);
                                    SubLObject ref_decoded_sentence = (SubLObject)sksi_incremental_edit.NIL;
                                    ref_decoded_sentence = cdolist_list_var_$6.first();
                                    while (sksi_incremental_edit.NIL != cdolist_list_var_$6) {
                                        final SubLObject raw_sentence = sksi_translate_decoded_sentence_to_raw_sentence(ref_decoded_sentence, physical_schema, relevant_pf_indexicals, logical_schema, relevant_logical_field_indexicals_list, sk_source);
                                        if (sksi_incremental_edit.NIL != raw_sentence) {
                                            final SubLObject raw_tuple = sksi_translate_raw_sentence_to_raw_tuple(raw_sentence, relevant_pf_indexicals);
                                            if (sksi_incremental_edit.NIL != csql_conditions) {
                                                raw_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(raw_tuple, csql_conditions), raw_tuples);
                                            }
                                            else {
                                                raw_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(raw_tuple), raw_tuples);
                                            }
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        ref_decoded_sentence = cdolist_list_var_$6.first();
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list8);
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
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        raw_tuples = list_utilities.fast_delete_duplicates(raw_tuples, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str9$sksi_translate_logical_sentence_t), new SubLObject[] { sksi_incremental_edit.NINE_INTEGER, raw_tuples, physical_schema });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return Values.values(raw_tuples, physical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 11634L)
    public static SubLObject logical_schema_field_indexicals_relevant_to_logical_sentence(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject rewrite_cmses_with_set_arg3sP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subsentences = (SubLObject)((sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED) : ConsesLow.list(logical_sentence));
        final SubLObject ambiguous_subsentences_table = dictionary.new_dictionary((SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        SubLObject unambiguous_subsentences = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject unambiguous_logical_field_indexicals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject ambiguous_logical_field_indexicals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject exclusive_lfi_list = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject logical_field_indexicals_lists = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject ambiguous_variants_of_logical_sentence = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject pred_to_meaning_sentences_table = meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema(logical_sentence, logical_schema, physical_schema, sk_source, rewrite_cmses_with_set_arg3sP);
        final SubLObject new_cms_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = subsentences;
        SubLObject sentence = (SubLObject)sksi_incremental_edit.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_operator(sentence);
            final SubLObject meaning_sentence_args_lists = map_pred_to_logical_field_indexical_tuples_from_meaning_sentences(pred_to_meaning_sentences_table, pred);
            SubLObject logical_field_indexicals_appearing_in_all = list_utilities.intersect_all(meaning_sentence_args_lists, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED);
            SubLObject logical_field_indexicals_appearing_in_some = (SubLObject)sksi_incremental_edit.NIL;
            if (sksi_incremental_edit.NIL != list_utilities.singletonP(meaning_sentence_args_lists)) {
                unambiguous_subsentences = (SubLObject)ConsesLow.cons(sentence, unambiguous_subsentences);
                if (sksi_incremental_edit.NIL != list_utilities.singletonP(subsentences)) {
                    logical_field_indexicals_appearing_in_all = (SubLObject)sksi_incremental_edit.NIL;
                }
            }
            SubLObject cdolist_list_var_$8 = meaning_sentence_args_lists;
            SubLObject arg_list = (SubLObject)sksi_incremental_edit.NIL;
            arg_list = cdolist_list_var_$8.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$8) {
                final SubLObject lfis_appearing_in_some = list_utilities.fast_set_difference(arg_list, logical_field_indexicals_appearing_in_all, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL));
                if (sksi_incremental_edit.NIL != lfis_appearing_in_some) {
                    logical_field_indexicals_appearing_in_some = (SubLObject)ConsesLow.cons(lfis_appearing_in_some, logical_field_indexicals_appearing_in_some);
                    dictionary_utilities.dictionary_push(ambiguous_subsentences_table, pred, sentence);
                }
                else if (sksi_incremental_edit.NIL != list_utilities.fast_sets_equalP(arg_list, logical_field_indexicals_appearing_in_all, (SubLObject)sksi_incremental_edit.UNPROVIDED)) {
                    exclusive_lfi_list = arg_list;
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                arg_list = cdolist_list_var_$8.first();
            }
            unambiguous_logical_field_indexicals = ConsesLow.nconc(unambiguous_logical_field_indexicals, logical_field_indexicals_appearing_in_all);
            if (sksi_incremental_edit.NIL != logical_field_indexicals_appearing_in_some) {
                ambiguous_logical_field_indexicals = (SubLObject)ConsesLow.cons(logical_field_indexicals_appearing_in_some, ambiguous_logical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        unambiguous_subsentences = list_utilities.fast_delete_duplicates(unambiguous_subsentences, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        ambiguous_variants_of_logical_sentence = compute_ambiguous_variants_of_logical_sentence(logical_sentence, ambiguous_subsentences_table, unambiguous_subsentences);
        unambiguous_logical_field_indexicals = list_utilities.fast_delete_duplicates(unambiguous_logical_field_indexicals, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        ambiguous_logical_field_indexicals = list_utilities.fast_delete_duplicates(Sequences.remove_if((SubLObject)sksi_incremental_edit.$sym10$EQUAL_DUPLICATES_, list_utilities.cross_products(ambiguous_logical_field_indexicals), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), (SubLObject)sksi_incremental_edit.$sym11$SETS_EQUAL_EQUAL_, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        logical_field_indexicals_lists = compute_possible_logical_field_indexicals_lists(ambiguous_logical_field_indexicals, unambiguous_logical_field_indexicals, (SubLObject)((sksi_incremental_edit.NIL != list_utilities.lengthE(subsentences, (SubLObject)sksi_incremental_edit.ONE_INTEGER, (SubLObject)sksi_incremental_edit.UNPROVIDED)) ? exclusive_lfi_list : sksi_incremental_edit.NIL));
        return Values.values(list_utilities.fast_delete_duplicates(logical_field_indexicals_lists, (SubLObject)sksi_incremental_edit.$sym11$SETS_EQUAL_EQUAL_, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), list_utilities.fast_delete_duplicates(ambiguous_variants_of_logical_sentence, (SubLObject)sksi_incremental_edit.$sym12$EQUALS_, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), new_cms_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 15362L)
    public static SubLObject map_pred_to_logical_field_indexical_tuples_from_meaning_sentences(final SubLObject pred_to_meaning_sentences_table, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dictionary_result = dictionary.dictionary_lookup_without_values(pred_to_meaning_sentences_table, pred, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL != dictionary_result) {
            return extract_logical_field_indexicals_from_meaning_sentences(dictionary_result);
        }
        SubLObject new_result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pred_to_meaning_sentences_table)); sksi_incremental_edit.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject meaning_sentences = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_incremental_edit.NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred)) {
                final SubLObject filtered_meaning_sentences = filter_meaning_sentences_by_pred_arity(meaning_sentences, pred);
                new_result = ConsesLow.append(filtered_meaning_sentences, new_result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return extract_logical_field_indexicals_from_meaning_sentences(new_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 16216L)
    public static SubLObject filter_meaning_sentences_by_pred_arity(final SubLObject meaning_sentences, final SubLObject pred) {
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject sentence = (SubLObject)sksi_incremental_edit.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            final SubLObject meaning_sentence_arity = el_utilities.formula_arity(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            if (sksi_incremental_edit.NIL != arity.arity_admitsP(pred, meaning_sentence_arity)) {
                result = (SubLObject)ConsesLow.cons(sentence, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 16537L)
    public static SubLObject extract_logical_field_indexicals_from_meaning_sentences(final SubLObject meaning_sentences) {
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject sentence = (SubLObject)sksi_incremental_edit.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(sentence), result);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 16800L)
    public static SubLObject compute_possible_logical_field_indexicals_lists(final SubLObject ambiguous_logical_field_indexicals, final SubLObject unambiguous_logical_field_indexicals, final SubLObject exclusive_lfi_list) {
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == ambiguous_logical_field_indexicals) {
            result = (SubLObject)ConsesLow.list(Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_incremental_edit.$sym13$LIST), unambiguous_logical_field_indexicals));
        }
        SubLObject cdolist_list_var = ambiguous_logical_field_indexicals;
        SubLObject each_ambiguous_lfi_set = (SubLObject)sksi_incremental_edit.NIL;
        each_ambiguous_lfi_set = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(ConsesLow.append(each_ambiguous_lfi_set, unambiguous_logical_field_indexicals), result);
            cdolist_list_var = cdolist_list_var.rest();
            each_ambiguous_lfi_set = cdolist_list_var.first();
        }
        if (sksi_incremental_edit.NIL != exclusive_lfi_list) {
            result = (SubLObject)ConsesLow.cons(exclusive_lfi_list, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 17392L)
    public static SubLObject meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject rewrite_cmses_with_set_arg3sP) {
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.T, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject cms_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_incremental_edit.T, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.NIL);
        SubLObject pred_to_meaning_sentences_table = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQ), Sequences.length(meaning_sentences));
        SubLObject new_cms_list = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject meaning_sentence = (SubLObject)sksi_incremental_edit.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            if (sksi_incremental_edit.NIL != meaning_sentence_appropriate_for_logical_sentenceP(meaning_sentence, logical_sentence, sk_source)) {
                pred_to_meaning_sentences_table = add_meaning_sentence_to_meaning_sentence_predicate_table(meaning_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        cdolist_list_var = cms_gafs;
        SubLObject cms_gaf = (SubLObject)sksi_incremental_edit.NIL;
        cms_gaf = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            if (sksi_incremental_edit.NIL != list_utilities.singletonP(sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf))) {
                pred_to_meaning_sentences_table = maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, (SubLObject)sksi_incremental_edit.UNPROVIDED), logical_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema, sk_source);
            }
            else if (sksi_incremental_edit.NIL != rewrite_cmses_with_set_arg3sP) {
                final SubLObject new_sentence = rewrite_conditional_meaning_sentence(cms_gaf);
                if (sksi_incremental_edit.NIL != new_sentence) {
                    pred_to_meaning_sentences_table = maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(cycl_utilities.formula_arg4(new_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED), logical_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema, sk_source);
                    new_cms_list = (SubLObject)ConsesLow.cons(new_sentence, new_cms_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cms_gaf = cdolist_list_var.first();
        }
        if (sksi_incremental_edit.NIL != sksi_database_fusion.sksi_database_fusion_debugP()) {
            dictionary_utilities.print_dictionary_contents(pred_to_meaning_sentences_table, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        return Values.values(pred_to_meaning_sentences_table, new_cms_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 19314L)
    public static SubLObject maybe_add_meaning_sentence_to_meaning_sentence_predicate_table(final SubLObject meaning_sentence, final SubLObject logical_sentence, SubLObject pred_to_meaning_sentences_table, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source) {
        if (sksi_incremental_edit.NIL != meaning_sentence_appropriate_for_logical_sentenceP(meaning_sentence, logical_sentence, sk_source)) {
            pred_to_meaning_sentences_table = add_meaning_sentence_to_meaning_sentence_predicate_table(meaning_sentence, pred_to_meaning_sentences_table, logical_schema, physical_schema);
        }
        return pred_to_meaning_sentences_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 19991L)
    public static SubLObject add_meaning_sentence_to_meaning_sentence_predicate_table(final SubLObject meaning_sentence, final SubLObject pred_to_meaning_sentences_table, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject pred = cycl_utilities.formula_operator(meaning_sentence);
        if (sksi_incremental_edit.NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
            SubLObject cdolist_list_var;
            final SubLObject pred_list = cdolist_list_var = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            SubLObject each_pred = (SubLObject)sksi_incremental_edit.NIL;
            each_pred = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, each_pred, meaning_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                each_pred = cdolist_list_var.first();
            }
            dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, pred, meaning_sentence);
        }
        else {
            dictionary_utilities.dictionary_push(pred_to_meaning_sentences_table, pred, meaning_sentence);
        }
        return pred_to_meaning_sentences_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 20680L)
    public static SubLObject meaning_sentence_pred_appropriate_for_logical_sentence_predP(final SubLObject meaning_sentence_pred, final SubLObject asent_pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(meaning_sentence_pred.eql(asent_pred) || sksi_incremental_edit.NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 20902L)
    public static SubLObject meaning_sentence_appropriate_for_logical_sentenceP(final SubLObject meaning_sentence, final SubLObject logical_sentence, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL == el_utilities.el_conjunction_p(logical_sentence) && sksi_incremental_edit.NIL == meaning_sentence_pred_appropriate_for_logical_sentence_predP(cycl_utilities.formula_operator(meaning_sentence), cycl_utilities.formula_operator(logical_sentence))) {
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLObject logical_sentence_conjuncts = (SubLObject)((sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED) : ConsesLow.list(logical_sentence));
        SubLObject appropriateP = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == appropriateP) {
            SubLObject csome_list_var;
            SubLObject conjunct;
            for (csome_list_var = logical_sentence_conjuncts, conjunct = (SubLObject)sksi_incremental_edit.NIL, conjunct = csome_list_var.first(); sksi_incremental_edit.NIL == appropriateP && sksi_incremental_edit.NIL != csome_list_var; appropriateP = sksi_meaning_sentence_utilities.meaning_sentence_type_check(conjunct, meaning_sentence, (SubLObject)sksi_incremental_edit.NIL, sksi_kb_accessors.sk_source_content_mt(sk_source), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)sksi_incremental_edit.$kw14$RAW, (SubLObject)sksi_incremental_edit.T, (SubLObject)sksi_incremental_edit.T), csome_list_var = csome_list_var.rest(), conjunct = csome_list_var.first()) {}
        }
        return appropriateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 21791L)
    public static SubLObject compute_ambiguous_variants_of_logical_sentence(final SubLObject logical_sentence, final SubLObject ambiguous_subsentences_table, final SubLObject unambiguous_subsentences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject complex_operator = (SubLObject)((sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_operator(logical_sentence) : sksi_incremental_edit.NIL);
        SubLObject ambiguous_subsentences = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject ambiguous_variants_of_logical_sentence = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(ambiguous_subsentences_table)); sksi_incremental_edit.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject ambiguous_subsentences_with_pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ambiguous_subsentences = ConsesLow.nconc(ambiguous_subsentences, list_utilities.permute_list(list_utilities.fast_delete_duplicates(ambiguous_subsentences_with_pred, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), (SubLObject)sksi_incremental_edit.UNPROVIDED));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var;
        ambiguous_subsentences = (cdolist_list_var = Sequences.remove_if((SubLObject)sksi_incremental_edit.$sym10$EQUAL_DUPLICATES_, list_utilities.cross_products(ambiguous_subsentences), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED));
        SubLObject each_ambiguous_permutation = (SubLObject)sksi_incremental_edit.NIL;
        each_ambiguous_permutation = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject each_logical_variant = ConsesLow.append(each_ambiguous_permutation, unambiguous_subsentences);
            if (sksi_incremental_edit.NIL != complex_operator) {
                each_logical_variant = el_utilities.make_formula(complex_operator, each_logical_variant, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            }
            if (sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(each_logical_variant)) {
                ambiguous_variants_of_logical_sentence = (SubLObject)ConsesLow.cons(each_logical_variant, ambiguous_variants_of_logical_sentence);
            }
            else {
                ambiguous_variants_of_logical_sentence = ConsesLow.nconc(ambiguous_variants_of_logical_sentence, each_logical_variant);
            }
            cdolist_list_var = cdolist_list_var.rest();
            each_ambiguous_permutation = cdolist_list_var.first();
        }
        if (sksi_incremental_edit.NIL == ambiguous_variants_of_logical_sentence) {
            ambiguous_variants_of_logical_sentence = (SubLObject)ConsesLow.list(logical_sentence);
        }
        return ambiguous_variants_of_logical_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 23184L)
    public static SubLObject field_encodings_relevant_to_logical_field_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical);
        SubLObject v_answer = (SubLObject)sksi_incremental_edit.NIL;
        final SubLObject l_index = kb_indexing.best_gaf_lookup_index((SubLObject)ConsesLow.listS(sksi_incremental_edit.$const16$fieldEncoding, physical_schema, (SubLObject)sksi_incremental_edit.$kw17$WHAT, logical_schema, (SubLObject)sksi_incremental_edit.$list18), (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw20$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (sksi_incremental_edit.NIL != argnum) {
                if (sksi_incremental_edit.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (sksi_incremental_edit.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)sksi_incremental_edit.NIL;
                        final SubLObject token_var = (SubLObject)sksi_incremental_edit.NIL;
                        while (sksi_incremental_edit.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_incremental_edit.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)sksi_incremental_edit.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_incremental_edit.$kw21$GAF, (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
                                    SubLObject done_var_$9 = (SubLObject)sksi_incremental_edit.NIL;
                                    final SubLObject token_var_$10 = (SubLObject)sksi_incremental_edit.NIL;
                                    while (sksi_incremental_edit.NIL == done_var_$9) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                        final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(ass));
                                        if (sksi_incremental_edit.NIL != valid_$11 && physical_schema.eql(assertions_high.gaf_arg1(ass)) && logical_schema.eql(assertions_high.gaf_arg3(ass)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid_$11);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (sksi_incremental_edit.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)sksi_incremental_edit.NIL;
                    if (sksi_incremental_edit.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)sksi_incremental_edit.NIL;
                        final SubLObject token_var = (SubLObject)sksi_incremental_edit.NIL;
                        while (sksi_incremental_edit.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sksi_incremental_edit.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)sksi_incremental_edit.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_incremental_edit.$kw21$GAF, (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
                                    SubLObject done_var_$10 = (SubLObject)sksi_incremental_edit.NIL;
                                    final SubLObject token_var_$11 = (SubLObject)sksi_incremental_edit.NIL;
                                    while (sksi_incremental_edit.NIL == done_var_$10) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                        final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(ass));
                                        if (sksi_incremental_edit.NIL != valid_$12 && physical_schema.eql(assertions_high.gaf_arg1(ass)) && logical_schema.eql(assertions_high.gaf_arg3(ass)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                                            final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                            final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                            v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe, pf_indexical), v_answer);
                                        }
                                        done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid_$12);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (sksi_incremental_edit.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid);
                        }
                    }
                }
            }
            else if (sksi_incremental_edit.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (sksi_incremental_edit.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)sksi_incremental_edit.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)sksi_incremental_edit.NIL, pred_var);
                    SubLObject done_var = (SubLObject)sksi_incremental_edit.NIL;
                    final SubLObject token_var = (SubLObject)sksi_incremental_edit.NIL;
                    while (sksi_incremental_edit.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_incremental_edit.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_incremental_edit.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_incremental_edit.$kw21$GAF, (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
                                SubLObject done_var_$11 = (SubLObject)sksi_incremental_edit.NIL;
                                final SubLObject token_var_$12 = (SubLObject)sksi_incremental_edit.NIL;
                                while (sksi_incremental_edit.NIL == done_var_$11) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(ass));
                                    if (sksi_incremental_edit.NIL != valid_$13 && physical_schema.eql(assertions_high.gaf_arg1(ass)) && logical_schema.eql(assertions_high.gaf_arg3(ass)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                                        final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                        final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe, pf_indexical), v_answer);
                                    }
                                    done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid_$13);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (sksi_incremental_edit.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)sksi_incremental_edit.NIL;
                if (sksi_incremental_edit.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)sksi_incremental_edit.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)sksi_incremental_edit.NIL, pred_var);
                    SubLObject done_var = (SubLObject)sksi_incremental_edit.NIL;
                    final SubLObject token_var = (SubLObject)sksi_incremental_edit.NIL;
                    while (sksi_incremental_edit.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (sksi_incremental_edit.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)sksi_incremental_edit.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_incremental_edit.$kw21$GAF, (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
                                SubLObject done_var_$12 = (SubLObject)sksi_incremental_edit.NIL;
                                final SubLObject token_var_$13 = (SubLObject)sksi_incremental_edit.NIL;
                                while (sksi_incremental_edit.NIL == done_var_$12) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$13.eql(ass));
                                    if (sksi_incremental_edit.NIL != valid_$14 && physical_schema.eql(assertions_high.gaf_arg1(ass)) && logical_schema.eql(assertions_high.gaf_arg3(ass)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                                        final SubLObject logical_recipe = assertions_high.gaf_arg4(ass);
                                        final SubLObject pf_indexical = assertions_high.gaf_arg2(ass);
                                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe, pf_indexical), v_answer);
                                    }
                                    done_var_$12 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid_$14);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (sksi_incremental_edit.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw22$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (sksi_incremental_edit.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)sksi_incremental_edit.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)sksi_incremental_edit.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)sksi_incremental_edit.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)sksi_incremental_edit.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((sksi_incremental_edit.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : sksi_incremental_edit.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)sksi_incremental_edit.NIL;
                    final SubLObject token_var2 = (SubLObject)sksi_incremental_edit.NIL;
                    while (sksi_incremental_edit.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (sksi_incremental_edit.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)sksi_incremental_edit.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)sksi_incremental_edit.$kw21$GAF, (SubLObject)sksi_incremental_edit.$kw19$TRUE, (SubLObject)sksi_incremental_edit.NIL);
                                SubLObject done_var_$13 = (SubLObject)sksi_incremental_edit.NIL;
                                final SubLObject token_var_$14 = (SubLObject)sksi_incremental_edit.NIL;
                                while (sksi_incremental_edit.NIL == done_var_$13) {
                                    final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$14);
                                    final SubLObject valid_$15 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$14.eql(ass2));
                                    if (sksi_incremental_edit.NIL != valid_$15 && physical_schema.eql(assertions_high.gaf_arg1(ass2)) && logical_schema.eql(assertions_high.gaf_arg3(ass2)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass2), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                                        final SubLObject logical_recipe2 = assertions_high.gaf_arg4(ass2);
                                        final SubLObject pf_indexical2 = assertions_high.gaf_arg2(ass2);
                                        v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe2, pf_indexical2), v_answer);
                                    }
                                    done_var_$13 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid_$15);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (sksi_incremental_edit.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw23$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)sksi_incremental_edit.UNPROVIDED);
            SubLObject ass3 = (SubLObject)sksi_incremental_edit.NIL;
            ass3 = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                if (sksi_incremental_edit.NIL != assertions_high.assertion_has_truth(ass3, (SubLObject)sksi_incremental_edit.$kw19$TRUE) && physical_schema.eql(assertions_high.gaf_arg1(ass3)) && logical_schema.eql(assertions_high.gaf_arg3(ass3)) && list_utilities.tree_count(logical_field_indexical_fort, assertions_high.gaf_arg4(ass3), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED).isPositive()) {
                    final SubLObject logical_recipe3 = assertions_high.gaf_arg4(ass3);
                    final SubLObject pf_indexical3 = assertions_high.gaf_arg2(ass3);
                    v_answer = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(logical_recipe3, pf_indexical3), v_answer);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 23184L)
    public static SubLObject field_encodings_relevant_to_logical_field_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return field_encodings_relevant_to_logical_field_indexical_internal(logical_field_indexical, logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_incremental_edit.THREE_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQ, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_field_indexical, logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_incremental_edit.NIL;
            collision = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schema.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_incremental_edit.NIL != cached_args && sksi_incremental_edit.NIL == cached_args.rest() && physical_schema.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(field_encodings_relevant_to_logical_field_indexical_internal(logical_field_indexical, logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 23960L)
    public static SubLObject rewrite_conditional_meaning_sentence(final SubLObject cms_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_cms = (SubLObject)sksi_incremental_edit.NIL;
        final SubLObject antecedent_logical_schemata = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
        final SubLObject consequent_logical_schemata = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(cms_gaf);
        final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject asent_arg = sksi_cross_editing.asent_args_of_sentence(consequent_meaning_sentence).first();
        if (sksi_incremental_edit.NIL != asent_arg) {
            final SubLObject asent_arg_ls = guess_ls_for_meaning_sentence(asent_arg);
            if (sksi_incremental_edit.NIL != asent_arg_ls) {
                final SubLObject ls_ps_list = sksi_kb_accessors.logical_schema_physical_schemata(asent_arg_ls);
                SubLObject asent_arg_ps = (SubLObject)sksi_incremental_edit.NIL;
                if (sksi_incremental_edit.NIL == asent_arg_ps) {
                    SubLObject csome_list_var = ls_ps_list;
                    SubLObject ps = (SubLObject)sksi_incremental_edit.NIL;
                    ps = csome_list_var.first();
                    while (sksi_incremental_edit.NIL == asent_arg_ps && sksi_incremental_edit.NIL != csome_list_var) {
                        if (sksi_incremental_edit.NIL != sksi_kb_accessors.physical_schema_sk_sources_memoized(ps)) {
                            asent_arg_ps = ps;
                        }
                        csome_list_var = csome_list_var.rest();
                        ps = csome_list_var.first();
                    }
                }
                if (sksi_incremental_edit.NIL != asent_arg_ps) {
                    final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key(asent_arg_ps);
                    if (sksi_incremental_edit.NIL != primary_key) {
                        final SubLObject pkey_elem = primary_key.first();
                        final SubLObject pkey_elem_pfi = sksi_kb_accessors.indexical_for_physical_field(pkey_elem);
                        final SubLObject pkey_elem_lfi = physical_field_indexical_logical_field_indexicals(pkey_elem_pfi, asent_arg_ps, asent_arg_ls).first();
                        thread.resetMultipleValues();
                        final SubLObject new_lfi = antecedent_meaning_sentence_constraining_lfi_as_lfi(antecedent_meaning_sentence, pkey_elem_lfi, consequent_logical_schemata);
                        final SubLObject new_antecedent = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject new_lfi_ls = sksi_kb_accessors.logical_field_indexical_schema(new_lfi);
                        new_cms = el_utilities.make_el_formula(sksi_incremental_edit.$const24$conditionalMeaningSentenceOfSchem, (SubLObject)ConsesLow.list(el_utilities.make_el_set(antecedent_logical_schemata, (SubLObject)sksi_incremental_edit.UNPROVIDED), new_antecedent, new_lfi_ls, cycl_utilities.expression_subst(new_lfi, asent_arg, consequent_meaning_sentence, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED)), (SubLObject)sksi_incremental_edit.UNPROVIDED);
                    }
                }
            }
        }
        return new_cms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 25702L)
    public static SubLObject antecedent_meaning_sentence_constraining_lfi_as_lfi(final SubLObject sentence, final SubLObject lfi, final SubLObject logical_schemata) {
        if (sksi_incremental_edit.NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, sksi_incremental_edit.$const25$equals)) {
            return Values.values(atomic_sentence_constraining_lfi_as_lfi(sentence, lfi, logical_schemata), (SubLObject)sksi_incremental_edit.NIL);
        }
        if (sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject constrained_lfi = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject new_sentence = (SubLObject)sksi_incremental_edit.NIL;
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_incremental_edit.$kw26$IGNORE);
            SubLObject rest;
            SubLObject subsentence;
            for (rest = (SubLObject)sksi_incremental_edit.NIL, rest = args; sksi_incremental_edit.NIL == constrained_lfi && sksi_incremental_edit.NIL != rest; constrained_lfi = antecedent_meaning_sentence_constraining_lfi_as_lfi(subsentence, lfi, logical_schemata), new_sentence = el_utilities.make_el_formula(cycl_utilities.formula_operator(sentence), Sequences.remove(subsentence, cycl_utilities.formula_args(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), (SubLObject)sksi_incremental_edit.UNPROVIDED), rest = rest.rest()) {
                subsentence = rest.first();
            }
            return Values.values(constrained_lfi, new_sentence);
        }
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 26407L)
    public static SubLObject atomic_sentence_constraining_lfi_as_lfi(final SubLObject sentence, final SubLObject lfi, final SubLObject logical_schemata) {
        if (cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED).eql(lfi) && sksi_incremental_edit.NIL != sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED)) && sksi_incremental_edit.NIL != list_utilities.member_eqP(sksi_kb_accessors.logical_field_indexical_schema(cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED)), logical_schemata)) {
            return cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        if (cycl_utilities.atomic_sentence_arg2(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED).eql(lfi) && sksi_incremental_edit.NIL != sksi_kb_accessors.logical_field_indexical_p(cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED)) && sksi_incremental_edit.NIL != list_utilities.member_eqP(sksi_kb_accessors.logical_field_indexical_schema(cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED)), logical_schemata)) {
            return cycl_utilities.atomic_sentence_arg1(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 27009L)
    public static SubLObject physical_field_indexical_logical_field_indexicals(final SubLObject pfi, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
        SubLObject lfi_list = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = field_encodings;
        SubLObject encoding = (SubLObject)sksi_incremental_edit.NIL;
        encoding = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            lfi_list = ConsesLow.append(sksi_infrastructure_utilities.expression_logical_field_indexicals(encoding, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), lfi_list);
            cdolist_list_var = cdolist_list_var.rest();
            encoding = cdolist_list_var.first();
        }
        return lfi_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 27407L)
    public static SubLObject guess_ls_for_meaning_sentence(final SubLObject sentence) {
        final SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject ls_list = list_utilities.fast_delete_duplicates(Mapping.mapcar((SubLObject)sksi_incremental_edit.$sym27$LOGICAL_FIELD_INDEXICAL_SCHEMA, lfi_list), Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQ), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject ls = (SubLObject)((sksi_incremental_edit.NIL != list_utilities.singletonP(ls_list)) ? ls_list.first() : sksi_incremental_edit.NIL);
        return ls;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 27707L)
    public static SubLObject sksi_incremental_edit_reformulate(final SubLObject logical_value, final SubLObject logical_field_indexical, final SubLObject field_encoding, final SubLObject sk_source) {
        SubLObject pf_indexical_subst = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL != sksi_infrastructure_utilities.code_mapping_expressionP(field_encoding)) {
            pf_indexical_subst = sksi_data_warehousing_utilities.sksi_encode_memoized(logical_value, cycl_utilities.formula_arg1(field_encoding, (SubLObject)sksi_incremental_edit.UNPROVIDED), sk_source, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        if (sksi_incremental_edit.NIL == pf_indexical_subst || pf_indexical_subst == sksi_incremental_edit.$kw28$UNREFORMULATABLE) {
            final SubLObject temp_pf_indexical_subst = cycl_utilities.expression_subst(logical_value, sksi_kb_accessors.lfi_fort_for_lfi(logical_field_indexical), field_encoding, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            pf_indexical_subst = sksi_reformulate.sksi_reformulate(temp_pf_indexical_subst, (SubLObject)sksi_incremental_edit.$kw29$ENCODE, sk_source);
        }
        return pf_indexical_subst;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 28586L)
    public static SubLObject sksi_incremental_edit_reformulate_decoded_sentence(final SubLObject decoded_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL == decoded_sentence) {
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLObject sub_sentences = cycl_utilities.formula_args(decoded_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        SubLObject result_sub_sentences = (SubLObject)sksi_incremental_edit.NIL;
        final SubLObject genl_ks = sksi_kb_accessors.max_genl_ks(sk_source);
        SubLObject failP = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == failP) {
            SubLObject csome_list_var = sub_sentences;
            SubLObject sub_sentence = (SubLObject)sksi_incremental_edit.NIL;
            sub_sentence = csome_list_var.first();
            while (sksi_incremental_edit.NIL == failP && sksi_incremental_edit.NIL != csome_list_var) {
                SubLObject result_sub_sentence_list = (SubLObject)sksi_incremental_edit.NIL;
                final SubLObject logical_field_indexical = cycl_utilities.formula_arg1(sub_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                final SubLObject logical_value = cycl_utilities.formula_arg2(sub_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(logical_field_indexical, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
                final SubLObject relevant_field_encoding_pf_indexical_pairs = field_encodings_relevant_to_logical_field_indexical(logical_field_indexical, logical_schema, physical_schema);
                if (sksi_incremental_edit.NIL == result_sub_sentence_list) {
                    SubLObject csome_list_var_$25 = field_decodings;
                    SubLObject field_decoding = (SubLObject)sksi_incremental_edit.NIL;
                    field_decoding = csome_list_var_$25.first();
                    while (sksi_incremental_edit.NIL == result_sub_sentence_list && sksi_incremental_edit.NIL != csome_list_var_$25) {
                        final SubLObject simplified_decoding = maybe_evaluate_field_translation(field_decoding);
                        SubLObject logical_value_substs = (SubLObject)ConsesLow.list(el_utilities.copy_expression(simplified_decoding));
                        SubLObject foundP = (SubLObject)sksi_incremental_edit.NIL;
                        SubLObject cdolist_list_var = relevant_field_encoding_pf_indexical_pairs;
                        SubLObject relevant_field_encoding_pf_indexical_pair = (SubLObject)sksi_incremental_edit.NIL;
                        relevant_field_encoding_pf_indexical_pair = cdolist_list_var.first();
                        while (sksi_incremental_edit.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = relevant_field_encoding_pf_indexical_pair;
                            SubLObject field_encoding = (SubLObject)sksi_incremental_edit.NIL;
                            SubLObject pf_indexical = (SubLObject)sksi_incremental_edit.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list30);
                            field_encoding = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list30);
                            pf_indexical = current.first();
                            current = current.rest();
                            if (sksi_incremental_edit.NIL == current) {
                                final SubLObject pf_indexical_subst = sksi_incremental_edit_reformulate(logical_value, logical_field_indexical, field_encoding, sk_source);
                                if (sksi_incremental_edit.NIL != pf_indexical_subst && pf_indexical_subst != sksi_incremental_edit.$kw28$UNREFORMULATABLE) {
                                    foundP = (SubLObject)sksi_incremental_edit.T;
                                    if (sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(pf_indexical_subst)) {
                                        final SubLObject copy_logical_value_substs = conses_high.copy_list(logical_value_substs);
                                        logical_value_substs = (SubLObject)sksi_incremental_edit.NIL;
                                        SubLObject cdolist_list_var_$26 = copy_logical_value_substs;
                                        SubLObject each_logical_value_subst = (SubLObject)sksi_incremental_edit.NIL;
                                        each_logical_value_subst = cdolist_list_var_$26.first();
                                        while (sksi_incremental_edit.NIL != cdolist_list_var_$26) {
                                            SubLObject cdolist_list_var_$27 = pf_indexical_subst;
                                            SubLObject each_ref = (SubLObject)sksi_incremental_edit.NIL;
                                            each_ref = cdolist_list_var_$27.first();
                                            while (sksi_incremental_edit.NIL != cdolist_list_var_$27) {
                                                logical_value_substs = (SubLObject)ConsesLow.cons(cycl_utilities.expression_subst(each_ref, pf_indexical, each_logical_value_subst, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), logical_value_substs);
                                                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                each_ref = cdolist_list_var_$27.first();
                                            }
                                            cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                            each_logical_value_subst = cdolist_list_var_$26.first();
                                        }
                                    }
                                    else {
                                        final SubLObject copy_logical_value_substs = conses_high.copy_list(logical_value_substs);
                                        logical_value_substs = (SubLObject)sksi_incremental_edit.NIL;
                                        SubLObject cdolist_list_var_$28 = copy_logical_value_substs;
                                        SubLObject each_logical_value_subst = (SubLObject)sksi_incremental_edit.NIL;
                                        each_logical_value_subst = cdolist_list_var_$28.first();
                                        while (sksi_incremental_edit.NIL != cdolist_list_var_$28) {
                                            logical_value_substs = (SubLObject)ConsesLow.cons(cycl_utilities.expression_subst(genl_ks, sksi_incremental_edit.$const31$TheCurrentKnowledgeSource, cycl_utilities.expression_subst(pf_indexical_subst, pf_indexical, each_logical_value_subst, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), logical_value_substs);
                                            cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                            each_logical_value_subst = cdolist_list_var_$28.first();
                                        }
                                    }
                                }
                                else if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.TEN_INTEGER)) {
                                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str32$sksi_incremental_edit_reformulate), new SubLObject[] { sksi_incremental_edit.TEN_INTEGER, logical_value, logical_field_indexical, field_encoding });
                                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list30);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            relevant_field_encoding_pf_indexical_pair = cdolist_list_var.first();
                        }
                        if (sksi_incremental_edit.NIL != foundP) {
                            cdolist_list_var = logical_value_substs;
                            SubLObject each_logical_value_subst2 = (SubLObject)sksi_incremental_edit.NIL;
                            each_logical_value_subst2 = cdolist_list_var.first();
                            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                                result_sub_sentence_list = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(sksi_incremental_edit.$const33$indexicalReferent, logical_field_indexical, each_logical_value_subst2), result_sub_sentence_list);
                                cdolist_list_var = cdolist_list_var.rest();
                                each_logical_value_subst2 = cdolist_list_var.first();
                            }
                        }
                        csome_list_var_$25 = csome_list_var_$25.rest();
                        field_decoding = csome_list_var_$25.first();
                    }
                }
                if (sksi_incremental_edit.NIL != result_sub_sentence_list) {
                    result_sub_sentences = (SubLObject)((sksi_incremental_edit.NIL != result_sub_sentences) ? multiply_reformulation_lists(result_sub_sentence_list, result_sub_sentences) : ((sksi_incremental_edit.NIL != list_utilities.singletonP(result_sub_sentence_list)) ? ConsesLow.cons(result_sub_sentence_list, result_sub_sentences) : result_sub_sentence_list));
                }
                else {
                    failP = (SubLObject)sksi_incremental_edit.T;
                }
                csome_list_var = csome_list_var.rest();
                sub_sentence = csome_list_var.first();
            }
        }
        if (sksi_incremental_edit.NIL != failP) {
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var2 = result_sub_sentences;
        SubLObject each_result_sub_sentences = (SubLObject)sksi_incremental_edit.NIL;
        each_result_sub_sentences = cdolist_list_var2.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var2) {
            result = (SubLObject)ConsesLow.cons(el_utilities.make_conjunction(Sequences.reverse(each_result_sub_sentences)), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            each_result_sub_sentences = cdolist_list_var2.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 31826L)
    public static SubLObject multiply_reformulation_lists(final SubLObject a_list, final SubLObject b_list) {
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = a_list;
        SubLObject a_el = (SubLObject)sksi_incremental_edit.NIL;
        a_el = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$29 = b_list;
            SubLObject b_el = (SubLObject)sksi_incremental_edit.NIL;
            b_el = cdolist_list_var_$29.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$29) {
                result = (SubLObject)ConsesLow.cons((SubLObject)((sksi_incremental_edit.NIL != el_utilities.el_formula_with_operator_p(b_el, sksi_incremental_edit.$const33$indexicalReferent)) ? ConsesLow.list(a_el, b_el) : ConsesLow.cons(a_el, b_el)), result);
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                b_el = cdolist_list_var_$29.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            a_el = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 32120L)
    public static SubLObject sksi_translate_logical_sentence_to_decoded_sentences(final SubLObject logical_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject content_mt, final SubLObject meta_mt, final SubLObject new_cms_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject translation_pattern_cmses_list = sksi_logical_sentence_to_decoded_sentence_translation_patterns(logical_schema, physical_schema, relevant_logical_field_indexicals, logical_sentence, new_cms_list);
        SubLObject decoded_sentences = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = translation_pattern_cmses_list;
        SubLObject translation_pattern_cmses_pair = (SubLObject)sksi_incremental_edit.NIL;
        translation_pattern_cmses_pair = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = translation_pattern_cmses_pair;
            SubLObject translation_pattern = (SubLObject)sksi_incremental_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list34);
            translation_pattern = current.first();
            current = current.rest();
            final SubLObject relevant_cmses = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list34);
            current = current.rest();
            if (sksi_incremental_edit.NIL == current) {
                final SubLObject decoded_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, logical_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                if (sksi_incremental_edit.NIL != decoded_sentence) {
                    thread.resetMultipleValues();
                    final SubLObject successP = decoded_sentence_satisfies_conditionsP(decoded_sentence, relevant_cmses, content_mt, meta_mt);
                    final SubLObject csql_conditions = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_incremental_edit.NIL != successP) {
                        if (sksi_incremental_edit.NIL != csql_conditions) {
                            decoded_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(decoded_sentence, csql_conditions), decoded_sentences);
                        }
                        else {
                            decoded_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(decoded_sentence), decoded_sentences);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list34);
            }
            cdolist_list_var = cdolist_list_var.rest();
            translation_pattern_cmses_pair = cdolist_list_var.first();
        }
        return Sequences.nreverse(decoded_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 33793L)
    public static SubLObject decoded_sentence_satisfies_conditionsP(final SubLObject decoded_sentence, final SubLObject relevant_cmses, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lfi_value_cache = sksi_data_warehousing_utilities.construct_lfi_value_cache(decoded_sentence);
        SubLObject failP = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject conditions = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == failP) {
            SubLObject csome_list_var = relevant_cmses;
            SubLObject cms = (SubLObject)sksi_incremental_edit.NIL;
            cms = csome_list_var.first();
            while (sksi_incremental_edit.NIL == failP && sksi_incremental_edit.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject possibly_from_expression = sksi_data_warehousing_utilities.decoded_sentence_satisfies_conditionP(cms, lfi_value_cache, content_mt, meta_mt);
                final SubLObject possibly_where_expression = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (possibly_from_expression != sksi_incremental_edit.T) {
                    if (sksi_incremental_edit.NIL == possibly_from_expression) {
                        failP = (SubLObject)sksi_incremental_edit.T;
                    }
                    else if (sksi_incremental_edit.NIL != list_utilities.list_of_type_p((SubLObject)sksi_incremental_edit.$sym35$CSQL_TABLE_EXPRESSION_P, possibly_from_expression) && sksi_incremental_edit.NIL != possibly_where_expression) {
                        conditions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(possibly_from_expression, possibly_where_expression), conditions);
                    }
                }
                csome_list_var = csome_list_var.rest();
                cms = csome_list_var.first();
            }
        }
        return Values.values((SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == failP), conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 34564L)
    public static SubLObject sksi_logical_sentence_to_decoded_sentence_translation_patterns(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject logical_sentence, final SubLObject new_cms_list) {
        final SubLObject flat_logical_field_indexical_list = list_utilities.tree_find_all_if((SubLObject)sksi_incremental_edit.$sym36$LOGICAL_FIELD_INDEXICAL_P, relevant_logical_field_indexicals, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        SubLObject arg_var_map = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject indexical_referent_literals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject list_var = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject logical_field_indexical = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_number = (SubLObject)sksi_incremental_edit.NIL;
        list_var = flat_logical_field_indexical_list;
        logical_field_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_incremental_edit.ZERO_INTEGER; sksi_incremental_edit.NIL != list_var; list_var = list_var.rest(), logical_field_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_incremental_edit.ONE_INTEGER, field_number)) {
            final SubLObject arg_var = sksi_batch_translate.sksi_get_arg_var(field_number);
            final SubLObject indexical_referent_literal = (SubLObject)ConsesLow.list(sksi_incremental_edit.$const33$indexicalReferent, logical_field_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw37$VALUE, arg_var));
            arg_var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(logical_field_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw38$BIND, arg_var)), arg_var_map);
            indexical_referent_literals = (SubLObject)ConsesLow.cons(indexical_referent_literal, indexical_referent_literals);
        }
        arg_var_map = Sequences.nreverse(arg_var_map);
        indexical_referent_literals = Sequences.nreverse(indexical_referent_literals);
        final SubLObject logical_sentence_conjuncts = (SubLObject)((sksi_incremental_edit.NIL != el_utilities.el_conjunction_p(logical_sentence)) ? cycl_utilities.formula_args(logical_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED) : ConsesLow.list(logical_sentence));
        final SubLObject logical_sentence_predicates = Mapping.mapcar((SubLObject)sksi_incremental_edit.$sym39$FORMULA_OPERATOR, logical_sentence_conjuncts);
        final SubLObject relevant_predicates = Sequences.remove_duplicates(logical_sentence_predicates, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject relevant_meaning_sentences_lists = cdolist_list_var = relevant_logical_schema_meaning_sentences_with_preds(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_predicates, logical_sentence_predicates, new_cms_list, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        SubLObject relevant_meaning_sentences = (SubLObject)sksi_incremental_edit.NIL;
        relevant_meaning_sentences = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject meaning_sentence_list = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject sorted_meaning_sentences = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject logical_sentence_recipe = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject logical_sentence_template = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject relevant_cmses = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject pattern = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject cdolist_list_var_$30 = relevant_meaning_sentences;
            SubLObject meaning_sentence_cms_list_pair = (SubLObject)sksi_incremental_edit.NIL;
            meaning_sentence_cms_list_pair = cdolist_list_var_$30.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$30) {
                SubLObject current;
                final SubLObject datum = current = meaning_sentence_cms_list_pair;
                SubLObject meaning_sentence = (SubLObject)sksi_incremental_edit.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_incremental_edit.$list40);
                meaning_sentence = current.first();
                current = current.rest();
                final SubLObject cms_list = (SubLObject)(current.isCons() ? current.first() : sksi_incremental_edit.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_incremental_edit.$list40);
                current = current.rest();
                if (sksi_incremental_edit.NIL == current) {
                    meaning_sentence_list = (SubLObject)ConsesLow.cons(meaning_sentence, meaning_sentence_list);
                    if (sksi_incremental_edit.NIL != cms_list) {
                        relevant_cmses = (SubLObject)ConsesLow.cons(cms_list, relevant_cmses);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_incremental_edit.$list40);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                meaning_sentence_cms_list_pair = cdolist_list_var_$30.first();
            }
            sorted_meaning_sentences = list_utilities.sort_via_position(meaning_sentence_list, logical_sentence_predicates, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQ), (SubLObject)sksi_incremental_edit.$sym39$FORMULA_OPERATOR);
            logical_sentence_recipe = simplifier.simplify_cycl_sentence_syntax(el_utilities.make_conjunction(sorted_meaning_sentences), (SubLObject)sksi_incremental_edit.UNPROVIDED);
            logical_sentence_template = conses_high.sublis(arg_var_map, logical_sentence_recipe, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED);
            pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw41$TEMPLATE, logical_sentence_template, (SubLObject)((sksi_incremental_edit.NIL != indexical_referent_literals) ? el_utilities.make_conjunction(indexical_referent_literals) : sksi_incremental_edit.NIL));
            result = (SubLObject)ConsesLow.cons((SubLObject)((sksi_incremental_edit.NIL != relevant_cmses) ? ConsesLow.list(pattern, relevant_cmses) : ConsesLow.list(pattern)), result);
            cdolist_list_var = cdolist_list_var.rest();
            relevant_meaning_sentences = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 37152L)
    public static SubLObject relevant_logical_schema_meaning_sentences_with_preds_internal(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject relevant_preds, final SubLObject logical_sentence_predicates, final SubLObject new_cms_list, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_incremental_edit.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_incremental_edit.NIL;
        }
        if (unwrap_istsP == sksi_incremental_edit.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_logical_field_indexicals = sksi_kb_accessors.logical_schema_field_indexicals(logical_schema);
        SubLObject relevant_sentences = (SubLObject)sksi_incremental_edit.NIL;
        thread.resetMultipleValues();
        final SubLObject relevant_logical_field_indexicals_lists = list_utilities.partition_list(relevant_logical_field_indexicals, Symbols.symbol_function((SubLObject)sksi_incremental_edit.$sym43$LISTP));
        final SubLObject relevant_logical_field_indexical_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject irrelevant_logical_field_indexicals = conses_high.set_difference(all_logical_field_indexicals, relevant_logical_field_indexical_list, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, asserted_meaning_sentences_onlyP, unwrap_istsP, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject conditional_meaning_sentences = ConsesLow.append(Mapping.mapcar((SubLObject)sksi_incremental_edit.$sym44$GAF_FORMULA, sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_incremental_edit.T, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.NIL)), new_cms_list);
        SubLObject cdolist_list_var = relevant_preds;
        SubLObject relevant_pred = (SubLObject)sksi_incremental_edit.NIL;
        relevant_pred = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject relevant_pred_sentences = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject cdolist_list_var_$31 = meaning_sentences;
            SubLObject sentence = (SubLObject)sksi_incremental_edit.NIL;
            sentence = cdolist_list_var_$31.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$31) {
                if (sksi_incremental_edit.NIL != relevant_logical_schema_meaning_sentenceP(sentence, relevant_pred, relevant_logical_field_indexicals_lists, irrelevant_logical_field_indexicals, logical_schema, physical_schema)) {
                    relevant_pred_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sentence), relevant_pred_sentences);
                }
                cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                sentence = cdolist_list_var_$31.first();
            }
            if (sksi_incremental_edit.NIL != list_utilities.lengthG(relevant_pred_sentences, (SubLObject)sksi_incremental_edit.ONE_INTEGER, (SubLObject)sksi_incremental_edit.UNPROVIDED) && sksi_incremental_edit.NIL != list_utilities.occurs_exactly_n_timesP(relevant_pred, logical_sentence_predicates, Sequences.length(relevant_pred_sentences), (SubLObject)sksi_incremental_edit.UNPROVIDED)) {
                relevant_pred_sentences = (SubLObject)ConsesLow.list(relevant_pred_sentences);
            }
            SubLObject cdolist_list_var_$32 = conditional_meaning_sentences;
            SubLObject cms = (SubLObject)sksi_incremental_edit.NIL;
            cms = cdolist_list_var_$32.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$32) {
                if (sksi_incremental_edit.NIL == el_utilities.el_set_p(cycl_utilities.formula_arg3(cms, (SubLObject)sksi_incremental_edit.UNPROVIDED))) {
                    final SubLObject consequent_meaning_sentence = cycl_utilities.formula_arg4(cms, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                    if (sksi_incremental_edit.NIL != relevant_logical_schema_meaning_sentenceP(consequent_meaning_sentence, relevant_pred, relevant_logical_field_indexicals_lists, irrelevant_logical_field_indexicals, logical_schema, physical_schema)) {
                        final SubLObject sentence_lfis = sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexicals(consequent_meaning_sentence);
                        final SubLObject same_lfis_sentences = list_utilities.find_all(sentence_lfis, relevant_pred_sentences, (SubLObject)sksi_incremental_edit.$sym45$FAST_INTERSECT_, (SubLObject)sksi_incremental_edit.$sym46$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICALS);
                        if (sksi_incremental_edit.NIL != same_lfis_sentences) {
                            SubLObject new_same_lfis_sentences = (SubLObject)sksi_incremental_edit.NIL;
                            SubLObject cdolist_list_var_$33 = same_lfis_sentences;
                            SubLObject same_lfis_sentence = (SubLObject)sksi_incremental_edit.NIL;
                            same_lfis_sentence = cdolist_list_var_$33.first();
                            while (sksi_incremental_edit.NIL != cdolist_list_var_$33) {
                                relevant_pred_sentences = Sequences.delete(same_lfis_sentence, relevant_pred_sentences, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                                if (sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(same_lfis_sentence.first())) {
                                    new_same_lfis_sentences = (SubLObject)ConsesLow.cons(same_lfis_sentence, new_same_lfis_sentences);
                                }
                                else {
                                    new_same_lfis_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(same_lfis_sentence), new_same_lfis_sentences);
                                }
                                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                same_lfis_sentence = cdolist_list_var_$33.first();
                            }
                            new_same_lfis_sentences = Sequences.nreverse(new_same_lfis_sentences);
                            relevant_pred_sentences = multiply_meaning_sentence_lists(list_utilities.nadd_to_end((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(consequent_meaning_sentence, cms)), new_same_lfis_sentences), relevant_pred_sentences);
                        }
                        else {
                            relevant_pred_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(consequent_meaning_sentence, cms), relevant_pred_sentences);
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
        return Sequences.nreverse(relevant_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 37152L)
    public static SubLObject relevant_logical_schema_meaning_sentences_with_preds(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject relevant_preds, final SubLObject logical_sentence_predicates, final SubLObject new_cms_list, SubLObject asserted_meaning_sentences_onlyP, SubLObject unwrap_istsP) {
        if (asserted_meaning_sentences_onlyP == sksi_incremental_edit.UNPROVIDED) {
            asserted_meaning_sentences_onlyP = (SubLObject)sksi_incremental_edit.NIL;
        }
        if (unwrap_istsP == sksi_incremental_edit.UNPROVIDED) {
            unwrap_istsP = (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return relevant_logical_schema_meaning_sentences_with_preds_internal(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, (SubLObject)sksi_incremental_edit.EIGHT_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQUAL, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_8(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_incremental_edit.NIL;
            collision = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
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
                                            if (sksi_incremental_edit.NIL != cached_args && sksi_incremental_edit.NIL == cached_args.rest() && unwrap_istsP.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relevant_logical_schema_meaning_sentences_with_preds_internal(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, physical_schema, relevant_logical_field_indexicals, relevant_preds, logical_sentence_predicates, new_cms_list, asserted_meaning_sentences_onlyP, unwrap_istsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 40945L)
    public static SubLObject multiply_meaning_sentence_lists(final SubLObject a_list, final SubLObject b_list) {
        if (sksi_incremental_edit.NIL != b_list) {
            SubLObject result = (SubLObject)sksi_incremental_edit.NIL;
            SubLObject cdolist_list_var = a_list;
            SubLObject a_el = (SubLObject)sksi_incremental_edit.NIL;
            a_el = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$34 = b_list;
                SubLObject b_el = (SubLObject)sksi_incremental_edit.NIL;
                b_el = cdolist_list_var_$34.first();
                while (sksi_incremental_edit.NIL != cdolist_list_var_$34) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)((sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(a_el.first())) ? ((sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(b_el.first())) ? ConsesLow.append(a_el, b_el) : list_utilities.nadd_to_end(b_el, a_el)) : ((sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(b_el.first())) ? ConsesLow.cons(a_el, b_el) : ConsesLow.list(a_el, b_el))), result);
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    b_el = cdolist_list_var_$34.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                a_el = cdolist_list_var.first();
            }
            result = list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_incremental_edit.$sym11$SETS_EQUAL_EQUAL_, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            return result;
        }
        if (sksi_incremental_edit.NIL != sksi_reformulate.sksi_true_list_p(conses_high.caar(a_list))) {
            return a_list;
        }
        return (SubLObject)ConsesLow.list(a_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 41550L)
    public static SubLObject relevant_logical_schema_meaning_sentenceP(final SubLObject meaning_sentence, final SubLObject relevant_pred, final SubLObject relevant_logical_field_indexicals_lists, final SubLObject irrelevant_logical_field_indexicals, final SubLObject logical_schema, final SubLObject physical_schema) {
        if (sksi_incremental_edit.NIL != sksi_meaning_sentence_has_relevant_predP(meaning_sentence, relevant_pred, logical_schema, physical_schema)) {
            SubLObject relevantP = (SubLObject)sksi_incremental_edit.NIL;
            if (sksi_incremental_edit.NIL == relevantP) {
                SubLObject csome_list_var = relevant_logical_field_indexicals_lists;
                SubLObject relevant_logical_field_indexicals_list = (SubLObject)sksi_incremental_edit.NIL;
                relevant_logical_field_indexicals_list = csome_list_var.first();
                while (sksi_incremental_edit.NIL == relevantP && sksi_incremental_edit.NIL != csome_list_var) {
                    SubLObject failP = (SubLObject)sksi_incremental_edit.NIL;
                    if (sksi_incremental_edit.NIL == failP) {
                        SubLObject csome_list_var_$35;
                        SubLObject lfi;
                        for (csome_list_var_$35 = relevant_logical_field_indexicals_list, lfi = (SubLObject)sksi_incremental_edit.NIL, lfi = csome_list_var_$35.first(); sksi_incremental_edit.NIL == failP && sksi_incremental_edit.NIL != csome_list_var_$35; failP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p(lfi, meaning_sentence)), csome_list_var_$35 = csome_list_var_$35.rest(), lfi = csome_list_var_$35.first()) {}
                    }
                    relevantP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == failP);
                    csome_list_var = csome_list_var.rest();
                    relevant_logical_field_indexicals_list = csome_list_var.first();
                }
            }
            if (sksi_incremental_edit.NIL == relevantP) {
                SubLObject irrelevantP = (SubLObject)sksi_incremental_edit.NIL;
                if (sksi_incremental_edit.NIL == irrelevantP) {
                    SubLObject csome_list_var2;
                    SubLObject irrelevant_field_indexical;
                    for (csome_list_var2 = irrelevant_logical_field_indexicals, irrelevant_field_indexical = (SubLObject)sksi_incremental_edit.NIL, irrelevant_field_indexical = csome_list_var2.first(); sksi_incremental_edit.NIL == irrelevantP && sksi_incremental_edit.NIL != csome_list_var2; irrelevantP = sksi_meaning_sentence_utilities.meaning_sentence_logical_field_indexical_p(irrelevant_field_indexical, meaning_sentence), csome_list_var2 = csome_list_var2.rest(), irrelevant_field_indexical = csome_list_var2.first()) {}
                }
                relevantP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_incremental_edit.NIL == irrelevantP);
            }
            return relevantP;
        }
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 42522L)
    public static SubLObject sksi_meaning_sentence_has_relevant_predP(final SubLObject sentence, final SubLObject relevant_pred, final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject pred = cycl_utilities.formula_operator(sentence);
        if (pred.eql(relevant_pred)) {
            return (SubLObject)sksi_incremental_edit.T;
        }
        if (sksi_incremental_edit.NIL == sksi_kb_accessors.logical_field_indexical_p(pred)) {
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLObject pred_list = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == pred_list) {
            return (SubLObject)sksi_incremental_edit.T;
        }
        return list_utilities.member_eqP(relevant_pred, pred_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 43144L)
    public static SubLObject sksi_translate_decoded_sentence_to_raw_sentence(final SubLObject decoded_sentence, final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLObject translation_pattern = sksi_decoded_sentence_to_raw_sentence_translation_pattern(physical_schema, pf_indexicals, logical_schema, Mapping.mapcar((SubLObject)sksi_incremental_edit.$sym47$FORMULA_ARG1, cycl_utilities.formula_args(decoded_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED)), sk_source);
        SubLObject raw_sentence = (SubLObject)sksi_incremental_edit.NIL;
        raw_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, decoded_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        return raw_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 43998L)
    public static SubLObject physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLObject physical_fields = sksi_kb_accessors.physical_schema_fields(physical_schema);
        final SubLObject mappings_cache = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQ), Sequences.length(physical_fields));
        SubLObject cdolist_list_var = physical_fields;
        SubLObject pf = (SubLObject)sksi_incremental_edit.NIL;
        pf = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            final SubLObject relevant_logical_field_indexicals = sksi_kb_accessors.sksi_determine_logical_field_indexicals_relevant_to_physical_field(pf, physical_schema, logical_schema);
            final SubLObject pf_indexical = sksi_kb_accessors.indexical_for_physical_field(pf);
            dictionary.dictionary_enter(mappings_cache, pf_indexical, relevant_logical_field_indexicals);
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        return mappings_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 43998L)
    public static SubLObject physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata(final SubLObject logical_schema, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, (SubLObject)sksi_incremental_edit.TWO_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQ, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_schema, physical_schema);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_incremental_edit.NIL;
            collision = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_schema.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_incremental_edit.NIL != cached_args && sksi_incremental_edit.NIL == cached_args.rest() && physical_schema.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal(logical_schema, physical_schema)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_schema, physical_schema));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 44729L)
    public static SubLObject sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLObject pf_indexical_lf_mappings_cache = physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata(logical_schema, physical_schema);
        final SubLObject relevant_logical_field_indexical_forts = Mapping.mapcar((SubLObject)sksi_incremental_edit.$sym50$LFI_FORT_FOR_LFI, relevant_logical_field_indexicals);
        final SubLObject genl_ks = sksi_kb_accessors.max_genl_ks(sk_source);
        SubLObject raw_var_map = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_value_literals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject list_var = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject pf_indexical = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_number = (SubLObject)sksi_incremental_edit.NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_incremental_edit.ZERO_INTEGER; sksi_incremental_edit.NIL != list_var; list_var = list_var.rest(), pf_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_incremental_edit.ONE_INTEGER, field_number)) {
            final SubLObject pf_indexical_usedP = list_utilities.intersectP(dictionary.dictionary_lookup_without_values(pf_indexical_lf_mappings_cache, pf_indexical, (SubLObject)sksi_incremental_edit.UNPROVIDED), relevant_logical_field_indexical_forts, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            final SubLObject raw_var = sksi_batch_translate.sksi_get_raw_var(field_number);
            SubLObject field_value_literal = (SubLObject)sksi_incremental_edit.NIL;
            if (sksi_incremental_edit.NIL != pf_indexical_usedP) {
                field_value_literal = (SubLObject)ConsesLow.list(sksi_incremental_edit.$const51$fieldValue, pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw37$VALUE, raw_var));
                raw_var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw38$BIND, raw_var)), raw_var_map);
            }
            else {
                field_value_literal = (SubLObject)ConsesLow.listS(sksi_incremental_edit.$const51$fieldValue, pf_indexical, (SubLObject)sksi_incremental_edit.$list52);
            }
            field_value_literals = (SubLObject)ConsesLow.cons(field_value_literal, field_value_literals);
        }
        raw_var_map = Sequences.nreverse(raw_var_map);
        field_value_literals = Sequences.nreverse(field_value_literals);
        SubLObject indexical_referent_literals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject cdolist_list_var = relevant_logical_field_indexicals;
        SubLObject logical_field_indexical = (SubLObject)sksi_incremental_edit.NIL;
        logical_field_indexical = cdolist_list_var.first();
        while (sksi_incremental_edit.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$36;
            final SubLObject recipes = cdolist_list_var_$36 = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(logical_field_indexical, (SubLObject)ConsesLow.list(logical_schema), (SubLObject)ConsesLow.list(physical_schema));
            SubLObject recipe = (SubLObject)sksi_incremental_edit.NIL;
            recipe = cdolist_list_var_$36.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var_$36) {
                final SubLObject decoding = cycl_utilities.expression_subst(genl_ks, sksi_incremental_edit.$const31$TheCurrentKnowledgeSource, conses_high.sublis(raw_var_map, maybe_evaluate_field_translation(recipe), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
                final SubLObject indexical_referent_literal = (SubLObject)ConsesLow.list(sksi_incremental_edit.$const33$indexicalReferent, logical_field_indexical, decoding);
                indexical_referent_literals = (SubLObject)ConsesLow.cons(indexical_referent_literal, indexical_referent_literals);
                cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                recipe = cdolist_list_var_$36.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_field_indexical = cdolist_list_var.first();
        }
        indexical_referent_literals = Sequences.nreverse(Sequences.delete_duplicates(indexical_referent_literals, Symbols.symbol_function((SubLObject)sksi_incremental_edit.EQUAL), (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED));
        final SubLObject translation_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw41$TEMPLATE, el_utilities.make_conjunction(indexical_referent_literals), el_utilities.make_conjunction(field_value_literals));
        return Values.values(translation_pattern, relevant_logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 44729L)
    public static SubLObject sksi_decoded_sentence_to_raw_sentence_translation_pattern(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, (SubLObject)sksi_incremental_edit.FIVE_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQUAL, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_incremental_edit.NIL;
            collision = cdolist_list_var.first();
            while (sksi_incremental_edit.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pf_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (logical_schema.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (relevant_logical_field_indexicals.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_incremental_edit.NIL != cached_args && sksi_incremental_edit.NIL == cached_args.rest() && sk_source.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_schema, pf_indexicals, logical_schema, relevant_logical_field_indexicals, sk_source));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 47164L)
    public static SubLObject maybe_evaluate_field_translation_internal(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, (SubLObject)sksi_incremental_edit.$sym54$NON_SKSI_EVALUATABLE_EXPRESSION_, (SubLObject)sksi_incremental_edit.$sym55$MAYBE_EVALUATE_EXPRESSION, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 47164L)
    public static SubLObject maybe_evaluate_field_translation(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return maybe_evaluate_field_translation_internal(expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym53$MAYBE_EVALUATE_FIELD_TRANSLATION, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym53$MAYBE_EVALUATE_FIELD_TRANSLATION, (SubLObject)sksi_incremental_edit.ONE_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQUAL, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym53$MAYBE_EVALUATE_FIELD_TRANSLATION, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(maybe_evaluate_field_translation_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 47370L)
    public static SubLObject maybe_evaluate_expression(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = expression;
        SubLObject error = (SubLObject)sksi_incremental_edit.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_incremental_edit.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject eval_result = relation_evaluation.cyc_evaluate(expression);
                    final SubLObject validP = thread.secondMultipleValue();
                    final SubLObject contextualizedP = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_incremental_edit.NIL == error && sksi_incremental_edit.NIL != validP) {
                        result = eval_result;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_incremental_edit.NIL);
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
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 47705L)
    public static SubLObject sksi_translate_raw_sentence_to_raw_tuple(final SubLObject raw_sentence, final SubLObject relevant_pf_indexicals) {
        final SubLObject translation_pattern = sksi_raw_sentence_to_raw_tuple_translation_pattern(relevant_pf_indexicals);
        SubLObject raw_tuple = (SubLObject)sksi_incremental_edit.NIL;
        raw_tuple = pattern_match.pattern_transform_tree(translation_pattern, raw_sentence, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        return raw_tuple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 48236L)
    public static SubLObject sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(SubLObject pf_indexicals) {
        SubLObject datum_vars = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_value_literals = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject list_var = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject pf_indexical = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_number = (SubLObject)sksi_incremental_edit.NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_incremental_edit.ZERO_INTEGER; sksi_incremental_edit.NIL != list_var; list_var = list_var.rest(), pf_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_incremental_edit.ONE_INTEGER, field_number)) {
            final SubLObject datum_var = sksi_batch_translate.sksi_get_datum_var(field_number);
            datum_vars = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw37$VALUE, datum_var), datum_vars);
            if (sksi_incremental_edit.NIL != pf_indexical) {
                final SubLObject field_value_literal = (SubLObject)ConsesLow.list(sksi_incremental_edit.$const51$fieldValue, pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw38$BIND, datum_var));
                field_value_literals = (SubLObject)ConsesLow.cons(field_value_literal, field_value_literals);
            }
        }
        datum_vars = Sequences.nreverse(datum_vars);
        field_value_literals = Sequences.nreverse(field_value_literals);
        pf_indexicals = Sequences.delete((SubLObject)sksi_incremental_edit.NIL, pf_indexicals, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject translation_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_incremental_edit.$kw41$TEMPLATE, el_utilities.make_conjunction(field_value_literals), datum_vars);
        return translation_pattern;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 48236L)
    public static SubLObject sksi_raw_sentence_to_raw_tuple_translation_pattern(final SubLObject pf_indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_incremental_edit.NIL;
        if (sksi_incremental_edit.NIL == v_memoization_state) {
            return sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(pf_indexicals);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        if (sksi_incremental_edit.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_incremental_edit.$sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, (SubLObject)sksi_incremental_edit.ONE_INTEGER, (SubLObject)sksi_incremental_edit.NIL, (SubLObject)sksi_incremental_edit.EQUAL, (SubLObject)sksi_incremental_edit.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_incremental_edit.$sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pf_indexicals, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_raw_sentence_to_raw_tuple_translation_pattern_internal(pf_indexicals)));
            memoization_state.caching_state_put(caching_state, pf_indexicals, results, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 49155L)
    public static SubLObject sksi_store_or_delete_raw_value(final SubLObject sk_source, final SubLObject access_path, final SubLObject raw_tuple, final SubLObject physical_fields, final SubLObject physical_schema, final SubLObject meta_mt, final SubLObject operator, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str58$_sksi_store_or_delete_raw_value__), new SubLObject[] { sksi_incremental_edit.NINE_INTEGER, sk_source, access_path, raw_tuple, physical_fields, physical_schema, meta_mt, operator, csql_conditions });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject successP = (SubLObject)sksi_incremental_edit.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions);
            SubLObject error_message = (SubLObject)sksi_incremental_edit.NIL;
            if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str59$sksi_store_or_delete_raw_value_CS), (SubLObject)sksi_incremental_edit.NINE_INTEGER, csql);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            if (sksi_incremental_edit.NIL != csql) {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sksi_incremental_edit.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$38 = control_vars.$inference_debugP$.currentBinding(thread);
                            try {
                                control_vars.$inference_debugP$.bind((SubLObject)sksi_incremental_edit.T, thread);
                                assert sksi_incremental_edit.NIL != sksi_debugging.valid_sksi_error_handling_mode_p((SubLObject)sksi_incremental_edit.$kw60$BREAK) : sksi_incremental_edit.$kw60$BREAK;
                                final SubLObject _prev_bind_0_$39 = sksi_debugging.$sksi_sks_error_handling_mode$.currentBinding(thread);
                                try {
                                    sksi_debugging.$sksi_sks_error_handling_mode$.bind((SubLObject)sksi_incremental_edit.$kw60$BREAK, thread);
                                    successP = sksi_store_or_delete_raw_value_int(access_path, csql, physical_schema);
                                }
                                finally {
                                    sksi_debugging.$sksi_sks_error_handling_mode$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            finally {
                                control_vars.$inference_debugP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_incremental_edit.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (sksi_incremental_edit.NIL != error_message) {
                    successP = (SubLObject)sksi_incremental_edit.NIL;
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str62$sksi_store_or_delete_raw_value___), (SubLObject)sksi_incremental_edit.NINE_INTEGER, successP);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 50307L)
    public static SubLObject sksi_store_or_delete_raw_value_int(final SubLObject access_path, final SubLObject csql, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL != sksi_csql_utilities.invalid_csql_expressionP(csql)) {
            if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str63$Invalid_CSQL_expression_at__sksi_), new SubLObject[] { sksi_incremental_edit.NINE_INTEGER, access_path, csql, physical_schema });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.structured_knowledge_source_type(access_path);
        if (pcase_var.eql(sksi_incremental_edit.$const64$Database_Physical)) {
            return sksi_store_or_delete_raw_value_db(csql, access_path);
        }
        if (pcase_var.eql(sksi_incremental_edit.$const65$FileHashTable_File)) {
            return sksi_store_or_delete_raw_value_fht(csql, access_path, physical_schema);
        }
        if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw66$CACHE)) {
            return sksi_store_or_delete_raw_value_cache(csql, access_path);
        }
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 50961L)
    public static SubLObject sksi_store_or_delete_raw_value_db(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str67$_sksi_store_or_delete_raw_value_d), new SubLObject[] { sksi_incremental_edit.NINE_INTEGER, csql, access_path });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, (SubLObject)sksi_incremental_edit.UNPROVIDED);
        final SubLObject result = sksi_store_or_delete_raw_value_db_int(sql, access_path);
        if (sksi_incremental_edit.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_incremental_edit.NINE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_incremental_edit.$str3$__SKSI__A_, (SubLObject)sksi_incremental_edit.$str68$sksi_store_or_delete_raw_value_db), (SubLObject)sksi_incremental_edit.NINE_INTEGER, result);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 51387L)
    public static SubLObject sksi_store_or_delete_raw_value_db_int(final SubLObject sql, final SubLObject access_path) {
        final SubLObject result = sksi_sks_interaction.sksi_execute_sql_update(sql, access_path);
        return Numbers.plusp(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 51548L)
    public static SubLObject sksi_store_or_delete_raw_value_fht(final SubLObject csql, final SubLObject access_path, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key = sksi_csql_interpretation.csql_to_key_and_value_expressions(csql, physical_schema);
        final SubLObject key_value = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject operator_keyword = csql.first();
        if (sksi_incremental_edit.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_incremental_edit.NIL == conses_high.member(operator_keyword, (SubLObject)sksi_incremental_edit.$list69, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED)) {
            Errors.error((SubLObject)sksi_incremental_edit.$str70$malformed_csql_subexpression__a__, operator_keyword);
        }
        final SubLObject pcase_var = operator_keyword;
        if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw1$INSERT)) {
            return sksi_sks_interaction.put_key_value_under_key_in_fht_source(key, key_value, access_path);
        }
        if (pcase_var.eql((SubLObject)sksi_incremental_edit.$kw2$DELETE)) {
            return sksi_sks_interaction.remove_key_value_under_key_in_fht_source(key, key_value, access_path);
        }
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-incremental-edit.lisp", position = 52153L)
    public static SubLObject sksi_store_or_delete_raw_value_cache(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator_keyword = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject into = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject fields = (SubLObject)sksi_incremental_edit.NIL;
        SubLObject field_values = (SubLObject)sksi_incremental_edit.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_incremental_edit.$list71);
        operator_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_incremental_edit.$list71);
        into = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_incremental_edit.$list71);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_incremental_edit.$list71);
        field_values = current.first();
        current = current.rest();
        if (sksi_incremental_edit.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_incremental_edit.$list71);
            return (SubLObject)sksi_incremental_edit.NIL;
        }
        if (sksi_incremental_edit.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_incremental_edit.NIL == conses_high.member(operator_keyword, (SubLObject)sksi_incremental_edit.$list69, (SubLObject)sksi_incremental_edit.UNPROVIDED, (SubLObject)sksi_incremental_edit.UNPROVIDED)) {
            Errors.error((SubLObject)sksi_incremental_edit.$str72$malformed_csql_expression__a__exp, operator_keyword);
        }
        final SubLObject tables = conses_high.second(into);
        if (sksi_incremental_edit.NIL != list_utilities.singletonP(tables) && sksi_incremental_edit.$list73.equal(tables.first())) {
            return sksi_cache.sksi_store_or_delete_raw_value_in_language_spoken_cache(csql);
        }
        Errors.error((SubLObject)sksi_incremental_edit.$str74$unknown_cache_for_csql__a_and_acc, csql, access_path);
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    public static SubLObject declare_sksi_incremental_edit_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_ist_logical_sentence", "SKSI-STORE-IST-LOGICAL-SENTENCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_delete_ist_logical_sentence", "SKSI-DELETE-IST-LOGICAL-SENTENCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_logical_sentence", "SKSI-STORE-LOGICAL-SENTENCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_delete_logical_sentence", "SKSI-DELETE-LOGICAL-SENTENCE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_translate_ist_logical_sentence_to_raw_tuples", "SKSI-TRANSLATE-IST-LOGICAL-SENTENCE-TO-RAW-TUPLES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_translate_logical_sentence_to_raw_tuples", "SKSI-TRANSLATE-LOGICAL-SENTENCE-TO-RAW-TUPLES", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "logical_schema_field_indexicals_relevant_to_logical_sentence", "LOGICAL-SCHEMA-FIELD-INDEXICALS-RELEVANT-TO-LOGICAL-SENTENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "map_pred_to_logical_field_indexical_tuples_from_meaning_sentences", "MAP-PRED-TO-LOGICAL-FIELD-INDEXICAL-TUPLES-FROM-MEANING-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "filter_meaning_sentences_by_pred_arity", "FILTER-MEANING-SENTENCES-BY-PRED-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "extract_logical_field_indexicals_from_meaning_sentences", "EXTRACT-LOGICAL-FIELD-INDEXICALS-FROM-MEANING-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "compute_possible_logical_field_indexicals_lists", "COMPUTE-POSSIBLE-LOGICAL-FIELD-INDEXICALS-LISTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "meaning_sentence_predicate_table_for_logical_sentence_logical_schema_physical_schema", "MEANING-SENTENCE-PREDICATE-TABLE-FOR-LOGICAL-SENTENCE-LOGICAL-SCHEMA-PHYSICAL-SCHEMA", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "maybe_add_meaning_sentence_to_meaning_sentence_predicate_table", "MAYBE-ADD-MEANING-SENTENCE-TO-MEANING-SENTENCE-PREDICATE-TABLE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "add_meaning_sentence_to_meaning_sentence_predicate_table", "ADD-MEANING-SENTENCE-TO-MEANING-SENTENCE-PREDICATE-TABLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "meaning_sentence_pred_appropriate_for_logical_sentence_predP", "MEANING-SENTENCE-PRED-APPROPRIATE-FOR-LOGICAL-SENTENCE-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "meaning_sentence_appropriate_for_logical_sentenceP", "MEANING-SENTENCE-APPROPRIATE-FOR-LOGICAL-SENTENCE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "compute_ambiguous_variants_of_logical_sentence", "COMPUTE-AMBIGUOUS-VARIANTS-OF-LOGICAL-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "field_encodings_relevant_to_logical_field_indexical_internal", "FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "field_encodings_relevant_to_logical_field_indexical", "FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "rewrite_conditional_meaning_sentence", "REWRITE-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "antecedent_meaning_sentence_constraining_lfi_as_lfi", "ANTECEDENT-MEANING-SENTENCE-CONSTRAINING-LFI-AS-LFI", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "atomic_sentence_constraining_lfi_as_lfi", "ATOMIC-SENTENCE-CONSTRAINING-LFI-AS-LFI", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "physical_field_indexical_logical_field_indexicals", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICALS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "guess_ls_for_meaning_sentence", "GUESS-LS-FOR-MEANING-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_incremental_edit_reformulate", "SKSI-INCREMENTAL-EDIT-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_incremental_edit_reformulate_decoded_sentence", "SKSI-INCREMENTAL-EDIT-REFORMULATE-DECODED-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "multiply_reformulation_lists", "MULTIPLY-REFORMULATION-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_translate_logical_sentence_to_decoded_sentences", "SKSI-TRANSLATE-LOGICAL-SENTENCE-TO-DECODED-SENTENCES", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "decoded_sentence_satisfies_conditionsP", "DECODED-SENTENCE-SATISFIES-CONDITIONS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_logical_sentence_to_decoded_sentence_translation_patterns", "SKSI-LOGICAL-SENTENCE-TO-DECODED-SENTENCE-TRANSLATION-PATTERNS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "relevant_logical_schema_meaning_sentences_with_preds_internal", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS-INTERNAL", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "relevant_logical_schema_meaning_sentences_with_preds", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "multiply_meaning_sentence_lists", "MULTIPLY-MEANING-SENTENCE-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "relevant_logical_schema_meaning_sentenceP", "RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCE?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_meaning_sentence_has_relevant_predP", "SKSI-MEANING-SENTENCE-HAS-RELEVANT-PRED?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_translate_decoded_sentence_to_raw_sentence", "SKSI-TRANSLATE-DECODED-SENTENCE-TO-RAW-SENTENCE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata_internal", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "physical_field_indexical_logical_field_indexical_mappings_given_logical_physical_schemata", "PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_decoded_sentence_to_raw_sentence_translation_pattern_internal", "SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_decoded_sentence_to_raw_sentence_translation_pattern", "SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "maybe_evaluate_field_translation_internal", "MAYBE-EVALUATE-FIELD-TRANSLATION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "maybe_evaluate_field_translation", "MAYBE-EVALUATE-FIELD-TRANSLATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "maybe_evaluate_expression", "MAYBE-EVALUATE-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_translate_raw_sentence_to_raw_tuple", "SKSI-TRANSLATE-RAW-SENTENCE-TO-RAW-TUPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_raw_sentence_to_raw_tuple_translation_pattern_internal", "SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_raw_sentence_to_raw_tuple_translation_pattern", "SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value", "SKSI-STORE-OR-DELETE-RAW-VALUE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value_int", "SKSI-STORE-OR-DELETE-RAW-VALUE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value_db", "SKSI-STORE-OR-DELETE-RAW-VALUE-DB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value_db_int", "SKSI-STORE-OR-DELETE-RAW-VALUE-DB-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value_fht", "SKSI-STORE-OR-DELETE-RAW-VALUE-FHT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit", "sksi_store_or_delete_raw_value_cache", "SKSI-STORE-OR-DELETE-RAW-VALUE-CACHE", 2, 0, false);
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    public static SubLObject init_sksi_incremental_edit_file() {
        return (SubLObject)sksi_incremental_edit.NIL;
    }
    
    public static SubLObject setup_sksi_incremental_edit_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS);
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L);
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN);
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym53$MAYBE_EVALUATE_FIELD_TRANSLATION);
        memoization_state.note_memoized_function((SubLObject)sksi_incremental_edit.$sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN);
        return (SubLObject)sksi_incremental_edit.NIL;
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
    
    static {
        me = (SubLFile)new sksi_incremental_edit();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-TUPLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-CONDITIONS"));
        $kw1$INSERT = SubLObjectFactory.makeKeyword("INSERT");
        $kw2$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $str3$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str4$_sksi_translate_logical_sentence_ = SubLObjectFactory.makeString("(sksi-translate-logical-sentence-to-raw-tuples ~S ~S ~S ~S ~S ~S)~%");
        $sym5$PHYSICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");
        $str6$Could_not_find_indexical_for_phys = SubLObjectFactory.makeString("Could not find indexical for physical field ");
        $sym7$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECODED-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-CONDITIONS"));
        $str9$sksi_translate_logical_sentence_t = SubLObjectFactory.makeString("sksi-translate-logical-sentence-to-raw-tuples -> ~S ~S~%");
        $sym10$EQUAL_DUPLICATES_ = SubLObjectFactory.makeSymbol("EQUAL-DUPLICATES?");
        $sym11$SETS_EQUAL_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?");
        $sym12$EQUALS_ = SubLObjectFactory.makeSymbol("EQUALS?");
        $sym13$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw14$RAW = SubLObjectFactory.makeKeyword("RAW");
        $sym15$FIELD_ENCODINGS_RELEVANT_TO_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("FIELD-ENCODINGS-RELEVANT-TO-LOGICAL-FIELD-INDEXICAL");
        $const16$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $kw17$WHAT = SubLObjectFactory.makeKeyword("WHAT");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHAT"));
        $kw19$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw20$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw21$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw22$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw23$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $const24$conditionalMeaningSentenceOfSchem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalMeaningSentenceOfSchema"));
        $const25$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw26$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym27$LOGICAL_FIELD_INDEXICAL_SCHEMA = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-SCHEMA");
        $kw28$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $kw29$ENCODE = SubLObjectFactory.makeKeyword("ENCODE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-ENCODING"), (SubLObject)SubLObjectFactory.makeSymbol("PF-INDEXICAL"));
        $const31$TheCurrentKnowledgeSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentKnowledgeSource"));
        $str32$sksi_incremental_edit_reformulate = SubLObjectFactory.makeString("sksi-incremental-edit-reformulate-decoded-sentence could not encode ~S as ~S using encoding ~S");
        $const33$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRANSLATION-PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-CMSES"));
        $sym35$CSQL_TABLE_EXPRESSION_P = SubLObjectFactory.makeSymbol("CSQL-TABLE-EXPRESSION-P");
        $sym36$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $kw37$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw38$BIND = SubLObjectFactory.makeKeyword("BIND");
        $sym39$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CMS-LIST"));
        $kw41$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $sym42$RELEVANT_LOGICAL_SCHEMA_MEANING_SENTENCES_WITH_PREDS = SubLObjectFactory.makeSymbol("RELEVANT-LOGICAL-SCHEMA-MEANING-SENTENCES-WITH-PREDS");
        $sym43$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym44$GAF_FORMULA = SubLObjectFactory.makeSymbol("GAF-FORMULA");
        $sym45$FAST_INTERSECT_ = SubLObjectFactory.makeSymbol("FAST-INTERSECT?");
        $sym46$MEANING_SENTENCE_LOGICAL_FIELD_INDEXICALS = SubLObjectFactory.makeSymbol("MEANING-SENTENCE-LOGICAL-FIELD-INDEXICALS");
        $sym47$FORMULA_ARG1 = SubLObjectFactory.makeSymbol("FORMULA-ARG1");
        $sym48$PHYSICAL_FIELD_INDEXICAL_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_L = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA");
        $sym49$SKSI_DECODED_SENTENCE_TO_RAW_SENTENCE_TRANSLATION_PATTERN = SubLObjectFactory.makeSymbol("SKSI-DECODED-SENTENCE-TO-RAW-SENTENCE-TRANSLATION-PATTERN");
        $sym50$LFI_FORT_FOR_LFI = SubLObjectFactory.makeSymbol("LFI-FORT-FOR-LFI");
        $const51$fieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValue"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-VALUE"));
        $sym53$MAYBE_EVALUATE_FIELD_TRANSLATION = SubLObjectFactory.makeSymbol("MAYBE-EVALUATE-FIELD-TRANSLATION");
        $sym54$NON_SKSI_EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?");
        $sym55$MAYBE_EVALUATE_EXPRESSION = SubLObjectFactory.makeSymbol("MAYBE-EVALUATE-EXPRESSION");
        $sym56$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym57$SKSI_RAW_SENTENCE_TO_RAW_TUPLE_TRANSLATION_PATTERN = SubLObjectFactory.makeSymbol("SKSI-RAW-SENTENCE-TO-RAW-TUPLE-TRANSLATION-PATTERN");
        $str58$_sksi_store_or_delete_raw_value__ = SubLObjectFactory.makeString("(sksi-store-or-delete-raw-value  ~S ~S ~S ~S ~S ~S ~S ~S)~%");
        $str59$sksi_store_or_delete_raw_value_CS = SubLObjectFactory.makeString("sksi-store-or-delete-raw-value CSQL = ~S~%");
        $kw60$BREAK = SubLObjectFactory.makeKeyword("BREAK");
        $sym61$VALID_SKSI_ERROR_HANDLING_MODE_P = SubLObjectFactory.makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P");
        $str62$sksi_store_or_delete_raw_value___ = SubLObjectFactory.makeString("sksi-store-or-delete-raw-value -> ~A~%");
        $str63$Invalid_CSQL_expression_at__sksi_ = SubLObjectFactory.makeString("Invalid CSQL expression at (sksi-store-or-delete-raw-value-int ~S ~S ~S) -> NIL~%");
        $const64$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $const65$FileHashTable_File = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FileHashTable-File"));
        $kw66$CACHE = SubLObjectFactory.makeKeyword("CACHE");
        $str67$_sksi_store_or_delete_raw_value_d = SubLObjectFactory.makeString("(sksi-store-or-delete-raw-value-db ~S ~S)~%");
        $str68$sksi_store_or_delete_raw_value_db = SubLObjectFactory.makeString("sksi-store-or-delete-raw-value-db -> ~A~%");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INSERT"), (SubLObject)SubLObjectFactory.makeKeyword("DELETE"));
        $str70$malformed_csql_subexpression__a__ = SubLObjectFactory.makeString("malformed csql subexpression ~a, expected :insert or :delete");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("INTO"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-VALUES"));
        $str72$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :insert or :delete");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("Language_Spoken"));
        $str74$unknown_cache_for_csql__a_and_acc = SubLObjectFactory.makeString("unknown cache for csql ~a and access path ~a");
    }
}

/*

	Total time: 805 ms
	
*/