/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CR-SEARCH-TOOL
 *  source file: /cyc/top/cycl/cr-search-tool.lisp
 *  created:     2019/07/03 17:38:12
 */
public final class cr_search_tool extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cr_search_tool() {
    }

    public static final SubLFile me = new cr_search_tool();


    // // Definitions
    public static final SubLObject new_cr_search(SubLObject fort) {
        SubLSystemTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject state = new_cr_search_state(fort);
            SubLObject v_search = search.new_search(CR_NO_LEAVES_P, CR_NEXT_NODE, CR_GOAL_P, CR_ADD_GOAL, CR_OPTIONS, CR_EXPAND, CR_ADD_NODE, CR_TOO_DEEP_P, state, UNPROVIDED);
            initialize_cr_search(v_search);
            search.add_search_start_node(v_search, new_cr_node_state(fort, UNPROVIDED));
            return v_search;
        }
    }

    // defparameter
    private static final SubLSymbol $cr_search_time_cutoff$ = makeSymbol("*CR-SEARCH-TIME-CUTOFF*");

    public static final SubLObject continue_cr_search(SubLObject v_search, SubLObject time_cutoff) {
        if (time_cutoff == UNPROVIDED) {
            time_cutoff = $cr_search_time_cutoff$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(v_search, SEARCH_STRUC_P);
            {
                SubLObject reason = NIL;
                {
                    SubLObject _prev_bind_0 = search.$reclaim_dead_end_search_nodes$.currentBinding(thread);
                    try {
                        search.$reclaim_dead_end_search_nodes$.bind(NIL, thread);
                        reason = search.generic_search(v_search, ONE_INTEGER, time_cutoff, NIL);
                    } finally {
                        search.$reclaim_dead_end_search_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject v_answer = search.search_goals(v_search);
                    if (reason == $EXHAUST) {
                    } else {
                        search._csetf_search_goals(v_search, NIL);
                    }
                    return values(v_answer, reason);
                }
            }
        }
    }

    public static final SubLObject cr_no_leaves_p(SubLObject leaves) {
        return queues.queue_empty_p(leaves);
    }

    public static final SubLObject cr_next_node(SubLObject leaves) {
        return values(queues.dequeue(leaves), leaves);
    }

    public static final SubLObject cr_goal_p(SubLObject node) {
        return consp(cr_node_suggestions(node));
    }

    public static final SubLObject cr_add_goal(SubLObject node, SubLObject goals) {
        {
            SubLObject state = search.snode_state(node);
            return values(cons(state, goals), T);
        }
    }

    public static final SubLObject cr_options(SubLObject node) {
        return $list_alt11;
    }

    public static final SubLObject cr_expand(SubLObject node, SubLObject option) {
        {
            SubLObject pcase_var = option;
            if (pcase_var.eql($SUGGEST)) {
                return cr_suggest_expand(node);
            } else
                if (pcase_var.eql($RECURSE)) {
                    return cr_recurse_expand(node);
                }

        }
        return NIL;
    }

    public static final SubLObject cr_add_node(SubLObject node, SubLObject leaves) {
        queues.enqueue(node, leaves);
        return leaves;
    }

    public static final SubLObject cr_too_deep_p(SubLObject node, SubLObject depth_cut) {
        if (node == UNPROVIDED) {
            node = NIL;
        }
        if (depth_cut == UNPROVIDED) {
            depth_cut = NIL;
        }
        return NIL;
    }

    public static final SubLObject cr_suggest_expand(SubLObject node) {
        cr_search_increment_progress(cr_node_search(node));
        {
            SubLObject fort = cr_node_fort(node);
            SubLObject suggestions = cr_suggest_related_terms(fort);
            if (NIL != suggestions) {
                {
                    SubLObject new_state = new_cr_node_state(fort, suggestions);
                    return list(search.new_search_node(new_state));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cr_recurse_expand(SubLObject node) {
        {
            SubLObject fort = cr_node_fort(node);
            SubLObject visit_table = cr_search_visit_table(cr_node_search(node));
            SubLObject immediate_specs = kb_mapping_utilities.pred_values_in_any_mt(fort, $$genls, TWO_INTEGER, ONE_INTEGER, $TRUE);
            SubLObject immediate_instances = kb_mapping_utilities.pred_values_in_any_mt(fort, $$isa, TWO_INTEGER, ONE_INTEGER, $TRUE);
            SubLObject new_nodes = NIL;
            {
                SubLObject cdolist_list_var = immediate_instances;
                SubLObject immediate_instance = NIL;
                for (immediate_instance = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , immediate_instance = cdolist_list_var.first()) {
                    if (NIL != forts.fort_p(immediate_instance)) {
                        if (NIL == gethash(immediate_instance, visit_table, NIL)) {
                            sethash(immediate_instance, visit_table, T);
                            {
                                SubLObject new_state = new_cr_node_state(immediate_instance, UNPROVIDED);
                                new_nodes = cons(search.new_search_node(new_state), new_nodes);
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = immediate_specs;
                SubLObject immediate_spec = NIL;
                for (immediate_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , immediate_spec = cdolist_list_var.first()) {
                    if (NIL != forts.fort_p(immediate_spec)) {
                        if (NIL == gethash(immediate_spec, visit_table, NIL)) {
                            sethash(immediate_spec, visit_table, T);
                            {
                                SubLObject new_state = new_cr_node_state(immediate_spec, UNPROVIDED);
                                new_nodes = cons(search.new_search_node(new_state), new_nodes);
                            }
                        }
                    }
                }
            }
            return nreverse(new_nodes);
        }
    }

    public static final SubLObject new_cr_search_state(SubLObject fort) {
        {
            SubLObject estimate = add(ONE_INTEGER, add(cardinality_estimates.instance_cardinality(fort), cardinality_estimates.spec_cardinality(fort)));
            SubLObject visit_table = make_hash_table(estimate, UNPROVIDED, UNPROVIDED);
            return list(fort, visit_table, ZERO_INTEGER, estimate);
        }
    }

    public static final SubLObject cr_search_seed_term(SubLObject v_search) {
        return search.search_state(v_search).first();
    }

    public static final SubLObject cr_search_visit_table(SubLObject v_search) {
        return second(search.search_state(v_search));
    }

    public static final SubLObject cr_search_count_progress(SubLObject v_search) {
        return third(search.search_state(v_search));
    }

    public static final SubLObject cr_search_increment_progress(SubLObject v_search) {
        {
            SubLObject progress = cr_search_count_progress(v_search);
            set_nth(TWO_INTEGER, search.search_state(v_search), add(progress, ONE_INTEGER));
        }
        return NIL;
    }

    public static final SubLObject cr_search_count_estimate(SubLObject v_search) {
        return fourth(search.search_state(v_search));
    }

    public static final SubLObject cr_search_progress(SubLObject v_search) {
        {
            SubLObject progress = cr_search_count_progress(v_search);
            SubLObject estimate = cr_search_count_estimate(v_search);
            return values(progress, estimate);
        }
    }

    public static final SubLObject initialize_cr_search(SubLObject v_search) {
        search._csetf_search_tree(v_search, NIL);
        search._csetf_search_leaves(v_search, queues.create_queue());
        search._csetf_search_goals(v_search, NIL);
        return v_search;
    }

    public static final SubLObject new_cr_node_state(SubLObject fort, SubLObject suggestions) {
        if (suggestions == UNPROVIDED) {
            suggestions = NIL;
        }
        SubLSystemTrampolineFile.checkType(fort, FORT_P);
        return list(fort, suggestions);
    }

    public static final SubLObject cr_node_fort(SubLObject node) {
        return search.snode_state(node).first();
    }

    public static final SubLObject cr_node_suggestions(SubLObject node) {
        return second(search.snode_state(node));
    }

    public static final SubLObject cr_node_search(SubLObject node) {
        return search.snode_search(node);
    }

    // defparameter
    private static final SubLSymbol $cr_related_term_table$ = makeSymbol("*CR-RELATED-TERM-TABLE*");

    public static final SubLObject cr_suggest_related_terms(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                if (NIL == cr_irrelevant_term(fort)) {
                    {
                        SubLObject _prev_bind_0 = $cr_related_term_table$.currentBinding(thread);
                        try {
                            $cr_related_term_table$.bind(make_hash_table(kb_indexing.num_index(fort), UNPROVIDED, UNPROVIDED), thread);
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_preds$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_NOT_IN_LIST, thread);
                                    pred_relevance_macros.$relevant_preds$.bind($cr_irrelevant_predicates$.getGlobalValue(), thread);
                                    kb_mapping.map_term(symbol_function(CR_SUGGEST_RELATED_TERMS_INTERNAL), fort);
                                } finally {
                                    pred_relevance_macros.$relevant_preds$.rebind(_prev_bind_3, thread);
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            v_answer = cr_filter_related_terms(fort, $cr_related_term_table$.getDynamicValue(thread));
                        } finally {
                            $cr_related_term_table$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_answer;
            }
        }
    }

    public static final SubLObject cr_suggest_related_terms_internal(SubLObject assertion) {
        Mapping.mapc(symbol_function(CR_NOTE_RELATED_TERM), assertions_high.assertion_forts(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        return NIL;
    }

    public static final SubLObject cr_note_related_term(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == gethash(fort, $cr_related_term_table$.getDynamicValue(thread), UNPROVIDED)) {
                sethash(fort, $cr_related_term_table$.getDynamicValue(thread), T);
            }
            return NIL;
        }
    }

    // deflexical
    public static final SubLSymbol $cr_irrelevant_predicates$ = makeSymbol("*CR-IRRELEVANT-PREDICATES*");

    public static final SubLObject cr_filter_related_terms(SubLObject fort, SubLObject related_term_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                        {
                            SubLObject all_isa = isa.all_isa(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject all_genls = genls.all_genls(fort, UNPROVIDED, UNPROVIDED);
                            SubLObject all_related = removal_modules_conceptually_related.all_conceptually_related(fort, UNPROVIDED);
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(related_term_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        value = getEntryValue(cdohash_entry);
                                        if (!(((((((key == fort) || (NIL != cr_irrelevant_term(key))) || (NIL != subl_promotions.memberP(key, all_isa, UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(key, all_genls, UNPROVIDED, UNPROVIDED))) || (NIL != subl_promotions.memberP(key, all_related, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(key, fort, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlsP(key, fort, UNPROVIDED, UNPROVIDED)))) {
                                            v_answer = cons(key, v_answer);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                v_answer = kb_utilities.sort_terms(v_answer, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return v_answer;
            }
        }
    }



    public static final SubLObject cr_irrelevant_term(SubLObject fort) {
        return gethash(fort, $cr_irrelevant_term_table$.getGlobalValue(), UNPROVIDED);
    }

    // defparameter
    public static final SubLSymbol $cr_irrelevant_terms$ = makeSymbol("*CR-IRRELEVANT-TERMS*");

    public static final SubLObject cr_note_irrelevant_term(SubLObject fort) {
        if (NIL == gethash(fort, $cr_irrelevant_term_table$.getGlobalValue(), UNPROVIDED)) {
            sethash(fort, $cr_irrelevant_term_table$.getGlobalValue(), T);
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cr_irrelevant_term_classes$ = makeSymbol("*CR-IRRELEVANT-TERM-CLASSES*");

    // defparameter
    public static final SubLSymbol $cr_irrelevant_quoted_term_classes$ = makeSymbol("*CR-IRRELEVANT-QUOTED-TERM-CLASSES*");

    public static final SubLObject cr_note_irrelevant_term_class(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    isa.map_all_instances(symbol_function(CR_NOTE_IRRELEVANT_TERM), collection, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_note_irrelevant_quoted_term_class(SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    isa.map_all_quoted_instances(symbol_function(CR_NOTE_IRRELEVANT_TERM), collection, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // defparameter
    public static final SubLSymbol $cr_irrelevant_nat_functions$ = makeSymbol("*CR-IRRELEVANT-NAT-FUNCTIONS*");

    public static final SubLObject cr_note_irrelevant_nat_function(SubLObject function) {
        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(function)) {
            {
                SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(function);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                    {
                        SubLObject done_var = NIL;
                        SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                SubLObject valid = makeBoolean(token_var != ass);
                                if (NIL != valid) {
                                    {
                                        SubLObject nart = assertions_high.gaf_arg1(ass);
                                        cr_note_irrelevant_term(nart);
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // defparameter
    public static final SubLSymbol $cr_irrelevant_name_prefixes$ = makeSymbol("*CR-IRRELEVANT-NAME-PREFIXES*");

    public static final SubLObject cr_note_irrelevant_name_prefix(SubLObject string) {
        {
            SubLObject completions = constant_completion_high.constant_complete(string, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = completions;
            SubLObject completion = NIL;
            for (completion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , completion = cdolist_list_var.first()) {
                cr_note_irrelevant_term(completion);
            }
        }
        return NIL;
    }

    public static final SubLObject cr_initialize_irrelevant_term_table() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cr_irrelevant_term_table$.setGlobalValue(make_hash_table(integerDivide(constant_handles.constant_count(), TWO_INTEGER), UNPROVIDED, UNPROVIDED));
            {
                SubLObject cdolist_list_var = $cr_irrelevant_terms$.getDynamicValue(thread);
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    cr_note_irrelevant_term(v_term);
                }
            }
            {
                SubLObject list_var = $cr_irrelevant_term_classes$.getDynamicValue(thread);
                utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
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
                            SubLObject collection = NIL;
                            for (collection = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                cr_note_irrelevant_term_class(collection);
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
                SubLObject list_var = $cr_irrelevant_quoted_term_classes$.getDynamicValue(thread);
                utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
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
                            SubLObject collection = NIL;
                            for (collection = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                cr_note_irrelevant_quoted_term_class(collection);
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
                SubLObject list_var = $cr_irrelevant_nat_functions$.getDynamicValue(thread);
                utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
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
                            SubLObject function = NIL;
                            for (function = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , function = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                cr_note_irrelevant_nat_function(function);
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
                SubLObject list_var = $cr_irrelevant_name_prefixes$.getDynamicValue(thread);
                utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
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
                            SubLObject prefix = NIL;
                            for (prefix = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , prefix = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                cr_note_irrelevant_name_prefix(prefix);
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
            return NIL;
        }
    }



    // defparameter
    public static final SubLSymbol $cr_setup_in_progress$ = makeSymbol("*CR-SETUP-IN-PROGRESS*");

    public static final SubLObject cr_handle_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cr_setup_in_progress$.getDynamicValue(thread)) {
                cr_setup_in_progress();
            } else
                if (NIL != $cr_irrelevant_term_table$.getGlobalValue()) {
                    cr_start_search(UNPROVIDED);
                } else {
                    $cr_setup_in_progress$.setDynamicValue(T, thread);
                    cr_setup_in_progress();
                    html_utilities.html_flush();
                    cr_initialize_irrelevant_term_table();
                    $cr_setup_in_progress$.setDynamicValue(NIL, thread);
                }

            return NIL;
        }
    }

    public static final SubLObject cb_link_cr_handle_setup(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt33$_CR_Setup_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt35$cr_handle_setup);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cr_setup(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cr_setup_in_progress$.getDynamicValue(thread)) {
                return cr_setup_in_progress();
            }
            {
                SubLObject title_var = $$$Conceptually_Related_Search_Setup;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt41$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_utilities.cb_back_button($SELF, $$$Back);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt44$Before_the_first_time_a_Conceptua);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt45$Click_);
                                                cb_utilities.cb_link($CR_HANDLE_SETUP, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt47$_to_perform_this_setup_);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_setup_in_progress() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt48$Conceptually_Related_Setup_in_Pro;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt41$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_utilities.cb_back_button($SELF, $$$Back);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt49$The_Conceptually_Related_Search_s);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt50$This_will_take_a_minute_or_two_);
                                                html_utilities.html_newline(TWO_INTEGER);
                                                html_utilities.html_princ($str_alt51$You_can_tell_that_this_process_is);
                                                cb_utilities.cb_link($CR_HANDLE_SETUP, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_princ($str_alt52$_and_DON_T_get_this_page_);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_start_search(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cr_irrelevant_term_table$.getGlobalValue()) {
                return cr_setup(UNPROVIDED);
            }
            {
                SubLObject title_var = $$$Conceptually_Related_Search;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt41$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        if (NIL != $cr_search$.getDynamicValue(thread)) {
                                            {
                                                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != frame_name_var) {
                                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(frame_name_var);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt54$cr_handle_continue_search, T, UNPROVIDED);
                                                        cb_utilities.cb_back_button($SELF, $$$Back);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Continue_Search, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt56$Search_Progress___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        cr_show_search_progress($cr_search$.getDynamicValue(thread));
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt57$A_conceptually_related_search_alr);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_newline(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt58$Seed_Term___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(cr_search_seed_term($cr_search$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                        }
                                        {
                                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(frame_name_var);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt59$cr_handle_start_search, T, UNPROVIDED);
                                                    if (NIL != $cr_search$.getDynamicValue(thread)) {
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        cb_utilities.cb_back_button($SELF, $$$Back);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt60$Enter_a_seed_collection_for_a_new);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($$$start, $$$Complete, $$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_text_input($$$start, NIL, $int$40);
                                                    html_utilities.html_newline(UNPROVIDED);
                                                    cb_utilities.cb_back_button($SELF, $$$Cancel);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_reset_input($$$Clear);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Start_Search, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_8, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cr_search_start(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt69$_CR_Search_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt70$cr_start_search);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cr_handle_start_search(SubLObject args) {
        {
            SubLObject start_string = html_utilities.html_extract_input($$$start, args);
            SubLObject start = cb_utilities.cb_guess_fort(start_string, UNPROVIDED);
            if (NIL == forts.fort_p(start)) {
                return cb_utilities.cb_error($str_alt75$Unable_to_determine_a_term_from__, start_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            $cr_search$.setDynamicValue(new_cr_search(start));
            return cr_handle_continue_search(UNPROVIDED);
        }
    }

    public static final SubLObject cr_handle_continue_search(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject v_answer = continue_cr_search($cr_search$.getDynamicValue(thread), UNPROVIDED);
                SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = reason;
                    if (pcase_var.eql($NUMBER)) {
                        return cr_show_search_results(v_answer);
                    } else
                        if (pcase_var.eql($TIME)) {
                            return cr_show_time_cutoff(v_answer);
                        } else
                            if (pcase_var.eql($EXHAUST)) {
                                return cr_show_completed(v_answer);
                            } else {
                                return cb_utilities.cb_error($str_alt79$Search_halted_for_unknown_reason_, reason, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }


                }
            }
        }
    }

    public static final SubLObject cr_show_search_results(SubLObject v_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_answer;
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt81);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject fort = NIL;
                        SubLObject suggestions = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt81);
                        fort = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt81);
                        suggestions = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            if (NIL == current) {
                                {
                                    SubLObject existing_terms = NIL;
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            existing_terms = removal_modules_conceptually_related.all_conceptually_related(fort, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    suggestions = set_difference(suggestions, existing_terms, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject title_var = $$$Conceptually_Related_Suggestions;
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                                            try {
                                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                                                html_macros.html_head_content_type();
                                                cb_parameters.cb_head_shortcut_icon();
                                                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                                                if (NIL != title_var) {
                                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                                    html_utilities.html_princ(title_var);
                                                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                                }
                                                html_complete.html_complete_script();
                                                html_complete.html_autocomplete_css();
                                                html_complete.html_autocomplete_scripts();
                                                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt41$yui_skin_sam);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != title_var) {
                                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                    html_utilities.html_markup(TWO_INTEGER);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    html_utilities.html_princ(title_var);
                                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                    html_utilities.html_markup(TWO_INTEGER);
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                }
                                                                {
                                                                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (NIL != frame_name_var) {
                                                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(frame_name_var);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_macros.$within_html_form$.bind(T, thread);
                                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                            html_utilities.html_hidden_input($str_alt54$cr_handle_continue_search, T, UNPROVIDED);
                                                                            cb_utilities.cb_back_button($SELF, $$$Back);
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                            html_utilities.html_submit_input($$$Continue_Search, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt83$Search_Progress__);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_indent(UNPROVIDED);
                                                                            cr_show_search_progress($cr_search$.getDynamicValue(thread));
                                                                            html_utilities.html_newline(TWO_INTEGER);
                                                                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt84$Term___);
                                                                            cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                        } finally {
                                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                }
                                                                {
                                                                    SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (NIL != frame_name_var) {
                                                                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(frame_name_var);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_macros.$within_html_form$.bind(T, thread);
                                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                            html_utilities.html_hidden_input($str_alt85$cr_handle_search_results, T, UNPROVIDED);
                                                                            html_utilities.html_hidden_input($$$fort, cb_utilities.cb_fort_identifier(fort), UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt87$Existing_Conceptually_Related_Ter);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            if (NIL != existing_terms) {
                                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                cb_utilities.cb_link($CR_JUSTIFY, fort, $str_alt89$_Justify_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                html_utilities.html_newline(TWO_INTEGER);
                                                                                {
                                                                                    SubLObject cdolist_list_var = existing_terms;
                                                                                    SubLObject existing_term = NIL;
                                                                                    for (existing_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , existing_term = cdolist_list_var.first()) {
                                                                                        cb_utilities.cb_form(existing_term, UNPROVIDED, UNPROVIDED);
                                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                html_utilities.html_princ($$$None);
                                                                            }
                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                            html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt93$_Mt___);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_text_input($$$mt, $$$BaseKB, $int$40);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_submit_input($$$Add_Terms, $str_alt96$add_forward, UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt97$_as_);
                                                                            cb_utilities.cb_form(listS($$conceptuallyRelated, fort, $list_alt99), UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt100$_in_MT);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_submit_input($$$Add_Terms, $str_alt101$add_backward, UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt97$_as_);
                                                                            cb_utilities.cb_form(list($$conceptuallyRelated, TERM, fort), UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_princ($str_alt100$_in_MT);
                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_reset_input($$$Clear_All);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt104$_Select_terms_to_add___);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_submit_input($$$Add_Terms, $str_alt96$add_forward, UNPROVIDED);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_complete.html_complete_button($$$entered, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt106$_Term___);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_text_input($$$entered, NIL, $int$40);
                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_utilities.html_princ($str_alt107$Possible_Terms_to_Add___);
                                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                                            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ZERO_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ZERO_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(ZERO_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    while (NIL != suggestions) {
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                        {
                                                                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                            try {
                                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                                suggestions = cr_search_show_next_suggestion(suggestions);
                                                                                                suggestions = cr_search_show_next_suggestion(suggestions);
                                                                                                suggestions = cr_search_show_next_suggestion(suggestions);
                                                                                            } finally {
                                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                                            }
                                                                                        }
                                                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                                    } 
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                        } finally {
                                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                                html_utilities.html_copyright_notice();
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_12, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt81);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt81);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_search_show_next_suggestion(SubLObject suggestions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != suggestions) {
                {
                    SubLObject suggestion = suggestions.first();
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cr_search_show_suggestion(suggestion);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                return suggestions.rest();
            }
            return NIL;
        }
    }

    public static final SubLObject cr_handle_search_results(SubLObject args) {
        {
            SubLObject fort_string = html_utilities.html_extract_input($$$fort, args);
            SubLObject fort = cb_utilities.cb_guess_fort(fort_string, UNPROVIDED);
            SubLObject mt_string = html_utilities.html_extract_input($$$mt, args);
            SubLObject mt = cb_utilities.cb_guess_fort(mt_string, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                return cb_utilities.cb_error($str_alt108$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == forts.fort_p(mt)) {
                return cb_utilities.cb_error($str_alt109$Invalid_Mt_specified____S, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject v_forward = html_utilities.html_extract_input($str_alt96$add_forward, args);
                SubLObject suggestions = cr_extract_suggestions(args);
                SubLObject direction = (NIL != v_forward) ? ((SubLObject) ($FORWARD)) : $BACKWARD;
                if (NIL == suggestions) {
                    return cb_utilities.cb_error($str_alt112$No_suggestions_were_given_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return cr_assertion_suggestions(fort, suggestions, mt, direction);
            }
        }
    }

    public static final SubLObject cr_extract_suggestions(SubLObject args) {
        {
            SubLObject entered_string = html_utilities.html_extract_input($$$entered, args);
            SubLObject entered = NIL;
            SubLObject suggestions = NIL;
            if (NIL == entered_string) {
            } else
                if (length(entered_string).numE(ZERO_INTEGER)) {
                } else {
                    entered = cb_utilities.cb_guess_constant(entered_string);
                    if (NIL == forts.fort_p(entered)) {
                        return cb_utilities.cb_error($str_alt75$Unable_to_determine_a_term_from__, entered_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    suggestions = cons(entered, suggestions);
                }

            {
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (arg.isCons()) {
                        if (arg.first().equal($$$id)) {
                            {
                                SubLObject suggestion = cb_utilities.cb_guess_fort(second(arg), UNPROVIDED);
                                if (NIL != forts.fort_p(suggestion)) {
                                    {
                                        SubLObject item_var = suggestion;
                                        if (NIL == member(item_var, suggestions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            suggestions = cons(item_var, suggestions);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            suggestions = nreverse(suggestions);
            return suggestions;
        }
    }

    public static final SubLObject cr_assertion_suggestions(SubLObject fort, SubLObject suggestions, SubLObject mt, SubLObject direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formulas = NIL;
                {
                    SubLObject cdolist_list_var = suggestions;
                    SubLObject suggestion = NIL;
                    for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                        {
                            SubLObject formula = NIL;
                            SubLObject pcase_var = direction;
                            if (pcase_var.eql($FORWARD)) {
                                formula = list($$conceptuallyRelated, fort, suggestion);
                            } else
                                if (pcase_var.eql($BACKWARD)) {
                                    formula = list($$conceptuallyRelated, suggestion, fort);
                                }

                            if (NIL != formula) {
                                formulas = cons(formula, formulas);
                                ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
                formulas = nreverse(formulas);
                {
                    SubLObject title_var = $$$Formulas_Asserted;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_parameters.cb_head_shortcut_icon();
                            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt41$yui_skin_sam);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ(title_var);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            {
                                                SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != frame_name_var) {
                                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(frame_name_var);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hidden_input($str_alt54$cr_handle_continue_search, T, UNPROVIDED);
                                                        cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_submit_input($$$Continue_Search, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt83$Search_Progress__);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_utilities.html_indent(UNPROVIDED);
                                                        cr_show_search_progress($cr_search$.getDynamicValue(thread));
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt84$Term___);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_newline(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt116$Formulas_Asserted__);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        if (NIL != formulas) {
                                                            {
                                                                SubLObject cdolist_list_var = formulas;
                                                                SubLObject formula = NIL;
                                                                for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                    cb_utilities.cb_form(formula, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_princ($str_alt117$_in_);
                                                                    cb_utilities.cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        } else {
                                                            html_utilities.html_princ($$$None);
                                                        }
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_18, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_justify(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(args, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    return cb_utilities.cb_error($str_alt108$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == fboundp($sym118$WHY_CONCEPTUALLY_RELATED_)) {
                    return cb_utilities.cb_error($str_alt119$Sorry__System_74_92_or_later_is_r, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject title_var = $$$Justify_Conceptually_Related;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_parameters.cb_head_shortcut_icon();
                            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt41$yui_skin_sam);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ(title_var);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Continue_Search, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt84$Term___);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt87$Existing_Conceptually_Related_Ter);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_24 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_25 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            {
                                                                SubLObject existing = removal_modules_conceptually_related.all_conceptually_related(fort, UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_definition_list_head$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject cdolist_list_var = existing;
                                                                            SubLObject related = NIL;
                                                                            for (related = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject supports = removal_modules_conceptually_related.why_conceptually_relatedP(fort, related, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_definition_list_term_head$.getGlobalValue());
                                                                                    cb_utilities.cb_form(related, UNPROVIDED, UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_definition_list_term_tail$.getGlobalValue());
                                                                                    html_utilities.html_markup(html_macros.$html_definition_list_def_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject cdolist_list_var_27 = supports;
                                                                                        SubLObject support = NIL;
                                                                                        for (support = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , support = cdolist_list_var_27.first()) {
                                                                                            cb_assertion_browser.cb_show_support(support, UNPROVIDED);
                                                                                            html_utilities.html_newline(UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    html_utilities.html_newline(UNPROVIDED);
                                                                                    html_utilities.html_markup(html_macros.$html_definition_list_def_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_definition_list_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_25, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_24, thread);
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_21, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_cr_justify(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(fort, FORT_P);
            if (NIL == linktext) {
                html_utilities.html_princ($str_alt89$_Justify_);
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt122$cr_justify__a, cb_utilities.cb_fort_identifier(fort));
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return fort;
        }
    }

    public static final SubLObject cr_show_time_cutoff(SubLObject v_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt124$Conceptually_Related_Search_Timeo;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt41$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(frame_name_var);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt54$cr_handle_continue_search, T, UNPROVIDED);
                                                    cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$Continue_Search, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt83$Search_Progress__);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    cr_show_search_progress($cr_search$.getDynamicValue(thread));
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt125$Time_cutoff_was_reached_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_28, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_show_completed(SubLObject v_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $cr_search$.setDynamicValue(NIL, thread);
            {
                SubLObject title_var = $str_alt126$Conceptually_Related_Search_Compl;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        html_complete.html_autocomplete_css();
                        html_complete.html_autocomplete_scripts();
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_31 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt41$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_utilities.cb_frame_name(NIL);
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(frame_name_var);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt70$cr_start_search, T, UNPROVIDED);
                                                    cb_utilities.cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_indent(UNPROVIDED);
                                                    html_utilities.html_submit_input($$$New_Search, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_newline(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_utilities.html_princ($str_alt128$The_search_has_completed_);
                                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_31, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cr_show_search_progress(SubLObject v_search) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sofar = cr_search_progress(v_search);
                SubLObject total = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt129$__S__S____S__, new SubLObject[]{ sofar, total, truncate(multiply($int$100, divide(sofar, total)), UNPROVIDED) });
            }
            return NIL;
        }
    }

    public static final SubLObject cr_search_show_suggestion(SubLObject suggestion) {
        html_utilities.html_checkbox_input($$$id, cb_utilities.cb_fort_identifier(suggestion), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_utilities.html_indent(UNPROVIDED);
        cb_utilities.cb_form(suggestion, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject declare_cr_search_tool_file() {
        declareFunction("new_cr_search", "NEW-CR-SEARCH", 1, 0, false);
        declareFunction("continue_cr_search", "CONTINUE-CR-SEARCH", 1, 1, false);
        declareFunction("cr_no_leaves_p", "CR-NO-LEAVES-P", 1, 0, false);
        declareFunction("cr_next_node", "CR-NEXT-NODE", 1, 0, false);
        declareFunction("cr_goal_p", "CR-GOAL-P", 1, 0, false);
        declareFunction("cr_add_goal", "CR-ADD-GOAL", 2, 0, false);
        declareFunction("cr_options", "CR-OPTIONS", 1, 0, false);
        declareFunction("cr_expand", "CR-EXPAND", 2, 0, false);
        declareFunction("cr_add_node", "CR-ADD-NODE", 2, 0, false);
        declareFunction("cr_too_deep_p", "CR-TOO-DEEP-P", 0, 2, false);
        declareFunction("cr_suggest_expand", "CR-SUGGEST-EXPAND", 1, 0, false);
        declareFunction("cr_recurse_expand", "CR-RECURSE-EXPAND", 1, 0, false);
        declareFunction("new_cr_search_state", "NEW-CR-SEARCH-STATE", 1, 0, false);
        declareFunction("cr_search_seed_term", "CR-SEARCH-SEED-TERM", 1, 0, false);
        declareFunction("cr_search_visit_table", "CR-SEARCH-VISIT-TABLE", 1, 0, false);
        declareFunction("cr_search_count_progress", "CR-SEARCH-COUNT-PROGRESS", 1, 0, false);
        declareFunction("cr_search_increment_progress", "CR-SEARCH-INCREMENT-PROGRESS", 1, 0, false);
        declareFunction("cr_search_count_estimate", "CR-SEARCH-COUNT-ESTIMATE", 1, 0, false);
        declareFunction("cr_search_progress", "CR-SEARCH-PROGRESS", 1, 0, false);
        declareFunction("initialize_cr_search", "INITIALIZE-CR-SEARCH", 1, 0, false);
        declareFunction("new_cr_node_state", "NEW-CR-NODE-STATE", 1, 1, false);
        declareFunction("cr_node_fort", "CR-NODE-FORT", 1, 0, false);
        declareFunction("cr_node_suggestions", "CR-NODE-SUGGESTIONS", 1, 0, false);
        declareFunction("cr_node_search", "CR-NODE-SEARCH", 1, 0, false);
        declareFunction("cr_suggest_related_terms", "CR-SUGGEST-RELATED-TERMS", 1, 0, false);
        declareFunction("cr_suggest_related_terms_internal", "CR-SUGGEST-RELATED-TERMS-INTERNAL", 1, 0, false);
        declareFunction("cr_note_related_term", "CR-NOTE-RELATED-TERM", 1, 0, false);
        declareFunction("cr_filter_related_terms", "CR-FILTER-RELATED-TERMS", 2, 0, false);
        declareFunction("cr_irrelevant_term", "CR-IRRELEVANT-TERM", 1, 0, false);
        declareFunction("cr_note_irrelevant_term", "CR-NOTE-IRRELEVANT-TERM", 1, 0, false);
        declareFunction("cr_note_irrelevant_term_class", "CR-NOTE-IRRELEVANT-TERM-CLASS", 1, 0, false);
        declareFunction("cr_note_irrelevant_quoted_term_class", "CR-NOTE-IRRELEVANT-QUOTED-TERM-CLASS", 1, 0, false);
        declareFunction("cr_note_irrelevant_nat_function", "CR-NOTE-IRRELEVANT-NAT-FUNCTION", 1, 0, false);
        declareFunction("cr_note_irrelevant_name_prefix", "CR-NOTE-IRRELEVANT-NAME-PREFIX", 1, 0, false);
        declareFunction("cr_initialize_irrelevant_term_table", "CR-INITIALIZE-IRRELEVANT-TERM-TABLE", 0, 0, false);
        declareFunction("cr_handle_setup", "CR-HANDLE-SETUP", 0, 1, false);
        declareFunction("cb_link_cr_handle_setup", "CB-LINK-CR-HANDLE-SETUP", 0, 1, false);
        declareFunction("cr_setup", "CR-SETUP", 0, 1, false);
        declareFunction("cr_setup_in_progress", "CR-SETUP-IN-PROGRESS", 0, 0, false);
        declareFunction("cr_start_search", "CR-START-SEARCH", 0, 1, false);
        declareFunction("cb_link_cr_search_start", "CB-LINK-CR-SEARCH-START", 0, 1, false);
        declareFunction("cr_handle_start_search", "CR-HANDLE-START-SEARCH", 1, 0, false);
        declareFunction("cr_handle_continue_search", "CR-HANDLE-CONTINUE-SEARCH", 0, 1, false);
        declareFunction("cr_show_search_results", "CR-SHOW-SEARCH-RESULTS", 1, 0, false);
        declareFunction("cr_search_show_next_suggestion", "CR-SEARCH-SHOW-NEXT-SUGGESTION", 1, 0, false);
        declareFunction("cr_handle_search_results", "CR-HANDLE-SEARCH-RESULTS", 1, 0, false);
        declareFunction("cr_extract_suggestions", "CR-EXTRACT-SUGGESTIONS", 1, 0, false);
        declareFunction("cr_assertion_suggestions", "CR-ASSERTION-SUGGESTIONS", 4, 0, false);
        declareFunction("cr_justify", "CR-JUSTIFY", 1, 0, false);
        declareFunction("cb_link_cr_justify", "CB-LINK-CR-JUSTIFY", 1, 1, false);
        declareFunction("cr_show_time_cutoff", "CR-SHOW-TIME-CUTOFF", 1, 0, false);
        declareFunction("cr_show_completed", "CR-SHOW-COMPLETED", 1, 0, false);
        declareFunction("cr_show_search_progress", "CR-SHOW-SEARCH-PROGRESS", 1, 0, false);
        declareFunction("cr_search_show_suggestion", "CR-SEARCH-SHOW-SUGGESTION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cr_search_tool_file() {
        defparameter("*CR-SEARCH-TIME-CUTOFF*", TEN_INTEGER);
        defparameter("*CR-RELATED-TERM-TABLE*", NIL);
        deflexical("*CR-IRRELEVANT-PREDICATES*", $list_alt22);
        deflexical("*CR-IRRELEVANT-TERM-TABLE*", NIL != boundp($cr_irrelevant_term_table$) ? ((SubLObject) ($cr_irrelevant_term_table$.getGlobalValue())) : NIL);
        defparameter("*CR-IRRELEVANT-TERMS*", NIL);
        defparameter("*CR-IRRELEVANT-TERM-CLASSES*", $list_alt24);
        defparameter("*CR-IRRELEVANT-QUOTED-TERM-CLASSES*", $list_alt25);
        defparameter("*CR-IRRELEVANT-NAT-FUNCTIONS*", $list_alt27);
        defparameter("*CR-IRRELEVANT-NAME-PREFIXES*", $list_alt29);
        defparameter("*CR-SEARCH*", NIL);
        defparameter("*CR-SETUP-IN-PROGRESS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cr_search_tool_file() {
                subl_macro_promotions.declare_defglobal($cr_irrelevant_term_table$);
        utilities_macros.register_html_state_variable($cr_search$);
        html_macros.note_html_handler_function(CR_HANDLE_SETUP);
        cb_utilities.setup_cb_link_method($CR_HANDLE_SETUP, CB_LINK_CR_HANDLE_SETUP, ONE_INTEGER);
        html_macros.note_html_handler_function(CR_START_SEARCH);
        cb_utilities.setup_cb_link_method($CR_SEARCH_START, CB_LINK_CR_SEARCH_START, ONE_INTEGER);
        cb_utilities.declare_cb_tool($CR_SEARCH_START, $$$CR_Search, $$$CRS, $$$Conceptually_Related_Search);
        html_macros.note_html_handler_function(CR_HANDLE_START_SEARCH);
        html_macros.note_html_handler_function(CR_HANDLE_CONTINUE_SEARCH);
        html_macros.note_html_handler_function(CR_HANDLE_SEARCH_RESULTS);
        html_macros.note_html_handler_function(CR_JUSTIFY);
        cb_utilities.setup_cb_link_method($CR_JUSTIFY, CB_LINK_CR_JUSTIFY, TWO_INTEGER);
        return NIL;
    }



    private static final SubLSymbol CR_NO_LEAVES_P = makeSymbol("CR-NO-LEAVES-P");

    private static final SubLSymbol CR_NEXT_NODE = makeSymbol("CR-NEXT-NODE");

    private static final SubLSymbol CR_GOAL_P = makeSymbol("CR-GOAL-P");

    private static final SubLSymbol CR_ADD_GOAL = makeSymbol("CR-ADD-GOAL");

    private static final SubLSymbol CR_OPTIONS = makeSymbol("CR-OPTIONS");

    private static final SubLSymbol CR_EXPAND = makeSymbol("CR-EXPAND");

    private static final SubLSymbol CR_ADD_NODE = makeSymbol("CR-ADD-NODE");

    private static final SubLSymbol CR_TOO_DEEP_P = makeSymbol("CR-TOO-DEEP-P");

    private static final SubLSymbol SEARCH_STRUC_P = makeSymbol("SEARCH-STRUC-P");



    static private final SubLList $list_alt11 = list(makeKeyword("SUGGEST"), makeKeyword("RECURSE"));

    private static final SubLSymbol $SUGGEST = makeKeyword("SUGGEST");

    private static final SubLSymbol $RECURSE = makeKeyword("RECURSE");

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol RELEVANT_PRED_IS_NOT_IN_LIST = makeSymbol("RELEVANT-PRED-IS-NOT-IN-LIST");

    private static final SubLSymbol CR_SUGGEST_RELATED_TERMS_INTERNAL = makeSymbol("CR-SUGGEST-RELATED-TERMS-INTERNAL");

    private static final SubLSymbol CR_NOTE_RELATED_TERM = makeSymbol("CR-NOTE-RELATED-TERM");

    static private final SubLList $list_alt22 = list(new SubLObject[]{ constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("disjointWith")), constant_handles.reader_make_constant_shell(makeString("followingValue")), constant_handles.reader_make_constant_shell(makeString("comment")), constant_handles.reader_make_constant_shell(makeString("myCreator")), constant_handles.reader_make_constant_shell(makeString("myReviewer")), constant_handles.reader_make_constant_shell(makeString("myCreationTime")), constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")), constant_handles.reader_make_constant_shell(makeString("synonymousExternalConcept")) });

    public static final SubLSymbol $cr_irrelevant_term_table$ = makeSymbol("*CR-IRRELEVANT-TERM-TABLE*");

    static private final SubLList $list_alt24 = list(constant_handles.reader_make_constant_shell(makeString("Relation")), constant_handles.reader_make_constant_shell(makeString("EnglishWord")), constant_handles.reader_make_constant_shell(makeString("LinguisticObjectType")), constant_handles.reader_make_constant_shell(makeString("Cyclist")), constant_handles.reader_make_constant_shell(makeString("GenericQuantity")), constant_handles.reader_make_constant_shell(makeString("TestingConstant")), constant_handles.reader_make_constant_shell(makeString("KnowledgeBase")), constant_handles.reader_make_constant_shell(makeString("DocumentationConstant")));

    static private final SubLList $list_alt25 = list(constant_handles.reader_make_constant_shell(makeString("TheTerm")));

    private static final SubLSymbol CR_NOTE_IRRELEVANT_TERM = makeSymbol("CR-NOTE-IRRELEVANT-TERM");

    static private final SubLList $list_alt27 = list(constant_handles.reader_make_constant_shell(makeString("MeaningInSystemFn")), constant_handles.reader_make_constant_shell(makeString("STIF")), constant_handles.reader_make_constant_shell(makeString("STIB")));



    static private final SubLList $list_alt29 = list(makeString("HYP-"), makeString("TMP-"), makeString("KS-"));

    static private final SubLString $$$cdolist = makeString("cdolist");

    public static final SubLSymbol $cr_search$ = makeSymbol("*CR-SEARCH*");

    private static final SubLSymbol CR_HANDLE_SETUP = makeSymbol("CR-HANDLE-SETUP");

    static private final SubLString $str_alt33$_CR_Setup_ = makeString("[CR Setup]");



    static private final SubLString $str_alt35$cr_handle_setup = makeString("cr-handle-setup");

    private static final SubLSymbol $CR_HANDLE_SETUP = makeKeyword("CR-HANDLE-SETUP");

    private static final SubLSymbol CB_LINK_CR_HANDLE_SETUP = makeSymbol("CB-LINK-CR-HANDLE-SETUP");

    static private final SubLString $$$Conceptually_Related_Search_Setup = makeString("Conceptually Related Search Setup");



    static private final SubLString $str_alt40$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt41$yui_skin_sam = makeString("yui-skin-sam");



    static private final SubLString $$$Back = makeString("Back");

    static private final SubLString $str_alt44$Before_the_first_time_a_Conceptua = makeString("Before the first time a Conceptually Related Search is performed, a setup step must be performed.");

    static private final SubLString $str_alt45$Click_ = makeString("Click ");

    static private final SubLString $$$here = makeString("here");

    static private final SubLString $str_alt47$_to_perform_this_setup_ = makeString(" to perform this setup.");

    static private final SubLString $str_alt48$Conceptually_Related_Setup_in_Pro = makeString("Conceptually Related Setup in Progress");

    static private final SubLString $str_alt49$The_Conceptually_Related_Search_s = makeString("The Conceptually Related Search setup is in progress.");

    static private final SubLString $str_alt50$This_will_take_a_minute_or_two_ = makeString("This will take a minute or two.");

    static private final SubLString $str_alt51$You_can_tell_that_this_process_is = makeString("You can tell that this process is complete when you click ");

    static private final SubLString $str_alt52$_and_DON_T_get_this_page_ = makeString(" and DON'T get this page.");

    static private final SubLString $$$Conceptually_Related_Search = makeString("Conceptually Related Search");

    static private final SubLString $str_alt54$cr_handle_continue_search = makeString("cr-handle-continue-search");

    static private final SubLString $$$Continue_Search = makeString("Continue Search");

    static private final SubLString $str_alt56$Search_Progress___ = makeString("Search Progress : ");

    static private final SubLString $str_alt57$A_conceptually_related_search_alr = makeString("A conceptually related search already is underway :");

    static private final SubLString $str_alt58$Seed_Term___ = makeString("Seed Term : ");

    static private final SubLString $str_alt59$cr_handle_start_search = makeString("cr-handle-start-search");

    static private final SubLString $str_alt60$Enter_a_seed_collection_for_a_new = makeString("Enter a seed collection for a new search :");

    static private final SubLString $$$start = makeString("start");

    static private final SubLString $$$Complete = makeString("Complete");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$Cancel = makeString("Cancel");

    static private final SubLString $$$Clear = makeString("Clear");

    static private final SubLString $$$Start_Search = makeString("Start Search");

    private static final SubLSymbol CR_START_SEARCH = makeSymbol("CR-START-SEARCH");

    static private final SubLString $str_alt69$_CR_Search_ = makeString("[CR Search]");

    static private final SubLString $str_alt70$cr_start_search = makeString("cr-start-search");

    private static final SubLSymbol $CR_SEARCH_START = makeKeyword("CR-SEARCH-START");

    private static final SubLSymbol CB_LINK_CR_SEARCH_START = makeSymbol("CB-LINK-CR-SEARCH-START");

    static private final SubLString $$$CR_Search = makeString("CR Search");

    static private final SubLString $$$CRS = makeString("CRS");

    static private final SubLString $str_alt75$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    private static final SubLSymbol CR_HANDLE_START_SEARCH = makeSymbol("CR-HANDLE-START-SEARCH");





    static private final SubLString $str_alt79$Search_halted_for_unknown_reason_ = makeString("Search halted for unknown reason ~S");

    private static final SubLSymbol CR_HANDLE_CONTINUE_SEARCH = makeSymbol("CR-HANDLE-CONTINUE-SEARCH");

    static private final SubLList $list_alt81 = list(list(makeSymbol("FORT"), makeSymbol("SUGGESTIONS")));

    static private final SubLString $$$Conceptually_Related_Suggestions = makeString("Conceptually Related Suggestions");

    static private final SubLString $str_alt83$Search_Progress__ = makeString("Search Progress :");

    static private final SubLString $str_alt84$Term___ = makeString("Term : ");

    static private final SubLString $str_alt85$cr_handle_search_results = makeString("cr-handle-search-results");

    static private final SubLString $$$fort = makeString("fort");

    static private final SubLString $str_alt87$Existing_Conceptually_Related_Ter = makeString("Existing Conceptually Related Terms : ");

    private static final SubLSymbol $CR_JUSTIFY = makeKeyword("CR-JUSTIFY");

    static private final SubLString $str_alt89$_Justify_ = makeString("[Justify]");

    static private final SubLString $$$None = makeString("None");

    static private final SubLString $$$mt = makeString("mt");

    public static final SubLObject $$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));

    static private final SubLString $str_alt93$_Mt___ = makeString(" Mt : ");

    static private final SubLString $$$BaseKB = makeString("BaseKB");

    static private final SubLString $$$Add_Terms = makeString("Add Terms");

    static private final SubLString $str_alt96$add_forward = makeString("add-forward");

    static private final SubLString $str_alt97$_as_ = makeString(" as ");

    public static final SubLObject $$conceptuallyRelated = constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated"));

    static private final SubLList $list_alt99 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt100$_in_MT = makeString(" in MT");

    static private final SubLString $str_alt101$add_backward = makeString("add-backward");



    static private final SubLString $$$Clear_All = makeString("Clear All");

    static private final SubLString $str_alt104$_Select_terms_to_add___ = makeString(" Select terms to add : ");

    static private final SubLString $$$entered = makeString("entered");

    static private final SubLString $str_alt106$_Term___ = makeString(" Term : ");

    static private final SubLString $str_alt107$Possible_Terms_to_Add___ = makeString("Possible Terms to Add : ");

    static private final SubLString $str_alt108$Unable_to_determine_last_term__wh = makeString("Unable to determine last term (why?)");

    static private final SubLString $str_alt109$Invalid_Mt_specified____S = makeString("Invalid Mt specified : ~S");





    static private final SubLString $str_alt112$No_suggestions_were_given_ = makeString("No suggestions were given.");

    private static final SubLSymbol CR_HANDLE_SEARCH_RESULTS = makeSymbol("CR-HANDLE-SEARCH-RESULTS");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $$$Formulas_Asserted = makeString("Formulas Asserted");

    static private final SubLString $str_alt116$Formulas_Asserted__ = makeString("Formulas Asserted :");

    static private final SubLString $str_alt117$_in_ = makeString(" in ");

    static private final SubLSymbol $sym118$WHY_CONCEPTUALLY_RELATED_ = makeSymbol("WHY-CONCEPTUALLY-RELATED?");

    static private final SubLString $str_alt119$Sorry__System_74_92_or_later_is_r = makeString("Sorry, System 74.92 or later is required for justification to work.");

    static private final SubLString $$$Justify_Conceptually_Related = makeString("Justify Conceptually Related");

    private static final SubLSymbol CR_JUSTIFY = makeSymbol("CR-JUSTIFY");

    static private final SubLString $str_alt122$cr_justify__a = makeString("cr-justify&~a");

    private static final SubLSymbol CB_LINK_CR_JUSTIFY = makeSymbol("CB-LINK-CR-JUSTIFY");

    static private final SubLString $str_alt124$Conceptually_Related_Search_Timeo = makeString("Conceptually Related Search Timeout");

    static private final SubLString $str_alt125$Time_cutoff_was_reached_ = makeString("Time cutoff was reached.");

    static private final SubLString $str_alt126$Conceptually_Related_Search_Compl = makeString("Conceptually Related Search Completed");

    static private final SubLString $$$New_Search = makeString("New Search");

    static private final SubLString $str_alt128$The_search_has_completed_ = makeString("The search has completed.");

    static private final SubLString $str_alt129$__S__S____S__ = makeString("[~S/~S] (~S%)");



    // // Initializers
    public void declareFunctions() {
        declare_cr_search_tool_file();
    }

    public void initializeVariables() {
        init_cr_search_tool_file();
    }

    public void runTopLevelForms() {
        setup_cr_search_tool_file();
    }
}

