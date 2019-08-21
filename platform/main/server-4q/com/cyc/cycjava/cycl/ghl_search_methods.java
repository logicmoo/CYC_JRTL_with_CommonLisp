package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mapping_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.ghl_search_methods.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class ghl_search_methods extends SubLTranslatedFile {
    public static final SubLFile me = new ghl_search_methods();

    public static final String myName = "com.cyc.cycjava.cycl.ghl_search_methods";

    public static final String myFingerPrint = "05a4c3161b66c5c5cccc8a8a5de684c68a65b480cb0b25a7f62c58f3abece276";

    // defparameter
    private static final SubLSymbol $ghl_mark_and_sweep_recursion_limit$ = makeSymbol("*GHL-MARK-AND-SWEEP-RECURSION-LIMIT*");

    // Internal Constants
    public static final SubLString $str0$Unsupported_search_behavior______ = makeString("Unsupported search behavior. ~%~% ~A ~%");

    public static final SubLString $str1$Unsupported_search_conditions_ = makeString("Unsupported search conditions.");

    private static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLSymbol GHL_GOAL_SEARCH_P = makeSymbol("GHL-GOAL-SEARCH-P");

    public static final SubLSymbol GHL_MAP_P = makeSymbol("GHL-MAP-P");

    private static final SubLString $str5$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str6$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");



    private static final SubLSymbol $sym8$RELEVANT_PRED_WRT_GT_ = makeSymbol("RELEVANT-PRED-WRT-GT?");



    private static final SubLList $list10 = list(makeUninternedSymbol("ASSERTION"), makeUninternedSymbol("VAR-MT"));





    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));



    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLList $list16 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE"), makeSymbol("PRED"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE"), list(makeSymbol("ORDER"), makeKeyword("DEPTH-FIRST")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list17 = list(makeKeyword("MT"), makeKeyword("TV"), makeKeyword("DONE"), makeKeyword("ORDER"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    public static final SubLSymbol $sym24$ITERATOR = makeUninternedSymbol("ITERATOR");



    public static final SubLSymbol NEW_GHL_CLOSURE_ITERATOR = makeSymbol("NEW-GHL-CLOSURE-ITERATOR");



















    private static final SubLList $list36 = list(list(new SubLObject[]{ makeSymbol("LINK-NODE"), makeSymbol("PREDS"), makeSymbol("NODE"), makeSymbol("DIRECTIONS"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE"), list(makeSymbol("ORDER"), makeKeyword("DEPTH-FIRST")) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym37$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_GHL_CLOSURES_ITERATOR = makeSymbol("NEW-GHL-CLOSURES-ITERATOR");

    private static final SubLSymbol REFLEXIVE_BINARY_PREDICATE_P = makeSymbol("REFLEXIVE-BINARY-PREDICATE-P");

    private static final SubLSymbol GHL_CLOSURE_SEARCH_ITERATOR_DONE = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-DONE");

    private static final SubLSymbol GHL_CLOSURE_SEARCH_ITERATOR_NEXT = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-NEXT");

    private static final SubLSymbol GHL_CLOSURE_SEARCH_ITERATOR_FINALIZE = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE");



    private static final SubLList $list44 = list(makeSymbol("SEARCH"), makeSymbol("SEARCH-DECK"), makeSymbol("MT"));





    private static final SubLSymbol GHL_OPPOSITE_DIRECTION = makeSymbol("GHL-OPPOSITE-DIRECTION");

    private static final SubLSymbol IRREFLEXIVE_BINARY_PREDICATE_P = makeSymbol("IRREFLEXIVE-BINARY-PREDICATE-P");

    private static final SubLSymbol $GOAL_SEARCH_P = makeKeyword("GOAL-SEARCH-P");





    public static final SubLList $list52 = list(makeKeyword("MAP-FN"), makeSymbol("GHL-GOAL-MARK-NODE-AS-SEARCHED"));



    private static final SubLSymbol $sym54$GHL_GOAL_OR_MARKED_AS_GOAL_ = makeSymbol("GHL-GOAL-OR-MARKED-AS-GOAL?");





    private static final SubLList $list57 = list(makeKeyword("JUSTIFY?"), T);

    private static final SubLList $list58 = list(makeSymbol("NODE"), makeSymbol("SUPPORTS"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    public static SubLObject ghl_search(final SubLObject v_search, final SubLObject node) {
        if (NIL != ghl_search_vars.ghl_transitive_search_p(v_search)) {
            transitive_ghl_search(v_search, node);
        } else {
            ghl_search_vars.ghl_error(ONE_INTEGER, $str0$Unsupported_search_behavior______, ghl_search_vars.describe_ghl_search(v_search), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject transitive_ghl_search(final SubLObject v_search, final SubLObject node) {
        if (((NIL != ghl_search_vars.ghl_depth_marking_search_p(v_search)) && (NIL != ghl_search_vars.ghl_iterative_deepening_search_p(v_search))) && (NIL != ghl_search_vars.ghl_add_edges_on_unwind_p(v_search))) {
            ghl_all_edges_iterative_deepening_initializer(v_search, node, ghl_search_vars.ghl_depth_cutoff(v_search));
        } else
            if ((NIL != ghl_search_vars.ghl_depth_marking_search_p(v_search)) && (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search))) {
                ghl_mark_and_sweep_depth_cutoff_initializer(v_search, node, ghl_search_vars.ghl_depth_cutoff(v_search));
            } else
                if (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) {
                    ghl_mark_and_sweep_df(v_search, node);
                } else
                    if (NIL != ghl_search_vars.ghl_breadth_first_search_p(v_search)) {
                        ghl_mark_and_sweep_bf(v_search, node);
                    } else {
                        ghl_search_vars.ghl_error(ONE_INTEGER, $str1$Unsupported_search_conditions_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }



        return NIL;
    }

    public static SubLObject ghl_mark_and_sweep(final SubLObject v_search, final SubLObject node) {
        return NIL != ghl_search_vars.ghl_depth_first_search_p(v_search) ? ghl_mark_and_sweep_df(v_search, node) : ghl_mark_and_sweep_bf(v_search, node);
    }

    public static SubLObject ghl_unmark_and_sweep(final SubLObject v_search, final SubLObject node) {
        return NIL != ghl_search_vars.ghl_depth_first_search_p(v_search) ? ghl_unmark_and_sweep_df(v_search, node) : ghl_unmark_and_sweep_bf(v_search, node);
    }

    public static SubLObject ghl_mark_sweep_until_goal(final SubLObject v_search, final SubLObject node) {
        assert NIL != ghl_search_vars.ghl_goal_search_p(v_search) : "ghl_search_vars.ghl_goal_search_p(v_search) " + "CommonSymbols.NIL != ghl_search_vars.ghl_goal_search_p(v_search) " + v_search;
        return ghl_mark_and_sweep(v_search, node);
    }

    public static SubLObject ghl_unmark_sweep_and_map(final SubLObject v_search, final SubLObject node) {
        assert NIL != ghl_search_vars.ghl_map_p(v_search) : "ghl_search_vars.ghl_map_p(v_search) " + "CommonSymbols.NIL != ghl_search_vars.ghl_map_p(v_search) " + v_search;
        return ghl_unmark_and_sweep(v_search, node);
    }

    public static SubLObject ghl_mark_and_sweep_df(final SubLObject v_search, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ghl_mark_and_sweep_recursion_limit$.getDynamicValue(thread).isInteger() ? ghl_mark_and_sweep_df_hybrid(v_search, node, T, ZERO_INTEGER) : ghl_mark_and_sweep_df_purely_recursive(v_search, node, T);
    }

    public static SubLObject ghl_unmark_and_sweep_df(final SubLObject v_search, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ghl_mark_and_sweep_recursion_limit$.getDynamicValue(thread).isInteger() ? ghl_mark_and_sweep_df_hybrid(v_search, node, NIL, ZERO_INTEGER) : ghl_mark_and_sweep_df_purely_recursive(v_search, node, NIL);
    }

    public static SubLObject ghl_mark_and_sweep_bf(final SubLObject v_search, final SubLObject node) {
        return ghl_mark_and_sweep_iterative_bf(v_search, node, T);
    }

    public static SubLObject ghl_unmark_and_sweep_bf(final SubLObject v_search, final SubLObject node) {
        return ghl_mark_and_sweep_iterative_bf(v_search, node, NIL);
    }

    public static SubLObject ghl_mark_and_sweep_df_purely_recursive(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == ghl_search_vars.ghl_goal_search_p(v_search)) || (NIL == ghl_search_vars.ghl_goal_found_p(v_search))) && (NIL != (NIL != mark ? makeBoolean(NIL == ghl_marking_utilities.ghl_marked_node_p(v_search, node)) : ghl_marking_utilities.ghl_marked_node_p(v_search, node)))) {
            ghl_marking_utilities.ghl_mark_node(v_search, node, mark);
            if ((NIL != ghl_search_vars.ghl_goal_search_p(v_search)) && (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED))) {
                ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
            } else {
                if (NIL != ghl_search_vars.ghl_map_p(v_search)) {
                    funcall(ghl_search_vars.ghl_map_fn(v_search), v_search, node);
                }
                SubLObject pred = NIL;
                SubLObject pred_$1 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$2 = NIL;
                pred = ghl_search_vars.ghl_relevant_predicates(v_search);
                pred_$1 = pred.first();
                direction = ghl_search_vars.ghl_relevant_directions(v_search);
                direction_$2 = direction.first();
                while ((NIL != direction) || (NIL != pred)) {
                    final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$1, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$2, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$1)) {
                            final SubLObject node_$3 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$1), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$1)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$1)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$1), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$3)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$3, sbhl_module_vars.get_sbhl_module(pred_$1));
                                    if (NIL != d_link) {
                                        if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                            SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$2);
                                            SubLObject search_direction = NIL;
                                            search_direction = csome_list_var.first();
                                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$1));
                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$1));
                                                if (NIL != mt_links) {
                                                    SubLObject iteration_state;
                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                            final SubLObject _prev_bind_0_$5 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                SubLObject iteration_state_$7;
                                                                for (iteration_state_$7 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$7)); iteration_state_$7 = dictionary_contents.do_dictionary_contents_next(iteration_state_$7)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$7);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                        final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                            final SubLObject sol = link_nodes_var;
                                                                            if (NIL != set.set_p(sol)) {
                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                SubLObject basis_object;
                                                                                SubLObject state;
                                                                                SubLObject link_node;
                                                                                SubLObject support;
                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                        support = ghl_link_iterators.ghl_make_sbhl_support(pred_$1, node, link_node, direction_$2);
                                                                                        ghl_mark_and_sweep_df_purely_recursive(v_search, link_node, mark);
                                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                            ghl_add_support_to_result(v_search, support);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol.isList()) {
                                                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                                        SubLObject csome_list_var_$9 = sol;
                                                                                        SubLObject link_node2 = NIL;
                                                                                        link_node2 = csome_list_var_$9.first();
                                                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$9)) {
                                                                                            final SubLObject support2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$1, node, link_node2, direction_$2);
                                                                                            ghl_mark_and_sweep_df_purely_recursive(v_search, link_node2, mark);
                                                                                            if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                                ghl_add_support_to_result(v_search, support2);
                                                                                            }
                                                                                            csome_list_var_$9 = csome_list_var_$9.rest();
                                                                                            link_node2 = csome_list_var_$9.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$6, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$7);
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$5, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                search_direction = csome_list_var.first();
                                            } 
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if ((NIL != term.closed_nautP(node_$3, UNPROVIDED)) && (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$2);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$1));
                                            final SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$1))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$1));
                                            SubLObject rest;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$7;
                                            SubLObject sol2;
                                            SubLObject link_nodes_var2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject support3;
                                            SubLObject csome_list_var_$10;
                                            SubLObject link_node4;
                                            SubLObject support4;
                                            for (rest = NIL, rest = new_list; (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                                generating_fn = rest.first();
                                                _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    link_nodes_var2 = sol2 = funcall(generating_fn, node_$3);
                                                    if (NIL != set.set_p(sol2)) {
                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                support3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$1, node, link_node3, direction_$2);
                                                                ghl_mark_and_sweep_df_purely_recursive(v_search, link_node3, mark);
                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                    ghl_add_support_to_result(v_search, support3);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var_$10 = sol2;
                                                                link_node4 = NIL;
                                                                link_node4 = csome_list_var_$10.first();
                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$10)) {
                                                                    support4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$1, node, link_node4, direction_$2);
                                                                    ghl_mark_and_sweep_df_purely_recursive(v_search, link_node4, mark);
                                                                    if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                        ghl_add_support_to_result(v_search, support4);
                                                                    }
                                                                    csome_list_var_$10 = csome_list_var_$10.rest();
                                                                    link_node4 = csome_list_var_$10.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$1)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$8 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                        SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$2);
                                        SubLObject search_direction3 = NIL;
                                        search_direction3 = csome_list_var3.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                            final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                            final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                            final SubLObject _prev_bind_0_$9 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$6 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                            try {
                                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$1, thread);
                                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                final SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                    SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                SubLObject done_var_$15 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                final SubLObject token_var_$16 = NIL;
                                                                while (NIL == done_var_$15) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                                                    final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(assertion));
                                                                    if ((NIL != valid_$17) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                        final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                        final SubLObject support5 = assertion;
                                                                        ghl_mark_and_sweep_df_purely_recursive(v_search, link_node5, mark);
                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                            ghl_add_support_to_result(v_search, support5);
                                                                        }
                                                                    }
                                                                    done_var_$15 = makeBoolean((NIL == valid_$17) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                    } 
                                                }
                                            } finally {
                                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$6, thread);
                                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$9, thread);
                                            }
                                            if (NIL != gt_vars.gt_use_sksiP()) {
                                                final SubLObject _prev_bind_0_$11 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$1, thread);
                                                    SubLObject rest2;
                                                    SubLObject gather_sentence_mt_pair;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject assertion2;
                                                    SubLObject var_mt;
                                                    SubLObject link_node6;
                                                    SubLObject support6;
                                                    for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        gather_sentence_mt_pair = rest2.first();
                                                        datum = current = gather_sentence_mt_pair;
                                                        assertion2 = NIL;
                                                        var_mt = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        assertion2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        var_mt = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                                link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                                support6 = assertion2;
                                                                ghl_mark_and_sweep_df_purely_recursive(v_search, link_node6, mark);
                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                    ghl_add_support_to_result(v_search, support6);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list10);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$11, thread);
                                                }
                                            }
                                            if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                                final SubLObject _prev_bind_0_$12 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                    final SubLObject _prev_bind_0_$13 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                    try {
                                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$1, thread);
                                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                        final SubLObject pred_var2 = NIL;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                            SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                            final SubLObject token_var2 = NIL;
                                                            while (NIL == done_var2) {
                                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                if (NIL != valid2) {
                                                                    SubLObject final_index_iterator2 = NIL;
                                                                    try {
                                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                        SubLObject done_var_$16 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                        final SubLObject token_var_$17 = NIL;
                                                                        while (NIL == done_var_$16) {
                                                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$17);
                                                                            final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion3));
                                                                            if ((NIL != valid_$18) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                                final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                                final SubLObject support7 = assertion3;
                                                                                ghl_mark_and_sweep_df_purely_recursive(v_search, link_node7, mark);
                                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                    ghl_add_support_to_result(v_search, support7);
                                                                                }
                                                                            }
                                                                            done_var_$16 = makeBoolean((NIL == valid_$18) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values2 = getValuesAsVector();
                                                                            if (NIL != final_index_iterator2) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                            }
                                                                            restoreValuesFromVector(_values2);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                            } 
                                                        }
                                                    } finally {
                                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$7, thread);
                                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                                        final SubLObject _prev_bind_0_$15 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                        try {
                                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$1, thread);
                                                            SubLObject rest3;
                                                            SubLObject gather_sentence_mt_pair2;
                                                            SubLObject current2;
                                                            SubLObject datum2;
                                                            SubLObject assertion4;
                                                            SubLObject var_mt2;
                                                            SubLObject link_node8;
                                                            SubLObject support8;
                                                            for (rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest3); rest3 = rest3.rest()) {
                                                                gather_sentence_mt_pair2 = rest3.first();
                                                                datum2 = current2 = gather_sentence_mt_pair2;
                                                                assertion4 = NIL;
                                                                var_mt2 = NIL;
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                assertion4 = current2.first();
                                                                current2 = current2.rest();
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                var_mt2 = current2.first();
                                                                current2 = current2.rest();
                                                                if (NIL == current2) {
                                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                        link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                        support8 = assertion4;
                                                                        ghl_mark_and_sweep_df_purely_recursive(v_search, link_node8, mark);
                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                            ghl_add_support_to_result(v_search, support8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum2, $list10);
                                                                }
                                                            }
                                                        } finally {
                                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            csome_list_var3 = csome_list_var3.rest();
                                            search_direction3 = csome_list_var3.first();
                                        } 
                                    }
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$8, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
                    }
                    pred = pred.rest();
                    pred_$1 = pred.first();
                    direction = direction.rest();
                    direction_$2 = direction.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject ghl_mark_and_sweep_df_hybrid(final SubLObject v_search, final SubLObject node, final SubLObject mark, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return depth.numL($ghl_mark_and_sweep_recursion_limit$.getDynamicValue(thread)) ? ghl_mark_and_sweep_recursive_df(v_search, node, mark, depth) : ghl_mark_and_sweep_iterative_df(v_search, node, mark);
    }

    public static SubLObject ghl_mark_and_sweep_recursive_df(final SubLObject v_search, final SubLObject node, final SubLObject mark, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == ghl_search_vars.ghl_goal_search_p(v_search)) || (NIL == ghl_search_vars.ghl_goal_found_p(v_search))) && (NIL != (NIL != mark ? makeBoolean(NIL == ghl_marking_utilities.ghl_marked_node_p(v_search, node)) : ghl_marking_utilities.ghl_marked_node_p(v_search, node)))) {
            ghl_marking_utilities.ghl_mark_node(v_search, node, mark);
            if ((NIL != ghl_search_vars.ghl_goal_search_p(v_search)) && (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED))) {
                ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
            } else {
                if (NIL != ghl_search_vars.ghl_map_p(v_search)) {
                    funcall(ghl_search_vars.ghl_map_fn(v_search), v_search, node);
                }
                SubLObject pred = NIL;
                SubLObject pred_$28 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$29 = NIL;
                pred = ghl_search_vars.ghl_relevant_predicates(v_search);
                pred_$28 = pred.first();
                direction = ghl_search_vars.ghl_relevant_directions(v_search);
                direction_$29 = direction.first();
                while ((NIL != direction) || (NIL != pred)) {
                    final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$28, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$29, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$28)) {
                            final SubLObject node_$30 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$32 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$28), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$28)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$28)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$28), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$30)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$30, sbhl_module_vars.get_sbhl_module(pred_$28));
                                    if (NIL != d_link) {
                                        if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                            SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$29);
                                            SubLObject search_direction = NIL;
                                            search_direction = csome_list_var.first();
                                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$28));
                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$28));
                                                if (NIL != mt_links) {
                                                    SubLObject iteration_state;
                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                SubLObject iteration_state_$34;
                                                                for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34)); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                        final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                            final SubLObject sol = link_nodes_var;
                                                                            if (NIL != set.set_p(sol)) {
                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                SubLObject basis_object;
                                                                                SubLObject state;
                                                                                SubLObject link_node;
                                                                                SubLObject support;
                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                        support = ghl_link_iterators.ghl_make_sbhl_support(pred_$28, node, link_node, direction_$29);
                                                                                        ghl_mark_and_sweep_df_hybrid(v_search, link_node, mark, number_utilities.f_1X(depth));
                                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                            ghl_add_support_to_result(v_search, support);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol.isList()) {
                                                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                                        SubLObject csome_list_var_$36 = sol;
                                                                                        SubLObject link_node2 = NIL;
                                                                                        link_node2 = csome_list_var_$36.first();
                                                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$36)) {
                                                                                            final SubLObject support2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$28, node, link_node2, direction_$29);
                                                                                            ghl_mark_and_sweep_df_hybrid(v_search, link_node2, mark, number_utilities.f_1X(depth));
                                                                                            if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                                ghl_add_support_to_result(v_search, support2);
                                                                                            }
                                                                                            csome_list_var_$36 = csome_list_var_$36.rest();
                                                                                            link_node2 = csome_list_var_$36.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                search_direction = csome_list_var.first();
                                            } 
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if ((NIL != term.closed_nautP(node_$30, UNPROVIDED)) && (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$29);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$28));
                                            final SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$28))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$28));
                                            SubLObject rest;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$34;
                                            SubLObject sol2;
                                            SubLObject link_nodes_var2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject support3;
                                            SubLObject csome_list_var_$37;
                                            SubLObject link_node4;
                                            SubLObject support4;
                                            for (rest = NIL, rest = new_list; (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                                generating_fn = rest.first();
                                                _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    link_nodes_var2 = sol2 = funcall(generating_fn, node_$30);
                                                    if (NIL != set.set_p(sol2)) {
                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                support3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$28, node, link_node3, direction_$29);
                                                                ghl_mark_and_sweep_df_hybrid(v_search, link_node3, mark, number_utilities.f_1X(depth));
                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                    ghl_add_support_to_result(v_search, support3);
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var_$37 = sol2;
                                                                link_node4 = NIL;
                                                                link_node4 = csome_list_var_$37.first();
                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$37)) {
                                                                    support4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$28, node, link_node4, direction_$29);
                                                                    ghl_mark_and_sweep_df_hybrid(v_search, link_node4, mark, number_utilities.f_1X(depth));
                                                                    if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                        ghl_add_support_to_result(v_search, support4);
                                                                    }
                                                                    csome_list_var_$37 = csome_list_var_$37.rest();
                                                                    link_node4 = csome_list_var_$37.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$34, thread);
                                                }
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$32, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$31, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$28)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$35 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                        SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$29);
                                        SubLObject search_direction3 = NIL;
                                        search_direction3 = csome_list_var3.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                            final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                            final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                            final SubLObject _prev_bind_0_$36 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$33 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                            try {
                                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$28, thread);
                                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                final SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                    SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                SubLObject done_var_$42 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                final SubLObject token_var_$43 = NIL;
                                                                while (NIL == done_var_$42) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$43);
                                                                    final SubLObject valid_$44 = makeBoolean(!token_var_$43.eql(assertion));
                                                                    if ((NIL != valid_$44) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                        final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                        final SubLObject support5 = assertion;
                                                                        ghl_mark_and_sweep_df_hybrid(v_search, link_node5, mark, number_utilities.f_1X(depth));
                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                            ghl_add_support_to_result(v_search, support5);
                                                                        }
                                                                    }
                                                                    done_var_$42 = makeBoolean((NIL == valid_$44) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                    } 
                                                }
                                            } finally {
                                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$33, thread);
                                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$36, thread);
                                            }
                                            if (NIL != gt_vars.gt_use_sksiP()) {
                                                final SubLObject _prev_bind_0_$38 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$28, thread);
                                                    SubLObject rest2;
                                                    SubLObject gather_sentence_mt_pair;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject assertion2;
                                                    SubLObject var_mt;
                                                    SubLObject link_node6;
                                                    SubLObject support6;
                                                    for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        gather_sentence_mt_pair = rest2.first();
                                                        datum = current = gather_sentence_mt_pair;
                                                        assertion2 = NIL;
                                                        var_mt = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        assertion2 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        var_mt = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                                link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                                support6 = assertion2;
                                                                ghl_mark_and_sweep_df_hybrid(v_search, link_node6, mark, number_utilities.f_1X(depth));
                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                    ghl_add_support_to_result(v_search, support6);
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list10);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$38, thread);
                                                }
                                            }
                                            if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                                final SubLObject _prev_bind_0_$39 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                    final SubLObject _prev_bind_0_$40 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$34 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                    try {
                                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$28, thread);
                                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                        final SubLObject pred_var2 = NIL;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                            SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                            final SubLObject token_var2 = NIL;
                                                            while (NIL == done_var2) {
                                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                if (NIL != valid2) {
                                                                    SubLObject final_index_iterator2 = NIL;
                                                                    try {
                                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                        SubLObject done_var_$43 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                        final SubLObject token_var_$44 = NIL;
                                                                        while (NIL == done_var_$43) {
                                                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$44);
                                                                            final SubLObject valid_$45 = makeBoolean(!token_var_$44.eql(assertion3));
                                                                            if ((NIL != valid_$45) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                                final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                                final SubLObject support7 = assertion3;
                                                                                ghl_mark_and_sweep_df_hybrid(v_search, link_node7, mark, number_utilities.f_1X(depth));
                                                                                if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                                    ghl_add_support_to_result(v_search, support7);
                                                                                }
                                                                            }
                                                                            done_var_$43 = makeBoolean((NIL == valid_$45) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values2 = getValuesAsVector();
                                                                            if (NIL != final_index_iterator2) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                            }
                                                                            restoreValuesFromVector(_values2);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                            } 
                                                        }
                                                    } finally {
                                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$34, thread);
                                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                                        final SubLObject _prev_bind_0_$42 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                        try {
                                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$28, thread);
                                                            SubLObject rest3;
                                                            SubLObject gather_sentence_mt_pair2;
                                                            SubLObject current2;
                                                            SubLObject datum2;
                                                            SubLObject assertion4;
                                                            SubLObject var_mt2;
                                                            SubLObject link_node8;
                                                            SubLObject support8;
                                                            for (rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest3); rest3 = rest3.rest()) {
                                                                gather_sentence_mt_pair2 = rest3.first();
                                                                datum2 = current2 = gather_sentence_mt_pair2;
                                                                assertion4 = NIL;
                                                                var_mt2 = NIL;
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                assertion4 = current2.first();
                                                                current2 = current2.rest();
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                var_mt2 = current2.first();
                                                                current2 = current2.rest();
                                                                if (NIL == current2) {
                                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                        link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                        support8 = assertion4;
                                                                        ghl_mark_and_sweep_df_hybrid(v_search, link_node8, mark, number_utilities.f_1X(depth));
                                                                        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
                                                                            ghl_add_support_to_result(v_search, support8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum2, $list10);
                                                                }
                                                            }
                                                        } finally {
                                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$42, thread);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$39, thread);
                                                }
                                            }
                                            csome_list_var3 = csome_list_var3.rest();
                                            search_direction3 = csome_list_var3.first();
                                        } 
                                    }
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$35, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
                    }
                    pred = pred.rest();
                    pred_$28 = pred.first();
                    direction = direction.rest();
                    direction_$29 = direction.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject ghl_mark_and_sweep_iterative_df(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        return ghl_mark_and_sweep_iterative(v_search, node, mark, $STACK);
    }

    public static SubLObject ghl_mark_and_sweep_iterative_bf(final SubLObject v_search, final SubLObject node, final SubLObject mark) {
        return ghl_mark_and_sweep_iterative(v_search, node, mark, $QUEUE);
    }

    public static SubLObject ghl_mark_and_sweep_iterative(final SubLObject v_search, SubLObject node, final SubLObject mark, final SubLObject deck_style) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_deck = deck.create_deck(deck_style);
        final SubLObject unwind_deck = deck.create_deck(deck_style);
        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != node)) {
            if (NIL != (NIL != mark ? makeBoolean(NIL == ghl_marking_utilities.ghl_marked_node_p(v_search, node)) : ghl_marking_utilities.ghl_marked_node_p(v_search, node))) {
                ghl_marking_utilities.ghl_mark_node(v_search, node, mark);
                if ((NIL != ghl_search_vars.ghl_goal_search_p(v_search)) && (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED))) {
                    ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
                } else {
                    if (NIL != ghl_search_vars.ghl_map_p(v_search)) {
                        funcall(ghl_search_vars.ghl_map_fn(v_search), v_search, node);
                    }
                    if (NIL != ghl_search_vars.ghl_compute_justifyP(v_search)) {
                        final SubLObject support_deck = deck.create_deck(deck_style);
                        ghl_add_accessible_link_nodes_and_supports_to_deck(v_search, node, search_deck, support_deck);
                        if (NIL != deck.deck_empty_p(support_deck)) {
                            ghl_remove_unneeded_supports(unwind_deck);
                        } else {
                            deck.deck_push(support_deck, unwind_deck);
                        }
                    } else {
                        ghl_add_accessible_link_nodes_to_deck(v_search, node, search_deck);
                    }
                }
            } else
                if (NIL != ghl_search_vars.ghl_compute_justifyP(v_search)) {
                    ghl_remove_unneeded_supports(unwind_deck);
                }

            node = deck.deck_pop(search_deck);
        } 
        if ((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != ghl_search_vars.ghl_compute_justifyP(v_search))) {
            while (NIL == deck.deck_empty_p(unwind_deck)) {
                final SubLObject support_deck = deck.deck_pop(unwind_deck);
                final SubLObject support = deck.deck_pop(support_deck);
                ghl_add_support_to_result(v_search, support);
            } 
        }
        return NIL;
    }

    public static SubLObject ghl_add_accessible_link_nodes_to_deck(final SubLObject v_search, final SubLObject node, final SubLObject node_deck) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject pred = NIL;
        SubLObject pred_$55 = NIL;
        SubLObject direction = NIL;
        SubLObject direction_$56 = NIL;
        pred = ghl_search_vars.ghl_relevant_predicates(v_search);
        pred_$55 = pred.first();
        direction = ghl_search_vars.ghl_relevant_directions(v_search);
        direction_$56 = direction.first();
        while ((NIL != direction) || (NIL != pred)) {
            final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
            final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
            try {
                ghl_link_iterators.$ghl_link_pred$.bind(pred_$55, thread);
                ghl_link_iterators.$ghl_link_direction$.bind(direction_$56, thread);
                if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$55)) {
                    final SubLObject node_$57 = function_terms.naut_to_nart(node);
                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$55), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$55)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$55)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$55), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        if (NIL != forts.fort_p(node_$57)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$57, sbhl_module_vars.get_sbhl_module(pred_$55));
                            if (NIL != d_link) {
                                SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$56);
                                SubLObject search_direction = NIL;
                                search_direction = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$55));
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$55));
                                    if (NIL != mt_links) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                    SubLObject iteration_state_$61;
                                                    for (iteration_state_$61 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$61); iteration_state_$61 = dictionary_contents.do_dictionary_contents_next(iteration_state_$61)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$61);
                                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                            final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                final SubLObject sol = link_nodes_var;
                                                                if (NIL != set.set_p(sol)) {
                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                    SubLObject basis_object;
                                                                    SubLObject state;
                                                                    SubLObject link_node;
                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            if (NIL != link_node) {
                                                                                deck.deck_push(link_node, node_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol.isList()) {
                                                                        SubLObject csome_list_var_$63 = sol;
                                                                        SubLObject link_node2 = NIL;
                                                                        link_node2 = csome_list_var_$63.first();
                                                                        while (NIL != csome_list_var_$63) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            if (NIL != link_node2) {
                                                                                deck.deck_push(link_node2, node_deck);
                                                                            }
                                                                            csome_list_var_$63 = csome_list_var_$63.rest();
                                                                            link_node2 = csome_list_var_$63.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$61);
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    search_direction = csome_list_var.first();
                                } 
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != term.closed_nautP(node_$57, UNPROVIDED)) {
                                SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$56);
                                SubLObject search_direction2 = NIL;
                                search_direction2 = csome_list_var2.first();
                                while (NIL != csome_list_var2) {
                                    final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$55));
                                    SubLObject cdolist_list_var;
                                    final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$55))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$55));
                                    SubLObject generating_fn = NIL;
                                    generating_fn = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                            final SubLObject sol2;
                                            final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$57);
                                            if (NIL != set.set_p(sol2)) {
                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject link_node3;
                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                    link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                        count = add(count, ONE_INTEGER);
                                                        if (NIL != link_node3) {
                                                            deck.deck_push(link_node3, node_deck);
                                                        }
                                                    }
                                                }
                                            } else
                                                if (sol2.isList()) {
                                                    SubLObject csome_list_var_$64 = sol2;
                                                    SubLObject link_node4 = NIL;
                                                    link_node4 = csome_list_var_$64.first();
                                                    while (NIL != csome_list_var_$64) {
                                                        count = add(count, ONE_INTEGER);
                                                        if (NIL != link_node4) {
                                                            deck.deck_push(link_node4, node_deck);
                                                        }
                                                        csome_list_var_$64 = csome_list_var_$64.rest();
                                                        link_node4 = csome_list_var_$64.first();
                                                    } 
                                                } else {
                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                }

                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$61, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        generating_fn = cdolist_list_var.first();
                                    } 
                                    csome_list_var2 = csome_list_var2.rest();
                                    search_direction2 = csome_list_var2.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$59, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$58, thread);
                    }
                } else
                    if (NIL != ghl_link_iterators.gt_predicate_p(pred_$55)) {
                        final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                        final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                        final SubLObject _prev_bind_0_$62 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                        try {
                            ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                            SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$56);
                            SubLObject search_direction3 = NIL;
                            search_direction3 = csome_list_var3.first();
                            while (NIL != csome_list_var3) {
                                final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                final SubLObject _prev_bind_0_$63 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$60 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$55, thread);
                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                    final SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$69 = NIL;
                                                    final SubLObject token_var_$70 = NIL;
                                                    while (NIL == done_var_$69) {
                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$70);
                                                        final SubLObject valid_$71 = makeBoolean(!token_var_$70.eql(assertion));
                                                        if ((NIL != valid_$71) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                            final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                            final SubLObject support_var = assertion;
                                                            count = add(count, ONE_INTEGER);
                                                            if (NIL != link_node5) {
                                                                deck.deck_push(link_node5, node_deck);
                                                            }
                                                        }
                                                        done_var_$69 = makeBoolean(NIL == valid_$71);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                    }
                                } finally {
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$60, thread);
                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$63, thread);
                                }
                                if (NIL != gt_vars.gt_use_sksiP()) {
                                    final SubLObject _prev_bind_0_$65 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$55, thread);
                                        SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                        SubLObject gather_sentence_mt_pair = NIL;
                                        gather_sentence_mt_pair = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            SubLObject current;
                                            final SubLObject datum = current = gather_sentence_mt_pair;
                                            SubLObject assertion2 = NIL;
                                            SubLObject var_mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list10);
                                            assertion2 = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list10);
                                            var_mt = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                    final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                    final SubLObject support_var2 = assertion2;
                                                    count = add(count, ONE_INTEGER);
                                                    if (NIL != link_node6) {
                                                        deck.deck_push(link_node6, node_deck);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list10);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            gather_sentence_mt_pair = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$65, thread);
                                    }
                                }
                                if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                    final SubLObject _prev_bind_0_$66 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                        final SubLObject _prev_bind_0_$67 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$61 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$55, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var2 = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                SubLObject done_var2 = NIL;
                                                final SubLObject token_var2 = NIL;
                                                while (NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (NIL != valid2) {
                                                        SubLObject final_index_iterator2 = NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                            SubLObject done_var_$70 = NIL;
                                                            final SubLObject token_var_$71 = NIL;
                                                            while (NIL == done_var_$70) {
                                                                final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$71);
                                                                final SubLObject valid_$72 = makeBoolean(!token_var_$71.eql(assertion3));
                                                                if ((NIL != valid_$72) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                    final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                    final SubLObject support_var3 = assertion3;
                                                                    count = add(count, ONE_INTEGER);
                                                                    if (NIL != link_node7) {
                                                                        deck.deck_push(link_node7, node_deck);
                                                                    }
                                                                }
                                                                done_var_$70 = makeBoolean(NIL == valid_$72);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = makeBoolean(NIL == valid2);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$61, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$67, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$69 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$55, thread);
                                                SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                SubLObject gather_sentence_mt_pair2 = NIL;
                                                gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                while (NIL != cdolist_list_var3) {
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                    SubLObject assertion4 = NIL;
                                                    SubLObject var_mt2 = NIL;
                                                    destructuring_bind_must_consp(current2, datum2, $list10);
                                                    assertion4 = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list10);
                                                    var_mt2 = current2.first();
                                                    current2 = current2.rest();
                                                    if (NIL == current2) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                            final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                            final SubLObject support_var4 = assertion4;
                                                            count = add(count, ONE_INTEGER);
                                                            if (NIL != link_node8) {
                                                                deck.deck_push(link_node8, node_deck);
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum2, $list10);
                                                    }
                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                    gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$69, thread);
                                            }
                                        }
                                    } finally {
                                        ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$66, thread);
                                    }
                                }
                                csome_list_var3 = csome_list_var3.rest();
                                search_direction3 = csome_list_var3.first();
                            } 
                        } finally {
                            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$62, thread);
                        }
                    }

            } finally {
                ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
            }
            pred = pred.rest();
            pred_$55 = pred.first();
            direction = direction.rest();
            direction_$56 = direction.first();
        } 
        return count;
    }

    public static SubLObject ghl_add_accessible_link_nodes_and_supports_to_deck(final SubLObject v_search, final SubLObject node, final SubLObject node_deck, final SubLObject support_deck) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject pred = NIL;
        SubLObject pred_$82 = NIL;
        SubLObject direction = NIL;
        SubLObject direction_$83 = NIL;
        pred = ghl_search_vars.ghl_relevant_predicates(v_search);
        pred_$82 = pred.first();
        direction = ghl_search_vars.ghl_relevant_directions(v_search);
        direction_$83 = direction.first();
        while ((NIL != direction) || (NIL != pred)) {
            final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
            final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
            try {
                ghl_link_iterators.$ghl_link_pred$.bind(pred_$82, thread);
                ghl_link_iterators.$ghl_link_direction$.bind(direction_$83, thread);
                if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$82)) {
                    final SubLObject node_$84 = function_terms.naut_to_nart(node);
                    final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$86 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$82), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$82)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$82)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$82), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                        if (NIL != forts.fort_p(node_$84)) {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$84, sbhl_module_vars.get_sbhl_module(pred_$82));
                            if (NIL != d_link) {
                                SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$83);
                                SubLObject search_direction = NIL;
                                search_direction = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$82));
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$82));
                                    if (NIL != mt_links) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                    SubLObject iteration_state_$88;
                                                    for (iteration_state_$88 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$88); iteration_state_$88 = dictionary_contents.do_dictionary_contents_next(iteration_state_$88)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$88);
                                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                            final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                final SubLObject sol = link_nodes_var;
                                                                if (NIL != set.set_p(sol)) {
                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                    SubLObject basis_object;
                                                                    SubLObject state;
                                                                    SubLObject link_node;
                                                                    SubLObject support;
                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                        link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                        if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                            support = ghl_link_iterators.ghl_make_sbhl_support(pred_$82, node, link_node, direction_$83);
                                                                            count = add(count, ONE_INTEGER);
                                                                            deck.deck_push(link_node, node_deck);
                                                                            deck.deck_push(support, support_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol.isList()) {
                                                                        SubLObject csome_list_var_$90 = sol;
                                                                        SubLObject link_node2 = NIL;
                                                                        link_node2 = csome_list_var_$90.first();
                                                                        while (NIL != csome_list_var_$90) {
                                                                            final SubLObject support2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$82, node, link_node2, direction_$83);
                                                                            count = add(count, ONE_INTEGER);
                                                                            deck.deck_push(link_node2, node_deck);
                                                                            deck.deck_push(support2, support_deck);
                                                                            csome_list_var_$90 = csome_list_var_$90.rest();
                                                                            link_node2 = csome_list_var_$90.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$87, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$88);
                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$86, thread);
                                                }
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    search_direction = csome_list_var.first();
                                } 
                            } else {
                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else
                            if (NIL != term.closed_nautP(node_$84, UNPROVIDED)) {
                                SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$83);
                                SubLObject search_direction2 = NIL;
                                search_direction2 = csome_list_var2.first();
                                while (NIL != csome_list_var2) {
                                    final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$82));
                                    SubLObject cdolist_list_var;
                                    final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$82))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$82));
                                    SubLObject generating_fn = NIL;
                                    generating_fn = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                            final SubLObject sol2;
                                            final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$84);
                                            if (NIL != set.set_p(sol2)) {
                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject link_node3;
                                                SubLObject support3;
                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                    link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                        support3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$82, node, link_node3, direction_$83);
                                                        count = add(count, ONE_INTEGER);
                                                        deck.deck_push(link_node3, node_deck);
                                                        deck.deck_push(support3, support_deck);
                                                    }
                                                }
                                            } else
                                                if (sol2.isList()) {
                                                    SubLObject csome_list_var_$91 = sol2;
                                                    SubLObject link_node4 = NIL;
                                                    link_node4 = csome_list_var_$91.first();
                                                    while (NIL != csome_list_var_$91) {
                                                        final SubLObject support4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$82, node, link_node4, direction_$83);
                                                        count = add(count, ONE_INTEGER);
                                                        deck.deck_push(link_node4, node_deck);
                                                        deck.deck_push(support4, support_deck);
                                                        csome_list_var_$91 = csome_list_var_$91.rest();
                                                        link_node4 = csome_list_var_$91.first();
                                                    } 
                                                } else {
                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                }

                                        } finally {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$88, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        generating_fn = cdolist_list_var.first();
                                    } 
                                    csome_list_var2 = csome_list_var2.rest();
                                    search_direction2 = csome_list_var2.first();
                                } 
                            }

                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$86, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$85, thread);
                    }
                } else
                    if (NIL != ghl_link_iterators.gt_predicate_p(pred_$82)) {
                        final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                        final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                        final SubLObject _prev_bind_0_$89 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                        try {
                            ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                            SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$83);
                            SubLObject search_direction3 = NIL;
                            search_direction3 = csome_list_var3.first();
                            while (NIL != csome_list_var3) {
                                final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                final SubLObject _prev_bind_0_$90 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$87 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$82, thread);
                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                    final SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$96 = NIL;
                                                    final SubLObject token_var_$97 = NIL;
                                                    while (NIL == done_var_$96) {
                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                                        final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(assertion));
                                                        if ((NIL != valid_$98) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                            final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                            final SubLObject support5 = assertion;
                                                            count = add(count, ONE_INTEGER);
                                                            deck.deck_push(link_node5, node_deck);
                                                            deck.deck_push(support5, support_deck);
                                                        }
                                                        done_var_$96 = makeBoolean(NIL == valid_$98);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                    }
                                } finally {
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$87, thread);
                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$90, thread);
                                }
                                if (NIL != gt_vars.gt_use_sksiP()) {
                                    final SubLObject _prev_bind_0_$92 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$82, thread);
                                        SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                        SubLObject gather_sentence_mt_pair = NIL;
                                        gather_sentence_mt_pair = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            SubLObject current;
                                            final SubLObject datum = current = gather_sentence_mt_pair;
                                            SubLObject assertion2 = NIL;
                                            SubLObject var_mt = NIL;
                                            destructuring_bind_must_consp(current, datum, $list10);
                                            assertion2 = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list10);
                                            var_mt = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                    final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                    final SubLObject support6 = assertion2;
                                                    count = add(count, ONE_INTEGER);
                                                    deck.deck_push(link_node6, node_deck);
                                                    deck.deck_push(support6, support_deck);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list10);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            gather_sentence_mt_pair = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                                if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                    final SubLObject _prev_bind_0_$93 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                        final SubLObject _prev_bind_0_$94 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$88 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$82, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var2 = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                SubLObject done_var2 = NIL;
                                                final SubLObject token_var2 = NIL;
                                                while (NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (NIL != valid2) {
                                                        SubLObject final_index_iterator2 = NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                            SubLObject done_var_$97 = NIL;
                                                            final SubLObject token_var_$98 = NIL;
                                                            while (NIL == done_var_$97) {
                                                                final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$98);
                                                                final SubLObject valid_$99 = makeBoolean(!token_var_$98.eql(assertion3));
                                                                if ((NIL != valid_$99) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                    final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                    final SubLObject support7 = assertion3;
                                                                    count = add(count, ONE_INTEGER);
                                                                    deck.deck_push(link_node7, node_deck);
                                                                    deck.deck_push(support7, support_deck);
                                                                }
                                                                done_var_$97 = makeBoolean(NIL == valid_$99);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = makeBoolean(NIL == valid2);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$88, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$94, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$96 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$82, thread);
                                                SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                SubLObject gather_sentence_mt_pair2 = NIL;
                                                gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                while (NIL != cdolist_list_var3) {
                                                    SubLObject current2;
                                                    final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                    SubLObject assertion4 = NIL;
                                                    SubLObject var_mt2 = NIL;
                                                    destructuring_bind_must_consp(current2, datum2, $list10);
                                                    assertion4 = current2.first();
                                                    current2 = current2.rest();
                                                    destructuring_bind_must_consp(current2, datum2, $list10);
                                                    var_mt2 = current2.first();
                                                    current2 = current2.rest();
                                                    if (NIL == current2) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                            final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                            final SubLObject support8 = assertion4;
                                                            count = add(count, ONE_INTEGER);
                                                            deck.deck_push(link_node8, node_deck);
                                                            deck.deck_push(support8, support_deck);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum2, $list10);
                                                    }
                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                    gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$96, thread);
                                            }
                                        }
                                    } finally {
                                        ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$93, thread);
                                    }
                                }
                                csome_list_var3 = csome_list_var3.rest();
                                search_direction3 = csome_list_var3.first();
                            } 
                        } finally {
                            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$89, thread);
                        }
                    }

            } finally {
                ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
            }
            pred = pred.rest();
            pred_$82 = pred.first();
            direction = direction.rest();
            direction_$83 = direction.first();
        } 
        return count;
    }

    public static SubLObject ghl_remove_unneeded_supports(final SubLObject unwind_deck) {
        SubLObject count = ZERO_INTEGER;
        if (NIL == deck.deck_empty_p(unwind_deck)) {
            SubLObject support_deck = deck.deck_peek(unwind_deck);
            deck.deck_pop(support_deck);
            if (NIL != deck.deck_empty_p(support_deck)) {
                while ((NIL == deck.deck_empty_p(unwind_deck)) && (!deck.deck_size(support_deck).numG(ONE_INTEGER))) {
                    deck.deck_pop(unwind_deck);
                    count = add(count, ONE_INTEGER);
                    support_deck = deck.deck_peek(unwind_deck);
                } 
            }
            if (count.numG(ZERO_INTEGER) && (NIL != deck.deck_p(support_deck))) {
                deck.deck_pop(support_deck);
            }
        }
        return count;
    }

    public static SubLObject ghl_add_support_to_result(final SubLObject v_search, final SubLObject support) {
        final SubLObject support_pred = (NIL != assertion_handles.assertion_p(support)) ? assertions_high.gaf_predicate(support) : cycl_utilities.formula_operator(arguments.hl_support_sentence(support));
        final SubLObject search_preds = (ghl_search_vars.ghl_search_predicates(v_search).isList()) ? ghl_search_vars.ghl_search_predicates(v_search) : list(ghl_search_vars.ghl_search_predicates(v_search));
        if (NIL == subl_promotions.memberP(support_pred, search_preds, UNPROVIDED, UNPROVIDED)) {
            SubLObject genl_pred = NIL;
            SubLObject genl_inverse = NIL;
            if (NIL == genl_pred) {
                SubLObject csome_list_var = search_preds;
                SubLObject search_pred = NIL;
                search_pred = csome_list_var.first();
                while ((NIL == genl_pred) && (NIL != csome_list_var)) {
                    if (NIL != genl_predicates.genl_predicateP(support_pred, search_pred, UNPROVIDED, UNPROVIDED)) {
                        genl_pred = search_pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    search_pred = csome_list_var.first();
                } 
            }
            if (NIL == genl_inverse) {
                SubLObject csome_list_var = search_preds;
                SubLObject search_pred = NIL;
                search_pred = csome_list_var.first();
                while ((NIL == genl_inverse) && (NIL != csome_list_var)) {
                    if (NIL != genl_predicates.genl_inverseP(support_pred, search_pred, UNPROVIDED, UNPROVIDED)) {
                        genl_inverse = search_pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    search_pred = csome_list_var.first();
                } 
            }
            if (NIL != genl_pred) {
                final SubLObject support_sentence = make_binary_formula($$genlPreds, support_pred, genl_pred);
                final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, support_sentence, UNPROVIDED, UNPROVIDED);
                ghl_search_vars.ghl_add_to_result(v_search, hl_support, symbol_function(EQUAL));
            }
            if (NIL != genl_inverse) {
                final SubLObject support_sentence = make_binary_formula($$genlInverse, support_pred, genl_inverse);
                final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, support_sentence, UNPROVIDED, UNPROVIDED);
                ghl_search_vars.ghl_add_to_result(v_search, hl_support, symbol_function(EQUAL));
            }
        }
        ghl_search_vars.ghl_add_to_result(v_search, support, symbol_function(EQUAL));
        return NIL;
    }

    public static SubLObject ghl_add_justification_to_result(final SubLObject v_search, final SubLObject justification) {
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ghl_search_vars.ghl_add_to_result(v_search, support, symbol_function(EQUAL));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject ghl_create_justification(final SubLObject v_search, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_preds = (ghl_search_vars.ghl_search_predicates(v_search).isList()) ? ghl_search_vars.ghl_search_predicates(v_search) : list(ghl_search_vars.ghl_search_predicates(v_search));
        final SubLObject search_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject search_tv = ghl_search_vars.ghl_tv(v_search);
        final SubLObject sbhl_tv = sbhl_link_vars.support_tv_to_sbhl_tv(search_tv);
        SubLObject justification = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != arguments.support_p(support)) {
                justification = cons(support, justification);
            } else {
                justification = cons(sksi_infrastructure_utilities.make_sksi_support(support, search_mt), justification);
            }
            final SubLObject support_pred = (NIL != assertion_handles.assertion_p(support)) ? assertions_high.gaf_predicate(support) : NIL != arguments.hl_support_p(support) ? cycl_utilities.formula_operator(arguments.hl_support_sentence(support)) : NIL != el_formula_p(support) ? cycl_utilities.formula_operator(support) : NIL;
            if (NIL == subl_promotions.memberP(support_pred, search_preds, UNPROVIDED, UNPROVIDED)) {
                SubLObject genl_pred = NIL;
                SubLObject genl_inverse = NIL;
                if (NIL == genl_pred) {
                    SubLObject csome_list_var = search_preds;
                    SubLObject search_pred = NIL;
                    search_pred = csome_list_var.first();
                    while ((NIL == genl_pred) && (NIL != csome_list_var)) {
                        if (NIL != genl_predicates.genl_predicateP(support_pred, search_pred, search_mt, sbhl_tv)) {
                            genl_pred = search_pred;
                        }
                        csome_list_var = csome_list_var.rest();
                        search_pred = csome_list_var.first();
                    } 
                }
                if (NIL == genl_inverse) {
                    SubLObject csome_list_var = search_preds;
                    SubLObject search_pred = NIL;
                    search_pred = csome_list_var.first();
                    while ((NIL == genl_inverse) && (NIL != csome_list_var)) {
                        if (NIL != genl_predicates.genl_inverseP(support_pred, search_pred, search_mt, sbhl_tv)) {
                            genl_inverse = search_pred;
                        }
                        csome_list_var = csome_list_var.rest();
                        search_pred = csome_list_var.first();
                    } 
                }
                if (NIL != genl_pred) {
                    final SubLObject support_sentence = make_binary_formula($$genlPreds, support_pred, genl_pred);
                    final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, support_sentence, search_mt, search_tv);
                    justification = cons(hl_support, justification);
                }
                if (NIL != genl_inverse) {
                    final SubLObject support_sentence = make_binary_formula($$genlInverse, support_pred, genl_inverse);
                    final SubLObject hl_support = arguments.make_hl_support($GENLPREDS, support_sentence, search_mt, search_tv);
                    justification = cons(hl_support, justification);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(nreverse(justification), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ghl_mark_and_sweep_depth_cutoff_initializer(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject reflexive_just = ghl_search_utilities.ghl_node_admitted_by_some_reflexive_gaf(v_search, node);
        ghl_marking_utilities.ghl_mark_node(v_search, node, depth);
        if (NIL != reflexive_just) {
            if (NIL != ghl_search_vars.ghl_add_nodes_on_wind_p(v_search)) {
                ghl_search_vars.ghl_add_node_to_result(v_search, node);
            }
            if (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED)) {
                ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
            }
        }
        final SubLObject new_depth = number_utilities.f_1_(depth);
        final SubLObject preds = ghl_search_vars.ghl_relevant_predicates(v_search);
        final SubLObject directions = ghl_search_vars.ghl_relevant_directions(v_search);
        if (!new_depth.numL(ZERO_INTEGER)) {
            SubLObject pred = NIL;
            SubLObject pred_$109 = NIL;
            SubLObject direction = NIL;
            SubLObject direction_$110 = NIL;
            pred = preds;
            pred_$109 = pred.first();
            direction = directions;
            direction_$110 = direction.first();
            while ((NIL != direction) || (NIL != pred)) {
                final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                try {
                    ghl_link_iterators.$ghl_link_pred$.bind(pred_$109, thread);
                    ghl_link_iterators.$ghl_link_direction$.bind(direction_$110, thread);
                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$109)) {
                        final SubLObject node_$111 = function_terms.naut_to_nart(node);
                        final SubLObject _prev_bind_0_$112 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$113 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$109), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$109)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$109)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$109), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                            if (NIL != forts.fort_p(node_$111)) {
                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$111, sbhl_module_vars.get_sbhl_module(pred_$109));
                                if (NIL != d_link) {
                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$110);
                                        SubLObject search_direction = NIL;
                                        search_direction = csome_list_var.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                            final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$109));
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$109));
                                            if (NIL != mt_links) {
                                                SubLObject iteration_state;
                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                        final SubLObject _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                            SubLObject iteration_state_$115;
                                                            for (iteration_state_$115 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$115)); iteration_state_$115 = dictionary_contents.do_dictionary_contents_next(iteration_state_$115)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$115);
                                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                    final SubLObject _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject link_node;
                                                                            SubLObject assertion;
                                                                            SubLObject link_pred;
                                                                            SubLObject link_direction_$117;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                    assertion = ghl_link_iterators.ghl_make_sbhl_support(pred_$109, node, link_node, direction_$110);
                                                                                    ghl_mark_and_sweep_depth_cutoff(v_search, link_node, new_depth);
                                                                                    if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                        link_pred = ghl_link_iterators.get_ghl_link_pred();
                                                                                        link_direction_$117 = ghl_link_iterators.get_ghl_link_direction();
                                                                                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred)) {
                                                                                            ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node, link_direction_$117, sbhl_link_vars.get_sbhl_link_mt());
                                                                                        } else {
                                                                                            ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                                    SubLObject csome_list_var_$118 = sol;
                                                                                    SubLObject link_node2 = NIL;
                                                                                    link_node2 = csome_list_var_$118.first();
                                                                                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$118)) {
                                                                                        final SubLObject assertion2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$109, node, link_node2, direction_$110);
                                                                                        ghl_mark_and_sweep_depth_cutoff(v_search, link_node2, new_depth);
                                                                                        if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                            final SubLObject link_pred2 = ghl_link_iterators.get_ghl_link_pred();
                                                                                            final SubLObject link_direction_$118 = ghl_link_iterators.get_ghl_link_direction();
                                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred2)) {
                                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node2, link_direction_$118, sbhl_link_vars.get_sbhl_link_mt());
                                                                                            } else {
                                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion2);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var_$118 = csome_list_var_$118.rest();
                                                                                        link_node2 = csome_list_var_$118.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$114, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$115);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$113, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            search_direction = csome_list_var.first();
                                        } 
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } else
                                if ((NIL != term.closed_nautP(node_$111, UNPROVIDED)) && (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                                    SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$110);
                                    SubLObject search_direction2 = NIL;
                                    search_direction2 = csome_list_var2.first();
                                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                        final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$109));
                                        final SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$109))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$109));
                                        SubLObject rest;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$115;
                                        SubLObject sol2;
                                        SubLObject link_nodes_var2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject link_node3;
                                        SubLObject assertion3;
                                        SubLObject link_pred3;
                                        SubLObject link_direction_$119;
                                        SubLObject csome_list_var_$119;
                                        SubLObject link_node4;
                                        SubLObject assertion4;
                                        SubLObject link_pred4;
                                        SubLObject link_direction_$120;
                                        for (rest = NIL, rest = new_list; (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                            generating_fn = rest.first();
                                            _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                link_nodes_var2 = sol2 = funcall(generating_fn, node_$111);
                                                if (NIL != set.set_p(sol2)) {
                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                        if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                            assertion3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$109, node, link_node3, direction_$110);
                                                            ghl_mark_and_sweep_depth_cutoff(v_search, link_node3, new_depth);
                                                            if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                link_pred3 = ghl_link_iterators.get_ghl_link_pred();
                                                                link_direction_$119 = ghl_link_iterators.get_ghl_link_direction();
                                                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred3)) {
                                                                    ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node3, link_direction_$119, sbhl_link_vars.get_sbhl_link_mt());
                                                                } else {
                                                                    ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else
                                                    if (sol2.isList()) {
                                                        if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                            csome_list_var_$119 = sol2;
                                                            link_node4 = NIL;
                                                            link_node4 = csome_list_var_$119.first();
                                                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$119)) {
                                                                assertion4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$109, node, link_node4, direction_$110);
                                                                ghl_mark_and_sweep_depth_cutoff(v_search, link_node4, new_depth);
                                                                if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                    link_pred4 = ghl_link_iterators.get_ghl_link_pred();
                                                                    link_direction_$120 = ghl_link_iterators.get_ghl_link_direction();
                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred4)) {
                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node4, link_direction_$120, sbhl_link_vars.get_sbhl_link_mt());
                                                                    } else {
                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion4);
                                                                    }
                                                                }
                                                                csome_list_var_$119 = csome_list_var_$119.rest();
                                                                link_node4 = csome_list_var_$119.first();
                                                            } 
                                                        }
                                                    } else {
                                                        Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                    }

                                            } finally {
                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$115, thread);
                                            }
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        search_direction2 = csome_list_var2.first();
                                    } 
                                }

                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$113, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$112, thread);
                        }
                    } else
                        if (NIL != ghl_link_iterators.gt_predicate_p(pred_$109)) {
                            final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                            final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                            final SubLObject _prev_bind_0_$116 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                            try {
                                ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                    SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$110);
                                    SubLObject search_direction3 = NIL;
                                    search_direction3 = csome_list_var3.first();
                                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                        final SubLObject _prev_bind_0_$117 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$114 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$109, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            SubLObject done_var_$127 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                            final SubLObject token_var_$128 = NIL;
                                                            while (NIL == done_var_$127) {
                                                                final SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$128);
                                                                final SubLObject valid_$129 = makeBoolean(!token_var_$128.eql(assertion4));
                                                                if ((NIL != valid_$129) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength))) {
                                                                    final SubLObject link_node5 = cycl_utilities.formula_arg(assertion4, gather_argnum, UNPROVIDED);
                                                                    final SubLObject assertion_$130 = assertion4;
                                                                    ghl_mark_and_sweep_depth_cutoff(v_search, link_node5, new_depth);
                                                                    if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                        final SubLObject link_pred5 = ghl_link_iterators.get_ghl_link_pred();
                                                                        final SubLObject link_direction3 = ghl_link_iterators.get_ghl_link_direction();
                                                                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred5)) {
                                                                            ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node5, link_direction3, sbhl_link_vars.get_sbhl_link_mt());
                                                                        } else {
                                                                            ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$130);
                                                                        }
                                                                    }
                                                                }
                                                                done_var_$127 = makeBoolean((NIL == valid_$129) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$114, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$117, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$119 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$109, thread);
                                                SubLObject rest2;
                                                SubLObject gather_sentence_mt_pair;
                                                SubLObject current;
                                                SubLObject datum;
                                                SubLObject assertion5;
                                                SubLObject var_mt;
                                                SubLObject link_node6;
                                                SubLObject assertion_$131;
                                                SubLObject link_pred6;
                                                SubLObject link_direction4;
                                                for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                    gather_sentence_mt_pair = rest2.first();
                                                    datum = current = gather_sentence_mt_pair;
                                                    assertion5 = NIL;
                                                    var_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    assertion5 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    var_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion5, strength)) {
                                                            link_node6 = cycl_utilities.formula_arg(assertion5, gather_argnum, UNPROVIDED);
                                                            assertion_$131 = assertion5;
                                                            ghl_mark_and_sweep_depth_cutoff(v_search, link_node6, new_depth);
                                                            if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                link_pred6 = ghl_link_iterators.get_ghl_link_pred();
                                                                link_direction4 = ghl_link_iterators.get_ghl_link_direction();
                                                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred6)) {
                                                                    ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node6, link_direction4, sbhl_link_vars.get_sbhl_link_mt());
                                                                } else {
                                                                    ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$131);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list10);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$119, thread);
                                            }
                                        }
                                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                            final SubLObject _prev_bind_0_$120 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                final SubLObject _prev_bind_0_$121 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$115 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                try {
                                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$109, thread);
                                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                    final SubLObject pred_var2 = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                        SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                        final SubLObject token_var2 = NIL;
                                                        while (NIL == done_var2) {
                                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                            if (NIL != valid2) {
                                                                SubLObject final_index_iterator2 = NIL;
                                                                try {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                    SubLObject done_var_$128 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                    final SubLObject token_var_$129 = NIL;
                                                                    while (NIL == done_var_$128) {
                                                                        final SubLObject assertion6 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$129);
                                                                        final SubLObject valid_$130 = makeBoolean(!token_var_$129.eql(assertion6));
                                                                        if ((NIL != valid_$130) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion6, strength))) {
                                                                            final SubLObject link_node7 = cycl_utilities.formula_arg(assertion6, index_argnum, UNPROVIDED);
                                                                            final SubLObject assertion_$132 = assertion6;
                                                                            ghl_mark_and_sweep_depth_cutoff(v_search, link_node7, new_depth);
                                                                            if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                final SubLObject link_pred7 = ghl_link_iterators.get_ghl_link_pred();
                                                                                final SubLObject link_direction5 = ghl_link_iterators.get_ghl_link_direction();
                                                                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred7)) {
                                                                                    ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node7, link_direction5, sbhl_link_vars.get_sbhl_link_mt());
                                                                                } else {
                                                                                    ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$132);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_$128 = makeBoolean((NIL == valid_$130) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values2 = getValuesAsVector();
                                                                        if (NIL != final_index_iterator2) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                        }
                                                                        restoreValuesFromVector(_values2);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$122, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                        } 
                                                    }
                                                } finally {
                                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$115, thread);
                                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$121, thread);
                                                }
                                                if (NIL != gt_vars.gt_use_sksiP()) {
                                                    final SubLObject _prev_bind_0_$123 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                    try {
                                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$109, thread);
                                                        SubLObject rest3;
                                                        SubLObject gather_sentence_mt_pair2;
                                                        SubLObject current2;
                                                        SubLObject datum2;
                                                        SubLObject assertion7;
                                                        SubLObject var_mt2;
                                                        SubLObject link_node8;
                                                        SubLObject assertion_$133;
                                                        SubLObject link_pred8;
                                                        SubLObject link_direction6;
                                                        for (rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest3); rest3 = rest3.rest()) {
                                                            gather_sentence_mt_pair2 = rest3.first();
                                                            datum2 = current2 = gather_sentence_mt_pair2;
                                                            assertion7 = NIL;
                                                            var_mt2 = NIL;
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            assertion7 = current2.first();
                                                            current2 = current2.rest();
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            var_mt2 = current2.first();
                                                            current2 = current2.rest();
                                                            if (NIL == current2) {
                                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion7, strength)) {
                                                                    link_node8 = cycl_utilities.formula_arg(assertion7, index_argnum, UNPROVIDED);
                                                                    assertion_$133 = assertion7;
                                                                    ghl_mark_and_sweep_depth_cutoff(v_search, link_node8, new_depth);
                                                                    if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                        link_pred8 = ghl_link_iterators.get_ghl_link_pred();
                                                                        link_direction6 = ghl_link_iterators.get_ghl_link_direction();
                                                                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred8)) {
                                                                            ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node8, link_direction6, sbhl_link_vars.get_sbhl_link_mt());
                                                                        } else {
                                                                            ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$133);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum2, $list10);
                                                            }
                                                        }
                                                    } finally {
                                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$123, thread);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$120, thread);
                                            }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        search_direction3 = csome_list_var3.first();
                                    } 
                                }
                            } finally {
                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$116, thread);
                            }
                        }

                } finally {
                    ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                    ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
                }
                pred = pred.rest();
                pred_$109 = pred.first();
                direction = direction.rest();
                direction_$110 = direction.first();
            } 
        }
        if (((NIL != reflexive_just) && (NIL != ghl_search_vars.ghl_add_edges_on_unwind_p(v_search))) && (NIL != ghl_search_vars.ghl_goal_found_p(v_search))) {
            ghl_search_utilities.ghl_add_reflexivity_justification(v_search, node, reflexive_just);
        }
        return NIL;
    }

    public static SubLObject ghl_mark_and_sweep_depth_cutoff(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == ghl_search_vars.ghl_goal_found_p(v_search)) {
            final SubLObject goal_foundP = ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED);
            if (NIL != goal_foundP) {
                ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
            } else
                if (NIL == ghl_marking_utilities.ghl_node_with_equal_or_shallower_depth_p(v_search, node, depth)) {
                    ghl_marking_utilities.ghl_mark_node(v_search, node, depth);
                    if (NIL != ghl_search_vars.ghl_add_nodes_on_wind_p(v_search)) {
                        ghl_search_vars.ghl_add_node_to_result(v_search, node);
                    }
                    final SubLObject new_depth = number_utilities.f_1_(depth);
                    final SubLObject preds = ghl_search_vars.ghl_relevant_predicates(v_search);
                    final SubLObject directions = ghl_search_vars.ghl_relevant_directions(v_search);
                    if (!new_depth.numL(ZERO_INTEGER)) {
                        SubLObject pred = NIL;
                        SubLObject pred_$144 = NIL;
                        SubLObject direction = NIL;
                        SubLObject direction_$145 = NIL;
                        pred = preds;
                        pred_$144 = pred.first();
                        direction = directions;
                        direction_$145 = direction.first();
                        while ((NIL != direction) || (NIL != pred)) {
                            final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                            try {
                                ghl_link_iterators.$ghl_link_pred$.bind(pred_$144, thread);
                                ghl_link_iterators.$ghl_link_direction$.bind(direction_$145, thread);
                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$144)) {
                                    final SubLObject node_$146 = function_terms.naut_to_nart(node);
                                    final SubLObject _prev_bind_0_$147 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$148 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$144), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$144)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$144)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$144), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                        if (NIL != forts.fort_p(node_$146)) {
                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$146, sbhl_module_vars.get_sbhl_module(pred_$144));
                                            if (NIL != d_link) {
                                                if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                    SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$145);
                                                    SubLObject search_direction = NIL;
                                                    search_direction = csome_list_var.first();
                                                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                        final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$144));
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$144));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$148 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$150;
                                                                        for (iteration_state_$150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$150)); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next(iteration_state_$150)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$150);
                                                                            final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$149 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes_var;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject link_node;
                                                                                        SubLObject assertion;
                                                                                        SubLObject link_pred;
                                                                                        SubLObject link_direction_$152;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                                assertion = ghl_link_iterators.ghl_make_sbhl_support(pred_$144, node, link_node, direction_$145);
                                                                                                ghl_mark_and_sweep_depth_cutoff(v_search, link_node, new_depth);
                                                                                                if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                                    link_pred = ghl_link_iterators.get_ghl_link_pred();
                                                                                                    link_direction_$152 = ghl_link_iterators.get_ghl_link_direction();
                                                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred)) {
                                                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node, link_direction_$152, sbhl_link_vars.get_sbhl_link_mt());
                                                                                                    } else {
                                                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                                                SubLObject csome_list_var_$153 = sol;
                                                                                                SubLObject link_node2 = NIL;
                                                                                                link_node2 = csome_list_var_$153.first();
                                                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$153)) {
                                                                                                    final SubLObject assertion2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$144, node, link_node2, direction_$145);
                                                                                                    ghl_mark_and_sweep_depth_cutoff(v_search, link_node2, new_depth);
                                                                                                    if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                                        final SubLObject link_pred2 = ghl_link_iterators.get_ghl_link_pred();
                                                                                                        final SubLObject link_direction_$153 = ghl_link_iterators.get_ghl_link_direction();
                                                                                                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred2)) {
                                                                                                            ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node2, link_direction_$153, sbhl_link_vars.get_sbhl_link_mt());
                                                                                                        } else {
                                                                                                            ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$153 = csome_list_var_$153.rest();
                                                                                                    link_node2 = csome_list_var_$153.first();
                                                                                                } 
                                                                                            }
                                                                                        } else {
                                                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$149, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$150);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$148, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        search_direction = csome_list_var.first();
                                                    } 
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } else
                                            if ((NIL != term.closed_nautP(node_$146, UNPROVIDED)) && (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                                                SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$145);
                                                SubLObject search_direction2 = NIL;
                                                search_direction2 = csome_list_var2.first();
                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                                    final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$144));
                                                    final SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$144))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$144));
                                                    SubLObject rest;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$150;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes_var2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject link_node3;
                                                    SubLObject assertion3;
                                                    SubLObject link_pred3;
                                                    SubLObject link_direction_$154;
                                                    SubLObject csome_list_var_$154;
                                                    SubLObject link_node4;
                                                    SubLObject assertion4;
                                                    SubLObject link_pred4;
                                                    SubLObject link_direction_$155;
                                                    for (rest = NIL, rest = new_list; (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                                        generating_fn = rest.first();
                                                        _prev_bind_0_$150 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            link_nodes_var2 = sol2 = funcall(generating_fn, node_$146);
                                                            if (NIL != set.set_p(sol2)) {
                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                        assertion3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$144, node, link_node3, direction_$145);
                                                                        ghl_mark_and_sweep_depth_cutoff(v_search, link_node3, new_depth);
                                                                        if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                            link_pred3 = ghl_link_iterators.get_ghl_link_pred();
                                                                            link_direction_$154 = ghl_link_iterators.get_ghl_link_direction();
                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred3)) {
                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node3, link_direction_$154, sbhl_link_vars.get_sbhl_link_mt());
                                                                            } else {
                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                        csome_list_var_$154 = sol2;
                                                                        link_node4 = NIL;
                                                                        link_node4 = csome_list_var_$154.first();
                                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$154)) {
                                                                            assertion4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$144, node, link_node4, direction_$145);
                                                                            ghl_mark_and_sweep_depth_cutoff(v_search, link_node4, new_depth);
                                                                            if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                link_pred4 = ghl_link_iterators.get_ghl_link_pred();
                                                                                link_direction_$155 = ghl_link_iterators.get_ghl_link_direction();
                                                                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred4)) {
                                                                                    ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node4, link_direction_$155, sbhl_link_vars.get_sbhl_link_mt());
                                                                                } else {
                                                                                    ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion4);
                                                                                }
                                                                            }
                                                                            csome_list_var_$154 = csome_list_var_$154.rest();
                                                                            link_node4 = csome_list_var_$154.first();
                                                                        } 
                                                                    }
                                                                } else {
                                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$150, thread);
                                                        }
                                                    }
                                                    csome_list_var2 = csome_list_var2.rest();
                                                    search_direction2 = csome_list_var2.first();
                                                } 
                                            }

                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$148, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$147, thread);
                                    }
                                } else
                                    if (NIL != ghl_link_iterators.gt_predicate_p(pred_$144)) {
                                        final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                        final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                        final SubLObject _prev_bind_0_$151 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                        try {
                                            ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$145);
                                                SubLObject search_direction3 = NIL;
                                                search_direction3 = csome_list_var3.first();
                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                                    final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                                    final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                                    final SubLObject _prev_bind_0_$152 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$149 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                    try {
                                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$144, thread);
                                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                        final SubLObject pred_var = NIL;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                            SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                            final SubLObject token_var = NIL;
                                                            while (NIL == done_var) {
                                                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                if (NIL != valid) {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                        SubLObject done_var_$162 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                        final SubLObject token_var_$163 = NIL;
                                                                        while (NIL == done_var_$162) {
                                                                            final SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$163);
                                                                            final SubLObject valid_$164 = makeBoolean(!token_var_$163.eql(assertion4));
                                                                            if ((NIL != valid_$164) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength))) {
                                                                                final SubLObject link_node5 = cycl_utilities.formula_arg(assertion4, gather_argnum, UNPROVIDED);
                                                                                final SubLObject assertion_$165 = assertion4;
                                                                                ghl_mark_and_sweep_depth_cutoff(v_search, link_node5, new_depth);
                                                                                if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                    final SubLObject link_pred5 = ghl_link_iterators.get_ghl_link_pred();
                                                                                    final SubLObject link_direction3 = ghl_link_iterators.get_ghl_link_direction();
                                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred5)) {
                                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node5, link_direction3, sbhl_link_vars.get_sbhl_link_mt());
                                                                                    } else {
                                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$165);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_$162 = makeBoolean((NIL == valid_$164) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values = getValuesAsVector();
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                            restoreValuesFromVector(_values);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                            } 
                                                        }
                                                    } finally {
                                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$149, thread);
                                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$152, thread);
                                                    }
                                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                                        final SubLObject _prev_bind_0_$154 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                        try {
                                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$144, thread);
                                                            SubLObject rest2;
                                                            SubLObject gather_sentence_mt_pair;
                                                            SubLObject current;
                                                            SubLObject datum;
                                                            SubLObject assertion5;
                                                            SubLObject var_mt;
                                                            SubLObject link_node6;
                                                            SubLObject assertion_$166;
                                                            SubLObject link_pred6;
                                                            SubLObject link_direction4;
                                                            for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                                gather_sentence_mt_pair = rest2.first();
                                                                datum = current = gather_sentence_mt_pair;
                                                                assertion5 = NIL;
                                                                var_mt = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list10);
                                                                assertion5 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list10);
                                                                var_mt = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion5, strength)) {
                                                                        link_node6 = cycl_utilities.formula_arg(assertion5, gather_argnum, UNPROVIDED);
                                                                        assertion_$166 = assertion5;
                                                                        ghl_mark_and_sweep_depth_cutoff(v_search, link_node6, new_depth);
                                                                        if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                            link_pred6 = ghl_link_iterators.get_ghl_link_pred();
                                                                            link_direction4 = ghl_link_iterators.get_ghl_link_direction();
                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred6)) {
                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node6, link_direction4, sbhl_link_vars.get_sbhl_link_mt());
                                                                            } else {
                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$166);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list10);
                                                                }
                                                            }
                                                        } finally {
                                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$154, thread);
                                                        }
                                                    }
                                                    if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                                        final SubLObject _prev_bind_0_$155 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                                        try {
                                                            ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                            final SubLObject _prev_bind_0_$156 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$150 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                            try {
                                                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$144, thread);
                                                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                                final SubLObject pred_var2 = NIL;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                                    SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                    final SubLObject token_var2 = NIL;
                                                                    while (NIL == done_var2) {
                                                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                        if (NIL != valid2) {
                                                                            SubLObject final_index_iterator2 = NIL;
                                                                            try {
                                                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                                SubLObject done_var_$163 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                                final SubLObject token_var_$164 = NIL;
                                                                                while (NIL == done_var_$163) {
                                                                                    final SubLObject assertion6 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$164);
                                                                                    final SubLObject valid_$165 = makeBoolean(!token_var_$164.eql(assertion6));
                                                                                    if ((NIL != valid_$165) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion6, strength))) {
                                                                                        final SubLObject link_node7 = cycl_utilities.formula_arg(assertion6, index_argnum, UNPROVIDED);
                                                                                        final SubLObject assertion_$167 = assertion6;
                                                                                        ghl_mark_and_sweep_depth_cutoff(v_search, link_node7, new_depth);
                                                                                        if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                            final SubLObject link_pred7 = ghl_link_iterators.get_ghl_link_pred();
                                                                                            final SubLObject link_direction5 = ghl_link_iterators.get_ghl_link_direction();
                                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred7)) {
                                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node7, link_direction5, sbhl_link_vars.get_sbhl_link_mt());
                                                                                            } else {
                                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$167);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_$163 = makeBoolean((NIL == valid_$165) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                                } 
                                                                            } finally {
                                                                                final SubLObject _prev_bind_0_$157 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values2 = getValuesAsVector();
                                                                                    if (NIL != final_index_iterator2) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                                    }
                                                                                    restoreValuesFromVector(_values2);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$157, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                    } 
                                                                }
                                                            } finally {
                                                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$150, thread);
                                                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$156, thread);
                                                            }
                                                            if (NIL != gt_vars.gt_use_sksiP()) {
                                                                final SubLObject _prev_bind_0_$158 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                                try {
                                                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$144, thread);
                                                                    SubLObject rest3;
                                                                    SubLObject gather_sentence_mt_pair2;
                                                                    SubLObject current2;
                                                                    SubLObject datum2;
                                                                    SubLObject assertion7;
                                                                    SubLObject var_mt2;
                                                                    SubLObject link_node8;
                                                                    SubLObject assertion_$168;
                                                                    SubLObject link_pred8;
                                                                    SubLObject link_direction6;
                                                                    for (rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest3); rest3 = rest3.rest()) {
                                                                        gather_sentence_mt_pair2 = rest3.first();
                                                                        datum2 = current2 = gather_sentence_mt_pair2;
                                                                        assertion7 = NIL;
                                                                        var_mt2 = NIL;
                                                                        destructuring_bind_must_consp(current2, datum2, $list10);
                                                                        assertion7 = current2.first();
                                                                        current2 = current2.rest();
                                                                        destructuring_bind_must_consp(current2, datum2, $list10);
                                                                        var_mt2 = current2.first();
                                                                        current2 = current2.rest();
                                                                        if (NIL == current2) {
                                                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion7, strength)) {
                                                                                link_node8 = cycl_utilities.formula_arg(assertion7, index_argnum, UNPROVIDED);
                                                                                assertion_$168 = assertion7;
                                                                                ghl_mark_and_sweep_depth_cutoff(v_search, link_node8, new_depth);
                                                                                if (NIL != ghl_search_vars.ghl_add_unwind_edges_now_p(v_search)) {
                                                                                    link_pred8 = ghl_link_iterators.get_ghl_link_pred();
                                                                                    link_direction6 = ghl_link_iterators.get_ghl_link_direction();
                                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred8)) {
                                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), node, link_node8, link_direction6, sbhl_link_vars.get_sbhl_link_mt());
                                                                                    } else {
                                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$168);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum2, $list10);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$158, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$155, thread);
                                                        }
                                                    }
                                                    csome_list_var3 = csome_list_var3.rest();
                                                    search_direction3 = csome_list_var3.first();
                                                } 
                                            }
                                        } finally {
                                            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$151, thread);
                                        }
                                    }

                            } finally {
                                ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                                ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
                            }
                            pred = pred.rest();
                            pred_$144 = pred.first();
                            direction = direction.rest();
                            direction_$145 = direction.first();
                        } 
                    }
                }

        }
        return NIL;
    }

    public static SubLObject ghl_all_edges_iterative_deepening_initializer(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$179 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject n;
                    for (n = NIL, n = ZERO_INTEGER; n.numL(depth); n = add(n, ONE_INTEGER)) {
                        ghl_search_vars.reinitialize_ghl_spaces(v_search);
                        ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, node, number_utilities.f_1X(n));
                    }
                } finally {
                    final SubLObject _prev_bind_0_$180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$180, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$179, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(final SubLObject v_search, final SubLObject node, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((!depth.numE(ZERO_INTEGER)) && (NIL != ghl_marking_utilities.ghl_goal_node_with_equal_or_shallower_depth_p(v_search, node, depth))) {
            return NIL;
        }
        final SubLObject goal_nodeP = ghl_search_utilities.ghl_goal_nodeP(v_search, node, UNPROVIDED);
        SubLObject unwind_from_goalP = NIL;
        SubLObject unwind_from_transitivityP = NIL;
        SubLObject unwind_nowP = NIL;
        SubLObject stop = NIL;
        if (NIL != goal_nodeP) {
            if ((NIL != ghl_search_vars.ghl_multiple_goals_p(v_search)) || (NIL != ghl_search_vars.ghl_goal_fn_p(v_search))) {
                unwind_from_goalP = T;
            } else
                if (NIL != ghl_search_vars.ghl_single_goal_p(v_search)) {
                    unwind_from_goalP = T;
                    if (NIL == ghl_search_vars.ghl_return_all_justificationsP(v_search)) {
                        ghl_search_utilities.ghl_resolve_goal_found(v_search, node);
                    }
                    stop = T;
                }

        }
        if ((NIL == ghl_search_vars.ghl_goal_search_p(v_search)) && (NIL != ghl_search_vars.ghl_return_all_justificationsP(v_search))) {
            unwind_from_goalP = T;
        }
        if ((NIL == stop) && (NIL == ghl_marking_utilities.ghl_node_with_equal_or_shallower_depth_p(v_search, node, depth))) {
            ghl_marking_utilities.ghl_mark_node(v_search, node, depth);
            final SubLObject new_depth = number_utilities.f_1_(depth);
            final SubLObject preds = ghl_search_vars.ghl_relevant_predicates(v_search);
            final SubLObject directions = ghl_search_vars.ghl_relevant_directions(v_search);
            if (!new_depth.numL(ZERO_INTEGER)) {
                SubLObject pred = NIL;
                SubLObject pred_$181 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$182 = NIL;
                pred = preds;
                pred_$181 = pred.first();
                direction = directions;
                direction_$182 = direction.first();
                while ((NIL != direction) || (NIL != pred)) {
                    final SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$181, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$182, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$181)) {
                            final SubLObject node_$183 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$184 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$185 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$181), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$181)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$181)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$181), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$183)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$183, sbhl_module_vars.get_sbhl_module(pred_$181));
                                    if (NIL != d_link) {
                                        if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                            SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$182);
                                            SubLObject search_direction = NIL;
                                            search_direction = csome_list_var.first();
                                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$181));
                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$181));
                                                if (NIL != mt_links) {
                                                    SubLObject iteration_state;
                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                            final SubLObject _prev_bind_0_$185 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                SubLObject iteration_state_$187;
                                                                for (iteration_state_$187 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$187)); iteration_state_$187 = dictionary_contents.do_dictionary_contents_next(iteration_state_$187)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$187);
                                                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                        final SubLObject _prev_bind_0_$186 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                            final SubLObject sol = link_nodes_var;
                                                                            if (NIL != set.set_p(sol)) {
                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                SubLObject basis_object;
                                                                                SubLObject state;
                                                                                SubLObject link_node;
                                                                                SubLObject assertion;
                                                                                SubLObject link_pred;
                                                                                SubLObject link_direction_$189;
                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                        assertion = ghl_link_iterators.ghl_make_sbhl_support(pred_$181, node, link_node, direction_$182);
                                                                                        unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node, new_depth);
                                                                                        if (NIL != unwind_nowP) {
                                                                                            unwind_from_transitivityP = T;
                                                                                            ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node, new_depth);
                                                                                            link_pred = ghl_link_iterators.get_ghl_link_pred();
                                                                                            link_direction_$189 = ghl_link_iterators.get_ghl_link_direction();
                                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred)) {
                                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred, node, link_node, link_direction_$189, sbhl_link_vars.get_sbhl_link_mt());
                                                                                            } else {
                                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol.isList()) {
                                                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                                        SubLObject csome_list_var_$190 = sol;
                                                                                        SubLObject link_node2 = NIL;
                                                                                        link_node2 = csome_list_var_$190.first();
                                                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$190)) {
                                                                                            final SubLObject assertion2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$181, node, link_node2, direction_$182);
                                                                                            unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node2, new_depth);
                                                                                            if (NIL != unwind_nowP) {
                                                                                                unwind_from_transitivityP = T;
                                                                                                ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node2, new_depth);
                                                                                                final SubLObject link_pred2 = ghl_link_iterators.get_ghl_link_pred();
                                                                                                final SubLObject link_direction_$190 = ghl_link_iterators.get_ghl_link_direction();
                                                                                                if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred2)) {
                                                                                                    ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred2, node, link_node2, link_direction_$190, sbhl_link_vars.get_sbhl_link_mt());
                                                                                                } else {
                                                                                                    ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion2);
                                                                                                }
                                                                                            }
                                                                                            csome_list_var_$190 = csome_list_var_$190.rest();
                                                                                            link_node2 = csome_list_var_$190.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$186, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$187);
                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$185, thread);
                                                            }
                                                        }
                                                    }
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                search_direction = csome_list_var.first();
                                            } 
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if ((NIL != term.closed_nautP(node_$183, UNPROVIDED)) && (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$182);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var2)) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$181));
                                            final SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$181))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$181));
                                            SubLObject rest;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$187;
                                            SubLObject sol2;
                                            SubLObject link_nodes_var2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject link_node3;
                                            SubLObject assertion3;
                                            SubLObject link_pred3;
                                            SubLObject link_direction_$191;
                                            SubLObject csome_list_var_$191;
                                            SubLObject link_node4;
                                            SubLObject assertion4;
                                            SubLObject link_pred4;
                                            SubLObject link_direction_$192;
                                            for (rest = NIL, rest = new_list; (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                                generating_fn = rest.first();
                                                _prev_bind_0_$187 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    link_nodes_var2 = sol2 = funcall(generating_fn, node_$183);
                                                    if (NIL != set.set_p(sol2)) {
                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                assertion3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$181, node, link_node3, direction_$182);
                                                                unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node3, new_depth);
                                                                if (NIL != unwind_nowP) {
                                                                    unwind_from_transitivityP = T;
                                                                    ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node3, new_depth);
                                                                    link_pred3 = ghl_link_iterators.get_ghl_link_pred();
                                                                    link_direction_$191 = ghl_link_iterators.get_ghl_link_direction();
                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred3)) {
                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred3, node, link_node3, link_direction_$191, sbhl_link_vars.get_sbhl_link_mt());
                                                                    } else {
                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var_$191 = sol2;
                                                                link_node4 = NIL;
                                                                link_node4 = csome_list_var_$191.first();
                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$191)) {
                                                                    assertion4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$181, node, link_node4, direction_$182);
                                                                    unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node4, new_depth);
                                                                    if (NIL != unwind_nowP) {
                                                                        unwind_from_transitivityP = T;
                                                                        ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node4, new_depth);
                                                                        link_pred4 = ghl_link_iterators.get_ghl_link_pred();
                                                                        link_direction_$192 = ghl_link_iterators.get_ghl_link_direction();
                                                                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred4)) {
                                                                            ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred4, node, link_node4, link_direction_$192, sbhl_link_vars.get_sbhl_link_mt());
                                                                        } else {
                                                                            ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion4);
                                                                        }
                                                                    }
                                                                    csome_list_var_$191 = csome_list_var_$191.rest();
                                                                    link_node4 = csome_list_var_$191.first();
                                                                } 
                                                            }
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$187, thread);
                                                }
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$185, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$184, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$181)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$188 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                        SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$182);
                                        SubLObject search_direction3 = NIL;
                                        search_direction3 = csome_list_var3.first();
                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var3)) {
                                            final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                            final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                            final SubLObject _prev_bind_0_$189 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$186 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                            try {
                                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$181, thread);
                                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                final SubLObject pred_var = NIL;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                    SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                                SubLObject done_var_$199 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                final SubLObject token_var_$200 = NIL;
                                                                while (NIL == done_var_$199) {
                                                                    final SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$200);
                                                                    final SubLObject valid_$201 = makeBoolean(!token_var_$200.eql(assertion4));
                                                                    if ((NIL != valid_$201) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength))) {
                                                                        final SubLObject link_node5 = cycl_utilities.formula_arg(assertion4, gather_argnum, UNPROVIDED);
                                                                        final SubLObject assertion_$202 = assertion4;
                                                                        unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node5, new_depth);
                                                                        if (NIL != unwind_nowP) {
                                                                            unwind_from_transitivityP = T;
                                                                            ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node5, new_depth);
                                                                            final SubLObject link_pred5 = ghl_link_iterators.get_ghl_link_pred();
                                                                            final SubLObject link_direction3 = ghl_link_iterators.get_ghl_link_direction();
                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred5)) {
                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred5, node, link_node5, link_direction3, sbhl_link_vars.get_sbhl_link_mt());
                                                                            } else {
                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$202);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$199 = makeBoolean((NIL == valid_$201) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$190 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$190, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                    } 
                                                }
                                            } finally {
                                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$186, thread);
                                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$189, thread);
                                            }
                                            if (NIL != gt_vars.gt_use_sksiP()) {
                                                final SubLObject _prev_bind_0_$191 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$181, thread);
                                                    SubLObject rest2;
                                                    SubLObject gather_sentence_mt_pair;
                                                    SubLObject current;
                                                    SubLObject datum;
                                                    SubLObject assertion5;
                                                    SubLObject var_mt;
                                                    SubLObject link_node6;
                                                    SubLObject assertion_$203;
                                                    SubLObject link_pred6;
                                                    SubLObject link_direction4;
                                                    for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                        gather_sentence_mt_pair = rest2.first();
                                                        datum = current = gather_sentence_mt_pair;
                                                        assertion5 = NIL;
                                                        var_mt = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        assertion5 = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list10);
                                                        var_mt = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion5, strength)) {
                                                                link_node6 = cycl_utilities.formula_arg(assertion5, gather_argnum, UNPROVIDED);
                                                                assertion_$203 = assertion5;
                                                                unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node6, new_depth);
                                                                if (NIL != unwind_nowP) {
                                                                    unwind_from_transitivityP = T;
                                                                    ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node6, new_depth);
                                                                    link_pred6 = ghl_link_iterators.get_ghl_link_pred();
                                                                    link_direction4 = ghl_link_iterators.get_ghl_link_direction();
                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred6)) {
                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred6, node, link_node6, link_direction4, sbhl_link_vars.get_sbhl_link_mt());
                                                                    } else {
                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$203);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list10);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$191, thread);
                                                }
                                            }
                                            if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                                final SubLObject _prev_bind_0_$192 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                                try {
                                                    ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                    final SubLObject _prev_bind_0_$193 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$187 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                    try {
                                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$181, thread);
                                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                        final SubLObject pred_var2 = NIL;
                                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                            SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                            final SubLObject token_var2 = NIL;
                                                            while (NIL == done_var2) {
                                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                                if (NIL != valid2) {
                                                                    SubLObject final_index_iterator2 = NIL;
                                                                    try {
                                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                        SubLObject done_var_$200 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                                        final SubLObject token_var_$201 = NIL;
                                                                        while (NIL == done_var_$200) {
                                                                            final SubLObject assertion6 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$201);
                                                                            final SubLObject valid_$202 = makeBoolean(!token_var_$201.eql(assertion6));
                                                                            if ((NIL != valid_$202) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion6, strength))) {
                                                                                final SubLObject link_node7 = cycl_utilities.formula_arg(assertion6, index_argnum, UNPROVIDED);
                                                                                final SubLObject assertion_$204 = assertion6;
                                                                                unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node7, new_depth);
                                                                                if (NIL != unwind_nowP) {
                                                                                    unwind_from_transitivityP = T;
                                                                                    ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node7, new_depth);
                                                                                    final SubLObject link_pred7 = ghl_link_iterators.get_ghl_link_pred();
                                                                                    final SubLObject link_direction5 = ghl_link_iterators.get_ghl_link_direction();
                                                                                    if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred7)) {
                                                                                        ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred7, node, link_node7, link_direction5, sbhl_link_vars.get_sbhl_link_mt());
                                                                                    } else {
                                                                                        ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$204);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_$200 = makeBoolean((NIL == valid_$202) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                                        } 
                                                                    } finally {
                                                                        final SubLObject _prev_bind_0_$194 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            final SubLObject _values2 = getValuesAsVector();
                                                                            if (NIL != final_index_iterator2) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                            }
                                                                            restoreValuesFromVector(_values2);
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$194, thread);
                                                                        }
                                                                    }
                                                                }
                                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                            } 
                                                        }
                                                    } finally {
                                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$187, thread);
                                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$193, thread);
                                                    }
                                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                                        final SubLObject _prev_bind_0_$195 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                        try {
                                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$181, thread);
                                                            SubLObject rest3;
                                                            SubLObject gather_sentence_mt_pair2;
                                                            SubLObject current2;
                                                            SubLObject datum2;
                                                            SubLObject assertion7;
                                                            SubLObject var_mt2;
                                                            SubLObject link_node8;
                                                            SubLObject assertion_$205;
                                                            SubLObject link_pred8;
                                                            SubLObject link_direction6;
                                                            for (rest3 = NIL, rest3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest3); rest3 = rest3.rest()) {
                                                                gather_sentence_mt_pair2 = rest3.first();
                                                                datum2 = current2 = gather_sentence_mt_pair2;
                                                                assertion7 = NIL;
                                                                var_mt2 = NIL;
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                assertion7 = current2.first();
                                                                current2 = current2.rest();
                                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                                var_mt2 = current2.first();
                                                                current2 = current2.rest();
                                                                if (NIL == current2) {
                                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion7, strength)) {
                                                                        link_node8 = cycl_utilities.formula_arg(assertion7, index_argnum, UNPROVIDED);
                                                                        assertion_$205 = assertion7;
                                                                        unwind_nowP = ghl_mark_and_sweep_depth_cutoff_all_edges_unwound(v_search, link_node8, new_depth);
                                                                        if (NIL != unwind_nowP) {
                                                                            unwind_from_transitivityP = T;
                                                                            ghl_marking_utilities.ghl_goal_mark_node(v_search, link_node8, new_depth);
                                                                            link_pred8 = ghl_link_iterators.get_ghl_link_pred();
                                                                            link_direction6 = ghl_link_iterators.get_ghl_link_direction();
                                                                            if (NIL != sbhl_module_utilities.sbhl_predicate_p(link_pred8)) {
                                                                                ghl_search_utilities.ghl_add_sbhl_assertion_to_result(v_search, link_pred8, node, link_node8, link_direction6, sbhl_link_vars.get_sbhl_link_mt());
                                                                            } else {
                                                                                ghl_search_utilities.ghl_add_gt_assertion_to_result(v_search, assertion_$205);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum2, $list10);
                                                                }
                                                            }
                                                        } finally {
                                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$195, thread);
                                                        }
                                                    }
                                                } finally {
                                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$192, thread);
                                                }
                                            }
                                            csome_list_var3 = csome_list_var3.rest();
                                            search_direction3 = csome_list_var3.first();
                                        } 
                                    }
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$188, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_2, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
                    }
                    pred = pred.rest();
                    pred_$181 = pred.first();
                    direction = direction.rest();
                    direction_$182 = direction.first();
                } 
            }
        }
        return makeBoolean((NIL != unwind_from_goalP) || (NIL != unwind_from_transitivityP));
    }

    public static SubLObject do_ghl_closure(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node = NIL;
        SubLObject pred = NIL;
        SubLObject node = NIL;
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        link_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        direction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$216 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list16);
            current_$216 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list16);
            if (NIL == member(current_$216, $list17, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$216 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list16);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject tv_tail = property_list_member($TV, current);
        final SubLObject tv = (NIL != tv_tail) ? cadr(tv_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject order_tail = property_list_member($ORDER, current);
        final SubLObject order = (NIL != order_tail) ? cadr(order_tail) : $DEPTH_FIRST;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym24$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_GHL_CLOSURE_ITERATOR, pred, node, direction, mt, tv, order))), listS(DO_ITERATOR, list(link_node, iterator, $DONE, done), append(body, NIL)));
    }

    public static SubLObject new_ghl_closure_iterator(final SubLObject pred, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv, SubLObject search_order, SubLObject return_non_transitive_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (search_order == UNPROVIDED) {
            search_order = $BREADTH_FIRST;
        }
        if (return_non_transitive_resultsP == UNPROVIDED) {
            return_non_transitive_resultsP = T;
        }
        final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, list(pred), $TYPE, $TRANSITIVE_REASONING, $ORDER, search_order, $DIRECTIONS, list(direction), $TV, tv, $MARKING, $SIMPLE, $MARKING_SPACE, ghl_marking_utilities.ghl_instantiate_new_space() }));
        final SubLObject reflexiveP = fort_types_interface.reflexive_binary_predicate_p(pred);
        return new_ghl_closure_search_iterator(v_search, node, mt, reflexiveP, return_non_transitive_resultsP);
    }

    public static SubLObject do_ghl_closures(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node = NIL;
        SubLObject preds = NIL;
        SubLObject node = NIL;
        SubLObject directions = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        link_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        preds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        directions = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$217 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list36);
            current_$217 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list36);
            if (NIL == member(current_$217, $list17, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$217 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list36);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject tv_tail = property_list_member($TV, current);
        final SubLObject tv = (NIL != tv_tail) ? cadr(tv_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject order_tail = property_list_member($ORDER, current);
        final SubLObject order = (NIL != order_tail) ? cadr(order_tail) : $DEPTH_FIRST;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym37$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_GHL_CLOSURES_ITERATOR, preds, node, directions, mt, tv, order))), listS(DO_ITERATOR, list(link_node, iterator, $DONE, done), append(body, NIL)));
    }

    public static SubLObject new_ghl_closures_iterator(final SubLObject preds, final SubLObject node, final SubLObject directions, SubLObject mt, SubLObject tv, SubLObject search_order, SubLObject return_non_transitive_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (search_order == UNPROVIDED) {
            search_order = $BREADTH_FIRST;
        }
        if (return_non_transitive_resultsP == UNPROVIDED) {
            return_non_transitive_resultsP = T;
        }
        final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, preds, $TYPE, $TRANSITIVE_REASONING, $ORDER, search_order, $DIRECTIONS, directions, $TV, tv, $MARKING, $SIMPLE, $MARKING_SPACE, ghl_marking_utilities.ghl_instantiate_new_space() }));
        final SubLObject reflexiveP = list_utilities.every_in_list(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED);
        return new_ghl_closure_search_iterator(v_search, node, mt, reflexiveP, return_non_transitive_resultsP);
    }

    public static SubLObject new_removal_ghl_closure_iterator(final SubLObject pred, final SubLObject node, final SubLObject direction, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return new_ghl_closure_iterator(pred, node, direction, mt, NIL, $BREADTH_FIRST, NIL);
    }

    public static SubLObject new_ghl_closure_search_iterator(final SubLObject v_search, final SubLObject start_node, final SubLObject mt, final SubLObject reflexiveP, final SubLObject return_non_transitive_resultsP) {
        final SubLObject state = ghl_closure_search_iterator_state(v_search, start_node, mt, reflexiveP, return_non_transitive_resultsP);
        return iteration.new_iterator(state, GHL_CLOSURE_SEARCH_ITERATOR_DONE, GHL_CLOSURE_SEARCH_ITERATOR_NEXT, GHL_CLOSURE_SEARCH_ITERATOR_FINALIZE);
    }

    public static SubLObject ghl_closure_search_iterator_state(final SubLObject v_search, final SubLObject start_node, final SubLObject mt, final SubLObject reflexiveP, final SubLObject return_non_transitive_resultsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_deck = (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? deck.create_deck($STACK) : deck.create_deck($QUEUE);
        if (NIL == return_non_transitive_resultsP) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                ghl_marking_utilities.ghl_mark_node(v_search, start_node, $START);
                SubLObject pred = NIL;
                SubLObject pred_$218 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$219 = NIL;
                pred = ghl_search_vars.ghl_relevant_predicates(v_search);
                pred_$218 = pred.first();
                direction = ghl_search_vars.ghl_relevant_directions(v_search);
                direction_$219 = direction.first();
                while ((NIL != direction) || (NIL != pred)) {
                    final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                    final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                    final SubLObject _prev_bind_0_$220 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                    try {
                        ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$219);
                        SubLObject search_direction = NIL;
                        search_direction = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                            final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                            final SubLObject _prev_bind_0_$221 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$222 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            try {
                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$218, thread);
                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                final SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(start_node, index_argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(start_node, index_argnum, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                SubLObject done_var_$223 = NIL;
                                                final SubLObject token_var_$224 = NIL;
                                                while (NIL == done_var_$223) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$224);
                                                    final SubLObject valid_$225 = makeBoolean(!token_var_$224.eql(assertion));
                                                    if ((NIL != valid_$225) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                        final SubLObject one_step_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                        final SubLObject assertion_$226 = assertion;
                                                        ghl_marking_utilities.ghl_mark_node(v_search, one_step_node, $START);
                                                        ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node, search_deck);
                                                    }
                                                    done_var_$223 = makeBoolean(NIL == valid_$225);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$222 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$222, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            } finally {
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$222, thread);
                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$221, thread);
                            }
                            if (NIL != gt_vars.gt_use_sksiP()) {
                                final SubLObject _prev_bind_0_$223 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$218, thread);
                                    SubLObject cdolist_list_var = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(start_node, index_argnum, truth);
                                    SubLObject gather_sentence_mt_pair = NIL;
                                    gather_sentence_mt_pair = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = gather_sentence_mt_pair;
                                        SubLObject assertion2 = NIL;
                                        SubLObject var_mt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list10);
                                        assertion2 = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list10);
                                        var_mt = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                final SubLObject one_step_node2 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                final SubLObject assertion_$227 = assertion2;
                                                ghl_marking_utilities.ghl_mark_node(v_search, one_step_node2, $START);
                                                ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node2, search_deck);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list10);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        gather_sentence_mt_pair = cdolist_list_var.first();
                                    } 
                                } finally {
                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$223, thread);
                                }
                            }
                            if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                final SubLObject _prev_bind_0_$224 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                    final SubLObject _prev_bind_0_$225 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$223 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                    try {
                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$218, thread);
                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                        final SubLObject pred_var2 = NIL;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(start_node, gather_argnum, pred_var2)) {
                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(start_node, gather_argnum, pred_var2);
                                            SubLObject done_var2 = NIL;
                                            final SubLObject token_var2 = NIL;
                                            while (NIL == done_var2) {
                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                if (NIL != valid2) {
                                                    SubLObject final_index_iterator2 = NIL;
                                                    try {
                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                        SubLObject done_var_$224 = NIL;
                                                        final SubLObject token_var_$225 = NIL;
                                                        while (NIL == done_var_$224) {
                                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$225);
                                                            final SubLObject valid_$226 = makeBoolean(!token_var_$225.eql(assertion3));
                                                            if ((NIL != valid_$226) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                final SubLObject one_step_node3 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                final SubLObject assertion_$228 = assertion3;
                                                                ghl_marking_utilities.ghl_mark_node(v_search, one_step_node3, $START);
                                                                ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node3, search_deck);
                                                            }
                                                            done_var_$224 = makeBoolean(NIL == valid_$226);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$226 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            if (NIL != final_index_iterator2) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                            }
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$226, thread);
                                                        }
                                                    }
                                                }
                                                done_var2 = makeBoolean(NIL == valid2);
                                            } 
                                        }
                                    } finally {
                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$223, thread);
                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$225, thread);
                                    }
                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                        final SubLObject _prev_bind_0_$227 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                        try {
                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$218, thread);
                                            SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(start_node, gather_argnum, truth);
                                            SubLObject gather_sentence_mt_pair2 = NIL;
                                            gather_sentence_mt_pair2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                SubLObject current2;
                                                final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                SubLObject assertion4 = NIL;
                                                SubLObject var_mt2 = NIL;
                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                assertion4 = current2.first();
                                                current2 = current2.rest();
                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                var_mt2 = current2.first();
                                                current2 = current2.rest();
                                                if (NIL == current2) {
                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                        final SubLObject one_step_node4 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                        final SubLObject assertion_$229 = assertion4;
                                                        ghl_marking_utilities.ghl_mark_node(v_search, one_step_node4, $START);
                                                        ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node4, search_deck);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum2, $list10);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                gather_sentence_mt_pair2 = cdolist_list_var2.first();
                                            } 
                                        } finally {
                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$227, thread);
                                        }
                                    }
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$224, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            search_direction = csome_list_var.first();
                        } 
                    } finally {
                        ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$220, thread);
                    }
                    pred = pred.rest();
                    pred_$218 = pred.first();
                    direction = direction.rest();
                    direction_$219 = direction.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL == reflexiveP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                    ghl_marking_utilities.ghl_mark_node(v_search, start_node, $START);
                    ghl_add_accessible_link_nodes_to_deck(v_search, start_node, search_deck);
                } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            } else {
                deck.deck_push(start_node, search_deck);
            }

        return list(v_search, search_deck, mt);
    }

    public static SubLObject ghl_closure_search_iterator_done(final SubLObject state) {
        SubLObject v_search = NIL;
        SubLObject search_deck = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(state, state, $list44);
        v_search = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list44);
        search_deck = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list44);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            return deck.deck_empty_p(search_deck);
        }
        cdestructuring_bind_error(state, $list44);
        return NIL;
    }

    public static SubLObject ghl_closure_search_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_search = NIL;
        SubLObject search_deck = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(state, state, $list44);
        v_search = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list44);
        search_deck = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list44);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject result = NIL;
            while ((NIL == result) && (NIL == deck.deck_empty_p(search_deck))) {
                final SubLObject node = deck.deck_pop(search_deck);
                final SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                if (NIL == mark) {
                    ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ghl_add_accessible_link_nodes_to_deck(v_search, node, search_deck);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    result = node;
                } else {
                    if (mark != $START) {
                        continue;
                    }
                    ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                    result = node;
                }
            } 
            return values(result, state, sublisp_null(result));
        }
        cdestructuring_bind_error(state, $list44);
        return NIL;
    }

    public static SubLObject ghl_closure_search_iterator_finalize(final SubLObject state) {
        SubLObject v_search = NIL;
        SubLObject search_deck = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(state, state, $list44);
        v_search = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list44);
        search_deck = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list44);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            ghl_search_vars.destroy_ghl_search(v_search);
            deck.clear_deck(search_deck);
            return T;
        }
        cdestructuring_bind_error(state, $list44);
        return NIL;
    }

    public static SubLObject ghl_closure(final SubLObject pred, final SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv) {
        if (direction == UNPROVIDED) {
            direction = ghl_search_vars.ghl_forward_direction();
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)) {
            result = cons(node, result);
        }
        final SubLObject iterator = new_ghl_closure_iterator(pred, node, direction, mt, tv, $BREADTH_FIRST, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject link_node = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                result = cons(link_node, result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject ghl_all_backward_true_nodes(final SubLObject pred, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return ghl_closure(pred, node, $BACKWARD, mt, tv);
    }

    public static SubLObject ghl_all_forward_true_nodes(final SubLObject pred, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return ghl_closure(pred, node, $FORWARD, mt, tv);
    }

    public static SubLObject ghl_record_closure(final SubLObject pred, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, list(pred), $TYPE, $TRANSITIVE_REASONING, $ORDER, $DEPTH_FIRST, $DIRECTIONS, list(direction), $MARKING, $SIMPLE, $MARKING_SPACE, ghl_marking_utilities.$ghl_table$.getDynamicValue(thread) }));
            graphl_graph_utilities.reset_graphl_finished();
            ghl_mark_and_sweep(v_search, node);
            ghl_search_vars.destroy_ghl_search(v_search);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ghl_record_all_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        ghl_record_closure(module, node, $BACKWARD, mt, tv);
        return NIL;
    }

    public static SubLObject ghl_record_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        ghl_record_closure(module, node, $FORWARD, mt, tv);
        return NIL;
    }

    public static SubLObject ghl_closures(final SubLObject preds, final SubLObject node, final SubLObject directions, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != list_utilities.any_in_list(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED)) {
            result = cons(node, result);
        }
        final SubLObject iterator = new_ghl_closures_iterator(preds, node, directions, mt, tv, $BREADTH_FIRST, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject link_node = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                result = cons(link_node, result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject ghl_predicate_relation_p(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject return_non_transitive_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (return_non_transitive_resultsP == UNPROVIDED) {
            return_non_transitive_resultsP = NIL;
        }
        return NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ? sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), node1, node2, mt, tv) : gt_predicate_relation_p(pred, node1, node2, mt, tv, return_non_transitive_resultsP);
    }

    public static SubLObject gt_predicate_relation_p(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject return_non_transitive_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (return_non_transitive_resultsP == UNPROVIDED) {
            return_non_transitive_resultsP = NIL;
        }
        final SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
        final SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
        final SubLObject start_node = (NIL != forwardP) ? node1 : node2;
        final SubLObject goal_node = (NIL != forwardP) ? node2 : node1;
        return gt_predicates_relation_p(list(pred), list(direction), start_node, goal_node, mt, tv, return_non_transitive_resultsP);
    }

    public static SubLObject possibly_reverse_nodes_and_directions(final SubLObject preds, SubLObject directions, SubLObject start_node, SubLObject goal_node) {
        final SubLObject most_general_pred = cardinality_estimates.most_general_term(preds);
        if (!ghl_search_vars.ghl_direction_for_predicate_relation(most_general_pred).eql(nth(position(most_general_pred, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), directions))) {
            final SubLObject swap_var = start_node;
            start_node = goal_node;
            goal_node = swap_var;
            directions = Mapping.mapcar(GHL_OPPOSITE_DIRECTION, directions);
        }
        return values(start_node, goal_node, directions);
    }

    public static SubLObject gt_predicates_relation_p(final SubLObject preds, SubLObject directions, SubLObject start_node, SubLObject goal_node, SubLObject mt, SubLObject tv, SubLObject return_non_transitive_resultsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (return_non_transitive_resultsP == UNPROVIDED) {
            return_non_transitive_resultsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (start_node.equal(goal_node) && (NIL != list_utilities.any_in_list(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED))) {
                result = T;
            } else
                if (start_node.equal(goal_node) && (NIL != list_utilities.any_in_list(IRREFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED))) {
                    result = NIL;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject start_node_$240 = possibly_reverse_nodes_and_directions(preds, directions, start_node, goal_node);
                    final SubLObject goal_node_$241 = thread.secondMultipleValue();
                    final SubLObject directions_$242 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    start_node = start_node_$240;
                    goal_node = goal_node_$241;
                    directions = directions_$242;
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, preds, $ORDER, $BREADTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, directions, $TV, tv, $MARKING, $SIMPLE, $GOAL_SEARCH_P, T, $GOAL, list(goal_node) }));
                    graphl_graph_utilities.reset_graphl_finished();
                    final SubLObject search_deck = (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? deck.create_deck($STACK) : deck.create_deck($QUEUE);
                    final SubLObject allow_reflexive_goalP = makeBoolean((NIL != return_non_transitive_resultsP) || (NIL != list_utilities.any_in_list(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED)));
                    ghl_marking_utilities.ghl_mark_node(v_search, start_node, $START);
                    gt_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, start_node, search_deck, allow_reflexive_goalP);
                    for (SubLObject node = deck.deck_pop(search_deck); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != node); node = deck.deck_pop(search_deck)) {
                        final SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                        if (NIL == mark) {
                            ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                gt_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, node, search_deck, T);
                            }
                        } else
                            if (mark == $START) {
                                ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                            }

                    }
                    result = list_utilities.sublisp_boolean(ghl_search_vars.ghl_result(v_search));
                    ghl_search_vars.destroy_ghl_search(v_search);
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gt_predicate_relation_p_add_accessible_link_nodes_to_deck(final SubLObject v_search, final SubLObject node, final SubLObject v_deck, final SubLObject allow_reflexive_goalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = NIL;
        SubLObject pred_$243 = NIL;
        SubLObject direction = NIL;
        SubLObject direction_$244 = NIL;
        pred = ghl_search_vars.ghl_relevant_predicates(v_search);
        pred_$243 = pred.first();
        direction = ghl_search_vars.ghl_relevant_directions(v_search);
        direction_$244 = direction.first();
        while ((NIL != direction) || (NIL != pred)) {
            final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
            final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
            final SubLObject _prev_bind_0 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
            try {
                ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                    SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$244);
                    SubLObject search_direction = NIL;
                    search_direction = csome_list_var.first();
                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                        final SubLObject _prev_bind_0_$245 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        try {
                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$243, thread);
                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                            final SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                            SubLObject done_var_$246 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                            final SubLObject token_var_$247 = NIL;
                                            while (NIL == done_var_$246) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$247);
                                                final SubLObject valid_$248 = makeBoolean(!token_var_$247.eql(assertion));
                                                if ((NIL != valid_$248) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                    final SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                    final SubLObject assertion_$249 = assertion;
                                                    if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node)) || (NIL != allow_reflexive_goalP))) {
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                    } else {
                                                        deck.deck_push(link_node, v_deck);
                                                    }
                                                }
                                                done_var_$246 = makeBoolean((NIL == valid_$248) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$246 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$246, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                } 
                            }
                        } finally {
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$245, thread);
                        }
                        if (NIL != gt_vars.gt_use_sksiP()) {
                            final SubLObject _prev_bind_0_$247 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                            try {
                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$243, thread);
                                SubLObject rest;
                                SubLObject gather_sentence_mt_pair;
                                SubLObject current;
                                SubLObject datum;
                                SubLObject assertion2;
                                SubLObject var_mt;
                                SubLObject link_node2;
                                SubLObject assertion_$250;
                                for (rest = NIL, rest = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                    gather_sentence_mt_pair = rest.first();
                                    datum = current = gather_sentence_mt_pair;
                                    assertion2 = NIL;
                                    var_mt = NIL;
                                    destructuring_bind_must_consp(current, datum, $list10);
                                    assertion2 = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list10);
                                    var_mt = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                            link_node2 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                            assertion_$250 = assertion2;
                                            if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node2, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node2)) || (NIL != allow_reflexive_goalP))) {
                                                ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node2);
                                            } else {
                                                deck.deck_push(link_node2, v_deck);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list10);
                                    }
                                }
                            } finally {
                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$247, thread);
                            }
                        }
                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                            final SubLObject _prev_bind_0_$248 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                            try {
                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                final SubLObject _prev_bind_0_$249 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$243, thread);
                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                    final SubLObject pred_var2 = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                        SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                        final SubLObject token_var2 = NIL;
                                        while (NIL == done_var2) {
                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                            if (NIL != valid2) {
                                                SubLObject final_index_iterator2 = NIL;
                                                try {
                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                    SubLObject done_var_$247 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                    final SubLObject token_var_$248 = NIL;
                                                    while (NIL == done_var_$247) {
                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$248);
                                                        final SubLObject valid_$249 = makeBoolean(!token_var_$248.eql(assertion3));
                                                        if ((NIL != valid_$249) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                            final SubLObject link_node3 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                            final SubLObject assertion_$251 = assertion3;
                                                            if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node3, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node3)) || (NIL != allow_reflexive_goalP))) {
                                                                ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node3);
                                                            } else {
                                                                deck.deck_push(link_node3, v_deck);
                                                            }
                                                        }
                                                        done_var_$247 = makeBoolean((NIL == valid_$249) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$250 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (NIL != final_index_iterator2) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$250, thread);
                                                    }
                                                }
                                            }
                                            done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                        } 
                                    }
                                } finally {
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_3, thread);
                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$249, thread);
                                }
                                if (NIL != gt_vars.gt_use_sksiP()) {
                                    final SubLObject _prev_bind_0_$251 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$243, thread);
                                        SubLObject rest2;
                                        SubLObject gather_sentence_mt_pair2;
                                        SubLObject current2;
                                        SubLObject datum2;
                                        SubLObject assertion4;
                                        SubLObject var_mt2;
                                        SubLObject link_node4;
                                        SubLObject assertion_$252;
                                        for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                            gather_sentence_mt_pair2 = rest2.first();
                                            datum2 = current2 = gather_sentence_mt_pair2;
                                            assertion4 = NIL;
                                            var_mt2 = NIL;
                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                            assertion4 = current2.first();
                                            current2 = current2.rest();
                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                            var_mt2 = current2.first();
                                            current2 = current2.rest();
                                            if (NIL == current2) {
                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                    link_node4 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                    assertion_$252 = assertion4;
                                                    if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node4, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node4)) || (NIL != allow_reflexive_goalP))) {
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node4);
                                                    } else {
                                                        deck.deck_push(link_node4, v_deck);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum2, $list10);
                                            }
                                        }
                                    } finally {
                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$251, thread);
                                    }
                                }
                            } finally {
                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$248, thread);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        search_direction = csome_list_var.first();
                    } 
                }
            } finally {
                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0, thread);
            }
            pred = pred.rest();
            pred_$243 = pred.first();
            direction = direction.rest();
            direction_$244 = direction.first();
        } 
        return v_deck;
    }

    public static SubLObject ghl_predicate_relation_within_multiple_searches_p(final SubLObject pred, final SubLObject node1, final SubLObject node2, final SubLObject fail_space, final SubLObject goal_space, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) {
                result = sbhl_search_methods.sbhl_predicate_relation_within_multiple_searches_p(sbhl_module_vars.get_sbhl_module(pred), node1, node2, fail_space, goal_space);
            } else
                if (node1.equal(node2) && (NIL != fort_types_interface.reflexive_binary_predicate_p(pred))) {
                    result = node2;
                } else
                    if (node1.equal(node2) && (NIL != fort_types_interface.irreflexive_binary_predicate_p(pred))) {
                        result = NIL;
                    } else {
                        final SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
                        final SubLObject opposite = ghl_search_vars.ghl_opposite_direction(direction);
                        final SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
                        final SubLObject start_node = (NIL != forwardP) ? node1 : node2;
                        final SubLObject goal_node = (NIL != forwardP) ? node2 : node1;
                        result = ghl_path_from_node_to_node_within_previous_searches(pred, start_node, goal_node, direction, fail_space, goal_space);
                        if (NIL != result) {
                            if ((NIL != ghl_graph_utilities.ghl_node_p(result)) && (NIL != ghl_marking_utilities.ghl_node_marked_in_space_p(result, goal_space))) {
                                ghl_marking_utilities.ghl_mark_node_in_space(result, T, fail_space);
                            }
                            final SubLObject v_search = ghl_search_vars.new_ghl_search(listS($PREDICATES, new SubLObject[]{ list(pred), $ORDER, $DEPTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, list(opposite), $MARKING, $SIMPLE, $MARKING_SPACE, fail_space, $GOAL_SPACE, goal_space, $list52 }));
                            graphl_graph_utilities.reset_graphl_finished();
                            ghl_unmark_sweep_and_map(v_search, goal_node);
                            ghl_search_vars.destroy_ghl_search(v_search);
                        }
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ghl_path_from_node_to_node_within_previous_searches(final SubLObject pred, final SubLObject start_node, final SubLObject goal_node, final SubLObject direction, final SubLObject fail_space, final SubLObject goal_space) {
        final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, list(pred), $ORDER, $DEPTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, list(direction), $MARKING, $SIMPLE, $MARKING_SPACE, fail_space, $GOAL_SEARCH_P, T, $GOAL, goal_node, $GOAL_FN, $sym54$GHL_GOAL_OR_MARKED_AS_GOAL_, $GOAL_SPACE, goal_space }));
        graphl_graph_utilities.reset_graphl_finished();
        ghl_mark_sweep_until_goal(v_search, start_node);
        return ghl_search_vars.ghl_result(v_search);
    }

    public static SubLObject ghl_unmark_closure_in_space_and_map(final SubLObject pred, final SubLObject node, final SubLObject direction, final SubLObject space, final SubLObject map_fn) {
        final SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[]{ $PREDICATES, list(pred), $ORDER, $DEPTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, list(direction), $MARKING, $SIMPLE, $MARKING_SPACE, space, $MAP_FN, map_fn }));
        graphl_graph_utilities.reset_graphl_finished();
        ghl_unmark_sweep_and_map(v_search, node);
        ghl_search_vars.destroy_ghl_search(v_search);
        return NIL;
    }

    public static SubLObject why_ghl_predicate_relation_p(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ? sbhl_search_methods.why_sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), node1, node2, mt, tv, UNPROVIDED) : why_gt_predicate_relation_p(pred, node1, node2, mt, tv);
    }

    public static SubLObject why_gt_predicate_relation_p(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
        final SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
        final SubLObject start_node = (NIL != forwardP) ? node1 : node2;
        final SubLObject goal_node = (NIL != forwardP) ? node2 : node1;
        return why_gt_predicates_relation_p(list(pred), list(direction), start_node, goal_node, mt, tv);
    }

    public static SubLObject why_gt_predicates_relation_p(final SubLObject preds, SubLObject directions, SubLObject start_node, SubLObject goal_node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (start_node.equal(goal_node) && (NIL != list_utilities.any_in_list(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED))) {
                result = list(arguments.make_hl_support($REFLEXIVE, make_binary_formula(find_if(REFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED), start_node, goal_node), mt, tv));
            } else
                if (start_node.equal(goal_node) && (NIL != list_utilities.any_in_list(IRREFLEXIVE_BINARY_PREDICATE_P, preds, UNPROVIDED))) {
                    result = NIL;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject start_node_$262 = possibly_reverse_nodes_and_directions(preds, directions, start_node, goal_node);
                    final SubLObject goal_node_$263 = thread.secondMultipleValue();
                    final SubLObject directions_$264 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    start_node = start_node_$262;
                    goal_node = goal_node_$263;
                    directions = directions_$264;
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(listS($PREDICATES, new SubLObject[]{ preds, $ORDER, $BREADTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, directions, $TV, tv, $MARKING, $SIMPLE, $GOAL_SEARCH_P, T, $GOAL, list(goal_node), $list57 }));
                    graphl_graph_utilities.reset_graphl_finished();
                    final SubLObject search_deck = (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? deck.create_deck($STACK) : deck.create_deck($QUEUE);
                    ghl_marking_utilities.ghl_mark_node(v_search, start_node, $START);
                    gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, start_node, NIL, search_deck, T);
                    if (NIL == deck.deck_empty_p(search_deck)) {
                        SubLObject current;
                        final SubLObject datum = current = deck.deck_pop(search_deck);
                        SubLObject node = NIL;
                        SubLObject supports = NIL;
                        destructuring_bind_must_consp(current, datum, $list58);
                        node = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list58);
                        supports = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != node)) {
                                final SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                                if (NIL == mark) {
                                    ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                                    gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, node, supports, search_deck, T);
                                } else
                                    if (mark == $START) {
                                        ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                                    }

                                final SubLObject datum_evaluated_var = deck.deck_pop(search_deck);
                                node = datum_evaluated_var.first();
                                supports = cadr(datum_evaluated_var);
                            } 
                        } else {
                            cdestructuring_bind_error(datum, $list58);
                        }
                    }
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(final SubLObject v_search, final SubLObject node, final SubLObject supports, final SubLObject v_deck, final SubLObject allow_reflexive_goalP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pred = NIL;
        SubLObject pred_$265 = NIL;
        SubLObject direction = NIL;
        SubLObject direction_$266 = NIL;
        pred = ghl_search_vars.ghl_relevant_predicates(v_search);
        pred_$265 = pred.first();
        direction = ghl_search_vars.ghl_relevant_directions(v_search);
        direction_$266 = direction.first();
        while ((NIL != direction) || (NIL != pred)) {
            final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
            final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
            final SubLObject _prev_bind_0 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
            try {
                ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                    SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$266);
                    SubLObject search_direction = NIL;
                    search_direction = csome_list_var.first();
                    while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                        final SubLObject _prev_bind_0_$267 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        try {
                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$265, thread);
                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                            final SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                            SubLObject done_var_$268 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                            final SubLObject token_var_$269 = NIL;
                                            while (NIL == done_var_$268) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$269);
                                                final SubLObject valid_$270 = makeBoolean(!token_var_$269.eql(assertion));
                                                if ((NIL != valid_$270) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                    final SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                    final SubLObject assertion_$271 = assertion;
                                                    if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node)) || (NIL != allow_reflexive_goalP))) {
                                                        final SubLObject justification = ghl_create_justification(v_search, cons(assertion_$271, supports));
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                        ghl_add_justification_to_result(v_search, justification);
                                                    } else {
                                                        deck.deck_push(list(link_node, cons(assertion_$271, supports)), v_deck);
                                                    }
                                                }
                                                done_var_$268 = makeBoolean((NIL == valid_$270) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$268 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$268, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                } 
                            }
                        } finally {
                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$267, thread);
                        }
                        if (NIL != gt_vars.gt_use_sksiP()) {
                            final SubLObject _prev_bind_0_$269 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                            try {
                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$265, thread);
                                SubLObject rest;
                                SubLObject gather_sentence_mt_pair;
                                SubLObject current;
                                SubLObject datum;
                                SubLObject assertion2;
                                SubLObject var_mt;
                                SubLObject link_node2;
                                SubLObject assertion_$272;
                                SubLObject justification2;
                                for (rest = NIL, rest = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                    gather_sentence_mt_pair = rest.first();
                                    datum = current = gather_sentence_mt_pair;
                                    assertion2 = NIL;
                                    var_mt = NIL;
                                    destructuring_bind_must_consp(current, datum, $list10);
                                    assertion2 = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list10);
                                    var_mt = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                            link_node2 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                            assertion_$272 = assertion2;
                                            if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node2, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node2)) || (NIL != allow_reflexive_goalP))) {
                                                justification2 = ghl_create_justification(v_search, cons(assertion_$272, supports));
                                                ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node2);
                                                ghl_add_justification_to_result(v_search, justification2);
                                            } else {
                                                deck.deck_push(list(link_node2, cons(assertion_$272, supports)), v_deck);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list10);
                                    }
                                }
                            } finally {
                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$269, thread);
                            }
                        }
                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                            final SubLObject _prev_bind_0_$270 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                            try {
                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                final SubLObject _prev_bind_0_$271 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$265, thread);
                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                    final SubLObject pred_var2 = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                        SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                        final SubLObject token_var2 = NIL;
                                        while (NIL == done_var2) {
                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                            if (NIL != valid2) {
                                                SubLObject final_index_iterator2 = NIL;
                                                try {
                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                    SubLObject done_var_$269 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                    final SubLObject token_var_$270 = NIL;
                                                    while (NIL == done_var_$269) {
                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$270);
                                                        final SubLObject valid_$271 = makeBoolean(!token_var_$270.eql(assertion3));
                                                        if ((NIL != valid_$271) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                            final SubLObject link_node3 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                            final SubLObject assertion_$273 = assertion3;
                                                            if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node3, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node3)) || (NIL != allow_reflexive_goalP))) {
                                                                final SubLObject justification3 = ghl_create_justification(v_search, cons(assertion_$273, supports));
                                                                ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node3);
                                                                ghl_add_justification_to_result(v_search, justification3);
                                                            } else {
                                                                deck.deck_push(list(link_node3, cons(assertion_$273, supports)), v_deck);
                                                            }
                                                        }
                                                        done_var_$269 = makeBoolean((NIL == valid_$271) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$272 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (NIL != final_index_iterator2) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                                                    }
                                                }
                                            }
                                            done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                        } 
                                    }
                                } finally {
                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_3, thread);
                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$271, thread);
                                }
                                if (NIL != gt_vars.gt_use_sksiP()) {
                                    final SubLObject _prev_bind_0_$273 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                    try {
                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$265, thread);
                                        SubLObject rest2;
                                        SubLObject gather_sentence_mt_pair2;
                                        SubLObject current2;
                                        SubLObject datum2;
                                        SubLObject assertion4;
                                        SubLObject var_mt2;
                                        SubLObject link_node4;
                                        SubLObject assertion_$274;
                                        SubLObject justification4;
                                        for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                            gather_sentence_mt_pair2 = rest2.first();
                                            datum2 = current2 = gather_sentence_mt_pair2;
                                            assertion4 = NIL;
                                            var_mt2 = NIL;
                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                            assertion4 = current2.first();
                                            current2 = current2.rest();
                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                            var_mt2 = current2.first();
                                            current2 = current2.rest();
                                            if (NIL == current2) {
                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                    link_node4 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                    assertion_$274 = assertion4;
                                                    if ((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node4, UNPROVIDED)) && ((NIL == kb_utilities.kbeq(node, link_node4)) || (NIL != allow_reflexive_goalP))) {
                                                        justification4 = ghl_create_justification(v_search, cons(assertion_$274, supports));
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node4);
                                                        ghl_add_justification_to_result(v_search, justification4);
                                                    } else {
                                                        deck.deck_push(list(link_node4, cons(assertion_$274, supports)), v_deck);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum2, $list10);
                                            }
                                        }
                                    } finally {
                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$273, thread);
                                    }
                                }
                            } finally {
                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$270, thread);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        search_direction = csome_list_var.first();
                    } 
                }
            } finally {
                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0, thread);
            }
            pred = pred.rest();
            pred_$265 = pred.first();
            direction = direction.rest();
            direction_$266 = direction.first();
        } 
        return v_deck;
    }

    public static SubLObject ghl_max_floor_mts_of_predicate_paths(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        return NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ? sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(pred), node1, node2, tv) : gt_max_floor_mts_of_predicate_paths(pred, node1, node2, tv);
    }

    public static SubLObject gt_max_floor_mts_of_predicate_paths(final SubLObject pred, final SubLObject node1, final SubLObject node2, SubLObject tv) {
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if (node1.equal(node2) && (NIL != fort_types_interface.reflexive_binary_predicate_p(pred))) {
                result = hl_supports.max_floor_mts_where_reflexive(make_binary_formula(pred, node1, node2), NIL);
            } else
                if (node1.equal(node2) && (NIL != fort_types_interface.irreflexive_binary_predicate_p(pred))) {
                    result = NIL;
                } else {
                    final SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
                    final SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
                    final SubLObject start_node = (NIL != forwardP) ? node1 : node2;
                    final SubLObject goal_node = (NIL != forwardP) ? node2 : node1;
                    final SubLObject v_search = ghl_search_vars.new_ghl_search(listS($PREDICATES, new SubLObject[]{ list(pred), $ORDER, $BREADTH_FIRST, $TYPE, $TRANSITIVE_REASONING, $DIRECTIONS, list(direction), $TV, tv, $MARKING, $SIMPLE, $GOAL_SEARCH_P, T, $GOAL, list(goal_node), $list57 }));
                    graphl_graph_utilities.reset_graphl_finished();
                    final SubLObject search_deck = (NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? deck.create_deck($STACK) : deck.create_deck($QUEUE);
                    ghl_marking_utilities.ghl_mark_node(v_search, start_node, $START);
                    gt_max_floor_mts_of_predicate_paths_add_accessible_link_nodes_to_deck(v_search, start_node, NIL, search_deck);
                    if (NIL == deck.deck_empty_p(search_deck)) {
                        SubLObject current;
                        final SubLObject datum = current = deck.deck_pop(search_deck);
                        SubLObject node3 = NIL;
                        SubLObject supports = NIL;
                        destructuring_bind_must_consp(current, datum, $list58);
                        node3 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list58);
                        supports = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != node3)) {
                                final SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node3);
                                if (NIL == mark) {
                                    ghl_marking_utilities.ghl_mark_node(v_search, node3, T);
                                    gt_max_floor_mts_of_predicate_paths_add_accessible_link_nodes_to_deck(v_search, node3, supports, search_deck);
                                } else
                                    if (mark == $START) {
                                        ghl_marking_utilities.ghl_mark_node(v_search, node3, T);
                                    }

                                final SubLObject datum_evaluated_var = deck.deck_pop(search_deck);
                                node3 = datum_evaluated_var.first();
                                supports = cadr(datum_evaluated_var);
                            } 
                        } else {
                            cdestructuring_bind_error(datum, $list58);
                        }
                    }
                    result = ghl_search_vars.ghl_result(v_search);
                    ghl_search_vars.destroy_ghl_search(v_search);
                }

        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_mts(result, UNPROVIDED);
    }

    public static SubLObject gt_max_floor_mts_of_predicate_paths_add_accessible_link_nodes_to_deck(final SubLObject v_search, final SubLObject node, final SubLObject supports, final SubLObject v_deck) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gt_max_floor_mts_of_predicate_paths_supports_still_relevantP(v_search, supports)) {
            SubLObject pred = NIL;
            SubLObject pred_$284 = NIL;
            SubLObject direction = NIL;
            SubLObject direction_$285 = NIL;
            pred = ghl_search_vars.ghl_relevant_predicates(v_search);
            pred_$284 = pred.first();
            direction = ghl_search_vars.ghl_relevant_directions(v_search);
            direction_$285 = direction.first();
            while ((NIL != direction) || (NIL != pred)) {
                final SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                final SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                final SubLObject _prev_bind_0 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                try {
                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$285);
                        SubLObject search_direction = NIL;
                        search_direction = csome_list_var.first();
                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                            final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                            final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                            final SubLObject _prev_bind_0_$286 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                            try {
                                ghl_link_iterators.$gt_relevant_pred$.bind(pred_$284, thread);
                                pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                final SubLObject pred_var = NIL;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                    SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                SubLObject done_var_$287 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                final SubLObject token_var_$288 = NIL;
                                                while (NIL == done_var_$287) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$288);
                                                    final SubLObject valid_$289 = makeBoolean(!token_var_$288.eql(assertion));
                                                    if ((NIL != valid_$289) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                        final SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                        final SubLObject support = assertion;
                                                        if (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED)) {
                                                            final SubLObject justification = ghl_create_justification(v_search, cons(support, supports));
                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                SubLObject csome_list_var_$290 = hl_supports.max_floor_mts_of_justification(justification);
                                                                SubLObject mt = NIL;
                                                                mt = csome_list_var_$290.first();
                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$290)) {
                                                                    ghl_search_vars.ghl_add_to_result(v_search, mt, HLMT_EQUAL);
                                                                    if (NIL != mt_vars.core_microtheory_p(mt)) {
                                                                        graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T, thread);
                                                                    }
                                                                    csome_list_var_$290 = csome_list_var_$290.rest();
                                                                    mt = csome_list_var_$290.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != gt_max_floor_mts_of_predicate_paths_support_still_relevantP(v_search, support)) {
                                                                deck.deck_push(list(link_node, cons(support, supports)), v_deck);
                                                            }

                                                    }
                                                    done_var_$287 = makeBoolean((NIL == valid_$289) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$287 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$287, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean((NIL == valid) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                    } 
                                }
                            } finally {
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$286, thread);
                            }
                            if (NIL != gt_vars.gt_use_sksiP()) {
                                final SubLObject _prev_bind_0_$288 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$284, thread);
                                    SubLObject rest;
                                    SubLObject gather_sentence_mt_pair;
                                    SubLObject current;
                                    SubLObject datum;
                                    SubLObject assertion2;
                                    SubLObject var_mt;
                                    SubLObject link_node2;
                                    SubLObject support2;
                                    SubLObject justification2;
                                    SubLObject csome_list_var_$291;
                                    SubLObject mt2;
                                    for (rest = NIL, rest = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest); rest = rest.rest()) {
                                        gather_sentence_mt_pair = rest.first();
                                        datum = current = gather_sentence_mt_pair;
                                        assertion2 = NIL;
                                        var_mt = NIL;
                                        destructuring_bind_must_consp(current, datum, $list10);
                                        assertion2 = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list10);
                                        var_mt = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                link_node2 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                support2 = assertion2;
                                                if (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node2, UNPROVIDED)) {
                                                    justification2 = ghl_create_justification(v_search, cons(support2, supports));
                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                        csome_list_var_$291 = hl_supports.max_floor_mts_of_justification(justification2);
                                                        mt2 = NIL;
                                                        mt2 = csome_list_var_$291.first();
                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$291)) {
                                                            ghl_search_vars.ghl_add_to_result(v_search, mt2, HLMT_EQUAL);
                                                            if (NIL != mt_vars.core_microtheory_p(mt2)) {
                                                                graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T, thread);
                                                            }
                                                            csome_list_var_$291 = csome_list_var_$291.rest();
                                                            mt2 = csome_list_var_$291.first();
                                                        } 
                                                    }
                                                } else
                                                    if (NIL != gt_max_floor_mts_of_predicate_paths_support_still_relevantP(v_search, support2)) {
                                                        deck.deck_push(list(link_node2, cons(support2, supports)), v_deck);
                                                    }

                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list10);
                                        }
                                    }
                                } finally {
                                    ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$288, thread);
                                }
                            }
                            if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                final SubLObject _prev_bind_0_$289 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                    final SubLObject _prev_bind_0_$290 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                    try {
                                        ghl_link_iterators.$gt_relevant_pred$.bind(pred_$284, thread);
                                        pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                        final SubLObject pred_var2 = NIL;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                            SubLObject done_var2 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                            final SubLObject token_var2 = NIL;
                                            while (NIL == done_var2) {
                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                if (NIL != valid2) {
                                                    SubLObject final_index_iterator2 = NIL;
                                                    try {
                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                        SubLObject done_var_$288 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                                        final SubLObject token_var_$289 = NIL;
                                                        while (NIL == done_var_$288) {
                                                            final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$289);
                                                            final SubLObject valid_$290 = makeBoolean(!token_var_$289.eql(assertion3));
                                                            if ((NIL != valid_$290) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                final SubLObject link_node3 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                final SubLObject support3 = assertion3;
                                                                if (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node3, UNPROVIDED)) {
                                                                    final SubLObject justification3 = ghl_create_justification(v_search, cons(support3, supports));
                                                                    if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                        SubLObject csome_list_var_$292 = hl_supports.max_floor_mts_of_justification(justification3);
                                                                        SubLObject mt3 = NIL;
                                                                        mt3 = csome_list_var_$292.first();
                                                                        while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$292)) {
                                                                            ghl_search_vars.ghl_add_to_result(v_search, mt3, HLMT_EQUAL);
                                                                            if (NIL != mt_vars.core_microtheory_p(mt3)) {
                                                                                graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T, thread);
                                                                            }
                                                                            csome_list_var_$292 = csome_list_var_$292.rest();
                                                                            mt3 = csome_list_var_$292.first();
                                                                        } 
                                                                    }
                                                                } else
                                                                    if (NIL != gt_max_floor_mts_of_predicate_paths_support_still_relevantP(v_search, support3)) {
                                                                        deck.deck_push(list(link_node3, cons(support3, supports)), v_deck);
                                                                    }

                                                            }
                                                            done_var_$288 = makeBoolean((NIL == valid_$290) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$291 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            if (NIL != final_index_iterator2) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                            }
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$291, thread);
                                                        }
                                                    }
                                                }
                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)));
                                            } 
                                        }
                                    } finally {
                                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_3, thread);
                                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$290, thread);
                                    }
                                    if (NIL != gt_vars.gt_use_sksiP()) {
                                        final SubLObject _prev_bind_0_$292 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                        try {
                                            ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$284, thread);
                                            SubLObject rest2;
                                            SubLObject gather_sentence_mt_pair2;
                                            SubLObject current2;
                                            SubLObject datum2;
                                            SubLObject assertion4;
                                            SubLObject var_mt2;
                                            SubLObject link_node4;
                                            SubLObject support4;
                                            SubLObject justification4;
                                            SubLObject csome_list_var_$293;
                                            SubLObject mt4;
                                            for (rest2 = NIL, rest2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth); (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != rest2); rest2 = rest2.rest()) {
                                                gather_sentence_mt_pair2 = rest2.first();
                                                datum2 = current2 = gather_sentence_mt_pair2;
                                                assertion4 = NIL;
                                                var_mt2 = NIL;
                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                assertion4 = current2.first();
                                                current2 = current2.rest();
                                                destructuring_bind_must_consp(current2, datum2, $list10);
                                                var_mt2 = current2.first();
                                                current2 = current2.rest();
                                                if (NIL == current2) {
                                                    if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                        link_node4 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                        support4 = assertion4;
                                                        if (NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node4, UNPROVIDED)) {
                                                            justification4 = ghl_create_justification(v_search, cons(support4, supports));
                                                            if (NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) {
                                                                csome_list_var_$293 = hl_supports.max_floor_mts_of_justification(justification4);
                                                                mt4 = NIL;
                                                                mt4 = csome_list_var_$293.first();
                                                                while ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread)) && (NIL != csome_list_var_$293)) {
                                                                    ghl_search_vars.ghl_add_to_result(v_search, mt4, HLMT_EQUAL);
                                                                    if (NIL != mt_vars.core_microtheory_p(mt4)) {
                                                                        graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T, thread);
                                                                    }
                                                                    csome_list_var_$293 = csome_list_var_$293.rest();
                                                                    mt4 = csome_list_var_$293.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != gt_max_floor_mts_of_predicate_paths_support_still_relevantP(v_search, support4)) {
                                                                deck.deck_push(list(link_node4, cons(support4, supports)), v_deck);
                                                            }

                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum2, $list10);
                                                }
                                            }
                                        } finally {
                                            ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$292, thread);
                                        }
                                    }
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$289, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            search_direction = csome_list_var.first();
                        } 
                    }
                } finally {
                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0, thread);
                }
                pred = pred.rest();
                pred_$284 = pred.first();
                direction = direction.rest();
                direction_$285 = direction.first();
            } 
        }
        return v_deck;
    }

    public static SubLObject gt_max_floor_mts_of_predicate_paths_supports_still_relevantP(final SubLObject v_search, final SubLObject supports) {
        SubLObject irrelevant_supportP = NIL;
        if (NIL == irrelevant_supportP) {
            SubLObject csome_list_var = supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == irrelevant_supportP) && (NIL != csome_list_var)) {
                if (NIL == gt_max_floor_mts_of_predicate_paths_support_still_relevantP(v_search, support)) {
                    irrelevant_supportP = T;
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == irrelevant_supportP);
    }

    public static SubLObject gt_max_floor_mts_of_predicate_paths_support_still_relevantP(final SubLObject v_search, final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(support);
            final SubLObject mts_so_far = ghl_search_vars.ghl_result(v_search);
            return makeBoolean((NIL == list_utilities.member_equalP(assertion_mt, mts_so_far)) && (NIL == genl_mts.any_genl_mtP_memoized(assertion_mt, mts_so_far, UNPROVIDED, UNPROVIDED)));
        }
        return T;
    }

    public static SubLObject ghl_min_superiors(final SubLObject node, final SubLObject pred, SubLObject mt, SubLObject tv, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject min_supports = NIL;
        thread.resetMultipleValues();
        final SubLObject superiors = ghl_direct_superiors(node, pred, mt, tv, justifyP);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject min_superiors = ghl_min_terms_wrt(pred, set_difference(superiors, ghl_direct_inferiors(node, pred, mt, tv, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
        if (NIL != justifyP) {
            SubLObject superior = NIL;
            SubLObject superior_$303 = NIL;
            SubLObject support = NIL;
            SubLObject support_$304 = NIL;
            superior = superiors;
            superior_$303 = superior.first();
            support = supports;
            support_$304 = support.first();
            while ((NIL != support) || (NIL != superior)) {
                if (NIL != list_utilities.member_kbeqP(superior_$303, min_superiors)) {
                    min_supports = cons(support_$304, min_supports);
                }
                superior = superior.rest();
                superior_$303 = superior.first();
                support = support.rest();
                support_$304 = support.first();
            } 
        }
        return values(min_superiors, min_supports);
    }

    public static SubLObject ghl_max_inferiors(final SubLObject node, final SubLObject pred, SubLObject mt, SubLObject tv, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_supports = NIL;
        thread.resetMultipleValues();
        final SubLObject inferiors = ghl_direct_inferiors(node, pred, mt, tv, justifyP);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject max_inferiors = ghl_max_terms_wrt(pred, set_difference(inferiors, ghl_direct_superiors(node, pred, mt, tv, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
        if (NIL != justifyP) {
            SubLObject inferior = NIL;
            SubLObject inferior_$305 = NIL;
            SubLObject support = NIL;
            SubLObject support_$306 = NIL;
            inferior = inferiors;
            inferior_$305 = inferior.first();
            support = supports;
            support_$306 = support.first();
            while ((NIL != support) || (NIL != inferior)) {
                if (NIL != list_utilities.member_kbeqP(inferior_$305, max_inferiors)) {
                    max_supports = cons(support_$306, max_supports);
                }
                inferior = inferior.rest();
                inferior_$305 = inferior.first();
                support = support.rest();
                support_$306 = support.first();
            } 
        }
        return values(max_inferiors, max_supports);
    }

    public static SubLObject ghl_direct_inferiors(final SubLObject node, final SubLObject pred, SubLObject mt, SubLObject tv, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        SubLObject supports = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != justifyP) {
                SubLObject pred_$307 = NIL;
                SubLObject pred_$308 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$309 = NIL;
                pred_$307 = list(pred);
                pred_$308 = pred_$307.first();
                direction = list($BACKWARD);
                direction_$309 = direction.first();
                while ((NIL != direction) || (NIL != pred_$307)) {
                    final SubLObject _prev_bind_0_$310 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$311 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$308, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$309, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$308)) {
                            final SubLObject node_$312 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$311 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$312 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$315 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$308), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$308)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$308)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$308), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$312)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$312, sbhl_module_vars.get_sbhl_module(pred_$308));
                                    if (NIL != d_link) {
                                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$309);
                                        SubLObject search_direction = NIL;
                                        search_direction = csome_list_var.first();
                                        while (NIL != csome_list_var) {
                                            final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$308));
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$308));
                                            if (NIL != mt_links) {
                                                SubLObject iteration_state;
                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt_$316 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$316)) {
                                                        final SubLObject _prev_bind_0_$312 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$316, thread);
                                                            SubLObject iteration_state_$318;
                                                            for (iteration_state_$318 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$318); iteration_state_$318 = dictionary_contents.do_dictionary_contents_next(iteration_state_$318)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject tv_$319 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$318);
                                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$319)) {
                                                                    final SubLObject _prev_bind_0_$313 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$319, thread);
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject link_node;
                                                                            SubLObject support;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                    support = ghl_link_iterators.ghl_make_sbhl_support(pred_$308, node, link_node, direction_$309);
                                                                                    inferiors = cons(link_node, inferiors);
                                                                                    supports = cons(support, supports);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var_$321 = sol;
                                                                                SubLObject link_node2 = NIL;
                                                                                link_node2 = csome_list_var_$321.first();
                                                                                while (NIL != csome_list_var_$321) {
                                                                                    final SubLObject support2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$308, node, link_node2, direction_$309);
                                                                                    inferiors = cons(link_node2, inferiors);
                                                                                    supports = cons(support2, supports);
                                                                                    csome_list_var_$321 = csome_list_var_$321.rest();
                                                                                    link_node2 = csome_list_var_$321.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$313, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$318);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$312, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            search_direction = csome_list_var.first();
                                        } 
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if (NIL != term.closed_nautP(node_$312, UNPROVIDED)) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$309);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$308));
                                            SubLObject cdolist_list_var;
                                            final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$308))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$308));
                                            SubLObject generating_fn = NIL;
                                            generating_fn = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$314 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    final SubLObject sol2;
                                                    final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$312);
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject link_node3;
                                                        SubLObject support3;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                support3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$308, node, link_node3, direction_$309);
                                                                inferiors = cons(link_node3, inferiors);
                                                                supports = cons(support3, supports);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var_$322 = sol2;
                                                            SubLObject link_node4 = NIL;
                                                            link_node4 = csome_list_var_$322.first();
                                                            while (NIL != csome_list_var_$322) {
                                                                final SubLObject support4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$308, node, link_node4, direction_$309);
                                                                inferiors = cons(link_node4, inferiors);
                                                                supports = cons(support4, supports);
                                                                csome_list_var_$322 = csome_list_var_$322.rest();
                                                                link_node4 = csome_list_var_$322.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$314, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                generating_fn = cdolist_list_var.first();
                                            } 
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$315, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$312, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$311, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$308)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$315 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$309);
                                    SubLObject search_direction3 = NIL;
                                    search_direction3 = csome_list_var3.first();
                                    while (NIL != csome_list_var3) {
                                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                        final SubLObject _prev_bind_0_$316 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$313 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$308, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            SubLObject done_var_$327 = NIL;
                                                            final SubLObject token_var_$328 = NIL;
                                                            while (NIL == done_var_$327) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$328);
                                                                final SubLObject valid_$329 = makeBoolean(!token_var_$328.eql(assertion));
                                                                if ((NIL != valid_$329) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                    final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                    final SubLObject support5 = assertion;
                                                                    inferiors = cons(link_node5, inferiors);
                                                                    supports = cons(support5, supports);
                                                                }
                                                                done_var_$327 = makeBoolean(NIL == valid_$329);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$317 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$317, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$313, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$316, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$318 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$308, thread);
                                                SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                                SubLObject gather_sentence_mt_pair = NIL;
                                                gather_sentence_mt_pair = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_sentence_mt_pair;
                                                    SubLObject assertion2 = NIL;
                                                    SubLObject var_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    assertion2 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    var_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                            final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                            final SubLObject support6 = assertion2;
                                                            inferiors = cons(link_node6, inferiors);
                                                            supports = cons(support6, supports);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list10);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    gather_sentence_mt_pair = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$318, thread);
                                            }
                                        }
                                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                            final SubLObject _prev_bind_0_$319 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                final SubLObject _prev_bind_0_$320 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$314 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                try {
                                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$308, thread);
                                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                    final SubLObject pred_var2 = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                        SubLObject done_var2 = NIL;
                                                        final SubLObject token_var2 = NIL;
                                                        while (NIL == done_var2) {
                                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                            if (NIL != valid2) {
                                                                SubLObject final_index_iterator2 = NIL;
                                                                try {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                    SubLObject done_var_$328 = NIL;
                                                                    final SubLObject token_var_$329 = NIL;
                                                                    while (NIL == done_var_$328) {
                                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$329);
                                                                        final SubLObject valid_$330 = makeBoolean(!token_var_$329.eql(assertion3));
                                                                        if ((NIL != valid_$330) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                            final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                            final SubLObject support7 = assertion3;
                                                                            inferiors = cons(link_node7, inferiors);
                                                                            supports = cons(support7, supports);
                                                                        }
                                                                        done_var_$328 = makeBoolean(NIL == valid_$330);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$321 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values2 = getValuesAsVector();
                                                                        if (NIL != final_index_iterator2) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                        }
                                                                        restoreValuesFromVector(_values2);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$321, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var2 = makeBoolean(NIL == valid2);
                                                        } 
                                                    }
                                                } finally {
                                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$314, thread);
                                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$320, thread);
                                                }
                                                if (NIL != gt_vars.gt_use_sksiP()) {
                                                    final SubLObject _prev_bind_0_$322 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                    try {
                                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$308, thread);
                                                        SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                        SubLObject gather_sentence_mt_pair2 = NIL;
                                                        gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        while (NIL != cdolist_list_var3) {
                                                            SubLObject current2;
                                                            final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                            SubLObject assertion4 = NIL;
                                                            SubLObject var_mt2 = NIL;
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            assertion4 = current2.first();
                                                            current2 = current2.rest();
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            var_mt2 = current2.first();
                                                            current2 = current2.rest();
                                                            if (NIL == current2) {
                                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                    final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                    final SubLObject support8 = assertion4;
                                                                    inferiors = cons(link_node8, inferiors);
                                                                    supports = cons(support8, supports);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum2, $list10);
                                                            }
                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                            gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        } 
                                                    } finally {
                                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$322, thread);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$319, thread);
                                            }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        search_direction3 = csome_list_var3.first();
                                    } 
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$315, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_1_$311, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0_$310, thread);
                    }
                    pred_$307 = pred_$307.rest();
                    pred_$308 = pred_$307.first();
                    direction = direction.rest();
                    direction_$309 = direction.first();
                } 
            } else {
                SubLObject pred_$309 = NIL;
                SubLObject pred_$310 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$310 = NIL;
                pred_$309 = list(pred);
                pred_$310 = pred_$309.first();
                direction = list($BACKWARD);
                direction_$310 = direction.first();
                while ((NIL != direction) || (NIL != pred_$309)) {
                    final SubLObject _prev_bind_0_$323 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$315 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$310, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$310, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$310)) {
                            final SubLObject node_$313 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$324 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$316 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$316 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$310), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$310)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$310)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$310), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$313)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$313, sbhl_module_vars.get_sbhl_module(pred_$310));
                                    if (NIL != d_link) {
                                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$310);
                                        SubLObject search_direction = NIL;
                                        search_direction = csome_list_var.first();
                                        while (NIL != csome_list_var) {
                                            final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$310));
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$310));
                                            if (NIL != mt_links) {
                                                SubLObject iteration_state;
                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt_$317 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$317)) {
                                                        final SubLObject _prev_bind_0_$325 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$317, thread);
                                                            SubLObject iteration_state_$319;
                                                            for (iteration_state_$319 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$319); iteration_state_$319 = dictionary_contents.do_dictionary_contents_next(iteration_state_$319)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject tv_$320 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$319);
                                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$320)) {
                                                                    final SubLObject _prev_bind_0_$326 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$320, thread);
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject link_node;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                    inferiors = cons(link_node, inferiors);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var_$323 = sol;
                                                                                SubLObject link_node2 = NIL;
                                                                                link_node2 = csome_list_var_$323.first();
                                                                                while (NIL != csome_list_var_$323) {
                                                                                    inferiors = cons(link_node2, inferiors);
                                                                                    csome_list_var_$323 = csome_list_var_$323.rest();
                                                                                    link_node2 = csome_list_var_$323.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$326, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$319);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$325, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            search_direction = csome_list_var.first();
                                        } 
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if (NIL != term.closed_nautP(node_$313, UNPROVIDED)) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$310);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$310));
                                            SubLObject cdolist_list_var;
                                            final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$310))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$310));
                                            SubLObject generating_fn = NIL;
                                            generating_fn = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$327 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    final SubLObject sol2;
                                                    final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$313);
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject link_node3;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                inferiors = cons(link_node3, inferiors);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var_$324 = sol2;
                                                            SubLObject link_node4 = NIL;
                                                            link_node4 = csome_list_var_$324.first();
                                                            while (NIL != csome_list_var_$324) {
                                                                inferiors = cons(link_node4, inferiors);
                                                                csome_list_var_$324 = csome_list_var_$324.rest();
                                                                link_node4 = csome_list_var_$324.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$327, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                generating_fn = cdolist_list_var.first();
                                            } 
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$316, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$316, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$324, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$310)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$328 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$310);
                                    SubLObject search_direction3 = NIL;
                                    search_direction3 = csome_list_var3.first();
                                    while (NIL != csome_list_var3) {
                                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                        final SubLObject _prev_bind_0_$329 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$317 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$310, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            SubLObject done_var_$329 = NIL;
                                                            final SubLObject token_var_$330 = NIL;
                                                            while (NIL == done_var_$329) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$330);
                                                                final SubLObject valid_$331 = makeBoolean(!token_var_$330.eql(assertion));
                                                                if ((NIL != valid_$331) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                    final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                    final SubLObject support_var = assertion;
                                                                    inferiors = cons(link_node5, inferiors);
                                                                }
                                                                done_var_$329 = makeBoolean(NIL == valid_$331);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$330 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values3 = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values3);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$330, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$317, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$329, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$331 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$310, thread);
                                                SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                                SubLObject gather_sentence_mt_pair = NIL;
                                                gather_sentence_mt_pair = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_sentence_mt_pair;
                                                    SubLObject assertion2 = NIL;
                                                    SubLObject var_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    assertion2 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    var_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                            final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                            final SubLObject support_var2 = assertion2;
                                                            inferiors = cons(link_node6, inferiors);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list10);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    gather_sentence_mt_pair = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$331, thread);
                                            }
                                        }
                                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                            final SubLObject _prev_bind_0_$332 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                final SubLObject _prev_bind_0_$333 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$318 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                try {
                                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$310, thread);
                                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                    final SubLObject pred_var2 = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                        SubLObject done_var2 = NIL;
                                                        final SubLObject token_var2 = NIL;
                                                        while (NIL == done_var2) {
                                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                            if (NIL != valid2) {
                                                                SubLObject final_index_iterator2 = NIL;
                                                                try {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                    SubLObject done_var_$330 = NIL;
                                                                    final SubLObject token_var_$331 = NIL;
                                                                    while (NIL == done_var_$330) {
                                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$331);
                                                                        final SubLObject valid_$332 = makeBoolean(!token_var_$331.eql(assertion3));
                                                                        if ((NIL != valid_$332) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                            final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                            final SubLObject support_var3 = assertion3;
                                                                            inferiors = cons(link_node7, inferiors);
                                                                        }
                                                                        done_var_$330 = makeBoolean(NIL == valid_$332);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$334 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                        if (NIL != final_index_iterator2) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                        }
                                                                        restoreValuesFromVector(_values4);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$334, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var2 = makeBoolean(NIL == valid2);
                                                        } 
                                                    }
                                                } finally {
                                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$318, thread);
                                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$333, thread);
                                                }
                                                if (NIL != gt_vars.gt_use_sksiP()) {
                                                    final SubLObject _prev_bind_0_$335 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                    try {
                                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$310, thread);
                                                        SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                        SubLObject gather_sentence_mt_pair2 = NIL;
                                                        gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        while (NIL != cdolist_list_var3) {
                                                            SubLObject current2;
                                                            final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                            SubLObject assertion4 = NIL;
                                                            SubLObject var_mt2 = NIL;
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            assertion4 = current2.first();
                                                            current2 = current2.rest();
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            var_mt2 = current2.first();
                                                            current2 = current2.rest();
                                                            if (NIL == current2) {
                                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                    final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                    final SubLObject support_var4 = assertion4;
                                                                    inferiors = cons(link_node8, inferiors);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum2, $list10);
                                                            }
                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                            gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        } 
                                                    } finally {
                                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$335, thread);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$332, thread);
                                            }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        search_direction3 = csome_list_var3.first();
                                    } 
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$328, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_1_$315, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0_$323, thread);
                    }
                    pred_$309 = pred_$309.rest();
                    pred_$310 = pred_$309.first();
                    direction = direction.rest();
                    direction_$310 = direction.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(inferiors, supports);
    }

    public static SubLObject ghl_direct_superiors(final SubLObject node, final SubLObject pred, SubLObject mt, SubLObject tv, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = NIL;
        SubLObject supports = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != justifyP) {
                SubLObject pred_$373 = NIL;
                SubLObject pred_$374 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$375 = NIL;
                pred_$373 = list(pred);
                pred_$374 = pred_$373.first();
                direction = list($FORWARD);
                direction_$375 = direction.first();
                while ((NIL != direction) || (NIL != pred_$373)) {
                    final SubLObject _prev_bind_0_$376 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$377 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$374, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$375, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$374)) {
                            final SubLObject node_$378 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$377 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$378 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$381 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$374), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$374)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$374)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$374), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$378)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$378, sbhl_module_vars.get_sbhl_module(pred_$374));
                                    if (NIL != d_link) {
                                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$375);
                                        SubLObject search_direction = NIL;
                                        search_direction = csome_list_var.first();
                                        while (NIL != csome_list_var) {
                                            final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$374));
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$374));
                                            if (NIL != mt_links) {
                                                SubLObject iteration_state;
                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt_$382 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$382)) {
                                                        final SubLObject _prev_bind_0_$378 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$382, thread);
                                                            SubLObject iteration_state_$384;
                                                            for (iteration_state_$384 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$384); iteration_state_$384 = dictionary_contents.do_dictionary_contents_next(iteration_state_$384)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject tv_$385 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$384);
                                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$385)) {
                                                                    final SubLObject _prev_bind_0_$379 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$385, thread);
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject link_node;
                                                                            SubLObject support;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                    support = ghl_link_iterators.ghl_make_sbhl_support(pred_$374, node, link_node, direction_$375);
                                                                                    inferiors = cons(link_node, inferiors);
                                                                                    supports = cons(support, supports);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var_$387 = sol;
                                                                                SubLObject link_node2 = NIL;
                                                                                link_node2 = csome_list_var_$387.first();
                                                                                while (NIL != csome_list_var_$387) {
                                                                                    final SubLObject support2 = ghl_link_iterators.ghl_make_sbhl_support(pred_$374, node, link_node2, direction_$375);
                                                                                    inferiors = cons(link_node2, inferiors);
                                                                                    supports = cons(support2, supports);
                                                                                    csome_list_var_$387 = csome_list_var_$387.rest();
                                                                                    link_node2 = csome_list_var_$387.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$379, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$384);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$378, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            search_direction = csome_list_var.first();
                                        } 
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if (NIL != term.closed_nautP(node_$378, UNPROVIDED)) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$375);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$374));
                                            SubLObject cdolist_list_var;
                                            final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$374))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$374));
                                            SubLObject generating_fn = NIL;
                                            generating_fn = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$380 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    final SubLObject sol2;
                                                    final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$378);
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject link_node3;
                                                        SubLObject support3;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                support3 = ghl_link_iterators.ghl_make_sbhl_support(pred_$374, node, link_node3, direction_$375);
                                                                inferiors = cons(link_node3, inferiors);
                                                                supports = cons(support3, supports);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var_$388 = sol2;
                                                            SubLObject link_node4 = NIL;
                                                            link_node4 = csome_list_var_$388.first();
                                                            while (NIL != csome_list_var_$388) {
                                                                final SubLObject support4 = ghl_link_iterators.ghl_make_sbhl_support(pred_$374, node, link_node4, direction_$375);
                                                                inferiors = cons(link_node4, inferiors);
                                                                supports = cons(support4, supports);
                                                                csome_list_var_$388 = csome_list_var_$388.rest();
                                                                link_node4 = csome_list_var_$388.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$380, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                generating_fn = cdolist_list_var.first();
                                            } 
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$381, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$378, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$377, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$374)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$381 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$375);
                                    SubLObject search_direction3 = NIL;
                                    search_direction3 = csome_list_var3.first();
                                    while (NIL != csome_list_var3) {
                                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                        final SubLObject _prev_bind_0_$382 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$379 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$374, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            SubLObject done_var_$393 = NIL;
                                                            final SubLObject token_var_$394 = NIL;
                                                            while (NIL == done_var_$393) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$394);
                                                                final SubLObject valid_$395 = makeBoolean(!token_var_$394.eql(assertion));
                                                                if ((NIL != valid_$395) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                    final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                    final SubLObject support5 = assertion;
                                                                    inferiors = cons(link_node5, inferiors);
                                                                    supports = cons(support5, supports);
                                                                }
                                                                done_var_$393 = makeBoolean(NIL == valid_$395);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$383 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$383, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$379, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$382, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$384 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$374, thread);
                                                SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                                SubLObject gather_sentence_mt_pair = NIL;
                                                gather_sentence_mt_pair = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_sentence_mt_pair;
                                                    SubLObject assertion2 = NIL;
                                                    SubLObject var_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    assertion2 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    var_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                            final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                            final SubLObject support6 = assertion2;
                                                            inferiors = cons(link_node6, inferiors);
                                                            supports = cons(support6, supports);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list10);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    gather_sentence_mt_pair = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$384, thread);
                                            }
                                        }
                                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                            final SubLObject _prev_bind_0_$385 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                final SubLObject _prev_bind_0_$386 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$380 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                try {
                                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$374, thread);
                                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                    final SubLObject pred_var2 = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                        SubLObject done_var2 = NIL;
                                                        final SubLObject token_var2 = NIL;
                                                        while (NIL == done_var2) {
                                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                            if (NIL != valid2) {
                                                                SubLObject final_index_iterator2 = NIL;
                                                                try {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                    SubLObject done_var_$394 = NIL;
                                                                    final SubLObject token_var_$395 = NIL;
                                                                    while (NIL == done_var_$394) {
                                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$395);
                                                                        final SubLObject valid_$396 = makeBoolean(!token_var_$395.eql(assertion3));
                                                                        if ((NIL != valid_$396) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                            final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                            final SubLObject support7 = assertion3;
                                                                            inferiors = cons(link_node7, inferiors);
                                                                            supports = cons(support7, supports);
                                                                        }
                                                                        done_var_$394 = makeBoolean(NIL == valid_$396);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$387 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values2 = getValuesAsVector();
                                                                        if (NIL != final_index_iterator2) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                        }
                                                                        restoreValuesFromVector(_values2);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$387, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var2 = makeBoolean(NIL == valid2);
                                                        } 
                                                    }
                                                } finally {
                                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$380, thread);
                                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$386, thread);
                                                }
                                                if (NIL != gt_vars.gt_use_sksiP()) {
                                                    final SubLObject _prev_bind_0_$388 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                    try {
                                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$374, thread);
                                                        SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                        SubLObject gather_sentence_mt_pair2 = NIL;
                                                        gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        while (NIL != cdolist_list_var3) {
                                                            SubLObject current2;
                                                            final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                            SubLObject assertion4 = NIL;
                                                            SubLObject var_mt2 = NIL;
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            assertion4 = current2.first();
                                                            current2 = current2.rest();
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            var_mt2 = current2.first();
                                                            current2 = current2.rest();
                                                            if (NIL == current2) {
                                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                    final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                    final SubLObject support8 = assertion4;
                                                                    inferiors = cons(link_node8, inferiors);
                                                                    supports = cons(support8, supports);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum2, $list10);
                                                            }
                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                            gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        } 
                                                    } finally {
                                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$388, thread);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$385, thread);
                                            }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        search_direction3 = csome_list_var3.first();
                                    } 
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$381, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_1_$377, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0_$376, thread);
                    }
                    pred_$373 = pred_$373.rest();
                    pred_$374 = pred_$373.first();
                    direction = direction.rest();
                    direction_$375 = direction.first();
                } 
            } else {
                SubLObject pred_$375 = NIL;
                SubLObject pred_$376 = NIL;
                SubLObject direction = NIL;
                SubLObject direction_$376 = NIL;
                pred_$375 = list(pred);
                pred_$376 = pred_$375.first();
                direction = list($FORWARD);
                direction_$376 = direction.first();
                while ((NIL != direction) || (NIL != pred_$375)) {
                    final SubLObject _prev_bind_0_$389 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$381 = ghl_link_iterators.$ghl_link_direction$.currentBinding(thread);
                    try {
                        ghl_link_iterators.$ghl_link_pred$.bind(pred_$376, thread);
                        ghl_link_iterators.$ghl_link_direction$.bind(direction_$376, thread);
                        if (NIL != sbhl_module_utilities.sbhl_predicate_p(pred_$376)) {
                            final SubLObject node_$379 = function_terms.naut_to_nart(node);
                            final SubLObject _prev_bind_0_$390 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$382 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$382 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$376), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred_$376)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred_$376)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred_$376), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                if (NIL != forts.fort_p(node_$379)) {
                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$379, sbhl_module_vars.get_sbhl_module(pred_$376));
                                    if (NIL != d_link) {
                                        SubLObject csome_list_var = ghl_search_vars.determine_ghl_relevant_directions(direction_$376);
                                        SubLObject search_direction = NIL;
                                        search_direction = csome_list_var.first();
                                        while (NIL != csome_list_var) {
                                            final SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred_$376));
                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred_$376));
                                            if (NIL != mt_links) {
                                                SubLObject iteration_state;
                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                    thread.resetMultipleValues();
                                                    final SubLObject mt_$383 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$383)) {
                                                        final SubLObject _prev_bind_0_$391 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$383, thread);
                                                            SubLObject iteration_state_$385;
                                                            for (iteration_state_$385 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$385); iteration_state_$385 = dictionary_contents.do_dictionary_contents_next(iteration_state_$385)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject tv_$386 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$385);
                                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$386)) {
                                                                    final SubLObject _prev_bind_0_$392 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$386, thread);
                                                                        final SubLObject sol = link_nodes_var;
                                                                        if (NIL != set.set_p(sol)) {
                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                            SubLObject basis_object;
                                                                            SubLObject state;
                                                                            SubLObject link_node;
                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                    inferiors = cons(link_node, inferiors);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol.isList()) {
                                                                                SubLObject csome_list_var_$389 = sol;
                                                                                SubLObject link_node2 = NIL;
                                                                                link_node2 = csome_list_var_$389.first();
                                                                                while (NIL != csome_list_var_$389) {
                                                                                    inferiors = cons(link_node2, inferiors);
                                                                                    csome_list_var_$389 = csome_list_var_$389.rest();
                                                                                    link_node2 = csome_list_var_$389.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$392, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$385);
                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$391, thread);
                                                        }
                                                    }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            search_direction = csome_list_var.first();
                                        } 
                                    } else {
                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str6$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } else
                                    if (NIL != term.closed_nautP(node_$379, UNPROVIDED)) {
                                        SubLObject csome_list_var2 = ghl_search_vars.determine_ghl_relevant_directions(direction_$376);
                                        SubLObject search_direction2 = NIL;
                                        search_direction2 = csome_list_var2.first();
                                        while (NIL != csome_list_var2) {
                                            final SubLObject link_direction2 = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction2, sbhl_module_vars.get_sbhl_module(pred_$376));
                                            SubLObject cdolist_list_var;
                                            final SubLObject new_list = cdolist_list_var = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$376))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(link_direction2, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(pred_$376));
                                            SubLObject generating_fn = NIL;
                                            generating_fn = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$393 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                try {
                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                    final SubLObject sol2;
                                                    final SubLObject link_nodes_var2 = sol2 = funcall(generating_fn, node_$379);
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject link_node3;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                inferiors = cons(link_node3, inferiors);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var_$390 = sol2;
                                                            SubLObject link_node4 = NIL;
                                                            link_node4 = csome_list_var_$390.first();
                                                            while (NIL != csome_list_var_$390) {
                                                                inferiors = cons(link_node4, inferiors);
                                                                csome_list_var_$390 = csome_list_var_$390.rest();
                                                                link_node4 = csome_list_var_$390.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str5$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                } finally {
                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$393, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                generating_fn = cdolist_list_var.first();
                                            } 
                                            csome_list_var2 = csome_list_var2.rest();
                                            search_direction2 = csome_list_var2.first();
                                        } 
                                    }

                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$382, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$382, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$390, thread);
                            }
                        } else
                            if (NIL != ghl_link_iterators.gt_predicate_p(pred_$376)) {
                                final SubLObject truth = enumeration_types.tv_truth($TRUE_DEF);
                                final SubLObject strength = enumeration_types.tv_strength($TRUE_DEF);
                                final SubLObject _prev_bind_0_$394 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                try {
                                    ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                                    SubLObject csome_list_var3 = ghl_search_vars.determine_ghl_relevant_directions(direction_$376);
                                    SubLObject search_direction3 = NIL;
                                    search_direction3 = csome_list_var3.first();
                                    while (NIL != csome_list_var3) {
                                        final SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction3);
                                        final SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                                        final SubLObject _prev_bind_0_$395 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$383 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                        try {
                                            ghl_link_iterators.$gt_relevant_pred$.bind(pred_$376, thread);
                                            pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                            final SubLObject pred_var = NIL;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                            SubLObject done_var_$395 = NIL;
                                                            final SubLObject token_var_$396 = NIL;
                                                            while (NIL == done_var_$395) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$396);
                                                                final SubLObject valid_$397 = makeBoolean(!token_var_$396.eql(assertion));
                                                                if ((NIL != valid_$397) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion, strength))) {
                                                                    final SubLObject link_node5 = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                                    final SubLObject support_var = assertion;
                                                                    inferiors = cons(link_node5, inferiors);
                                                                }
                                                                done_var_$395 = makeBoolean(NIL == valid_$397);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$396 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values3 = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values3);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$396, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                        } finally {
                                            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$383, thread);
                                            ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$395, thread);
                                        }
                                        if (NIL != gt_vars.gt_use_sksiP()) {
                                            final SubLObject _prev_bind_0_$397 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$376, thread);
                                                SubLObject cdolist_list_var2 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, index_argnum, truth);
                                                SubLObject gather_sentence_mt_pair = NIL;
                                                gather_sentence_mt_pair = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = gather_sentence_mt_pair;
                                                    SubLObject assertion2 = NIL;
                                                    SubLObject var_mt = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    assertion2 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list10);
                                                    var_mt = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion2, strength)) {
                                                            final SubLObject link_node6 = cycl_utilities.formula_arg(assertion2, gather_argnum, UNPROVIDED);
                                                            final SubLObject support_var2 = assertion2;
                                                            inferiors = cons(link_node6, inferiors);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list10);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    gather_sentence_mt_pair = cdolist_list_var2.first();
                                                } 
                                            } finally {
                                                ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$397, thread);
                                            }
                                        }
                                        if (NIL != ghl_search_vars.ghl_uses_spec_preds_p()) {
                                            final SubLObject _prev_bind_0_$398 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                            try {
                                                ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                                final SubLObject _prev_bind_0_$399 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$384 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                                try {
                                                    ghl_link_iterators.$gt_relevant_pred$.bind(pred_$376, thread);
                                                    pred_relevance_macros.$relevant_pred_function$.bind($sym8$RELEVANT_PRED_WRT_GT_, thread);
                                                    final SubLObject pred_var2 = NIL;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var2)) {
                                                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var2);
                                                        SubLObject done_var2 = NIL;
                                                        final SubLObject token_var2 = NIL;
                                                        while (NIL == done_var2) {
                                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                            if (NIL != valid2) {
                                                                SubLObject final_index_iterator2 = NIL;
                                                                try {
                                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                                    SubLObject done_var_$396 = NIL;
                                                                    final SubLObject token_var_$397 = NIL;
                                                                    while (NIL == done_var_$396) {
                                                                        final SubLObject assertion3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$397);
                                                                        final SubLObject valid_$398 = makeBoolean(!token_var_$397.eql(assertion3));
                                                                        if ((NIL != valid_$398) && (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion3, strength))) {
                                                                            final SubLObject link_node7 = cycl_utilities.formula_arg(assertion3, index_argnum, UNPROVIDED);
                                                                            final SubLObject support_var3 = assertion3;
                                                                            inferiors = cons(link_node7, inferiors);
                                                                        }
                                                                        done_var_$396 = makeBoolean(NIL == valid_$398);
                                                                    } 
                                                                } finally {
                                                                    final SubLObject _prev_bind_0_$400 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        final SubLObject _values4 = getValuesAsVector();
                                                                        if (NIL != final_index_iterator2) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                        }
                                                                        restoreValuesFromVector(_values4);
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$400, thread);
                                                                    }
                                                                }
                                                            }
                                                            done_var2 = makeBoolean(NIL == valid2);
                                                        } 
                                                    }
                                                } finally {
                                                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_$384, thread);
                                                    ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_$399, thread);
                                                }
                                                if (NIL != gt_vars.gt_use_sksiP()) {
                                                    final SubLObject _prev_bind_0_$401 = ghl_search_vars.$sksi_gt_search_pred$.currentBinding(thread);
                                                    try {
                                                        ghl_search_vars.$sksi_gt_search_pred$.bind(pred_$376, thread);
                                                        SubLObject cdolist_list_var3 = sksi_sks_mapping_utilities.gather_sksi_gaf_arg_index_relevant_pred(node, gather_argnum, truth);
                                                        SubLObject gather_sentence_mt_pair2 = NIL;
                                                        gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        while (NIL != cdolist_list_var3) {
                                                            SubLObject current2;
                                                            final SubLObject datum2 = current2 = gather_sentence_mt_pair2;
                                                            SubLObject assertion4 = NIL;
                                                            SubLObject var_mt2 = NIL;
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            assertion4 = current2.first();
                                                            current2 = current2.rest();
                                                            destructuring_bind_must_consp(current2, datum2, $list10);
                                                            var_mt2 = current2.first();
                                                            current2 = current2.rest();
                                                            if (NIL == current2) {
                                                                if (NIL == ghl_link_iterators.accessible_link_node_sentence_irrelevantP(assertion4, strength)) {
                                                                    final SubLObject link_node8 = cycl_utilities.formula_arg(assertion4, index_argnum, UNPROVIDED);
                                                                    final SubLObject support_var4 = assertion4;
                                                                    inferiors = cons(link_node8, inferiors);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum2, $list10);
                                                            }
                                                            cdolist_list_var3 = cdolist_list_var3.rest();
                                                            gather_sentence_mt_pair2 = cdolist_list_var3.first();
                                                        } 
                                                    } finally {
                                                        ghl_search_vars.$sksi_gt_search_pred$.rebind(_prev_bind_0_$401, thread);
                                                    }
                                                }
                                            } finally {
                                                ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$398, thread);
                                            }
                                        }
                                        csome_list_var3 = csome_list_var3.rest();
                                        search_direction3 = csome_list_var3.first();
                                    } 
                                } finally {
                                    ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_$394, thread);
                                }
                            }

                    } finally {
                        ghl_link_iterators.$ghl_link_direction$.rebind(_prev_bind_1_$381, thread);
                        ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0_$389, thread);
                    }
                    pred_$375 = pred_$375.rest();
                    pred_$376 = pred_$375.first();
                    direction = direction.rest();
                    direction_$376 = direction.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return values(inferiors, supports);
    }

    public static SubLObject ghl_max_terms_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, UNPROVIDED, UNPROVIDED);
            return result;
        }
        if (NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_max_nodes(predicate, candidates, mt, UNPROVIDED);
        }
        return candidates;
    }

    public static SubLObject ghl_min_terms_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, UNPROVIDED);
            return result;
        }
        if (NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_min_nodes(predicate, candidates, mt);
        }
        return candidates;
    }

    public static SubLObject declare_ghl_search_methods_file() {
        declareFunction(me, "ghl_search", "GHL-SEARCH", 2, 0, false);
        declareFunction(me, "transitive_ghl_search", "TRANSITIVE-GHL-SEARCH", 2, 0, false);
        declareFunction(me, "ghl_mark_and_sweep", "GHL-MARK-AND-SWEEP", 2, 0, false);
        declareFunction(me, "ghl_unmark_and_sweep", "GHL-UNMARK-AND-SWEEP", 2, 0, false);
        declareFunction(me, "ghl_mark_sweep_until_goal", "GHL-MARK-SWEEP-UNTIL-GOAL", 2, 0, false);
        declareFunction(me, "ghl_unmark_sweep_and_map", "GHL-UNMARK-SWEEP-AND-MAP", 2, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_df", "GHL-MARK-AND-SWEEP-DF", 2, 0, false);
        declareFunction(me, "ghl_unmark_and_sweep_df", "GHL-UNMARK-AND-SWEEP-DF", 2, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_bf", "GHL-MARK-AND-SWEEP-BF", 2, 0, false);
        declareFunction(me, "ghl_unmark_and_sweep_bf", "GHL-UNMARK-AND-SWEEP-BF", 2, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_df_purely_recursive", "GHL-MARK-AND-SWEEP-DF-PURELY-RECURSIVE", 3, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_df_hybrid", "GHL-MARK-AND-SWEEP-DF-HYBRID", 4, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_recursive_df", "GHL-MARK-AND-SWEEP-RECURSIVE-DF", 4, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_iterative_df", "GHL-MARK-AND-SWEEP-ITERATIVE-DF", 3, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_iterative_bf", "GHL-MARK-AND-SWEEP-ITERATIVE-BF", 3, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_iterative", "GHL-MARK-AND-SWEEP-ITERATIVE", 4, 0, false);
        declareFunction(me, "ghl_add_accessible_link_nodes_to_deck", "GHL-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 3, 0, false);
        declareFunction(me, "ghl_add_accessible_link_nodes_and_supports_to_deck", "GHL-ADD-ACCESSIBLE-LINK-NODES-AND-SUPPORTS-TO-DECK", 4, 0, false);
        declareFunction(me, "ghl_remove_unneeded_supports", "GHL-REMOVE-UNNEEDED-SUPPORTS", 1, 0, false);
        declareFunction(me, "ghl_add_support_to_result", "GHL-ADD-SUPPORT-TO-RESULT", 2, 0, false);
        declareFunction(me, "ghl_add_justification_to_result", "GHL-ADD-JUSTIFICATION-TO-RESULT", 2, 0, false);
        declareFunction(me, "ghl_create_justification", "GHL-CREATE-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_depth_cutoff_initializer", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF-INITIALIZER", 3, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_depth_cutoff", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF", 3, 0, false);
        declareFunction(me, "ghl_all_edges_iterative_deepening_initializer", "GHL-ALL-EDGES-ITERATIVE-DEEPENING-INITIALIZER", 3, 0, false);
        declareFunction(me, "ghl_mark_and_sweep_depth_cutoff_all_edges_unwound", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF-ALL-EDGES-UNWOUND", 3, 0, false);
        declareMacro(me, "do_ghl_closure", "DO-GHL-CLOSURE");
        declareFunction(me, "new_ghl_closure_iterator", "NEW-GHL-CLOSURE-ITERATOR", 3, 4, false);
        declareMacro(me, "do_ghl_closures", "DO-GHL-CLOSURES");
        declareFunction(me, "new_ghl_closures_iterator", "NEW-GHL-CLOSURES-ITERATOR", 3, 4, false);
        declareFunction(me, "new_removal_ghl_closure_iterator", "NEW-REMOVAL-GHL-CLOSURE-ITERATOR", 3, 1, false);
        declareFunction(me, "new_ghl_closure_search_iterator", "NEW-GHL-CLOSURE-SEARCH-ITERATOR", 5, 0, false);
        declareFunction(me, "ghl_closure_search_iterator_state", "GHL-CLOSURE-SEARCH-ITERATOR-STATE", 5, 0, false);
        declareFunction(me, "ghl_closure_search_iterator_done", "GHL-CLOSURE-SEARCH-ITERATOR-DONE", 1, 0, false);
        new ghl_search_methods.$ghl_closure_search_iterator_done$UnaryFunction();
        declareFunction(me, "ghl_closure_search_iterator_next", "GHL-CLOSURE-SEARCH-ITERATOR-NEXT", 1, 0, false);
        new ghl_search_methods.$ghl_closure_search_iterator_next$UnaryFunction();
        declareFunction(me, "ghl_closure_search_iterator_finalize", "GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE", 1, 0, false);
        new ghl_search_methods.$ghl_closure_search_iterator_finalize$UnaryFunction();
        declareFunction(me, "ghl_closure", "GHL-CLOSURE", 2, 3, false);
        declareFunction(me, "ghl_all_backward_true_nodes", "GHL-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "ghl_all_forward_true_nodes", "GHL-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "ghl_record_closure", "GHL-RECORD-CLOSURE", 3, 2, false);
        declareFunction(me, "ghl_record_all_backward_true_nodes", "GHL-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "ghl_record_all_forward_true_nodes", "GHL-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "ghl_closures", "GHL-CLOSURES", 3, 2, false);
        declareFunction(me, "ghl_predicate_relation_p", "GHL-PREDICATE-RELATION-P", 3, 3, false);
        declareFunction(me, "gt_predicate_relation_p", "GT-PREDICATE-RELATION-P", 3, 3, false);
        declareFunction(me, "possibly_reverse_nodes_and_directions", "POSSIBLY-REVERSE-NODES-AND-DIRECTIONS", 4, 0, false);
        declareFunction(me, "gt_predicates_relation_p", "GT-PREDICATES-RELATION-P", 4, 3, false);
        declareFunction(me, "gt_predicate_relation_p_add_accessible_link_nodes_to_deck", "GT-PREDICATE-RELATION-P-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 4, 0, false);
        declareFunction(me, "ghl_predicate_relation_within_multiple_searches_p", "GHL-PREDICATE-RELATION-WITHIN-MULTIPLE-SEARCHES-P", 5, 2, false);
        declareFunction(me, "ghl_path_from_node_to_node_within_previous_searches", "GHL-PATH-FROM-NODE-TO-NODE-WITHIN-PREVIOUS-SEARCHES", 6, 0, false);
        declareFunction(me, "ghl_unmark_closure_in_space_and_map", "GHL-UNMARK-CLOSURE-IN-SPACE-AND-MAP", 5, 0, false);
        declareFunction(me, "why_ghl_predicate_relation_p", "WHY-GHL-PREDICATE-RELATION-P", 3, 2, false);
        declareFunction(me, "why_gt_predicate_relation_p", "WHY-GT-PREDICATE-RELATION-P", 3, 2, false);
        declareFunction(me, "why_gt_predicates_relation_p", "WHY-GT-PREDICATES-RELATION-P", 4, 2, false);
        declareFunction(me, "gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck", "GT-WHY-PREDICATE-RELATION-P-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 5, 0, false);
        declareFunction(me, "ghl_max_floor_mts_of_predicate_paths", "GHL-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "gt_max_floor_mts_of_predicate_paths", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
        declareFunction(me, "gt_max_floor_mts_of_predicate_paths_add_accessible_link_nodes_to_deck", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 4, 0, false);
        declareFunction(me, "gt_max_floor_mts_of_predicate_paths_supports_still_relevantP", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-SUPPORTS-STILL-RELEVANT?", 2, 0, false);
        declareFunction(me, "gt_max_floor_mts_of_predicate_paths_support_still_relevantP", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-SUPPORT-STILL-RELEVANT?", 2, 0, false);
        declareFunction(me, "ghl_min_superiors", "GHL-MIN-SUPERIORS", 2, 3, false);
        declareFunction(me, "ghl_max_inferiors", "GHL-MAX-INFERIORS", 2, 3, false);
        declareFunction(me, "ghl_direct_inferiors", "GHL-DIRECT-INFERIORS", 2, 3, false);
        declareFunction(me, "ghl_direct_superiors", "GHL-DIRECT-SUPERIORS", 2, 3, false);
        declareFunction(me, "ghl_max_terms_wrt", "GHL-MAX-TERMS-WRT", 2, 1, false);
        declareFunction(me, "ghl_min_terms_wrt", "GHL-MIN-TERMS-WRT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_ghl_search_methods_file() {
        defparameter("*GHL-MARK-AND-SWEEP-RECURSION-LIMIT*", $int$24);
        return NIL;
    }

    public static SubLObject setup_ghl_search_methods_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ghl_search_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_ghl_search_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ghl_search_methods_file();
    }

    static {
































































    }

    public static final class $ghl_closure_search_iterator_done$UnaryFunction extends UnaryFunction {
        public $ghl_closure_search_iterator_done$UnaryFunction() {
            super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-DONE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ghl_closure_search_iterator_done(arg1);
        }
    }

    public static final class $ghl_closure_search_iterator_next$UnaryFunction extends UnaryFunction {
        public $ghl_closure_search_iterator_next$UnaryFunction() {
            super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-NEXT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ghl_closure_search_iterator_next(arg1);
        }
    }

    public static final class $ghl_closure_search_iterator_finalize$UnaryFunction extends UnaryFunction {
        public $ghl_closure_search_iterator_finalize$UnaryFunction() {
            super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ghl_closure_search_iterator_finalize(arg1);
        }
    }
}

/**
 * Total time: 10230 ms
 */
