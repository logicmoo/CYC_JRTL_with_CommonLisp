/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_implies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SG-TRACER
 *  source file: /cyc/top/cycl/sg-tracer.lisp
 *  created:     2019/07/03 17:39:04
 */
public final class sg_tracer extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sg_tracer() {
    }

    public static final SubLFile me = new sg_tracer();


    // // Definitions
    // deflexical
    private static final SubLSymbol $sg_tracer_seed_mt$ = makeSymbol("*SG-TRACER-SEED-MT*");

    // deflexical
    private static final SubLSymbol $sg_tracer_goal_mt$ = makeSymbol("*SG-TRACER-GOAL-MT*");

    // deflexical
    private static final SubLSymbol $sg_tracer_goal_term_collection$ = makeSymbol("*SG-TRACER-GOAL-TERM-COLLECTION*");

    /**
     *
     *
     * @unknown eliminate the commented-out modules on purpose rather than by fiat
     */
    // deflexical
    private static final SubLSymbol $sg_temporal_ordering_modules$ = makeSymbol("*SG-TEMPORAL-ORDERING-MODULES*");

    // deflexical
    private static final SubLSymbol $sg_inheritXequiv_modules$ = makeSymbol("*SG-INHERIT/EQUIV-MODULES*");

    /**
     * We don't care about these terms when they appear inside a skolem.  Kill those skolems.  The story for this is that we can know these are unobservable or too high up in the ontology.
     */
    // deflexical
    private static final SubLSymbol $sg_tracer_skolem_prune_indicator_constants$ = makeSymbol("*SG-TRACER-SKOLEM-PRUNE-INDICATOR-CONSTANTS*");

    /**
     * Forward propagates a bunch of stuff from *sg-tracer-seed-mt* into *sg-tracer-seed-mt*.
     */
    public static final SubLObject sg_tracer() {
        return sg_tracer_int(T);
    }

    /**
     * Forward propagates a bunch of stuff from *sg-tracer-seed-mt* into *sg-tracer-seed-mt*.
     */
    public static final SubLObject sg_tracer_kmg() {
        return sg_tracer_int(NIL);
    }

    public static final SubLObject sg_tracer_int(SubLObject infer_typed_spec_predsP) {
        possibly_initialize_sg_modules();
        sg_tracer_cleanup();
        sg_util_forward_propagate_using_module($$ProperSubSituationTypesRefinement);
        sg_tracer_prune();
        if (NIL != infer_typed_spec_predsP) {
            sg_tracer_infer_typed_spec_preds();
        }
        sg_tracer_abduce_using_module($const7$WHAT_IFCandidateProperSubSituatio);
        sg_tracer_prune();
        {
            SubLObject cdolist_list_var = $sg_temporal_ordering_modules$.getGlobalValue();
            SubLObject module = NIL;
            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                sg_util_forward_propagate_using_modules(list(module));
            }
        }
        sg_tracer_prune();
        return sg_tracer_score();
    }

    public static final SubLObject sg_util_forward_propagate_using_module(SubLObject module) {
        {
            SubLObject assertions = sg_modules.sg_mod_module_assertions(module);
            SubLObject v_properties = sg_modules.sg_mod_raw_inference_properties(module);
            return sg_tracer_forward_propagate_assertions(assertions, v_properties);
        }
    }

    public static final SubLObject sg_util_forward_propagate_using_modules(SubLObject v_modules) {
        {
            SubLObject assertions = Mapping.mapcan(SG_MOD_MODULE_ASSERTIONS_COPY, v_modules, EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject v_properties = sg_modules.sg_mod_raw_inference_properties(v_modules.first());
            return sg_tracer_forward_propagate_assertions(assertions, v_properties);
        }
    }

    public static final SubLObject sg_tracer_forward_propagate_assertions(SubLObject assertions, SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                    try {
                        utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
                        try {
                            result = sg_utilities.sg_util_forward_propagate_assertions(assertions, $sg_tracer_seed_mt$.getGlobalValue(), v_properties);
                        } finally {
                            {
                                SubLObject _prev_bind_0_1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    forward.clear_current_forward_problem_store();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject sg_mod_module_assertions_copy(SubLObject module) {
        return copy_list(sg_modules.sg_mod_module_assertions(module));
    }

    // deflexical
    private static final SubLSymbol $typed_spec_preds_rule_sentence$ = makeSymbol("*TYPED-SPEC-PREDS-RULE-SENTENCE*");

    // deflexical
    private static final SubLSymbol $typed_spec_preds_rule$ = makeSymbol("*TYPED-SPEC-PREDS-RULE*");

    public static final SubLObject typed_spec_preds_rule() {
        if (NIL != misc_utilities.uninitialized_p($typed_spec_preds_rule$.getGlobalValue())) {
            {
                SubLObject rule = czer_meta.find_assertion_cycl($typed_spec_preds_rule_sentence$.getGlobalValue(), UNPROVIDED);
                SubLTrampolineFile.checkType(rule, ASSERTION_P);
                $typed_spec_preds_rule$.setGlobalValue(rule);
            }
        }
        return $typed_spec_preds_rule$.getGlobalValue();
    }

    // deflexical
    private static final SubLSymbol $focused_typed_spec_preds_rule_sentence$ = makeSymbol("*FOCUSED-TYPED-SPEC-PREDS-RULE-SENTENCE*");

    public static final SubLObject sg_tracer_infer_typed_spec_preds() {
        sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt20$Inferring_typed_specPreds__));
        cyc_kernel.cyc_assert($list_alt21, $$BaseKB, UNPROVIDED);
        cyc_kernel.cyc_assert($focused_typed_spec_preds_rule_sentence$.getGlobalValue(), $sg_tracer_seed_mt$.getGlobalValue(), $list_alt23);
        return NIL;
    }

    public static final SubLObject sg_tracer_skolem_prune_indicator_constantP(SubLObject v_term) {
        return list_utilities.member_eqP(v_term, $sg_tracer_skolem_prune_indicator_constants$.getGlobalValue());
    }

    public static final SubLObject sg_tracer_skolem_prune_nartP(SubLObject v_term) {
        return makeBoolean((NIL != term.skolem_nartP(v_term)) && (NIL != cycl_utilities.expression_find_if($sym24$SG_TRACER_SKOLEM_PRUNE_INDICATOR_CONSTANT_, narts_high.nart_hl_formula(v_term), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject sg_tracer_prune() {
        sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt25$Pruning_spurious_forts__));
        {
            SubLObject fort_count = sg_tracer_prune_int($sym26$SG_TRACER_SKOLEM_PRUNE_NART_);
            sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt27$Pruning_spurious_assertions__));
            {
                SubLObject assertion_count = sg_tracer_prune_assertions();
                return add(fort_count, assertion_count);
            }
        }
    }

    /**
     * So far we haven't seen a case where a skolem naut corresponded to a new goal term.
     * The correspondence was always achieved independently by another term.
     * So eventually we may want to merge these instead of killing them.
     */
    public static final SubLObject sg_tracer_prune_assertions() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject prune_gafs = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_seed_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_seed_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                if (NIL != cycl_utilities.assertion_find_if($sym30$SG_TRACER_SKOLEM_NAUT_, gaf, UNPROVIDED, UNPROVIDED)) {
                                                    prune_gafs = cons(gaf, prune_gafs);
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_seed_mt$.getGlobalValue(), $GAF, NIL)) {
                                                            if (NIL != cycl_utilities.assertion_find_if($sym30$SG_TRACER_SKOLEM_NAUT_, gaf, UNPROVIDED, UNPROVIDED)) {
                                                                prune_gafs = cons(gaf, prune_gafs);
                                                            }
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                {
                    SubLObject cdolist_list_var = prune_gafs;
                    SubLObject gaf = NIL;
                    for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                        if (NIL != assertion_handles.valid_assertionP(gaf, UNPROVIDED)) {
                            hl_storage_modules.hl_remove_all_arguments(assertions_high.assertion_cnf(gaf), assertions_high.assertion_mt(gaf));
                            count = add(count, ONE_INTEGER);
                        }
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @param func
     * 		the function that identifies what forts to prune
     */
    public static final SubLObject sg_tracer_prune_int(SubLObject func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject prune_forts = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_seed_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_seed_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject args = assertions_high.gaf_args(gaf);
                                                    SubLObject prune_narts = cycl_utilities.expression_gather(args, func, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject items_var = prune_narts;
                                                    if (items_var.isVector()) {
                                                        {
                                                            SubLObject vector_var = prune_narts;
                                                            SubLObject backwardP_var = NIL;
                                                            SubLObject length = length(vector_var);
                                                            SubLObject v_iteration = NIL;
                                                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                {
                                                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                    SubLObject item = aref(vector_var, element_num);
                                                                    prune_forts = cons(item, prune_forts);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        {
                                                            SubLObject cdolist_list_var = prune_narts;
                                                            SubLObject item = NIL;
                                                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                prune_forts = cons(item, prune_forts);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_seed_mt$.getGlobalValue(), $GAF, NIL)) {
                                                            {
                                                                SubLObject args = assertions_high.gaf_args(gaf);
                                                                SubLObject prune_narts = cycl_utilities.expression_gather(args, func, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                SubLObject items_var = prune_narts;
                                                                if (items_var.isVector()) {
                                                                    {
                                                                        SubLObject vector_var = prune_narts;
                                                                        SubLObject backwardP_var = NIL;
                                                                        SubLObject length = length(vector_var);
                                                                        SubLObject v_iteration = NIL;
                                                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                            {
                                                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                                                SubLObject item = aref(vector_var, element_num);
                                                                                prune_forts = cons(item, prune_forts);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    {
                                                                        SubLObject cdolist_list_var = prune_narts;
                                                                        SubLObject item = NIL;
                                                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                                                            prune_forts = cons(item, prune_forts);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                {
                    SubLObject cdolist_list_var = prune_forts;
                    SubLObject prune_fort = NIL;
                    for (prune_fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prune_fort = cdolist_list_var.first()) {
                        if (NIL != forts.valid_fortP(prune_fort)) {
                            sg_utilities.sg_trace_int(FOUR_INTEGER, format(NIL, $str_alt35$Killing__a__, prune_fort));
                            if (NIL != cyc_kernel.cyc_kill(prune_fort)) {
                                count = add(count, ONE_INTEGER);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }



    public static final SubLObject sg_tracer_abductive_rules(SubLObject module) {
        {
            SubLObject rules = dictionary.dictionary_lookup($sg_tracer_abductive_rule_table$.getGlobalValue(), module, UNPROVIDED);
            if (NIL != rules) {
                return rules;
            } else {
                return sg_tracer_convert_abductive_expansion_rules_to_implies(module);
            }
        }
    }

    public static final SubLObject sg_tracer_convert_abductive_expansion_rules_to_implies(SubLObject module) {
        {
            SubLObject rules = sg_mod_module_assertions_copy(module);
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                SubLTrampolineFile.checkType(rule, $sym37$VALID_ASSERTION_);
                {
                    SubLObject new_rules = sg_tracer_convert_abductive_expansion_rule_to_implies(rule);
                    dictionary_utilities.dictionary_append($sg_tracer_abductive_rule_table$.getGlobalValue(), module, new_rules);
                }
            }
        }
        return dictionary.dictionary_lookup($sg_tracer_abductive_rule_table$.getGlobalValue(), module, UNPROVIDED);
    }

    public static final SubLObject sg_tracer_convert_abductive_expansion_rule_to_implies(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_sentence = uncanonicalizer.assertion_el_formula(rule);
                SubLObject new_sentence = el_utilities.replace_formula_arg(ZERO_INTEGER, $$implies, old_sentence);
                SubLObject mt = assertions_high.assertion_mt(rule);
                ke.ke_edit_assertion_now_preserving_all_meta_assertions(rule, new_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject new_rules = czer_meta.find_assertions_cycl(new_sentence, mt);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == new_rules) {
                            Errors.error($str_alt38$Failed_to_convert___abductiveExpa);
                        }
                    }
                    return new_rules;
                }
            }
        }
    }

    public static final SubLObject sg_tracer_abduce_using_module(SubLObject module) {
        {
            SubLObject assertions = sg_tracer_abductive_rules(module);
            SubLObject v_properties = sg_modules.sg_mod_raw_inference_properties(module);
            return sg_tracer_forward_propagate_assertions(assertions, v_properties);
        }
    }

    // deflexical
    private static final SubLSymbol $sg_modules_initializedP$ = makeSymbol("*SG-MODULES-INITIALIZED?*");

    public static final SubLObject possibly_initialize_sg_modules() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != ke.cyclist_is_guest()) {
                    Errors.error($str_alt40$set_the_cyclist_first_);
                }
            }
            if (NIL == $sg_modules_initializedP$.getGlobalValue()) {
                sg_browser.sg_mod_reset_modules();
                $sg_modules_initializedP$.setGlobalValue(T);
            }
            return $sg_modules_initializedP$.getGlobalValue();
        }
    }

    public static final SubLObject sg_tracer_cleanup() {
        sg_utilities.sg_trace_int(TWO_INTEGER, format(NIL, $str_alt41$Cleaning_up__));
        sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt42$Cleaning_up_proper_specMts__));
        {
            SubLObject cdolist_list_var = genl_mts.all_proper_spec_mts($sg_tracer_seed_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject spec_mt = NIL;
            for (spec_mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_mt = cdolist_list_var.first()) {
                cyc_kernel.cyc_kill(spec_mt);
            }
        }
        sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt43$Cleaning_up_skolem_narts__));
        {
            SubLObject count = sg_tracer_prune_int($sym44$SKOLEM_NART_);
            sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt45$Cleaned_up__a_skolem_narts__, count));
        }
        {
            SubLObject cdolist_list_var = kb_mapping.gather_mt_index($sg_tracer_seed_mt$.getGlobalValue());
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                if (NIL == assertions_high.asserted_assertionP(ass)) {
                    hl_storage_modules.hl_remove_all_arguments(assertions_high.assertion_cnf(ass), assertions_high.assertion_mt(ass));
                }
            }
        }
        cyc_kernel.cyc_unassert($focused_typed_spec_preds_rule_sentence$.getGlobalValue(), $sg_tracer_seed_mt$.getGlobalValue());
        {
            SubLObject remaining = kb_indexing.num_mt_index($sg_tracer_seed_mt$.getGlobalValue());
            if (TWO_INTEGER.numE(remaining)) {
                return T;
            } else {
                Errors.warn($str_alt46$Expected_only_2_remaining_asserti, $sg_tracer_seed_mt$.getGlobalValue(), remaining);
                return NIL;
            }
        }
    }

    /**
     * Determines the best correspondences between the generated mt and the goal mt.
     * Computes precision and recall scores based on the number of goal assertions with
     * generated correspondents and the number of generated assertions with no goal correspondent.
     */
    public static final SubLObject sg_tracer_score() {
        {
            SubLObject correspondences = sg_tracer_compute_correspondences();
            SubLObject generated_sentences = sg_tracer_generated_sentences(correspondences);
            SubLObject goal_sentences = sg_tracer_goal_sentences();
            return sg_tracer_precision_and_recall(generated_sentences, goal_sentences);
        }
    }

    /**
     * Computes an alist mapping generated terms to goal terms.
     */
    public static final SubLObject sg_tracer_compute_correspondences() {
        {
            SubLObject correspondences = NIL;
            SubLObject generated_terms = sg_tracer_generated_terms();
            SubLObject cdolist_list_var = generated_terms;
            SubLObject generated_term = NIL;
            for (generated_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generated_term = cdolist_list_var.first()) {
                {
                    SubLObject goal_terms = sg_tracer_corresponding_goal_terms(generated_term);
                    if (NIL != list_utilities.singletonP(goal_terms)) {
                        correspondences = cons(cons(generated_term, list_utilities.only_one(goal_terms)), correspondences);
                    }
                }
            }
            return nreverse(correspondences);
        }
    }

    public static final SubLObject sg_tracer_generated_terms() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_seed_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_seed_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                if (NIL != assertion_utilities.gaf_assertion_with_pred_p(gaf, $$isa)) {
                                                    {
                                                        SubLObject v_term = assertions_high.gaf_arg1(gaf);
                                                        set.set_add(v_term, v_set);
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = cycl_utilities.assertion_gather($sym30$SG_TRACER_SKOLEM_NAUT_, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject naut = NIL;
                                                    for (naut = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , naut = cdolist_list_var.first()) {
                                                        set.set_add(naut, v_set);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_seed_mt$.getGlobalValue(), $GAF, $TRUE)) {
                                                            if (NIL != assertion_utilities.gaf_assertion_with_pred_p(gaf, $$isa)) {
                                                                {
                                                                    SubLObject v_term = assertions_high.gaf_arg1(gaf);
                                                                    set.set_add(v_term, v_set);
                                                                }
                                                            }
                                                            {
                                                                SubLObject cdolist_list_var = cycl_utilities.assertion_gather($sym30$SG_TRACER_SKOLEM_NAUT_, gaf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                SubLObject naut = NIL;
                                                                for (naut = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , naut = cdolist_list_var.first()) {
                                                                    set.set_add(naut, v_set);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                return set.set_element_list(v_set);
            }
        }
    }

    public static final SubLObject sg_tracer_skolem_nautP(SubLObject v_object) {
        return makeBoolean((NIL != el_utilities.possibly_naut_p(v_object)) && (NIL != list_utilities.member_eqP(cycl_utilities.nat_functor(v_object), $list_alt49)));
    }

    public static final SubLObject sg_tracer_corresponding_goal_terms(SubLObject generated_term) {
        {
            SubLObject cols = isa.min_isa(generated_term, $sg_tracer_seed_mt$.getGlobalValue(), UNPROVIDED);
            SubLObject isa_lits = Mapping.mapcar(MAKE_ISA_X_COL_ASENT, cols);
            SubLObject query = simplifier.conjoin(cons($list_alt51, isa_lits), UNPROVIDED);
            return ask_utilities.query_variable($X, query, $sg_tracer_goal_mt$.getGlobalValue(), UNPROVIDED);
        }
    }

    public static final SubLObject make_isa_x_col_asent(SubLObject col) {
        return list($$isa, $X, col);
    }

    /**
     * Returns an #'equal set of the generated sentences with the generated terms
     * replaced with their corresponding goal terms.
     */
    public static final SubLObject sg_tracer_generated_sentences(SubLObject correspondences) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_seed_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_seed_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                set.set_add(bindings.apply_bindings(correspondences, assertions_high.gaf_formula(gaf)), result);
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), $GAF)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_seed_mt$.getGlobalValue(), $GAF, NIL)) {
                                                            set.set_add(bindings.apply_bindings(correspondences, assertions_high.gaf_formula(gaf)), result);
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                return result;
            }
        }
    }

    public static final SubLObject sg_tracer_goal_sentences() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = set.new_set(symbol_function(EQUAL), UNPROVIDED);
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_goal_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_goal_mt$.getGlobalValue(), $GAF)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_goal_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                set.set_add(assertions_high.gaf_formula(gaf), result);
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_goal_mt$.getGlobalValue(), $GAF)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_goal_mt$.getGlobalValue(), $GAF, NIL)) {
                                                            set.set_add(assertions_high.gaf_formula(gaf), result);
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                return result;
            }
        }
    }

    public static final SubLObject sg_tracer_precision_and_recall(SubLObject generated_sentences, SubLObject goal_sentences) {
        {
            SubLObject generated_total = set.set_size(generated_sentences);
            SubLObject goal_total = set.set_size(goal_sentences);
            SubLObject match_count = ZERO_INTEGER;
            SubLObject set_contents_var = set.do_set_internal(goal_sentences);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject goal_sentence = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, goal_sentence)) {
                        if (NIL != set.set_memberP(goal_sentence, generated_sentences)) {
                            sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt53$Perfect_match___a__, goal_sentence));
                            match_count = add(match_count, ONE_INTEGER);
                        } else
                            if (NIL != sg_sentences_implyP(generated_sentences, goal_sentence)) {
                                sg_utilities.sg_trace_int(THREE_INTEGER, format(NIL, $str_alt54$Implied_match___a__, goal_sentence));
                                match_count = add(match_count, ONE_INTEGER);
                            }

                    }
                }
            }
            {
                SubLObject precision = divide(match_count, generated_total);
                SubLObject recall = divide(match_count, goal_total);
                return values(precision, recall, generated_total, goal_total, match_count);
            }
        }
    }

    public static final SubLObject sg_sentences_implyP(SubLObject antecedents, SubLObject consequent) {
        {
            SubLObject consequent_forts = cycl_utilities.expression_forts(consequent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(antecedents);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject antecedent = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, antecedent)) {
                        {
                            SubLObject antecedent_forts = cycl_utilities.expression_forts(antecedent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != keyhash_utilities.fast_intersectP(consequent_forts, antecedent_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                if (NIL != removal_modules_formula_implies.inference_formula_implies_in_mt(antecedent, consequent, $sg_tracer_goal_mt$.getGlobalValue())) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject run_sg_tracer_forward_inference_experiments(SubLObject control_var_sets) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tuples = NIL;
                {
                    SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                    try {
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        {
                            SubLObject cdolist_list_var = control_var_sets;
                            SubLObject control_var_set = NIL;
                            for (control_var_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , control_var_set = cdolist_list_var.first()) {
                                {
                                    SubLObject specials = Mapping.mapcar(symbol_function(FIRST), control_var_set);
                                    SubLObject values = Mapping.mapcar(symbol_function(SECOND), control_var_set);
                                    SubLObject precision = NIL;
                                    SubLObject recall = NIL;
                                    SubLObject generated_total = NIL;
                                    SubLObject goal_total = NIL;
                                    SubLObject match_count = NIL;
                                    SubLObject complete_total_time = NIL;
                                    SubLObject forward_info = NIL;
                                    format(T, $str_alt58$________________);
                                    format_nil.print_one_per_line(control_var_set, UNPROVIDED);
                                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                    sg_tracer_cleanup();
                                    Storage.gc_ephemeral();
                                    {
                                        SubLObject cprogv_var = specials;
                                        final ArrayList old_values = extract_dynamic_values(cprogv_var);
                                        try {
                                            bind_dynamic_vars(cprogv_var, values);
                                            inference_metrics.clear_forward_inference_metrics();
                                            {
                                                SubLObject _prev_bind_0_2 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sg_utilities.$sg_browse_forward_inferencesP$.currentBinding(thread);
                                                try {
                                                    inference_metrics.$gathering_forward_inference_metricsP$.bind(T, thread);
                                                    sg_utilities.$sg_browse_forward_inferencesP$.bind(NIL, thread);
                                                    {
                                                        SubLObject time_var = get_internal_real_time();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject precision_3 = sg_tracer_kmg();
                                                            SubLObject recall_4 = thread.secondMultipleValue();
                                                            SubLObject generated_total_5 = thread.thirdMultipleValue();
                                                            SubLObject goal_total_6 = thread.fourthMultipleValue();
                                                            SubLObject match_count_7 = thread.fifthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            precision = precision_3;
                                                            recall = recall_4;
                                                            generated_total = generated_total_5;
                                                            goal_total = goal_total_6;
                                                            match_count = match_count_7;
                                                        }
                                                        complete_total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                        forward_info = inference_metrics.forward_inference_metrics_info(UNPROVIDED);
                                                    }
                                                } finally {
                                                    sg_utilities.$sg_browse_forward_inferencesP$.rebind(_prev_bind_1, thread);
                                                    inference_metrics.$gathering_forward_inference_metricsP$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                        } finally {
                                            rebind_dynamic_vars(cprogv_var, old_values);
                                        }
                                    }
                                    {
                                        SubLObject deduced_count = sg_tracer_experiment_deduced_assertion_count();
                                        SubLObject metrics = sg_tracer_experiment_metrics(forward_info);
                                        SubLObject tuple = listS($CONTROL_VARS, new SubLObject[]{ control_var_set, $COMPLETE_TOTAL_TIME, complete_total_time, $DEDUCED_COUNT, deduced_count, $GENERATED_TOTAL, generated_total, $GOAL_TOTAL, goal_total, $MATCH_COUNT, match_count, metrics });
                                        list_utilities.pretty_print_plist(tuple, UNPROVIDED);
                                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                        tuples = cons(tuple, tuples);
                                    }
                                }
                            }
                        }
                    } finally {
                        $read_default_float_format$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(tuples);
            }
        }
    }

    public static final SubLObject sg_tracer_experiment_deduced_assertion_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method($sg_tracer_seed_mt$.getGlobalValue());
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec($sg_tracer_seed_mt$.getGlobalValue());
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, $TRUE, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != gaf);
                                            if (NIL != valid) {
                                                if (NIL != assertions_high.deduced_assertionP(gaf)) {
                                                    total = add(total, ONE_INTEGER);
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator($sg_tracer_seed_mt$.getGlobalValue(), NIL)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total_8 = id_index.id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt32$do_broad_mt_index, STRINGP);
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
                                        utilities_macros.noting_percent_progress_preamble($str_alt32$do_broad_mt_index);
                                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject gaf = NIL;
                                                while (NIL != id) {
                                                    gaf = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, gaf, $SKIP)) {
                                                        utilities_macros.note_percent_progress(sofar, total_8);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(gaf, $sg_tracer_seed_mt$.getGlobalValue(), NIL, $TRUE)) {
                                                            if (NIL != assertions_high.deduced_assertionP(gaf)) {
                                                                total = add(total, ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
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
                        }
                    }

                return total;
            }
        }
    }

    public static final SubLObject sg_tracer_experiment_metrics(SubLObject forward_info) {
        return inference_metrics.global_statistics_from_forward_inference_metrics_info(forward_info);
    }

    public static final SubLObject declare_sg_tracer_file() {
        declareFunction("sg_tracer", "SG-TRACER", 0, 0, false);
        declareFunction("sg_tracer_kmg", "SG-TRACER-KMG", 0, 0, false);
        declareFunction("sg_tracer_int", "SG-TRACER-INT", 1, 0, false);
        declareFunction("sg_util_forward_propagate_using_module", "SG-UTIL-FORWARD-PROPAGATE-USING-MODULE", 1, 0, false);
        declareFunction("sg_util_forward_propagate_using_modules", "SG-UTIL-FORWARD-PROPAGATE-USING-MODULES", 1, 0, false);
        declareFunction("sg_tracer_forward_propagate_assertions", "SG-TRACER-FORWARD-PROPAGATE-ASSERTIONS", 2, 0, false);
        declareFunction("sg_mod_module_assertions_copy", "SG-MOD-MODULE-ASSERTIONS-COPY", 1, 0, false);
        declareFunction("typed_spec_preds_rule", "TYPED-SPEC-PREDS-RULE", 0, 0, false);
        declareFunction("sg_tracer_infer_typed_spec_preds", "SG-TRACER-INFER-TYPED-SPEC-PREDS", 0, 0, false);
        declareFunction("sg_tracer_skolem_prune_indicator_constantP", "SG-TRACER-SKOLEM-PRUNE-INDICATOR-CONSTANT?", 1, 0, false);
        declareFunction("sg_tracer_skolem_prune_nartP", "SG-TRACER-SKOLEM-PRUNE-NART?", 1, 0, false);
        declareFunction("sg_tracer_prune", "SG-TRACER-PRUNE", 0, 0, false);
        declareFunction("sg_tracer_prune_assertions", "SG-TRACER-PRUNE-ASSERTIONS", 0, 0, false);
        declareFunction("sg_tracer_prune_int", "SG-TRACER-PRUNE-INT", 1, 0, false);
        declareFunction("sg_tracer_abductive_rules", "SG-TRACER-ABDUCTIVE-RULES", 1, 0, false);
        declareFunction("sg_tracer_convert_abductive_expansion_rules_to_implies", "SG-TRACER-CONVERT-ABDUCTIVE-EXPANSION-RULES-TO-IMPLIES", 1, 0, false);
        declareFunction("sg_tracer_convert_abductive_expansion_rule_to_implies", "SG-TRACER-CONVERT-ABDUCTIVE-EXPANSION-RULE-TO-IMPLIES", 1, 0, false);
        declareFunction("sg_tracer_abduce_using_module", "SG-TRACER-ABDUCE-USING-MODULE", 1, 0, false);
        declareFunction("possibly_initialize_sg_modules", "POSSIBLY-INITIALIZE-SG-MODULES", 0, 0, false);
        declareFunction("sg_tracer_cleanup", "SG-TRACER-CLEANUP", 0, 0, false);
        declareFunction("sg_tracer_score", "SG-TRACER-SCORE", 0, 0, false);
        declareFunction("sg_tracer_compute_correspondences", "SG-TRACER-COMPUTE-CORRESPONDENCES", 0, 0, false);
        declareFunction("sg_tracer_generated_terms", "SG-TRACER-GENERATED-TERMS", 0, 0, false);
        declareFunction("sg_tracer_skolem_nautP", "SG-TRACER-SKOLEM-NAUT?", 1, 0, false);
        declareFunction("sg_tracer_corresponding_goal_terms", "SG-TRACER-CORRESPONDING-GOAL-TERMS", 1, 0, false);
        declareFunction("make_isa_x_col_asent", "MAKE-ISA-X-COL-ASENT", 1, 0, false);
        declareFunction("sg_tracer_generated_sentences", "SG-TRACER-GENERATED-SENTENCES", 1, 0, false);
        declareFunction("sg_tracer_goal_sentences", "SG-TRACER-GOAL-SENTENCES", 0, 0, false);
        declareFunction("sg_tracer_precision_and_recall", "SG-TRACER-PRECISION-AND-RECALL", 2, 0, false);
        declareFunction("sg_sentences_implyP", "SG-SENTENCES-IMPLY?", 2, 0, false);
        declareFunction("run_sg_tracer_forward_inference_experiments", "RUN-SG-TRACER-FORWARD-INFERENCE-EXPERIMENTS", 1, 0, false);
        declareFunction("sg_tracer_experiment_deduced_assertion_count", "SG-TRACER-EXPERIMENT-DEDUCED-ASSERTION-COUNT", 0, 0, false);
        declareFunction("sg_tracer_experiment_metrics", "SG-TRACER-EXPERIMENT-METRICS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sg_tracer_file() {
        deflexical("*SG-TRACER-SEED-MT*", $$IFMilitaryOperationSeedMt);
        deflexical("*SG-TRACER-GOAL-MT*", $const1$HYP_ScenarioContext_MilitaryOpera);
        deflexical("*SG-TRACER-GOAL-TERM-COLLECTION*", $const2$ExampleParamilitaryOperationScena);
        deflexical("*SG-TEMPORAL-ORDERING-MODULES*", $list_alt3);
        deflexical("*SG-INHERIT/EQUIV-MODULES*", $list_alt4);
        deflexical("*SG-TRACER-SKOLEM-PRUNE-INDICATOR-CONSTANTS*", $list_alt5);
        deflexical("*TYPED-SPEC-PREDS-RULE-SENTENCE*", $list_alt9);
        deflexical("*TYPED-SPEC-PREDS-RULE*", misc_utilities.uninitialized());
        deflexical("*FOCUSED-TYPED-SPEC-PREDS-RULE-SENTENCE*", listS($$implies, list($$and, $list_alt13, $list_alt14, listS($$ist, $sg_tracer_seed_mt$.getGlobalValue(), $list_alt16), listS($$ist_Asserted, $sg_tracer_seed_mt$.getGlobalValue(), $list_alt18)), $list_alt19));
        deflexical("*SG-TRACER-ABDUCTIVE-RULE-TABLE*", NIL != boundp($sg_tracer_abductive_rule_table$) ? ((SubLObject) ($sg_tracer_abductive_rule_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*SG-MODULES-INITIALIZED?*", NIL != boundp($sym39$_SG_MODULES_INITIALIZED__) ? ((SubLObject) ($sg_modules_initializedP$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static final SubLObject setup_sg_tracer_file() {
                subl_macro_promotions.declare_defglobal($sg_tracer_abductive_rule_table$);
        subl_macro_promotions.declare_defglobal($sym39$_SG_MODULES_INITIALIZED__);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$IFMilitaryOperationSeedMt = constant_handles.reader_make_constant_shell(makeString("IFMilitaryOperationSeedMt"));

    public static final SubLObject $const1$HYP_ScenarioContext_MilitaryOpera = constant_handles.reader_make_constant_shell(makeString("HYP-ScenarioContext-MilitaryOperationSampleMt"));

    public static final SubLObject $const2$ExampleParamilitaryOperationScena = constant_handles.reader_make_constant_shell(makeString("ExampleParamilitaryOperationScenarioConstant"));

    static private final SubLList $list_alt3 = list(constant_handles.reader_make_constant_shell(makeString("StartsAfterEndOfInSituationTypeRefinement")), constant_handles.reader_make_constant_shell(makeString("StartsAfterStartOfInSituationTypeRefinement")));

    static private final SubLList $list_alt4 = list(constant_handles.reader_make_constant_shell(makeString("EquivRolePlayersOfTypeRefinement")), constant_handles.reader_make_constant_shell(makeString("InheritIdentityToSubScenesRefinement")), constant_handles.reader_make_constant_shell(makeString("InheritRolePlayersOfTypeRefinement")), constant_handles.reader_make_constant_shell(makeString("InheritRolePlayersSceneToSceneUniqueRefinement")), constant_handles.reader_make_constant_shell(makeString("InheritRolePlayersScriptToSceneUniqueRefinement")));

    static private final SubLList $list_alt5 = list(constant_handles.reader_make_constant_shell(makeString("WatchingSomething")), constant_handles.reader_make_constant_shell(makeString("Planning")), constant_handles.reader_make_constant_shell(makeString("LookingForSomething-IndefiniteMultiple")), constant_handles.reader_make_constant_shell(makeString("PhysicalEvent")));

    public static final SubLObject $$ProperSubSituationTypesRefinement = constant_handles.reader_make_constant_shell(makeString("ProperSubSituationTypesRefinement"));

    public static final SubLObject $const7$WHAT_IFCandidateProperSubSituatio = constant_handles.reader_make_constant_shell(makeString("WHAT-IFCandidateProperSubSituationTypesExpansion"));

    private static final SubLSymbol SG_MOD_MODULE_ASSERTIONS_COPY = makeSymbol("SG-MOD-MODULE-ASSERTIONS-COPY");

    static private final SubLList $list_alt9 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("typedGenlPreds")), makeSymbol("?SPECPRED"), makeSymbol("?GENLPRED")), list(constant_handles.reader_make_constant_shell(makeString("admittedSentence")), list(makeSymbol("?SPECPRED"), makeSymbol("?A"), makeSymbol("?B"))), list(makeSymbol("?GENLPRED"), makeSymbol("?A"), makeSymbol("?B"))), list(makeSymbol("?SPECPRED"), makeSymbol("?A"), makeSymbol("?B")));



    public static final SubLObject $$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLList $list_alt13 = list(constant_handles.reader_make_constant_shell(makeString("typedGenlPreds")), makeSymbol("?SPECPRED"), makeSymbol("?GENLPRED"));

    static private final SubLList $list_alt14 = list(constant_handles.reader_make_constant_shell(makeString("different")), makeSymbol("?SPECPRED"), makeSymbol("?GENLPRED"));

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    static private final SubLList $list_alt16 = list(list(constant_handles.reader_make_constant_shell(makeString("admittedSentence")), list(makeSymbol("?SPECPRED"), makeSymbol("?A"), makeSymbol("?B"))));

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("?GENLPRED"), makeSymbol("?A"), makeSymbol("?B")));

    static private final SubLList $list_alt19 = list(list(makeSymbol("?SPECPRED"), makeSymbol("?A"), makeSymbol("?B")));

    static private final SubLString $str_alt20$Inferring_typed_specPreds__ = makeString("Inferring typed specPreds~%");

    static private final SubLList $list_alt21 = list(constant_handles.reader_make_constant_shell(makeString("typedGenlPreds")), constant_handles.reader_make_constant_shell(makeString("properSubEvents")), constant_handles.reader_make_constant_shell(makeString("properSubSituations")));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    static private final SubLList $list_alt23 = list(makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    static private final SubLSymbol $sym24$SG_TRACER_SKOLEM_PRUNE_INDICATOR_CONSTANT_ = makeSymbol("SG-TRACER-SKOLEM-PRUNE-INDICATOR-CONSTANT?");

    static private final SubLString $str_alt25$Pruning_spurious_forts__ = makeString("Pruning spurious forts~%");

    static private final SubLSymbol $sym26$SG_TRACER_SKOLEM_PRUNE_NART_ = makeSymbol("SG-TRACER-SKOLEM-PRUNE-NART?");

    static private final SubLString $str_alt27$Pruning_spurious_assertions__ = makeString("Pruning spurious assertions~%");





    static private final SubLSymbol $sym30$SG_TRACER_SKOLEM_NAUT_ = makeSymbol("SG-TRACER-SKOLEM-NAUT?");



    static private final SubLString $str_alt32$do_broad_mt_index = makeString("do-broad-mt-index");





    static private final SubLString $str_alt35$Killing__a__ = makeString("Killing ~a~%");

    public static final SubLSymbol $sg_tracer_abductive_rule_table$ = makeSymbol("*SG-TRACER-ABDUCTIVE-RULE-TABLE*");

    static private final SubLSymbol $sym37$VALID_ASSERTION_ = makeSymbol("VALID-ASSERTION?");

    static private final SubLString $str_alt38$Failed_to_convert___abductiveExpa = makeString("Failed to convert #$abductiveExpansion rules to #$implies rules");

    static private final SubLSymbol $sym39$_SG_MODULES_INITIALIZED__ = makeSymbol("*SG-MODULES-INITIALIZED?*");

    static private final SubLString $str_alt40$set_the_cyclist_first_ = makeString("set-the-cyclist first.");

    static private final SubLString $str_alt41$Cleaning_up__ = makeString("Cleaning up~%");

    static private final SubLString $str_alt42$Cleaning_up_proper_specMts__ = makeString("Cleaning up proper specMts~%");

    static private final SubLString $str_alt43$Cleaning_up_skolem_narts__ = makeString("Cleaning up skolem narts~%");

    static private final SubLSymbol $sym44$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");

    static private final SubLString $str_alt45$Cleaned_up__a_skolem_narts__ = makeString("Cleaned up ~a skolem narts~%");

    static private final SubLString $str_alt46$Expected_only_2_remaining_asserti = makeString("Expected only 2 remaining assertions in ~a, got ~a");



    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt49 = list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")));

    private static final SubLSymbol MAKE_ISA_X_COL_ASENT = makeSymbol("MAKE-ISA-X-COL-ASENT");

    static private final SubLList $list_alt51 = list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BookkeepingMt")), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("X"), constant_handles.reader_make_constant_shell(makeString("ExampleParamilitaryOperationScenarioConstant"))));



    static private final SubLString $str_alt53$Perfect_match___a__ = makeString("Perfect match: ~a~%");

    static private final SubLString $str_alt54$Implied_match___a__ = makeString("Implied match: ~a~%");







    static private final SubLString $str_alt58$________________ = makeString("~%;;;;;;;;;;;;;;");

    private static final SubLSymbol $CONTROL_VARS = makeKeyword("CONTROL-VARS");

    private static final SubLSymbol $COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");

    private static final SubLSymbol $DEDUCED_COUNT = makeKeyword("DEDUCED-COUNT");

    private static final SubLSymbol $GENERATED_TOTAL = makeKeyword("GENERATED-TOTAL");

    private static final SubLSymbol $GOAL_TOTAL = makeKeyword("GOAL-TOTAL");

    private static final SubLSymbol $MATCH_COUNT = makeKeyword("MATCH-COUNT");

    // // Initializers
    public void declareFunctions() {
        declare_sg_tracer_file();
    }

    public void initializeVariables() {
        init_sg_tracer_file();
    }

    public void runTopLevelForms() {
        setup_sg_tracer_file();
    }
}

