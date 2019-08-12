/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-ABDUCTION
 *  source file: /cyc/top/cycl/sg-abduction.lisp
 *  created:     2019/07/03 17:39:03
 */
public final class sg_abduction extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_abduction() {
    }

    public static final SubLFile me = new sg_abduction();

    public static final String myName = "com.cyc.cycjava.cycl.sg_abduction";

    // // Definitions
    // deflexical
    private static final SubLSymbol $sg_ab_query_node_rank$ = makeSymbol("*SG-AB-QUERY-NODE-RANK*");

    // deflexical
    private static final SubLSymbol $sg_ab_unrefined_node_rank$ = makeSymbol("*SG-AB-UNREFINED-NODE-RANK*");

    public static final SubLObject sg_ab_no_leaves_p(SubLObject leaves) {
        return queues.queue_empty_p(leaves);
    }

    public static final SubLObject sg_ab_next_node(SubLObject leaves) {
        {
            SubLObject next_node = queues.dequeue(leaves);
            SubLObject new_leaves = leaves;
            return values(next_node, new_leaves);
        }
    }

    public static final SubLObject sg_ab_add_node(SubLObject node, SubLObject leaves) {
        {
            SubLObject new_leaves = queues.enqueue(node, leaves);
            return new_leaves;
        }
    }

    /**
     *
     *
     * @return nil ; Likely this kind of abduction will not terminate naturally.
     */
    public static final SubLObject sg_ab_goal_p(SubLObject node) {
        return NIL;
    }

    public static final SubLObject sg_ab_add_goal(SubLObject node, SubLObject goals) {
        return cons(node, goals);
    }

    public static final SubLObject sg_search_node_counters(SubLObject v_search) {
        return getf(search.search_state(v_search), $NODE_COUNTERS, NIL);
    }

    public static final SubLObject sg_ab_add_to_search_node_count(SubLObject v_search, SubLObject entry_label, SubLObject n) {
        {
            SubLObject counters = sg_search_node_counters(v_search);
            SubLObject count = getf(counters, entry_label, ZERO_INTEGER);
            counters = putf(counters, entry_label, add(count, n));
            putf(search.search_state(v_search), $NODE_COUNTERS, counters);
            return NIL;
        }
    }

    public static final SubLObject do_sg_ab_search_node_counters(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_type = NIL;
                    SubLObject count = NIL;
                    SubLObject v_search = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    node_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    count = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    v_search = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_PLIST, list(node_type, count, list(SG_SEARCH_NODE_COUNTERS, v_search)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_ab_display_search_node_counts(SubLObject v_search) {
        sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt5$___10a_10a__, $$$Count, $$$Node_Type));
        {
            SubLObject remainder = NIL;
            for (remainder = sg_search_node_counters(v_search); NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject type = remainder.first();
                    SubLObject count = cadr(remainder);
                    sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt8$_a_______10s__, count, type));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject sg_ab_stop_search_timer(SubLObject v_search) {
        {
            SubLObject state = search.search_state(v_search);
            state = putf(state, $END_TIME, get_internal_run_time());
            search._csetf_search_state(v_search, state);
            return v_search;
        }
    }

    public static final SubLObject sg_ab_seach_elapsed_time(SubLObject v_search) {
        {
            SubLObject start_time = getf(search.search_state(v_search), $START_TIME, ZERO_INTEGER);
            SubLObject end_time = getf(search.search_state(v_search), $END_TIME, ZERO_INTEGER);
            return divide(subtract(end_time, start_time), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
    }

    public static final SubLObject sg_ab_log_error(SubLObject v_search, SubLObject error_list) {
        {
            SubLObject datum = error_list;
            SubLObject current = datum;
            SubLObject mod = NIL;
            SubLObject bind = NIL;
            SubLObject support = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt11);
            mod = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt11);
            bind = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt11);
            support = current.first();
            current = current.rest();
            if (NIL == current) {
                sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt12$Error__Abduction_failed__Module__, new SubLObject[]{ mod, bind, support }));
                {
                    SubLObject sstate = search.search_state(v_search);
                    SubLObject error_log = getf(sstate, $ERROR_LOG, NIL);
                    error_log = append(list(list($ABDUCTION_ERROR, mod, bind, support)), error_log);
                    sstate = putf(sstate, $ERROR_LOG, error_log);
                    search._csetf_search_state(v_search, sstate);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt11);
            }
        }
        return NIL;
    }

    public static final SubLObject sg_ab_node_prop(SubLObject node, SubLObject prop, SubLObject value) {
        if (value == UNPROVIDED) {
            value = NIL;
        }
        return getf(search.snode_state(node), prop, value);
    }

    public static final SubLObject sg_ab_set_node_prop(SubLObject node, SubLObject prop, SubLObject value) {
        return putf(search.snode_state(node), prop, value);
    }

    public static final SubLObject sg_ab_set_state_prop(SubLObject state, SubLObject prop, SubLObject value) {
        {
            SubLObject new_state = putf(state, prop, value);
            return new_state;
        }
    }

    public static final SubLObject sg_ab_remove_state_prop(SubLObject state, SubLObject prop) {
        {
            SubLObject new_state = remf(state, prop);
            return new_state;
        }
    }

    public static final SubLObject sg_ab_node_proposition(SubLObject node) {
        return sg_ab_node_prop(node, $PROPOSITION, UNPROVIDED);
    }

    public static final SubLObject sg_ab_set_state_proposition(SubLObject state, SubLObject proposition) {
        return sg_ab_set_state_prop(state, $PROPOSITION, proposition);
    }

    public static final SubLObject sg_ab_remove_state_proposition(SubLObject state) {
        return sg_ab_remove_state_prop(state, $PROPOSITION);
    }

    public static final SubLObject sg_ab_node_context(SubLObject node) {
        return sg_ab_node_prop(node, $SCENARIO_MT, UNPROVIDED);
    }

    public static final SubLObject sg_ab_set_state_context(SubLObject state, SubLObject mt) {
        return sg_ab_set_state_prop(state, $SCENARIO_MT, mt);
    }

    public static final SubLObject sg_ab_node_type(SubLObject node) {
        return sg_ab_node_prop(node, $TYPE, UNPROVIDED);
    }

    public static final SubLObject sg_ab_set_state_type(SubLObject state, SubLObject type) {
        return sg_ab_set_state_prop(state, $TYPE, type);
    }

    public static final SubLObject sg_ab_set_node_type(SubLObject node, SubLObject type) {
        return sg_ab_set_node_prop(node, $TYPE, type);
    }

    public static final SubLObject sg_ab_node_inference(SubLObject node) {
        return sg_ab_node_prop(node, $INFERENCE, UNPROVIDED);
    }

    public static final SubLObject sg_ab_node_module(SubLObject node) {
        return sg_ab_node_prop(node, $MODULE, UNPROVIDED);
    }

    public static final SubLObject sg_ab_node_hl_supports(SubLObject node) {
        return sg_ab_node_prop(node, $SUPPORTS, UNPROVIDED);
    }

    public static final SubLObject sg_ab_node_el_supports(SubLObject node) {
        {
            SubLObject v_hl_supports = sg_ab_node_hl_supports(node);
            SubLObject el_supports = NIL;
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject supports = NIL;
            for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                el_supports = cons(Mapping.mapcar(CONVERT_HL_SUPPORT_TO_EL_SUPPORT, supports), el_supports);
            }
            return el_supports;
        }
    }

    public static final SubLObject sg_ab_node_situations(SubLObject node) {
        return sg_ab_compute_node_situations(node);
    }

    public static final SubLObject sg_ab_explicit_node_situation(SubLObject node) {
        return sg_ab_node_prop(node, $SITUATION, UNPROVIDED);
    }

    public static final SubLObject sg_ab_set_state_situation(SubLObject state, SubLObject sit) {
        return sg_ab_set_state_prop(state, $SITUATION, sit);
    }

    public static final SubLObject sg_ab_remove_state_situation(SubLObject state) {
        return sg_ab_remove_state_prop(state, $SITUATION);
    }

    public static final SubLObject sg_ab_compute_node_situations(SubLObject node) {
        {
            SubLObject mt = sg_ab_node_context(node);
            SubLObject situations = sg_utilities.sg_util_situations_of_scenario(mt);
            return situations;
        }
    }

    public static final SubLObject sg_ab_node_ttl(SubLObject node) {
        return sg_ab_node_prop(node, $TTL, UNPROVIDED);
    }

    public static final SubLObject sg_ab_dec_node_ttl(SubLObject node) {
        return sg_ab_set_node_prop(node, $TTL, subtract(sg_ab_node_prop(node, $TTL, UNPROVIDED), ONE_INTEGER));
    }

    public static final SubLObject sg_remaining_time(SubLObject start_time, SubLObject time_cut) {
        if (NIL == time_cut) {
            return NIL;
        } else {
            return max(ZERO_INTEGER, subtract(time_cut, subtract(get_internal_run_time(), start_time)));
        }
    }

    /**
     * Return remaining time left in seconds
     *
     * @return integerp
     */
    public static final SubLObject sg_ab_node_remaining_time(SubLObject node) {
        {
            SubLObject v_search = search.snode_search(node);
            SubLObject sstate = search.search_state(v_search);
            SubLObject time_cut = getf(sstate, $MAX_TIME, NIL);
            SubLObject start_time = getf(sstate, $START_TIME, NIL);
            SubLObject remaining_time = sg_remaining_time(start_time, time_cut);
            if (NIL == remaining_time) {
                return NIL;
            } else {
                return floor(divide(remaining_time, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    public static final SubLObject sg_ab_node_resource_limit_reachedP(SubLObject node) {
        {
            SubLObject remaining_time = sg_ab_node_remaining_time(node);
            return remaining_time.isNumber() ? ((SubLObject) (zerop(remaining_time))) : NIL;
        }
    }

    public static final SubLObject sg_ab_node_inference_properties(SubLObject node) {
        {
            SubLObject plist = sg_ab_inference_properties();
            SubLObject time_cutoff = sg_ab_node_remaining_time(node);
            SubLObject node_plist = (NIL != time_cutoff) ? ((SubLObject) (list($MAX_TIME, min(getf(plist, $MAX_TIME, time_cutoff), time_cutoff)))) : NIL;
            SubLObject remainder = NIL;
            for (remainder = node_plist; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject prop = remainder.first();
                    SubLObject value = cadr(remainder);
                    plist = putf(plist, prop, value);
                }
            }
            return plist;
        }
    }

    public static final SubLObject sg_ab_options(SubLObject node) {
        {
            SubLObject type = sg_ab_node_type(node);
            if (type == $RAW) {
                return list($GENERAL_REFINEMENT);
            } else
                if (type == $QUERY) {
                    return list($QUERY);
                } else
                    if (type == $ABDUCTION) {
                        return list($ABDUCTION);
                    } else
                        if (type == $META_EXPANSION) {
                            return sg_modules.sg_mod_meta_expansion_options(node);
                        } else
                            if (type == $REFINED) {
                                return sg_modules.sg_mod_expansion_options(node);
                            }




            return NIL;
        }
    }

    /**
     * Decide how the current NODE should be processed with repsect to OPTION.
     */
    public static final SubLObject sg_ab_expand(SubLObject node, SubLObject option) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_search = search.snode_search(node);
                SubLObject new_nodes = NIL;
                SubLObject error = NIL;
                sg_utilities.sg_trace_int(SIX_INTEGER, format(NIL, $str_alt31$Expanding__A_node__A__, option, node));
                {
                    SubLObject _prev_bind_0 = sg_search.$sg_current_node$.currentBinding(thread);
                    try {
                        sg_search.$sg_current_node$.bind(node, thread);
                        try {
                            {
                                SubLObject pcase_var = option;
                                if (pcase_var.eql($GENERAL_REFINEMENT)) {
                                    new_nodes = sg_modules.sg_mod_apply_all_refinement_modules(node);
                                } else
                                    if (pcase_var.eql($QUERY)) {
                                        new_nodes = sg_modules.sg_mod_query(node);
                                    } else
                                        if (pcase_var.eql($ABDUCTION)) {
                                            new_nodes = sg_ab_abduction(node);
                                        } else {
                                            new_nodes = sg_modules.sg_mod_apply_module(option, node);
                                        }


                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $SG_SEARCH_RESOURCE_EXHAUSTED);
                        }
                    } finally {
                        sg_search.$sg_current_node$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != error) {
                    sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt33$Failing__Resources_exhausted_));
                } else {
                    sg_ab_add_to_search_node_count(v_search, option, length(new_nodes));
                }
                return new_nodes;
            }
        }
    }

    public static final SubLObject sg_ab_new_search_node_state(SubLObject mt) {
        return list($SCENARIO_MT, mt, $INPUT_MT, mt, $SITUATION, NIL, $TYPE, $RAW);
    }

    // deflexical
    private static final SubLSymbol $sg_ab_search_properties$ = makeSymbol("*SG-AB-SEARCH-PROPERTIES*");

    public static final SubLObject sg_ab_default_search_properties() {
        return copy_list($sg_ab_search_properties$.getGlobalValue());
    }

    public static final SubLObject sg_ab_new_search(SubLObject scenario_mt, SubLObject search_properties) {
        {
            SubLObject time = getf(search_properties, $TIME_CUTOFF, UNPROVIDED);
            SubLObject start_time = get_internal_run_time();
            SubLObject time_cut = (time.isNumber()) ? ((SubLObject) (multiply(time_high.$internal_time_units_per_second$.getGlobalValue(), time))) : NIL;
            SubLObject pw = getf(search_properties, $PROCESS_WRAPPER, NIL);
            SubLObject refinement_cutoff = getf(search_properties, $SG_REFINEMENT_CUTOFF, $QUIESCENCE);
            SubLObject refinement_cutoff_iterations_number = getf(search_properties, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, ONE_INTEGER);
            SubLObject search_state = list(new SubLObject[]{ $ERROR_LOG, NIL, $MAX_TIME, time_cut, $START_TIME, start_time, $PROCESS_WRAPPER, pw, $SG_REFINEMENT_CUTOFF, refinement_cutoff, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, refinement_cutoff_iterations_number });
            SubLObject node_state = sg_ab_new_search_node_state(scenario_mt);
            SubLObject v_search = sg_search.new_sg_search(search_state, search_properties);
            if (NIL == getf(search_properties, $SG_INITIAL_REFINEMENT, UNPROVIDED)) {
                sg_utilities.sg_trace_int(SIX_INTEGER, format(NIL, $str_alt42$Skipping_initial_refinement_step_));
                node_state = sg_ab_set_state_type(node_state, $REFINED);
            }
            search.add_search_start_node(v_search, node_state);
            return v_search;
        }
    }

    // defparameter
    public static final SubLSymbol $sg_search$ = makeSymbol("*SG-SEARCH*");

    public static final SubLObject sg_abductive_search(SubLObject scen_mt, SubLObject search_properties) {
        if (search_properties == UNPROVIDED) {
            search_properties = $sg_ab_search_properties$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt43$Starting_scenario_generation_in_m, scen_mt));
            sg_utilities.sg_trace_int(ONE_INTEGER, format(NIL, $str_alt44$__Modules__A__, getf(search_properties, $ACTIVE_MODULES, UNPROVIDED)));
            sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt46$__Skip_initial_refinement__A__, getf(search_properties, $SG_INITIAL_REFINEMENT, UNPROVIDED)));
            sg_utilities.sg_trace_int(FOUR_INTEGER, format(NIL, $str_alt47$__Refinement_cutoff__A__, getf(search_properties, $SG_REFINEMENT_CUTOFF, UNPROVIDED)));
            sg_utilities.sg_trace_int(FOUR_INTEGER, format(NIL, $str_alt48$__Refinement_cutoff_iterations__A, getf(search_properties, $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER, UNPROVIDED)));
            sg_utilities.sg_trace_int(FIVE_INTEGER, format(NIL, $str_alt49$__All_properties__A__, search_properties));
            if (NIL == sg_modules.sg_mod_any_modules_definedP()) {
                sg_modules.sg_mod_import_modules(UNPROVIDED);
            }
            {
                SubLObject v_search = sg_ab_new_search(scen_mt, search_properties);
                SubLObject number = NIL;
                SubLObject depth = NIL;
                SubLObject time = getf(search_properties, $TIME_CUTOFF, UNPROVIDED);
                SubLObject reason = NIL;
                inference_metrics.reset_inference_metrics();
                {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
                            sg_utilities.sg_util_create_collector_mt(scen_mt);
                            reason = search.generic_search(v_search, number, time, depth);
                            $sg_search$.setDynamicValue(v_search, thread);
                            if ((sg_utilities.$sg_trace$.getDynamicValue(thread) == T) || (sg_utilities.$sg_trace$.getDynamicValue(thread).isInteger() && sg_utilities.$sg_trace$.getDynamicValue(thread).numG(ZERO_INTEGER))) {
                                sg_ab_handle_search_halt(v_search, reason);
                                inference_metrics.show_inference_metrics(UNPROVIDED);
                            }
                        } finally {
                            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject sg_ab_handle_search_halt(SubLObject v_search, SubLObject reason) {
        v_search = sg_ab_stop_search_timer(v_search);
        {
            SubLObject pcase_var = reason;
            if (pcase_var.eql($ABORT)) {
                sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt51$Search_aborted_));
            } else
                if (pcase_var.eql($INTERRUPT)) {
                    sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt53$Search_interrupted_));
                } else
                    if (pcase_var.eql($NUMBER)) {
                        sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt55$Number_cutoff_reached_));
                    } else
                        if (pcase_var.eql($TIME)) {
                            sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt57$Time_cutoff_reached_));
                        } else
                            if (pcase_var.eql($EXHAUST)) {
                                sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt59$Search_exhausted_));
                            } else {
                                sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt60$I_don_t_know_why_search_stopped_));
                            }




        }
        sg_ab_display_search_node_counts(v_search);
        sg_utilities.sg_trace_int(ZERO_INTEGER, format(NIL, $str_alt61$__Total_time___11_2f, sg_ab_seach_elapsed_time(v_search)));
        return NIL;
    }

    public static final SubLObject sg_ab_create_node(SubLObject node, SubLObject mt) {
        {
            SubLObject new_state = copy_list(search.snode_state(node));
            SubLObject new_node = NIL;
            new_state = sg_ab_set_state_context(new_state, mt);
            new_state = sg_ab_set_state_type(new_state, $REFINED);
            new_node = search.new_search_node(new_state);
            return new_node;
        }
    }

    public static final SubLObject sg_ab_create_raw_node(SubLObject node, SubLObject mt) {
        {
            SubLObject new_node = sg_ab_create_node(node, mt);
            SubLObject state = search.snode_state(new_node);
            search._csetf_snode_state(new_node, sg_ab_set_state_type(state, $RAW));
            return new_node;
        }
    }

    public static final SubLObject sg_ab_create_refined_node(SubLObject node, SubLObject mt) {
        {
            SubLObject new_node = sg_ab_create_node(node, mt);
            SubLObject state = search.snode_state(new_node);
            search._csetf_snode_state(new_node, sg_ab_set_state_type(state, $REFINED));
            return new_node;
        }
    }

    public static final SubLObject sg_ab_create_meta_expansion_node(SubLObject node) {
        {
            SubLObject mt = sg_ab_node_context(node);
            SubLObject new_node = sg_ab_create_node(node, mt);
            SubLObject state = search.snode_state(new_node);
            search._csetf_snode_state(new_node, sg_ab_set_state_type(state, $META_EXPANSION));
            search._csetf_snode_state(new_node, sg_ab_set_state_prop(state, $TTL, TWO_INTEGER));
            return new_node;
        }
    }

    public static final SubLObject sg_ab_create_abduction_node(SubLObject node, SubLObject mt, SubLObject formula, SubLObject supports) {
        SubLTrampolineFile.checkType(formula, POSSIBLY_SENTENCE_P);
        {
            SubLObject new_node = sg_ab_create_node(node, mt);
            SubLObject state = search.snode_state(new_node);
            search._csetf_snode_state(new_node, sg_ab_set_state_proposition(state, formula));
            search._csetf_snode_state(new_node, sg_ab_set_state_type(state, $ABDUCTION));
            search._csetf_snode_state(new_node, sg_ab_set_state_prop(state, $SUPPORTS, supports));
            return new_node;
        }
    }

    public static final SubLObject sg_ab_create_query_node(SubLObject node, SubLObject mt, SubLObject module, SubLObject inference) {
        {
            SubLObject new_node = sg_ab_create_node(node, mt);
            SubLObject state = search.snode_state(new_node);
            search._csetf_snode_state(new_node, sg_ab_set_state_type(state, $QUERY));
            search._csetf_snode_state(new_node, sg_ab_set_state_prop(state, $MODULE, module));
            search._csetf_snode_state(new_node, sg_ab_set_state_prop(state, $INFERENCE, inference));
            return new_node;
        }
    }

    /**
     *
     *
     * @return listp ;; the scenario contexts from which the new abduction context
    must specialize.
     */
    public static final SubLObject sg_ab_find_superior_mts_for_abduction(SubLObject supports_list) {
        {
            SubLObject mts = NIL;
            SubLObject cdolist_list_var = supports_list;
            SubLObject supports = NIL;
            for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = supports;
                    SubLObject support = NIL;
                    for (support = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , support = cdolist_list_var_1.first()) {
                        if (NIL != arguments.hl_support_p(support)) {
                            if (arguments.support_module(support) != $OPAQUE) {
                                mts = sg_ab_hl_support_mts_for_abduction(support, mts);
                            }
                        } else {
                            {
                                SubLObject item_var = arguments.support_mt(support);
                                if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    mts = cons(item_var, mts);
                                }
                            }
                        }
                    }
                }
            }
            mts = list_utilities.remove_if_not(SG_SCENARIO_CONTEXT_P, mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return mts;
        }
    }

    public static final SubLObject sg_ab_hl_support_mts_for_abduction(SubLObject hl_support, SubLObject mts) {
        {
            SubLObject supports = hl_supports.hl_justify(hl_support);
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                {
                    SubLObject item_var = arguments.support_mt(support);
                    if (NIL == member(item_var, mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                        mts = cons(item_var, mts);
                    }
                }
            }
            return mts;
        }
    }

    public static final SubLObject sg_ab_abduction(SubLObject node) {
        {
            SubLObject hyp_formula = sg_ab_node_proposition(node);
            SubLObject mt = sg_ab_node_context(node);
            SubLObject hl_support_list = sg_ab_node_hl_supports(node);
            SubLObject el_support_list = sg_ab_node_el_supports(node);
            SubLObject mts = sg_ab_find_superior_mts_for_abduction(hl_support_list);
            SubLObject free_varsP = el_utilities.sentence_free_variables(hyp_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject collector_mt = sg_utilities.sg_util_collector_mt(mt);
            SubLObject new_mt = sg_utilities.sg_util_new_scenario_context(mts, collector_mt);
            SubLObject error = NIL;
            SubLObject new_nodes = NIL;
            SubLTrampolineFile.checkType(hyp_formula, POSSIBLY_SENTENCE_P);
            try {
                if (NIL != free_varsP) {
                    {
                        SubLObject hyp_binding = sg_utilities.sg_ab_hypothesize_formula(hyp_formula, new_mt);
                        if (NIL != hyp_binding) {
                            {
                                SubLObject assert_formula = sublis(hyp_binding, hyp_formula, UNPROVIDED, UNPROVIDED);
                                SubLObject cdolist_list_var = el_support_list;
                                SubLObject supports = NIL;
                                for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                                    if (NIL == sg_utilities.sg_util_add_abduction_arguments(assert_formula, supports, new_mt)) {
                                        cyc_kernel.cyc_kill(new_mt);
                                        new_mt = NIL;
                                        sublisp_throw($SG_ABDUCTION_ERROR, list(mt, hyp_formula, supports));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = el_support_list;
                        SubLObject supports = NIL;
                        for (supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supports = cdolist_list_var.first()) {
                            if (NIL == sg_utilities.sg_util_add_abduction_arguments(hyp_formula, supports, new_mt)) {
                                cyc_kernel.cyc_kill(new_mt);
                                new_mt = NIL;
                                sublisp_throw($SG_ABDUCTION_ERROR, list(mt, hyp_formula, supports));
                            }
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $SG_ABDUCTION_ERROR);
            }
            if (NIL != error) {
                sg_ab_log_error(search.snode_search(node), error);
            } else {
                if (NIL != new_mt) {
                    new_nodes = cons(sg_ab_create_raw_node(node, new_mt), new_nodes);
                }
            }
            return new_nodes;
        }
    }

    public static final SubLObject sg_ab_rank_nodes(SubLObject node1, SubLObject node2) {
        return numG(sg_ab_node_value(node1), sg_ab_node_value(node2));
    }

    public static final SubLObject sg_ab_node_value(SubLObject node) {
        {
            SubLObject node_type = sg_ab_node_type(node);
            if (node_type == $QUERY) {
                return $sg_ab_query_node_rank$.getGlobalValue();
            } else
                if (node_type == $ABDUCTION) {
                    return sg_term_rank.sg_tr_formula_utility(sg_ab_node_proposition(node));
                } else {
                    return $sg_ab_unrefined_node_rank$.getGlobalValue();
                }

        }
    }

    public static final SubLObject sg_ab_inference_properties() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list(new SubLObject[]{ $kw66$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $EL, $ALLOWED_RULES, $ALL, $RETURN, $BINDINGS_AND_SUPPORTS, $RESULT_UNIQUENESS, $BINDINGS, $kw75$ALLOW_HL_PREDICATE_TRANSFORMATION_, NIL, $kw76$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, NIL, $kw77$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, NIL, $PRODUCTIVITY_LIMIT, $int$2000000, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $ALL, $kw81$NEGATION_BY_FAILURE_, NIL, $CONTINUABLE_, T, $BROWSABLE_, sg_utilities.$sg_browse_forward_inferencesP$.getDynamicValue(thread), $MAX_NUMBER, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $MAX_TIME, $int$30 });
        }
    }

    public static final SubLObject sg_ab_log_inference_for_browsing(SubLObject inference, SubLObject node) {
        {
            SubLObject v_search = search.snode_search(node);
            SubLObject pw = getf(search.search_state(v_search), $PROCESS_WRAPPER, NIL);
            if (NIL != pw) {
                {
                    SubLObject inference_queue = process_utilities.process_wrapper_get_property(pw, $INFERENCE_LOG, UNPROVIDED);
                    if (NIL != inference_queue) {
                        queues.enqueue(inference, inference_queue);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject sg_ab_find_rules_concluding_causes_sit_prop(SubLObject prop, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hyp_forms = NIL;
                SubLObject rules = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        rules = kb_mapping.gather_predicate_rule_index($$causes_SitProp, $POS, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != el_utilities.el_conjunction_p(prop)) {
                    {
                        SubLObject cdolist_list_var = cycl_utilities.formula_args(prop, UNPROVIDED);
                        SubLObject cur_lit = NIL;
                        for (cur_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_lit = cdolist_list_var.first()) {
                            {
                                SubLObject cdolist_list_var_2 = Mapping.mapcar(ASSERTION_FORMULA, rules);
                                SubLObject cur_form = NIL;
                                for (cur_form = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , cur_form = cdolist_list_var_2.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject matchP = formula_pattern_match.pattern_matches_formula($list_alt91, cur_form);
                                        SubLObject v_bindings = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != matchP) {
                                            {
                                                SubLObject unifier = pairlis(cycl_utilities.formula_args(sublis(v_bindings, HYP_LIT, UNPROVIDED, UNPROVIDED), UNPROVIDED), cycl_utilities.formula_args(cur_lit, UNPROVIDED), UNPROVIDED);
                                                SubLObject hyp_form = sublis(unifier, sublis(v_bindings, HYP_FORM, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                hyp_forms = cons(subst(sublis(v_bindings, HYP_VAR, UNPROVIDED, UNPROVIDED), $sym95$_SIT, hyp_form, UNPROVIDED, UNPROVIDED), hyp_forms);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return hyp_forms;
            }
        }
    }

    /**
     *
     *
     * @param BINDING-LIST
     * 		binding-list-p
     * @param VARIABLE
     * 		el-var?
     * @return binding-list-p ;; filter out bindings that are
    for derived terms via functions like #$RelationAllExistsFn.
     * @unknown (FILTER-BINDING-LIST-FOR-PREFERRED-TERMS-TEST SG-AB-TEST-CASE)
     */
    public static final SubLObject sg_ab_filter_binding_list_for_preferred_terms(SubLObject binding_list, SubLObject variable) {
        {
            SubLObject var_bindings = NIL;
            SubLObject new_binding_list = NIL;
            {
                SubLObject cdolist_list_var = binding_list;
                SubLObject cur_binding = NIL;
                for (cur_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_binding = cdolist_list_var.first()) {
                    var_bindings = cons(sublis(cur_binding, variable, UNPROVIDED, UNPROVIDED), var_bindings);
                }
            }
            var_bindings = nreverse(var_bindings);
            {
                SubLObject list_var = NIL;
                SubLObject cur_binding = NIL;
                SubLObject n = NIL;
                for (list_var = var_bindings, cur_binding = list_var.first(), n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cur_binding = list_var.first() , n = add(ONE_INTEGER, n)) {
                    if (NIL != constant_handles.constant_p(cur_binding)) {
                        new_binding_list = cons(nth(n, binding_list), new_binding_list);
                    }
                }
            }
            if (NIL != new_binding_list) {
                return nreverse(new_binding_list);
            } else {
                return binding_list;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_sg_ab_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sg_ab_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject sg_ab_test_case_p(SubLObject sg_ab_test_case) {
        return classes.subloop_instanceof_class(sg_ab_test_case, SG_AB_TEST_CASE);
    }

    public static final SubLObject declare_sg_abduction_file() {
        declareFunction("sg_ab_no_leaves_p", "SG-AB-NO-LEAVES-P", 1, 0, false);
        declareFunction("sg_ab_next_node", "SG-AB-NEXT-NODE", 1, 0, false);
        declareFunction("sg_ab_add_node", "SG-AB-ADD-NODE", 2, 0, false);
        declareFunction("sg_ab_goal_p", "SG-AB-GOAL-P", 1, 0, false);
        declareFunction("sg_ab_add_goal", "SG-AB-ADD-GOAL", 2, 0, false);
        declareFunction("sg_search_node_counters", "SG-SEARCH-NODE-COUNTERS", 1, 0, false);
        declareFunction("sg_ab_add_to_search_node_count", "SG-AB-ADD-TO-SEARCH-NODE-COUNT", 3, 0, false);
        declareMacro("do_sg_ab_search_node_counters", "DO-SG-AB-SEARCH-NODE-COUNTERS");
        declareFunction("sg_ab_display_search_node_counts", "SG-AB-DISPLAY-SEARCH-NODE-COUNTS", 1, 0, false);
        declareFunction("sg_ab_stop_search_timer", "SG-AB-STOP-SEARCH-TIMER", 1, 0, false);
        declareFunction("sg_ab_seach_elapsed_time", "SG-AB-SEACH-ELAPSED-TIME", 1, 0, false);
        declareFunction("sg_ab_log_error", "SG-AB-LOG-ERROR", 2, 0, false);
        declareFunction("sg_ab_node_prop", "SG-AB-NODE-PROP", 2, 1, false);
        declareFunction("sg_ab_set_node_prop", "SG-AB-SET-NODE-PROP", 3, 0, false);
        declareFunction("sg_ab_set_state_prop", "SG-AB-SET-STATE-PROP", 3, 0, false);
        declareFunction("sg_ab_remove_state_prop", "SG-AB-REMOVE-STATE-PROP", 2, 0, false);
        declareFunction("sg_ab_node_proposition", "SG-AB-NODE-PROPOSITION", 1, 0, false);
        declareFunction("sg_ab_set_state_proposition", "SG-AB-SET-STATE-PROPOSITION", 2, 0, false);
        declareFunction("sg_ab_remove_state_proposition", "SG-AB-REMOVE-STATE-PROPOSITION", 1, 0, false);
        declareFunction("sg_ab_node_context", "SG-AB-NODE-CONTEXT", 1, 0, false);
        declareFunction("sg_ab_set_state_context", "SG-AB-SET-STATE-CONTEXT", 2, 0, false);
        declareFunction("sg_ab_node_type", "SG-AB-NODE-TYPE", 1, 0, false);
        declareFunction("sg_ab_set_state_type", "SG-AB-SET-STATE-TYPE", 2, 0, false);
        declareFunction("sg_ab_set_node_type", "SG-AB-SET-NODE-TYPE", 2, 0, false);
        declareFunction("sg_ab_node_inference", "SG-AB-NODE-INFERENCE", 1, 0, false);
        declareFunction("sg_ab_node_module", "SG-AB-NODE-MODULE", 1, 0, false);
        declareFunction("sg_ab_node_hl_supports", "SG-AB-NODE-HL-SUPPORTS", 1, 0, false);
        declareFunction("sg_ab_node_el_supports", "SG-AB-NODE-EL-SUPPORTS", 1, 0, false);
        declareFunction("sg_ab_node_situations", "SG-AB-NODE-SITUATIONS", 1, 0, false);
        declareFunction("sg_ab_explicit_node_situation", "SG-AB-EXPLICIT-NODE-SITUATION", 1, 0, false);
        declareFunction("sg_ab_set_state_situation", "SG-AB-SET-STATE-SITUATION", 2, 0, false);
        declareFunction("sg_ab_remove_state_situation", "SG-AB-REMOVE-STATE-SITUATION", 1, 0, false);
        declareFunction("sg_ab_compute_node_situations", "SG-AB-COMPUTE-NODE-SITUATIONS", 1, 0, false);
        declareFunction("sg_ab_node_ttl", "SG-AB-NODE-TTL", 1, 0, false);
        declareFunction("sg_ab_dec_node_ttl", "SG-AB-DEC-NODE-TTL", 1, 0, false);
        declareFunction("sg_remaining_time", "SG-REMAINING-TIME", 2, 0, false);
        declareFunction("sg_ab_node_remaining_time", "SG-AB-NODE-REMAINING-TIME", 1, 0, false);
        declareFunction("sg_ab_node_resource_limit_reachedP", "SG-AB-NODE-RESOURCE-LIMIT-REACHED?", 1, 0, false);
        declareFunction("sg_ab_node_inference_properties", "SG-AB-NODE-INFERENCE-PROPERTIES", 1, 0, false);
        declareFunction("sg_ab_options", "SG-AB-OPTIONS", 1, 0, false);
        declareFunction("sg_ab_expand", "SG-AB-EXPAND", 2, 0, false);
        declareFunction("sg_ab_new_search_node_state", "SG-AB-NEW-SEARCH-NODE-STATE", 1, 0, false);
        declareFunction("sg_ab_default_search_properties", "SG-AB-DEFAULT-SEARCH-PROPERTIES", 0, 0, false);
        declareFunction("sg_ab_new_search", "SG-AB-NEW-SEARCH", 2, 0, false);
        declareFunction("sg_abductive_search", "SG-ABDUCTIVE-SEARCH", 1, 1, false);
        declareFunction("sg_ab_handle_search_halt", "SG-AB-HANDLE-SEARCH-HALT", 2, 0, false);
        declareFunction("sg_ab_create_node", "SG-AB-CREATE-NODE", 2, 0, false);
        declareFunction("sg_ab_create_raw_node", "SG-AB-CREATE-RAW-NODE", 2, 0, false);
        declareFunction("sg_ab_create_refined_node", "SG-AB-CREATE-REFINED-NODE", 2, 0, false);
        declareFunction("sg_ab_create_meta_expansion_node", "SG-AB-CREATE-META-EXPANSION-NODE", 1, 0, false);
        declareFunction("sg_ab_create_abduction_node", "SG-AB-CREATE-ABDUCTION-NODE", 4, 0, false);
        declareFunction("sg_ab_create_query_node", "SG-AB-CREATE-QUERY-NODE", 4, 0, false);
        declareFunction("sg_ab_find_superior_mts_for_abduction", "SG-AB-FIND-SUPERIOR-MTS-FOR-ABDUCTION", 1, 0, false);
        declareFunction("sg_ab_hl_support_mts_for_abduction", "SG-AB-HL-SUPPORT-MTS-FOR-ABDUCTION", 2, 0, false);
        declareFunction("sg_ab_abduction", "SG-AB-ABDUCTION", 1, 0, false);
        declareFunction("sg_ab_rank_nodes", "SG-AB-RANK-NODES", 2, 0, false);
        declareFunction("sg_ab_node_value", "SG-AB-NODE-VALUE", 1, 0, false);
        declareFunction("sg_ab_inference_properties", "SG-AB-INFERENCE-PROPERTIES", 0, 0, false);
        declareFunction("sg_ab_log_inference_for_browsing", "SG-AB-LOG-INFERENCE-FOR-BROWSING", 2, 0, false);
        declareFunction("sg_ab_find_rules_concluding_causes_sit_prop", "SG-AB-FIND-RULES-CONCLUDING-CAUSES-SIT-PROP", 2, 0, false);
        declareFunction("sg_ab_filter_binding_list_for_preferred_terms", "SG-AB-FILTER-BINDING-LIST-FOR-PREFERRED-TERMS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sg_ab_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-SG-AB-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sg_ab_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-SG-AB-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("sg_ab_test_case_p", "SG-AB-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_abduction_file() {
        deflexical("*SG-AB-QUERY-NODE-RANK*", $float$0_5);
        deflexical("*SG-AB-UNREFINED-NODE-RANK*", TWO_INTEGER);
        deflexical("*SG-AB-SEARCH-PROPERTIES*", $list_alt35);
        defparameter("*SG-SEARCH*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sg_abduction_file() {
                sunit_external.define_test_category($str_alt97$sg_abduction_test_category, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(SG_AB_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(SG_AB_TEST_CASE);
        classes.subloop_new_class(SG_AB_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt100);
        classes.class_set_implements_slot_listeners(SG_AB_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(SG_AB_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SG_AB_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(SG_AB_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_SG_AB_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_sg_ab_test_case_class(SG_AB_TEST_CASE);
        sunit_macros.define_test_case_postamble(SG_AB_TEST_CASE, $str_alt115$sg_abduction, $$$cycl, $list_alt117);
        sunit_macros.def_test_method_register(SG_AB_TEST_CASE, NODE_TEST);
        sunit_macros.def_test_method_register(SG_AB_TEST_CASE, FILTER_BINDING_LIST_FOR_PREFERRED_TERMS_TEST);
        return NIL;
    }

    // // Internal Constants
    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol $NODE_COUNTERS = makeKeyword("NODE-COUNTERS");

    static private final SubLList $list_alt2 = list(list(makeSymbol("NODE-TYPE"), makeSymbol("COUNT"), makeSymbol("SEARCH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_PLIST = makeSymbol("DO-PLIST");

    private static final SubLSymbol SG_SEARCH_NODE_COUNTERS = makeSymbol("SG-SEARCH-NODE-COUNTERS");

    static private final SubLString $str_alt5$___10a_10a__ = makeString("~%~10a~10a~%");

    static private final SubLString $$$Count = makeString("Count");

    static private final SubLString $$$Node_Type = makeString("Node Type");

    static private final SubLString $str_alt8$_a_______10s__ = makeString("~a      ~10s~%");





    static private final SubLList $list_alt11 = list(makeSymbol("MOD"), makeSymbol("BIND"), makeSymbol("SUPPORT"));

    static private final SubLString $str_alt12$Error__Abduction_failed__Module__ = makeString("Error: Abduction failed~%Module: ~A~%Bindings: ~A~%Supports: ~A~%");

    private static final SubLSymbol $ERROR_LOG = makeKeyword("ERROR-LOG");

    private static final SubLSymbol $ABDUCTION_ERROR = makeKeyword("ABDUCTION-ERROR");

    private static final SubLSymbol $PROPOSITION = makeKeyword("PROPOSITION");

    private static final SubLSymbol $SCENARIO_MT = makeKeyword("SCENARIO-MT");









    private static final SubLSymbol CONVERT_HL_SUPPORT_TO_EL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-EL-SUPPORT");

    private static final SubLSymbol $SITUATION = makeKeyword("SITUATION");

    private static final SubLSymbol $TTL = makeKeyword("TTL");





    private static final SubLSymbol $GENERAL_REFINEMENT = makeKeyword("GENERAL-REFINEMENT");





    private static final SubLSymbol $META_EXPANSION = makeKeyword("META-EXPANSION");

    private static final SubLSymbol $REFINED = makeKeyword("REFINED");

    static private final SubLString $str_alt31$Expanding__A_node__A__ = makeString("Expanding ~A node ~A~%");

    private static final SubLSymbol $SG_SEARCH_RESOURCE_EXHAUSTED = makeKeyword("SG-SEARCH-RESOURCE-EXHAUSTED");

    static private final SubLString $str_alt33$Failing__Resources_exhausted_ = makeString("Failing: Resources exhausted.");



    static private final SubLList $list_alt35 = list(new SubLObject[]{ makeKeyword("SEARCH-TYPE"), makeKeyword("BREADTH-FIRST"), makeKeyword("EXPAND-FUNCTION"), makeSymbol("SG-AB-EXPAND"), makeKeyword("OPTIONS-FUNCTION"), makeSymbol("SG-AB-OPTIONS"), makeKeyword("GOAL-FUNCTION"), makeSymbol("FALSE"), makeKeyword("DEPTH-EXCEDED-FUNCTION"), makeSymbol("FALSE"), makeKeyword("RANKING-FUNCTION"), makeSymbol("SG-AB-NODE-VALUE") });



    private static final SubLSymbol $PROCESS_WRAPPER = makeKeyword("PROCESS-WRAPPER");

    private static final SubLSymbol $SG_REFINEMENT_CUTOFF = makeKeyword("SG-REFINEMENT-CUTOFF");



    private static final SubLSymbol $SG_REFINEMENT_CUTOFF_ITERATIONS_NUMBER = makeKeyword("SG-REFINEMENT-CUTOFF-ITERATIONS-NUMBER");

    private static final SubLSymbol $SG_INITIAL_REFINEMENT = makeKeyword("SG-INITIAL-REFINEMENT");

    static private final SubLString $str_alt42$Skipping_initial_refinement_step_ = makeString("Skipping initial refinement step.");

    static private final SubLString $str_alt43$Starting_scenario_generation_in_m = makeString("Starting scenario generation in mt ~A");

    static private final SubLString $str_alt44$__Modules__A__ = makeString("  Modules=~A~%");



    static private final SubLString $str_alt46$__Skip_initial_refinement__A__ = makeString("  Skip initial refinement=~A~%");

    static private final SubLString $str_alt47$__Refinement_cutoff__A__ = makeString("  Refinement cutoff=~A~%");

    static private final SubLString $str_alt48$__Refinement_cutoff_iterations__A = makeString("  Refinement cutoff iterations=~A~%");

    static private final SubLString $str_alt49$__All_properties__A__ = makeString("  All properties=~A~%");



    static private final SubLString $str_alt51$Search_aborted_ = makeString("Search aborted.");



    static private final SubLString $str_alt53$Search_interrupted_ = makeString("Search interrupted.");



    static private final SubLString $str_alt55$Number_cutoff_reached_ = makeString("Number cutoff reached.");



    static private final SubLString $str_alt57$Time_cutoff_reached_ = makeString("Time cutoff reached.");



    static private final SubLString $str_alt59$Search_exhausted_ = makeString("Search exhausted.");

    static private final SubLString $str_alt60$I_don_t_know_why_search_stopped_ = makeString("I don't know why search stopped.");

    static private final SubLString $str_alt61$__Total_time___11_2f = makeString("~%Total time: ~11,2f");





    private static final SubLSymbol SG_SCENARIO_CONTEXT_P = makeSymbol("SG-SCENARIO-CONTEXT-P");

    private static final SubLSymbol $SG_ABDUCTION_ERROR = makeKeyword("SG-ABDUCTION-ERROR");

    public static final SubLSymbol $kw66$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");











    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");





    public static final SubLSymbol $kw75$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw76$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    public static final SubLSymbol $kw77$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");



    public static final SubLInteger $int$2000000 = makeInteger(2000000);

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    public static final SubLSymbol $kw81$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");







    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    public static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol $INFERENCE_LOG = makeKeyword("INFERENCE-LOG");



    public static final SubLObject $$causes_SitProp = constant_handles.reader_make_constant_shell(makeString("causes-SitProp"));



    static private final SubLList $list_alt91 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list($BIND, makeSymbol("HYP-FORM")), list(constant_handles.reader_make_constant_shell(makeString("causes-SitProp")), list(makeKeyword("AND"), makeKeyword("VARIABLE"), list($BIND, makeSymbol("HYP-VAR"))), list($BIND, makeSymbol("HYP-LIT"))));

    private static final SubLSymbol HYP_LIT = makeSymbol("HYP-LIT");

    private static final SubLSymbol HYP_FORM = makeSymbol("HYP-FORM");

    private static final SubLSymbol HYP_VAR = makeSymbol("HYP-VAR");

    static private final SubLSymbol $sym95$_SIT = makeSymbol("?SIT");



    static private final SubLString $str_alt97$sg_abduction_test_category = makeString("sg-abduction-test-category");

    private static final SubLSymbol SG_AB_TEST_CASE = makeSymbol("SG-AB-TEST-CASE");



    static private final SubLList $list_alt100 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NODE-TEST"), NIL, makeKeyword("PROTECTED")));

















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SG_AB_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-AB-TEST-CASE-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SG_AB_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SG-AB-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt115$sg_abduction = makeString("sg-abduction");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt117 = list(makeString("sg-abduction-test-category"));

    private static final SubLSymbol NODE_TEST = makeSymbol("NODE-TEST");

    private static final SubLSymbol FILTER_BINDING_LIST_FOR_PREFERRED_TERMS_TEST = makeSymbol("FILTER-BINDING-LIST-FOR-PREFERRED-TERMS-TEST");

    // // Initializers
    public void declareFunctions() {
        declare_sg_abduction_file();
    }

    public void initializeVariables() {
        init_sg_abduction_file();
    }

    public void runTopLevelForms() {
        setup_sg_abduction_file();
    }
}

