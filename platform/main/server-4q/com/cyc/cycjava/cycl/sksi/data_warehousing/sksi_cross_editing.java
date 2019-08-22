package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_interpretation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_cross_editing extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_cross_editing();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_cross_editing";

    public static final String myFingerPrint = "01329f4083b886fc365a63c75ad2fcc34ea20771a5a49d56453e5734a6762f0c";









    private static final SubLSymbol $sym4$ATOMIC_SENTENCE_MEMOIZED_ = makeSymbol("ATOMIC-SENTENCE-MEMOIZED?");

    private static final SubLObject $$subKS_Direct = reader_make_constant_shell(makeString("subKS-Direct"));





    private static final SubLList $list8 = list(makeSymbol("PHYSICAL-SCHEMA"), makeSymbol("LOGICAL-SCHEMA"));

    private static final SubLList $list9 = list(makeSymbol("RAW-TUPLE"), makeSymbol("&OPTIONAL"), makeSymbol("CSQL-CONDITIONS"));

    private static final SubLString $$$continue = makeString("continue");

    private static final SubLString $str11$Unsupported_operator__A__ = makeString("Unsupported operator ~A~%");

    private static final SubLObject $$SourceSchemaObjectFn = reader_make_constant_shell(makeString("SourceSchemaObjectFn"));

    public static SubLObject sksi_store_complex_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
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
                    result = sksi_store_or_delete_complex_logical_sentence_recursive(logical_sentence, sk_source, $INSERT);
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
        return result;
    }

    public static SubLObject sksi_delete_complex_logical_sentence(final SubLObject logical_sentence, final SubLObject sk_source, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    result = sksi_store_or_delete_complex_logical_sentence_recursive(logical_sentence, sk_source, $DELETE);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_store_or_delete_complex_logical_sentence_recursive(final SubLObject sentence, final SubLObject sk_source, final SubLObject operator) {
        SubLObject new_sentence_args = NIL;
        SubLObject new_sentence = NIL;
        SubLObject result = NIL;
        SubLObject failP = NIL;
        final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        SubLObject new_arg;
        for (rest = NIL, rest = args; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            if (NIL != sentence_with_asent_argsP(arg)) {
                new_arg = sksi_store_or_delete_complex_logical_sentence_recursive(arg, sk_source, operator);
                if (NIL != new_arg) {
                    new_sentence_args = cons(new_arg, new_sentence_args);
                } else {
                    failP = T;
                }
            } else
                if (NIL != atomic_sentence_memoizedP(arg)) {
                    new_arg = sksi_find_or_store_or_delete_atomic_sentence(arg, sk_source, operator == $DELETE ? $FIND : operator, UNPROVIDED);
                    if (NIL != new_arg) {
                        new_sentence_args = cons(new_arg, new_sentence_args);
                    } else {
                        failP = T;
                    }
                } else {
                    new_sentence_args = cons(arg, new_sentence_args);
                }

        }
        if (NIL == failP) {
            new_sentence_args = nreverse(new_sentence_args);
            new_sentence = make_el_formula(cycl_utilities.formula_operator(sentence), new_sentence_args, UNPROVIDED);
            result = sksi_find_or_store_or_delete_atomic_sentence(new_sentence, sk_source, operator, UNPROVIDED);
            return result;
        }
        return NIL;
    }

    public static SubLObject sentence_with_asent_argsP(final SubLObject sentence) {
        return list_utilities.sublisp_boolean(asent_args_of_sentence(sentence));
    }

    public static SubLObject asent_args_of_sentence(final SubLObject sentence) {
        if (NIL != el_formula_p(sentence)) {
            return keyhash_utilities.fast_intersection(cycl_utilities.sentence_args(sentence, UNPROVIDED), cycl_utilities.expression_gather(sentence, $sym4$ATOMIC_SENTENCE_MEMOIZED_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject atomic_sentence_memoizedP_internal(final SubLObject sentence) {
        return atomic_sentenceP(sentence);
    }

    public static SubLObject atomic_sentence_memoizedP(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return atomic_sentence_memoizedP_internal(sentence);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym4$ATOMIC_SENTENCE_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym4$ATOMIC_SENTENCE_MEMOIZED_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym4$ATOMIC_SENTENCE_MEMOIZED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sentence, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(atomic_sentence_memoizedP_internal(sentence)));
            memoization_state.caching_state_put(caching_state, sentence, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_find_or_store_or_delete_atomic_sentence(final SubLObject sentence, final SubLObject sk_source, final SubLObject operator, SubLObject meta_mt) {
        if (meta_mt == UNPROVIDED) {
            meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    result = sksi_find_or_store_or_delete_atomic_sentence_recursive(sentence, sk_source, operator, meta_mt);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_find_or_store_or_delete_atomic_sentence_recursive(final SubLObject sentence, final SubLObject sk_source, final SubLObject operator, final SubLObject meta_mt) {
        final SubLObject ps_ls_pairs = sksi_kb_accessors.sk_source_physical_logical_schema_pairs(sk_source);
        return NIL != ps_ls_pairs ? sksi_find_or_store_or_delete_atomic_sentence_int(sentence, sk_source, ps_ls_pairs, operator, meta_mt) : sksi_find_or_store_or_delete_atomic_sentence_descend(sentence, sk_source, operator, meta_mt);
    }

    public static SubLObject sksi_find_or_store_or_delete_atomic_sentence_descend(final SubLObject sentence, final SubLObject sk_source, final SubLObject operator, final SubLObject meta_mt) {
        SubLObject result = NIL;
        final SubLObject pred_var = $$subKS_Direct;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sk_source, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sk_source, ONE_INTEGER, pred_var);
            SubLObject done_var = result;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$7 = result;
                        final SubLObject token_var_$8 = NIL;
                        while (NIL == done_var_$7) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                            final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(gaf));
                            if (NIL != valid_$9) {
                                final SubLObject sub_ks = assertions_high.gaf_arg2(gaf);
                                result = sksi_find_or_store_or_delete_atomic_sentence_recursive(sentence, sub_ks, operator, meta_mt);
                            }
                            done_var_$7 = makeBoolean((NIL == valid_$9) || (NIL != result));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != result));
            } 
        }
        return result;
    }

    public static SubLObject sksi_find_or_store_or_delete_atomic_sentence_int(final SubLObject sentence, final SubLObject sk_source, final SubLObject ps_ls_pairs, final SubLObject operator, final SubLObject meta_mt) {
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, UNPROVIDED, UNPROVIDED);
        final SubLObject sentence_template = sksi_data_warehousing_utilities.make_sentence_template(sentence);
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = ps_ls_pairs;
            SubLObject ps_ls_pair = NIL;
            ps_ls_pair = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = ps_ls_pair;
                SubLObject physical_schema = NIL;
                SubLObject logical_schema = NIL;
                destructuring_bind_must_consp(current, datum, $list8);
                physical_schema = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list8);
                logical_schema = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemasP(sentence_template, logical_schema, physical_schema, T)) {
                        result = sksi_find_or_store_or_delete_atomic_sentence_in_table(sentence, sk_source, access_path, logical_schema, physical_schema, operator, meta_mt);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list8);
                }
                csome_list_var = csome_list_var.rest();
                ps_ls_pair = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject sksi_find_or_store_or_delete_atomic_sentence_in_table(final SubLObject sentence, final SubLObject sk_source, final SubLObject access_path, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject operator, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(meta_mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(meta_mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(meta_mt), thread);
            thread.resetMultipleValues();
            final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_logical_sentence_to_raw_tuples(sentence, logical_schema, physical_schema, meta_mt, sk_source, T);
            final SubLObject physical_fields = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == result) {
                SubLObject csome_list_var = raw_tuples;
                SubLObject raw_tuple_conditions_pair = NIL;
                raw_tuple_conditions_pair = csome_list_var.first();
                while ((NIL == result) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = raw_tuple_conditions_pair;
                    SubLObject raw_tuple = NIL;
                    destructuring_bind_must_consp(current, datum, $list9);
                    raw_tuple = current.first();
                    current = current.rest();
                    final SubLObject csql_conditions = (current.isCons()) ? current.first() : NIL;
                    destructuring_bind_must_listp(current, datum, $list9);
                    current = current.rest();
                    if (NIL == current) {
                        if (operator.eql($FIND)) {
                            thread.resetMultipleValues();
                            final SubLObject primary_key_value = sksi_csql_generation.sksi_find_primary_key_value_for_raw_tuple(sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions);
                            final SubLObject foundP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != foundP) {
                                result = sksi_determine_cycl_for_primary_key(primary_key_value, sk_source, logical_schema);
                            }
                        } else
                            if (operator.eql($DELETE)) {
                                final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, $DELETE, csql_conditions);
                                if (NIL == sksi_csql_utilities.invalid_csql_expressionP(csql)) {
                                    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
                                    final SubLObject sql = sksi_csql_interpretation.csql_to_sql(csql, sql_flavor, UNPROVIDED);
                                    if (sql.isString()) {
                                        final SubLObject update_result = sksi_sks_interaction.sksi_execute_sql_update(sql, access_path);
                                        result = plusp(update_result);
                                    }
                                }
                            } else
                                if (operator.eql($INSERT)) {
                                    thread.resetMultipleValues();
                                    final SubLObject primary_key_value = sksi_csql_generation.sksi_find_primary_key_value_for_raw_tuple(sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions);
                                    final SubLObject foundP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != foundP) {
                                        result = sksi_determine_cycl_for_primary_key(primary_key_value, sk_source, logical_schema);
                                    } else {
                                        final SubLObject csql2 = sksi_csql_generation.sksi_determine_csql_for_incremental_edit(sk_source, physical_schema, physical_fields, raw_tuple, $INSERT, csql_conditions);
                                        if (NIL == sksi_csql_utilities.invalid_csql_expressionP(csql2)) {
                                            final SubLObject sql_flavor2 = sksi_access_path.access_path_sql_flavor(access_path);
                                            final SubLObject sql2 = sksi_csql_interpretation.csql_to_sql(csql2, sql_flavor2, UNPROVIDED);
                                            if (sql2.isString()) {
                                                final SubLObject update_result2 = sksi_sks_interaction.sksi_execute_sql_update(sql2, access_path);
                                                if (update_result2.isPositive()) {
                                                    final SubLObject pkey_value = sksi_csql_generation.sksi_find_primary_key_value_for_raw_tuple(sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions);
                                                    result = sksi_determine_cycl_for_primary_key(pkey_value, sk_source, logical_schema);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Errors.cerror($$$continue, $str11$Unsupported_operator__A__, operator);
                                }


                    } else {
                        cdestructuring_bind_error(datum, $list9);
                    }
                    csome_list_var = csome_list_var.rest();
                    raw_tuple_conditions_pair = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_determine_cycl_for_primary_key(final SubLObject pkey_value, final SubLObject sk_source, final SubLObject logical_schema) {
        if (NIL != pkey_value) {
            return make_el_formula($$SourceSchemaObjectFn, list(sksi_kb_accessors.max_genl_ks(sk_source), logical_schema, second(pkey_value.first())), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_cross_editing_file() {
        declareFunction(me, "sksi_store_complex_logical_sentence", "SKSI-STORE-COMPLEX-LOGICAL-SENTENCE", 2, 1, false);
        declareFunction(me, "sksi_delete_complex_logical_sentence", "SKSI-DELETE-COMPLEX-LOGICAL-SENTENCE", 2, 1, false);
        declareFunction(me, "sksi_store_or_delete_complex_logical_sentence_recursive", "SKSI-STORE-OR-DELETE-COMPLEX-LOGICAL-SENTENCE-RECURSIVE", 3, 0, false);
        declareFunction(me, "sentence_with_asent_argsP", "SENTENCE-WITH-ASENT-ARGS?", 1, 0, false);
        declareFunction(me, "asent_args_of_sentence", "ASENT-ARGS-OF-SENTENCE", 1, 0, false);
        declareFunction(me, "atomic_sentence_memoizedP_internal", "ATOMIC-SENTENCE-MEMOIZED?-INTERNAL", 1, 0, false);
        declareFunction(me, "atomic_sentence_memoizedP", "ATOMIC-SENTENCE-MEMOIZED?", 1, 0, false);
        declareFunction(me, "sksi_find_or_store_or_delete_atomic_sentence", "SKSI-FIND-OR-STORE-OR-DELETE-ATOMIC-SENTENCE", 3, 1, false);
        declareFunction(me, "sksi_find_or_store_or_delete_atomic_sentence_recursive", "SKSI-FIND-OR-STORE-OR-DELETE-ATOMIC-SENTENCE-RECURSIVE", 4, 0, false);
        declareFunction(me, "sksi_find_or_store_or_delete_atomic_sentence_descend", "SKSI-FIND-OR-STORE-OR-DELETE-ATOMIC-SENTENCE-DESCEND", 4, 0, false);
        declareFunction(me, "sksi_find_or_store_or_delete_atomic_sentence_int", "SKSI-FIND-OR-STORE-OR-DELETE-ATOMIC-SENTENCE-INT", 5, 0, false);
        declareFunction(me, "sksi_find_or_store_or_delete_atomic_sentence_in_table", "SKSI-FIND-OR-STORE-OR-DELETE-ATOMIC-SENTENCE-IN-TABLE", 7, 0, false);
        declareFunction(me, "sksi_determine_cycl_for_primary_key", "SKSI-DETERMINE-CYCL-FOR-PRIMARY-KEY", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_cross_editing_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_cross_editing_file() {
        memoization_state.note_memoized_function($sym4$ATOMIC_SENTENCE_MEMOIZED_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_cross_editing_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_cross_editing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_cross_editing_file();
    }

    
}

/**
 * Total time: 124 ms
 */
