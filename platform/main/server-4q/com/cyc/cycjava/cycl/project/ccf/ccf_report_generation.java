/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.project.ccf;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.pairlis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CCF-REPORT-GENERATION
 *  source file: /cyc/top/cycl/project/ccf/ccf-report-generation.lisp
 *  created:     2019/07/03 17:39:00
 */
public final class ccf_report_generation extends SubLTranslatedFile implements V02 {
    // // Constructor
    private ccf_report_generation() {
    }

    public static final SubLFile me = new ccf_report_generation();

    public static final String myName = "com.cyc.cycjava.cycl.project.ccf.ccf_report_generation";

    // // Definitions
    // deflexical
    public static final SubLSymbol $reportgen_minimal_property$ = makeSymbol("*REPORTGEN-MINIMAL-PROPERTY*");

    // deflexical
    public static final SubLSymbol $reportgen_easy_one_answer_query_properties$ = makeSymbol("*REPORTGEN-EASY-ONE-ANSWER-QUERY-PROPERTIES*");

    /**
     * Process a row of the report.  Takes a list of values, which is taken to be an input row,
     * and returns a list of lists, to be printed out as the corresponding rows in the output report.
     * The optional placeholder is something, usually a string, to put in the output to represent
     * that no value was returned for that particular column.
     */
    public static final SubLObject reportgen_output_rows_from_input_row(SubLObject input_row, SubLObject ks, SubLObject placeholder) {
        if (placeholder == UNPROVIDED) {
            placeholder = $str_alt3$_;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_run_column_query();
            {
                SubLObject result = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject entities = focal_entities_from_input_row(input_row, ks);
                            if (NIL == entities) {
                                result = $list_alt4;
                            } else {
                                {
                                    SubLObject cdolist_list_var = entities;
                                    SubLObject entity = NIL;
                                    for (entity = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entity = cdolist_list_var.first()) {
                                        result = append(output_rows_from_entity(entity, input_row, ks, placeholder), result);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given a specific entity (e.g., an indexed procedure), get all appropriate output rows for the report.
     */
    public static final SubLObject output_rows_from_entity(SubLObject entity, SubLObject input_row, SubLObject ks, SubLObject placeholder) {
        if (placeholder == UNPROVIDED) {
            placeholder = $str_alt3$_;
        }
        {
            SubLObject pf_list = reportgen_schema_field_list(ks);
            SubLObject result = NIL;
            SubLObject exclusivity_states = get_fresh_exclusivity_states(ks);
            SubLObject cdolist_list_var = pf_list;
            SubLObject pf = NIL;
            for (pf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pf = cdolist_list_var.first()) {
                {
                    SubLObject values = values_for_pf(pf, entity, input_row, ks, exclusivity_states);
                    if (NIL == values) {
                        result = cons(list(placeholder), result);
                    } else {
                        result = cons(list_utilities.fast_delete_duplicates(values, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), result);
                    }
                }
            }
            result = nreverse(result);
            return reportgen_cartesian_product(result);
        }
    }

    /**
     * Given a row of values from the input document, get a list of all the focal entities described by
     * that row.  (Most of the time there will only be one such entity.)
     */
    public static final SubLObject focal_entities_from_input_row(SubLObject input_row, SubLObject ks) {
        {
            SubLObject base_query = base_query_from_ks(ks);
            SubLObject sentence = get_bound_base_query_sentence(ks, input_row);
            SubLObject var = cycl_utilities.formula_cycl_arg_position(sentence, result_argpos_in_base_query(ks), UNPROVIDED);
            return ask_utilities.query_variable(var, sentence, kb_query.kbq_mt(base_query), kb_query.kbq_query_properties(base_query));
        }
    }

    /**
     * Given the appropriate knowledge sources, and row of values from an actual input document (assumed
     * to be in the correct order as in the #$schemaFieldList for the input physical schema), return the
     * query sentence with all the appropriate logical values bound into the correct place.
     */
    public static final SubLObject get_bound_base_query_sentence(SubLObject report_ks, SubLObject input_row) {
        {
            SubLObject base_query = base_query_from_ks(report_ks);
            SubLObject input_ks = input_ks_from_report_ks(report_ks);
            return cycl_utilities.expression_sublis(get_free_vars_with_values(base_query, input_row, input_ks), kb_query.kbq_sentence(base_query), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * For the given base query, fetch an alist of all the free variables that need to be bound and the respective
     * values to bind in for them (calculated from the physical values in input-row).
     */
    public static final SubLObject get_free_vars_with_values(SubLObject base_query, SubLObject input_row, SubLObject input_ks) {
        {
            SubLObject argposes_lfis_alist = get_argposes_and_lfis_for_base_query(base_query, input_ks);
            SubLObject result_alist = NIL;
            SubLObject cdolist_list_var = argposes_lfis_alist;
            SubLObject argpos_lfi_pair = NIL;
            for (argpos_lfi_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argpos_lfi_pair = cdolist_list_var.first()) {
                result_alist = acons(cycl_utilities.formula_cycl_arg_position(kb_query.kbq_sentence(base_query), argpos_lfi_pair.first(), UNPROVIDED), evaluate_lfi_from_input_row(argpos_lfi_pair.rest(), input_row, input_ks), result_alist);
            }
            return result_alist;
        }
    }

    public static final SubLObject evaluate_lfi_from_input_row(SubLObject lfi, SubLObject input_row, SubLObject input_ks) {
        {
            SubLObject decoding = decoding_for_input_lfi(lfi, input_ks);
            SubLObject pfis_values_alist = pairlis(sksi_kb_accessors.physical_fields_to_indexicals(reportgen_schema_field_list(input_ks)), input_row, UNPROVIDED);
            return sksi_field_translation_utilities.sksi_apply_decoding_and_reformulate(pfis_values_alist, decoding, input_ks, UNPROVIDED);
        }
    }

    public static final SubLObject get_argposes_and_lfis_for_base_query_internal(SubLObject base_query, SubLObject input_ks) {
        return ask_utilities.query_template($list_alt6, listS($$queryNeedsThingBoundInPosition, base_query, $list_alt8), sksi_kb_accessors.sk_source_mapping_mt(input_ks), $list_alt9);
    }

    public static final SubLObject get_argposes_and_lfis_for_base_query(SubLObject base_query, SubLObject input_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return get_argposes_and_lfis_for_base_query_internal(base_query, input_ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(base_query, input_ks);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (base_query == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (input_ks == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(get_argposes_and_lfis_for_base_query_internal(base_query, input_ks)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(base_query, input_ks));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Intended to work just like query-variable, except also take a function to use as an alternative to
     * new-cyc-query.  Said function should behave more or less like new-cyc-query, with the important exception
     * that it should always act as if it's assuming property :return :bindings (this function depends on that
     * particular return format).
     */
    public static final SubLObject query_variable_using_query_function(SubLObject var, SubLObject sentence, SubLObject query_fn, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject all_bindings = funcall(query_fn, sentence, mt, query_properties);
                SubLObject halt_reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject answers_for_var = NIL;
                    SubLObject cdolist_list_var = all_bindings;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        {
                            SubLObject pair = assoc(var, binding, UNPROVIDED, UNPROVIDED);
                            if (NIL != pair) {
                                answers_for_var = cons(pair.rest(), answers_for_var);
                            }
                        }
                    }
                    return values(list_utilities.fast_delete_duplicates(answers_for_var, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), halt_reason);
                }
            }
        }
    }



    public static final SubLObject clear_run_column_query() {
        {
            SubLObject cs = $run_column_query_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_run_column_query(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($run_column_query_caching_state$.getGlobalValue(), list(sentence, mt, query_properties), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Run new-cyc-query but cache the last 100 results.  Nothing here is special to report column queries per se, but
     * this function has a larger cache to accommodate column query results (as there may be a large number of columns possibly
     * with some non-adjacent ones sharing the exact same query).  Note :return is forced to :bindings; this is so we're always
     * caching the 'whole' answer.
     */
    public static final SubLObject run_column_query_internal(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        {
            SubLObject new_query_properties = putf(copy_list(query_properties), $RETURN, $BINDINGS);
            return inference_kernel.new_cyc_query(sentence, mt, new_query_properties);
        }
    }

    public static final SubLObject run_column_query(SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        {
            SubLObject caching_state = $run_column_query_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RUN_COLUMN_QUERY, $run_column_query_caching_state$, $int$100, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, query_properties);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (sentence.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(run_column_query_internal(sentence, mt, query_properties)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt, query_properties));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject reportgen_schema_field_name_list(SubLObject ks) {
        return reportgen_schema_field_name_list_int(ks);
    }

    /**
     * Return a list (order matters) of the names of the physical fields associated with a knowledge source,
     * to use e.g. as column headers for a report.
     */
    public static final SubLObject reportgen_schema_field_name_list_int(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = sksi_kb_accessors.physical_schema_field_name_list(reportgen_physical_schema_from_knowledge_source(ks));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given a knowledge source representing a report, return the list of field/column names (suitable
     * for displaying to the end user) for the associated input document.
     */
    public static final SubLObject reportgen_input_doc_field_name_list(SubLObject report_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(report_ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = reportgen_schema_field_name_list_int(input_ks_from_report_ks(report_ks));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final class $reportgen_exclusivity_state_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return ccf_report_generation.$reportgen_exclusivity_state_native.structDecl;
        }

        public SubLObject getField2() {
            return $phys_fields;
        }

        public SubLObject getField3() {
            return $exc_value;
        }

        public SubLObject getField4() {
            return $default_value;
        }

        public SubLObject getField5() {
            return $satisfied_yetP;
        }

        public SubLObject setField2(SubLObject value) {
            return $phys_fields = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $exc_value = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $default_value = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $satisfied_yetP = value;
        }

        public SubLObject $phys_fields = Lisp.NIL;

        public SubLObject $exc_value = Lisp.NIL;

        public SubLObject $default_value = Lisp.NIL;

        public SubLObject $satisfied_yetP = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(ccf_report_generation.$reportgen_exclusivity_state_native.class, REPORTGEN_EXCLUSIVITY_STATE, REPORTGEN_EXCLUSIVITY_STATE_P, $list_alt20, $list_alt21, new String[]{ "$phys_fields", "$exc_value", "$default_value", "$satisfied_yetP" }, $list_alt22, $list_alt23, PRINT_EXC_STATE);
    }

    // defconstant
    public static final SubLSymbol $dtp_reportgen_exclusivity_state$ = makeSymbol("*DTP-REPORTGEN-EXCLUSIVITY-STATE*");

    public static final SubLObject reportgen_exclusivity_state_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_exc_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject reportgen_exclusivity_state_p(SubLObject v_object) {
        return v_object.getClass() == ccf_report_generation.$reportgen_exclusivity_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $reportgen_exclusivity_state_p$UnaryFunction extends UnaryFunction {
        public $reportgen_exclusivity_state_p$UnaryFunction() {
            super(extractFunctionNamed("REPORTGEN-EXCLUSIVITY-STATE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return reportgen_exclusivity_state_p(arg1);
        }
    }

    public static final SubLObject exc_state_phys_fields(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.getField2();
    }

    public static final SubLObject exc_state_exc_value(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.getField3();
    }

    public static final SubLObject exc_state_default_value(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.getField4();
    }

    public static final SubLObject exc_state_satisfied_yetP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.getField5();
    }

    public static final SubLObject _csetf_exc_state_phys_fields(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_exc_state_exc_value(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_exc_state_default_value(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_exc_state_satisfied_yetP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REPORTGEN_EXCLUSIVITY_STATE_P);
        return v_object.setField5(value);
    }

    public static final SubLObject make_reportgen_exclusivity_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new ccf_report_generation.$reportgen_exclusivity_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PHYS_FIELDS)) {
                        _csetf_exc_state_phys_fields(v_new, current_value);
                    } else
                        if (pcase_var.eql($EXC_VALUE)) {
                            _csetf_exc_state_exc_value(v_new, current_value);
                        } else
                            if (pcase_var.eql($DEFAULT_VALUE)) {
                                _csetf_exc_state_default_value(v_new, current_value);
                            } else
                                if (pcase_var.eql($kw37$SATISFIED_YET_)) {
                                    _csetf_exc_state_satisfied_yetP(v_new, current_value);
                                } else {
                                    Errors.error($str_alt38$Invalid_slot__S_for_construction_, current_arg);
                                }



                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_exc_state(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt39$__a_EXCLUSIVITY_STATE__a__a__a_, new SubLObject[]{ exc_state_satisfied_yetP(v_object), exc_state_exc_value(v_object), exc_state_default_value(v_object), exc_state_phys_fields(v_object) });
        return NIL;
    }

    public static final SubLObject get_fresh_exclusivity_states(SubLObject ks) {
        {
            SubLObject exclusivity_gafs = get_mutually_exclusive_field_gafs(ks);
            SubLObject fresh_states = NIL;
            SubLObject cdolist_list_var = exclusivity_gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                {
                    SubLObject boolean_exc_value = assertions_high.gaf_arg2(gaf);
                    fresh_states = cons(make_reportgen_exclusivity_state(listS($PHYS_FIELDS, new SubLObject[]{ cycl_utilities.formula_args(assertions_high.gaf_arg3(gaf), UNPROVIDED), $EXC_VALUE, get_default_boolean_string_for_ks(ks, boolean_exc_value), $DEFAULT_VALUE, get_default_boolean_string_for_ks(ks, opposite_boolean_constant(boolean_exc_value)), $list_alt40 })), fresh_states);
                }
            }
            return nreverse(fresh_states);
        }
    }

    /**
     * Get the correct values for a physical field for a given entity, by whatever means necessary.  Refer to and update exclusivity states
     * as needed.
     */
    public static final SubLObject values_for_pf(SubLObject pf, SubLObject entity, SubLObject input_row, SubLObject ks, SubLObject exclusivity_states) {
        {
            SubLObject values_from_exclusivity = values_for_pf_from_exclusivity_states(pf, exclusivity_states);
            if (NIL != values_from_exclusivity) {
                return values_from_exclusivity;
            } else {
                {
                    SubLObject final_values = values_from_encoding_expressions(reportgen_encoding_expressions_from_physical_field(pf, ks), ks, entity, input_row);
                    if (NIL == list_utilities.singletonP(final_values)) {
                        return final_values;
                    }
                    nupdate_exclusivity_states(pf, final_values.first(), exclusivity_states);
                    return final_values;
                }
            }
        }
    }

    /**
     * Checks to see if this physical field is governed by an exclusivity condition and furthermore if this value for it is the
     * exclusive allowed value.  Mark that state as satisfied if so.
     */
    public static final SubLObject nupdate_exclusivity_states(SubLObject pf, SubLObject value, SubLObject exclusivity_states) {
        {
            SubLObject cdolist_list_var = exclusivity_states;
            SubLObject state = NIL;
            for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                if (NIL == exc_state_satisfied_yetP(state)) {
                    if (NIL != member(pf, exc_state_phys_fields(state), symbol_function(EQ), UNPROVIDED)) {
                        if (value.equal(exc_state_exc_value(state))) {
                            _csetf_exc_state_satisfied_yetP(state, T);
                        }
                    }
                }
            }
        }
        return exclusivity_states;
    }

    /**
     * Check to see if we can easily get the value for a pf from exclusivity considerations.  If so, return a
     * list with this value as the sole element; if not, return nil.
     */
    public static final SubLObject values_for_pf_from_exclusivity_states(SubLObject pf, SubLObject exclusivity_states) {
        {
            SubLObject cdolist_list_var = exclusivity_states;
            SubLObject state = NIL;
            for (state = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state = cdolist_list_var.first()) {
                if (NIL != exc_state_satisfied_yetP(state)) {
                    if (NIL != member(pf, exc_state_phys_fields(state), symbol_function(EQ), UNPROVIDED)) {
                        return list(exc_state_default_value(state));
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Returns all #$mutuallyExclusiveSchemaFieldListWRT gafs relevant to this ks.
     */
    public static final SubLObject get_mutually_exclusive_field_gafs_internal(SubLObject ks) {
        return kb_mapping_utilities.pred_value_gafs(reportgen_physical_schema_from_knowledge_source(ks), $const42$mutuallyExclusiveSchemaFieldListW, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_mutually_exclusive_field_gafs(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return get_mutually_exclusive_field_gafs_internal(ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(get_mutually_exclusive_field_gafs_internal(ks)));
                        memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject get_default_boolean_string_for_ks_internal(SubLObject ks, SubLObject bool_value) {
        return kb_mapping_utilities.pred_arg_values(ks, $$defaultBooleanStringsForKS, bool_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject get_default_boolean_string_for_ks(SubLObject ks, SubLObject bool_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return get_default_boolean_string_for_ks_internal(ks, bool_value);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_DEFAULT_BOOLEAN_STRING_FOR_KS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_DEFAULT_BOOLEAN_STRING_FOR_KS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, GET_DEFAULT_BOOLEAN_STRING_FOR_KS, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(ks, bool_value);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (ks == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (bool_value == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(get_default_boolean_string_for_ks_internal(ks, bool_value)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(ks, bool_value));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Assumes argument is #$True or #$False.  Returns the opposite.
     */
    public static final SubLObject opposite_boolean_constant(SubLObject constant) {
        return constant == $$True ? ((SubLObject) ($$False)) : $$True;
    }

    /**
     * Return the SKS for the 'input document' for a report which is described by the given knowledge source.
     */
    public static final SubLObject input_ks_from_report_ks_internal(SubLObject ks) {
        return kb_mapping_utilities.fpred_value(ks, $$derivedFromInput, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject input_ks_from_report_ks(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return input_ks_from_report_ks_internal(ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INPUT_KS_FROM_REPORT_KS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INPUT_KS_FROM_REPORT_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, INPUT_KS_FROM_REPORT_KS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(input_ks_from_report_ks_internal(ks)));
                        memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Return the 'base query' for a report which is described by the given knowledge source.
     */
    public static final SubLObject base_query_from_ks_internal(SubLObject ks) {
        return kb_mapping_utilities.fpred_value(ks, $$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject base_query_from_ks(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return base_query_from_ks_internal(ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, BASE_QUERY_FROM_KS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), BASE_QUERY_FROM_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, BASE_QUERY_FROM_KS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(base_query_from_ks_internal(ks)));
                        memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Get the CycL arg position for the free variable in the base query sentence whose binding is the result
     * (entity) that the base query is supposed to find.
     */
    public static final SubLObject result_argpos_in_base_query_internal(SubLObject ks) {
        return kb_mapping_utilities.fpred_value(base_query_from_ks(ks), $$baseQueryUsesAnswersInPosition, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static final SubLObject result_argpos_in_base_query(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return result_argpos_in_base_query_internal(ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RESULT_ARGPOS_IN_BASE_QUERY, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RESULT_ARGPOS_IN_BASE_QUERY, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RESULT_ARGPOS_IN_BASE_QUERY, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, ks, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(result_argpos_in_base_query_internal(ks)));
                        memoization_state.caching_state_put(caching_state, ks, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Return single physical schema associated with knowledge source.
     */
    public static final SubLObject reportgen_physical_schema_from_knowledge_source(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject schemata = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        schemata = list_utilities.fast_remove_duplicates(sksi_kb_accessors.sk_source_physical_schemata(ks), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.singletonP(schemata)) {
                        Errors.error($str_alt53$_A_is_not_an_appropriate_knowledg, ks);
                    }
                }
                return schemata.first();
            }
        }
    }

    /**
     * Return single logical schema associated with knowledge source.
     */
    public static final SubLObject reportgen_logical_schema_from_knowledge_source(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject schemata = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        schemata = list_utilities.fast_remove_duplicates(sksi_kb_accessors.sk_source_logical_schemata(ks), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.singletonP(schemata)) {
                        Errors.error($str_alt54$_A_is_not_an_appropriate_knowledg, ks);
                    }
                }
                return schemata.first();
            }
        }
    }

    /**
     * Return the list of physical fields (ultimately) associated with a knowledge source.
     */
    public static final SubLObject reportgen_schema_field_list(SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        result = sksi_kb_accessors.physical_schema_ordered_field_list(reportgen_physical_schema_from_knowledge_source(ks));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given a URI representing a medical entity, return the Cyc constant that means the same thing.
     */
    public static final SubLObject procedure_type_from_uri(SubLObject uri, SubLObject mt, SubLObject data_source, SubLObject pred) {
        if (mt == UNPROVIDED) {
            mt = $$CCFOntologyMt;
        }
        if (data_source == UNPROVIDED) {
            data_source = $$CCF_SemanticDBOntology;
        }
        if (pred == UNPROVIDED) {
            pred = $$rdf_type;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject pred_var = $const59$synonymousExternalConceptWRTPredi;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(uri, FOUR_INTEGER, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(uri, FOUR_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_1 = NIL;
                                                            SubLObject token_var_2 = NIL;
                                                            while (NIL == done_var_1) {
                                                                {
                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                    SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                    if (NIL != valid_3) {
                                                                        if (assertions_high.gaf_arg2(assertion) == data_source) {
                                                                            if (assertions_high.gaf_arg3(assertion) == pred) {
                                                                                if (NIL != v_answer) {
                                                                                    Errors.error($str_alt61$The_URI__A_is_mapped_to_more_than, uri);
                                                                                } else {
                                                                                    v_answer = assertions_high.gaf_arg1(assertion);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_1 = makeBoolean(NIL == valid_3);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject encoding_logical_field_indexical_internal(SubLObject expr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(expr);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.exactly_one_distinct_memberP(lfis, UNPROVIDED)) {
                        Errors.error($str_alt63$The_expression__A_is_supposed_to_, expr);
                    }
                }
                return lfis.first();
            }
        }
    }

    public static final SubLObject encoding_logical_field_indexical(SubLObject expr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return encoding_logical_field_indexical_internal(expr);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ENCODING_LOGICAL_FIELD_INDEXICAL, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ENCODING_LOGICAL_FIELD_INDEXICAL, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, ENCODING_LOGICAL_FIELD_INDEXICAL, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, expr, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(encoding_logical_field_indexical_internal(expr)));
                        memoization_state.caching_state_put(caching_state, expr, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * Get the ONE associated encoding expression to a physical field.  Error if there is not exactly one.
     *
     * @return 0 the encoding expression
     * @return 1 booleanp; Should we collect multiple values in an extensional set?
     */
    public static final SubLObject reportgen_encoding_expression_from_physical_field_internal(SubLObject pf, SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exprs = reportgen_encoding_expressions_from_physical_field(pf, ks);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.exactly_one_distinct_memberP(exprs, UNPROVIDED)) {
                        Errors.error($str_alt65$Field__A_is_required_to_have_only, pf, length(list_utilities.fast_remove_duplicates(exprs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    }
                }
                {
                    SubLObject encoding_expression = exprs.first();
                    SubLObject lfi = encoding_logical_field_indexical(encoding_expression);
                    SubLObject set_of_values_expression = el_utilities.make_unary_formula($$SetOfValuesOfFn, lfi);
                    SubLObject collect_multiple_valuesP = list_utilities.sublisp_boolean(cycl_utilities.expression_find(set_of_values_expression, encoding_expression, T, symbol_function(EQUAL), UNPROVIDED));
                    SubLObject modified_encoding_expression = cycl_utilities.expression_subst(lfi, set_of_values_expression, encoding_expression, symbol_function(EQUALP), UNPROVIDED);
                    return values(modified_encoding_expression, collect_multiple_valuesP);
                }
            }
        }
    }

    public static final SubLObject reportgen_encoding_expression_from_physical_field(SubLObject pf, SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return reportgen_encoding_expression_from_physical_field_internal(pf, ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pf, ks);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pf == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (ks == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(reportgen_encoding_expression_from_physical_field_internal(pf, ks)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pf, ks));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Get the associated encoding expressions (presumably involving one or more logical field indexicals) to a
     * physical field.
     */
    public static final SubLObject reportgen_encoding_expressions_from_physical_field_internal(SubLObject pf, SubLObject ks) {
        return sksi_field_translation_utilities.relevant_field_encodings(pf, reportgen_physical_schema_from_knowledge_source(ks), reportgen_logical_schema_from_knowledge_source(ks));
    }

    public static final SubLObject reportgen_encoding_expressions_from_physical_field(SubLObject pf, SubLObject ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return reportgen_encoding_expressions_from_physical_field_internal(pf, ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(pf, ks);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (pf == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (ks == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(reportgen_encoding_expressions_from_physical_field_internal(pf, ks)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pf, ks));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static final SubLObject decoding_for_input_lfi_internal(SubLObject lfi, SubLObject input_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject decodings = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(input_ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        decodings = list_utilities.fast_remove_duplicates(sksi_field_translation_utilities.relevant_field_decodings_for_indexical(lfi, list(reportgen_logical_schema_from_knowledge_source(input_ks)), list(reportgen_physical_schema_from_knowledge_source(input_ks))), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.singletonP(decodings)) {
                                Errors.error($str_alt69$_A_should_only_have_one_decoding_, lfi, input_ks);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return decodings.first();
            }
        }
    }

    public static final SubLObject decoding_for_input_lfi(SubLObject lfi, SubLObject input_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return decoding_for_input_lfi_internal(lfi, input_ks);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DECODING_FOR_INPUT_LFI, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DECODING_FOR_INPUT_LFI, TWO_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, DECODING_FOR_INPUT_LFI, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(lfi, input_ks);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw10$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (lfi == cached_args.first()) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && (input_ks == cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(decoding_for_input_lfi_internal(lfi, input_ks)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(lfi, input_ks));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    /**
     * Get the ONE associated binding-position gaf (modulo mt) to a logical field indexical.  Error if there is not exactly one.
     * If there is only one gaf but it appears in multiple mt's, the mt of the gaf returned is arbitrary.
     */
    public static final SubLObject binding_position_gaf_from_logical_indexical(SubLObject lfi) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = binding_position_gafs_from_logical_indexical(lfi);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.exactly_one_distinct_memberP(gafs, symbol_function(GAF_FORMULAS_EQ))) {
                        Errors.error($str_alt71$Field_indexical__A_is_required_to, lfi, length(list_utilities.fast_remove_duplicates(gafs, symbol_function(GAF_FORMULAS_EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    }
                }
                return gafs.first();
            }
        }
    }

    public static final SubLObject gaf_formulas_eq(SubLObject gaf1, SubLObject gaf2) {
        return eq(assertions_high.gaf_formula(gaf1), assertions_high.gaf_formula(gaf2));
    }

    /**
     * Returns all $bindingInPositionFromUsedInPositionInFor gafs for lfi.
     */
    public static final SubLObject binding_position_gafs_from_logical_indexical(SubLObject lfi) {
        return kb_mapping_utilities.pred_value_gafs(lfi, $const72$bindingInPositionFromUsedInPositi, FIVE_INTEGER, UNPROVIDED);
    }

    /**
     * Returns a list of column numbers (numbering starts at 1) representing which columns in the input should be copied verbatim
     * to give values for lfi, or NIL if no such column exists (i.e. there is no corresponding #$valueFromColumnInSKS
     * assertion).
     */
    public static final SubLObject input_columns_from_logical_indexical(SubLObject lfi, SubLObject input_ks) {
        return kb_mapping_utilities.pred_arg_values(lfi, $$valueFromColumnInSKS, input_ks, TWO_INTEGER, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
    }

    /**
     * Destructively replace all occurrences of the free variable found at cycl-arg-pos in sentence with obj.
     */
    public static final SubLObject nbind_into_sentence(SubLObject sentence, SubLObject cycl_arg_pos, SubLObject obj) {
        return cycl_utilities.expression_nsubst(obj, cycl_utilities.formula_cycl_arg_position(sentence, cycl_arg_pos, UNPROVIDED), sentence, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Given a query object from the KB, a CycL arg-position, and an object, return the query sentence which is kbquery's
     * sentence but with obj substituted for the free variable at cycl-arg-pos.
     */
    public static final SubLObject bind_into_query_sentence(SubLObject kbquery, SubLObject cycl_arg_pos, SubLObject obj) {
        return nbind_into_sentence(el_utilities.copy_expression(kb_query.kbq_sentence(kbquery)), cycl_arg_pos, obj);
    }

    /**
     * Return #$False if x is nil, otherwise return #$True.
     */
    public static final SubLObject convert_to_boolean_kb_constant(SubLObject x) {
        return NIL != x ? ((SubLObject) ($$True)) : $$False;
    }

    /**
     * Look for the 'special marker' that indicates that this gaf is for a closed query (i.e. it is expected to return true or false
     * rather than return a value).
     */
    public static final SubLObject binding_gaf_for_closed_queryP(SubLObject gaf) {
        {
            SubLObject datum = cycl_utilities.formula_args(gaf, UNPROVIDED);
            SubLObject current = datum;
            SubLObject base_query = NIL;
            SubLObject get_thing_argpos = NIL;
            SubLObject final_query = NIL;
            SubLObject put_thing_argpos = NIL;
            SubLObject lfi = NIL;
            SubLObject final_answer_argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            base_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            get_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            final_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            put_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            final_answer_argpos = current.first();
            current = current.rest();
            if (NIL == current) {
                return equal(final_answer_argpos, $list_alt75);
            } else {
                cdestructuring_bind_error(datum, $list_alt74);
            }
        }
        return NIL;
    }

    /**
     * Given a #$bindingInPositionFromUsedInPositionInFor gaf and an entity, run the resulting
     * bound query and return a list of the answers received (even if there's only one, which will often be the case).
     */
    public static final SubLObject answers_from_binding_gaf(SubLObject bind_gaf, SubLObject entity) {
        {
            SubLObject datum = cycl_utilities.formula_args(bind_gaf, UNPROVIDED);
            SubLObject current = datum;
            SubLObject base_query = NIL;
            SubLObject get_thing_argpos = NIL;
            SubLObject final_query = NIL;
            SubLObject put_thing_argpos = NIL;
            SubLObject lfi = NIL;
            SubLObject final_answer_argpos = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            base_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            get_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            final_query = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            put_thing_argpos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            lfi = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt74);
            final_answer_argpos = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject new_query_sentence = bind_into_query_sentence(final_query, put_thing_argpos, entity);
                    SubLObject mt = kb_query.kbq_mt(final_query);
                    SubLObject props = kb_query.kbq_query_properties(final_query);
                    return NIL != binding_gaf_for_closed_queryP(bind_gaf) ? ((SubLObject) (list(convert_to_boolean_kb_constant(run_column_query(new_query_sentence, mt, props))))) : query_variable_using_query_function(cycl_utilities.formula_cycl_arg_position(new_query_sentence, final_answer_argpos, UNPROVIDED), new_query_sentence, symbol_function(RUN_COLUMN_QUERY), mt, props);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt74);
            }
        }
        return NIL;
    }

    /**
     * Given a logical field indexical, calculate the list of appropriate values for a particular entity.
     */
    public static final SubLObject answers_from_lfi(SubLObject lfi, SubLObject ks, SubLObject entity, SubLObject original_input_list) {
        {
            SubLObject bind_gafs = binding_position_gafs_from_logical_indexical(lfi);
            if (NIL != bind_gafs) {
                {
                    SubLObject answers = NIL;
                    SubLObject cdolist_list_var = bind_gafs;
                    SubLObject bind_gaf = NIL;
                    for (bind_gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bind_gaf = cdolist_list_var.first()) {
                        answers = append(answers, answers_from_binding_gaf(bind_gaf, entity));
                    }
                    return answers;
                }
            } else {
                {
                    SubLObject column_nos = input_columns_from_logical_indexical(lfi, input_ks_from_report_ks(ks));
                    SubLObject answers = NIL;
                    SubLObject cdolist_list_var = column_nos;
                    SubLObject column_no = NIL;
                    for (column_no = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_no = cdolist_list_var.first()) {
                        answers = cons(translate_input_column_no(original_input_list, column_no, input_ks_from_report_ks(ks)), answers);
                    }
                    return nreverse(answers);
                }
            }
        }
    }

    /**
     * NOTE: TODO: This is a hack so that #$valueFromColumnInSKS will continue to work in early implementations
     * of represeting the input document in the KB.  This is necessarily brittle and should be removed or
     * redone once issues of how to represent logical vs. physical values from the input are resolved.
     * Given a column number and a row of PHYSICAL input values, return the LOGICAL value corresponding to the
     * physical value from that column.
     */
    public static final SubLObject translate_input_column_no(SubLObject original_input_list, SubLObject column_no, SubLObject input_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt(input_ks);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject logical_fields = sksi_kb_accessors.sksi_get_decoding_mapped_logical_fields_for_physical_field(nth(subtract(column_no, ONE_INTEGER), reportgen_schema_field_list(input_ks)));
                            logical_fields = list_utilities.fast_remove_duplicates(logical_fields, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == list_utilities.singletonP(logical_fields)) {
                                    Errors.error($str_alt76$Column__D_in__A_doesn_t_correspon, column_no, input_ks);
                                }
                            }
                            result = evaluate_lfi_from_input_row(sksi_kb_accessors.indexical_for_logical_field(logical_fields.first()), original_input_list, input_ks);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Given encoding expressions (from #$fieldEncoding gafs) and an entity, calculate the final list of physical values.
     */
    public static final SubLObject values_from_encoding_expressions(SubLObject exprs, SubLObject ks, SubLObject entity, SubLObject original_input_list) {
        {
            SubLObject final_values = NIL;
            SubLObject cdolist_list_var = exprs;
            SubLObject expr = NIL;
            for (expr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expr = cdolist_list_var.first()) {
                {
                    SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(expr);
                    SubLObject cart_prod = NIL;
                    SubLObject all_answers_for_each_lfi = NIL;
                    SubLObject no_answers = NIL;
                    if (NIL == no_answers) {
                        {
                            SubLObject csome_list_var = lfis;
                            SubLObject lfi = NIL;
                            for (lfi = csome_list_var.first(); !((NIL != no_answers) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
                                {
                                    SubLObject answers = answers_from_lfi(lfi, ks, entity, original_input_list);
                                    if (NIL == answers) {
                                        no_answers = T;
                                    } else {
                                        all_answers_for_each_lfi = cons(list_utilities.fast_delete_duplicates(answers, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), all_answers_for_each_lfi);
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == no_answers) {
                        all_answers_for_each_lfi = nreverse(all_answers_for_each_lfi);
                        cart_prod = reportgen_cartesian_product(all_answers_for_each_lfi);
                        {
                            SubLObject cdolist_list_var_5 = cart_prod;
                            SubLObject values = NIL;
                            for (values = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , values = cdolist_list_var_5.first()) {
                                final_values = cons(sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(pairlis(lfis, values, UNPROVIDED), expr, ks, UNPROVIDED), final_values);
                            }
                        }
                    }
                }
            }
            return final_values;
        }
    }

    /**
     * Given a list of n lists, return a list of every possible list of length n that has exactly one element from each
     * of the original n lists.  Result is not guaranteed to be in any particular order (but the individual member lists are).
     * For example if the input is
     * '((A)
     * (B1 B2)
     * (C)
     * (D1 D2 D3)
     * (E))
     * then the output should be something like
     * '((A B1 C D1 E)
     * (A B2 C D1 E)
     * (A B1 C D2 E)
     * (A B2 C D2 E)
     * (A B1 C D3 E)
     * (A B2 C D3 E))
     * N.B. If the input is '() (no lists) then the output is '(()) (the one list of length 0).  Also note that if
     * any of the n lists is NIL then of course the output is NIL (as there is no list that has exactly one element
     * from each of the original lists).
     */
    public static final SubLObject reportgen_cartesian_product(SubLObject lists) {
        if (NIL == lists) {
            return $list_alt77;
        } else {
            {
                SubLObject first_list = lists.first();
                SubLObject cartesian_rest = reportgen_cartesian_product(lists.rest());
                SubLObject result = NIL;
                SubLObject cdolist_list_var = first_list;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_6 = cartesian_rest;
                        SubLObject current_list = NIL;
                        for (current_list = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , current_list = cdolist_list_var_6.first()) {
                            result = cons(cons(item, current_list), result);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject declare_ccf_report_generation_file() {
        declareFunction("reportgen_output_rows_from_input_row", "REPORTGEN-OUTPUT-ROWS-FROM-INPUT-ROW", 2, 1, false);
        declareFunction("output_rows_from_entity", "OUTPUT-ROWS-FROM-ENTITY", 3, 1, false);
        declareFunction("focal_entities_from_input_row", "FOCAL-ENTITIES-FROM-INPUT-ROW", 2, 0, false);
        declareFunction("get_bound_base_query_sentence", "GET-BOUND-BASE-QUERY-SENTENCE", 2, 0, false);
        declareFunction("get_free_vars_with_values", "GET-FREE-VARS-WITH-VALUES", 3, 0, false);
        declareFunction("evaluate_lfi_from_input_row", "EVALUATE-LFI-FROM-INPUT-ROW", 3, 0, false);
        declareFunction("get_argposes_and_lfis_for_base_query_internal", "GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY-INTERNAL", 2, 0, false);
        declareFunction("get_argposes_and_lfis_for_base_query", "GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY", 2, 0, false);
        declareFunction("query_variable_using_query_function", "QUERY-VARIABLE-USING-QUERY-FUNCTION", 3, 2, false);
        declareFunction("clear_run_column_query", "CLEAR-RUN-COLUMN-QUERY", 0, 0, false);
        declareFunction("remove_run_column_query", "REMOVE-RUN-COLUMN-QUERY", 1, 2, false);
        declareFunction("run_column_query_internal", "RUN-COLUMN-QUERY-INTERNAL", 3, 0, false);
        declareFunction("run_column_query", "RUN-COLUMN-QUERY", 1, 2, false);
        declareFunction("reportgen_schema_field_name_list", "REPORTGEN-SCHEMA-FIELD-NAME-LIST", 1, 0, false);
        declareFunction("reportgen_schema_field_name_list_int", "REPORTGEN-SCHEMA-FIELD-NAME-LIST-INT", 1, 0, false);
        declareFunction("reportgen_input_doc_field_name_list", "REPORTGEN-INPUT-DOC-FIELD-NAME-LIST", 1, 0, false);
        declareFunction("reportgen_exclusivity_state_print_function_trampoline", "REPORTGEN-EXCLUSIVITY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("reportgen_exclusivity_state_p", "REPORTGEN-EXCLUSIVITY-STATE-P", 1, 0, false);
        new ccf_report_generation.$reportgen_exclusivity_state_p$UnaryFunction();
        declareFunction("exc_state_phys_fields", "EXC-STATE-PHYS-FIELDS", 1, 0, false);
        declareFunction("exc_state_exc_value", "EXC-STATE-EXC-VALUE", 1, 0, false);
        declareFunction("exc_state_default_value", "EXC-STATE-DEFAULT-VALUE", 1, 0, false);
        declareFunction("exc_state_satisfied_yetP", "EXC-STATE-SATISFIED-YET?", 1, 0, false);
        declareFunction("_csetf_exc_state_phys_fields", "_CSETF-EXC-STATE-PHYS-FIELDS", 2, 0, false);
        declareFunction("_csetf_exc_state_exc_value", "_CSETF-EXC-STATE-EXC-VALUE", 2, 0, false);
        declareFunction("_csetf_exc_state_default_value", "_CSETF-EXC-STATE-DEFAULT-VALUE", 2, 0, false);
        declareFunction("_csetf_exc_state_satisfied_yetP", "_CSETF-EXC-STATE-SATISFIED-YET?", 2, 0, false);
        declareFunction("make_reportgen_exclusivity_state", "MAKE-REPORTGEN-EXCLUSIVITY-STATE", 0, 1, false);
        declareFunction("print_exc_state", "PRINT-EXC-STATE", 3, 0, false);
        declareFunction("get_fresh_exclusivity_states", "GET-FRESH-EXCLUSIVITY-STATES", 1, 0, false);
        declareFunction("values_for_pf", "VALUES-FOR-PF", 5, 0, false);
        declareFunction("nupdate_exclusivity_states", "NUPDATE-EXCLUSIVITY-STATES", 3, 0, false);
        declareFunction("values_for_pf_from_exclusivity_states", "VALUES-FOR-PF-FROM-EXCLUSIVITY-STATES", 2, 0, false);
        declareFunction("get_mutually_exclusive_field_gafs_internal", "GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS-INTERNAL", 1, 0, false);
        declareFunction("get_mutually_exclusive_field_gafs", "GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS", 1, 0, false);
        declareFunction("get_default_boolean_string_for_ks_internal", "GET-DEFAULT-BOOLEAN-STRING-FOR-KS-INTERNAL", 2, 0, false);
        declareFunction("get_default_boolean_string_for_ks", "GET-DEFAULT-BOOLEAN-STRING-FOR-KS", 2, 0, false);
        declareFunction("opposite_boolean_constant", "OPPOSITE-BOOLEAN-CONSTANT", 1, 0, false);
        declareFunction("input_ks_from_report_ks_internal", "INPUT-KS-FROM-REPORT-KS-INTERNAL", 1, 0, false);
        declareFunction("input_ks_from_report_ks", "INPUT-KS-FROM-REPORT-KS", 1, 0, false);
        declareFunction("base_query_from_ks_internal", "BASE-QUERY-FROM-KS-INTERNAL", 1, 0, false);
        declareFunction("base_query_from_ks", "BASE-QUERY-FROM-KS", 1, 0, false);
        declareFunction("result_argpos_in_base_query_internal", "RESULT-ARGPOS-IN-BASE-QUERY-INTERNAL", 1, 0, false);
        declareFunction("result_argpos_in_base_query", "RESULT-ARGPOS-IN-BASE-QUERY", 1, 0, false);
        declareFunction("reportgen_physical_schema_from_knowledge_source", "REPORTGEN-PHYSICAL-SCHEMA-FROM-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("reportgen_logical_schema_from_knowledge_source", "REPORTGEN-LOGICAL-SCHEMA-FROM-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("reportgen_schema_field_list", "REPORTGEN-SCHEMA-FIELD-LIST", 1, 0, false);
        declareFunction("procedure_type_from_uri", "PROCEDURE-TYPE-FROM-URI", 1, 3, false);
        declareFunction("encoding_logical_field_indexical_internal", "ENCODING-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 0, false);
        declareFunction("encoding_logical_field_indexical", "ENCODING-LOGICAL-FIELD-INDEXICAL", 1, 0, false);
        declareFunction("reportgen_encoding_expression_from_physical_field_internal", "REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD-INTERNAL", 2, 0, false);
        declareFunction("reportgen_encoding_expression_from_physical_field", "REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD", 2, 0, false);
        declareFunction("reportgen_encoding_expressions_from_physical_field_internal", "REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD-INTERNAL", 2, 0, false);
        declareFunction("reportgen_encoding_expressions_from_physical_field", "REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD", 2, 0, false);
        declareFunction("decoding_for_input_lfi_internal", "DECODING-FOR-INPUT-LFI-INTERNAL", 2, 0, false);
        declareFunction("decoding_for_input_lfi", "DECODING-FOR-INPUT-LFI", 2, 0, false);
        declareFunction("binding_position_gaf_from_logical_indexical", "BINDING-POSITION-GAF-FROM-LOGICAL-INDEXICAL", 1, 0, false);
        declareFunction("gaf_formulas_eq", "GAF-FORMULAS-EQ", 2, 0, false);
        declareFunction("binding_position_gafs_from_logical_indexical", "BINDING-POSITION-GAFS-FROM-LOGICAL-INDEXICAL", 1, 0, false);
        declareFunction("input_columns_from_logical_indexical", "INPUT-COLUMNS-FROM-LOGICAL-INDEXICAL", 2, 0, false);
        declareFunction("nbind_into_sentence", "NBIND-INTO-SENTENCE", 3, 0, false);
        declareFunction("bind_into_query_sentence", "BIND-INTO-QUERY-SENTENCE", 3, 0, false);
        declareFunction("convert_to_boolean_kb_constant", "CONVERT-TO-BOOLEAN-KB-CONSTANT", 1, 0, false);
        declareFunction("binding_gaf_for_closed_queryP", "BINDING-GAF-FOR-CLOSED-QUERY?", 1, 0, false);
        declareFunction("answers_from_binding_gaf", "ANSWERS-FROM-BINDING-GAF", 2, 0, false);
        declareFunction("answers_from_lfi", "ANSWERS-FROM-LFI", 4, 0, false);
        declareFunction("translate_input_column_no", "TRANSLATE-INPUT-COLUMN-NO", 3, 0, false);
        declareFunction("values_from_encoding_expressions", "VALUES-FROM-ENCODING-EXPRESSIONS", 4, 0, false);
        declareFunction("reportgen_cartesian_product", "REPORTGEN-CARTESIAN-PRODUCT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_ccf_report_generation_file() {
        deflexical("*REPORTGEN-MINIMAL-PROPERTY*", $list_alt0);
        deflexical("*REPORTGEN-EASY-ONE-ANSWER-QUERY-PROPERTIES*", append($reportgen_minimal_property$.getGlobalValue(), $list_alt1));
        deflexical("*RUN-COLUMN-QUERY-CACHING-STATE*", NIL);
        defconstant("*DTP-REPORTGEN-EXCLUSIVITY-STATE*", REPORTGEN_EXCLUSIVITY_STATE);
        return NIL;
    }

    public static final SubLObject setup_ccf_report_generation_file() {
                access_macros.register_external_symbol(REPORTGEN_OUTPUT_ROWS_FROM_INPUT_ROW);
        memoization_state.note_memoized_function(GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY);
        memoization_state.note_globally_cached_function(RUN_COLUMN_QUERY);
        access_macros.register_external_symbol(REPORTGEN_SCHEMA_FIELD_NAME_LIST);
        access_macros.register_external_symbol(REPORTGEN_INPUT_DOC_FIELD_NAME_LIST);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_reportgen_exclusivity_state$.getGlobalValue(), symbol_function(REPORTGEN_EXCLUSIVITY_STATE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EXC_STATE_PHYS_FIELDS, _CSETF_EXC_STATE_PHYS_FIELDS);
        def_csetf(EXC_STATE_EXC_VALUE, _CSETF_EXC_STATE_EXC_VALUE);
        def_csetf(EXC_STATE_DEFAULT_VALUE, _CSETF_EXC_STATE_DEFAULT_VALUE);
        def_csetf($sym32$EXC_STATE_SATISFIED_YET_, $sym33$_CSETF_EXC_STATE_SATISFIED_YET_);
        identity(REPORTGEN_EXCLUSIVITY_STATE);
        memoization_state.note_memoized_function(GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS);
        memoization_state.note_memoized_function(GET_DEFAULT_BOOLEAN_STRING_FOR_KS);
        memoization_state.note_memoized_function(INPUT_KS_FROM_REPORT_KS);
        memoization_state.note_memoized_function(BASE_QUERY_FROM_KS);
        memoization_state.note_memoized_function(RESULT_ARGPOS_IN_BASE_QUERY);
        memoization_state.note_memoized_function(ENCODING_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function(REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD);
        memoization_state.note_memoized_function(REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD);
        memoization_state.note_memoized_function(DECODING_FOR_INPUT_LFI);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

    static private final SubLList $list_alt1 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    private static final SubLSymbol REPORTGEN_OUTPUT_ROWS_FROM_INPUT_ROW = makeSymbol("REPORTGEN-OUTPUT-ROWS-FROM-INPUT-ROW");

    static private final SubLString $str_alt3$_ = makeString(".");

    static private final SubLList $list_alt4 = list(list(makeString("No entity or event found corresponding to this row.")));

    private static final SubLSymbol GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY = makeSymbol("GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY");

    static private final SubLList $list_alt6 = cons(makeSymbol("?ARGPOS"), makeSymbol("?LFI"));

    public static final SubLObject $$queryNeedsThingBoundInPosition = constant_handles.reader_make_constant_shell(makeString("queryNeedsThingBoundInPosition"));

    static private final SubLList $list_alt8 = list(makeSymbol("?LFI"), makeSymbol("?ARGPOS"));

    static private final SubLList $list_alt9 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol RUN_COLUMN_QUERY = makeSymbol("RUN-COLUMN-QUERY");





    public static final SubLSymbol $run_column_query_caching_state$ = makeSymbol("*RUN-COLUMN-QUERY-CACHING-STATE*");



    private static final SubLSymbol REPORTGEN_SCHEMA_FIELD_NAME_LIST = makeSymbol("REPORTGEN-SCHEMA-FIELD-NAME-LIST");

    private static final SubLSymbol REPORTGEN_INPUT_DOC_FIELD_NAME_LIST = makeSymbol("REPORTGEN-INPUT-DOC-FIELD-NAME-LIST");

    private static final SubLSymbol REPORTGEN_EXCLUSIVITY_STATE = makeSymbol("REPORTGEN-EXCLUSIVITY-STATE");

    private static final SubLSymbol REPORTGEN_EXCLUSIVITY_STATE_P = makeSymbol("REPORTGEN-EXCLUSIVITY-STATE-P");

    static private final SubLList $list_alt20 = list(makeSymbol("PHYS-FIELDS"), makeSymbol("EXC-VALUE"), makeSymbol("DEFAULT-VALUE"), makeSymbol("SATISFIED-YET?"));

    static private final SubLList $list_alt21 = list(makeKeyword("PHYS-FIELDS"), makeKeyword("EXC-VALUE"), makeKeyword("DEFAULT-VALUE"), makeKeyword("SATISFIED-YET?"));

    static private final SubLList $list_alt22 = list(makeSymbol("EXC-STATE-PHYS-FIELDS"), makeSymbol("EXC-STATE-EXC-VALUE"), makeSymbol("EXC-STATE-DEFAULT-VALUE"), makeSymbol("EXC-STATE-SATISFIED-YET?"));

    static private final SubLList $list_alt23 = list(makeSymbol("_CSETF-EXC-STATE-PHYS-FIELDS"), makeSymbol("_CSETF-EXC-STATE-EXC-VALUE"), makeSymbol("_CSETF-EXC-STATE-DEFAULT-VALUE"), makeSymbol("_CSETF-EXC-STATE-SATISFIED-YET?"));

    private static final SubLSymbol PRINT_EXC_STATE = makeSymbol("PRINT-EXC-STATE");

    private static final SubLSymbol REPORTGEN_EXCLUSIVITY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REPORTGEN-EXCLUSIVITY-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EXC_STATE_PHYS_FIELDS = makeSymbol("EXC-STATE-PHYS-FIELDS");

    public static final SubLSymbol _CSETF_EXC_STATE_PHYS_FIELDS = makeSymbol("_CSETF-EXC-STATE-PHYS-FIELDS");

    private static final SubLSymbol EXC_STATE_EXC_VALUE = makeSymbol("EXC-STATE-EXC-VALUE");

    public static final SubLSymbol _CSETF_EXC_STATE_EXC_VALUE = makeSymbol("_CSETF-EXC-STATE-EXC-VALUE");

    private static final SubLSymbol EXC_STATE_DEFAULT_VALUE = makeSymbol("EXC-STATE-DEFAULT-VALUE");

    public static final SubLSymbol _CSETF_EXC_STATE_DEFAULT_VALUE = makeSymbol("_CSETF-EXC-STATE-DEFAULT-VALUE");

    static private final SubLSymbol $sym32$EXC_STATE_SATISFIED_YET_ = makeSymbol("EXC-STATE-SATISFIED-YET?");

    static private final SubLSymbol $sym33$_CSETF_EXC_STATE_SATISFIED_YET_ = makeSymbol("_CSETF-EXC-STATE-SATISFIED-YET?");

    private static final SubLSymbol $PHYS_FIELDS = makeKeyword("PHYS-FIELDS");

    private static final SubLSymbol $EXC_VALUE = makeKeyword("EXC-VALUE");



    public static final SubLSymbol $kw37$SATISFIED_YET_ = makeKeyword("SATISFIED-YET?");

    static private final SubLString $str_alt38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt39$__a_EXCLUSIVITY_STATE__a__a__a_ = makeString("<~a EXCLUSIVITY-STATE:~a:~a:~a>");

    static private final SubLList $list_alt40 = list(makeKeyword("SATISFIED-YET?"), NIL);

    private static final SubLSymbol GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS = makeSymbol("GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS");

    public static final SubLObject $const42$mutuallyExclusiveSchemaFieldListW = constant_handles.reader_make_constant_shell(makeString("mutuallyExclusiveSchemaFieldListWRT"));

    private static final SubLSymbol GET_DEFAULT_BOOLEAN_STRING_FOR_KS = makeSymbol("GET-DEFAULT-BOOLEAN-STRING-FOR-KS");

    public static final SubLObject $$defaultBooleanStringsForKS = constant_handles.reader_make_constant_shell(makeString("defaultBooleanStringsForKS"));

    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

    public static final SubLObject $$False = constant_handles.reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol INPUT_KS_FROM_REPORT_KS = makeSymbol("INPUT-KS-FROM-REPORT-KS");

    public static final SubLObject $$derivedFromInput = constant_handles.reader_make_constant_shell(makeString("derivedFromInput"));

    private static final SubLSymbol BASE_QUERY_FROM_KS = makeSymbol("BASE-QUERY-FROM-KS");

    public static final SubLObject $$baseQueryForReportType = constant_handles.reader_make_constant_shell(makeString("baseQueryForReportType"));

    private static final SubLSymbol RESULT_ARGPOS_IN_BASE_QUERY = makeSymbol("RESULT-ARGPOS-IN-BASE-QUERY");

    public static final SubLObject $$baseQueryUsesAnswersInPosition = constant_handles.reader_make_constant_shell(makeString("baseQueryUsesAnswersInPosition"));

    static private final SubLString $str_alt53$_A_is_not_an_appropriate_knowledg = makeString("~A is not an appropriate knowledge source for a report (must have exactly one physical schema).");

    static private final SubLString $str_alt54$_A_is_not_an_appropriate_knowledg = makeString("~A is not an appropriate knowledge source for a report (must have exactly one logical schema).");

    public static final SubLObject $$CCFOntologyMt = constant_handles.reader_make_constant_shell(makeString("CCFOntologyMt"));

    public static final SubLObject $$CCF_SemanticDBOntology = constant_handles.reader_make_constant_shell(makeString("CCF-SemanticDBOntology"));

    public static final SubLObject $$rdf_type = constant_handles.reader_make_constant_shell(makeString("rdf-type"));



    public static final SubLObject $const59$synonymousExternalConceptWRTPredi = constant_handles.reader_make_constant_shell(makeString("synonymousExternalConceptWRTPredicate"));



    static private final SubLString $str_alt61$The_URI__A_is_mapped_to_more_than = makeString("The URI ~A is mapped to more than one Cyc concept.");

    private static final SubLSymbol ENCODING_LOGICAL_FIELD_INDEXICAL = makeSymbol("ENCODING-LOGICAL-FIELD-INDEXICAL");

    static private final SubLString $str_alt63$The_expression__A_is_supposed_to_ = makeString("The expression ~A is supposed to have only one distinct logical field indexical.");

    private static final SubLSymbol REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD = makeSymbol("REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD");

    static private final SubLString $str_alt65$Field__A_is_required_to_have_only = makeString("Field ~A is required to have only one transformation, but it has ~D.");

    public static final SubLObject $$SetOfValuesOfFn = constant_handles.reader_make_constant_shell(makeString("SetOfValuesOfFn"));

    private static final SubLSymbol REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD = makeSymbol("REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD");

    private static final SubLSymbol DECODING_FOR_INPUT_LFI = makeSymbol("DECODING-FOR-INPUT-LFI");

    static private final SubLString $str_alt69$_A_should_only_have_one_decoding_ = makeString("~A should only have one decoding for the knowledge source ~A.");

    private static final SubLSymbol GAF_FORMULAS_EQ = makeSymbol("GAF-FORMULAS-EQ");

    static private final SubLString $str_alt71$Field_indexical__A_is_required_to = makeString("Field indexical ~A is required to have only one associated query, but it has ~D.");

    public static final SubLObject $const72$bindingInPositionFromUsedInPositi = constant_handles.reader_make_constant_shell(makeString("bindingInPositionFromUsedInPositionInFor"));

    public static final SubLObject $$valueFromColumnInSKS = constant_handles.reader_make_constant_shell(makeString("valueFromColumnInSKS"));

    static private final SubLList $list_alt74 = list(makeSymbol("BASE-QUERY"), makeSymbol("GET-THING-ARGPOS"), makeSymbol("FINAL-QUERY"), makeSymbol("PUT-THING-ARGPOS"), makeSymbol("LFI"), makeSymbol("FINAL-ANSWER-ARGPOS"));

    static private final SubLList $list_alt75 = list(constant_handles.reader_make_constant_shell(makeString("TheList")));

    static private final SubLString $str_alt76$Column__D_in__A_doesn_t_correspon = makeString("Column ~D in ~A doesn't correspond to a unique logical field.");

    static private final SubLList $list_alt77 = list(NIL);

    // // Initializers
    public void declareFunctions() {
        declare_ccf_report_generation_file();
    }

    public void initializeVariables() {
        init_ccf_report_generation_file();
    }

    public void runTopLevelForms() {
        setup_ccf_report_generation_file();
    }
}

