/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_input_guid_string_resource$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.cfasl.get_new_cfasl_input_guid_string_resource;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_w;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KCT-PARAMETERS
 *  source file: /cyc/top/cycl/inference/kct-parameters.lisp
 *  created:     2019/07/03 17:37:43
 */
public final class kct_parameters extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kct_parameters() {
    }

    public static final SubLFile me = new kct_parameters();

    public static final String myName = "com.cyc.cycjava.cycl.inference.kct_parameters";

    // // Definitions
    // deflexical
    private static final SubLSymbol $kct_parameters_directory$ = makeSymbol("*KCT-PARAMETERS-DIRECTORY*");



    // deflexical
    private static final SubLSymbol $kct_parameters_log_directory$ = makeSymbol("*KCT-PARAMETERS-LOG-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $kct_parameters_data_directory$ = makeSymbol("*KCT-PARAMETERS-DATA-DIRECTORY*");

    public static final SubLObject basic_kct_parameters_query_metrics() {
        return listS($COMPLETE_TOTAL_TIME, remove($TIME_TO_LAST_ANSWER, inference_datastructures_enumerated_types.all_arete_query_metrics(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * A set of experiment analysis and comparison metrics that's large enough to
     * be useful but small enough to be manageable.
     */
    // deflexical
    private static final SubLSymbol $standard_kct_parameters_query_metrics$ = makeSymbol("*STANDARD-KCT-PARAMETERS-QUERY-METRICS*");

    public static final SubLObject standard_kct_parameters_query_metrics() {
        return $standard_kct_parameters_query_metrics$.getGlobalValue();
    }

    public static final SubLObject all_kct_parameters_query_metrics() {
        return reverse(set_difference(inference_datastructures_enumerated_types.all_query_metrics(), $list_alt7, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject kct_parameters_experiment_full_filename(SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $kct_parameters_experiment_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }

    public static final SubLObject kct_parameters_data_full_filename(SubLObject filename, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $kct_parameters_data_directory$.getGlobalValue();
        }
        return arete.arete_experiment_full_filename(filename, directory);
    }



    /**
     *
     *
     * @see run-arete-experiment
     */
    public static final SubLObject run_kct_parameters_experiment(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt8);
                current_1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt8);
                if (NIL == member(current_1, $list_alt9, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt8);
            }
            {
                SubLObject query_spec_set_tail = property_list_member($QUERY_SPEC_SET, current);
                SubLObject query_spec_set = (NIL != query_spec_set_tail) ? ((SubLObject) (cadr(query_spec_set_tail))) : NIL;
                SubLObject filename_tail = property_list_member($FILENAME, current);
                SubLObject filename = (NIL != filename_tail) ? ((SubLObject) (cadr(filename_tail))) : NIL;
                SubLObject comment_tail = property_list_member($COMMENT, current);
                SubLObject comment = (NIL != comment_tail) ? ((SubLObject) (cadr(comment_tail))) : NIL;
                SubLObject overriding_query_properties_tail = property_list_member($OVERRIDING_QUERY_PROPERTIES, current);
                SubLObject overriding_query_properties = (NIL != overriding_query_properties_tail) ? ((SubLObject) (cadr(overriding_query_properties_tail))) : NIL;
                SubLObject metrics_tail = property_list_member($METRICS, current);
                SubLObject metrics = (NIL != metrics_tail) ? ((SubLObject) (cadr(metrics_tail))) : $list_alt16;
                SubLObject outlier_timeout_tail = property_list_member($OUTLIER_TIMEOUT, current);
                SubLObject outlier_timeout = (NIL != outlier_timeout_tail) ? ((SubLObject) (cadr(outlier_timeout_tail))) : $kct_parameters_outlier_timeout$;
                SubLObject incremental_tail = property_list_member($INCREMENTAL, current);
                SubLObject incremental = (NIL != incremental_tail) ? ((SubLObject) (cadr(incremental_tail))) : T;
                SubLObject include_results_tail = property_list_member($INCLUDE_RESULTS, current);
                SubLObject include_results = (NIL != include_results_tail) ? ((SubLObject) (cadr(include_results_tail))) : NIL;
                SubLObject skip_tail = property_list_member($SKIP, current);
                SubLObject skip = (NIL != skip_tail) ? ((SubLObject) (cadr(skip_tail))) : ZERO_INTEGER;
                SubLObject randomize_tail = property_list_member($RANDOMIZE, current);
                SubLObject randomize = (NIL != randomize_tail) ? ((SubLObject) (cadr(randomize_tail))) : NIL;
                SubLObject count_tail = property_list_member($COUNT, current);
                SubLObject count = (NIL != count_tail) ? ((SubLObject) (cadr(count_tail))) : NIL;
                SubLObject directory_tail = property_list_member($DIRECTORY, current);
                SubLObject directory = (NIL != directory_tail) ? ((SubLObject) (cadr(directory_tail))) : $kct_parameters_experiment_directory$;
                SubLObject filename_var = $sym26$FILENAME_VAR;
                SubLObject full_filename = $sym27$FULL_FILENAME;
                return list(CLET, list(list(filename_var, filename), list(full_filename, list(FWHEN, filename_var, list(KCT_PARAMETERS_EXPERIMENT_FULL_FILENAME, filename_var, directory)))), list(new SubLObject[]{ RUN_KBQ_EXPERIMENT, $QUERY_SPEC_SET, query_spec_set, $FILENAME, full_filename, $IF_FILE_EXISTS, $AUGMENT_OR_RERUN_ERRORS, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $METRICS, metrics, $OUTLIER_TIMEOUT, outlier_timeout, $INCREMENTAL, incremental, $INCLUDE_RESULTS, include_results, $SKIP, skip, $RANDOMIZE, randomize, $COUNT, count }));
            }
        }
    }



    public static final SubLObject clear_load_kct_parameters_experiment() {
        {
            SubLObject cs = $load_kct_parameters_experiment_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_load_kct_parameters_experiment(SubLObject filename) {
        return memoization_state.caching_state_remove_function_results_with_args($load_kct_parameters_experiment_caching_state$.getGlobalValue(), list(filename), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject load_kct_parameters_experiment_internal(SubLObject filename) {
        {
            SubLObject full_filename = kct_parameters_experiment_full_filename(filename, UNPROVIDED);
            return kbq_query_run.kbq_load_query_set_run_and_merge_reruns(full_filename);
        }
    }

    public static final SubLObject load_kct_parameters_experiment(SubLObject filename) {
        {
            SubLObject caching_state = $load_kct_parameters_experiment_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(LOAD_KCT_PARAMETERS_EXPERIMENT, $load_kct_parameters_experiment_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, filename, $kw36$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(load_kct_parameters_experiment_internal(filename)));
                    memoization_state.caching_state_put(caching_state, filename, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject save_kct_parameters_experiment(SubLObject experiment, SubLObject filename) {
        {
            SubLObject full_filename = kct_parameters_experiment_full_filename(filename, UNPROVIDED);
            return kbq_query_run.kbq_save_query_set_run(experiment, full_filename);
        }
    }

    public static final SubLObject clear_kct_parameters_caches() {
        clear_load_kct_parameters_experiment();
        return NIL;
    }

    public static final SubLObject kct_answerable_query_specs_set() {
        return $list_alt37;
    }

    // deflexical
    private static final SubLSymbol $parameters_to_ignore$ = makeSymbol("*PARAMETERS-TO-IGNORE*");

    public static final SubLObject kct_answerable_test_specs() {
        return isa.all_fort_instances_in_all_mts($$CommonSenseTest_Answerable);
    }

    public static final SubLObject kct_answerable_query_specs() {
        return kbq_query_run.all_instantiations_via_inference(kct_answerable_query_specs_set(), $$EverythingPSC);
    }

    /**
     * Either :cst-answerable or :standard-inference-queries
     */
    // deflexical
    private static final SubLSymbol $ipr_corpus$ = makeSymbol("*IPR-CORPUS*");

    public static final SubLObject ipr_training_queries() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return kct_answerable_query_specs();
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return training_inference_queries();
                } else {
                    Errors.error($str_alt43$unknown_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
        return NIL;
    }

    public static final SubLObject kct_parameters_generate_answerable_vs_unanswerable_comparison(SubLObject query_set_run, SubLObject property) {
        return plot_generation.kbq_generate_answerable_vs_unanswerable_comparison(query_set_run, property, list($kw44$LOGSCALE_Y_, T, $YLABEL, string_utilities.str(property), $PLOT_TITLE, cconcatenate($str_alt47$Answerable_vs__Unanswerable_, format_nil.format_nil_s_no_copy(property))), UNPROVIDED);
    }

    public static final SubLObject generate_all_kct_parameters_answerable_vs_unanswerable_comparisons(SubLObject query_set_run) {
        {
            SubLObject cdolist_list_var = reverse(all_kct_parameters_query_metrics());
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                kct_parameters_generate_answerable_vs_unanswerable_comparison(query_set_run, metric);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param KCT-PARAMETERS-EXPERIMENT-DATA,
     * 		a list of pairs, each of the form (VALUE EXPERIMENT).
     * 		For helping determine how to relate PAD to rule pruning utility or max-time.
     */
    public static final SubLObject kct_parameters_answerability_data(SubLObject experiment_data, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = NIL;
        }
        {
            SubLObject pairs = NIL;
            SubLObject cdolist_list_var = experiment_data;
            SubLObject datum = NIL;
            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                {
                    SubLObject datum_2 = datum;
                    SubLObject current = datum_2;
                    SubLObject value = NIL;
                    SubLObject experiment = NIL;
                    destructuring_bind_must_consp(current, datum_2, $list_alt48);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum_2, $list_alt48);
                    experiment = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject filtered_experiment = (NIL != filter) ? ((SubLObject) (funcall(filter, experiment))) : experiment;
                            SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(filtered_experiment, UNPROVIDED);
                            SubLObject answerable_count = getf(analysis, $TOTAL_ANSWERABLE, UNPROVIDED);
                            pairs = cons(list(value, answerable_count), pairs);
                        }
                    } else {
                        cdestructuring_bind_error(datum_2, $list_alt48);
                    }
                }
            }
            return nreverse(pairs);
        }
    }

    public static final SubLObject kct_parameters_generate_answerability_prediction_graph(SubLObject query_set_run, SubLObject oracle_query_set_run, SubLObject property) {
        return plot_generation.kbq_generate_answerability_prediction_display(query_set_run, oracle_query_set_run, property, list($kw44$LOGSCALE_Y_, T, $YLABEL, string_utilities.str(property), $PLOT_TITLE, cconcatenate($str_alt50$Oracularly_Answerable_vs__Unanswe, format_nil.format_nil_s_no_copy(property))), UNPROVIDED);
    }

    public static final SubLObject generate_all_kct_parameters_answerability_prediction_graphs(SubLObject query_set_run, SubLObject oracle_query_set_run) {
        {
            SubLObject cdolist_list_var = reverse(all_kct_parameters_query_metrics());
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                kct_parameters_generate_answerability_prediction_graph(query_set_run, oracle_query_set_run, metric);
            }
        }
        return NIL;
    }

    public static final SubLObject kct_parameters_win_at_solitaire(SubLObject query_set_run, SubLObject oracle_query_set_run) {
        return generate_all_kct_parameters_answerability_prediction_graphs(query_set_run, oracle_query_set_run);
    }

    public static final SubLObject analyze_kct_parameters_experiment(SubLObject experiment_denoting_symbol, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (corpus == UNPROVIDED) {
            corpus = $str_alt51$Kct_Parameters_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt52$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(experiment_denoting_symbol, BOUND_SYMBOL_P);
        {
            SubLObject query_set_run = symbol_value(experiment_denoting_symbol);
            SubLObject name = symbol_name(experiment_denoting_symbol);
            format(stream, $str_alt54$____Basic_analysis____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(query_set_run, basic_kct_parameters_query_metrics()), UNPROVIDED);
            format(stream, $str_alt55$____Answerable____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_answerable_query_set_run(query_set_run), basic_kct_parameters_query_metrics()), UNPROVIDED);
            format(stream, $str_alt56$____Unanswerable____);
            list_utilities.pretty_print_plist(kbq_query_run.kbq_analyze_query_set_run(kbq_query_run.kbq_unanswerable_query_set_run(query_set_run), basic_kct_parameters_query_metrics()), UNPROVIDED);
            return name;
        }
    }

    public static final SubLObject analyze_kct_parameters_experiments(SubLObject baseline_denoting_symbol, SubLObject experiment_denoting_symbol, SubLObject display_graphsP, SubLObject metrics, SubLObject corpus, SubLObject display, SubLObject stream) {
        if (display_graphsP == UNPROVIDED) {
            display_graphsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = basic_kct_parameters_query_metrics();
        }
        if (corpus == UNPROVIDED) {
            corpus = $str_alt51$Kct_Parameters_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt52$_0;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(baseline_denoting_symbol, BOUND_SYMBOL_P);
            SubLTrampolineFile.checkType(experiment_denoting_symbol, BOUND_SYMBOL_P);
            {
                SubLObject baseline = symbol_value(baseline_denoting_symbol);
                SubLObject baseline_name = symbol_name(baseline_denoting_symbol);
                SubLObject experiment = symbol_value(experiment_denoting_symbol);
                SubLObject experiment_name = symbol_name(experiment_denoting_symbol);
                thread.resetMultipleValues();
                {
                    SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs(baseline, experiment);
                    SubLObject mutual_experiment = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    format(stream, $str_alt57$______of_queries_answerable_in__B);
                    thread.resetMultipleValues();
                    {
                        SubLObject only_1 = kbq_query_run.kbq_query_set_run_answerable_counts(baseline, experiment);
                        SubLObject mutual = thread.secondMultipleValue();
                        SubLObject only_2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(T, $str_alt58$Total___________s__s__s__, new SubLObject[]{ only_1, mutual, only_2 });
                    }
                    format(stream, $str_alt59$____Key___BASELINE_VALUE__EXPERIM);
                    format(stream, $str_alt54$____Basic_analysis____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
                    format(stream, $str_alt60$____Mutually_Answerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
                    format(stream, $str_alt55$____Answerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_answerable_query_set_run(baseline), kbq_query_run.kbq_answerable_query_set_run(experiment), metrics));
                    format(stream, $str_alt56$____Unanswerable____);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(kbq_query_run.kbq_unanswerable_query_set_run(baseline), kbq_query_run.kbq_unanswerable_query_set_run(experiment), metrics));
                    if (NIL != display_graphsP) {
                        {
                            SubLObject cdolist_list_var = metrics;
                            SubLObject metric = NIL;
                            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                                kct_parameters_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, $BOTH, cconcatenate($str_alt62$Mutually_Answerable_, corpus), display);
                                kct_parameters_generate_sorted_property_comparison(mutual_baseline, mutual_experiment, baseline_name, experiment_name, metric, $BASELINE, cconcatenate($str_alt62$Mutually_Answerable_, corpus), display);
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject kct_parameters_generate_sorted_property_comparison(SubLObject baseline, SubLObject experiment, SubLObject baseline_name, SubLObject experiment_name, SubLObject property, SubLObject sort_by, SubLObject corpus, SubLObject display) {
        if (sort_by == UNPROVIDED) {
            sort_by = $BOTH;
        }
        if (corpus == UNPROVIDED) {
            corpus = $str_alt51$Kct_Parameters_Training;
        }
        if (display == UNPROVIDED) {
            display = $str_alt52$_0;
        }
        return plot_generation.kbq_generate_sorted_property_comparison(baseline, experiment, property, listS($PLOT_TITLE, new SubLObject[]{ cconcatenate(format_nil.format_nil_a_no_copy(corpus), new SubLObject[]{ $str_alt64$__, format_nil.format_nil_a_no_copy(baseline_name), $str_alt65$_vs__, format_nil.format_nil_a_no_copy(experiment_name), $str_alt66$_n, format_nil.format_nil_a_no_copy(property) }), $XLABEL, $$$Sorted_Queries, $YLABEL, leviathan.ylabel_for_property(property), $BASELINE_KEY_LABEL, baseline_name, $EXPERIMENT_KEY_LABEL, experiment_name, $list_alt71 }), sort_by, display);
    }

    public static final SubLObject kct_parameters_identify_probable_segfault(SubLObject filename) {
        {
            SubLObject experiment = load_kct_parameters_experiment(filename);
            SubLObject all_kbqs = ipr_training_queries();
            return kbq_query_run.kbq_query_set_run_identify_probable_segfault(experiment, all_kbqs);
        }
    }

    public static final SubLObject collect_inference_parameter_sets(SubLObject parameters_to_ignore) {
        if (parameters_to_ignore == UNPROVIDED) {
            parameters_to_ignore = $parameters_to_ignore$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference_parameter_sets = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = $$CommonSenseTest;
                            {
                                SubLObject _prev_bind_0_3 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_4 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_5 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_8 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt86$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }


                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_5, UNPROVIDED);
                                                                                while (NIL != node_var_5) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_5;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_19 = new_list;
                                                                                                                                                                                SubLObject kbq = NIL;
                                                                                                                                                                                for (kbq = cdolist_list_var_19.first(); NIL != cdolist_list_var_19; cdolist_list_var_19 = cdolist_list_var_19.rest() , kbq = cdolist_list_var_19.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != forts.fort_p(kbq)) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject query_spec = kct_utils.kct_query_specification(kbq, UNPROVIDED);
                                                                                                                                                                                                if (NIL != kb_query.kbq_runnableP(query_spec)) {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject query_properties = kb_query.kbq_query_properties(query_spec);
                                                                                                                                                                                                        query_properties = list_utilities.plist_except(query_properties, parameters_to_ignore);
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject properties_to_remove = NIL;
                                                                                                                                                                                                            SubLObject remainder = NIL;
                                                                                                                                                                                                            for (remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject property = remainder.first();
                                                                                                                                                                                                                    SubLObject value = cadr(remainder);
                                                                                                                                                                                                                    SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
                                                                                                                                                                                                                    if (NIL != (v_default.isNumber() && value.isNumber() ? ((SubLObject) (numE(v_default, value))) : equal(v_default, value))) {
                                                                                                                                                                                                                        properties_to_remove = cons(property, properties_to_remove);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            query_properties = list_utilities.plist_except(query_properties, properties_to_remove);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        query_properties = list_utilities.sort_plist_by_properties(query_properties, $sym87$TERM__);
                                                                                                                                                                                                        dictionary_utilities.dictionary_pushnew(inference_parameter_sets, query_properties, query_spec, symbol_function(EQUAL), UNPROVIDED);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_16, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt88$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt89);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt89);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt89);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_22 = new_list;
                                                                                                                                                            SubLObject kbq = NIL;
                                                                                                                                                            for (kbq = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , kbq = cdolist_list_var_22.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != forts.fort_p(kbq)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject query_spec = kct_utils.kct_query_specification(kbq, UNPROVIDED);
                                                                                                                                                                            if (NIL != kb_query.kbq_runnableP(query_spec)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject query_properties = kb_query.kbq_query_properties(query_spec);
                                                                                                                                                                                    query_properties = list_utilities.plist_except(query_properties, parameters_to_ignore);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject properties_to_remove = NIL;
                                                                                                                                                                                        SubLObject remainder = NIL;
                                                                                                                                                                                        for (remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject property = remainder.first();
                                                                                                                                                                                                SubLObject value = cadr(remainder);
                                                                                                                                                                                                SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
                                                                                                                                                                                                if (NIL != (v_default.isNumber() && value.isNumber() ? ((SubLObject) (numE(v_default, value))) : equal(v_default, value))) {
                                                                                                                                                                                                    properties_to_remove = cons(property, properties_to_remove);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        query_properties = list_utilities.plist_except(query_properties, properties_to_remove);
                                                                                                                                                                                    }
                                                                                                                                                                                    query_properties = list_utilities.sort_plist_by_properties(query_properties, $sym87$TERM__);
                                                                                                                                                                                    dictionary_utilities.dictionary_pushnew(inference_parameter_sets, query_properties, query_spec, symbol_function(EQUAL), UNPROVIDED);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_21, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_20, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt89);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_23 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , generating_fn = cdolist_list_var_23.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_25 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_26 = new_list_25;
                                                                                                                                    SubLObject kbq = NIL;
                                                                                                                                    for (kbq = cdolist_list_var_26.first(); NIL != cdolist_list_var_26; cdolist_list_var_26 = cdolist_list_var_26.rest() , kbq = cdolist_list_var_26.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(kbq, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != forts.fort_p(kbq)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject query_spec = kct_utils.kct_query_specification(kbq, UNPROVIDED);
                                                                                                                                                    if (NIL != kb_query.kbq_runnableP(query_spec)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject query_properties = kb_query.kbq_query_properties(query_spec);
                                                                                                                                                            query_properties = list_utilities.plist_except(query_properties, parameters_to_ignore);
                                                                                                                                                            {
                                                                                                                                                                SubLObject properties_to_remove = NIL;
                                                                                                                                                                SubLObject remainder = NIL;
                                                                                                                                                                for (remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject property = remainder.first();
                                                                                                                                                                        SubLObject value = cadr(remainder);
                                                                                                                                                                        SubLObject v_default = inference_datastructures_enumerated_types.inference_engine_default_for_property(property);
                                                                                                                                                                        if (NIL != (v_default.isNumber() && value.isNumber() ? ((SubLObject) (numE(v_default, value))) : equal(v_default, value))) {
                                                                                                                                                                            properties_to_remove = cons(property, properties_to_remove);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                query_properties = list_utilities.plist_except(query_properties, properties_to_remove);
                                                                                                                                                            }
                                                                                                                                                            query_properties = list_utilities.sort_plist_by_properties(query_properties, $sym87$TERM__);
                                                                                                                                                            dictionary_utilities.dictionary_pushnew(inference_parameter_sets, query_properties, query_spec, symbol_function(EQUAL), UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_24, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }

                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_15, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_14, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_5);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_32 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , node_vars_link_node = cdolist_list_var_32.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_31, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_29, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt88$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_33 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , generating_fn = cdolist_list_var_33.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_35 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_36 = new_list_35;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , node_vars_link_node = cdolist_list_var_36.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_34, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }

                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_5 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt90$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_10, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_9, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_8, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_7, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_4, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return inference_parameter_sets;
            }
        }
    }

    public static final SubLObject kct_answerable_varying_parameters() {
        {
            SubLObject property_hash = make_hash_table($int$50, UNPROVIDED, UNPROVIDED);
            SubLObject property_count = make_hash_table($int$50, UNPROVIDED, UNPROVIDED);
            SubLObject query_specs = ipr_training_queries();
            SubLObject length = length(query_specs);
            SubLObject cdolist_list_var = query_specs;
            SubLObject query_spec = NIL;
            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                {
                    SubLObject query_properties = kb_query.kbq_query_properties(query_spec);
                    SubLObject remainder = NIL;
                    for (remainder = query_properties; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            if (NIL == list_utilities.member_eqP(property, $parameters_to_ignore$.getGlobalValue())) {
                                hash_table_utilities.pushnew_hash(property, value, property_hash, UNPROVIDED);
                                {
                                    SubLObject count = gethash(property, property_count, UNPROVIDED);
                                    if (NIL != count) {
                                        count = add(count, ONE_INTEGER);
                                    } else {
                                        count = ONE_INTEGER;
                                    }
                                    sethash(property, property_count, count);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject property = NIL;
                SubLObject values = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(property_hash);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            property = getEntryKey(cdohash_entry);
                            values = getEntryValue(cdohash_entry);
                            if (gethash(property, property_count, UNPROVIDED) != length) {
                                hash_table_utilities.pushnew_hash(property, inference_datastructures_enumerated_types.inference_engine_default_for_property(property), property_hash, UNPROVIDED);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return values(property_hash, property_count);
        }
    }

    public static final SubLObject print_varying_inference_parameters() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject h = kct_answerable_varying_parameters();
                SubLObject c = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject property = NIL;
                    SubLObject values = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(h);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                property = getEntryKey(cdohash_entry);
                                values = getEntryValue(cdohash_entry);
                                if (NIL != list_utilities.singletonP(values)) {
                                    format(T, $str_alt92$Singleton__a_Count__a__, property, gethash(property, c, UNPROVIDED));
                                } else {
                                    format(T, $str_alt93$Varying__a_Count__a__, property, gethash(property, c, UNPROVIDED));
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
                {
                    SubLObject property = NIL;
                    SubLObject values = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(h);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                property = getEntryKey(cdohash_entry);
                                values = getEntryValue(cdohash_entry);
                                if (NIL == list_utilities.singletonP(values)) {
                                    format(T, $str_alt94$_a____a__, property, values);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * See [[List of inference parameters to optimize]] on the wiki for details.
     */
    // defparameter
    private static final SubLSymbol $inference_parameters_to_optimize$ = makeSymbol("*INFERENCE-PARAMETERS-TO-OPTIMIZE*");

    public static final SubLObject inference_parameter_to_optimizeP(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.member_eqP(v_object, $inference_parameters_to_optimize$.getDynamicValue(thread));
        }
    }

    public static final SubLObject compute_inference_parameter_initial_clusters(SubLObject parameters_we_care_about) {
        if (parameters_we_care_about == UNPROVIDED) {
            parameters_we_care_about = $inference_parameters_to_optimize$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cluster_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject baseline = load_kct_parameters_experiment($kct_baseline_stripped_filename$.getGlobalValue());
                SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
                {
                    SubLObject _prev_bind_0 = $inference_parameters_to_optimize$.currentBinding(thread);
                    try {
                        $inference_parameters_to_optimize$.bind(parameters_we_care_about, thread);
                        {
                            SubLObject cdolist_list_var = answerable_queries;
                            SubLObject query_spec = NIL;
                            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject plist = kb_query.kbq_query_properties(query_spec);
                                    SubLObject point = new_inference_parameter_matrix_point(plist);
                                    dictionary_utilities.dictionary_increment(cluster_dict, point, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        $inference_parameters_to_optimize$.rebind(_prev_bind_0, thread);
                    }
                }
                return cluster_dict;
            }
        }
    }

    public static final SubLObject print_inference_parameter_initial_clusters(SubLObject parameters_we_care_about) {
        if (parameters_we_care_about == UNPROVIDED) {
            parameters_we_care_about = $inference_parameters_to_optimize$.getDynamicValue();
        }
        {
            SubLObject dict = compute_inference_parameter_initial_clusters(parameters_we_care_about);
            list_utilities.pretty_print_histogram(dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym96$_)));
            print(dictionary.dictionary_length(dict), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * The second set of experiments redone in November 2005.  See kct-parameters*.sh.
     * Parameter values are expected to increase in completeness and decrease in efficiency.
     */
    // deflexical
    private static final SubLSymbol $single_parameter_experiment_list$ = makeSymbol("*SINGLE-PARAMETER-EXPERIMENT-LIST*");

    /**
     * The third set of experiments done in March 2006.  See kct-parameters*.sh.
     * Parameter values are expected to increase in completeness and decrease in efficiency.
     */
    // deflexical
    private static final SubLSymbol $standard_inference_query_single_parameter_experiment_list$ = makeSymbol("*STANDARD-INFERENCE-QUERY-SINGLE-PARAMETER-EXPERIMENT-LIST*");

    // deflexical
    private static final SubLSymbol $kct_baseline_filename$ = makeSymbol("*KCT-BASELINE-FILENAME*");

    // deflexical
    private static final SubLSymbol $kct_baseline_stripped_filename$ = makeSymbol("*KCT-BASELINE-STRIPPED-FILENAME*");

    public static final SubLObject load_kct_parameters_baseline() {
        return load_kct_parameters_experiment($kct_baseline_filename$.getGlobalValue());
    }

    public static final SubLObject load_kct_parameters_baseline_stripped() {
        return load_kct_parameters_experiment($kct_baseline_stripped_filename$.getGlobalValue());
    }

    public static final SubLObject single_parameter_experiment_list() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $single_parameter_experiment_list$.getGlobalValue();
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $standard_inference_query_single_parameter_experiment_list$.getGlobalValue();
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    public static final SubLObject single_parameter_experiment_prefix() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $str_alt102$experiment_;
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $str_alt103$triq_experiment_;
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    public static final SubLObject single_parameter_experiment_suffix() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $str_alt104$_stripped;
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $str_alt105$;
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    public static final SubLObject experiment_filename_for_parameter_value(SubLObject parameter, SubLObject value) {
        {
            SubLObject i = position(list(parameter, value), single_parameter_experiment_list(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject filename = cconcatenate(single_parameter_experiment_prefix(), new SubLObject[]{ string_utilities.str(i), single_parameter_experiment_suffix() });
            return filename;
        }
    }

    /**
     *
     *
     * @param SKIP-SUBSUMED
     * 		booleanp; whether the iteration will skip over parameters in *inference-parameters-to-hard-code*
     * 		and skip over values in *inference-parameter-values-to-skip*.
     */
    public static final SubLObject do_inference_parameter_value_pairs(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt106);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject param = NIL;
                    SubLObject prev_value = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    param = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    prev_value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    value = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_37 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt106);
                            current_37 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt106);
                            if (NIL == member(current_37, $list_alt107, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_37 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt106);
                        }
                        {
                            SubLObject backward_tail = property_list_member($BACKWARD, current);
                            SubLObject v_backward = (NIL != backward_tail) ? ((SubLObject) (cadr(backward_tail))) : NIL;
                            SubLObject skip_subsumed_tail = property_list_member($SKIP_SUBSUMED, current);
                            SubLObject skip_subsumed = (NIL != skip_subsumed_tail) ? ((SubLObject) (cadr(skip_subsumed_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject prev_param = $sym110$PREV_PARAM;
                                SubLObject pair = $sym111$PAIR;
                                SubLObject param_list = $sym112$PARAM_LIST;
                                return list(CLET, list(prev_param, prev_value, list(param_list, listS(FIF, skip_subsumed, $list_alt114))), list(CDOLIST, list(pair, list(FIF, v_backward, list(REVERSE, param_list), param_list)), list(CDESTRUCTURING_BIND, list(param, value), pair, list(PIF, list(EQ, param, prev_param), bq_cons(PROGN, append(body, list(list(CSETQ, prev_value, value)))), list(PROGN, list(CSETQ, prev_param, param), list(CSETQ, prev_value, value))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Copies FILENAME.cfasl to FILENAME-stripped.cfasl after stripping
     * :proof-query-properties
     * :inference-answer-query-properties
     * :inference-strongest-query-properties
     * from the query-set-run.  When not using these properties, it's much faster not to bother loading them.
     * Passing in the empty string as a suffix will overwrite the original files.
     */
    public static final SubLObject strip_strengthened_properties_from_query_set_run_file(SubLObject filename, SubLObject suffix) {
        if (suffix == UNPROVIDED) {
            suffix = $str_alt104$_stripped;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == string_utilities.ends_with(filename, kbq_query_run.$query_set_run_file_extension$.getGlobalValue(), UNPROVIDED)) {
                    Errors.error($str_alt121$Expected_a__a_file__got__s, kbq_query_run.$query_set_run_file_extension$.getGlobalValue(), filename);
                }
            }
            {
                SubLObject query_set_run = kbq_query_run.kbq_load_query_set_run(filename);
                SubLObject stripped_query_set_run = kbq_query_run.kbq_discard_query_set_run_properties(query_set_run, $list_alt122);
                SubLObject suffixless_filename = string_utilities.strip_final(filename, length(kbq_query_run.$query_set_run_file_extension$.getGlobalValue()));
                SubLObject new_filename = cconcatenate(suffixless_filename, new SubLObject[]{ suffix, kbq_query_run.$query_set_run_file_extension$.getGlobalValue() });
                SubLTrampolineFile.checkType(new_filename, FILE_VALID_FOR_WRITING_P);
                return kbq_query_run.kbq_save_query_set_run(stripped_query_set_run, new_filename);
            }
        }
    }

    public static final SubLObject strip_strengthened_properties_from_kct_single_parameter_experiments() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            utilities_macros.$progress_note$.setDynamicValue($$$cdotimes, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(length(single_parameter_experiment_list()), thread);
            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject filename = cconcatenate($kct_parameters_experiment_directory$.getGlobalValue(), new SubLObject[]{ single_parameter_experiment_prefix(), string_utilities.str(i), $str_alt125$_cfasl });
                                strip_strengthened_properties_from_query_set_run_file(filename, UNPROVIDED);
                            }
                        }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                } finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            return length(single_parameter_experiment_list());
        }
    }

    // deflexical
    private static final SubLSymbol $kct_analysis_metrics$ = makeSymbol("*KCT-ANALYSIS-METRICS*");

    public static final SubLObject kbq_query_set_run_metric_value(SubLObject query_set_run, SubLObject metric) {
        {
            SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(query_set_run, $kct_analysis_metrics$.getGlobalValue());
            return getf(analysis, metric, UNPROVIDED);
        }
    }

    public static final SubLObject speedup_estimate_for_parameter_values(SubLObject parameter, SubLObject metric, SubLObject old_value, SubLObject new_value, SubLObject queries) {
        if (old_value.equal(new_value)) {
            return ONE_INTEGER;
        } else {
            return speedup_estimate_for_parameter_values_int(parameter, metric, old_value, new_value, queries);
        }
    }



    public static final SubLObject clear_speedup_estimate_for_parameter_values_int() {
        {
            SubLObject cs = $speedup_estimate_for_parameter_values_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_speedup_estimate_for_parameter_values_int(SubLObject parameter, SubLObject metric, SubLObject old_value, SubLObject new_value, SubLObject queries) {
        return memoization_state.caching_state_remove_function_results_with_args($speedup_estimate_for_parameter_values_int_caching_state$.getGlobalValue(), list(parameter, metric, old_value, new_value, queries), UNPROVIDED, UNPROVIDED);
    }

    /**
     * How much speedup wrt METRIC is obtained by changing PARAMETER from OLD-VALUE to NEW-VALUE for each query in QUERIES.
     * The speedup is expressed as a multiplier.  1 indicates no change, values above 1 indicate faster and better,
     * values below 1 indicate slower and worse.  This estimate is computed using the fixed-parameter experiments.
     */
    public static final SubLObject speedup_estimate_for_parameter_values_int_internal(SubLObject parameter, SubLObject metric, SubLObject old_value, SubLObject new_value, SubLObject queries) {
        {
            SubLObject old_experiment_filename = experiment_filename_for_parameter_value(parameter, old_value);
            SubLObject old_experiment = load_kct_parameters_experiment(old_experiment_filename);
            SubLObject filtered_old_experiment = ($ALL == queries) ? ((SubLObject) (old_experiment)) : kbq_query_run.kbq_filter_query_set_run_to_queries(old_experiment, queries, UNPROVIDED);
            SubLObject old_metric_value = kbq_query_set_run_metric_value(filtered_old_experiment, metric);
            SubLObject new_experiment_filename = experiment_filename_for_parameter_value(parameter, new_value);
            SubLObject new_experiment = load_kct_parameters_experiment(new_experiment_filename);
            SubLObject filtered_new_experiment = ($ALL == queries) ? ((SubLObject) (new_experiment)) : kbq_query_run.kbq_filter_query_set_run_to_queries(new_experiment, queries, UNPROVIDED);
            SubLObject new_metric_value = kbq_query_set_run_metric_value(filtered_new_experiment, metric);
            return divide(old_metric_value, new_metric_value);
        }
    }

    public static final SubLObject speedup_estimate_for_parameter_values_int(SubLObject parameter, SubLObject metric, SubLObject old_value, SubLObject new_value, SubLObject queries) {
        {
            SubLObject caching_state = $speedup_estimate_for_parameter_values_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(SPEEDUP_ESTIMATE_FOR_PARAMETER_VALUES_INT, $speedup_estimate_for_parameter_values_int_caching_state$, NIL, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_5(parameter, metric, old_value, new_value, queries);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (parameter.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (metric.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (old_value.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (new_value.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && queries.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(speedup_estimate_for_parameter_values_int_internal(parameter, metric, old_value, new_value, queries)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(parameter, metric, old_value, new_value, queries));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * How much completeness is gained by changing PARAMETER from OLD-VALUE to an oracularly
     * perfect choice between OLD-VALUE and NEW-VALUE.
     * The completeness gain is expressed as a multiplier.  1 indicates no change, values above 1 indicate more complete and better,
     * values below 1 indicate less complete and worse.  This estimate is computed using the fixed-parameter experiments.
     */
    public static final SubLObject completeness_estimate_1_for_parameter_values(SubLObject parameter, SubLObject old_value, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject only_old = answerability_counts_for_parameter_values(parameter, old_value, new_value);
                SubLObject mutual = thread.secondMultipleValue();
                SubLObject only_new = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject old_completeness = add(only_old, mutual);
                    SubLObject new_completeness = add(only_old, mutual, only_new);
                    return divide(new_completeness, old_completeness);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 integerp; how many queries were answerable only when PARAMETER was set to OLD-VALUE.
     * @return 1 integerp; how many queries were answerable regardless of whether PARAMETER was set to OLD-VALUE or NEW-VALUE.
     * @return 2 integerp; how many queries were answerable only when PARAMETER was set to NEW-VALUE.
     */
    public static final SubLObject answerability_counts_for_parameter_values(SubLObject parameter, SubLObject old_value, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_experiment_filename = experiment_filename_for_parameter_value(parameter, old_value);
                SubLObject old_experiment = load_kct_parameters_experiment(old_experiment_filename);
                SubLObject new_experiment_filename = experiment_filename_for_parameter_value(parameter, new_value);
                SubLObject new_experiment = load_kct_parameters_experiment(new_experiment_filename);
                thread.resetMultipleValues();
                {
                    SubLObject common_old_experiment = kbq_query_run.kbq_common_queries_two_query_set_runs(old_experiment, new_experiment);
                    SubLObject common_new_experiment = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return kbq_query_run.kbq_query_set_run_answerable_counts(common_old_experiment, common_new_experiment);
                }
            }
        }
    }

    public static final SubLObject print_efficiency_statistics(SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        format(T, $str_alt131$Parameter__Value1____Value2__Spee);
        return print_efficiency_and_completeness_statistics_int(T, NIL, NIL, metric);
    }

    public static final SubLObject print_completeness_statistics() {
        format(T, $str_alt132$Parameter__Value1____Value2__Comp);
        return print_efficiency_and_completeness_statistics_int(NIL, T, NIL, NIL);
    }

    public static final SubLObject print_efficiency_and_completeness_statistics(SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        format(T, $str_alt133$Parameter__Value1____Value2__Spee);
        return print_efficiency_and_completeness_statistics_int(T, T, NIL, metric);
    }

    public static final SubLObject print_efficiency_and_completeness_statistics_int(SubLObject efficiencyP, SubLObject completenessP, SubLObject backwardP, SubLObject metric) {
        {
            SubLObject prev_param = NIL;
            SubLObject prev_value = NIL;
            SubLObject param_list = single_parameter_experiment_list();
            SubLObject cdolist_list_var = (NIL != backwardP) ? ((SubLObject) (reverse(param_list))) : param_list;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject param = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    param = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (param == prev_param) {
                            format(T, $str_alt135$_s__s_____s__, new SubLObject[]{ param, prev_value, value });
                            force_output(UNPROVIDED);
                            if (NIL != efficiencyP) {
                                {
                                    SubLObject speedup = speedup_estimate_for_parameter_values(param, metric, prev_value, value, $ALL);
                                    format(T, $str_alt136$_s_, number_utilities.significant_digits(speedup, FOUR_INTEGER));
                                }
                            }
                            if (NIL != completenessP) {
                                {
                                    SubLObject completeness_gain = completeness_estimate_1_for_parameter_values(param, prev_value, value);
                                    format(T, $str_alt136$_s_, number_utilities.significant_digits(completeness_gain, FOUR_INTEGER));
                                }
                            }
                            terpri(UNPROVIDED);
                            force_output(UNPROVIDED);
                            prev_value = value;
                        } else {
                            prev_param = param;
                            prev_value = value;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt134);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * The maximum number of queries that can become unanswerable to be considered for skipping
     * the value that would have made them answerable
     */
    // defparameter
    private static final SubLSymbol $parameter_value_hard_coding_completeness_threshold$ = makeSymbol("*PARAMETER-VALUE-HARD-CODING-COMPLETENESS-THRESHOLD*");

    /**
     * This plus human review is used to determine the values of
     * inference-parameters-to-hard-code* and *inference-parameter-values-to-skip*.
     * See [[Inference Parameter Hard-Coding]] on the wiki.
     */
    public static final SubLObject inference_parameter_values_that_maybe_ought_to_be_skipped(SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tuples_that_ought_to_be_skipped = NIL;
                SubLObject prev_param = NIL;
                SubLObject old_value = NIL;
                SubLObject param_list = single_parameter_experiment_list();
                SubLObject cdolist_list_var = param_list;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject parameter = NIL;
                        SubLObject new_value = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt137);
                        parameter = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt137);
                        new_value = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (parameter == prev_param) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject only_old = answerability_counts_for_parameter_values(parameter, old_value, new_value);
                                    SubLObject mutual = thread.secondMultipleValue();
                                    SubLObject only_new = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (only_old.numLE($parameter_value_hard_coding_completeness_threshold$.getDynamicValue(thread))) {
                                        {
                                            SubLObject speedup = speedup_estimate_for_parameter_values(parameter, metric, old_value, new_value, $ALL);
                                            if (speedup.numG(ONE_INTEGER)) {
                                                tuples_that_ought_to_be_skipped = cons(list(parameter, old_value, new_value, only_old, only_new, number_utilities.significant_digits(speedup, FOUR_INTEGER)), tuples_that_ought_to_be_skipped);
                                            }
                                        }
                                    }
                                    if (only_new.numLE($parameter_value_hard_coding_completeness_threshold$.getDynamicValue(thread))) {
                                        {
                                            SubLObject slowdown = speedup_estimate_for_parameter_values(parameter, metric, old_value, new_value, $ALL);
                                            SubLObject speedup = invert(slowdown);
                                            if (speedup.numG(ONE_INTEGER)) {
                                                tuples_that_ought_to_be_skipped = cons(list(parameter, new_value, old_value, only_new, only_old, number_utilities.significant_digits(speedup, FOUR_INTEGER)), tuples_that_ought_to_be_skipped);
                                            }
                                        }
                                    }
                                }
                                old_value = new_value;
                            } else {
                                prev_param = parameter;
                                old_value = new_value;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt137);
                        }
                    }
                }
                return nreverse(tuples_that_ought_to_be_skipped);
            }
        }
    }

    /**
     * Parameters in @xref *inference-parameters-to-optimize* for which we have determined an optimal value
     * so should be ignored for the remainder of the experiment.
     */
    // deflexical
    private static final SubLSymbol $inference_parameters_to_hard_code$ = makeSymbol("*INFERENCE-PARAMETERS-TO-HARD-CODE*");

    // deflexical
    private static final SubLSymbol $standard_inference_query_inference_parameters_to_hard_code$ = makeSymbol("*STANDARD-INFERENCE-QUERY-INFERENCE-PARAMETERS-TO-HARD-CODE*");

    public static final SubLObject inference_parameters_to_hard_code() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $inference_parameters_to_hard_code$.getGlobalValue();
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $standard_inference_query_inference_parameters_to_hard_code$.getGlobalValue();
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    /**
     * These values in *single-parameter-experiment-list* should be skipped for the remainder of the experiment
     * because they are strictly suboptimal.
     */
    // deflexical
    private static final SubLSymbol $inference_parameter_values_to_skip$ = makeSymbol("*INFERENCE-PARAMETER-VALUES-TO-SKIP*");

    // deflexical
    private static final SubLSymbol $standard_inference_query_inference_parameter_values_to_skip$ = makeSymbol("*STANDARD-INFERENCE-QUERY-INFERENCE-PARAMETER-VALUES-TO-SKIP*");

    public static final SubLObject inference_parameter_values_to_skip() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $inference_parameter_values_to_skip$.getGlobalValue();
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $standard_inference_query_inference_parameter_values_to_skip$.getGlobalValue();
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    // deflexical
    private static final SubLSymbol $unsubsumed_inference_parameters_to_optimize$ = makeSymbol("*UNSUBSUMED-INFERENCE-PARAMETERS-TO-OPTIMIZE*");

    // deflexical
    private static final SubLSymbol $standard_inference_query_unsubsumed_inference_parameters_to_optimize$ = makeSymbol("*STANDARD-INFERENCE-QUERY-UNSUBSUMED-INFERENCE-PARAMETERS-TO-OPTIMIZE*");

    public static final SubLObject unsubsumed_inference_parameters_to_optimize() {
        {
            SubLObject pcase_var = $ipr_corpus$.getGlobalValue();
            if (pcase_var.eql($CST_ANSWERABLE)) {
                return $unsubsumed_inference_parameters_to_optimize$.getGlobalValue();
            } else
                if (pcase_var.eql($STANDARD_INFERENCE_QUERIES)) {
                    return $standard_inference_query_unsubsumed_inference_parameters_to_optimize$.getGlobalValue();
                } else {
                    return Errors.error($str_alt101$unexpected_corpus__s, $ipr_corpus$.getGlobalValue());
                }

        }
    }

    public static final SubLObject unsubsumed_inference_parameter_to_optimizeP(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, unsubsumed_inference_parameters_to_optimize());
    }

    public static final SubLObject single_parameter_unsubsumed_experiments() {
        return list_utilities.ordered_set_difference(list_utilities.ordered_set_difference(single_parameter_experiment_list(), Mapping.mapcar(LIST, inference_parameters_to_hard_code()), symbol_function(EQ), symbol_function(FIRST)), Mapping.mapcar(FIRST_2, inference_parameter_values_to_skip()), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject possibly_skip_inference_parameter_values(SubLObject plist) {
        {
            SubLObject cdolist_list_var = inference_parameter_values_to_skip();
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject param = NIL;
                    SubLObject skip_value = NIL;
                    SubLObject good_value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    param = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    skip_value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    good_value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (skip_value.equal(getf(plist, param, UNPROVIDED))) {
                            plist = putf(copy_list(plist), param, good_value);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt144);
                    }
                }
            }
        }
        return plist;
    }

    /**
     *
     *
     * @see compute-inference-parameter-initial-clusters
     */
    public static final SubLObject compute_inference_parameter_unsubsumed_clusters() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cluster_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject baseline = load_kct_parameters_baseline_stripped();
                SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
                {
                    SubLObject _prev_bind_0 = $inference_parameters_to_optimize$.currentBinding(thread);
                    try {
                        $inference_parameters_to_optimize$.bind(unsubsumed_inference_parameters_to_optimize(), thread);
                        {
                            SubLObject cdolist_list_var = answerable_queries;
                            SubLObject query_spec = NIL;
                            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                                {
                                    SubLObject plist = possibly_skip_inference_parameter_values(kb_query.kbq_query_properties(query_spec));
                                    SubLObject point = new_inference_parameter_matrix_point(plist);
                                    dictionary_utilities.dictionary_increment(cluster_dict, point, UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        $inference_parameters_to_optimize$.rebind(_prev_bind_0, thread);
                    }
                }
                return cluster_dict;
            }
        }
    }

    public static final SubLObject print_inference_parameter_unsubsumed_clusters(SubLObject by_completenessP) {
        if (by_completenessP == UNPROVIDED) {
            by_completenessP = NIL;
        }
        {
            SubLObject dict = compute_inference_parameter_unsubsumed_clusters();
            SubLObject histogram = (NIL != by_completenessP) ? ((SubLObject) (dictionary_utilities.sort_dictionary_by_keys(dict, $sym145$INFERENCE_PARAMETER_MATRIX_POINT_MORE_EFFICIENT_THAN_))) : dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym96$_));
            list_utilities.pretty_print_histogram(histogram);
            print(dictionary.dictionary_length(dict), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * A point in the n-dimensional space of inference parameters is implemented as a list,
     * with the elements specifying the values along each axis.  The axes are implicitly
     * aligned with @xref unsubsumed-inference-parameters-to-optimize.
     */
    public static final SubLObject inference_parameter_matrix_point_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != list_utilities.same_length_p(v_object, unsubsumed_inference_parameters_to_optimize())));
    }

    /**
     * Filters PLIST to contain only the dimensions we care about, with explicit defaults.
     * Skips subsumed parameter values.
     */
    public static final SubLObject new_inference_parameter_matrix_point(SubLObject plist) {
        {
            SubLObject explicified_plist = inference_parameters.explicify_inference_engine_query_property_defaults(plist);
            SubLObject filtered_plist = list_utilities.filter_plist(explicified_plist, $sym146$UNSUBSUMED_INFERENCE_PARAMETER_TO_OPTIMIZE_);
            SubLObject skipped_plist = possibly_skip_inference_parameter_values(filtered_plist);
            SubLObject sorted_plist = list_utilities.sort_plist_via_position(skipped_plist, unsubsumed_inference_parameters_to_optimize(), symbol_function(EQ));
            return list_utilities.plist_values(sorted_plist);
        }
    }

    public static final SubLObject inference_parameter_matrix_point_value_for_dimension(SubLObject point, SubLObject dimension) {
        {
            SubLObject i = position(dimension, unsubsumed_inference_parameters_to_optimize(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return nth(i, point);
        }
    }

    /**
     *
     *
     * @return inference-parameter-matrix-point-p; POINT with its DIMENSION replaced by NEW-VALUE.
     */
    public static final SubLObject inference_parameter_matrix_point_replace_value(SubLObject point, SubLObject dimension, SubLObject new_value) {
        {
            SubLObject position_to_replace = position(dimension, unsubsumed_inference_parameters_to_optimize(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list_utilities.replace_nth(position_to_replace, new_value, point);
        }
    }

    /**
     * The theoretically most efficient point in inference parameter space
     */
    public static final SubLObject most_efficient_theoretical_point() {
        {
            SubLObject plist = NIL;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                plist = putf(plist, param, inference_parameters.most_efficient_value_for_query_property(param));
            }
            return new_inference_parameter_matrix_point(plist);
        }
    }

    /**
     * The theoretically most complete point in inference parameter space
     */
    public static final SubLObject most_complete_theoretical_point() {
        {
            SubLObject plist = NIL;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                plist = putf(plist, param, inference_parameters.most_complete_value_for_query_property(param));
            }
            return new_inference_parameter_matrix_point(plist);
        }
    }

    /**
     *
     *
     * @return inference-parameter-matrix-point-p; the most efficient theoretical point possible given that PARAM is fixed to VALUE.
     */
    public static final SubLObject most_efficient_theoretical_point_given(SubLObject param, SubLObject value) {
        return inference_parameter_matrix_point_replace_value(most_efficient_theoretical_point(), param, value);
    }

    /**
     *
     *
     * @return inference-parameter-matrix-point-p; the most complete theoretical point possible given that PARAM is fixed to VALUE.
     */
    public static final SubLObject most_complete_theoretical_point_given(SubLObject param, SubLObject value) {
        return inference_parameter_matrix_point_replace_value(most_complete_theoretical_point(), param, value);
    }

    /**
     *
     *
     * @return booleanp; whether POINT1 is more complete than POINT2.  Only works for points on a path.
     */
    public static final SubLObject inference_parameter_matrix_point_more_complete_thanP(SubLObject point1, SubLObject point2) {
        {
            SubLObject region2 = new_inference_parameter_matrix_region_under(point2);
            return makeBoolean(NIL == inference_parameter_matrix_point_in_regionP(point1, region2));
        }
    }

    /**
     *
     *
     * @return booleanp; whether POINT1 is more efficient than POINT2.  Only works for points on a path.
     */
    public static final SubLObject inference_parameter_matrix_point_more_efficient_thanP(SubLObject point1, SubLObject point2) {
        {
            SubLObject region1 = new_inference_parameter_matrix_region_under(point1);
            return makeBoolean(NIL == inference_parameter_matrix_point_in_regionP(point2, region1));
        }
    }

    /**
     * A region in the n-dimensional space of inference parameters.
     */
    public static final SubLObject inference_parameter_matrix_region_p(SubLObject v_object) {
        if (v_object.isCons()) {
            {
                SubLObject pcase_var = v_object.first();
                if (pcase_var.eql($REGION_UNDER)) {
                    return inference_parameter_matrix_point_p(v_object.rest());
                } else
                    if (pcase_var.eql($REGION_BETWEEN)) {
                        return makeBoolean((NIL != inference_parameter_matrix_point_p(second(v_object))) && (NIL != inference_parameter_matrix_point_p(third(v_object))));
                    }

            }
        }
        return NIL;
    }

    /**
     * Creates a region containing all of inference parameter space that is at least as efficient as POINT.
     */
    public static final SubLObject new_inference_parameter_matrix_region_under(SubLObject point) {
        SubLTrampolineFile.checkType(point, INFERENCE_PARAMETER_MATRIX_POINT_P);
        return cons($REGION_UNDER, point);
    }

    /**
     * Creates a region containing all of inference parameter space that is at least as complete as MORE-EFFICIENT-POINT
     * and at least as efficient as MORE-COMPLETE-POINT.
     */
    public static final SubLObject new_inference_parameter_matrix_region_between(SubLObject more_efficient_point, SubLObject more_complete_point) {
        SubLTrampolineFile.checkType(more_efficient_point, INFERENCE_PARAMETER_MATRIX_POINT_P);
        SubLTrampolineFile.checkType(more_complete_point, INFERENCE_PARAMETER_MATRIX_POINT_P);
        return list($REGION_BETWEEN, more_efficient_point, more_complete_point);
    }

    public static final SubLObject inference_parameter_matrix_point_in_regionP(SubLObject point, SubLObject region) {
        SubLTrampolineFile.checkType(point, INFERENCE_PARAMETER_MATRIX_POINT_P);
        SubLTrampolineFile.checkType(region, INFERENCE_PARAMETER_MATRIX_REGION_P);
        {
            SubLObject pcase_var = region.first();
            if (pcase_var.eql($REGION_UNDER)) {
                {
                    SubLObject region_max_point = region.rest();
                    SubLObject not_in_regionP = NIL;
                    if (NIL == not_in_regionP) {
                        {
                            SubLObject dimension = NIL;
                            SubLObject dimension_38 = NIL;
                            SubLObject point_value = NIL;
                            SubLObject point_value_39 = NIL;
                            SubLObject region_max_value = NIL;
                            SubLObject region_max_value_40 = NIL;
                            for (dimension = unsubsumed_inference_parameters_to_optimize(), dimension_38 = dimension.first(), point_value = point, point_value_39 = point_value.first(), region_max_value = region_max_point, region_max_value_40 = region_max_value.first(); !((NIL != not_in_regionP) || (((NIL == region_max_value) && (NIL == point_value)) && (NIL == dimension))); dimension = dimension.rest() , dimension_38 = dimension.first() , point_value = point_value.rest() , point_value_39 = point_value.first() , region_max_value = region_max_value.rest() , region_max_value_40 = region_max_value.first()) {
                                if (NIL == inference_parameters.query_property_value_at_least_as_efficientP(dimension_38, point_value_39, region_max_value_40)) {
                                    not_in_regionP = T;
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == not_in_regionP);
                }
            } else
                if (pcase_var.eql($REGION_BETWEEN)) {
                    {
                        SubLObject region_min_point = second(region);
                        SubLObject region_max_point = third(region);
                        SubLObject good_region = new_inference_parameter_matrix_region_under(region_max_point);
                        SubLObject bad_region = new_inference_parameter_matrix_region_under(region_min_point);
                        return makeBoolean((NIL != inference_parameter_matrix_point_in_regionP(point, good_region)) && (NIL == inference_parameter_matrix_point_in_regionP(point, bad_region)));
                    }
                } else {
                    return Errors.error($str_alt151$region_of_unexpected_type___s, region);
                }

        }
    }



    // defparameter
    private static final SubLSymbol $compute_inference_parameter_matrix_using_strengthened_parametersP$ = makeSymbol("*COMPUTE-INFERENCE-PARAMETER-MATRIX-USING-STRENGTHENED-PARAMETERS?*");

    public static final SubLObject initialize_inference_parameter_matrix_1() {
        $inference_parameter_matrix$.setGlobalValue(compute_inference_parameter_matrix_1());
        return $inference_parameter_matrix$.getGlobalValue();
    }

    public static final SubLObject initialize_inference_parameter_matrix_2() {
        $inference_parameter_matrix$.setGlobalValue(compute_inference_parameter_matrix_2());
        return $inference_parameter_matrix$.getGlobalValue();
    }

    public static final SubLObject ensure_initialize_inference_parameter_matrix_initialized() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $inference_parameter_matrix$.getGlobalValue()) {
                if (NIL != $compute_inference_parameter_matrix_using_strengthened_parametersP$.getDynamicValue(thread)) {
                    initialize_inference_parameter_matrix_2();
                } else {
                    initialize_inference_parameter_matrix_1();
                }
            }
            return $inference_parameter_matrix$.getGlobalValue();
        }
    }

    public static final SubLObject inference_parameter_matrix() {
        ensure_initialize_inference_parameter_matrix_initialized();
        return $inference_parameter_matrix$.getGlobalValue();
    }

    /**
     *
     *
     * @return list of inference-parameter-matrix-point-p; a list of points in n-dimensional inference parameter space.
    Each point represents a query that was answerable with those parameters.
     */
    public static final SubLObject compute_inference_parameter_matrix_1() {
        {
            SubLObject points = NIL;
            SubLObject baseline = load_kct_parameters_baseline_stripped();
            SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
            SubLObject cdolist_list_var = answerable_queries;
            SubLObject query_spec = NIL;
            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                points = cons(kbq_point(query_spec), points);
            }
            return nreverse(points);
        }
    }

    /**
     *
     *
     * @return inference-parameter-matrix-point-p; the point corresponding to QUERY-SPEC,
    based on the query properties specified in the KB.
     */
    public static final SubLObject kbq_point(SubLObject query_spec) {
        {
            SubLObject stated_properties = kb_query.kbq_query_properties(query_spec);
            SubLObject point = new_inference_parameter_matrix_point(stated_properties);
            return point;
        }
    }

    public static final SubLObject points_in_region(SubLObject region) {
        SubLTrampolineFile.checkType(region, INFERENCE_PARAMETER_MATRIX_REGION_P);
        {
            SubLObject points = NIL;
            SubLObject cdolist_list_var = inference_parameter_matrix();
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                if (NIL != inference_parameter_matrix_point_in_regionP(point, region)) {
                    points = cons(point, points);
                }
            }
            return nreverse(points);
        }
    }

    public static final SubLObject number_of_points_in_region(SubLObject region) {
        SubLTrampolineFile.checkType(region, INFERENCE_PARAMETER_MATRIX_REGION_P);
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = inference_parameter_matrix();
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                if (NIL != inference_parameter_matrix_point_in_regionP(point, region)) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    public static final SubLObject number_of_points_in_region_under_most_complete_point_given(SubLObject parameter, SubLObject value) {
        {
            SubLObject point = most_complete_theoretical_point_given(parameter, value);
            SubLObject region = new_inference_parameter_matrix_region_under(point);
            SubLObject count = number_of_points_in_region(region);
            return count;
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p; How much completeness is gained by changing PARAMETER from OLD-VALUE to NEW-VALUE.
    The completeness gain is expressed as a multiplier.  1 indicates no change, values above 1 indicate more complete and better,
    values below 1 indicate less complete and worse.  This estimate is computed by using the inference parameter matrix,
    assuming the inference parameters specified in the KB are optimal and could not possibly be strengthened
    along any dimension without causing the query to become unanswerable.
     */
    public static final SubLObject completeness_estimate_2_for_parameter_values(SubLObject parameter, SubLObject old_value, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == inference_parameters.query_property_value_more_completeP(parameter, new_value, old_value)) {
                    Errors.error($str_alt153$This_computation_assumes_that_set, parameter, new_value, old_value);
                }
            }
            {
                SubLObject old_answerable_query_count = number_of_points_in_region_under_most_complete_point_given(parameter, old_value);
                SubLObject new_answerable_query_count = number_of_points_in_region_under_most_complete_point_given(parameter, new_value);
                if (old_answerable_query_count.isZero() && new_answerable_query_count.isZero()) {
                    return ONE_INTEGER;
                } else {
                    return number_utilities.potentially_infinite_number_divided_by(new_answerable_query_count, old_answerable_query_count);
                }
            }
        }
    }

    public static final SubLObject print_completeness_statistics_2() {
        format(T, $str_alt154$Parameter__Value1____Value2__Comp);
        return print_efficiency_and_completeness_statistics_2_int(NIL, T, NIL, NIL);
    }

    public static final SubLObject print_efficiency_and_completeness_statistics_2(SubLObject metric) {
        if (metric == UNPROVIDED) {
            metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        format(T, $str_alt155$Parameter__Value1____Value2__Spee);
        return print_efficiency_and_completeness_statistics_2_int(T, T, NIL, metric);
    }

    /**
     *
     *
     * @see print-efficiency-and-completeness-statistics-int
     */
    public static final SubLObject print_efficiency_and_completeness_statistics_2_int(SubLObject efficiencyP, SubLObject completenessP, SubLObject backwardP, SubLObject metric) {
        {
            SubLObject prev_param = NIL;
            SubLObject prev_value = NIL;
            SubLObject param_list = single_parameter_unsubsumed_experiments();
            SubLObject cdolist_list_var = (NIL != backwardP) ? ((SubLObject) (reverse(param_list))) : param_list;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject param = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    param = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt134);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (param == prev_param) {
                            format(T, $str_alt135$_s__s_____s__, new SubLObject[]{ param, prev_value, value });
                            force_output(UNPROVIDED);
                            if (NIL != efficiencyP) {
                                {
                                    SubLObject speedup = speedup_estimate_for_parameter_values(param, metric, prev_value, value, $ALL);
                                    format(T, $str_alt136$_s_, number_utilities.significant_digits(speedup, FOUR_INTEGER));
                                }
                            }
                            if (NIL != completenessP) {
                                {
                                    SubLObject completeness_gain = completeness_estimate_2_for_parameter_values(param, prev_value, value);
                                    format(T, $str_alt136$_s_, number_utilities.significant_digits(completeness_gain, FOUR_INTEGER));
                                }
                            }
                            terpri(UNPROVIDED);
                            force_output(UNPROVIDED);
                            prev_value = value;
                        } else {
                            prev_param = param;
                            prev_value = value;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt134);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ALPHA;
     * 		a ratio that expresses the relative importance of completeness and efficiency.  @see completeness-efficiency-goodness
     * @param OPTIMIZATION-METRIC;
     * 		the metric we want to optimize
     */
    public static final SubLObject compute_best_first_path_through_parameter_space_1(SubLObject alpha, SubLObject optimization_metric) {
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        return compute_best_first_path_through_parameter_space_int(alpha, optimization_metric);
    }

    public static final SubLObject compute_best_first_path_through_parameter_space_int(SubLObject alpha, SubLObject optimization_metric) {
        {
            SubLObject path = NIL;
            path = cons(most_efficient_point(), path);
            {
                SubLObject last_point = path.first();
                SubLObject next_point = $FIRST_TIME_THROUGH;
                while (!last_point.equal(most_complete_point())) {
                    next_point = take_best_step_through_parameter_space_int(last_point, alpha, optimization_metric);
                    {
                        SubLObject var = next_point;
                        if (NIL != var) {
                            path = cons(var, path);
                        }
                    }
                    last_point = next_point;
                } 
            }
            return nreverse(path);
        }
    }

    public static final SubLObject take_best_step_through_parameter_space_int(SubLObject point, SubLObject alpha, SubLObject metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject dim = best_step_through_parameter_space_int(point, alpha, metric);
                SubLObject value = thread.secondMultipleValue();
                SubLObject goodness = thread.thirdMultipleValue();
                SubLObject completeness_gain = thread.fourthMultipleValue();
                SubLObject speedup = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                format(T, $str_alt157$_s_____s__, dim, value);
                format(T, $str_alt158$g__s___s___s_____s, new SubLObject[]{ number_utilities.significant_digits(speedup, FOUR_INTEGER), number_utilities.significant_digits(completeness_gain, FOUR_INTEGER), number_utilities.significant_digits(alpha, FOUR_INTEGER), number_utilities.significant_digits(goodness, FOUR_INTEGER) });
                {
                    SubLObject next_point = inference_parameter_matrix_point_replace_value_wrt_strategist(point, dim, value);
                    print(next_point, UNPROVIDED);
                    format(T, $str_alt159$____);
                    force_output(UNPROVIDED);
                    return next_point;
                }
            }
        }
    }

    /**
     * Starting from POINT, determines the best single step through inference parameter space that maximizes
     * the completeness/efficiency metric we care about.
     *
     * @return 0 unsubsumed-inference-parameter-to-optimize?; the dimension along which to take the step
     * @return 1; the value to step to.
     * @return 2; the goodness of taking the best step.
     * @return 3; the completeness gain of taking the best step.
     * @return 4; the speedup resulting from taking the best step.
     * @param ALPHA;
     * 		a ratio that expresses the relative importance of completeness and efficiency.  @see completeness-efficiency-goodness
     */
    public static final SubLObject best_step_through_parameter_space_int(SubLObject point, SubLObject alpha, SubLObject metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject best_dim = NIL;
                SubLObject best_value = NIL;
                SubLObject best_goodness = number_utilities.negative_infinity();
                SubLObject best_completeness_gain = NIL;
                SubLObject best_speedup = NIL;
                SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
                SubLObject dimension = NIL;
                for (dimension = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dimension = cdolist_list_var.first()) {
                    {
                        SubLObject value = inference_parameter_matrix_point_value_for_dimension(point, dimension);
                        if (NIL == inference_parameters.most_complete_value_for_query_propertyP(dimension, value)) {
                            {
                                SubLObject next_value = next_most_complete_value_for_parameter(dimension, value);
                                thread.resetMultipleValues();
                                {
                                    SubLObject goodness = goodness_for_parameter_values(point, dimension, next_value, alpha, metric);
                                    SubLObject completeness_gain = thread.secondMultipleValue();
                                    SubLObject speedup = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != number_utilities.potentially_infinite_number_G(goodness, best_goodness)) {
                                        best_dim = dimension;
                                        best_value = next_value;
                                        best_goodness = goodness;
                                        best_completeness_gain = completeness_gain;
                                        best_speedup = speedup;
                                    }
                                }
                            }
                        }
                    }
                }
                return values(best_dim, best_value, best_goodness, best_completeness_gain, best_speedup);
            }
        }
    }

    /**
     * How much goodness would be achieved by going from POINT to a new point
     * determined by going along the dimension of PARAMETER to NEXT-VALUE
     */
    public static final SubLObject goodness_for_parameter_values(SubLObject point, SubLObject parameter, SubLObject next_value, SubLObject alpha, SubLObject metric) {
        {
            SubLObject completeness_gain = completeness_estimate_3_for_point(point, parameter, next_value);
            SubLObject speedup = speedup_estimate_for_point(point, parameter, metric, next_value);
            SubLObject goodness = completeness_efficiency_goodness(completeness_gain, speedup, alpha);
            return values(goodness, completeness_gain, speedup);
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
    Computes the 'goodness' based on the completeness gain and the speedup.
     * @param ALPHA;
     * 		a ratio that expresses the relative importance of completeness and efficiency.
     * 		It is a weight expressing how many more times to count the completeness than the efficiency.
     * 		For example, an alpha of 10 would mean that a completeness gain of 1.1 (a 10% increase)
     * 		would yield the same goodness as a 2x speedup (an efficiency gain of 100%).
     */
    public static final SubLObject completeness_efficiency_goodness(SubLObject completeness_gain, SubLObject speedup, SubLObject alpha) {
        {
            SubLObject log_completeness_gain = number_utilities.potentially_infinite_number_log(completeness_gain, UNPROVIDED);
            SubLObject log_speedup = number_utilities.potentially_infinite_number_log(speedup, UNPROVIDED);
            SubLObject weighted_log_completeness_gain = number_utilities.potentially_infinite_number_times(alpha, log_completeness_gain);
            SubLObject log_goodness = number_utilities.potentially_infinite_number_plus(weighted_log_completeness_gain, log_speedup);
            SubLObject goodness = number_utilities.potentially_infinite_number_exp(log_goodness);
            return goodness;
        }
    }

    public static final SubLObject goodness_increase(SubLObject baseline_answerable_count, SubLObject baseline_time, SubLObject experiment_answerable_count, SubLObject experiment_time, SubLObject alpha) {
        return completeness_efficiency_goodness(divide(experiment_answerable_count, baseline_answerable_count), divide(baseline_time, experiment_time), alpha);
    }

    /**
     * The most efficient point in inference parameter space that we actually have data for
     */
    public static final SubLObject most_efficient_point() {
        {
            SubLObject plist = NIL;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                plist = putf(plist, param, most_efficient_value_for_dimension(param));
            }
            return new_inference_parameter_matrix_point(plist);
        }
    }

    /**
     * Like @xref most-efficient-value-for-query-property except only considers
     * the values that we actually have data for.
     */
    public static final SubLObject most_efficient_value_for_dimension(SubLObject dimension) {
        return list_utilities.alist_lookup(single_parameter_unsubsumed_experiments(), dimension, UNPROVIDED, UNPROVIDED).first();
    }

    /**
     * The most complete point in inference parameter space that we actually have data for
     */
    public static final SubLObject most_complete_point() {
        {
            SubLObject plist = NIL;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                plist = putf(plist, param, most_complete_value_for_dimension(param));
            }
            return new_inference_parameter_matrix_point(plist);
        }
    }

    /**
     * Like @xref most-complete-value-for-query-property except only considers
     * the values that we actually have data for.
     */
    public static final SubLObject most_complete_value_for_dimension(SubLObject dimension) {
        return list_utilities.alist_lookup(reverse(single_parameter_unsubsumed_experiments()), dimension, UNPROVIDED, UNPROVIDED).first();
    }

    /**
     * Returns :no-more-complete-value or a value for PARAMETER that is a little bit more complete than VALUE.
     */
    public static final SubLObject next_most_complete_value_for_parameter(SubLObject parameter, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = position(list(parameter, value), single_parameter_unsubsumed_experiments(), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject next_pair = nth(number_utilities.f_1X(i), single_parameter_unsubsumed_experiments());
                SubLObject datum = next_pair;
                SubLObject current = datum;
                SubLObject next_param = NIL;
                SubLObject next_value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt160);
                next_param = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt160);
                next_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (parameter == next_param) {
                        return next_value;
                    } else {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != inference_parameters.most_complete_value_for_query_propertyP(parameter, value)) || (NIL != find(value, list_utilities.alist_lookup(inference_parameter_values_to_skip(), parameter, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                                Errors.error($str_alt161$Expected__s_to_be_the_most_comple, value, parameter);
                            }
                        }
                        return $NO_MORE_COMPLETE_VALUE;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt160);
                }
            }
            return NIL;
        }
    }

    /**
     * Loads the parameters computed during the baseline, pads them out a bit,
     * and attempts to verify that the queries are really answerable with those
     * properties.  Tries the most efficient properties, since it's just
     * attempting to get the first answer.
     *
     * @param JUST-THESE-QUERIES;
     * 		if specified, only verifies JUST-THESE-QUERIES rather than all queries.
     */
    public static final SubLObject kct_verify_most_efficient_inference_parameters(SubLObject filename, SubLObject just_these_queries, SubLObject start, SubLObject end) {
        if (just_these_queries == UNPROVIDED) {
            just_these_queries = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL != filename) {
            SubLTrampolineFile.checkType(filename, FILE_VALID_FOR_WRITING_P);
        }
        return kct_verify_most_efficient_inference_parameters_int(filename, just_these_queries, start, end);
    }

    /**
     * for debugging
     */
    public static final SubLObject kct_verify_most_efficient_inference_parameters_for_query(SubLObject query) {
        return kct_verify_most_efficient_inference_parameters_int(NIL, list(query), ZERO_INTEGER, ONE_INTEGER);
    }

    public static final SubLObject kct_verify_most_efficient_inference_parameters_int(SubLObject filename, SubLObject just_these_queries, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unverified = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject halt_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject verified = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject count = ZERO_INTEGER;
                SubLObject doneP = NIL;
                format(T, $str_alt163$__run_starting_at__A__, numeric_date_utilities.timestring(UNPROVIDED));
                force_output(UNPROVIDED);
                SubLTrampolineFile.checkType(kct_parameters_experiment_full_filename($kct_baseline_filename$.getGlobalValue(), UNPROVIDED), STRINGP);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(kct_parameters_experiment_full_filename($kct_baseline_filename$.getGlobalValue(), UNPROVIDED), $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt166$Unable_to_open__S, kct_parameters_experiment_full_filename($kct_baseline_filename$.getGlobalValue(), UNPROVIDED));
                        }
                        {
                            SubLObject stream_41 = stream;
                            {
                                SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols(kbq_query_run.kbq_cfasl_common_symbols());
                                    {
                                        SubLObject _prev_bind_0_42 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                                        try {
                                            $cfasl_input_guid_string_resource$.bind(get_new_cfasl_input_guid_string_resource(), thread);
                                            {
                                                SubLObject query_set_run = kbq_query_run.kbq_load_query_set_run_int(stream_41);
                                                if (NIL == doneP) {
                                                    {
                                                        SubLObject csome_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
                                                        SubLObject query_run = NIL;
                                                        for (query_run = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , query_run = csome_list_var.first()) {
                                                            if (count.numGE(start) && (!count.numE($int$2599))) {
                                                                if (NIL != kbq_query_run.kbq_query_run_answerableP(query_run)) {
                                                                    {
                                                                        SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                                                                        SubLObject proof_query_properties = kbq_query_run.kbq_query_run_property_value(query_run, $PROOF_QUERY_PROPERTIES, UNPROVIDED);
                                                                        if ((NIL == just_these_queries) || (NIL != list_utilities.member_eqP(query, just_these_queries))) {
                                                                            if (NIL != proof_query_properties) {
                                                                                thread.resetMultipleValues();
                                                                                {
										    SubLObject sentence = kb_query.kbq_query_arguments(query, UNPROVIDED_SYM);
                                                                                    SubLObject mt = thread.secondMultipleValue();
                                                                                    SubLObject old_properties = thread.thirdMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject strengthened_properties = inference_parameters.compute_most_efficient_query_properties(proof_query_properties);
                                                                                        SubLObject padded_properties = pad_inference_properties(strengthened_properties, old_properties);
                                                                                        proof_query_properties = NIL;
                                                                                        query_run = NIL;
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject result = kct_verify_query_properties(sentence, mt, padded_properties, list_utilities.singletonP(just_these_queries));
                                                                                            SubLObject halt_reason = thread.secondMultipleValue();
                                                                                            SubLObject verified_properties = thread.thirdMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != result) {
                                                                                                format(T, $str_alt169$_);
                                                                                                force_output(UNPROVIDED);
                                                                                                dictionary.dictionary_enter(verified, query, verified_properties);
                                                                                            } else {
                                                                                                format(T, $str_alt170$___a__a__a__a__, new SubLObject[]{ halt_reason, query, result });
                                                                                                force_output(UNPROVIDED);
                                                                                                dictionary.dictionary_enter(unverified, query, halt_reason);
                                                                                                dictionary_utilities.dictionary_increment(halt_dict, halt_reason, UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                Errors.warn($str_alt171$___s_had_answers_but_no_proof_que, query);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            count = add(count, ONE_INTEGER);
                                                            if ((NIL != end) && count.numG(end)) {
                                                                doneP = T;
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject done_var = doneP;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject query_run = kbq_query_run.kbq_load_query_run_int(stream_41);
                                                            if (query_run == $EOF) {
                                                                done_var = T;
                                                            }
                                                            if (NIL == done_var) {
                                                                query_run = kbq_query_run.kbq_nclean_query_run(query_run);
                                                                if (count.numGE(start) && (!count.numE($int$2599))) {
                                                                    if (NIL != kbq_query_run.kbq_query_run_answerableP(query_run)) {
                                                                        {
                                                                            SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                                                                            SubLObject proof_query_properties = kbq_query_run.kbq_query_run_property_value(query_run, $PROOF_QUERY_PROPERTIES, UNPROVIDED);
                                                                            if ((NIL == just_these_queries) || (NIL != list_utilities.member_eqP(query, just_these_queries))) {
                                                                                if (NIL != proof_query_properties) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
											SubLObject sentence = kb_query.kbq_query_arguments(query, UNPROVIDED_SYM);
                                                                                        SubLObject mt = thread.secondMultipleValue();
                                                                                        SubLObject old_properties = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject strengthened_properties = inference_parameters.compute_most_efficient_query_properties(proof_query_properties);
                                                                                            SubLObject padded_properties = pad_inference_properties(strengthened_properties, old_properties);
                                                                                            proof_query_properties = NIL;
                                                                                            query_run = NIL;
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject result = kct_verify_query_properties(sentence, mt, padded_properties, list_utilities.singletonP(just_these_queries));
                                                                                                SubLObject halt_reason = thread.secondMultipleValue();
                                                                                                SubLObject verified_properties = thread.thirdMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != result) {
                                                                                                    format(T, $str_alt169$_);
                                                                                                    force_output(UNPROVIDED);
                                                                                                    dictionary.dictionary_enter(verified, query, verified_properties);
                                                                                                } else {
                                                                                                    format(T, $str_alt170$___a__a__a__a__, new SubLObject[]{ halt_reason, query, result });
                                                                                                    force_output(UNPROVIDED);
                                                                                                    dictionary.dictionary_enter(unverified, query, halt_reason);
                                                                                                    dictionary_utilities.dictionary_increment(halt_dict, halt_reason, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    Errors.warn($str_alt171$___s_had_answers_but_no_proof_que, query);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                count = add(count, ONE_INTEGER);
                                                                if ((NIL != end) && count.numG(end)) {
                                                                    doneP = T;
                                                                }
                                                                done_var = doneP;
                                                            }
                                                        }
                                                    } 
                                                }
                                            }
                                        } finally {
                                            $cfasl_input_guid_string_resource$.rebind(_prev_bind_0_42, thread);
                                        }
                                    }
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
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
                format(T, $str_alt173$__run_ended_at__A, numeric_date_utilities.timestring(UNPROVIDED));
                force_output(UNPROVIDED);
                format(T, $str_alt174$__Verified_Query_count__a, dictionary.dictionary_length(verified));
                format(T, $str_alt175$__Unverified_Query_count__a__, dictionary.dictionary_length(unverified));
                dictionary_utilities.print_dictionary_contents(halt_dict, UNPROVIDED);
                {
                    SubLObject data = list(verified, unverified, halt_dict);
                    if (NIL != filename) {
                        cfasl_utilities.cfasl_save_externalized(data, filename);
                    }
                    return data;
                }
            }
        }
    }

    public static final SubLObject kct_verify_query_properties(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject verboseP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            v_properties = copy_list(v_properties);
            {
                SubLObject i = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject result = NIL;
                SubLObject halt_reason = NIL;
                SubLObject inference = NIL;
                SubLObject metrics = NIL;
                SubLObject exhausted_count = ZERO_INTEGER;
                while (NIL == doneP) {
                    if (NIL != verboseP) {
                        list_utilities.pretty_print_plist(v_properties, UNPROVIDED);
                        force_output(UNPROVIDED);
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject result_43 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
                        SubLObject halt_reason_44 = thread.secondMultipleValue();
                        SubLObject inference_45 = thread.thirdMultipleValue();
                        SubLObject metrics_46 = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        result = result_43;
                        halt_reason = halt_reason_44;
                        inference = inference_45;
                        metrics = metrics_46;
                    }
                    i = add(i, ONE_INTEGER);
                    if (NIL != result) {
                        return values(result, halt_reason, v_properties);
                    } else {
                        {
                            SubLObject pcase_var = halt_reason;
                            if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
                                {
                                    SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count(v_properties);
                                    if (max_problem_count.isNumber()) {
                                        if (NIL != verboseP) {
                                            format(T, $str_alt177$Relaxing__max_problem_count_____);
                                            force_output(UNPROVIDED);
                                        }
                                        v_properties = putf(v_properties, $MAX_PROBLEM_COUNT, number_utilities.f_2X(max_problem_count));
                                    } else {
                                        doneP = T;
                                    }
                                }
                            } else
                                if (pcase_var.eql($EXHAUST) || pcase_var.eql($EXHAUST_TOTAL)) {
                                    {
                                        SubLObject pcase_var_47 = exhausted_count;
                                        if (pcase_var_47.eql(ZERO_INTEGER) || pcase_var_47.eql(TWO_INTEGER)) {
                                            {
                                                SubLObject max_proof_depth = inference_datastructures_enumerated_types.inference_properties_max_proof_depth(v_properties);
                                                if (max_proof_depth.isNumber()) {
                                                    if (NIL != verboseP) {
                                                        format(T, $str_alt180$Relaxing__max_proof_depth_____);
                                                        force_output(UNPROVIDED);
                                                    }
                                                    v_properties = putf(v_properties, $MAX_PROOF_DEPTH, number_utilities.f_1X(max_proof_depth));
                                                } else {
                                                    doneP = T;
                                                }
                                            }
                                        } else
                                            if (pcase_var_47.eql(ONE_INTEGER)) {
                                                {
                                                    SubLObject productivity_limit = inference_datastructures_enumerated_types.strategy_dynamic_properties_productivity_limit(v_properties);
                                                    if (productivity_limit.isNumber()) {
                                                        if (NIL != verboseP) {
                                                            format(T, $str_alt182$Relaxing__productivity_limit_____);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        v_properties = putf(v_properties, $PRODUCTIVITY_LIMIT, multiply(TEN_INTEGER, productivity_limit));
                                                    } else {
                                                        doneP = T;
                                                    }
                                                }
                                            } else
                                                if (pcase_var_47.eql(THREE_INTEGER)) {
                                                    if (NIL != verboseP) {
                                                        format(T, $str_alt177$Relaxing__max_problem_count_____);
                                                        force_output(UNPROVIDED);
                                                    }
                                                    v_properties = remf(v_properties, $MAX_PROBLEM_COUNT);
                                                } else
                                                    if (pcase_var_47.eql(FOUR_INTEGER)) {
                                                        if (NIL != verboseP) {
                                                            format(T, $str_alt180$Relaxing__max_proof_depth_____);
                                                            force_output(UNPROVIDED);
                                                        }
                                                        v_properties = remf(v_properties, $MAX_PROOF_DEPTH);
                                                    } else
                                                        if (pcase_var_47.eql(FIVE_INTEGER)) {
                                                            if (NIL != verboseP) {
                                                                format(T, $str_alt182$Relaxing__productivity_limit_____);
                                                                force_output(UNPROVIDED);
                                                            }
                                                            v_properties = remf(v_properties, $PRODUCTIVITY_LIMIT);
                                                        } else
                                                            if (pcase_var_47.eql(SIX_INTEGER)) {
                                                                if (NIL != verboseP) {
                                                                    format(T, $str_alt184$Relaxing__negation_by_failure____);
                                                                    force_output(UNPROVIDED);
                                                                }
                                                                v_properties = remf(v_properties, $kw185$NEGATION_BY_FAILURE_);
                                                            } else {
                                                                if (NIL != verboseP) {
                                                                    format(T, $str_alt186$Don_t_know_what_else_to_relax___);
                                                                    force_output(UNPROVIDED);
                                                                }
                                                                doneP = T;
                                                            }





                                    }
                                    exhausted_count = add(exhausted_count, ONE_INTEGER);
                                } else {
                                    doneP = T;
                                }

                        }
                    }
                    if (i.numG(TEN_INTEGER)) {
                        doneP = T;
                    }
                } 
                return values(NIL, halt_reason, v_properties);
            }
        }
    }

    public static final SubLObject pad_inference_properties(SubLObject v_properties, SubLObject old_properties) {
        {
            SubLObject problem_count = getf(v_properties, $MAX_PROBLEM_COUNT, UNPROVIDED);
            if (problem_count.isNumber()) {
                v_properties = putf(v_properties, $MAX_PROBLEM_COUNT, problem_count.numL($int$100) ? ((SubLObject) ($int$100)) : add(problem_count, $int$100));
            }
        }
        {
            SubLObject old_max_time = getf(old_properties, $MAX_TIME, UNPROVIDED);
            v_properties = putf(v_properties, $MAX_TIME, old_max_time);
        }
        v_properties = putf(v_properties, $MAX_NUMBER, ONE_INTEGER);
        v_properties = putf(v_properties, $PROBABLY_APPROXIMATELY_DONE, ONE_INTEGER);
        v_properties = list_utilities.merge_plist(old_properties, v_properties);
        v_properties = inference_parameters.remove_inference_engine_query_property_defaults(v_properties);
        return v_properties;
    }

    public static final SubLObject kct_merge_and_save_verification_data(SubLObject input_filenames, SubLObject output_filename) {
        {
            SubLObject verification_data = kct_merge_verification_data(input_filenames);
            cfasl_utilities.cfasl_save_externalized(verification_data, output_filename);
            return verification_data;
        }
    }

    public static final SubLObject kct_merge_verification_data(SubLObject filenames) {
        {
            SubLObject merged_verified = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject merged_unverified = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject merged_halt_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = filenames;
            SubLObject filename = NIL;
            for (filename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filename = cdolist_list_var.first()) {
                {
                    SubLObject verification_data = cfasl_utilities.cfasl_load(filename);
                    SubLObject datum = verification_data;
                    SubLObject current = datum;
                    SubLObject verified = NIL;
                    SubLObject unverified = NIL;
                    SubLObject halt_dict = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt191);
                    verified = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt191);
                    unverified = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt191);
                    halt_dict = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        dictionary_utilities.dictionary_nmerge(merged_verified, verified, T);
                        dictionary_utilities.dictionary_nmerge(merged_unverified, unverified, T);
                        dictionary_utilities.dictionary_nsum(merged_halt_dict, halt_dict);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt191);
                    }
                }
            }
            return list(merged_verified, merged_unverified, merged_halt_dict);
        }
    }

    public static final SubLObject answerable_queries_neither_verified_or_unverified() {
        {
            SubLObject baseline = load_kct_parameters_baseline_stripped();
            SubLObject strongest_parameters_data = kct_load_strongest_parameters_data();
            return answerable_queries_neither_verified_or_unverified_int(baseline, strongest_parameters_data);
        }
    }

    public static final SubLObject answerable_queries_neither_verified_or_unverified_int(SubLObject baseline, SubLObject strongest_parameters_data) {
        {
            SubLObject answerable_queries = Mapping.mapcar(KBQ_QUERY_RUN_QUERY, remove_if($sym193$KBQ_QUERY_RUN_TAUTOLOGY_, kbq_query_run.kbq_query_set_run_query_runs(kbq_query_run.kbq_answerable_query_set_run(baseline)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject datum = strongest_parameters_data;
            SubLObject current = datum;
            SubLObject verified = NIL;
            SubLObject unverified = NIL;
            SubLObject halt_dict = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt191);
            verified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            unverified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            halt_dict = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject queries = list_utilities.fast_set_difference(answerable_queries, append(dictionary.dictionary_keys(verified), dictionary.dictionary_keys(unverified)), UNPROVIDED);
                    return queries;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt191);
            }
        }
        return NIL;
    }

    /**
     * What percentage of queries' strongest parameters were verified?
     */
    public static final SubLObject verification_data_coverage() {
        {
            SubLObject strongest_parameters_data = kct_load_strongest_parameters_data();
            SubLObject datum = strongest_parameters_data;
            SubLObject current = datum;
            SubLObject verified = NIL;
            SubLObject unverified = NIL;
            SubLObject halt_dict = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt191);
            verified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            unverified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            halt_dict = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject verified_count = dictionary.dictionary_length(verified);
                    SubLObject unverified_count = dictionary.dictionary_length(unverified);
                    return divide(verified_count, add(verified_count, unverified_count));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt191);
            }
        }
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $kct_strongest_parameters_filename$ = makeSymbol("*KCT-STRONGEST-PARAMETERS-FILENAME*");

    /**
     *
     *
     * @param ALPHA;
     * 		a ratio that expresses the relative importance of completeness and efficiency.  @see completeness-efficiency-goodness
     * @param OPTIMIZATION-METRIC;
     * 		the metric we want to optimize
     */
    public static final SubLObject compute_best_first_path_through_parameter_space_2(SubLObject alpha, SubLObject optimization_metric) {
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject path = NIL;
                {
                    SubLObject _prev_bind_0 = $compute_inference_parameter_matrix_using_strengthened_parametersP$.currentBinding(thread);
                    try {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.bind(T, thread);
                        path = compute_best_first_path_through_parameter_space_int(alpha, optimization_metric);
                    } finally {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.rebind(_prev_bind_0, thread);
                    }
                }
                return path;
            }
        }
    }

    /**
     *
     *
     * @return list of inference-parameter-matrix-point-p; a list of points in n-dimensional inference parameter space.
    Each point represents a query that was answerable with those parameters.
     * @see compute-inference-parameter-matrix-1
     */
    public static final SubLObject compute_inference_parameter_matrix_2() {
        {
            SubLObject points = NIL;
            SubLObject baseline = load_kct_parameters_baseline_stripped();
            SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
            SubLObject strongest_parameters_dict = kct_load_strongest_parameters_dictionary();
            SubLObject cdolist_list_var = answerable_queries;
            SubLObject query_spec = NIL;
            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                {
                    SubLObject point = kbq_strengthened_point(query_spec, strongest_parameters_dict);
                    SubLObject var = point;
                    if (NIL != var) {
                        points = cons(var, points);
                    }
                }
            }
            return nreverse(points);
        }
    }

    public static final SubLObject kbq_strengthened_point(SubLObject query_spec, SubLObject strongest_parameters_dict) {
        {
            SubLObject strengthened_properties = dictionary.dictionary_lookup(strongest_parameters_dict, query_spec, UNPROVIDED);
            SubLObject point = (NIL != strengthened_properties) ? ((SubLObject) (new_inference_parameter_matrix_point(strengthened_properties))) : NIL;
            return point;
        }
    }

    public static final SubLObject kct_load_strongest_parameters_dictionary() {
        {
            SubLObject strongest_parameters_data = kct_load_strongest_parameters_data();
            SubLObject datum = strongest_parameters_data;
            SubLObject current = datum;
            SubLObject verified = NIL;
            SubLObject unverified = NIL;
            SubLObject halt_dict = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt191);
            verified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            unverified = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt191);
            halt_dict = current.first();
            current = current.rest();
            if (NIL == current) {
                return verified;
            } else {
                cdestructuring_bind_error(datum, $list_alt191);
            }
        }
        return NIL;
    }

    public static final SubLObject kct_load_strongest_parameters_data() {
        return cfasl_utilities.cfasl_load(kct_parameters_data_full_filename($kct_strongest_parameters_filename$.getGlobalValue(), UNPROVIDED));
    }

    /**
     *
     *
     * @return potentially-infinite-number-p; How much completeness is gained by going from POINT to a new point
    determined by going along the PARAMETER dimension to NEW-VALUE.
    The completeness gain is expressed as a multiplier.  1 indicates no change, values above 1 indicate more complete and better,
    values below 1 indicate less complete and worse.  This estimate is computed by using the inference parameter matrix,
    assuming the inference parameters specified in the KB are optimal and could not possibly be strengthened
    along any dimension without causing the query to become unanswerable.
     */
    public static final SubLObject completeness_estimate_3_for_point(SubLObject point, SubLObject parameter, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(point, INFERENCE_PARAMETER_MATRIX_POINT_P);
            {
                SubLObject old_value = inference_parameter_matrix_point_value_for_dimension(point, parameter);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == inference_parameters.query_property_value_more_completeP(parameter, new_value, old_value)) {
                        Errors.error($str_alt153$This_computation_assumes_that_set, parameter, new_value, old_value);
                    }
                }
                {
                    SubLObject new_point = inference_parameter_matrix_point_replace_value_wrt_strategist(point, parameter, new_value);
                    return completeness_estimate_3_for_points(point, new_point);
                }
            }
        }
    }

    public static final SubLObject completeness_estimate_3_for_points(SubLObject point, SubLObject new_point) {
        {
            SubLObject old_answerable_query_count = number_of_points_under(point);
            SubLObject new_answerable_query_count = number_of_points_under(new_point);
            if (old_answerable_query_count.isZero() && new_answerable_query_count.isZero()) {
                return ONE_INTEGER;
            } else {
                return number_utilities.potentially_infinite_number_divided_by(new_answerable_query_count, old_answerable_query_count);
            }
        }
    }

    public static final SubLObject number_of_points_under(SubLObject point) {
        {
            SubLObject region = new_inference_parameter_matrix_region_under(point);
            SubLObject count = number_of_points_in_region(region);
            return count;
        }
    }

    /**
     *
     *
     * @return inference-parameter-matrix-point-p; POINT with its DIMENSION replaced by NEW-VALUE.
    If this changes forces other parameters to change (e.g. setting :allow-hl-predicate-transformation? to T
    forces :transformation-allowed? to be T and :max-transformation-depth to be at least 1) then those changes
    are made as well.
     */
    public static final SubLObject inference_parameter_matrix_point_replace_value_wrt_strategist(SubLObject point, SubLObject dimension, SubLObject new_value) {
        if ((NIL != list_utilities.member_eqP(dimension, $list_alt197)) && (T == new_value)) {
            if (ZERO_INTEGER.eql(inference_parameter_matrix_point_value_for_dimension(point, $MAX_TRANSFORMATION_DEPTH))) {
                point = inference_parameter_matrix_point_replace_value(point, $MAX_TRANSFORMATION_DEPTH, ONE_INTEGER);
            }
            if (NIL == inference_parameter_matrix_point_value_for_dimension(point, $kw199$TRANSFORMATION_ALLOWED_)) {
                point = inference_parameter_matrix_point_replace_value(point, $kw199$TRANSFORMATION_ALLOWED_, T);
            }
        }
        if (($MAX_TRANSFORMATION_DEPTH == dimension) && ONE_INTEGER.eql(new_value)) {
            if (NIL == inference_parameter_matrix_point_value_for_dimension(point, $kw199$TRANSFORMATION_ALLOWED_)) {
                point = inference_parameter_matrix_point_replace_value(point, $kw199$TRANSFORMATION_ALLOWED_, T);
            }
        }
        if ($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT == dimension) {
            {
                SubLObject productivity_limit = inference_parameter_matrix_point_value_for_dimension(point, $PRODUCTIVITY_LIMIT);
                if (NIL != number_utilities.potentially_infinite_integer_L(productivity_limit, new_value)) {
                    point = inference_parameter_matrix_point_replace_value(point, $PRODUCTIVITY_LIMIT, new_value);
                }
            }
        }
        return inference_parameter_matrix_point_replace_value(point, dimension, new_value);
    }

    /**
     * Estimates the speedup (wrt METRIC) obtained by replacing POINT's value for PARAMETER with NEXT-VALUE.
     * Like @xref speedup-estimate-for-parameter-values except takes into account the fact
     * that the Strategist may require changing multiple dimensions at once.
     */
    public static final SubLObject speedup_estimate_for_point(SubLObject point, SubLObject parameter, SubLObject metric, SubLObject next_value) {
        {
            SubLObject new_point = inference_parameter_matrix_point_replace_value_wrt_strategist(point, parameter, next_value);
            return speedup_estimate_for_points(point, new_point, metric, $ALL);
        }
    }

    /**
     * Estimates the speedup on QUERIES obtained by going from POINT to NEW-POINT.
     */
    public static final SubLObject speedup_estimate_for_points(SubLObject point, SubLObject new_point, SubLObject metric, SubLObject queries) {
        {
            SubLObject total_speedup = ONE_INTEGER;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject dim = NIL;
            for (dim = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dim = cdolist_list_var.first()) {
                {
                    SubLObject old_value = inference_parameter_matrix_point_value_for_dimension(point, dim);
                    SubLObject new_value = inference_parameter_matrix_point_value_for_dimension(new_point, dim);
                    SubLObject speedup = speedup_estimate_for_parameter_values(dim, metric, old_value, new_value, queries);
                    total_speedup = multiply(total_speedup, speedup);
                }
            }
            return total_speedup;
        }
    }

    /**
     * An inference parameter cluster is a region of inference parameter space
     * and a canonical point inside that region.  The canonical point is usually
     * taken to be not the centroid but the most complete point in the region.
     */
    public static final SubLObject inference_parameter_cluster_p(SubLObject v_object) {
        if (NIL != list_utilities.doubletonP(v_object)) {
            {
                SubLObject datum = v_object;
                SubLObject current = datum;
                SubLObject region = NIL;
                SubLObject point = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt201);
                region = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt201);
                point = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL != inference_parameter_matrix_region_p(region)) && (NIL != inference_parameter_matrix_point_p(point))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt201);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject make_inference_parameter_cluster(SubLObject region, SubLObject canonical_point) {
        SubLTrampolineFile.checkType(region, INFERENCE_PARAMETER_MATRIX_REGION_P);
        SubLTrampolineFile.checkType(canonical_point, INFERENCE_PARAMETER_MATRIX_POINT_P);
        return list(region, canonical_point);
    }

    public static final SubLObject inference_parameter_cluster_region(SubLObject cluster) {
        SubLTrampolineFile.checkType(cluster, INFERENCE_PARAMETER_CLUSTER_P);
        return cluster.first();
    }

    public static final SubLObject inference_parameter_cluster_canonical_point(SubLObject cluster) {
        SubLTrampolineFile.checkType(cluster, INFERENCE_PARAMETER_CLUSTER_P);
        return second(cluster);
    }

    public static final SubLObject inference_parameter_cluster_points(SubLObject cluster) {
        return points_in_region(inference_parameter_cluster_region(cluster));
    }

    public static final SubLObject inference_parameter_cluster_size(SubLObject cluster) {
        return number_of_points_in_region(inference_parameter_cluster_region(cluster));
    }

    public static final SubLObject inference_parameter_cluster_emptyP(SubLObject cluster) {
        return numE(ZERO_INTEGER, inference_parameter_cluster_size(cluster));
    }

    public static final SubLObject inference_parameter_matrix_point_in_clusterP(SubLObject point, SubLObject cluster) {
        return inference_parameter_matrix_point_in_regionP(point, inference_parameter_cluster_region(cluster));
    }

    public static final SubLObject inference_parameter_cluster_more_efficient_point(SubLObject cluster) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject most_efficient_region = inference_parameter_cluster_region(cluster);
                SubLObject datum = most_efficient_region;
                SubLObject current = datum;
                SubLObject region_between = NIL;
                SubLObject more_efficient_point = NIL;
                SubLObject dont_care_point = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt203);
                region_between = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt203);
                more_efficient_point = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt203);
                dont_care_point = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if ($REGION_BETWEEN != region_between) {
                            Errors.error($str_alt204$Unexpected_cluster_region__s, most_efficient_region);
                        }
                    }
                    return more_efficient_point;
                } else {
                    cdestructuring_bind_error(datum, $list_alt203);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject inference_parameter_cluster_more_complete_point(SubLObject cluster) {
        return inference_parameter_cluster_canonical_point(cluster);
    }



    public static final SubLObject clear_inference_parameter_cluster_queries() {
        {
            SubLObject cs = $inference_parameter_cluster_queries_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_inference_parameter_cluster_queries(SubLObject cluster) {
        return memoization_state.caching_state_remove_function_results_with_args($inference_parameter_cluster_queries_caching_state$.getGlobalValue(), list(cluster), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Assumes strengthened queries
     */
    public static final SubLObject inference_parameter_cluster_queries_internal(SubLObject cluster) {
        {
            SubLObject queries = NIL;
            SubLObject baseline = load_kct_parameters_baseline_stripped();
            SubLObject strongest_parameters_dict = kct_load_strongest_parameters_dictionary();
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_queries(baseline);
            SubLObject query_spec = NIL;
            for (query_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_spec = cdolist_list_var.first()) {
                {
                    SubLObject strengthened_point = kbq_strengthened_point(query_spec, strongest_parameters_dict);
                    if (NIL != strengthened_point) {
                        if (NIL != inference_parameter_matrix_point_in_clusterP(strengthened_point, cluster)) {
                            queries = cons(query_spec, queries);
                        }
                    }
                }
            }
            return nreverse(queries);
        }
    }

    public static final SubLObject inference_parameter_cluster_queries(SubLObject cluster) {
        {
            SubLObject caching_state = $inference_parameter_cluster_queries_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(INFERENCE_PARAMETER_CLUSTER_QUERIES, $inference_parameter_cluster_queries_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, cluster, $kw36$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(inference_parameter_cluster_queries_internal(cluster)));
                    memoization_state.caching_state_put(caching_state, cluster, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject merge_inference_parameter_clusters(SubLObject kill_cluster, SubLObject keep_cluster) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kill_region = inference_parameter_cluster_region(kill_cluster);
                SubLObject keep_region = inference_parameter_cluster_region(keep_cluster);
                SubLObject datum = kill_region;
                SubLObject current = datum;
                SubLObject region_between = NIL;
                SubLObject more_efficient_point = NIL;
                SubLObject merge_point = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt207);
                region_between = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt207);
                more_efficient_point = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt207);
                merge_point = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if ($REGION_BETWEEN != region_between) {
                            Errors.error($str_alt204$Unexpected_cluster_region__s, kill_region);
                        }
                    }
                    {
                        SubLObject datum_48 = keep_region;
                        SubLObject current_49 = datum_48;
                        SubLObject region_between_50 = NIL;
                        SubLObject merge_point_51 = NIL;
                        SubLObject more_complete_point = NIL;
                        destructuring_bind_must_consp(current_49, datum_48, $list_alt208);
                        region_between_50 = current_49.first();
                        current_49 = current_49.rest();
                        destructuring_bind_must_consp(current_49, datum_48, $list_alt208);
                        merge_point_51 = current_49.first();
                        current_49 = current_49.rest();
                        destructuring_bind_must_consp(current_49, datum_48, $list_alt208);
                        more_complete_point = current_49.first();
                        current_49 = current_49.rest();
                        if (NIL == current_49) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($REGION_BETWEEN != region_between_50) {
                                    Errors.error($str_alt204$Unexpected_cluster_region__s, keep_region);
                                }
                            }
                            {
                                SubLObject merged_region = new_inference_parameter_matrix_region_between(more_efficient_point, more_complete_point);
                                SubLObject merged_cluster = make_inference_parameter_cluster(merged_region, more_complete_point);
                                return merged_cluster;
                            }
                        } else {
                            cdestructuring_bind_error(datum_48, $list_alt208);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt207);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject compute_inference_parameter_clusters_from_best_path(SubLObject alpha, SubLObject optimization_metric) {
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            SubLObject path = compute_best_first_path_through_parameter_space_2(alpha, optimization_metric);
            return compute_inference_parameter_clusters_from_path(path);
        }
    }

    public static final SubLObject compute_inference_parameter_clusters_from_path(SubLObject path) {
        {
            SubLObject last_point = most_efficient_point();
            SubLObject clusters = NIL;
            SubLObject cdolist_list_var = path;
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                {
                    SubLObject region = new_inference_parameter_matrix_region_between(last_point, point);
                    SubLObject cluster = make_inference_parameter_cluster(region, point);
                    clusters = cons(cluster, clusters);
                    last_point = point;
                }
            }
            return nreverse(clusters);
        }
    }

    /**
     * Modifies the KB such that most of the queries in the baseline are assigned to
     * exactly one cluster.  Their inference parameters are set to the canonical point in that cluster.
     *
     * @return list of kbq-query-spec-p; queries that were successfully clustered
     */
    public static final SubLObject canonicalize_kb_queries_wrt_clusters(SubLObject clusters) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_dict = assign_kb_queries_to_clusters(clusters);
                SubLObject so_far = ZERO_INTEGER;
                SubLObject total = dictionary.dictionary_length(query_dict);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt209$Canonicalizing_KB_queries_wrt_clu);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(query_dict));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject cluster = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    canonicalize_kbq_wrt_cluster(query, cluster);
                                    so_far = add(so_far, ONE_INTEGER);
                                    utilities_macros.note_percent_progress(so_far, total);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return dictionary.dictionary_keys(query_dict);
            }
        }
    }

    public static final SubLObject assign_kb_queries_to_clusters(SubLObject clusters) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject baseline = load_kct_parameters_baseline_stripped();
                SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
                SubLObject unanswerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_unanswerable_query_set_run(baseline));
                SubLObject strongest_parameters_dict = kct_load_strongest_parameters_dictionary();
                SubLObject query_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject cluster_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject list_var = answerable_queries;
                    utilities_macros.$progress_note$.setDynamicValue($str_alt210$Assigning_answerable_KB_queries_t, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject query = NIL;
                                for (query = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    {
                                        SubLObject cluster = assign_answerable_kbq_to_cluster(query, clusters, strongest_parameters_dict);
                                        if (NIL != cluster) {
                                            {
                                                SubLObject query_point = kbq_point(query);
                                                dictionary.dictionary_enter(query_dict, query, cluster);
                                                dictionary.dictionary_enter(cluster_dict, query_point, cluster);
                                            }
                                        }
                                    }
                                }
                            }
                            utilities_macros.noting_percent_progress_postamble();
                        } finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject list_var = unanswerable_queries;
                    utilities_macros.$progress_note$.setDynamicValue($str_alt211$Assigning_unanswerable_KB_queries, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject query = NIL;
                                for (query = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    {
                                        SubLObject cluster = assign_unanswerable_kbq_to_cluster(query, cluster_dict);
                                        if (NIL != cluster) {
                                            dictionary.dictionary_enter(query_dict, query, cluster);
                                        }
                                    }
                                }
                            }
                            utilities_macros.noting_percent_progress_postamble();
                        } finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return query_dict;
            }
        }
    }

    public static final SubLObject assign_answerable_kbq_to_cluster(SubLObject query, SubLObject clusters, SubLObject strongest_parameters_dict) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strengthened_point = kbq_strengthened_point(query, strongest_parameters_dict);
                if (NIL != strengthened_point) {
                    {
                        SubLObject cluster = assign_point_to_cluster(strengthened_point, clusters);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cluster) {
                                Errors.error($str_alt212$Could_not_assign__s_to_any_cluste, query);
                            }
                        }
                        return cluster;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return inference-parameter-cluster-p
    Assumes that elements of CLUSTERS are pairwise disjoint.
     */
    public static final SubLObject assign_point_to_cluster(SubLObject point, SubLObject clusters) {
        {
            SubLObject cdolist_list_var = clusters;
            SubLObject cluster = NIL;
            for (cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cluster = cdolist_list_var.first()) {
                {
                    SubLObject region = inference_parameter_cluster_region(cluster);
                    if (NIL != inference_parameter_matrix_point_in_regionP(point, region)) {
                        return cluster;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or inference-parameter-cluster-p
     */
    public static final SubLObject assign_unanswerable_kbq_to_cluster(SubLObject query, SubLObject cluster_dict) {
        {
            SubLObject query_point = kbq_point(query);
            SubLObject cluster = dictionary.dictionary_lookup(cluster_dict, query_point, UNPROVIDED);
            return cluster;
        }
    }

    public static final SubLObject canonicalize_kbq_wrt_cluster(SubLObject query, SubLObject cluster) {
        {
            SubLObject canonical_point = inference_parameter_cluster_canonical_point(cluster);
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject dim = NIL;
            for (dim = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dim = cdolist_list_var.first()) {
                {
                    SubLObject canonical_value = inference_parameter_matrix_point_value_for_dimension(canonical_point, dim);
                    kb_query.kbq_ensure_query_spec_inference_parameter_value(query, dim, canonical_value, $$TestVocabularyMt);
                }
            }
        }
        return query;
    }

    public static final SubLObject analyze_kct_parameters_cluster_experiment(SubLObject filename, SubLObject n, SubLObject alpha, SubLObject detailsP, SubLObject display_graphsP, SubLObject metrics, SubLObject optimization_metric) {
        if (detailsP == UNPROVIDED) {
            detailsP = T;
        }
        if (display_graphsP == UNPROVIDED) {
            display_graphsP = T;
        }
        if (metrics == UNPROVIDED) {
            metrics = basic_kct_parameters_query_metrics();
        }
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject experiment = load_kct_parameters_experiment(filename);
                SubLObject baseline = load_kct_parameters_baseline_stripped();
                SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
                SubLObject queries_to_throw_out = kct_parameters_queries_to_throw_out(filename);
                SubLObject queries = set_difference(answerable_queries, queries_to_throw_out, UNPROVIDED, UNPROVIDED);
                SubLObject filtered_baseline = kbq_query_run.kbq_filter_query_set_run_to_queries(baseline, queries, UNPROVIDED);
                SubLObject filtered_experiment = kbq_query_run.kbq_filter_query_set_run_to_queries(experiment, queries, UNPROVIDED);
                format(T, $str_alt214$Summary___);
                {
                    SubLObject baseline_completeness = kbq_query_set_run_metric_value(filtered_baseline, $TOTAL_ANSWERABLE);
                    SubLObject experiment_completeness = kbq_query_set_run_metric_value(filtered_experiment, $TOTAL_ANSWERABLE);
                    SubLObject baseline_time = kbq_query_set_run_metric_value(filtered_baseline, optimization_metric);
                    SubLObject experiment_time = kbq_query_set_run_metric_value(filtered_experiment, optimization_metric);
                    SubLObject completeness_gain = divide(experiment_completeness, baseline_completeness);
                    SubLObject speedup = divide(baseline_time, experiment_time);
                    SubLObject goodness = completeness_efficiency_goodness(completeness_gain, speedup, alpha);
                    {
                        SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                        try {
                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                            format(T, $str_alt216$_s_clusters___s__completeness_los, new SubLObject[]{ n, number_utilities.percent(subtract(ONE_INTEGER, completeness_gain), ONE_INTEGER, THREE_INTEGER), number_utilities.percent(subtract(ONE_INTEGER, speedup), ONE_INTEGER, THREE_INTEGER), number_utilities.percent(goodness, ONE_INTEGER, THREE_INTEGER), alpha });
                        } finally {
                            $read_default_float_format$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != detailsP) {
                    format(T, $str_alt217$Raw_analysis___);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(baseline, experiment, metrics));
                    format(T, $str_alt218$__Analysis___);
                    kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(filtered_baseline, filtered_experiment, metrics));
                    format(T, $str_alt219$__Mutually_Answerable___);
                    thread.resetMultipleValues();
                    {
                        SubLObject mutual_baseline = kbq_query_run.kbq_mutually_answerable_query_set_runs(filtered_baseline, filtered_experiment);
                        SubLObject mutual_experiment = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        kbq_query_run.kbq_print_analysis(kbq_query_run.kbq_analyze_query_set_runs(mutual_baseline, mutual_experiment, metrics));
                    }
                }
                if (NIL != display_graphsP) {
                    kct_parameters_generate_sorted_property_comparison(filtered_baseline, filtered_experiment, $$$baseline, filename, $ANSWERABILITY_TIME, $BOTH, filename, UNPROVIDED);
                    kct_parameters_generate_sorted_property_comparison(filtered_baseline, filtered_experiment, $$$baseline, filename, $ANSWERABILITY_TIME, $BASELINE, filename, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * Throws out queries that halted for completeness-related reasons instead of efficiency-related reasons.
     * These must be due to code skew or some other bug, since we always choose the canonical point in each
     * cluster to be the most complete point.
     * Also throws out queries (both answerable and unanswerable) that failed to be strengthened in the strengthening step,
     * since they would otherwise be placed in a ridiculously complete cluster, thus skewing the results.
     */
    public static final SubLObject kct_parameters_queries_to_throw_out(SubLObject filename) {
        {
            SubLObject queries_to_throw_out = NIL;
            SubLObject unanswerable_queries = kct_parameters_surprisingly_unanswerable_queries(filename);
            SubLObject experiment = load_kct_parameters_experiment(filename);
            SubLObject strongest_parameters_dict = kct_load_strongest_parameters_dictionary();
            {
                SubLObject filtered_experiment = kbq_query_run.kbq_filter_query_set_run_to_queries(experiment, unanswerable_queries, UNPROVIDED);
                SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(filtered_experiment);
                SubLObject query_run = NIL;
                for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                    {
                        SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                        if (NIL == list_utilities.member_eqP(kbq_query_run.kbq_query_run_halt_reason(query_run), $list_alt221)) {
                            queries_to_throw_out = cons(query, queries_to_throw_out);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(experiment);
                SubLObject query_run = NIL;
                for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                    {
                        SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                        if (NIL == dictionary.dictionary_lookup(strongest_parameters_dict, query, UNPROVIDED)) {
                            queries_to_throw_out = cons(query, queries_to_throw_out);
                        }
                    }
                }
            }
            return nreverse(queries_to_throw_out);
        }
    }

    public static final SubLObject kct_parameters_surprisingly_unanswerable_halt_reasons(SubLObject filename) {
        {
            SubLObject queries = kct_parameters_surprisingly_unanswerable_queries(filename);
            SubLObject experiment = load_kct_parameters_experiment(filename);
            SubLObject filtered_experiment = kbq_query_run.kbq_filter_query_set_run_to_queries(experiment, queries, UNPROVIDED);
            SubLObject halt_reasons = Mapping.mapcar(KBQ_QUERY_RUN_HALT_REASON, kbq_query_run.kbq_query_set_run_query_runs(filtered_experiment));
            return list_utilities.pretty_print_histogram(list_utilities.histogram(halt_reasons, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    public static final SubLObject kct_parameters_surprisingly_unanswerable_queries(SubLObject filename) {
        {
            SubLObject experiment = load_kct_parameters_experiment(filename);
            SubLObject unanswerable_experiment = kbq_query_run.kbq_unanswerable_query_set_run(experiment);
            SubLObject unanswerable_queries_experiment = kbq_query_run.kbq_query_set_run_queries(unanswerable_experiment);
            SubLObject baseline = load_kct_parameters_baseline_stripped();
            SubLObject unanswerable_baseline = kbq_query_run.kbq_unanswerable_query_set_run(baseline);
            SubLObject unanswerable_queries_baseline = kbq_query_run.kbq_query_set_run_queries(unanswerable_baseline);
            return list_utilities.fast_set_difference(unanswerable_queries_experiment, unanswerable_queries_baseline, symbol_function(EQ));
        }
    }

    // deflexical
    private static final SubLSymbol $kct_strongest_parameters_filename_2$ = makeSymbol("*KCT-STRONGEST-PARAMETERS-FILENAME-2*");

    public static final SubLObject kct_save_fixed_strongest_parameters_dictionary() {
        return cfasl_utilities.cfasl_save_externalized(kct_fix_strongest_parameters_dictionary(), kct_parameters_experiment_full_filename($kct_strongest_parameters_filename_2$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject kct_fix_strongest_parameters_dictionary() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_dict = kct_load_strongest_parameters_dictionary();
                SubLObject new_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dict));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject old_plist = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject new_plist = kct_fix_strongest_parameters_for_query(query, old_plist);
                            dictionary.dictionary_enter(new_dict, query, new_plist);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return new_dict;
            }
        }
    }

    public static final SubLObject kct_fix_strongest_parameters_for_query(SubLObject query, SubLObject old_plist) {
        {
            SubLObject kb_plist = kb_query.kbq_query_properties(query);
            SubLObject new_plist = NIL;
            SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                {
                    SubLObject old_value = getf(old_plist, param, inference_datastructures_enumerated_types.inference_engine_default_for_property(param));
                    SubLObject kb_value = getf(kb_plist, param, inference_datastructures_enumerated_types.inference_engine_default_for_property(param));
                    format(T, $str_alt224$old_value___s__KB_value___s__, old_value, kb_value);
                    {
                        SubLObject new_value = (NIL != inference_parameters.query_property_value_more_completeP(param, old_value, kb_value)) ? ((SubLObject) (kb_value)) : old_value;
                        if (!old_value.equal(new_value)) {
                            format(T, $str_alt225$Unstrengthening__s_from__s_to__s_, new SubLObject[]{ param, old_value, new_value });
                        }
                        new_plist = putf(new_plist, param, new_value);
                    }
                }
            }
            return new_plist;
        }
    }

    public static final SubLObject compute_reduced_inference_parameter_clusters_from_path(SubLObject path, SubLObject n, SubLObject optimization_metric) {
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject initial_clusters = compute_inference_parameter_clusters_from_path(path);
                if (n.numGE(length(initial_clusters))) {
                    return initial_clusters;
                }
                {
                    SubLObject _prev_bind_0 = $compute_inference_parameter_matrix_using_strengthened_parametersP$.currentBinding(thread);
                    try {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.bind(T, thread);
                        ensure_initialize_inference_parameter_matrix_initialized();
                    } finally {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject non_empty_clusters = remove_if($sym226$INFERENCE_PARAMETER_CLUSTER_EMPTY_, initial_clusters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (n.numGE(length(non_empty_clusters))) {
                        return non_empty_clusters;
                    } else {
                        return reduce_inference_parameter_clusters(non_empty_clusters, n, optimization_metric);
                    }
                }
            }
        }
    }

    /**
     * Merges adjacent clusters until ending up with only N.
     */
    public static final SubLObject reduce_inference_parameter_clusters(SubLObject clusters, SubLObject n, SubLObject optimization_metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_point_count = apply(symbol_function($sym227$_), Mapping.mapcar(INFERENCE_PARAMETER_CLUSTER_SIZE, clusters));
                SubLObject merge_count = subtract(length(clusters), n);
                SubLObject speedups_so_far = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(merge_count); i = add(i, ONE_INTEGER)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject new_clusters = make_best_cluster_merge(clusters, optimization_metric, total_point_count, speedups_so_far);
                        SubLObject speedup = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        clusters = new_clusters;
                        speedups_so_far = cons(speedup, speedups_so_far);
                    }
                }
                return clusters;
            }
        }
    }

    /**
     * We assume that the most complete cluster will be one of the final clusters.
     *
     * @param SPEEDUPS-SO-FAR;
     * 		only used for printing
     */
    public static final SubLObject make_best_cluster_merge(SubLObject clusters, SubLObject optimization_metric, SubLObject total_point_count, SubLObject speedups_so_far) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject least_bad_speedup = number_utilities.negative_infinity();
                SubLObject least_bad_merge_pos = NIL;
                SubLObject cdotimes_end_var = number_utilities.f_1_(length(clusters));
                SubLObject candidate_merge_pos = NIL;
                for (candidate_merge_pos = ZERO_INTEGER; candidate_merge_pos.numL(cdotimes_end_var); candidate_merge_pos = add(candidate_merge_pos, ONE_INTEGER)) {
                    {
                        SubLObject kill_cluster = nth(candidate_merge_pos, clusters);
                        SubLObject keep_cluster = nth(number_utilities.f_1X(candidate_merge_pos), clusters);
                        SubLObject speedup = speedup_of_cluster_merge(kill_cluster, keep_cluster, optimization_metric, total_point_count);
                        if ((NIL == least_bad_merge_pos) || (NIL != number_utilities.potentially_infinite_number_G(speedup, least_bad_speedup))) {
                            least_bad_merge_pos = candidate_merge_pos;
                            least_bad_speedup = speedup;
                        }
                    }
                }
                {
                    SubLObject kill_cluster = nth(least_bad_merge_pos, clusters);
                    SubLObject keep_cluster = nth(number_utilities.f_1X(least_bad_merge_pos), clusters);
                    SubLObject merged_cluster = merge_inference_parameter_clusters(kill_cluster, keep_cluster);
                    SubLObject merged_clusters = list_utilities.remove_nth(least_bad_merge_pos, list_utilities.replace_nth(number_utilities.f_1X(least_bad_merge_pos), merged_cluster, clusters));
                    SubLObject total_speedup_so_far = multiply(least_bad_speedup, apply(symbol_function($sym229$_), speedups_so_far));
                    {
                        SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                        try {
                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                            format(T, $str_alt230$Reducing_to__s_clusters_yields_a_, new SubLObject[]{ length(merged_clusters), number_utilities.significant_digits(least_bad_speedup, SIX_INTEGER), number_utilities.significant_digits(total_speedup_so_far, SIX_INTEGER) });
                            force_output(UNPROVIDED);
                        } finally {
                            $read_default_float_format$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return values(merged_clusters, least_bad_speedup);
                }
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p; the speedup of removing the KILL-CLUSTER,
    which would move all its points to KEEP-CLUSTER instead.  The lower the speedup,
    the worse it would be to merge those clusters.
     */
    public static final SubLObject speedup_of_cluster_merge(SubLObject kill_cluster, SubLObject keep_cluster, SubLObject optimization_metric, SubLObject total_point_count) {
        {
            SubLObject kill_point = inference_parameter_cluster_canonical_point(kill_cluster);
            SubLObject keep_point = inference_parameter_cluster_canonical_point(keep_cluster);
            SubLObject kill_queries = inference_parameter_cluster_queries(kill_cluster);
            SubLObject point_speedup = speedup_estimate_for_points(kill_point, keep_point, optimization_metric, kill_queries);
            SubLObject point_count = inference_parameter_cluster_size(kill_cluster);
            SubLObject weighted_speedup = multiply(point_speedup, divide(point_count, total_point_count));
            SubLObject non_speedup = ONE_INTEGER;
            SubLObject other_point_count = subtract(total_point_count, point_count);
            SubLObject weighted_non_speedup = multiply(non_speedup, divide(other_point_count, total_point_count));
            SubLObject total_speedup = add(weighted_speedup, weighted_non_speedup);
            return total_speedup;
        }
    }

    public static final SubLObject canonicalize_kb_queries_wrt_strengthened_parameters() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject baseline = load_kct_parameters_baseline_stripped();
                SubLObject answerable_queries = kbq_query_run.kbq_query_set_run_queries(kbq_query_run.kbq_answerable_query_set_run(baseline));
                SubLObject strongest_parameters_dict = kct_load_strongest_parameters_dictionary();
                SubLObject list_var = answerable_queries;
                utilities_macros.$progress_note$.setDynamicValue($str_alt231$Canonicalizing_KB_queries_wrt_str, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject query = NIL;
                            for (query = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                canonicalize_kbq_wrt_strengthened_parameters(query, strongest_parameters_dict);
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return length(answerable_queries);
            }
        }
    }

    public static final SubLObject canonicalize_kbq_wrt_strengthened_parameters(SubLObject query, SubLObject strongest_parameters_dict) {
        {
            SubLObject strengthened_point = kbq_strengthened_point(query, strongest_parameters_dict);
            if (NIL != strengthened_point) {
                {
                    SubLObject cdolist_list_var = unsubsumed_inference_parameters_to_optimize();
                    SubLObject dim = NIL;
                    for (dim = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dim = cdolist_list_var.first()) {
                        {
                            SubLObject strengthened_value = inference_parameter_matrix_point_value_for_dimension(strengthened_point, dim);
                            kb_query.kbq_ensure_query_spec_inference_parameter_value(query, dim, strengthened_value, $$TestVocabularyMt);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Gobs of data on the estimated goodness of all possible reductions of clusters
     */
    // deflexical
    private static final SubLSymbol $reduced_inference_parameter_clusters_from_path_7_data$ = makeSymbol("*REDUCED-INFERENCE-PARAMETER-CLUSTERS-FROM-PATH-7-DATA*");

    /**
     *
     *
     * @see compute-reduced-inference-parameter-clusters-from-path
     */
    public static final SubLObject compute_reduced_inference_parameter_clusters_from_path_7(SubLObject path, SubLObject n, SubLObject optimization_metric) {
        if (optimization_metric == UNPROVIDED) {
            optimization_metric = $MEDIAN_ANSWERABILITY_TIME;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $reduced_inference_parameter_clusters_from_path_7_data$.setGlobalValue(NIL);
            {
                SubLObject initial_clusters = compute_inference_parameter_clusters_from_path(path);
                if (n.numGE(length(initial_clusters))) {
                    return initial_clusters;
                }
                {
                    SubLObject _prev_bind_0 = $compute_inference_parameter_matrix_using_strengthened_parametersP$.currentBinding(thread);
                    try {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.bind(T, thread);
                        ensure_initialize_inference_parameter_matrix_initialized();
                    } finally {
                        $compute_inference_parameter_matrix_using_strengthened_parametersP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject non_empty_clusters = remove_if($sym226$INFERENCE_PARAMETER_CLUSTER_EMPTY_, initial_clusters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (n.numGE(length(non_empty_clusters))) {
                        return non_empty_clusters;
                    } else {
                        return reduce_inference_parameter_clusters_7(non_empty_clusters, n, optimization_metric);
                    }
                }
            }
        }
    }

    /**
     * Evaluates all possible cluster reductions that end up with exactly N reduced clusters.
     */
    public static final SubLObject reduce_inference_parameter_clusters_7(SubLObject clusters, SubLObject n, SubLObject optimization_metric) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_point_count = apply(symbol_function($sym227$_), Mapping.mapcar(INFERENCE_PARAMETER_CLUSTER_SIZE, clusters));
                SubLObject candidate_keep_cluster_sets = list_utilities.subsets_of_size(butlast(clusters, UNPROVIDED), number_utilities.f_1_(n));
                SubLObject least_bad_speedup = number_utilities.negative_infinity();
                SubLObject least_bad_merged_clusters = NIL;
                SubLObject list_var = candidate_keep_cluster_sets;
                utilities_macros.$progress_note$.setDynamicValue($str_alt232$Evaluating_all_possible_cluster_r, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject candidate_keep_clusters = NIL;
                            for (candidate_keep_clusters = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , candidate_keep_clusters = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject full_candidate_keep_clusters = append(candidate_keep_clusters, last(clusters, UNPROVIDED));
                                    SubLObject speedup = speedup_of_cluster_multi_merge(clusters, full_candidate_keep_clusters, optimization_metric, total_point_count);
                                    SubLObject candidate_merged_clusters = multi_merge_inference_parameter_clusters(clusters, full_candidate_keep_clusters);
                                    $reduced_inference_parameter_clusters_from_path_7_data$.setGlobalValue(cons(cons(candidate_merged_clusters, speedup), $reduced_inference_parameter_clusters_from_path_7_data$.getGlobalValue()));
                                    if ((NIL == least_bad_merged_clusters) || (NIL != number_utilities.potentially_infinite_number_G(speedup, least_bad_speedup))) {
                                        least_bad_merged_clusters = candidate_merged_clusters;
                                        least_bad_speedup = speedup;
                                        {
                                            SubLObject _prev_bind_0_52 = $read_default_float_format$.currentBinding(thread);
                                            try {
                                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                                format(T, $str_alt233$__New_best_so_far___sx_speedup___, number_utilities.significant_digits(speedup, FOUR_INTEGER));
                                                format_nil.print_one_per_line(least_bad_merged_clusters, UNPROVIDED);
                                                force_output(UNPROVIDED);
                                            } finally {
                                                $read_default_float_format$.rebind(_prev_bind_0_52, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return least_bad_merged_clusters;
            }
        }
    }

    public static final SubLObject multi_merge_inference_parameter_clusters(SubLObject clusters, SubLObject keep_clusters) {
        {
            SubLObject final_clusters = NIL;
            SubLObject cdolist_list_var = keep_clusters;
            SubLObject keep_cluster = NIL;
            for (keep_cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keep_cluster = cdolist_list_var.first()) {
                {
                    SubLObject merged_clusters = multi_merge_inference_parameter_clusters_int(clusters, keep_cluster);
                    final_clusters = cons(merged_clusters.first(), final_clusters);
                    clusters = merged_clusters.rest();
                }
            }
            return nreverse(final_clusters);
        }
    }

    /**
     * Merges all clusters in CLUSTERS below KEEP-CLUSTER into KEEP-CLUSTER.
     */
    public static final SubLObject multi_merge_inference_parameter_clusters_int(SubLObject clusters, SubLObject keep_cluster) {
        {
            SubLObject more_efficient_point = inference_parameter_cluster_more_efficient_point(clusters.first());
            SubLObject more_complete_point = inference_parameter_cluster_more_complete_point(keep_cluster);
            SubLObject merged_region = new_inference_parameter_matrix_region_between(more_efficient_point, more_complete_point);
            SubLObject merged_cluster = make_inference_parameter_cluster(merged_region, more_complete_point);
            SubLObject merge_pos = position(keep_cluster, clusters, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject other_clusters = list_utilities.last_n(subtract(length(clusters), merge_pos, ONE_INTEGER), clusters);
            SubLObject merged_clusters = listS(merged_cluster, other_clusters);
            return merged_clusters;
        }
    }

    /**
     *
     *
     * @see multi-merge-inference-parameter-clusters
     */
    public static final SubLObject speedup_of_cluster_multi_merge(SubLObject clusters, SubLObject keep_clusters, SubLObject optimization_metric, SubLObject total_point_count) {
        {
            SubLObject total_speedup = ONE_INTEGER;
            SubLObject cdolist_list_var = keep_clusters;
            SubLObject keep_cluster = NIL;
            for (keep_cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keep_cluster = cdolist_list_var.first()) {
                {
                    SubLObject speedup = speedup_of_cluster_multi_merge_int(clusters, keep_cluster, optimization_metric, total_point_count);
                    SubLObject merged_clusters = multi_merge_inference_parameter_clusters_int(clusters, keep_cluster);
                    total_speedup = multiply(speedup, total_speedup);
                    clusters = merged_clusters.rest();
                }
            }
            return total_speedup;
        }
    }

    /**
     * The estimated speedup of merging all the clusters in CLUSTERS below KEEP-CLUSTER onto KEEP-CLUSTER.
     *
     * @see multi-merge-inference-parameter-clusters-int
     */
    public static final SubLObject speedup_of_cluster_multi_merge_int(SubLObject clusters, SubLObject keep_cluster, SubLObject optimization_metric, SubLObject total_point_count) {
        {
            SubLObject total_speedup = ONE_INTEGER;
            SubLObject merge_pos = position(keep_cluster, clusters, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject kill_clusters = list_utilities.first_n(merge_pos, clusters);
            SubLObject cdolist_list_var = kill_clusters;
            SubLObject kill_cluster = NIL;
            for (kill_cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kill_cluster = cdolist_list_var.first()) {
                {
                    SubLObject speedup = speedup_of_cluster_merge(kill_cluster, keep_cluster, optimization_metric, total_point_count);
                    total_speedup = multiply(speedup, total_speedup);
                }
            }
            return total_speedup;
        }
    }

    public static final SubLObject run_kct_clustering_experiment_9_4_n(SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exp_9_4_clusters_n = nth(n, Sort.sort(cfasl_utilities.cfasl_load($str_alt234$_cyc_projects_inference_kct_param), symbol_function($sym96$_), symbol_function(CDR))).first();
                SubLObject filename = cconcatenate($str_alt236$exp_9_, string_utilities.str(n));
                SubLObject comment = cconcatenate($str_alt237$Clustering_Experiment_9_, new SubLObject[]{ format_nil.format_nil_a_no_copy(n), $str_alt238$__KB_queries_canonicalized_to_ele, format_nil.format_nil_a_no_copy(n), $str_alt239$_in_the_exhaustive_list_of_4_clus });
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != Filesys.probe_file(kct_parameters_experiment_full_filename(filename, UNPROVIDED))) {
                        Errors.error($str_alt240$_s_already_exists, filename);
                    }
                }
                canonicalize_kb_queries_wrt_clusters(exp_9_4_clusters_n);
                {
                    SubLObject _prev_bind_0 = $suspend_type_checkingP$.currentBinding(thread);
                    try {
                        $suspend_type_checkingP$.bind(T, thread);
                        agenda.halt_agenda(UNPROVIDED);
                        {
                            SubLObject filename_var = filename;
                            SubLObject full_filename = (NIL != filename_var) ? ((SubLObject) (kct_parameters_experiment_full_filename(filename_var, $kct_parameters_experiment_directory$.getGlobalValue()))) : NIL;
                            kbq_query_run.run_kbq_experiment_internal(list(new SubLObject[]{ $QUERY_SPEC_SET, $list_alt37, $FILENAME, full_filename, $ANALYSIS_FILENAME, NIL, $KEEPALIVE_FILENAME, NIL, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, NIL, $METRICS, all_kct_parameters_query_metrics(), $OUTLIER_TIMEOUT, $kct_parameters_outlier_timeout$.getGlobalValue(), $INCREMENTAL, T, $INCLUDE_RESULTS, NIL, $RANDOMIZE, NIL, $SKIP, ZERO_INTEGER, $COUNT, NIL, $IF_FILE_EXISTS, $AUGMENT_OR_RERUN_ERRORS }));
                        }
                    } finally {
                        $suspend_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return n;
            }
        }
    }

    /**
     * Queries to ask in compute-standard-inference-queries, bindings for which should be
     * eliminated from consideration as standard inference queries
     */
    // deflexical
    private static final SubLSymbol $non_standard_inference_query_queries$ = makeSymbol("*NON-STANDARD-INFERENCE-QUERY-QUERIES*");

    // deflexical
    private static final SubLSymbol $non_standard_inference_query_functors$ = makeSymbol("*NON-STANDARD-INFERENCE-QUERY-FUNCTORS*");

    // deflexical
    private static final SubLSymbol $non_standard_inference_query_strings$ = makeSymbol("*NON-STANDARD-INFERENCE-QUERY-STRINGS*");

    // deflexical
    private static final SubLSymbol $non_standard_inference_query_terms$ = makeSymbol("*NON-STANDARD-INFERENCE-QUERY-TERMS*");

    /**
     * Collections to exclude from the standard inference queries
     */
    // deflexical
    private static final SubLSymbol $non_standard_inference_query_collections$ = makeSymbol("*NON-STANDARD-INFERENCE-QUERY-COLLECTIONS*");

    // deflexical
    private static final SubLSymbol $runnable_standard_inference_queries_file$ = makeSymbol("*RUNNABLE-STANDARD-INFERENCE-QUERIES-FILE*");

    public static final SubLObject compute_and_save_runnable_standard_inference_queries(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        Errors.error($str_alt249$This_should_only_be_run_once__to_);
        {
            SubLObject queries = list_utilities.randomize_list(compute_runnable_standard_inference_queries(robustP));
            cfasl_utilities.cfasl_save_externalized(queries, $runnable_standard_inference_queries_file$.getGlobalValue());
            return length(queries);
        }
    }

    public static final SubLObject compute_runnable_standard_inference_queries(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return list_utilities.remove_if_not($sym250$KBQ_RUNNABLE_, compute_standard_inference_queries(robustP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param ROBUST?;
     * 		check the KB for consistency.  make sure no NL queries or SKSI queries have snuck in.
     */
    public static final SubLObject compute_standard_inference_queries(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            SubLObject query_specs = isa.all_fort_instances_in_all_mts($$CycLQuerySpecification);
            {
                SubLObject cdolist_list_var = $non_standard_inference_query_collections$.getGlobalValue();
                SubLObject col = NIL;
                for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                    query_specs = list_utilities.fast_set_difference(query_specs, isa.all_fort_instances_in_all_mts(col), UNPROVIDED);
                }
            }
            if (NIL != robustP) {
                {
                    SubLObject cdolist_list_var = $non_standard_inference_query_queries$.getGlobalValue();
                    SubLObject cycl_query = NIL;
                    for (cycl_query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl_query = cdolist_list_var.first()) {
                        {
                            SubLObject non_standard_query_specs = query_variable_cached($Q, cycl_query, $$EverythingPSC, $list_alt253);
                            format_nil.print_one_per_line(keyhash_utilities.fast_intersection(non_standard_query_specs, query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                            query_specs = list_utilities.fast_set_difference(query_specs, non_standard_query_specs, UNPROVIDED);
                        }
                    }
                }
                query_specs = remove_if($sym254$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_FUNCTOR_, query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                query_specs = remove_if($sym255$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_STRING_, query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                query_specs = remove_if($sym256$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_TERM_, query_specs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return query_specs;
        }
    }



    public static final SubLObject clear_query_variable_cached() {
        {
            SubLObject cs = $query_variable_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_query_variable_cached(SubLObject token, SubLObject query, SubLObject mt, SubLObject v_properties) {
        return memoization_state.caching_state_remove_function_results_with_args($query_variable_cached_caching_state$.getGlobalValue(), list(token, query, mt, v_properties), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject query_variable_cached_internal(SubLObject token, SubLObject query, SubLObject mt, SubLObject v_properties) {
        return ask_utilities.query_variable(token, query, mt, v_properties);
    }

    public static final SubLObject query_variable_cached(SubLObject token, SubLObject query, SubLObject mt, SubLObject v_properties) {
        {
            SubLObject caching_state = $query_variable_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QUERY_VARIABLE_CACHED, $query_variable_cached_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_QUERY_VARIABLE_CACHED);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_4(token, query, mt, v_properties);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (token.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (query.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(query_variable_cached_internal(token, query, mt, v_properties)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(token, query, mt, v_properties));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject query_has_non_standard_inference_query_functorP(SubLObject query) {
        if ((NIL != nart_handles.nart_p(query)) && (NIL != list_utilities.member_eqP(cycl_utilities.nat_functor(query), $non_standard_inference_query_functors$.getGlobalValue()))) {
            print(list(query, cycl_utilities.nat_functor(query)), UNPROVIDED);
            return T;
        }
        return NIL;
    }

    public static final SubLObject query_has_non_standard_inference_query_stringP(SubLObject query) {
        if (NIL != narts_high.nart_with_functor_p($$TestQueryFn, query)) {
            {
                SubLObject test = cycl_utilities.nat_arg1(query, UNPROVIDED);
                if (NIL != constant_handles.constant_p(test)) {
                    {
                        SubLObject name = constants_high.constant_name(test);
                        SubLObject cdolist_list_var = $non_standard_inference_query_strings$.getGlobalValue();
                        SubLObject string = NIL;
                        for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                            if (NIL != string_utilities.substringP(string, name, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED)) {
                                print(list(query, string), UNPROVIDED);
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject query_has_non_standard_inference_query_termP(SubLObject query) {
        {
            SubLObject v_term = list_utilities.tree_find_if($sym261$NON_STANDARD_INFERENCE_QUERY_TERM_, kb_query.kbq_sentences(query).first(), UNPROVIDED);
            if (NIL != v_term) {
                print(list(query, v_term), UNPROVIDED);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject non_standard_inference_query_termP(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $non_standard_inference_query_terms$.getGlobalValue());
    }

    public static final SubLObject training_inference_queries() {
        return training_or_test_inference_queries(T);
    }

    public static final SubLObject test_inference_queries() {
        return training_or_test_inference_queries(NIL);
    }

    public static final SubLObject training_or_test_inference_queries(SubLObject trainingP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_standard_inference_queries_initialized();
            {
                SubLObject n = length($standard_inference_queries$.getGlobalValue());
                SubLObject training_query_count = round(divide(n, TWO_INTEGER), UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject training_queries = list_utilities.split_list($standard_inference_queries$.getGlobalValue(), training_query_count);
                    SubLObject test_queries = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != trainingP) {
                        return kb_utilities.sort_terms(training_queries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        return kb_utilities.sort_terms(test_queries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
    }



    public static final SubLObject ensure_standard_inference_queries_initialized() {
        if (NIL == $standard_inference_queries$.getGlobalValue()) {
            $standard_inference_queries$.setGlobalValue(cfasl_utilities.cfasl_load($runnable_standard_inference_queries_file$.getGlobalValue()));
            return T;
        }
        return NIL;
    }

    public static final SubLObject standard_inference_queries(SubLObject n, SubLObject start_pos) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        ensure_standard_inference_queries_initialized();
        if (NIL != n) {
            return subseq($standard_inference_queries$.getGlobalValue(), start_pos, add(start_pos, n));
        } else {
            return copy_list($standard_inference_queries$.getGlobalValue());
        }
    }

    public static final SubLObject single_parameter_experiment_summary(SubLObject clearP, SubLObject start_number, SubLObject end_number) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (start_number == UNPROVIDED) {
            start_number = ZERO_INTEGER;
        }
        if (end_number == UNPROVIDED) {
            end_number = NIL;
        }
        if (NIL != clearP) {
            clear_load_kct_parameters_experiment();
        }
        if (NIL == end_number) {
            end_number = number_utilities.f_1_(length(single_parameter_experiment_list()));
        }
        print_header_of_single_parameter_experiment_summary();
        {
            SubLObject end_var = number_utilities.f_1X(end_number);
            SubLObject i = NIL;
            for (i = start_number; !i.numGE(end_var); i = number_utilities.f_1X(i)) {
                {
                    SubLObject filename = cconcatenate(single_parameter_experiment_prefix(), string_utilities.str(i));
                    single_parameter_experiment_summary_for_file(filename, i);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject single_parameter_experiment_summary_for_file(SubLObject filename, SubLObject i) {
        if (NIL == Filesys.probe_file(kct_parameters_experiment_full_filename(filename, UNPROVIDED))) {
            print_one_line_of_single_parameter_experiment_summary(i, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER);
        } else {
            {
                SubLObject experiment = load_kct_parameters_experiment(filename);
                SubLObject count = length(kbq_query_run.kbq_query_set_run_query_runs(experiment));
                SubLObject metric = kbq_query_set_run_metric_value(experiment, $MEDIAN_ANSWERABILITY_TIME);
                SubLObject metric_count = kbq_query_set_run_answerability_time_count(experiment);
                SubLObject answerable = length(kbq_query_run.kbq_query_set_run_query_runs(kbq_query_run.kbq_answerable_query_set_run(experiment)));
                SubLObject error = kbq_query_run.kbq_erroring_query_count(experiment);
                SubLObject lumpy = kbq_query_run.kbq_lumpy_query_count(experiment);
                SubLObject other_error = subtract(error, lumpy);
                print_one_line_of_single_parameter_experiment_summary(i, lumpy, other_error, answerable, count, metric, metric_count);
            }
        }
        force_output(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject print_header_of_single_parameter_experiment_summary() {
        return format(T, $str_alt263$Experiment______of_erroring__lump);
    }

    public static final SubLObject print_one_line_of_single_parameter_experiment_summary(SubLObject i, SubLObject lumpy, SubLObject other_error, SubLObject answerable, SubLObject count, SubLObject metric, SubLObject metric_query_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pair = nth(i, single_parameter_experiment_list());
                SubLObject datum = pair;
                SubLObject current = datum;
                SubLObject param = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt134);
                param = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt134);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                        try {
                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                            format(T, $str_alt264$_____2D_______________4D___2D____, new SubLObject[]{ i, add(lumpy, other_error), lumpy, count, metric_query_count, answerable, number_utilities.significant_digits(metric, FOUR_INTEGER), param, value });
                        } finally {
                            $read_default_float_format$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt134);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject single_parameter_experiment_error_summary() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error_info = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLTrampolineFile.checkType($kct_parameters_log_directory$.getGlobalValue(), DIRECTORY_P);
                {
                    SubLObject directory_contents_var = Filesys.directory($kct_parameters_log_directory$.getGlobalValue(), T);
                    SubLObject progress_message_var = $$$Analyzing_logs;
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            {
                                SubLObject list_var = directory_contents_var;
                                utilities_macros.$progress_note$.setDynamicValue(progress_message_var, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_53 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject file = NIL;
                                            for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL == Filesys.directory_p(file)) {
                                                    if (NIL != string_utilities.substringP($$$trace, file, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                        {
                                                            SubLObject current_experiment_num = NIL;
                                                            SubLObject current_experiment_line = NIL;
                                                            SubLObject current_bug_20862_occurrences = ZERO_INTEGER;
                                                            SubLObject stream = NIL;
                                                            try {
                                                                stream = compatibility.open_text(file, $INPUT, NIL);
                                                                if (!stream.isStream()) {
                                                                    Errors.error($str_alt166$Unable_to_open__S, file);
                                                                }
                                                                {
                                                                    SubLObject infile = stream;
                                                                    if (infile.isStream()) {
                                                                        {
                                                                            SubLObject line = NIL;
                                                                            for (line = read_line(infile, NIL, NIL, UNPROVIDED); NIL != line; line = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                                                                if (NIL != string_utilities.starts_with(line, $str_alt268$Starting_Experiment_Run_)) {
                                                                                    if (NIL != current_experiment_num) {
                                                                                        dictionary_utilities.dictionary_push(error_info, current_experiment_num, list(current_bug_20862_occurrences, current_experiment_line, file));
                                                                                    }
                                                                                    current_experiment_line = line;
                                                                                    current_experiment_num = string_utilities.string_to_number(string_utilities.string_between(line, list(CHAR_hash, CHAR_w), UNPROVIDED));
                                                                                    current_bug_20862_occurrences = ZERO_INTEGER;
                                                                                }
                                                                                if (NIL != string_utilities.substringP($$$Unable_to_compute_any_metrics, line, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                    current_bug_20862_occurrences = add(current_bug_20862_occurrences, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (stream.isStream()) {
                                                                            close(stream, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
                                                                    }
                                                                }
                                                            }
                                                            if (NIL != current_experiment_num) {
                                                                dictionary_utilities.dictionary_push(error_info, current_experiment_num, list(current_bug_20862_occurrences, current_experiment_line, file));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                            }
                        } finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return error_info;
            }
        }
    }

    public static final SubLObject kbq_answerable_trivial_queries_from_file(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queries = NIL;
                SubLTrampolineFile.checkType(filename, STRINGP);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(filename, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt166$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject stream_55 = stream;
                            {
                                SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols(kbq_query_run.kbq_cfasl_common_symbols());
                                    {
                                        SubLObject _prev_bind_0_56 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                                        try {
                                            $cfasl_input_guid_string_resource$.bind(get_new_cfasl_input_guid_string_resource(), thread);
                                            {
                                                SubLObject query_set_run = kbq_query_run.kbq_load_query_set_run_int(stream_55);
                                                {
                                                    SubLObject csome_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
                                                    SubLObject query_run = NIL;
                                                    for (query_run = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , query_run = csome_list_var.first()) {
                                                        if (NIL != kbq_answerable_trivial_query_runP(query_run)) {
                                                            queries = cons(kbq_query_run.kbq_query_run_query(query_run), queries);
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject done_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject query_run = kbq_query_run.kbq_load_query_run_int(stream_55);
                                                            if (query_run == $EOF) {
                                                                done_var = T;
                                                            }
                                                            if (NIL == done_var) {
                                                                query_run = kbq_query_run.kbq_nclean_query_run(query_run);
                                                                if (NIL != kbq_answerable_trivial_query_runP(query_run)) {
                                                                    queries = cons(kbq_query_run.kbq_query_run_query(query_run), queries);
                                                                }
                                                                done_var = NIL;
                                                            }
                                                        }
                                                    } 
                                                }
                                            }
                                        } finally {
                                            $cfasl_input_guid_string_resource$.rebind(_prev_bind_0_56, thread);
                                        }
                                    }
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
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
                return nreverse(queries);
            }
        }
    }

    public static final SubLObject kbq_answerable_trivial_query_runP(SubLObject query_run) {
        return makeBoolean((NIL != kbq_query_run.kbq_query_run_answerableP(query_run)) && (NIL == kbq_query_run.kbq_query_run_property_value(query_run, $PROOF_QUERY_PROPERTIES, UNPROVIDED)));
    }

    /**
     *
     *
     * @return integerp; the number of queries in QUERY-SET-RUN that have a numeric :answerability-time metric
     */
    public static final SubLObject kbq_query_set_run_answerability_time_count(SubLObject query_set_run) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                if (NIL != kbq_query_run_has_answerability_timeP(query_run)) {
                    count = add(count, ONE_INTEGER);
                }
            }
            return count;
        }
    }

    public static final SubLObject kbq_query_run_has_answerability_timeP(SubLObject query_run) {
        return numberp(kbq_query_run.kbq_query_run_property_value(query_run, $ANSWERABILITY_TIME, UNPROVIDED));
    }

    // deflexical
    private static final SubLSymbol $triq_clusterable_queries_filename$ = makeSymbol("*TRIQ-CLUSTERABLE-QUERIES-FILENAME*");

    public static final SubLObject triq_clusterable_queries() {
        return cfasl_utilities.cfasl_load($triq_clusterable_queries_filename$.getGlobalValue());
    }

    public static final SubLObject run_triq_clustering_experiment_4_n(SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject triq_4_clusters_n = nth(n, Sort.sort(cfasl_utilities.cfasl_load($str_alt271$_cyc_projects_inference_kct_param), symbol_function($sym96$_), symbol_function(CDR))).first();
                SubLObject filename = cconcatenate($str_alt272$triq_4_clusters_, string_utilities.str(n));
                SubLObject comment = cconcatenate($str_alt273$Standard_Inference_Query_Clusteri, new SubLObject[]{ format_nil.format_nil_a_no_copy(n), $str_alt238$__KB_queries_canonicalized_to_ele, format_nil.format_nil_a_no_copy(n), $str_alt274$_in_the_exhaustive_list_of_4_clus });
                canonicalize_kb_queries_wrt_clusters(triq_4_clusters_n);
                {
                    SubLObject _prev_bind_0 = $suspend_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        $suspend_type_checkingP$.bind(T, thread);
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                        agenda.halt_agenda(UNPROVIDED);
                        {
                            SubLObject filename_var = filename;
                            SubLObject full_filename = (NIL != filename_var) ? ((SubLObject) (kct_parameters_experiment_full_filename(filename_var, $kct_parameters_experiment_directory$.getGlobalValue()))) : NIL;
                            kbq_query_run.run_kbq_experiment_internal(list(new SubLObject[]{ $QUERY_SPEC_SET, bq_cons($$TheSet, append(triq_clusterable_queries(), NIL)), $FILENAME, full_filename, $ANALYSIS_FILENAME, NIL, $KEEPALIVE_FILENAME, NIL, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, NIL, $METRICS, basic_kct_parameters_query_metrics(), $OUTLIER_TIMEOUT, $int$35, $INCREMENTAL, T, $INCLUDE_RESULTS, NIL, $RANDOMIZE, NIL, $SKIP, ZERO_INTEGER, $COUNT, NIL, $IF_FILE_EXISTS, $AUGMENT_OR_RERUN_ERRORS }));
                        }
                    } finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_1, thread);
                        $suspend_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return n;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $testiq_clusterable_queries_filename$ = makeSymbol("*TESTIQ-CLUSTERABLE-QUERIES-FILENAME*");

    public static final SubLObject testiq_clusterable_queries() {
        return cfasl_utilities.cfasl_load($testiq_clusterable_queries_filename$.getGlobalValue());
    }

    public static final SubLObject run_testiq_clustering_experiment_4_15_a() {
        return run_testiq_clustering_experiment_4_15_int(ZERO_INTEGER, $int$1500, $str_alt279$testiq_4_clusters_15_a);
    }

    public static final SubLObject run_testiq_clustering_experiment_4_15_b() {
        return run_testiq_clustering_experiment_4_15_int($int$1500, NIL, $str_alt280$testiq_4_clusters_15_b);
    }

    public static final SubLObject run_testiq_clustering_experiment_4_15_int(SubLObject skip, SubLObject count, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject triq_4_clusters_15 = nth(FIFTEEN_INTEGER, Sort.sort(cfasl_utilities.cfasl_load($str_alt271$_cyc_projects_inference_kct_param), symbol_function($sym96$_), symbol_function(CDR))).first();
                SubLObject comment = $str_alt281$Test_Inference_Query_Clustering_E;
                canonicalize_kb_queries_wrt_clusters(triq_4_clusters_15);
                {
                    SubLObject _prev_bind_0 = $suspend_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = control_vars.$kbq_run_query_non_continuable_enabledP$.currentBinding(thread);
                    try {
                        $suspend_type_checkingP$.bind(T, thread);
                        control_vars.$kbq_run_query_non_continuable_enabledP$.bind(NIL, thread);
                        agenda.halt_agenda(UNPROVIDED);
                        {
                            SubLObject filename_var = filename;
                            SubLObject full_filename = (NIL != filename_var) ? ((SubLObject) (kct_parameters_experiment_full_filename(filename_var, $kct_parameters_experiment_directory$.getGlobalValue()))) : NIL;
                            kbq_query_run.run_kbq_experiment_internal(list(new SubLObject[]{ $QUERY_SPEC_SET, bq_cons($$TheSet, append(testiq_clusterable_queries(), NIL)), $FILENAME, full_filename, $ANALYSIS_FILENAME, NIL, $KEEPALIVE_FILENAME, NIL, $COMMENT, comment, $OVERRIDING_QUERY_PROPERTIES, NIL, $METRICS, basic_kct_parameters_query_metrics(), $OUTLIER_TIMEOUT, $int$35, $INCREMENTAL, T, $INCLUDE_RESULTS, NIL, $RANDOMIZE, NIL, $SKIP, skip, $COUNT, count, $IF_FILE_EXISTS, $AUGMENT_OR_RERUN_ERRORS }));
                        }
                    } finally {
                        control_vars.$kbq_run_query_non_continuable_enabledP$.rebind(_prev_bind_1, thread);
                        $suspend_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return FIFTEEN_INTEGER;
            }
        }
    }

    /**
     * Prints clusters that conform to my expectations about max transformation depth
     */
    public static final SubLObject print_reasonable_inference_parameter_clusters() {
        {
            SubLObject triq_4_clusters_data = Sort.sort(cfasl_utilities.cfasl_load($str_alt271$_cyc_projects_inference_kct_param), symbol_function($sym96$_), symbol_function(CDR));
            SubLObject list_var = NIL;
            SubLObject datum = NIL;
            SubLObject i = NIL;
            for (list_var = triq_4_clusters_data, datum = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , datum = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject clusters = datum.first();
                    SubLObject points = Mapping.mapcar(INFERENCE_PARAMETER_CLUSTER_CANONICAL_POINT, clusters);
                    if (((ZERO_INTEGER == nth(TEN_INTEGER, points.first())) && (ONE_INTEGER == nth(TEN_INTEGER, second(points)))) && (TWO_INTEGER == nth(TEN_INTEGER, third(points)))) {
                        print(i, UNPROVIDED);
                        format_nil.print_one_per_line(points, UNPROVIDED);
                        terpri(UNPROVIDED);
                    }
                }
            }
            return triq_4_clusters_data;
        }
    }

    // deflexical
    private static final SubLSymbol $triq_4_clusters_15_caching_state$ = makeSymbol("*TRIQ-4-CLUSTERS-15-CACHING-STATE*");

    public static final SubLObject clear_triq_4_clusters_15() {
        {
            SubLObject cs = $triq_4_clusters_15_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_triq_4_clusters_15() {
        return memoization_state.caching_state_remove_function_results_with_args($triq_4_clusters_15_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject triq_4_clusters_15_internal() {
        return nth(FIFTEEN_INTEGER, Sort.sort(cfasl_utilities.cfasl_load($str_alt271$_cyc_projects_inference_kct_param), symbol_function($sym96$_), symbol_function(CDR))).first();
    }

    public static final SubLObject triq_4_clusters_15() {
        {
            SubLObject caching_state = $triq_4_clusters_15_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(TRIQ_4_CLUSTERS_15, $sym284$_TRIQ_4_CLUSTERS_15_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(triq_4_clusters_15_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     * also depends on the verification-data
     */
    public static final SubLObject canonicalize_kb_queries_wrt_inference_modes(SubLObject clusters, SubLObject experiment_filename, SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject query_dict = assign_kb_queries_to_clusters(clusters);
                SubLObject baseline = load_kct_parameters_baseline_stripped();
                SubLObject experiment = load_kct_parameters_experiment(experiment_filename);
                SubLObject so_far = ZERO_INTEGER;
                SubLObject total = dictionary.dictionary_length(query_dict);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt209$Canonicalizing_KB_queries_wrt_clu);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(query_dict));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject cluster = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != forts.valid_fortP(query)) {
                                        if (!((NIL != nart_handles.nart_p(query)) && ($$SimpleQueryForFormulaFn == cycl_utilities.nat_functor(query)))) {
                                            if (NIL == isa.isa_in_any_mtP(query, $$LilliputQuery)) {
                                                if ((NIL == kbq_query_run.kbq_query_run_answerableP(kbq_query_run.kbq_lookup_query_run(baseline, query))) || (NIL != kbq_query_run.kbq_query_run_answerableP(kbq_query_run.kbq_lookup_query_run(experiment, query)))) {
                                                    if (NIL == kb_mapping_utilities.fpred_value_in_any_mt(query, $const287$inferenceModeParameterValueInSpec, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)) {
                                                        {
                                                            SubLObject inference_mode = nth(position(cluster, clusters, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED), inference_datastructures_enumerated_types.all_inference_modes());
                                                            canonicalize_kbq_wrt_inference_mode(query, inference_mode, do_itP);
                                                            count = add(count, ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    so_far = add(so_far, ONE_INTEGER);
                                    utilities_macros.note_percent_progress(so_far, total);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @return integerp; the net number of assertions fewer in the KB now
     */
    public static final SubLObject canonicalize_kbq_wrt_inference_mode(SubLObject query, SubLObject inference_mode, SubLObject do_itP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = MINUS_ONE_INTEGER;
                if (NIL != do_itP) {
                    ke.ke_assert(list($const287$inferenceModeParameterValueInSpec, list($$SubLQuoteFn, inference_mode), query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
                } else {
                    print(list($const287$inferenceModeParameterValueInSpec, list($$SubLQuoteFn, inference_mode), query), UNPROVIDED);
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(query, THREE_INTEGER, $const289$softwareParameterValueInSpecifica, NIL, $TRUE);
                            SubLObject gaf = NIL;
                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                if (NIL != assertions_high.asserted_assertionP(gaf)) {
                                    {
                                        SubLObject cycl_param = assertions_high.gaf_arg1(gaf);
                                        SubLObject subl_param = kb_query.kbq_keyword_from_inference_parameter(cycl_param);
                                        if (NIL != list_utilities.member_eqP(subl_param, unsubsumed_inference_parameters_to_optimize())) {
                                            if (NIL != do_itP) {
                                                if (NIL != ke.ke_unassert_assertion(gaf)) {
                                                    count = add(count, ONE_INTEGER);
                                                }
                                            } else {
                                                print(gaf, UNPROVIDED);
                                                count = add(count, ONE_INTEGER);
                                            }
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
                return count;
            }
        }
    }

    public static final SubLObject inference_parameter_cluster_query_properties(SubLObject cluster) {
        return inference_parameter_matrix_point_query_properties(inference_parameter_cluster_canonical_point(cluster));
    }

    public static final SubLObject inference_parameter_matrix_point_query_properties(SubLObject point) {
        {
            SubLObject v_properties = NIL;
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject i = NIL;
            for (list_var = point, value = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject parameter = nth(i, unsubsumed_inference_parameters_to_optimize());
                    v_properties = putf(v_properties, parameter, value);
                }
            }
            return v_properties;
        }
    }

    public static final SubLObject declare_kct_parameters_file() {
        declareFunction("basic_kct_parameters_query_metrics", "BASIC-KCT-PARAMETERS-QUERY-METRICS", 0, 0, false);
        declareFunction("standard_kct_parameters_query_metrics", "STANDARD-KCT-PARAMETERS-QUERY-METRICS", 0, 0, false);
        declareFunction("all_kct_parameters_query_metrics", "ALL-KCT-PARAMETERS-QUERY-METRICS", 0, 0, false);
        declareFunction("kct_parameters_experiment_full_filename", "KCT-PARAMETERS-EXPERIMENT-FULL-FILENAME", 1, 1, false);
        declareFunction("kct_parameters_data_full_filename", "KCT-PARAMETERS-DATA-FULL-FILENAME", 1, 1, false);
        declareMacro("run_kct_parameters_experiment", "RUN-KCT-PARAMETERS-EXPERIMENT");
        declareFunction("clear_load_kct_parameters_experiment", "CLEAR-LOAD-KCT-PARAMETERS-EXPERIMENT", 0, 0, false);
        declareFunction("remove_load_kct_parameters_experiment", "REMOVE-LOAD-KCT-PARAMETERS-EXPERIMENT", 1, 0, false);
        declareFunction("load_kct_parameters_experiment_internal", "LOAD-KCT-PARAMETERS-EXPERIMENT-INTERNAL", 1, 0, false);
        declareFunction("load_kct_parameters_experiment", "LOAD-KCT-PARAMETERS-EXPERIMENT", 1, 0, false);
        declareFunction("save_kct_parameters_experiment", "SAVE-KCT-PARAMETERS-EXPERIMENT", 2, 0, false);
        declareFunction("clear_kct_parameters_caches", "CLEAR-KCT-PARAMETERS-CACHES", 0, 0, false);
        declareFunction("kct_answerable_query_specs_set", "KCT-ANSWERABLE-QUERY-SPECS-SET", 0, 0, false);
        declareFunction("kct_answerable_test_specs", "KCT-ANSWERABLE-TEST-SPECS", 0, 0, false);
        declareFunction("kct_answerable_query_specs", "KCT-ANSWERABLE-QUERY-SPECS", 0, 0, false);
        declareFunction("ipr_training_queries", "IPR-TRAINING-QUERIES", 0, 0, false);
        declareFunction("kct_parameters_generate_answerable_vs_unanswerable_comparison", "KCT-PARAMETERS-GENERATE-ANSWERABLE-VS-UNANSWERABLE-COMPARISON", 2, 0, false);
        declareFunction("generate_all_kct_parameters_answerable_vs_unanswerable_comparisons", "GENERATE-ALL-KCT-PARAMETERS-ANSWERABLE-VS-UNANSWERABLE-COMPARISONS", 1, 0, false);
        declareFunction("kct_parameters_answerability_data", "KCT-PARAMETERS-ANSWERABILITY-DATA", 1, 1, false);
        declareFunction("kct_parameters_generate_answerability_prediction_graph", "KCT-PARAMETERS-GENERATE-ANSWERABILITY-PREDICTION-GRAPH", 3, 0, false);
        declareFunction("generate_all_kct_parameters_answerability_prediction_graphs", "GENERATE-ALL-KCT-PARAMETERS-ANSWERABILITY-PREDICTION-GRAPHS", 2, 0, false);
        declareFunction("kct_parameters_win_at_solitaire", "KCT-PARAMETERS-WIN-AT-SOLITAIRE", 2, 0, false);
        declareFunction("analyze_kct_parameters_experiment", "ANALYZE-KCT-PARAMETERS-EXPERIMENT", 1, 3, false);
        declareFunction("analyze_kct_parameters_experiments", "ANALYZE-KCT-PARAMETERS-EXPERIMENTS", 2, 5, false);
        declareFunction("kct_parameters_generate_sorted_property_comparison", "KCT-PARAMETERS-GENERATE-SORTED-PROPERTY-COMPARISON", 5, 3, false);
        declareFunction("kct_parameters_identify_probable_segfault", "KCT-PARAMETERS-IDENTIFY-PROBABLE-SEGFAULT", 1, 0, false);
        declareFunction("collect_inference_parameter_sets", "COLLECT-INFERENCE-PARAMETER-SETS", 0, 1, false);
        declareFunction("kct_answerable_varying_parameters", "KCT-ANSWERABLE-VARYING-PARAMETERS", 0, 0, false);
        declareFunction("print_varying_inference_parameters", "PRINT-VARYING-INFERENCE-PARAMETERS", 0, 0, false);
        declareFunction("inference_parameter_to_optimizeP", "INFERENCE-PARAMETER-TO-OPTIMIZE?", 1, 0, false);
        declareFunction("compute_inference_parameter_initial_clusters", "COMPUTE-INFERENCE-PARAMETER-INITIAL-CLUSTERS", 0, 1, false);
        declareFunction("print_inference_parameter_initial_clusters", "PRINT-INFERENCE-PARAMETER-INITIAL-CLUSTERS", 0, 1, false);
        declareFunction("load_kct_parameters_baseline", "LOAD-KCT-PARAMETERS-BASELINE", 0, 0, false);
        declareFunction("load_kct_parameters_baseline_stripped", "LOAD-KCT-PARAMETERS-BASELINE-STRIPPED", 0, 0, false);
        declareFunction("single_parameter_experiment_list", "SINGLE-PARAMETER-EXPERIMENT-LIST", 0, 0, false);
        declareFunction("single_parameter_experiment_prefix", "SINGLE-PARAMETER-EXPERIMENT-PREFIX", 0, 0, false);
        declareFunction("single_parameter_experiment_suffix", "SINGLE-PARAMETER-EXPERIMENT-SUFFIX", 0, 0, false);
        declareFunction("experiment_filename_for_parameter_value", "EXPERIMENT-FILENAME-FOR-PARAMETER-VALUE", 2, 0, false);
        declareMacro("do_inference_parameter_value_pairs", "DO-INFERENCE-PARAMETER-VALUE-PAIRS");
        declareFunction("strip_strengthened_properties_from_query_set_run_file", "STRIP-STRENGTHENED-PROPERTIES-FROM-QUERY-SET-RUN-FILE", 1, 1, false);
        declareFunction("strip_strengthened_properties_from_kct_single_parameter_experiments", "STRIP-STRENGTHENED-PROPERTIES-FROM-KCT-SINGLE-PARAMETER-EXPERIMENTS", 0, 0, false);
        declareFunction("kbq_query_set_run_metric_value", "KBQ-QUERY-SET-RUN-METRIC-VALUE", 2, 0, false);
        declareFunction("speedup_estimate_for_parameter_values", "SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES", 5, 0, false);
        declareFunction("clear_speedup_estimate_for_parameter_values_int", "CLEAR-SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT", 0, 0, false);
        declareFunction("remove_speedup_estimate_for_parameter_values_int", "REMOVE-SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT", 5, 0, false);
        declareFunction("speedup_estimate_for_parameter_values_int_internal", "SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT-INTERNAL", 5, 0, false);
        declareFunction("speedup_estimate_for_parameter_values_int", "SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT", 5, 0, false);
        declareFunction("completeness_estimate_1_for_parameter_values", "COMPLETENESS-ESTIMATE-1-FOR-PARAMETER-VALUES", 3, 0, false);
        declareFunction("answerability_counts_for_parameter_values", "ANSWERABILITY-COUNTS-FOR-PARAMETER-VALUES", 3, 0, false);
        declareFunction("print_efficiency_statistics", "PRINT-EFFICIENCY-STATISTICS", 0, 1, false);
        declareFunction("print_completeness_statistics", "PRINT-COMPLETENESS-STATISTICS", 0, 0, false);
        declareFunction("print_efficiency_and_completeness_statistics", "PRINT-EFFICIENCY-AND-COMPLETENESS-STATISTICS", 0, 1, false);
        declareFunction("print_efficiency_and_completeness_statistics_int", "PRINT-EFFICIENCY-AND-COMPLETENESS-STATISTICS-INT", 4, 0, false);
        declareFunction("inference_parameter_values_that_maybe_ought_to_be_skipped", "INFERENCE-PARAMETER-VALUES-THAT-MAYBE-OUGHT-TO-BE-SKIPPED", 0, 1, false);
        declareFunction("inference_parameters_to_hard_code", "INFERENCE-PARAMETERS-TO-HARD-CODE", 0, 0, false);
        declareFunction("inference_parameter_values_to_skip", "INFERENCE-PARAMETER-VALUES-TO-SKIP", 0, 0, false);
        declareFunction("unsubsumed_inference_parameters_to_optimize", "UNSUBSUMED-INFERENCE-PARAMETERS-TO-OPTIMIZE", 0, 0, false);
        declareFunction("unsubsumed_inference_parameter_to_optimizeP", "UNSUBSUMED-INFERENCE-PARAMETER-TO-OPTIMIZE?", 1, 0, false);
        declareFunction("single_parameter_unsubsumed_experiments", "SINGLE-PARAMETER-UNSUBSUMED-EXPERIMENTS", 0, 0, false);
        declareFunction("possibly_skip_inference_parameter_values", "POSSIBLY-SKIP-INFERENCE-PARAMETER-VALUES", 1, 0, false);
        declareFunction("compute_inference_parameter_unsubsumed_clusters", "COMPUTE-INFERENCE-PARAMETER-UNSUBSUMED-CLUSTERS", 0, 0, false);
        declareFunction("print_inference_parameter_unsubsumed_clusters", "PRINT-INFERENCE-PARAMETER-UNSUBSUMED-CLUSTERS", 0, 1, false);
        declareFunction("inference_parameter_matrix_point_p", "INFERENCE-PARAMETER-MATRIX-POINT-P", 1, 0, false);
        declareFunction("new_inference_parameter_matrix_point", "NEW-INFERENCE-PARAMETER-MATRIX-POINT", 1, 0, false);
        declareFunction("inference_parameter_matrix_point_value_for_dimension", "INFERENCE-PARAMETER-MATRIX-POINT-VALUE-FOR-DIMENSION", 2, 0, false);
        declareFunction("inference_parameter_matrix_point_replace_value", "INFERENCE-PARAMETER-MATRIX-POINT-REPLACE-VALUE", 3, 0, false);
        declareFunction("most_efficient_theoretical_point", "MOST-EFFICIENT-THEORETICAL-POINT", 0, 0, false);
        declareFunction("most_complete_theoretical_point", "MOST-COMPLETE-THEORETICAL-POINT", 0, 0, false);
        declareFunction("most_efficient_theoretical_point_given", "MOST-EFFICIENT-THEORETICAL-POINT-GIVEN", 2, 0, false);
        declareFunction("most_complete_theoretical_point_given", "MOST-COMPLETE-THEORETICAL-POINT-GIVEN", 2, 0, false);
        declareFunction("inference_parameter_matrix_point_more_complete_thanP", "INFERENCE-PARAMETER-MATRIX-POINT-MORE-COMPLETE-THAN?", 2, 0, false);
        declareFunction("inference_parameter_matrix_point_more_efficient_thanP", "INFERENCE-PARAMETER-MATRIX-POINT-MORE-EFFICIENT-THAN?", 2, 0, false);
        declareFunction("inference_parameter_matrix_region_p", "INFERENCE-PARAMETER-MATRIX-REGION-P", 1, 0, false);
        declareFunction("new_inference_parameter_matrix_region_under", "NEW-INFERENCE-PARAMETER-MATRIX-REGION-UNDER", 1, 0, false);
        declareFunction("new_inference_parameter_matrix_region_between", "NEW-INFERENCE-PARAMETER-MATRIX-REGION-BETWEEN", 2, 0, false);
        declareFunction("inference_parameter_matrix_point_in_regionP", "INFERENCE-PARAMETER-MATRIX-POINT-IN-REGION?", 2, 0, false);
        declareFunction("initialize_inference_parameter_matrix_1", "INITIALIZE-INFERENCE-PARAMETER-MATRIX-1", 0, 0, false);
        declareFunction("initialize_inference_parameter_matrix_2", "INITIALIZE-INFERENCE-PARAMETER-MATRIX-2", 0, 0, false);
        declareFunction("ensure_initialize_inference_parameter_matrix_initialized", "ENSURE-INITIALIZE-INFERENCE-PARAMETER-MATRIX-INITIALIZED", 0, 0, false);
        declareFunction("inference_parameter_matrix", "INFERENCE-PARAMETER-MATRIX", 0, 0, false);
        declareFunction("compute_inference_parameter_matrix_1", "COMPUTE-INFERENCE-PARAMETER-MATRIX-1", 0, 0, false);
        declareFunction("kbq_point", "KBQ-POINT", 1, 0, false);
        declareFunction("points_in_region", "POINTS-IN-REGION", 1, 0, false);
        declareFunction("number_of_points_in_region", "NUMBER-OF-POINTS-IN-REGION", 1, 0, false);
        declareFunction("number_of_points_in_region_under_most_complete_point_given", "NUMBER-OF-POINTS-IN-REGION-UNDER-MOST-COMPLETE-POINT-GIVEN", 2, 0, false);
        declareFunction("completeness_estimate_2_for_parameter_values", "COMPLETENESS-ESTIMATE-2-FOR-PARAMETER-VALUES", 3, 0, false);
        declareFunction("print_completeness_statistics_2", "PRINT-COMPLETENESS-STATISTICS-2", 0, 0, false);
        declareFunction("print_efficiency_and_completeness_statistics_2", "PRINT-EFFICIENCY-AND-COMPLETENESS-STATISTICS-2", 0, 1, false);
        declareFunction("print_efficiency_and_completeness_statistics_2_int", "PRINT-EFFICIENCY-AND-COMPLETENESS-STATISTICS-2-INT", 4, 0, false);
        declareFunction("compute_best_first_path_through_parameter_space_1", "COMPUTE-BEST-FIRST-PATH-THROUGH-PARAMETER-SPACE-1", 1, 1, false);
        declareFunction("compute_best_first_path_through_parameter_space_int", "COMPUTE-BEST-FIRST-PATH-THROUGH-PARAMETER-SPACE-INT", 2, 0, false);
        declareFunction("take_best_step_through_parameter_space_int", "TAKE-BEST-STEP-THROUGH-PARAMETER-SPACE-INT", 3, 0, false);
        declareFunction("best_step_through_parameter_space_int", "BEST-STEP-THROUGH-PARAMETER-SPACE-INT", 3, 0, false);
        declareFunction("goodness_for_parameter_values", "GOODNESS-FOR-PARAMETER-VALUES", 5, 0, false);
        declareFunction("completeness_efficiency_goodness", "COMPLETENESS-EFFICIENCY-GOODNESS", 3, 0, false);
        declareFunction("goodness_increase", "GOODNESS-INCREASE", 5, 0, false);
        declareFunction("most_efficient_point", "MOST-EFFICIENT-POINT", 0, 0, false);
        declareFunction("most_efficient_value_for_dimension", "MOST-EFFICIENT-VALUE-FOR-DIMENSION", 1, 0, false);
        declareFunction("most_complete_point", "MOST-COMPLETE-POINT", 0, 0, false);
        declareFunction("most_complete_value_for_dimension", "MOST-COMPLETE-VALUE-FOR-DIMENSION", 1, 0, false);
        declareFunction("next_most_complete_value_for_parameter", "NEXT-MOST-COMPLETE-VALUE-FOR-PARAMETER", 2, 0, false);
        declareFunction("kct_verify_most_efficient_inference_parameters", "KCT-VERIFY-MOST-EFFICIENT-INFERENCE-PARAMETERS", 1, 3, false);
        declareFunction("kct_verify_most_efficient_inference_parameters_for_query", "KCT-VERIFY-MOST-EFFICIENT-INFERENCE-PARAMETERS-FOR-QUERY", 1, 0, false);
        declareFunction("kct_verify_most_efficient_inference_parameters_int", "KCT-VERIFY-MOST-EFFICIENT-INFERENCE-PARAMETERS-INT", 4, 0, false);
        declareFunction("kct_verify_query_properties", "KCT-VERIFY-QUERY-PROPERTIES", 4, 0, false);
        declareFunction("pad_inference_properties", "PAD-INFERENCE-PROPERTIES", 2, 0, false);
        declareFunction("kct_merge_and_save_verification_data", "KCT-MERGE-AND-SAVE-VERIFICATION-DATA", 2, 0, false);
        declareFunction("kct_merge_verification_data", "KCT-MERGE-VERIFICATION-DATA", 1, 0, false);
        declareFunction("answerable_queries_neither_verified_or_unverified", "ANSWERABLE-QUERIES-NEITHER-VERIFIED-OR-UNVERIFIED", 0, 0, false);
        declareFunction("answerable_queries_neither_verified_or_unverified_int", "ANSWERABLE-QUERIES-NEITHER-VERIFIED-OR-UNVERIFIED-INT", 2, 0, false);
        declareFunction("verification_data_coverage", "VERIFICATION-DATA-COVERAGE", 0, 0, false);
        declareFunction("compute_best_first_path_through_parameter_space_2", "COMPUTE-BEST-FIRST-PATH-THROUGH-PARAMETER-SPACE-2", 1, 1, false);
        declareFunction("compute_inference_parameter_matrix_2", "COMPUTE-INFERENCE-PARAMETER-MATRIX-2", 0, 0, false);
        declareFunction("kbq_strengthened_point", "KBQ-STRENGTHENED-POINT", 2, 0, false);
        declareFunction("kct_load_strongest_parameters_dictionary", "KCT-LOAD-STRONGEST-PARAMETERS-DICTIONARY", 0, 0, false);
        declareFunction("kct_load_strongest_parameters_data", "KCT-LOAD-STRONGEST-PARAMETERS-DATA", 0, 0, false);
        declareFunction("completeness_estimate_3_for_point", "COMPLETENESS-ESTIMATE-3-FOR-POINT", 3, 0, false);
        declareFunction("completeness_estimate_3_for_points", "COMPLETENESS-ESTIMATE-3-FOR-POINTS", 2, 0, false);
        declareFunction("number_of_points_under", "NUMBER-OF-POINTS-UNDER", 1, 0, false);
        declareFunction("inference_parameter_matrix_point_replace_value_wrt_strategist", "INFERENCE-PARAMETER-MATRIX-POINT-REPLACE-VALUE-WRT-STRATEGIST", 3, 0, false);
        declareFunction("speedup_estimate_for_point", "SPEEDUP-ESTIMATE-FOR-POINT", 4, 0, false);
        declareFunction("speedup_estimate_for_points", "SPEEDUP-ESTIMATE-FOR-POINTS", 4, 0, false);
        declareFunction("inference_parameter_cluster_p", "INFERENCE-PARAMETER-CLUSTER-P", 1, 0, false);
        declareFunction("make_inference_parameter_cluster", "MAKE-INFERENCE-PARAMETER-CLUSTER", 2, 0, false);
        declareFunction("inference_parameter_cluster_region", "INFERENCE-PARAMETER-CLUSTER-REGION", 1, 0, false);
        declareFunction("inference_parameter_cluster_canonical_point", "INFERENCE-PARAMETER-CLUSTER-CANONICAL-POINT", 1, 0, false);
        declareFunction("inference_parameter_cluster_points", "INFERENCE-PARAMETER-CLUSTER-POINTS", 1, 0, false);
        declareFunction("inference_parameter_cluster_size", "INFERENCE-PARAMETER-CLUSTER-SIZE", 1, 0, false);
        declareFunction("inference_parameter_cluster_emptyP", "INFERENCE-PARAMETER-CLUSTER-EMPTY?", 1, 0, false);
        declareFunction("inference_parameter_matrix_point_in_clusterP", "INFERENCE-PARAMETER-MATRIX-POINT-IN-CLUSTER?", 2, 0, false);
        declareFunction("inference_parameter_cluster_more_efficient_point", "INFERENCE-PARAMETER-CLUSTER-MORE-EFFICIENT-POINT", 1, 0, false);
        declareFunction("inference_parameter_cluster_more_complete_point", "INFERENCE-PARAMETER-CLUSTER-MORE-COMPLETE-POINT", 1, 0, false);
        declareFunction("clear_inference_parameter_cluster_queries", "CLEAR-INFERENCE-PARAMETER-CLUSTER-QUERIES", 0, 0, false);
        declareFunction("remove_inference_parameter_cluster_queries", "REMOVE-INFERENCE-PARAMETER-CLUSTER-QUERIES", 1, 0, false);
        declareFunction("inference_parameter_cluster_queries_internal", "INFERENCE-PARAMETER-CLUSTER-QUERIES-INTERNAL", 1, 0, false);
        declareFunction("inference_parameter_cluster_queries", "INFERENCE-PARAMETER-CLUSTER-QUERIES", 1, 0, false);
        declareFunction("merge_inference_parameter_clusters", "MERGE-INFERENCE-PARAMETER-CLUSTERS", 2, 0, false);
        declareFunction("compute_inference_parameter_clusters_from_best_path", "COMPUTE-INFERENCE-PARAMETER-CLUSTERS-FROM-BEST-PATH", 1, 1, false);
        declareFunction("compute_inference_parameter_clusters_from_path", "COMPUTE-INFERENCE-PARAMETER-CLUSTERS-FROM-PATH", 1, 0, false);
        declareFunction("canonicalize_kb_queries_wrt_clusters", "CANONICALIZE-KB-QUERIES-WRT-CLUSTERS", 1, 0, false);
        declareFunction("assign_kb_queries_to_clusters", "ASSIGN-KB-QUERIES-TO-CLUSTERS", 1, 0, false);
        declareFunction("assign_answerable_kbq_to_cluster", "ASSIGN-ANSWERABLE-KBQ-TO-CLUSTER", 3, 0, false);
        declareFunction("assign_point_to_cluster", "ASSIGN-POINT-TO-CLUSTER", 2, 0, false);
        declareFunction("assign_unanswerable_kbq_to_cluster", "ASSIGN-UNANSWERABLE-KBQ-TO-CLUSTER", 2, 0, false);
        declareFunction("canonicalize_kbq_wrt_cluster", "CANONICALIZE-KBQ-WRT-CLUSTER", 2, 0, false);
        declareFunction("analyze_kct_parameters_cluster_experiment", "ANALYZE-KCT-PARAMETERS-CLUSTER-EXPERIMENT", 3, 4, false);
        declareFunction("kct_parameters_queries_to_throw_out", "KCT-PARAMETERS-QUERIES-TO-THROW-OUT", 1, 0, false);
        declareFunction("kct_parameters_surprisingly_unanswerable_halt_reasons", "KCT-PARAMETERS-SURPRISINGLY-UNANSWERABLE-HALT-REASONS", 1, 0, false);
        declareFunction("kct_parameters_surprisingly_unanswerable_queries", "KCT-PARAMETERS-SURPRISINGLY-UNANSWERABLE-QUERIES", 1, 0, false);
        declareFunction("kct_save_fixed_strongest_parameters_dictionary", "KCT-SAVE-FIXED-STRONGEST-PARAMETERS-DICTIONARY", 0, 0, false);
        declareFunction("kct_fix_strongest_parameters_dictionary", "KCT-FIX-STRONGEST-PARAMETERS-DICTIONARY", 0, 0, false);
        declareFunction("kct_fix_strongest_parameters_for_query", "KCT-FIX-STRONGEST-PARAMETERS-FOR-QUERY", 2, 0, false);
        declareFunction("compute_reduced_inference_parameter_clusters_from_path", "COMPUTE-REDUCED-INFERENCE-PARAMETER-CLUSTERS-FROM-PATH", 2, 1, false);
        declareFunction("reduce_inference_parameter_clusters", "REDUCE-INFERENCE-PARAMETER-CLUSTERS", 3, 0, false);
        declareFunction("make_best_cluster_merge", "MAKE-BEST-CLUSTER-MERGE", 4, 0, false);
        declareFunction("speedup_of_cluster_merge", "SPEEDUP-OF-CLUSTER-MERGE", 4, 0, false);
        declareFunction("canonicalize_kb_queries_wrt_strengthened_parameters", "CANONICALIZE-KB-QUERIES-WRT-STRENGTHENED-PARAMETERS", 0, 0, false);
        declareFunction("canonicalize_kbq_wrt_strengthened_parameters", "CANONICALIZE-KBQ-WRT-STRENGTHENED-PARAMETERS", 2, 0, false);
        declareFunction("compute_reduced_inference_parameter_clusters_from_path_7", "COMPUTE-REDUCED-INFERENCE-PARAMETER-CLUSTERS-FROM-PATH-7", 2, 1, false);
        declareFunction("reduce_inference_parameter_clusters_7", "REDUCE-INFERENCE-PARAMETER-CLUSTERS-7", 3, 0, false);
        declareFunction("multi_merge_inference_parameter_clusters", "MULTI-MERGE-INFERENCE-PARAMETER-CLUSTERS", 2, 0, false);
        declareFunction("multi_merge_inference_parameter_clusters_int", "MULTI-MERGE-INFERENCE-PARAMETER-CLUSTERS-INT", 2, 0, false);
        declareFunction("speedup_of_cluster_multi_merge", "SPEEDUP-OF-CLUSTER-MULTI-MERGE", 4, 0, false);
        declareFunction("speedup_of_cluster_multi_merge_int", "SPEEDUP-OF-CLUSTER-MULTI-MERGE-INT", 4, 0, false);
        declareFunction("run_kct_clustering_experiment_9_4_n", "RUN-KCT-CLUSTERING-EXPERIMENT-9-4-N", 1, 0, false);
        declareFunction("compute_and_save_runnable_standard_inference_queries", "COMPUTE-AND-SAVE-RUNNABLE-STANDARD-INFERENCE-QUERIES", 0, 1, false);
        declareFunction("compute_runnable_standard_inference_queries", "COMPUTE-RUNNABLE-STANDARD-INFERENCE-QUERIES", 0, 1, false);
        declareFunction("compute_standard_inference_queries", "COMPUTE-STANDARD-INFERENCE-QUERIES", 0, 1, false);
        declareFunction("clear_query_variable_cached", "CLEAR-QUERY-VARIABLE-CACHED", 0, 0, false);
        declareFunction("remove_query_variable_cached", "REMOVE-QUERY-VARIABLE-CACHED", 4, 0, false);
        declareFunction("query_variable_cached_internal", "QUERY-VARIABLE-CACHED-INTERNAL", 4, 0, false);
        declareFunction("query_variable_cached", "QUERY-VARIABLE-CACHED", 4, 0, false);
        declareFunction("query_has_non_standard_inference_query_functorP", "QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-FUNCTOR?", 1, 0, false);
        declareFunction("query_has_non_standard_inference_query_stringP", "QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-STRING?", 1, 0, false);
        declareFunction("query_has_non_standard_inference_query_termP", "QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-TERM?", 1, 0, false);
        declareFunction("non_standard_inference_query_termP", "NON-STANDARD-INFERENCE-QUERY-TERM?", 1, 0, false);
        declareFunction("training_inference_queries", "TRAINING-INFERENCE-QUERIES", 0, 0, false);
        declareFunction("test_inference_queries", "TEST-INFERENCE-QUERIES", 0, 0, false);
        declareFunction("training_or_test_inference_queries", "TRAINING-OR-TEST-INFERENCE-QUERIES", 1, 0, false);
        declareFunction("ensure_standard_inference_queries_initialized", "ENSURE-STANDARD-INFERENCE-QUERIES-INITIALIZED", 0, 0, false);
        declareFunction("standard_inference_queries", "STANDARD-INFERENCE-QUERIES", 0, 2, false);
        declareFunction("single_parameter_experiment_summary", "SINGLE-PARAMETER-EXPERIMENT-SUMMARY", 0, 3, false);
        declareFunction("single_parameter_experiment_summary_for_file", "SINGLE-PARAMETER-EXPERIMENT-SUMMARY-FOR-FILE", 2, 0, false);
        declareFunction("print_header_of_single_parameter_experiment_summary", "PRINT-HEADER-OF-SINGLE-PARAMETER-EXPERIMENT-SUMMARY", 0, 0, false);
        declareFunction("print_one_line_of_single_parameter_experiment_summary", "PRINT-ONE-LINE-OF-SINGLE-PARAMETER-EXPERIMENT-SUMMARY", 7, 0, false);
        declareFunction("single_parameter_experiment_error_summary", "SINGLE-PARAMETER-EXPERIMENT-ERROR-SUMMARY", 0, 0, false);
        declareFunction("kbq_answerable_trivial_queries_from_file", "KBQ-ANSWERABLE-TRIVIAL-QUERIES-FROM-FILE", 1, 0, false);
        declareFunction("kbq_answerable_trivial_query_runP", "KBQ-ANSWERABLE-TRIVIAL-QUERY-RUN?", 1, 0, false);
        declareFunction("kbq_query_set_run_answerability_time_count", "KBQ-QUERY-SET-RUN-ANSWERABILITY-TIME-COUNT", 1, 0, false);
        declareFunction("kbq_query_run_has_answerability_timeP", "KBQ-QUERY-RUN-HAS-ANSWERABILITY-TIME?", 1, 0, false);
        declareFunction("triq_clusterable_queries", "TRIQ-CLUSTERABLE-QUERIES", 0, 0, false);
        declareFunction("run_triq_clustering_experiment_4_n", "RUN-TRIQ-CLUSTERING-EXPERIMENT-4-N", 1, 0, false);
        declareFunction("testiq_clusterable_queries", "TESTIQ-CLUSTERABLE-QUERIES", 0, 0, false);
        declareFunction("run_testiq_clustering_experiment_4_15_a", "RUN-TESTIQ-CLUSTERING-EXPERIMENT-4-15-A", 0, 0, false);
        declareFunction("run_testiq_clustering_experiment_4_15_b", "RUN-TESTIQ-CLUSTERING-EXPERIMENT-4-15-B", 0, 0, false);
        declareFunction("run_testiq_clustering_experiment_4_15_int", "RUN-TESTIQ-CLUSTERING-EXPERIMENT-4-15-INT", 3, 0, false);
        declareFunction("print_reasonable_inference_parameter_clusters", "PRINT-REASONABLE-INFERENCE-PARAMETER-CLUSTERS", 0, 0, false);
        declareFunction("clear_triq_4_clusters_15", "CLEAR-TRIQ-4-CLUSTERS-15", 0, 0, false);
        declareFunction("remove_triq_4_clusters_15", "REMOVE-TRIQ-4-CLUSTERS-15", 0, 0, false);
        declareFunction("triq_4_clusters_15_internal", "TRIQ-4-CLUSTERS-15-INTERNAL", 0, 0, false);
        declareFunction("triq_4_clusters_15", "TRIQ-4-CLUSTERS-15", 0, 0, false);
        declareFunction("canonicalize_kb_queries_wrt_inference_modes", "CANONICALIZE-KB-QUERIES-WRT-INFERENCE-MODES", 2, 1, false);
        declareFunction("canonicalize_kbq_wrt_inference_mode", "CANONICALIZE-KBQ-WRT-INFERENCE-MODE", 3, 0, false);
        declareFunction("inference_parameter_cluster_query_properties", "INFERENCE-PARAMETER-CLUSTER-QUERY-PROPERTIES", 1, 0, false);
        declareFunction("inference_parameter_matrix_point_query_properties", "INFERENCE-PARAMETER-MATRIX-POINT-QUERY-PROPERTIES", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kct_parameters_file() {
        deflexical("*KCT-PARAMETERS-DIRECTORY*", $str_alt0$_cyc_projects_inference_kct_param);
        deflexical("*KCT-PARAMETERS-EXPERIMENT-DIRECTORY*", cconcatenate($kct_parameters_directory$.getGlobalValue(), $str_alt1$experiments_));
        deflexical("*KCT-PARAMETERS-LOG-DIRECTORY*", cconcatenate($kct_parameters_directory$.getGlobalValue(), $str_alt2$logs_));
        deflexical("*KCT-PARAMETERS-DATA-DIRECTORY*", cconcatenate($kct_parameters_directory$.getGlobalValue(), $str_alt3$data_));
        deflexical("*STANDARD-KCT-PARAMETERS-QUERY-METRICS*", $list_alt6);
        deflexical("*KCT-PARAMETERS-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue());
        deflexical("*LOAD-KCT-PARAMETERS-EXPERIMENT-CACHING-STATE*", NIL);
        deflexical("*PARAMETERS-TO-IGNORE*", $list_alt38);
        deflexical("*IPR-CORPUS*", $STANDARD_INFERENCE_QUERIES);
        defparameter("*INFERENCE-PARAMETERS-TO-OPTIMIZE*", $list_alt95);
        deflexical("*SINGLE-PARAMETER-EXPERIMENT-LIST*", $list_alt97);
        deflexical("*STANDARD-INFERENCE-QUERY-SINGLE-PARAMETER-EXPERIMENT-LIST*", $list_alt98);
        deflexical("*KCT-BASELINE-FILENAME*", $str_alt99$testiq_baseline_merged);
        deflexical("*KCT-BASELINE-STRIPPED-FILENAME*", $str_alt100$testiq_baseline_merged_stripped);
        deflexical("*KCT-ANALYSIS-METRICS*", cons($ANSWERABILITY_TIME, remove($TIME_TO_LAST_ANSWER, inference_datastructures_enumerated_types.all_arete_query_metrics(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        deflexical("*SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT-CACHING-STATE*", NIL);
        defparameter("*PARAMETER-VALUE-HARD-CODING-COMPLETENESS-THRESHOLD*", TEN_INTEGER);
        deflexical("*INFERENCE-PARAMETERS-TO-HARD-CODE*", $list_alt138);
        deflexical("*STANDARD-INFERENCE-QUERY-INFERENCE-PARAMETERS-TO-HARD-CODE*", $list_alt139);
        deflexical("*INFERENCE-PARAMETER-VALUES-TO-SKIP*", $list_alt140);
        deflexical("*STANDARD-INFERENCE-QUERY-INFERENCE-PARAMETER-VALUES-TO-SKIP*", NIL);
        deflexical("*UNSUBSUMED-INFERENCE-PARAMETERS-TO-OPTIMIZE*", set_difference($inference_parameters_to_optimize$.getDynamicValue(), $inference_parameters_to_hard_code$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*STANDARD-INFERENCE-QUERY-UNSUBSUMED-INFERENCE-PARAMETERS-TO-OPTIMIZE*", set_difference($inference_parameters_to_optimize$.getDynamicValue(), $standard_inference_query_inference_parameters_to_hard_code$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*INFERENCE-PARAMETER-MATRIX*", NIL != boundp($inference_parameter_matrix$) ? ((SubLObject) ($inference_parameter_matrix$.getGlobalValue())) : NIL);
        defparameter("*COMPUTE-INFERENCE-PARAMETER-MATRIX-USING-STRENGTHENED-PARAMETERS?*", NIL);
        deflexical("*KCT-STRONGEST-PARAMETERS-FILENAME*", $str_alt196$testiq_verification_data);
        deflexical("*INFERENCE-PARAMETER-CLUSTER-QUERIES-CACHING-STATE*", NIL);
        deflexical("*KCT-STRONGEST-PARAMETERS-FILENAME-2*", $str_alt223$verification_data_capped);
        deflexical("*REDUCED-INFERENCE-PARAMETER-CLUSTERS-FROM-PATH-7-DATA*", NIL);
        deflexical("*NON-STANDARD-INFERENCE-QUERY-QUERIES*", $list_alt243);
        deflexical("*NON-STANDARD-INFERENCE-QUERY-FUNCTORS*", $list_alt244);
        deflexical("*NON-STANDARD-INFERENCE-QUERY-STRINGS*", $list_alt245);
        deflexical("*NON-STANDARD-INFERENCE-QUERY-TERMS*", $list_alt246);
        deflexical("*NON-STANDARD-INFERENCE-QUERY-COLLECTIONS*", $list_alt247);
        deflexical("*RUNNABLE-STANDARD-INFERENCE-QUERIES-FILE*", $str_alt248$_cyc_projects_inference_kct_param);
        deflexical("*QUERY-VARIABLE-CACHED-CACHING-STATE*", NIL);
        deflexical("*STANDARD-INFERENCE-QUERIES*", NIL != boundp($standard_inference_queries$) ? ((SubLObject) ($standard_inference_queries$.getGlobalValue())) : NIL);
        deflexical("*TRIQ-CLUSTERABLE-QUERIES-FILENAME*", $str_alt270$_cyc_projects_inference_kct_param);
        deflexical("*TESTIQ-CLUSTERABLE-QUERIES-FILENAME*", $str_alt277$_cyc_projects_inference_kct_param);
        deflexical("*TRIQ-4-CLUSTERS-15-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kct_parameters_file() {
                memoization_state.note_globally_cached_function(LOAD_KCT_PARAMETERS_EXPERIMENT);
        utilities_macros.note_funcall_helper_function(KCT_PARAMETERS_IDENTIFY_PROBABLE_SEGFAULT);
        memoization_state.note_globally_cached_function(SPEEDUP_ESTIMATE_FOR_PARAMETER_VALUES_INT);
        subl_macro_promotions.declare_defglobal($inference_parameter_matrix$);
        utilities_macros.note_funcall_helper_function(ANSWERABLE_QUERIES_NEITHER_VERIFIED_OR_UNVERIFIED_INT);
        utilities_macros.note_funcall_helper_function(VERIFICATION_DATA_COVERAGE);
        memoization_state.note_globally_cached_function(INFERENCE_PARAMETER_CLUSTER_QUERIES);
        memoization_state.note_globally_cached_function(QUERY_VARIABLE_CACHED);
        subl_macro_promotions.declare_defglobal($standard_inference_queries$);
        memoization_state.note_globally_cached_function(TRIQ_4_CLUSTERS_15);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/");

    static private final SubLString $str_alt1$experiments_ = makeString("experiments/");

    static private final SubLString $str_alt2$logs_ = makeString("logs/");

    static private final SubLString $str_alt3$data_ = makeString("data/");

    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");

    private static final SubLSymbol $TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");

    static private final SubLList $list_alt6 = list(new SubLObject[]{ makeKeyword("ANSWER-COUNT"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("COMPLETE-TOTAL-TIME"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("TACTIC-COUNT"), makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"), makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"), makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES") });

    static private final SubLList $list_alt7 = list(makeKeyword("PROOF-QUERY-PROPERTIES"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("PROBLEM-QUERIES"), makeKeyword("TRANSFORMATION-RULE-BINDINGS-TO-CLOSED"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"), makeKeyword("TOP-LEVEL-REMOVAL-FANOUT"), makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS"));

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("QUERY-SPEC-SET"), makeSymbol("FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(QUOTE, list(makeSymbol("ALL-KCT-PARAMETERS-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(QUOTE, makeSymbol("*KCT-PARAMETERS-OUTLIER-TIMEOUT*"))), list(makeSymbol("INCREMENTAL"), T), list(makeSymbol("INCLUDE-RESULTS"), NIL), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("RANDOMIZE"), makeSymbol("COUNT"), list(makeSymbol("DIRECTORY"), list(QUOTE, makeSymbol("*KCT-PARAMETERS-EXPERIMENT-DIRECTORY*"))) });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), $SKIP, makeKeyword("RANDOMIZE"), makeKeyword("COUNT"), makeKeyword("DIRECTORY") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $QUERY_SPEC_SET = makeKeyword("QUERY-SPEC-SET");





    private static final SubLSymbol $OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");



    static private final SubLList $list_alt16 = list(makeSymbol("ALL-KCT-PARAMETERS-QUERY-METRICS"));



    public static final SubLSymbol $kct_parameters_outlier_timeout$ = makeSymbol("*KCT-PARAMETERS-OUTLIER-TIMEOUT*");













    public static final SubLSymbol $kct_parameters_experiment_directory$ = makeSymbol("*KCT-PARAMETERS-EXPERIMENT-DIRECTORY*");

    static private final SubLSymbol $sym26$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLSymbol $sym27$FULL_FILENAME = makeUninternedSymbol("FULL-FILENAME");





    private static final SubLSymbol KCT_PARAMETERS_EXPERIMENT_FULL_FILENAME = makeSymbol("KCT-PARAMETERS-EXPERIMENT-FULL-FILENAME");

    private static final SubLSymbol RUN_KBQ_EXPERIMENT = makeSymbol("RUN-KBQ-EXPERIMENT");

    private static final SubLSymbol $IF_FILE_EXISTS = makeKeyword("IF-FILE-EXISTS");

    private static final SubLSymbol $AUGMENT_OR_RERUN_ERRORS = makeKeyword("AUGMENT-OR-RERUN-ERRORS");

    private static final SubLSymbol LOAD_KCT_PARAMETERS_EXPERIMENT = makeSymbol("LOAD-KCT-PARAMETERS-EXPERIMENT");

    public static final SubLSymbol $load_kct_parameters_experiment_caching_state$ = makeSymbol("*LOAD-KCT-PARAMETERS-EXPERIMENT-CACHING-STATE*");

    public static final SubLSymbol $kw36$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt37 = list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?QUERY"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?KCT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?KCT"), makeSymbol("?QUERY")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?KCT"), constant_handles.reader_make_constant_shell(makeString("CommonSenseTest-Answerable"))))));

    static private final SubLList $list_alt38 = list(makeKeyword("MAX-TIME"), makeKeyword("MAX-NUMBER"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("CONDITIONAL-SENTENCE?"));

    public static final SubLObject $$CommonSenseTest_Answerable = constant_handles.reader_make_constant_shell(makeString("CommonSenseTest-Answerable"));

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $STANDARD_INFERENCE_QUERIES = makeKeyword("STANDARD-INFERENCE-QUERIES");

    private static final SubLSymbol $CST_ANSWERABLE = makeKeyword("CST-ANSWERABLE");

    static private final SubLString $str_alt43$unknown_corpus__s = makeString("unknown corpus ~s");

    public static final SubLSymbol $kw44$LOGSCALE_Y_ = makeKeyword("LOGSCALE-Y?");





    static private final SubLString $str_alt47$Answerable_vs__Unanswerable_ = makeString("Answerable vs. Unanswerable ");

    static private final SubLList $list_alt48 = list(makeSymbol("VALUE"), makeSymbol("EXPERIMENT"));



    static private final SubLString $str_alt50$Oracularly_Answerable_vs__Unanswe = makeString("Oracularly Answerable vs. Unanswerable ");

    static private final SubLString $str_alt51$Kct_Parameters_Training = makeString("Kct-Parameters Training");

    static private final SubLString $str_alt52$_0 = makeString(":0");

    private static final SubLSymbol BOUND_SYMBOL_P = makeSymbol("BOUND-SYMBOL-P");

    static private final SubLString $str_alt54$____Basic_analysis____ = makeString("~%~%Basic analysis: ~%");

    static private final SubLString $str_alt55$____Answerable____ = makeString("~%~%Answerable: ~%");

    static private final SubLString $str_alt56$____Unanswerable____ = makeString("~%~%Unanswerable: ~%");

    static private final SubLString $str_alt57$______of_queries_answerable_in__B = makeString("~%~%# of queries answerable in (BASELINE  BOTH  EXPERIMENT): ~%");

    static private final SubLString $str_alt58$Total___________s__s__s__ = makeString("Total:         ~s ~s ~s~%");

    static private final SubLString $str_alt59$____Key___BASELINE_VALUE__EXPERIM = makeString("~%~%Key: (BASELINE-VALUE  EXPERIMENT-VALUE  RATIO), times are expressed in seconds.~%");

    static private final SubLString $str_alt60$____Mutually_Answerable____ = makeString("~%~%Mutually Answerable: ~%");



    static private final SubLString $str_alt62$Mutually_Answerable_ = makeString("Mutually Answerable ");



    static private final SubLString $str_alt64$__ = makeString(": ");

    static private final SubLString $str_alt65$_vs__ = makeString(" vs. ");

    static private final SubLString $str_alt66$_n = makeString("\\n");



    static private final SubLString $$$Sorted_Queries = makeString("Sorted Queries");

    private static final SubLSymbol $BASELINE_KEY_LABEL = makeKeyword("BASELINE-KEY-LABEL");

    private static final SubLSymbol $EXPERIMENT_KEY_LABEL = makeKeyword("EXPERIMENT-KEY-LABEL");

    static private final SubLList $list_alt71 = list(makeKeyword("KEY-LOCATION"), list(makeInteger(212), makeInteger(100)));

    private static final SubLSymbol KCT_PARAMETERS_IDENTIFY_PROBABLE_SEGFAULT = makeSymbol("KCT-PARAMETERS-IDENTIFY-PROBABLE-SEGFAULT");



    public static final SubLObject $$CommonSenseTest = constant_handles.reader_make_constant_shell(makeString("CommonSenseTest"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));











    static private final SubLString $str_alt81$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt86$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLSymbol $sym87$TERM__ = makeSymbol("TERM-<");

    static private final SubLString $str_alt88$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt89 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt90$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt92$Singleton__a_Count__a__ = makeString("Singleton ~a Count ~a~%");

    static private final SubLString $str_alt93$Varying__a_Count__a__ = makeString("Varying ~a Count ~a~%");

    static private final SubLString $str_alt94$_a____a__ = makeString("~a : ~a~%");

    static private final SubLList $list_alt95 = list(new SubLObject[]{ makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("NEW-TERMS-ALLOWED?") });

    static private final SubLSymbol $sym96$_ = makeSymbol(">");

    static private final SubLList $list_alt97 = list(new SubLObject[]{ list(makeKeyword("NEW-TERMS-ALLOWED?"), NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), T), list(makeKeyword("MAX-PROOF-DEPTH"), ONE_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), TWO_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), THREE_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), FOUR_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), SIX_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), EIGHT_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), TEN_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), NIL), list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL), list(makeKeyword("TRANSFORMATION-ALLOWED?"), T), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), THREE_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(200)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(200000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY")), list(makeKeyword("MAX-PROBLEM-COUNT"), TEN_INTEGER), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(1000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(10000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(1000000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MINIMAL")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("ARG-TYPE")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("ALL")), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), $NONE), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL")), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), NIL), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(50)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(2000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(20000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY")) });

    static private final SubLList $list_alt98 = list(new SubLObject[]{ list(makeKeyword("NEW-TERMS-ALLOWED?"), NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), T), list(makeKeyword("MAX-PROOF-DEPTH"), ONE_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), TWO_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), THREE_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), FOUR_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), SIX_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), EIGHT_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), TEN_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER), list(makeKeyword("MAX-PROOF-DEPTH"), NIL), list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL), list(makeKeyword("TRANSFORMATION-ALLOWED?"), T), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), THREE_INTEGER), list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(200)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(200000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(2000000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000)), list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY")), list(makeKeyword("MAX-PROBLEM-COUNT"), TEN_INTEGER), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(1000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(10000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(1000000)), list(makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY")), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), $NONE), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("FOCUSED")), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL")), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), NIL), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), ZERO_INTEGER), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(2000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(20000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200000)), list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY")) });

    static private final SubLString $str_alt99$testiq_baseline_merged = makeString("testiq-baseline-merged");

    static private final SubLString $str_alt100$testiq_baseline_merged_stripped = makeString("testiq-baseline-merged-stripped");

    static private final SubLString $str_alt101$unexpected_corpus__s = makeString("unexpected corpus ~s");

    static private final SubLString $str_alt102$experiment_ = makeString("experiment-");

    static private final SubLString $str_alt103$triq_experiment_ = makeString("triq-experiment-");

    static private final SubLString $str_alt104$_stripped = makeString("-stripped");

    static private final SubLString $str_alt105$ = makeString("");

    static private final SubLList $list_alt106 = list(list(makeSymbol("PARAM"), makeSymbol("PREV-VALUE"), makeSymbol("VALUE"), makeSymbol("&KEY"), makeSymbol("BACKWARD"), makeSymbol("SKIP-SUBSUMED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt107 = list(makeKeyword("BACKWARD"), makeKeyword("SKIP-SUBSUMED"));



    private static final SubLSymbol $SKIP_SUBSUMED = makeKeyword("SKIP-SUBSUMED");

    static private final SubLSymbol $sym110$PREV_PARAM = makeUninternedSymbol("PREV-PARAM");

    static private final SubLSymbol $sym111$PAIR = makeUninternedSymbol("PAIR");

    static private final SubLSymbol $sym112$PARAM_LIST = makeUninternedSymbol("PARAM-LIST");



    static private final SubLList $list_alt114 = list(list(makeSymbol("SINGLE-PARAMETER-UNSUBSUMED-EXPERIMENTS")), list(makeSymbol("SINGLE-PARAMETER-EXPERIMENT-LIST")));













    static private final SubLString $str_alt121$Expected_a__a_file__got__s = makeString("Expected a ~a file, got ~s");

    static private final SubLList $list_alt122 = list(makeKeyword("PROOF-QUERY-PROPERTIES"), makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES"), makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES"));

    private static final SubLSymbol FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");

    static private final SubLString $$$cdotimes = makeString("cdotimes");

    static private final SubLString $str_alt125$_cfasl = makeString(".cfasl");



    private static final SubLSymbol SPEEDUP_ESTIMATE_FOR_PARAMETER_VALUES_INT = makeSymbol("SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT");



    public static final SubLSymbol $speedup_estimate_for_parameter_values_int_caching_state$ = makeSymbol("*SPEEDUP-ESTIMATE-FOR-PARAMETER-VALUES-INT-CACHING-STATE*");

    private static final SubLSymbol $MEDIAN_ANSWERABILITY_TIME = makeKeyword("MEDIAN-ANSWERABILITY-TIME");

    static private final SubLString $str_alt131$Parameter__Value1____Value2__Spee = makeString("Parameter, Value1 -> Value2, Speedup~%");

    static private final SubLString $str_alt132$Parameter__Value1____Value2__Comp = makeString("Parameter, Value1 -> Value2, Completeness Gain~%");

    static private final SubLString $str_alt133$Parameter__Value1____Value2__Spee = makeString("Parameter, Value1 -> Value2, Speedup, Completeness Gain~%");

    static private final SubLList $list_alt134 = list(makeSymbol("PARAM"), makeSymbol("VALUE"));

    static private final SubLString $str_alt135$_s__s_____s__ = makeString("~s ~s -> ~s: ");

    static private final SubLString $str_alt136$_s_ = makeString("~s ");

    static private final SubLList $list_alt137 = list(makeSymbol("PARAMETER"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt138 = list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"));

    static private final SubLList $list_alt139 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"));

    static private final SubLList $list_alt140 = list(list(makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(50), makeInteger(200)));





    private static final SubLSymbol FIRST_2 = makeSymbol("FIRST-2");

    static private final SubLList $list_alt144 = list(makeSymbol("PARAM"), makeSymbol("SKIP-VALUE"), makeSymbol("GOOD-VALUE"));

    static private final SubLSymbol $sym145$INFERENCE_PARAMETER_MATRIX_POINT_MORE_EFFICIENT_THAN_ = makeSymbol("INFERENCE-PARAMETER-MATRIX-POINT-MORE-EFFICIENT-THAN?");

    static private final SubLSymbol $sym146$UNSUBSUMED_INFERENCE_PARAMETER_TO_OPTIMIZE_ = makeSymbol("UNSUBSUMED-INFERENCE-PARAMETER-TO-OPTIMIZE?");

    private static final SubLSymbol $REGION_UNDER = makeKeyword("REGION-UNDER");

    private static final SubLSymbol $REGION_BETWEEN = makeKeyword("REGION-BETWEEN");

    private static final SubLSymbol INFERENCE_PARAMETER_MATRIX_POINT_P = makeSymbol("INFERENCE-PARAMETER-MATRIX-POINT-P");

    private static final SubLSymbol INFERENCE_PARAMETER_MATRIX_REGION_P = makeSymbol("INFERENCE-PARAMETER-MATRIX-REGION-P");

    static private final SubLString $str_alt151$region_of_unexpected_type___s = makeString("region of unexpected type: ~s");

    public static final SubLSymbol $inference_parameter_matrix$ = makeSymbol("*INFERENCE-PARAMETER-MATRIX*");

    static private final SubLString $str_alt153$This_computation_assumes_that_set = makeString("This computation assumes that setting ~s to ~s is more complete than ~s, but it's not.");

    static private final SubLString $str_alt154$Parameter__Value1____Value2__Comp = makeString("Parameter, Value1 -> Value2, Completeness Gain 2~%");

    static private final SubLString $str_alt155$Parameter__Value1____Value2__Spee = makeString("Parameter, Value1 -> Value2, Speedup, Completeness Gain 2~%");

    private static final SubLSymbol $FIRST_TIME_THROUGH = makeKeyword("FIRST-TIME-THROUGH");

    static private final SubLString $str_alt157$_s_____s__ = makeString("~s -> ~s~%");

    static private final SubLString $str_alt158$g__s___s___s_____s = makeString("g(~s, ~s, ~s) = ~s");

    static private final SubLString $str_alt159$____ = makeString("~%~%");

    static private final SubLList $list_alt160 = list(makeSymbol("NEXT-PARAM"), makeSymbol("NEXT-VALUE"));

    static private final SubLString $str_alt161$Expected__s_to_be_the_most_comple = makeString("Expected ~s to be the most complete value for ~s");

    private static final SubLSymbol $NO_MORE_COMPLETE_VALUE = makeKeyword("NO-MORE-COMPLETE-VALUE");

    static private final SubLString $str_alt163$__run_starting_at__A__ = makeString("~%run starting at ~A~%");





    static private final SubLString $str_alt166$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLInteger $int$2599 = makeInteger(2599);

    private static final SubLSymbol $PROOF_QUERY_PROPERTIES = makeKeyword("PROOF-QUERY-PROPERTIES");

    static private final SubLString $str_alt169$_ = makeString("*");

    static private final SubLString $str_alt170$___a__a__a__a__ = makeString("~&~a ~a ~a ~a~%");

    static private final SubLString $str_alt171$___s_had_answers_but_no_proof_que = makeString("~&~s had answers but no proof-query-properties");



    static private final SubLString $str_alt173$__run_ended_at__A = makeString("~%run ended at ~A");

    static private final SubLString $str_alt174$__Verified_Query_count__a = makeString("~%Verified Query count ~a");

    static private final SubLString $str_alt175$__Unverified_Query_count__a__ = makeString("~%Unverified Query count ~a~%");

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    static private final SubLString $str_alt177$Relaxing__max_problem_count_____ = makeString("Relaxing :max-problem-count...~%");





    static private final SubLString $str_alt180$Relaxing__max_proof_depth_____ = makeString("Relaxing :max-proof-depth...~%");

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    static private final SubLString $str_alt182$Relaxing__productivity_limit_____ = makeString("Relaxing :productivity-limit...~%");



    static private final SubLString $str_alt184$Relaxing__negation_by_failure____ = makeString("Relaxing :negation-by-failure?...~%");

    public static final SubLSymbol $kw185$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    static private final SubLString $str_alt186$Don_t_know_what_else_to_relax___ = makeString("Don't know what else to relax!~%");







    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    static private final SubLList $list_alt191 = list(makeSymbol("VERIFIED"), makeSymbol("UNVERIFIED"), makeSymbol("HALT-DICT"));

    private static final SubLSymbol KBQ_QUERY_RUN_QUERY = makeSymbol("KBQ-QUERY-RUN-QUERY");

    static private final SubLSymbol $sym193$KBQ_QUERY_RUN_TAUTOLOGY_ = makeSymbol("KBQ-QUERY-RUN-TAUTOLOGY?");

    private static final SubLSymbol ANSWERABLE_QUERIES_NEITHER_VERIFIED_OR_UNVERIFIED_INT = makeSymbol("ANSWERABLE-QUERIES-NEITHER-VERIFIED-OR-UNVERIFIED-INT");

    private static final SubLSymbol VERIFICATION_DATA_COVERAGE = makeSymbol("VERIFICATION-DATA-COVERAGE");

    static private final SubLString $str_alt196$testiq_verification_data = makeString("testiq-verification-data");

    static private final SubLList $list_alt197 = list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    public static final SubLSymbol $kw199$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    static private final SubLList $list_alt201 = list(makeSymbol("REGION"), makeSymbol("POINT"));

    private static final SubLSymbol INFERENCE_PARAMETER_CLUSTER_P = makeSymbol("INFERENCE-PARAMETER-CLUSTER-P");

    static private final SubLList $list_alt203 = list(makeSymbol("REGION-BETWEEN"), makeSymbol("MORE-EFFICIENT-POINT"), makeSymbol("DONT-CARE-POINT"));

    static private final SubLString $str_alt204$Unexpected_cluster_region__s = makeString("Unexpected cluster region ~s");

    private static final SubLSymbol INFERENCE_PARAMETER_CLUSTER_QUERIES = makeSymbol("INFERENCE-PARAMETER-CLUSTER-QUERIES");

    public static final SubLSymbol $inference_parameter_cluster_queries_caching_state$ = makeSymbol("*INFERENCE-PARAMETER-CLUSTER-QUERIES-CACHING-STATE*");

    static private final SubLList $list_alt207 = list(makeSymbol("REGION-BETWEEN"), makeSymbol("MORE-EFFICIENT-POINT"), makeSymbol("MERGE-POINT"));

    static private final SubLList $list_alt208 = list(makeSymbol("REGION-BETWEEN"), makeSymbol("MERGE-POINT"), makeSymbol("MORE-COMPLETE-POINT"));

    static private final SubLString $str_alt209$Canonicalizing_KB_queries_wrt_clu = makeString("Canonicalizing KB queries wrt clusters");

    static private final SubLString $str_alt210$Assigning_answerable_KB_queries_t = makeString("Assigning answerable KB queries to clusters");

    static private final SubLString $str_alt211$Assigning_unanswerable_KB_queries = makeString("Assigning unanswerable KB queries to clusters");

    static private final SubLString $str_alt212$Could_not_assign__s_to_any_cluste = makeString("Could not assign ~s to any cluster");

    public static final SubLObject $$TestVocabularyMt = constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt"));

    static private final SubLString $str_alt214$Summary___ = makeString("Summary:~%");



    static private final SubLString $str_alt216$_s_clusters___s__completeness_los = makeString("~s clusters, ~s% completeness loss, ~s% slowdown = ~s% goodness ([[Inference Parameter Alpha|&alpha;]] = ~s)~%");

    static private final SubLString $str_alt217$Raw_analysis___ = makeString("Raw analysis:~%");

    static private final SubLString $str_alt218$__Analysis___ = makeString("~%Analysis:~%");

    static private final SubLString $str_alt219$__Mutually_Answerable___ = makeString("~%Mutually Answerable:~%");

    static private final SubLString $$$baseline = makeString("baseline");

    static private final SubLList $list_alt221 = list(makeKeyword("MAX-TIME"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("OUTLIER-ABORT"));

    private static final SubLSymbol KBQ_QUERY_RUN_HALT_REASON = makeSymbol("KBQ-QUERY-RUN-HALT-REASON");

    static private final SubLString $str_alt223$verification_data_capped = makeString("verification-data-capped");

    static private final SubLString $str_alt224$old_value___s__KB_value___s__ = makeString("old value: ~s  KB value: ~s~%");

    static private final SubLString $str_alt225$Unstrengthening__s_from__s_to__s_ = makeString("Unstrengthening ~s from ~s to ~s~%");

    static private final SubLSymbol $sym226$INFERENCE_PARAMETER_CLUSTER_EMPTY_ = makeSymbol("INFERENCE-PARAMETER-CLUSTER-EMPTY?");

    static private final SubLSymbol $sym227$_ = makeSymbol("+");

    private static final SubLSymbol INFERENCE_PARAMETER_CLUSTER_SIZE = makeSymbol("INFERENCE-PARAMETER-CLUSTER-SIZE");

    static private final SubLSymbol $sym229$_ = makeSymbol("*");

    static private final SubLString $str_alt230$Reducing_to__s_clusters_yields_a_ = makeString("Reducing to ~s clusters yields a ~s speedup, for a total speedup of ~s~%");

    static private final SubLString $str_alt231$Canonicalizing_KB_queries_wrt_str = makeString("Canonicalizing KB queries wrt strengthened parameters");

    static private final SubLString $str_alt232$Evaluating_all_possible_cluster_r = makeString("Evaluating all possible cluster reductions");

    static private final SubLString $str_alt233$__New_best_so_far___sx_speedup___ = makeString("~%New best so far (~sx speedup):~%");

    static private final SubLString $str_alt234$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/experiments/exp-8-4-clusters-data.cfasl");



    static private final SubLString $str_alt236$exp_9_ = makeString("exp-9-");

    static private final SubLString $str_alt237$Clustering_Experiment_9_ = makeString("Clustering Experiment 9-");

    static private final SubLString $str_alt238$__KB_queries_canonicalized_to_ele = makeString(": KB queries canonicalized to element #");

    static private final SubLString $str_alt239$_in_the_exhaustive_list_of_4_clus = makeString(" in the exhaustive list of 4-cluster possibilities, alpha = 10, System 1.10464 KB 873.");

    static private final SubLString $str_alt240$_s_already_exists = makeString("~s already exists");





    static private final SubLList $list_alt243 = list(list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?KCT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?KCT"), makeKeyword("Q")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?KCT"), constant_handles.reader_make_constant_shell(makeString("SKSIContentTest"))))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?KCT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?KCT"), makeKeyword("Q")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?KCT"), constant_handles.reader_make_constant_shell(makeString("NLKBContentTest"))))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?KCT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?KCT"), makeKeyword("Q")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?KCT"), constant_handles.reader_make_constant_shell(makeString("TextualEntailmentKBContentTest"))))), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TEP"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?KCT"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("contentTestForTEP")), makeSymbol("?TEP"), makeSymbol("?KCT")), list(constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")), makeSymbol("?KCT"), makeKeyword("Q"))))));

    static private final SubLList $list_alt244 = list(constant_handles.reader_make_constant_shell(makeString("BuilderQueryForMeaningSentenceOfSKSFn")), constant_handles.reader_make_constant_shell(makeString("BuilderQueryForLogicalFieldTypeOfSKSFn")), constant_handles.reader_make_constant_shell(makeString("FactSheetBuilderQueryFn")), constant_handles.reader_make_constant_shell(makeString("LiteralBuilderQueryFn")), constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsBuilderQueryFn")), constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsCountBuilderQueryFn")));

    static private final SubLList $list_alt245 = list(makeString("NPPT-"), makeString("Builder"), makeString("parse"));

    static private final SubLList $list_alt246 = list(makeSymbol("GENERATE-TEXT-W/SENTENTIAL-FORCE"), constant_handles.reader_make_constant_shell(makeString("textSupportsConclusion")), constant_handles.reader_make_constant_shell(makeString("supportsResponseToOf")), constant_handles.reader_make_constant_shell(makeString("TEPSentenceContentFromStringFn")), constant_handles.reader_make_constant_shell(makeString("TEPQueryContentFromStringFn")));

    static private final SubLList $list_alt247 = list(constant_handles.reader_make_constant_shell(makeString("NLQuery")), constant_handles.reader_make_constant_shell(makeString("SKSIQuery")), constant_handles.reader_make_constant_shell(makeString("BuilderQuery")));

    static private final SubLString $str_alt248$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/data/runnable-standard-inference-queries.cfasl");

    static private final SubLString $str_alt249$This_should_only_be_run_once__to_ = makeString("This should only be run once, to generate the corpus.");

    static private final SubLSymbol $sym250$KBQ_RUNNABLE_ = makeSymbol("KBQ-RUNNABLE?");

    public static final SubLObject $$CycLQuerySpecification = constant_handles.reader_make_constant_shell(makeString("CycLQuerySpecification"));



    static private final SubLList $list_alt253 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    static private final SubLSymbol $sym254$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_FUNCTOR_ = makeSymbol("QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-FUNCTOR?");

    static private final SubLSymbol $sym255$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_STRING_ = makeSymbol("QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-STRING?");

    static private final SubLSymbol $sym256$QUERY_HAS_NON_STANDARD_INFERENCE_QUERY_TERM_ = makeSymbol("QUERY-HAS-NON-STANDARD-INFERENCE-QUERY-TERM?");

    private static final SubLSymbol QUERY_VARIABLE_CACHED = makeSymbol("QUERY-VARIABLE-CACHED");

    public static final SubLSymbol $query_variable_cached_caching_state$ = makeSymbol("*QUERY-VARIABLE-CACHED-CACHING-STATE*");

    private static final SubLSymbol CLEAR_QUERY_VARIABLE_CACHED = makeSymbol("CLEAR-QUERY-VARIABLE-CACHED");

    public static final SubLObject $$TestQueryFn = constant_handles.reader_make_constant_shell(makeString("TestQueryFn"));

    static private final SubLSymbol $sym261$NON_STANDARD_INFERENCE_QUERY_TERM_ = makeSymbol("NON-STANDARD-INFERENCE-QUERY-TERM?");

    public static final SubLSymbol $standard_inference_queries$ = makeSymbol("*STANDARD-INFERENCE-QUERIES*");

    static private final SubLString $str_alt263$Experiment______of_erroring__lump = makeString("Experiment #, # of erroring (lumpy) queries, # of queries (w/metric, answerable), median answerability time, parameter, value~%");

    static private final SubLString $str_alt264$_____2D_______________4D___2D____ = makeString("    ~2D:             ~4D (~2D)                        ~4D (~4D, ~4D)                      ~6D           ~a ~a~%");



    static private final SubLString $$$Analyzing_logs = makeString("Analyzing logs");

    static private final SubLString $$$trace = makeString("trace");

    static private final SubLString $str_alt268$Starting_Experiment_Run_ = makeString("Starting Experiment Run#");

    static private final SubLString $$$Unable_to_compute_any_metrics = makeString("Unable to compute any metrics");

    static private final SubLString $str_alt270$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/data/clusterable-queries.cfasl");

    static private final SubLString $str_alt271$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/data/triq-4-clusters-data.cfasl");

    static private final SubLString $str_alt272$triq_4_clusters_ = makeString("triq-4-clusters-");

    static private final SubLString $str_alt273$Standard_Inference_Query_Clusteri = makeString("Standard Inference Query Clustering Experiment 1-4-");

    static private final SubLString $str_alt274$_in_the_exhaustive_list_of_4_clus = makeString(" in the exhaustive list of 4-cluster possibilities, alpha = 10, System 1.10709 KB 876.");

    public static final SubLObject $$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));

    public static final SubLInteger $int$35 = makeInteger(35);

    static private final SubLString $str_alt277$_cyc_projects_inference_kct_param = makeString("/cyc/projects/inference/kct-parameters/data/testiq-clusterable-queries.cfasl");

    public static final SubLInteger $int$1500 = makeInteger(1500);

    static private final SubLString $str_alt279$testiq_4_clusters_15_a = makeString("testiq-4-clusters-15-a");

    static private final SubLString $str_alt280$testiq_4_clusters_15_b = makeString("testiq-4-clusters-15-b");

    static private final SubLString $str_alt281$Test_Inference_Query_Clustering_E = makeString("Test Inference Query Clustering Experiment 1-4-15: KB queries canonicalized to element #15 in the exhaustive list of 4-cluster possibilities, alpha = 10, System 1.10709 KB 876.");

    private static final SubLSymbol INFERENCE_PARAMETER_CLUSTER_CANONICAL_POINT = makeSymbol("INFERENCE-PARAMETER-CLUSTER-CANONICAL-POINT");

    private static final SubLSymbol TRIQ_4_CLUSTERS_15 = makeSymbol("TRIQ-4-CLUSTERS-15");

    static private final SubLSymbol $sym284$_TRIQ_4_CLUSTERS_15_CACHING_STATE_ = makeSymbol("*TRIQ-4-CLUSTERS-15-CACHING-STATE*");

    public static final SubLObject $$SimpleQueryForFormulaFn = constant_handles.reader_make_constant_shell(makeString("SimpleQueryForFormulaFn"));

    public static final SubLObject $$LilliputQuery = constant_handles.reader_make_constant_shell(makeString("LilliputQuery"));

    public static final SubLObject $const287$inferenceModeParameterValueInSpec = constant_handles.reader_make_constant_shell(makeString("inferenceModeParameterValueInSpecification"));

    public static final SubLObject $$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));

    public static final SubLObject $const289$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));



    // // Initializers
    @Override
    public void declareFunctions() {
        declare_kct_parameters_file();
    }

    @Override
    public void initializeVariables() {
        init_kct_parameters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kct_parameters_file();
    }
}

