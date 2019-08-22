package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_marking_methods extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_marking_methods();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods";

    public static final String myFingerPrint = "f16c118f07a3ffc3b8f891210433a8f5a0c9f946179b3debe718433901eaf3e5";

    // Internal Constants
    public static final SubLSymbol SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLSymbol SBHL_NODE_IS_A_GOAL_NODE = makeSymbol("SBHL-NODE-IS-A-GOAL-NODE");

    public static final SubLSymbol SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");

    public static final SubLSymbol SBHL_CONSIDER_NODE = makeSymbol("SBHL-CONSIDER-NODE");







    public static final SubLString $str8$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    public static final SubLString $str17$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    public static final SubLString $str18$marking_space____S__ = makeString("marking-space = ~S~%");

    public static final SubLSymbol SBHL_MARK_CLOSURE_AS_MARKED = makeSymbol("SBHL-MARK-CLOSURE-AS-MARKED");

    public static final SubLSymbol SBHL_UNMARK_INITIALIZED_MARKED_CLOSURE = makeSymbol("SBHL-UNMARK-INITIALIZED-MARKED-CLOSURE");

    public static final SubLSymbol SBHL_APPLY_COMPOSE_FN = makeSymbol("SBHL-APPLY-COMPOSE-FN");

    public static final SubLSymbol SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");

    public static final SubLSymbol SBHL_PUSH_ONTO_RESULT_IF = makeSymbol("SBHL-PUSH-ONTO-RESULT-IF");

    public static final SubLSymbol SBHL_APPLY_MARK_IN_SPACE = makeSymbol("SBHL-APPLY-MARK-IN-SPACE");

    public static final SubLSymbol SBHL_APPLY_UNMARK_IN_SPACE = makeSymbol("SBHL-APPLY-UNMARK-IN-SPACE");

    public static final SubLSymbol SBHL_MARK_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-IN-TARGET-SPACE");

    public static final SubLSymbol SBHL_MARK_IN_TARGET_GATHER_SPACE = makeSymbol("SBHL-MARK-IN-TARGET-GATHER-SPACE");

    public static final SubLString $str28$invalid_module_type__a = makeString("invalid module type ~a");

    public static final SubLSymbol SBHL_MARK_CLOSURE_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-CLOSURE-IN-TARGET-SPACE");

    public static final SubLSymbol SBHL_MARK_NODE_AND_INSTANCES_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-NODE-AND-INSTANCES-IN-TARGET-SPACE");

    public static final SubLString $str31$Error_in_direction__a = makeString("Error in direction ~a");

    public static final SubLSymbol SBHL_PREDICATE_OBJECT_P = makeSymbol("SBHL-PREDICATE-OBJECT-P");

    public static SubLObject sbhl_premark_goal_nodes(final SubLObject nodes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p()) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                SubLObject cdolist_list_var = nodes;
                SubLObject goal_node = NIL;
                goal_node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                        sbhl_premark_gather_nodes(goal_node);
                    } finally {
                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$1, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    goal_node = cdolist_list_var.first();
                } 
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), thread);
                SubLObject cdolist_list_var = nodes;
                SubLObject goal_node = NIL;
                goal_node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sbhl_marking_utilities.sbhl_mark_node_marked(goal_node, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    goal_node = cdolist_list_var.first();
                } 
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_premark_direction(final SubLObject module) {
        return sbhl_search_vars.get_sbhl_forward_search_direction();
    }

    public static SubLObject sbhl_premark_gather_nodes(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_search_utilities.sbhl_sweep(sbhl_module_vars.get_sbhl_module(UNPROVIDED), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_premark_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CHECK_CUTOFF, node, sbhl_search_vars.sbhl_unmarking_search_p());
        return NIL;
    }

    public static SubLObject sbhl_gather_premarked_justifications(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module = sbhl_module_utilities.get_sbhl_premark_module(sbhl_search_vars.get_sbhl_search_module());
        if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
            SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                    sbhl_search_vars.$sbhl_consider_node_fn$.bind(NIL != sbhl_search_utilities.sbhl_search_has_multiple_goals_p() ? SBHL_NODE_IS_A_GOAL_NODE : SBHL_NODE_IS_GOAL_NODE, thread);
                    sbhl_search_utilities.sbhl_unmark_sweep(module, sbhl_module_utilities.get_sbhl_module_backward_direction(module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_goal_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node);
                } finally {
                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } else {
            final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_consider_node_fn$.bind(NIL != sbhl_search_utilities.sbhl_search_has_multiple_goals_p() ? SBHL_NODE_IS_A_GOAL_NODE : SBHL_NODE_IS_GOAL_NODE, thread);
                sbhl_search_utilities.sbhl_unmark_sweep(module, sbhl_module_utilities.get_sbhl_module_backward_direction(module), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_goal_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node);
            } finally {
                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$15 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_mark_closure_as_marked(node);
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$7, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$16, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$15, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$6, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$6, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$7, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$6, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$5, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$5, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$5, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_all_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$19 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$21 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$22 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$23 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$23 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$32 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$25 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$24 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_mark_closure_as_marked(node);
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$24, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$25, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$33, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$32, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$23, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$23, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$24, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$23, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$22, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$22, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$22, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$21, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$21, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$21, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$20, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$19, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_closure_as_marked(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
                sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
            } finally {
                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0, thread);
            }
        } else {
            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str17$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_closure_in_space(final SubLObject node, final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_mark_closure_as_marked(node);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_forward_true_nodes_in_space(final SubLObject module, final SubLObject node, SubLObject space, SubLObject gather_space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (gather_space == UNPROVIDED) {
            gather_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(gather_space, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            sbhl_mark_all_forward_true_nodes(module, node, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_backward_true_nodes_in_space(final SubLObject module, final SubLObject node, SubLObject space, SubLObject gather_space) {
        if (space == UNPROVIDED) {
            space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
        }
        if (gather_space == UNPROVIDED) {
            gather_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(space, thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(gather_space, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            Errors.warn($str18$marking_space____S__, sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
            sbhl_mark_all_backward_true_nodes(module, node, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_proper_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$38 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$39 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$40 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$49 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$41 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_mark_proper_closure_as_marked(node);
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$41, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$42, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$50, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$49, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$40, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$41, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$40, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$39, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$39, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$39, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$38, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$38, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$37, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$38, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$37, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$36, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_proper_closure_as_marked(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            sbhl_search_utilities.sbhl_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.get_sbhl_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_MARK_CLOSURE_AS_MARKED, node, T, UNPROVIDED);
        } else {
            sbhl_mark_closure_as_marked(node);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_all_marked_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$53 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$55 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$55 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$56 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$56 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$56 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$57 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$57 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$66 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$58 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_unmark_marked_closure(node);
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$58, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$59, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$67, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$66, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$57, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$57, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$58, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$57, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$56, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$56, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$56, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$55, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$55, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$55, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$54, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$53, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_all_marked_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$72 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$75 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_unmark_marked_closure(node);
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$75, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$84, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$83, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$74, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$75, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$74, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$73, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$72, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$72, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$71, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$72, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$71, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$70, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_marked_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
                sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
                if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                    SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                            sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                        } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$88, thread);
                            sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$87, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                } else {
                    sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                }
            } finally {
                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
            }
        } else {
            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str17$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_initialized_marked_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
            sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_proper_marked_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.sbhl_unmark_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.get_sbhl_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_UNMARK_INITIALIZED_MARKED_CLOSURE, node, UNPROVIDED);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.sbhl_unmark_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.get_sbhl_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_UNMARK_INITIALIZED_MARKED_CLOSURE, node, UNPROVIDED);
            }
        } else {
            sbhl_unmark_marked_closure(node);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_all_backward_true_nodes_and_map(final SubLObject function, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$89 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                    if (pcase_var.eql($ERROR)) {
                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (pcase_var.eql($CERROR)) {
                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($WARN)) {
                                Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            } else {
                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                            }


                }
                final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$91 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$91 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$92 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$92 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$93 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$97 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$100 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                        sbhl_search_vars.$sbhl_compose_fn$.bind(function, thread);
                                        sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_APPLY_COMPOSE_FN, thread);
                                        if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                                            SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                                            SubLObject pred = NIL;
                                            pred = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$95 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                                                    sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$94, thread);
                                                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$95, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                pred = cdolist_list_var.first();
                                            } 
                                        } else {
                                            sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                                        }
                                    } finally {
                                        sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3_$100, thread);
                                        sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_2_$97, thread);
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$93, thread);
                                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$94, thread);
                                    }
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$96, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$92, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$93, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$92, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$91, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$91, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$90, thread);
                }
            } finally {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$89, thread);
            }
        } finally {
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sbhl_unmark_marked_closure_and_gather(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$103 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$103, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_marked_closure_and_gather_if(final SubLObject node, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_search_vars.$sbhl_compose_fn$.bind(function, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT_IF, thread);
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$105 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$106, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$105, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_marked_closure_and_mark_in_space(final SubLObject node, final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_apply_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_marking_vars.$sbhl_apply_marking_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_APPLY_MARK_IN_SPACE, thread);
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$107 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$108 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$108, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$107, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_apply_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_marked_closure_and_unmark_in_space(final SubLObject node, final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_apply_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_marking_vars.$sbhl_apply_marking_space$.bind(space, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_APPLY_UNMARK_IN_SPACE, thread);
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$110 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$110, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$109, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_apply_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_cyclic_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$111 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$112 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$112 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$113 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$114 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$113 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$117 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$118 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    final SubLObject _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$114 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                        sbhl_mark_proper_closure_as_marked(node);
                                        if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                                            final SubLObject _prev_bind_0_$116 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_unmark_marked_closure_and_mark_in_space(node, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread));
                                            } finally {
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$115, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$116, thread);
                                            }
                                        } else {
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$114, thread);
                                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$115, thread);
                                    }
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$118, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$117, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$113, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$114, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$113, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$112, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_1_$112, thread);
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$111, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_cyclic_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$124 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$125 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                    sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                    final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                    final SubLObject _prev_bind_0_$125 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                        final SubLObject _prev_bind_0_$126 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$127 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$126 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$130 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_3_$131 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    final SubLObject _prev_bind_0_$128 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$127 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                        sbhl_mark_proper_closure_as_marked(node);
                                        if (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED)) {
                                            final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$128 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_unmark_marked_closure_and_unmark_in_space(node, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread));
                                            } finally {
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$128, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$129, thread);
                                            }
                                        } else {
                                            sbhl_marking_utilities.sbhl_mark_node_unmarked(node, sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$127, thread);
                                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$128, thread);
                                    }
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$131, thread);
                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$130, thread);
                                sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$126, thread);
                                sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$127, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$126, thread);
                        }
                        if (source == $RESOURCE) {
                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$125, thread);
                    }
                } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_4, thread);
                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_1_$125, thread);
                    sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$124, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_max_true_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_disjoins_module(module), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_disjoins_module(module)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_disjoins_module(module)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_disjoins_module(module), thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$137 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$138 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$139 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$139 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$140 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$140 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$140 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$141 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$142 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$141 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$141 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$150 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$151 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        sbhl_mark_extremal_disjoins(node);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$151, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$150, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$141, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$141, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$142, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$141, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$140, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$140, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$140, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$139, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$139, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$138, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$139, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$138, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$137, thread);
            }
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_extremal_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_disjoins_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_disjoins_space$.bind(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$152 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                final SubLObject _prev_bind_1_$153 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_disjoins_space$.getDynamicValue(thread), thread);
                    sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
                    sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
                } finally {
                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_1_$153, thread);
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$152, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$153 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_disjoins_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_max_true_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_disjoins_module(module), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_disjoins_module(module)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_disjoins_module(module)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_disjoins_module(module), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$155 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$156 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$157 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$156 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$157 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$157 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$158 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$158 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$158 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$159 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$160 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$159 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$159 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$168 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$169 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        sbhl_unmark_extremal_disjoins(node);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$169, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$168, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$159, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$159, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$160, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$159, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$158, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$158, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$158, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$157, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$157, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$156, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$157, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$156, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$155, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_extremal_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_disjoins_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            sbhl_marking_vars.$sbhl_disjoins_space$.bind(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$170 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$171 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$172 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_disjoins_space$.getDynamicValue(thread), thread);
                            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_CHECK_CUTOFF, thread);
                            sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
                        } finally {
                            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_1_$172, thread);
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$171, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$172 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$172, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$170, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$173 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$173, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_disjoins_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject determine_sbhl_mark_between_consider_fn() {
        if (NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            return SBHL_MARK_IN_TARGET_SPACE;
        }
        if (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module())) {
            return SBHL_MARK_IN_TARGET_GATHER_SPACE;
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str28$invalid_module_type__a, sbhl_search_vars.get_sbhl_search_module(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_mark_forward_true_nodes_between_and_all_their_inherited_nodes(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), thread);
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$175 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$176 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$177 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$176 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$177 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$177 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$178 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$178 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$178 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$179 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$180 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$179 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$179 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$188 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$189 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$181 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$180 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                            sbhl_mark_closure_as_marked(node1);
                                            final SubLObject _prev_bind_0_$182 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$181 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.bind(determine_sbhl_mark_between_consider_fn(), thread);
                                                sbhl_unmark_marked_closure_and_target_mark_closure(node2);
                                            } finally {
                                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_1_$181, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$182, thread);
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_$180, thread);
                                            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_$181, thread);
                                        }
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$189, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$188, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$179, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$179, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$180, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$179, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$178, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$178, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$178, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$177, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$177, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$176, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$177, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$176, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$175, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unmark_marked_closure_and_target_mark_closure(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED))), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED))), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
            sbhl_mark_cyclic_closure(node);
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
            if (NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module())) {
                SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$194 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(eql(pred, $$genlInverse), thread);
                        sbhl_search_utilities.sbhl_sweep(NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module()) ? sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()) : sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_MARK_CLOSURE_IN_TARGET_SPACE, node, T);
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_$194, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else {
                sbhl_search_utilities.sbhl_sweep(NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module()) ? sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()) : sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), SBHL_MARK_CLOSURE_IN_TARGET_SPACE, node, T);
            }
        } finally {
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_closure_in_target_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_unmarking_search_p$.bind(NIL, thread);
            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread))) {
                sbhl_search_utilities.sbhl_sweep(sbhl_module_vars.get_sbhl_module(UNPROVIDED), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(sbhl_search_vars.get_sbhl_search_module()) ? SBHL_MARK_NODE_AND_INSTANCES_IN_TARGET_SPACE : SBHL_CONSIDER_NODE, node, NIL);
            }
        } finally {
            sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_mark_node_and_instances_in_target_space(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        sbhl_search_utilities.sbhl_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), SBHL_CONSIDER_NODE, node, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_record_closure(final SubLObject module, final SubLObject node, final SubLObject direction, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
            sbhl_record_all_forward_true_nodes(module, node, mt, tv);
        } else
            if (NIL != sbhl_link_vars.sbhl_backward_directed_direction_p(direction)) {
                sbhl_record_all_backward_true_nodes(module, node, mt, tv);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str31$Error_in_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject sbhl_record_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_mark_all_forward_true_nodes(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_record_all_backward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_mark_all_backward_true_nodes(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_record_max_true_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_mark_max_true_disjoins(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unrecord_max_true_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_unmark_max_true_disjoins(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_unrecord_all_recorded_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_unmark_all_marked_forward_true_nodes(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject unrecord_all_superiors_as_unsearched_ignore_arg2(final SubLObject node, SubLObject ignore) {
        if (ignore == UNPROVIDED) {
            ignore = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_module = sbhl_search_vars.get_sbhl_search_module();
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_module_vars.sbhl_predicate_object_p(search_module))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, search_module, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str8$_A_is_not_a__A, search_module, SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str8$_A_is_not_a__A, search_module, SBHL_PREDICATE_OBJECT_P);
                    } else {
                        Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str8$_A_is_not_a__A, search_module, SBHL_PREDICATE_OBJECT_P);
                    }


        }
        sbhl_unrecord_all_recorded_forward_true_nodes(search_module, node, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_record_node(final SubLObject node, SubLObject table) {
        if (table == UNPROVIDED) {
            table = sbhl_marking_vars.$sbhl_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(table, thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_marking_utilities.sbhl_mark_node(node, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sbhl_recorded_node_p(final SubLObject node, SubLObject table) {
        if (table == UNPROVIDED) {
            table = sbhl_marking_vars.$sbhl_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recordedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(table, thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            recordedP = sbhl_marking_utilities.sbhl_marked_node_p(node, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return recordedP;
    }

    public static SubLObject sbhl_unrecorded_node_p(final SubLObject node, SubLObject table) {
        if (table == UNPROVIDED) {
            table = sbhl_marking_vars.$sbhl_table$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recordedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(table, thread);
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            recordedP = sbhl_marking_utilities.sbhl_marked_node_p(node, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == recordedP);
    }

    public static SubLObject sbhl_record_proper_all_forward_true_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
            sbhl_mark_proper_all_forward_true_nodes(module, node, mt, tv);
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_marking_methods_file() {
        declareFunction(me, "sbhl_premark_goal_nodes", "SBHL-PREMARK-GOAL-NODES", 1, 0, false);
        declareFunction(me, "sbhl_premark_direction", "SBHL-PREMARK-DIRECTION", 1, 0, false);
        declareFunction(me, "sbhl_premark_gather_nodes", "SBHL-PREMARK-GATHER-NODES", 1, 0, false);
        declareFunction(me, "sbhl_gather_premarked_justifications", "SBHL-GATHER-PREMARKED-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "sbhl_mark_all_forward_true_nodes", "SBHL-MARK-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_mark_all_backward_true_nodes", "SBHL-MARK-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_mark_closure_as_marked", "SBHL-MARK-CLOSURE-AS-MARKED", 1, 0, false);
        new sbhl_marking_methods.$sbhl_mark_closure_as_marked$UnaryFunction();
        declareFunction(me, "sbhl_mark_closure_in_space", "SBHL-MARK-CLOSURE-IN-SPACE", 2, 0, false);
        declareFunction(me, "sbhl_mark_forward_true_nodes_in_space", "SBHL-MARK-FORWARD-TRUE-NODES-IN-SPACE", 2, 2, false);
        declareFunction(me, "sbhl_mark_backward_true_nodes_in_space", "SBHL-MARK-BACKWARD-TRUE-NODES-IN-SPACE", 2, 2, false);
        declareFunction(me, "sbhl_mark_proper_all_forward_true_nodes", "SBHL-MARK-PROPER-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_mark_proper_closure_as_marked", "SBHL-MARK-PROPER-CLOSURE-AS-MARKED", 1, 0, false);
        declareFunction(me, "sbhl_unmark_all_marked_forward_true_nodes", "SBHL-UNMARK-ALL-MARKED-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_unmark_all_marked_backward_true_nodes", "SBHL-UNMARK-ALL-MARKED-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_unmark_marked_closure", "SBHL-UNMARK-MARKED-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_unmark_initialized_marked_closure", "SBHL-UNMARK-INITIALIZED-MARKED-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_unmark_proper_marked_closure", "SBHL-UNMARK-PROPER-MARKED-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_unmark_all_backward_true_nodes_and_map", "SBHL-UNMARK-ALL-BACKWARD-TRUE-NODES-AND-MAP", 2, 0, false);
        declareFunction(me, "sbhl_unmark_marked_closure_and_gather", "SBHL-UNMARK-MARKED-CLOSURE-AND-GATHER", 1, 0, false);
        declareFunction(me, "sbhl_unmark_marked_closure_and_gather_if", "SBHL-UNMARK-MARKED-CLOSURE-AND-GATHER-IF", 2, 0, false);
        declareFunction(me, "sbhl_unmark_marked_closure_and_mark_in_space", "SBHL-UNMARK-MARKED-CLOSURE-AND-MARK-IN-SPACE", 2, 0, false);
        declareFunction(me, "sbhl_unmark_marked_closure_and_unmark_in_space", "SBHL-UNMARK-MARKED-CLOSURE-AND-UNMARK-IN-SPACE", 2, 0, false);
        declareFunction(me, "sbhl_mark_cyclic_closure", "SBHL-MARK-CYCLIC-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_unmark_cyclic_closure", "SBHL-UNMARK-CYCLIC-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_mark_max_true_disjoins", "SBHL-MARK-MAX-TRUE-DISJOINS", 2, 2, false);
        declareFunction(me, "sbhl_mark_extremal_disjoins", "SBHL-MARK-EXTREMAL-DISJOINS", 1, 0, false);
        declareFunction(me, "sbhl_unmark_max_true_disjoins", "SBHL-UNMARK-MAX-TRUE-DISJOINS", 2, 2, false);
        declareFunction(me, "sbhl_unmark_extremal_disjoins", "SBHL-UNMARK-EXTREMAL-DISJOINS", 1, 0, false);
        declareFunction(me, "determine_sbhl_mark_between_consider_fn", "DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN", 0, 0, false);
        declareFunction(me, "sbhl_mark_forward_true_nodes_between_and_all_their_inherited_nodes", "SBHL-MARK-FORWARD-TRUE-NODES-BETWEEN-AND-ALL-THEIR-INHERITED-NODES", 3, 2, false);
        declareFunction(me, "sbhl_unmark_marked_closure_and_target_mark_closure", "SBHL-UNMARK-MARKED-CLOSURE-AND-TARGET-MARK-CLOSURE", 1, 0, false);
        declareFunction(me, "sbhl_mark_closure_in_target_space", "SBHL-MARK-CLOSURE-IN-TARGET-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_mark_node_and_instances_in_target_space", "SBHL-MARK-NODE-AND-INSTANCES-IN-TARGET-SPACE", 1, 0, false);
        declareFunction(me, "sbhl_record_closure", "SBHL-RECORD-CLOSURE", 3, 2, false);
        declareFunction(me, "sbhl_record_all_forward_true_nodes", "SBHL-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_record_all_backward_true_nodes", "SBHL-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "sbhl_record_max_true_disjoins", "SBHL-RECORD-MAX-TRUE-DISJOINS", 2, 2, false);
        declareFunction(me, "sbhl_unrecord_max_true_disjoins", "SBHL-UNRECORD-MAX-TRUE-DISJOINS", 2, 2, false);
        declareFunction(me, "sbhl_unrecord_all_recorded_forward_true_nodes", "SBHL-UNRECORD-ALL-RECORDED-FORWARD-TRUE-NODES", 2, 2, false);
        declareFunction(me, "unrecord_all_superiors_as_unsearched_ignore_arg2", "UNRECORD-ALL-SUPERIORS-AS-UNSEARCHED-IGNORE-ARG2", 1, 1, false);
        declareFunction(me, "sbhl_record_node", "SBHL-RECORD-NODE", 1, 1, false);
        declareFunction(me, "sbhl_recorded_node_p", "SBHL-RECORDED-NODE-P", 1, 1, false);
        declareFunction(me, "sbhl_unrecorded_node_p", "SBHL-UNRECORDED-NODE-P", 1, 1, false);
        declareFunction(me, "sbhl_record_proper_all_forward_true_nodes", "SBHL-RECORD-PROPER-ALL-FORWARD-TRUE-NODES", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_sbhl_marking_methods_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_marking_methods_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_marking_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_marking_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_marking_methods_file();
    }

    

    public static final class $sbhl_mark_closure_as_marked$UnaryFunction extends UnaryFunction {
        public $sbhl_mark_closure_as_marked$UnaryFunction() {
            super(extractFunctionNamed("SBHL-MARK-CLOSURE-AS-MARKED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_mark_closure_as_marked(arg1);
        }
    }
}

/**
 * Total time: 1290 ms
 */
