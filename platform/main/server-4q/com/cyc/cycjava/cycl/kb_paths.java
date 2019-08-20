/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_arg$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_index_arg$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_pred$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target_arg$;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$kbp_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_state_variable_documentation;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-PATHS
 * source file: /cyc/top/cycl/kb-paths.lisp
 * created:     2019/07/03 17:37:51
 */
public final class kb_paths extends SubLTranslatedFile implements V12 {
    public static final SubLObject remove_cached_hpkb_relate_terms(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_hpkb_relate_terms_caching_state$.getGlobalValue(), list(term_1, term_2, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hpkb_relate_terms_just(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TestBrowsingAndResultsMt;
        }
        return com.cyc.cycjava.cycl.kb_paths.kbp_paths_links(com.cyc.cycjava.cycl.kb_paths.hpkb_relate_terms(term_1, term_2, mt)).first();
    }

    public static final SubLObject hpkb_relate_terms_assertions_nl(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TestBrowsingAndResultsMt;
        }
        return transform_list_utilities.transform(com.cyc.cycjava.cycl.kb_paths.kbp_paths_links(com.cyc.cycjava.cycl.kb_paths.hpkb_relate_terms(term_1, term_2, mt)), symbol_function($sym166$KB_ASSERTION_), symbol_function(GENERATE_TEXT), UNPROVIDED);
    }

    public static final SubLObject hpkb_relate_terms_assertions(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TestBrowsingAndResultsMt;
        }
        return com.cyc.cycjava.cycl.kb_paths.kbp_paths_links(com.cyc.cycjava.cycl.kb_paths.hpkb_relate_terms(term_1, term_2, mt));
    }

    public static final SubLObject hpkb_relate_terms(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TestBrowsingAndResultsMt;
        }
        return com.cyc.cycjava.cycl.kb_paths.cached_hpkb_relate_terms(term_1, term_2, mt);
    }

    public static final SubLObject clear_cached_hpkb_relate_terms() {
        {
            SubLObject cs = $cached_hpkb_relate_terms_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject cached_hpkb_relate_terms_internal(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paths = NIL;
                SubLObject stats = NIL;
                {
                    SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $limit_path_depthP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $kbp_max_depth$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $kbp_only_gaf_linksP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $kbp_quit_with_successP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = $kbp_use_max_mtsP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = $kbp_explode_natsP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = $kbp_min_isa_pathP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = $kbp_min_genls_pathP$.currentBinding(thread);
                    SubLObject _prev_bind_10 = $exclude_nodes$.currentBinding(thread);
                    SubLObject _prev_bind_11 = $kbp_genl_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_12 = $kbp_genl_bound$.currentBinding(thread);
                    SubLObject _prev_bind_13 = $kbp_node_isa_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_14 = $kbp_node_isa_bound$.currentBinding(thread);
                    SubLObject _prev_bind_15 = $kbp_isa_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_16 = $kbp_isa_bound$.currentBinding(thread);
                    SubLObject _prev_bind_17 = $kbp_link_reference_set_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_18 = $kbp_link_reference_set_bound$.currentBinding(thread);
                    SubLObject _prev_bind_19 = $kbp_bound_link_termsP$.currentBinding(thread);
                    SubLObject _prev_bind_20 = $kbp_bound_link_terms$.currentBinding(thread);
                    try {
                        $max_search_iterations$.bind(TWO_INTEGER, thread);
                        $limit_path_depthP$.bind(T, thread);
                        $kbp_max_depth$.bind(TWO_INTEGER, thread);
                        $kbp_only_gaf_linksP$.bind(NIL, thread);
                        $kbp_no_bi_scoping_linksP$.bind(T, thread);
                        $kbp_quit_with_successP$.bind(T, thread);
                        $kbp_use_max_mtsP$.bind(T, thread);
                        $kbp_explode_natsP$.bind(T, thread);
                        $kbp_min_isa_pathP$.bind(T, thread);
                        $kbp_min_genls_pathP$.bind(T, thread);
                        $exclude_nodes$.bind($list_alt174, thread);
                        $kbp_genl_boundP$.bind(T, thread);
                        $kbp_genl_bound$.bind($list_alt175, thread);
                        $kbp_node_isa_boundP$.bind(T, thread);
                        $kbp_node_isa_bound$.bind($list_alt162, thread);
                        $kbp_isa_boundP$.bind(T, thread);
                        $kbp_isa_bound$.bind($list_alt176, thread);
                        $kbp_link_reference_set_boundP$.bind(T, thread);
                        $kbp_link_reference_set_bound$.bind($list_alt177, thread);
                        $kbp_bound_link_termsP$.bind(T, thread);
                        $kbp_bound_link_terms$.bind($list_alt178, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject v_kb_paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(term_1, term_2, mt);
                            SubLObject kbp_stats = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            paths = v_kb_paths;
                            stats = kbp_stats;
                        }
                    } finally {
                        $kbp_bound_link_terms$.rebind(_prev_bind_20, thread);
                        $kbp_bound_link_termsP$.rebind(_prev_bind_19, thread);
                        $kbp_link_reference_set_bound$.rebind(_prev_bind_18, thread);
                        $kbp_link_reference_set_boundP$.rebind(_prev_bind_17, thread);
                        $kbp_isa_bound$.rebind(_prev_bind_16, thread);
                        $kbp_isa_boundP$.rebind(_prev_bind_15, thread);
                        $kbp_node_isa_bound$.rebind(_prev_bind_14, thread);
                        $kbp_node_isa_boundP$.rebind(_prev_bind_13, thread);
                        $kbp_genl_bound$.rebind(_prev_bind_12, thread);
                        $kbp_genl_boundP$.rebind(_prev_bind_11, thread);
                        $exclude_nodes$.rebind(_prev_bind_10, thread);
                        $kbp_min_genls_pathP$.rebind(_prev_bind_9, thread);
                        $kbp_min_isa_pathP$.rebind(_prev_bind_8, thread);
                        $kbp_explode_natsP$.rebind(_prev_bind_7, thread);
                        $kbp_use_max_mtsP$.rebind(_prev_bind_6, thread);
                        $kbp_quit_with_successP$.rebind(_prev_bind_5, thread);
                        $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_4, thread);
                        $kbp_only_gaf_linksP$.rebind(_prev_bind_3, thread);
                        $kbp_max_depth$.rebind(_prev_bind_2, thread);
                        $limit_path_depthP$.rebind(_prev_bind_1, thread);
                        $max_search_iterations$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != $collect_kbp_statsP$.getDynamicValue(thread)) {
                    return values(paths, stats);
                } else {
                    return paths;
                }
            }
        }
    }

    public static final SubLObject cached_hpkb_relate_terms(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        {
            SubLObject caching_state = $cached_hpkb_relate_terms_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CACHED_HPKB_RELATE_TERMS, $cached_hpkb_relate_terms_caching_state$, NIL, EQUAL, THREE_INTEGER, $int$32);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(term_1, term_2, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw181$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (term_1.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (term_2.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.kb_paths.cached_hpkb_relate_terms_internal(term_1, term_2, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(term_1, term_2, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLSymbol $cached_hpkb_relate_terms_caching_state$ = makeSymbol("*CACHED-HPKB-RELATE-TERMS-CACHING-STATE*");

    public static final SubLFile me = new kb_paths();





































































    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cr_paths_table$ = makeSymbol("*CR-PATHS-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cr_gaf_count$ = makeSymbol("*CR-GAF-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cr_explained_count$ = makeSymbol("*CR-EXPLAINED-COUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cr_error_count$ = makeSymbol("*CR-ERROR-COUNT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $kbp_quitP$ = makeSymbol("*KBP-QUIT?*");

    public static final SubLSymbol $kbp_result_format$ = makeSymbol("*KBP-RESULT-FORMAT*");

    public static final SubLSymbol $search_iteration$ = makeSymbol("*SEARCH-ITERATION*");

    public static final SubLSymbol $node_equalP$ = makeSymbol("*NODE-EQUAL?*");

    public static final SubLSymbol $kbp_nodeP$ = makeSymbol("*KBP-NODE?*");

    public static final SubLSymbol $kbp_linkP$ = makeSymbol("*KBP-LINK?*");

    public static final SubLSymbol $kbp_stats$ = makeSymbol("*KBP-STATS*");

    public static final SubLSymbol $collect_kbp_statsP$ = makeSymbol("*COLLECT-KBP-STATS?*");

    public static final SubLSymbol $kbp_node_count$ = makeSymbol("*KBP-NODE-COUNT*");

    public static final SubLSymbol $kbp_link_count$ = makeSymbol("*KBP-LINK-COUNT*");

    public static final SubLSymbol $kbp_term_count$ = makeSymbol("*KBP-TERM-COUNT*");

    static private final SubLList $list14 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    public static final SubLSymbol $source_term_args$ = makeSymbol("*SOURCE-TERM-ARGS*");

    static private final SubLList $list16 = list(ONE_INTEGER, TWO_INTEGER, FOUR_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    public static final SubLSymbol $target_term_args$ = makeSymbol("*TARGET-TERM-ARGS*");

    public static final SubLSymbol $relevant_node_treeP$ = makeSymbol("*RELEVANT-NODE-TREE?*");

    public static final SubLSymbol $path_source$ = makeSymbol("*PATH-SOURCE*");

    public static final SubLSymbol $path_target$ = makeSymbol("*PATH-TARGET*");

    public static final SubLSymbol $kbp_searcher$ = makeSymbol("*KBP-SEARCHER*");

    public static final SubLSymbol $kbp_searchers$ = makeSymbol("*KBP-SEARCHERS*");

    public static final SubLSymbol $path_horizon$ = makeSymbol("*PATH-HORIZON*");

    public static final SubLSymbol $kbp_common_nodes$ = makeSymbol("*KBP-COMMON-NODES*");

    public static final SubLSymbol $path_link_lattice$ = makeSymbol("*PATH-LINK-LATTICE*");

    public static final SubLSymbol $path_node_lattice$ = makeSymbol("*PATH-NODE-LATTICE*");

    public static final SubLSymbol $kbp_ancestor$ = makeSymbol("*KBP-ANCESTOR*");

    public static final SubLSymbol $kbp_run_time$ = makeSymbol("*KBP-RUN-TIME*");

    public static final SubLSymbol $node_ancestors$ = makeSymbol("*NODE-ANCESTORS*");

    public static final SubLSymbol $link_ancestors$ = makeSymbol("*LINK-ANCESTORS*");

    public static final SubLSymbol $kbp_depth$ = makeSymbol("*KBP-DEPTH*");

    public static final SubLSymbol $kbp_nodes$ = makeSymbol("*KBP-NODES*");

    public static final SubLSymbol $kbp_links$ = makeSymbol("*KBP-LINKS*");

    public static final SubLSymbol $term_arg$ = makeSymbol("*TERM-ARG*");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    public static final SubLSymbol $kbp_ancestor_hash$ = makeSymbol("*KBP-ANCESTOR-HASH*");

    public static final SubLSymbol $kbp_search_hash$ = makeSymbol("*KBP-SEARCH-HASH*");

    public static final SubLSymbol $kbp_min_isa_pathP$ = makeSymbol("*KBP-MIN-ISA-PATH?*");

    public static final SubLSymbol $kbp_min_genls_pathP$ = makeSymbol("*KBP-MIN-GENLS-PATH?*");

    public static final SubLSymbol $kbp_designated_node_superiorsP$ = makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS?*");

    public static final SubLSymbol $kbp_designated_node_superiors$ = makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS*");

    public static final SubLSymbol $kbp_trace_level$ = makeSymbol("*KBP-TRACE-LEVEL*");

    public static final SubLSymbol $max_search_iterations$ = makeSymbol("*MAX-SEARCH-ITERATIONS*");

    public static final SubLSymbol $limit_path_depthP$ = makeSymbol("*LIMIT-PATH-DEPTH?*");

    public static final SubLSymbol $kbp_max_depth$ = makeSymbol("*KBP-MAX-DEPTH*");

    public static final SubLSymbol $kbp_max_term_count$ = makeSymbol("*KBP-MAX-TERM-COUNT*");

    public static final SubLSymbol $kbp_quit_with_successP$ = makeSymbol("*KBP-QUIT-WITH-SUCCESS?*");

    public static final SubLSymbol $kbp_only_gaf_linksP$ = makeSymbol("*KBP-ONLY-GAF-LINKS?*");

    public static final SubLSymbol $kbp_no_bookkeeping_linksP$ = makeSymbol("*KBP-NO-BOOKKEEPING-LINKS?*");

    public static final SubLSymbol $kbp_no_instance_linksP$ = makeSymbol("*KBP-NO-INSTANCE-LINKS?*");

    public static final SubLSymbol $kbp_no_bi_scoping_linksP$ = makeSymbol("*KBP-NO-BI-SCOPING-LINKS?*");

    public static final SubLSymbol $kbp_explode_natsP$ = makeSymbol("*KBP-EXPLODE-NATS?*");

    public static final SubLSymbol $kbp_designated_predsP$ = makeSymbol("*KBP-DESIGNATED-PREDS?*");

    public static final SubLSymbol $kbp_designated_preds$ = makeSymbol("*KBP-DESIGNATED-PREDS*");

    public static final SubLSymbol $kbp_restricted_predsP$ = makeSymbol("*KBP-RESTRICTED-PREDS?*");

    public static final SubLSymbol $kbp_restricted_preds$ = makeSymbol("*KBP-RESTRICTED-PREDS*");

    public static final SubLSymbol $kbp_restricted_mtsP$ = makeSymbol("*KBP-RESTRICTED-MTS?*");

    static private final SubLList $list59 = list(reader_make_constant_shell("EnglishMt"));

    public static final SubLSymbol $kbp_restricted_mts$ = makeSymbol("*KBP-RESTRICTED-MTS*");

    public static final SubLSymbol $kbp_external_link_predP$ = makeSymbol("*KBP-EXTERNAL-LINK-PRED?*");

    public static final SubLSymbol $kbp_external_link_pred$ = makeSymbol("*KBP-EXTERNAL-LINK-PRED*");

    public static final SubLSymbol $kbp_genl_boundP$ = makeSymbol("*KBP-GENL-BOUND?*");

    public static final SubLSymbol $kbp_genl_bound$ = makeSymbol("*KBP-GENL-BOUND*");

    public static final SubLSymbol $kbp_genls_cardinality_delta_boundP$ = makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*");

    public static final SubLSymbol $kbp_genls_cardinality_delta_bound$ = makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND*");

    public static final SubLSymbol $kbp_isa_boundP$ = makeSymbol("*KBP-ISA-BOUND?*");

    public static final SubLSymbol $kbp_isa_bound$ = makeSymbol("*KBP-ISA-BOUND*");

    public static final SubLSymbol $kbp_node_isa_boundP$ = makeSymbol("*KBP-NODE-ISA-BOUND?*");

    public static final SubLSymbol $kbp_node_isa_bound$ = makeSymbol("*KBP-NODE-ISA-BOUND*");

    public static final SubLSymbol $kbp_restricted_nodes_as_argP$ = makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG?*");

    static private final SubLList $list72 = list(list(reader_make_constant_shell("quotedCollection"), ONE_INTEGER));

    public static final SubLSymbol $kbp_restricted_nodes_as_arg$ = makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG*");

    public static final SubLSymbol $kbp_link_reference_set_boundP$ = makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND?*");

    public static final SubLSymbol $kbp_link_reference_set_bound$ = makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND*");

    public static final SubLSymbol $kbp_designated_link_referencesP$ = makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES?*");

    public static final SubLSymbol $kbp_designated_link_references$ = makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES*");

    public static final SubLSymbol $kbp_bound_gaf_termsP$ = makeSymbol("*KBP-BOUND-GAF-TERMS?*");

    static private final SubLList $list79 = list(ZERO_INTEGER);

    public static final SubLSymbol $kbp_bound_gaf_terms$ = makeSymbol("*KBP-BOUND-GAF-TERMS*");

    public static final SubLSymbol $kbp_bound_link_termsP$ = makeSymbol("*KBP-BOUND-LINK-TERMS?*");

    public static final SubLSymbol $kbp_bound_link_terms$ = makeSymbol("*KBP-BOUND-LINK-TERMS*");

    public static final SubLSymbol $kbp_use_max_mtsP$ = makeSymbol("*KBP-USE-MAX-MTS?*");

    public static final SubLSymbol $nodes_accessor_fn$ = makeSymbol("*NODES-ACCESSOR-FN*");

    public static final SubLSymbol $path_link_op$ = makeSymbol("*PATH-LINK-OP*");

    public static final SubLSymbol $path_node_op$ = makeSymbol("*PATH-NODE-OP*");

    public static final SubLSymbol $relevant_linkP$ = makeSymbol("*RELEVANT-LINK?*");

    public static final SubLSymbol $relevant_nodeP$ = makeSymbol("*RELEVANT-NODE?*");

    public static final SubLSymbol $relevant_link_treeP$ = makeSymbol("*RELEVANT-LINK-TREE?*");

    public static final SubLSymbol $exclude_nodes$ = makeSymbol("*EXCLUDE-NODES*");

    public static final SubLSymbol $exclude_links$ = makeSymbol("*EXCLUDE-LINKS*");

    private static final SubLSymbol ALL_ASSERTION_TERMS = makeSymbol("ALL-ASSERTION-TERMS");

    private static final SubLSymbol DEFAULT_LINK_OP = makeSymbol("DEFAULT-LINK-OP");

    private static final SubLSymbol DEFAULT_NODE_OP = makeSymbol("DEFAULT-NODE-OP");

    static private final SubLSymbol $sym95$DEFAULT_RELEVANT_LINK_ = makeSymbol("DEFAULT-RELEVANT-LINK?");

    static private final SubLSymbol $sym96$DEFAULT_RELEVANT_NODE_ = makeSymbol("DEFAULT-RELEVANT-NODE?");

    static private final SubLSymbol $sym97$DEFAULT_RELEVANT_LINK_TREE_ = makeSymbol("DEFAULT-RELEVANT-LINK-TREE?");

    static private final SubLString $$$searching_for_kb_paths = makeString("searching for kb paths");

    static private final SubLString $$$missed_connection = makeString("missed connection");

    static private final SubLString $$$duplicates_in_accessed1 = makeString("duplicates in accessed1");

    static private final SubLString $$$duplicates_in_accessed2 = makeString("duplicates in accessed2");

    static private final SubLString $str103$horizons_missed__iteration__s = makeString("horizons missed; iteration ~s");



    static private final SubLString $str107$____kbp_common_nodes___a = makeString("~%~%kbp common nodes: ~a");

    static private final SubLString $str108$____complete_paths_home_from___s_ = makeString("~%~%complete-paths-home-from: ~s ~%~s");

    static private final SubLString $str109$_____acomplete_paths_home_from_li = makeString("~%~%~acomplete-paths-home-from-link: ~s ~%~a~s");

    static private final SubLString $str110$_____acomplete_paths_home_from_no = makeString("~%~%~acomplete-paths-home-from-node: ~s ~%~a~s");

    static private final SubLString $str112$invalid_path_format___s = makeString("invalid path format: ~s");

    static private final SubLList $list113 = list(makeSymbol("ROOT"), makeSymbol("&OPTIONAL"), makeSymbol("LINKS"));

    static private final SubLString $str114$_____agather_node_latice____a_s = makeString("~%~%~agather-node-latice:~%~a~s");

    static private final SubLString $str115$_____agather_link_latice_____a_s = makeString("~%~%~agather-link-latice: ~%~a~s");

    private static final SubLSymbol KBP_LINK_NODES = makeSymbol("KBP-LINK-NODES");

    static private final SubLString $str117$____marking_horizon_for__s_in_ite = makeString("~%~%marking horizon for ~s in iteration ~s");

    static private final SubLString $str118$__search_node____s__s___s = makeString("~%search node: [~s ~s] ~s");

    static private final SubLString $str119$empty_horizon_for__s_in_iteration = makeString("empty horizon for ~s in iteration ~s");

    static private final SubLString $str120$___s_searched_by___s = makeString("~%~s searched by: ~s");

    static private final SubLString $str121$___s______goal_________________ = makeString("~%~s  *** goal!!!!!!!!!!!!!!!!!");

    static private final SubLSymbol $sym123$_ = makeSymbol("+");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");





    static private final SubLSymbol $sym143$EQUAL_NODES_ = makeSymbol("EQUAL-NODES?");

    static private final SubLSymbol $sym144$ASSERTIONS_FI_EQUAL_ = makeSymbol("ASSERTIONS-FI-EQUAL?");

    static private final SubLList $list145 = list(makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH"));

    static private final SubLList $list146 = list(makeSymbol("LINK"), makeSymbol("NODE-PATH"));

    static private final SubLList $list147 = list(makeSymbol("NODE-1"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-1"));

    static private final SubLList $list148 = list(makeSymbol("LINK-1"), makeSymbol("NODE-PATH-1"));

    static private final SubLList $list149 = list(makeSymbol("NODE-2"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-2"));

    private static final SubLSymbol KBP_JUST_FROM_TUPLES = makeSymbol("KBP-JUST-FROM-TUPLES");

    private static final SubLSymbol KBP_JUST_FROM_TUPLE = makeSymbol("KBP-JUST-FROM-TUPLE");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLList $list154 = list(reader_make_constant_shell("isa"));

    static private final SubLList $list155 = list(reader_make_constant_shell("genls"));

    static private final SubLList $list156 = list(reader_make_constant_shell("genlMt"));

    private static final SubLInteger $int$1024 = makeInteger(1024);

    static private final SubLList $list158 = list(reader_make_constant_shell("conceptuallyRelated"));

    static private final SubLList $list159 = list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("KnowledgeBase"));

    static private final SubLList $list160 = list(reader_make_constant_shell("TestingConstant"), reader_make_constant_shell("LinguisticObjectType"), reader_make_constant_shell("InferenceRelatedBookkeepingPredicate"), reader_make_constant_shell("GenericAttribute"), reader_make_constant_shell("KnowledgeBase"));

    static private final SubLList $list161 = list(reader_make_constant_shell("PartiallyTangible"), reader_make_constant_shell("SiblingDisjointCollectionType"), reader_make_constant_shell("ExistingObjectType"));

    static private final SubLList $list162 = list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("Microtheory"));

    private static final SubLSymbol EXPLAIN_CR_GAF_VIA_PATHS = makeSymbol("EXPLAIN-CR-GAF-VIA-PATHS");



    static private final SubLSymbol $sym166$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");

    private static final SubLSymbol ASSERTION_FI_FORMULA = makeSymbol("ASSERTION-FI-FORMULA");

    static private final SubLString $str168$__cr_gafs_considered___a = makeString("~%cr gafs considered: ~a");

    static private final SubLString $str169$__cr_gafs_explained___a = makeString("~%cr gafs explained: ~a");

    static private final SubLString $str170$__cr_gafs_w_errors___a = makeString("~%cr gafs w/errors: ~a");





    static private final SubLList $list174 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"));

    private static final SubLString $str180$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $str184$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLSymbol GENLS_GATHER_FOCUS_PREDS_COLS = makeSymbol("GENLS-GATHER-FOCUS-PREDS-COLS");

    private static final SubLString $str187$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str188$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str189$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLList $list191 = cons(makeSymbol("COL"), makeSymbol("PRED"));

    private static final SubLSymbol $sym192$_ = makeSymbol(">");



    private static final SubLList $list199 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"), makeKeyword("RELATION-EXISTS"), makeKeyword("INTER-ARG-ISA-INDEPENDENT"), makeKeyword("INTER-ARG-ISA-DEPENDENT"));

    private static final SubLSymbol GENLS_GATHER_FOCUS_PREDS_OF = makeSymbol("GENLS-GATHER-FOCUS-PREDS-OF");

    public static final SubLObject kb_paths_alt(SubLObject source, SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.kb_paths.clear_kb_paths();
            {
                SubLObject v_kb_paths = NIL;
                SubLObject stats = NIL;
                {
                    SubLObject _prev_bind_0 = $nodes_accessor_fn$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $path_link_op$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $path_node_op$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $relevant_linkP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $relevant_nodeP$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $relevant_link_treeP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = $path_source$.currentBinding(thread);
                    SubLObject _prev_bind_7 = $path_target$.currentBinding(thread);
                    SubLObject _prev_bind_8 = $kbp_searchers$.currentBinding(thread);
                    SubLObject _prev_bind_9 = $kbp_term_count$.currentBinding(thread);
                    SubLObject _prev_bind_10 = $kbp_node_count$.currentBinding(thread);
                    SubLObject _prev_bind_11 = $kbp_link_count$.currentBinding(thread);
                    SubLObject _prev_bind_12 = $search_iteration$.currentBinding(thread);
                    try {
                        $nodes_accessor_fn$.bind($nodes_accessor_fn$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($nodes_accessor_fn$.getDynamicValue(thread))) : symbol_function(ALL_ASSERTION_TERMS), thread);
                        $path_link_op$.bind($path_link_op$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($path_link_op$.getDynamicValue(thread))) : symbol_function(DEFAULT_LINK_OP), thread);
                        $path_node_op$.bind($path_node_op$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($path_node_op$.getDynamicValue(thread))) : symbol_function(DEFAULT_NODE_OP), thread);
                        $relevant_linkP$.bind($relevant_linkP$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($relevant_linkP$.getDynamicValue(thread))) : symbol_function($sym95$DEFAULT_RELEVANT_LINK_), thread);
                        $relevant_nodeP$.bind($relevant_nodeP$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($relevant_nodeP$.getDynamicValue(thread))) : symbol_function($sym96$DEFAULT_RELEVANT_NODE_), thread);
                        $relevant_link_treeP$.bind($relevant_link_treeP$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) ($relevant_link_treeP$.getDynamicValue(thread))) : symbol_function($sym97$DEFAULT_RELEVANT_LINK_TREE_), thread);
                        $path_source$.bind(source, thread);
                        $path_target$.bind(target, thread);
                        $kbp_searchers$.bind(remove_duplicates(list(source, target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        $kbp_term_count$.bind(length($kbp_searchers$.getDynamicValue(thread)), thread);
                        $kbp_node_count$.bind(ZERO_INTEGER, thread);
                        $kbp_link_count$.bind(ZERO_INTEGER, thread);
                        $search_iteration$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject time_var = get_internal_real_time();
                            if (NIL != list_utilities.singletonP($kbp_searchers$.getDynamicValue(thread))) {
                                v_kb_paths = $kbp_searchers$.getDynamicValue(thread);
                            } else {
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            {
                                                SubLObject _prev_bind_0_3 = $last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_1_4 = $last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_2_5 = $within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_3_6 = $percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                    $within_noting_percent_progress$.bind(T, thread);
                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    noting_percent_progress_preamble($$$searching_for_kb_paths);
                                                    {
                                                        SubLObject cdolist_list_var = $kbp_searchers$.getDynamicValue(thread);
                                                        SubLObject searcher = NIL;
                                                        for (searcher = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , searcher = cdolist_list_var.first()) {
                                                            com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_searched_by(searcher, searcher, UNPROVIDED);
                                                        }
                                                    }
                                                    {
                                                        SubLObject v_iteration = NIL;
                                                        SubLObject horizon1 = NIL;
                                                        SubLObject horizon2 = NIL;
                                                        SubLObject accessed1 = NIL;
                                                        SubLObject accessed2 = NIL;
                                                        SubLObject paths = NIL;
                                                        for (v_iteration = com.cyc.cycjava.cycl.kb_paths.next_iteration(), horizon1 = com.cyc.cycjava.cycl.kb_paths.mark_next_horizon(list(source), source, UNPROVIDED, UNPROVIDED, UNPROVIDED), horizon2 = com.cyc.cycjava.cycl.kb_paths.mark_next_horizon(list(target), target, UNPROVIDED, UNPROVIDED, UNPROVIDED), accessed1 = horizon1, accessed2 = horizon2, paths = com.cyc.cycjava.cycl.kb_paths.find_paths(source, target); !((NIL != paths) || (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_give_upP(v_iteration, horizon1, horizon2))); v_iteration = com.cyc.cycjava.cycl.kb_paths.next_iteration() , horizon1 = com.cyc.cycjava.cycl.kb_paths.mark_next_horizon(horizon1, source, UNPROVIDED, UNPROVIDED, UNPROVIDED) , horizon2 = com.cyc.cycjava.cycl.kb_paths.mark_next_horizon(horizon2, target, UNPROVIDED, UNPROVIDED, UNPROVIDED) , accessed1 = (NIL != horizon1) ? ((SubLObject) (nconc(accessed1, horizon1))) : NIL , accessed2 = (NIL != horizon2) ? ((SubLObject) (nconc(accessed2, horizon2))) : NIL , paths = com.cyc.cycjava.cycl.kb_paths.find_paths(source, target)) {
                                                            if (NIL != $kbp_common_nodes$.getDynamicValue(thread)) {
                                                                if (NIL == paths) {
                                                                    com.cyc.cycjava.cycl.kb_paths.kbp_error(THREE_INTEGER, $$$missed_connection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                            if ($kbp_trace_level$.getDynamicValue(thread).isNumber() && $kbp_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                                                if (NIL != list_utilities.duplicatesP(accessed1, UNPROVIDED, UNPROVIDED)) {
                                                                    com.cyc.cycjava.cycl.kb_paths.kbp_error(FOUR_INTEGER, $$$duplicates_in_accessed1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != list_utilities.duplicatesP(accessed2, UNPROVIDED, UNPROVIDED)) {
                                                                    com.cyc.cycjava.cycl.kb_paths.kbp_error(FOUR_INTEGER, $$$duplicates_in_accessed2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                        if (NIL != paths) {
                                                            v_kb_paths = paths;
                                                            $kbp_quitP$.setDynamicValue($SUCCESS, thread);
                                                        }
                                                    }
                                                    noting_percent_progress_postamble();
                                                } finally {
                                                    $percent_progress_start_time$.rebind(_prev_bind_3_6, thread);
                                                    $within_noting_percent_progress$.rebind(_prev_bind_2_5, thread);
                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_4, thread);
                                                    $last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            if (NIL != $kbp_min_genls_pathP$.getDynamicValue(thread)) {
                                                {
                                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_min_genls_paths(source, target, mt, UNPROVIDED);
                                                    SubLObject path = NIL;
                                                    for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                                                        if (NIL != path) {
                                                            {
                                                                SubLObject item_var = path;
                                                                if (NIL == member(item_var, v_kb_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    v_kb_paths = cons(item_var, v_kb_paths);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL != $kbp_min_isa_pathP$.getDynamicValue(thread)) {
                                                {
                                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_min_isa_paths(source, target, mt, UNPROVIDED);
                                                    SubLObject path = NIL;
                                                    for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                                                        if (NIL != path) {
                                                            {
                                                                SubLObject item_var = path;
                                                                if (NIL == member(item_var, v_kb_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                    v_kb_paths = cons(item_var, v_kb_paths);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                }
                            }
                            $kbp_run_time$.setDynamicValue(divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue()), thread);
                            if (NIL == $kbp_common_nodes$.getDynamicValue(thread)) {
                                com.cyc.cycjava.cycl.kb_paths.kbp_warn(THREE_INTEGER, $str_alt103$horizons_missed__iteration__s, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != $collect_kbp_statsP$.getDynamicValue(thread)) {
                                stats = com.cyc.cycjava.cycl.kb_paths.kbp_stats(v_kb_paths);
                            }
                        }
                    } finally {
                        $search_iteration$.rebind(_prev_bind_12, thread);
                        $kbp_link_count$.rebind(_prev_bind_11, thread);
                        $kbp_node_count$.rebind(_prev_bind_10, thread);
                        $kbp_term_count$.rebind(_prev_bind_9, thread);
                        $kbp_searchers$.rebind(_prev_bind_8, thread);
                        $path_target$.rebind(_prev_bind_7, thread);
                        $path_source$.rebind(_prev_bind_6, thread);
                        $relevant_link_treeP$.rebind(_prev_bind_5, thread);
                        $relevant_nodeP$.rebind(_prev_bind_4, thread);
                        $relevant_linkP$.rebind(_prev_bind_3, thread);
                        $path_node_op$.rebind(_prev_bind_2, thread);
                        $path_link_op$.rebind(_prev_bind_1, thread);
                        $nodes_accessor_fn$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != $collect_kbp_statsP$.getDynamicValue(thread)) {
                    return values(v_kb_paths, stats);
                } else {
                    return v_kb_paths;
                }
            }
        }
    }

    public static SubLObject kb_paths(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kb_paths();
        SubLObject v_kb_paths = NIL;
        SubLObject stats = NIL;
        final SubLObject _prev_bind_0 = $nodes_accessor_fn$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $path_link_op$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $path_node_op$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $relevant_linkP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $relevant_nodeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $relevant_link_treeP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $path_source$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $path_target$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $kbp_searchers$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $kbp_term_count$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $kbp_node_count$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $kbp_link_count$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $search_iteration$.currentBinding(thread);
        try {
            $nodes_accessor_fn$.bind($nodes_accessor_fn$.getDynamicValue(thread).isFunctionSpec() ? $nodes_accessor_fn$.getDynamicValue(thread) : symbol_function(ALL_ASSERTION_TERMS), thread);
            $path_link_op$.bind($path_link_op$.getDynamicValue(thread).isFunctionSpec() ? $path_link_op$.getDynamicValue(thread) : symbol_function(DEFAULT_LINK_OP), thread);
            $path_node_op$.bind($path_node_op$.getDynamicValue(thread).isFunctionSpec() ? $path_node_op$.getDynamicValue(thread) : symbol_function(DEFAULT_NODE_OP), thread);
            $relevant_linkP$.bind($relevant_linkP$.getDynamicValue(thread).isFunctionSpec() ? $relevant_linkP$.getDynamicValue(thread) : symbol_function($sym95$DEFAULT_RELEVANT_LINK_), thread);
            $relevant_nodeP$.bind($relevant_nodeP$.getDynamicValue(thread).isFunctionSpec() ? $relevant_nodeP$.getDynamicValue(thread) : symbol_function($sym96$DEFAULT_RELEVANT_NODE_), thread);
            $relevant_link_treeP$.bind($relevant_link_treeP$.getDynamicValue(thread).isFunctionSpec() ? $relevant_link_treeP$.getDynamicValue(thread) : symbol_function($sym97$DEFAULT_RELEVANT_LINK_TREE_), thread);
            $path_source$.bind(source, thread);
            $path_target$.bind(target, thread);
            $kbp_searchers$.bind(remove_duplicates(list(source, target), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            $kbp_term_count$.bind(length($kbp_searchers$.getDynamicValue(thread)), thread);
            $kbp_node_count$.bind(ZERO_INTEGER, thread);
            $kbp_link_count$.bind(ZERO_INTEGER, thread);
            $search_iteration$.bind(ZERO_INTEGER, thread);
            final SubLObject time_var = get_internal_real_time();
            if (NIL != list_utilities.singletonP($kbp_searchers$.getDynamicValue(thread))) {
                v_kb_paths = $kbp_searchers$.getDynamicValue(thread);
            } else {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject _prev_bind_0_$2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$5 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$6 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($$$searching_for_kb_paths);
                            SubLObject cdolist_list_var = $kbp_searchers$.getDynamicValue(thread);
                            SubLObject searcher = NIL;
                            searcher = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                kbp_mark_as_searched_by(searcher, searcher, UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                searcher = cdolist_list_var.first();
                            } 
                            SubLObject v_iteration;
                            SubLObject horizon1;
                            SubLObject horizon2;
                            SubLObject accessed1;
                            SubLObject accessed2;
                            SubLObject paths;
                            for (v_iteration = NIL, horizon1 = NIL, horizon2 = NIL, accessed1 = NIL, accessed2 = NIL, paths = NIL, v_iteration = next_iteration(), horizon1 = mark_next_horizon(list(source), source, UNPROVIDED, UNPROVIDED, UNPROVIDED), horizon2 = mark_next_horizon(list(target), target, UNPROVIDED, UNPROVIDED, UNPROVIDED), accessed1 = horizon1, accessed2 = horizon2, paths = find_paths(source, target); (NIL == paths) && (NIL == kbp_give_upP(v_iteration, horizon1, horizon2)); v_iteration = next_iteration() , horizon1 = mark_next_horizon(horizon1, source, UNPROVIDED, UNPROVIDED, UNPROVIDED) , horizon2 = mark_next_horizon(horizon2, target, UNPROVIDED, UNPROVIDED, UNPROVIDED) , accessed1 = (NIL != horizon1) ? nconc(accessed1, horizon1) : NIL , accessed2 = (NIL != horizon2) ? nconc(accessed2, horizon2) : NIL , paths = find_paths(source, target)) {
                                if ((NIL != $kbp_common_nodes$.getDynamicValue(thread)) && (NIL == paths)) {
                                    kbp_error(THREE_INTEGER, $$$missed_connection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if ($kbp_trace_level$.getDynamicValue(thread).isNumber() && $kbp_trace_level$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                                    if (NIL != list_utilities.duplicatesP(accessed1, UNPROVIDED, UNPROVIDED)) {
                                        kbp_error(FOUR_INTEGER, $$$duplicates_in_accessed1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    if (NIL != list_utilities.duplicatesP(accessed2, UNPROVIDED, UNPROVIDED)) {
                                        kbp_error(FOUR_INTEGER, $$$duplicates_in_accessed2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                            if (NIL != paths) {
                                v_kb_paths = paths;
                                $kbp_quitP$.setDynamicValue($SUCCESS, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3_$6, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2_$5, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                    }
                    if (NIL != $kbp_min_genls_pathP$.getDynamicValue(thread)) {
                        SubLObject cdolist_list_var2 = kbp_min_genls_paths(source, target, mt, UNPROVIDED);
                        SubLObject path = NIL;
                        path = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != path) {
                                final SubLObject item_var = path;
                                if (NIL == member(item_var, v_kb_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    v_kb_paths = cons(item_var, v_kb_paths);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            path = cdolist_list_var2.first();
                        } 
                    }
                    if (NIL != $kbp_min_isa_pathP$.getDynamicValue(thread)) {
                        SubLObject cdolist_list_var2 = kbp_min_isa_paths(source, target, mt, UNPROVIDED);
                        SubLObject path = NIL;
                        path = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != path) {
                                final SubLObject item_var = path;
                                if (NIL == member(item_var, v_kb_paths, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    v_kb_paths = cons(item_var, v_kb_paths);
                                }
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            path = cdolist_list_var2.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            }
            $kbp_run_time$.setDynamicValue(divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue()), thread);
            if (NIL == $kbp_common_nodes$.getDynamicValue(thread)) {
                kbp_warn(THREE_INTEGER, $str103$horizons_missed__iteration__s, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $collect_kbp_statsP$.getDynamicValue(thread)) {
                stats = kbp_stats(v_kb_paths);
            }
        } finally {
            $search_iteration$.rebind(_prev_bind_13, thread);
            $kbp_link_count$.rebind(_prev_bind_12, thread);
            $kbp_node_count$.rebind(_prev_bind_11, thread);
            $kbp_term_count$.rebind(_prev_bind_10, thread);
            $kbp_searchers$.rebind(_prev_bind_9, thread);
            $path_target$.rebind(_prev_bind_8, thread);
            $path_source$.rebind(_prev_bind_7, thread);
            $relevant_link_treeP$.rebind(_prev_bind_6, thread);
            $relevant_nodeP$.rebind(_prev_bind_5, thread);
            $relevant_linkP$.rebind(_prev_bind_4, thread);
            $path_node_op$.rebind(_prev_bind_3, thread);
            $path_link_op$.rebind(_prev_bind_2, thread);
            $nodes_accessor_fn$.rebind(_prev_bind_0, thread);
        }
        if (NIL != $collect_kbp_statsP$.getDynamicValue(thread)) {
            return values(v_kb_paths, stats);
        }
        return v_kb_paths;
    }

    public static final SubLObject kb_paths_n_alt(SubLObject source, SubLObject target, SubLObject n) {
        if (n == UNPROVIDED) {
            n = TWO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paths = NIL;
                {
                    SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
                    try {
                        $max_search_iterations$.bind(n, thread);
                        paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(source, target, UNPROVIDED);
                    } finally {
                        $max_search_iterations$.rebind(_prev_bind_0, thread);
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kb_paths_n(SubLObject source, final SubLObject target, SubLObject n) {
        if (n == UNPROVIDED) {
            n = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = NIL;
        final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
        try {
            $max_search_iterations$.bind(n, thread);
            paths = kb_paths(source, target, UNPROVIDED);
        } finally {
            $max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }

    public static final SubLObject kb_paths_in_all_mts_alt(SubLObject source, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paths = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(source, target, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kb_paths_in_all_mts(SubLObject source, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            paths = kb_paths(source, target, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }

    public static final SubLObject kb_paths_in_just_mt_alt(SubLObject source, SubLObject target, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paths = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(source, target, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kb_paths_in_just_mt(SubLObject source, final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            paths = kb_paths(source, target, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }

    public static final SubLObject find_paths_alt(SubLObject source, SubLObject target) {
        if (source == UNPROVIDED) {
            source = $path_source$.getDynamicValue();
        }
        if (target == UNPROVIDED) {
            target = $path_target$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $kbp_common_nodes$.getDynamicValue(thread)) {
                if (NIL != $kbp_trace_level$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.kb_paths.kbp_note(TWO_INTEGER, $str_alt107$____kbp_common_nodes___a, string_utilities.stringify_terms($kbp_common_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                com.cyc.cycjava.cycl.kb_paths.complete_paths_home($kbp_common_nodes$.getDynamicValue(thread));
                return com.cyc.cycjava.cycl.kb_paths.extract_paths(source, target);
            }
            return NIL;
        }
    }

    public static SubLObject find_paths(SubLObject source, SubLObject target) {
        if (source == UNPROVIDED) {
            source = $path_source$.getDynamicValue();
        }
        if (target == UNPROVIDED) {
            target = $path_target$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbp_common_nodes$.getDynamicValue(thread)) {
            if (NIL != $kbp_trace_level$.getDynamicValue(thread)) {
                kbp_note(TWO_INTEGER, $str107$____kbp_common_nodes___a, string_utilities.stringify_terms($kbp_common_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            complete_paths_home($kbp_common_nodes$.getDynamicValue(thread));
            return extract_paths(source, target);
        }
        return NIL;
    }

    public static final SubLObject complete_paths_home_alt(SubLObject common_nodes) {
        if (common_nodes == UNPROVIDED) {
            common_nodes = $kbp_common_nodes$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $kbp_depth$.currentBinding(thread);
                try {
                    $kbp_depth$.bind(ZERO_INTEGER, thread);
                    {
                        SubLObject cdolist_list_var = common_nodes;
                        SubLObject fort = NIL;
                        for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt108$____complete_paths_home_from___s_, com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(fort), fort, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var_7 = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(fort, UNPROVIDED);
                                SubLObject ancestor = NIL;
                                for (ancestor = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , ancestor = cdolist_list_var_7.first()) {
                                    com.cyc.cycjava.cycl.kb_paths.complete_paths_home_from_link(ancestor);
                                }
                            }
                        }
                    }
                } finally {
                    $kbp_depth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject complete_paths_home(SubLObject common_nodes) {
        if (common_nodes == UNPROVIDED) {
            common_nodes = $kbp_common_nodes$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $kbp_depth$.currentBinding(thread);
        try {
            $kbp_depth$.bind(ZERO_INTEGER, thread);
            SubLObject cdolist_list_var = common_nodes;
            SubLObject fort = NIL;
            fort = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kbp_note(FOUR_INTEGER, $str108$____complete_paths_home_from___s_, kbp_searched_by(fort), fort, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var_$8 = kbp_ancestors_via_all(fort, UNPROVIDED);
                SubLObject ancestor = NIL;
                ancestor = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    complete_paths_home_from_link(ancestor);
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    ancestor = cdolist_list_var_$8.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            } 
        } finally {
            $kbp_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject complete_paths_home_from_link_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt109$_____acomplete_paths_home_from_li, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(assertion), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), assertion);
            com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_searched_by_all(assertion, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(assertion, UNPROVIDED);
                SubLObject ancestor = NIL;
                for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ancestor = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.kb_paths.complete_paths_home_from_node(ancestor);
                }
            }
            $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            return NIL;
        }
    }

    public static SubLObject complete_paths_home_from_link(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
        kbp_note(FOUR_INTEGER, $str109$_____acomplete_paths_home_from_li, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), kbp_searched_by(assertion), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), assertion);
        kbp_mark_as_searched_by_all(assertion, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = kbp_ancestors_via_all(assertion, UNPROVIDED);
        SubLObject ancestor = NIL;
        ancestor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            complete_paths_home_from_node(ancestor);
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        } 
        $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
        return NIL;
    }

    public static final SubLObject complete_paths_home_from_node_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searched_by_allP(fort, UNPROVIDED, UNPROVIDED)) {
                $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt110$_____acomplete_paths_home_from_no, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(fort), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), fort);
                com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_searched_by_all(fort, UNPROVIDED, UNPROVIDED);
                if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searcherP(fort)) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(fort, UNPROVIDED);
                        SubLObject ancestor = NIL;
                        for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ancestor = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.kb_paths.complete_paths_home_from_link(ancestor);
                        }
                    }
                }
                $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            return NIL;
        }
    }

    public static SubLObject complete_paths_home_from_node(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kbp_searched_by_allP(fort, UNPROVIDED, UNPROVIDED)) {
            $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            kbp_note(FOUR_INTEGER, $str110$_____acomplete_paths_home_from_no, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), kbp_searched_by(fort), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), fort);
            kbp_mark_as_searched_by_all(fort, UNPROVIDED, UNPROVIDED);
            if (NIL == kbp_searcherP(fort)) {
                SubLObject cdolist_list_var = kbp_ancestors_via_all(fort, UNPROVIDED);
                SubLObject ancestor = NIL;
                ancestor = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    complete_paths_home_from_link(ancestor);
                    cdolist_list_var = cdolist_list_var.rest();
                    ancestor = cdolist_list_var.first();
                } 
            }
            $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return NIL;
    }

    public static final SubLObject extract_paths_alt(SubLObject source, SubLObject target) {
        if (source == UNPROVIDED) {
            source = $path_source$.getDynamicValue();
        }
        if (target == UNPROVIDED) {
            target = $path_target$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $path_target$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $path_source$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $kbp_depth$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $kbp_max_depth$.currentBinding(thread);
                    try {
                        $path_target$.bind(target, thread);
                        $path_source$.bind(source, thread);
                        $kbp_depth$.bind(ZERO_INTEGER, thread);
                        $kbp_max_depth$.bind(NIL != $limit_path_depthP$.getDynamicValue(thread) ? ((SubLObject) (multiply(FOUR_INTEGER, $search_iteration$.getDynamicValue(thread)))) : NIL, thread);
                        {
                            SubLObject kbp_components = com.cyc.cycjava.cycl.kb_paths.kbp_all_searched_by_all(UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_8 = $kbp_nodes$.currentBinding(thread);
                                SubLObject _prev_bind_1_9 = $kbp_links$.currentBinding(thread);
                                try {
                                    $kbp_nodes$.bind(list_utilities.remove_if_not($kbp_nodeP$.getDynamicValue(thread), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                    $kbp_links$.bind(list_utilities.remove_if_not($kbp_linkP$.getDynamicValue(thread), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                    result = com.cyc.cycjava.cycl.kb_paths.kbp_result();
                                } finally {
                                    $kbp_links$.rebind(_prev_bind_1_9, thread);
                                    $kbp_nodes$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                        }
                    } finally {
                        $kbp_max_depth$.rebind(_prev_bind_3, thread);
                        $kbp_depth$.rebind(_prev_bind_2, thread);
                        $path_source$.rebind(_prev_bind_1, thread);
                        $path_target$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject extract_paths(SubLObject source, SubLObject target) {
        if (source == UNPROVIDED) {
            source = $path_source$.getDynamicValue();
        }
        if (target == UNPROVIDED) {
            target = $path_target$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $path_target$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $path_source$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $kbp_depth$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $kbp_max_depth$.currentBinding(thread);
        try {
            $path_target$.bind(target, thread);
            $path_source$.bind(source, thread);
            $kbp_depth$.bind(ZERO_INTEGER, thread);
            $kbp_max_depth$.bind(NIL != $limit_path_depthP$.getDynamicValue(thread) ? multiply(FOUR_INTEGER, $search_iteration$.getDynamicValue(thread)) : NIL, thread);
            final SubLObject kbp_components = kbp_all_searched_by_all(UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$9 = $kbp_nodes$.currentBinding(thread);
            final SubLObject _prev_bind_1_$10 = $kbp_links$.currentBinding(thread);
            try {
                $kbp_nodes$.bind(list_utilities.remove_if_not($kbp_nodeP$.getDynamicValue(thread), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                $kbp_links$.bind(list_utilities.remove_if_not($kbp_linkP$.getDynamicValue(thread), kbp_components, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                result = kbp_result();
            } finally {
                $kbp_links$.rebind(_prev_bind_1_$10, thread);
                $kbp_nodes$.rebind(_prev_bind_0_$9, thread);
            }
        } finally {
            $kbp_max_depth$.rebind(_prev_bind_4, thread);
            $kbp_depth$.rebind(_prev_bind_3, thread);
            $path_source$.rebind(_prev_bind_2, thread);
            $path_target$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject kbp_result_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $kbp_result_format$.getDynamicValue(thread);
                if (pcase_var.eql($PATHS)) {
                    return com.cyc.cycjava.cycl.kb_paths.kbp_result_paths();
                } else {
                    if (pcase_var.eql($LINKS)) {
                        return com.cyc.cycjava.cycl.kb_paths.kbp_result_links();
                    } else {
                        com.cyc.cycjava.cycl.kb_paths.kbp_error(THREE_INTEGER, $str_alt112$invalid_path_format___s, $kbp_result_format$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $kbp_result_format$.getDynamicValue(thread);
        if (pcase_var.eql($PATHS)) {
            return kbp_result_paths();
        }
        if (pcase_var.eql($LINKS)) {
            return kbp_result_links();
        }
        kbp_error(THREE_INTEGER, $str112$invalid_path_format___s, $kbp_result_format$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject kbp_result_links_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject links = NIL;
                SubLObject node = NIL;
                SubLObject done = NIL;
                SubLObject neighbors = NIL;
                SubLObject nodes = NIL;
                for (node = $path_source$.getDynamicValue(thread), done = list(node), neighbors = set_difference(com.cyc.cycjava.cycl.kb_paths.kbp_node_neighbors(node), done, UNPROVIDED, UNPROVIDED), nodes = remove(node, $kbp_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != nodes; node = (NIL != neighbors) ? ((SubLObject) (neighbors.first())) : nodes.first() , done = cons(node, done) , neighbors = set_difference(com.cyc.cycjava.cycl.kb_paths.kbp_node_neighbors(node), done, UNPROVIDED, UNPROVIDED) , nodes = delete(node, nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var = neighbors;
                        SubLObject neighbor = NIL;
                        for (neighbor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neighbor = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_10 = com.cyc.cycjava.cycl.kb_paths.kbp_connecting_links(node, neighbor);
                                SubLObject link = NIL;
                                for (link = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , link = cdolist_list_var_10.first()) {
                                    links = cons(list(node, neighbor, link), links);
                                }
                            }
                        }
                    }
                }
                return nreverse(links);
            }
        }
    }

    public static SubLObject kbp_result_links() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject links = NIL;
        SubLObject node = NIL;
        SubLObject done = NIL;
        SubLObject neighbors = NIL;
        SubLObject nodes = NIL;
        node = $path_source$.getDynamicValue(thread);
        done = list(node);
        neighbors = set_difference(kbp_node_neighbors(node), done, UNPROVIDED, UNPROVIDED);
        for (nodes = remove(node, $kbp_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != nodes; nodes = delete(node, nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = neighbors;
            SubLObject neighbor = NIL;
            neighbor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$11 = kbp_connecting_links(node, neighbor);
                SubLObject link = NIL;
                link = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    links = cons(list(node, neighbor, link), links);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    link = cdolist_list_var_$11.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                neighbor = cdolist_list_var.first();
            } 
            node = (NIL != neighbors) ? neighbors.first() : nodes.first();
            done = cons(node, done);
            neighbors = set_difference(kbp_node_neighbors(node), done, UNPROVIDED, UNPROVIDED);
        }
        return nreverse(links);
    }

    public static final SubLObject kbp_result_paths_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lattice = NIL;
                {
                    SubLObject _prev_bind_0 = $node_ancestors$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $link_ancestors$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $path_node_lattice$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $path_link_lattice$.currentBinding(thread);
                    try {
                        $node_ancestors$.bind(NIL, thread);
                        $link_ancestors$.bind(NIL, thread);
                        $path_node_lattice$.bind(NIL, thread);
                        $path_link_lattice$.bind(NIL, thread);
                        lattice = com.cyc.cycjava.cycl.kb_paths.gather_node_lattice(UNPROVIDED, UNPROVIDED).first();
                    } finally {
                        $path_link_lattice$.rebind(_prev_bind_3, thread);
                        $path_node_lattice$.rebind(_prev_bind_2, thread);
                        $link_ancestors$.rebind(_prev_bind_1, thread);
                        $node_ancestors$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != lattice) {
                    return com.cyc.cycjava.cycl.kb_paths.linearize_lattice(lattice);
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_result_paths() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lattice = NIL;
        final SubLObject _prev_bind_0 = $node_ancestors$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $link_ancestors$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $path_node_lattice$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $path_link_lattice$.currentBinding(thread);
        try {
            $node_ancestors$.bind(NIL, thread);
            $link_ancestors$.bind(NIL, thread);
            $path_node_lattice$.bind(NIL, thread);
            $path_link_lattice$.bind(NIL, thread);
            lattice = gather_node_lattice(UNPROVIDED, UNPROVIDED).first();
        } finally {
            $path_link_lattice$.rebind(_prev_bind_4, thread);
            $path_node_lattice$.rebind(_prev_bind_3, thread);
            $link_ancestors$.rebind(_prev_bind_2, thread);
            $node_ancestors$.rebind(_prev_bind_0, thread);
        }
        if (NIL != lattice) {
            return linearize_lattice(lattice);
        }
        return NIL;
    }

    public static final SubLObject linearize_lattice_alt(SubLObject lattice) {
        if (NIL != lattice) {
            {
                SubLObject paths = NIL;
                SubLObject datum = lattice;
                SubLObject current = datum;
                SubLObject root = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt113);
                root = current.first();
                current = current.rest();
                {
                    SubLObject links = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt113);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != links) {
                            {
                                SubLObject cdolist_list_var = links;
                                SubLObject link = NIL;
                                for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_11 = com.cyc.cycjava.cycl.kb_paths.linearize_lattice(link);
                                        SubLObject path = NIL;
                                        for (path = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , path = cdolist_list_var_11.first()) {
                                            paths = cons(list(root, path), paths);
                                        }
                                    }
                                }
                            }
                        } else {
                            return list(lattice);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt113);
                    }
                }
                return paths;
            }
        }
        return NIL;
    }

    public static SubLObject linearize_lattice(final SubLObject lattice) {
        if (NIL != lattice) {
            SubLObject paths = NIL;
            SubLObject root = NIL;
            destructuring_bind_must_consp(lattice, lattice, $list113);
            root = lattice.first();
            SubLObject current = lattice.rest();
            final SubLObject links = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, lattice, $list113);
            current = current.rest();
            if (NIL == current) {
                if (NIL == links) {
                    return list(lattice);
                }
                SubLObject cdolist_list_var = links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$12 = linearize_lattice(link);
                    SubLObject path = NIL;
                    path = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        paths = cons(list(root, path), paths);
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        path = cdolist_list_var_$12.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
            } else {
                cdestructuring_bind_error(lattice, $list113);
            }
            return paths;
        }
        return NIL;
    }

    public static final SubLObject gather_node_lattice_alt(SubLObject fort, SubLObject ancestors) {
        if (fort == UNPROVIDED) {
            fort = $path_source$.getDynamicValue();
        }
        if (ancestors == UNPROVIDED) {
            ancestors = $node_ancestors$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != com.cyc.cycjava.cycl.kb_paths.kbp_under_limit(UNPROVIDED, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_legal_nodeP(fort))) {
                com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt114$_____agather_node_latice____a_s, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), fort, UNPROVIDED);
                $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                if (NIL != com.cyc.cycjava.cycl.kb_paths.equal_nodesP(fort, $path_target$.getDynamicValue(thread), UNPROVIDED)) {
                    $path_node_lattice$.setDynamicValue(cons(list(fort), $path_node_lattice$.getDynamicValue(thread)), thread);
                } else {
                    {
                        SubLObject _prev_bind_0 = $path_link_lattice$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $node_ancestors$.currentBinding(thread);
                        try {
                            $path_link_lattice$.bind(NIL, thread);
                            $node_ancestors$.bind(cons(fort, ancestors), thread);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_node_links(fort);
                                SubLObject link = NIL;
                                for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.kb_paths.gather_link_lattice(link, UNPROVIDED);
                                }
                                if (NIL != $path_link_lattice$.getDynamicValue(thread)) {
                                    $path_node_lattice$.setDynamicValue(cons(list(fort, $path_link_lattice$.getDynamicValue(thread)), $path_node_lattice$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            $node_ancestors$.rebind(_prev_bind_1, thread);
                            $path_link_lattice$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            return $path_node_lattice$.getDynamicValue(thread);
        }
    }

    public static SubLObject gather_node_lattice(SubLObject fort, SubLObject ancestors) {
        if (fort == UNPROVIDED) {
            fort = $path_source$.getDynamicValue();
        }
        if (ancestors == UNPROVIDED) {
            ancestors = $node_ancestors$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kbp_under_limit(UNPROVIDED, UNPROVIDED)) && (NIL != kbp_legal_nodeP(fort))) {
            kbp_note(FOUR_INTEGER, $str114$_____agather_node_latice____a_s, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), fort, UNPROVIDED);
            $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            if (NIL != equal_nodesP(fort, $path_target$.getDynamicValue(thread), UNPROVIDED)) {
                $path_node_lattice$.setDynamicValue(cons(list(fort), $path_node_lattice$.getDynamicValue(thread)), thread);
            } else {
                final SubLObject _prev_bind_0 = $path_link_lattice$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $node_ancestors$.currentBinding(thread);
                try {
                    $path_link_lattice$.bind(NIL, thread);
                    $node_ancestors$.bind(cons(fort, ancestors), thread);
                    SubLObject cdolist_list_var = kbp_node_links(fort);
                    SubLObject link = NIL;
                    link = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        gather_link_lattice(link, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        link = cdolist_list_var.first();
                    } 
                    if (NIL != $path_link_lattice$.getDynamicValue(thread)) {
                        $path_node_lattice$.setDynamicValue(cons(list(fort, $path_link_lattice$.getDynamicValue(thread)), $path_node_lattice$.getDynamicValue(thread)), thread);
                    }
                } finally {
                    $node_ancestors$.rebind(_prev_bind_2, thread);
                    $path_link_lattice$.rebind(_prev_bind_0, thread);
                }
            }
            $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return $path_node_lattice$.getDynamicValue(thread);
    }

    public static final SubLObject gather_link_lattice_alt(SubLObject assertion, SubLObject ancestors) {
        if (ancestors == UNPROVIDED) {
            ancestors = $link_ancestors$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != com.cyc.cycjava.cycl.kb_paths.kbp_under_limit(UNPROVIDED, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_legal_linkP(assertion))) {
                com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt115$_____agather_link_latice_____a_s, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), assertion, UNPROVIDED);
                $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                {
                    SubLObject _prev_bind_0 = $path_node_lattice$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $link_ancestors$.currentBinding(thread);
                    try {
                        $path_node_lattice$.bind(NIL, thread);
                        $link_ancestors$.bind(cons(assertion, ancestors), thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_link_nodes(assertion);
                            SubLObject node = NIL;
                            for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                com.cyc.cycjava.cycl.kb_paths.gather_node_lattice(node, UNPROVIDED);
                            }
                            if (NIL != $path_node_lattice$.getDynamicValue(thread)) {
                                $path_link_lattice$.setDynamicValue(cons(list(assertion, $path_node_lattice$.getDynamicValue(thread)), $path_link_lattice$.getDynamicValue(thread)), thread);
                            }
                        }
                    } finally {
                        $link_ancestors$.rebind(_prev_bind_1, thread);
                        $path_node_lattice$.rebind(_prev_bind_0, thread);
                    }
                }
                $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            return NIL;
        }
    }

    public static SubLObject gather_link_lattice(final SubLObject assertion, SubLObject ancestors) {
        if (ancestors == UNPROVIDED) {
            ancestors = $link_ancestors$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != kbp_under_limit(UNPROVIDED, UNPROVIDED)) && (NIL != kbp_legal_linkP(assertion))) {
            kbp_note(FOUR_INTEGER, $str115$_____agather_link_latice_____a_s, string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), string_utilities.tabstr($kbp_depth$.getDynamicValue(thread), UNPROVIDED), assertion, UNPROVIDED);
            $kbp_depth$.setDynamicValue(add($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            final SubLObject _prev_bind_0 = $path_node_lattice$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $link_ancestors$.currentBinding(thread);
            try {
                $path_node_lattice$.bind(NIL, thread);
                $link_ancestors$.bind(cons(assertion, ancestors), thread);
                SubLObject cdolist_list_var = kbp_link_nodes(assertion);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    gather_node_lattice(node, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
                if (NIL != $path_node_lattice$.getDynamicValue(thread)) {
                    $path_link_lattice$.setDynamicValue(cons(list(assertion, $path_node_lattice$.getDynamicValue(thread)), $path_link_lattice$.getDynamicValue(thread)), thread);
                }
            } finally {
                $link_ancestors$.rebind(_prev_bind_2, thread);
                $path_node_lattice$.rebind(_prev_bind_0, thread);
            }
            $kbp_depth$.setDynamicValue(subtract($kbp_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return NIL;
    }

    public static final SubLObject kbp_neighbors_among_alt(SubLObject v_object, SubLObject kbp_components, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject neighbors = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(v_object, UNPROVIDED);
                SubLObject cdolist_list_var = kbp_components;
                SubLObject component = NIL;
                for (component = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , component = cdolist_list_var.first()) {
                    if (NIL == subl_promotions.memberP(component, neighbors, test, UNPROVIDED)) {
                        if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_ancestor_via_anyP(component, $kbp_searchers$.getDynamicValue(thread), v_object, UNPROVIDED)) {
                            neighbors = cons(component, neighbors);
                        }
                    }
                }
                return nreverse(neighbors);
            }
        }
    }

    public static SubLObject kbp_neighbors_among(final SubLObject v_object, final SubLObject kbp_components, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neighbors = kbp_ancestors_via_all(v_object, UNPROVIDED);
        SubLObject cdolist_list_var = kbp_components;
        SubLObject component = NIL;
        component = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(component, neighbors, test, UNPROVIDED)) && (NIL != kbp_ancestor_via_anyP(component, $kbp_searchers$.getDynamicValue(thread), v_object, UNPROVIDED))) {
                neighbors = cons(component, neighbors);
            }
            cdolist_list_var = cdolist_list_var.rest();
            component = cdolist_list_var.first();
        } 
        return nreverse(neighbors);
    }

    public static final SubLObject kbp_node_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.kb_paths.kbp_neighbors_among(node, $kbp_links$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject kbp_node_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_neighbors_among(node, $kbp_links$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject kbp_link_nodes_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.kb_paths.kbp_neighbors_among(link, $kbp_nodes$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject kbp_link_nodes(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_neighbors_among(link, $kbp_nodes$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject kbp_connecting_links_alt(SubLObject node_1, SubLObject node_2) {
        {
            SubLObject connecting_links = NIL;
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(node_2, UNPROVIDED);
                SubLObject link = NIL;
                for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(node_1, com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(link, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        connecting_links = cons(link, connecting_links);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(node_1, UNPROVIDED);
                SubLObject link = NIL;
                for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                    if (NIL != subl_promotions.memberP(node_2, com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(link, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject item_var = link;
                            if (NIL == member(item_var, connecting_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                                connecting_links = cons(item_var, connecting_links);
                            }
                        }
                    }
                }
            }
            return connecting_links;
        }
    }

    public static SubLObject kbp_connecting_links(final SubLObject node_1, final SubLObject node_2) {
        SubLObject connecting_links = NIL;
        SubLObject cdolist_list_var = kbp_ancestors_via_all(node_2, UNPROVIDED);
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(node_1, kbp_ancestors_via_all(link, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                connecting_links = cons(link, connecting_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        cdolist_list_var = kbp_ancestors_via_all(node_1, UNPROVIDED);
        link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(node_2, kbp_ancestors_via_all(link, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var = link;
                if (NIL == member(item_var, connecting_links, symbol_function(EQL), symbol_function(IDENTITY))) {
                    connecting_links = cons(item_var, connecting_links);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return connecting_links;
    }

    public static final SubLObject kbp_node_neighbors_alt(SubLObject node) {
        return remove(node, list_utilities.mapunion(symbol_function(KBP_LINK_NODES), com.cyc.cycjava.cycl.kb_paths.kbp_node_links(node), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kbp_node_neighbors(final SubLObject node) {
        return remove(node, list_utilities.mapunion(symbol_function(KBP_LINK_NODES), kbp_node_links(node), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_legal_linkP_alt(SubLObject assertion) {
        if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searched_by_allP(assertion, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.kb_paths.ancestor_linkP(assertion)) {
                return NIL;
            } else {
                return T;
            }
        }
    }

    public static SubLObject kbp_legal_linkP(final SubLObject assertion) {
        if (NIL == kbp_searched_by_allP(assertion, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != ancestor_linkP(assertion)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject kbp_legal_nodeP_alt(SubLObject node) {
        if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searched_by_allP(node, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        } else {
            if (NIL != com.cyc.cycjava.cycl.kb_paths.ancestor_nodeP(node)) {
                return NIL;
            } else {
                return T;
            }
        }
    }

    public static SubLObject kbp_legal_nodeP(final SubLObject node) {
        if (NIL == kbp_searched_by_allP(node, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != ancestor_nodeP(node)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject ancestor_linkP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(assertion, $link_ancestors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject ancestor_linkP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(assertion, $link_ancestors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ancestor_nodeP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(fort, $node_ancestors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject ancestor_nodeP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, $node_ancestors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_under_limit_alt(SubLObject depth, SubLObject limit) {
        if (depth == UNPROVIDED) {
            depth = $kbp_depth$.getDynamicValue();
        }
        if (limit == UNPROVIDED) {
            limit = $kbp_max_depth$.getDynamicValue();
        }
        return makeBoolean(((!depth.isNumber()) || (!limit.isNumber())) || limit.numGE(depth));
    }

    public static SubLObject kbp_under_limit(SubLObject depth, SubLObject limit) {
        if (depth == UNPROVIDED) {
            depth = $kbp_depth$.getDynamicValue();
        }
        if (limit == UNPROVIDED) {
            limit = $kbp_max_depth$.getDynamicValue();
        }
        return makeBoolean(((!depth.isNumber()) || (!limit.isNumber())) || limit.numGE(depth));
    }

    public static final SubLObject mark_next_horizon_alt(SubLObject v_forts, SubLObject searcher, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (op == UNPROVIDED) {
            op = $path_link_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(ASSERTION_P);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = $relevant_link_treeP$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.kb_paths.kbp_note(THREE_INTEGER, $str_alt117$____marking_horizon_for__s_in_ite, searcher, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            if (NIL == $kbp_common_nodes$.getDynamicValue(thread)) {
                {
                    SubLObject result = NIL;
                    SubLObject quitP = $kbp_quitP$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = $path_horizon$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kbp_searcher$.currentBinding(thread);
                        try {
                            $path_horizon$.bind(NIL, thread);
                            $kbp_searcher$.bind(searcher, thread);
                            if (NIL == quitP) {
                                {
                                    SubLObject csome_list_var = v_forts;
                                    {
                                        SubLObject _prev_bind_0_12 = $kbp_ancestor$.currentBinding(thread);
                                        try {
                                            $kbp_ancestor$.bind(NIL, thread);
                                            for ($kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread); !((NIL != quitP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , $kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread)) {
                                                $kbp_node_count$.setDynamicValue(add($kbp_node_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.kb_paths.kbp_note(TWO_INTEGER, $str_alt118$__search_node____s__s___s, $search_iteration$.getDynamicValue(thread), $kbp_node_count$.getDynamicValue(thread), $kbp_ancestor$.getDynamicValue(thread), UNPROVIDED);
                                                com.cyc.cycjava.cycl.kb_paths.do_if_term_assertions($kbp_ancestor$.getDynamicValue(thread), op, do_opP, climb_treeP);
                                                quitP = com.cyc.cycjava.cycl.kb_paths.kbp_term_bound_metP();
                                            }
                                        } finally {
                                            $kbp_ancestor$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                }
                            }
                            result = $path_horizon$.getDynamicValue(thread);
                        } finally {
                            $kbp_searcher$.rebind(_prev_bind_1, thread);
                            $path_horizon$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == result) {
                        com.cyc.cycjava.cycl.kb_paths.kbp_warn(THREE_INTEGER, $str_alt119$empty_horizon_for__s_in_iteration, searcher, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                    return result;
                }
            }
            return NIL;
        }
    }

    public static SubLObject mark_next_horizon(final SubLObject v_forts, SubLObject searcher, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (op == UNPROVIDED) {
            op = $path_link_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(ASSERTION_P);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = $relevant_link_treeP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbp_note(THREE_INTEGER, $str117$____marking_horizon_for__s_in_ite, searcher, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL == $kbp_common_nodes$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject quitP = $kbp_quitP$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $path_horizon$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kbp_searcher$.currentBinding(thread);
            try {
                $path_horizon$.bind(NIL, thread);
                $kbp_searcher$.bind(searcher, thread);
                if (NIL == quitP) {
                    SubLObject csome_list_var = v_forts;
                    final SubLObject _prev_bind_0_$13 = $kbp_ancestor$.currentBinding(thread);
                    try {
                        $kbp_ancestor$.bind(NIL, thread);
                        $kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread);
                        while ((NIL == quitP) && (NIL != csome_list_var)) {
                            $kbp_node_count$.setDynamicValue(add($kbp_node_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                            kbp_note(TWO_INTEGER, $str118$__search_node____s__s___s, $search_iteration$.getDynamicValue(thread), $kbp_node_count$.getDynamicValue(thread), $kbp_ancestor$.getDynamicValue(thread), UNPROVIDED);
                            do_if_term_assertions($kbp_ancestor$.getDynamicValue(thread), op, do_opP, climb_treeP);
                            quitP = kbp_term_bound_metP();
                            csome_list_var = csome_list_var.rest();
                            $kbp_ancestor$.setDynamicValue(csome_list_var.first(), thread);
                        } 
                    } finally {
                        $kbp_ancestor$.rebind(_prev_bind_0_$13, thread);
                    }
                }
                result = $path_horizon$.getDynamicValue(thread);
            } finally {
                $kbp_searcher$.rebind(_prev_bind_2, thread);
                $path_horizon$.rebind(_prev_bind_0, thread);
            }
            if (NIL == result) {
                kbp_warn(THREE_INTEGER, $str119$empty_horizon_for__s_in_iteration, searcher, $search_iteration$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject default_link_op_alt(SubLObject assertion, SubLObject searcher, SubLObject ancestor) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall($relevant_linkP$.getDynamicValue(thread), assertion)) {
                $kbp_link_count$.setDynamicValue(add($kbp_link_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                com.cyc.cycjava.cycl.kb_paths.kbp_record_ancestor(assertion, searcher, ancestor, UNPROVIDED);
                if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searched_byP(assertion, searcher, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_searched_by(assertion, searcher, UNPROVIDED);
                    com.cyc.cycjava.cycl.kb_paths.do_link_nodes(assertion, UNPROVIDED, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject default_link_op(final SubLObject assertion, SubLObject searcher, SubLObject ancestor) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall($relevant_linkP$.getDynamicValue(thread), assertion)) {
            $kbp_link_count$.setDynamicValue(add($kbp_link_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            kbp_record_ancestor(assertion, searcher, ancestor, UNPROVIDED);
            if (NIL == kbp_searched_byP(assertion, searcher, UNPROVIDED)) {
                kbp_mark_as_searched_by(assertion, searcher, UNPROVIDED);
                do_link_nodes(assertion, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject default_node_op_alt(SubLObject fort, SubLObject searcher, SubLObject ancestor) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != funcall($relevant_nodeP$.getDynamicValue(thread), fort)) {
                $kbp_term_count$.setDynamicValue(add($kbp_term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                com.cyc.cycjava.cycl.kb_paths.kbp_record_ancestor(fort, searcher, ancestor, UNPROVIDED);
                if (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_searched_byP(fort, searcher, UNPROVIDED)) {
                    com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_searched_by(fort, searcher, UNPROVIDED);
                    com.cyc.cycjava.cycl.kb_paths.kbp_note(FOUR_INTEGER, $str_alt120$___s_searched_by___s, fort, com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(fort), UNPROVIDED, UNPROVIDED);
                    if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_searched_by_allP(fort, UNPROVIDED, UNPROVIDED)) {
                        $kbp_common_nodes$.setDynamicValue(cons(fort, $kbp_common_nodes$.getDynamicValue(thread)), thread);
                        com.cyc.cycjava.cycl.kb_paths.kbp_note(ONE_INTEGER, $str_alt121$___s______goal_________________, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != $kbp_quit_with_successP$.getDynamicValue(thread)) {
                            $kbp_quitP$.setDynamicValue($SUCCESS, thread);
                        }
                    } else {
                        $path_horizon$.setDynamicValue(cons(fort, $path_horizon$.getDynamicValue(thread)), thread);
                    }
                }
                if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_term_bound_metP()) {
                    $kbp_quitP$.setDynamicValue($TERM_BOUND, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject default_node_op(final SubLObject fort, SubLObject searcher, SubLObject ancestor) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != funcall($relevant_nodeP$.getDynamicValue(thread), fort)) {
            $kbp_term_count$.setDynamicValue(add($kbp_term_count$.getDynamicValue(thread), ONE_INTEGER), thread);
            kbp_record_ancestor(fort, searcher, ancestor, UNPROVIDED);
            if (NIL == kbp_searched_byP(fort, searcher, UNPROVIDED)) {
                kbp_mark_as_searched_by(fort, searcher, UNPROVIDED);
                kbp_note(FOUR_INTEGER, $str120$___s_searched_by___s, fort, kbp_searched_by(fort), UNPROVIDED, UNPROVIDED);
                if (NIL != kbp_searched_by_allP(fort, UNPROVIDED, UNPROVIDED)) {
                    $kbp_common_nodes$.setDynamicValue(cons(fort, $kbp_common_nodes$.getDynamicValue(thread)), thread);
                    kbp_note(ONE_INTEGER, $str121$___s______goal_________________, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != $kbp_quit_with_successP$.getDynamicValue(thread)) {
                        $kbp_quitP$.setDynamicValue($SUCCESS, thread);
                    }
                } else {
                    $path_horizon$.setDynamicValue(cons(fort, $path_horizon$.getDynamicValue(thread)), thread);
                }
            }
            if (NIL != kbp_term_bound_metP()) {
                $kbp_quitP$.setDynamicValue($TERM_BOUND, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject do_link_nodes_alt(SubLObject assertion, SubLObject op, SubLObject do_opP) {
        if (op == UNPROVIDED) {
            op = $path_node_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(FORT_P);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = funcall($nodes_accessor_fn$.getDynamicValue(thread), assertion);
                SubLObject node = NIL;
                for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                    if (NIL != $kbp_quitP$.getDynamicValue(thread)) {
                        return NIL;
                    } else {
                        if (NIL == com.cyc.cycjava.cycl.kb_paths.equal_nodesP(node, $kbp_ancestor$.getDynamicValue(thread), UNPROVIDED)) {
                            if (NIL != funcall(do_opP, node)) {
                                {
                                    SubLObject _prev_bind_0 = $kbp_ancestor$.currentBinding(thread);
                                    try {
                                        $kbp_ancestor$.bind(assertion, thread);
                                        funcall(op, node);
                                    } finally {
                                        $kbp_ancestor$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject do_link_nodes(final SubLObject assertion, SubLObject op, SubLObject do_opP) {
        if (op == UNPROVIDED) {
            op = $path_node_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(FORT_P);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = funcall($nodes_accessor_fn$.getDynamicValue(thread), assertion);
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != $kbp_quitP$.getDynamicValue(thread)) {
                return NIL;
            }
            if ((NIL == equal_nodesP(node, $kbp_ancestor$.getDynamicValue(thread), UNPROVIDED)) && (NIL != funcall(do_opP, node))) {
                final SubLObject _prev_bind_0 = $kbp_ancestor$.currentBinding(thread);
                try {
                    $kbp_ancestor$.bind(assertion, thread);
                    funcall(op, node);
                } finally {
                    $kbp_ancestor$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject default_relevant_linkP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mt_relevance_macros.relevant_assertionP(link)) {
                return NIL;
            } else {
                if ((NIL != $kbp_external_link_predP$.getDynamicValue(thread)) && (NIL == com.cyc.cycjava.cycl.kb_paths.kbp_link_satisfies_external_predP(link))) {
                    return NIL;
                } else {
                    if ((NIL != $kbp_only_gaf_linksP$.getDynamicValue(thread)) && (NIL == assertions_high.gaf_assertionP(link))) {
                        return NIL;
                    } else {
                        if ((NIL != $kbp_designated_predsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_undesignated_pred_assertionP(link))) {
                            return NIL;
                        } else {
                            if ((NIL != $kbp_restricted_predsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_restricted_pred_assertionP(link))) {
                                return NIL;
                            } else {
                                if ((NIL != $kbp_restricted_mtsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_restricted_mt_assertionP(link))) {
                                    return NIL;
                                } else {
                                    if ((NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_bi_scoping_linkP(link))) {
                                        return NIL;
                                    } else {
                                        if ((NIL != $kbp_bound_gaf_termsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_gaf_term_beyond_boundP(link))) {
                                            return NIL;
                                        } else {
                                            if ((NIL != $kbp_bound_link_termsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_link_term_beyond_boundP(link))) {
                                                return NIL;
                                            } else {
                                                if ((NIL != $kbp_link_reference_set_boundP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_link_terms_beyond_reference_set_boundP(link))) {
                                                    return NIL;
                                                } else {
                                                    if ((NIL != $kbp_designated_link_referencesP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_link_terms_wXo_referencesP(link))) {
                                                        return NIL;
                                                    } else {
                                                        if ((NIL != $kbp_use_max_mtsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_link_wXo_max_mtP(link))) {
                                                            return NIL;
                                                        } else {
                                                            if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_excluded_linkP(link)) {
                                                                return NIL;
                                                            } else {
                                                                if ((NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.bookkeeping_gaf_assertionP(link))) {
                                                                    return NIL;
                                                                } else {
                                                                    return T;
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
                    }
                }
            }
        }
    }

    public static SubLObject default_relevant_linkP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mt_relevance_macros.relevant_assertionP(link)) {
            return NIL;
        }
        if ((NIL != $kbp_external_link_predP$.getDynamicValue(thread)) && (NIL == kbp_link_satisfies_external_predP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_only_gaf_linksP$.getDynamicValue(thread)) && (NIL == assertions_high.gaf_assertionP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_designated_predsP$.getDynamicValue(thread)) && (NIL != kbp_undesignated_pred_assertionP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_restricted_predsP$.getDynamicValue(thread)) && (NIL != kbp_restricted_pred_assertionP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_restricted_mtsP$.getDynamicValue(thread)) && (NIL != kbp_restricted_mt_assertionP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue(thread)) && (NIL != kbp_bi_scoping_linkP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_bound_gaf_termsP$.getDynamicValue(thread)) && (NIL != kbp_gaf_term_beyond_boundP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_bound_link_termsP$.getDynamicValue(thread)) && (NIL != kbp_link_term_beyond_boundP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_link_reference_set_boundP$.getDynamicValue(thread)) && (NIL != kbp_link_terms_beyond_reference_set_boundP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_designated_link_referencesP$.getDynamicValue(thread)) && (NIL != kbp_link_terms_wXo_referencesP(link))) {
            return NIL;
        }
        if ((NIL != $kbp_use_max_mtsP$.getDynamicValue(thread)) && (NIL != kbp_link_wXo_max_mtP(link))) {
            return NIL;
        }
        if (NIL != kbp_excluded_linkP(link)) {
            return NIL;
        }
        if ((NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue(thread)) && (NIL != bookkeeping_gaf_assertionP(link))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject default_relevant_nodeP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == forts.fort_p(node)) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.kb_paths.equal_nodesP(node, $kbp_searcher$.getDynamicValue(thread), UNPROVIDED)) {
                    return NIL;
                } else {
                    if (NIL != fort_types_interface.non_predicate_functionP(node)) {
                        return NIL;
                    } else {
                        if ((NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_bi_scoping_nodeP(node))) {
                            return NIL;
                        } else {
                            if ((NIL != $kbp_genl_boundP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_beyond_genl_boundP(node))) {
                                return NIL;
                            } else {
                                if ((NIL != $kbp_isa_boundP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_beyond_isa_boundP(node))) {
                                    return NIL;
                                } else {
                                    if ((NIL != $kbp_node_isa_boundP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_node_beyond_isa_boundP(node))) {
                                        return NIL;
                                    } else {
                                        if ((NIL != $kbp_designated_node_superiorsP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_undesignated_node_superiorP(node))) {
                                            return NIL;
                                        } else {
                                            if ((NIL != $kbp_restricted_nodes_as_argP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_node_restricted_as_argP(node))) {
                                                return NIL;
                                            } else {
                                                if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_excluded_nodeP(node)) {
                                                    return NIL;
                                                } else {
                                                    if ((NIL != $kbp_genls_cardinality_delta_boundP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_beyond_genls_cardinality_delta_boundP(node))) {
                                                        return NIL;
                                                    } else {
                                                        return T;
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
        }
    }

    public static SubLObject default_relevant_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == forts.fort_p(node)) {
            return NIL;
        }
        if (NIL != equal_nodesP(node, $kbp_searcher$.getDynamicValue(thread), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != fort_types_interface.non_predicate_functionP(node)) {
            return NIL;
        }
        if ((NIL != $kbp_no_bi_scoping_linksP$.getDynamicValue(thread)) && (NIL != kbp_bi_scoping_nodeP(node))) {
            return NIL;
        }
        if ((NIL != $kbp_genl_boundP$.getDynamicValue(thread)) && (NIL != kbp_beyond_genl_boundP(node))) {
            return NIL;
        }
        if ((NIL != $kbp_isa_boundP$.getDynamicValue(thread)) && (NIL != kbp_beyond_isa_boundP(node))) {
            return NIL;
        }
        if ((NIL != $kbp_node_isa_boundP$.getDynamicValue(thread)) && (NIL != kbp_node_beyond_isa_boundP(node))) {
            return NIL;
        }
        if ((NIL != $kbp_designated_node_superiorsP$.getDynamicValue(thread)) && (NIL != kbp_undesignated_node_superiorP(node))) {
            return NIL;
        }
        if ((NIL != $kbp_restricted_nodes_as_argP$.getDynamicValue(thread)) && (NIL != kbp_node_restricted_as_argP(node))) {
            return NIL;
        }
        if (NIL != kbp_excluded_nodeP(node)) {
            return NIL;
        }
        if ((NIL != $kbp_genls_cardinality_delta_boundP$.getDynamicValue(thread)) && (NIL != kbp_beyond_genls_cardinality_delta_boundP(node))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject kbp_beyond_genls_cardinality_delta_boundP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != fort_types_interface.collectionP(node)) {
                {
                    SubLObject spec_cardinality = cardinality_estimates.spec_cardinality(node);
                    if (spec_cardinality.isInteger()) {
                        return numG(spec_cardinality, creduce($sym123$_, list_utilities.remove_if_not(INTEGERP, cons($kbp_genls_cardinality_delta_bound$.getDynamicValue(thread), Mapping.mapcar(SPEC_CARDINALITY, $kbp_searchers$.getDynamicValue(thread))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_beyond_genls_cardinality_delta_boundP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fort_types_interface.collectionP(node)) {
            final SubLObject spec_cardinality = cardinality_estimates.spec_cardinality(node);
            if (spec_cardinality.isInteger()) {
                return numG(spec_cardinality, creduce($sym123$_, list_utilities.remove_if_not(INTEGERP, cons($kbp_genls_cardinality_delta_bound$.getDynamicValue(thread), Mapping.mapcar(SPEC_CARDINALITY, $kbp_searchers$.getDynamicValue(thread))), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static final SubLObject kbp_beyond_genl_boundP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return genls.any_specP(fort, $kbp_genl_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kbp_beyond_genl_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genls.any_specP(fort, $kbp_genl_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_beyond_isa_boundP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return isa.isa_anyP(fort, $kbp_isa_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kbp_beyond_isa_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return isa.isa_anyP(fort, $kbp_isa_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_undesignated_node_superiorP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $kbp_designated_node_superiors$.getDynamicValue(thread)) {
                return makeBoolean(!((NIL != isa.isa_anyP(fort, $kbp_designated_node_superiors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) || (NIL != sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_utilities.determine_sbhl_module_from_fort_type(fort, UNPROVIDED), fort, $kbp_designated_node_superiors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))));
            }
            return NIL;
        }
    }

    public static SubLObject kbp_undesignated_node_superiorP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbp_designated_node_superiors$.getDynamicValue(thread)) {
            return makeBoolean((NIL == isa.isa_anyP(fort, $kbp_designated_node_superiors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL == sbhl_search_methods.sbhl_predicate_relation_with_any_p(sbhl_module_utilities.determine_sbhl_module_from_fort_type(fort, UNPROVIDED), fort, $kbp_designated_node_superiors$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static final SubLObject kbp_node_restricted_as_argP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(node)) {
                {
                    SubLObject restrictedP = NIL;
                    if (NIL == restrictedP) {
                        {
                            SubLObject csome_list_var = $kbp_restricted_nodes_as_arg$.getDynamicValue(thread);
                            SubLObject predXarg = NIL;
                            for (predXarg = csome_list_var.first(); !((NIL != restrictedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , predXarg = csome_list_var.first()) {
                                restrictedP = kb_mapping_utilities.some_pred_value(node, predXarg.first(), second(predXarg), UNPROVIDED);
                            }
                        }
                    }
                    return restrictedP;
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_node_restricted_as_argP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(node)) {
            SubLObject restrictedP = NIL;
            if (NIL == restrictedP) {
                SubLObject csome_list_var;
                SubLObject predXarg;
                for (csome_list_var = $kbp_restricted_nodes_as_arg$.getDynamicValue(thread), predXarg = NIL, predXarg = csome_list_var.first(); (NIL == restrictedP) && (NIL != csome_list_var); restrictedP = kb_mapping_utilities.some_pred_value(node, predXarg.first(), second(predXarg), UNPROVIDED) , csome_list_var = csome_list_var.rest() , predXarg = csome_list_var.first()) {
                }
            }
            return restrictedP;
        }
        return NIL;
    }

    public static final SubLObject kbp_node_beyond_isa_boundP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return isa.isa_anyP(fort, $kbp_node_isa_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kbp_node_beyond_isa_boundP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return isa.isa_anyP(fort, $kbp_node_isa_bound$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_gaf_term_beyond_boundP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject beyondP = NIL;
                if (NIL != assertions_high.gaf_assertionP(link)) {
                    if (NIL == beyondP) {
                        {
                            SubLObject csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue(thread);
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); !((NIL != beyondP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                beyondP = com.cyc.cycjava.cycl.kb_paths.kbp_beyond_isa_boundP(assertions_high.gaf_arg(link, arg));
                            }
                        }
                    }
                    if (NIL == beyondP) {
                        {
                            SubLObject csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue(thread);
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); !((NIL != beyondP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                beyondP = com.cyc.cycjava.cycl.kb_paths.kbp_beyond_genl_boundP(assertions_high.gaf_arg(link, arg));
                            }
                        }
                    }
                }
                return beyondP;
            }
        }
    }

    public static SubLObject kbp_gaf_term_beyond_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = NIL;
        if (NIL != assertions_high.gaf_assertionP(link)) {
            if (NIL == beyondP) {
                SubLObject csome_list_var;
                SubLObject arg;
                for (csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue(thread), arg = NIL, arg = csome_list_var.first(); (NIL == beyondP) && (NIL != csome_list_var); beyondP = kbp_beyond_isa_boundP(assertions_high.gaf_arg(link, arg)) , csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                }
            }
            if (NIL == beyondP) {
                SubLObject csome_list_var;
                SubLObject arg;
                for (csome_list_var = $kbp_bound_gaf_terms$.getDynamicValue(thread), arg = NIL, arg = csome_list_var.first(); (NIL == beyondP) && (NIL != csome_list_var); beyondP = kbp_beyond_genl_boundP(assertions_high.gaf_arg(link, arg)) , csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                }
            }
        }
        return beyondP;
    }

    public static final SubLObject kbp_undesignated_pred_assertionP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $kbp_designated_preds$.getDynamicValue(thread)) && (NIL != assertions_high.gaf_assertionP(link))) {
                return makeBoolean(NIL == subl_promotions.memberP(assertions_high.gaf_arg0(link), $kbp_designated_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
            }
            return NIL;
        }
    }

    public static SubLObject kbp_undesignated_pred_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kbp_designated_preds$.getDynamicValue(thread)) && (NIL != assertions_high.gaf_assertionP(link))) {
            return makeBoolean(NIL == subl_promotions.memberP(assertions_high.gaf_arg0(link), $kbp_designated_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject kbp_restricted_pred_assertionP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $kbp_restricted_preds$.getDynamicValue(thread)) && (NIL != assertions_high.gaf_assertionP(link))) {
                return subl_promotions.memberP(assertions_high.gaf_arg0(link), $kbp_restricted_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject kbp_restricted_pred_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kbp_restricted_preds$.getDynamicValue(thread)) && (NIL != assertions_high.gaf_assertionP(link))) {
            return subl_promotions.memberP(assertions_high.gaf_arg0(link), $kbp_restricted_preds$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kbp_restricted_mt_assertionP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $kbp_restricted_mtsP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(link))) {
                return subl_promotions.memberP(assertions_high.assertion_mt(link), $kbp_restricted_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject kbp_restricted_mt_assertionP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kbp_restricted_mtsP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(link))) {
            return subl_promotions.memberP(assertions_high.assertion_mt(link), $kbp_restricted_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kbp_link_terms_beyond_reference_set_boundP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject beyondP = NIL;
                if (NIL != term.kb_assertionP(link)) {
                    {
                        SubLObject assertion_terms = com.cyc.cycjava.cycl.kb_paths.all_assertion_references(link, UNPROVIDED);
                        if (NIL == beyondP) {
                            {
                                SubLObject csome_list_var = $kbp_link_reference_set_bound$.getDynamicValue(thread);
                                SubLObject term_set = NIL;
                                for (term_set = csome_list_var.first(); !((NIL != beyondP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , term_set = csome_list_var.first()) {
                                    {
                                        SubLObject missedP = NIL;
                                        if (NIL == missedP) {
                                            {
                                                SubLObject csome_list_var_13 = term_set;
                                                SubLObject v_term = NIL;
                                                for (v_term = csome_list_var_13.first(); !((NIL != missedP) || (NIL == csome_list_var_13)); csome_list_var_13 = csome_list_var_13.rest() , v_term = csome_list_var_13.first()) {
                                                    missedP = makeBoolean(NIL == subl_promotions.memberP(v_term, assertion_terms, symbol_function(EQUAL), UNPROVIDED));
                                                }
                                            }
                                        }
                                        beyondP = makeBoolean(NIL == missedP);
                                    }
                                }
                            }
                        }
                    }
                }
                return beyondP;
            }
        }
    }

    public static SubLObject kbp_link_terms_beyond_reference_set_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = NIL;
        if (NIL != term.kb_assertionP(link)) {
            final SubLObject assertion_terms = all_assertion_references(link, UNPROVIDED);
            if (NIL == beyondP) {
                SubLObject csome_list_var = $kbp_link_reference_set_bound$.getDynamicValue(thread);
                SubLObject term_set = NIL;
                term_set = csome_list_var.first();
                while ((NIL == beyondP) && (NIL != csome_list_var)) {
                    SubLObject missedP = NIL;
                    if (NIL == missedP) {
                        SubLObject csome_list_var_$14;
                        SubLObject v_term;
                        for (csome_list_var_$14 = term_set, v_term = NIL, v_term = csome_list_var_$14.first(); (NIL == missedP) && (NIL != csome_list_var_$14); missedP = makeBoolean(NIL == subl_promotions.memberP(v_term, assertion_terms, symbol_function(EQUAL), UNPROVIDED)) , csome_list_var_$14 = csome_list_var_$14.rest() , v_term = csome_list_var_$14.first()) {
                        }
                    }
                    beyondP = makeBoolean(NIL == missedP);
                    csome_list_var = csome_list_var.rest();
                    term_set = csome_list_var.first();
                } 
            }
        }
        return beyondP;
    }

    public static final SubLObject kbp_link_terms_wXo_referencesP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $kbp_designated_link_references$.getDynamicValue(thread)) {
                {
                    SubLObject foundP = NIL;
                    if (NIL != term.kb_assertionP(link)) {
                        {
                            SubLObject assertion_terms = com.cyc.cycjava.cycl.kb_paths.all_assertion_references(link, UNPROVIDED);
                            if (NIL == foundP) {
                                {
                                    SubLObject csome_list_var = $kbp_designated_link_references$.getDynamicValue(thread);
                                    SubLObject v_term = NIL;
                                    for (v_term = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                        foundP = subl_promotions.memberP(v_term, assertion_terms, symbol_function(EQUAL), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == foundP);
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_link_terms_wXo_referencesP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbp_designated_link_references$.getDynamicValue(thread)) {
            SubLObject foundP = NIL;
            if (NIL != term.kb_assertionP(link)) {
                final SubLObject assertion_terms = all_assertion_references(link, UNPROVIDED);
                if (NIL == foundP) {
                    SubLObject csome_list_var;
                    SubLObject v_term;
                    for (csome_list_var = $kbp_designated_link_references$.getDynamicValue(thread), v_term = NIL, v_term = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = subl_promotions.memberP(v_term, assertion_terms, symbol_function(EQUAL), UNPROVIDED) , csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                    }
                }
            }
            return makeBoolean(NIL == foundP);
        }
        return NIL;
    }

    public static final SubLObject kbp_link_satisfies_external_predP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == fboundp($kbp_external_link_pred$.getDynamicValue(thread))) || (NIL != funcall($kbp_external_link_pred$.getDynamicValue(thread), link)));
        }
    }

    public static SubLObject kbp_link_satisfies_external_predP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == fboundp($kbp_external_link_pred$.getDynamicValue(thread))) || (NIL != funcall($kbp_external_link_pred$.getDynamicValue(thread), link)));
    }

    public static final SubLObject kbp_link_term_beyond_boundP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject beyondP = NIL;
                if (NIL != term.kb_assertionP(link)) {
                    if (NIL == beyondP) {
                        {
                            SubLObject csome_list_var = $kbp_bound_link_terms$.getDynamicValue(thread);
                            SubLObject index = NIL;
                            for (index = csome_list_var.first(); !((NIL != beyondP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , index = csome_list_var.first()) {
                                {
                                    SubLObject terms = com.cyc.cycjava.cycl.kb_paths.assertion_indexed_by(link, index);
                                    if (NIL == beyondP) {
                                        {
                                            SubLObject csome_list_var_14 = terms;
                                            SubLObject v_term = NIL;
                                            for (v_term = csome_list_var_14.first(); !((NIL != beyondP) || (NIL == csome_list_var_14)); csome_list_var_14 = csome_list_var_14.rest() , v_term = csome_list_var_14.first()) {
                                                beyondP = com.cyc.cycjava.cycl.kb_paths.kbp_beyond_isa_boundP(v_term);
                                            }
                                        }
                                    }
                                    if (NIL == beyondP) {
                                        {
                                            SubLObject csome_list_var_15 = terms;
                                            SubLObject v_term = NIL;
                                            for (v_term = csome_list_var_15.first(); !((NIL != beyondP) || (NIL == csome_list_var_15)); csome_list_var_15 = csome_list_var_15.rest() , v_term = csome_list_var_15.first()) {
                                                beyondP = com.cyc.cycjava.cycl.kb_paths.kbp_beyond_genl_boundP(v_term);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return beyondP;
            }
        }
    }

    public static SubLObject kbp_link_term_beyond_boundP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject beyondP = NIL;
        if ((NIL != term.kb_assertionP(link)) && (NIL == beyondP)) {
            SubLObject csome_list_var = $kbp_bound_link_terms$.getDynamicValue(thread);
            SubLObject index = NIL;
            index = csome_list_var.first();
            while ((NIL == beyondP) && (NIL != csome_list_var)) {
                final SubLObject terms = assertion_indexed_by(link, index);
                if (NIL == beyondP) {
                    SubLObject csome_list_var_$15;
                    SubLObject v_term;
                    for (csome_list_var_$15 = terms, v_term = NIL, v_term = csome_list_var_$15.first(); (NIL == beyondP) && (NIL != csome_list_var_$15); beyondP = kbp_beyond_isa_boundP(v_term) , csome_list_var_$15 = csome_list_var_$15.rest() , v_term = csome_list_var_$15.first()) {
                    }
                }
                if (NIL == beyondP) {
                    SubLObject v_term;
                    SubLObject csome_list_var_$16;
                    for (csome_list_var_$16 = terms, v_term = NIL, v_term = csome_list_var_$16.first(); (NIL == beyondP) && (NIL != csome_list_var_$16); beyondP = kbp_beyond_genl_boundP(v_term) , csome_list_var_$16 = csome_list_var_$16.rest() , v_term = csome_list_var_$16.first()) {
                    }
                }
                csome_list_var = csome_list_var.rest();
                index = csome_list_var.first();
            } 
        }
        return beyondP;
    }

    public static final SubLObject kbp_link_wXo_max_mtP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject violationP = NIL;
                if (NIL != term.kb_assertionP(link)) {
                    {
                        SubLObject clause_struc = assertions_low.assertion_clause_struc(link);
                        SubLObject mt = assertions_high.assertion_mt(link);
                        {
                            SubLObject _prev_bind_0 = $kbp_use_max_mtsP$.currentBinding(thread);
                            try {
                                $kbp_use_max_mtsP$.bind(NIL, thread);
                                if (NIL != clause_struc) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = clause_strucs.clause_struc_assertions(clause_struc); !((NIL != violationP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject similar_assertion = rest.first();
                                                if (!link.eql(similar_assertion)) {
                                                    {
                                                        SubLObject other_mt = assertions_high.assertion_mt(similar_assertion);
                                                        if (NIL != mt_relevance_macros.relevant_mtP(other_mt)) {
                                                            if (NIL != genl_mts.genl_mtP(mt, other_mt, UNPROVIDED, UNPROVIDED)) {
                                                                if (NIL == genl_mts.genl_mtP(other_mt, mt, UNPROVIDED, UNPROVIDED)) {
                                                                    violationP = funcall($relevant_linkP$.getDynamicValue(thread), similar_assertion);
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
                                $kbp_use_max_mtsP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return violationP;
            }
        }
    }

    public static SubLObject kbp_link_wXo_max_mtP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violationP = NIL;
        if (NIL != term.kb_assertionP(link)) {
            final SubLObject clause_struc = assertions_low.assertion_clause_struc(link);
            final SubLObject mt = assertions_high.assertion_mt(link);
            final SubLObject _prev_bind_0 = $kbp_use_max_mtsP$.currentBinding(thread);
            try {
                $kbp_use_max_mtsP$.bind(NIL, thread);
                if (NIL != clause_struc) {
                    SubLObject rest;
                    SubLObject similar_assertion;
                    SubLObject other_mt;
                    for (rest = NIL, rest = clause_strucs.clause_struc_assertions(clause_struc); (NIL == violationP) && (NIL != rest); rest = rest.rest()) {
                        similar_assertion = rest.first();
                        if (!link.eql(similar_assertion)) {
                            other_mt = assertions_high.assertion_mt(similar_assertion);
                            if (((NIL != mt_relevance_macros.relevant_mtP(other_mt)) && (NIL != genl_mts.genl_mtP(mt, other_mt, UNPROVIDED, UNPROVIDED))) && (NIL == genl_mts.genl_mtP(other_mt, mt, UNPROVIDED, UNPROVIDED))) {
                                violationP = funcall($relevant_linkP$.getDynamicValue(thread), similar_assertion);
                            }
                        }
                    }
                }
            } finally {
                $kbp_use_max_mtsP$.rebind(_prev_bind_0, thread);
            }
        }
        return violationP;
    }

    public static final SubLObject kbp_bi_scoping_linkP_alt(SubLObject assertion) {
        {
            SubLObject result = com.cyc.cycjava.cycl.kb_paths.kbp_bi_scoping_link_1P(assertion);
            return result;
        }
    }

    public static SubLObject kbp_bi_scoping_linkP(final SubLObject assertion) {
        final SubLObject result = kbp_bi_scoping_link_1P(assertion);
        return result;
    }

    public static final SubLObject kbp_bi_scoping_link_1P_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($search_iteration$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                {
                    SubLObject bi_scopicP = NIL;
                    if (NIL == bi_scopicP) {
                        {
                            SubLObject csome_list_var = cons($kbp_ancestor$.getDynamicValue(thread), com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(assertion, UNPROVIDED));
                            SubLObject node = NIL;
                            for (node = csome_list_var.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                                {
                                    SubLObject scope_direction = com.cyc.cycjava.cycl.kb_paths.scope_direction(assertion, node);
                                    if (NIL != scope_direction) {
                                        if (NIL != remove($kbp_searcher$.getDynamicValue(thread), com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            return T;
                                        } else {
                                            if (NIL == bi_scopicP) {
                                                {
                                                    SubLObject csome_list_var_16 = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(node, UNPROVIDED);
                                                    SubLObject assertion_1 = NIL;
                                                    for (assertion_1 = csome_list_var_16.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var_16)); csome_list_var_16 = csome_list_var_16.rest() , assertion_1 = csome_list_var_16.first()) {
                                                        if (NIL == bi_scopicP) {
                                                            {
                                                                SubLObject csome_list_var_17 = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(assertion_1, UNPROVIDED);
                                                                SubLObject node_1 = NIL;
                                                                for (node_1 = csome_list_var_17.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var_17)); csome_list_var_17 = csome_list_var_17.rest() , node_1 = csome_list_var_17.first()) {
                                                                    {
                                                                        SubLObject scope_direction_1 = com.cyc.cycjava.cycl.kb_paths.scope_direction(assertion_1, node_1);
                                                                        if (NIL != scope_direction_1) {
                                                                            if (scope_direction != scope_direction_1) {
                                                                                return T;
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
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_bi_scoping_link_1P(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($search_iteration$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            final SubLObject bi_scopicP = NIL;
            if (NIL == bi_scopicP) {
                SubLObject csome_list_var = cons($kbp_ancestor$.getDynamicValue(thread), kbp_ancestors_via_all(assertion, UNPROVIDED));
                SubLObject node = NIL;
                node = csome_list_var.first();
                while ((NIL == bi_scopicP) && (NIL != csome_list_var)) {
                    final SubLObject scope_direction = scope_direction(assertion, node);
                    if (NIL != scope_direction) {
                        if (NIL != remove($kbp_searcher$.getDynamicValue(thread), kbp_searched_by(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return T;
                        }
                        if (NIL == bi_scopicP) {
                            SubLObject csome_list_var_$17 = kbp_ancestors_via_all(node, UNPROVIDED);
                            SubLObject assertion_1 = NIL;
                            assertion_1 = csome_list_var_$17.first();
                            while ((NIL == bi_scopicP) && (NIL != csome_list_var_$17)) {
                                if (NIL == bi_scopicP) {
                                    SubLObject csome_list_var_$18 = kbp_ancestors_via_all(assertion_1, UNPROVIDED);
                                    SubLObject node_1 = NIL;
                                    node_1 = csome_list_var_$18.first();
                                    while ((NIL == bi_scopicP) && (NIL != csome_list_var_$18)) {
                                        final SubLObject scope_direction_1 = scope_direction(assertion_1, node_1);
                                        if ((NIL != scope_direction_1) && (!scope_direction.eql(scope_direction_1))) {
                                            return T;
                                        }
                                        csome_list_var_$18 = csome_list_var_$18.rest();
                                        node_1 = csome_list_var_$18.first();
                                    } 
                                }
                                csome_list_var_$17 = csome_list_var_$17.rest();
                                assertion_1 = csome_list_var_$17.first();
                            } 
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    node = csome_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject kbp_bi_scoping_nodeP_alt(SubLObject node) {
        {
            SubLObject result = com.cyc.cycjava.cycl.kb_paths.kbp_bi_scoping_node_1P(node);
            return result;
        }
    }

    public static SubLObject kbp_bi_scoping_nodeP(final SubLObject node) {
        final SubLObject result = kbp_bi_scoping_node_1P(node);
        return result;
    }

    public static final SubLObject kbp_bi_scoping_node_1P_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($search_iteration$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                {
                    SubLObject bi_scopicP = NIL;
                    SubLObject searchers = adjoin($kbp_searcher$.getDynamicValue(thread), com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(node), UNPROVIDED, UNPROVIDED);
                    if (NIL == bi_scopicP) {
                        {
                            SubLObject csome_list_var = cons($kbp_ancestor$.getDynamicValue(thread), com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(node, UNPROVIDED));
                            SubLObject assertion = NIL;
                            for (assertion = csome_list_var.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                                {
                                    SubLObject scope_direction = com.cyc.cycjava.cycl.kb_paths.scope_direction(assertion, node);
                                    if (NIL != scope_direction) {
                                        if (NIL != remove($kbp_searcher$.getDynamicValue(thread), com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            return T;
                                        } else {
                                            if (NIL == bi_scopicP) {
                                                {
                                                    SubLObject csome_list_var_18 = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(assertion, UNPROVIDED);
                                                    SubLObject node_1 = NIL;
                                                    for (node_1 = csome_list_var_18.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var_18)); csome_list_var_18 = csome_list_var_18.rest() , node_1 = csome_list_var_18.first()) {
                                                        if (NIL == bi_scopicP) {
                                                            {
                                                                SubLObject csome_list_var_19 = com.cyc.cycjava.cycl.kb_paths.kbp_ancestors_via_all(node_1, UNPROVIDED);
                                                                SubLObject assertion_1 = NIL;
                                                                for (assertion_1 = csome_list_var_19.first(); !((NIL != bi_scopicP) || (NIL == csome_list_var_19)); csome_list_var_19 = csome_list_var_19.rest() , assertion_1 = csome_list_var_19.first()) {
                                                                    {
                                                                        SubLObject scope_direction_1 = com.cyc.cycjava.cycl.kb_paths.scope_direction(assertion_1, node_1);
                                                                        if (NIL != scope_direction_1) {
                                                                            {
                                                                                SubLObject searchers_1 = com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(assertion_1);
                                                                                if (NIL == list_utilities.singletonP(searchers)) {
                                                                                    return T;
                                                                                } else {
                                                                                    if (scope_direction == scope_direction_1) {
                                                                                        return equal(searchers, searchers_1);
                                                                                    } else {
                                                                                        if (searchers.equal(searchers_1)) {
                                                                                            return T;
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
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_bi_scoping_node_1P(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($search_iteration$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            final SubLObject bi_scopicP = NIL;
            final SubLObject searchers = adjoin($kbp_searcher$.getDynamicValue(thread), kbp_searched_by(node), UNPROVIDED, UNPROVIDED);
            if (NIL == bi_scopicP) {
                SubLObject csome_list_var = cons($kbp_ancestor$.getDynamicValue(thread), kbp_ancestors_via_all(node, UNPROVIDED));
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == bi_scopicP) && (NIL != csome_list_var)) {
                    final SubLObject scope_direction = scope_direction(assertion, node);
                    if (NIL != scope_direction) {
                        if (NIL != remove($kbp_searcher$.getDynamicValue(thread), kbp_searched_by(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            return T;
                        }
                        if (NIL == bi_scopicP) {
                            SubLObject csome_list_var_$19 = kbp_ancestors_via_all(assertion, UNPROVIDED);
                            SubLObject node_1 = NIL;
                            node_1 = csome_list_var_$19.first();
                            while ((NIL == bi_scopicP) && (NIL != csome_list_var_$19)) {
                                if (NIL == bi_scopicP) {
                                    SubLObject csome_list_var_$20 = kbp_ancestors_via_all(node_1, UNPROVIDED);
                                    SubLObject assertion_1 = NIL;
                                    assertion_1 = csome_list_var_$20.first();
                                    while ((NIL == bi_scopicP) && (NIL != csome_list_var_$20)) {
                                        final SubLObject scope_direction_1 = scope_direction(assertion_1, node_1);
                                        if (NIL != scope_direction_1) {
                                            final SubLObject searchers_1 = kbp_searched_by(assertion_1);
                                            if (NIL == list_utilities.singletonP(searchers)) {
                                                return T;
                                            }
                                            if (scope_direction.eql(scope_direction_1)) {
                                                return equal(searchers, searchers_1);
                                            }
                                            if (searchers.equal(searchers_1)) {
                                                return T;
                                            }
                                        }
                                        csome_list_var_$20 = csome_list_var_$20.rest();
                                        assertion_1 = csome_list_var_$20.first();
                                    } 
                                }
                                csome_list_var_$19 = csome_list_var_$19.rest();
                                node_1 = csome_list_var_$19.first();
                            } 
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject scope_direction_alt(SubLObject assertion, SubLObject v_term) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject literal = assertions_high.gaf_formula(assertion);
                SubLObject predicate = literal_predicate(literal, UNPROVIDED);
                SubLObject arg = position(v_term, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pcase_var = predicate;
                if (pcase_var.eql($$genls)) {
                    {
                        SubLObject pcase_var_20 = arg;
                        if (pcase_var_20.eql(ONE_INTEGER)) {
                            return $UP;
                        } else {
                            if (pcase_var_20.eql(TWO_INTEGER)) {
                                return $DOWN;
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($$isa)) {
                        {
                            SubLObject pcase_var_21 = arg;
                            if (pcase_var_21.eql(ONE_INTEGER)) {
                                return $UP;
                            } else {
                                if (pcase_var_21.eql(TWO_INTEGER)) {
                                    return $DOWN;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject scope_direction(final SubLObject assertion, final SubLObject v_term) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject literal = assertions_high.gaf_formula(assertion);
            final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
            final SubLObject arg = position(v_term, literal, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql($$genls)) {
                final SubLObject pcase_var_$21 = arg;
                if (pcase_var_$21.eql(ONE_INTEGER)) {
                    return $UP;
                }
                if (pcase_var_$21.eql(TWO_INTEGER)) {
                    return $DOWN;
                }
            } else
                if (pcase_var.eql($$isa)) {
                    final SubLObject pcase_var_$22 = arg;
                    if (pcase_var_$22.eql(ONE_INTEGER)) {
                        return $UP;
                    }
                    if (pcase_var_$22.eql(TWO_INTEGER)) {
                        return $DOWN;
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject default_relevant_link_treeP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.bookkeeping_btreeP(v_object))) {
                return NIL;
            } else {
                if ((NIL != $kbp_no_instance_linksP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.kb_paths.instance_btreeP(v_object))) {
                    return NIL;
                } else {
                    return T;
                }
            }
        }
    }

    public static SubLObject default_relevant_link_treeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $kbp_no_bookkeeping_linksP$.getDynamicValue(thread)) && (NIL != bookkeeping_btreeP(v_object))) {
            return NIL;
        }
        if ((NIL != $kbp_no_instance_linksP$.getDynamicValue(thread)) && (NIL != instance_btreeP(v_object))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject do_if_term_assertions_alt(SubLObject v_term, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (op == UNPROVIDED) {
            op = $path_link_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(IDENTITY);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = symbol_function(IDENTITY);
        }
        com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(kb_accessors.all_term_assertions(v_term, UNPROVIDED), op, do_opP, climb_treeP, symbol_function(IDENTITY), NIL);
        return v_term;
    }

    public static SubLObject do_if_term_assertions(final SubLObject v_term, SubLObject op, SubLObject do_opP, SubLObject climb_treeP) {
        if (op == UNPROVIDED) {
            op = $path_link_op$.getDynamicValue();
        }
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(IDENTITY);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = symbol_function(IDENTITY);
        }
        obsolete_tree_do_if(kb_accessors.all_term_assertions(v_term, UNPROVIDED), op, do_opP, climb_treeP, symbol_function(IDENTITY), NIL);
        return v_term;
    }

    /**
     * Soon to be replaced
     */
    @LispMethod(comment = "Soon to be replaced")
    public static final SubLObject obsolete_tree_do_if_alt(SubLObject v_object, SubLObject op, SubLObject do_opP, SubLObject climb_treeP, SubLObject key, SubLObject subs_tooP) {
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(ASSERTION_P);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = symbol_function(IDENTITY);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $kbp_quitP$.getDynamicValue(thread)) {
                if (NIL != funcall(do_opP, funcall(key, v_object))) {
                    funcall(op, v_object);
                    if (NIL == subs_tooP) {
                        if (((NIL != $kbp_explode_natsP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(v_object))) && (NIL != function_terms.tou_assertionP(v_object))) {
                            {
                                SubLObject _prev_bind_0 = $kbp_explode_natsP$.currentBinding(thread);
                                try {
                                    $kbp_explode_natsP$.bind(NIL, thread);
                                    {
                                        SubLObject node = assertions_high.gaf_arg1(v_object);
                                        if (NIL != funcall($relevant_nodeP$.getDynamicValue(thread), node)) {
                                            com.cyc.cycjava.cycl.kb_paths.do_if_term_assertions(node, op, do_opP, climb_treeP);
                                        }
                                    }
                                } finally {
                                    $kbp_explode_natsP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        return NIL;
                    }
                }
                if (v_object.isCons()) {
                    {
                        SubLObject list = NIL;
                        SubLObject sub = NIL;
                        for (list = v_object, sub = list.first(); list.rest().isCons(); list = list.rest() , sub = list.first()) {
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(sub, op, do_opP, climb_treeP, key, subs_tooP);
                        }
                        com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(list.first(), op, do_opP, climb_treeP, key, subs_tooP);
                        if (NIL != list.rest()) {
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(list.rest(), op, do_opP, climb_treeP, key, subs_tooP);
                        }
                    }
                } else {
                    if (NIL != binary_tree.btree_p(v_object)) {
                        com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(binary_tree.bt_lower(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(binary_tree.bt_higher(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        if (NIL != funcall(climb_treeP, v_object)) {
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(binary_tree.bt_tag(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(binary_tree.bt_state(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        }
                    } else {
                        if (NIL != assertion_handles.assertion_p(v_object)) {
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(assertions_low.assertion_formula_data(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(assertions_high.assertion_mt(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                            com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(assertions_high.assertion_variable_names(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        } else {
                            if (NIL != clause_strucs.clause_struc_p(v_object)) {
                                com.cyc.cycjava.cycl.kb_paths.obsolete_tree_do_if(clause_strucs.clause_struc_cnf(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Soon to be replaced
     */
    @LispMethod(comment = "Soon to be replaced")
    public static SubLObject obsolete_tree_do_if(final SubLObject v_object, final SubLObject op, SubLObject do_opP, SubLObject climb_treeP, SubLObject key, SubLObject subs_tooP) {
        if (do_opP == UNPROVIDED) {
            do_opP = symbol_function(ASSERTION_P);
        }
        if (climb_treeP == UNPROVIDED) {
            climb_treeP = symbol_function(IDENTITY);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (subs_tooP == UNPROVIDED) {
            subs_tooP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $kbp_quitP$.getDynamicValue(thread)) {
            if (NIL != funcall(do_opP, funcall(key, v_object))) {
                funcall(op, v_object);
                if (NIL == subs_tooP) {
                    if (((NIL != $kbp_explode_natsP$.getDynamicValue(thread)) && (NIL != assertion_handles.assertion_p(v_object))) && (NIL != function_terms.tou_assertionP(v_object))) {
                        final SubLObject _prev_bind_0 = $kbp_explode_natsP$.currentBinding(thread);
                        try {
                            $kbp_explode_natsP$.bind(NIL, thread);
                            final SubLObject node = assertions_high.gaf_arg1(v_object);
                            if (NIL != funcall($relevant_nodeP$.getDynamicValue(thread), node)) {
                                do_if_term_assertions(node, op, do_opP, climb_treeP);
                            }
                        } finally {
                            $kbp_explode_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return NIL;
                }
            }
            if (v_object.isCons()) {
                SubLObject list = NIL;
                SubLObject sub = NIL;
                list = v_object;
                sub = list.first();
                while (list.rest().isCons()) {
                    obsolete_tree_do_if(sub, op, do_opP, climb_treeP, key, subs_tooP);
                    list = list.rest();
                    sub = list.first();
                } 
                obsolete_tree_do_if(list.first(), op, do_opP, climb_treeP, key, subs_tooP);
                if (NIL != list.rest()) {
                    obsolete_tree_do_if(list.rest(), op, do_opP, climb_treeP, key, subs_tooP);
                }
            } else
                if (NIL != binary_tree.btree_p(v_object)) {
                    obsolete_tree_do_if(binary_tree.bt_lower(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                    obsolete_tree_do_if(binary_tree.bt_higher(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                    if (NIL != funcall(climb_treeP, v_object)) {
                        obsolete_tree_do_if(binary_tree.bt_tag(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        obsolete_tree_do_if(binary_tree.bt_state(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                    }
                } else
                    if (NIL != assertion_handles.assertion_p(v_object)) {
                        obsolete_tree_do_if(assertions_low.assertion_formula_data(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        obsolete_tree_do_if(assertions_high.assertion_mt(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        obsolete_tree_do_if(assertions_high.assertion_variable_names(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                    } else
                        if (NIL != clause_strucs.clause_struc_p(v_object)) {
                            obsolete_tree_do_if(clause_strucs.clause_struc_cnf(v_object), op, do_opP, climb_treeP, key, subs_tooP);
                        }



        }
        return NIL;
    }

    public static final SubLObject assertion_indexed_by_alt(SubLObject assertion, SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject neg_pairs = kb_indexing.determine_rule_indices(assertions_high.assertion_cnf(assertion));
                SubLObject pos_pairs = thread.secondMultipleValue();
                SubLObject other = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = index;
                    if (pcase_var.eql($NEG)) {
                        return Mapping.mapcar(symbol_function(SECOND), neg_pairs);
                    } else {
                        if (pcase_var.eql($POS)) {
                            return Mapping.mapcar(symbol_function(SECOND), pos_pairs);
                        } else {
                            if (pcase_var.eql($OTHER)) {
                                return other;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject assertion_indexed_by(final SubLObject assertion, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject neg_pairs = kb_indexing.determine_rule_indices(assertions_high.assertion_cnf(assertion));
        final SubLObject pos_pairs = thread.secondMultipleValue();
        final SubLObject other = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (index.eql($NEG)) {
            return Mapping.mapcar(symbol_function(SECOND), neg_pairs);
        }
        if (index.eql($POS)) {
            return Mapping.mapcar(symbol_function(SECOND), pos_pairs);
        }
        if (index.eql($OTHER)) {
            return other;
        }
        return NIL;
    }

    public static final SubLObject all_assertion_terms_alt(SubLObject assertion, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject terms = NIL;
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            {
                SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_22 = cycl_utilities.all_literal_terms(literal, UNPROVIDED);
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , v_term = cdolist_list_var_22.first()) {
                            {
                                SubLObject item_var = v_term;
                                if (NIL == member(item_var, terms, test, symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_23 = cycl_utilities.all_literal_terms(literal, UNPROVIDED);
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , v_term = cdolist_list_var_23.first()) {
                            {
                                SubLObject item_var = v_term;
                                if (NIL == member(item_var, terms, test, symbol_function(IDENTITY))) {
                                    terms = cons(item_var, terms);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != forts.fort_p(v_term)) {
                        {
                            SubLObject nat = function_terms.term_of_unit(v_term);
                            SubLObject cdolist_list_var_24 = cycl_utilities.nat_args(nat, UNPROVIDED);
                            SubLObject nat_term = NIL;
                            for (nat_term = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , nat_term = cdolist_list_var_24.first()) {
                                {
                                    SubLObject item_var = nat_term;
                                    if (NIL == member(item_var, terms, test, symbol_function(IDENTITY))) {
                                        terms = cons(item_var, terms);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return terms;
        }
    }

    public static SubLObject all_assertion_terms(final SubLObject assertion, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject terms = NIL;
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$23 = cycl_utilities.all_literal_terms(literal, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$23.first();
            while (NIL != cdolist_list_var_$23) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, terms, test, symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                v_term = cdolist_list_var_$23.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.neg_lits(cnf);
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = cycl_utilities.all_literal_terms(literal, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                final SubLObject item_var = v_term;
                if (NIL == member(item_var, terms, test, symbol_function(IDENTITY))) {
                    terms = cons(item_var, terms);
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                v_term = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = terms;
        SubLObject v_term2 = NIL;
        v_term2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(v_term2)) {
                final SubLObject nat = function_terms.term_of_unit(v_term2);
                SubLObject cdolist_list_var_$25 = cycl_utilities.nat_args(nat, UNPROVIDED);
                SubLObject nat_term = NIL;
                nat_term = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    final SubLObject item_var2 = nat_term;
                    if (NIL == member(item_var2, terms, test, symbol_function(IDENTITY))) {
                        terms = cons(item_var2, terms);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    nat_term = cdolist_list_var_$25.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term2 = cdolist_list_var.first();
        } 
        return terms;
    }

    public static final SubLObject all_assertion_references_alt(SubLObject assertion, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return remove_duplicates(list_utilities.flatten(fi.assertion_fi_formula(assertion, UNPROVIDED)), test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_assertion_references(final SubLObject assertion, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return remove_duplicates(list_utilities.flatten(fi.assertion_fi_formula(assertion, UNPROVIDED)), test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_kb_paths_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $kbp_quitP$.setDynamicValue(NIL, thread);
            $kbp_stats$.setDynamicValue(NIL, thread);
            $kbp_common_nodes$.setDynamicValue(NIL, thread);
            $kbp_run_time$.setDynamicValue(NIL, thread);
            clrhash($kbp_ancestor_hash$.getDynamicValue(thread));
            clrhash($kbp_search_hash$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_kb_paths() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kbp_quitP$.setDynamicValue(NIL, thread);
        $kbp_stats$.setDynamicValue(NIL, thread);
        $kbp_common_nodes$.setDynamicValue(NIL, thread);
        $kbp_run_time$.setDynamicValue(NIL, thread);
        clrhash($kbp_ancestor_hash$.getDynamicValue(thread));
        clrhash($kbp_search_hash$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject kbp_stats_alt(SubLObject v_kb_paths) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $kbp_stats$.setDynamicValue(list(new SubLObject[]{ $kbp_result_format$.getDynamicValue(thread), length(v_kb_paths), $DEPTH, NIL != v_kb_paths ? ((SubLObject) (number_utilities.float_n(divide(com.cyc.cycjava.cycl.kb_paths.paths_link_count(v_kb_paths), length(v_kb_paths)), ONE_INTEGER))) : NIL, $ITERATIONS, $search_iteration$.getDynamicValue(thread), $TERMS, $kbp_term_count$.getDynamicValue(thread), $NODES, $kbp_node_count$.getDynamicValue(thread), $LINKS, $kbp_link_count$.getDynamicValue(thread), $BRANCH, $kbp_node_count$.getDynamicValue(thread).numG(ZERO_INTEGER) ? ((SubLObject) (number_utilities.float_n(divide($kbp_link_count$.getDynamicValue(thread), $kbp_node_count$.getDynamicValue(thread)), ONE_INTEGER))) : NIL, $TIME, $kbp_run_time$.getDynamicValue(thread).isNumber() ? ((SubLObject) (number_utilities.float_n($kbp_run_time$.getDynamicValue(thread), ONE_INTEGER))) : NIL, $TERMINATION, $kbp_quitP$.getDynamicValue(thread) }), thread);
            return $kbp_stats$.getDynamicValue(thread);
        }
    }

    public static SubLObject kbp_stats(final SubLObject v_kb_paths) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kbp_stats$.setDynamicValue(list(new SubLObject[]{ $kbp_result_format$.getDynamicValue(thread), length(v_kb_paths), $DEPTH, NIL != v_kb_paths ? number_utilities.float_n(divide(paths_link_count(v_kb_paths), length(v_kb_paths)), ONE_INTEGER) : NIL, $ITERATIONS, $search_iteration$.getDynamicValue(thread), $TERMS, $kbp_term_count$.getDynamicValue(thread), $NODES, $kbp_node_count$.getDynamicValue(thread), $LINKS, $kbp_link_count$.getDynamicValue(thread), $BRANCH, $kbp_node_count$.getDynamicValue(thread).numG(ZERO_INTEGER) ? number_utilities.float_n(divide($kbp_link_count$.getDynamicValue(thread), $kbp_node_count$.getDynamicValue(thread)), ONE_INTEGER) : NIL, $TIME, $kbp_run_time$.getDynamicValue(thread).isNumber() ? number_utilities.float_n($kbp_run_time$.getDynamicValue(thread), ONE_INTEGER) : NIL, $TERMINATION, $kbp_quitP$.getDynamicValue(thread) }), thread);
        return $kbp_stats$.getDynamicValue(thread);
    }

    public static final SubLObject kbp_node_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.kb_paths.kbp_searched_object_count($kbp_nodeP$.getDynamicValue(thread));
        }
    }

    public static SubLObject kbp_node_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_searched_object_count($kbp_nodeP$.getDynamicValue(thread));
    }

    public static final SubLObject kbp_link_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return com.cyc.cycjava.cycl.kb_paths.kbp_searched_object_count($kbp_linkP$.getDynamicValue(thread));
        }
    }

    public static SubLObject kbp_link_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kbp_searched_object_count($kbp_linkP$.getDynamicValue(thread));
    }

    public static final SubLObject kbp_searched_object_count_alt(SubLObject fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
                SubLObject key = NIL;
                SubLObject val = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            val = getEntryValue(cdohash_entry);
                            if (NIL != funcall(fn, key)) {
                                count = add(count, ONE_INTEGER);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject kbp_searched_object_count(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (NIL != funcall(fn, key)) {
                    count = add(count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }

    public static final SubLObject next_iteration_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $search_iteration$.setDynamicValue(add($search_iteration$.getDynamicValue(thread), ONE_INTEGER), thread);
            note_percent_progress($search_iteration$.getDynamicValue(thread), $max_search_iterations$.getDynamicValue(thread));
            return $search_iteration$.getDynamicValue(thread);
        }
    }

    public static SubLObject next_iteration() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $search_iteration$.setDynamicValue(add($search_iteration$.getDynamicValue(thread), ONE_INTEGER), thread);
        note_percent_progress($search_iteration$.getDynamicValue(thread), $max_search_iterations$.getDynamicValue(thread));
        return $search_iteration$.getDynamicValue(thread);
    }

    public static final SubLObject kbp_give_upP_alt(SubLObject v_iteration, SubLObject horizon1, SubLObject horizon2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $kbp_quitP$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_exhaustedP(horizon1, horizon2)) {
                    $kbp_quitP$.setDynamicValue($EXHAUST, thread);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_iteration_bound_metP(v_iteration)) {
                        $kbp_quitP$.setDynamicValue($ITERATION_BOUND, thread);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.kb_paths.kbp_term_bound_metP()) {
                            $kbp_quitP$.setDynamicValue($TERM_BOUND, thread);
                        }
                    }
                }
            }
            return $kbp_quitP$.getDynamicValue(thread);
        }
    }

    public static SubLObject kbp_give_upP(final SubLObject v_iteration, final SubLObject horizon1, final SubLObject horizon2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $kbp_quitP$.getDynamicValue(thread)) {
            if (NIL != kbp_exhaustedP(horizon1, horizon2)) {
                $kbp_quitP$.setDynamicValue($EXHAUST, thread);
            } else
                if (NIL != kbp_iteration_bound_metP(v_iteration)) {
                    $kbp_quitP$.setDynamicValue($ITERATION_BOUND, thread);
                } else
                    if (NIL != kbp_term_bound_metP()) {
                        $kbp_quitP$.setDynamicValue($TERM_BOUND, thread);
                    }


        }
        return $kbp_quitP$.getDynamicValue(thread);
    }

    public static final SubLObject kbp_exhaustedP_alt(SubLObject horizon1, SubLObject horizon2) {
        return makeBoolean((NIL == horizon1) && (NIL == horizon2));
    }

    public static SubLObject kbp_exhaustedP(final SubLObject horizon1, final SubLObject horizon2) {
        return makeBoolean((NIL == horizon1) && (NIL == horizon2));
    }

    public static final SubLObject kbp_iteration_bound_metP_alt(SubLObject v_iteration) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_iteration.isNumber() && $max_search_iterations$.getDynamicValue(thread).isNumber()) {
                return numGE(v_iteration, $max_search_iterations$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject kbp_iteration_bound_metP(final SubLObject v_iteration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_iteration.isNumber() && $max_search_iterations$.getDynamicValue(thread).isNumber()) {
            return numGE(v_iteration, $max_search_iterations$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject kbp_term_bound_metP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($kbp_term_count$.getDynamicValue(thread).isNumber() && $kbp_max_term_count$.getDynamicValue(thread).isNumber()) {
                return numGE($kbp_term_count$.getDynamicValue(thread), $kbp_max_term_count$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static SubLObject kbp_term_bound_metP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($kbp_term_count$.getDynamicValue(thread).isNumber() && $kbp_max_term_count$.getDynamicValue(thread).isNumber()) {
            return numGE($kbp_term_count$.getDynamicValue(thread), $kbp_max_term_count$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject paths_link_count_alt(SubLObject paths) {
        {
            SubLObject n = ZERO_INTEGER;
            SubLObject cdolist_list_var = list_utilities.flatten(paths);
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL != assertion_handles.assertion_p(element)) {
                    n = add(n, ONE_INTEGER);
                }
            }
            return n;
        }
    }

    public static SubLObject paths_link_count(final SubLObject paths) {
        SubLObject n = ZERO_INTEGER;
        SubLObject cdolist_list_var = list_utilities.flatten(paths);
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(element)) {
                n = add(n, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return n;
    }

    public static final SubLObject kbp_searcherP_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(fort, $kbp_searchers$.getDynamicValue(thread), symbol_function($sym143$EQUAL_NODES_), UNPROVIDED);
        }
    }

    public static SubLObject kbp_searcherP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, $kbp_searchers$.getDynamicValue(thread), symbol_function($sym143$EQUAL_NODES_), UNPROVIDED);
    }

    public static final SubLObject equal_nodesP_alt(SubLObject node1, SubLObject node2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $node_equalP$.getDynamicValue();
        }
        return funcall(test, node1, node2);
    }

    public static SubLObject equal_nodesP(final SubLObject node1, final SubLObject node2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $node_equalP$.getDynamicValue();
        }
        return funcall(test, node1, node2);
    }

    public static final SubLObject instance_btreeP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != binary_tree.btree_p(v_object)) && ($term_arg$.getDynamicValue(thread) == TWO_INTEGER)) && (binary_tree.bt_tag(v_object) == $$isa));
        }
    }

    public static SubLObject instance_btreeP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != binary_tree.btree_p(v_object)) && $term_arg$.getDynamicValue(thread).eql(TWO_INTEGER)) && binary_tree.bt_tag(v_object).eql($$isa));
    }

    public static final SubLObject bookkeeping_btreeP_alt(SubLObject v_object) {
        return makeBoolean((NIL != binary_tree.btree_p(v_object)) && (NIL != fort_types_interface.bookkeeping_predicate_p(binary_tree.bt_tag(v_object))));
    }

    public static SubLObject bookkeeping_btreeP(final SubLObject v_object) {
        return makeBoolean((NIL != binary_tree.btree_p(v_object)) && (NIL != fort_types_interface.bookkeeping_predicate_p(binary_tree.bt_tag(v_object))));
    }

    public static final SubLObject kbp_record_ancestor_alt(SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.pushnew_hash(list(v_object, searcher), ancestor, $kbp_ancestor_hash$.getDynamicValue(thread), test);
            return NIL;
        }
    }

    public static SubLObject kbp_record_ancestor(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.pushnew_hash(list(v_object, searcher), ancestor, $kbp_ancestor_hash$.getDynamicValue(thread), test);
        return NIL;
    }

    public static final SubLObject kbp_ancestors_alt(SubLObject v_object, SubLObject searcher) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(list(v_object, searcher), $kbp_ancestor_hash$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject kbp_ancestors(final SubLObject v_object, SubLObject searcher) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(list(v_object, searcher), $kbp_ancestor_hash$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject kbp_ancestors_via_all_alt(SubLObject v_object, SubLObject searchers) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        {
            SubLObject ancestors = NIL;
            SubLObject cdolist_list_var = searchers;
            SubLObject searcher = NIL;
            for (searcher = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , searcher = cdolist_list_var.first()) {
                ancestors = nunion(ancestors, copy_list(com.cyc.cycjava.cycl.kb_paths.kbp_ancestors(v_object, searcher)), UNPROVIDED, UNPROVIDED);
            }
            return ancestors;
        }
    }

    public static SubLObject kbp_ancestors_via_all(final SubLObject v_object, SubLObject searchers) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        SubLObject ancestors = NIL;
        SubLObject cdolist_list_var = searchers;
        SubLObject searcher = NIL;
        searcher = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ancestors = nunion(ancestors, copy_list(kbp_ancestors(v_object, searcher)), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            searcher = cdolist_list_var.first();
        } 
        return ancestors;
    }

    public static final SubLObject kbp_ancestorP_alt(SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return subl_promotions.memberP(ancestor, com.cyc.cycjava.cycl.kb_paths.kbp_ancestors(v_object, searcher), test, UNPROVIDED);
    }

    public static SubLObject kbp_ancestorP(final SubLObject v_object, SubLObject searcher, SubLObject ancestor, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return subl_promotions.memberP(ancestor, kbp_ancestors(v_object, searcher), test, UNPROVIDED);
    }

    public static final SubLObject kbp_ancestor_via_anyP_alt(SubLObject v_object, SubLObject searchers, SubLObject ancestor, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            SubLObject ancestorP = NIL;
            if (NIL == ancestorP) {
                {
                    SubLObject csome_list_var = searchers;
                    SubLObject searcher = NIL;
                    for (searcher = csome_list_var.first(); !((NIL != ancestorP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
                        ancestorP = com.cyc.cycjava.cycl.kb_paths.kbp_ancestorP(v_object, searcher, ancestor, test);
                    }
                }
            }
            return ancestorP;
        }
    }

    public static SubLObject kbp_ancestor_via_anyP(final SubLObject v_object, SubLObject searchers, SubLObject ancestor, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (ancestor == UNPROVIDED) {
            ancestor = $kbp_ancestor$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        SubLObject ancestorP = NIL;
        if (NIL == ancestorP) {
            SubLObject csome_list_var;
            SubLObject searcher;
            for (csome_list_var = searchers, searcher = NIL, searcher = csome_list_var.first(); (NIL == ancestorP) && (NIL != csome_list_var); ancestorP = kbp_ancestorP(v_object, searcher, ancestor, test) , csome_list_var = csome_list_var.rest() , searcher = csome_list_var.first()) {
            }
        }
        return ancestorP;
    }

    public static final SubLObject kbp_searchedP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(v_object, $kbp_search_hash$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject kbp_searchedP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(v_object, $kbp_search_hash$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject kbp_searched_byP_alt(SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return subl_promotions.memberP(searcher, com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(v_object), test, UNPROVIDED);
    }

    public static SubLObject kbp_searched_byP(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return subl_promotions.memberP(searcher, kbp_searched_by(v_object), test, UNPROVIDED);
    }

    public static final SubLObject kbp_searched_by_allP_alt(SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return subsetp(searchers, com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(v_object), test, UNPROVIDED);
    }

    public static SubLObject kbp_searched_by_allP(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return subsetp(searchers, kbp_searched_by(v_object), test, UNPROVIDED);
    }

    public static final SubLObject kbp_searched_by_anyP_alt(SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.intersectP(com.cyc.cycjava.cycl.kb_paths.kbp_searched_by(v_object), searchers, test, UNPROVIDED);
    }

    public static SubLObject kbp_searched_by_anyP(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return list_utilities.intersectP(kbp_searched_by(v_object), searchers, test, UNPROVIDED);
    }

    public static final SubLObject kbp_searched_by_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(v_object, $kbp_search_hash$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject kbp_searched_by(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(v_object, $kbp_search_hash$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject kbp_all_searched_by_alt(SubLObject searcher) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
                SubLObject v_object = NIL;
                SubLObject searched_by_list = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            v_object = getEntryKey(cdohash_entry);
                            searched_by_list = getEntryValue(cdohash_entry);
                            if (NIL != subl_promotions.memberP(searcher, searched_by_list, UNPROVIDED, UNPROVIDED)) {
                                result = cons(v_object, result);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject kbp_all_searched_by(SubLObject searcher) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
        SubLObject v_object = NIL;
        SubLObject searched_by_list = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                v_object = getEntryKey(cdohash_entry);
                searched_by_list = getEntryValue(cdohash_entry);
                if (NIL != subl_promotions.memberP(searcher, searched_by_list, UNPROVIDED, UNPROVIDED)) {
                    result = cons(v_object, result);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }

    public static final SubLObject kbp_mark_as_searched_by_alt(SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.pushnew_hash(v_object, searcher, $kbp_search_hash$.getDynamicValue(thread), test);
            return NIL;
        }
    }

    public static SubLObject kbp_mark_as_searched_by(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.pushnew_hash(v_object, searcher, $kbp_search_hash$.getDynamicValue(thread), test);
        return NIL;
    }

    public static final SubLObject kbp_mark_as_unsearched_by_alt(SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.delete_hash(v_object, searcher, $kbp_search_hash$.getDynamicValue(thread), test, UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject kbp_mark_as_unsearched_by(final SubLObject v_object, SubLObject searcher, SubLObject test) {
        if (searcher == UNPROVIDED) {
            searcher = $kbp_searcher$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.delete_hash(v_object, searcher, $kbp_search_hash$.getDynamicValue(thread), test, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject kbp_mark_as_searched_by_all_alt(SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.nunion_hash(v_object, copy_list(searchers), $kbp_search_hash$.getDynamicValue(thread), test);
            return NIL;
        }
    }

    public static SubLObject kbp_mark_as_searched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.nunion_hash(v_object, copy_list(searchers), $kbp_search_hash$.getDynamicValue(thread), test);
        return NIL;
    }

    public static final SubLObject kbp_mark_as_unsearched_by_all_alt(SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            hash_table_utilities.nset_difference_hash(v_object, searchers, $kbp_search_hash$.getDynamicValue(thread), test);
            return NIL;
        }
    }

    public static SubLObject kbp_mark_as_unsearched_by_all(final SubLObject v_object, SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        hash_table_utilities.nset_difference_hash(v_object, searchers, $kbp_search_hash$.getDynamicValue(thread), test);
        return NIL;
    }

    public static final SubLObject kbp_mark_all_as_unsearched_alt(SubLObject objects) {
        {
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.kb_paths.kbp_mark_as_unsearched(v_object);
            }
        }
        return NIL;
    }

    public static SubLObject kbp_mark_all_as_unsearched(final SubLObject objects) {
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            kbp_mark_as_unsearched(v_object);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject kbp_mark_as_unsearched_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(v_object, $kbp_search_hash$.getDynamicValue(thread), NIL);
            return NIL;
        }
    }

    public static SubLObject kbp_mark_as_unsearched(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(v_object, $kbp_search_hash$.getDynamicValue(thread), NIL);
        return NIL;
    }

    public static final SubLObject kbp_all_searched_by_all_alt(SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
                SubLObject v_object = NIL;
                SubLObject searched_by = NIL;
                {
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            v_object = getEntryKey(cdohash_entry);
                            searched_by = getEntryValue(cdohash_entry);
                            if (NIL != subsetp(searchers, searched_by, test, UNPROVIDED)) {
                                result = cons(v_object, result);
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject kbp_all_searched_by_all(SubLObject searchers, SubLObject test) {
        if (searchers == UNPROVIDED) {
            searchers = $kbp_searchers$.getDynamicValue();
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject cdohash_table = $kbp_search_hash$.getDynamicValue(thread);
        SubLObject v_object = NIL;
        SubLObject searched_by = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                v_object = getEntryKey(cdohash_entry);
                searched_by = getEntryValue(cdohash_entry);
                if (NIL != subsetp(searchers, searched_by, test, UNPROVIDED)) {
                    result = cons(v_object, result);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return result;
    }

    public static final SubLObject bookkeeping_gaf_assertionP_alt(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return fort_types_interface.bookkeeping_predicate_p(literal_predicate(assertions_high.gaf_formula(assertion), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject bookkeeping_gaf_assertionP(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return fort_types_interface.bookkeeping_predicate_p(literal_predicate(assertions_high.gaf_formula(assertion), UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject kbp_excluded_nodeP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(node, $exclude_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kbp_excluded_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(node, $exclude_nodes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_excluded_linkP_alt(SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(link, $exclude_links$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kbp_excluded_linkP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(link, $exclude_links$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbp_paths_links_alt(SubLObject paths) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = paths;
            SubLObject path = NIL;
            for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                {
                    SubLObject item_var = com.cyc.cycjava.cycl.kb_paths.kbp_path_links(path);
                    if (NIL == member(item_var, result, symbol_function($sym144$ASSERTIONS_FI_EQUAL_), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject kbp_paths_links(final SubLObject paths) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = NIL;
        path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = kbp_path_links(path);
            if (NIL == member(item_var, result, symbol_function($sym144$ASSERTIONS_FI_EQUAL_), symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject kbp_path_links_alt(SubLObject path) {
        if (path.isCons()) {
            {
                SubLObject datum = path;
                SubLObject current = datum;
                SubLObject node = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt145);
                node = current.first();
                current = current.rest();
                {
                    SubLObject link_path = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt145);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != link_path) {
                            {
                                SubLObject datum_25 = link_path;
                                SubLObject current_26 = datum_25;
                                SubLObject link = NIL;
                                SubLObject node_path = NIL;
                                destructuring_bind_must_consp(current_26, datum_25, $list_alt146);
                                link = current_26.first();
                                current_26 = current_26.rest();
                                destructuring_bind_must_consp(current_26, datum_25, $list_alt146);
                                node_path = current_26.first();
                                current_26 = current_26.rest();
                                if (NIL == current_26) {
                                    return cons(link, com.cyc.cycjava.cycl.kb_paths.kbp_path_links(node_path));
                                } else {
                                    cdestructuring_bind_error(datum_25, $list_alt146);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt145);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject kbp_path_links(final SubLObject path) {
        if (path.isCons()) {
            SubLObject node = NIL;
            destructuring_bind_must_consp(path, path, $list145);
            node = path.first();
            SubLObject current = path.rest();
            final SubLObject link_path = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, path, $list145);
            current = current.rest();
            if (NIL == current) {
                if (NIL != link_path) {
                    SubLObject current_$27;
                    final SubLObject datum_$26 = current_$27 = link_path;
                    SubLObject link = NIL;
                    SubLObject node_path = NIL;
                    destructuring_bind_must_consp(current_$27, datum_$26, $list146);
                    link = current_$27.first();
                    current_$27 = current_$27.rest();
                    destructuring_bind_must_consp(current_$27, datum_$26, $list146);
                    node_path = current_$27.first();
                    current_$27 = current_$27.rest();
                    if (NIL == current_$27) {
                        return cons(link, kbp_path_links(node_path));
                    }
                    cdestructuring_bind_error(datum_$26, $list146);
                }
            } else {
                cdestructuring_bind_error(path, $list145);
            }
        }
        return NIL;
    }

    public static final SubLObject kbp_paths_tuples_alt(SubLObject paths) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = paths;
            SubLObject path = NIL;
            for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                {
                    SubLObject item_var = com.cyc.cycjava.cycl.kb_paths.kbp_path_tuples(path);
                    if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject kbp_paths_tuples(final SubLObject paths) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = paths;
        SubLObject path = NIL;
        path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = kbp_path_tuples(path);
            if (NIL == member(item_var, result, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject kbp_path_tuples_alt(SubLObject path) {
        if (path.isCons()) {
            {
                SubLObject datum = path;
                SubLObject current = datum;
                SubLObject node_1 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt147);
                node_1 = current.first();
                current = current.rest();
                {
                    SubLObject link_path_1 = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt147);
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != link_path_1) {
                            {
                                SubLObject datum_27 = link_path_1;
                                SubLObject current_28 = datum_27;
                                SubLObject link_1 = NIL;
                                SubLObject node_path_1 = NIL;
                                destructuring_bind_must_consp(current_28, datum_27, $list_alt148);
                                link_1 = current_28.first();
                                current_28 = current_28.rest();
                                destructuring_bind_must_consp(current_28, datum_27, $list_alt148);
                                node_path_1 = current_28.first();
                                current_28 = current_28.rest();
                                if (NIL == current_28) {
                                    if (NIL != node_path_1) {
                                        {
                                            SubLObject datum_29 = node_path_1;
                                            SubLObject current_30 = datum_29;
                                            SubLObject node_2 = NIL;
                                            destructuring_bind_must_consp(current_30, datum_29, $list_alt149);
                                            node_2 = current_30.first();
                                            current_30 = current_30.rest();
                                            {
                                                SubLObject link_path_2 = (current_30.isCons()) ? ((SubLObject) (current_30.first())) : NIL;
                                                destructuring_bind_must_listp(current_30, datum_29, $list_alt149);
                                                current_30 = current_30.rest();
                                                if (NIL == current_30) {
                                                    return cons(list(node_1, node_2, link_1), com.cyc.cycjava.cycl.kb_paths.kbp_path_tuples(node_path_1));
                                                } else {
                                                    cdestructuring_bind_error(datum_29, $list_alt149);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_27, $list_alt148);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt147);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject kbp_path_tuples(final SubLObject path) {
        if (path.isCons()) {
            SubLObject node_1 = NIL;
            destructuring_bind_must_consp(path, path, $list147);
            node_1 = path.first();
            SubLObject current = path.rest();
            final SubLObject link_path_1 = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, path, $list147);
            current = current.rest();
            if (NIL == current) {
                if (NIL != link_path_1) {
                    SubLObject current_$29;
                    final SubLObject datum_$28 = current_$29 = link_path_1;
                    SubLObject link_1 = NIL;
                    SubLObject node_path_1 = NIL;
                    destructuring_bind_must_consp(current_$29, datum_$28, $list148);
                    link_1 = current_$29.first();
                    current_$29 = current_$29.rest();
                    destructuring_bind_must_consp(current_$29, datum_$28, $list148);
                    node_path_1 = current_$29.first();
                    current_$29 = current_$29.rest();
                    if (NIL == current_$29) {
                        if (NIL != node_path_1) {
                            SubLObject current_$30;
                            final SubLObject datum_$29 = current_$30 = node_path_1;
                            SubLObject node_2 = NIL;
                            destructuring_bind_must_consp(current_$30, datum_$29, $list149);
                            node_2 = current_$30.first();
                            current_$30 = current_$30.rest();
                            final SubLObject link_path_2 = (current_$30.isCons()) ? current_$30.first() : NIL;
                            destructuring_bind_must_listp(current_$30, datum_$29, $list149);
                            current_$30 = current_$30.rest();
                            if (NIL == current_$30) {
                                return cons(list(node_1, node_2, link_1), kbp_path_tuples(node_path_1));
                            }
                            cdestructuring_bind_error(datum_$29, $list149);
                        }
                    } else {
                        cdestructuring_bind_error(datum_$28, $list148);
                    }
                }
            } else {
                cdestructuring_bind_error(path, $list147);
            }
        }
        return NIL;
    }

    public static final SubLObject kbp_justs_from_tuples_alt(SubLObject tuples_sets) {
        return Mapping.mapcar(symbol_function(KBP_JUST_FROM_TUPLES), tuples_sets);
    }

    public static SubLObject kbp_justs_from_tuples(final SubLObject tuples_sets) {
        return Mapping.mapcar(symbol_function(KBP_JUST_FROM_TUPLES), tuples_sets);
    }

    public static final SubLObject kbp_just_from_tuples_alt(SubLObject tuples) {
        return list_utilities.mapappend(symbol_function(KBP_JUST_FROM_TUPLE), tuples);
    }

    public static SubLObject kbp_just_from_tuples(final SubLObject tuples) {
        return list_utilities.mapappend(symbol_function(KBP_JUST_FROM_TUPLE), tuples);
    }

    public static final SubLObject kbp_just_from_tuple_alt(SubLObject tuple) {
        return NIL;
    }

    public static SubLObject kbp_just_from_tuple(final SubLObject tuple) {
        return NIL;
    }

    public static final SubLObject make_gaf_assertion_alt(SubLObject gaf) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            fi.fi_assert_int(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            return kb_indexing.find_gaf(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject make_gaf_assertion(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.fi_assert_int(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        return kb_indexing.find_gaf(gaf, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static final SubLObject kbp_note_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject kbp_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject kbp_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
            } else {
                if (add(TWO_INTEGER, $kbp_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject kbp_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
        } else
            if (add(TWO_INTEGER, $kbp_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
            }

        return NIL;
    }

    public static final SubLObject kbp_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject kbp_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($kbp_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject kbp_min_isa_paths_alt(SubLObject term_1, SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject min_isa_ceilings = isa.min_ceiling_isa(list(term_1, term_2), NIL, mt, UNPROVIDED);
                SubLObject paths = NIL;
                if (NIL != min_isa_ceilings) {
                    {
                        SubLObject _prev_bind_0 = $kbp_min_isa_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kbp_min_genls_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $limit_path_depthP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $kbp_only_gaf_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $kbp_designated_predsP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = $kbp_designated_preds$.currentBinding(thread);
                        SubLObject _prev_bind_7 = $kbp_designated_node_superiorsP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = $kbp_designated_node_superiors$.currentBinding(thread);
                        try {
                            $kbp_min_isa_pathP$.bind(NIL, thread);
                            $kbp_min_genls_pathP$.bind(NIL, thread);
                            $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                            $limit_path_depthP$.bind(depth_limitP, thread);
                            $kbp_only_gaf_linksP$.bind(T, thread);
                            $kbp_designated_predsP$.bind(T, thread);
                            $kbp_designated_preds$.bind($list_alt154, thread);
                            $kbp_designated_node_superiorsP$.bind(T, thread);
                            $kbp_designated_node_superiors$.bind(min_isa_ceilings, thread);
                            paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(term_1, term_2, mt);
                        } finally {
                            $kbp_designated_node_superiors$.rebind(_prev_bind_8, thread);
                            $kbp_designated_node_superiorsP$.rebind(_prev_bind_7, thread);
                            $kbp_designated_preds$.rebind(_prev_bind_6, thread);
                            $kbp_designated_predsP$.rebind(_prev_bind_5, thread);
                            $kbp_only_gaf_linksP$.rebind(_prev_bind_4, thread);
                            $limit_path_depthP$.rebind(_prev_bind_3, thread);
                            $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_2, thread);
                            $kbp_min_genls_pathP$.rebind(_prev_bind_1, thread);
                            $kbp_min_isa_pathP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kbp_min_isa_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_isa_ceilings = isa.min_ceiling_isa(list(term_1, term_2), NIL, mt, UNPROVIDED);
        SubLObject paths = NIL;
        if (NIL != min_isa_ceilings) {
            final SubLObject _prev_bind_0 = $kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding(thread);
            try {
                $kbp_min_isa_pathP$.bind(NIL, thread);
                $kbp_min_genls_pathP$.bind(NIL, thread);
                $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                $limit_path_depthP$.bind(depth_limitP, thread);
                $kbp_only_gaf_linksP$.bind(T, thread);
                $kbp_designated_predsP$.bind(T, thread);
                $kbp_designated_preds$.bind($list154, thread);
                $kbp_designated_node_superiorsP$.bind(T, thread);
                $kbp_designated_node_superiors$.bind(min_isa_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            } finally {
                $kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                $kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                $kbp_designated_preds$.rebind(_prev_bind_7, thread);
                $kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                $kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                $limit_path_depthP$.rebind(_prev_bind_4, thread);
                $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                $kbp_min_genls_pathP$.rebind(_prev_bind_2, thread);
                $kbp_min_isa_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }

    public static final SubLObject kbp_min_genls_paths_alt(SubLObject term_1, SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject min_genls_ceilings = genls.min_ceiling_cols(list(term_1, term_2), NIL, mt, UNPROVIDED);
                SubLObject paths = NIL;
                if (NIL != min_genls_ceilings) {
                    {
                        SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kbp_min_isa_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $limit_path_depthP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $kbp_only_gaf_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $kbp_designated_predsP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = $kbp_designated_preds$.currentBinding(thread);
                        SubLObject _prev_bind_7 = $kbp_designated_node_superiorsP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = $kbp_designated_node_superiors$.currentBinding(thread);
                        try {
                            $kbp_min_genls_pathP$.bind(NIL, thread);
                            $kbp_min_isa_pathP$.bind(NIL, thread);
                            $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                            $limit_path_depthP$.bind(depth_limitP, thread);
                            $kbp_only_gaf_linksP$.bind(T, thread);
                            $kbp_designated_predsP$.bind(T, thread);
                            $kbp_designated_preds$.bind($list_alt155, thread);
                            $kbp_designated_node_superiorsP$.bind(T, thread);
                            $kbp_designated_node_superiors$.bind(min_genls_ceilings, thread);
                            paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(term_1, term_2, mt);
                        } finally {
                            $kbp_designated_node_superiors$.rebind(_prev_bind_8, thread);
                            $kbp_designated_node_superiorsP$.rebind(_prev_bind_7, thread);
                            $kbp_designated_preds$.rebind(_prev_bind_6, thread);
                            $kbp_designated_predsP$.rebind(_prev_bind_5, thread);
                            $kbp_only_gaf_linksP$.rebind(_prev_bind_4, thread);
                            $limit_path_depthP$.rebind(_prev_bind_3, thread);
                            $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_2, thread);
                            $kbp_min_isa_pathP$.rebind(_prev_bind_1, thread);
                            $kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kbp_min_genls_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_genls_ceilings = genls.min_ceiling_cols(list(term_1, term_2), NIL, mt, UNPROVIDED);
        SubLObject paths = NIL;
        if (NIL != min_genls_ceilings) {
            final SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding(thread);
            try {
                $kbp_min_genls_pathP$.bind(NIL, thread);
                $kbp_min_isa_pathP$.bind(NIL, thread);
                $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                $limit_path_depthP$.bind(depth_limitP, thread);
                $kbp_only_gaf_linksP$.bind(T, thread);
                $kbp_designated_predsP$.bind(T, thread);
                $kbp_designated_preds$.bind($list155, thread);
                $kbp_designated_node_superiorsP$.bind(T, thread);
                $kbp_designated_node_superiors$.bind(min_genls_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            } finally {
                $kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                $kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                $kbp_designated_preds$.rebind(_prev_bind_7, thread);
                $kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                $kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                $limit_path_depthP$.rebind(_prev_bind_4, thread);
                $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                $kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                $kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }

    public static final SubLObject kbp_min_genl_mt_paths_alt(SubLObject term_1, SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject min_genl_mts_ceilings = genl_mts.min_ceiling_mts(list(term_1, term_2), NIL, mt);
                SubLObject paths = NIL;
                if (NIL != min_genl_mts_ceilings) {
                    {
                        SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kbp_min_isa_pathP$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $limit_path_depthP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = $kbp_only_gaf_linksP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = $kbp_designated_predsP$.currentBinding(thread);
                        SubLObject _prev_bind_6 = $kbp_designated_preds$.currentBinding(thread);
                        SubLObject _prev_bind_7 = $kbp_designated_node_superiorsP$.currentBinding(thread);
                        SubLObject _prev_bind_8 = $kbp_designated_node_superiors$.currentBinding(thread);
                        try {
                            $kbp_min_genls_pathP$.bind(NIL, thread);
                            $kbp_min_isa_pathP$.bind(NIL, thread);
                            $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                            $limit_path_depthP$.bind(depth_limitP, thread);
                            $kbp_only_gaf_linksP$.bind(T, thread);
                            $kbp_designated_predsP$.bind(T, thread);
                            $kbp_designated_preds$.bind($list_alt156, thread);
                            $kbp_designated_node_superiorsP$.bind(T, thread);
                            $kbp_designated_node_superiors$.bind(min_genl_mts_ceilings, thread);
                            paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(term_1, term_2, mt);
                        } finally {
                            $kbp_designated_node_superiors$.rebind(_prev_bind_8, thread);
                            $kbp_designated_node_superiorsP$.rebind(_prev_bind_7, thread);
                            $kbp_designated_preds$.rebind(_prev_bind_6, thread);
                            $kbp_designated_predsP$.rebind(_prev_bind_5, thread);
                            $kbp_only_gaf_linksP$.rebind(_prev_bind_4, thread);
                            $limit_path_depthP$.rebind(_prev_bind_3, thread);
                            $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_2, thread);
                            $kbp_min_isa_pathP$.rebind(_prev_bind_1, thread);
                            $kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject kbp_min_genl_mt_paths(final SubLObject term_1, final SubLObject term_2, SubLObject mt, SubLObject depth_limitP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (depth_limitP == UNPROVIDED) {
            depth_limitP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject min_genl_mts_ceilings = genl_mts.min_ceiling_mts(list(term_1, term_2), NIL, mt);
        SubLObject paths = NIL;
        if (NIL != min_genl_mts_ceilings) {
            final SubLObject _prev_bind_0 = $kbp_min_genls_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $limit_path_depthP$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $kbp_only_gaf_linksP$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $kbp_designated_predsP$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $kbp_designated_preds$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $kbp_designated_node_superiorsP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $kbp_designated_node_superiors$.currentBinding(thread);
            try {
                $kbp_min_genls_pathP$.bind(NIL, thread);
                $kbp_min_isa_pathP$.bind(NIL, thread);
                $kbp_no_bi_scoping_linksP$.bind(NIL, thread);
                $limit_path_depthP$.bind(depth_limitP, thread);
                $kbp_only_gaf_linksP$.bind(T, thread);
                $kbp_designated_predsP$.bind(T, thread);
                $kbp_designated_preds$.bind($list156, thread);
                $kbp_designated_node_superiorsP$.bind(T, thread);
                $kbp_designated_node_superiors$.bind(min_genl_mts_ceilings, thread);
                paths = kb_paths(term_1, term_2, mt);
            } finally {
                $kbp_designated_node_superiors$.rebind(_prev_bind_9, thread);
                $kbp_designated_node_superiorsP$.rebind(_prev_bind_8, thread);
                $kbp_designated_preds$.rebind(_prev_bind_7, thread);
                $kbp_designated_predsP$.rebind(_prev_bind_6, thread);
                $kbp_only_gaf_linksP$.rebind(_prev_bind_5, thread);
                $limit_path_depthP$.rebind(_prev_bind_4, thread);
                $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_3, thread);
                $kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                $kbp_min_genls_pathP$.rebind(_prev_bind_0, thread);
            }
        }
        return paths;
    }

    public static final SubLObject explain_cr_pair_alt(SubLObject term1, SubLObject term2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paths = NIL;
                {
                    SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $kbp_only_gaf_linksP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $kbp_min_genls_pathP$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $kbp_genls_cardinality_delta_bound$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $kbp_explode_natsP$.currentBinding(thread);
                    SubLObject _prev_bind_6 = $kbp_quit_with_successP$.currentBinding(thread);
                    SubLObject _prev_bind_7 = $kbp_restricted_predsP$.currentBinding(thread);
                    SubLObject _prev_bind_8 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                    SubLObject _prev_bind_9 = $kbp_restricted_preds$.currentBinding(thread);
                    SubLObject _prev_bind_10 = $kbp_node_isa_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_11 = $kbp_node_isa_bound$.currentBinding(thread);
                    SubLObject _prev_bind_12 = $kbp_isa_boundP$.currentBinding(thread);
                    SubLObject _prev_bind_13 = $kbp_isa_bound$.currentBinding(thread);
                    SubLObject _prev_bind_14 = $kbp_genl_bound$.currentBinding(thread);
                    SubLObject _prev_bind_15 = $collect_kbp_statsP$.currentBinding(thread);
                    SubLObject _prev_bind_16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_17 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        $max_search_iterations$.bind(TWO_INTEGER, thread);
                        $kbp_only_gaf_linksP$.bind(NIL, thread);
                        $kbp_min_isa_pathP$.bind(NIL, thread);
                        $kbp_min_genls_pathP$.bind(T, thread);
                        $kbp_genls_cardinality_delta_bound$.bind(TWENTY_INTEGER, thread);
                        $kbp_explode_natsP$.bind(T, thread);
                        $kbp_quit_with_successP$.bind(T, thread);
                        $kbp_restricted_predsP$.bind(T, thread);
                        $kbp_no_bi_scoping_linksP$.bind(T, thread);
                        $kbp_restricted_preds$.bind($list_alt158, thread);
                        $kbp_node_isa_boundP$.bind(T, thread);
                        $kbp_node_isa_bound$.bind($list_alt159, thread);
                        $kbp_isa_boundP$.bind(T, thread);
                        $kbp_isa_bound$.bind($list_alt160, thread);
                        $kbp_genl_bound$.bind($list_alt161, thread);
                        $collect_kbp_statsP$.bind(NIL, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(term1, term2, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_17, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_16, thread);
                        $collect_kbp_statsP$.rebind(_prev_bind_15, thread);
                        $kbp_genl_bound$.rebind(_prev_bind_14, thread);
                        $kbp_isa_bound$.rebind(_prev_bind_13, thread);
                        $kbp_isa_boundP$.rebind(_prev_bind_12, thread);
                        $kbp_node_isa_bound$.rebind(_prev_bind_11, thread);
                        $kbp_node_isa_boundP$.rebind(_prev_bind_10, thread);
                        $kbp_restricted_preds$.rebind(_prev_bind_9, thread);
                        $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_8, thread);
                        $kbp_restricted_predsP$.rebind(_prev_bind_7, thread);
                        $kbp_quit_with_successP$.rebind(_prev_bind_6, thread);
                        $kbp_explode_natsP$.rebind(_prev_bind_5, thread);
                        $kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_4, thread);
                        $kbp_min_genls_pathP$.rebind(_prev_bind_3, thread);
                        $kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                        $kbp_only_gaf_linksP$.rebind(_prev_bind_1, thread);
                        $max_search_iterations$.rebind(_prev_bind_0, thread);
                    }
                }
                return paths;
            }
        }
    }

    public static SubLObject explain_cr_pair(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paths = NIL;
        final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $kbp_only_gaf_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $kbp_min_isa_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $kbp_min_genls_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $kbp_genls_cardinality_delta_bound$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $kbp_explode_natsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $kbp_quit_with_successP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $kbp_restricted_predsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $kbp_restricted_preds$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $kbp_node_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $kbp_node_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $kbp_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $kbp_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $kbp_genl_bound$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $collect_kbp_statsP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_18 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            $max_search_iterations$.bind(TWO_INTEGER, thread);
            $kbp_only_gaf_linksP$.bind(NIL, thread);
            $kbp_min_isa_pathP$.bind(NIL, thread);
            $kbp_min_genls_pathP$.bind(T, thread);
            $kbp_genls_cardinality_delta_bound$.bind(TWENTY_INTEGER, thread);
            $kbp_explode_natsP$.bind(T, thread);
            $kbp_quit_with_successP$.bind(T, thread);
            $kbp_restricted_predsP$.bind(T, thread);
            $kbp_no_bi_scoping_linksP$.bind(T, thread);
            $kbp_restricted_preds$.bind($list158, thread);
            $kbp_node_isa_boundP$.bind(T, thread);
            $kbp_node_isa_bound$.bind($list159, thread);
            $kbp_isa_boundP$.bind(T, thread);
            $kbp_isa_bound$.bind($list160, thread);
            $kbp_genl_bound$.bind($list161, thread);
            $collect_kbp_statsP$.bind(NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            paths = kb_paths(term1, term2, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_18, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_17, thread);
            $collect_kbp_statsP$.rebind(_prev_bind_16, thread);
            $kbp_genl_bound$.rebind(_prev_bind_15, thread);
            $kbp_isa_bound$.rebind(_prev_bind_14, thread);
            $kbp_isa_boundP$.rebind(_prev_bind_13, thread);
            $kbp_node_isa_bound$.rebind(_prev_bind_12, thread);
            $kbp_node_isa_boundP$.rebind(_prev_bind_11, thread);
            $kbp_restricted_preds$.rebind(_prev_bind_10, thread);
            $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_9, thread);
            $kbp_restricted_predsP$.rebind(_prev_bind_8, thread);
            $kbp_quit_with_successP$.rebind(_prev_bind_7, thread);
            $kbp_explode_natsP$.rebind(_prev_bind_6, thread);
            $kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_5, thread);
            $kbp_min_genls_pathP$.rebind(_prev_bind_4, thread);
            $kbp_min_isa_pathP$.rebind(_prev_bind_3, thread);
            $kbp_only_gaf_linksP$.rebind(_prev_bind_2, thread);
            $max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return paths;
    }

    public static final SubLObject explain_cr_gafs_via_paths_alt(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
                SubLObject _prev_bind_1 = $kbp_only_gaf_linksP$.currentBinding(thread);
                SubLObject _prev_bind_2 = $kbp_min_isa_pathP$.currentBinding(thread);
                SubLObject _prev_bind_3 = $kbp_min_genls_pathP$.currentBinding(thread);
                SubLObject _prev_bind_4 = $kbp_genls_cardinality_delta_bound$.currentBinding(thread);
                SubLObject _prev_bind_5 = $kbp_explode_natsP$.currentBinding(thread);
                SubLObject _prev_bind_6 = $kbp_quit_with_successP$.currentBinding(thread);
                SubLObject _prev_bind_7 = $kbp_restricted_predsP$.currentBinding(thread);
                SubLObject _prev_bind_8 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
                SubLObject _prev_bind_9 = $kbp_restricted_preds$.currentBinding(thread);
                SubLObject _prev_bind_10 = $kbp_node_isa_boundP$.currentBinding(thread);
                SubLObject _prev_bind_11 = $kbp_node_isa_bound$.currentBinding(thread);
                SubLObject _prev_bind_12 = $kbp_isa_boundP$.currentBinding(thread);
                SubLObject _prev_bind_13 = $kbp_isa_bound$.currentBinding(thread);
                SubLObject _prev_bind_14 = $kbp_genl_bound$.currentBinding(thread);
                SubLObject _prev_bind_15 = $collect_kbp_statsP$.currentBinding(thread);
                try {
                    $max_search_iterations$.bind(TWO_INTEGER, thread);
                    $kbp_only_gaf_linksP$.bind(NIL, thread);
                    $kbp_min_isa_pathP$.bind(NIL, thread);
                    $kbp_min_genls_pathP$.bind(T, thread);
                    $kbp_genls_cardinality_delta_bound$.bind(TWENTY_INTEGER, thread);
                    $kbp_explode_natsP$.bind(T, thread);
                    $kbp_quit_with_successP$.bind(T, thread);
                    $kbp_restricted_predsP$.bind(T, thread);
                    $kbp_no_bi_scoping_linksP$.bind(T, thread);
                    $kbp_restricted_preds$.bind($list_alt158, thread);
                    $kbp_node_isa_boundP$.bind(T, thread);
                    $kbp_node_isa_bound$.bind($list_alt162, thread);
                    $kbp_isa_boundP$.bind(T, thread);
                    $kbp_isa_bound$.bind($list_alt160, thread);
                    $kbp_genl_bound$.bind($list_alt161, thread);
                    $collect_kbp_statsP$.bind(NIL, thread);
                    if (NIL != clearP) {
                        clrhash($cr_paths_table$.getDynamicValue(thread));
                        $cr_gaf_count$.setDynamicValue(ZERO_INTEGER, thread);
                        $cr_explained_count$.setDynamicValue(ZERO_INTEGER, thread);
                        $cr_error_count$.setDynamicValue(ZERO_INTEGER, thread);
                    }
                    {
                        SubLObject _prev_bind_0_31 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1_32 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            kb_mapping.map_predicate_extent_index(EXPLAIN_CR_GAF_VIA_PATHS, $$conceptuallyRelated, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_32, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_31, thread);
                        }
                    }
                } finally {
                    $collect_kbp_statsP$.rebind(_prev_bind_15, thread);
                    $kbp_genl_bound$.rebind(_prev_bind_14, thread);
                    $kbp_isa_bound$.rebind(_prev_bind_13, thread);
                    $kbp_isa_boundP$.rebind(_prev_bind_12, thread);
                    $kbp_node_isa_bound$.rebind(_prev_bind_11, thread);
                    $kbp_node_isa_boundP$.rebind(_prev_bind_10, thread);
                    $kbp_restricted_preds$.rebind(_prev_bind_9, thread);
                    $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_8, thread);
                    $kbp_restricted_predsP$.rebind(_prev_bind_7, thread);
                    $kbp_quit_with_successP$.rebind(_prev_bind_6, thread);
                    $kbp_explode_natsP$.rebind(_prev_bind_5, thread);
                    $kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_4, thread);
                    $kbp_min_genls_pathP$.rebind(_prev_bind_3, thread);
                    $kbp_min_isa_pathP$.rebind(_prev_bind_2, thread);
                    $kbp_only_gaf_linksP$.rebind(_prev_bind_1, thread);
                    $max_search_iterations$.rebind(_prev_bind_0, thread);
                }
            }
            return $cr_paths_table$.getDynamicValue(thread);
        }
    }

    public static SubLObject explain_cr_gafs_via_paths(SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $max_search_iterations$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $kbp_only_gaf_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $kbp_min_isa_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $kbp_min_genls_pathP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $kbp_genls_cardinality_delta_bound$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $kbp_explode_natsP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $kbp_quit_with_successP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $kbp_restricted_predsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $kbp_no_bi_scoping_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $kbp_restricted_preds$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $kbp_node_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $kbp_node_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $kbp_isa_boundP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $kbp_isa_bound$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $kbp_genl_bound$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $collect_kbp_statsP$.currentBinding(thread);
        try {
            $max_search_iterations$.bind(TWO_INTEGER, thread);
            $kbp_only_gaf_linksP$.bind(NIL, thread);
            $kbp_min_isa_pathP$.bind(NIL, thread);
            $kbp_min_genls_pathP$.bind(T, thread);
            $kbp_genls_cardinality_delta_bound$.bind(TWENTY_INTEGER, thread);
            $kbp_explode_natsP$.bind(T, thread);
            $kbp_quit_with_successP$.bind(T, thread);
            $kbp_restricted_predsP$.bind(T, thread);
            $kbp_no_bi_scoping_linksP$.bind(T, thread);
            $kbp_restricted_preds$.bind($list158, thread);
            $kbp_node_isa_boundP$.bind(T, thread);
            $kbp_node_isa_bound$.bind($list162, thread);
            $kbp_isa_boundP$.bind(T, thread);
            $kbp_isa_bound$.bind($list160, thread);
            $kbp_genl_bound$.bind($list161, thread);
            $collect_kbp_statsP$.bind(NIL, thread);
            if (NIL != clearP) {
                clrhash($cr_paths_table$.getDynamicValue(thread));
                $cr_gaf_count$.setDynamicValue(ZERO_INTEGER, thread);
                $cr_explained_count$.setDynamicValue(ZERO_INTEGER, thread);
                $cr_error_count$.setDynamicValue(ZERO_INTEGER, thread);
            }
            final SubLObject _prev_bind_0_$32 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                kb_mapping.map_predicate_extent_index(EXPLAIN_CR_GAF_VIA_PATHS, $$conceptuallyRelated, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$33, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$32, thread);
            }
        } finally {
            $collect_kbp_statsP$.rebind(_prev_bind_16, thread);
            $kbp_genl_bound$.rebind(_prev_bind_15, thread);
            $kbp_isa_bound$.rebind(_prev_bind_14, thread);
            $kbp_isa_boundP$.rebind(_prev_bind_13, thread);
            $kbp_node_isa_bound$.rebind(_prev_bind_12, thread);
            $kbp_node_isa_boundP$.rebind(_prev_bind_11, thread);
            $kbp_restricted_preds$.rebind(_prev_bind_10, thread);
            $kbp_no_bi_scoping_linksP$.rebind(_prev_bind_9, thread);
            $kbp_restricted_predsP$.rebind(_prev_bind_8, thread);
            $kbp_quit_with_successP$.rebind(_prev_bind_7, thread);
            $kbp_explode_natsP$.rebind(_prev_bind_6, thread);
            $kbp_genls_cardinality_delta_bound$.rebind(_prev_bind_5, thread);
            $kbp_min_genls_pathP$.rebind(_prev_bind_4, thread);
            $kbp_min_isa_pathP$.rebind(_prev_bind_3, thread);
            $kbp_only_gaf_linksP$.rebind(_prev_bind_2, thread);
            $max_search_iterations$.rebind(_prev_bind_0, thread);
        }
        return $cr_paths_table$.getDynamicValue(thread);
    }

    public static final SubLObject explain_cr_gaf_via_paths_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject id = assertion_handles.assertion_id(assertion);
                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                    SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                    SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                    SubLObject error_message = NIL;
                    SubLObject paths = NIL;
                    if (pred.eql($$conceptuallyRelated)) {
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        paths = com.cyc.cycjava.cycl.kb_paths.kb_paths(arg1, arg2, UNPROVIDED);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        $cr_gaf_count$.setDynamicValue(add($cr_gaf_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                        if (NIL != paths) {
                            paths = transform_list_utilities.quiescent_ntransform(com.cyc.cycjava.cycl.kb_paths.kbp_paths_links(paths), symbol_function($sym166$KB_ASSERTION_), symbol_function(ASSERTION_FI_FORMULA), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sethash(id, $cr_paths_table$.getDynamicValue(thread), paths);
                            print(list(arg1, arg2, paths), UNPROVIDED);
                            $cr_explained_count$.setDynamicValue(add($cr_explained_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                        } else {
                            if (NIL != error_message) {
                                sethash(id, $cr_paths_table$.getDynamicValue(thread), error_message);
                                print(list(arg1, arg2, error_message), UNPROVIDED);
                                $cr_error_count$.setDynamicValue(add($cr_error_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                            } else {
                                sethash(id, $cr_paths_table$.getDynamicValue(thread), paths);
                                print(list(arg1, arg2, paths), UNPROVIDED);
                            }
                        }
                    }
                    return paths;
                }
            }
            return NIL;
        }
    }

    public static SubLObject explain_cr_gaf_via_paths(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            final SubLObject pred = assertions_high.gaf_arg0(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            SubLObject error_message = NIL;
            SubLObject paths = NIL;
            if (pred.eql($$conceptuallyRelated)) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            paths = kb_paths(arg1, arg2, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                $cr_gaf_count$.setDynamicValue(add($cr_gaf_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                if (NIL != paths) {
                    paths = transform_list_utilities.quiescent_ntransform(kbp_paths_links(paths), symbol_function($sym166$KB_ASSERTION_), symbol_function(ASSERTION_FI_FORMULA), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sethash(id, $cr_paths_table$.getDynamicValue(thread), paths);
                    print(list(arg1, arg2, paths), UNPROVIDED);
                    $cr_explained_count$.setDynamicValue(add($cr_explained_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                } else
                    if (NIL != error_message) {
                        sethash(id, $cr_paths_table$.getDynamicValue(thread), error_message);
                        print(list(arg1, arg2, error_message), UNPROVIDED);
                        $cr_error_count$.setDynamicValue(add($cr_error_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                    } else {
                        sethash(id, $cr_paths_table$.getDynamicValue(thread), paths);
                        print(list(arg1, arg2, paths), UNPROVIDED);
                    }

            }
            return paths;
        }
        return NIL;
    }

    public static final SubLObject cr_paths_status_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt168$__cr_gafs_considered___a, $cr_gaf_count$.getDynamicValue(thread));
            format(T, $str_alt169$__cr_gafs_explained___a, $cr_explained_count$.getDynamicValue(thread));
            format(T, $str_alt170$__cr_gafs_w_errors___a, $cr_error_count$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject cr_paths_status() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str168$__cr_gafs_considered___a, $cr_gaf_count$.getDynamicValue(thread));
        format(T, $str169$__cr_gafs_explained___a, $cr_explained_count$.getDynamicValue(thread));
        format(T, $str170$__cr_gafs_w_errors___a, $cr_error_count$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject evaluate_cr_path_alt(SubLObject term1, SubLObject term2, SubLObject path, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject query = nsubst(cycl_variables.gentemp_el_var(com.cyc.cycjava.cycl.kb_paths.fort_name(term1)), term1, nsubst(cycl_variables.gentemp_el_var(com.cyc.cycjava.cycl.kb_paths.fort_name(term2)), term2, path, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(query)) {
                query = query.first();
            } else {
                query = cons($$and, query);
            }
            {
                SubLObject v_bindings = fi.fi_ask_int(query, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return v_bindings;
            }
        }
    }

    public static SubLObject evaluate_cr_path(final SubLObject term1, final SubLObject term2, final SubLObject path, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject query = nsubst(cycl_variables.gentemp_el_var(fort_name(term1)), term1, nsubst(cycl_variables.gentemp_el_var(fort_name(term2)), term2, path, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(query)) {
            query = query.first();
        } else {
            query = cons($$and, query);
        }
        final SubLObject v_bindings = fi.fi_ask_int(query, mt, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_bindings;
    }

    public static final SubLObject fort_name_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return string_utilities.object_to_string(narts_high.nart_el_formula(fort));
            }
        }
        return NIL;
    }

    public static SubLObject fort_name(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return string_utilities.object_to_string(narts_high.nart_el_formula(fort));
        }
        return NIL;
    }

    public static final SubLObject fort_nameL_alt(SubLObject fort1, SubLObject fort2) {
        return Strings.stringL(com.cyc.cycjava.cycl.kb_paths.fort_name(fort1), com.cyc.cycjava.cycl.kb_paths.fort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fort_nameL(final SubLObject fort1, final SubLObject fort2) {
        return Strings.stringL(fort_name(fort1), fort_name(fort2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject assertions_fi_equalP_alt(SubLObject assertions_1, SubLObject assertions_2) {
        if ((NIL != term.kb_assertionP(assertions_1)) && (NIL != term.kb_assertionP(assertions_2))) {
            return equal(com.cyc.cycjava.cycl.kb_paths.assertions_fi_formulae(assertions_1), com.cyc.cycjava.cycl.kb_paths.assertions_fi_formulae(assertions_2));
        } else {
            if (assertions_1.isCons() && assertions_2.isCons()) {
                return list_utilities.sets_equalP(assertions_1, assertions_2, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject assertions_fi_equalP(final SubLObject assertions_1, final SubLObject assertions_2) {
        if ((NIL != term.kb_assertionP(assertions_1)) && (NIL != term.kb_assertionP(assertions_2))) {
            return equal(assertions_fi_formulae(assertions_1), assertions_fi_formulae(assertions_2));
        }
        if (assertions_1.isCons() && assertions_2.isCons()) {
            return list_utilities.sets_equalP(assertions_1, assertions_2, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject assertions_fi_formulae_alt(SubLObject assertions) {
        return Mapping.mapcar(symbol_function(ASSERTION_FI_FORMULA), assertions);
    }

    public static SubLObject assertions_fi_formulae(final SubLObject assertions) {
        return Mapping.mapcar(symbol_function(ASSERTION_FI_FORMULA), assertions);
    }

    /**
     * returns the set of focus specifications for COLLECTION
     */
    @LispMethod(comment = "returns the set of focus specifications for COLLECTION")
    public static final SubLObject focuses_alt(SubLObject collection, SubLObject focus_bias, SubLObject argnums, SubLObject mt, SubLObject meta_pred_types) {
        if (focus_bias == UNPROVIDED) {
            focus_bias = $MIN;
        }
        if (argnums == UNPROVIDED) {
            argnums = $list_alt14;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list_alt185;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                    try {
                        $mapping_answer$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    {
                                        SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                        {
                                            SubLObject _prev_bind_0_34 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            SubLObject _prev_bind_1_35 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject _prev_bind_0_36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                        {
                                                            SubLObject cdolist_list_var = argnums;
                                                            SubLObject argnum = NIL;
                                                            for (argnum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argnum = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject _prev_bind_0_38 = $mapping_target_arg$.currentBinding(thread);
                                                                    try {
                                                                        $mapping_target_arg$.bind(argnum, thread);
                                                                        {
                                                                            SubLObject meta_pred_specs = com.cyc.cycjava.cycl.kb_paths.meta_pred_specs(argnum, meta_pred_types);
                                                                            SubLObject node_var = collection;
                                                                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                                            SubLObject recur_deck = deck.create_deck(deck_type);
                                                                            {
                                                                                SubLObject _prev_bind_0_39 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                    {
                                                                                        SubLObject tv_var = NIL;
                                                                                        {
                                                                                            SubLObject _prev_bind_0_40 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_41 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                                if (NIL != tv_var) {
                                                                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                            {
                                                                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                                if (pcase_var.eql($ERROR)) {
                                                                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                } else {
                                                                                                                    if (pcase_var.eql($CERROR)) {
                                                                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    } else {
                                                                                                                        if (pcase_var.eql($WARN)) {
                                                                                                                            Errors.warn($str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                        } else {
                                                                                                                            Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                                            Errors.cerror($$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_42 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_43 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_1_45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                                SubLObject _prev_bind_2_46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                                                    while (NIL != node_var) {
                                                                                                                        {
                                                                                                                            SubLObject genl = node_var;
                                                                                                                            SubLObject cdolist_list_var_47 = meta_pred_specs;
                                                                                                                            SubLObject meta_pred_spec = NIL;
                                                                                                                            for (meta_pred_spec = cdolist_list_var_47.first(); NIL != cdolist_list_var_47; cdolist_list_var_47 = cdolist_list_var_47.rest() , meta_pred_spec = cdolist_list_var_47.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_48 = $mapping_pred$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_1_49 = $mapping_index_arg$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_2_50 = $mapping_gather_arg$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        $mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                                                                                                        $mapping_index_arg$.bind(second(meta_pred_spec), thread);
                                                                                                                                        $mapping_gather_arg$.bind(third(meta_pred_spec), thread);
                                                                                                                                        kb_mapping.map_gaf_arg_index(GENLS_GATHER_FOCUS_PREDS_COLS, genl, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
                                                                                                                                    } finally {
                                                                                                                                        $mapping_gather_arg$.rebind(_prev_bind_2_50, thread);
                                                                                                                                        $mapping_index_arg$.rebind(_prev_bind_1_49, thread);
                                                                                                                                        $mapping_pred$.rebind(_prev_bind_0_48, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        {
                                                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                                            SubLObject cdolist_list_var_51 = accessible_modules;
                                                                                                                            SubLObject module_var = NIL;
                                                                                                                            for (module_var = cdolist_list_var_51.first(); NIL != cdolist_list_var_51; cdolist_list_var_51 = cdolist_list_var_51.rest() , module_var = cdolist_list_var_51.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                                    SubLObject _prev_bind_1_53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                                        {
                                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                                                                            SubLObject mt_54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_54)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject _prev_bind_0_55 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                                    try {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_54, thread);
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject iteration_state_56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_56)) {
                                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_56);
                                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                                        {
                                                                                                                                                                                                            SubLObject _prev_bind_0_57 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                                {
                                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                                    SubLObject cdolist_list_var_58 = new_list;
                                                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_58.first(); NIL != cdolist_list_var_58; cdolist_list_var_58 = cdolist_list_var_58.rest() , node_vars_link_node = cdolist_list_var_58.first()) {
                                                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_57, thread);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    iteration_state_56 = dictionary_contents.do_dictionary_contents_next(iteration_state_56);
                                                                                                                                                                                                }
                                                                                                                                                                                            } 
                                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_56);
                                                                                                                                                                                        }
                                                                                                                                                                                    } finally {
                                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_55, thread);
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
                                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt198$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                                        SubLObject cdolist_list_var_59 = new_list;
                                                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                                                        for (generating_fn = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , generating_fn = cdolist_list_var_59.first()) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                                        SubLObject new_list_61 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_62 = new_list_61;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_62.first(); NIL != cdolist_list_var_62; cdolist_list_var_62 = cdolist_list_var_62.rest() , node_vars_link_node = cdolist_list_var_62.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_60, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_53, thread);
                                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_52, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        node_var = deck.deck_pop(recur_deck);
                                                                                                                    } 
                                                                                                                } finally {
                                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_46, thread);
                                                                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_45, thread);
                                                                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_44, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt199$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_43, thread);
                                                                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_42, thread);
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_41, thread);
                                                                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_40, thread);
                                                                                            }
                                                                                        }
                                                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_39, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        $mapping_target_arg$.rebind(_prev_bind_0_38, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_37, thread);
                                                        sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_36, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                            } finally {
                                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_35, thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_34, thread);
                                            }
                                        }
                                    }
                                    {
                                        SubLObject cols = list_utilities.remove_duplicate_forts(Mapping.mapcar(CAR, $mapping_answer$.getDynamicValue(thread)));
                                        SubLObject table = make_hash_table(length(cols), UNPROVIDED, UNPROVIDED);
                                        SubLObject focus_data = NIL;
                                        SubLObject focus_cols = NIL;
                                        {
                                            SubLObject cdolist_list_var = $mapping_answer$.getDynamicValue(thread);
                                            SubLObject colXpred = NIL;
                                            for (colXpred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , colXpred = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = colXpred;
                                                    SubLObject current = datum;
                                                    SubLObject col = NIL;
                                                    SubLObject pred = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt201);
                                                    col = current.first();
                                                    current = current.rest();
                                                    pred = current;
                                                    hash_table_utilities.push_hash(col, pred, table);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject col = NIL;
                                            SubLObject preds = NIL;
                                            {
                                                final Iterator cdohash_iterator = getEntrySetIterator(table);
                                                try {
                                                    while (iteratorHasNext(cdohash_iterator)) {
                                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                        col = getEntryKey(cdohash_entry);
                                                        preds = getEntryValue(cdohash_entry);
                                                        focus_data = cons(cons(length(preds), cons(col, preds)), focus_data);
                                                    } 
                                                } finally {
                                                    releaseEntrySetIterator(cdohash_iterator);
                                                }
                                            }
                                        }
                                        focus_cols = com.cyc.cycjava.cycl.kb_paths.candidate_focus_collections(focus_data, focus_bias, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = focus_cols;
                                            SubLObject focus_col = NIL;
                                            for (focus_col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , focus_col = cdolist_list_var.first()) {
                                                {
                                                    SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                                    {
                                                        SubLObject _prev_bind_0_63 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_64 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                        try {
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                            {
                                                                SubLObject _prev_bind_0_65 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_66 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), focus_col, UNPROVIDED, UNPROVIDED);
                                                                    {
                                                                        SubLObject focus_pred_specs = NIL;
                                                                        {
                                                                            SubLObject _prev_bind_0_67 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                {
                                                                                    SubLObject _prev_bind_0_68 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                                                                        {
                                                                                            SubLObject col = NIL;
                                                                                            SubLObject pred_specs = NIL;
                                                                                            {
                                                                                                final Iterator cdohash_iterator = getEntrySetIterator(table);
                                                                                                try {
                                                                                                    while (iteratorHasNext(cdohash_iterator)) {
                                                                                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                                                        col = getEntryKey(cdohash_entry);
                                                                                                        pred_specs = getEntryValue(cdohash_entry);
                                                                                                        if ((NIL != sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread))) || (NIL != genls.genlP(col, focus_col, UNPROVIDED, UNPROVIDED))) {
                                                                                                            focus_pred_specs = nconc(focus_pred_specs, copy_list(pred_specs));
                                                                                                        }
                                                                                                    } 
                                                                                                } finally {
                                                                                                    releaseEntrySetIterator(cdohash_iterator);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_68, thread);
                                                                                    }
                                                                                }
                                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                            } finally {
                                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_67, thread);
                                                                            }
                                                                        }
                                                                        result = cons(list(focus_col, length(focus_pred_specs), focus_pred_specs), result);
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_66, thread);
                                                                    sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_65, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                        } finally {
                                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_64, thread);
                                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_63, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_33, thread);
                                }
                            }
                        }
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(result, $sym202$_, CADR);
            }
        }
    }

    /**
     * returns the set of focus specifications for COLLECTION
     */
    @LispMethod(comment = "returns the set of focus specifications for COLLECTION")
    public static SubLObject focuses(final SubLObject collection, SubLObject focus_bias, SubLObject argnums, SubLObject mt, SubLObject meta_pred_types) {
        if (focus_bias == UNPROVIDED) {
            focus_bias = $MIN;
        }
        if (argnums == UNPROVIDED) {
            argnums = $list14;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list174;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            SubLObject cdolist_list_var = argnums;
                            SubLObject argnum = NIL;
                            argnum = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject _prev_bind_0_$37 = $mapping_target_arg$.currentBinding(thread);
                                try {
                                    $mapping_target_arg$.bind(argnum, thread);
                                    final SubLObject meta_pred_specs = meta_pred_specs(argnum, meta_pred_types);
                                    SubLObject node_var = collection;
                                    final SubLObject deck_type = $STACK;
                                    final SubLObject recur_deck = deck.create_deck(deck_type);
                                    final SubLObject _prev_bind_0_$38 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject tv_var = NIL;
                                            final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }


                                                }
                                                final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                        final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$40 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                            while (NIL != node_var) {
                                                                final SubLObject genl = node_var;
                                                                SubLObject cdolist_list_var_$48 = meta_pred_specs;
                                                                SubLObject meta_pred_spec = NIL;
                                                                meta_pred_spec = cdolist_list_var_$48.first();
                                                                while (NIL != cdolist_list_var_$48) {
                                                                    final SubLObject _prev_bind_0_$42 = $mapping_pred$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$41 = $mapping_index_arg$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_2_$48 = $mapping_gather_arg$.currentBinding(thread);
                                                                    try {
                                                                        $mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                                        $mapping_index_arg$.bind(second(meta_pred_spec), thread);
                                                                        $mapping_gather_arg$.bind(third(meta_pred_spec), thread);
                                                                        kb_mapping.map_gaf_arg_index(GENLS_GATHER_FOCUS_PREDS_COLS, genl, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
                                                                    } finally {
                                                                        $mapping_gather_arg$.rebind(_prev_bind_2_$48, thread);
                                                                        $mapping_index_arg$.rebind(_prev_bind_1_$41, thread);
                                                                        $mapping_pred$.rebind(_prev_bind_0_$42, thread);
                                                                    }
                                                                    cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                                                    meta_pred_spec = cdolist_list_var_$48.first();
                                                                } 
                                                                SubLObject cdolist_list_var_$49;
                                                                final SubLObject accessible_modules = cdolist_list_var_$49 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                SubLObject module_var = NIL;
                                                                module_var = cdolist_list_var_$49.first();
                                                                while (NIL != cdolist_list_var_$49) {
                                                                    final SubLObject _prev_bind_0_$43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                    final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            if (NIL != d_link) {
                                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                if (NIL != mt_links) {
                                                                                    SubLObject iteration_state;
                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject mt_$55 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$55)) {
                                                                                            final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$55, thread);
                                                                                                SubLObject iteration_state_$57;
                                                                                                for (iteration_state_$57 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$57); iteration_state_$57 = dictionary_contents.do_dictionary_contents_next(iteration_state_$57)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$57);
                                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            final SubLObject sol = link_nodes;
                                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                                SubLObject basis_object;
                                                                                                                SubLObject state;
                                                                                                                SubLObject node_vars_link_node;
                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else
                                                                                                                if (sol.isList()) {
                                                                                                                    SubLObject csome_list_var = sol;
                                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                                    while (NIL != csome_list_var) {
                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                        }
                                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                                    } 
                                                                                                                } else {
                                                                                                                    Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                }

                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$45, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$57);
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$44, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } else
                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                SubLObject cdolist_list_var_$50;
                                                                                final SubLObject new_list = cdolist_list_var_$50 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                SubLObject generating_fn = NIL;
                                                                                generating_fn = cdolist_list_var_$50.first();
                                                                                while (NIL != cdolist_list_var_$50) {
                                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                        final SubLObject sol2;
                                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                        if (NIL != set.set_p(sol2)) {
                                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                            SubLObject basis_object2;
                                                                                            SubLObject state2;
                                                                                            SubLObject node_vars_link_node3;
                                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol2.isList()) {
                                                                                                SubLObject csome_list_var2 = sol2;
                                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                                while (NIL != csome_list_var2) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$46, thread);
                                                                                    }
                                                                                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                                    generating_fn = cdolist_list_var_$50.first();
                                                                                } 
                                                                            }

                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$42, thread);
                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$43, thread);
                                                                    }
                                                                    cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                    module_var = cdolist_list_var_$49.first();
                                                                } 
                                                                node_var = deck.deck_pop(recur_deck);
                                                            } 
                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$47, thread);
                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$40, thread);
                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$41, thread);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$39, thread);
                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$40, thread);
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$38, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$38, thread);
                                    }
                                } finally {
                                    $mapping_target_arg$.rebind(_prev_bind_0_$37, thread);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                argnum = cdolist_list_var.first();
                            } 
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$37, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$36, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$36, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$35, thread);
                }
                final SubLObject cols = list_utilities.remove_duplicate_forts(Mapping.mapcar(CAR, $mapping_answer$.getDynamicValue(thread)));
                final SubLObject table = make_hash_table(length(cols), UNPROVIDED, UNPROVIDED);
                SubLObject focus_data = NIL;
                SubLObject focus_cols = NIL;
                SubLObject cdolist_list_var2 = $mapping_answer$.getDynamicValue(thread);
                SubLObject colXpred = NIL;
                colXpred = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject current;
                    final SubLObject datum = current = colXpred;
                    SubLObject col = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list191);
                    col = current.first();
                    current = pred = current.rest();
                    hash_table_utilities.push_hash(col, pred, table);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    colXpred = cdolist_list_var2.first();
                } 
                SubLObject col2 = NIL;
                SubLObject preds = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        col2 = getEntryKey(cdohash_entry);
                        preds = getEntryValue(cdohash_entry);
                        focus_data = cons(cons(length(preds), cons(col2, preds)), focus_data);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                focus_cols = cdolist_list_var2 = candidate_focus_collections(focus_data, focus_bias, UNPROVIDED);
                SubLObject focus_col = NIL;
                focus_col = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$49 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$43 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), focus_col, UNPROVIDED, UNPROVIDED);
                                SubLObject focus_pred_specs = NIL;
                                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject _prev_bind_0_$52 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                                            SubLObject col3 = NIL;
                                            SubLObject pred_specs = NIL;
                                            final Iterator cdohash_iterator2 = getEntrySetIterator(table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator2)) {
                                                    final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                                                    col3 = getEntryKey(cdohash_entry2);
                                                    pred_specs = getEntryValue(cdohash_entry2);
                                                    if ((NIL != sbhl_marking_methods.sbhl_recorded_node_p(col3, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread))) || (NIL != genls.genlP(col3, focus_col, UNPROVIDED, UNPROVIDED))) {
                                                        focus_pred_specs = nconc(focus_pred_specs, copy_list(pred_specs));
                                                    }
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator2);
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$52, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$51, thread);
                                }
                                result = cons(list(focus_col, length(focus_pred_specs), focus_pred_specs), result);
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$44, thread);
                                sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$50, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$43, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$49, thread);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    focus_col = cdolist_list_var2.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
            }
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(result, $sym192$_, CADR);
    }

    public static final SubLObject genls_gather_focus_preds_cols_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject collection = assertions_high.gaf_arg(assertion, $mapping_index_arg$.getDynamicValue(thread));
                SubLObject predicate = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                if ((NIL != forts.fort_p(collection)) && (NIL != forts.fort_p(predicate))) {
                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread))) {
                        if (NIL != fort_types_interface.predicateP(predicate)) {
                            $mapping_answer$.setDynamicValue(cons(cons(collection, cons(predicate, $mapping_target_arg$.getDynamicValue(thread))), $mapping_answer$.getDynamicValue(thread)), thread);
                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), predicate, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject genls_gather_focus_preds_cols(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject collection = assertions_high.gaf_arg(assertion, $mapping_index_arg$.getDynamicValue(thread));
        final SubLObject predicate = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
        if ((((NIL != forts.fort_p(collection)) && (NIL != forts.fort_p(predicate))) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread)))) && (NIL != fort_types_interface.predicateP(predicate))) {
            $mapping_answer$.setDynamicValue(cons(cons(collection, cons(predicate, $mapping_target_arg$.getDynamicValue(thread))), $mapping_answer$.getDynamicValue(thread)), thread);
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), predicate, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * removes from COLLECTIONS those elements that are genls of all elements
     */
    @LispMethod(comment = "removes from COLLECTIONS those elements that are genls of all elements")
    public static final SubLObject remove_genls_of_all_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = collections;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                if (NIL == genls.all_genlP(col, collections, UNPROVIDED, UNPROVIDED)) {
                                    result = cons(col, result);
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

    @LispMethod(comment = "removes from COLLECTIONS those elements that are genls of all elements")
    public static SubLObject remove_genls_of_all(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == genls.all_genlP(col, collections, UNPROVIDED, UNPROVIDED)) {
                    result = cons(col, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * removes from COLLECTIONS those elements that are genls of all elements
     */


    /**
     * removes from COLLECTIONS (recursively) those elements that are specs of all elements
     */
    @LispMethod(comment = "removes from COLLECTIONS (recursively) those elements that are specs of all elements")
    public static final SubLObject remove_common_spec_path_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length(collections);
                SubLObject table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = collections;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                {
                                    SubLObject node_var = col;
                                    SubLObject deck_type = ($DEPTH == $BREADTH) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_69 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_70 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_71 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_72 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_73 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while (NIL != node_var) {
                                                                                {
                                                                                    SubLObject genl = node_var;
                                                                                    if (NIL != subl_promotions.memberP(genl, collections, UNPROVIDED, UNPROVIDED)) {
                                                                                        hash_table_utilities.push_hash(col, genl, table);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject cdolist_list_var_77 = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var_77.first(); NIL != cdolist_list_var_77; cdolist_list_var_77 = cdolist_list_var_77.rest() , module_var = cdolist_list_var_77.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_78 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                                    SubLObject mt_80 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_80)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_81 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_80, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_82 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_82)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_82);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_83 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_84 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_84.first(); NIL != cdolist_list_var_84; cdolist_list_var_84 = cdolist_list_var_84.rest() , node_vars_link_node = cdolist_list_var_84.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_83, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_82 = dictionary_contents.do_dictionary_contents_next(iteration_state_82);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_82);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_81, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt198$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_85 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , generating_fn = cdolist_list_var_85.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_86 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_87 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_88 = new_list_87;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_88.first(); NIL != cdolist_list_var_88; cdolist_list_var_88 = cdolist_list_var_88.rest() , node_vars_link_node = cdolist_list_var_88.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_86, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_79, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_78, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_76, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_75, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_74, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt199$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_73, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_71, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_70, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_69, thread);
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
                    SubLObject done_onceP = NIL;
                    SubLObject participants = NIL;
                    SubLObject survivors = NIL;
                    SubLObject dearly_departed = NIL;
                    SubLObject new_count = NIL;
                    for (participants = collections, survivors = participants, dearly_departed = NIL, new_count = count; !((NIL != done_onceP) && (survivors == participants)); participants = survivors , survivors = list_utilities.set_difference_forts(participants, dearly_departed) , dearly_departed = NIL , new_count = length(survivors)) {
                        {
                            SubLObject col = NIL;
                            SubLObject v_genls = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        col = getEntryKey(cdohash_entry);
                                        v_genls = getEntryValue(cdohash_entry);
                                        if (new_count.numE(length(v_genls))) {
                                            dearly_departed = cons(col, dearly_departed);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        done_onceP = T;
                    }
                    result = survivors;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "removes from COLLECTIONS (recursively) those elements that are specs of all elements")
    public static SubLObject remove_common_spec_path(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = length(collections);
        final SubLObject table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject node_var = col;
                final SubLObject deck_type = ($DEPTH == $BREADTH) ? $QUEUE : $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if (NIL != subl_promotions.memberP(genl, collections, UNPROVIDED, UNPROVIDED)) {
                                                hash_table_utilities.push_hash(col, genl, table);
                                            }
                                            SubLObject cdolist_list_var_$79;
                                            final SubLObject accessible_modules = cdolist_list_var_$79 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var_$79.first();
                                            while (NIL != cdolist_list_var_$79) {
                                                final SubLObject _prev_bind_0_$75 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$82 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$82)) {
                                                                        final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$82, thread);
                                                                            SubLObject iteration_state_$84;
                                                                            for (iteration_state_$84 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$84); iteration_state_$84 = dictionary_contents.do_dictionary_contents_next(iteration_state_$84)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$84);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$77, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$84);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$76, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$80;
                                                            final SubLObject new_list = cdolist_list_var_$80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$80.first();
                                                            while (NIL != cdolist_list_var_$80) {
                                                                final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$78, thread);
                                                                }
                                                                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                                                generating_fn = cdolist_list_var_$80.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$75, thread);
                                                }
                                                cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                module_var = cdolist_list_var_$79.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$78, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject done_onceP = NIL;
        SubLObject participants = NIL;
        SubLObject survivors = NIL;
        SubLObject dearly_departed = NIL;
        SubLObject new_count = NIL;
        participants = survivors = collections;
        dearly_departed = NIL;
        new_count = count;
        while ((NIL == done_onceP) || (!survivors.eql(participants))) {
            SubLObject col2 = NIL;
            SubLObject v_genls = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    col2 = getEntryKey(cdohash_entry);
                    v_genls = getEntryValue(cdohash_entry);
                    if (new_count.numE(length(v_genls))) {
                        dearly_departed = cons(col2, dearly_departed);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            done_onceP = T;
            participants = survivors;
            survivors = list_utilities.set_difference_forts(participants, dearly_departed);
            dearly_departed = NIL;
            new_count = length(survivors);
        } 
        result = survivors;
        return result;
    }/**
     * removes from COLLECTIONS (recursively) those elements that are specs of all elements
     */


    public static final SubLObject remove_common_spec_path_wrt_alt(SubLObject references, SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = collections;
            SubLObject cdolist_list_var = references;
            SubLObject reference = NIL;
            for (reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reference = cdolist_list_var.first()) {
                {
                    SubLObject relevant = genls.all_genls_among(reference, collections, mt, UNPROVIDED);
                    SubLObject trimmed = com.cyc.cycjava.cycl.kb_paths.remove_common_spec_path(relevant, mt);
                    result = keyhash_utilities.intersect_forts(result, trimmed);
                }
            }
            return result;
        }
    }

    public static SubLObject remove_common_spec_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = collections;
        SubLObject cdolist_list_var = references;
        SubLObject reference = NIL;
        reference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject relevant = genls.all_genls_among(reference, collections, mt, UNPROVIDED);
            final SubLObject trimmed = remove_common_spec_path(relevant, mt);
            result = keyhash_utilities.intersect_forts(result, trimmed);
            cdolist_list_var = cdolist_list_var.rest();
            reference = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     * removes from COLLECTIONS those elements that are specs of all elements
     */
    @LispMethod(comment = "removes from COLLECTIONS those elements that are specs of all elements")
    public static final SubLObject remove_specs_of_all_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = collections;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                if (NIL == genls.all_specP(col, collections, UNPROVIDED, UNPROVIDED)) {
                                    result = cons(col, result);
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

    @LispMethod(comment = "removes from COLLECTIONS those elements that are specs of all elements")
    public static SubLObject remove_specs_of_all(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == genls.all_specP(col, collections, UNPROVIDED, UNPROVIDED)) {
                    result = cons(col, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * removes from COLLECTIONS those elements that are specs of all elements
     */


    /**
     * removes from COLLECTIONS (recursively) those elements that are genls of all elements
     */
    @LispMethod(comment = "removes from COLLECTIONS (recursively) those elements that are genls of all elements")
    public static final SubLObject remove_common_genl_path_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length(collections);
                SubLObject table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = collections;
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                {
                                    SubLObject node_var = col;
                                    SubLObject deck_type = ($DEPTH == $BREADTH) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_89 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_92 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_93 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_94 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_95 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while (NIL != node_var) {
                                                                                {
                                                                                    SubLObject genl = node_var;
                                                                                    if (NIL != subl_promotions.memberP(genl, collections, UNPROVIDED, UNPROVIDED)) {
                                                                                        hash_table_utilities.push_hash(genl, col, table);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject cdolist_list_var_97 = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var_97.first(); NIL != cdolist_list_var_97; cdolist_list_var_97 = cdolist_list_var_97.rest() , module_var = cdolist_list_var_97.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_98 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                                    SubLObject mt_100 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_100)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_101 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_100, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_102 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_102)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_102);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_103 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_104 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_104.first(); NIL != cdolist_list_var_104; cdolist_list_var_104 = cdolist_list_var_104.rest() , node_vars_link_node = cdolist_list_var_104.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_103, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_102 = dictionary_contents.do_dictionary_contents_next(iteration_state_102);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_102);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_101, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt198$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_105 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_105.first(); NIL != cdolist_list_var_105; cdolist_list_var_105 = cdolist_list_var_105.rest() , generating_fn = cdolist_list_var_105.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_106 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_107 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_108 = new_list_107;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_108.first(); NIL != cdolist_list_var_108; cdolist_list_var_108 = cdolist_list_var_108.rest() , node_vars_link_node = cdolist_list_var_108.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_106, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_99, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_98, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_96, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_95, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_94, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt199$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_93, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_92, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_91, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_90, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_89, thread);
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
                    SubLObject done_onceP = NIL;
                    SubLObject participants = NIL;
                    SubLObject survivors = NIL;
                    SubLObject dearly_departed = NIL;
                    SubLObject new_count = NIL;
                    for (participants = collections, survivors = participants, dearly_departed = NIL, new_count = count; !((NIL != done_onceP) && (survivors == participants)); participants = survivors , survivors = list_utilities.set_difference_forts(participants, dearly_departed) , dearly_departed = NIL , new_count = length(survivors)) {
                        {
                            SubLObject col = NIL;
                            SubLObject specs = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        col = getEntryKey(cdohash_entry);
                                        specs = getEntryValue(cdohash_entry);
                                        if (new_count.numE(length(specs))) {
                                            dearly_departed = cons(col, dearly_departed);
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        done_onceP = T;
                    }
                    result = survivors;
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "removes from COLLECTIONS (recursively) those elements that are genls of all elements")
    public static SubLObject remove_common_genl_path(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = length(collections);
        final SubLObject table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = collections;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject node_var = col;
                final SubLObject deck_type = ($DEPTH == $BREADTH) ? $QUEUE : $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$91 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$91 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$92 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$93 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if (NIL != subl_promotions.memberP(genl, collections, UNPROVIDED, UNPROVIDED)) {
                                                hash_table_utilities.push_hash(genl, col, table);
                                            }
                                            SubLObject cdolist_list_var_$97;
                                            final SubLObject accessible_modules = cdolist_list_var_$97 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var_$97.first();
                                            while (NIL != cdolist_list_var_$97) {
                                                final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$100 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$100)) {
                                                                        final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$100, thread);
                                                                            SubLObject iteration_state_$102;
                                                                            for (iteration_state_$102 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$102); iteration_state_$102 = dictionary_contents.do_dictionary_contents_next(iteration_state_$102)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$102);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$95, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$102);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$94, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$98;
                                                            final SubLObject new_list = cdolist_list_var_$98 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$98.first();
                                                            while (NIL != cdolist_list_var_$98) {
                                                                final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$96, thread);
                                                                }
                                                                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                                                                generating_fn = cdolist_list_var_$98.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$94, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$93, thread);
                                                }
                                                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                                                module_var = cdolist_list_var_$97.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$96, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$93, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$92, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$92, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$91, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$91, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$90, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$97 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$97, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$89, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject done_onceP = NIL;
        SubLObject participants = NIL;
        SubLObject survivors = NIL;
        SubLObject dearly_departed = NIL;
        SubLObject new_count = NIL;
        participants = survivors = collections;
        dearly_departed = NIL;
        new_count = count;
        while ((NIL == done_onceP) || (!survivors.eql(participants))) {
            SubLObject col2 = NIL;
            SubLObject specs = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    col2 = getEntryKey(cdohash_entry);
                    specs = getEntryValue(cdohash_entry);
                    if (new_count.numE(length(specs))) {
                        dearly_departed = cons(col2, dearly_departed);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            done_onceP = T;
            participants = survivors;
            survivors = list_utilities.set_difference_forts(participants, dearly_departed);
            dearly_departed = NIL;
            new_count = length(survivors);
        } 
        result = survivors;
        return result;
    }/**
     * removes from COLLECTIONS (recursively) those elements that are genls of all elements
     */


    public static final SubLObject remove_common_genl_path_wrt_alt(SubLObject references, SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = collections;
            SubLObject cdolist_list_var = references;
            SubLObject reference = NIL;
            for (reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reference = cdolist_list_var.first()) {
                {
                    SubLObject relevant = genls.all_specs_among(reference, collections, mt, UNPROVIDED);
                    SubLObject trimmed = com.cyc.cycjava.cycl.kb_paths.remove_common_genl_path(relevant, mt);
                    result = keyhash_utilities.intersect_forts(result, trimmed);
                }
            }
            return result;
        }
    }

    public static SubLObject remove_common_genl_path_wrt(final SubLObject references, final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = collections;
        SubLObject cdolist_list_var = references;
        SubLObject reference = NIL;
        reference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject relevant = genls.all_specs_among(reference, collections, mt, UNPROVIDED);
            final SubLObject trimmed = remove_common_genl_path(relevant, mt);
            result = keyhash_utilities.intersect_forts(result, trimmed);
            cdolist_list_var = cdolist_list_var.rest();
            reference = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject candidate_focus_collections_alt(SubLObject data, SubLObject focus_bias, SubLObject mt) {
        if (focus_bias == UNPROVIDED) {
            focus_bias = $MIN;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject collections = Mapping.mapcar(CADR, data);
            SubLObject pcase_var = focus_bias;
            if (pcase_var.eql($ALL)) {
                return collections;
            } else {
                if (pcase_var.eql($MIN)) {
                    return genls.min_cols(com.cyc.cycjava.cycl.kb_paths.remove_common_spec_path(collections, mt), mt, UNPROVIDED);
                } else {
                    if (pcase_var.eql($MAX)) {
                        return genls.max_cols(com.cyc.cycjava.cycl.kb_paths.remove_common_genl_path(collections, mt), mt, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($MID)) {
                            return com.cyc.cycjava.cycl.kb_paths.candidate_focus_collections_strategy_middle(collections, mt);
                        } else {
                            if (pcase_var.eql($EDGE)) {
                                return com.cyc.cycjava.cycl.kb_paths.candidate_focus_collections_strategy_edge(collections, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject candidate_focus_collections(final SubLObject data, SubLObject focus_bias, SubLObject mt) {
        if (focus_bias == UNPROVIDED) {
            focus_bias = $MIN;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject collections = Mapping.mapcar(CADR, data);
        final SubLObject pcase_var = focus_bias;
        if (pcase_var.eql($ALL)) {
            return collections;
        }
        if (pcase_var.eql($MIN)) {
            return genls.min_cols(remove_common_spec_path(collections, mt), mt, UNPROVIDED);
        }
        if (pcase_var.eql($MAX)) {
            return genls.max_cols(remove_common_genl_path(collections, mt), mt, UNPROVIDED);
        }
        if (pcase_var.eql($MID)) {
            return candidate_focus_collections_strategy_middle(collections, mt);
        }
        if (pcase_var.eql($EDGE)) {
            return candidate_focus_collections_strategy_edge(collections, mt);
        }
        return NIL;
    }

    public static final SubLObject candidate_focus_collections_strategy_middle_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject candidates = NIL;
            SubLObject min_cols = NIL;
            SubLObject max_cols = NIL;
            SubLObject max_mins = NIL;
            SubLObject min_maxs = NIL;
            for (candidates = com.cyc.cycjava.cycl.kb_paths.remove_common_genl_path(com.cyc.cycjava.cycl.kb_paths.remove_common_spec_path(collections, mt), mt), min_cols = genls.min_cols(candidates, mt, UNPROVIDED), max_cols = genls.max_cols(candidates, mt, UNPROVIDED), max_mins = copy_list(min_cols), min_maxs = copy_list(max_cols); NIL != candidates; candidates = list_utilities.set_difference_forts(list_utilities.set_difference_forts(candidates, min_cols), max_cols) , min_cols = genls.min_cols(candidates, mt, UNPROVIDED) , max_cols = genls.max_cols(candidates, mt, UNPROVIDED) , max_mins = genls.max_cols(nconc(max_mins, copy_list(min_cols)), mt, UNPROVIDED) , min_maxs = genls.min_cols(nconc(min_maxs, copy_list(max_cols)), mt, UNPROVIDED)) {
            }
            result = genls.min_cols(list_utilities.remove_duplicate_forts(append(max_mins, min_maxs)), mt, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject candidate_focus_collections_strategy_middle(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject candidates;
        SubLObject min_cols;
        SubLObject max_cols;
        SubLObject max_mins;
        SubLObject min_maxs;
        for (candidates = NIL, min_cols = NIL, max_cols = NIL, max_mins = NIL, min_maxs = NIL, candidates = remove_common_genl_path(remove_common_spec_path(collections, mt), mt), min_cols = genls.min_cols(candidates, mt, UNPROVIDED), max_cols = genls.max_cols(candidates, mt, UNPROVIDED), max_mins = copy_list(min_cols), min_maxs = copy_list(max_cols); NIL != candidates; candidates = list_utilities.set_difference_forts(list_utilities.set_difference_forts(candidates, min_cols), max_cols) , min_cols = genls.min_cols(candidates, mt, UNPROVIDED) , max_cols = genls.max_cols(candidates, mt, UNPROVIDED) , max_mins = genls.max_cols(nconc(max_mins, copy_list(min_cols)), mt, UNPROVIDED) , min_maxs = genls.min_cols(nconc(min_maxs, copy_list(max_cols)), mt, UNPROVIDED)) {
        }
        result = genls.min_cols(list_utilities.remove_duplicate_forts(append(max_mins, min_maxs)), mt, UNPROVIDED);
        return result;
    }

    public static final SubLObject candidate_focus_collections_strategy_edge_alt(SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject result = NIL;
            SubLObject current = NIL;
            SubLObject candidates = NIL;
            SubLObject min_cols = NIL;
            SubLObject max_cols = NIL;
            for (current = collections, candidates = com.cyc.cycjava.cycl.kb_paths.remove_common_genl_path(com.cyc.cycjava.cycl.kb_paths.remove_common_spec_path(current, mt), mt), min_cols = genls.min_cols(candidates, mt, UNPROVIDED), max_cols = genls.max_cols(candidates, mt, UNPROVIDED); !((NIL == min_cols) && (NIL == max_cols)); current = list_utilities.set_difference_forts(candidates, result) , candidates = com.cyc.cycjava.cycl.kb_paths.remove_common_genl_path_wrt(max_cols, com.cyc.cycjava.cycl.kb_paths.remove_common_spec_path_wrt(min_cols, current, mt), mt) , min_cols = genls.min_cols(candidates, mt, UNPROVIDED) , max_cols = genls.max_cols(candidates, mt, UNPROVIDED)) {
                result = nconc(result, nconc(copy_list(min_cols), copy_list(max_cols)));
            }
            return list_utilities.remove_duplicate_forts(result);
        }
    }

    public static SubLObject candidate_focus_collections_strategy_edge(final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = NIL;
        SubLObject current = NIL;
        SubLObject candidates;
        SubLObject min_cols;
        SubLObject max_cols;
        for (candidates = NIL, min_cols = NIL, max_cols = NIL, candidates = remove_common_genl_path(remove_common_spec_path(collections, mt), mt), min_cols = genls.min_cols(candidates, mt, UNPROVIDED), max_cols = genls.max_cols(candidates, mt, UNPROVIDED); (NIL != min_cols) || (NIL != max_cols); min_cols = genls.min_cols(candidates, mt, UNPROVIDED) , max_cols = genls.max_cols(candidates, mt, UNPROVIDED)) {
            result = nconc(result, nconc(copy_list(min_cols), copy_list(max_cols)));
            current = list_utilities.set_difference_forts(candidates, result);
            candidates = remove_common_genl_path_wrt(max_cols, remove_common_spec_path_wrt(min_cols, current, mt), mt);
        }
        return list_utilities.remove_duplicate_forts(result);
    }

    public static final SubLObject appraise_candidate_focuses_alt(SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length(candidates);
                SubLObject specs_table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
                SubLObject genls_table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = candidates;
                    SubLObject candidate = NIL;
                    for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                        {
                            SubLObject node_var = candidate;
                            SubLObject deck_type = ($DEPTH == $BREADTH) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject mt_var = mt;
                                        {
                                            SubLObject _prev_bind_0_109 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_110 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_111 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_112 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_113 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_114 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(candidate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                while (NIL != node_var) {
                                                                                    {
                                                                                        SubLObject genl = node_var;
                                                                                        if (NIL != subl_promotions.memberP(genl, candidates, UNPROVIDED, UNPROVIDED)) {
                                                                                            if (genl != candidate) {
                                                                                                hash_table_utilities.push_hash(genl, candidate, specs_table);
                                                                                                hash_table_utilities.push_hash(candidate, genl, genls_table);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                        SubLObject cdolist_list_var_118 = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var_118.first(); NIL != cdolist_list_var_118; cdolist_list_var_118 = cdolist_list_var_118.rest() , module_var = cdolist_list_var_118.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_120 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                                        SubLObject mt_121 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_121)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_122 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_121, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_123 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_123)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_123);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_124 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_125 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_125.first(); NIL != cdolist_list_var_125; cdolist_list_var_125 = cdolist_list_var_125.rest() , node_vars_link_node = cdolist_list_var_125.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_124, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_123 = dictionary_contents.do_dictionary_contents_next(iteration_state_123);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_123);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_122, thread);
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
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt198$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_126 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_126.first(); NIL != cdolist_list_var_126; cdolist_list_var_126 = cdolist_list_var_126.rest() , generating_fn = cdolist_list_var_126.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_127 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_128 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_129 = new_list_128;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_129.first(); NIL != cdolist_list_var_129; cdolist_list_var_129 = cdolist_list_var_129.rest() , node_vars_link_node = cdolist_list_var_129.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_127, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_120, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_119, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_117, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_116, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_115, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt199$Node__a_does_not_pass_sbhl_type_t, candidate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_114, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_113, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_112, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_111, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_110, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_109, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = candidates;
                    SubLObject candidate = NIL;
                    for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate = cdolist_list_var.first()) {
                        {
                            SubLObject specs_count = length(gethash(candidate, specs_table, UNPROVIDED));
                            SubLObject genls_count = length(gethash(candidate, genls_table, UNPROVIDED));
                            print(list(candidate, add(specs_count, genls_count), specs_count, genls_count), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject appraise_candidate_focuses(final SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = length(candidates);
        final SubLObject specs_table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
        final SubLObject genls_table = make_hash_table(count, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = candidates;
        SubLObject candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject node_var = candidate;
            final SubLObject deck_type = ($DEPTH == $BREADTH) ? $QUEUE : $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$107 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$109 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$112 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(candidate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$111 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$113 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            if ((NIL != subl_promotions.memberP(genl, candidates, UNPROVIDED, UNPROVIDED)) && (!genl.eql(candidate))) {
                                                hash_table_utilities.push_hash(genl, candidate, specs_table);
                                                hash_table_utilities.push_hash(candidate, genl, genls_table);
                                            }
                                            SubLObject cdolist_list_var_$116;
                                            final SubLObject accessible_modules = cdolist_list_var_$116 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var_$116.first();
                                            while (NIL != cdolist_list_var_$116) {
                                                final SubLObject _prev_bind_0_$111 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$119 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$119)) {
                                                                        final SubLObject _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$119, thread);
                                                                            SubLObject iteration_state_$121;
                                                                            for (iteration_state_$121 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$121); iteration_state_$121 = dictionary_contents.do_dictionary_contents_next(iteration_state_$121)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$121);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$113, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$121);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$112, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$117;
                                                            final SubLObject new_list = cdolist_list_var_$117 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$117.first();
                                                            while (NIL != cdolist_list_var_$117) {
                                                                final SubLObject _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$114, thread);
                                                                }
                                                                cdolist_list_var_$117 = cdolist_list_var_$117.rest();
                                                                generating_fn = cdolist_list_var_$117.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$112, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$111, thread);
                                                }
                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                module_var = cdolist_list_var_$116.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$113, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$111, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$110, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, candidate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$112, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$110, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$109, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$108, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$107, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        cdolist_list_var = candidates;
        candidate = NIL;
        candidate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject specs_count = length(gethash(candidate, specs_table, UNPROVIDED));
            final SubLObject genls_count = length(gethash(candidate, genls_table, UNPROVIDED));
            print(list(candidate, add(specs_count, genls_count), specs_count, genls_count), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject genls_focus_min_preds_alt(SubLObject collection, SubLObject argnum, SubLObject mt, SubLObject meta_pred_types) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list_alt209;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            {
                                SubLObject _prev_bind_0_130 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                SubLObject _prev_bind_1_131 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject _prev_bind_0_132 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                                        SubLObject _prev_bind_1_133 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $mapping_answer$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                            $mapping_answer$.bind(NIL, thread);
                                            {
                                                SubLObject meta_pred_specs = com.cyc.cycjava.cycl.kb_paths.meta_pred_specs(argnum, meta_pred_types);
                                                SubLObject node_var = collection;
                                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                SubLObject recur_deck = deck.create_deck(deck_type);
                                                {
                                                    SubLObject _prev_bind_0_134 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject tv_var = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_135 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_136 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                    if (NIL != tv_var) {
                                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                {
                                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                    if (pcase_var.eql($ERROR)) {
                                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($CERROR)) {
                                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        } else {
                                                                                            if (pcase_var.eql($WARN)) {
                                                                                                Errors.warn($str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            } else {
                                                                                                Errors.warn($str_alt195$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                Errors.cerror($$$continue_anyway, $str_alt191$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    {
                                                                        SubLObject _prev_bind_0_137 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_138 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_139 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_140 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_141 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                                        while (NIL != node_var) {
                                                                                            {
                                                                                                SubLObject genl = node_var;
                                                                                                SubLObject cdolist_list_var = meta_pred_specs;
                                                                                                SubLObject meta_pred_spec = NIL;
                                                                                                for (meta_pred_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_pred_spec = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_143 = $mapping_pred$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_144 = $mapping_index_arg$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_2_145 = $mapping_gather_arg$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                                                                            $mapping_index_arg$.bind(second(meta_pred_spec), thread);
                                                                                                            $mapping_gather_arg$.bind(third(meta_pred_spec), thread);
                                                                                                            kb_mapping.map_gaf_arg_index(GENLS_GATHER_FOCUS_PREDS_OF, genl, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
                                                                                                        } finally {
                                                                                                            $mapping_gather_arg$.rebind(_prev_bind_2_145, thread);
                                                                                                            $mapping_index_arg$.rebind(_prev_bind_1_144, thread);
                                                                                                            $mapping_pred$.rebind(_prev_bind_0_143, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_146 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                                                SubLObject mt_148 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_148)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_149 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_148, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_150)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_150);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_151 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_152 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_152.first(); NIL != cdolist_list_var_152; cdolist_list_var_152 = cdolist_list_var_152.rest() , node_vars_link_node = cdolist_list_var_152.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_151, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_150 = dictionary_contents.do_dictionary_contents_next(iteration_state_150);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_150);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_149, thread);
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
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt198$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_153 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest() , generating_fn = cdolist_list_var_153.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_154 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_155 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_156 = new_list_155;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_156.first(); NIL != cdolist_list_var_156; cdolist_list_var_156 = cdolist_list_var_156.rest() , node_vars_link_node = cdolist_list_var_156.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_154, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_147, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_146, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            node_var = deck.deck_pop(recur_deck);
                                                                                        } 
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_142, thread);
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_141, thread);
                                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_140, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt199$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } finally {
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_139, thread);
                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_138, thread);
                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_137, thread);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_136, thread);
                                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_135, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_134, thread);
                                                    }
                                                }
                                                result = $mapping_answer$.getDynamicValue(thread);
                                            }
                                        } finally {
                                            $mapping_answer$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_133, thread);
                                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_132, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_131, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_130, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return genl_predicates.min_predicates(result, mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject genls_focus_min_preds(final SubLObject collection, final SubLObject argnum, SubLObject mt, SubLObject meta_pred_types) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list199;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_1_$127 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$127 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$128 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $mapping_answer$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        $mapping_answer$.bind(NIL, thread);
                        final SubLObject meta_pred_specs = meta_pred_specs(argnum, meta_pred_types);
                        SubLObject node_var = collection;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$128 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$129 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$129 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str184$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str180$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$130 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$130 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$135 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$131 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$131 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                while (NIL != node_var) {
                                                    final SubLObject genl = node_var;
                                                    SubLObject cdolist_list_var = meta_pred_specs;
                                                    SubLObject meta_pred_spec = NIL;
                                                    meta_pred_spec = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$132 = $mapping_pred$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$132 = $mapping_index_arg$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2_$137 = $mapping_gather_arg$.currentBinding(thread);
                                                        try {
                                                            $mapping_pred$.bind(meta_pred_spec.first(), thread);
                                                            $mapping_index_arg$.bind(second(meta_pred_spec), thread);
                                                            $mapping_gather_arg$.bind(third(meta_pred_spec), thread);
                                                            kb_mapping.map_gaf_arg_index(GENLS_GATHER_FOCUS_PREDS_OF, genl, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread), $TRUE, UNPROVIDED);
                                                        } finally {
                                                            $mapping_gather_arg$.rebind(_prev_bind_2_$137, thread);
                                                            $mapping_index_arg$.rebind(_prev_bind_1_$132, thread);
                                                            $mapping_pred$.rebind(_prev_bind_0_$132, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        meta_pred_spec = cdolist_list_var.first();
                                                    } 
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$133 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt_$144 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$144)) {
                                                                                final SubLObject _prev_bind_0_$134 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$144, thread);
                                                                                    SubLObject iteration_state_$146;
                                                                                    for (iteration_state_$146 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$146); iteration_state_$146 = dictionary_contents.do_dictionary_contents_next(iteration_state_$146)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$146);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$135, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$146);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$134, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str188$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$148;
                                                                    final SubLObject new_list = cdolist_list_var_$148 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$148.first();
                                                                    while (NIL != cdolist_list_var_$148) {
                                                                        final SubLObject _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var2 = sol2;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str187$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$136, thread);
                                                                        }
                                                                        cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                                                                        generating_fn = cdolist_list_var_$148.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$133, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    node_var = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$136, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$131, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$131, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str189$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$135, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$130, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$130, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$129, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$129, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$128, thread);
                        }
                        result = $mapping_answer$.getDynamicValue(thread);
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$128, thread);
                        sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$127, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$138 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$138, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$127, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$126, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_predicates.min_predicates(result, mt, UNPROVIDED);
    }

    public static final SubLObject genls_gather_focus_preds_of_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject collection = assertions_high.gaf_arg(assertion, $mapping_index_arg$.getDynamicValue(thread));
                SubLObject predicate = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
                if ((NIL != forts.fort_p(collection)) && (NIL != forts.fort_p(predicate))) {
                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread))) {
                        if (NIL != fort_types_interface.predicateP(predicate)) {
                            $mapping_answer$.setDynamicValue(cons(predicate, $mapping_answer$.getDynamicValue(thread)), thread);
                            print(assertion, UNPROVIDED);
                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), predicate, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject genls_gather_focus_preds_of(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject collection = assertions_high.gaf_arg(assertion, $mapping_index_arg$.getDynamicValue(thread));
        final SubLObject predicate = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
        if ((((NIL != forts.fort_p(collection)) && (NIL != forts.fort_p(predicate))) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(predicate, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread)))) && (NIL != fort_types_interface.predicateP(predicate))) {
            $mapping_answer$.setDynamicValue(cons(predicate, $mapping_answer$.getDynamicValue(thread)), thread);
            print(assertion, UNPROVIDED);
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), predicate, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject meta_pred_specs_alt(SubLObject argnum, SubLObject meta_pred_types) {
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list_alt209;
        }
        return NIL;
    }

    public static SubLObject meta_pred_specs(final SubLObject argnum, SubLObject meta_pred_types) {
        if (meta_pred_types == UNPROVIDED) {
            meta_pred_types = $list199;
        }
        return NIL;
    }

    public static final SubLObject declare_kb_paths_file_alt() {
        declareFunction("kb_paths", "KB-PATHS", 2, 1, false);
        declareFunction("kb_paths_n", "KB-PATHS-N", 2, 1, false);
        declareFunction("kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false);
        declareFunction("kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false);
        declareFunction("find_paths", "FIND-PATHS", 0, 2, false);
        declareFunction("complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false);
        declareFunction("complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false);
        declareFunction("complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false);
        declareFunction("extract_paths", "EXTRACT-PATHS", 0, 2, false);
        declareFunction("kbp_result", "KBP-RESULT", 0, 0, false);
        declareFunction("kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false);
        declareFunction("kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false);
        declareFunction("linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false);
        declareFunction("gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false);
        declareFunction("gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false);
        declareFunction("kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false);
        declareFunction("kbp_node_links", "KBP-NODE-LINKS", 1, 0, false);
        declareFunction("kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false);
        declareFunction("kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false);
        declareFunction("kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false);
        declareFunction("kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false);
        declareFunction("kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false);
        declareFunction("ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false);
        declareFunction("ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false);
        declareFunction("kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false);
        declareFunction("mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false);
        declareFunction("default_link_op", "DEFAULT-LINK-OP", 1, 2, false);
        declareFunction("default_node_op", "DEFAULT-NODE-OP", 1, 2, false);
        declareFunction("do_link_nodes", "DO-LINK-NODES", 1, 2, false);
        declareFunction("default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false);
        declareFunction("default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false);
        declareFunction("kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false);
        declareFunction("kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false);
        declareFunction("kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false);
        declareFunction("kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false);
        declareFunction("kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false);
        declareFunction("kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false);
        declareFunction("kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false);
        declareFunction("kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false);
        declareFunction("kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false);
        declareFunction("kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false);
        declareFunction("kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false);
        declareFunction("kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false);
        declareFunction("kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false);
        declareFunction("kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false);
        declareFunction("kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false);
        declareFunction("kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false);
        declareFunction("kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false);
        declareFunction("kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false);
        declareFunction("kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false);
        declareFunction("scope_direction", "SCOPE-DIRECTION", 2, 0, false);
        declareFunction("default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false);
        declareFunction("do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false);
        declareFunction("obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false);
        declareFunction("assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false);
        declareFunction("all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false);
        declareFunction("all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false);
        declareFunction("clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false);
        declareFunction("kbp_stats", "KBP-STATS", 1, 0, false);
        declareFunction("kbp_node_count", "KBP-NODE-COUNT", 0, 0, false);
        declareFunction("kbp_link_count", "KBP-LINK-COUNT", 0, 0, false);
        declareFunction("kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false);
        declareFunction("next_iteration", "NEXT-ITERATION", 0, 0, false);
        declareFunction("kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false);
        declareFunction("kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false);
        declareFunction("kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false);
        declareFunction("kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false);
        declareFunction("paths_link_count", "PATHS-LINK-COUNT", 1, 0, false);
        declareFunction("kbp_searcherP", "KBP-SEARCHER?", 1, 0, false);
        declareFunction("equal_nodesP", "EQUAL-NODES?", 2, 1, false);
        declareFunction("instance_btreeP", "INSTANCE-BTREE?", 1, 0, false);
        declareFunction("bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false);
        declareFunction("kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false);
        declareFunction("kbp_ancestors", "KBP-ANCESTORS", 1, 1, false);
        declareFunction("kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false);
        declareFunction("kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false);
        declareFunction("kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false);
        declareFunction("kbp_searchedP", "KBP-SEARCHED?", 1, 0, false);
        declareFunction("kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false);
        declareFunction("kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false);
        declareFunction("kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false);
        declareFunction("kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false);
        declareFunction("kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false);
        declareFunction("kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false);
        declareFunction("kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false);
        declareFunction("kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false);
        declareFunction("kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false);
        declareFunction("kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false);
        declareFunction("kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false);
        declareFunction("kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false);
        declareFunction("bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false);
        declareFunction("kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false);
        declareFunction("kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false);
        declareFunction("kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false);
        declareFunction("kbp_path_links", "KBP-PATH-LINKS", 1, 0, false);
        declareFunction("kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false);
        declareFunction("kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false);
        declareFunction("kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false);
        declareFunction("kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false);
        declareFunction("kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false);
        declareFunction("make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false);
        declareFunction("kbp_note", "KBP-NOTE", 2, 4, false);
        declareFunction("kbp_error", "KBP-ERROR", 2, 4, false);
        declareFunction("kbp_warn", "KBP-WARN", 2, 4, false);
        declareFunction("kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false);
        declareFunction("kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false);
        declareFunction("kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false);
        declareFunction("explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false);
        declareFunction("explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false);
        declareFunction("explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false);
        declareFunction("cr_paths_status", "CR-PATHS-STATUS", 0, 0, false);
        declareFunction("evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false);
        declareFunction("fort_name", "FORT-NAME", 1, 0, false);
        declareFunction("fort_nameL", "FORT-NAME<", 2, 0, false);
        declareFunction("clear_cached_hpkb_relate_terms", "CLEAR-CACHED-HPKB-RELATE-TERMS", 0, 0, false);
        declareFunction("remove_cached_hpkb_relate_terms", "REMOVE-CACHED-HPKB-RELATE-TERMS", 3, 0, false);
        declareFunction("cached_hpkb_relate_terms_internal", "CACHED-HPKB-RELATE-TERMS-INTERNAL", 3, 0, false);
        declareFunction("cached_hpkb_relate_terms", "CACHED-HPKB-RELATE-TERMS", 3, 0, false);
        declareFunction("hpkb_relate_terms", "HPKB-RELATE-TERMS", 2, 1, false);
        declareFunction("hpkb_relate_terms_just", "HPKB-RELATE-TERMS-JUST", 2, 1, false);
        declareFunction("hpkb_relate_terms_assertions", "HPKB-RELATE-TERMS-ASSERTIONS", 2, 1, false);
        declareFunction("hpkb_relate_terms_assertions_nl", "HPKB-RELATE-TERMS-ASSERTIONS-NL", 2, 1, false);
        declareFunction("assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false);
        declareFunction("assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false);
        declareFunction("focuses", "FOCUSES", 1, 4, false);
        declareFunction("genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false);
        declareFunction("remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false);
        declareFunction("remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false);
        declareFunction("remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false);
        declareFunction("remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false);
        declareFunction("remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false);
        declareFunction("remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false);
        declareFunction("candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false);
        declareFunction("candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false);
        declareFunction("candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false);
        declareFunction("appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false);
        declareFunction("genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false);
        declareFunction("genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false);
        declareFunction("meta_pred_specs", "META-PRED-SPECS", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_kb_paths_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("kb_paths", "KB-PATHS", 2, 1, false);
            declareFunction("kb_paths_n", "KB-PATHS-N", 2, 1, false);
            declareFunction("kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false);
            declareFunction("kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false);
            declareFunction("find_paths", "FIND-PATHS", 0, 2, false);
            declareFunction("complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false);
            declareFunction("complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false);
            declareFunction("complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false);
            declareFunction("extract_paths", "EXTRACT-PATHS", 0, 2, false);
            declareFunction("kbp_result", "KBP-RESULT", 0, 0, false);
            declareFunction("kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false);
            declareFunction("kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false);
            declareFunction("linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false);
            declareFunction("gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false);
            declareFunction("gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false);
            declareFunction("kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false);
            declareFunction("kbp_node_links", "KBP-NODE-LINKS", 1, 0, false);
            declareFunction("kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false);
            declareFunction("kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false);
            declareFunction("kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false);
            declareFunction("kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false);
            declareFunction("kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false);
            declareFunction("ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false);
            declareFunction("ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false);
            declareFunction("kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false);
            declareFunction("mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false);
            declareFunction("default_link_op", "DEFAULT-LINK-OP", 1, 2, false);
            declareFunction("default_node_op", "DEFAULT-NODE-OP", 1, 2, false);
            declareFunction("do_link_nodes", "DO-LINK-NODES", 1, 2, false);
            declareFunction("default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false);
            declareFunction("default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false);
            declareFunction("kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false);
            declareFunction("kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false);
            declareFunction("kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false);
            declareFunction("kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false);
            declareFunction("kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false);
            declareFunction("kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false);
            declareFunction("kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false);
            declareFunction("kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false);
            declareFunction("kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false);
            declareFunction("kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false);
            declareFunction("kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false);
            declareFunction("kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false);
            declareFunction("kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false);
            declareFunction("kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false);
            declareFunction("kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false);
            declareFunction("kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false);
            declareFunction("kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false);
            declareFunction("kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false);
            declareFunction("kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false);
            declareFunction("scope_direction", "SCOPE-DIRECTION", 2, 0, false);
            declareFunction("default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false);
            declareFunction("do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false);
            declareFunction("obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false);
            declareFunction("assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false);
            declareFunction("all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false);
            declareFunction("all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false);
            declareFunction("clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false);
            declareFunction("kbp_stats", "KBP-STATS", 1, 0, false);
            declareFunction("kbp_node_count", "KBP-NODE-COUNT", 0, 0, false);
            declareFunction("kbp_link_count", "KBP-LINK-COUNT", 0, 0, false);
            declareFunction("kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false);
            declareFunction("next_iteration", "NEXT-ITERATION", 0, 0, false);
            declareFunction("kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false);
            declareFunction("kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false);
            declareFunction("kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false);
            declareFunction("kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false);
            declareFunction("paths_link_count", "PATHS-LINK-COUNT", 1, 0, false);
            declareFunction("kbp_searcherP", "KBP-SEARCHER?", 1, 0, false);
            declareFunction("equal_nodesP", "EQUAL-NODES?", 2, 1, false);
            declareFunction("instance_btreeP", "INSTANCE-BTREE?", 1, 0, false);
            declareFunction("bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false);
            declareFunction("kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false);
            declareFunction("kbp_ancestors", "KBP-ANCESTORS", 1, 1, false);
            declareFunction("kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false);
            declareFunction("kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false);
            declareFunction("kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false);
            declareFunction("kbp_searchedP", "KBP-SEARCHED?", 1, 0, false);
            declareFunction("kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false);
            declareFunction("kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false);
            declareFunction("kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false);
            declareFunction("kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false);
            declareFunction("kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false);
            declareFunction("kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false);
            declareFunction("kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false);
            declareFunction("kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false);
            declareFunction("kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false);
            declareFunction("kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false);
            declareFunction("kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false);
            declareFunction("kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false);
            declareFunction("bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false);
            declareFunction("kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false);
            declareFunction("kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false);
            declareFunction("kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false);
            declareFunction("kbp_path_links", "KBP-PATH-LINKS", 1, 0, false);
            declareFunction("kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false);
            declareFunction("kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false);
            declareFunction("kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false);
            declareFunction("kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false);
            declareFunction("kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false);
            declareFunction("make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false);
            declareFunction("kbp_note", "KBP-NOTE", 2, 4, false);
            declareFunction("kbp_error", "KBP-ERROR", 2, 4, false);
            declareFunction("kbp_warn", "KBP-WARN", 2, 4, false);
            declareFunction("kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false);
            declareFunction("kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false);
            declareFunction("kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false);
            declareFunction("explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false);
            declareFunction("explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false);
            declareFunction("explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false);
            declareFunction("cr_paths_status", "CR-PATHS-STATUS", 0, 0, false);
            declareFunction("evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false);
            declareFunction("fort_name", "FORT-NAME", 1, 0, false);
            declareFunction("fort_nameL", "FORT-NAME<", 2, 0, false);
            declareFunction("assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false);
            declareFunction("assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false);
            declareFunction("focuses", "FOCUSES", 1, 4, false);
            declareFunction("genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false);
            declareFunction("remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false);
            declareFunction("remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false);
            declareFunction("remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false);
            declareFunction("remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false);
            declareFunction("remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false);
            declareFunction("remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false);
            declareFunction("candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false);
            declareFunction("candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false);
            declareFunction("candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false);
            declareFunction("appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false);
            declareFunction("genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false);
            declareFunction("genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false);
            declareFunction("meta_pred_specs", "META-PRED-SPECS", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("clear_cached_hpkb_relate_terms", "CLEAR-CACHED-HPKB-RELATE-TERMS", 0, 0, false);
            declareFunction("remove_cached_hpkb_relate_terms", "REMOVE-CACHED-HPKB-RELATE-TERMS", 3, 0, false);
            declareFunction("cached_hpkb_relate_terms_internal", "CACHED-HPKB-RELATE-TERMS-INTERNAL", 3, 0, false);
            declareFunction("cached_hpkb_relate_terms", "CACHED-HPKB-RELATE-TERMS", 3, 0, false);
            declareFunction("hpkb_relate_terms", "HPKB-RELATE-TERMS", 2, 1, false);
            declareFunction("hpkb_relate_terms_just", "HPKB-RELATE-TERMS-JUST", 2, 1, false);
            declareFunction("hpkb_relate_terms_assertions", "HPKB-RELATE-TERMS-ASSERTIONS", 2, 1, false);
            declareFunction("hpkb_relate_terms_assertions_nl", "HPKB-RELATE-TERMS-ASSERTIONS-NL", 2, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_kb_paths_file_Previous() {
        declareFunction("kb_paths", "KB-PATHS", 2, 1, false);
        declareFunction("kb_paths_n", "KB-PATHS-N", 2, 1, false);
        declareFunction("kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false);
        declareFunction("kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false);
        declareFunction("find_paths", "FIND-PATHS", 0, 2, false);
        declareFunction("complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false);
        declareFunction("complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false);
        declareFunction("complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false);
        declareFunction("extract_paths", "EXTRACT-PATHS", 0, 2, false);
        declareFunction("kbp_result", "KBP-RESULT", 0, 0, false);
        declareFunction("kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false);
        declareFunction("kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false);
        declareFunction("linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false);
        declareFunction("gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false);
        declareFunction("gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false);
        declareFunction("kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false);
        declareFunction("kbp_node_links", "KBP-NODE-LINKS", 1, 0, false);
        declareFunction("kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false);
        declareFunction("kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false);
        declareFunction("kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false);
        declareFunction("kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false);
        declareFunction("kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false);
        declareFunction("ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false);
        declareFunction("ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false);
        declareFunction("kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false);
        declareFunction("mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false);
        declareFunction("default_link_op", "DEFAULT-LINK-OP", 1, 2, false);
        declareFunction("default_node_op", "DEFAULT-NODE-OP", 1, 2, false);
        declareFunction("do_link_nodes", "DO-LINK-NODES", 1, 2, false);
        declareFunction("default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false);
        declareFunction("default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false);
        declareFunction("kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false);
        declareFunction("kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false);
        declareFunction("kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false);
        declareFunction("kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false);
        declareFunction("kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false);
        declareFunction("kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false);
        declareFunction("kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false);
        declareFunction("kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false);
        declareFunction("kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false);
        declareFunction("kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false);
        declareFunction("kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false);
        declareFunction("kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false);
        declareFunction("kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false);
        declareFunction("kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false);
        declareFunction("kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false);
        declareFunction("kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false);
        declareFunction("kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false);
        declareFunction("kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false);
        declareFunction("kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false);
        declareFunction("scope_direction", "SCOPE-DIRECTION", 2, 0, false);
        declareFunction("default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false);
        declareFunction("do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false);
        declareFunction("obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false);
        declareFunction("assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false);
        declareFunction("all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false);
        declareFunction("all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false);
        declareFunction("clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false);
        declareFunction("kbp_stats", "KBP-STATS", 1, 0, false);
        declareFunction("kbp_node_count", "KBP-NODE-COUNT", 0, 0, false);
        declareFunction("kbp_link_count", "KBP-LINK-COUNT", 0, 0, false);
        declareFunction("kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false);
        declareFunction("next_iteration", "NEXT-ITERATION", 0, 0, false);
        declareFunction("kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false);
        declareFunction("kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false);
        declareFunction("kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false);
        declareFunction("kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false);
        declareFunction("paths_link_count", "PATHS-LINK-COUNT", 1, 0, false);
        declareFunction("kbp_searcherP", "KBP-SEARCHER?", 1, 0, false);
        declareFunction("equal_nodesP", "EQUAL-NODES?", 2, 1, false);
        declareFunction("instance_btreeP", "INSTANCE-BTREE?", 1, 0, false);
        declareFunction("bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false);
        declareFunction("kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false);
        declareFunction("kbp_ancestors", "KBP-ANCESTORS", 1, 1, false);
        declareFunction("kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false);
        declareFunction("kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false);
        declareFunction("kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false);
        declareFunction("kbp_searchedP", "KBP-SEARCHED?", 1, 0, false);
        declareFunction("kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false);
        declareFunction("kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false);
        declareFunction("kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false);
        declareFunction("kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false);
        declareFunction("kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false);
        declareFunction("kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false);
        declareFunction("kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false);
        declareFunction("kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false);
        declareFunction("kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false);
        declareFunction("kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false);
        declareFunction("kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false);
        declareFunction("kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false);
        declareFunction("bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false);
        declareFunction("kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false);
        declareFunction("kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false);
        declareFunction("kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false);
        declareFunction("kbp_path_links", "KBP-PATH-LINKS", 1, 0, false);
        declareFunction("kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false);
        declareFunction("kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false);
        declareFunction("kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false);
        declareFunction("kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false);
        declareFunction("kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false);
        declareFunction("make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false);
        declareFunction("kbp_note", "KBP-NOTE", 2, 4, false);
        declareFunction("kbp_error", "KBP-ERROR", 2, 4, false);
        declareFunction("kbp_warn", "KBP-WARN", 2, 4, false);
        declareFunction("kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false);
        declareFunction("kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false);
        declareFunction("kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false);
        declareFunction("explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false);
        declareFunction("explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false);
        declareFunction("explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false);
        declareFunction("cr_paths_status", "CR-PATHS-STATUS", 0, 0, false);
        declareFunction("evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false);
        declareFunction("fort_name", "FORT-NAME", 1, 0, false);
        declareFunction("fort_nameL", "FORT-NAME<", 2, 0, false);
        declareFunction("assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false);
        declareFunction("assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false);
        declareFunction("focuses", "FOCUSES", 1, 4, false);
        declareFunction("genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false);
        declareFunction("remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false);
        declareFunction("remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false);
        declareFunction("remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false);
        declareFunction("remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false);
        declareFunction("remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false);
        declareFunction("remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false);
        declareFunction("candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false);
        declareFunction("candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false);
        declareFunction("candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false);
        declareFunction("appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false);
        declareFunction("genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false);
        declareFunction("genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false);
        declareFunction("meta_pred_specs", "META-PRED-SPECS", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_kb_paths_file_alt() {
        defparameter("*KBP-QUIT?*", NIL);
        defparameter("*KBP-RESULT-FORMAT*", $PATHS);
        defparameter("*SEARCH-ITERATION*", NIL);
        defparameter("*NODE-EQUAL?*", symbol_function(EQ));
        defparameter("*KBP-NODE?*", symbol_function(FORT_P));
        defparameter("*KBP-LINK?*", symbol_function(ASSERTION_P));
        defparameter("*KBP-STATS*", NIL);
        defparameter("*COLLECT-KBP-STATS?*", T);
        defparameter("*KBP-NODE-COUNT*", NIL);
        defparameter("*KBP-LINK-COUNT*", NIL);
        defparameter("*KBP-TERM-COUNT*", NIL);
        defparameter("*SOURCE-TERM-ARGS*", $list_alt14);
        defparameter("*TARGET-TERM-ARGS*", $list_alt16);
        defparameter("*RELEVANT-NODE-TREE?*", symbol_function(IDENTITY));
        defparameter("*PATH-SOURCE*", NIL);
        defparameter("*PATH-TARGET*", NIL);
        defparameter("*KBP-SEARCHER*", NIL);
        defparameter("*KBP-SEARCHERS*", NIL);
        defparameter("*PATH-HORIZON*", NIL);
        defparameter("*KBP-COMMON-NODES*", NIL);
        defparameter("*PATH-LINK-LATTICE*", NIL);
        defparameter("*PATH-NODE-LATTICE*", NIL);
        defparameter("*KBP-ANCESTOR*", NIL);
        defparameter("*KBP-RUN-TIME*", NIL);
        defparameter("*NODE-ANCESTORS*", NIL);
        defparameter("*LINK-ANCESTORS*", NIL);
        defparameter("*KBP-DEPTH*", NIL);
        defparameter("*KBP-NODES*", NIL);
        defparameter("*KBP-LINKS*", NIL);
        defparameter("*TERM-ARG*", NIL);
        defparameter("*KBP-ANCESTOR-HASH*", make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*KBP-SEARCH-HASH*", make_hash_table($int$2048, UNPROVIDED, UNPROVIDED));
        defparameter("*KBP-MIN-ISA-PATH?*", T);
        defparameter("*KBP-MIN-GENLS-PATH?*", T);
        defparameter("*KBP-DESIGNATED-NODE-SUPERIORS?*", T);
        defparameter("*KBP-DESIGNATED-NODE-SUPERIORS*", NIL);
        defparameter("*KBP-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*MAX-SEARCH-ITERATIONS*", FIVE_INTEGER);
        defparameter("*LIMIT-PATH-DEPTH?*", T);
        defparameter("*KBP-MAX-DEPTH*", NIL);
        defparameter("*KBP-MAX-TERM-COUNT*", $int$1000);
        defparameter("*KBP-QUIT-WITH-SUCCESS?*", NIL);
        defparameter("*KBP-ONLY-GAF-LINKS?*", T);
        defparameter("*KBP-NO-BOOKKEEPING-LINKS?*", T);
        defparameter("*KBP-NO-INSTANCE-LINKS?*", T);
        defparameter("*KBP-NO-BI-SCOPING-LINKS?*", NIL);
        defparameter("*KBP-EXPLODE-NATS?*", NIL);
        defparameter("*KBP-DESIGNATED-PREDS?*", T);
        defparameter("*KBP-DESIGNATED-PREDS*", NIL);
        defparameter("*KBP-RESTRICTED-PREDS?*", T);
        defparameter("*KBP-RESTRICTED-PREDS*", NIL);
        defparameter("*KBP-RESTRICTED-MTS?*", NIL);
        defparameter("*KBP-RESTRICTED-MTS*", $list_alt59);
        defparameter("*KBP-EXTERNAL-LINK-PRED?*", NIL);
        defparameter("*KBP-EXTERNAL-LINK-PRED*", NIL);
        defparameter("*KBP-GENL-BOUND?*", T);
        defparameter("*KBP-GENL-BOUND*", NIL);
        defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", T);
        defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND*", TWENTY_INTEGER);
        defparameter("*KBP-ISA-BOUND?*", T);
        defparameter("*KBP-ISA-BOUND*", NIL);
        defparameter("*KBP-NODE-ISA-BOUND?*", T);
        defparameter("*KBP-NODE-ISA-BOUND*", NIL);
        defparameter("*KBP-RESTRICTED-NODES-AS-ARG?*", T);
        defparameter("*KBP-RESTRICTED-NODES-AS-ARG*", $list_alt72);
        defparameter("*KBP-LINK-REFERENCE-SET-BOUND?*", T);
        defparameter("*KBP-LINK-REFERENCE-SET-BOUND*", NIL);
        defparameter("*KBP-DESIGNATED-LINK-REFERENCES?*", T);
        defparameter("*KBP-DESIGNATED-LINK-REFERENCES*", NIL);
        defparameter("*KBP-BOUND-GAF-TERMS?*", T);
        defparameter("*KBP-BOUND-GAF-TERMS*", $list_alt79);
        defparameter("*KBP-BOUND-LINK-TERMS?*", T);
        defparameter("*KBP-BOUND-LINK-TERMS*", NIL);
        defparameter("*KBP-USE-MAX-MTS?*", NIL);
        defparameter("*NODES-ACCESSOR-FN*", NIL);
        defparameter("*PATH-LINK-OP*", NIL);
        defparameter("*PATH-NODE-OP*", NIL);
        defparameter("*RELEVANT-LINK?*", NIL);
        defparameter("*RELEVANT-NODE?*", NIL);
        defparameter("*RELEVANT-LINK-TREE?*", NIL);
        defparameter("*EXCLUDE-NODES*", NIL);
        defparameter("*EXCLUDE-LINKS*", NIL);
        defparameter("*CR-PATHS-TABLE*", make_hash_table($int$1024, UNPROVIDED, UNPROVIDED));
        defparameter("*CR-GAF-COUNT*", ZERO_INTEGER);
        defparameter("*CR-EXPLAINED-COUNT*", ZERO_INTEGER);
        defparameter("*CR-ERROR-COUNT*", ZERO_INTEGER);
        deflexical("*CACHED-HPKB-RELATE-TERMS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_kb_paths_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*KBP-QUIT?*", NIL);
            defparameter("*KBP-RESULT-FORMAT*", $PATHS);
            defparameter("*SEARCH-ITERATION*", NIL);
            defparameter("*NODE-EQUAL?*", symbol_function(EQL));
            defparameter("*KBP-NODE?*", symbol_function(FORT_P));
            defparameter("*KBP-LINK?*", symbol_function(ASSERTION_P));
            defparameter("*KBP-STATS*", NIL);
            defparameter("*COLLECT-KBP-STATS?*", T);
            defparameter("*KBP-NODE-COUNT*", NIL);
            defparameter("*KBP-LINK-COUNT*", NIL);
            defparameter("*KBP-TERM-COUNT*", NIL);
            defparameter("*SOURCE-TERM-ARGS*", $list14);
            defparameter("*TARGET-TERM-ARGS*", $list16);
            defparameter("*RELEVANT-NODE-TREE?*", symbol_function(IDENTITY));
            defparameter("*PATH-SOURCE*", NIL);
            defparameter("*PATH-TARGET*", NIL);
            defparameter("*KBP-SEARCHER*", NIL);
            defparameter("*KBP-SEARCHERS*", NIL);
            defparameter("*PATH-HORIZON*", NIL);
            defparameter("*KBP-COMMON-NODES*", NIL);
            defparameter("*PATH-LINK-LATTICE*", NIL);
            defparameter("*PATH-NODE-LATTICE*", NIL);
            defparameter("*KBP-ANCESTOR*", NIL);
            defparameter("*KBP-RUN-TIME*", NIL);
            defparameter("*NODE-ANCESTORS*", NIL);
            defparameter("*LINK-ANCESTORS*", NIL);
            defparameter("*KBP-DEPTH*", NIL);
            defparameter("*KBP-NODES*", NIL);
            defparameter("*KBP-LINKS*", NIL);
            defparameter("*TERM-ARG*", NIL);
            defparameter("*KBP-ANCESTOR-HASH*", make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
            defparameter("*KBP-SEARCH-HASH*", make_hash_table($int$2048, UNPROVIDED, UNPROVIDED));
            defparameter("*KBP-MIN-ISA-PATH?*", T);
            defparameter("*KBP-MIN-GENLS-PATH?*", T);
            defparameter("*KBP-DESIGNATED-NODE-SUPERIORS?*", T);
            defparameter("*KBP-DESIGNATED-NODE-SUPERIORS*", NIL);
            defparameter("*KBP-TRACE-LEVEL*", ZERO_INTEGER);
            defparameter("*MAX-SEARCH-ITERATIONS*", FIVE_INTEGER);
            defparameter("*LIMIT-PATH-DEPTH?*", T);
            defparameter("*KBP-MAX-DEPTH*", NIL);
            defparameter("*KBP-MAX-TERM-COUNT*", $int$1000);
            defparameter("*KBP-QUIT-WITH-SUCCESS?*", NIL);
            defparameter("*KBP-ONLY-GAF-LINKS?*", T);
            defparameter("*KBP-NO-BOOKKEEPING-LINKS?*", T);
            defparameter("*KBP-NO-INSTANCE-LINKS?*", T);
            defparameter("*KBP-NO-BI-SCOPING-LINKS?*", NIL);
            defparameter("*KBP-EXPLODE-NATS?*", NIL);
            defparameter("*KBP-DESIGNATED-PREDS?*", T);
            defparameter("*KBP-DESIGNATED-PREDS*", NIL);
            defparameter("*KBP-RESTRICTED-PREDS?*", T);
            defparameter("*KBP-RESTRICTED-PREDS*", NIL);
            defparameter("*KBP-RESTRICTED-MTS?*", NIL);
            defparameter("*KBP-RESTRICTED-MTS*", $list59);
            defparameter("*KBP-EXTERNAL-LINK-PRED?*", NIL);
            defparameter("*KBP-EXTERNAL-LINK-PRED*", NIL);
            defparameter("*KBP-GENL-BOUND?*", T);
            defparameter("*KBP-GENL-BOUND*", NIL);
            defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", T);
            defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND*", TWENTY_INTEGER);
            defparameter("*KBP-ISA-BOUND?*", T);
            defparameter("*KBP-ISA-BOUND*", NIL);
            defparameter("*KBP-NODE-ISA-BOUND?*", T);
            defparameter("*KBP-NODE-ISA-BOUND*", NIL);
            defparameter("*KBP-RESTRICTED-NODES-AS-ARG?*", T);
            defparameter("*KBP-RESTRICTED-NODES-AS-ARG*", $list72);
            defparameter("*KBP-LINK-REFERENCE-SET-BOUND?*", T);
            defparameter("*KBP-LINK-REFERENCE-SET-BOUND*", NIL);
            defparameter("*KBP-DESIGNATED-LINK-REFERENCES?*", T);
            defparameter("*KBP-DESIGNATED-LINK-REFERENCES*", NIL);
            defparameter("*KBP-BOUND-GAF-TERMS?*", T);
            defparameter("*KBP-BOUND-GAF-TERMS*", $list79);
            defparameter("*KBP-BOUND-LINK-TERMS?*", T);
            defparameter("*KBP-BOUND-LINK-TERMS*", NIL);
            defparameter("*KBP-USE-MAX-MTS?*", NIL);
            defparameter("*NODES-ACCESSOR-FN*", NIL);
            defparameter("*PATH-LINK-OP*", NIL);
            defparameter("*PATH-NODE-OP*", NIL);
            defparameter("*RELEVANT-LINK?*", NIL);
            defparameter("*RELEVANT-NODE?*", NIL);
            defparameter("*RELEVANT-LINK-TREE?*", NIL);
            defparameter("*EXCLUDE-NODES*", NIL);
            defparameter("*EXCLUDE-LINKS*", NIL);
            defparameter("*CR-PATHS-TABLE*", make_hash_table($int$1024, UNPROVIDED, UNPROVIDED));
            defparameter("*CR-GAF-COUNT*", ZERO_INTEGER);
            defparameter("*CR-EXPLAINED-COUNT*", ZERO_INTEGER);
            defparameter("*CR-ERROR-COUNT*", ZERO_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*NODE-EQUAL?*", symbol_function(EQ));
            deflexical("*CACHED-HPKB-RELATE-TERMS-CACHING-STATE*", NIL);
        }
        return NIL;
    }

    public static SubLObject init_kb_paths_file_Previous() {
        defparameter("*KBP-QUIT?*", NIL);
        defparameter("*KBP-RESULT-FORMAT*", $PATHS);
        defparameter("*SEARCH-ITERATION*", NIL);
        defparameter("*NODE-EQUAL?*", symbol_function(EQL));
        defparameter("*KBP-NODE?*", symbol_function(FORT_P));
        defparameter("*KBP-LINK?*", symbol_function(ASSERTION_P));
        defparameter("*KBP-STATS*", NIL);
        defparameter("*COLLECT-KBP-STATS?*", T);
        defparameter("*KBP-NODE-COUNT*", NIL);
        defparameter("*KBP-LINK-COUNT*", NIL);
        defparameter("*KBP-TERM-COUNT*", NIL);
        defparameter("*SOURCE-TERM-ARGS*", $list14);
        defparameter("*TARGET-TERM-ARGS*", $list16);
        defparameter("*RELEVANT-NODE-TREE?*", symbol_function(IDENTITY));
        defparameter("*PATH-SOURCE*", NIL);
        defparameter("*PATH-TARGET*", NIL);
        defparameter("*KBP-SEARCHER*", NIL);
        defparameter("*KBP-SEARCHERS*", NIL);
        defparameter("*PATH-HORIZON*", NIL);
        defparameter("*KBP-COMMON-NODES*", NIL);
        defparameter("*PATH-LINK-LATTICE*", NIL);
        defparameter("*PATH-NODE-LATTICE*", NIL);
        defparameter("*KBP-ANCESTOR*", NIL);
        defparameter("*KBP-RUN-TIME*", NIL);
        defparameter("*NODE-ANCESTORS*", NIL);
        defparameter("*LINK-ANCESTORS*", NIL);
        defparameter("*KBP-DEPTH*", NIL);
        defparameter("*KBP-NODES*", NIL);
        defparameter("*KBP-LINKS*", NIL);
        defparameter("*TERM-ARG*", NIL);
        defparameter("*KBP-ANCESTOR-HASH*", make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*KBP-SEARCH-HASH*", make_hash_table($int$2048, UNPROVIDED, UNPROVIDED));
        defparameter("*KBP-MIN-ISA-PATH?*", T);
        defparameter("*KBP-MIN-GENLS-PATH?*", T);
        defparameter("*KBP-DESIGNATED-NODE-SUPERIORS?*", T);
        defparameter("*KBP-DESIGNATED-NODE-SUPERIORS*", NIL);
        defparameter("*KBP-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*MAX-SEARCH-ITERATIONS*", FIVE_INTEGER);
        defparameter("*LIMIT-PATH-DEPTH?*", T);
        defparameter("*KBP-MAX-DEPTH*", NIL);
        defparameter("*KBP-MAX-TERM-COUNT*", $int$1000);
        defparameter("*KBP-QUIT-WITH-SUCCESS?*", NIL);
        defparameter("*KBP-ONLY-GAF-LINKS?*", T);
        defparameter("*KBP-NO-BOOKKEEPING-LINKS?*", T);
        defparameter("*KBP-NO-INSTANCE-LINKS?*", T);
        defparameter("*KBP-NO-BI-SCOPING-LINKS?*", NIL);
        defparameter("*KBP-EXPLODE-NATS?*", NIL);
        defparameter("*KBP-DESIGNATED-PREDS?*", T);
        defparameter("*KBP-DESIGNATED-PREDS*", NIL);
        defparameter("*KBP-RESTRICTED-PREDS?*", T);
        defparameter("*KBP-RESTRICTED-PREDS*", NIL);
        defparameter("*KBP-RESTRICTED-MTS?*", NIL);
        defparameter("*KBP-RESTRICTED-MTS*", $list59);
        defparameter("*KBP-EXTERNAL-LINK-PRED?*", NIL);
        defparameter("*KBP-EXTERNAL-LINK-PRED*", NIL);
        defparameter("*KBP-GENL-BOUND?*", T);
        defparameter("*KBP-GENL-BOUND*", NIL);
        defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", T);
        defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND*", TWENTY_INTEGER);
        defparameter("*KBP-ISA-BOUND?*", T);
        defparameter("*KBP-ISA-BOUND*", NIL);
        defparameter("*KBP-NODE-ISA-BOUND?*", T);
        defparameter("*KBP-NODE-ISA-BOUND*", NIL);
        defparameter("*KBP-RESTRICTED-NODES-AS-ARG?*", T);
        defparameter("*KBP-RESTRICTED-NODES-AS-ARG*", $list72);
        defparameter("*KBP-LINK-REFERENCE-SET-BOUND?*", T);
        defparameter("*KBP-LINK-REFERENCE-SET-BOUND*", NIL);
        defparameter("*KBP-DESIGNATED-LINK-REFERENCES?*", T);
        defparameter("*KBP-DESIGNATED-LINK-REFERENCES*", NIL);
        defparameter("*KBP-BOUND-GAF-TERMS?*", T);
        defparameter("*KBP-BOUND-GAF-TERMS*", $list79);
        defparameter("*KBP-BOUND-LINK-TERMS?*", T);
        defparameter("*KBP-BOUND-LINK-TERMS*", NIL);
        defparameter("*KBP-USE-MAX-MTS?*", NIL);
        defparameter("*NODES-ACCESSOR-FN*", NIL);
        defparameter("*PATH-LINK-OP*", NIL);
        defparameter("*PATH-NODE-OP*", NIL);
        defparameter("*RELEVANT-LINK?*", NIL);
        defparameter("*RELEVANT-NODE?*", NIL);
        defparameter("*RELEVANT-LINK-TREE?*", NIL);
        defparameter("*EXCLUDE-NODES*", NIL);
        defparameter("*EXCLUDE-LINKS*", NIL);
        defparameter("*CR-PATHS-TABLE*", make_hash_table($int$1024, UNPROVIDED, UNPROVIDED));
        defparameter("*CR-GAF-COUNT*", ZERO_INTEGER);
        defparameter("*CR-EXPLAINED-COUNT*", ZERO_INTEGER);
        defparameter("*CR-ERROR-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kb_paths_file_alt() {
        {
            SubLObject item_var = $kbp_quitP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_quitP$, NIL);
        {
            SubLObject item_var = $kbp_result_format$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_result_format$, NIL);
        {
            SubLObject item_var = $search_iteration$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($search_iteration$, NIL);
        {
            SubLObject item_var = $node_equalP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($node_equalP$, NIL);
        {
            SubLObject item_var = $kbp_nodeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_nodeP$, NIL);
        {
            SubLObject item_var = $kbp_linkP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_linkP$, NIL);
        {
            SubLObject item_var = $kbp_stats$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_stats$, NIL);
        {
            SubLObject item_var = $collect_kbp_statsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($collect_kbp_statsP$, NIL);
        {
            SubLObject item_var = $kbp_node_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_node_count$, NIL);
        {
            SubLObject item_var = $kbp_link_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_link_count$, NIL);
        {
            SubLObject item_var = $kbp_term_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_term_count$, NIL);
        {
            SubLObject item_var = $source_term_args$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($source_term_args$, NIL);
        {
            SubLObject item_var = $target_term_args$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($target_term_args$, NIL);
        {
            SubLObject item_var = $relevant_node_treeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($relevant_node_treeP$, NIL);
        {
            SubLObject item_var = $path_source$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_source$, NIL);
        {
            SubLObject item_var = $path_target$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_target$, NIL);
        {
            SubLObject item_var = $kbp_searcher$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_searcher$, NIL);
        {
            SubLObject item_var = $kbp_searchers$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_searchers$, NIL);
        {
            SubLObject item_var = $path_horizon$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_horizon$, NIL);
        {
            SubLObject item_var = $kbp_common_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_common_nodes$, NIL);
        {
            SubLObject item_var = $path_link_lattice$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_link_lattice$, NIL);
        {
            SubLObject item_var = $path_node_lattice$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_node_lattice$, NIL);
        {
            SubLObject item_var = $kbp_ancestor$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_ancestor$, NIL);
        {
            SubLObject item_var = $kbp_run_time$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_run_time$, NIL);
        {
            SubLObject item_var = $node_ancestors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($node_ancestors$, NIL);
        {
            SubLObject item_var = $link_ancestors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($link_ancestors$, NIL);
        {
            SubLObject item_var = $kbp_depth$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_depth$, NIL);
        {
            SubLObject item_var = $kbp_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_nodes$, NIL);
        {
            SubLObject item_var = $kbp_links$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_links$, NIL);
        {
            SubLObject item_var = $term_arg$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($term_arg$, NIL);
        {
            SubLObject item_var = $kbp_ancestor_hash$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_ancestor_hash$, NIL);
        {
            SubLObject item_var = $kbp_search_hash$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_search_hash$, NIL);
        {
            SubLObject item_var = $kbp_min_isa_pathP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_min_isa_pathP$, NIL);
        {
            SubLObject item_var = $kbp_min_genls_pathP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_min_genls_pathP$, NIL);
        {
            SubLObject item_var = $kbp_designated_node_superiorsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_node_superiorsP$, NIL);
        {
            SubLObject item_var = $kbp_designated_node_superiors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_node_superiors$, NIL);
        {
            SubLObject item_var = $kbp_trace_level$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_trace_level$, NIL);
        {
            SubLObject item_var = $max_search_iterations$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($max_search_iterations$, NIL);
        {
            SubLObject item_var = $limit_path_depthP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($limit_path_depthP$, NIL);
        {
            SubLObject item_var = $kbp_max_depth$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_max_depth$, NIL);
        {
            SubLObject item_var = $kbp_max_term_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_max_term_count$, NIL);
        {
            SubLObject item_var = $kbp_quit_with_successP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_quit_with_successP$, NIL);
        {
            SubLObject item_var = $kbp_only_gaf_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_only_gaf_linksP$, NIL);
        {
            SubLObject item_var = $kbp_no_bookkeeping_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_no_bookkeeping_linksP$, NIL);
        {
            SubLObject item_var = $kbp_no_instance_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_no_instance_linksP$, NIL);
        {
            SubLObject item_var = $kbp_no_bi_scoping_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_no_bi_scoping_linksP$, NIL);
        {
            SubLObject item_var = $kbp_explode_natsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_explode_natsP$, NIL);
        {
            SubLObject item_var = $kbp_designated_predsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_predsP$, NIL);
        {
            SubLObject item_var = $kbp_designated_preds$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_preds$, NIL);
        {
            SubLObject item_var = $kbp_restricted_predsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_predsP$, NIL);
        {
            SubLObject item_var = $kbp_restricted_preds$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_preds$, NIL);
        {
            SubLObject item_var = $kbp_restricted_mtsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_mtsP$, NIL);
        {
            SubLObject item_var = $kbp_restricted_mts$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_mts$, NIL);
        {
            SubLObject item_var = $kbp_external_link_predP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_external_link_predP$, NIL);
        {
            SubLObject item_var = $kbp_external_link_pred$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_external_link_pred$, NIL);
        {
            SubLObject item_var = $kbp_genl_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_genl_boundP$, NIL);
        {
            SubLObject item_var = $kbp_genl_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_genl_bound$, NIL);
        {
            SubLObject item_var = $kbp_genls_cardinality_delta_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_genls_cardinality_delta_boundP$, NIL);
        {
            SubLObject item_var = $kbp_genls_cardinality_delta_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_genls_cardinality_delta_bound$, NIL);
        {
            SubLObject item_var = $kbp_isa_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_isa_boundP$, NIL);
        {
            SubLObject item_var = $kbp_isa_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_isa_bound$, NIL);
        {
            SubLObject item_var = $kbp_node_isa_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_node_isa_boundP$, NIL);
        {
            SubLObject item_var = $kbp_node_isa_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_node_isa_bound$, NIL);
        {
            SubLObject item_var = $kbp_restricted_nodes_as_argP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_nodes_as_argP$, NIL);
        {
            SubLObject item_var = $kbp_restricted_nodes_as_arg$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_restricted_nodes_as_arg$, NIL);
        {
            SubLObject item_var = $kbp_link_reference_set_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_link_reference_set_boundP$, NIL);
        {
            SubLObject item_var = $kbp_link_reference_set_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_link_reference_set_bound$, NIL);
        {
            SubLObject item_var = $kbp_designated_link_referencesP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_link_referencesP$, NIL);
        {
            SubLObject item_var = $kbp_designated_link_references$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_designated_link_references$, NIL);
        {
            SubLObject item_var = $kbp_bound_gaf_termsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_bound_gaf_termsP$, NIL);
        {
            SubLObject item_var = $kbp_bound_gaf_terms$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_bound_gaf_terms$, NIL);
        {
            SubLObject item_var = $kbp_bound_link_termsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_bound_link_termsP$, NIL);
        {
            SubLObject item_var = $kbp_bound_link_terms$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_bound_link_terms$, NIL);
        {
            SubLObject item_var = $kbp_use_max_mtsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($kbp_use_max_mtsP$, NIL);
        {
            SubLObject item_var = $nodes_accessor_fn$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($nodes_accessor_fn$, NIL);
        {
            SubLObject item_var = $path_link_op$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_link_op$, NIL);
        {
            SubLObject item_var = $path_node_op$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($path_node_op$, NIL);
        {
            SubLObject item_var = $relevant_linkP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($relevant_linkP$, NIL);
        {
            SubLObject item_var = $relevant_nodeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($relevant_nodeP$, NIL);
        {
            SubLObject item_var = $relevant_link_treeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($relevant_link_treeP$, NIL);
        {
            SubLObject item_var = $exclude_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($exclude_nodes$, NIL);
        {
            SubLObject item_var = $exclude_links$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        note_state_variable_documentation($exclude_links$, NIL);
        memoization_state.note_globally_cached_function(CACHED_HPKB_RELATE_TERMS);
        return NIL;
    }

    public static SubLObject setup_kb_paths_file() {
        if (SubLFiles.USE_V1) {
            SubLObject item_var = $kbp_quitP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_result_format$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $search_iteration$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $node_equalP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_nodeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_linkP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_stats$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $collect_kbp_statsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_node_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_link_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_term_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $source_term_args$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $target_term_args$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $relevant_node_treeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_source$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_target$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_searcher$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_searchers$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_horizon$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_common_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_link_lattice$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_node_lattice$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_ancestor$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_run_time$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $node_ancestors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $link_ancestors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_depth$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_links$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $term_arg$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_ancestor_hash$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_search_hash$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_min_isa_pathP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_min_genls_pathP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_node_superiorsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_node_superiors$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_trace_level$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $max_search_iterations$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $limit_path_depthP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_max_depth$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_max_term_count$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_quit_with_successP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_only_gaf_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_no_bookkeeping_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_no_instance_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_no_bi_scoping_linksP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_explode_natsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_predsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_preds$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_predsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_preds$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_mtsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_mts$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_external_link_predP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_external_link_pred$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_genl_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_genl_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_genls_cardinality_delta_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_genls_cardinality_delta_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_isa_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_isa_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_node_isa_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_node_isa_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_nodes_as_argP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_restricted_nodes_as_arg$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_link_reference_set_boundP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_link_reference_set_bound$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_link_referencesP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_designated_link_references$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_bound_gaf_termsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_bound_gaf_terms$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_bound_link_termsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_bound_link_terms$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $kbp_use_max_mtsP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $nodes_accessor_fn$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_link_op$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $path_node_op$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $relevant_linkP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $relevant_nodeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $relevant_link_treeP$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $exclude_nodes$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
            item_var = $exclude_links$;
            if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
            }
        }
        if (SubLFiles.USE_V2) {
            {
                SubLObject item_var = $kbp_quitP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_quitP$, NIL);
            {
                SubLObject item_var = $kbp_result_format$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_result_format$, NIL);
            {
                SubLObject item_var = $search_iteration$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($search_iteration$, NIL);
            {
                SubLObject item_var = $node_equalP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($node_equalP$, NIL);
            {
                SubLObject item_var = $kbp_nodeP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_nodeP$, NIL);
            {
                SubLObject item_var = $kbp_linkP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_linkP$, NIL);
            {
                SubLObject item_var = $kbp_stats$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_stats$, NIL);
            {
                SubLObject item_var = $collect_kbp_statsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($collect_kbp_statsP$, NIL);
            {
                SubLObject item_var = $kbp_node_count$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_node_count$, NIL);
            {
                SubLObject item_var = $kbp_link_count$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_link_count$, NIL);
            {
                SubLObject item_var = $kbp_term_count$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_term_count$, NIL);
            {
                SubLObject item_var = $source_term_args$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($source_term_args$, NIL);
            {
                SubLObject item_var = $target_term_args$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($target_term_args$, NIL);
            {
                SubLObject item_var = $relevant_node_treeP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($relevant_node_treeP$, NIL);
            {
                SubLObject item_var = $path_source$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_source$, NIL);
            {
                SubLObject item_var = $path_target$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_target$, NIL);
            {
                SubLObject item_var = $kbp_searcher$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_searcher$, NIL);
            {
                SubLObject item_var = $kbp_searchers$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_searchers$, NIL);
            {
                SubLObject item_var = $path_horizon$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_horizon$, NIL);
            {
                SubLObject item_var = $kbp_common_nodes$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_common_nodes$, NIL);
            {
                SubLObject item_var = $path_link_lattice$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_link_lattice$, NIL);
            {
                SubLObject item_var = $path_node_lattice$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_node_lattice$, NIL);
            {
                SubLObject item_var = $kbp_ancestor$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_ancestor$, NIL);
            {
                SubLObject item_var = $kbp_run_time$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_run_time$, NIL);
            {
                SubLObject item_var = $node_ancestors$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($node_ancestors$, NIL);
            {
                SubLObject item_var = $link_ancestors$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($link_ancestors$, NIL);
            {
                SubLObject item_var = $kbp_depth$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_depth$, NIL);
            {
                SubLObject item_var = $kbp_nodes$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_nodes$, NIL);
            {
                SubLObject item_var = $kbp_links$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_links$, NIL);
            {
                SubLObject item_var = $term_arg$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($term_arg$, NIL);
            {
                SubLObject item_var = $kbp_ancestor_hash$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_ancestor_hash$, NIL);
            {
                SubLObject item_var = $kbp_search_hash$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_search_hash$, NIL);
            {
                SubLObject item_var = $kbp_min_isa_pathP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_min_isa_pathP$, NIL);
            {
                SubLObject item_var = $kbp_min_genls_pathP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_min_genls_pathP$, NIL);
            {
                SubLObject item_var = $kbp_designated_node_superiorsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_node_superiorsP$, NIL);
            {
                SubLObject item_var = $kbp_designated_node_superiors$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_node_superiors$, NIL);
            {
                SubLObject item_var = $kbp_trace_level$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_trace_level$, NIL);
            {
                SubLObject item_var = $max_search_iterations$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($max_search_iterations$, NIL);
            {
                SubLObject item_var = $limit_path_depthP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($limit_path_depthP$, NIL);
            {
                SubLObject item_var = $kbp_max_depth$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_max_depth$, NIL);
            {
                SubLObject item_var = $kbp_max_term_count$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_max_term_count$, NIL);
            {
                SubLObject item_var = $kbp_quit_with_successP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_quit_with_successP$, NIL);
            {
                SubLObject item_var = $kbp_only_gaf_linksP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_only_gaf_linksP$, NIL);
            {
                SubLObject item_var = $kbp_no_bookkeeping_linksP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_no_bookkeeping_linksP$, NIL);
            {
                SubLObject item_var = $kbp_no_instance_linksP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_no_instance_linksP$, NIL);
            {
                SubLObject item_var = $kbp_no_bi_scoping_linksP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_no_bi_scoping_linksP$, NIL);
            {
                SubLObject item_var = $kbp_explode_natsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_explode_natsP$, NIL);
            {
                SubLObject item_var = $kbp_designated_predsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_predsP$, NIL);
            {
                SubLObject item_var = $kbp_designated_preds$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_preds$, NIL);
            {
                SubLObject item_var = $kbp_restricted_predsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_predsP$, NIL);
            {
                SubLObject item_var = $kbp_restricted_preds$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_preds$, NIL);
            {
                SubLObject item_var = $kbp_restricted_mtsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_mtsP$, NIL);
            {
                SubLObject item_var = $kbp_restricted_mts$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_mts$, NIL);
            {
                SubLObject item_var = $kbp_external_link_predP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_external_link_predP$, NIL);
            {
                SubLObject item_var = $kbp_external_link_pred$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_external_link_pred$, NIL);
            {
                SubLObject item_var = $kbp_genl_boundP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_genl_boundP$, NIL);
            {
                SubLObject item_var = $kbp_genl_bound$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_genl_bound$, NIL);
            {
                SubLObject item_var = $kbp_genls_cardinality_delta_boundP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_genls_cardinality_delta_boundP$, NIL);
            {
                SubLObject item_var = $kbp_genls_cardinality_delta_bound$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_genls_cardinality_delta_bound$, NIL);
            {
                SubLObject item_var = $kbp_isa_boundP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_isa_boundP$, NIL);
            {
                SubLObject item_var = $kbp_isa_bound$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_isa_bound$, NIL);
            {
                SubLObject item_var = $kbp_node_isa_boundP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_node_isa_boundP$, NIL);
            {
                SubLObject item_var = $kbp_node_isa_bound$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_node_isa_bound$, NIL);
            {
                SubLObject item_var = $kbp_restricted_nodes_as_argP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_nodes_as_argP$, NIL);
            {
                SubLObject item_var = $kbp_restricted_nodes_as_arg$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_restricted_nodes_as_arg$, NIL);
            {
                SubLObject item_var = $kbp_link_reference_set_boundP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_link_reference_set_boundP$, NIL);
            {
                SubLObject item_var = $kbp_link_reference_set_bound$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_link_reference_set_bound$, NIL);
            {
                SubLObject item_var = $kbp_designated_link_referencesP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_link_referencesP$, NIL);
            {
                SubLObject item_var = $kbp_designated_link_references$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_designated_link_references$, NIL);
            {
                SubLObject item_var = $kbp_bound_gaf_termsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_bound_gaf_termsP$, NIL);
            {
                SubLObject item_var = $kbp_bound_gaf_terms$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_bound_gaf_terms$, NIL);
            {
                SubLObject item_var = $kbp_bound_link_termsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_bound_link_termsP$, NIL);
            {
                SubLObject item_var = $kbp_bound_link_terms$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_bound_link_terms$, NIL);
            {
                SubLObject item_var = $kbp_use_max_mtsP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($kbp_use_max_mtsP$, NIL);
            {
                SubLObject item_var = $nodes_accessor_fn$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($nodes_accessor_fn$, NIL);
            {
                SubLObject item_var = $path_link_op$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_link_op$, NIL);
            {
                SubLObject item_var = $path_node_op$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($path_node_op$, NIL);
            {
                SubLObject item_var = $relevant_linkP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($relevant_linkP$, NIL);
            {
                SubLObject item_var = $relevant_nodeP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($relevant_nodeP$, NIL);
            {
                SubLObject item_var = $relevant_link_treeP$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($relevant_link_treeP$, NIL);
            {
                SubLObject item_var = $exclude_nodes$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($exclude_nodes$, NIL);
            {
                SubLObject item_var = $exclude_links$;
                if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
                }
            }
            note_state_variable_documentation($exclude_links$, NIL);
            memoization_state.note_globally_cached_function(CACHED_HPKB_RELATE_TERMS);
        }
        return NIL;
    }

    public static SubLObject setup_kb_paths_file_Previous() {
        SubLObject item_var = $kbp_quitP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_result_format$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $search_iteration$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $node_equalP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_nodeP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_linkP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_stats$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $collect_kbp_statsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_node_count$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_link_count$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_term_count$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $source_term_args$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $target_term_args$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $relevant_node_treeP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_source$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_target$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_searcher$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_searchers$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_horizon$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_common_nodes$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_link_lattice$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_node_lattice$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_ancestor$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_run_time$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $node_ancestors$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $link_ancestors$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_depth$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_nodes$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_links$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $term_arg$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_ancestor_hash$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_search_hash$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_min_isa_pathP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_min_genls_pathP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_node_superiorsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_node_superiors$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_trace_level$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $max_search_iterations$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $limit_path_depthP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_max_depth$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_max_term_count$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_quit_with_successP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_only_gaf_linksP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_no_bookkeeping_linksP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_no_instance_linksP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_no_bi_scoping_linksP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_explode_natsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_predsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_preds$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_predsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_preds$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_mtsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_mts$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_external_link_predP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_external_link_pred$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_genl_boundP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_genl_bound$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_genls_cardinality_delta_boundP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_genls_cardinality_delta_bound$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_isa_boundP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_isa_bound$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_node_isa_boundP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_node_isa_bound$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_nodes_as_argP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_restricted_nodes_as_arg$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_link_reference_set_boundP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_link_reference_set_bound$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_link_referencesP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_designated_link_references$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_bound_gaf_termsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_bound_gaf_terms$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_bound_link_termsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_bound_link_terms$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $kbp_use_max_mtsP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $nodes_accessor_fn$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_link_op$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $path_node_op$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $relevant_linkP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $relevant_nodeP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $relevant_link_treeP$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $exclude_nodes$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        item_var = $exclude_links$;
        if (NIL == member(item_var, $kbp_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $kbp_state_variables$.setGlobalValue(cons(item_var, $kbp_state_variables$.getGlobalValue()));
        }
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_paths_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_paths_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_paths_file();
    }

    static {
    }

    static private final SubLList $list_alt14 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    static private final SubLList $list_alt16 = list(ONE_INTEGER, TWO_INTEGER, FOUR_INTEGER, FOUR_INTEGER, FIVE_INTEGER);

    static private final SubLList $list_alt59 = list(reader_make_constant_shell("EnglishMt"));

    static private final SubLList $list_alt72 = list(list(reader_make_constant_shell("quotedCollection"), ONE_INTEGER));

    static private final SubLList $list_alt79 = list(ZERO_INTEGER);

    static private final SubLString $str_alt103$horizons_missed__iteration__s = makeString("horizons missed; iteration ~s");

    static private final SubLString $str_alt107$____kbp_common_nodes___a = makeString("~%~%kbp common nodes: ~a");

    static private final SubLString $str_alt108$____complete_paths_home_from___s_ = makeString("~%~%complete-paths-home-from: ~s ~%~s");

    static private final SubLString $str_alt109$_____acomplete_paths_home_from_li = makeString("~%~%~acomplete-paths-home-from-link: ~s ~%~a~s");

    static private final SubLString $str_alt110$_____acomplete_paths_home_from_no = makeString("~%~%~acomplete-paths-home-from-node: ~s ~%~a~s");

    static private final SubLString $str_alt112$invalid_path_format___s = makeString("invalid path format: ~s");

    static private final SubLList $list_alt113 = list(makeSymbol("ROOT"), makeSymbol("&OPTIONAL"), makeSymbol("LINKS"));

    static private final SubLString $str_alt114$_____agather_node_latice____a_s = makeString("~%~%~agather-node-latice:~%~a~s");

    static private final SubLString $str_alt115$_____agather_link_latice_____a_s = makeString("~%~%~agather-link-latice: ~%~a~s");

    static private final SubLString $str_alt117$____marking_horizon_for__s_in_ite = makeString("~%~%marking horizon for ~s in iteration ~s");

    static private final SubLString $str_alt118$__search_node____s__s___s = makeString("~%search node: [~s ~s] ~s");

    static private final SubLString $str_alt119$empty_horizon_for__s_in_iteration = makeString("empty horizon for ~s in iteration ~s");

    static private final SubLString $str_alt120$___s_searched_by___s = makeString("~%~s searched by: ~s");

    static private final SubLString $str_alt121$___s______goal_________________ = makeString("~%~s  *** goal!!!!!!!!!!!!!!!!!");

    static private final SubLList $list_alt145 = list(makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH"));

    static private final SubLList $list_alt146 = list(makeSymbol("LINK"), makeSymbol("NODE-PATH"));

    static private final SubLList $list_alt147 = list(makeSymbol("NODE-1"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-1"));

    static private final SubLList $list_alt148 = list(makeSymbol("LINK-1"), makeSymbol("NODE-PATH-1"));

    static private final SubLList $list_alt149 = list(makeSymbol("NODE-2"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-2"));

    static private final SubLList $list_alt154 = list(reader_make_constant_shell("isa"));

    static private final SubLList $list_alt155 = list(reader_make_constant_shell("genls"));

    static private final SubLList $list_alt156 = list(reader_make_constant_shell("genlMt"));

    static private final SubLList $list_alt158 = list(reader_make_constant_shell("conceptuallyRelated"));

    static private final SubLList $list_alt159 = list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("KnowledgeBase"));

    static private final SubLList $list_alt160 = list(reader_make_constant_shell("TestingConstant"), reader_make_constant_shell("LinguisticObjectType"), reader_make_constant_shell("InferenceRelatedBookkeepingPredicate"), reader_make_constant_shell("GenericAttribute"), reader_make_constant_shell("KnowledgeBase"));

    static private final SubLList $list_alt161 = list(reader_make_constant_shell("PartiallyTangible"), reader_make_constant_shell("SiblingDisjointCollectionType"), reader_make_constant_shell("ExistingObjectType"));

    static private final SubLList $list_alt162 = list(reader_make_constant_shell("Predicate"), reader_make_constant_shell("Microtheory"));

    static private final SubLString $str_alt168$__cr_gafs_considered___a = makeString("~%cr gafs considered: ~a");

    static private final SubLString $str_alt169$__cr_gafs_explained___a = makeString("~%cr gafs explained: ~a");

    static private final SubLString $str_alt170$__cr_gafs_w_errors___a = makeString("~%cr gafs w/errors: ~a");

    private static final SubLSymbol CACHED_HPKB_RELATE_TERMS = makeSymbol("CACHED-HPKB-RELATE-TERMS");

    static private final SubLList $list_alt174 = list(reader_make_constant_shell("Y1Phase2ScenarioConflict"), reader_make_constant_shell("HPKBDisplayConstant"));

    static private final SubLList $list_alt175 = list(reader_make_constant_shell("ExistingObjectType"), reader_make_constant_shell("GeographicalAgent"), reader_make_constant_shell("AttackOnTangible"), reader_make_constant_shell("SiblingDisjointCollectionType"), reader_make_constant_shell("PublicConstant"));

    static private final SubLList $list_alt176 = list(reader_make_constant_shell("TestingConstant"), reader_make_constant_shell("LinguisticObjectType"), reader_make_constant_shell("InferenceRelatedBookkeepingPredicate"), reader_make_constant_shell("IndependentCountry"), reader_make_constant_shell("GenericAttribute"));

    static private final SubLList $list_alt177 = list(list(reader_make_constant_shell("relationInstanceExistsCount"), ZERO_INTEGER), list(reader_make_constant_shell("not")), list(reader_make_constant_shell("consistent")));

    static private final SubLList $list_alt178 = list(makeKeyword("POS"), makeKeyword("NEG"), makeKeyword("OTHER"));

    public static final SubLSymbol $kw181$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    private static final SubLSymbol GENERATE_TEXT = makeSymbol("GENERATE-TEXT");

    static private final SubLList $list_alt185 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"));

    static private final SubLString $str_alt191$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt195$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt198$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt199$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt201 = cons(makeSymbol("COL"), makeSymbol("PRED"));

    static private final SubLSymbol $sym202$_ = makeSymbol(">");

    static private final SubLList $list_alt209 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"), makeKeyword("RELATION-EXISTS"), makeKeyword("INTER-ARG-ISA-INDEPENDENT"), makeKeyword("INTER-ARG-ISA-DEPENDENT"));
}

/**
 * Total time: 3861 ms
 */
