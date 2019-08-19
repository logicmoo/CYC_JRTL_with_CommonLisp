package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_parse_trees extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees";
    public static String myFingerPrint = "9f565b442a3b0b3ed575ceaa015b115bd791e90c12afc699b0c5b238d9fff842";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 800L)
    private static SubLSymbol $predicates_to_parse_tree_methods$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1400L)
    private static SubLSymbol $predicates_with_parse_tree_support_in_some_mt_caching_state$;
    private static SubLList $list0;
    private static SubLSymbol $sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT;
    private static SubLSymbol $sym2$RELEVANT_MT_IS_ANY_MT;
    private static SubLObject $$InferencePSC;
    private static SubLList $list4;
    private static SubLSymbol $DEPTH;
    private static SubLSymbol $STACK;
    private static SubLSymbol $QUEUE;
    private static SubLSymbol $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static SubLSymbol $ERROR;
    private static SubLString $str10$_A_is_not_a__A;
    private static SubLSymbol $sym11$SBHL_TRUE_TV_P;
    private static SubLSymbol $CERROR;
    private static SubLString $str13$continue_anyway;
    private static SubLSymbol $WARN;
    private static SubLString $str15$_A_is_not_a_valid__sbhl_type_erro;
    private static SubLObject $$genlPreds;
    private static SubLString $str17$_A_is_neither_SET_P_nor_LISTP_;
    private static SubLString $str18$attempting_to_bind_direction_link;
    private static SubLString $str19$Node__a_does_not_pass_sbhl_type_t;
    private static SubLSymbol $sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_;
    private static SubLSymbol $sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT;
    private static SubLSymbol $NODES;
    private static SubLSymbol $SUPPORTS;
    private static SubLList $list24;
    private static SubLObject $$True_JustificationTruth;
    private static SubLSymbol $METHOD;
    private static SubLSymbol $TYPE_CHECK;
    private static SubLSymbol $PARSE_TREE;
    private static SubLSymbol $REMOVAL_PARSE_TREE_RELATION_POS;
    private static SubLList $list30;
    private static SubLSymbol $PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND;
    private static SubLList $list32;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1400L)
    public static SubLObject clear_predicates_with_parse_tree_support_in_some_mt() {
        SubLObject cs = $predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1400L)
    public static SubLObject remove_predicates_with_parse_tree_support_in_some_mt() {
        return memoization_state.caching_state_remove_function_results_with_args($predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1400L)
    public static SubLObject predicates_with_parse_tree_support_in_some_mt_internal() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym2$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject cdolist_list_var = $predicates_to_parse_tree_methods$.getGlobalValue();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                SubLObject datum = current = cons;
                SubLObject pred = NIL;
                SubLObject value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
                pred = current.first();
                current = (value = current.rest());
                SubLObject node_var = pred;
                SubLObject deck_type = $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject tv_var = NIL;
                        SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str13$continue_anyway, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($WARN)) {
                                    Errors.warn($str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str15$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str13$continue_anyway, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P);
                                }
                            }
                            SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                    SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            SubLObject node_var_$9 = node_and_predicate_mode.first();
                                            SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            SubLObject genl_pred = node_var_$9;
                                            SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                    SubLObject item_var = genl_pred;
                                                    if (NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                                                        ans = cons(item_var, ans);
                                                    }
                                                }
                                                SubLObject cdolist_list_var_$11;
                                                SubLObject accessible_modules = cdolist_list_var_$11 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$11.first();
                                                while (NIL != cdolist_list_var_$11) {
                                                    SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node = function_terms.naut_to_nart(node_var_$9);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$15;
                                                                                for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                        set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str17$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str18$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$12;
                                                            SubLObject new_list = cdolist_list_var_$12 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$12.first();
                                                            while (NIL != cdolist_list_var_$12) {
                                                                SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    SubLObject sol2;
                                                                    SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                                set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str17$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                                }
                                                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                                                generating_fn = cdolist_list_var_$12.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                    module_var = cdolist_list_var_$11.first();
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str19$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1400L)
    public static SubLObject predicates_with_parse_tree_support_in_some_mt() {
        SubLObject caching_state = $predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT, $sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback($sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(predicates_with_parse_tree_support_in_some_mt_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1800L)
    public static SubLObject predicate_with_parse_tree_support_p(SubLObject v_object) {
        SubLObject ans = NIL;
        if (NIL != subl_promotions.memberP(v_object, predicates_with_parse_tree_support_in_some_mt(), UNPROVIDED, UNPROVIDED)) {
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject pred;
            SubLObject value;
            for (rest = NIL, rest = $predicates_to_parse_tree_methods$.getGlobalValue(); NIL == ans && NIL != rest; rest = rest.rest()) {
                cons = rest.first();
                datum = (current = cons);
                pred = NIL;
                value = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
                pred = current.first();
                current = (value = current.rest());
                if (NIL != genl_predicates.spec_predicateP(v_object, pred, UNPROVIDED, UNPROVIDED)) {
                    ans = T;
                }
            }
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2100L)
    public static SubLObject predicate_with_parse_tree_direct_support_p(SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values($predicates_to_parse_tree_methods$.getGlobalValue(), v_object, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2300L)
    public static SubLObject removal_parse_tree_relation_answer_list(SubLObject asent) {
        return removal_parse_tree_relation_int(asent, $NODES);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2400L)
    public static SubLObject parse_tree_relation_supports(SubLObject asent) {
        return removal_parse_tree_relation_int(asent, $SUPPORTS);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2500L)
    public static SubLObject removal_parse_tree_relation_int(SubLObject asent, SubLObject return_type) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject current;
        SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject original_pred = NIL;
        SubLObject node = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        original_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject root_node = parsing_utilities.syntactic_node_root_node(node);
            if (NIL != parsing_utilities.phrasal_nodeP(root_node)) {
                SubLObject trees_to_nodes = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject big_parse_tree = parsing_utilities.construct_subl_parse_tree_from_syntactic_node(root_node, trees_to_nodes);
                SubLObject v_parse_tree = parse_tree_for_syntactic_node(node, trees_to_nodes);
                SubLObject node_var = original_pred;
                SubLObject deck_type = $QUEUE;
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject tv_var = $$True_JustificationTruth;
                        SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((NIL != tv_var) ? $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str13$continue_anyway, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($WARN)) {
                                    Errors.warn($str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str15$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str13$continue_anyway, $str10$_A_is_not_a__A, tv_var, $sym11$SBHL_TRUE_TV_P);
                                }
                            }
                            SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if (NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test(original_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                    SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(original_pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            SubLObject node_var_$26 = node_and_predicate_mode.first();
                                            SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            SubLObject pred = node_var_$26;
                                            SubLObject _prev_bind_0_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                SubLObject inverseP = predicate_mode;
                                                if (NIL == inverseP && NIL != predicate_with_parse_tree_direct_support_p(pred)) {
                                                    SubLObject plist = list_utilities.alist_lookup_without_values($predicates_to_parse_tree_methods$.getGlobalValue(), pred, UNPROVIDED, UNPROVIDED);
                                                    SubLObject method = conses_high.getf(plist, $METHOD, UNPROVIDED);
                                                    SubLObject type_check = conses_high.getf(plist, $TYPE_CHECK, UNPROVIDED);
                                                    SubLObject result = (NIL != Functions.funcall(type_check, v_parse_tree)) ? apply_parse_tree_removal_method(v_parse_tree, method) : NIL;
                                                    SubLObject cdolist_list_var;
                                                    SubLObject results = cdolist_list_var = result.isList() ? result : list(result);
                                                    SubLObject one_result = NIL;
                                                    one_result = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        SubLObject answer_node = syntactic_node_for_parse_tree(one_result, trees_to_nodes);
                                                        if (NIL != unification_utilities.term_unify(answer_node, arg2, UNPROVIDED, UNPROVIDED)) {
                                                            if (return_type.eql($NODES)) {
                                                                ans = cons(answer_node, ans);
                                                            } else if (return_type.eql($SUPPORTS)) {
                                                                if (!pred.eql(original_pred)) {
                                                                    ans = cons(removal_module_utilities.make_genl_preds_support(pred, original_pred), ans);
                                                                }
                                                                SubLObject support_formula = el_utilities.make_binary_formula(pred, node, answer_node);
                                                                ans = cons(arguments.make_hl_support($PARSE_TREE, support_formula, UNPROVIDED, UNPROVIDED), ans);
                                                            }
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        one_result = cdolist_list_var.first();
                                                    }
                                                }
                                                SubLObject cdolist_list_var2;
                                                SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(
                                                                (NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        SubLObject node_$30 = function_terms.naut_to_nart(node_var_$26);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node_$30)) {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$30, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                            iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$32;
                                                                                for (iteration_state_$32 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                                                        iteration_state_$32); iteration_state_$32 = dictionary_contents.do_dictionary_contents_next(iteration_state_$32)) {
                                                                                    thread.resetMultipleValues();
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$32);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object,
                                                                                                        set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str17$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$32);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str18$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else if (NIL != obsolete.cnat_p(node_$30, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$34;
                                                            SubLObject new_list = cdolist_list_var_$34 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p())
                                                                    ? list_utilities.randomize_list(
                                                                            sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
                                                                    : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$34.first();
                                                            while (NIL != cdolist_list_var_$34) {
                                                                SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    SubLObject sol2;
                                                                    SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node_$30);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2,
                                                                                set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    } else {
                                                                        Errors.error($str17$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                }
                                                                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                                generating_fn = cdolist_list_var_$34.first();
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var = cdolist_list_var2.first();
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$23, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$25, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str19$Node__a_does_not_pass_sbhl_type_t, original_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list24);
        }
        return ans;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4200L)
    public static SubLObject apply_parse_tree_removal_method(SubLObject v_parse_tree, SubLObject method) {
        return methods.funcall_instance_method_with_0_args(v_parse_tree, method);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4300L)
    public static SubLObject syntactic_node_for_parse_tree(SubLObject v_parse_tree, SubLObject trees_to_nodes) {
        return dictionary.dictionary_lookup_without_values(trees_to_nodes, v_parse_tree, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4400L)
    public static SubLObject parse_tree_for_syntactic_node(SubLObject syntactic_node, SubLObject trees_to_nodes) {
        return dictionary_utilities.dictionary_reverse_lookup(trees_to_nodes, syntactic_node, UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_parse_trees_file() {
        declareFunction(myName, "clear_predicates_with_parse_tree_support_in_some_mt", "CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        declareFunction(myName, "remove_predicates_with_parse_tree_support_in_some_mt", "REMOVE-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        declareFunction(myName, "predicates_with_parse_tree_support_in_some_mt_internal", "PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-INTERNAL", 0, 0, false);
        declareFunction(myName, "predicates_with_parse_tree_support_in_some_mt", "PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        declareFunction(myName, "predicate_with_parse_tree_support_p", "PREDICATE-WITH-PARSE-TREE-SUPPORT-P", 1, 0, false);
        new $predicate_with_parse_tree_support_p$UnaryFunction();
        declareFunction(myName, "predicate_with_parse_tree_direct_support_p", "PREDICATE-WITH-PARSE-TREE-DIRECT-SUPPORT-P", 1, 0, false);
        declareFunction(myName, "removal_parse_tree_relation_answer_list", "REMOVAL-PARSE-TREE-RELATION-ANSWER-LIST", 1, 0, false);
        declareFunction(myName, "parse_tree_relation_supports", "PARSE-TREE-RELATION-SUPPORTS", 1, 0, false);
        declareFunction(myName, "removal_parse_tree_relation_int", "REMOVAL-PARSE-TREE-RELATION-INT", 2, 0, false);
        declareFunction(myName, "apply_parse_tree_removal_method", "APPLY-PARSE-TREE-REMOVAL-METHOD", 2, 0, false);
        declareFunction(myName, "syntactic_node_for_parse_tree", "SYNTACTIC-NODE-FOR-PARSE-TREE", 2, 0, false);
        declareFunction(myName, "parse_tree_for_syntactic_node", "PARSE-TREE-FOR-SYNTACTIC-NODE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_parse_trees_file() {
        $predicates_to_parse_tree_methods$ = deflexical("*PREDICATES-TO-PARSE-TREE-METHODS*", $list0);
        $predicates_with_parse_tree_support_in_some_mt_caching_state$ = SubLFiles.deflexical("*PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_parse_trees_file() {
        memoization_state.note_globally_cached_function($sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT);
        inference_modules.inference_removal_module($REMOVAL_PARSE_TREE_RELATION_POS, $list30);
        preference_modules.inference_preference_module($PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND, $list32);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_parse_trees_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_parse_trees_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_parse_trees_file();
    }

    static {
        me = new removal_modules_parse_trees();
        $predicates_to_parse_tree_methods$ = null;
        $predicates_with_parse_tree_support_in_some_mt_caching_state$ = null;
        $list0 = list(list(makeConstSym(("syntacticVerbalPhraseNodeSubjectNode")), makeKeyword("METHOD"), makeSymbol("GET-SUBJECT"), makeKeyword("TYPE-CHECK"), makeSymbol("VERBAL-PHRASE-TREE-P")),
                list(makeConstSym(("syntacticVerbalPhraseNodeObjectNodes")), makeKeyword("METHOD"), makeSymbol("GET-OBJECTS"), makeKeyword("TYPE-CHECK"), makeSymbol("VERBAL-PHRASE-TREE-P")),
                list(makeConstSym(("syntacticNodeSyntacticHead")), makeKeyword("METHOD"), makeSymbol("GET-HEAD"), makeKeyword("TYPE-CHECK"), makeSymbol("PHRASE-TREE-P")),
                list(makeConstSym(("syntacticVerbalPhraseNodeIndirectObjectNode")), makeKeyword("METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), makeKeyword("TYPE-CHECK"), makeSymbol("VERBAL-PHRASE-TREE-P")),
                list(makeConstSym(("syntacticVerbalPhraseNodeDirectObjectNode")), makeKeyword("METHOD"), makeSymbol("GET-DIRECT-OBJECT"), makeKeyword("TYPE-CHECK"), makeSymbol("VERBAL-PHRASE-TREE-P")));
        $sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT = makeSymbol("PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT");
        $sym2$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $$InferencePSC = makeConstSym(("InferencePSC"));
        $list4 = cons(makeSymbol("PRED"), makeUninternedSymbol("VALUE"));
        $DEPTH = makeKeyword("DEPTH");
        $STACK = makeKeyword("STACK");
        $QUEUE = makeKeyword("QUEUE");
        $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $ERROR = makeKeyword("ERROR");
        $str10$_A_is_not_a__A = makeString("~A is not a ~A");
        $sym11$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
        $CERROR = makeKeyword("CERROR");
        $str13$continue_anyway = makeString("continue anyway");
        $WARN = makeKeyword("WARN");
        $str15$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
        $$genlPreds = makeConstSym(("genlPreds"));
        $str17$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");
        $str18$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str19$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_ = makeSymbol("*PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-CACHING-STATE*");
        $sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT = makeSymbol("CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT");
        $NODES = makeKeyword("NODES");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $list24 = list(makeSymbol("ORIGINAL-PRED"), makeSymbol("NODE"), makeSymbol("ARG2"));
        $$True_JustificationTruth = makeConstSym(("True-JustificationTruth"));
        $METHOD = makeKeyword("METHOD");
        $TYPE_CHECK = makeKeyword("TYPE-CHECK");
        $PARSE_TREE = makeKeyword("PARSE-TREE");
        $REMOVAL_PARSE_TREE_RELATION_POS = makeKeyword("REMOVAL-PARSE-TREE-RELATION-POS");
        $list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("PREDICATE-WITH-PARSE-TREE-SUPPORT-P")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PRED")), list(makeKeyword("BIND"), makeSymbol("NODE")), list(makeKeyword("BIND"), makeSymbol("ARG2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeSymbol("NODE")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARSE-TREE-RELATION-ANSWER-LIST"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeSymbol("NODE")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("PARSE-TREE"), makeKeyword("DOCUMENTATION"),
                makeString("((:test predicate-with-parse-tree-support-p) :fully-bound :anything)") });
        $PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND = makeKeyword("PARSE-TREE-REQUIRE-ARG1-FULLY-BOUND");
        $list32 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("PREDICATE-WITH-PARSE-TREE-SUPPORT-P")), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE"), makeSymbol("MUST-BIND-ARG1"));
    }

    public static class $predicate_with_parse_tree_support_p$UnaryFunction extends UnaryFunction {
        public $predicate_with_parse_tree_support_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-WITH-PARSE-TREE-SUPPORT-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return predicate_with_parse_tree_support_p(arg1);
        }
    }
}
/*
 *
 * Total time: 795 ms
 *
 */