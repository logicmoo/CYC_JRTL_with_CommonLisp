/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.gt_modules;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.partitions;
import com.cyc.cycjava.cycl.search;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sunit_macros;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.wff_utilities;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TM-IO
 *  source file: /cyc/top/cycl/thesaurus/tm-io.lisp
 *  created:     2019/07/03 17:38:29
 */
public final class tm_io extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tm_io() {
    }

    public static final SubLFile me = new tm_io();




    public static final SubLObject tm_io_item_p(SubLObject v_object) {
        return consp(v_object);
    }

    // defparameter
    private static final SubLSymbol $tm_output_item_thesauri$ = makeSymbol("*TM-OUTPUT-ITEM-THESAURI*");

    // defparameter
    private static final SubLSymbol $tm_output_item_arg$ = makeSymbol("*TM-OUTPUT-ITEM-ARG*");

    // defparameter
    private static final SubLSymbol $tm_output_item_predicate$ = makeSymbol("*TM-OUTPUT-ITEM-PREDICATE*");

    // defparameter
    private static final SubLSymbol $tm_output_item_value_key_func$ = makeSymbol("*TM-OUTPUT-ITEM-VALUE-KEY-FUNC*");

    // defparameter
    private static final SubLSymbol $tm_output_item_just_key_func$ = makeSymbol("*TM-OUTPUT-ITEM-JUST-KEY-FUNC*");

    /**
     * Generate a filtered, sorted OUTPUT ITEM for CONSTANT in THESAURI
     * If OUTPUT-FILTER-INFO is non-nil, then filter the output item using it.  Thus, it is
     * the calling function's responsibility to check whether or not filtering should be done.
     */
    public static final SubLObject tm_output_item(SubLObject constant, SubLObject thesauri, SubLObject output_filter_info, SubLObject value_key, SubLObject just_key) {
        if (output_filter_info == UNPROVIDED) {
            output_filter_info = NIL;
        }
        if (value_key == UNPROVIDED) {
            value_key = NIL;
        }
        if (just_key == UNPROVIDED) {
            just_key = NIL;
        }
        {
            SubLObject output_item = tm_generate_output_item(constant, thesauri, value_key, just_key);
            output_item = tm_filter_output_item(output_item, output_filter_info);
            output_item = tm_sort_output_item(output_item);
            output_item = tm_collapse_output_item(output_item);
            return output_item;
        }
    }

    /**
     * A hashtable used while constructing the intermediate form for a thesauri pt concept
     */
    // defparameter
    private static final SubLSymbol $tm_output_item_hash$ = makeSymbol("*TM-OUTPUT-ITEM-HASH*");

    public static final SubLObject tm_clear_output_item_hash() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return clrhash($tm_output_item_hash$.getDynamicValue(thread));
        }
    }

    // defparameter
    private static final SubLSymbol $tm_output_item_hash_lock$ = makeSymbol("*TM-OUTPUT-ITEM-HASH-LOCK*");

    /**
     * Generate the complete OUTPUT ITEM for CONSTANT in THESAURI
     */
    public static final SubLObject tm_generate_output_item(SubLObject constant, SubLObject thesauri, SubLObject value_key, SubLObject just_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_output_item_hash_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_clear_output_item_hash();
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $tm_output_item_thesauri$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $tm_output_item_arg$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $tm_output_item_value_key_func$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $tm_output_item_just_key_func$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                            mt_relevance_macros.$relevant_mts$.bind(thesauri, thread);
                            $tm_output_item_thesauri$.bind(thesauri, thread);
                            $tm_output_item_arg$.bind(ONE_INTEGER, thread);
                            $tm_output_item_value_key_func$.bind(value_key, thread);
                            $tm_output_item_just_key_func$.bind(just_key, thread);
                            kb_mapping.map_gaf_arg_index(symbol_function(TM_GENERATE_OUTPUT_ITEM_INTERNAL), constant, $tm_output_item_arg$.getDynamicValue(thread), NIL, $TRUE, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = $tm_output_item_arg$.currentBinding(thread);
                                try {
                                    $tm_output_item_arg$.bind(TWO_INTEGER, thread);
                                    kb_mapping.map_gaf_arg_index(symbol_function(TM_GENERATE_OUTPUT_ITEM_INTERNAL), constant, $tm_output_item_arg$.getDynamicValue(thread), NIL, $TRUE, UNPROVIDED);
                                } finally {
                                    $tm_output_item_arg$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } finally {
                            $tm_output_item_just_key_func$.rebind(_prev_bind_5, thread);
                            $tm_output_item_value_key_func$.rebind(_prev_bind_4, thread);
                            $tm_output_item_arg$.rebind(_prev_bind_3, thread);
                            $tm_output_item_thesauri$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            tm_sort_output_item_hash();
            return tm_output_item_hash_data();
        }
    }

    public static final SubLObject tm_generate_output_item_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $tm_output_item_predicate$.currentBinding(thread);
                try {
                    $tm_output_item_predicate$.bind(assertions_high.gaf_arg0(assertion), thread);
                    {
                        SubLObject arg = assertions_high.gaf_arg(assertion, $tm_output_item_arg$.getDynamicValue(thread).eql(ONE_INTEGER) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER);
                        SubLObject symbol = NIL;
                        if ($tm_output_item_predicate$.getDynamicValue(thread).eql($$preferredTerm) && $tm_output_item_arg$.getDynamicValue(thread).eql(ONE_INTEGER)) {
                            symbol = $$$LT;
                        } else {
                            symbol = tm_internals.tm_pred_arg_symbol($tm_output_item_predicate$.getDynamicValue(thread), $tm_output_item_arg$.getDynamicValue(thread));
                        }
                        if (symbol.isString()) {
                            {
                                SubLObject value_key = arg;
                                SubLObject just_key = assertion;
                                if (NIL != $tm_output_item_value_key_func$.getDynamicValue(thread)) {
                                    value_key = funcall($tm_output_item_value_key_func$.getDynamicValue(thread), value_key);
                                }
                                if (NIL != $tm_output_item_just_key_func$.getDynamicValue(thread)) {
                                    just_key = funcall($tm_output_item_just_key_func$.getDynamicValue(thread), just_key);
                                }
                                if ((NIL != value_key) && (NIL != just_key)) {
                                    tm_add_output_item_line(symbol, value_key, just_key);
                                }
                            }
                        }
                    }
                } finally {
                    $tm_output_item_predicate$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_add_output_item_line(SubLObject symbol, SubLObject value, SubLObject just) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing_symbol_info = gethash(symbol, $tm_output_item_hash$.getDynamicValue(thread), NIL);
                if (NIL != existing_symbol_info) {
                    {
                        SubLObject existing_val_info = find(value, existing_symbol_info, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                        if (NIL != existing_val_info) {
                            {
                                SubLObject existing_just_info = second(existing_val_info);
                                if (NIL != existing_just_info) {
                                    if (NIL == find(just, existing_just_info, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        existing_just_info = cons(just, existing_just_info);
                                        set_nth(ONE_INTEGER, existing_val_info, existing_just_info);
                                    }
                                } else {
                                    existing_just_info = list(just);
                                    set_nth(ONE_INTEGER, existing_val_info, existing_just_info);
                                }
                            }
                        } else {
                            existing_symbol_info = cons(list(value, list(just)), existing_symbol_info);
                            sethash(symbol, $tm_output_item_hash$.getDynamicValue(thread), existing_symbol_info);
                        }
                    }
                } else {
                    sethash(symbol, $tm_output_item_hash$.getDynamicValue(thread), list(list(value, list(just))));
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_sort_output_item_hash() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdohash_table = $tm_output_item_hash$.getDynamicValue(thread);
                SubLObject symbol = NIL;
                SubLObject entries = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            symbol = getEntryKey(cdohash_entry);
                            entries = getEntryValue(cdohash_entry);
                            entries = Sort.sort(entries, symbol_function($sym10$TERM__), symbol_function(CAR));
                            sethash(symbol, $tm_output_item_hash$.getDynamicValue(thread), entries);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            return $tm_output_item_hash$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_output_item_hash_data() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdohash_table = $tm_output_item_hash$.getDynamicValue(thread);
                SubLObject symbol = NIL;
                SubLObject entries = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            symbol = getEntryKey(cdohash_entry);
                            entries = getEntryValue(cdohash_entry);
                            {
                                SubLObject cdolist_list_var = entries;
                                SubLObject entry = NIL;
                                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                    ans = cons(list(symbol, entry), ans);
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    /**
     * Preconditions: either (tm-filter? output-filter-or-filter-info) => T or
     * (tm-filter-info? output-filter-or-filter-info) => T or
     * (null output-filter-or-filter-info)
     * output-item meets the specification given for <output-item> above.
     * Postconditions: If OUTPUT-FILTER-OR-FILTER-INFO is nil, no filtering is done.
     * Else, OUTPUT-FILTER-OR-FILTER-INFO has been used to filter the output-item.
     * The filtering has destructively altered some of the elements of output item.
     * Description:  Filter OUTPUT-ITEM using OUTPUT-FILTER-OR-FILTER-INFO.
     */
    public static final SubLObject tm_filter_output_item(SubLObject output_item, SubLObject output_filter_or_filter_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == output_filter_or_filter_info) {
                return output_item;
            } else {
                {
                    SubLObject filtered = NIL;
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != tm_internals.tm_filterP(output_filter_or_filter_info)) || (NIL != tm_internals.tm_filter_infoP(output_filter_or_filter_info)))) {
                            Errors.error($str_alt11$_A_is_not_of_type_tm_filter__or_t, output_filter_or_filter_info);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = output_item;
                        SubLObject output_spec = NIL;
                        for (output_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , output_spec = cdolist_list_var.first()) {
                            {
                                SubLObject symbol = output_spec.first();
                                if (symbol.equalp($$$LT)) {
                                    filtered = cons(output_spec, filtered);
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_symbol = tm_internals.tm_output_as_relation_according_to_filter(symbol, output_filter_or_filter_info);
                                        SubLObject status = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == new_symbol) {
                                            identity(NIL);
                                        } else
                                            if (status.eql($DEFAULT)) {
                                                rplaca(output_spec, new_symbol);
                                                filtered = cons(output_spec, filtered);
                                            } else
                                                if (status.eql($FILTERED)) {
                                                    rplaca(output_spec, new_symbol);
                                                    filtered = cons(output_spec, filtered);
                                                }


                                    }
                                }
                            }
                        }
                    }
                    return nreverse(filtered);
                }
            }
        }
    }

    public static final SubLObject tm_collapse_output_item(SubLObject output_item) {
        {
            SubLObject collapsed_item = NIL;
            SubLObject cdolist_list_var = output_item;
            SubLObject output_spec = NIL;
            for (output_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , output_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = output_spec;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject val_thesauri_pair = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt14);
                    val_thesauri_pair = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject existing_item = find(symbol, collapsed_item, symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                            if (NIL != existing_item) {
                                {
                                    SubLObject existing_pairs = second(existing_item);
                                    existing_pairs = cons(val_thesauri_pair, existing_pairs);
                                    set_nth(ONE_INTEGER, existing_item, existing_pairs);
                                }
                            } else {
                                {
                                    SubLObject item_var = list(symbol, list(val_thesauri_pair));
                                    if (NIL == member(item_var, collapsed_item, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        collapsed_item = cons(item_var, collapsed_item);
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt14);
                    }
                }
            }
            return nreverse(collapsed_item);
        }
    }

    /**
     * Nicely sort the specs in OUTPUT-ITEM
     */
    public static final SubLObject tm_sort_output_item(SubLObject output_item) {
        output_item = Sort.sort(output_item, STRING_LESSP, symbol_function(CAR));
        output_item = Sort.stable_sort(output_item, $sym16$TM_PRED_SYMBOL__, symbol_function(CAR));
        return output_item;
    }

    // defparameter
    private static final SubLSymbol $tm_averge_nt_count$ = makeSymbol("*TM-AVERGE-NT-COUNT*");

    // defparameter
    private static final SubLSymbol $tm_averge_all_nt_count$ = makeSymbol("*TM-AVERGE-ALL-NT-COUNT*");

    /**
     * Return a hashtable with the sepcified subset of terms in THESAURUS.
     * START-TERMS are the terms from which to start recursively including in the subset.
     * If START-TERMS are nil, the tops of THESAURUS are used.
     * CUTOFF-TERMS are terms beyond which we won't recurse.
     * CUTOFF-LEVEL, if present, is a level below the START-TERMS beyond which we won't recurse.
     */
    public static final SubLObject tm_thesaurus_subset_contents_table(SubLObject thesaurus, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level) {
        {
            SubLObject estimated_size = estimate_thesaurus_subset_size(thesaurus, start_terms, cutoff_level);
            SubLObject contents_table = make_hash_table(estimated_size, UNPROVIDED, UNPROVIDED);
            if (NIL == start_terms) {
                start_terms = tm_internals.thesaurus_tops(thesaurus);
            }
            {
                SubLObject cdolist_list_var = start_terms;
                SubLObject start_term = NIL;
                for (start_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start_term = cdolist_list_var.first()) {
                    tm_thesaurus_subset_contents_recursive(start_term, thesaurus, contents_table, cutoff_terms, ZERO_INTEGER, cutoff_level);
                }
            }
            return contents_table;
        }
    }

    public static final SubLObject tm_thesaurus_subset_contents_recursive(SubLObject concept, SubLObject thesaurus, SubLObject mark_table, SubLObject cutoff_terms, SubLObject current_level, SubLObject cutoff_level) {
        if (!((NIL != cutoff_level) && current_level.numG(cutoff_level))) {
            if (NIL == gethash(concept, mark_table, UNPROVIDED)) {
                sethash(concept, mark_table, T);
                if (!((NIL != cutoff_terms) && (NIL != member(concept, cutoff_terms, UNPROVIDED, UNPROVIDED)))) {
                    {
                        SubLObject narrower_terms = tm_internals.nt(concept, $$broaderTerm, thesaurus, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = narrower_terms;
                        SubLObject narrower_term = NIL;
                        for (narrower_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower_term = cdolist_list_var.first()) {
                            tm_thesaurus_subset_contents_recursive(narrower_term, thesaurus, mark_table, cutoff_terms, add(current_level, ONE_INTEGER), cutoff_level);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject estimate_thesaurus_subset_size(SubLObject thesaurus, SubLObject start_terms, SubLObject cutoff_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject estimated_size = tm_internals.thesaurus_preferred_term_count(thesaurus);
                if (NIL != start_terms) {
                    if (NIL != cutoff_level) {
                        estimated_size = min(estimated_size, multiply(length(start_terms), expt($tm_averge_nt_count$.getDynamicValue(thread), cutoff_level)));
                    } else {
                        estimated_size = min(estimated_size, multiply(length(start_terms), $tm_averge_all_nt_count$.getDynamicValue(thread)));
                    }
                } else {
                    if (NIL != cutoff_level) {
                        estimated_size = min(estimated_size, multiply(length(tm_internals.thesaurus_tops(thesaurus)), expt($tm_averge_nt_count$.getDynamicValue(thread), cutoff_level)));
                    }
                }
                return estimated_size;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tm_basis_continuation_char$ = makeSymbol("*TM-BASIS-CONTINUATION-CHAR*");

    // defparameter
    private static final SubLSymbol $tm_basis_continuation_confirm_char$ = makeSymbol("*TM-BASIS-CONTINUATION-CONFIRM-CHAR*");

    // defparameter
    private static final SubLSymbol $tm_basis_continuation_indent$ = makeSymbol("*TM-BASIS-CONTINUATION-INDENT*");

    /**
     * Used internally by tm-read-basis-file-item
     */
    // defparameter
    private static final SubLSymbol $tm_basis_previous_lt_line$ = makeSymbol("*TM-BASIS-PREVIOUS-LT-LINE*");

    /**
     * Return the next parsed 'item' from a basis-format stream
     */
    public static final SubLObject tm_read_basis_file_item(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_line = NIL;
                if (compatibility.get_file_position(stream).numE(ZERO_INTEGER)) {
                    rplaca($tm_basis_previous_lt_line$.getDynamicValue(thread), NIL);
                    first_line = tm_read_and_parse_one_basis_line(stream);
                } else {
                    first_line = $tm_basis_previous_lt_line$.getDynamicValue(thread).first();
                }
                if (NIL == first_line) {
                    return NIL;
                }
                if (first_line == $ERROR) {
                    Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                    return NIL;
                }
                if (!tm_basis_line_reln(first_line).equalp($$$LT)) {
                    Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                    return NIL;
                }
                {
                    SubLObject full_lines = NIL;
                    full_lines = cons(first_line, full_lines);
                    {
                        SubLObject next_line = NIL;
                        for (next_line = tm_read_and_parse_one_basis_line(stream); !(((NIL == next_line) || (next_line == $ERROR)) || tm_basis_line_reln(next_line).equalp($$$LT)); next_line = tm_read_and_parse_one_basis_line(stream)) {
                            full_lines = cons(next_line, full_lines);
                        }
                        if (next_line == $ERROR) {
                            Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                            return NIL;
                        }
                        rplaca($tm_basis_previous_lt_line$.getDynamicValue(thread), next_line);
                        return nreverse(full_lines);
                    }
                }
            }
        }
    }

    /**
     * Return a single parsed line from a basis-format STREAM.
     * Return NIL if STREAM is now empty.
     * Return :ERROR if there was a parse error with STREAM
     */
    public static final SubLObject tm_read_and_parse_one_basis_line(SubLObject stream) {
        {
            SubLObject data = tm_read_one_basis_line(stream);
            if (!data.isString()) {
                return NIL;
            }
            return tm_parse_one_basis_line(data);
        }
    }

    /**
     * Assume line is of the form:  <whitespace>* <symbol-string> <whitespace>* [= <whitespace>*] <character>*
     */
    public static final SubLObject tm_parse_one_basis_line(SubLObject basis_line) {
        {
            SubLObject equal_pos = position(CHAR_equal, basis_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject relation_start = list_utilities.position_if_not(symbol_function(WHITESPACEP), basis_line, symbol_function(IDENTITY), ZERO_INTEGER, equal_pos);
            if (NIL == relation_start) {
                return $ERROR;
            }
            {
                SubLObject relation_end = position_if(symbol_function(WHITESPACEP), basis_line, symbol_function(IDENTITY), relation_start, equal_pos);
                if (NIL == relation_end) {
                    if (NIL != equal_pos) {
                        relation_end = equal_pos;
                    } else {
                        return $ERROR;
                    }
                }
                {
                    SubLObject value_start = list_utilities.position_if_not(symbol_function(WHITESPACEP), basis_line, symbol_function(IDENTITY), relation_end, UNPROVIDED);
                    if (NIL == value_start) {
                        return $ERROR;
                    }
                    if (NIL != charE(Strings.sublisp_char(basis_line, value_start), CHAR_equal)) {
                        value_start = list_utilities.position_if_not(symbol_function(WHITESPACEP), basis_line, symbol_function(IDENTITY), add(value_start, ONE_INTEGER), UNPROVIDED);
                        if (NIL == value_start) {
                            return $ERROR;
                        }
                    }
                    {
                        SubLObject relation = string_utilities.substring(basis_line, relation_start, relation_end);
                        SubLObject value = tm_internals.canonicalize_lexical_term(string_utilities.substring(basis_line, value_start, UNPROVIDED));
                        return list(relation, value);
                    }
                }
            }
        }
    }

    public static final SubLObject tm_basis_line_reln(SubLObject load_line) {
        return load_line.first();
    }

    public static final SubLObject tm_basis_line_value(SubLObject load_line) {
        return second(load_line);
    }

    // defparameter
    private static final SubLSymbol $tm_cr_lf_set$ = makeSymbol("*TM-CR-LF-SET*");

    public static final SubLObject tm_skip_cr_lfs(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_char = NIL;
                for (v_char = read_char(stream, NIL, $EOF, UNPROVIDED); !((!v_char.isChar()) || (NIL == subl_promotions.memberP(v_char, $tm_cr_lf_set$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))); v_char = read_char(stream, NIL, $EOF, UNPROVIDED)) {
                }
                if (v_char.isChar()) {
                    unread_char(v_char, stream);
                }
            }
            return NIL;
        }
    }

    /**
     * Return the next non-blank raw BASIS line from STREAM
     */
    public static final SubLObject tm_read_basis_line(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject line = NIL;
                for (line = read_line(stream, NIL, $EOF, UNPROVIDED); !((!line.isString()) || (NIL != list_utilities.position_if_not(symbol_function(WHITESPACEP), line, UNPROVIDED, UNPROVIDED, UNPROVIDED))); line = read_line(stream, NIL, $EOF, UNPROVIDED)) {
                    tm_skip_cr_lfs(stream);
                }
                if (line.isString()) {
                    tm_skip_cr_lfs(stream);
                }
                return line.isString() ? ((SubLObject) (Strings.string_right_trim($tm_cr_lf_set$.getDynamicValue(thread), line))) : NIL;
            }
        }
    }

    /**
     * Return the next non-blank logical BASIS line from STREAM.
     * This includes handling continuations.
     */
    public static final SubLObject tm_read_one_basis_line(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = tm_read_basis_line(stream);
                if (!v_answer.isString()) {
                    return NIL;
                }
                if (!string_utilities.last_char(v_answer).eql($tm_basis_continuation_char$.getDynamicValue(thread))) {
                    return v_answer;
                }
                v_answer = list(v_answer);
                {
                    SubLObject next_line = NIL;
                    for (next_line = tm_read_basis_line(stream); !((!next_line.isString()) || (!string_utilities.last_char(next_line).eql($tm_basis_continuation_char$.getDynamicValue(thread)))); next_line = tm_read_basis_line(stream)) {
                        v_answer = cons(next_line, v_answer);
                    }
                    if (next_line.isString()) {
                        v_answer = cons(next_line, v_answer);
                    }
                    return tm_basis_continuation_string(nreverse(v_answer));
                }
            }
        }
    }

    public static final SubLObject tm_basis_continuation_string_length(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject long_string_length = ZERO_INTEGER;
                SubLObject datum = data;
                SubLObject current = datum;
                SubLObject first = NIL;
                SubLObject rest = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt24);
                first = current.first();
                current = current.rest();
                rest = current;
                long_string_length = add(long_string_length, length(first));
                if (string_utilities.last_char(first).eql($tm_basis_continuation_char$.getDynamicValue(thread))) {
                    long_string_length = subtract(long_string_length, ONE_INTEGER);
                }
                {
                    SubLObject cdolist_list_var = rest;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        long_string_length = add(long_string_length, length(item));
                        long_string_length = subtract(long_string_length, tm_basis_continuation_indent_amount(item));
                        if (string_utilities.last_char(item).eql($tm_basis_continuation_char$.getDynamicValue(thread))) {
                            long_string_length = subtract(long_string_length, ONE_INTEGER);
                        }
                    }
                }
                return long_string_length;
            }
        }
    }

    public static final SubLObject tm_basis_continuation_indent_amount(SubLObject item) {
        {
            SubLObject indent = list_utilities.position_if_not(symbol_function(WHITESPACEP), item, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != indent ? ((SubLObject) (indent)) : ZERO_INTEGER;
        }
    }

    public static final SubLObject tm_basis_continuation_string(SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject long_string_length = tm_basis_continuation_string_length(data);
                SubLObject long_string = Strings.make_string(long_string_length, UNPROVIDED);
                SubLObject long_index = ZERO_INTEGER;
                SubLObject datum = data;
                SubLObject current = datum;
                SubLObject first = NIL;
                SubLObject rest = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt24);
                first = current.first();
                current = current.rest();
                rest = current;
                {
                    SubLObject first_end = subtract(length(first), ONE_INTEGER);
                    SubLObject long_end = first_end;
                    replace(long_string, first, long_index, long_end, ZERO_INTEGER, first_end);
                    long_index = long_end;
                    if (!string_utilities.last_char(first).eql($tm_basis_continuation_char$.getDynamicValue(thread))) {
                        Strings.set_char(long_string, long_index, string_utilities.last_char(first));
                        long_index = add(long_index, ONE_INTEGER);
                    }
                }
                {
                    SubLObject cdolist_list_var = rest;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        {
                            SubLObject indent = tm_basis_continuation_indent_amount(item);
                            SubLObject long_end = subtract(add(long_index, length(item)), ONE_INTEGER, indent);
                            SubLObject item_end = subtract(length(item), ONE_INTEGER);
                            replace(long_string, item, long_index, long_end, indent, item_end);
                            long_index = long_end;
                            if (!string_utilities.last_char(item).eql($tm_basis_continuation_char$.getDynamicValue(thread))) {
                                Strings.set_char(long_string, long_index, string_utilities.last_char(item));
                                long_index = add(long_index, ONE_INTEGER);
                            }
                        }
                    }
                }
                if (!long_index.numE(long_string_length)) {
                    Errors.error($str_alt25$could_not_construct_long_string_f, data);
                }
                return long_string;
            }
        }
    }

    /**
     * Used internally by tm-read-brs-file-item
     */
    // defparameter
    private static final SubLSymbol $tm_brs_previous_lt_line$ = makeSymbol("*TM-BRS-PREVIOUS-LT-LINE*");

    // defparameter
    public static final SubLSymbol $tm_brs_sn_symbol$ = makeSymbol("*TM-BRS-SN-SYMBOL*");

    /**
     * Scope note currently being read
     */
    // defparameter
    private static final SubLSymbol $tm_brs_current_sn$ = makeSymbol("*TM-BRS-CURRENT-SN*");

    /**
     * Return the next parsed 'item' from a brs-format stream
     */
    public static final SubLObject tm_read_brs_file_item(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_line = NIL;
                if (compatibility.get_file_position(stream).numE(ZERO_INTEGER)) {
                    rplaca($tm_brs_previous_lt_line$.getDynamicValue(thread), NIL);
                    first_line = tm_read_and_parse_one_brs_line(stream);
                } else {
                    first_line = $tm_brs_previous_lt_line$.getDynamicValue(thread).first();
                }
                if (NIL == first_line) {
                    return NIL;
                }
                if (first_line == $ERROR) {
                    Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                    return NIL;
                }
                if (!tm_brs_line_reln(first_line).equalp($$$LT)) {
                    Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                    return NIL;
                }
                {
                    SubLObject full_lines = NIL;
                    full_lines = cons(first_line, full_lines);
                    rplaca($tm_brs_current_sn$.getDynamicValue(thread), NIL);
                    {
                        SubLObject next_line = NIL;
                        for (next_line = tm_read_and_parse_one_brs_line(stream); !(((NIL == next_line) || (next_line == $ERROR)) || tm_brs_line_reln(next_line).equalp($$$LT)); next_line = tm_read_and_parse_one_brs_line(stream)) {
                            {
                                SubLObject symbol = tm_brs_line_reln(next_line);
                                SubLObject value = tm_brs_line_value(next_line);
                                if (symbol.equalp($tm_brs_sn_symbol$.getDynamicValue(thread))) {
                                    if ($tm_brs_current_sn$.getDynamicValue(thread).first().isString()) {
                                        rplaca($tm_brs_current_sn$.getDynamicValue(thread), cconcatenate($tm_brs_current_sn$.getDynamicValue(thread).first(), value));
                                    } else {
                                        rplaca($tm_brs_current_sn$.getDynamicValue(thread), value);
                                    }
                                } else {
                                    if ($tm_brs_current_sn$.getDynamicValue(thread).first().isString()) {
                                        full_lines = cons(list($tm_brs_sn_symbol$.getDynamicValue(thread), $tm_brs_current_sn$.getDynamicValue(thread).first()), full_lines);
                                        rplaca($tm_brs_current_sn$.getDynamicValue(thread), NIL);
                                    }
                                    full_lines = cons(next_line, full_lines);
                                }
                            }
                        }
                        if (next_line == $ERROR) {
                            Errors.error($str_alt20$parse_error_at_index__S_of_file, compatibility.get_file_position(stream));
                            return NIL;
                        }
                        if ($tm_brs_current_sn$.getDynamicValue(thread).first().isString()) {
                            full_lines = cons(list($tm_brs_sn_symbol$.getDynamicValue(thread), $tm_brs_current_sn$.getDynamicValue(thread).first()), full_lines);
                            rplaca($tm_brs_current_sn$.getDynamicValue(thread), NIL);
                        }
                        rplaca($tm_brs_previous_lt_line$.getDynamicValue(thread), next_line);
                        return nreverse(full_lines);
                    }
                }
            }
        }
    }

    /**
     * Return a single parsed line from a brs-format STREAM.
     * Return NIL if STREAM is now empty.
     * Return :ERROR if there was a parse error with STREAM
     */
    public static final SubLObject tm_read_and_parse_one_brs_line(SubLObject stream) {
        {
            SubLObject data = tm_read_one_brs_line(stream);
            if (!data.isString()) {
                return NIL;
            }
            return tm_parse_one_brs_line(data);
        }
    }

    /**
     * Assume line is of the form:  <whitespace>* <symbol-string> <whitespace>* <character>*
     */
    public static final SubLObject tm_parse_one_brs_line(SubLObject brs_line) {
        {
            SubLObject relation_start = list_utilities.position_if_not(symbol_function(WHITESPACEP), brs_line, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == relation_start) {
                return $ERROR;
            }
            {
                SubLObject relation_end = position_if(symbol_function(WHITESPACEP), brs_line, symbol_function(IDENTITY), relation_start, UNPROVIDED);
                if (NIL == relation_end) {
                    return $ERROR;
                }
                {
                    SubLObject value_start = list_utilities.position_if_not(symbol_function(WHITESPACEP), brs_line, symbol_function(IDENTITY), relation_end, UNPROVIDED);
                    if (NIL == value_start) {
                        return $ERROR;
                    }
                    {
                        SubLObject relation = string_utilities.substring(brs_line, relation_start, relation_end);
                        SubLObject value = tm_internals.canonicalize_lexical_term(string_utilities.substring(brs_line, value_start, UNPROVIDED));
                        return list(relation, value);
                    }
                }
            }
        }
    }

    public static final SubLObject tm_brs_line_reln(SubLObject load_line) {
        return load_line.first();
    }

    public static final SubLObject tm_brs_line_value(SubLObject load_line) {
        return second(load_line);
    }

    /**
     * Return the next non-blank raw BRS line from STREAM
     */
    public static final SubLObject tm_read_brs_line(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject line = NIL;
                for (line = read_line(stream, NIL, $EOF, UNPROVIDED); !((!line.isString()) || (NIL != list_utilities.position_if_not(symbol_function(WHITESPACEP), line, UNPROVIDED, UNPROVIDED, UNPROVIDED))); line = read_line(stream, NIL, $EOF, UNPROVIDED)) {
                    tm_skip_cr_lfs(stream);
                }
                if (line.isString()) {
                    tm_skip_cr_lfs(stream);
                }
                return line.isString() ? ((SubLObject) (Strings.string_right_trim($tm_cr_lf_set$.getDynamicValue(thread), line))) : NIL;
            }
        }
    }

    /**
     * Return the next non-blank logical BRS line from STREAM.
     * This includes handling continuations.
     */
    public static final SubLObject tm_read_one_brs_line(SubLObject stream) {
        return tm_read_brs_line(stream);
    }

    /**
     * Return the next parsed single line from a basis-format stream, in order to verify the relation.
     */
    public static final SubLObject tm_read_basis_single_line(SubLObject stream) {
        {
            SubLObject line = tm_read_and_parse_one_basis_line(stream);
            if (line == $ERROR) {
                Errors.error($str_alt27$parse_error_at_index__S_of_file__, compatibility.get_file_position(stream));
                return NIL;
            }
            return line;
        }
    }

    /**
     * Return the next parsed single line from a brs-format stream, in order to verify the relation.
     */
    public static final SubLObject tm_read_brs_single_line(SubLObject stream) {
        {
            SubLObject line = tm_read_and_parse_one_brs_line(stream);
            if (line == $ERROR) {
                Errors.error($str_alt27$parse_error_at_index__S_of_file__, compatibility.get_file_position(stream));
                return NIL;
            }
            return line;
        }
    }

    /**
     * Process thesaurus file at FILENAME by reading with READ-METHOD and processing with PROCESS-METHOD.
     */
    public static final SubLObject tm_load_and_process_input_file(SubLObject filename, SubLObject read_method, SubLObject process_method, SubLObject start_positionP) {
        if (start_positionP == UNPROVIDED) {
            start_positionP = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = process_method;
                if (pcase_var.eql(QUOTE) || pcase_var.eql(TM_LOAD_THESAURUS_CHECK_ITEM)) {
                    utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt30$Checking_relations_used_in_file__, filename), thread);
                    tm_thinking.tm_thinking_set_property($PASS, ONE_INTEGER, UNPROVIDED);
                } else
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(TM_LOAD_THESAURUS_ADD_ITEM)) {
                        utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt33$Loading_thesaurus_file__A, filename), thread);
                        tm_thinking.tm_thinking_set_property($PASS, TWO_INTEGER, UNPROVIDED);
                    }

            }
            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(file_utilities.get_file_length(filename), thread);
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
                        SubLObject _prev_bind_0_2 = $tm_basis_previous_lt_line$.currentBinding(thread);
                        SubLObject _prev_bind_1_3 = $tm_brs_previous_lt_line$.currentBinding(thread);
                        SubLObject _prev_bind_2_4 = $tm_brs_current_sn$.currentBinding(thread);
                        try {
                            $tm_basis_previous_lt_line$.bind(make_list(ONE_INTEGER, NIL), thread);
                            $tm_brs_previous_lt_line$.bind(make_list(ONE_INTEGER, NIL), thread);
                            $tm_brs_current_sn$.bind(make_list(ONE_INTEGER, NIL), thread);
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(filename, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt35$Unable_to_open__S, filename);
                                    }
                                    {
                                        SubLObject stream_5 = stream;
                                        compatibility.set_file_position(stream_5, start_positionP);
                                        {
                                            SubLObject done = NIL;
                                            while (NIL == done) {
                                                utilities_macros.$progress_sofar$.setDynamicValue(compatibility.get_file_position(stream_5), thread);
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                tm_thinking.tm_thinking_note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread), UNPROVIDED);
                                                {
                                                    SubLObject tm_load_io_item = funcall(read_method, stream_5);
                                                    if (NIL != tm_io_item_p(tm_load_io_item)) {
                                                        funcall(process_method, tm_load_io_item);
                                                    } else {
                                                        done = T;
                                                    }
                                                }
                                            } 
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $tm_brs_current_sn$.rebind(_prev_bind_2_4, thread);
                            $tm_brs_previous_lt_line$.rebind(_prev_bind_1_3, thread);
                            $tm_basis_previous_lt_line$.rebind(_prev_bind_0_2, thread);
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
            return NIL;
        }
    }

    /**
     * Do we print out the FI operations we are doing as part of loading?
     */
    // defparameter
    private static final SubLSymbol $tm_load_verboseP$ = makeSymbol("*TM-LOAD-VERBOSE?*");

    /**
     * Note the concepts created during a complete load
     */
    // defparameter
    private static final SubLSymbol $tm_concepts_created_during_load$ = makeSymbol("*TM-CONCEPTS-CREATED-DURING-LOAD*");

    /**
     * Controls how concepts for a preferred term are reused during loading:
     * :NONE   = (conservative) always create new concepts
     * :UNIQUE = (compromise) use concepts from other thesauri if there's no ambiguity
     * :ANY    = (reckless) use any concept from any other thesauri
     * :PRIORITY = use concepts from *tm-load-concept-reuse-priority-thesauri*
     * only, preferring those from earlier in the list.
     */
    // defparameter
    private static final SubLSymbol $tm_load_concept_reuse_mode$ = makeSymbol("*TM-LOAD-CONCEPT-REUSE-MODE*");

    /**
     * Ordered list of thesauri.  When *tm-load-concept-reuse-mode* is set to :PRIORITY,
     * use concepts from *tm-load-concept-reuse-priority-thesauri*
     * only, preferring those from earlier in the list.  Dynamically bind
     * this as appropriate.
     */
    // defparameter
    private static final SubLSymbol $tm_load_concept_reuse_priority_thesauri$ = makeSymbol("*TM-LOAD-CONCEPT-REUSE-PRIORITY-THESAURI*");

    /**
     * A-list of the file format input reader methods
     */
    // defparameter
    public static final SubLSymbol $tm_load_read_methods$ = makeSymbol("*TM-LOAD-READ-METHODS*");

    /**
     * A-list of the file format input reader methods
     */
    // defparameter
    public static final SubLSymbol $tm_load_single_line_read_methods$ = makeSymbol("*TM-LOAD-SINGLE-LINE-READ-METHODS*");

    public static final SubLObject tm_load_read_method(SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return second(assoc(format, $tm_load_read_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    public static final SubLObject tm_load_single_line_read_method(SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return second(assoc(format, $tm_load_single_line_read_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     * Load thesaurus info from FILENAME into THESAURUS, interpreting the file's contents
     * as being of FORMAT format.
     */
    public static final SubLObject tm_load_thesaurus_from_file(SubLObject filename, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject result = NIL;
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        {
                            SubLObject read_method = tm_load_read_method(format);
                            SubLObject single_line_read_method = tm_load_single_line_read_method(format);
                            if (!(((NIL != read_method) && read_method.isSymbol()) && (NIL != fboundp(read_method)))) {
                                Errors.error($str_alt41$_A_is_not_a_supported_thesaurus_l, format);
                            }
                            if (NIL == Filesys.probe_file(filename)) {
                                Errors.error($str_alt42$Input_file__A_does_not_exist, filename);
                            }
                            {
                                SubLObject lock = $tm_relation_status_hash_lock$.getDynamicValue(thread);
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    update_tm_relation_status_hash_for_thesaurus(thesaurus);
                                    tm_load_and_process_input_file(filename, single_line_read_method, TM_LOAD_THESAURUS_CHECK_ITEM, UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                            {
                                SubLObject _prev_bind_0_7 = control_vars.$mapping_target$.currentBinding(thread);
                                SubLObject _prev_bind_1_8 = $tm_concepts_created_during_load$.currentBinding(thread);
                                try {
                                    control_vars.$mapping_target$.bind(thesaurus, thread);
                                    $tm_concepts_created_during_load$.bind(NIL, thread);
                                    tm_load_and_process_input_file(filename, read_method, TM_LOAD_THESAURUS_ADD_ITEM, UNPROVIDED);
                                } finally {
                                    $tm_concepts_created_during_load$.rebind(_prev_bind_1_8, thread);
                                    control_vars.$mapping_target$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                            tm_load_thesaurus_cleanup(thesaurus);
                            tm_set_thesaurus_timestamp(thesaurus);
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
                result = thesaurus;
                return result;
            }
        }
    }

    public static final SubLObject tm_load_thesaurus_cleanup(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject self_loops = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        {
                            SubLObject pred_var = $$broaderTerm;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                            SubLObject done_var_9 = NIL;
                                                            SubLObject token_var_10 = NIL;
                                                            while (NIL == done_var_9) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                    SubLObject valid_11 = makeBoolean(token_var_10 != ass);
                                                                    if (NIL != valid_11) {
                                                                        if (assertions_high.gaf_arg1(ass) == assertions_high.gaf_arg2(ass)) {
                                                                            self_loops = cons(ass, self_loops);
                                                                        }
                                                                    }
                                                                    done_var_9 = makeBoolean(NIL == valid_11);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
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
                {
                    SubLObject cdolist_list_var = self_loops;
                    SubLObject self_loop = NIL;
                    for (self_loop = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , self_loop = cdolist_list_var.first()) {
                        tm_load_unassert_assertion(self_loop);
                    }
                }
            }
            {
                SubLObject tops = tm_load_tops(thesaurus);
                SubLObject cdolist_list_var = tops;
                SubLObject top = NIL;
                for (top = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top = cdolist_list_var.first()) {
                    tm_internals.assert_thesaurus_top(top, thesaurus);
                }
            }
            return thesaurus;
        }
    }

    /**
     * Determine the top terms in freshly-loaded THESAURUS
     */
    public static final SubLObject tm_load_tops(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tops = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        {
                            SubLObject pred_var = $$preferredTerm;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                            SubLObject done_var_13 = NIL;
                                                            SubLObject token_var_14 = NIL;
                                                            while (NIL == done_var_13) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                    SubLObject valid_15 = makeBoolean(token_var_14 != ass);
                                                                    if (NIL != valid_15) {
                                                                        {
                                                                            SubLObject concept = tm_datastructures.sign_concept(ass);
                                                                            if (NIL != tm_internals.possible_top_in_thesaurusP(concept, thesaurus)) {
                                                                                tops = cons(concept, tops);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_13 = makeBoolean(NIL == valid_15);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
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
                if (NIL != list_utilities.singletonP(tops)) {
                    {
                        SubLObject pseudo_top_concept = tops.first();
                        SubLObject pseudo_top_string = tm_datastructures.concept_term(pseudo_top_concept, thesaurus);
                        SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                        if ((pseudo_top_string.isString() && thesaurus_name.isString()) && ((NIL != string_utilities.substringP($$$THESAURUS, pseudo_top_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.substringP(thesaurus_name, pseudo_top_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            {
                                SubLObject new_tops = tm_internals.nt(pseudo_top_concept, $$broaderTerm, list(thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                tops = new_tops;
                                tm_load_kill(pseudo_top_concept);
                            }
                        }
                    }
                }
                return tops;
            }
        }
    }

    public static final SubLObject tm_load_thesaurus_in_thinker(SubLObject pathname, SubLObject thesaurus, SubLObject format, SubLObject reuse_mode, SubLObject reuse_thesauri) {
        if (reuse_thesauri == UNPROVIDED) {
            reuse_thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thinking = tm_thinking.tm_new_thinking(tm_datastructures.$tm_user$.getDynamicValue(thread), $LOAD_THESAURUS);
                SubLObject thread_17 = tm_thinking.tm_thinking_start(thinking, TM_LOAD_THESAURUS_FROM_FILE_WRAPPER, list(pathname, thesaurus, format, reuse_mode, reuse_thesauri));
                return thread_17;
            }
        }
    }

    public static final SubLObject tm_load_thesaurus_from_file_wrapper(SubLObject pathname, SubLObject thesaurus, SubLObject format, SubLObject reuse_mode, SubLObject reuse_thesauri) {
        if (reuse_thesauri == UNPROVIDED) {
            reuse_thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $tm_load_concept_reuse_mode$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tm_load_concept_reuse_priority_thesauri$.currentBinding(thread);
                        try {
                            $tm_load_concept_reuse_mode$.bind(reuse_mode, thread);
                            $tm_load_concept_reuse_priority_thesauri$.bind(reuse_thesauri, thread);
                            tm_load_thesaurus_from_file(pathname, thesaurus, format);
                            success = T;
                        } finally {
                            $tm_load_concept_reuse_priority_thesauri$.rebind(_prev_bind_1, thread);
                            $tm_load_concept_reuse_mode$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            tm_datastructures.tm_finish_write_operation(thesaurus);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != success) {
                    return $$$SUCCESS;
                } else {
                    return $$$INCOMPLETE;
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tm_relation_status_hash$ = makeSymbol("*TM-RELATION-STATUS-HASH*");

    // defparameter
    private static final SubLSymbol $tm_relation_status_hash_lock$ = makeSymbol("*TM-RELATION-STATUS-HASH-LOCK*");

    public static final SubLObject update_tm_relation_status_hash_for_thesaurus(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = tm_internals.tm_inactive_relation_symbols_sorted();
                SubLObject rel_symbol = NIL;
                for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_symbol = cdolist_list_var.first()) {
                    sethash(rel_symbol, $tm_relation_status_hash$.getDynamicValue(thread), $INACTIVE);
                }
            }
            {
                SubLObject cdolist_list_var = tm_internals.tm_active_relation_symbols_sorted();
                SubLObject rel_symbol = NIL;
                for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_symbol = cdolist_list_var.first()) {
                    {
                        SubLObject rel_constant = second(assoc(rel_symbol, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED));
                        if (NIL != tm_internals.relation_restricted_in_thesaurusP(rel_constant, thesaurus)) {
                            sethash(rel_symbol, $tm_relation_status_hash$.getDynamicValue(thread), $RESTRICTED);
                        } else {
                            sethash(rel_symbol, $tm_relation_status_hash$.getDynamicValue(thread), $ACTIVE);
                        }
                    }
                }
            }
            return $tm_relation_status_hash$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_load_thesaurus_check_item(SubLObject file_item) {
        return tm_load_thesaurus_check_item_internal(file_item);
    }

    /**
     * check to make sure the predicate is known and is usable.
     */
    public static final SubLObject tm_load_thesaurus_check_item_internal(SubLObject file_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                format(T, $str_alt55$_______item_);
            }
            {
                SubLObject pred_string = file_item.first();
                SubLObject status = gethash(pred_string, $tm_relation_status_hash$.getDynamicValue(thread), $UNKNOWN);
                if (pred_string.equalp($$$LT)) {
                    status = $ACTIVE;
                }
                {
                    SubLObject pcase_var = status;
                    if (pcase_var.eql($ACTIVE)) {
                        return T;
                    } else
                        if (pcase_var.eql($INACTIVE)) {
                            Errors.error($str_alt57$The_relation___S__is_not_an_activ, pred_string);
                        } else
                            if (pcase_var.eql($RESTRICTED)) {
                                Errors.error($str_alt58$The_relation___S__is_restricted_f, pred_string);
                            } else
                                if (pcase_var.eql($UNKNOWN)) {
                                    Errors.error($str_alt59$The_relation_string___S__does_not, pred_string);
                                } else {
                                    Errors.error($str_alt60$The_relation_string___S__has_no_k);
                                }



                }
                return NIL;
            }
        }
    }

    // defparameter
    public static final SubLSymbol $tm_load_transcript_queue_worry_size$ = makeSymbol("*TM-LOAD-TRANSCRIPT-QUEUE-WORRY-SIZE*");

    public static final SubLObject tm_load_thesaurus_add_item(SubLObject file_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_load_thesaurus_add_item_internal(file_item, control_vars.$mapping_target$.getDynamicValue(thread));
        }
    }

    /**
     * Add the FILE-ITEM as assertions in THESAURUS
     */
    public static final SubLObject tm_load_thesaurus_add_item_internal(SubLObject file_item, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                format(T, $str_alt55$_______item_);
            }
            {
                SubLObject datum = file_item;
                SubLObject current = datum;
                SubLObject lead_term_spec = NIL;
                SubLObject assertion_specs = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt62);
                lead_term_spec = current.first();
                current = current.rest();
                assertion_specs = current;
                {
                    SubLObject lead_term_string = second(lead_term_spec);
                    assertion_specs = tm_load_binarize_assertion_specs(lead_term_string, assertion_specs);
                    assertion_specs = tm_load_canonicalize_assertion_spec_predicates(assertion_specs);
                    assertion_specs = tm_load_construct_fi_assert_specs(assertion_specs, thesaurus);
                    {
                        SubLObject cdolist_list_var = assertion_specs;
                        SubLObject assertion_spec = NIL;
                        for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                            tm_load_assert(tm_internals.tm_canonicalize_gaf_strings_for_thesaurus(assertion_spec, thesaurus), thesaurus, UNPROVIDED);
                        }
                    }
                }
            }
            if (operation_queues.transcript_queue_size().numG($tm_load_transcript_queue_worry_size$.getDynamicValue(thread))) {
                operation_communication.save_transcript_ops();
            }
            return NIL;
        }
    }

    public static final SubLObject tm_load_binarize_assertion_specs(SubLObject lead_term_string, SubLObject assertion_specs) {
        {
            SubLObject cdolist_list_var = assertion_specs;
            SubLObject assertion_spec = NIL;
            for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                rplacd(assertion_spec, cons(lead_term_string, assertion_spec.rest()));
            }
        }
        return assertion_specs;
    }

    public static final SubLObject tm_load_canonicalize_assertion_spec_predicates(SubLObject assertion_specs) {
        {
            SubLObject cdolist_list_var = assertion_specs;
            SubLObject assertion_spec = NIL;
            for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = assertion_spec;
                    SubLObject current = datum;
                    SubLObject pred_string = NIL;
                    SubLObject arg_string = NIL;
                    SubLObject val_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    pred_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    arg_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt63);
                    val_string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject predicate = tm_internals.relation_constant_from_abbreviation(pred_string);
                            SubLObject term_arg = tm_internals.relation_term_arg_from_abbreviation(pred_string);
                            if (NIL != predicate) {
                                set_nth(ZERO_INTEGER, assertion_spec, predicate);
                                if (term_arg.numE(TWO_INTEGER)) {
                                    set_nth(ONE_INTEGER, assertion_spec, val_string);
                                    set_nth(TWO_INTEGER, assertion_spec, arg_string);
                                }
                            } else {
                                Errors.error($str_alt64$The_load_file_references_the_unkn, pred_string);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt63);
                    }
                }
            }
        }
        return assertion_specs;
    }

    public static final SubLObject tm_load_construct_fi_assert_specs(SubLObject assertion_specs, SubLObject thesaurus) {
        {
            SubLObject cdolist_list_var = assertion_specs;
            SubLObject assertion_spec = NIL;
            for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = assertion_spec;
                    SubLObject current = datum;
                    SubLObject predicate = NIL;
                    SubLObject arg1_string = NIL;
                    SubLObject arg2_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    arg1_string = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt65);
                    arg2_string = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject arg1_term = tm_find_or_create_load_term(arg1_string, thesaurus);
                            SubLObject arg2_term = arg2_string;
                            if (((NIL != tm_internals.tm_lexical_predicateP(predicate)) || (NIL != tm_internals.tm_documentation_predicateP(predicate))) || (NIL != tm_internals.tm_url_predicateP(predicate))) {
                                arg2_string = string_utilities.reduce_whitespace(arg2_string);
                            } else
                                if (NIL != tm_internals.tm_concept_predicateP(predicate)) {
                                    arg2_string = string_utilities.reduce_whitespace(arg2_string);
                                    arg2_term = tm_find_or_create_load_term(arg2_string, thesaurus);
                                } else
                                    if (tm_internals.tm_relation_argtype(predicate, TWO_INTEGER) == $STRING) {
                                        arg2_string = string_utilities.reduce_whitespace(arg2_string);
                                    }


                            set_nth(ONE_INTEGER, assertion_spec, arg1_term);
                            set_nth(TWO_INTEGER, assertion_spec, arg2_term);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt65);
                    }
                }
            }
        }
        return assertion_specs;
    }

    public static final SubLObject tm_load_construct_fi_assert_specs_with_reuse_mode_and_thesauri(SubLObject assertion_specs, SubLObject thesaurus, SubLObject reuse_mode, SubLObject reuse_thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_load_concept_reuse_mode$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_load_concept_reuse_priority_thesauri$.currentBinding(thread);
                    try {
                        $tm_load_concept_reuse_mode$.bind(reuse_mode, thread);
                        $tm_load_concept_reuse_priority_thesauri$.bind(reuse_thesauri, thread);
                        v_answer = tm_load_construct_fi_assert_specs(assertion_specs, thesaurus);
                    } finally {
                        $tm_load_concept_reuse_priority_thesauri$.rebind(_prev_bind_1, thread);
                        $tm_load_concept_reuse_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    /**
     * Analyze the thesarus contents of FILENAME wrt FORMAT and return two values:
     * a set of terms which are present in FILENAME but not in THESAURUS (and their
     * facts) (a hashtable mapping strings to input items), and a set of new thesaurus
     * facts not present in THESAURUS but present in FILENAME, for which all the PTs
     * currently exist in THESAURUS (a hashtable mapping PT strings to input items).
     */
    public static final SubLObject tm_merge_load_thesaurus_from_file(SubLObject filename, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject read_method = tm_load_read_method(format);
                if (!(((NIL != read_method) && read_method.isSymbol()) && (NIL != fboundp(read_method)))) {
                    Errors.error($str_alt41$_A_is_not_a_supported_thesaurus_l, format);
                    return NIL;
                }
                if (NIL == Filesys.probe_file(filename)) {
                    Errors.error($str_alt42$Input_file__A_does_not_exist, filename);
                    return NIL;
                }
                {
                    SubLObject load_input_hash = make_hash_table($int$1000, symbol_function(EQUALP), UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                        try {
                            control_vars.$mapping_target$.bind(load_input_hash, thread);
                            tm_load_and_process_input_file(filename, read_method, TM_LOAD_INTO_HASHTABLE, UNPROVIDED);
                        } finally {
                            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                        }
                    }
                    tm_frob_case_of_input_hash_for_thesaurus(load_input_hash, thesaurus);
                    thread.resetMultipleValues();
                    {
                        SubLObject pt_existing = tm_merge_load_categorize_input(load_input_hash, thesaurus);
                        SubLObject nonexistent = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject additions = tm_merge_load_additions(pt_existing, thesaurus);
                            return values(nonexistent, additions);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject tm_load_into_hashtable(SubLObject file_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_load_into_hashtable_internal(file_item, control_vars.$mapping_target$.getDynamicValue(thread));
        }
    }

    public static final SubLObject tm_load_into_hashtable_internal(SubLObject file_item, SubLObject load_input_hash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                format(T, $str_alt55$_______item_);
            }
            {
                SubLObject datum = file_item;
                SubLObject current = datum;
                SubLObject lead_term_spec = NIL;
                SubLObject assertion_specs = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt62);
                lead_term_spec = current.first();
                current = current.rest();
                assertion_specs = current;
                {
                    SubLObject lead_term_string = second(lead_term_spec);
                    assertion_specs = tm_load_binarize_assertion_specs(lead_term_string, assertion_specs);
                    assertion_specs = tm_load_canonicalize_assertion_spec_predicates(assertion_specs);
                    {
                        SubLObject cdolist_list_var = assertion_specs;
                        SubLObject assertion_spec = NIL;
                        for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                            tm_merge_load_note_input(assertion_spec, load_input_hash);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_merge_load_note_input(SubLObject assertion_spec, SubLObject load_input_hash) {
        {
            SubLObject key = second(assertion_spec);
            SubLObject existing = gethash(key, load_input_hash, UNPROVIDED);
            SubLObject new_value = existing;
            if (NIL != existing) {
                {
                    SubLObject item_var = assertion_spec;
                    if (NIL == member(item_var, new_value, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        new_value = cons(item_var, new_value);
                    }
                }
            } else {
                new_value = list(assertion_spec);
            }
            if (existing != new_value) {
                sethash(key, load_input_hash, new_value);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_merge_load_categorize_input(SubLObject load_input_hash, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_size = hash_table_count(load_input_hash);
                SubLObject pt_existing = make_hash_table(integerDivide(input_size, TEN_INTEGER), symbol_function(EQUALP), UNPROVIDED);
                SubLObject nonexistent = make_hash_table(integerDivide(input_size, TEN_INTEGER), symbol_function(EQUALP), UNPROVIDED);
                SubLObject table_var = load_input_hash;
                utilities_macros.$progress_note$.setDynamicValue($$$Categorizing_merge_load_items, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
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
                            SubLObject key = NIL;
                            SubLObject val = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        val = getEntryValue(cdohash_entry);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (NIL != tm_internals.concept_from_term_lexpred_in_thesaurus(key, $$preferredTerm, thesaurus)) {
                                            sethash(key, pt_existing, val);
                                        } else {
                                            sethash(tm_internals.canonicalize_string_case_for_thesaurus(key, thesaurus), nonexistent, val);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
                return values(pt_existing, nonexistent);
            }
        }
    }

    // defvar
    private static final SubLSymbol $tm_predicate_to_match$ = makeSymbol("*TM-PREDICATE-TO-MATCH*");

    // defvar
    private static final SubLSymbol $tm_first_arg_to_match$ = makeSymbol("*TM-FIRST-ARG-TO-MATCH*");

    // defvar
    private static final SubLSymbol $tm_second_arg_to_match$ = makeSymbol("*TM-SECOND-ARG-TO-MATCH*");

    // defvar
    private static final SubLSymbol $tm_matching_assertion$ = makeSymbol("*TM-MATCHING-ASSERTION*");

    // defvar
    private static final SubLSymbol $tm_matching_assertion_lock$ = makeSymbol("*TM-MATCHING-ASSERTION-LOCK*");

    /**
     * Looks for assertions in MT matching GAF-FORMULA, but case-insensitively matches
     * string args.  Assumes one arg to GAF-FORMULA will be a FORT.
     */
    public static final SubLObject tm_assertion_spec_string_lookup(SubLObject gaf_formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject datum = gaf_formula;
                SubLObject current = datum;
                SubLObject predicate = NIL;
                SubLObject arg1_term = NIL;
                SubLObject arg2_term = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt70);
                predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                arg1_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                arg2_term = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject _prev_bind_0 = $tm_predicate_to_match$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tm_first_arg_to_match$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $tm_second_arg_to_match$.currentBinding(thread);
                        try {
                            $tm_predicate_to_match$.bind(predicate, thread);
                            $tm_first_arg_to_match$.bind(arg1_term, thread);
                            $tm_second_arg_to_match$.bind(arg2_term, thread);
                            {
                                SubLObject lock = $tm_matching_assertion_lock$.getDynamicValue(thread);
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    $tm_matching_assertion$.setDynamicValue(NIL, thread);
                                    if ((NIL != forts.fort_p(arg1_term)) && arg2_term.isString()) {
                                        {
                                            SubLObject _prev_bind_0_18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1_19 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(mt, thread);
                                                kb_mapping.map_gaf_arg_index(symbol_function(TM_ASSERTION_SPEC_STRING_LOOKUP_INTERNAL), arg1_term, ONE_INTEGER, predicate, UNPROVIDED, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_19, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                    } else
                                        if (arg1_term.isString() && (NIL != forts.fort_p(arg2_term))) {
                                            {
                                                SubLObject _prev_bind_0_20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1_21 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                    mt_relevance_macros.$mt$.bind(mt, thread);
                                                    kb_mapping.map_gaf_arg_index(symbol_function(TM_ASSERTION_SPEC_STRING_LOOKUP_INTERNAL), arg2_term, TWO_INTEGER, predicate, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_21, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                        }

                                    result = $tm_matching_assertion$.getDynamicValue(thread);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } finally {
                            $tm_second_arg_to_match$.rebind(_prev_bind_2, thread);
                            $tm_first_arg_to_match$.rebind(_prev_bind_1, thread);
                            $tm_predicate_to_match$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt70);
                }
                return result;
            }
        }
    }

    public static final SubLObject tm_assertion_spec_string_lookup_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject predicate = assertions_high.gaf_arg0(assertion);
                SubLObject arg1_term = assertions_high.gaf_arg1(assertion);
                SubLObject arg2_term = assertions_high.gaf_arg2(assertion);
                SubLObject arg1_comparison = (arg1_term.isString()) ? ((SubLObject) (EQUALP)) : EQL;
                SubLObject arg2_comparison = (arg2_term.isString()) ? ((SubLObject) (EQUALP)) : EQL;
                if (predicate.eql($tm_predicate_to_match$.getDynamicValue(thread))) {
                    if ((NIL != eval(list(arg1_comparison, arg1_term, $tm_first_arg_to_match$.getDynamicValue(thread)))) && (NIL != eval(list(arg2_comparison, arg2_term, $tm_second_arg_to_match$.getDynamicValue(thread))))) {
                        $tm_matching_assertion$.setDynamicValue(assertion, thread);
                        utilities_macros.mapping_finished();
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_assertion_spec_lookup(SubLObject assertion_spec, SubLObject thesaurus) {
        {
            SubLObject datum = assertion_spec;
            SubLObject current = datum;
            SubLObject predicate = NIL;
            SubLObject arg1_string = NIL;
            SubLObject arg2_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt65);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            arg1_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt65);
            arg2_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject arg1_type = tm_internals.tm_relation_argtype(predicate, ONE_INTEGER);
                    SubLObject arg2_type = tm_internals.tm_relation_argtype(predicate, TWO_INTEGER);
                    SubLObject arg1_term = NIL;
                    SubLObject arg2_term = NIL;
                    if (arg1_type.eql($STRING)) {
                        arg1_string = string_utilities.reduce_whitespace(arg1_string);
                        arg1_term = arg1_string;
                    } else
                        if (arg1_type.eql($CONSTANT)) {
                            arg1_string = string_utilities.reduce_whitespace(arg1_string);
                            arg1_term = tm_find_load_term(arg1_string, thesaurus);
                        }

                    if (arg2_type.eql($STRING)) {
                        arg2_string = string_utilities.reduce_whitespace(arg2_string);
                        arg2_term = arg2_string;
                    } else
                        if (arg2_type.eql($CONSTANT)) {
                            arg2_string = string_utilities.reduce_whitespace(arg2_string);
                            arg2_term = tm_find_load_term(arg2_string, thesaurus);
                        }

                    if ((NIL != arg1_term) && (NIL != arg2_term)) {
                        {
                            SubLObject assertion = NIL;
                            if (arg1_type.eql($CONSTANT) && arg2_type.eql($CONSTANT)) {
                                assertion = fi.gaf_sentence_assertion(list(predicate, arg1_term, arg2_term), thesaurus);
                            } else
                                if (arg1_type.eql($CONSTANT) && arg2_type.eql($STRING)) {
                                    assertion = tm_assertion_spec_string_lookup(list(predicate, arg1_term, arg2_term), thesaurus);
                                } else
                                    if (arg1_type.eql($STRING) && arg2_type.eql($CONSTANT)) {
                                        assertion = tm_assertion_spec_string_lookup(list(predicate, arg1_term, arg2_term), thesaurus);
                                    }


                            return assertion;
                        }
                    }
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt65);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_merge_load_additions(SubLObject pt_existing, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject additions = make_hash_table(hash_table_count(pt_existing), symbol_function(EQUALP), UNPROVIDED);
                SubLObject table_var = pt_existing;
                utilities_macros.$progress_note$.setDynamicValue($$$Determining_additions, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
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
                            SubLObject key = NIL;
                            SubLObject assertion_specs = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        assertion_specs = getEntryValue(cdohash_entry);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = assertion_specs;
                                            SubLObject assertion_spec = NIL;
                                            for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                                                if (NIL == tm_assertion_spec_lookup(assertion_spec, thesaurus)) {
                                                    tm_merge_load_note_input(assertion_spec, additions);
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
                return additions;
            }
        }
    }

    /**
     * Analyze the thesaurus contents of FILENAME and compare them to the contents of
     * THESAURUS, and return a hashtable of items which are in THESAURUS but not in the file.
     * The hashtable maps constants to a list of assertions having the constant as arg1.
     */
    public static final SubLObject tm_thesaurus_difference_from_file(SubLObject filename, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject read_method = tm_load_read_method(format);
                if (!(((NIL != read_method) && read_method.isSymbol()) && (NIL != fboundp(read_method)))) {
                    Errors.error($str_alt41$_A_is_not_a_supported_thesaurus_l, format);
                    return NIL;
                }
                if (NIL == Filesys.probe_file(filename)) {
                    Errors.error($str_alt42$Input_file__A_does_not_exist, filename);
                    return NIL;
                }
                {
                    SubLObject load_input_hash = make_hash_table($int$1000, symbol_function(EQUALP), UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
                        try {
                            control_vars.$mapping_target$.bind(load_input_hash, thread);
                            tm_load_and_process_input_file(filename, read_method, TM_LOAD_INTO_HASHTABLE, UNPROVIDED);
                        } finally {
                            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
                        }
                    }
                    tm_frob_case_of_input_hash_for_thesaurus(load_input_hash, thesaurus);
                    {
                        SubLObject deletions = tm_process_thesaurus_difference(thesaurus, load_input_hash);
                        return deletions;
                    }
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tm_thesaurus_difference_hash$ = makeSymbol("*TM-THESAURUS-DIFFERENCE-HASH*");

    // defparameter
    private static final SubLSymbol $tm_thesaurus_load_input_hash$ = makeSymbol("*TM-THESAURUS-LOAD-INPUT-HASH*");

    // defparameter
    private static final SubLSymbol $tm_thesaurus_preferred_term_hash$ = makeSymbol("*TM-THESAURUS-PREFERRED-TERM-HASH*");

    /**
     * List of terms that will be deleted
     */
    // defparameter
    private static final SubLSymbol $tm_thesaurus_preferred_term_deletions$ = makeSymbol("*TM-THESAURUS-PREFERRED-TERM-DELETIONS*");

    public static final SubLObject tm_process_thesaurus_difference(SubLObject thesaurus, SubLObject load_input_hash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject load_input_count = hash_table_count(load_input_hash);
                SubLObject preferred_term_hash = tm_load_input_preferred_term_hash(load_input_hash);
                SubLObject difference_hash = make_hash_table(integerDivide(load_input_count, TEN_INTEGER), UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $tm_thesaurus_load_input_hash$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_thesaurus_preferred_term_hash$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $tm_thesaurus_difference_hash$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $tm_thesaurus_preferred_term_deletions$.currentBinding(thread);
                    SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        $tm_thesaurus_load_input_hash$.bind(load_input_hash, thread);
                        $tm_thesaurus_preferred_term_hash$.bind(preferred_term_hash, thread);
                        $tm_thesaurus_difference_hash$.bind(difference_hash, thread);
                        $tm_thesaurus_preferred_term_deletions$.bind(NIL, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        kb_mapping.map_mt_contents(symbol_function(TM_PROCESS_THESAURUS_DIFFERENCE_INTERNAL), thesaurus, UNPROVIDED, UNPROVIDED);
                        tm_find_timestamped_assertions_to_delete(thesaurus);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                        $tm_thesaurus_preferred_term_deletions$.rebind(_prev_bind_3, thread);
                        $tm_thesaurus_difference_hash$.rebind(_prev_bind_2, thread);
                        $tm_thesaurus_preferred_term_hash$.rebind(_prev_bind_1, thread);
                        $tm_thesaurus_load_input_hash$.rebind(_prev_bind_0, thread);
                    }
                }
                return difference_hash;
            }
        }
    }

    public static final SubLObject tm_load_input_preferred_term_hash(SubLObject load_input_hash) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject preferred_term_hash = make_hash_table(hash_table_count(load_input_hash), symbol_function(EQUALP), UNPROVIDED);
                SubLObject table_var = load_input_hash;
                utilities_macros.$progress_note$.setDynamicValue($$$Noting_all_preferred_terms, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
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
                            SubLObject arg1 = NIL;
                            SubLObject assertion_specs = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        arg1 = getEntryKey(cdohash_entry);
                                        assertion_specs = getEntryValue(cdohash_entry);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        if (NIL == gethash(arg1, preferred_term_hash, UNPROVIDED)) {
                                            sethash(arg1, preferred_term_hash, T);
                                        }
                                        {
                                            SubLObject cdolist_list_var = assertion_specs;
                                            SubLObject assertion_spec = NIL;
                                            for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = assertion_spec;
                                                    SubLObject current = datum;
                                                    SubLObject predicate = NIL;
                                                    SubLObject arg1_22 = NIL;
                                                    SubLObject arg2 = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt77);
                                                    predicate = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt77);
                                                    arg1_22 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt77);
                                                    arg2 = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL != tm_internals.tm_concept_predicateP(predicate)) {
                                                            if (NIL == gethash(arg2, preferred_term_hash, UNPROVIDED)) {
                                                                sethash(arg2, preferred_term_hash, T);
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt77);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
                return preferred_term_hash;
            }
        }
    }

    public static final SubLObject tm_process_thesaurus_difference_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) && (NIL == assertions_low.asserted_assertion_timestampedP(assertion))) {
                {
                    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                    SubLObject arg1_constant = NIL;
                    SubLObject datum = assertions_high.gaf_formula(assertion);
                    SubLObject current = datum;
                    SubLObject predicate = NIL;
                    SubLObject arg1_term = NIL;
                    SubLObject arg2_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt70);
                    predicate = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt70);
                    arg1_term = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt70);
                    arg2_term = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != forts.fort_p(arg1_term)) {
                            arg1_constant = arg1_term;
                            arg1_term = tm_datastructures.concept_term(arg1_term, thesaurus);
                        }
                        if (NIL != forts.fort_p(arg2_term)) {
                            arg2_term = tm_datastructures.concept_term(arg2_term, thesaurus);
                        }
                        if ($$preferredTerm == assertions_high.gaf_predicate(assertion)) {
                            if (NIL == gethash(arg1_term, $tm_thesaurus_preferred_term_hash$.getDynamicValue(thread), UNPROVIDED)) {
                                sethash(assertion, $tm_thesaurus_difference_hash$.getDynamicValue(thread), T);
                                tm_possibly_note_top_deletion(assertion);
                                $tm_thesaurus_preferred_term_deletions$.setDynamicValue(cons(arg1_constant, $tm_thesaurus_preferred_term_deletions$.getDynamicValue(thread)), thread);
                            }
                        } else {
                            if (NIL == tm_assertion_spec_hash_lookup($tm_thesaurus_load_input_hash$.getDynamicValue(thread), predicate, arg1_term, arg2_term)) {
                                sethash(assertion, $tm_thesaurus_difference_hash$.getDynamicValue(thread), T);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt70);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_possibly_note_top_deletion(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject datum = assertions_high.gaf_formula(assertion);
                SubLObject current = datum;
                SubLObject predicate = NIL;
                SubLObject arg1_term = NIL;
                SubLObject arg2_term = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt70);
                predicate = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                arg1_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt70);
                arg2_term = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (predicate == $$preferredTerm) {
                        {
                            SubLObject top_assertions = kb_mapping.gather_gaf_arg_index(arg1_term, ONE_INTEGER, $$topInThesaurus, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                            SubLObject cdolist_list_var = top_assertions;
                            SubLObject top_assertion = NIL;
                            for (top_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_assertion = cdolist_list_var.first()) {
                                if (assertions_high.gaf_arg2(top_assertion) == thesaurus) {
                                    sethash(top_assertion, $tm_thesaurus_difference_hash$.getDynamicValue(thread), T);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt70);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_find_timestamped_assertions_to_delete(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = $tm_thesaurus_preferred_term_deletions$.getDynamicValue(thread);
                SubLObject constant = NIL;
                for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                    {
                        SubLObject assertions_to_check = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                assertions_to_check = kb_mapping.gather_term_assertions(constant, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var_23 = assertions_to_check;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , assertion = cdolist_list_var_23.first()) {
                                if ((((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) && (NIL != assertions_low.asserted_assertion_timestampedP(assertion))) && assertions_high.assertion_mt(assertion).eql(thesaurus)) {
                                    sethash(assertion, $tm_thesaurus_difference_hash$.getDynamicValue(thread), T);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_assertion_spec_hash_lookup(SubLObject load_input_hash, SubLObject predicate, SubLObject arg1, SubLObject arg2) {
        if (NIL != tm_assertion_spec_hash_lookup_internal(load_input_hash, predicate, arg1, arg2)) {
            return T;
        }
        if (NIL == kb_accessors.symmetric_predicateP(predicate)) {
            return NIL;
        }
        if (NIL != tm_assertion_spec_hash_lookup_internal(load_input_hash, predicate, arg2, arg1)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject tm_assertion_spec_hash_lookup_internal(SubLObject load_input_hash, SubLObject predicate, SubLObject arg1, SubLObject arg2) {
        if (arg1.isString()) {
            {
                SubLObject val = gethash(arg1, load_input_hash, UNPROVIDED);
                SubLObject arg1_test = ((NIL != fort_types_interface.predicateP(predicate)) && tm_internals.tm_relation_argtype(predicate, ONE_INTEGER).eql($CONSTANT)) ? ((SubLObject) (symbol_function(EQUALP))) : symbol_function(EQUAL);
                SubLObject arg2_test = ((NIL != fort_types_interface.predicateP(predicate)) && tm_internals.tm_relation_argtype(predicate, TWO_INTEGER).eql($CONSTANT)) ? ((SubLObject) (symbol_function(EQUALP))) : NIL != tm_internals.tm_lexical_predicateP(predicate) ? ((SubLObject) (symbol_function(EQUALP))) : symbol_function(EQUAL);
                if (NIL != val) {
                    {
                        SubLObject cdolist_list_var = val;
                        SubLObject assertion_spec = NIL;
                        for (assertion_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion_spec = cdolist_list_var.first()) {
                            if ((el_utilities.literal_predicate(assertion_spec, UNPROVIDED).equal(predicate) && (NIL != funcall(arg1_test, el_utilities.literal_arg1(assertion_spec, UNPROVIDED), arg1))) && (NIL != funcall(arg2_test, el_utilities.literal_arg2(assertion_spec, UNPROVIDED), arg2))) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * a list of 5-tuples: (<thesaurus> <new-term-hash> <addition-hash> <deletion-hash> <concept-reuse-info>).
     * Keeps the state of any update load in progress.  There can
     * be only one for each thesaurus.
     */
    // defparameter
    public static final SubLSymbol $tm_update_load_state$ = makeSymbol("*TM-UPDATE-LOAD-STATE*");

    // defparameter
    public static final SubLSymbol $tm_update_load_state_lock$ = makeSymbol("*TM-UPDATE-LOAD-STATE-LOCK*");

    public static final SubLObject tm_update_load_state() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_update_load_state$.getDynamicValue(thread);
        }
    }

    public static final SubLObject tm_update_load_state_for_thesaurus(SubLObject thesaurus) {
        SubLTrampolineFile.checkType(thesaurus, $sym80$THESAURUS_);
        return assoc(thesaurus, tm_update_load_state(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tm_clear_thesaurus_from_update_load_state(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_update_load_state_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject thesaurus_state = tm_update_load_state_for_thesaurus(thesaurus);
                        if (NIL != thesaurus_state) {
                            {
                                SubLObject datum = thesaurus_state;
                                SubLObject current = datum;
                                SubLObject thes = NIL;
                                SubLObject new_term_hash = NIL;
                                SubLObject addition_hash = NIL;
                                SubLObject deletion_hash = NIL;
                                SubLObject concept_reuse_info = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt81);
                                thes = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt81);
                                new_term_hash = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt81);
                                addition_hash = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt81);
                                deletion_hash = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt81);
                                concept_reuse_info = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (new_term_hash.isHashtable()) {
                                        clrhash(new_term_hash);
                                    }
                                    if (addition_hash.isHashtable()) {
                                        clrhash(addition_hash);
                                    }
                                    if (deletion_hash.isHashtable()) {
                                        clrhash(deletion_hash);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt81);
                                }
                            }
                            $tm_update_load_state$.setDynamicValue(remove(thesaurus, $tm_update_load_state$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns a hashtable mapping constants to a list of assertions having the constant as arg1;
     * These are assertions which are present in THESAURUS but not indicated in FILENAME read
     * using input format FORMAT.
     */
    public static final SubLObject tm_thesaurus_deletions_from_file(SubLObject filename, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject deletions_hash = tm_thesaurus_difference_from_file(filename, thesaurus, format);
                SubLObject sorted_deletions_hash = make_hash_table($int$1000, UNPROVIDED, UNPROVIDED);
                SubLObject table_var = deletions_hash;
                utilities_macros.$progress_note$.setDynamicValue($$$Sorting_deletions_by_term, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
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
                            SubLObject assertion = NIL;
                            SubLObject val = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        assertion = getEntryKey(cdohash_entry);
                                        val = getEntryValue(cdohash_entry);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                                            hash_table_utilities.pushnew_hash(arg1, assertion, sorted_deletions_hash, UNPROVIDED);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
                return sorted_deletions_hash;
            }
        }
    }

    /**
     * Perform Update Load analysis for THESAURUS wrt FILENAME and FORMAT,
     * and store changes on *TM-UPDATE-LOAD-STATE*.
     */
    public static final SubLObject tm_update_load(SubLObject filename, SubLObject thesaurus, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tm_clear_thesaurus_from_update_load_state(thesaurus);
            thread.resetMultipleValues();
            {
                SubLObject new_term_hash = tm_merge_load_thesaurus_from_file(filename, thesaurus, format);
                SubLObject addition_hash = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject deletion_hash = tm_thesaurus_deletions_from_file(filename, thesaurus, format);
                    SubLObject load_state = list(thesaurus, new_term_hash, addition_hash, deletion_hash, $UNKNOWN);
                    SubLObject lock = $tm_update_load_state_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        $tm_update_load_state$.setDynamicValue(cons(load_state, $tm_update_load_state$.getDynamicValue(thread)), thread);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                return $tm_update_load_state$.getDynamicValue(thread);
            }
        }
    }

    public static final SubLObject tm_update_load_postprocessing(SubLObject thesaurus) {
        {
            SubLObject tops = tm_load_tops(thesaurus);
            SubLObject cdolist_list_var = tops;
            SubLObject top = NIL;
            for (top = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top = cdolist_list_var.first()) {
                tm_internals.assert_thesaurus_top(top, thesaurus);
            }
        }
        html_tm_update.tm_update_change_thesaurus_timestamp(thesaurus);
        return NIL;
    }

    /**
     * For use only in tm-canonicalize-gaf-strings-during-input-file-frobbing
     */
    // defvar
    private static final SubLSymbol $tm_current_thesaurus_for_input_file_frobbing$ = makeSymbol("*TM-CURRENT-THESAURUS-FOR-INPUT-FILE-FROBBING*");

    /**
     * For use only by tm-frob-case-of-input-hash-for-thesaurus.
     */
    public static final SubLObject tm_canonicalize_gaf_strings_during_input_file_frobbing(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return tm_internals.tm_canonicalize_gaf_strings_for_thesaurus(gaf, $tm_current_thesaurus_for_input_file_frobbing$.getDynamicValue(thread));
        }
    }

    /**
     * Preconditions:  (hash-table-p input-hash) => T
     * (thesaurus? thesaurus) => T
     * input-hash is a hashtable of key value pairs where each
     * key is a string and each value is a list of gafs for assertion/unassertion.
     * Postconditions:  input-hash has been destructively altered so that each element of the
     * value list is in the case style of thesaurus
     */
    public static final SubLObject tm_frob_case_of_input_hash_for_thesaurus(SubLObject input_hash, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_hash, HASH_TABLE_P);
            SubLTrampolineFile.checkType(thesaurus, $sym80$THESAURUS_);
            {
                SubLObject string_case_style = tm_internals.tm_case_style_to_use_for_thesaurus(thesaurus);
                if (string_case_style.eql(tm_internals.$tm_default_case_as_is$.getGlobalValue()) || (NIL == string_case_style)) {
                    return input_hash;
                }
            }
            {
                SubLObject _prev_bind_0 = $tm_current_thesaurus_for_input_file_frobbing$.currentBinding(thread);
                try {
                    $tm_current_thesaurus_for_input_file_frobbing$.bind(thesaurus, thread);
                    {
                        SubLObject table_var = input_hash;
                        utilities_macros.$progress_note$.setDynamicValue($str_alt84$Changing_Input_to_Thesaurus_Case_, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_24 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
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
                                    SubLObject key = NIL;
                                    SubLObject val = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                key = getEntryKey(cdohash_entry);
                                                val = getEntryValue(cdohash_entry);
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                sethash(key, input_hash, Mapping.mapcar(symbol_function(TM_CANONICALIZE_GAF_STRINGS_DURING_INPUT_FILE_FROBBING), val));
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_24, thread);
                            }
                        }
                    }
                } finally {
                    $tm_current_thesaurus_for_input_file_frobbing$.rebind(_prev_bind_0, thread);
                }
            }
            return input_hash;
        }
    }

    /**
     * Preconditions:  (hash-table-p input-hash) => T
     * (hash-table-p result-hash) => T
     * (thesaurus? thesaurus) => T
     * input-hash is a hashtable of key value pairs where each
     * key is a string and each value is a list of gafs for assertion/unassertion.
     * The key has the exact case as read from the input file.
     * Postconditions: If the key put into the case style for the thesaurus does not match the
     * current case of the preferred term, then a new gaf is pushed onto key's
     * index in result-hash.  If add is non-nil, then the gaf is of the form
     * (#$preferredTerm
     * key
     * (canonicalize-string-case-for-thesaurus key thesaurus))
     * else
     * (#$preferredTerm
     * key
     * (concept-term
     * (concept-from-term-lexpred-in-thesaurus key #$preferredTerm thesaurus)
     * thesaurus))
     */
    public static final SubLObject tm_update_pt_case_from_input_hash(SubLObject input_hash, SubLObject result_hash, SubLObject thesaurus, SubLObject add) {
        if (add == UNPROVIDED) {
            add = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_hash, HASH_TABLE_P);
            SubLTrampolineFile.checkType(result_hash, HASH_TABLE_P);
            SubLTrampolineFile.checkType(thesaurus, $sym80$THESAURUS_);
            {
                SubLObject table_var = input_hash;
                utilities_macros.$progress_note$.setDynamicValue($str_alt86$Checking_Case_of_Preferred_Terms_, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
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
                            SubLObject key = NIL;
                            SubLObject val = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        val = getEntryValue(cdohash_entry);
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject concept = tm_internals.concept_from_term_lexpred_in_thesaurus(key, $$preferredTerm, thesaurus);
                                            SubLObject old_pt_string = NIL;
                                            SubLObject new_pt_string = NIL;
                                            if (NIL != concept) {
                                                old_pt_string = tm_datastructures.concept_term(concept, thesaurus);
                                                new_pt_string = tm_internals.canonicalize_string_case_for_thesaurus(key, thesaurus);
                                                if (!old_pt_string.equal(new_pt_string)) {
                                                    if (NIL != add) {
                                                        hash_table_utilities.pushnew_hash(key, list($$preferredTerm, key, new_pt_string), result_hash, symbol_function(EQUAL));
                                                    } else {
                                                        hash_table_utilities.pushnew_hash(key, list($$preferredTerm, key, old_pt_string), result_hash, symbol_function(EQUAL));
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
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
            return result_hash;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_copy_source_subset$ = makeSymbol("*TM-COPY-SOURCE-SUBSET*");

    // defparameter
    private static final SubLSymbol $tm_copy_target_thesaurus$ = makeSymbol("*TM-COPY-TARGET-THESAURUS*");

    // defparameter
    private static final SubLSymbol $tm_copy_assertions_seen$ = makeSymbol("*TM-COPY-ASSERTIONS-SEEN*");

    /**
     * Copy a subset of the thesaurus named SOURCE-THESAURUS-NAME to the thesaurus
     * named TARGET-THESAURUS-NAME.
     * If TARGET-TERM-NAME is non-nil, then terms copied without BTs are given
     * the term with TARGET-TERM-name  as their BT.
     * START-TERM-NAMES are the terms from which to start recursively including
     * in the subset.
     * CUTOFF-TERM-NAMES are terms beyond which we won't recurse.
     * CUTOFF-LEVEL, if present, is a level below the START-TERMS beyond which we
     * won't recurse.
     * All assertions which involve terms present in either the subset or
     * TARGET-THESAURUS are included.
     */
    public static final SubLObject tm_api_copy_thesaurus(SubLObject source_thesaurus_name, SubLObject target_thesaurus_name, SubLObject target_term_name, SubLObject start_term_names, SubLObject cutoff_term_names, SubLObject cutoff_level) {
        if (target_term_name == UNPROVIDED) {
            target_term_name = NIL;
        }
        if (start_term_names == UNPROVIDED) {
            start_term_names = NIL;
        }
        if (cutoff_term_names == UNPROVIDED) {
            cutoff_term_names = NIL;
        }
        if (cutoff_level == UNPROVIDED) {
            cutoff_level = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(source_thesaurus_name, STRINGP);
            SubLTrampolineFile.checkType(target_thesaurus_name, STRINGP);
            if (NIL != target_term_name) {
                SubLTrampolineFile.checkType(target_term_name, STRINGP);
            }
            if (NIL != start_term_names) {
                SubLTrampolineFile.checkType(start_term_names, LISTP);
            }
            if (NIL != cutoff_term_names) {
                SubLTrampolineFile.checkType(cutoff_term_names, LISTP);
            }
            if (NIL != cutoff_level) {
                SubLTrampolineFile.checkType(cutoff_level, INTEGERP);
            }
            {
                SubLObject source_thesaurus = NIL;
                SubLObject target_thesaurus = NIL;
                SubLObject target_term = NIL;
                SubLObject start_terms = NIL;
                SubLObject cutoff_terms = NIL;
                if (source_thesaurus_name.equalp(target_thesaurus_name)) {
                    return format(NIL, $str_alt89$Copy_failed__the_source_and_targe);
                }
                source_thesaurus = tm_internals.thesaurus_constant_from_name(source_thesaurus_name);
                if (NIL == tm_internals.thesaurusP(source_thesaurus)) {
                    return format(NIL, $str_alt90$Copy_failed___A_is_not_the_name_o, source_thesaurus_name);
                }
                target_thesaurus = tm_internals.thesaurus_constant_from_name(target_thesaurus_name);
                if (NIL == tm_internals.thesaurusP(target_thesaurus)) {
                    return format(NIL, $str_alt90$Copy_failed___A_is_not_the_name_o, target_thesaurus_name);
                }
                if (NIL != target_term_name) {
                    thread.resetMultipleValues();
                    {
                        SubLObject status = tm_validate_term_name(target_term_name, target_thesaurus);
                        SubLObject result = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = status;
                            if (pcase_var.eql($SUCCESS)) {
                                target_term = result;
                            } else
                                if (pcase_var.eql($FAILURE)) {
                                    return cconcatenate($str_alt93$Copy_failed__, result);
                                } else {
                                    return $str_alt94$Copy_failed_to_understand_target_;
                                }

                        }
                    }
                }
                if (NIL != start_term_names) {
                    {
                        SubLObject cdolist_list_var = start_term_names;
                        SubLObject start_term_name = NIL;
                        for (start_term_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start_term_name = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject status = tm_validate_term_name(start_term_name, source_thesaurus);
                                SubLObject result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject pcase_var = status;
                                    if (pcase_var.eql($SUCCESS)) {
                                        start_terms = cons(result, start_terms);
                                    } else
                                        if (pcase_var.eql($FAILURE)) {
                                            return cconcatenate($str_alt93$Copy_failed__, result);
                                        } else {
                                            return $str_alt95$Copy_failed_to_understand_some_st;
                                        }

                                }
                            }
                        }
                    }
                }
                if (NIL != cutoff_term_names) {
                    {
                        SubLObject cdolist_list_var = cutoff_term_names;
                        SubLObject cutoff_term_name = NIL;
                        for (cutoff_term_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cutoff_term_name = cdolist_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject status = tm_validate_term_name(cutoff_term_name, source_thesaurus);
                                SubLObject result = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject pcase_var = status;
                                    if (pcase_var.eql($SUCCESS)) {
                                        start_terms = cons(result, start_terms);
                                    } else
                                        if (pcase_var.eql($FAILURE)) {
                                            return cconcatenate($str_alt93$Copy_failed__, result);
                                        } else {
                                            return $str_alt96$Copy_failed_to_understand_some_cu;
                                        }

                                }
                            }
                        }
                    }
                }
                {
                    SubLObject error = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    tm_copy_thesaurus_subset(source_thesaurus, target_thesaurus, target_term, start_terms, cutoff_terms, cutoff_level, UNPROVIDED);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error) {
                        return cconcatenate($str_alt98$Copy_failed_with_error__, error);
                    } else {
                        return $$$Copy_succeeded;
                    }
                }
            }
        }
    }

    /**
     * Look up TERM-NAME in THESAURUS to find its Cyc concept.  Return two values: :SUCCESS and the concept, or :FAILURE and an explanation string.
     */
    public static final SubLObject tm_validate_term_name(SubLObject term_name, SubLObject thesaurus) {
        term_name = tm_internals.canonicalize_lexical_term(term_name);
        {
            SubLObject concept = NIL;
            SubLObject lexpred = NIL;
            try {
                concept = tm_internals.concept_from_term_lexpred_in_thesaurus(term_name, $$preferredTerm, thesaurus);
            } catch (Throwable ccatch_env_var) {
                lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
            }
            if (NIL != lexpred) {
                return values($FAILURE, format(NIL, $str_alt106$_A_has_multiple_preferred_term_st, term_name, tm_internals.thesaurus_name(thesaurus)));
            }
            if (NIL != forts.valid_fortP(concept)) {
                return values($SUCCESS, concept);
            } else {
                return values($FAILURE, format(NIL, $str_alt107$Invalid_term_name___A_is_not_a_pr, term_name, tm_internals.thesaurus_name(thesaurus)));
            }
        }
    }

    public static final SubLObject tm_make_copy_log_pathname(SubLObject filename) {
        return format(NIL, $str_alt108$_a_a, tm_datastructures.$tm_log_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject tm_make_copy_log_filename() {
        if (NIL == control_vars.cyc_image_id()) {
            control_vars.set_cyc_image_id();
        }
        {
            SubLObject time = numeric_date_utilities.timestring(UNPROVIDED);
            SubLObject filename = NIL;
            time = substitute(CHAR_hyphen, CHAR_slash, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            time = substitute(CHAR_hyphen, CHAR_colon, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            time = substitute(CHAR_hyphen, CHAR_space, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            filename = format(NIL, $str_alt109$copy_log__a, time);
            return filename;
        }
    }

    /**
     * Returns a pathname for a Copy Thesaurus log file.  If FILENAME is specified, use it; otherwise, generate one.
     */
    public static final SubLObject tm_new_copy_log_pathname(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (NIL == filename) {
            filename = tm_make_copy_log_filename();
        }
        return tm_make_copy_log_pathname(filename);
    }

    // defparameter
    private static final SubLSymbol $tm_copy_skipped_facts_log_stream$ = makeSymbol("*TM-COPY-SKIPPED-FACTS-LOG-STREAM*");

    /**
     * Copy a subset of THESAURUS to TARGET-THESAURUS.
     * If TARGET-TERM is non-nil, then copied terms without BTs are given TARGET-TERM as a BT.
     * START-TERMS are the terms from which to start recursively including in the subset.
     * If START-TERMS are nil, the tops of THESAURUS are used.
     * CUTOFF-TERMS are terms beyond which we won't recurse.
     * CUTOFF-LEVEL, if present, is a level below the START-TERMS beyond which we won't recurse.
     * All assertions which involve terms present in either the subset or TARGET-THESAURUS are included,
     * unless they are skipped.
     * If SKIPPED-FACTS-LOG is a valid pathname, assertions that are not copied are logged to that file.
     */
    public static final SubLObject tm_copy_thesaurus_subset(SubLObject thesaurus, SubLObject target_thesaurus, SubLObject target_term, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level, SubLObject skipped_facts_log) {
        if (skipped_facts_log == UNPROVIDED) {
            skipped_facts_log = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            SubLTrampolineFile.checkType(target_thesaurus, FORT_P);
            if (NIL != target_term) {
                SubLTrampolineFile.checkType(target_term, FORT_P);
            }
            SubLTrampolineFile.checkType(start_terms, LISTP);
            SubLTrampolineFile.checkType(cutoff_terms, LISTP);
            if (NIL != skipped_facts_log) {
                SubLTrampolineFile.checkType(skipped_facts_log, STRINGP);
            }
            if (NIL != cutoff_level) {
                SubLTrampolineFile.checkType(cutoff_level, FIXNUMP);
            }
            {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $tm_copy_source_subset$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $tm_copy_target_thesaurus$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $tm_copy_assertions_seen$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        $tm_copy_source_subset$.bind(tm_thesaurus_subset_contents_table(thesaurus, start_terms, cutoff_terms, cutoff_level), thread);
                        $tm_copy_target_thesaurus$.bind(target_thesaurus, thread);
                        $tm_copy_assertions_seen$.bind(make_hash_table(hash_table_count($tm_copy_source_subset$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject combined_total = multiply(TWO_INTEGER, hash_table_count($tm_copy_source_subset$.getDynamicValue(thread)));
                            tm_thinking.tm_thinking_set_progress_total(combined_total, UNPROVIDED);
                            tm_thinking.tm_thinking_set_progress_sofar(ZERO_INTEGER, UNPROVIDED);
                            {
                                SubLObject progress_message = format(NIL, $str_alt111$Copying__S_subset_to__S, thesaurus, target_thesaurus);
                                if (NIL != skipped_facts_log) {
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = compatibility.open_text(skipped_facts_log, $OUTPUT, NIL);
                                            if (!stream.isStream()) {
                                                Errors.error($str_alt35$Unable_to_open__S, skipped_facts_log);
                                            }
                                            {
                                                SubLObject stream_25 = stream;
                                                {
                                                    SubLObject _prev_bind_0_26 = $tm_copy_skipped_facts_log_stream$.currentBinding(thread);
                                                    try {
                                                        $tm_copy_skipped_facts_log_stream$.bind(stream_25, thread);
                                                        {
                                                            SubLObject table_var = $tm_copy_source_subset$.getDynamicValue(thread);
                                                            utilities_macros.$progress_note$.setDynamicValue(progress_message, thread);
                                                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                            utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                            {
                                                                SubLObject _prev_bind_0_27 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_28 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_29 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                                SubLObject _prev_bind_3_30 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                                    {
                                                                        SubLObject concept = NIL;
                                                                        SubLObject val = NIL;
                                                                        {
                                                                            final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                                            try {
                                                                                while (iteratorHasNext(cdohash_iterator)) {
                                                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                    concept = getEntryKey(cdohash_entry);
                                                                                    val = getEntryValue(cdohash_entry);
                                                                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                    kb_mapping.map_gaf_arg_index(symbol_function(TM_COPY_THESAURUS_SUBSET_INTERNAL), concept, ONE_INTEGER, NIL, $TRUE, thesaurus);
                                                                                    kb_mapping.map_gaf_arg_index(symbol_function(TM_COPY_THESAURUS_SUBSET_INTERNAL), concept, TWO_INTEGER, NIL, $TRUE, thesaurus);
                                                                                    tm_thinking.tm_thinking_cinc_sofar(UNPROVIDED);
                                                                                } 
                                                                            } finally {
                                                                                releaseEntrySetIterator(cdohash_iterator);
                                                                            }
                                                                        }
                                                                    }
                                                                    utilities_macros.noting_percent_progress_postamble();
                                                                } finally {
                                                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_30, thread);
                                                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_29, thread);
                                                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_28, thread);
                                                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_27, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        $tm_copy_skipped_facts_log_stream$.rebind(_prev_bind_0_26, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject table_var = $tm_copy_source_subset$.getDynamicValue(thread);
                                        utilities_macros.$progress_note$.setDynamicValue(progress_message, thread);
                                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0_32 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1_33 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2_34 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3_35 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject concept = NIL;
                                                    SubLObject val = NIL;
                                                    {
                                                        final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                        try {
                                                            while (iteratorHasNext(cdohash_iterator)) {
                                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                concept = getEntryKey(cdohash_entry);
                                                                val = getEntryValue(cdohash_entry);
                                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                kb_mapping.map_gaf_arg_index(symbol_function(TM_COPY_THESAURUS_SUBSET_INTERNAL), concept, ONE_INTEGER, NIL, $TRUE, thesaurus);
                                                                kb_mapping.map_gaf_arg_index(symbol_function(TM_COPY_THESAURUS_SUBSET_INTERNAL), concept, TWO_INTEGER, NIL, $TRUE, thesaurus);
                                                                tm_thinking.tm_thinking_cinc_sofar(UNPROVIDED);
                                                            } 
                                                        } finally {
                                                            releaseEntrySetIterator(cdohash_iterator);
                                                        }
                                                    }
                                                }
                                                utilities_macros.noting_percent_progress_postamble();
                                            } finally {
                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_35, thread);
                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_34, thread);
                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_33, thread);
                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_32, thread);
                                            }
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject progress_message = format(NIL, $str_alt114$Determining_top_of__S_subset_in__, thesaurus, target_thesaurus);
                                SubLObject table_var = $tm_copy_source_subset$.getDynamicValue(thread);
                                utilities_macros.$progress_note$.setDynamicValue(progress_message, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_36 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_37 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_38 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3_39 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject concept = NIL;
                                            SubLObject val = NIL;
                                            {
                                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                                try {
                                                    while (iteratorHasNext(cdohash_iterator)) {
                                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                        concept = getEntryKey(cdohash_entry);
                                                        val = getEntryValue(cdohash_entry);
                                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                        if (NIL != tm_internals.possible_top_in_thesaurusP(concept, target_thesaurus)) {
                                                            if (NIL != target_term) {
                                                                tm_copy_subset_link_to_target(concept, target_term, target_thesaurus);
                                                            } else {
                                                                tm_internals.assert_thesaurus_top(concept, target_thesaurus);
                                                            }
                                                        }
                                                        tm_thinking.tm_thinking_cinc_sofar(UNPROVIDED);
                                                    } 
                                                } finally {
                                                    releaseEntrySetIterator(cdohash_iterator);
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_39, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_38, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_37, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_36, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $tm_copy_assertions_seen$.rebind(_prev_bind_5, thread);
                        $tm_copy_target_thesaurus$.rebind(_prev_bind_4, thread);
                        $tm_copy_source_subset$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_copy_thesaurus_subset_internal(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != tm_copy_subset_all_present(assertion)) {
                tm_copy_assertion_to_thesaurus(assertion, $tm_copy_target_thesaurus$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject tm_copy_subset_presentP(SubLObject constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != gethash(constant, $tm_copy_source_subset$.getDynamicValue(thread), UNPROVIDED)) || (NIL != tm_internals.concept_in_thesaurusP(constant, $tm_copy_target_thesaurus$.getDynamicValue(thread))));
        }
    }

    public static final SubLObject tm_copy_subset_constant_not_presentP(SubLObject constant) {
        return makeBoolean((NIL != forts.fort_p(constant)) && (NIL == tm_copy_subset_presentP(constant)));
    }

    public static final SubLObject tm_copy_subset_all_present(SubLObject assertion) {
        return makeBoolean(NIL == list_utilities.tree_find_if(symbol_function($sym115$TM_COPY_SUBSET_CONSTANT_NOT_PRESENT_), el_utilities.literal_args(assertions_high.gaf_formula(assertion), UNPROVIDED), UNPROVIDED));
    }

    /**
     * If it's not OK to copy ASSERTION to TARGET-THESAURUS, return a string
     * which explains why. Otherwise, return NIL.
     */
    public static final SubLObject tm_copy_assertion_to_thesaurus_not_okP(SubLObject assertion, SubLObject target_thesaurus) {
        {
            SubLObject source_thesaurus = assertions_high.assertion_mt(assertion);
            SubLObject target_name = tm_internals.thesaurus_name(target_thesaurus);
            if (source_thesaurus == target_thesaurus) {
                return $str_alt116$Source_and_Target_thesauri_are_id;
            }
            {
                SubLObject relation = assertions_high.gaf_arg0(assertion);
                SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                SubLObject source_pt_arg1_sign = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (tm_datastructures.sign_from_concept(arg1, $$preferredTerm, source_thesaurus))) : NIL;
                SubLObject source_pt_arg2_sign = (NIL != forts.fort_p(arg2)) ? ((SubLObject) (tm_datastructures.sign_from_concept(arg2, $$preferredTerm, source_thesaurus))) : NIL;
                if (NIL != tm_internals.tm_lexical_predicateP(relation)) {
                    if (relation == $$preferredTerm) {
                        {
                            SubLObject target_concept = tm_internals.concept_from_term_lexpred_in_thesaurus(arg2, $$preferredTerm, target_thesaurus);
                            if (NIL != target_concept) {
                                if (target_concept == arg1) {
                                    return format(NIL, $str_alt117$_S_is_already_a_preferred_term_in, arg2, target_name);
                                } else {
                                    return format(NIL, $str_alt118$_S_is_already_a_preferred_term_fo, arg2, target_name);
                                }
                            }
                        }
                        if (NIL != tm_lexical_index.lexical_lookup(arg2, $$useFor, target_thesaurus, UNPROVIDED, UNPROVIDED)) {
                            return format(NIL, $str_alt120$_S_is_a_use_for_in__A_, arg2, target_name);
                        }
                    } else
                        if (relation == $$useFor) {
                            if (NIL != tm_lexical_index.lexical_lookup(arg2, $$useFor, target_thesaurus, UNPROVIDED, UNPROVIDED)) {
                                return format(NIL, $str_alt121$_S_is_already_a_use_for_in__A, arg2, target_name);
                            }
                            if (NIL != tm_lexical_index.lexical_lookup(arg2, $$preferredTerm, target_thesaurus, UNPROVIDED, UNPROVIDED)) {
                                return format(NIL, $str_alt122$_S_is_a_preferred_term_in__A, arg2, target_name);
                            }
                            {
                                SubLObject dont_copy_pt_reason = tm_copy_assertion_to_thesaurus_not_okP(source_pt_arg1_sign, target_thesaurus);
                                if (!((NIL == dont_copy_pt_reason) || (NIL != tm_internals.pt_in_thesaurus(arg1, target_thesaurus)))) {
                                    return format(NIL, $str_alt123$__A__can_t_be_copied_to__A__becau, new SubLObject[]{ tm_datastructures.sign_term(source_pt_arg1_sign), target_name, dont_copy_pt_reason });
                                }
                            }
                        } else {
                            if (NIL != tm_lexical_index.lexical_lookup(arg2, relation, target_thesaurus, UNPROVIDED, UNPROVIDED)) {
                                return format(NIL, $str_alt124$_S_is_already_a__A_for_some_term_, new SubLObject[]{ arg2, tm_internals.tm_pred_arg_symbol(relation, ONE_INTEGER), target_name });
                            }
                            {
                                SubLObject dont_copy_pt_reason = tm_copy_assertion_to_thesaurus_not_okP(source_pt_arg1_sign, target_thesaurus);
                                if (!((NIL == dont_copy_pt_reason) || (NIL != tm_internals.pt_in_thesaurus(arg1, target_thesaurus)))) {
                                    return format(NIL, $str_alt123$__A__can_t_be_copied_to__A__becau, new SubLObject[]{ tm_datastructures.sign_term(source_pt_arg1_sign), target_name, dont_copy_pt_reason });
                                }
                            }
                        }

                } else {
                    if (NIL != source_pt_arg1_sign) {
                        {
                            SubLObject dont_copy_pt_reason = tm_copy_assertion_to_thesaurus_not_okP(source_pt_arg1_sign, target_thesaurus);
                            if (!((NIL == dont_copy_pt_reason) || (NIL != tm_internals.pt_in_thesaurus(arg1, target_thesaurus)))) {
                                return format(NIL, $str_alt123$__A__can_t_be_copied_to__A__becau, new SubLObject[]{ tm_datastructures.sign_term(source_pt_arg1_sign), target_name, dont_copy_pt_reason });
                            }
                        }
                    }
                    if (NIL != source_pt_arg2_sign) {
                        {
                            SubLObject dont_copy_pt_reason = tm_copy_assertion_to_thesaurus_not_okP(source_pt_arg2_sign, target_thesaurus);
                            if (!((NIL == dont_copy_pt_reason) || (NIL != tm_internals.pt_in_thesaurus(arg2, target_thesaurus)))) {
                                return format(NIL, $str_alt123$__A__can_t_be_copied_to__A__becau, new SubLObject[]{ tm_datastructures.sign_term(source_pt_arg2_sign), target_name, dont_copy_pt_reason });
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_copy_assertion_to_thesaurus(SubLObject assertion, SubLObject target_thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            SubLTrampolineFile.checkType(target_thesaurus, FORT_P);
            if (NIL == gethash(assertion_handles.assertion_id(assertion), $tm_copy_assertions_seen$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(assertion_handles.assertion_id(assertion), $tm_copy_assertions_seen$.getDynamicValue(thread), T);
                {
                    SubLObject reason = tm_copy_assertion_to_thesaurus_not_okP(assertion, target_thesaurus);
                    if (NIL != reason) {
                        format($tm_copy_skipped_facts_log_stream$.getDynamicValue(thread), $str_alt126$____Skipped____A, tm_copy_log_format_assertion(assertion));
                        format($tm_copy_skipped_facts_log_stream$.getDynamicValue(thread), $str_alt127$__Reason_____A, reason);
                    } else {
                        {
                            SubLObject formula = assertions_high.gaf_formula(assertion);
                            tm_load_assert(tm_internals.tm_canonicalize_gaf_strings_for_thesaurus(formula, target_thesaurus), target_thesaurus, NIL);
                            tm_timestamp_assertion();
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_copy_log_format_assertion(SubLObject assertion) {
        {
            SubLObject relation = assertions_high.gaf_arg0(assertion);
            SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            if (relation == $$preferredTerm) {
                return format(NIL, $str_alt128$_A_is_a_preferred_term, arg2);
            }
            {
                SubLObject thesaurus = assertions_high.assertion_mt(assertion);
                SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                SubLObject relation_string = tm_internals.tm_pred_arg_symbol(relation, ONE_INTEGER);
                SubLObject source_pt_arg1_sign = (NIL != forts.fort_p(arg1)) ? ((SubLObject) (tm_datastructures.sign_from_concept(arg1, $$preferredTerm, thesaurus))) : NIL;
                SubLObject source_pt_arg2_sign = (NIL != forts.fort_p(arg2)) ? ((SubLObject) (tm_datastructures.sign_from_concept(arg2, $$preferredTerm, thesaurus))) : NIL;
                SubLObject arg1_string = (NIL != tm_datastructures.signp(source_pt_arg1_sign)) ? ((SubLObject) (format(NIL, $str_alt129$__A_, tm_datastructures.sign_term(source_pt_arg1_sign)))) : format(NIL, $str_alt130$__A_, arg1);
                SubLObject arg2_string = (NIL != tm_datastructures.signp(source_pt_arg2_sign)) ? ((SubLObject) (format(NIL, $str_alt129$__A_, tm_datastructures.sign_term(source_pt_arg2_sign)))) : format(NIL, $str_alt130$__A_, arg2);
                return format(NIL, $str_alt131$__A__A__A__from__A, new SubLObject[]{ arg1_string, relation_string, arg2_string, thesaurus_name });
            }
        }
    }

    public static final SubLObject tm_copy_subset_link_to_target(SubLObject source_concept, SubLObject target_concept, SubLObject target_thesaurus) {
        {
            SubLObject formula = list($$broaderTerm, source_concept, target_concept);
            tm_load_assert(formula, target_thesaurus, NIL);
            tm_timestamp_assertion();
        }
        return NIL;
    }

    /**
     * Output filter spec for dumping a thesaurus.  NIL is a shorthand for 'everything as is'.  This is
     * actually bound to <filter-info> of the type described in thesaurus internals.
     */
    // defparameter
    public static final SubLSymbol $tm_dump_output_filter$ = makeSymbol("*TM-DUMP-OUTPUT-FILTER*");

    /**
     * The case to use when outputting lexical and conceptual relationships.
     * Possible values:  :mixed, :upper, :lower
     */
    // defparameter
    public static final SubLSymbol $tm_dump_output_case$ = makeSymbol("*TM-DUMP-OUTPUT-CASE*");

    /**
     * A-list of the file format output writer methods
     */
    // defparameter
    public static final SubLSymbol $tm_dump_write_methods$ = makeSymbol("*TM-DUMP-WRITE-METHODS*");

    /**
     * Writes the contents of THESAURUS to FILENAME using the given format
     * (:BRS, :BASIS, or :VERITY).
     * Generates an error if the format is unknown.
     */
    public static final SubLObject tm_dump_thesaurus_to_file(SubLObject thesaurus, SubLObject filename, SubLObject format) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject dump_method_info = assoc(format, $tm_dump_write_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                if (NIL == dump_method_info) {
                    Errors.error($str_alt134$_A_is_not_a_supported_thesaurus_d, format);
                    return NIL;
                }
                {
                    SubLObject datum = dump_method_info;
                    SubLObject current = datum;
                    SubLObject format_40 = NIL;
                    SubLObject write_method = NIL;
                    SubLObject map_ufsP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    format_40 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    write_method = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    map_ufsP = current.first();
                    current = current.rest();
                    {
                        SubLObject preamble = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt135);
                        current = current.rest();
                        {
                            SubLObject postamble = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt135);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt35$Unable_to_open__S, filename);
                                        }
                                        {
                                            SubLObject stream_41 = stream;
                                            tm_dump_thesaurus_to_stream(thesaurus, stream_41, write_method, map_ufsP, preamble, postamble);
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
                            } else {
                                cdestructuring_bind_error(datum, $list_alt135);
                            }
                        }
                    }
                }
            }
            return thesaurus;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_dump_thesaurus$ = makeSymbol("*TM-DUMP-THESAURUS*");

    // defparameter
    private static final SubLSymbol $tm_dump_thesaurus_stream$ = makeSymbol("*TM-DUMP-THESAURUS-STREAM*");

    // defparameter
    private static final SubLSymbol $tm_dump_thesaurus_write_method$ = makeSymbol("*TM-DUMP-THESAURUS-WRITE-METHOD*");

    public static final SubLObject tm_dump_thesaurus_to_stream(SubLObject thesaurus, SubLObject stream, SubLObject write_method, SubLObject map_ufsP, SubLObject preamble, SubLObject postamble) {
        if (preamble == UNPROVIDED) {
            preamble = NIL;
        }
        if (postamble == UNPROVIDED) {
            postamble = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $tm_dump_thesaurus$.currentBinding(thread);
                SubLObject _prev_bind_1 = $tm_dump_thesaurus_stream$.currentBinding(thread);
                SubLObject _prev_bind_2 = $tm_dump_thesaurus_write_method$.currentBinding(thread);
                try {
                    $tm_dump_thesaurus$.bind(thesaurus, thread);
                    $tm_dump_thesaurus_stream$.bind(stream, thread);
                    $tm_dump_thesaurus_write_method$.bind(write_method, thread);
                    {
                        SubLObject combined_total = add(kb_indexing.num_predicate_extent_index($$preferredTerm, thesaurus), kb_indexing.num_predicate_extent_index($$useFor, thesaurus));
                        tm_thinking.tm_thinking_set_progress_total(combined_total, UNPROVIDED);
                        tm_thinking.tm_thinking_set_progress_sofar(ZERO_INTEGER, UNPROVIDED);
                        if (NIL != preamble) {
                            funcall(preamble, thesaurus, stream);
                        }
                        utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt136$Writing__S_preferred_terms, thesaurus), thread);
                        utilities_macros.$progress_total$.setDynamicValue(kb_indexing.num_predicate_extent_index($$preferredTerm, thesaurus), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0_42 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1_43 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2_44 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                tm_lexical_index.map_lexical_direction(TM_DUMP_THESAURUS_PT_INFO, $str_alt138$, $$preferredTerm, thesaurus, UNPROVIDED, UNPROVIDED);
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_44, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_43, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_42, thread);
                            }
                        }
                        if (NIL != map_ufsP) {
                            utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt139$Writing__S_use_fors, thesaurus), thread);
                            utilities_macros.$progress_total$.setDynamicValue(kb_indexing.num_predicate_extent_index($$useFor, thesaurus), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_45 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_46 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_47 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    tm_lexical_index.map_lexical_direction(TM_DUMP_THESAURUS_UF_INFO, $str_alt138$, $$useFor, thesaurus, UNPROVIDED, UNPROVIDED);
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_47, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_46, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_45, thread);
                                }
                            }
                        }
                        if (NIL != postamble) {
                            funcall(postamble, thesaurus, stream);
                        }
                    }
                } finally {
                    $tm_dump_thesaurus_write_method$.rebind(_prev_bind_2, thread);
                    $tm_dump_thesaurus_stream$.rebind(_prev_bind_1, thread);
                    $tm_dump_thesaurus$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_thesaurus_pt_info(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (assertions_high.assertion_mt(assertion) == $tm_dump_thesaurus$.getDynamicValue(thread)) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                tm_thinking.tm_thinking_cinc_sofar(UNPROVIDED);
                {
                    SubLObject concept = tm_datastructures.sign_concept(assertion);
                    if (NIL != forts.fort_p(concept)) {
                        {
                            SubLObject assertion_specs = NIL;
                            assertion_specs = tm_dump_pt_output_item(concept, $tm_dump_thesaurus$.getDynamicValue(thread), $tm_dump_output_filter$.getDynamicValue(thread));
                            funcall($tm_dump_thesaurus_write_method$.getDynamicValue(thread), assertion_specs, $tm_dump_thesaurus_stream$.getDynamicValue(thread));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Generate a complete IO ITEM for CONSTANT in THESAURUS
     */
    public static final SubLObject tm_dump_pt_output_item(SubLObject constant, SubLObject thesaurus, SubLObject output_filter) {
        return tm_output_item(constant, list(thesaurus), output_filter, TM_DUMP_VALUE_CONVERT, TRUE);
    }

    public static final SubLObject tm_dump_value_convert(SubLObject value, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $tm_output_item_predicate$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(value)) {
                value = tm_datastructures.concept_term(value, $tm_dump_thesaurus$.getDynamicValue(thread));
            }
            if (value.isString()) {
                value = tm_dump_convert_case(predicate, value, $tm_dump_output_case$.getDynamicValue(thread));
            }
            return value;
        }
    }

    public static final SubLObject tm_dump_thesaurus_uf_info(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (assertions_high.assertion_mt(assertion) == $tm_dump_thesaurus$.getDynamicValue(thread)) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                tm_thinking.tm_thinking_cinc_sofar(UNPROVIDED);
                {
                    SubLObject concept = tm_datastructures.sign_concept(assertion);
                    SubLObject v_term = tm_datastructures.sign_term(assertion);
                    if ((NIL != forts.fort_p(concept)) && v_term.isString()) {
                        {
                            SubLObject assertion_specs = NIL;
                            assertion_specs = tm_dump_uf_output_item(v_term, concept, $tm_dump_thesaurus$.getDynamicValue(thread), $tm_dump_output_filter$.getDynamicValue(thread));
                            funcall($tm_dump_thesaurus_write_method$.getDynamicValue(thread), assertion_specs, $tm_dump_thesaurus_stream$.getDynamicValue(thread));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_uf_output_item(SubLObject v_term, SubLObject concept, SubLObject thesaurus, SubLObject output_filter) {
        v_term = tm_dump_value_convert(v_term, $$useFor);
        concept = tm_dump_value_convert(concept, $$useFor);
        if (v_term.isString() && concept.isString()) {
            {
                SubLObject output_item = list(list($$$LT, list(list(v_term))), list($$$USE, list(list(concept))));
                output_item = tm_filter_output_item(output_item, output_filter);
                output_item = tm_sort_output_item(output_item);
                return output_item;
            }
        }
        return NIL;
    }

    /**
     * Dump a subset of THESAURUS to FILENAME using dump FORMAT.
     * START-TERMS are the terms from which to start recursively including in the subset.
     * If START-TERMS are nil, the tops of THESAURUS are used.
     * CUTOFF-TERMS are terms beyond which we won't recurse.
     * CUTOFF-LEVEL, if present, is a level below the START-TERMS beyond which we won't recurse.
     * Generates an error if the format is unknown.
     */
    public static final SubLObject tm_dump_thesaurus_subset_to_file(SubLObject thesaurus, SubLObject filename, SubLObject format, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(start_terms, LISTP);
            SubLTrampolineFile.checkType(cutoff_terms, LISTP);
            if (NIL != cutoff_level) {
                SubLTrampolineFile.checkType(cutoff_level, FIXNUMP);
            }
            {
                SubLObject dump_method_info = assoc(format, $tm_dump_write_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                if (NIL == dump_method_info) {
                    Errors.error($str_alt134$_A_is_not_a_supported_thesaurus_d, format);
                    return NIL;
                }
                {
                    SubLObject datum = dump_method_info;
                    SubLObject current = datum;
                    SubLObject format_48 = NIL;
                    SubLObject write_method = NIL;
                    SubLObject map_ufsP = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    format_48 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    write_method = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt135);
                    map_ufsP = current.first();
                    current = current.rest();
                    {
                        SubLObject preamble = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt135);
                        current = current.rest();
                        {
                            SubLObject postamble = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt135);
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject stream = NIL;
                                    try {
                                        stream = compatibility.open_text(filename, $OUTPUT, NIL);
                                        if (!stream.isStream()) {
                                            Errors.error($str_alt35$Unable_to_open__S, filename);
                                        }
                                        {
                                            SubLObject stream_49 = stream;
                                            tm_dump_thesaurus_subset_to_stream(thesaurus, stream_49, write_method, preamble, postamble, start_terms, cutoff_terms, cutoff_level);
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
                            } else {
                                cdestructuring_bind_error(datum, $list_alt135);
                            }
                        }
                    }
                }
            }
            return thesaurus;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_dump_contents_table$ = makeSymbol("*TM-DUMP-CONTENTS-TABLE*");

    // defparameter
    private static final SubLSymbol $tm_dump_marked_table$ = makeSymbol("*TM-DUMP-MARKED-TABLE*");

    public static final SubLObject tm_dump_thesaurus_subset_to_stream(SubLObject thesaurus, SubLObject stream, SubLObject write_method, SubLObject preamble, SubLObject postamble, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $tm_dump_thesaurus$.currentBinding(thread);
                SubLObject _prev_bind_1 = $tm_dump_thesaurus_stream$.currentBinding(thread);
                SubLObject _prev_bind_2 = $tm_dump_thesaurus_write_method$.currentBinding(thread);
                SubLObject _prev_bind_3 = $tm_dump_contents_table$.currentBinding(thread);
                try {
                    $tm_dump_thesaurus$.bind(thesaurus, thread);
                    $tm_dump_thesaurus_stream$.bind(stream, thread);
                    $tm_dump_thesaurus_write_method$.bind(write_method, thread);
                    $tm_dump_contents_table$.bind(tm_thesaurus_subset_contents_table(thesaurus, start_terms, cutoff_terms, cutoff_level), thread);
                    {
                        SubLObject content_total = hash_table_count($tm_dump_contents_table$.getDynamicValue(thread));
                        {
                            SubLObject _prev_bind_0_50 = $tm_dump_marked_table$.currentBinding(thread);
                            try {
                                $tm_dump_marked_table$.bind(make_hash_table(content_total, UNPROVIDED, UNPROVIDED), thread);
                                utilities_macros.$progress_note$.setDynamicValue(format(NIL, $str_alt144$Writing__S_subset, thesaurus), thread);
                                utilities_macros.$progress_total$.setDynamicValue(content_total, thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                if (NIL != preamble) {
                                    funcall(preamble, thesaurus, stream);
                                }
                                {
                                    SubLObject _prev_bind_0_51 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_52 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_53 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3_54 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        if (NIL == start_terms) {
                                            start_terms = tm_internals.thesaurus_tops(thesaurus);
                                        }
                                        {
                                            SubLObject cdolist_list_var = start_terms;
                                            SubLObject start_term = NIL;
                                            for (start_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start_term = cdolist_list_var.first()) {
                                                tm_dump_thesaurus_subset_to_stream_recursive(start_term);
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3_54, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_53, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_52, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                if (NIL != postamble) {
                                    funcall(postamble, thesaurus, stream);
                                }
                            } finally {
                                $tm_dump_marked_table$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                    }
                } finally {
                    $tm_dump_contents_table$.rebind(_prev_bind_3, thread);
                    $tm_dump_thesaurus_write_method$.rebind(_prev_bind_2, thread);
                    $tm_dump_thesaurus_stream$.rebind(_prev_bind_1, thread);
                    $tm_dump_thesaurus$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_thesaurus_subset_to_stream_recursive(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != tm_dump_subset_presentP(concept)) && (NIL == tm_dump_subset_markedP(concept))) {
                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                tm_thinking.tm_thinking_note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread), UNPROVIDED);
                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                tm_mark_dump_subset_concept(concept);
                tm_dump_thesaurus_subset_item(concept);
                {
                    SubLObject narrower_concepts = tm_internals.nt(concept, $$broaderTerm, $tm_dump_thesaurus$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = narrower_concepts;
                    SubLObject narrower_concept = NIL;
                    for (narrower_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower_concept = cdolist_list_var.first()) {
                        tm_dump_thesaurus_subset_to_stream_recursive(narrower_concept);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_thesaurus_subset_item(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_specs = NIL;
                assertion_specs = tm_output_item(concept, list($tm_dump_thesaurus$.getDynamicValue(thread)), $tm_dump_output_filter$.getDynamicValue(thread), TM_DUMP_VALUE_CONVERT, TM_DUMP_SUBSET_ALL_PRESENT);
                funcall($tm_dump_thesaurus_write_method$.getDynamicValue(thread), assertion_specs, $tm_dump_thesaurus_stream$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_subset_presentP(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(concept, $tm_dump_contents_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject tm_dump_subset_markedP(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(concept, $tm_dump_marked_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static final SubLObject tm_mark_dump_subset_concept(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(concept, $tm_dump_marked_table$.getDynamicValue(thread), T);
            return NIL;
        }
    }

    public static final SubLObject tm_dump_subset_constant_not_presentP(SubLObject constant) {
        return makeBoolean((NIL != forts.fort_p(constant)) && (NIL == tm_dump_subset_presentP(constant)));
    }

    public static final SubLObject tm_dump_subset_all_present(SubLObject assertion) {
        return makeBoolean(NIL == list_utilities.tree_find_if(symbol_function($sym146$TM_DUMP_SUBSET_CONSTANT_NOT_PRESENT_), el_utilities.literal_args(assertions_high.gaf_formula(assertion), UNPROVIDED), UNPROVIDED));
    }

    /**
     * Outputs THESAURUS to FILENAME using FORMAT.  If START-TERMS, CUTOFF-TERMS,
     * or CUTOFF-LEVEL are given, only the relevant part of THESAURUS will be output.
     */
    public static final SubLObject tm_output_thesaurus_or_subset(SubLObject thesaurus, SubLObject filename, SubLObject format, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(CHAR_asterisk, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != pos) {
                    filename = cconcatenate(subseq(filename, ZERO_INTEGER, pos), Strings.string_downcase(cconcatenate(tm_internals.thesaurus_abbreviation(thesaurus), new SubLObject[]{ $str_alt147$_, princ_to_string($tm_dump_output_case$.getDynamicValue(thread)), $str_alt148$_, princ_to_string(format) }), UNPROVIDED, UNPROVIDED));
                }
            }
            if (((NIL != start_terms) || (NIL != cutoff_terms)) || (NIL != cutoff_level)) {
                return tm_dump_thesaurus_subset_to_file(thesaurus, filename, format, start_terms, cutoff_terms, cutoff_level);
            } else {
                return tm_dump_thesaurus_to_file(thesaurus, filename, format);
            }
        }
    }

    /**
     * Outputs thesaurus with THESAURUS-NAME to FILENAME using FORMAT (one of :BRS,
     * :BASIS or :VERITY).  If CASE (one of :upper, :lower, or :mixed) is specified,
     * the output is done in that text case.  If FILTER-NAME is specified, the
     * thesaurus is output using that filter.  If START-TERMS, CUTOFF-TERMS, or
     * CUTOFF-LEVEL are given, only the relevant part of THESAURUS will be output.
     * The lists START-TERMS and CUTOFF-TERMS may contain either strings (preferred
     * terms) or FORTs.
     * thesaurus-name
     * The name of the thesaurus to output.
     * filename
     * The full path and filename for the output.
     * format
     * Specifies the output format.  Must be either :BRS, :BASIS, or :VERITY.
     * case
     * Either :upper, :lower, or :mixed.  Causes the output to be done in the
     * specified case.  If this is nil, output will be in mixed case.
     * filter-name
     * The name of the output filter to use, or nil if none.  Output filters
     * can be created using the Thesaurus Manager.
     * start-terms
     * This should be a list of terms (strings).  If start-terms is non-nil,
     * only the start-terms and those terms below them in the hierarchy will
     * be included in the output.  (FORTs will work in place of term names.
     * If you don't know what those are, just use the term names.)
     * cutoff-terms
     * Used only if start-terms is non-nil.  This is a list of terms
     * (strings).  Output will not include any terms narrower than these.
     * cutoff-level
     * Used only if start-terms is non-nil.  Specifies the number of levels
     * below the start terms to include in the output.
     * Returns the filename if successful; returns an error message otherwise.
     */
    public static final SubLObject tm_output_thesaurus_to_file(SubLObject thesaurus_name, SubLObject filename, SubLObject format, SubLObject v_case, SubLObject filter_name, SubLObject start_terms, SubLObject cutoff_terms, SubLObject cutoff_level) {
        if (v_case == UNPROVIDED) {
            v_case = NIL;
        }
        if (filter_name == UNPROVIDED) {
            filter_name = NIL;
        }
        if (start_terms == UNPROVIDED) {
            start_terms = NIL;
        }
        if (cutoff_terms == UNPROVIDED) {
            cutoff_terms = NIL;
        }
        if (cutoff_level == UNPROVIDED) {
            cutoff_level = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus_name, STRINGP);
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(format, KEYWORDP);
            if (NIL != v_case) {
                SubLTrampolineFile.checkType(v_case, KEYWORDP);
            }
            if (NIL != filter_name) {
                SubLTrampolineFile.checkType(filter_name, STRINGP);
            }
            if (NIL != start_terms) {
                SubLTrampolineFile.checkType(start_terms, LISTP);
            }
            if (NIL != cutoff_terms) {
                SubLTrampolineFile.checkType(cutoff_terms, LISTP);
            }
            if (NIL != cutoff_level) {
                SubLTrampolineFile.checkType(cutoff_level, INTEGERP);
            }
            {
                SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                SubLObject filter = NIL;
                SubLObject filter_info = NIL;
                SubLObject start_term_forts = NIL;
                SubLObject cutoff_term_forts = NIL;
                if (NIL == thesaurus) {
                    return format(NIL, $str_alt150$_A_is_not_a_valid_thesaurus_name_, thesaurus_name);
                }
                if (NIL == assoc(format, $tm_dump_write_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    return format(NIL, $str_alt151$_A_is_not_a_supported_thesaurus_o, format);
                }
                if (NIL != v_case) {
                    if (NIL == subl_promotions.memberP(v_case, list($UPPER, $LOWER, $MIXED), UNPROVIDED, UNPROVIDED)) {
                        return format(NIL, $str_alt154$_A_is_not_a_valid_case___Must_be_, v_case);
                    }
                }
                if (NIL != filter_name) {
                    if (filter_name.isString()) {
                        filter = tm_internals.tm_filter_from_name(filter_name);
                    }
                    if (NIL == filter) {
                        return format(NIL, $str_alt155$_A_is_not_a_valid_output_filter_n, filter_name);
                    }
                    filter_info = tm_internals.tm_filter_info(filter, T);
                }
                if (NIL != start_terms) {
                    start_term_forts = thesaurus_strings_to_forts(start_terms, thesaurus);
                }
                if (NIL != cutoff_terms) {
                    cutoff_term_forts = thesaurus_strings_to_forts(cutoff_terms, thesaurus);
                }
                if ((NIL != cutoff_level) && cutoff_level.numL(ZERO_INTEGER)) {
                    return $str_alt156$Cutoff_level_must_be_non_negative;
                }
                if (NIL == tm_datastructures.tm_start_read_operation(thesaurus)) {
                    return cconcatenate($str_alt157$Output_of_thesaurus_, new SubLObject[]{ thesaurus_name, $str_alt158$_is_not_permitted_because_it_is_c });
                }
                try {
                    {
                        SubLObject _prev_bind_0 = $tm_dump_output_filter$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $tm_dump_output_case$.currentBinding(thread);
                        try {
                            $tm_dump_output_filter$.bind(filter_info, thread);
                            $tm_dump_output_case$.bind(v_case, thread);
                            tm_output_thesaurus_or_subset(thesaurus, filename, format, start_term_forts, cutoff_term_forts, cutoff_level);
                        } finally {
                            $tm_dump_output_case$.rebind(_prev_bind_1, thread);
                            $tm_dump_output_filter$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            tm_datastructures.tm_finish_read_operation(thesaurus);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return filename;
            }
        }
    }

    /**
     * Given a list of strings and/or FORTs, returns a list with the strings converted
     * to FORTs if they match the #$preferredTerm assertion in the given thesaurus.
     * Strings that don't match a #$preferredTerm are quietly removed, as are nil's.
     */
    public static final SubLObject thesaurus_strings_to_forts(SubLObject term_list, SubLObject thesaurus) {
        {
            SubLObject v_forts = NIL;
            SubLObject cdolist_list_var = term_list;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (v_term.isString()) {
                    v_term = tm_internals.concept_from_term_lexpred_in_thesaurus(v_term, $$preferredTerm, thesaurus);
                }
                if (NIL != v_term) {
                    v_forts = cons(v_term, v_forts);
                }
            }
            return reverse(v_forts);
        }
    }

    // defparameter
    private static final SubLSymbol $tm_dump_basis_line_length_limit$ = makeSymbol("*TM-DUMP-BASIS-LINE-LENGTH-LIMIT*");

    public static final SubLObject tm_dump_basis_file_item(SubLObject file_item, SubLObject stream) {
        {
            SubLObject cdolist_list_var = file_item;
            SubLObject file_item_line = NIL;
            for (file_item_line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file_item_line = cdolist_list_var.first()) {
                {
                    SubLObject datum = file_item_line;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    values = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        values = Mapping.mapcar(symbol_function(FIRST), values);
                        values = Sort.sort(values, symbol_function(STRING_LESSP), UNPROVIDED);
                        tm_dump_basis_file_item_internal(symbol, values, stream);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt164);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_dump_basis_file_item_internal(SubLObject symbol, SubLObject strings, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = strings;
                SubLObject string = NIL;
                for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                    string = tm_dump_basis_strip_bad_whitespace(string);
                    if (symbol.isString()) {
                        format(stream, $str_alt166$_A___, symbol);
                    } else {
                        string_utilities.indent(stream, $tm_basis_continuation_indent$.getDynamicValue(thread));
                    }
                    {
                        SubLObject length = length(string);
                        if (length.numL($tm_dump_basis_line_length_limit$.getDynamicValue(thread))) {
                            format(stream, $str_alt167$_A__, string);
                        } else {
                            {
                                SubLObject break_point = tm_dump_basis_continuation_break_point(string);
                                SubLObject pre_string = string_utilities.substring(string, ZERO_INTEGER, break_point);
                                SubLObject post_string = string_utilities.substring(string, break_point, UNPROVIDED);
                                if (NIL != string_utilities.empty_stringP(string_utilities.trim_whitespace(post_string))) {
                                    format(stream, $str_alt167$_A__, pre_string);
                                } else {
                                    format(stream, $str_alt168$_A_C__, pre_string, $tm_basis_continuation_char$.getDynamicValue(thread));
                                    tm_dump_basis_file_item_internal(NIL, list(post_string), stream);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_basis_strip_bad_whitespace(SubLObject string) {
        return string_utilities.subst_whitespace(string);
    }

    public static final SubLObject tm_dump_basis_continuation_break_point(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL($tm_dump_basis_line_length_limit$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject index = subtract($tm_dump_basis_line_length_limit$.getDynamicValue(thread), i, ONE_INTEGER);
                        SubLObject v_char = Strings.sublisp_char(string, index);
                        if (v_char.eql(CHAR_space)) {
                            return add(index, ONE_INTEGER);
                        }
                    }
                }
            }
            return length(string);
        }
    }

    // defparameter
    private static final SubLSymbol $tm_dump_brs_line_length_limit$ = makeSymbol("*TM-DUMP-BRS-LINE-LENGTH-LIMIT*");

    public static final SubLObject tm_dump_brs_file_item(SubLObject file_item, SubLObject stream) {
        {
            SubLObject cdolist_list_var = file_item;
            SubLObject file_item_line = NIL;
            for (file_item_line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file_item_line = cdolist_list_var.first()) {
                {
                    SubLObject datum = file_item_line;
                    SubLObject current = datum;
                    SubLObject symbol = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt164);
                    values = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        values = Mapping.mapcar(symbol_function(FIRST), values);
                        values = Sort.sort(values, symbol_function(STRING_LESSP), UNPROVIDED);
                        tm_dump_brs_file_item_internal(symbol, values, stream);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt164);
                    }
                }
            }
        }
        terpri(stream);
        return NIL;
    }

    public static final SubLObject tm_dump_brs_file_item_internal(SubLObject symbol, SubLObject strings, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (symbol.equalp($tm_brs_sn_symbol$.getDynamicValue(thread))) {
                {
                    SubLObject cdolist_list_var = strings;
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        tm_dump_brs_scope_note(string, stream);
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = strings;
                    SubLObject string = NIL;
                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                        tm_dump_one_brs_line(stream, symbol, string);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_brs_scope_note(SubLObject note, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_note_piece = subtract($tm_dump_brs_line_length_limit$.getDynamicValue(thread), THREE_INTEGER);
                SubLObject note_length = length(note);
                if (note_length.numLE(max_note_piece)) {
                    tm_dump_one_brs_line(stream, $tm_brs_sn_symbol$.getDynamicValue(thread), note);
                } else {
                    {
                        SubLObject break_point = tm_dump_brs_continuation_break_point(note, max_note_piece);
                        SubLObject pre_break = string_utilities.substring(note, ZERO_INTEGER, break_point);
                        SubLObject post_break = string_utilities.substring(note, break_point, NIL);
                        tm_dump_one_brs_line(stream, $tm_brs_sn_symbol$.getDynamicValue(thread), pre_break);
                        tm_dump_brs_scope_note(post_break, stream);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_one_brs_line(SubLObject stream, SubLObject symbol, SubLObject value) {
        format(stream, $str_alt170$_A__A__, symbol, value);
        return NIL;
    }

    public static final SubLObject tm_dump_brs_continuation_break_point(SubLObject string, SubLObject max_length) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(max_length); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject index = subtract(max_length, i, ONE_INTEGER);
                    SubLObject v_char = Strings.sublisp_char(string, index);
                    if (v_char.eql(CHAR_space)) {
                        return add(index, ONE_INTEGER);
                    }
                }
            }
        }
        return length(string);
    }

    public static final SubLObject tm_dump_verity_preamble(SubLObject thesaurus, SubLObject stream) {
        format(stream, $str_alt171$___A_thesaurus____A, tm_internals.thesaurus_name(thesaurus), numeric_date_utilities.datestring(UNPROVIDED));
        format(stream, $str_alt172$_____control__1__synonyms______);
        return NIL;
    }

    public static final SubLObject tm_dump_verity_file_item(SubLObject file_item, SubLObject stream) {
        if (NIL != find_if(symbol_function(TM_VERITY_SYNONYM_SYMBOL), file_item, symbol_function(CAR), UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject lt_item_line = assoc($$$LT, file_item, symbol_function(EQUALP), UNPROVIDED);
                if (NIL != lt_item_line) {
                    format(stream, $str_alt174$__list__);
                    princ(CHAR_quotation, stream);
                    {
                        SubLObject datum = lt_item_line;
                        SubLObject current = datum;
                        SubLObject symbol = NIL;
                        SubLObject lt_values = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt175);
                        symbol = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt175);
                        lt_values = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            tm_dump_verity_synonym_item(lt_values.first(), stream);
                            {
                                SubLObject cdolist_list_var = file_item;
                                SubLObject file_item_line = NIL;
                                for (file_item_line = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file_item_line = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum_55 = file_item_line;
                                        SubLObject current_56 = datum_55;
                                        SubLObject symbol_57 = NIL;
                                        SubLObject values = NIL;
                                        destructuring_bind_must_consp(current_56, datum_55, $list_alt164);
                                        symbol_57 = current_56.first();
                                        current_56 = current_56.rest();
                                        destructuring_bind_must_consp(current_56, datum_55, $list_alt164);
                                        values = current_56.first();
                                        current_56 = current_56.rest();
                                        if (NIL == current_56) {
                                            if (NIL != tm_verity_synonym_symbol(symbol_57)) {
                                                values = Sort.sort(values, symbol_function(STRING_LESSP), symbol_function(CAR));
                                                {
                                                    SubLObject cdolist_list_var_58 = values;
                                                    SubLObject value = NIL;
                                                    for (value = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , value = cdolist_list_var_58.first()) {
                                                        princ(CHAR_comma, stream);
                                                        tm_dump_verity_synonym_item(value, stream);
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_55, $list_alt164);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt175);
                        }
                    }
                    princ(CHAR_quotation, stream);
                    terpri(stream);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_dump_verity_postamble(SubLObject thesaurus, SubLObject stream) {
        format(stream, $str_alt176$_______);
        return NIL;
    }

    /**
     * A list of the relations to use when outputting a synonym list for verity.
     */
    // defparameter
    private static final SubLSymbol $tm_verity_synonym_symbols$ = makeSymbol("*TM-VERITY-SYNONYM-SYMBOLS*");

    public static final SubLObject tm_verity_synonym_symbol(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return find(v_object, $tm_verity_synonym_symbols$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    // defparameter
    private static final SubLSymbol $tm_verity_control_escape_char$ = makeSymbol("*TM-VERITY-CONTROL-ESCAPE-CHAR*");

    // defparameter
    private static final SubLSymbol $tm_verity_control_strings$ = makeSymbol("*TM-VERITY-CONTROL-STRINGS*");

    public static final SubLObject tm_verity_control_string_position(SubLObject string, SubLObject start) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return string_utilities.find_earliest_string(string, $tm_verity_control_strings$.getDynamicValue(thread), symbol_function(CHAR_EQUAL), start);
        }
    }

    public static final SubLObject tm_dump_verity_synonym_item(SubLObject file_item_value, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = file_item_value.first();
                if (string.isString()) {
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject done = NIL;
                        while (NIL == done) {
                            thread.resetMultipleValues();
                            {
                                SubLObject control_index = tm_verity_control_string_position(string, index);
                                SubLObject control_string = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == control_index) {
                                    tm_princ_verity_substring(string, stream, index, NIL);
                                    done = T;
                                } else {
                                    tm_princ_verity_substring(string, stream, index, control_index);
                                    write_char(CHAR_space, stream);
                                    write_char($tm_verity_control_escape_char$.getDynamicValue(thread), stream);
                                    string_utilities.princ_substring(control_string, stream, ONE_INTEGER, subtract(length(control_string), ONE_INTEGER));
                                    write_char($tm_verity_control_escape_char$.getDynamicValue(thread), stream);
                                    write_char(CHAR_space, stream);
                                    index = add(control_index, length(control_string));
                                }
                            }
                        } 
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $tm_verity_non_alphanumic_replacement_char$ = makeSymbol("*TM-VERITY-NON-ALPHANUMIC-REPLACEMENT-CHAR*");

    public static final SubLObject tm_princ_verity_substring(SubLObject string, SubLObject stream, SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == end) {
                end = length(string);
            }
            {
                SubLObject thestring = string_utilities.trim_whitespace(string_utilities.substring(string, start, end));
                start = ZERO_INTEGER;
                end = length(thestring);
                {
                    SubLObject last = subtract(end, ONE_INTEGER);
                    SubLObject i = NIL;
                    for (i = start; !i.numE(end); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(thestring, i);
                            if (NIL != charE(v_char, CHAR_newline)) {
                                format(stream, $str_alt180$__C, CHAR_newline);
                            } else
                                if ((NIL != alphanumericp(v_char)) || (NIL != string_utilities.whitespacep(v_char))) {
                                    write_char(v_char, stream);
                                } else
                                    if (NIL != charE(v_char, CHAR_period)) {
                                        if (i.numG(start) && i.numL(last)) {
                                            {
                                                SubLObject previous = Strings.sublisp_char(thestring, subtract(i, ONE_INTEGER));
                                                SubLObject next = Strings.sublisp_char(thestring, add(i, ONE_INTEGER));
                                                if ((NIL != alphanumericp(previous)) && (NIL != alphanumericp(next))) {
                                                    write_char(v_char, stream);
                                                } else {
                                                    write_char($tm_verity_non_alphanumic_replacement_char$.getDynamicValue(thread), stream);
                                                }
                                            }
                                        }
                                    } else {
                                        write_char($tm_verity_non_alphanumic_replacement_char$.getDynamicValue(thread), stream);
                                    }


                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_dump_convert_case(SubLObject predicate, SubLObject string, SubLObject v_case) {
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(predicate, FORT_P);
        if ((v_case == $MIXED) || (predicate == $$scopeNote)) {
            return string;
        } else {
            {
                SubLObject pcase_var = v_case;
                if (pcase_var.eql($UPPER)) {
                    return Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($LOWER)) {
                        return Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
                    } else {
                        return string;
                    }

            }
        }
    }

    /**
     * Output to PATHNAME information about terms that have correlations across the thesauri designated
     * by THESAURI-NAMES.  For each concept having a preferred term in one of the thesauri specified,
     * a line will be output if that concept has PTs in more than one of the thesauri.  If OMIT-CYC-CORRELATES?
     * is nil (which is the default), a line will be output for a concept if it has a PT in only one of the
     * thesauri, but it's a full-fledged Cyc concept (not just a concept generated to hold thesaurus knowledge).
     * If OMIT-CYC-CORRELATES? is non-nil, those one-PT lines won't be printed.
     * The form of each line output is as follows.  All fields are separated by vertical bars, and strings
     * containing vertical bars will have them precededby by the escape character:
     * cyc-concept|preferred-term-string1|thesaurus-name1|...|preferred-term-string-n|thesaurus-name-n
     */
    public static final SubLObject tm_output_correlation_information(SubLObject pathname, SubLObject thesauri_names, SubLObject omit_cyc_correlatesP) {
        if (thesauri_names == UNPROVIDED) {
            thesauri_names = tm_internals.all_thesauri_names();
        }
        if (omit_cyc_correlatesP == UNPROVIDED) {
            omit_cyc_correlatesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pathname, STRINGP);
            SubLTrampolineFile.checkType(thesauri_names, CONSP);
            SubLTrampolineFile.checkType(omit_cyc_correlatesP, BOOLEANP);
            {
                SubLObject thesauri = NIL;
                SubLObject warnings = $str_alt138$;
                if (NIL == file_utilities.file_valid_for_writing_p(pathname)) {
                    return format(NIL, $str_alt184$Error__The_file__S_is_not_writabl, pathname);
                }
                if (NIL == thesauri_names) {
                    return $str_alt185$Error__You_have_not_specified_any;
                }
                if ((NIL != list_utilities.singletonP(thesauri_names)) && (NIL == omit_cyc_correlatesP)) {
                    warnings = nconc(warnings, format(NIL, $str_alt186$__Warning__You_have_only_specifie));
                }
                if ((NIL != list_utilities.singletonP(thesauri_names)) && (NIL != omit_cyc_correlatesP)) {
                    return $str_alt187$Error__You_have_only_specified_on;
                }
                {
                    SubLObject cdolist_list_var = thesauri_names;
                    SubLObject thesaurus_name = NIL;
                    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus_name = cdolist_list_var.first()) {
                        {
                            SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
                            if (NIL == tm_internals.thesaurusP(thesaurus)) {
                                return format(NIL, $str_alt188$Error__The_string__S_is_not_the_n, thesaurus_name);
                            }
                            thesauri = cons(thesaurus, thesauri);
                        }
                    }
                }
                thesauri = Sort.sort(thesauri, symbol_function(STRING_LESSP), symbol_function(THESAURUS_NAME));
                {
                    SubLObject concept_hash = make_hash_table($int$1024, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = thesauri;
                    SubLObject thesaurus = NIL;
                    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                mt_relevance_macros.$mt$.bind(thesaurus, thread);
                                {
                                    SubLObject pred_var = $$preferredTerm;
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_59 = NIL;
                                                                    SubLObject token_var_60 = NIL;
                                                                    while (NIL == done_var_59) {
                                                                        {
                                                                            SubLObject sign = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_60);
                                                                            SubLObject valid_61 = makeBoolean(token_var_60 != sign);
                                                                            if (NIL != valid_61) {
                                                                                sethash(tm_datastructures.sign_concept(sign), concept_hash, T);
                                                                            }
                                                                            done_var_59 = makeBoolean(NIL == valid_61);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_62, thread);
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
                    }
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(pathname, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt35$Unable_to_open__S, pathname);
                            }
                            {
                                SubLObject stream_63 = stream;
                                tm_output_correlation_information_header(thesauri, stream_63);
                                {
                                    SubLObject concept = NIL;
                                    SubLObject val = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(concept_hash);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                concept = getEntryKey(cdohash_entry);
                                                val = getEntryValue(cdohash_entry);
                                                tm_possibly_output_correlation_information_for_concept(concept, thesauri, stream_63, omit_cyc_correlatesP);
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
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
                return format(NIL, $str_alt190$___A___A, warnings, pathname);
            }
        }
    }

    public static final SubLObject tm_output_correlation_information_header(SubLObject thesauri, SubLObject stream) {
        format(stream, $str_alt195$____Correlation_information_for_t);
        format(stream, $str_alt196$__);
        {
            SubLObject cdolist_list_var = thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                format(stream, $str_alt197$_S_, tm_internals.thesaurus_name(thesaurus));
            }
        }
        format(stream, $str_alt198$_____A, numeric_date_utilities.time_abbreviation_string(get_universal_time()));
        format(stream, $str_alt199$____Code_version__A, system_info.cyc_revision_string());
        format(stream, $str_alt200$____KB_version__A, operation_communication.kb_version_string());
        format(stream, $str_alt201$__);
        return NIL;
    }

    public static final SubLObject tm_correlated_concept_p(SubLObject concept, SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = tm_internals.all_thesauri();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (NIL == list_utilities.singletonP(thesauri)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                            mt_relevance_macros.$relevant_mts$.bind(thesauri, thread);
                            {
                                SubLObject signs = kb_mapping.gather_gaf_arg_index(concept, ONE_INTEGER, $$preferredTerm, UNPROVIDED, UNPROVIDED);
                                if (length(signs).numGE(TWO_INTEGER)) {
                                    result = T;
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tm_possibly_output_correlation_information_for_concept(SubLObject concept, SubLObject thesauri, SubLObject stream, SubLObject omit_cyc_correlatesP) {
        if ((NIL != tm_correlated_concept_p(concept, thesauri)) || ((NIL == omit_cyc_correlatesP) && (NIL == tm_internals.thesaurus_gensymP(concept)))) {
            return tm_output_correlation_information_for_concept(concept, thesauri, stream);
        }
        return NIL;
    }

    public static final SubLObject tm_output_correlation_information_for_concept(SubLObject concept, SubLObject thesauri, SubLObject stream) {
        format(stream, $str_alt202$___A, string_utilities.fort_to_string(concept));
        {
            SubLObject cdolist_list_var = thesauri;
            SubLObject thesaurus = NIL;
            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                {
                    SubLObject preferred_term = tm_internals.pt_in_thesaurus(concept, thesaurus);
                    SubLObject thesaurus_name = tm_internals.thesaurus_name(thesaurus);
                    thesaurus_name = string_utilities.insert_escape_for_chars_in_string($list_alt203, thesaurus_name);
                    if (preferred_term.isString()) {
                        preferred_term = string_utilities.insert_escape_for_chars_in_string($list_alt203, preferred_term);
                        format(stream, $str_alt204$___A____A_, preferred_term, thesaurus_name);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Used internally by tm-pred-symbol-<
     */
    // defparameter
    private static final SubLSymbol $tm_pred_symbol_sort_order$ = makeSymbol("*TM-PRED-SYMBOL-SORT-ORDER*");

    /**
     * Used internally by ordering functions.
     */
    // defconstant
    private static final SubLSymbol $core_pred_symbol_order_relations$ = makeSymbol("*CORE-PRED-SYMBOL-ORDER-RELATIONS*");

    /**
     * Initializes *tm-pred-symbol-sort-order* to default value.
     */
    public static final SubLObject init_pred_symbol_order() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_pred_symbol_sort_order$.setDynamicValue(copy_list($core_pred_symbol_order_relations$.getGlobalValue()), thread);
            return $tm_pred_symbol_sort_order$.getDynamicValue(thread);
        }
    }

    /**
     * Initializes *tm-pred-symbol-sort-order* from information
     * in the KB.  If there is no information in the KB, uses default
     * initialization.  There should be only one order assertion in the
     * KB, otherwise the semantics are not well defined.
     */
    public static final SubLObject init_pred_symbol_order_from_kb() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_value = map_kb_list_to_pred_symbol_order();
                result_value = nreverse(result_value);
                result_value = remove_duplicates(result_value, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                result_value = nreverse(result_value);
                if (NIL != result_value) {
                    $tm_pred_symbol_sort_order$.setDynamicValue(result_value, thread);
                } else {
                    init_pred_symbol_order();
                }
            }
            return $tm_pred_symbol_sort_order$.getDynamicValue(thread);
        }
    }

    /**
     * Replaces current order in kb with new order.  Each relation in *core-pred-symbol-order-relations*
     * must occur in new-list-order; each one that is not in new-list-order is added to the
     * front so that the final order is similar to *core-pred-symbol-order-relations*.
     * Duplicates are removed from new-list-order in no guaranteed order.
     */
    public static final SubLObject store_pred_symbol_order_in_kb(SubLObject new_list_order) {
        {
            SubLObject new_value = remove_duplicates(new_list_order, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject current_value = kb_mapping.gather_predicate_extent_index($$tmRelationOrderList, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
            {
                SubLObject cdolist_list_var = reverse($core_pred_symbol_order_relations$.getGlobalValue());
                SubLObject relation = NIL;
                for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(relation, new_value, symbol_function(EQUALP), UNPROVIDED)) {
                        new_value = cons(relation, new_value);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = current_value;
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        tm_unassert(assertions_high.gaf_formula(assertion), assertions_high.assertion_mt(assertion));
                    }
                }
            }
            tm_assert(list($$tmRelationOrderList, map_pred_symbol_list_to_kb_list(new_value)), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
        }
        return T;
    }

    /**
     * Returns three values: ops, message-to-user-list, and error-message-list.
     * Ops are ops to be performed based on the values passed in.  Message-to-user-list
     * is a message to print to the user about a reason why operations couldn't proceed, but
     * not necessarily an error condition. It can be used with
     * (apply #'tm-message-to-user message-to-user-list).  Error message list is a message to
     * print to the user about a reason why the values specified caused an error.  It can be
     * used with (apply #'tm-error error-message-list)
     * At most, only one value returned should be non-nil at a time. When there are no changes to
     * be performed, all values returned are nil.
     * The list of operations, if executed sequentially, will store
     * in the KB the proper information so that the new pred symbol order
     * in kb corresponds to that given in new-list-order.  Each relation in *core-pred-symbol-order-relations*
     * must occur in new-list-order; each one that is not in new-list-order is added to the
     * front so that the final order is similar to *core-pred-symbol-order-relations*.
     * Duplicates are removed from new-list-order in no guaranteed order.  If the ops returned are
     * executed then init-pred-symbol-order-from-kb must be called afterwards to do final cleanup.
     */
    public static final SubLObject make_ops_to_change_pred_symbol_order_in_kb(SubLObject new_list_order) {
        {
            SubLObject new_value = remove_duplicates(new_list_order, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject current_value = kb_mapping.gather_predicate_extent_index($$tmRelationOrderList, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
            SubLObject ops = NIL;
            SubLObject cdolist_list_var = reverse($core_pred_symbol_order_relations$.getGlobalValue());
            SubLObject relation = NIL;
            for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(relation, new_value, symbol_function(EQUALP), UNPROVIDED)) {
                    new_value = cons(relation, new_value);
                }
            }
            if (!new_value.equalp(get_pred_symbol_sort_order())) {
                {
                    SubLObject op2 = tm_datastructures.get_tm_op();
                    SubLObject op = op2;
                    tm_datastructures._csetf_tm_op_opcode(op, $ADD);
                    tm_datastructures._csetf_tm_op_relation(op, $$tmRelationOrderList);
                    tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                    tm_datastructures._csetf_tm_op_args(op, list(map_pred_symbol_list_to_kb_list(new_value)));
                    tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                    tm_datastructures._csetf_tm_op_status(op, NIL);
                    tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                    tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                    tm_datastructures._csetf_tm_op_description(op, NIL);
                    tm_datastructures._csetf_tm_op_description_args(op, NIL);
                    if (format(NIL, $str_alt208$_Ordering_of_Relations__a_, remove($$$LT, new_value, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)).isString()) {
                        html_tm_editing.set_op_english(op, format(NIL, $str_alt208$_Ordering_of_Relations__a_, remove($$$LT, new_value, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    } else {
                        html_tm_editing.set_op_english(op, UNPROVIDED);
                    }
                    ops = cons(op2, ops);
                }
                if (NIL != current_value) {
                    {
                        SubLObject op1 = tm_datastructures.get_tm_op();
                        SubLObject op = op1;
                        tm_datastructures._csetf_tm_op_opcode(op, $DELETE);
                        tm_datastructures._csetf_tm_op_relation(op, $$tmRelationOrderList);
                        tm_datastructures._csetf_tm_op_inverseP(op, NIL);
                        tm_datastructures._csetf_tm_op_args(op, list(second(assertions_high.gaf_formula(current_value.first()))));
                        tm_datastructures._csetf_tm_op_thesaurus(op, tm_datastructures.$tm_mt$.getGlobalValue());
                        tm_datastructures._csetf_tm_op_status(op, NIL);
                        tm_datastructures._csetf_tm_op_verifyP(op, NIL);
                        tm_datastructures._csetf_tm_op_hiddenP(op, NIL);
                        tm_datastructures._csetf_tm_op_description(op, NIL);
                        tm_datastructures._csetf_tm_op_description_args(op, NIL);
                        if (format(NIL, $str_alt208$_Ordering_of_Relations__a_, remove($$$LT, get_pred_symbol_sort_order(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)).isString()) {
                            html_tm_editing.set_op_english(op, format(NIL, $str_alt208$_Ordering_of_Relations__a_, remove($$$LT, get_pred_symbol_sort_order(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                        } else {
                            html_tm_editing.set_op_english(op, UNPROVIDED);
                        }
                        ops = cons(op1, ops);
                    }
                }
            }
            return values(ops, NIL, NIL);
        }
    }

    /**
     * If any new-entry in new-entries does not occur in order list, adds it to the list and
     * updates KB.  Returns two values.  Returns T if all new-entries are in the
     * ordering and KB after the call, else nil.
     */
    public static final SubLObject add_entries_to_pred_symbol_sort_order(SubLObject new_entries) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entries_not_found = remove_if(symbol_function($sym210$FOUND_IN_PRED_SYMBOL_SORT_ORDER_), new_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != entries_not_found) {
                    {
                        SubLObject current_value = kb_mapping.gather_predicate_extent_index($$tmRelationOrderList, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject cdolist_list_var = current_value;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            if (NIL != assertion_handles.assertion_p(assertion)) {
                                tm_unassert(assertions_high.gaf_formula(assertion), assertions_high.assertion_mt(assertion));
                            }
                        }
                        $tm_pred_symbol_sort_order$.setDynamicValue(nconc($tm_pred_symbol_sort_order$.getDynamicValue(thread), entries_not_found), thread);
                        tm_assert(list($$tmRelationOrderList, map_pred_symbol_list_to_kb_list($tm_pred_symbol_sort_order$.getDynamicValue(thread))), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        return T;
                    }
                } else {
                    return T;
                }
            }
        }
    }

    /**
     * If any entry in entries occurs in order list, it is removed from the list.  The KB
     * is updated to reflect this.  Returns T if entries are no longer in list
     * or KB after call, else nil.
     */
    public static final SubLObject remove_entries_from_pred_symbol_sort_order(SubLObject entries) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found = NIL;
                if (NIL == found) {
                    {
                        SubLObject csome_list_var = entries;
                        SubLObject entry = NIL;
                        for (entry = csome_list_var.first(); !((NIL != found) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , entry = csome_list_var.first()) {
                            found = found_in_pred_symbol_sort_orderP(entry);
                        }
                    }
                }
                if (NIL != found) {
                    {
                        SubLObject current_value = kb_mapping.gather_predicate_extent_index($$tmRelationOrderList, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                        SubLObject cdolist_list_var = current_value;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            if (NIL != assertion_handles.assertion_p(assertion)) {
                                tm_unassert(assertions_high.gaf_formula(assertion), assertions_high.assertion_mt(assertion));
                            }
                        }
                    }
                    {
                        SubLObject result = copy_list($tm_pred_symbol_sort_order$.getDynamicValue(thread));
                        SubLObject cdolist_list_var = entries;
                        SubLObject entry = NIL;
                        for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                            result = delete(entry, result, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        $tm_pred_symbol_sort_order$.setDynamicValue(result, thread);
                    }
                    tm_assert(list($$tmRelationOrderList, map_pred_symbol_list_to_kb_list($tm_pred_symbol_sort_order$.getDynamicValue(thread))), tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED);
                    return T;
                } else {
                    return T;
                }
            }
        }
    }

    /**
     * If entry is present replaces it with new-entry. It is an error condition if
     * new-entry is already in the list.  It is assumed that new-entry refers to the
     * same relation that entry refers to.  If it does not, this function is not
     * appropriate.  Returns T if after call entry is not in table and new-entry is,
     * else nil.
     */
    public static final SubLObject replace_entry_in_pred_symbol_order_list(SubLObject entry, SubLObject new_entry) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject position = position_in_pred_symbol_sort_order(entry);
                if (NIL != found_in_pred_symbol_sort_orderP(new_entry)) {
                    Errors.error($str_alt211$Attempted_to_replace__a_with__a__, entry, new_entry, new_entry);
                } else
                    if (NIL == position) {
                        return NIL;
                    } else {
                        set_nth(position, $tm_pred_symbol_sort_order$.getDynamicValue(thread), new_entry);
                        return T;
                    }

            }
            return NIL;
        }
    }

    /**
     * Accessor for *tm-pred-symbol-sort-order*
     */
    public static final SubLObject get_pred_symbol_sort_order() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $tm_pred_symbol_sort_order$.getDynamicValue(thread);
        }
    }

    /**
     * Returns T if entry is in sort order.  Else nil.
     */
    public static final SubLObject found_in_pred_symbol_sort_orderP(SubLObject entry) {
        return member(entry, get_pred_symbol_sort_order(), symbol_function(EQUALP), UNPROVIDED);
    }

    /**
     * Returns a position number for entry if entry is in pred-symbol-sort-order
     * else returns nil
     */
    public static final SubLObject position_in_pred_symbol_sort_order(SubLObject entry) {
        return position(entry, get_pred_symbol_sort_order(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject map_pred_symbol_list_to_kb_list(SubLObject relation_symbol_list) {
        return cons($$TheList, Mapping.mapcar(symbol_function(MAKE_KB_LIST_FROM_PRED_SYMBOL), relation_symbol_list));
    }

    public static final SubLObject make_kb_list_from_pred_symbol(SubLObject relation_symbol) {
        {
            SubLObject relation_constant = NIL;
            SubLObject relation_term_arg = NIL;
            if (relation_symbol.equalp($$$SYN)) {
                relation_constant = $$tmSynonym;
                relation_term_arg = ONE_INTEGER;
            } else
                if (relation_symbol.equalp($$$LT)) {
                    relation_constant = $$preferredTerm;
                    relation_term_arg = ONE_INTEGER;
                } else {
                    relation_constant = tm_internals.relation_constant_from_abbreviation(relation_symbol);
                    relation_term_arg = tm_internals.relation_term_arg_from_abbreviation(relation_symbol);
                }

            return list($$TheList, relation_constant, relation_term_arg);
        }
    }

    public static final SubLObject map_kb_list_to_pred_symbol_order() {
        {
            SubLObject kb_list = kb_mapping_utilities.pred_refs_in_mt($$tmRelationOrderList, tm_datastructures.$tm_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return Mapping.mapcar(symbol_function(FIND_RELATION_SYMBOL_WITH_CONSTANT_TERM_ARG), cycl_utilities.nat_args(kb_list.first(), UNPROVIDED));
        }
    }

    /**
     * arg1 of constant-term-arg-list should be a Thesaurus predicate constant.  arg2
     * should be the index for the term arg of the relation.  Arg0 is #$TheList.
     */
    public static final SubLObject find_relation_symbol_with_constant_term_arg(SubLObject constant_term_arg_list) {
        if (cycl_utilities.nat_arg1(constant_term_arg_list, UNPROVIDED).eql($$tmSynonym)) {
            return $$$SYN;
        } else
            if (cycl_utilities.nat_arg1(constant_term_arg_list, UNPROVIDED).eql($$preferredTerm)) {
                return $$$LT;
            } else {
                return tm_internals.tm_pred_arg_symbol(cycl_utilities.nat_arg1(constant_term_arg_list, UNPROVIDED), cycl_utilities.nat_arg2(constant_term_arg_list, UNPROVIDED));
            }

    }

    /**
     * Find or create a concept for STRING which is suitable to use during a load
     * of THESAURUS.  Reuse concepts only from the thesauri in THESAURUS-LIST, and prefer
     * those that come earlier in that list.
     */
    public static final SubLObject tm_find_or_create_load_term_prioritized(SubLObject string, SubLObject thesaurus, SubLObject thesaurus_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_concept = NIL;
                {
                    SubLObject _prev_bind_0 = $tm_load_concept_reuse_mode$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $tm_load_concept_reuse_priority_thesauri$.currentBinding(thread);
                    try {
                        $tm_load_concept_reuse_mode$.bind($PRIORITY, thread);
                        $tm_load_concept_reuse_priority_thesauri$.bind(thesaurus_list, thread);
                        new_concept = tm_find_or_create_load_term(string, thesaurus);
                    } finally {
                        $tm_load_concept_reuse_priority_thesauri$.rebind(_prev_bind_1, thread);
                        $tm_load_concept_reuse_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_concept;
            }
        }
    }

    /**
     * Find or create a concept for STRING which is suitable to use during importing of content
     * into THESAURUS.  Reuse concepts only from the thesauri in THESAURUS-LIST, and prefer
     * those that come earlier in that list.  Add bookkeeping information to the preferredTerm
     * assertion that was added, refering to the user with USER-STRING and the purpose PURPOSE.
     */
    public static final SubLObject tm_find_or_create_load_term_prioritized_timestamped(SubLObject string, SubLObject thesaurus, SubLObject thesaurus_list, SubLObject user_string, SubLObject purpose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = tm_datastructures.$tm_user$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        tm_datastructures.$tm_user$.bind(user_string, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(user_string), thread);
                        result = tm_find_or_create_load_term_prioritized(string, thesaurus, thesaurus_list);
                        tm_timestamp_assertion_with_purpose(purpose);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        tm_datastructures.$tm_user$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Find or create a concept for STRING which is suitable to use during Load Thesaurus.
     */
    public static final SubLObject tm_find_or_create_load_term(SubLObject string, SubLObject thesaurus) {
        {
            SubLObject existing = tm_find_load_term(string, thesaurus);
            return NIL != existing ? ((SubLObject) (existing)) : tm_create_load_term(string, thesaurus);
        }
    }

    public static final SubLObject tm_find_load_term(SubLObject string, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string_in_thesaurus = tm_internals.concept_from_term_lexpred_in_thesaurus(string, $$preferredTerm, thesaurus);
                if (NIL != string_in_thesaurus) {
                    return string_in_thesaurus;
                }
                if ($tm_load_concept_reuse_mode$.getDynamicValue(thread) != $NONE) {
                    {
                        SubLObject concept_to_use = tm_concept_from_other_thesauri(string);
                        if (NIL != concept_to_use) {
                            if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                                format(T, $str_alt219$_____reusing__S_for__S_in__S, new SubLObject[]{ concept_to_use, string, thesaurus });
                            }
                            tm_note_concept_for_load_term(string, concept_to_use, thesaurus);
                            return concept_to_use;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Find or create a concept for STRING which is suitable to use during Add Term.
     */
    public static final SubLObject tm_find_or_create_add_term(SubLObject string) {
        {
            SubLObject existing = tm_concept_from_other_thesauri(string);
            return NIL != existing ? ((SubLObject) (existing)) : tm_generate_concept(string);
        }
    }

    /**
     * Return a concept for STRING from some other thesaurus which is OK to use.
     */
    public static final SubLObject tm_concept_from_other_thesauri(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject signs = tm_lexical_index.lexpred_signs_all_thesauri(string, $$preferredTerm);
                SubLObject other_thesauri_uses = delete_duplicates(Mapping.mapcar(symbol_function(SIGN_CONCEPT), signs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject concept_to_use = NIL;
                if ($tm_load_concept_reuse_mode$.getDynamicValue(thread) == $PRIORITY) {
                    if (NIL == concept_to_use) {
                        {
                            SubLObject csome_list_var = $tm_load_concept_reuse_priority_thesauri$.getDynamicValue(thread);
                            SubLObject reuse_thesaurus = NIL;
                            for (reuse_thesaurus = csome_list_var.first(); !((NIL != concept_to_use) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , reuse_thesaurus = csome_list_var.first()) {
                                {
                                    SubLObject sign = find(reuse_thesaurus, signs, symbol_function(EQUAL), symbol_function(SIGN_THESAURUS), UNPROVIDED, UNPROVIDED);
                                    if (NIL != sign) {
                                        concept_to_use = tm_datastructures.sign_concept(sign);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (($tm_load_concept_reuse_mode$.getDynamicValue(thread) == $ANY) || (($tm_load_concept_reuse_mode$.getDynamicValue(thread) == $UNIQUE) && (NIL != list_utilities.singletonP(other_thesauri_uses)))) {
                        concept_to_use = other_thesauri_uses.first();
                    }

                return concept_to_use;
            }
        }
    }

    /**
     * Create a concept for preferred term STRING in THESAURUS
     */
    public static final SubLObject tm_create_term(SubLObject string, SubLObject thesaurus) {
        {
            SubLObject new_concept = tm_generate_concept(string);
            tm_note_concept_for_load_term(string, new_concept, thesaurus);
            return new_concept;
        }
    }

    /**
     * Create a concept for preferred term STRING in THESAURUS during loading
     */
    public static final SubLObject tm_create_load_term(SubLObject string, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_concept = tm_create_term(string, thesaurus);
                $tm_concepts_created_during_load$.setDynamicValue(cons(new_concept, $tm_concepts_created_during_load$.getDynamicValue(thread)), thread);
                return new_concept;
            }
        }
    }

    /**
     * The preferred term STRING will be implemented by CONSTANT in THESAURUS
     */
    public static final SubLObject tm_note_concept_for_load_term(SubLObject string, SubLObject constant, SubLObject thesaurus) {
        return tm_load_assert(tm_internals.tm_canonicalize_gaf_strings_for_thesaurus(list($$preferredTerm, constant, string), thesaurus), thesaurus, UNPROVIDED);
    }

    /**
     * Create a Cyc constant with name = CONSTANT-NAME.  CONSTANT-NAME must be
     * a valid, unique constant name.
     */
    public static final SubLObject tm_create(SubLObject constant_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(constant_name, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != constants_high.find_constant(constant_name)) {
                    Errors.error($str_alt223$Error__Constant_name__A_is_alread, constant_name);
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        result = ke.ke_create(constant_name);
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Generate a Cyc concept for a thesaurus preferred term of STRING
     */
    public static final SubLObject tm_generate_concept(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject new_concept = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = ke.$note_old_constant_name$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        ke.$note_old_constant_name$.bind(NIL, thread);
                        if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                            format(T, $str_alt224$___FI_CREATE__UNNAMED_);
                        }
                        new_concept = fi.fi_create($UNNAMED, UNPROVIDED);
                        {
                            SubLObject suggested_name = tm_suggested_concept_name(new_concept, string);
                            if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                                format(T, $str_alt226$___FI_RENAME___S___S_, new_concept, suggested_name);
                            }
                            fi.fi_rename(new_concept, suggested_name);
                        }
                    } finally {
                        ke.$note_old_constant_name$.rebind(_prev_bind_3, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                tm_load_assert(listS($$isa, new_concept, $list_alt228), $thesaurus_test_constant_mt$.getGlobalValue(), UNPROVIDED);
                return new_concept;
            }
        }
    }

    /**
     * Assert gaf FORMULA in MT during thesaurus loading.
     * I FORWARD-PROPAGATE, allow forward inference. We don't timestamp; loaded
     * assertions rely on the timestamp of the thesaurus.
     */
    public static final SubLObject tm_load_assert(SubLObject formula, SubLObject mt, SubLObject forward_propagate) {
        if (forward_propagate == UNPROVIDED) {
            forward_propagate = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$simplify_sentenceP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = control_vars.$within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_6 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_11 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_12 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    SubLObject _prev_bind_13 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    SubLObject _prev_bind_14 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    SubLObject _prev_bind_15 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_16 = wff_utilities.$check_arityP$.currentBinding(thread);
                    SubLObject _prev_bind_17 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        czer_vars.$simplify_sentenceP$.bind(NIL, thread);
                        kb_control_vars.$forward_inference_enabledP$.bind(forward_propagate, thread);
                        control_vars.$within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        wff_utilities.$check_arityP$.bind(NIL, thread);
                        cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                        if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                            format(T, $str_alt229$___FI_ASSERT___S___S__MONOTONIC_, formula, mt);
                        }
                        ans = fi.fi_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                    } finally {
                        cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_17, thread);
                        wff_utilities.$check_arityP$.rebind(_prev_bind_16, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_15, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_14, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_13, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_12, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_11, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_10, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_9, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_8, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_7, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_6, thread);
                        control_vars.$within_assert$.rebind(_prev_bind_5, thread);
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_4, thread);
                        czer_vars.$simplify_sentenceP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_assert(SubLObject formula, SubLObject mt, SubLObject forward_propagate) {
        if (forward_propagate == UNPROVIDED) {
            forward_propagate = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        kb_control_vars.$forward_inference_enabledP$.bind(forward_propagate, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                            format(T, $str_alt230$___FI_ASSERT___S___S_, formula, mt);
                        }
                        ans = fi.fi_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                    } finally {
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_5, thread);
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_4, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_unassert(SubLObject formula, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                        if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                            format(T, $str_alt231$___FI_UNASSERT___S___S_, formula, mt);
                        }
                        ans = fi.fi_unassert(formula, mt);
                    } finally {
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_4, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_load_unassert_assertion(SubLObject assertion) {
        return tm_unassert(assertions_high.gaf_formula(assertion), assertions_high.assertion_mt(assertion));
    }

    /**
     * Timestamp the last thesaurus assert
     */
    public static final SubLObject tm_timestamp_assertion() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        ans = fi.fi_timestamp_assertion(operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), NIL, numeric_date_utilities.get_universal_second(UNPROVIDED));
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Timestamp the last thesaurus assert, including the purpose.
     */
    public static final SubLObject tm_timestamp_assertion_with_purpose(SubLObject purpose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(purpose, FORT_P);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        ans = fi.fi_timestamp_assertion(operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), purpose, numeric_date_utilities.get_universal_second(UNPROVIDED));
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_load_kill(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                        if (NIL != $tm_load_verboseP$.getDynamicValue(thread)) {
                            format(T, $str_alt232$___FI_KILL___S_, concept);
                        }
                        ans = fi.fi_kill(concept);
                    } finally {
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_4, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject tm_set_thesaurus_timestamp(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                    tm_load_assert(list($$thesaurusLoadedBy, thesaurus, operation_communication.the_cyclist()), tm_datastructures.$tm_mt$.getGlobalValue(), T);
                    tm_load_assert(list($$thesaurusLoadDate, thesaurus, numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED)), tm_datastructures.$tm_mt$.getGlobalValue(), T);
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return thesaurus;
        }
    }

    public static final SubLObject tm_correlate_merge(SubLObject kill_concept, SubLObject keep_concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_3 = czer_vars.$simplify_sentenceP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding(thread);
                    SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding(thread);
                    SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                    SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                    SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding(thread);
                    SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    SubLObject _prev_bind_15 = wff_utilities.$check_arityP$.currentBinding(thread);
                    SubLObject _prev_bind_16 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                    try {
                        control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                        czer_vars.$simplify_sentenceP$.bind(NIL, thread);
                        control_vars.$within_assert$.bind(NIL, thread);
                        wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                        at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                        wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                        wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                        wff_utilities.$check_var_typesP$.bind(NIL, thread);
                        czer_vars.$simplify_literalP$.bind(NIL, thread);
                        at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                        at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                        wff_vars.$validate_constantsP$.bind(NIL, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        wff_utilities.$check_arityP$.bind(NIL, thread);
                        cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                        ans = fi.fi_merge(kill_concept, keep_concept);
                    } finally {
                        cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_16, thread);
                        wff_utilities.$check_arityP$.rebind(_prev_bind_15, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_14, thread);
                        wff_vars.$validate_constantsP$.rebind(_prev_bind_13, thread);
                        at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
                        at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_11, thread);
                        czer_vars.$simplify_literalP$.rebind(_prev_bind_10, thread);
                        wff_utilities.$check_var_typesP$.rebind(_prev_bind_9, thread);
                        wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_8, thread);
                        wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_7, thread);
                        at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
                        wff_utilities.$check_arg_typesP$.rebind(_prev_bind_5, thread);
                        control_vars.$within_assert$.rebind(_prev_bind_4, thread);
                        czer_vars.$simplify_sentenceP$.rebind(_prev_bind_3, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                        control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Create a Cyc concept name for thesaurus concept CONCEPT, which has STRING as its preferred term.
     * Used internally by tm-create-concept
     */
    public static final SubLObject tm_suggested_concept_name(SubLObject concept, SubLObject string) {
        SubLTrampolineFile.checkType(concept, FORT_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject id = constants_high.constant_internal_id(concept);
            SubLObject suggested_name = format(NIL, $str_alt235$TM__A__A, string, id);
            SubLObject cdotimes_end_var = length(suggested_name);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                if (NIL == constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(suggested_name, i))) {
                    Strings.set_char(suggested_name, i, CHAR_hyphen);
                }
            }
            return suggested_name;
        }
    }

    /**
     * A count of incremental worlds saved out by this image
     */
    // defvar
    private static final SubLSymbol $tm_incremental_world_number$ = makeSymbol("*TM-INCREMENTAL-WORLD-NUMBER*");

    /**
     * The extension to use for worlds saved by the thesaurus manager
     */
    // defparameter
    private static final SubLSymbol $tm_world_extension$ = makeSymbol("*TM-WORLD-EXTENSION*");

    /**
     * The filename prefix to use for worlds saved by the thesaurus manager
     */
    // defparameter
    private static final SubLSymbol $tm_world_prefix$ = makeSymbol("*TM-WORLD-PREFIX*");

    public static final SubLObject tm_increment_world_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $tm_incremental_world_number$.setDynamicValue(add($tm_incremental_world_number$.getDynamicValue(thread), ONE_INTEGER), thread);
            return NIL;
        }
    }

    /**
     * returns a full pathname for saving the next incremental world
     */
    public static final SubLObject tm_determine_incremental_save_filename() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = numeric_date_utilities.timestring(UNPROVIDED);
                SubLObject number = $tm_incremental_world_number$.getDynamicValue(thread);
                time = substitute(CHAR_hyphen, CHAR_slash, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                time = substitute(CHAR_hyphen, CHAR_colon, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                time = substitute(CHAR_hyphen, CHAR_space, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject filename = format(NIL, $str_alt238$_A__A__2__0D, new SubLObject[]{ $tm_world_prefix$.getDynamicValue(thread), time, number });
                    SubLObject full_filename = file_utilities.cyc_home_filename($list_alt239, filename, $tm_world_extension$.getDynamicValue(thread));
                    return full_filename;
                }
            }
        }
    }

    /**
     * Returns a list of the current incremental worlds
     */
    public static final SubLObject tm_incremental_save_worlds() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject world_directory = file_utilities.cyc_home_filename($list_alt239, NIL, UNPROVIDED);
                SubLObject worlds = Filesys.directory(world_directory, NIL);
                if (NIL != worlds) {
                    {
                        SubLObject incremental_worlds = NIL;
                        SubLObject cdolist_list_var = worlds;
                        SubLObject world = NIL;
                        for (world = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , world = cdolist_list_var.first()) {
                            if ((NIL != string_utilities.starts_with(world, $tm_world_prefix$.getDynamicValue(thread))) && (NIL != string_utilities.ends_with(world, $tm_world_extension$.getDynamicValue(thread), UNPROVIDED))) {
                                incremental_worlds = cons(world, incremental_worlds);
                            }
                        }
                        return incremental_worlds;
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Deletes the NUM oldest incremental world save
     */
    public static final SubLObject tm_remove_oldest_incremental_save(SubLObject num) {
        if (num == UNPROVIDED) {
            num = tm_control_vars.$tm_number_of_incremental_saves_to_keep$.getDynamicValue();
        }
        {
            SubLObject worlds = tm_incremental_save_worlds();
            worlds = Sort.sort(worlds, symbol_function(STRING_GREATERP), UNPROVIDED);
            if (length(worlds).numGE(num)) {
                {
                    SubLObject oldest_world = last(worlds, UNPROVIDED).first();
                    if (oldest_world.isString()) {
                        {
                            SubLObject world_directory = file_utilities.cyc_home_filename($list_alt239, NIL, UNPROVIDED);
                            SubLObject full_pathname = file_utilities.relative_filename(world_directory, oldest_world, UNPROVIDED);
                            if (NIL != Filesys.probe_file(full_pathname)) {
                                Filesys.delete_file(full_pathname);
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Save current thesaurus state to FILENAME
     */
    public static final SubLObject tm_save_incremental_world(SubLObject filename, SubLObject full_gcP) {
        if (full_gcP == UNPROVIDED) {
            full_gcP = NIL;
        }
        tm_increment_world_count();
        tm_remove_oldest_incremental_save(UNPROVIDED);
        operation_communication.write_cyc_image(filename, full_gcP);
        return T;
    }

    // defparameter
    public static final SubLSymbol $correlated_term_thesauri$ = makeSymbol("*CORRELATED-TERM-THESAURI*");

    public static final SubLObject in_correlated_term_thesauriP(SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return intersection($correlated_term_thesauri$.getDynamicValue(thread), tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Given a set of LEXICAL-TERMS, suggest other concepts from THESAURI and from
     * Cyc that would be good correlation candidates for concepts having those lexical terms.
     */
    public static final SubLObject tm_correlate_lexical_terms(SubLObject lexical_terms, SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        if (NIL == thesauri) {
            thesauri = tm_internals.all_thesauri();
        }
        {
            SubLObject cyc_terms = NIL;
            SubLObject other_thesaurus_terms = NIL;
            SubLObject result = NIL;
            SubLObject cdolist_list_var = lexical_terms;
            SubLObject lexical_term = NIL;
            for (lexical_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lexical_term = cdolist_list_var.first()) {
                {
                    SubLObject possibilities = lexicon_accessors.denots_of_string(lexical_term, $list_alt241, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cyc_terms = nconc(possibilities, cyc_terms);
                }
                {
                    SubLObject possibilities = tm_internals.search_thesauri(lexical_term, thesauri, T, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    other_thesaurus_terms = nconc(possibilities, other_thesaurus_terms);
                }
            }
            cyc_terms = delete_duplicates(cyc_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            other_thesaurus_terms = delete_duplicates(other_thesaurus_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            other_thesaurus_terms = nset_difference(other_thesaurus_terms, cyc_terms, UNPROVIDED, UNPROVIDED);
            result = nconc(other_thesaurus_terms, cyc_terms);
            return list_utilities.remove_if_not(symbol_function(FORT_P), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Suggest other concepts from THESAURI to correlate with this thesaurus CONCEPT.
     * A list of concepts is returned, sorted via likelihood of match
     */
    public static final SubLObject tm_correlate_concept(SubLObject concept, SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(concept, FORT_P);
            if (NIL == thesauri) {
                thesauri = tm_internals.all_thesauri();
            }
            {
                SubLObject preferred_terms = NIL;
                SubLObject use_fors = NIL;
                SubLObject lexical_terms = NIL;
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        preferred_terms = tm_internals.preferred_terms(concept);
                        use_fors = tm_internals.use_fors(concept);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                lexical_terms = nconc(preferred_terms, use_fors);
                lexical_terms = delete_duplicates(lexical_terms, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_answer = tm_correlate_lexical_terms(lexical_terms, thesauri);
                v_answer = delete(concept, v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $correlated_term_thesauri$.currentBinding(thread);
                    try {
                        $correlated_term_thesauri$.bind(tm_internals.thesauri_of_concept(concept), thread);
                        v_answer = remove_if(symbol_function($sym244$IN_CORRELATED_TERM_THESAURI_), v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $correlated_term_thesauri$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == tm_internals.thesaurus_gensymP(concept)) {
                    v_answer = list_utilities.remove_if_not(symbol_function($sym245$THESAURUS_GENSYM_), v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return v_answer;
            }
        }
    }

    /**
     * Correlate concept performed when adding TERM to THESAURUS.
     */
    public static final SubLObject tm_create_correlate_concept(SubLObject v_term, SubLObject broader_terms, SubLObject thesaurus, SubLObject concepts) {
        if (concepts == UNPROVIDED) {
            concepts = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexical_terms = list(v_term);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = concepts;
                SubLObject concept = NIL;
                for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject preferred_terms = tm_internals.preferred_terms(concept);
                                SubLObject use_fors = tm_internals.use_fors(concept);
                                lexical_terms = nconc(lexical_terms, nconc(preferred_terms, use_fors));
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                lexical_terms = remove_duplicates(lexical_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                result = tm_correlate_lexical_terms(lexical_terms, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI));
                {
                    SubLObject _prev_bind_0 = $correlated_term_thesauri$.currentBinding(thread);
                    try {
                        $correlated_term_thesauri$.bind(list(thesaurus), thread);
                        result = remove_if(symbol_function($sym244$IN_CORRELATED_TERM_THESAURI_), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $correlated_term_thesauri$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Merge assertions about thesaurus concepts CONCEPT1 and CONCEPT2 onto
     * whichever is most appropriate to keep. The concept which is kept is returned.
     */
    public static final SubLObject tm_merge_concepts(SubLObject concept1, SubLObject concept2) {
        SubLTrampolineFile.checkType(concept1, FORT_P);
        SubLTrampolineFile.checkType(concept2, FORT_P);
        if (NIL != tm_internals.thesaurus_gensymP(concept1)) {
            if (NIL != tm_internals.thesaurus_gensymP(concept2)) {
                if (kb_indexing.num_index(concept1).numG(kb_indexing.num_index(concept2))) {
                    return tm_correlate_merge(concept2, concept1);
                } else {
                    return tm_correlate_merge(concept1, concept2);
                }
            } else {
                tm_unassert(listS($$isa, concept1, $list_alt228), $thesaurus_test_constant_mt$.getGlobalValue());
                return tm_correlate_merge(concept1, concept2);
            }
        } else {
            if (NIL != tm_internals.thesaurus_gensymP(concept2)) {
                tm_unassert(listS($$isa, concept2, $list_alt228), $thesaurus_test_constant_mt$.getGlobalValue());
                return tm_correlate_merge(concept2, concept1);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Separate CONCEPT into gensyms for each thesaurus in THESAURI
     * (or, if nil, each thesaurus of CONCEPT). The list of new concepts is returned.
     */
    public static final SubLObject tm_uncorrelate_concept(SubLObject concept, SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        SubLTrampolineFile.checkType(concept, FORT_P);
        {
            SubLObject concept_thesauri = tm_internals.thesauri_of_concept(concept);
            SubLObject foreign_thesauri = NIL;
            if (NIL == thesauri) {
                thesauri = concept_thesauri;
            }
            foreign_thesauri = set_difference(thesauri, concept_thesauri, UNPROVIDED, UNPROVIDED);
            if (NIL != thesauri) {
                if ((NIL != list_utilities.singletonP(concept_thesauri)) && (NIL != tm_internals.thesaurus_gensymP(concept))) {
                    return list(concept);
                } else
                    if (NIL != foreign_thesauri) {
                        Errors.error($str_alt247$Can_t_uncorrelate__A_in_foreign_t, concept, foreign_thesauri);
                    } else {
                        {
                            SubLObject new_concepts = NIL;
                            SubLObject cdolist_list_var = thesauri;
                            SubLObject thesaurus = NIL;
                            for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                                if (((thesaurus == thesauri.first()) && (NIL != tm_internals.thesaurus_gensymP(concept))) && (NIL != list_utilities.sets_equalP(thesauri, concept_thesauri, UNPROVIDED))) {
                                    new_concepts = cons(concept, new_concepts);
                                } else {
                                    {
                                        SubLObject string = tm_datastructures.concept_term(concept, thesaurus);
                                        SubLObject new_concept = tm_generate_concept(string);
                                        tm_uncorrelate_separate(concept, new_concept, thesaurus);
                                        new_concepts = cons(new_concept, new_concepts);
                                    }
                                }
                            }
                            return nreverse(new_concepts);
                        }
                    }

            }
        }
        return NIL;
    }

    /**
     * Move all asserted assertions about EXISTING-CONCEPT in THESAURUS to NEW-CONCEPT.
     */
    public static final SubLObject tm_uncorrelate_separate(SubLObject existing_concept, SubLObject new_concept, SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_assertions = NIL;
                SubLObject genls_assertions = NIL;
                SubLObject arg1_assertions = NIL;
                SubLObject other_assertions = NIL;
                SubLObject real_other_assertions = NIL;
                SubLObject top_assertions = NIL;
                SubLObject top_assertions_to_keep = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(thesaurus, thread);
                        isa_assertions = kb_mapping.gather_gaf_arg_index(existing_concept, ONE_INTEGER, $$isa, UNPROVIDED, UNPROVIDED);
                        genls_assertions = kb_mapping.gather_gaf_arg_index(existing_concept, ONE_INTEGER, $$genls, UNPROVIDED, UNPROVIDED);
                        arg1_assertions = kb_mapping.gather_gaf_arg_index(existing_concept, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        other_assertions = kb_mapping.gather_term_assertions(existing_concept, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = other_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        if (assertions_high.assertion_mt(assertion).equal(thesaurus)) {
                            real_other_assertions = cons(assertion, real_other_assertions);
                        }
                    }
                    other_assertions = real_other_assertions;
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
                        top_assertions = kb_mapping.gather_gaf_arg_index(existing_concept, ONE_INTEGER, $$topInThesaurus, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                other_assertions = nset_difference(other_assertions, arg1_assertions, UNPROVIDED, UNPROVIDED);
                arg1_assertions = nset_difference(arg1_assertions, genls_assertions, UNPROVIDED, UNPROVIDED);
                arg1_assertions = nset_difference(arg1_assertions, isa_assertions, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = top_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        if (assertions_high.gaf_arg2(assertion).equal(thesaurus)) {
                            top_assertions_to_keep = cons(assertion, top_assertions_to_keep);
                        }
                    }
                }
                top_assertions = top_assertions_to_keep;
                isa_assertions = list_utilities.delete_if_not(symbol_function($sym249$ASSERTED_ASSERTION_), isa_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                genls_assertions = list_utilities.delete_if_not(symbol_function($sym249$ASSERTED_ASSERTION_), genls_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                arg1_assertions = list_utilities.delete_if_not(symbol_function($sym249$ASSERTED_ASSERTION_), arg1_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                other_assertions = list_utilities.delete_if_not(symbol_function($sym249$ASSERTED_ASSERTION_), other_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                top_assertions = list_utilities.delete_if_not(symbol_function($sym249$ASSERTED_ASSERTION_), top_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = isa_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        tm_uncorrelate_substitute(new_concept, existing_concept, assertion);
                    }
                }
                {
                    SubLObject cdolist_list_var = genls_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        tm_uncorrelate_substitute(new_concept, existing_concept, assertion);
                    }
                }
                {
                    SubLObject cdolist_list_var = arg1_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        tm_uncorrelate_substitute(new_concept, existing_concept, assertion);
                    }
                }
                {
                    SubLObject cdolist_list_var = other_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        tm_uncorrelate_substitute(new_concept, existing_concept, assertion);
                    }
                }
                {
                    SubLObject cdolist_list_var = top_assertions;
                    SubLObject assertion = NIL;
                    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                        tm_uncorrelate_substitute(new_concept, existing_concept, assertion);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Assert a formula which has NEW-CONCEPT replacing every reference to OLD-CONCEPT in SOURCE-ASSERTION.
     */
    public static final SubLObject tm_uncorrelate_substitute(SubLObject new_concept, SubLObject old_concept, SubLObject source_assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(new_concept, FORT_P);
            SubLTrampolineFile.checkType(old_concept, FORT_P);
            SubLTrampolineFile.checkType(source_assertion, ASSERTION_P);
            if (NIL != assertions_high.asserted_assertionP(source_assertion)) {
                {
                    SubLObject old_formula = assertions_high.assertion_formula(source_assertion);
                    SubLObject old_mt = assertions_high.assertion_mt(source_assertion);
                    SubLObject new_formula = subst(new_concept, old_concept, old_formula, UNPROVIDED, UNPROVIDED);
                    SubLObject new_mt = subst(new_concept, old_concept, old_mt, UNPROVIDED, UNPROVIDED);
                    SubLObject strength = assertions_high.assertion_strength(source_assertion);
                    SubLObject direction = assertions_high.assertion_direction(source_assertion);
                    SubLObject timestampedP = assertions_low.asserted_assertion_timestampedP(source_assertion);
                    SubLObject who = NIL;
                    SubLObject when = NIL;
                    SubLObject why = NIL;
                    SubLObject second = NIL;
                    if (NIL != timestampedP) {
                        who = assertions_high.asserted_by(source_assertion);
                        when = assertions_high.asserted_when(source_assertion);
                        why = assertions_high.asserted_why(source_assertion);
                        second = assertions_high.asserted_second(source_assertion);
                    }
                    {
                        SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        SubLObject _prev_bind_3 = czer_vars.$simplify_sentenceP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = czer_vars.$canonicalize_literalsP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = czer_vars.$express_as_rule_macroP$.currentBinding(thread);
                        SubLObject _prev_bind_7 = control_vars.$within_assert$.currentBinding(thread);
                        SubLObject _prev_bind_8 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_9 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_10 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                        SubLObject _prev_bind_11 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                        SubLObject _prev_bind_12 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                        SubLObject _prev_bind_13 = czer_vars.$simplify_literalP$.currentBinding(thread);
                        SubLObject _prev_bind_14 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                        SubLObject _prev_bind_15 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        SubLObject _prev_bind_16 = wff_vars.$validate_constantsP$.currentBinding(thread);
                        SubLObject _prev_bind_17 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        SubLObject _prev_bind_18 = wff_utilities.$check_arityP$.currentBinding(thread);
                        SubLObject _prev_bind_19 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
                        try {
                            control_vars.$use_transcriptP$.bind(tm_control_vars.$tm_default_save_operations_value$.getDynamicValue(thread), thread);
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            api_control_vars.$the_cyclist$.bind(tm_internals.tm_user_constant_from_user_name(tm_datastructures.$tm_user$.getDynamicValue(thread)), thread);
                            czer_vars.$simplify_sentenceP$.bind(NIL, thread);
                            czer_vars.$canonicalize_literalsP$.bind(NIL, thread);
                            czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                            czer_vars.$express_as_rule_macroP$.bind(NIL, thread);
                            control_vars.$within_assert$.bind(NIL, thread);
                            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                            at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                            wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                            wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                            wff_utilities.$check_var_typesP$.bind(NIL, thread);
                            czer_vars.$simplify_literalP$.bind(NIL, thread);
                            at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            wff_vars.$validate_constantsP$.bind(NIL, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            wff_utilities.$check_arityP$.bind(NIL, thread);
                            cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
                            fi.fi_unassert(old_formula, old_mt);
                            fi.fi_assert(new_formula, new_mt, strength, direction);
                            if (NIL != timestampedP) {
                                fi.fi_timestamp_assertion(who, when, why, second);
                            }
                        } finally {
                            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_19, thread);
                            wff_utilities.$check_arityP$.rebind(_prev_bind_18, thread);
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_17, thread);
                            wff_vars.$validate_constantsP$.rebind(_prev_bind_16, thread);
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_15, thread);
                            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_14, thread);
                            czer_vars.$simplify_literalP$.rebind(_prev_bind_13, thread);
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_12, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_11, thread);
                            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_10, thread);
                            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_9, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_8, thread);
                            control_vars.$within_assert$.rebind(_prev_bind_7, thread);
                            czer_vars.$express_as_rule_macroP$.rebind(_prev_bind_6, thread);
                            czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_5, thread);
                            czer_vars.$canonicalize_literalsP$.rebind(_prev_bind_4, thread);
                            czer_vars.$simplify_sentenceP$.rebind(_prev_bind_3, thread);
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_2, thread);
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_1, thread);
                            control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     * The list of thesauri to use for correlation
     */
    // defparameter
    private static final SubLSymbol $tm_corr_thesauri$ = makeSymbol("*TM-CORR-THESAURI*");

    /**
     * A-list of (<mt> . <search>) pairs
     */
    // defparameter
    private static final SubLSymbol $tm_corr_searches$ = makeSymbol("*TM-CORR-SEARCHES*");

    // defparameter
    private static final SubLSymbol $tm_corr_searches_lock$ = makeSymbol("*TM-CORR-SEARCHES-LOCK*");

    /**
     * The default number of correlation options to get
     */
    // defparameter
    public static final SubLSymbol $tm_corr_number_cutoff$ = makeSymbol("*TM-CORR-NUMBER-CUTOFF*");

    /**
     * The default amount of time to look for correlation options.
     */
    // defparameter
    public static final SubLSymbol $tm_corr_time_cutoff$ = makeSymbol("*TM-CORR-TIME-CUTOFF*");

    /**
     * Returns a list of THESAURI for which correlations are in progress
     */
    public static final SubLObject tm_correlation_searches_in_progress() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_corr_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = Mapping.mapcar(symbol_function(CAR), $tm_corr_searches$.getDynamicValue(thread));
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return the existing correlation search for THESAURUS, if any
     */
    public static final SubLObject tm_correlation_search(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $tm_corr_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = assoc(thesaurus, $tm_corr_searches$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Clear the correlation search for THESAURUS, if any
     */
    public static final SubLObject tm_clear_correlation_search(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject lock = $tm_corr_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject v_search = tm_correlation_search(thesaurus);
                        if (NIL != v_search) {
                            {
                                SubLObject cdolist_list_var = search.search_tree(v_search);
                                SubLObject top_node = NIL;
                                for (top_node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_node = cdolist_list_var.first()) {
                                    tm_free_entire_corr_search_tree(top_node);
                                }
                            }
                            search._csetf_search_state(v_search, NIL);
                            $tm_corr_searches$.setDynamicValue(delete(thesaurus, $tm_corr_searches$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Clear all correlation searches
     */
    public static final SubLObject tm_clear_all_correlation_searches() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $tm_corr_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    Mapping.mapc(symbol_function(TM_CLEAR_CORRELATION_SEARCH), tm_correlation_searches_in_progress(), EMPTY_SUBL_OBJECT_ARRAY);
                    $tm_corr_searches$.setDynamicValue(NIL, thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Return a new correlation search for THESAURUS.
     * START-CONCEPT, if given, is a concept at which to start the search.
     * Otherwise, the top terms of THESAURUS are used.  Any previous search for
     * THESAURUS is cleared out first.
     */
    public static final SubLObject tm_new_correlation_search(SubLObject thesaurus, SubLObject start_concept) {
        if (start_concept == UNPROVIDED) {
            start_concept = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(thesaurus, FORT_P);
            {
                SubLObject v_search = NIL;
                SubLObject lock = $tm_corr_searches_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    tm_clear_correlation_search(thesaurus);
                    v_search = tm_new_correlation_search_int(thesaurus, start_concept);
                    $tm_corr_searches$.setDynamicValue(cons(cons(thesaurus, v_search), $tm_corr_searches$.getDynamicValue(thread)), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return v_search;
            }
        }
    }

    /**
     * Continue correlation SEARCH until time or number cutoffs are met.
     * Values returned:
     * 1: list of list of correlation options.
     * 2: reason search ended: one of :NUMBER :TIME or :EXHAUST
     */
    public static final SubLObject tm_continue_correlation_search(SubLObject v_search, SubLObject number_cutoff, SubLObject time_cutoff) {
        if (number_cutoff == UNPROVIDED) {
            number_cutoff = $tm_corr_number_cutoff$.getDynamicValue();
        }
        if (time_cutoff == UNPROVIDED) {
            time_cutoff = $tm_corr_time_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_search, SEARCH_STRUC_P);
            {
                SubLObject reason = NIL;
                {
                    SubLObject _prev_bind_0 = search.$reclaim_dead_end_search_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_1 = search.$dead_end_node_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = search.$reclaim_dead_end_node_function$.currentBinding(thread);
                    try {
                        search.$reclaim_dead_end_search_nodes$.bind(T, thread);
                        search.$dead_end_node_function$.bind(TM_CORR_DEAD_END_NODE, thread);
                        search.$reclaim_dead_end_node_function$.bind(TM_CORR_RECLAIM_SEARCH_NODE, thread);
                        reason = search.generic_search(v_search, number_cutoff, time_cutoff, NIL);
                    } finally {
                        search.$reclaim_dead_end_node_function$.rebind(_prev_bind_2, thread);
                        search.$dead_end_node_function$.rebind(_prev_bind_1, thread);
                        search.$reclaim_dead_end_search_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject v_answer = search.search_goals(v_search);
                    if (reason == $EXHAUST) {
                        {
                            SubLObject thesaurus = search.search_state(v_search).first();
                            tm_clear_correlation_search(thesaurus);
                        }
                    } else {
                        search._csetf_search_goals(v_search, NIL);
                    }
                    return values(v_answer, reason);
                }
            }
        }
    }

    public static final SubLObject tm_new_correlation_search_int(SubLObject thesaurus, SubLObject start_concept) {
        if (start_concept == UNPROVIDED) {
            start_concept = NIL;
        }
        {
            SubLObject v_search = search.new_search(TM_CORR_NO_LEAVES_P, TM_CORR_NEXT_NODE, TM_CORR_GOAL_P, TM_CORR_ADD_GOAL, TM_CORR_OPTIONS, TM_CORR_EXPAND, TM_CORR_ADD_NODE, TM_CORR_TOO_DEEP_P, UNPROVIDED, UNPROVIDED);
            tm_corr_initialize_search(v_search, thesaurus);
            $tm_corr_thesauri$.setDynamicValue(tm_internals.all_thesauri());
            if (NIL != start_concept) {
                search.add_search_start_node(v_search, start_concept);
            } else {
                {
                    SubLObject cdolist_list_var = tm_internals.thesaurus_tops(thesaurus);
                    SubLObject top_concept = NIL;
                    for (top_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , top_concept = cdolist_list_var.first()) {
                        search.add_search_start_node(v_search, top_concept);
                    }
                }
            }
            return v_search;
        }
    }

    public static final SubLObject tm_corr_no_leaves_p(SubLObject leaves) {
        return sublisp_null(leaves);
    }

    public static final SubLObject tm_corr_next_node(SubLObject leaves) {
        return values(leaves.first(), leaves.rest());
    }

    public static final SubLObject tm_corr_goal_p(SubLObject node) {
        {
            SubLObject state = search.snode_state(node);
            return makeBoolean(state.isCons() && (NIL != state.rest()));
        }
    }

    public static final SubLObject tm_corr_add_goal(SubLObject node, SubLObject goals) {
        {
            SubLObject state = search.snode_state(node);
            return values(cons(state, goals), T);
        }
    }

    public static final SubLObject tm_corr_options(SubLObject node) {
        {
            SubLObject datum = search.search_state(search.snode_search(node));
            SubLObject current = datum;
            SubLObject thesaurus = NIL;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt265);
            thesaurus = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt265);
            table = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = search.snode_state(node);
                    if (NIL != forts.fort_p(state)) {
                        if (NIL == gethash(state, table, UNPROVIDED)) {
                            return $list_alt266;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt265);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_corr_expand(SubLObject node, SubLObject option) {
        {
            SubLObject pcase_var = option;
            if (pcase_var.eql($CORRELATE)) {
                return tm_corr_correlate_expand(node);
            } else
                if (pcase_var.eql($NT)) {
                    return tm_corr_nt_expand(node);
                }

        }
        return NIL;
    }

    public static final SubLObject tm_corr_add_node(SubLObject node, SubLObject leaves) {
        return cons(node, leaves);
    }

    public static final SubLObject tm_corr_too_deep_p(SubLObject node, SubLObject depth_cut) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
        }
        return NIL;
    }

    public static final SubLObject tm_corr_initialize_search(SubLObject v_search, SubLObject thesaurus) {
        {
            SubLObject mark_table = make_hash_table($int$1000, UNPROVIDED, UNPROVIDED);
            search._csetf_search_state(v_search, list(thesaurus, mark_table));
            search._csetf_search_goals(v_search, NIL);
            search._csetf_search_leaves(v_search, NIL);
            search._csetf_search_tree(v_search, NIL);
            return v_search;
        }
    }

    public static final SubLObject tm_corr_correlate_expand(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = search.search_state(search.snode_search(node));
                SubLObject current = datum;
                SubLObject thesaurus = NIL;
                SubLObject table = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt265);
                thesaurus = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt265);
                table = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject state = search.snode_state(node);
                        if (NIL != forts.fort_p(state)) {
                            {
                                SubLObject concept = state;
                                SubLObject correlations = tm_correlate_concept(concept, $tm_corr_thesauri$.getDynamicValue(thread));
                                sethash(concept, table, T);
                                if (NIL != correlations) {
                                    return list(search.new_search_node(cons(concept, correlations)));
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt265);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tm_corr_nt_expand(SubLObject node) {
        {
            SubLObject datum = search.search_state(search.snode_search(node));
            SubLObject current = datum;
            SubLObject thesaurus = NIL;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt265);
            thesaurus = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt265);
            table = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject state = search.snode_state(node);
                    if (NIL != forts.fort_p(state)) {
                        {
                            SubLObject concept = state;
                            SubLObject narrower_terms = gt_modules.narrower_terms(concept, thesaurus);
                            if (NIL != narrower_terms) {
                                {
                                    SubLObject children = NIL;
                                    SubLObject cdolist_list_var = narrower_terms;
                                    SubLObject narrower_term = NIL;
                                    for (narrower_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , narrower_term = cdolist_list_var.first()) {
                                        children = cons(search.new_search_node(narrower_term), children);
                                    }
                                    return children;
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt265);
            }
        }
        return NIL;
    }

    public static final SubLObject tm_corr_dead_end_node(SubLObject node) {
        return makeBoolean((NIL != search.search_node_p(node)) && (NIL == search.snode_children(node)));
    }

    public static final SubLObject tm_corr_reclaim_search_node(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject parent = search.snode_parent(node);
                if (NIL != search.search_node_p(parent)) {
                    {
                        SubLObject siblings = search.snode_children(parent);
                        search._csetf_snode_children(parent, delete(node, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        tm_free_entire_corr_search_tree(node);
                        if (NIL != tm_corr_dead_end_node(parent)) {
                            tm_corr_reclaim_search_node(parent);
                        }
                    }
                } else {
                    {
                        SubLObject v_search = search.snode_search(node);
                        if ((NIL != search.search_struc_p(v_search)) && (NIL != member(node, search.search_tree(v_search), UNPROVIDED, UNPROVIDED))) {
                            search.remove_search_start_node(v_search, node);
                            tm_free_entire_corr_search_tree(node);
                        } else {
                            Errors.cerror($str_alt269$So_don_t, $str_alt270$Cannot_reclaim_strange_node__S, node);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject tm_free_entire_corr_search_tree(SubLObject node) {
        if (NIL != search.search_node_p(node)) {
            {
                SubLObject cdolist_list_var = search.snode_children(node);
                SubLObject child = NIL;
                for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                    tm_free_entire_corr_search_tree(child);
                }
            }
            search.free_search_node(node);
        }
        return NIL;
    }

    public static final SubLObject tm_make_partition_pathname(SubLObject filename) {
        return format(NIL, $str_alt108$_a_a, tm_datastructures.$tm_partition_directory$.getGlobalValue(), filename);
    }

    public static final SubLObject tm_make_partition_filename(SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == control_vars.cyc_image_id()) {
                control_vars.set_cyc_image_id();
            }
            {
                SubLObject time = numeric_date_utilities.timestring(UNPROVIDED);
                SubLObject client_name = tm_control_vars.$client_name$.getDynamicValue(thread);
                SubLObject thesauri_symbol_string = $str_alt138$;
                SubLObject filename = NIL;
                time = substitute(CHAR_hyphen, CHAR_slash, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                time = substitute(CHAR_hyphen, CHAR_colon, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                time = substitute(CHAR_hyphen, CHAR_space, time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (client_name.isString()) {
                    {
                        SubLObject cdotimes_end_var = length(client_name);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            if (NIL == constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(client_name, i))) {
                                Strings.set_char(client_name, i, CHAR_hyphen);
                            }
                        }
                    }
                } else {
                    client_name = $str_alt138$;
                }
                if (NIL != thesauri) {
                    {
                        SubLObject cdolist_list_var = thesauri;
                        SubLObject thesaurus = NIL;
                        for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                            thesauri_symbol_string = cconcatenate(thesauri_symbol_string, format(NIL, $str_alt271$_A_, tm_internals.tm_string_for_constant(thesaurus, T, UNPROVIDED, UNPROVIDED)));
                        }
                    }
                }
                filename = format(NIL, $str_alt272$_a_a_a, new SubLObject[]{ NIL != thesauri ? ((SubLObject) (thesauri_symbol_string)) : NIL != string_utilities.non_empty_stringP(client_name) ? ((SubLObject) (format(NIL, $str_alt273$_a_, client_name))) : $str_alt138$, time, NIL != string_utilities.non_empty_stringP(tm_datastructures.$tm_partition_filename_extension$.getGlobalValue()) ? ((SubLObject) (format(NIL, $str_alt274$__a, tm_datastructures.$tm_partition_filename_extension$.getGlobalValue()))) : $str_alt138$ });
                return filename;
            }
        }
    }

    /**
     * Returns a pathname for a saved partition.  If THESAURI are specified, use their abbreviations in the name; otherwise, use the client name.
     */
    public static final SubLObject tm_new_partition_pathname(SubLObject thesauri) {
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        return tm_make_partition_pathname(tm_make_partition_filename(thesauri));
    }

    /**
     * An a-list in which each element has the form (<method-key> . <term-spec>),
     * where <method-key> is one of :term or :ontology, and <term-spec> is a
     * Cyc term.  This partition spec covers all thesaurus data.
     */
    // defparameter
    private static final SubLSymbol $tm_partition_spec$ = makeSymbol("*TM-PARTITION-SPEC*");

    /**
     * An a-list in which each element has the form (<method-key> . <term-spec>),
     * where <method-key> is one of :term or :ontology, and <term-spec> is a
     * Cyc term.  This partition spec covers all non-thesaurus data, such as predicates, users, etc.
     */
    // defparameter
    private static final SubLSymbol $tm_partition_min_spec$ = makeSymbol("*TM-PARTITION-MIN-SPEC*");

    /**
     * Add the *thesaurus-test-constant-mt* assertions about the thesaurus gensyms of THESAURUS to the scope.
     */
    public static final SubLObject scope_thesaurus_gensyms(SubLObject thesaurus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(thesaurus, thread);
                    {
                        SubLObject pred_var = $$preferredTerm;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        SubLObject done_var_64 = NIL;
                                                        SubLObject token_var_65 = NIL;
                                                        while (NIL == done_var_64) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_65);
                                                                SubLObject valid_66 = makeBoolean(token_var_65 != ass);
                                                                if (NIL != valid_66) {
                                                                    {
                                                                        SubLObject v_term = assertions_high.gaf_arg1(ass);
                                                                        if (NIL != tm_internals.thesaurus_gensymP(v_term)) {
                                                                            partitions.scope_partition_term_in_mt(v_term, $thesaurus_test_constant_mt$.getGlobalValue());
                                                                        }
                                                                    }
                                                                }
                                                                done_var_64 = makeBoolean(NIL == valid_66);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_67, thread);
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
            return thesaurus;
        }
    }

    public static final SubLObject scope_thesaurus_predicates() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ontology_start = $$ThesaurusPredicate_Generic;
                SubLObject specs = NIL;
                partitions.scope_partition_term(ontology_start);
                {
                    SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts(ontology_start);
                    SubLObject instance = NIL;
                    for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                        partitions.scope_partition_arg_index(instance, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        partitions.scope_partition_arg_index(instance, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        partitions.scope_partition_arg_index(instance, THREE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        partitions.scope_partition_predicate_rule_index(instance, $POS, UNPROVIDED, UNPROVIDED);
                        partitions.scope_partition_predicate_rule_index(instance, $NEG, UNPROVIDED, UNPROVIDED);
                        partitions.scope_partition_other_index(instance);
                    }
                }
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        specs = genls.all_specs(ontology_start, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = specs;
                    SubLObject spec = NIL;
                    for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                        partitions.scope_partition_term(spec);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * For use with NO-OTHER-THESAURI
     */
    // defparameter
    private static final SubLSymbol $other_thesauri$ = makeSymbol("*OTHER-THESAURI*");

    /**
     * Utility for use with SCOPE-THESAURUS-USERS.
     */
    public static final SubLObject no_other_thesauri(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject foundP = NIL;
                SubLObject formula = assertions_high.assertion_formula(assertion);
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = $other_thesauri$.getDynamicValue(thread);
                        SubLObject thesaurus = NIL;
                        for (thesaurus = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , thesaurus = csome_list_var.first()) {
                            if (NIL != subl_promotions.memberP(thesaurus, formula, UNPROVIDED, UNPROVIDED)) {
                                foundP = T;
                            }
                        }
                    }
                }
                return makeBoolean(NIL == foundP);
            }
        }
    }

    public static final SubLObject scope_tm_output_filters(SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            partitions.scope_partition_term($$TMOutputFilter);
            {
                SubLObject _prev_bind_0 = partitions.$scope_partition_assertion_selective_test$.currentBinding(thread);
                SubLObject _prev_bind_1 = $other_thesauri$.currentBinding(thread);
                try {
                    partitions.$scope_partition_assertion_selective_test$.bind(NO_OTHER_THESAURI, thread);
                    $other_thesauri$.bind(set_difference(tm_internals.all_thesauri(), thesauri, UNPROVIDED, UNPROVIDED), thread);
                    {
                        SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$TMOutputFilter);
                        SubLObject instance = NIL;
                        for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                            if (NIL != $other_thesauri$.getDynamicValue(thread)) {
                                {
                                    SubLObject _prev_bind_0_68 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1_69 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        kb_mapping.map_gaf_arg_index(SCOPE_PARTITION_ASSERTION_SELECTIVE, instance, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        kb_mapping.map_gaf_arg_index(SCOPE_PARTITION_ASSERTION_SELECTIVE, instance, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        kb_mapping.map_gaf_arg_index(SCOPE_PARTITION_ASSERTION_SELECTIVE, instance, THREE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_69, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_68, thread);
                                    }
                                }
                            } else {
                                partitions.scope_partition_term(instance);
                            }
                        }
                    }
                } finally {
                    $other_thesauri$.rebind(_prev_bind_1, thread);
                    partitions.$scope_partition_assertion_selective_test$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Add the arg1 assertions about each #$ThesaurusEntity to the scope, unless it
     * refers to a #$Thesaurus-Represented not among THESAURI.
     */
    public static final SubLObject scope_thesaurus_users(SubLObject thesauri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = partitions.$scope_partition_assertion_selective_test$.currentBinding(thread);
                SubLObject _prev_bind_1 = $other_thesauri$.currentBinding(thread);
                try {
                    partitions.$scope_partition_assertion_selective_test$.bind(NO_OTHER_THESAURI, thread);
                    $other_thesauri$.bind(set_difference(tm_internals.all_thesauri(), thesauri, UNPROVIDED, UNPROVIDED), thread);
                    {
                        SubLObject all_thesaurus_entities = NIL;
                        {
                            SubLObject _prev_bind_0_70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1_71 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                all_thesaurus_entities = isa.all_fort_instances($$ThesaurusEntity, UNPROVIDED, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_71, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_70, thread);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = all_thesaurus_entities;
                            SubLObject instance = NIL;
                            for (instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , instance = cdolist_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0_72 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1_73 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        kb_mapping.map_gaf_arg_index(SCOPE_PARTITION_ASSERTION_SELECTIVE, instance, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_73, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_72, thread);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    $other_thesauri$.rebind(_prev_bind_1, thread);
                    partitions.$scope_partition_assertion_selective_test$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     * Returns a partition-spec including all assertions about each thesaurus, and all assertions in each thesaurus, in THESAURI.
     */
    public static final SubLObject tm_partition_spec_for_thesauri(SubLObject thesauri) {
        {
            SubLObject partition_spec = list(list($FUNCTION, SCOPE_THESAURUS_PREDICATES));
            partition_spec = cons(list($FUNCTION, SCOPE_THESAURUS_USERS, thesauri), partition_spec);
            partition_spec = cons(list($FUNCTION, SCOPE_TM_OUTPUT_FILTERS, thesauri), partition_spec);
            {
                SubLObject cdolist_list_var = thesauri;
                SubLObject thesaurus = NIL;
                for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thesaurus = cdolist_list_var.first()) {
                    partition_spec = cons(cons($TERM, thesaurus), partition_spec);
                    partition_spec = cons(list($FUNCTION, SCOPE_PARTITION_MT_INDEX, thesaurus), partition_spec);
                    partition_spec = cons(list($FUNCTION, SCOPE_THESAURUS_GENSYMS, thesaurus), partition_spec);
                }
            }
            return nreverse(partition_spec);
        }
    }

    /**
     * Save a thesaurus partition to PATHNAME.  If all thesauri are given, the full standard thesaurus partition will be saved.  If fewer than the full set of thesauri are specified, the partition will contain only assertions of THESAURI.
     */
    public static final SubLObject tm_save_partition(SubLObject pathname, SubLObject thesauri) {
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        if (thesauri == UNPROVIDED) {
            thesauri = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name = (pathname.isString()) ? ((SubLObject) (pathname)) : tm_new_partition_pathname(thesauri);
                SubLObject partition_spec = (NIL == intersection(thesauri, tm_internals.all_thesauri(), UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($tm_partition_spec$.getDynamicValue(thread))) : tm_partition_spec_for_thesauri(thesauri);
                SubLObject result = NIL;
                SubLTrampolineFile.checkType(partition_spec, CONSP);
                SubLTrampolineFile.checkType(name, STRINGP);
                result = partitions.save_partition(name, partition_spec);
                return result;
            }
        }
    }

    /**
     * Load a thesaurus partition from PATHNAME.
     */
    public static final SubLObject tm_load_partition(SubLObject pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pathname, STRINGP);
            if (NIL == Filesys.probe_file(pathname)) {
                Errors.error($str_alt289$File__S_cannot_be_accessed, pathname);
            } else {
                {
                    SubLObject _prev_bind_0 = tm_lexical_index.$defer_lexical_updateP$.currentBinding(thread);
                    try {
                        tm_lexical_index.$defer_lexical_updateP$.bind(T, thread);
                        partitions.load_partition(pathname, UNPROVIDED);
                    } finally {
                        tm_lexical_index.$defer_lexical_updateP$.rebind(_prev_bind_0, thread);
                    }
                }
                tm_lexical_index.tm_add_deferred_lexical_entries();
                partitions.clear_partition_loader_state();
                tm_internals.tm_run_thesaurus_initializations(UNPROVIDED);
                return T;
            }
            return NIL;
        }
    }

    /**
     * Tests whether the directory DIRECTORY-PATH exists and is accessible
     */
    public static final SubLObject tm_directory_accessible(SubLObject directory_path) {
        SubLTrampolineFile.checkType(directory_path, STRINGP);
        {
            SubLObject test_filename = file_utilities.relative_filename(directory_path, $str_alt290$access_test, UNPROVIDED);
            SubLObject success = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(test_filename, $OUTPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt35$Unable_to_open__S, test_filename);
                                    }
                                    {
                                        SubLObject stream_74 = stream;
                                        success = T;
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_75 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_75);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL != success) {
                Filesys.delete_file(test_filename);
            }
            return success;
        }
    }

    public static final SubLObject get_copy_thesaurus_tests_old_cyclist(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, TEN_INTEGER, OLD_CYCLIST);
    }

    public static final SubLObject set_copy_thesaurus_tests_old_cyclist(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, TEN_INTEGER, OLD_CYCLIST);
    }

    public static final SubLObject get_copy_thesaurus_tests_old_tm_user(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, NINE_INTEGER, OLD_TM_USER);
    }

    public static final SubLObject set_copy_thesaurus_tests_old_tm_user(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, NINE_INTEGER, OLD_TM_USER);
    }

    public static final SubLObject get_copy_thesaurus_tests_target_term3(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, EIGHT_INTEGER, TARGET_TERM3);
    }

    public static final SubLObject set_copy_thesaurus_tests_target_term3(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, EIGHT_INTEGER, TARGET_TERM3);
    }

    public static final SubLObject get_copy_thesaurus_tests_source_term2(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, SEVEN_INTEGER, SOURCE_TERM2);
    }

    public static final SubLObject set_copy_thesaurus_tests_source_term2(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, SEVEN_INTEGER, SOURCE_TERM2);
    }

    public static final SubLObject get_copy_thesaurus_tests_source_term1(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, SIX_INTEGER, SOURCE_TERM1);
    }

    public static final SubLObject set_copy_thesaurus_tests_source_term1(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, SIX_INTEGER, SOURCE_TERM1);
    }

    public static final SubLObject get_copy_thesaurus_tests_terms(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, FIVE_INTEGER, TERMS);
    }

    public static final SubLObject set_copy_thesaurus_tests_terms(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, FIVE_INTEGER, TERMS);
    }

    public static final SubLObject get_copy_thesaurus_tests_target_thesaurus(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, FOUR_INTEGER, TARGET_THESAURUS);
    }

    public static final SubLObject set_copy_thesaurus_tests_target_thesaurus(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, FOUR_INTEGER, TARGET_THESAURUS);
    }

    public static final SubLObject get_copy_thesaurus_tests_source_thesaurus(SubLObject copy_thesaurus_tests) {
        return classes.subloop_get_access_protected_instance_slot(copy_thesaurus_tests, THREE_INTEGER, SOURCE_THESAURUS);
    }

    public static final SubLObject set_copy_thesaurus_tests_source_thesaurus(SubLObject copy_thesaurus_tests, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(copy_thesaurus_tests, value, THREE_INTEGER, SOURCE_THESAURUS);
    }

    public static final SubLObject subloop_reserved_initialize_copy_thesaurus_tests_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_copy_thesaurus_tests_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, SOURCE_THESAURUS, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, TARGET_THESAURUS, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, TERMS, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, SOURCE_TERM1, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, SOURCE_TERM2, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, TARGET_TERM3, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, OLD_TM_USER, NIL);
        classes.subloop_initialize_slot(new_instance, COPY_THESAURUS_TESTS, OLD_CYCLIST, NIL);
        return NIL;
    }

    public static final SubLObject copy_thesaurus_tests_p(SubLObject copy_thesaurus_tests) {
        return classes.subloop_instanceof_class(copy_thesaurus_tests, COPY_THESAURUS_TESTS);
    }

    public static final SubLObject declare_tm_io_file() {
        declareFunction("tm_io_item_p", "TM-IO-ITEM-P", 1, 0, false);
        declareFunction("tm_output_item", "TM-OUTPUT-ITEM", 2, 3, false);
        declareFunction("tm_clear_output_item_hash", "TM-CLEAR-OUTPUT-ITEM-HASH", 0, 0, false);
        declareFunction("tm_generate_output_item", "TM-GENERATE-OUTPUT-ITEM", 4, 0, false);
        declareFunction("tm_generate_output_item_internal", "TM-GENERATE-OUTPUT-ITEM-INTERNAL", 1, 0, false);
        declareFunction("tm_add_output_item_line", "TM-ADD-OUTPUT-ITEM-LINE", 3, 0, false);
        declareFunction("tm_sort_output_item_hash", "TM-SORT-OUTPUT-ITEM-HASH", 0, 0, false);
        declareFunction("tm_output_item_hash_data", "TM-OUTPUT-ITEM-HASH-DATA", 0, 0, false);
        declareFunction("tm_filter_output_item", "TM-FILTER-OUTPUT-ITEM", 2, 0, false);
        declareFunction("tm_collapse_output_item", "TM-COLLAPSE-OUTPUT-ITEM", 1, 0, false);
        declareFunction("tm_sort_output_item", "TM-SORT-OUTPUT-ITEM", 1, 0, false);
        declareFunction("tm_thesaurus_subset_contents_table", "TM-THESAURUS-SUBSET-CONTENTS-TABLE", 4, 0, false);
        declareFunction("tm_thesaurus_subset_contents_recursive", "TM-THESAURUS-SUBSET-CONTENTS-RECURSIVE", 6, 0, false);
        declareFunction("estimate_thesaurus_subset_size", "ESTIMATE-THESAURUS-SUBSET-SIZE", 3, 0, false);
        declareFunction("tm_read_basis_file_item", "TM-READ-BASIS-FILE-ITEM", 1, 0, false);
        declareFunction("tm_read_and_parse_one_basis_line", "TM-READ-AND-PARSE-ONE-BASIS-LINE", 1, 0, false);
        declareFunction("tm_parse_one_basis_line", "TM-PARSE-ONE-BASIS-LINE", 1, 0, false);
        declareFunction("tm_basis_line_reln", "TM-BASIS-LINE-RELN", 1, 0, false);
        declareFunction("tm_basis_line_value", "TM-BASIS-LINE-VALUE", 1, 0, false);
        declareFunction("tm_skip_cr_lfs", "TM-SKIP-CR-LFS", 1, 0, false);
        declareFunction("tm_read_basis_line", "TM-READ-BASIS-LINE", 1, 0, false);
        declareFunction("tm_read_one_basis_line", "TM-READ-ONE-BASIS-LINE", 1, 0, false);
        declareFunction("tm_basis_continuation_string_length", "TM-BASIS-CONTINUATION-STRING-LENGTH", 1, 0, false);
        declareFunction("tm_basis_continuation_indent_amount", "TM-BASIS-CONTINUATION-INDENT-AMOUNT", 1, 0, false);
        declareFunction("tm_basis_continuation_string", "TM-BASIS-CONTINUATION-STRING", 1, 0, false);
        declareFunction("tm_read_brs_file_item", "TM-READ-BRS-FILE-ITEM", 1, 0, false);
        declareFunction("tm_read_and_parse_one_brs_line", "TM-READ-AND-PARSE-ONE-BRS-LINE", 1, 0, false);
        declareFunction("tm_parse_one_brs_line", "TM-PARSE-ONE-BRS-LINE", 1, 0, false);
        declareFunction("tm_brs_line_reln", "TM-BRS-LINE-RELN", 1, 0, false);
        declareFunction("tm_brs_line_value", "TM-BRS-LINE-VALUE", 1, 0, false);
        declareFunction("tm_read_brs_line", "TM-READ-BRS-LINE", 1, 0, false);
        declareFunction("tm_read_one_brs_line", "TM-READ-ONE-BRS-LINE", 1, 0, false);
        declareFunction("tm_read_basis_single_line", "TM-READ-BASIS-SINGLE-LINE", 1, 0, false);
        declareFunction("tm_read_brs_single_line", "TM-READ-BRS-SINGLE-LINE", 1, 0, false);
        declareFunction("tm_load_and_process_input_file", "TM-LOAD-AND-PROCESS-INPUT-FILE", 3, 1, false);
        declareFunction("tm_load_read_method", "TM-LOAD-READ-METHOD", 1, 0, false);
        declareFunction("tm_load_single_line_read_method", "TM-LOAD-SINGLE-LINE-READ-METHOD", 1, 0, false);
        declareFunction("tm_load_thesaurus_from_file", "TM-LOAD-THESAURUS-FROM-FILE", 3, 0, false);
        declareFunction("tm_load_thesaurus_cleanup", "TM-LOAD-THESAURUS-CLEANUP", 1, 0, false);
        declareFunction("tm_load_tops", "TM-LOAD-TOPS", 1, 0, false);
        declareFunction("tm_load_thesaurus_in_thinker", "TM-LOAD-THESAURUS-IN-THINKER", 4, 1, false);
        declareFunction("tm_load_thesaurus_from_file_wrapper", "TM-LOAD-THESAURUS-FROM-FILE-WRAPPER", 4, 1, false);
        declareFunction("update_tm_relation_status_hash_for_thesaurus", "UPDATE-TM-RELATION-STATUS-HASH-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_load_thesaurus_check_item", "TM-LOAD-THESAURUS-CHECK-ITEM", 1, 0, false);
        declareFunction("tm_load_thesaurus_check_item_internal", "TM-LOAD-THESAURUS-CHECK-ITEM-INTERNAL", 1, 0, false);
        declareFunction("tm_load_thesaurus_add_item", "TM-LOAD-THESAURUS-ADD-ITEM", 1, 0, false);
        declareFunction("tm_load_thesaurus_add_item_internal", "TM-LOAD-THESAURUS-ADD-ITEM-INTERNAL", 2, 0, false);
        declareFunction("tm_load_binarize_assertion_specs", "TM-LOAD-BINARIZE-ASSERTION-SPECS", 2, 0, false);
        declareFunction("tm_load_canonicalize_assertion_spec_predicates", "TM-LOAD-CANONICALIZE-ASSERTION-SPEC-PREDICATES", 1, 0, false);
        declareFunction("tm_load_construct_fi_assert_specs", "TM-LOAD-CONSTRUCT-FI-ASSERT-SPECS", 2, 0, false);
        declareFunction("tm_load_construct_fi_assert_specs_with_reuse_mode_and_thesauri", "TM-LOAD-CONSTRUCT-FI-ASSERT-SPECS-WITH-REUSE-MODE-AND-THESAURI", 4, 0, false);
        declareFunction("tm_merge_load_thesaurus_from_file", "TM-MERGE-LOAD-THESAURUS-FROM-FILE", 3, 0, false);
        declareFunction("tm_load_into_hashtable", "TM-LOAD-INTO-HASHTABLE", 1, 0, false);
        declareFunction("tm_load_into_hashtable_internal", "TM-LOAD-INTO-HASHTABLE-INTERNAL", 2, 0, false);
        declareFunction("tm_merge_load_note_input", "TM-MERGE-LOAD-NOTE-INPUT", 2, 0, false);
        declareFunction("tm_merge_load_categorize_input", "TM-MERGE-LOAD-CATEGORIZE-INPUT", 2, 0, false);
        declareFunction("tm_assertion_spec_string_lookup", "TM-ASSERTION-SPEC-STRING-LOOKUP", 2, 0, false);
        declareFunction("tm_assertion_spec_string_lookup_internal", "TM-ASSERTION-SPEC-STRING-LOOKUP-INTERNAL", 1, 0, false);
        declareFunction("tm_assertion_spec_lookup", "TM-ASSERTION-SPEC-LOOKUP", 2, 0, false);
        declareFunction("tm_merge_load_additions", "TM-MERGE-LOAD-ADDITIONS", 2, 0, false);
        declareFunction("tm_thesaurus_difference_from_file", "TM-THESAURUS-DIFFERENCE-FROM-FILE", 3, 0, false);
        declareFunction("tm_process_thesaurus_difference", "TM-PROCESS-THESAURUS-DIFFERENCE", 2, 0, false);
        declareFunction("tm_load_input_preferred_term_hash", "TM-LOAD-INPUT-PREFERRED-TERM-HASH", 1, 0, false);
        declareFunction("tm_process_thesaurus_difference_internal", "TM-PROCESS-THESAURUS-DIFFERENCE-INTERNAL", 1, 0, false);
        declareFunction("tm_possibly_note_top_deletion", "TM-POSSIBLY-NOTE-TOP-DELETION", 1, 0, false);
        declareFunction("tm_find_timestamped_assertions_to_delete", "TM-FIND-TIMESTAMPED-ASSERTIONS-TO-DELETE", 1, 0, false);
        declareFunction("tm_assertion_spec_hash_lookup", "TM-ASSERTION-SPEC-HASH-LOOKUP", 4, 0, false);
        declareFunction("tm_assertion_spec_hash_lookup_internal", "TM-ASSERTION-SPEC-HASH-LOOKUP-INTERNAL", 4, 0, false);
        declareFunction("tm_update_load_state", "TM-UPDATE-LOAD-STATE", 0, 0, false);
        declareFunction("tm_update_load_state_for_thesaurus", "TM-UPDATE-LOAD-STATE-FOR-THESAURUS", 1, 0, false);
        declareFunction("tm_clear_thesaurus_from_update_load_state", "TM-CLEAR-THESAURUS-FROM-UPDATE-LOAD-STATE", 1, 0, false);
        declareFunction("tm_thesaurus_deletions_from_file", "TM-THESAURUS-DELETIONS-FROM-FILE", 3, 0, false);
        declareFunction("tm_update_load", "TM-UPDATE-LOAD", 3, 0, false);
        declareFunction("tm_update_load_postprocessing", "TM-UPDATE-LOAD-POSTPROCESSING", 1, 0, false);
        declareFunction("tm_canonicalize_gaf_strings_during_input_file_frobbing", "TM-CANONICALIZE-GAF-STRINGS-DURING-INPUT-FILE-FROBBING", 1, 0, false);
        declareFunction("tm_frob_case_of_input_hash_for_thesaurus", "TM-FROB-CASE-OF-INPUT-HASH-FOR-THESAURUS", 2, 0, false);
        declareFunction("tm_update_pt_case_from_input_hash", "TM-UPDATE-PT-CASE-FROM-INPUT-HASH", 3, 1, false);
        declareFunction("tm_api_copy_thesaurus", "TM-API-COPY-THESAURUS", 2, 4, false);
        declareFunction("tm_validate_term_name", "TM-VALIDATE-TERM-NAME", 2, 0, false);
        declareFunction("tm_make_copy_log_pathname", "TM-MAKE-COPY-LOG-PATHNAME", 1, 0, false);
        declareFunction("tm_make_copy_log_filename", "TM-MAKE-COPY-LOG-FILENAME", 0, 0, false);
        declareFunction("tm_new_copy_log_pathname", "TM-NEW-COPY-LOG-PATHNAME", 0, 1, false);
        declareFunction("tm_copy_thesaurus_subset", "TM-COPY-THESAURUS-SUBSET", 6, 1, false);
        declareFunction("tm_copy_thesaurus_subset_internal", "TM-COPY-THESAURUS-SUBSET-INTERNAL", 1, 0, false);
        declareFunction("tm_copy_subset_presentP", "TM-COPY-SUBSET-PRESENT?", 1, 0, false);
        declareFunction("tm_copy_subset_constant_not_presentP", "TM-COPY-SUBSET-CONSTANT-NOT-PRESENT?", 1, 0, false);
        declareFunction("tm_copy_subset_all_present", "TM-COPY-SUBSET-ALL-PRESENT", 1, 0, false);
        declareFunction("tm_copy_assertion_to_thesaurus_not_okP", "TM-COPY-ASSERTION-TO-THESAURUS-NOT-OK?", 2, 0, false);
        declareFunction("tm_copy_assertion_to_thesaurus", "TM-COPY-ASSERTION-TO-THESAURUS", 2, 0, false);
        declareFunction("tm_copy_log_format_assertion", "TM-COPY-LOG-FORMAT-ASSERTION", 1, 0, false);
        declareFunction("tm_copy_subset_link_to_target", "TM-COPY-SUBSET-LINK-TO-TARGET", 3, 0, false);
        declareFunction("tm_dump_thesaurus_to_file", "TM-DUMP-THESAURUS-TO-FILE", 3, 0, false);
        declareFunction("tm_dump_thesaurus_to_stream", "TM-DUMP-THESAURUS-TO-STREAM", 4, 2, false);
        declareFunction("tm_dump_thesaurus_pt_info", "TM-DUMP-THESAURUS-PT-INFO", 1, 0, false);
        declareFunction("tm_dump_pt_output_item", "TM-DUMP-PT-OUTPUT-ITEM", 3, 0, false);
        declareFunction("tm_dump_value_convert", "TM-DUMP-VALUE-CONVERT", 1, 1, false);
        declareFunction("tm_dump_thesaurus_uf_info", "TM-DUMP-THESAURUS-UF-INFO", 1, 0, false);
        declareFunction("tm_dump_uf_output_item", "TM-DUMP-UF-OUTPUT-ITEM", 4, 0, false);
        declareFunction("tm_dump_thesaurus_subset_to_file", "TM-DUMP-THESAURUS-SUBSET-TO-FILE", 6, 0, false);
        declareFunction("tm_dump_thesaurus_subset_to_stream", "TM-DUMP-THESAURUS-SUBSET-TO-STREAM", 8, 0, false);
        declareFunction("tm_dump_thesaurus_subset_to_stream_recursive", "TM-DUMP-THESAURUS-SUBSET-TO-STREAM-RECURSIVE", 1, 0, false);
        declareFunction("tm_dump_thesaurus_subset_item", "TM-DUMP-THESAURUS-SUBSET-ITEM", 1, 0, false);
        declareFunction("tm_dump_subset_presentP", "TM-DUMP-SUBSET-PRESENT?", 1, 0, false);
        declareFunction("tm_dump_subset_markedP", "TM-DUMP-SUBSET-MARKED?", 1, 0, false);
        declareFunction("tm_mark_dump_subset_concept", "TM-MARK-DUMP-SUBSET-CONCEPT", 1, 0, false);
        declareFunction("tm_dump_subset_constant_not_presentP", "TM-DUMP-SUBSET-CONSTANT-NOT-PRESENT?", 1, 0, false);
        declareFunction("tm_dump_subset_all_present", "TM-DUMP-SUBSET-ALL-PRESENT", 1, 0, false);
        declareFunction("tm_output_thesaurus_or_subset", "TM-OUTPUT-THESAURUS-OR-SUBSET", 6, 0, false);
        declareFunction("tm_output_thesaurus_to_file", "TM-OUTPUT-THESAURUS-TO-FILE", 3, 5, false);
        declareFunction("thesaurus_strings_to_forts", "THESAURUS-STRINGS-TO-FORTS", 2, 0, false);
        declareFunction("tm_dump_basis_file_item", "TM-DUMP-BASIS-FILE-ITEM", 2, 0, false);
        declareFunction("tm_dump_basis_file_item_internal", "TM-DUMP-BASIS-FILE-ITEM-INTERNAL", 3, 0, false);
        declareFunction("tm_dump_basis_strip_bad_whitespace", "TM-DUMP-BASIS-STRIP-BAD-WHITESPACE", 1, 0, false);
        declareFunction("tm_dump_basis_continuation_break_point", "TM-DUMP-BASIS-CONTINUATION-BREAK-POINT", 1, 0, false);
        declareFunction("tm_dump_brs_file_item", "TM-DUMP-BRS-FILE-ITEM", 2, 0, false);
        declareFunction("tm_dump_brs_file_item_internal", "TM-DUMP-BRS-FILE-ITEM-INTERNAL", 3, 0, false);
        declareFunction("tm_dump_brs_scope_note", "TM-DUMP-BRS-SCOPE-NOTE", 2, 0, false);
        declareFunction("tm_dump_one_brs_line", "TM-DUMP-ONE-BRS-LINE", 3, 0, false);
        declareFunction("tm_dump_brs_continuation_break_point", "TM-DUMP-BRS-CONTINUATION-BREAK-POINT", 2, 0, false);
        declareFunction("tm_dump_verity_preamble", "TM-DUMP-VERITY-PREAMBLE", 2, 0, false);
        declareFunction("tm_dump_verity_file_item", "TM-DUMP-VERITY-FILE-ITEM", 2, 0, false);
        declareFunction("tm_dump_verity_postamble", "TM-DUMP-VERITY-POSTAMBLE", 2, 0, false);
        declareFunction("tm_verity_synonym_symbol", "TM-VERITY-SYNONYM-SYMBOL", 1, 0, false);
        declareFunction("tm_verity_control_string_position", "TM-VERITY-CONTROL-STRING-POSITION", 2, 0, false);
        declareFunction("tm_dump_verity_synonym_item", "TM-DUMP-VERITY-SYNONYM-ITEM", 2, 0, false);
        declareFunction("tm_princ_verity_substring", "TM-PRINC-VERITY-SUBSTRING", 4, 0, false);
        declareFunction("tm_dump_convert_case", "TM-DUMP-CONVERT-CASE", 3, 0, false);
        declareFunction("tm_output_correlation_information", "TM-OUTPUT-CORRELATION-INFORMATION", 1, 2, false);
        declareFunction("tm_output_correlation_information_header", "TM-OUTPUT-CORRELATION-INFORMATION-HEADER", 2, 0, false);
        declareFunction("tm_correlated_concept_p", "TM-CORRELATED-CONCEPT-P", 1, 1, false);
        declareFunction("tm_possibly_output_correlation_information_for_concept", "TM-POSSIBLY-OUTPUT-CORRELATION-INFORMATION-FOR-CONCEPT", 4, 0, false);
        declareFunction("tm_output_correlation_information_for_concept", "TM-OUTPUT-CORRELATION-INFORMATION-FOR-CONCEPT", 3, 0, false);
        declareFunction("init_pred_symbol_order", "INIT-PRED-SYMBOL-ORDER", 0, 0, false);
        declareFunction("init_pred_symbol_order_from_kb", "INIT-PRED-SYMBOL-ORDER-FROM-KB", 0, 0, false);
        declareFunction("store_pred_symbol_order_in_kb", "STORE-PRED-SYMBOL-ORDER-IN-KB", 1, 0, false);
        declareFunction("make_ops_to_change_pred_symbol_order_in_kb", "MAKE-OPS-TO-CHANGE-PRED-SYMBOL-ORDER-IN-KB", 1, 0, false);
        declareFunction("add_entries_to_pred_symbol_sort_order", "ADD-ENTRIES-TO-PRED-SYMBOL-SORT-ORDER", 1, 0, false);
        declareFunction("remove_entries_from_pred_symbol_sort_order", "REMOVE-ENTRIES-FROM-PRED-SYMBOL-SORT-ORDER", 1, 0, false);
        declareFunction("replace_entry_in_pred_symbol_order_list", "REPLACE-ENTRY-IN-PRED-SYMBOL-ORDER-LIST", 2, 0, false);
        declareFunction("get_pred_symbol_sort_order", "GET-PRED-SYMBOL-SORT-ORDER", 0, 0, false);
        declareFunction("found_in_pred_symbol_sort_orderP", "FOUND-IN-PRED-SYMBOL-SORT-ORDER?", 1, 0, false);
        declareFunction("position_in_pred_symbol_sort_order", "POSITION-IN-PRED-SYMBOL-SORT-ORDER", 1, 0, false);
        declareFunction("map_pred_symbol_list_to_kb_list", "MAP-PRED-SYMBOL-LIST-TO-KB-LIST", 1, 0, false);
        declareFunction("make_kb_list_from_pred_symbol", "MAKE-KB-LIST-FROM-PRED-SYMBOL", 1, 0, false);
        declareFunction("map_kb_list_to_pred_symbol_order", "MAP-KB-LIST-TO-PRED-SYMBOL-ORDER", 0, 0, false);
        declareFunction("find_relation_symbol_with_constant_term_arg", "FIND-RELATION-SYMBOL-WITH-CONSTANT-TERM-ARG", 1, 0, false);
        declareFunction("tm_find_or_create_load_term_prioritized", "TM-FIND-OR-CREATE-LOAD-TERM-PRIORITIZED", 3, 0, false);
        declareFunction("tm_find_or_create_load_term_prioritized_timestamped", "TM-FIND-OR-CREATE-LOAD-TERM-PRIORITIZED-TIMESTAMPED", 5, 0, false);
        declareFunction("tm_find_or_create_load_term", "TM-FIND-OR-CREATE-LOAD-TERM", 2, 0, false);
        declareFunction("tm_find_load_term", "TM-FIND-LOAD-TERM", 2, 0, false);
        declareFunction("tm_find_or_create_add_term", "TM-FIND-OR-CREATE-ADD-TERM", 1, 0, false);
        declareFunction("tm_concept_from_other_thesauri", "TM-CONCEPT-FROM-OTHER-THESAURI", 1, 0, false);
        declareFunction("tm_create_term", "TM-CREATE-TERM", 2, 0, false);
        declareFunction("tm_create_load_term", "TM-CREATE-LOAD-TERM", 2, 0, false);
        declareFunction("tm_note_concept_for_load_term", "TM-NOTE-CONCEPT-FOR-LOAD-TERM", 3, 0, false);
        declareFunction("tm_create", "TM-CREATE", 1, 0, false);
        declareFunction("tm_generate_concept", "TM-GENERATE-CONCEPT", 1, 0, false);
        declareFunction("tm_load_assert", "TM-LOAD-ASSERT", 2, 1, false);
        declareFunction("tm_assert", "TM-ASSERT", 2, 1, false);
        declareFunction("tm_unassert", "TM-UNASSERT", 2, 0, false);
        declareFunction("tm_load_unassert_assertion", "TM-LOAD-UNASSERT-ASSERTION", 1, 0, false);
        declareFunction("tm_timestamp_assertion", "TM-TIMESTAMP-ASSERTION", 0, 0, false);
        declareFunction("tm_timestamp_assertion_with_purpose", "TM-TIMESTAMP-ASSERTION-WITH-PURPOSE", 1, 0, false);
        declareFunction("tm_load_kill", "TM-LOAD-KILL", 1, 0, false);
        declareFunction("tm_set_thesaurus_timestamp", "TM-SET-THESAURUS-TIMESTAMP", 1, 0, false);
        declareFunction("tm_correlate_merge", "TM-CORRELATE-MERGE", 2, 0, false);
        declareFunction("tm_suggested_concept_name", "TM-SUGGESTED-CONCEPT-NAME", 2, 0, false);
        declareFunction("tm_increment_world_count", "TM-INCREMENT-WORLD-COUNT", 0, 0, false);
        declareFunction("tm_determine_incremental_save_filename", "TM-DETERMINE-INCREMENTAL-SAVE-FILENAME", 0, 0, false);
        declareFunction("tm_incremental_save_worlds", "TM-INCREMENTAL-SAVE-WORLDS", 0, 0, false);
        declareFunction("tm_remove_oldest_incremental_save", "TM-REMOVE-OLDEST-INCREMENTAL-SAVE", 0, 1, false);
        declareFunction("tm_save_incremental_world", "TM-SAVE-INCREMENTAL-WORLD", 1, 1, false);
        declareFunction("in_correlated_term_thesauriP", "IN-CORRELATED-TERM-THESAURI?", 1, 0, false);
        declareFunction("tm_correlate_lexical_terms", "TM-CORRELATE-LEXICAL-TERMS", 1, 1, false);
        declareFunction("tm_correlate_concept", "TM-CORRELATE-CONCEPT", 1, 1, false);
        declareFunction("tm_create_correlate_concept", "TM-CREATE-CORRELATE-CONCEPT", 3, 1, false);
        declareFunction("tm_merge_concepts", "TM-MERGE-CONCEPTS", 2, 0, false);
        declareFunction("tm_uncorrelate_concept", "TM-UNCORRELATE-CONCEPT", 1, 1, false);
        declareFunction("tm_uncorrelate_separate", "TM-UNCORRELATE-SEPARATE", 3, 0, false);
        declareFunction("tm_uncorrelate_substitute", "TM-UNCORRELATE-SUBSTITUTE", 3, 0, false);
        declareFunction("tm_correlation_searches_in_progress", "TM-CORRELATION-SEARCHES-IN-PROGRESS", 0, 0, false);
        declareFunction("tm_correlation_search", "TM-CORRELATION-SEARCH", 1, 0, false);
        declareFunction("tm_clear_correlation_search", "TM-CLEAR-CORRELATION-SEARCH", 1, 0, false);
        declareFunction("tm_clear_all_correlation_searches", "TM-CLEAR-ALL-CORRELATION-SEARCHES", 0, 0, false);
        declareFunction("tm_new_correlation_search", "TM-NEW-CORRELATION-SEARCH", 1, 1, false);
        declareFunction("tm_continue_correlation_search", "TM-CONTINUE-CORRELATION-SEARCH", 1, 2, false);
        declareFunction("tm_new_correlation_search_int", "TM-NEW-CORRELATION-SEARCH-INT", 1, 1, false);
        declareFunction("tm_corr_no_leaves_p", "TM-CORR-NO-LEAVES-P", 1, 0, false);
        declareFunction("tm_corr_next_node", "TM-CORR-NEXT-NODE", 1, 0, false);
        declareFunction("tm_corr_goal_p", "TM-CORR-GOAL-P", 1, 0, false);
        declareFunction("tm_corr_add_goal", "TM-CORR-ADD-GOAL", 2, 0, false);
        declareFunction("tm_corr_options", "TM-CORR-OPTIONS", 1, 0, false);
        declareFunction("tm_corr_expand", "TM-CORR-EXPAND", 2, 0, false);
        declareFunction("tm_corr_add_node", "TM-CORR-ADD-NODE", 2, 0, false);
        declareFunction("tm_corr_too_deep_p", "TM-CORR-TOO-DEEP-P", 0, 2, false);
        declareFunction("tm_corr_initialize_search", "TM-CORR-INITIALIZE-SEARCH", 2, 0, false);
        declareFunction("tm_corr_correlate_expand", "TM-CORR-CORRELATE-EXPAND", 1, 0, false);
        declareFunction("tm_corr_nt_expand", "TM-CORR-NT-EXPAND", 1, 0, false);
        declareFunction("tm_corr_dead_end_node", "TM-CORR-DEAD-END-NODE", 1, 0, false);
        declareFunction("tm_corr_reclaim_search_node", "TM-CORR-RECLAIM-SEARCH-NODE", 1, 0, false);
        declareFunction("tm_free_entire_corr_search_tree", "TM-FREE-ENTIRE-CORR-SEARCH-TREE", 1, 0, false);
        declareFunction("tm_make_partition_pathname", "TM-MAKE-PARTITION-PATHNAME", 1, 0, false);
        declareFunction("tm_make_partition_filename", "TM-MAKE-PARTITION-FILENAME", 0, 1, false);
        declareFunction("tm_new_partition_pathname", "TM-NEW-PARTITION-PATHNAME", 0, 1, false);
        declareFunction("scope_thesaurus_gensyms", "SCOPE-THESAURUS-GENSYMS", 1, 0, false);
        declareFunction("scope_thesaurus_predicates", "SCOPE-THESAURUS-PREDICATES", 0, 0, false);
        declareFunction("no_other_thesauri", "NO-OTHER-THESAURI", 1, 0, false);
        declareFunction("scope_tm_output_filters", "SCOPE-TM-OUTPUT-FILTERS", 1, 0, false);
        declareFunction("scope_thesaurus_users", "SCOPE-THESAURUS-USERS", 1, 0, false);
        declareFunction("tm_partition_spec_for_thesauri", "TM-PARTITION-SPEC-FOR-THESAURI", 1, 0, false);
        declareFunction("tm_save_partition", "TM-SAVE-PARTITION", 0, 2, false);
        declareFunction("tm_load_partition", "TM-LOAD-PARTITION", 1, 0, false);
        declareFunction("tm_directory_accessible", "TM-DIRECTORY-ACCESSIBLE", 1, 0, false);
        declareFunction("get_copy_thesaurus_tests_old_cyclist", "GET-COPY-THESAURUS-TESTS-OLD-CYCLIST", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_old_cyclist", "SET-COPY-THESAURUS-TESTS-OLD-CYCLIST", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_old_tm_user", "GET-COPY-THESAURUS-TESTS-OLD-TM-USER", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_old_tm_user", "SET-COPY-THESAURUS-TESTS-OLD-TM-USER", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_target_term3", "GET-COPY-THESAURUS-TESTS-TARGET-TERM3", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_target_term3", "SET-COPY-THESAURUS-TESTS-TARGET-TERM3", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_source_term2", "GET-COPY-THESAURUS-TESTS-SOURCE-TERM2", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_source_term2", "SET-COPY-THESAURUS-TESTS-SOURCE-TERM2", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_source_term1", "GET-COPY-THESAURUS-TESTS-SOURCE-TERM1", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_source_term1", "SET-COPY-THESAURUS-TESTS-SOURCE-TERM1", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_terms", "GET-COPY-THESAURUS-TESTS-TERMS", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_terms", "SET-COPY-THESAURUS-TESTS-TERMS", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_target_thesaurus", "GET-COPY-THESAURUS-TESTS-TARGET-THESAURUS", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_target_thesaurus", "SET-COPY-THESAURUS-TESTS-TARGET-THESAURUS", 2, 0, false);
        declareFunction("get_copy_thesaurus_tests_source_thesaurus", "GET-COPY-THESAURUS-TESTS-SOURCE-THESAURUS", 1, 0, false);
        declareFunction("set_copy_thesaurus_tests_source_thesaurus", "SET-COPY-THESAURUS-TESTS-SOURCE-THESAURUS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_copy_thesaurus_tests_class", "SUBLOOP-RESERVED-INITIALIZE-COPY-THESAURUS-TESTS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_copy_thesaurus_tests_instance", "SUBLOOP-RESERVED-INITIALIZE-COPY-THESAURUS-TESTS-INSTANCE", 1, 0, false);
        declareFunction("copy_thesaurus_tests_p", "COPY-THESAURUS-TESTS-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_tm_io_file() {
        deflexical("*THESAURUS-TEST-CONSTANT-MT*", NIL != boundp($thesaurus_test_constant_mt$) ? ((SubLObject) ($thesaurus_test_constant_mt$.getGlobalValue())) : $$UniversalVocabularyMt);
        defparameter("*TM-OUTPUT-ITEM-THESAURI*", NIL);
        defparameter("*TM-OUTPUT-ITEM-ARG*", NIL);
        defparameter("*TM-OUTPUT-ITEM-PREDICATE*", NIL);
        defparameter("*TM-OUTPUT-ITEM-VALUE-KEY-FUNC*", NIL);
        defparameter("*TM-OUTPUT-ITEM-JUST-KEY-FUNC*", NIL);
        defparameter("*TM-OUTPUT-ITEM-HASH*", make_hash_table(TWENTY_INTEGER, symbol_function(EQUALP), UNPROVIDED));
        defparameter("*TM-OUTPUT-ITEM-HASH-LOCK*", make_lock($$$Output_Item_Hashtable_Lock));
        defparameter("*TM-AVERGE-NT-COUNT*", TEN_INTEGER);
        defparameter("*TM-AVERGE-ALL-NT-COUNT*", $int$50);
        defparameter("*TM-BASIS-CONTINUATION-CHAR*", CHAR_plus);
        defparameter("*TM-BASIS-CONTINUATION-CONFIRM-CHAR*", CHAR_space);
        defparameter("*TM-BASIS-CONTINUATION-INDENT*", FIVE_INTEGER);
        defparameter("*TM-BASIS-PREVIOUS-LT-LINE*", NIL);
        defparameter("*TM-CR-LF-SET*", $list_alt22);
        defparameter("*TM-BRS-PREVIOUS-LT-LINE*", NIL);
        defparameter("*TM-BRS-SN-SYMBOL*", $$$SN);
        defparameter("*TM-BRS-CURRENT-SN*", NIL);
        defparameter("*TM-LOAD-VERBOSE?*", NIL);
        defparameter("*TM-CONCEPTS-CREATED-DURING-LOAD*", NIL);
        defparameter("*TM-LOAD-CONCEPT-REUSE-MODE*", $ANY);
        defparameter("*TM-LOAD-CONCEPT-REUSE-PRIORITY-THESAURI*", NIL);
        defparameter("*TM-LOAD-READ-METHODS*", $list_alt37);
        defparameter("*TM-LOAD-SINGLE-LINE-READ-METHODS*", $list_alt38);
        defparameter("*TM-RELATION-STATUS-HASH*", make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
        defparameter("*TM-RELATION-STATUS-HASH-LOCK*", make_lock($$$Relation_Status_Lock));
        defparameter("*TM-LOAD-TRANSCRIPT-QUEUE-WORRY-SIZE*", $int$1000);
        defvar("*TM-PREDICATE-TO-MATCH*", NIL);
        defvar("*TM-FIRST-ARG-TO-MATCH*", NIL);
        defvar("*TM-SECOND-ARG-TO-MATCH*", NIL);
        defvar("*TM-MATCHING-ASSERTION*", NIL);
        defvar("*TM-MATCHING-ASSERTION-LOCK*", make_lock($$$Matching_Assertion_Lock));
        defparameter("*TM-THESAURUS-DIFFERENCE-HASH*", NIL);
        defparameter("*TM-THESAURUS-LOAD-INPUT-HASH*", NIL);
        defparameter("*TM-THESAURUS-PREFERRED-TERM-HASH*", NIL);
        defparameter("*TM-THESAURUS-PREFERRED-TERM-DELETIONS*", NIL);
        defparameter("*TM-UPDATE-LOAD-STATE*", NIL);
        defparameter("*TM-UPDATE-LOAD-STATE-LOCK*", make_lock($$$Update_Load_State_Lock));
        defvar("*TM-CURRENT-THESAURUS-FOR-INPUT-FILE-FROBBING*", NIL);
        defparameter("*TM-COPY-SOURCE-SUBSET*", NIL);
        defparameter("*TM-COPY-TARGET-THESAURUS*", NIL);
        defparameter("*TM-COPY-ASSERTIONS-SEEN*", NIL);
        defparameter("*TM-COPY-SKIPPED-FACTS-LOG-STREAM*", NIL);
        defparameter("*TM-DUMP-OUTPUT-FILTER*", NIL);
        defparameter("*TM-DUMP-OUTPUT-CASE*", $MIXED);
        defparameter("*TM-DUMP-WRITE-METHODS*", $list_alt133);
        defparameter("*TM-DUMP-THESAURUS*", NIL);
        defparameter("*TM-DUMP-THESAURUS-STREAM*", NIL);
        defparameter("*TM-DUMP-THESAURUS-WRITE-METHOD*", NIL);
        defparameter("*TM-DUMP-CONTENTS-TABLE*", NIL);
        defparameter("*TM-DUMP-MARKED-TABLE*", NIL);
        defparameter("*TM-DUMP-BASIS-LINE-LENGTH-LIMIT*", $int$64);
        defparameter("*TM-DUMP-BRS-LINE-LENGTH-LIMIT*", $int$128);
        defparameter("*TM-VERITY-SYNONYM-SYMBOLS*", $list_alt177);
        defparameter("*TM-VERITY-CONTROL-ESCAPE-CHAR*", CHAR_quote);
        defparameter("*TM-VERITY-CONTROL-STRINGS*", $list_alt178);
        defparameter("*TM-VERITY-NON-ALPHANUMIC-REPLACEMENT-CHAR*", CHAR_space);
        defparameter("*TM-PRED-SYMBOL-SORT-ORDER*", $list_alt205);
        defconstant("*CORE-PRED-SYMBOL-ORDER-RELATIONS*", $list_alt205);
        defvar("*TM-INCREMENTAL-WORLD-NUMBER*", ZERO_INTEGER);
        defparameter("*TM-WORLD-EXTENSION*", $$$load);
        defparameter("*TM-WORLD-PREFIX*", $$$inc);
        defparameter("*CORRELATED-TERM-THESAURI*", NIL);
        defparameter("*TM-CORR-THESAURI*", NIL);
        defparameter("*TM-CORR-SEARCHES*", NIL);
        defparameter("*TM-CORR-SEARCHES-LOCK*", make_lock($$$Correlation_Searches_Lock));
        defparameter("*TM-CORR-NUMBER-CUTOFF*", TEN_INTEGER);
        defparameter("*TM-CORR-TIME-CUTOFF*", $int$30);
        defparameter("*TM-PARTITION-SPEC*", NIL);
        defparameter("*TM-PARTITION-MIN-SPEC*", NIL);
        defparameter("*OTHER-THESAURI*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tm_io_file() {
                subl_macro_promotions.declare_defglobal($thesaurus_test_constant_mt$);
        mt_vars.note_mt_var($thesaurus_test_constant_mt$, $$ThesaurusGeneratedTerm);
        utilities_macros.register_cyc_api_function(TM_API_COPY_THESAURUS, $list_alt101, $str_alt102$Copy_a_subset_of_the_thesaurus_na, $list_alt103, $list_alt104);
        utilities_macros.register_cyc_api_function(TM_OUTPUT_THESAURUS_TO_FILE, $list_alt160, $str_alt161$Outputs_thesaurus_with_THESAURUS_, $list_alt162, $list_alt104);
        utilities_macros.register_cyc_api_function(TM_OUTPUT_CORRELATION_INFORMATION, $list_alt192, $str_alt193$Output_to_PATHNAME_information_ab, $list_alt194, $list_alt104);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COPY_THESAURUS_TESTS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(COPY_THESAURUS_TESTS);
        classes.subloop_new_class(COPY_THESAURUS_TESTS, TEST_CASE, NIL, NIL, $list_alt295);
        classes.class_set_implements_slot_listeners(COPY_THESAURUS_TESTS, NIL);
        classes.subloop_note_class_initialization_function(COPY_THESAURUS_TESTS, SUBLOOP_RESERVED_INITIALIZE_COPY_THESAURUS_TESTS_CLASS);
        classes.subloop_note_instance_initialization_function(COPY_THESAURUS_TESTS, SUBLOOP_RESERVED_INITIALIZE_COPY_THESAURUS_TESTS_INSTANCE);
        subloop_reserved_initialize_copy_thesaurus_tests_class(COPY_THESAURUS_TESTS);
        sunit_macros.define_test_case_postamble(COPY_THESAURUS_TESTS, $str_alt318$tm_io, $$$cycl, NIL);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, BASIC_COPY_TEST);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_PT_DIFF_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_PT_SAME_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_PT_SAME_CASE_UNCORRELATED_WITH_RELATION);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_PT_DIFF_CASE_CORRELATED_WITH_RELATION);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_PT_DIFF_CASE_UNCORRELATED_WITH_CORRELATED_RELATED_TERM);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_UF_DIFF_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_UF_DIFF_CASE_CORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_UF_SAME_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, SAME_UF_SAME_CASE_CORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, PT_UF_DIFF_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, PT_UF_SAME_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, PT_UF_DIFF_CASE_CORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, PT_UF_SAME_CASE_CORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, UF_PT_DIFF_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, UF_PT_SAME_CASE_UNCORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, UF_PT_DIFF_CASE_CORRELATED);
        sunit_macros.def_test_method_register(COPY_THESAURUS_TESTS, UF_PT_SAME_CASE_CORRELATED);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $thesaurus_test_constant_mt$ = makeSymbol("*THESAURUS-TEST-CONSTANT-MT*");

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $$ThesaurusGeneratedTerm = constant_handles.reader_make_constant_shell(makeString("ThesaurusGeneratedTerm"));

    static private final SubLString $$$Output_Item_Hashtable_Lock = makeString("Output Item Hashtable Lock");



    private static final SubLSymbol TM_GENERATE_OUTPUT_ITEM_INTERNAL = makeSymbol("TM-GENERATE-OUTPUT-ITEM-INTERNAL");



    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    static private final SubLString $$$LT = makeString("LT");



    static private final SubLSymbol $sym10$TERM__ = makeSymbol("TERM-<");

    static private final SubLString $str_alt11$_A_is_not_of_type_tm_filter__or_t = makeString("~A is not of type tm-filter? or tm-filter-info?");



    private static final SubLSymbol $FILTERED = makeKeyword("FILTERED");

    static private final SubLList $list_alt14 = list(makeSymbol("SYMBOL"), makeSymbol("VAL-THESAURI-PAIR"));



    static private final SubLSymbol $sym16$TM_PRED_SYMBOL__ = makeSymbol("TM-PRED-SYMBOL-<");

    public static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));



    static private final SubLString $str_alt20$parse_error_at_index__S_of_file = makeString("parse error at index ~S of file");



    static private final SubLList $list_alt22 = list(CHAR_newline, CHAR_return);



    static private final SubLList $list_alt24 = cons(makeSymbol("FIRST"), makeSymbol("REST"));

    static private final SubLString $str_alt25$could_not_construct_long_string_f = makeString("could not construct long string from ~S");

    static private final SubLString $$$SN = makeString("SN");

    static private final SubLString $str_alt27$parse_error_at_index__S_of_file__ = makeString("parse error at index ~S of file, while performing the relation check sweep.");



    private static final SubLSymbol TM_LOAD_THESAURUS_CHECK_ITEM = makeSymbol("TM-LOAD-THESAURUS-CHECK-ITEM");

    static private final SubLString $str_alt30$Checking_relations_used_in_file__ = makeString("Checking relations used in file ~A");



    private static final SubLSymbol TM_LOAD_THESAURUS_ADD_ITEM = makeSymbol("TM-LOAD-THESAURUS-ADD-ITEM");

    static private final SubLString $str_alt33$Loading_thesaurus_file__A = makeString("Loading thesaurus file ~A");



    static private final SubLString $str_alt35$Unable_to_open__S = makeString("Unable to open ~S");



    static private final SubLList $list_alt37 = list(list(makeKeyword("BASIS"), makeSymbol("TM-READ-BASIS-FILE-ITEM")), list(makeKeyword("BRS"), makeSymbol("TM-READ-BRS-FILE-ITEM")));

    static private final SubLList $list_alt38 = list(list(makeKeyword("BASIS"), makeSymbol("TM-READ-BASIS-SINGLE-LINE")), list(makeKeyword("BRS"), makeSymbol("TM-READ-BRS-SINGLE-LINE")));





    static private final SubLString $str_alt41$_A_is_not_a_supported_thesaurus_l = makeString("~A is not a supported thesaurus load format");

    static private final SubLString $str_alt42$Input_file__A_does_not_exist = makeString("Input file ~A does not exist");





    static private final SubLString $$$THESAURUS = makeString("THESAURUS");

    private static final SubLSymbol $LOAD_THESAURUS = makeKeyword("LOAD-THESAURUS");

    private static final SubLSymbol TM_LOAD_THESAURUS_FROM_FILE_WRAPPER = makeSymbol("TM-LOAD-THESAURUS-FROM-FILE-WRAPPER");

    static private final SubLString $$$SUCCESS = makeString("SUCCESS");

    static private final SubLString $$$INCOMPLETE = makeString("INCOMPLETE");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLString $$$Relation_Status_Lock = makeString("Relation Status Lock");

    private static final SubLSymbol $INACTIVE = makeKeyword("INACTIVE");

    private static final SubLSymbol $RESTRICTED = makeKeyword("RESTRICTED");



    static private final SubLString $str_alt55$_______item_ = makeString("~%~%;; item:");



    static private final SubLString $str_alt57$The_relation___S__is_not_an_activ = makeString("The relation, ~S, is not an active relation.  Correct this problem and retry the load operation.");

    static private final SubLString $str_alt58$The_relation___S__is_restricted_f = makeString("The relation, ~S, is restricted from use in the load target thesaurus.  Correct this problem and retry the load operation.");

    static private final SubLString $str_alt59$The_relation_string___S__does_not = makeString("The relation string, ~S, does not identify a known relation.  Correct this problem and retry the load operation.");

    static private final SubLString $str_alt60$The_relation_string___S__has_no_k = makeString("The relation string, ~S, has no known status. Please report this as an error.");



    static private final SubLList $list_alt62 = cons(makeSymbol("LEAD-TERM-SPEC"), makeSymbol("ASSERTION-SPECS"));

    static private final SubLList $list_alt63 = list(makeSymbol("PRED-STRING"), makeSymbol("ARG-STRING"), makeSymbol("VAL-STRING"));

    static private final SubLString $str_alt64$The_load_file_references_the_unkn = makeString("The load file references the unknown relation ~S.  Fix this problem first.");

    static private final SubLList $list_alt65 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1-STRING"), makeSymbol("ARG2-STRING"));



    private static final SubLSymbol TM_LOAD_INTO_HASHTABLE = makeSymbol("TM-LOAD-INTO-HASHTABLE");

    static private final SubLString $$$Categorizing_merge_load_items = makeString("Categorizing merge load items");

    static private final SubLString $$$Matching_Assertion_Lock = makeString("Matching Assertion Lock");

    static private final SubLList $list_alt70 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1-TERM"), makeSymbol("ARG2-TERM"));



    private static final SubLSymbol TM_ASSERTION_SPEC_STRING_LOOKUP_INTERNAL = makeSymbol("TM-ASSERTION-SPEC-STRING-LOOKUP-INTERNAL");



    static private final SubLString $$$Determining_additions = makeString("Determining additions");

    private static final SubLSymbol TM_PROCESS_THESAURUS_DIFFERENCE_INTERNAL = makeSymbol("TM-PROCESS-THESAURUS-DIFFERENCE-INTERNAL");

    static private final SubLString $$$Noting_all_preferred_terms = makeString("Noting all preferred terms");

    static private final SubLList $list_alt77 = list(makeSymbol("PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    public static final SubLObject $$topInThesaurus = constant_handles.reader_make_constant_shell(makeString("topInThesaurus"));

    static private final SubLString $$$Update_Load_State_Lock = makeString("Update Load State Lock");

    static private final SubLSymbol $sym80$THESAURUS_ = makeSymbol("THESAURUS?");

    static private final SubLList $list_alt81 = list(makeSymbol("THES"), makeSymbol("NEW-TERM-HASH"), makeSymbol("ADDITION-HASH"), makeSymbol("DELETION-HASH"), makeSymbol("CONCEPT-REUSE-INFO"));

    static private final SubLString $$$Sorting_deletions_by_term = makeString("Sorting deletions by term");



    static private final SubLString $str_alt84$Changing_Input_to_Thesaurus_Case_ = makeString("Changing Input to Thesaurus Case Style");

    private static final SubLSymbol TM_CANONICALIZE_GAF_STRINGS_DURING_INPUT_FILE_FROBBING = makeSymbol("TM-CANONICALIZE-GAF-STRINGS-DURING-INPUT-FILE-FROBBING");

    static private final SubLString $str_alt86$Checking_Case_of_Preferred_Terms_ = makeString("Checking Case of Preferred Terms.");





    static private final SubLString $str_alt89$Copy_failed__the_source_and_targe = makeString("Copy failed; the source and target thesauri should be different.");

    static private final SubLString $str_alt90$Copy_failed___A_is_not_the_name_o = makeString("Copy failed; ~A is not the name of a known thesaurus.");





    static private final SubLString $str_alt93$Copy_failed__ = makeString("Copy failed; ");

    static private final SubLString $str_alt94$Copy_failed_to_understand_target_ = makeString("Copy failed to understand target term");

    static private final SubLString $str_alt95$Copy_failed_to_understand_some_st = makeString("Copy failed to understand some start term");

    static private final SubLString $str_alt96$Copy_failed_to_understand_some_cu = makeString("Copy failed to understand some cutoff term");



    static private final SubLString $str_alt98$Copy_failed_with_error__ = makeString("Copy failed with error: ");

    static private final SubLString $$$Copy_succeeded = makeString("Copy succeeded");

    private static final SubLSymbol TM_API_COPY_THESAURUS = makeSymbol("TM-API-COPY-THESAURUS");

    static private final SubLList $list_alt101 = list(makeSymbol("SOURCE-THESAURUS-NAME"), makeSymbol("TARGET-THESAURUS-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("TARGET-TERM-NAME"), makeSymbol("START-TERM-NAMES"), makeSymbol("CUTOFF-TERM-NAMES"), makeSymbol("CUTOFF-LEVEL"));

    static private final SubLString $str_alt102$Copy_a_subset_of_the_thesaurus_na = makeString("Copy a subset of the thesaurus named SOURCE-THESAURUS-NAME to the thesaurus \n   named TARGET-THESAURUS-NAME.  \n   If TARGET-TERM-NAME is non-nil, then terms copied without BTs are given \n   the term with TARGET-TERM-name  as their BT. \n   START-TERM-NAMES are the terms from which to start recursively including \n   in the subset.\n   CUTOFF-TERM-NAMES are terms beyond which we won\'t recurse.\n   CUTOFF-LEVEL, if present, is a level below the START-TERMS beyond which we \n   won\'t recurse.\n   All assertions which involve terms present in either the subset or \n   TARGET-THESAURUS are included.");

    static private final SubLList $list_alt103 = list(list(makeSymbol("SOURCE-THESAURUS-NAME"), makeSymbol("STRINGP")), list(makeSymbol("TARGET-THESAURUS-NAME"), makeSymbol("STRINGP")), list(makeSymbol("TARGET-TERM-NAME"), list(makeSymbol("NIL-OR"), makeSymbol("STRINGP"))), list(makeSymbol("START-TERM-NAMES"), list(makeSymbol("NIL-OR"), makeSymbol("LISTP"))), list(makeSymbol("CUTOFF-TERM-NAMES"), list(makeSymbol("NIL-OR"), makeSymbol("LISTP"))), list(makeSymbol("CUTOFF-LEVEL"), list(makeSymbol("NIL-OR"), makeSymbol("INTEGERP"))));

    static private final SubLList $list_alt104 = list(makeSymbol("STRINGP"));

    private static final SubLSymbol $MULTIPLE_LEXPRED = makeKeyword("MULTIPLE-LEXPRED");

    static private final SubLString $str_alt106$_A_has_multiple_preferred_term_st = makeString("~A has multiple preferred term statements in ~A.  Integrity-check this term to fix.");

    static private final SubLString $str_alt107$Invalid_term_name___A_is_not_a_pr = makeString("Invalid term name: ~A is not a preferred term in ~A.");

    static private final SubLString $str_alt108$_a_a = makeString("~a~a");

    static private final SubLString $str_alt109$copy_log__a = makeString("copy-log-~a");



    static private final SubLString $str_alt111$Copying__S_subset_to__S = makeString("Copying ~S subset to ~S");



    private static final SubLSymbol TM_COPY_THESAURUS_SUBSET_INTERNAL = makeSymbol("TM-COPY-THESAURUS-SUBSET-INTERNAL");

    static private final SubLString $str_alt114$Determining_top_of__S_subset_in__ = makeString("Determining top of ~S subset in ~S");

    static private final SubLSymbol $sym115$TM_COPY_SUBSET_CONSTANT_NOT_PRESENT_ = makeSymbol("TM-COPY-SUBSET-CONSTANT-NOT-PRESENT?");

    static private final SubLString $str_alt116$Source_and_Target_thesauri_are_id = makeString("Source and Target thesauri are identical.");

    static private final SubLString $str_alt117$_S_is_already_a_preferred_term_in = makeString("~S is already a preferred term in ~A.");

    static private final SubLString $str_alt118$_S_is_already_a_preferred_term_fo = makeString("~S is already a preferred term for a different concept in ~A");

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    static private final SubLString $str_alt120$_S_is_a_use_for_in__A_ = makeString("~S is a use-for in ~A.");

    static private final SubLString $str_alt121$_S_is_already_a_use_for_in__A = makeString("~S is already a use-for in ~A");

    static private final SubLString $str_alt122$_S_is_a_preferred_term_in__A = makeString("~S is a preferred term in ~A");

    static private final SubLString $str_alt123$__A__can_t_be_copied_to__A__becau = makeString("`~A' can't be copied to ~A (because ~A), and its underlying concept has no preferred term there");

    static private final SubLString $str_alt124$_S_is_already_a__A_for_some_term_ = makeString("~S is already a ~A for some term in ~A");



    static private final SubLString $str_alt126$____Skipped____A = makeString("~%~%Skipped:  ~A");

    static private final SubLString $str_alt127$__Reason_____A = makeString("~%Reason:   ~A");

    static private final SubLString $str_alt128$_A_is_a_preferred_term = makeString("~A is a preferred term");

    static private final SubLString $str_alt129$__A_ = makeString("`~A'");

    static private final SubLString $str_alt130$__A_ = makeString("\"~A\"");

    static private final SubLString $str_alt131$__A__A__A__from__A = makeString("[~A ~A ~A] from ~A");



    static private final SubLList $list_alt133 = list(list(makeKeyword("BASIS"), makeSymbol("TM-DUMP-BASIS-FILE-ITEM"), T), list(makeKeyword("BRS"), makeSymbol("TM-DUMP-BRS-FILE-ITEM"), T), list(makeKeyword("VERITY"), makeSymbol("TM-DUMP-VERITY-FILE-ITEM"), NIL, makeSymbol("TM-DUMP-VERITY-PREAMBLE"), makeSymbol("TM-DUMP-VERITY-POSTAMBLE")));

    static private final SubLString $str_alt134$_A_is_not_a_supported_thesaurus_d = makeString("~A is not a supported thesaurus dump format");

    static private final SubLList $list_alt135 = list(makeSymbol("FORMAT"), makeSymbol("WRITE-METHOD"), makeSymbol("MAP-UFS?"), makeSymbol("&OPTIONAL"), makeSymbol("PREAMBLE"), makeSymbol("POSTAMBLE"));

    static private final SubLString $str_alt136$Writing__S_preferred_terms = makeString("Writing ~S preferred terms");

    private static final SubLSymbol TM_DUMP_THESAURUS_PT_INFO = makeSymbol("TM-DUMP-THESAURUS-PT-INFO");

    static private final SubLString $str_alt138$ = makeString("");

    static private final SubLString $str_alt139$Writing__S_use_fors = makeString("Writing ~S use fors");

    private static final SubLSymbol TM_DUMP_THESAURUS_UF_INFO = makeSymbol("TM-DUMP-THESAURUS-UF-INFO");

    private static final SubLSymbol TM_DUMP_VALUE_CONVERT = makeSymbol("TM-DUMP-VALUE-CONVERT");



    static private final SubLString $$$USE = makeString("USE");

    static private final SubLString $str_alt144$Writing__S_subset = makeString("Writing ~S subset");

    private static final SubLSymbol TM_DUMP_SUBSET_ALL_PRESENT = makeSymbol("TM-DUMP-SUBSET-ALL-PRESENT");

    static private final SubLSymbol $sym146$TM_DUMP_SUBSET_CONSTANT_NOT_PRESENT_ = makeSymbol("TM-DUMP-SUBSET-CONSTANT-NOT-PRESENT?");

    static private final SubLString $str_alt147$_ = makeString("-");

    static private final SubLString $str_alt148$_ = makeString(".");



    static private final SubLString $str_alt150$_A_is_not_a_valid_thesaurus_name_ = makeString("~A is not a valid thesaurus name.");

    static private final SubLString $str_alt151$_A_is_not_a_supported_thesaurus_o = makeString("~A is not a supported thesaurus output format.");





    static private final SubLString $str_alt154$_A_is_not_a_valid_case___Must_be_ = makeString("~A is not a valid case.  Must be :upper, :lower, or :mixed.");

    static private final SubLString $str_alt155$_A_is_not_a_valid_output_filter_n = makeString("~A is not a valid output filter name.");

    static private final SubLString $str_alt156$Cutoff_level_must_be_non_negative = makeString("Cutoff level must be non-negative.");

    static private final SubLString $str_alt157$Output_of_thesaurus_ = makeString("Output of thesaurus ");

    static private final SubLString $str_alt158$_is_not_permitted_because_it_is_c = makeString(" is not permitted because it is currently being edited.  Please try again later.");

    private static final SubLSymbol TM_OUTPUT_THESAURUS_TO_FILE = makeSymbol("TM-OUTPUT-THESAURUS-TO-FILE");

    static private final SubLList $list_alt160 = list(new SubLObject[]{ makeSymbol("THESAURUS-NAME"), makeSymbol("FILENAME"), makeSymbol("FORMAT"), makeSymbol("&OPTIONAL"), makeSymbol("CASE"), makeSymbol("FILTER-NAME"), makeSymbol("START-TERMS"), makeSymbol("CUTOFF-TERMS"), makeSymbol("CUTOFF-LEVEL") });

    static private final SubLString $str_alt161$Outputs_thesaurus_with_THESAURUS_ = makeString("Outputs thesaurus with THESAURUS-NAME to FILENAME using FORMAT (one of :BRS, \n  :BASIS or :VERITY).  If CASE (one of :upper, :lower, or :mixed) is specified, \n  the output is done in that text case.  If FILTER-NAME is specified, the \n  thesaurus is output using that filter.  If START-TERMS, CUTOFF-TERMS, or \n  CUTOFF-LEVEL are given, only the relevant part of THESAURUS will be output.\n  The lists START-TERMS and CUTOFF-TERMS may contain either strings (preferred \n  terms) or FORTs.\n    thesaurus-name\n      The name of the thesaurus to output.\n    filename\n      The full path and filename for the output.\n    format\n      Specifies the output format.  Must be either :BRS, :BASIS, or :VERITY.\n    case\n      Either :upper, :lower, or :mixed.  Causes the output to be done in the \n      specified case.  If this is nil, output will be in mixed case.\n    filter-name\n      The name of the output filter to use, or nil if none.  Output filters \n      can be created using the Thesaurus Manager.\n    start-terms\n      This should be a list of terms (strings).  If start-terms is non-nil, \n      only the start-terms and those terms below them in the hierarchy will \n      be included in the output.  (FORTs will work in place of term names.\n      If you don\'t know what those are, just use the term names.)\n    cutoff-terms\n      Used only if start-terms is non-nil.  This is a list of terms \n      (strings).  Output will not include any terms narrower than these.\n    cutoff-level\n      Used only if start-terms is non-nil.  Specifies the number of levels \n      below the start terms to include in the output.\n  Returns the filename if successful; returns an error message otherwise.");

    static private final SubLList $list_alt162 = list(list(makeSymbol("THESAURUS-NAME"), makeSymbol("STRINGP")), list(makeSymbol("FILENAME"), makeSymbol("STRINGP")), list(makeSymbol("FORMAT"), makeSymbol("KEYWORDP")), list(makeSymbol("CASE"), list(makeSymbol("NIL-OR"), makeSymbol("KEYWORDP"))), list(makeSymbol("FILTER-NAME"), list(makeSymbol("NIL-OR"), makeSymbol("STRINGP"))), list(makeSymbol("START-TERMS"), list(makeSymbol("NIL-OR"), makeSymbol("LISTP"))), list(makeSymbol("CUTOFF-TERMS"), list(makeSymbol("NIL-OR"), makeSymbol("LISTP"))), list(makeSymbol("CUTOFF-LEVEL"), list(makeSymbol("NIL-OR"), makeSymbol("INTEGERP"))));



    static private final SubLList $list_alt164 = list(makeSymbol("SYMBOL"), makeSymbol("VALUES"));



    static private final SubLString $str_alt166$_A___ = makeString("~A = ");

    static private final SubLString $str_alt167$_A__ = makeString("~A~%");

    static private final SubLString $str_alt168$_A_C__ = makeString("~A~C~%");

    public static final SubLInteger $int$128 = makeInteger(128);

    static private final SubLString $str_alt170$_A__A__ = makeString("~A ~A~%");

    static private final SubLString $str_alt171$___A_thesaurus____A = makeString("# ~A thesaurus:  ~A");

    static private final SubLString $str_alt172$_____control__1__synonyms______ = makeString("~%~%$control: 1~%synonyms:~%{~%");

    private static final SubLSymbol TM_VERITY_SYNONYM_SYMBOL = makeSymbol("TM-VERITY-SYNONYM-SYMBOL");

    static private final SubLString $str_alt174$__list__ = makeString("  list: ");

    static private final SubLList $list_alt175 = list(makeSymbol("SYMBOL"), makeSymbol("LT-VALUES"));

    static private final SubLString $str_alt176$_______ = makeString("}~%$$~%");

    static private final SubLList $list_alt177 = list(makeString("UF"), makeString("SYN"));

    static private final SubLList $list_alt178 = list(makeString(" and "), makeString(" or "), makeString(" not "));



    static private final SubLString $str_alt180$__C = makeString("\\~C");

    public static final SubLObject $$scopeNote = constant_handles.reader_make_constant_shell(makeString("scopeNote"));





    static private final SubLString $str_alt184$Error__The_file__S_is_not_writabl = makeString("Error: The file ~S is not writable.");

    static private final SubLString $str_alt185$Error__You_have_not_specified_any = makeString("Error: You have not specified any thesauri; no output will be generated.");

    static private final SubLString $str_alt186$__Warning__You_have_only_specifie = makeString("~%Warning: You have only specified one thesaurus.  Only correlations with Cyc terms will be output.");

    static private final SubLString $str_alt187$Error__You_have_only_specified_on = makeString("Error: You have only specified one thesaurus, and have asked to not print correlations to Cyc terms.  There is nothing to output.");

    static private final SubLString $str_alt188$Error__The_string__S_is_not_the_n = makeString("Error: The string ~S is not the name of a known thesaurus.");



    static private final SubLString $str_alt190$___A___A = makeString("~%~A~%~A");

    private static final SubLSymbol TM_OUTPUT_CORRELATION_INFORMATION = makeSymbol("TM-OUTPUT-CORRELATION-INFORMATION");

    static private final SubLList $list_alt192 = list(makeSymbol("PATHNAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("THESAURI-NAMES"), list(makeSymbol("ALL-THESAURI-NAMES"))), makeSymbol("OMIT-CYC-CORRELATES?"));

    static private final SubLString $str_alt193$Output_to_PATHNAME_information_ab = makeString("Output to PATHNAME information about terms that have correlations across the thesauri designated \n   by THESAURI-NAMES.  For each concept having a preferred term in one of the thesauri specified, \n   a line will be output if that concept has PTs in more than one of the thesauri.  If OMIT-CYC-CORRELATES? \n   is nil (which is the default), a line will be output for a concept if it has a PT in only one of the \n   thesauri, but it\'s a full-fledged Cyc concept (not just a concept generated to hold thesaurus knowledge).  \n   If OMIT-CYC-CORRELATES? is non-nil, those one-PT lines won\'t be printed.  \n   The form of each line output is as follows.  All fields are separated by vertical bars, and strings \n   containing vertical bars will have them precededby by the escape character: \n   cyc-concept|preferred-term-string1|thesaurus-name1|...|preferred-term-string-n|thesaurus-name-n\n   ");

    static private final SubLList $list_alt194 = list(list(makeSymbol("PATHNAME"), makeSymbol("STRINGP")), list(makeSymbol("THESAURI-NAMES"), makeSymbol("CONSP")), list(makeSymbol("OMIT-CYC-CORRELATES?"), makeSymbol("BOOLEANP")));

    static private final SubLString $str_alt195$____Correlation_information_for_t = makeString("~%# Correlation information for thesauri:~%");

    static private final SubLString $str_alt196$__ = makeString("# ");

    static private final SubLString $str_alt197$_S_ = makeString("~S ");

    static private final SubLString $str_alt198$_____A = makeString("~%# ~A");

    static private final SubLString $str_alt199$____Code_version__A = makeString("~%# Code version ~A");

    static private final SubLString $str_alt200$____KB_version__A = makeString("~%# KB version ~A");

    static private final SubLString $str_alt201$__ = makeString("~%");

    static private final SubLString $str_alt202$___A = makeString("~%~A");

    static private final SubLList $list_alt203 = list(CHAR_vertical);

    static private final SubLString $str_alt204$___A____A_ = makeString("|\"~A\"|\"~A\"");

    static private final SubLList $list_alt205 = list(makeString("LT"), makeString("SN"), makeString("UF"), makeString("USE"), makeString("BT"), makeString("NT"), makeString("RT"), makeString("SYN"));

    public static final SubLObject $$tmRelationOrderList = constant_handles.reader_make_constant_shell(makeString("tmRelationOrderList"));



    static private final SubLString $str_alt208$_Ordering_of_Relations__a_ = makeString(" Ordering of Relations ~a ");



    static private final SubLSymbol $sym210$FOUND_IN_PRED_SYMBOL_SORT_ORDER_ = makeSymbol("FOUND-IN-PRED-SYMBOL-SORT-ORDER?");

    static private final SubLString $str_alt211$Attempted_to_replace__a_with__a__ = makeString("Attempted to replace ~a with ~a, but ~a already occurs in ordering.");

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    private static final SubLSymbol MAKE_KB_LIST_FROM_PRED_SYMBOL = makeSymbol("MAKE-KB-LIST-FROM-PRED-SYMBOL");

    static private final SubLString $$$SYN = makeString("SYN");

    public static final SubLObject $$tmSynonym = constant_handles.reader_make_constant_shell(makeString("tmSynonym"));

    private static final SubLSymbol FIND_RELATION_SYMBOL_WITH_CONSTANT_TERM_ARG = makeSymbol("FIND-RELATION-SYMBOL-WITH-CONSTANT-TERM-ARG");





    static private final SubLString $str_alt219$_____reusing__S_for__S_in__S = makeString("~%;; reusing ~S for ~S in ~S");

    private static final SubLSymbol SIGN_CONCEPT = makeSymbol("SIGN-CONCEPT");

    private static final SubLSymbol SIGN_THESAURUS = makeSymbol("SIGN-THESAURUS");



    static private final SubLString $str_alt223$Error__Constant_name__A_is_alread = makeString("Error: Constant name ~A is already in use.");

    static private final SubLString $str_alt224$___FI_CREATE__UNNAMED_ = makeString("~%(FI-CREATE :UNNAMED)");



    static private final SubLString $str_alt226$___FI_RENAME___S___S_ = makeString("~%(FI-RENAME '~S '~S)");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt228 = list(constant_handles.reader_make_constant_shell(makeString("ThesaurusGeneratedTerm")));

    static private final SubLString $str_alt229$___FI_ASSERT___S___S__MONOTONIC_ = makeString("~%(FI-ASSERT '~S '~S :MONOTONIC)");

    static private final SubLString $str_alt230$___FI_ASSERT___S___S_ = makeString("~%(FI-ASSERT '~S '~S)");

    static private final SubLString $str_alt231$___FI_UNASSERT___S___S_ = makeString("~%(FI-UNASSERT '~S '~S)");

    static private final SubLString $str_alt232$___FI_KILL___S_ = makeString("~%(FI-KILL '~S)");

    public static final SubLObject $$thesaurusLoadedBy = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadedBy"));

    public static final SubLObject $$thesaurusLoadDate = constant_handles.reader_make_constant_shell(makeString("thesaurusLoadDate"));

    static private final SubLString $str_alt235$TM__A__A = makeString("TM-~A-~A");

    static private final SubLString $$$load = makeString("load");

    static private final SubLString $$$inc = makeString("inc");

    static private final SubLString $str_alt238$_A__A__2__0D = makeString("~A-~A-~2,'0D");

    static private final SubLList $list_alt239 = list(makeString("world"));

    private static final SubLSymbol STRING_GREATERP = makeSymbol("STRING-GREATERP");

    static private final SubLList $list_alt241 = list(makeKeyword("ACRONYMS"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLSymbol $sym244$IN_CORRELATED_TERM_THESAURI_ = makeSymbol("IN-CORRELATED-TERM-THESAURI?");

    static private final SubLSymbol $sym245$THESAURUS_GENSYM_ = makeSymbol("THESAURUS-GENSYM?");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");

    static private final SubLString $str_alt247$Can_t_uncorrelate__A_in_foreign_t = makeString("Can't uncorrelate ~A in foreign thesauri ~A");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLSymbol $sym249$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    static private final SubLString $$$Correlation_Searches_Lock = makeString("Correlation Searches Lock");

    public static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol TM_CLEAR_CORRELATION_SEARCH = makeSymbol("TM-CLEAR-CORRELATION-SEARCH");

    private static final SubLSymbol SEARCH_STRUC_P = makeSymbol("SEARCH-STRUC-P");

    private static final SubLSymbol TM_CORR_DEAD_END_NODE = makeSymbol("TM-CORR-DEAD-END-NODE");

    private static final SubLSymbol TM_CORR_RECLAIM_SEARCH_NODE = makeSymbol("TM-CORR-RECLAIM-SEARCH-NODE");



    private static final SubLSymbol TM_CORR_NO_LEAVES_P = makeSymbol("TM-CORR-NO-LEAVES-P");

    private static final SubLSymbol TM_CORR_NEXT_NODE = makeSymbol("TM-CORR-NEXT-NODE");

    private static final SubLSymbol TM_CORR_GOAL_P = makeSymbol("TM-CORR-GOAL-P");

    private static final SubLSymbol TM_CORR_ADD_GOAL = makeSymbol("TM-CORR-ADD-GOAL");

    private static final SubLSymbol TM_CORR_OPTIONS = makeSymbol("TM-CORR-OPTIONS");

    private static final SubLSymbol TM_CORR_EXPAND = makeSymbol("TM-CORR-EXPAND");

    private static final SubLSymbol TM_CORR_ADD_NODE = makeSymbol("TM-CORR-ADD-NODE");

    private static final SubLSymbol TM_CORR_TOO_DEEP_P = makeSymbol("TM-CORR-TOO-DEEP-P");

    static private final SubLList $list_alt265 = list(makeSymbol("THESAURUS"), makeSymbol("TABLE"));

    static private final SubLList $list_alt266 = list(makeKeyword("CORRELATE"), makeKeyword("NT"));

    private static final SubLSymbol $CORRELATE = makeKeyword("CORRELATE");



    static private final SubLString $str_alt269$So_don_t = makeString("So don't");

    static private final SubLString $str_alt270$Cannot_reclaim_strange_node__S = makeString("Cannot reclaim strange node ~S");

    static private final SubLString $str_alt271$_A_ = makeString("~A-");

    static private final SubLString $str_alt272$_a_a_a = makeString("~a~a~a");

    static private final SubLString $str_alt273$_a_ = makeString("~a-");

    static private final SubLString $str_alt274$__a = makeString(".~a");

    public static final SubLObject $$ThesaurusPredicate_Generic = constant_handles.reader_make_constant_shell(makeString("ThesaurusPredicate-Generic"));





    public static final SubLObject $$TMOutputFilter = constant_handles.reader_make_constant_shell(makeString("TMOutputFilter"));

    private static final SubLSymbol NO_OTHER_THESAURI = makeSymbol("NO-OTHER-THESAURI");

    private static final SubLSymbol SCOPE_PARTITION_ASSERTION_SELECTIVE = makeSymbol("SCOPE-PARTITION-ASSERTION-SELECTIVE");

    public static final SubLObject $$ThesaurusEntity = constant_handles.reader_make_constant_shell(makeString("ThesaurusEntity"));



    private static final SubLSymbol SCOPE_THESAURUS_PREDICATES = makeSymbol("SCOPE-THESAURUS-PREDICATES");

    private static final SubLSymbol SCOPE_THESAURUS_USERS = makeSymbol("SCOPE-THESAURUS-USERS");

    private static final SubLSymbol SCOPE_TM_OUTPUT_FILTERS = makeSymbol("SCOPE-TM-OUTPUT-FILTERS");



    private static final SubLSymbol SCOPE_PARTITION_MT_INDEX = makeSymbol("SCOPE-PARTITION-MT-INDEX");

    private static final SubLSymbol SCOPE_THESAURUS_GENSYMS = makeSymbol("SCOPE-THESAURUS-GENSYMS");

    static private final SubLString $str_alt289$File__S_cannot_be_accessed = makeString("File ~S cannot be accessed");

    static private final SubLString $str_alt290$access_test = makeString("access-test");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol COPY_THESAURUS_TESTS = makeSymbol("COPY-THESAURUS-TESTS");



    static private final SubLList $list_alt295 = list(new SubLObject[]{ list(makeSymbol("SOURCE-THESAURUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-THESAURUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOURCE-TERM1"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOURCE-TERM2"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-TERM3"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OLD-TM-USER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OLD-CYCLIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BASIC-COPY-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-PT-DIFF-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-PT-SAME-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-PT-SAME-CASE-UNCORRELATED-WITH-RELATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-PT-DIFF-CASE-CORRELATED-WITH-RELATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-PT-DIFF-CASE-UNCORRELATED-WITH-CORRELATED-RELATED-TERM"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-UF-DIFF-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-UF-DIFF-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-UF-SAME-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SAME-UF-SAME-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PT-UF-DIFF-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PT-UF-SAME-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PT-UF-DIFF-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PT-UF-SAME-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UF-PT-DIFF-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UF-PT-SAME-CASE-UNCORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UF-PT-DIFF-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UF-PT-SAME-CASE-CORRELATED"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol OLD_CYCLIST = makeSymbol("OLD-CYCLIST");

    private static final SubLSymbol OLD_TM_USER = makeSymbol("OLD-TM-USER");

    private static final SubLSymbol TARGET_TERM3 = makeSymbol("TARGET-TERM3");

    private static final SubLSymbol SOURCE_TERM2 = makeSymbol("SOURCE-TERM2");

    private static final SubLSymbol SOURCE_TERM1 = makeSymbol("SOURCE-TERM1");



    private static final SubLSymbol TARGET_THESAURUS = makeSymbol("TARGET-THESAURUS");

    private static final SubLSymbol SOURCE_THESAURUS = makeSymbol("SOURCE-THESAURUS");

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COPY_THESAURUS_TESTS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COPY-THESAURUS-TESTS-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COPY_THESAURUS_TESTS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COPY-THESAURUS-TESTS-INSTANCE");

    static private final SubLString $str_alt318$tm_io = makeString("tm-io");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol BASIC_COPY_TEST = makeSymbol("BASIC-COPY-TEST");

    private static final SubLSymbol SAME_PT_DIFF_CASE_UNCORRELATED = makeSymbol("SAME-PT-DIFF-CASE-UNCORRELATED");

    private static final SubLSymbol SAME_PT_SAME_CASE_UNCORRELATED = makeSymbol("SAME-PT-SAME-CASE-UNCORRELATED");

    private static final SubLSymbol SAME_PT_SAME_CASE_UNCORRELATED_WITH_RELATION = makeSymbol("SAME-PT-SAME-CASE-UNCORRELATED-WITH-RELATION");

    private static final SubLSymbol SAME_PT_DIFF_CASE_CORRELATED_WITH_RELATION = makeSymbol("SAME-PT-DIFF-CASE-CORRELATED-WITH-RELATION");

    private static final SubLSymbol SAME_PT_DIFF_CASE_UNCORRELATED_WITH_CORRELATED_RELATED_TERM = makeSymbol("SAME-PT-DIFF-CASE-UNCORRELATED-WITH-CORRELATED-RELATED-TERM");

    private static final SubLSymbol SAME_UF_DIFF_CASE_UNCORRELATED = makeSymbol("SAME-UF-DIFF-CASE-UNCORRELATED");

    private static final SubLSymbol SAME_UF_DIFF_CASE_CORRELATED = makeSymbol("SAME-UF-DIFF-CASE-CORRELATED");

    private static final SubLSymbol SAME_UF_SAME_CASE_UNCORRELATED = makeSymbol("SAME-UF-SAME-CASE-UNCORRELATED");

    private static final SubLSymbol SAME_UF_SAME_CASE_CORRELATED = makeSymbol("SAME-UF-SAME-CASE-CORRELATED");

    private static final SubLSymbol PT_UF_DIFF_CASE_UNCORRELATED = makeSymbol("PT-UF-DIFF-CASE-UNCORRELATED");

    private static final SubLSymbol PT_UF_SAME_CASE_UNCORRELATED = makeSymbol("PT-UF-SAME-CASE-UNCORRELATED");

    private static final SubLSymbol PT_UF_DIFF_CASE_CORRELATED = makeSymbol("PT-UF-DIFF-CASE-CORRELATED");

    private static final SubLSymbol PT_UF_SAME_CASE_CORRELATED = makeSymbol("PT-UF-SAME-CASE-CORRELATED");

    private static final SubLSymbol UF_PT_DIFF_CASE_UNCORRELATED = makeSymbol("UF-PT-DIFF-CASE-UNCORRELATED");

    private static final SubLSymbol UF_PT_SAME_CASE_UNCORRELATED = makeSymbol("UF-PT-SAME-CASE-UNCORRELATED");

    private static final SubLSymbol UF_PT_DIFF_CASE_CORRELATED = makeSymbol("UF-PT-DIFF-CASE-CORRELATED");

    private static final SubLSymbol UF_PT_SAME_CASE_CORRELATED = makeSymbol("UF-PT-SAME-CASE-CORRELATED");

    // // Initializers
    public void declareFunctions() {
        declare_tm_io_file();
    }

    public void initializeVariables() {
        init_tm_io_file();
    }

    public void runTopLevelForms() {
        setup_tm_io_file();
    }
}

