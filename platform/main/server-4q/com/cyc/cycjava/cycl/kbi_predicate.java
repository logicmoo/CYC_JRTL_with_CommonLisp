/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-PREDICATE
 *  source file: /cyc/top/cycl/kbi-predicate.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_predicate extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_predicate() {
    }

    public static final SubLFile me = new kbi_predicate();


    // // Definitions
    public static final SubLObject diagnose_qua_predicate(SubLObject predicate) {
        return kbi_utilities.diagnose_qua_sub_domains(predicate, $PREDICATE);
    }







    /**
     * test PREDICATE fort for missing from forts typed predicate
     */
    public static final SubLObject predicate_not_cachedP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($PREDICATE_NOT_CACHED)) && (NIL != kbi_utilities.kbi_applies_toP($PREDICATE_NOT_CACHED, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($PREDICATE_NOT_CACHED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_predicate_not_cachedP(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($PREDICATE_NOT_CACHED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :PREDICATE-NOT-CACHED applies to PREDICATE
     */
    public static final SubLObject why_predicate_not_cachedP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($PREDICATE_NOT_CACHED, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_predicate_not_cachedP(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($PREDICATE_NOT_CACHED, predicate, data);
                            } else {
                                return list($PREDICATE_NOT_CACHED, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_predicate_not_cachedP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_predicate_not_cachedP(SubLObject predicate) {
        if (NIL == fort_types_interface.predicate_in_any_mtP(predicate)) {
            kbi_utilities.add_kbi_result(predicate);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_nl_why_predicate_not_cachedP(SubLObject predicate, SubLObject data) {
        return format(NIL, $str_alt14$_s_is_not_among_the_cached_predic, predicate);
    }

    // defparameter
    public static final SubLSymbol $related_pred_wXo_same_arity_results$ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-RESULTS*");

    // defparameter
    public static final SubLSymbol $related_pred_wXo_same_arity_time$ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-TIME*");

    // defparameter
    public static final SubLSymbol $related_pred_wXo_same_arity_count$ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-COUNT*");

    /**
     * test PREDICATE fort for related preds (e.g., #$genlPreds) that have a different #$arity
     */
    public static final SubLObject related_pred_wXo_same_arityP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw21$RELATED_PRED_W_O_SAME_ARITY)) && (NIL != kbi_utilities.kbi_applies_toP($kw21$RELATED_PRED_W_O_SAME_ARITY, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw21$RELATED_PRED_W_O_SAME_ARITY);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_5 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_related_pred_wXo_same_arity(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_5, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw21$RELATED_PRED_W_O_SAME_ARITY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATED-PRED-W/O-SAME-ARITY applies to PREDICATE
     */
    public static final SubLObject why_related_pred_wXo_same_arityP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw21$RELATED_PRED_W_O_SAME_ARITY, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_related_pred_wXo_same_arity(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw21$RELATED_PRED_W_O_SAME_ARITY, predicate, data);
                            } else {
                                return list($kw21$RELATED_PRED_W_O_SAME_ARITY, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_related_pred_wXo_same_arityP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_related_pred_wXo_same_arityP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject arityXmodeXrel_predXrel_arityXinversePXmt = NIL;
            for (arityXmodeXrel_predXrel_arityXinversePXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arityXmodeXrel_predXrel_arityXinversePXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = arityXmodeXrel_predXrel_arityXinversePXmt;
                    SubLObject current = datum;
                    SubLObject v_arity = NIL;
                    SubLObject mode = NIL;
                    SubLObject rel_pred = NIL;
                    SubLObject rel_arity = NIL;
                    SubLObject inverseP = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    v_arity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    mode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    rel_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    rel_arity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    inverseP = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject relating_pred = (mode == $NEGATION) ? ((SubLObject) ($$negationPreds)) : $$genlPreds;
                            SubLObject relation = (mode.eql($INFERIOR)) ? ((SubLObject) (format(NIL, $str_alt29$is_a__s_of, relating_pred))) : format(NIL, $str_alt30$has__s, relating_pred);
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt31$___s_has___arity__s_but__a__s_wit, new SubLObject[]{ predicate, v_arity, relation, rel_pred, rel_arity, mt }));
                        }
                        return nl_result;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt24);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_related_pred_wXo_same_arity(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = $list_alt32;
                        SubLObject pred = NIL;
                        for (pred = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                            {
                                SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(predicate, module);
                                if (NIL != d_link) {
                                    {
                                        SubLObject rest = NIL;
                                        for (rest = sbhl_module_utilities.get_relevant_sbhl_directions(module); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject direction = rest.first();
                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                                if (NIL != mt_links) {
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject iteration_state_9 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_9)))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject truth = dictionary_contents.do_dictionary_contents_key_value(iteration_state_9);
                                                                            SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                SubLObject rest_10 = NIL;
                                                                                for (rest_10 = new_list; !((NIL != doneP) || (NIL == rest_10)); rest_10 = rest_10.rest()) {
                                                                                    {
                                                                                        SubLObject link_predicate = rest_10.first();
                                                                                        SubLObject link_pred_arity = arity.arity(link_predicate);
                                                                                        SubLObject pred_arity = arity.arity(predicate);
                                                                                        if (NIL != el_utilities.valid_arity_p(link_pred_arity)) {
                                                                                            if (!pred_arity.numE(link_pred_arity)) {
                                                                                                {
                                                                                                    SubLObject mode = sbhl_module_utilities.sbhl_old_mode(direction, module);
                                                                                                    SubLObject inverseP = sbhl_module_utilities.sbhl_inverse_module_p(sbhl_module_vars.get_sbhl_module(module));
                                                                                                    kbi_utilities.add_kbi_result(list(pred_arity, mode, link_pred_arity, inverseP, mt));
                                                                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            iteration_state_9 = dictionary_contents.do_dictionary_contents_next(iteration_state_9);
                                                                        }
                                                                    } 
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_9);
                                                                }
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
                return kbi_utilities.kbi_result();
            }
        }
    }

    // defparameter
    public static final SubLSymbol $predicate_wXo_arg_format_results$ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-RESULTS*");

    // defparameter
    public static final SubLSymbol $predicate_wXo_arg_format_time$ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-TIME*");

    // defparameter
    public static final SubLSymbol $predicate_wXo_arg_format_count$ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-COUNT*");

    /**
     * test PREDICATE for missing arg-format (e.g., #$arg1Format ...) assertions
     */
    public static final SubLObject predicate_wXo_arg_formatP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw39$PREDICATE_W_O_ARG_FORMAT)) && (NIL != kbi_utilities.kbi_applies_toP($kw39$PREDICATE_W_O_ARG_FORMAT, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw39$PREDICATE_W_O_ARG_FORMAT);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_predicate_wXo_arg_format(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw39$PREDICATE_W_O_ARG_FORMAT, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :PREDICATE-W/O-ARG-FORMAT applies to PREDICATE
     */
    public static final SubLObject why_predicate_wXo_arg_formatP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw39$PREDICATE_W_O_ARG_FORMAT, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_13 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_predicate_wXo_arg_format(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw39$PREDICATE_W_O_ARG_FORMAT, predicate, data);
                            } else {
                                return list($kw39$PREDICATE_W_O_ARG_FORMAT, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_predicate_wXo_arg_formatP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_predicate_wXo_arg_formatP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt41$_s_missing, predicate);
            SubLObject cdolist_list_var = data;
            SubLObject mt_args = NIL;
            for (mt_args = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_args = cdolist_list_var.first()) {
                {
                    SubLObject mt = mt_args.first();
                    SubLObject args = mt_args.rest();
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt42$_____a__in_mt__s_, string_utilities.stringify_items(Mapping.mapcar(symbol_function(ARGN_FORMAT_PRED), args), symbol_function(STR), $str_alt45$__, $str_alt46$__and_), mt));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_predicate_wXo_arg_format(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(predicate);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.predicate_p(predicate)) {
                            if (NIL == arity.variable_arityP(predicate)) {
                                {
                                    SubLObject v_arity = arity.arity(predicate);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        {
                                            SubLObject mal_args = NIL;
                                            SubLObject n = NIL;
                                            for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                                                if (NIL == kb_accessors.argn_format(predicate, add(ONE_INTEGER, n), mt)) {
                                                    mal_args = cons(n, mal_args);
                                                }
                                            }
                                            if (NIL != mal_args) {
                                                kbi_utilities.add_kbi_result(cons(mt, nreverse(mal_args)));
                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
        return kbi_utilities.kbi_result();
    }

    // defparameter
    public static final SubLSymbol $predicate_negates_wXo_arg_isa_overlap_results$ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-RESULTS*");

    // defparameter
    public static final SubLSymbol $predicate_negates_wXo_arg_isa_overlap_time$ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-TIME*");

    // defparameter
    public static final SubLSymbol $predicate_negates_wXo_arg_isa_overlap_count$ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-COUNT*");

    /**
     * test negating PREDICATE (e.g., #$AsymmetricBinaryPredicate) for #$arg1Isa not overlapping #$arg2Isa
     */
    public static final SubLObject predicate_negates_wXo_arg_isa_overlapP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP)) && (NIL != kbi_utilities.kbi_applies_toP($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_15 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_predicate_negates_wXo_arg_isa_overlap_in_mts(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP applies to PREDICATE
     */
    public static final SubLObject why_predicate_negates_wXo_arg_isa_overlapP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_17 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_predicate_negates_wXo_arg_isa_overlap_in_mts(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, predicate, data);
                            } else {
                                return list($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_predicate_negates_wXo_arg_isa_overlapP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_predicate_negates_wXo_arg_isa_overlapP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject typesXpred_1Xarg1Xpred_2Xarg2Xmt = NIL;
            for (typesXpred_1Xarg1Xpred_2Xarg2Xmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typesXpred_1Xarg1Xpred_2Xarg2Xmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = typesXpred_1Xarg1Xpred_2Xarg2Xmt;
                    SubLObject current = datum;
                    SubLObject types = NIL;
                    SubLObject pred1 = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject pred2 = NIL;
                    SubLObject arg2 = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    types = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    pred1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    pred2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    arg2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt55);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt56$___s___isa__a_but_has_non_overlap, new SubLObject[]{ predicate, string_utilities.stringify_items(types, symbol_function(STR), $str_alt45$__, $str_alt46$__and_), pred1, arg1, pred2, arg2, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt55);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_predicate_negates_wXo_arg_isa_overlap_in_mts(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.arg_type_mts(predicate);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != auto_negating_predicateP(predicate, mt)) {
                            {
                                SubLObject types = isa.all_isa_among(predicate, auto_negating_predicates(), UNPROVIDED, UNPROVIDED);
                                SubLObject arg1_isa = genls.min_cols(kb_accessors.arg1_isa(predicate, mt), mt, UNPROVIDED);
                                SubLObject arg2_isa = genls.min_cols(kb_accessors.arg2_isa(predicate, mt), mt, UNPROVIDED);
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var_19 = arg1_isa;
                                        SubLObject isa1 = NIL;
                                        for (isa1 = csome_list_var_19.first(); !((NIL != doneP) || (NIL == csome_list_var_19)); csome_list_var_19 = csome_list_var_19.rest() , isa1 = csome_list_var_19.first()) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var_20 = arg2_isa;
                                                    SubLObject isa2 = NIL;
                                                    for (isa2 = csome_list_var_20.first(); !((NIL != doneP) || (NIL == csome_list_var_20)); csome_list_var_20 = csome_list_var_20.rest() , isa2 = csome_list_var_20.first()) {
                                                        if (NIL != disjoint_with.collections_disjointP(isa1, isa2, mt)) {
                                                            kbi_utilities.add_kbi_result(list(types, $$arg1Isa, isa1, $$arg2Isa, isa2, mt));
                                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == doneP) {
                                    {
                                        SubLObject arg1_genl = genls.min_cols(kb_accessors.arg1_genl(predicate, mt), mt, UNPROVIDED);
                                        SubLObject arg2_genl = genls.min_cols(kb_accessors.arg2_genl(predicate, mt), mt, UNPROVIDED);
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var_21 = arg1_genl;
                                                SubLObject genl1 = NIL;
                                                for (genl1 = csome_list_var_21.first(); !((NIL != doneP) || (NIL == csome_list_var_21)); csome_list_var_21 = csome_list_var_21.rest() , genl1 = csome_list_var_21.first()) {
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var_22 = arg2_genl;
                                                            SubLObject genl2 = NIL;
                                                            for (genl2 = csome_list_var_22.first(); !((NIL != doneP) || (NIL == csome_list_var_22)); csome_list_var_22 = csome_list_var_22.rest() , genl2 = csome_list_var_22.first()) {
                                                                if (NIL != disjoint_with.collections_disjointP(genl1, genl2, mt)) {
                                                                    kbi_utilities.add_kbi_result(list(types, $$arg1Genl, genl1, $$arg2Genl, genl2, mt));
                                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
            return kbi_utilities.kbi_result();
        }
    }



    public static final SubLObject auto_negating_predicates() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $auto_negating_pred_types$.getDynamicValue(thread);
        }
    }

    public static final SubLObject auto_negating_predicateP(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return isa.isa_anyP(v_object, auto_negating_predicates(), mt, UNPROVIDED);
    }

    // defparameter
    public static final SubLSymbol $predicate_symmetry_wXo_arg_constraint_symmetry_results$ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-RESULTS*");

    // defparameter
    public static final SubLSymbol $predicate_symmetry_wXo_arg_constraint_symmetry_time$ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-TIME*");

    // defparameter
    public static final SubLSymbol $predicate_symmetry_wXo_arg_constraint_symmetry_count$ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-COUNT*");

    /**
     * test symmetric PREDICATE for arg1 cosntraints different from arg2 constraints
     */
    public static final SubLObject predicate_symmetry_wXo_arg_constraint_symmetryP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY)) && (NIL != kbi_utilities.kbi_applies_toP($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_23 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_predicate_symmetry_wXo_arg_contraint_symmetry(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_24, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY applies to PREDICATE
     */
    public static final SubLObject why_predicate_symmetry_wXo_arg_constraint_symmetryP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_25 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_predicate_symmetry_wXo_arg_contraint_symmetry(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, predicate, data);
                            } else {
                                return list($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_predicate_symmetry_wXo_arg_constraint_symmetryP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_predicate_symmetry_wXo_arg_constraint_symmetryP(SubLObject predicate, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = $str_alt23$;
                SubLObject cdolist_list_var = data;
                SubLObject arg_constraint_pred_1Xarg_constraintsXarg_constraint_pred_1Xmt = NIL;
                for (arg_constraint_pred_1Xarg_constraintsXarg_constraint_pred_1Xmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_constraint_pred_1Xarg_constraintsXarg_constraint_pred_1Xmt = cdolist_list_var.first()) {
                    {
                        SubLObject datum = arg_constraint_pred_1Xarg_constraintsXarg_constraint_pred_1Xmt;
                        SubLObject current = datum;
                        SubLObject arg_constraint_pred_1 = NIL;
                        SubLObject arg_constraints = NIL;
                        SubLObject arg_constraint_pred_2 = NIL;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt72);
                        arg_constraint_pred_1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt72);
                        arg_constraints = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt72);
                        arg_constraint_pred_2 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt72);
                        mt = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt73$___s___isa___SymmetricBinaryPredi, new SubLObject[]{ predicate, arg_constraint_pred_1, string_utilities.stringify_items(arg_constraints, symbol_function(OBJECT_TO_STRING), $str_alt45$__, $str_alt46$__and_), arg_constraint_pred_2, mt }));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt72);
                        }
                    }
                }
                return nl_result;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_predicate_symmetry_wXo_arg_contraint_symmetry(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.mts_of_fort_wrt_predicate_type(predicate, $$ArgConstraintPredicate, $list_alt76);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
                            kbi_arg_isa_asymmetry_in_mt(predicate, mt);
                            if (NIL == doneP) {
                                kbi_arg_genl_asymmetry_in_mt(predicate, mt);
                            }
                            if (NIL == doneP) {
                                kbi_arg_format_asymmetry_in_mt(predicate, mt);
                            }
                            if (NIL == doneP) {
                                kbi_inter_arg_isa_asymmetry_in_mt(predicate, mt);
                            }
                            if (NIL == doneP) {
                                kbi_inter_arg_format_asymmetry_in_mt(predicate, mt);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.nreverse_kbi_result();
        }
    }

    public static final SubLObject kbi_arg_isa_asymmetry_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_isa = genls.min_cols(kb_accessors.arg1_isa(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg2_isa = genls.min_cols(kb_accessors.arg2_isa(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg_orts = set_difference(arg1_isa, arg2_isa, UNPROVIDED, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$arg1Isa, arg_orts, $$arg2Isa, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                        if (NIL == doneP) {
                            arg_orts = set_difference(arg2_isa, arg1_isa, UNPROVIDED, UNPROVIDED);
                            if (NIL != arg_orts) {
                                kbi_utilities.add_kbi_result(list($$arg2Isa, arg_orts, $$arg1Isa, mt));
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_arg_genl_asymmetry_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_genl = genls.min_cols(kb_accessors.arg1_genl(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg2_genl = genls.min_cols(kb_accessors.arg2_genl(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg_orts = set_difference(arg1_genl, arg2_genl, UNPROVIDED, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$arg1Genl, arg_orts, $$arg2Genl, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                        if (NIL == doneP) {
                            arg_orts = set_difference(arg2_genl, arg1_genl, UNPROVIDED, UNPROVIDED);
                            if (NIL != arg_orts) {
                                kbi_utilities.add_kbi_result(list($$arg2Genl, arg_orts, $$arg1Genl, mt));
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_arg_format_asymmetry_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_format = genls.min_cols(kb_accessors.arg1_format(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg2_format = genls.min_cols(kb_accessors.arg2_format(predicate, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg_orts = set_difference(arg1_format, arg2_format, UNPROVIDED, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$arg1Format, arg_orts, $$arg2Format, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                        if (NIL == doneP) {
                            arg_orts = set_difference(arg2_format, arg1_format, UNPROVIDED, UNPROVIDED);
                            if (NIL != arg_orts) {
                                kbi_utilities.add_kbi_result(list($$arg2Format, arg_orts, $$arg1Format, mt));
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_inter_arg_isa_asymmetry_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject inter_arg12 = kb_accessors.inter_arg_isa1_2(predicate, UNPROVIDED);
                        SubLObject inter_arg21 = kb_accessors.inter_arg_isa2_1(predicate, UNPROVIDED);
                        SubLObject arg_orts = set_difference(inter_arg12, inter_arg21, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$interArgIsa1_2, arg_orts, $$interArgIsa2_1, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                        if (NIL == doneP) {
                            arg_orts = set_difference(inter_arg21, inter_arg12, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != arg_orts) {
                                kbi_utilities.add_kbi_result(list($$interArgIsa2_1, arg_orts, $$interArgIsa1_2, mt));
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_inter_arg_format_asymmetry_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject inter_arg12 = kb_accessors.inter_arg_format1_2(predicate, UNPROVIDED);
                        SubLObject inter_arg21 = kb_accessors.inter_arg_format2_1(predicate, UNPROVIDED);
                        SubLObject arg_orts = set_difference(inter_arg12, inter_arg21, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$interArgFormat1_2, arg_orts, $$interArgFormat2_1, mt));
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                        if (NIL == doneP) {
                            arg_orts = set_difference(inter_arg21, inter_arg12, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != arg_orts) {
                                kbi_utilities.add_kbi_result(list($$interArgFormat2_1, arg_orts, $$interArgFormat1_2, mt));
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $predicate_reflexive_wXo_accommodating_arg_isa_results$ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $predicate_reflexive_wXo_accommodating_arg_isa_time$ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $predicate_reflexive_wXo_accommodating_arg_isa_count$ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-COUNT*");

    /**
     * test reflexive PREDICATE for arg2 constraints not subsumed by arg1 constraints
     */
    public static final SubLObject predicate_reflexive_wXo_accommodating_arg_isaP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_27 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_predicate_reflexive_wXo_accommodating_arg_isa(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_27, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA applies to PREDICATE
     */
    public static final SubLObject why_predicate_reflexive_wXo_accommodating_arg_isaP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_29 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_predicate_reflexive_wXo_accommodating_arg_isa(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_29, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, predicate, data);
                            } else {
                                return list($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_predicate_reflexive_wXo_accommodating_arg_isaP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_predicate_reflexive_wXo_accommodating_arg_isaP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject arg1_predXarg1_isasXarg2_predXmt = NIL;
            for (arg1_predXarg1_isasXarg2_predXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg1_predXarg1_isasXarg2_predXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = arg1_predXarg1_isasXarg2_predXmt;
                    SubLObject current = datum;
                    SubLObject arg1_pred = NIL;
                    SubLObject arg1s = NIL;
                    SubLObject arg2_pred = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    arg1_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    arg1s = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    arg2_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt92);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt93$___s___isa___ReflexiveBinaryPredi, new SubLObject[]{ predicate, arg1_pred, string_utilities.stringify_items(arg1s, OBJECT_TO_STRING, $str_alt45$__, $str_alt94$_and_), arg2_pred, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt92);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_predicate_reflexive_wXo_accommodating_arg_isa(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.mts_of_fort_wrt_predicate_type(predicate, $$ArgTypePredicate, $list_alt76);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
                            kbi_arg_isa_not_subsumed_in_mt(predicate, ONE_INTEGER, TWO_INTEGER, mt);
                            if (NIL == doneP) {
                                kbi_arg_genl_not_subsumed_in_mt(predicate, ONE_INTEGER, TWO_INTEGER, mt);
                            }
                            if (NIL == doneP) {
                                kbi_inter_arg_isa_not_subsumed_in_mt(predicate, mt);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.nreverse_kbi_result();
        }
    }

    /**
     * invariant: every term admitted by arg-isa constraints as INFERIOR-ARG
     * should also be admitted as SUPERIOR-ARG
     */
    public static final SubLObject kbi_arg_isa_not_subsumed_in_mt(SubLObject predicate, SubLObject inferior_arg, SubLObject superior_arg, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_isa = genls.min_cols(kb_accessors.argn_isa(predicate, inferior_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg2_isa = genls.min_cols(kb_accessors.argn_isa(predicate, superior_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg_orts = genls.cols_awning(arg1_isa, arg2_isa, UNPROVIDED, UNPROVIDED);
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list(kb_accessors.arg_isa_pred(superior_arg, UNPROVIDED, UNPROVIDED), arg_orts, kb_accessors.arg_isa_pred(inferior_arg, UNPROVIDED, UNPROVIDED), mt));
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    /**
     * invariant: every term admitted by arg-genl constraints as INFERIOR-ARG
     * should also be admitted as SUPERIOR-ARG
     */
    public static final SubLObject kbi_arg_genl_not_subsumed_in_mt(SubLObject predicate, SubLObject inferior_arg, SubLObject superior_arg, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_isa = genls.min_cols(kb_accessors.argn_genl(predicate, inferior_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg2_isa = genls.min_cols(kb_accessors.argn_genl(predicate, superior_arg, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        SubLObject arg_orts = genls.cols_awning(arg1_isa, arg2_isa, UNPROVIDED, UNPROVIDED);
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list(kb_accessors.arg_genl_pred(superior_arg, UNPROVIDED, UNPROVIDED), arg_orts, kb_accessors.arg_genl_pred(inferior_arg, UNPROVIDED, UNPROVIDED), mt));
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    /**
     * invariant: every term admitted by inter-arg-isa constraints as INFERIOR-ARG
     * should also be admitted as SUPERIOR-ARG
     */
    public static final SubLObject kbi_inter_arg_isa_not_subsumed_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    {
                        SubLObject arg1_isa = kb_accessors.inter_arg_isa1_2(predicate, UNPROVIDED);
                        SubLObject arg2_isa = kb_accessors.inter_arg_isa2_1(predicate, UNPROVIDED);
                        SubLObject arg_orts = set_difference(arg1_isa, arg2_isa, symbol_function(EQUAL), UNPROVIDED);
                        if (NIL != arg_orts) {
                            kbi_utilities.add_kbi_result(list($$interArgIsa1_2, arg_orts, $$interArgIsa2_1, mt));
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test PREDICATE for #$genlPreds having arg-isa (e.g., #$arg1Isa ...) not satisfied by this predicate's arg-isa
     */
    public static final SubLObject genl_pred_arg_isa_not_subsumedP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($GENL_PRED_ARG_ISA_NOT_SUBSUMED)) && (NIL != kbi_utilities.kbi_applies_toP($GENL_PRED_ARG_ISA_NOT_SUBSUMED, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($GENL_PRED_ARG_ISA_NOT_SUBSUMED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_31 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_genl_pred_arg_isa_not_subsumedP(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_31, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($GENL_PRED_ARG_ISA_NOT_SUBSUMED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GENL-PRED-ARG-ISA-NOT-SUBSUMED applies to PREDICATE
     */
    public static final SubLObject why_genl_pred_arg_isa_not_subsumedP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($GENL_PRED_ARG_ISA_NOT_SUBSUMED, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_33 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_genl_pred_arg_isa_not_subsumedP(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_33, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($GENL_PRED_ARG_ISA_NOT_SUBSUMED, predicate, data);
                            } else {
                                return list($GENL_PRED_ARG_ISA_NOT_SUBSUMED, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_genl_pred_arg_isa_not_subsumedP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_genl_pred_arg_isa_not_subsumedP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject rel_predXgenl_predXnXgenl_arg_isaXarg_isaXmt = NIL;
            for (rel_predXgenl_predXnXgenl_arg_isaXarg_isaXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_predXgenl_predXnXgenl_arg_isaXarg_isaXmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = rel_predXgenl_predXnXgenl_arg_isaXarg_isaXmt;
                    SubLObject current = datum;
                    SubLObject rel_pred = NIL;
                    SubLObject genl_pred = NIL;
                    SubLObject n = NIL;
                    SubLObject genl_arg_isa = NIL;
                    SubLObject arg_isa = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    rel_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    genl_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    genl_arg_isa = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    arg_isa = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt105$___s_has__s__a____and_has__s__s_w, new SubLObject[]{ predicate, kb_accessors.arg_isa_pred(n, UNPROVIDED, UNPROVIDED), string_utilities.stringify_items(arg_isa, OBJECT_TO_STRING, $str_alt45$__, $str_alt94$_and_), rel_pred, genl_pred, kb_accessors.arg_isa_pred(n, UNPROVIDED, UNPROVIDED), genl_arg_isa, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt104);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_genl_pred_arg_isa_not_subsumedP(SubLObject predicate) {
        {
            SubLObject mts = remove_duplicates(append(genl_predicates.genl_predicate_mts(predicate), genl_predicates.genl_inverse_mts(predicate)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = mts;
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(predicate, $$Predicate, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(predicate)) {
                                genl_pred_arg_isa_not_subsumed_in_mt(predicate, ZERO_INTEGER, mt);
                            } else {
                                {
                                    SubLObject v_arity = arity.arity(predicate);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject end_var = number_utilities.f_1X(v_arity);
                                                SubLObject argnum = NIL;
                                                for (argnum = ONE_INTEGER; !((NIL != doneP) || argnum.numGE(end_var)); argnum = number_utilities.f_1X(argnum)) {
                                                    genl_pred_arg_isa_not_subsumed_in_mt(predicate, argnum, mt);
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject genl_pred_arg_isa_not_subsumed_in_mt(SubLObject predicate, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_constraints = kb_accessors.argn_isa(predicate, n, mt);
                SubLObject min_isa_constraints = NIL;
                if (NIL != isa_constraints) {
                    {
                        SubLObject doneP = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject cdolist_list_var = isa_constraints;
                                    SubLObject v_isa = NIL;
                                    for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), v_isa, mt, UNPROVIDED);
                                    }
                                    {
                                        SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlPreds))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                            {
                                                SubLObject node = function_terms.naut_to_nart(predicate);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        if (NIL != d_link) {
                                                            {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                if (NIL != mt_links) {
                                                                    {
                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject mt_36 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_36)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_36, thread);
                                                                                            {
                                                                                                SubLObject iteration_state_38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_38)))) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_38);
                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject rest = NIL;
                                                                                                                        for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                            {
                                                                                                                                SubLObject genl_pred = rest.first();
                                                                                                                                if (NIL == doneP) {
                                                                                                                                    {
                                                                                                                                        SubLObject csome_list_var = kb_accessors.argn_isa(genl_pred, n, mt);
                                                                                                                                        SubLObject isa_2 = NIL;
                                                                                                                                        for (isa_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_2 = csome_list_var.first()) {
                                                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(isa_2, UNPROVIDED)) {
                                                                                                                                                if (NIL == min_isa_constraints) {
                                                                                                                                                    min_isa_constraints = genls.min_cols(isa_constraints, mt, UNPROVIDED);
                                                                                                                                                }
                                                                                                                                                kbi_utilities.add_kbi_result(list($$genlPreds, genl_pred, n, isa_2, min_isa_constraints, mt));
                                                                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_39, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iteration_state_38 = dictionary_contents.do_dictionary_contents_next(iteration_state_38);
                                                                                                    }
                                                                                                } 
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_38);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_37, thread);
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
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        {
                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                            SubLObject rest = NIL;
                                                            for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                {
                                                                    SubLObject generating_fn = rest.first();
                                                                    {
                                                                        SubLObject _prev_bind_0_40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            {
                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                SubLObject new_list_41 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                SubLObject rest_42 = NIL;
                                                                                for (rest_42 = new_list_41; !((NIL != doneP) || (NIL == rest_42)); rest_42 = rest_42.rest()) {
                                                                                    {
                                                                                        SubLObject genl_pred = rest_42.first();
                                                                                        if (NIL == doneP) {
                                                                                            {
                                                                                                SubLObject csome_list_var = kb_accessors.argn_isa(genl_pred, n, mt);
                                                                                                SubLObject isa_2 = NIL;
                                                                                                for (isa_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_2 = csome_list_var.first()) {
                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(isa_2, UNPROVIDED)) {
                                                                                                        if (NIL == min_isa_constraints) {
                                                                                                            min_isa_constraints = genls.min_cols(isa_constraints, mt, UNPROVIDED);
                                                                                                        }
                                                                                                        kbi_utilities.add_kbi_result(list($$genlPreds, genl_pred, n, isa_2, min_isa_constraints, mt));
                                                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_40, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    {
                                        SubLObject m = (n.numE(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : n.numE(TWO_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : NIL;
                                        if (NIL != m) {
                                            {
                                                SubLObject _prev_bind_0_43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlInverse) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlInverse))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject node = function_terms.naut_to_nart(predicate);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            {
                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                if (NIL != d_link) {
                                                                    {
                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                        if (NIL != mt_links) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_44 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_44)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_44, thread);
                                                                                                    {
                                                                                                        SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)))) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject rest = NIL;
                                                                                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                    {
                                                                                                                                        SubLObject genl_inverse = rest.first();
                                                                                                                                        if (NIL == doneP) {
                                                                                                                                            {
                                                                                                                                                SubLObject csome_list_var = kb_accessors.argn_isa(genl_inverse, m, mt);
                                                                                                                                                SubLObject isa_2 = NIL;
                                                                                                                                                for (isa_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_2 = csome_list_var.first()) {
                                                                                                                                                    if (NIL == min_isa_constraints) {
                                                                                                                                                        min_isa_constraints = genls.min_cols(isa_constraints, mt, UNPROVIDED);
                                                                                                                                                    }
                                                                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(isa_2, UNPROVIDED)) {
                                                                                                                                                        kbi_utilities.add_kbi_result(list($$genlInverse, genl_inverse, n, isa_2, min_isa_constraints, mt));
                                                                                                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_47, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
                                                                                                            }
                                                                                                        } 
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_45, thread);
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
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                {
                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                    SubLObject rest = NIL;
                                                                    for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                        {
                                                                            SubLObject generating_fn = rest.first();
                                                                            {
                                                                                SubLObject _prev_bind_0_48 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    {
                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                        SubLObject new_list_49 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                        SubLObject rest_50 = NIL;
                                                                                        for (rest_50 = new_list_49; !((NIL != doneP) || (NIL == rest_50)); rest_50 = rest_50.rest()) {
                                                                                            {
                                                                                                SubLObject genl_inverse = rest_50.first();
                                                                                                if (NIL == doneP) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = kb_accessors.argn_isa(genl_inverse, m, mt);
                                                                                                        SubLObject isa_2 = NIL;
                                                                                                        for (isa_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , isa_2 = csome_list_var.first()) {
                                                                                                            if (NIL == min_isa_constraints) {
                                                                                                                min_isa_constraints = genls.min_cols(isa_constraints, mt, UNPROVIDED);
                                                                                                            }
                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(isa_2, UNPROVIDED)) {
                                                                                                                kbi_utilities.add_kbi_result(list($$genlInverse, genl_inverse, n, isa_2, min_isa_constraints, mt));
                                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_48, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test PREDICATE for #$genlPreds having arg-genl (e.g., #$arg1Isa ...) not satisfied by this predicate's arg-genl
     */
    public static final SubLObject genl_pred_arg_genl_not_subsumedP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($GENL_PRED_ARG_GENL_NOT_SUBSUMED)) && (NIL != kbi_utilities.kbi_applies_toP($GENL_PRED_ARG_GENL_NOT_SUBSUMED, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($GENL_PRED_ARG_GENL_NOT_SUBSUMED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_51 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_genl_pred_arg_genl_not_subsumedP(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_52, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_51, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($GENL_PRED_ARG_GENL_NOT_SUBSUMED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :GENL-PRED-ARG-GENL-NOT-SUBSUMED applies to PREDICATE
     */
    public static final SubLObject why_genl_pred_arg_genl_not_subsumedP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($GENL_PRED_ARG_GENL_NOT_SUBSUMED, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_53 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_genl_pred_arg_genl_not_subsumedP(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_54, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_53, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($GENL_PRED_ARG_GENL_NOT_SUBSUMED, predicate, data);
                            } else {
                                return list($GENL_PRED_ARG_GENL_NOT_SUBSUMED, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_genl_pred_arg_genl_not_subsumedP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_genl_pred_arg_genl_not_subsumedP(SubLObject predicate, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = $str_alt23$;
                SubLObject cdolist_list_var = data;
                SubLObject rel_predXgenl_predXnXgenl_arg_genlXarg_genlXmt = NIL;
                for (rel_predXgenl_predXnXgenl_arg_genlXarg_genlXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_predXgenl_predXnXgenl_arg_genlXarg_genlXmt = cdolist_list_var.first()) {
                    {
                        SubLObject datum = rel_predXgenl_predXnXgenl_arg_genlXarg_genlXmt;
                        SubLObject current = datum;
                        SubLObject rel_pred = NIL;
                        SubLObject genl_pred = NIL;
                        SubLObject n = NIL;
                        SubLObject genl_arg_genl = NIL;
                        SubLObject arg_genl = NIL;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        rel_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        genl_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        n = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        genl_arg_genl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        arg_genl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt118);
                        mt = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt119$___s_has__s__a_____and_has__s__s_, new SubLObject[]{ predicate, kb_accessors.arg_genl_pred(n, UNPROVIDED, UNPROVIDED), string_utilities.stringify_items(arg_genl, OBJECT_TO_STRING, $str_alt45$__, $str_alt94$_and_), rel_pred, genl_pred, kb_accessors.arg_genl_pred(n, UNPROVIDED, UNPROVIDED), genl_arg_genl, mt }));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt118);
                        }
                    }
                }
                return nl_result;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_genl_pred_arg_genl_not_subsumedP(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = nconc(genl_predicates.genl_predicate_forward_mts(predicate), genl_predicates.genl_inverse_backward_mts(predicate));
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(predicate, $$Predicate, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(predicate)) {
                                genl_pred_arg_genl_not_subsumed_in_mt(predicate, ZERO_INTEGER, mt);
                            } else {
                                {
                                    SubLObject v_arity = arity.arity(predicate);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject end_var = number_utilities.f_1X(v_arity);
                                                SubLObject argnum = NIL;
                                                for (argnum = ONE_INTEGER; !((NIL != doneP) || argnum.numGE(end_var)); argnum = number_utilities.f_1X(argnum)) {
                                                    genl_pred_arg_genl_not_subsumed_in_mt(predicate, argnum, mt);
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject genl_pred_arg_genl_not_subsumed_in_mt(SubLObject predicate, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genl_constraints = kb_accessors.argn_genl(predicate, n, mt);
                SubLObject min_genl_constraints = NIL;
                if (NIL != genl_constraints) {
                    {
                        SubLObject doneP = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                mt_relevance_macros.$mt$.bind(mt, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject cdolist_list_var = genl_constraints;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), genl, mt, UNPROVIDED);
                                    }
                                    {
                                        SubLObject _prev_bind_0_55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlPreds))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                            {
                                                SubLObject node = function_terms.naut_to_nart(predicate);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        if (NIL != d_link) {
                                                            {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                if (NIL != mt_links) {
                                                                    {
                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject mt_56 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_56)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_56, thread);
                                                                                            {
                                                                                                SubLObject iteration_state_58 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_58)))) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_58);
                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject rest = NIL;
                                                                                                                        for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                            {
                                                                                                                                SubLObject genl_pred = rest.first();
                                                                                                                                if (NIL == doneP) {
                                                                                                                                    {
                                                                                                                                        SubLObject csome_list_var = kb_accessors.argn_genl(genl_pred, n, mt);
                                                                                                                                        SubLObject genl_2 = NIL;
                                                                                                                                        for (genl_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl_2 = csome_list_var.first()) {
                                                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl_2, UNPROVIDED)) {
                                                                                                                                                if (NIL == min_genl_constraints) {
                                                                                                                                                    min_genl_constraints = genls.min_cols(genl_constraints, mt, UNPROVIDED);
                                                                                                                                                }
                                                                                                                                                kbi_utilities.add_kbi_result(list($$genlPreds, genl_pred, n, genl_2, min_genl_constraints, mt));
                                                                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_59, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iteration_state_58 = dictionary_contents.do_dictionary_contents_next(iteration_state_58);
                                                                                                    }
                                                                                                } 
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_58);
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_57, thread);
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
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        {
                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                            SubLObject rest = NIL;
                                                            for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                {
                                                                    SubLObject generating_fn = rest.first();
                                                                    {
                                                                        SubLObject _prev_bind_0_60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            {
                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                SubLObject new_list_61 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                SubLObject rest_62 = NIL;
                                                                                for (rest_62 = new_list_61; !((NIL != doneP) || (NIL == rest_62)); rest_62 = rest_62.rest()) {
                                                                                    {
                                                                                        SubLObject genl_pred = rest_62.first();
                                                                                        if (NIL == doneP) {
                                                                                            {
                                                                                                SubLObject csome_list_var = kb_accessors.argn_genl(genl_pred, n, mt);
                                                                                                SubLObject genl_2 = NIL;
                                                                                                for (genl_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl_2 = csome_list_var.first()) {
                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl_2, UNPROVIDED)) {
                                                                                                        if (NIL == min_genl_constraints) {
                                                                                                            min_genl_constraints = genls.min_cols(genl_constraints, mt, UNPROVIDED);
                                                                                                        }
                                                                                                        kbi_utilities.add_kbi_result(list($$genlPreds, genl_pred, n, genl_2, min_genl_constraints, mt));
                                                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
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
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_55, thread);
                                        }
                                    }
                                    {
                                        SubLObject m = (n.numE(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : n.numE(TWO_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : NIL;
                                        if (NIL != m) {
                                            {
                                                SubLObject _prev_bind_0_63 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlInverse) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlInverse))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject node = function_terms.naut_to_nart(predicate);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            {
                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                if (NIL != d_link) {
                                                                    {
                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                        if (NIL != mt_links) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_64 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_64)) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_65 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_64, thread);
                                                                                                    {
                                                                                                        SubLObject iteration_state_66 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_66)))) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            {
                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_66);
                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_67 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                            {
                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject rest = NIL;
                                                                                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                    {
                                                                                                                                        SubLObject genl_inverse = rest.first();
                                                                                                                                        if (NIL == doneP) {
                                                                                                                                            {
                                                                                                                                                SubLObject csome_list_var = kb_accessors.argn_genl(genl_inverse, m, mt);
                                                                                                                                                SubLObject genl_2 = NIL;
                                                                                                                                                for (genl_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl_2 = csome_list_var.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl_2, UNPROVIDED)) {
                                                                                                                                                        if (NIL == min_genl_constraints) {
                                                                                                                                                            min_genl_constraints = genls.min_cols(genl_constraints, mt, UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                        kbi_utilities.add_kbi_result(list($$genlInverse, genl_inverse, n, genl_2, genl_constraints, mt));
                                                                                                                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_67, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                iteration_state_66 = dictionary_contents.do_dictionary_contents_next(iteration_state_66);
                                                                                                            }
                                                                                                        } 
                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_66);
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_65, thread);
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
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                {
                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                    SubLObject rest = NIL;
                                                                    for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                        {
                                                                            SubLObject generating_fn = rest.first();
                                                                            {
                                                                                SubLObject _prev_bind_0_68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    {
                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                        SubLObject new_list_69 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                        SubLObject rest_70 = NIL;
                                                                                        for (rest_70 = new_list_69; !((NIL != doneP) || (NIL == rest_70)); rest_70 = rest_70.rest()) {
                                                                                            {
                                                                                                SubLObject genl_inverse = rest_70.first();
                                                                                                if (NIL == doneP) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = kb_accessors.argn_genl(genl_inverse, m, mt);
                                                                                                        SubLObject genl_2 = NIL;
                                                                                                        for (genl_2 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl_2 = csome_list_var.first()) {
                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl_2, UNPROVIDED)) {
                                                                                                                if (NIL == min_genl_constraints) {
                                                                                                                    min_genl_constraints = genls.min_cols(genl_constraints, mt, UNPROVIDED);
                                                                                                                }
                                                                                                                kbi_utilities.add_kbi_result(list($$genlInverse, genl_inverse, n, genl_2, genl_constraints, mt));
                                                                                                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_68, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_63, thread);
                                                }
                                            }
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test PREDICATE for having arg-isa (e.g., #$arg1Isa ...) not satisfied by the arg-isa of spec-preds
     */
    public static final SubLObject spec_pred_arg_isa_not_subsumedP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SPEC_PRED_ARG_ISA_NOT_SUBSUMED)) && (NIL != kbi_utilities.kbi_applies_toP($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SPEC_PRED_ARG_ISA_NOT_SUBSUMED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_71 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_spec_pred_arg_isa_not_subsumedP(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_72, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_71, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SPEC-PRED-ARG-ISA-NOT-SUBSUMED applies to PREDICATE
     */
    public static final SubLObject why_spec_pred_arg_isa_not_subsumedP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_73 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_spec_pred_arg_isa_not_subsumedP(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_74 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_73, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, predicate, data);
                            } else {
                                return list($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_spec_pred_arg_isa_not_subsumedP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_spec_pred_arg_isa_not_subsumedP(SubLObject predicate, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = $str_alt23$;
                SubLObject cdolist_list_var = data;
                SubLObject rel_predXspec_predXnXmXarg_isaXspec_arg_isaXmt = NIL;
                for (rel_predXspec_predXnXmXarg_isaXspec_arg_isaXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_predXspec_predXnXmXarg_isaXspec_arg_isaXmt = cdolist_list_var.first()) {
                    {
                        SubLObject spec_pred_string = NIL;
                        SubLObject datum = rel_predXspec_predXnXmXarg_isaXspec_arg_isaXmt;
                        SubLObject current = datum;
                        SubLObject rel_pred = NIL;
                        SubLObject spec_pred = NIL;
                        SubLObject n = NIL;
                        SubLObject m = NIL;
                        SubLObject arg_isa = NIL;
                        SubLObject spec_arg_isa = NIL;
                        SubLObject mt = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        rel_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        spec_pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        n = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        m = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        arg_isa = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        spec_arg_isa = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt128);
                        mt = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pcase_var = rel_pred;
                                if (pcase_var.eql($$genlPreds)) {
                                    spec_pred_string = $$$spec_pred;
                                } else
                                    if (pcase_var.eql($$genlInverse)) {
                                        spec_pred_string = $$$spec_inverse;
                                    }

                            }
                            nl_result = cconcatenate(nl_result, format(NIL, $str_alt131$___s_has__s__s____which_is_not_su, new SubLObject[]{ predicate, kb_accessors.arg_isa_pred(n, UNPROVIDED, UNPROVIDED), arg_isa, kb_accessors.arg_isa_pred(m, UNPROVIDED, UNPROVIDED), spec_pred_string, spec_pred, string_utilities.stringify_items(spec_arg_isa, OBJECT_TO_STRING, $str_alt45$__, $str_alt94$_and_), mt }));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt128);
                        }
                    }
                }
                return nl_result;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_spec_pred_arg_isa_not_subsumedP(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = append(genl_predicates.genl_predicate_mts(predicate), genl_predicates.genl_inverse_mts(predicate));
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(predicate, $$Predicate, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(predicate)) {
                                spec_pred_arg_isa_not_subsumed_in_mt(predicate, ZERO_INTEGER, mt);
                            } else {
                                {
                                    SubLObject v_arity = arity.arity(predicate);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject end_var = number_utilities.f_1X(v_arity);
                                                SubLObject argnum = NIL;
                                                for (argnum = ONE_INTEGER; !((NIL != doneP) || argnum.numGE(end_var)); argnum = number_utilities.f_1X(argnum)) {
                                                    spec_pred_arg_isa_not_subsumed_in_mt(predicate, argnum, mt);
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject spec_pred_arg_isa_not_subsumed_in_mt(SubLObject predicate, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isa_constraints = kb_accessors.argn_isa(predicate, n, mt);
                SubLObject doneP = NIL;
                if (NIL != isa_constraints) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            {
                                SubLObject _prev_bind_0_75 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlPreds))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject node = function_terms.naut_to_nart(predicate);
                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                            {
                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                if (NIL != d_link) {
                                                    {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        if (NIL != mt_links) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt_76 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_76)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_77 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_76, thread);
                                                                                    {
                                                                                        SubLObject iteration_state_78 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_78)))) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_78);
                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                SubLObject rest = NIL;
                                                                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                    {
                                                                                                                        SubLObject spec_pred = rest.first();
                                                                                                                        SubLObject isa_constraints_2 = kb_accessors.argn_isa(spec_pred, n, mt);
                                                                                                                        SubLObject min_isa_constraints_2 = NIL;
                                                                                                                        if (NIL != isa_constraints_2) {
                                                                                                                            {
                                                                                                                                SubLObject doneP_80 = NIL;
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_81 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                                        {
                                                                                                                                            SubLObject cdolist_list_var = isa_constraints_2;
                                                                                                                                            SubLObject isa_2 = NIL;
                                                                                                                                            for (isa_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_2 = cdolist_list_var.first()) {
                                                                                                                                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), isa_2, mt, UNPROVIDED);
                                                                                                                                            }
                                                                                                                                            if (NIL == doneP_80) {
                                                                                                                                                {
                                                                                                                                                    SubLObject csome_list_var = isa_constraints;
                                                                                                                                                    SubLObject v_isa = NIL;
                                                                                                                                                    for (v_isa = csome_list_var.first(); !((NIL != doneP_80) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                                                                                                                                                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(v_isa, UNPROVIDED)) {
                                                                                                                                                            if (NIL == min_isa_constraints_2) {
                                                                                                                                                                min_isa_constraints_2 = genls.min_cols(isa_constraints_2, mt, UNPROVIDED);
                                                                                                                                                            }
                                                                                                                                                            kbi_utilities.add_kbi_result(list($$genlPreds, spec_pred, n, n, v_isa, min_isa_constraints_2, mt));
                                                                                                                                                            doneP_80 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_81, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_79, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iteration_state_78 = dictionary_contents.do_dictionary_contents_next(iteration_state_78);
                                                                                            }
                                                                                        } 
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_78);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_77, thread);
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
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else
                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                {
                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    SubLObject rest = NIL;
                                                    for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                        {
                                                            SubLObject generating_fn = rest.first();
                                                            {
                                                                SubLObject _prev_bind_0_82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                        SubLObject new_list_83 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                        SubLObject rest_84 = NIL;
                                                                        for (rest_84 = new_list_83; !((NIL != doneP) || (NIL == rest_84)); rest_84 = rest_84.rest()) {
                                                                            {
                                                                                SubLObject spec_pred = rest_84.first();
                                                                                SubLObject isa_constraints_2 = kb_accessors.argn_isa(spec_pred, n, mt);
                                                                                SubLObject min_isa_constraints_2 = NIL;
                                                                                if (NIL != isa_constraints_2) {
                                                                                    {
                                                                                        SubLObject doneP_85 = NIL;
                                                                                        {
                                                                                            SubLObject _prev_bind_0_86 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = isa_constraints_2;
                                                                                                    SubLObject isa_2 = NIL;
                                                                                                    for (isa_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_2 = cdolist_list_var.first()) {
                                                                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), isa_2, mt, UNPROVIDED);
                                                                                                    }
                                                                                                    if (NIL == doneP_85) {
                                                                                                        {
                                                                                                            SubLObject csome_list_var = isa_constraints;
                                                                                                            SubLObject v_isa = NIL;
                                                                                                            for (v_isa = csome_list_var.first(); !((NIL != doneP_85) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                                                                                                                if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(v_isa, UNPROVIDED)) {
                                                                                                                    if (NIL == min_isa_constraints_2) {
                                                                                                                        min_isa_constraints_2 = genls.min_cols(isa_constraints_2, mt, UNPROVIDED);
                                                                                                                    }
                                                                                                                    kbi_utilities.add_kbi_result(list($$genlPreds, spec_pred, n, n, v_isa, min_isa_constraints_2, mt));
                                                                                                                    doneP_85 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_86, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_82, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_75, thread);
                                }
                            }
                            if (NIL == doneP) {
                                {
                                    SubLObject m = (n.numE(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : n.numE(TWO_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : NIL;
                                    if (NIL != m) {
                                        {
                                            SubLObject _prev_bind_0_87 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlInverse) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlInverse))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject node = function_terms.naut_to_nart(predicate);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                            if (NIL != d_link) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                    if (NIL != mt_links) {
                                                                        {
                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                            while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject mt_88 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_88)) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_89 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_88, thread);
                                                                                                {
                                                                                                    SubLObject iteration_state_90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_90)))) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_90);
                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject rest = NIL;
                                                                                                                            for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject spec_pred = rest.first();
                                                                                                                                    SubLObject isa_constraints_2 = kb_accessors.argn_isa(spec_pred, m, mt);
                                                                                                                                    SubLObject min_isa_constraints_2 = NIL;
                                                                                                                                    if (NIL != isa_constraints_2) {
                                                                                                                                        {
                                                                                                                                            SubLObject doneP_92 = NIL;
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_93 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject cdolist_list_var = isa_constraints_2;
                                                                                                                                                        SubLObject isa_2 = NIL;
                                                                                                                                                        for (isa_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_2 = cdolist_list_var.first()) {
                                                                                                                                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), isa_2, mt, UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                        if (NIL == doneP_92) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject csome_list_var = isa_constraints;
                                                                                                                                                                SubLObject v_isa = NIL;
                                                                                                                                                                for (v_isa = csome_list_var.first(); !((NIL != doneP_92) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                                                                                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(v_isa, UNPROVIDED)) {
                                                                                                                                                                        if (NIL == min_isa_constraints_2) {
                                                                                                                                                                            min_isa_constraints_2 = genls.min_cols(isa_constraints_2, mt, UNPROVIDED);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    kbi_utilities.add_kbi_result(list($$genlInverse, spec_pred, n, m, v_isa, isa_constraints_2, mt));
                                                                                                                                                                    doneP_92 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_93, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_91, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            iteration_state_90 = dictionary_contents.do_dictionary_contents_next(iteration_state_90);
                                                                                                        }
                                                                                                    } 
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_90);
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_89, thread);
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
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            {
                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                SubLObject rest = NIL;
                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                    {
                                                                        SubLObject generating_fn = rest.first();
                                                                        {
                                                                            SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                {
                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                    SubLObject new_list_95 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                    SubLObject rest_96 = NIL;
                                                                                    for (rest_96 = new_list_95; !((NIL != doneP) || (NIL == rest_96)); rest_96 = rest_96.rest()) {
                                                                                        {
                                                                                            SubLObject spec_pred = rest_96.first();
                                                                                            SubLObject isa_constraints_2 = kb_accessors.argn_isa(spec_pred, m, mt);
                                                                                            SubLObject min_isa_constraints_2 = NIL;
                                                                                            if (NIL != isa_constraints_2) {
                                                                                                {
                                                                                                    SubLObject doneP_97 = NIL;
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_98 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = isa_constraints_2;
                                                                                                                SubLObject isa_2 = NIL;
                                                                                                                for (isa_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , isa_2 = cdolist_list_var.first()) {
                                                                                                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), isa_2, mt, UNPROVIDED);
                                                                                                                }
                                                                                                                if (NIL == doneP_97) {
                                                                                                                    {
                                                                                                                        SubLObject csome_list_var = isa_constraints;
                                                                                                                        SubLObject v_isa = NIL;
                                                                                                                        for (v_isa = csome_list_var.first(); !((NIL != doneP_97) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_isa = csome_list_var.first()) {
                                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(v_isa, UNPROVIDED)) {
                                                                                                                                if (NIL == min_isa_constraints_2) {
                                                                                                                                    min_isa_constraints_2 = genls.min_cols(isa_constraints_2, mt, UNPROVIDED);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            kbi_utilities.add_kbi_result(list($$genlInverse, spec_pred, n, m, v_isa, isa_constraints_2, mt));
                                                                                                                            doneP_97 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_98, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_94, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_87, thread);
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
            }
            return kbi_utilities.kbi_result();
        }
    }







    /**
     * test PREDICATE for having arg-genl (e.g., #$arg1Genl ...) not satisfied by the arg-genl of spec-preds
     */
    public static final SubLObject spec_pred_arg_genl_not_subsumedP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($SPEC_PRED_ARG_GENL_NOT_SUBSUMED)) && (NIL != kbi_utilities.kbi_applies_toP($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($SPEC_PRED_ARG_GENL_NOT_SUBSUMED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_99 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_spec_pred_arg_genl_not_subsumedP(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_100, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_99, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :SPEC-PRED-ARG-GENL-NOT-SUBSUMED applies to PREDICATE
     */
    public static final SubLObject why_spec_pred_arg_genl_not_subsumedP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_101 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_spec_pred_arg_genl_not_subsumedP(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_102 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_102, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_101, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, predicate, data);
                            } else {
                                return list($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_spec_pred_arg_genl_not_subsumedP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_spec_pred_arg_genl_not_subsumedP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject rel_predXspec_predXnXmXarg_genlXspec_arg_genlXmt = NIL;
            for (rel_predXspec_predXnXmXarg_genlXspec_arg_genlXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rel_predXspec_predXnXmXarg_genlXspec_arg_genlXmt = cdolist_list_var.first()) {
                {
                    SubLObject spec_pred_string = NIL;
                    SubLObject datum = rel_predXspec_predXnXmXarg_genlXspec_arg_genlXmt;
                    SubLObject current = datum;
                    SubLObject rel_pred = NIL;
                    SubLObject spec_pred = NIL;
                    SubLObject n = NIL;
                    SubLObject m = NIL;
                    SubLObject arg_genl = NIL;
                    SubLObject spec_arg_genl = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    rel_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    spec_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    m = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    arg_genl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    spec_arg_genl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt140);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject pcase_var = rel_pred;
                            if (pcase_var.eql($$genlPreds)) {
                                spec_pred_string = $$$spec_pred;
                            } else
                                if (pcase_var.eql($$genlInverse)) {
                                    spec_pred_string = $$$spec_inverse;
                                }

                        }
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt141$___s_has__s__s_____which_is_not_s, new SubLObject[]{ predicate, kb_accessors.arg_genl_pred(n, UNPROVIDED, UNPROVIDED), arg_genl, kb_accessors.arg_genl_pred(m, UNPROVIDED, UNPROVIDED), spec_pred_string, spec_pred, string_utilities.stringify_items(spec_arg_genl, OBJECT_TO_STRING, $str_alt45$__, $str_alt94$_and_), mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt140);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_spec_pred_arg_genl_not_subsumedP(SubLObject predicate) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = nconc(genl_predicates.genl_predicate_backward_mts(predicate), genl_predicates.genl_inverse_backward_mts(predicate));
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(predicate, $$Predicate, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(predicate)) {
                                spec_pred_arg_genl_not_subsumed_in_mt(predicate, ZERO_INTEGER, mt);
                            } else {
                                {
                                    SubLObject v_arity = arity.arity(predicate);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject end_var = number_utilities.f_1X(v_arity);
                                                SubLObject argnum = NIL;
                                                for (argnum = ONE_INTEGER; !((NIL != doneP) || argnum.numGE(end_var)); argnum = number_utilities.f_1X(argnum)) {
                                                    spec_pred_arg_genl_not_subsumed_in_mt(predicate, argnum, mt);
                                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject spec_pred_arg_genl_not_subsumed_in_mt(SubLObject predicate, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject genl_constraints = kb_accessors.argn_genl(predicate, n, mt);
                SubLObject doneP = NIL;
                if (NIL != genl_constraints) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            {
                                SubLObject _prev_bind_0_103 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlPreds) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlPreds))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject node = function_terms.naut_to_nart(predicate);
                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                            {
                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                if (NIL != d_link) {
                                                    {
                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        if (NIL != mt_links) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt_104 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_104)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_104, thread);
                                                                                    {
                                                                                        SubLObject iteration_state_106 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                        while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_106)))) {
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_106);
                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_107 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                SubLObject rest = NIL;
                                                                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                    {
                                                                                                                        SubLObject spec_pred = rest.first();
                                                                                                                        SubLObject genl_constraints_2 = kb_accessors.argn_genl(spec_pred, n, mt);
                                                                                                                        SubLObject min_genl_constraints_2 = NIL;
                                                                                                                        if (NIL != genl_constraints_2) {
                                                                                                                            {
                                                                                                                                SubLObject doneP_108 = NIL;
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_109 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                                        {
                                                                                                                                            SubLObject cdolist_list_var = genl_constraints_2;
                                                                                                                                            SubLObject genl_2 = NIL;
                                                                                                                                            for (genl_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_2 = cdolist_list_var.first()) {
                                                                                                                                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_2, mt, UNPROVIDED);
                                                                                                                                            }
                                                                                                                                            if (NIL == doneP_108) {
                                                                                                                                                {
                                                                                                                                                    SubLObject csome_list_var = genl_constraints;
                                                                                                                                                    SubLObject genl = NIL;
                                                                                                                                                    for (genl = csome_list_var.first(); !((NIL != doneP_108) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                                                                                                                                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl, UNPROVIDED)) {
                                                                                                                                                            if (NIL == min_genl_constraints_2) {
                                                                                                                                                                min_genl_constraints_2 = genls.min_cols(genl_constraints_2, mt, UNPROVIDED);
                                                                                                                                                            }
                                                                                                                                                            kbi_utilities.add_kbi_result(list($$genlPreds, spec_pred, n, n, genl, min_genl_constraints_2, mt));
                                                                                                                                                            doneP_108 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_109, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_107, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iteration_state_106 = dictionary_contents.do_dictionary_contents_next(iteration_state_106);
                                                                                            }
                                                                                        } 
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_106);
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_105, thread);
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
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        } else
                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                {
                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlPreds)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    SubLObject rest = NIL;
                                                    for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                        {
                                                            SubLObject generating_fn = rest.first();
                                                            {
                                                                SubLObject _prev_bind_0_110 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                        SubLObject new_list_111 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                        SubLObject rest_112 = NIL;
                                                                        for (rest_112 = new_list_111; !((NIL != doneP) || (NIL == rest_112)); rest_112 = rest_112.rest()) {
                                                                            {
                                                                                SubLObject spec_pred = rest_112.first();
                                                                                SubLObject genl_constraints_2 = kb_accessors.argn_genl(spec_pred, n, mt);
                                                                                SubLObject min_genl_constraints_2 = NIL;
                                                                                if (NIL != genl_constraints_2) {
                                                                                    {
                                                                                        SubLObject doneP_113 = NIL;
                                                                                        {
                                                                                            SubLObject _prev_bind_0_114 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                {
                                                                                                    SubLObject cdolist_list_var = genl_constraints_2;
                                                                                                    SubLObject genl_2 = NIL;
                                                                                                    for (genl_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_2 = cdolist_list_var.first()) {
                                                                                                        sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_2, mt, UNPROVIDED);
                                                                                                    }
                                                                                                    if (NIL == doneP_113) {
                                                                                                        {
                                                                                                            SubLObject csome_list_var = genl_constraints;
                                                                                                            SubLObject genl = NIL;
                                                                                                            for (genl = csome_list_var.first(); !((NIL != doneP_113) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                                                                                                if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl, UNPROVIDED)) {
                                                                                                                    if (NIL == min_genl_constraints_2) {
                                                                                                                        min_genl_constraints_2 = genls.min_cols(genl_constraints_2, mt, UNPROVIDED);
                                                                                                                    }
                                                                                                                    kbi_utilities.add_kbi_result(list($$genlPreds, spec_pred, n, n, genl, min_genl_constraints_2, mt));
                                                                                                                    doneP_113 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_114, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_110, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }

                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_103, thread);
                                }
                            }
                            if (NIL == doneP) {
                                {
                                    SubLObject m = (n.numE(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : n.numE(TWO_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : NIL;
                                    if (NIL != m) {
                                        {
                                            SubLObject _prev_bind_0_115 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genlInverse) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genlInverse))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject node = function_terms.naut_to_nart(predicate);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                            if (NIL != d_link) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                    if (NIL != mt_links) {
                                                                        {
                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                            while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject mt_116 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_116)) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_117 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_116, thread);
                                                                                                {
                                                                                                    SubLObject iteration_state_118 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                    while (!((NIL != doneP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_118)))) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_118);
                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_119 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject rest = NIL;
                                                                                                                            for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                                                                                {
                                                                                                                                    SubLObject spec_pred = rest.first();
                                                                                                                                    SubLObject genl_constraints_2 = kb_accessors.argn_genl(spec_pred, m, mt);
                                                                                                                                    SubLObject min_genl_constraints_2 = NIL;
                                                                                                                                    if (NIL != genl_constraints_2) {
                                                                                                                                        {
                                                                                                                                            SubLObject doneP_120 = NIL;
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_121 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject cdolist_list_var = genl_constraints_2;
                                                                                                                                                        SubLObject genl_2 = NIL;
                                                                                                                                                        for (genl_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_2 = cdolist_list_var.first()) {
                                                                                                                                                            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_2, mt, UNPROVIDED);
                                                                                                                                                        }
                                                                                                                                                        if (NIL == doneP_120) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject csome_list_var = genl_constraints;
                                                                                                                                                                SubLObject genl = NIL;
                                                                                                                                                                for (genl = csome_list_var.first(); !((NIL != doneP_120) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                                                                                                                                                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl, UNPROVIDED)) {
                                                                                                                                                                        if (NIL == min_genl_constraints_2) {
                                                                                                                                                                            min_genl_constraints_2 = genls.min_cols(genl_constraints_2, mt, UNPROVIDED);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    kbi_utilities.add_kbi_result(list($$genlInverse, spec_pred, n, m, genl, genl_constraints_2, mt));
                                                                                                                                                                    doneP_120 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_121, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_119, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            iteration_state_118 = dictionary_contents.do_dictionary_contents_next(iteration_state_118);
                                                                                                        }
                                                                                                    } 
                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_118);
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_117, thread);
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
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt108$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            {
                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genlInverse)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module($$genlInverse));
                                                                SubLObject rest = NIL;
                                                                for (rest = new_list; !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                    {
                                                                        SubLObject generating_fn = rest.first();
                                                                        {
                                                                            SubLObject _prev_bind_0_122 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                {
                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                    SubLObject new_list_123 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                    SubLObject rest_124 = NIL;
                                                                                    for (rest_124 = new_list_123; !((NIL != doneP) || (NIL == rest_124)); rest_124 = rest_124.rest()) {
                                                                                        {
                                                                                            SubLObject spec_pred = rest_124.first();
                                                                                            SubLObject genl_constraints_2 = kb_accessors.argn_genl(spec_pred, m, mt);
                                                                                            SubLObject min_genl_constraints_2 = NIL;
                                                                                            if (NIL != genl_constraints_2) {
                                                                                                {
                                                                                                    SubLObject doneP_125 = NIL;
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_126 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                                                            {
                                                                                                                SubLObject cdolist_list_var = genl_constraints_2;
                                                                                                                SubLObject genl_2 = NIL;
                                                                                                                for (genl_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_2 = cdolist_list_var.first()) {
                                                                                                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), genl_2, mt, UNPROVIDED);
                                                                                                                }
                                                                                                                if (NIL == doneP_125) {
                                                                                                                    {
                                                                                                                        SubLObject csome_list_var = genl_constraints;
                                                                                                                        SubLObject genl = NIL;
                                                                                                                        for (genl = csome_list_var.first(); !((NIL != doneP_125) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , genl = csome_list_var.first()) {
                                                                                                                            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(genl, UNPROVIDED)) {
                                                                                                                                if (NIL == min_genl_constraints_2) {
                                                                                                                                    min_genl_constraints_2 = genls.min_cols(genl_constraints_2, mt, UNPROVIDED);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            kbi_utilities.add_kbi_result(list($$genlInverse, spec_pred, n, m, genl, genl_constraints_2, mt));
                                                                                                                            doneP_125 = kbi_utilities.kbi_doneP(UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_126, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_122, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_115, thread);
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
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $rule_macro_predicate_wXo_expansion_results$ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-RESULTS*");

    // defparameter
    public static final SubLSymbol $rule_macro_predicate_wXo_expansion_time$ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-TIME*");

    // defparameter
    public static final SubLSymbol $rule_macro_predicate_wXo_expansion_count$ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-COUNT*");

    /**
     * verify rule macro PREDICATE has an #$expansion.
     */
    public static final SubLObject rule_macro_predicate_wXo_expansionP(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION)) && (NIL != kbi_utilities.kbi_applies_toP($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, predicate))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0 = kbi_macros.$kbi_doneP_fn$.currentBinding(thread);
                            SubLObject _prev_bind_1 = kbi_macros.$kbi_booleanP$.currentBinding(thread);
                            SubLObject _prev_bind_2 = kbi_macros.$kbi_result$.currentBinding(thread);
                            try {
                                kbi_macros.$kbi_doneP_fn$.bind(symbol_function(KBI_DONE_IF_ANY_RESULT), thread);
                                kbi_macros.$kbi_booleanP$.bind(T, thread);
                                kbi_macros.$kbi_result$.bind(NIL, thread);
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_127 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_rule_macro_predicate_wXo_expansion(predicate);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_128, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_127, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                    }
                                }
                            } finally {
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RULE-MACRO-PREDICATE-W/O-EXPANSION applies to PREDICATE
     */
    public static final SubLObject why_rule_macro_predicate_wXo_expansionP(SubLObject predicate, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, predicate)) {
                {
                    SubLObject data = NIL;
                    {
                        SubLObject _prev_bind_0 = kbi_macros.$kbi_result$.currentBinding(thread);
                        try {
                            kbi_macros.$kbi_result$.bind(NIL, thread);
                            {
                                SubLObject error_message = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_129 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_rule_macro_predicate_wXo_expansion(predicate);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_130, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_129, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                if (NIL != error_message) {
                                    kbi_macros.$kbi_errors$.setDynamicValue(cons(list($KBI_ERROR, kbi_macros.$kbi_module$.getDynamicValue(thread), kbi_macros.$kbi_arg$.getDynamicValue(thread), error_message), kbi_macros.$kbi_errors$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, predicate, data);
                            } else {
                                return list($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, predicate);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_rule_macro_predicate_wXo_expansionP(predicate, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_rule_macro_predicate_wXo_expansionP(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, format(NIL, $str_alt150$___s___isa___RuleMacroPredicate_w, predicate, mt));
                {
                    SubLObject nl_suggest = kbi_nl_rule_macro_predicate_wXo_expansion_suggest_in_mt(predicate, mt);
                    if (nl_suggest.isString()) {
                        nl_result = cconcatenate(nl_result, nl_suggest);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_el_why_rule_macro_predicate_wXo_expansionP(SubLObject predicate, SubLObject data) {
        {
            SubLObject el_result = NIL;
            SubLObject cdolist_list_var = data;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                el_result = append(el_result, list($$ist, mt, list($$and, listS($$isa, predicate, $list_alt154), list($$unknownSentence, listS($$expansion, predicate, $list_alt157)))));
            }
            if (NIL != el_result) {
                if (NIL == list_utilities.singletonP(el_result)) {
                    el_result = simplifier.disjoin(el_result, UNPROVIDED);
                }
            }
            return el_result;
        }
    }

    public static final SubLObject kbi_nl_rule_macro_predicate_wXo_expansion_suggest(SubLObject predicate, SubLObject data) {
        {
            SubLObject nl_result = $str_alt23$;
            SubLObject cdolist_list_var = data;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                nl_result = cconcatenate(nl_result, kbi_nl_rule_macro_predicate_wXo_expansion_suggest_in_mt(predicate, mt));
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_nl_rule_macro_predicate_wXo_expansion_suggest_in_mt(SubLObject predicate, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject expansion = suggest_rule_macro_predicate_expansion_from_expansion_axiom_in_mt(predicate, mt);
                SubLObject expansion_mt = thread.secondMultipleValue();
                SubLObject supports = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject nl_suggest = format(NIL, $str_alt158$____Consider_asserting___________, new SubLObject[]{ expansion_mt, predicate, expansion });
                    if (NIL != supports) {
                        nl_suggest = cconcatenate(nl_suggest, format(NIL, $str_alt159$________motivated_by___________a, string_utilities.stringify_items(supports, ASSERTION_FI_IST_FORMULA, $str_alt161$__________, UNPROVIDED)));
                    }
                    return nl_suggest;
                }
            }
        }
    }

    public static final SubLObject kbi_el_rule_macro_predicate_wXo_expansion_suggest(SubLObject predicate, SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject el_result = NIL;
                SubLObject module_justification_gaf = NIL;
                SubLObject cdolist_list_var = data;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject expansion = suggest_rule_macro_predicate_expansion_from_expansion_axiom_in_mt(predicate, mt);
                        SubLObject expansion_mt = thread.secondMultipleValue();
                        SubLObject supports = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        el_result = append(el_result, (NIL != module_justification_gaf) || (NIL != supports) ? ((SubLObject) (listS(FI_ADD_ARGUMENT, list(QUOTE, list($$expansion, predicate, expansion)), expansion_mt, list(QUOTE, list_utilities.cons_if(module_justification_gaf, supports)), $list_alt164))) : list(KE_ASSERT, list(QUOTE, list($$expansion, predicate, expansion)), expansion_mt));
                    }
                }
                return el_result;
            }
        }
    }

    public static final SubLObject kbi_rule_macro_predicate_wXo_expansion(SubLObject predicate) {
        if (NIL != isa.isa_in_any_mtP(predicate, $$RuleMacroPredicate)) {
            {
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = isa.max_floor_mts_of_isa_paths(predicate, $$RuleMacroPredicate, UNPROVIDED);
                        SubLObject mt = NIL;
                        for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                            if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(predicate, $$expansion, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                kbi_utilities.add_kbi_result(mt);
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject rule_macro_predicate_wXo_expansion_repair(SubLObject rm_pred) {
        {
            SubLObject result = NIL;
            if (NIL != forts.fort_p(rm_pred)) {
                return result;
            }
        }
        return NIL;
    }

    public static final SubLObject infer_rule_macro_predicate_expansion_from_expansion_axiom(SubLObject rm_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(rm_pred, $$expansion, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject module_justification_gaf = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject expansion = suggest_rule_macro_predicate_expansion_from_expansion_axiom_in_mt(rm_pred, mt);
                        SubLObject expansion_mt = thread.secondMultipleValue();
                        SubLObject supports = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != el_utilities.el_formula_p(expansion)) && (NIL != hlmt.hlmt_p(mt))) {
                            if ((NIL != module_justification_gaf) || (NIL != supports)) {
                                return fi.fi_add_argument_int(list($$expansion, rm_pred, expansion), expansion_mt, list_utilities.cons_if(module_justification_gaf, supports), $FORWARD, T);
                            } else {
                                return fi.fi_assert_int(list($$expansion, rm_pred, expansion), expansion_mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject suggest_rule_macro_predicate_expansion_from_expansion_axiom_in_mt(SubLObject rm_pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject expansion = NIL;
            SubLObject expansion_mt = NIL;
            SubLObject supports = NIL;
            if (NIL == supports) {
                {
                    SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(rm_pred, $$expansionAxiom, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != supports) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                            {
                                SubLObject assert_mt = assertions_high.assertion_mt(assertion);
                                if (NIL != genl_mts.genl_mtP(mt, assert_mt, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                                        SubLObject sibling_expansion_axioms = remove(assertion, kb_mapping_utilities.pred_values_in_relevant_mts(rm_pred, $$expansionAxiom, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject validP = T;
                                        if (NIL != sibling_expansion_axioms) {
                                            {
                                                SubLObject invalidP = NIL;
                                                if (NIL == invalidP) {
                                                    {
                                                        SubLObject csome_list_var_131 = sibling_expansion_axioms;
                                                        SubLObject sibling_expansion_axiom = NIL;
                                                        for (sibling_expansion_axiom = csome_list_var_131.first(); !((NIL != invalidP) || (NIL == csome_list_var_131)); csome_list_var_131 = csome_list_var_131.rest() , sibling_expansion_axiom = csome_list_var_131.first()) {
                                                            invalidP = makeBoolean(!formula.equal(uncanonicalizer.assertion_el_formula(sibling_expansion_axiom)));
                                                        }
                                                    }
                                                }
                                                validP = makeBoolean(NIL == invalidP);
                                            }
                                        }
                                        if (NIL != validP) {
                                            expansion = extract_expansion_from_expansion_axiom_formula(rm_pred, formula, mt);
                                            if (NIL != el_utilities.el_formula_p(expansion)) {
                                                if (NIL == list_utilities.tree_find(rm_pred, expansion, UNPROVIDED, UNPROVIDED)) {
                                                    expansion_mt = assert_mt;
                                                    {
                                                        SubLObject meta_assertion = czer_utilities.safe_find_gaf_genl_mts(list($$expansionAxiom, rm_pred, assertion), mt);
                                                        supports = list(meta_assertion);
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
            return values(expansion, expansion_mt, supports);
        }
    }

    public static final SubLObject extract_expansion_from_expansion_axiom_formula(SubLObject rm_pred, SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnfs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        wff.reset_wff_state();
                        cnfs = clausifier.clausal_form(formula, mt, $CNF);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (cnfs.isList() && (NIL != list_utilities.singletonP(remove_duplicates(Mapping.mapcar(symbol_function(NEG_LITS), cnfs), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    {
                        SubLObject pred_neg_lit = NIL;
                        SubLObject blist = NIL;
                        SubLObject cnf = cnfs.first();
                        SubLObject neg_lits = clauses.neg_lits(cnf);
                        if (NIL == pred_neg_lit) {
                            {
                                SubLObject csome_list_var = neg_lits;
                                SubLObject neg_lit = NIL;
                                for (neg_lit = csome_list_var.first(); !((NIL != pred_neg_lit) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , neg_lit = csome_list_var.first()) {
                                    if (rm_pred.eql(el_utilities.literal_arg0(neg_lit, UNPROVIDED))) {
                                        {
                                            SubLObject argnum = ZERO_INTEGER;
                                            SubLObject non_varP = NIL;
                                            if (NIL == non_varP) {
                                                {
                                                    SubLObject csome_list_var_132 = el_utilities.literal_args(neg_lit, UNPROVIDED);
                                                    SubLObject arg = NIL;
                                                    for (arg = csome_list_var_132.first(); !((NIL != non_varP) || (NIL == csome_list_var_132)); csome_list_var_132 = csome_list_var_132.rest() , arg = csome_list_var_132.first()) {
                                                        argnum = add(argnum, ONE_INTEGER);
                                                        if (NIL != cycl_variables.el_varP(arg)) {
                                                            blist = cons(cons(arg, at_utilities.get_generic_arg(argnum)), blist);
                                                        } else {
                                                            non_varP = T;
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == non_varP) {
                                                pred_neg_lit = neg_lit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((NIL != pred_neg_lit) && (NIL != blist)) {
                            {
                                SubLObject expansion = NIL;
                                SubLObject wffP = NIL;
                                {
                                    SubLObject _prev_bind_0 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                                    try {
                                        wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
                                        {
                                            SubLObject _prev_bind_0_133 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(mt, thread);
                                                expansion = simplifier.simplify_cycl_sentence(sublis(blist, subst($$True, pred_neg_lit, formula, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_133, thread);
                                            }
                                        }
                                        wffP = wff.el_wffP(expansion, mt, UNPROVIDED);
                                    } finally {
                                        wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (NIL != wffP) {
                                    if (NIL == list_utilities.tree_find(rm_pred, expansion, UNPROVIDED, UNPROVIDED)) {
                                        return expansion;
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

    public static final SubLObject declare_kbi_predicate_file() {
        declareFunction("diagnose_qua_predicate", "DIAGNOSE-QUA-PREDICATE", 1, 0, false);
        declareFunction("predicate_not_cachedP", "PREDICATE-NOT-CACHED?", 1, 0, false);
        declareFunction("why_predicate_not_cachedP", "WHY-PREDICATE-NOT-CACHED?", 1, 1, false);
        declareFunction("kbi_predicate_not_cachedP", "KBI-PREDICATE-NOT-CACHED?", 1, 0, false);
        declareFunction("kbi_nl_why_predicate_not_cachedP", "KBI-NL-WHY-PREDICATE-NOT-CACHED?", 2, 0, false);
        declareFunction("related_pred_wXo_same_arityP", "RELATED-PRED-W/O-SAME-ARITY?", 1, 0, false);
        declareFunction("why_related_pred_wXo_same_arityP", "WHY-RELATED-PRED-W/O-SAME-ARITY?", 1, 1, false);
        declareFunction("kbi_nl_why_related_pred_wXo_same_arityP", "KBI-NL-WHY-RELATED-PRED-W/O-SAME-ARITY?", 2, 0, false);
        declareFunction("kbi_related_pred_wXo_same_arity", "KBI-RELATED-PRED-W/O-SAME-ARITY", 1, 0, false);
        declareFunction("predicate_wXo_arg_formatP", "PREDICATE-W/O-ARG-FORMAT?", 1, 0, false);
        declareFunction("why_predicate_wXo_arg_formatP", "WHY-PREDICATE-W/O-ARG-FORMAT?", 1, 1, false);
        declareFunction("kbi_nl_why_predicate_wXo_arg_formatP", "KBI-NL-WHY-PREDICATE-W/O-ARG-FORMAT?", 2, 0, false);
        declareFunction("kbi_predicate_wXo_arg_format", "KBI-PREDICATE-W/O-ARG-FORMAT", 1, 0, false);
        declareFunction("predicate_negates_wXo_arg_isa_overlapP", "PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?", 1, 0, false);
        declareFunction("why_predicate_negates_wXo_arg_isa_overlapP", "WHY-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?", 1, 1, false);
        declareFunction("kbi_nl_why_predicate_negates_wXo_arg_isa_overlapP", "KBI-NL-WHY-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?", 2, 0, false);
        declareFunction("kbi_predicate_negates_wXo_arg_isa_overlap_in_mts", "KBI-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-IN-MTS", 1, 0, false);
        declareFunction("auto_negating_predicates", "AUTO-NEGATING-PREDICATES", 0, 0, false);
        declareFunction("auto_negating_predicateP", "AUTO-NEGATING-PREDICATE?", 1, 1, false);
        declareFunction("predicate_symmetry_wXo_arg_constraint_symmetryP", "PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?", 1, 0, false);
        declareFunction("why_predicate_symmetry_wXo_arg_constraint_symmetryP", "WHY-PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?", 1, 1, false);
        declareFunction("kbi_nl_why_predicate_symmetry_wXo_arg_constraint_symmetryP", "KBI-NL-WHY-PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?", 2, 0, false);
        declareFunction("kbi_predicate_symmetry_wXo_arg_contraint_symmetry", "KBI-PREDICATE-SYMMETRY-W/O-ARG-CONTRAINT-SYMMETRY", 1, 0, false);
        declareFunction("kbi_arg_isa_asymmetry_in_mt", "KBI-ARG-ISA-ASYMMETRY-IN-MT", 2, 0, false);
        declareFunction("kbi_arg_genl_asymmetry_in_mt", "KBI-ARG-GENL-ASYMMETRY-IN-MT", 2, 0, false);
        declareFunction("kbi_arg_format_asymmetry_in_mt", "KBI-ARG-FORMAT-ASYMMETRY-IN-MT", 2, 0, false);
        declareFunction("kbi_inter_arg_isa_asymmetry_in_mt", "KBI-INTER-ARG-ISA-ASYMMETRY-IN-MT", 2, 0, false);
        declareFunction("kbi_inter_arg_format_asymmetry_in_mt", "KBI-INTER-ARG-FORMAT-ASYMMETRY-IN-MT", 2, 0, false);
        declareFunction("predicate_reflexive_wXo_accommodating_arg_isaP", "PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?", 1, 0, false);
        declareFunction("why_predicate_reflexive_wXo_accommodating_arg_isaP", "WHY-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_predicate_reflexive_wXo_accommodating_arg_isaP", "KBI-NL-WHY-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?", 2, 0, false);
        declareFunction("kbi_predicate_reflexive_wXo_accommodating_arg_isa", "KBI-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA", 1, 0, false);
        declareFunction("kbi_arg_isa_not_subsumed_in_mt", "KBI-ARG-ISA-NOT-SUBSUMED-IN-MT", 4, 0, false);
        declareFunction("kbi_arg_genl_not_subsumed_in_mt", "KBI-ARG-GENL-NOT-SUBSUMED-IN-MT", 4, 0, false);
        declareFunction("kbi_inter_arg_isa_not_subsumed_in_mt", "KBI-INTER-ARG-ISA-NOT-SUBSUMED-IN-MT", 2, 0, false);
        declareFunction("genl_pred_arg_isa_not_subsumedP", "GENL-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("why_genl_pred_arg_isa_not_subsumedP", "WHY-GENL-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 1, false);
        declareFunction("kbi_nl_why_genl_pred_arg_isa_not_subsumedP", "KBI-NL-WHY-GENL-PRED-ARG-ISA-NOT-SUBSUMED?", 2, 0, false);
        declareFunction("kbi_genl_pred_arg_isa_not_subsumedP", "KBI-GENL-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("genl_pred_arg_isa_not_subsumed_in_mt", "GENL-PRED-ARG-ISA-NOT-SUBSUMED-IN-MT", 3, 0, false);
        declareFunction("genl_pred_arg_genl_not_subsumedP", "GENL-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("why_genl_pred_arg_genl_not_subsumedP", "WHY-GENL-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 1, false);
        declareFunction("kbi_nl_why_genl_pred_arg_genl_not_subsumedP", "KBI-NL-WHY-GENL-PRED-ARG-GENL-NOT-SUBSUMED?", 2, 0, false);
        declareFunction("kbi_genl_pred_arg_genl_not_subsumedP", "KBI-GENL-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("genl_pred_arg_genl_not_subsumed_in_mt", "GENL-PRED-ARG-GENL-NOT-SUBSUMED-IN-MT", 3, 0, false);
        declareFunction("spec_pred_arg_isa_not_subsumedP", "SPEC-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("why_spec_pred_arg_isa_not_subsumedP", "WHY-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 1, false);
        declareFunction("kbi_nl_why_spec_pred_arg_isa_not_subsumedP", "KBI-NL-WHY-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?", 2, 0, false);
        declareFunction("kbi_spec_pred_arg_isa_not_subsumedP", "KBI-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("spec_pred_arg_isa_not_subsumed_in_mt", "SPEC-PRED-ARG-ISA-NOT-SUBSUMED-IN-MT", 3, 0, false);
        declareFunction("spec_pred_arg_genl_not_subsumedP", "SPEC-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("why_spec_pred_arg_genl_not_subsumedP", "WHY-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 1, false);
        declareFunction("kbi_nl_why_spec_pred_arg_genl_not_subsumedP", "KBI-NL-WHY-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?", 2, 0, false);
        declareFunction("kbi_spec_pred_arg_genl_not_subsumedP", "KBI-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?", 1, 0, false);
        declareFunction("spec_pred_arg_genl_not_subsumed_in_mt", "SPEC-PRED-ARG-GENL-NOT-SUBSUMED-IN-MT", 3, 0, false);
        declareFunction("rule_macro_predicate_wXo_expansionP", "RULE-MACRO-PREDICATE-W/O-EXPANSION?", 1, 0, false);
        declareFunction("why_rule_macro_predicate_wXo_expansionP", "WHY-RULE-MACRO-PREDICATE-W/O-EXPANSION?", 1, 1, false);
        declareFunction("kbi_nl_why_rule_macro_predicate_wXo_expansionP", "KBI-NL-WHY-RULE-MACRO-PREDICATE-W/O-EXPANSION?", 2, 0, false);
        declareFunction("kbi_el_why_rule_macro_predicate_wXo_expansionP", "KBI-EL-WHY-RULE-MACRO-PREDICATE-W/O-EXPANSION?", 2, 0, false);
        declareFunction("kbi_nl_rule_macro_predicate_wXo_expansion_suggest", "KBI-NL-RULE-MACRO-PREDICATE-W/O-EXPANSION-SUGGEST", 2, 0, false);
        declareFunction("kbi_nl_rule_macro_predicate_wXo_expansion_suggest_in_mt", "KBI-NL-RULE-MACRO-PREDICATE-W/O-EXPANSION-SUGGEST-IN-MT", 2, 0, false);
        declareFunction("kbi_el_rule_macro_predicate_wXo_expansion_suggest", "KBI-EL-RULE-MACRO-PREDICATE-W/O-EXPANSION-SUGGEST", 2, 0, false);
        declareFunction("kbi_rule_macro_predicate_wXo_expansion", "KBI-RULE-MACRO-PREDICATE-W/O-EXPANSION", 1, 0, false);
        declareFunction("rule_macro_predicate_wXo_expansion_repair", "RULE-MACRO-PREDICATE-W/O-EXPANSION-REPAIR", 1, 0, false);
        declareFunction("infer_rule_macro_predicate_expansion_from_expansion_axiom", "INFER-RULE-MACRO-PREDICATE-EXPANSION-FROM-EXPANSION-AXIOM", 1, 1, false);
        declareFunction("suggest_rule_macro_predicate_expansion_from_expansion_axiom_in_mt", "SUGGEST-RULE-MACRO-PREDICATE-EXPANSION-FROM-EXPANSION-AXIOM-IN-MT", 1, 1, false);
        declareFunction("extract_expansion_from_expansion_axiom_formula", "EXTRACT-EXPANSION-FROM-EXPANSION-AXIOM-FORMULA", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_kbi_predicate_file() {
        defparameter("*PREDICATE-NOT-CACHED-RESULTS*", NIL);
        defparameter("*PREDICATE-NOT-CACHED-TIME*", ZERO_INTEGER);
        defparameter("*PREDICATE-NOT-CACHED-COUNT*", ZERO_INTEGER);
        defparameter("*RELATED-PRED-W/O-SAME-ARITY-RESULTS*", NIL);
        defparameter("*RELATED-PRED-W/O-SAME-ARITY-TIME*", ZERO_INTEGER);
        defparameter("*RELATED-PRED-W/O-SAME-ARITY-COUNT*", ZERO_INTEGER);
        defparameter("*PREDICATE-W/O-ARG-FORMAT-RESULTS*", NIL);
        defparameter("*PREDICATE-W/O-ARG-FORMAT-TIME*", ZERO_INTEGER);
        defparameter("*PREDICATE-W/O-ARG-FORMAT-COUNT*", ZERO_INTEGER);
        defparameter("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-RESULTS*", NIL);
        defparameter("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-TIME*", ZERO_INTEGER);
        defparameter("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-COUNT*", ZERO_INTEGER);
        defparameter("*AUTO-NEGATING-PRED-TYPES*", $list_alt61);
        defparameter("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-RESULTS*", NIL);
        defparameter("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-TIME*", ZERO_INTEGER);
        defparameter("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-COUNT*", ZERO_INTEGER);
        defparameter("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-RESULTS*", NIL);
        defparameter("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-TIME*", ZERO_INTEGER);
        defparameter("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*", NIL);
        defparameter("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-TIME*", ZERO_INTEGER);
        defparameter("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*", ZERO_INTEGER);
        defparameter("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*", NIL);
        defparameter("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-TIME*", ZERO_INTEGER);
        defparameter("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*", ZERO_INTEGER);
        defparameter("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*", NIL);
        defparameter("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-TIME*", ZERO_INTEGER);
        defparameter("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*", ZERO_INTEGER);
        defparameter("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*", NIL);
        defparameter("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-TIME*", ZERO_INTEGER);
        defparameter("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*", ZERO_INTEGER);
        defparameter("*RULE-MACRO-PREDICATE-W/O-EXPANSION-RESULTS*", NIL);
        defparameter("*RULE-MACRO-PREDICATE-W/O-EXPANSION-TIME*", ZERO_INTEGER);
        defparameter("*RULE-MACRO-PREDICATE-W/O-EXPANSION-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_predicate_file() {
                {
            SubLObject item_var = $predicate_not_cached_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($predicate_not_cached_results$, $str_alt2$violators_of_kbi_module__PREDICAT);
        {
            SubLObject item_var = $predicate_not_cached_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($predicate_not_cached_time$, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $predicate_not_cached_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($predicate_not_cached_count$, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($PREDICATE_NOT_CACHED, $list_alt13);
        {
            SubLObject item_var = $sym15$_RELATED_PRED_W_O_SAME_ARITY_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym15$_RELATED_PRED_W_O_SAME_ARITY_RESULTS_, $str_alt16$violators_of_kbi_module__RELATED_);
        {
            SubLObject item_var = $sym17$_RELATED_PRED_W_O_SAME_ARITY_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym17$_RELATED_PRED_W_O_SAME_ARITY_TIME_, $str_alt18$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym19$_RELATED_PRED_W_O_SAME_ARITY_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym19$_RELATED_PRED_W_O_SAME_ARITY_COUNT_, $str_alt20$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw21$RELATED_PRED_W_O_SAME_ARITY, $list_alt22);
        {
            SubLObject item_var = $sym33$_PREDICATE_W_O_ARG_FORMAT_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym33$_PREDICATE_W_O_ARG_FORMAT_RESULTS_, $str_alt34$violators_of_kbi_module__PREDICAT);
        {
            SubLObject item_var = $sym35$_PREDICATE_W_O_ARG_FORMAT_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym35$_PREDICATE_W_O_ARG_FORMAT_TIME_, $str_alt36$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym37$_PREDICATE_W_O_ARG_FORMAT_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym37$_PREDICATE_W_O_ARG_FORMAT_COUNT_, $str_alt38$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw39$PREDICATE_W_O_ARG_FORMAT, $list_alt40);
        {
            SubLObject item_var = $sym47$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym47$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_RESULTS_, $str_alt48$violators_of_kbi_module__PREDICAT);
        {
            SubLObject item_var = $sym49$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym49$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_TIME_, $str_alt50$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym51$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym51$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_COUNT_, $str_alt52$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP, $list_alt54);
        {
            SubLObject item_var = $auto_negating_pred_types$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($auto_negating_pred_types$, $str_alt63$collections_of_predicates_that_ma);
        {
            SubLObject item_var = $sym64$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym64$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_RESULTS_, $str_alt65$violators_of_kbi_module__PREDICAT);
        {
            SubLObject item_var = $sym66$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym66$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_TIME_, $str_alt67$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym68$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym68$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_COUNT_, $str_alt69$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY, $list_alt71);
        {
            SubLObject item_var = $sym84$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym84$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_RESULTS_, $str_alt85$violators_of_kbi_module__PREDICAT);
        {
            SubLObject item_var = $sym86$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym86$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_TIME_, $str_alt87$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym88$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym88$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_COUNT_, $str_alt89$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA, $list_alt91);
        {
            SubLObject item_var = $genl_pred_arg_isa_not_subsumed_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_isa_not_subsumed_results$, $str_alt97$violators_of_kbi_module__GENL_PRE);
        {
            SubLObject item_var = $genl_pred_arg_isa_not_subsumed_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_isa_not_subsumed_time$, $str_alt99$run_time_of_predicate_application);
        {
            SubLObject item_var = $genl_pred_arg_isa_not_subsumed_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_isa_not_subsumed_count$, $str_alt101$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($GENL_PRED_ARG_ISA_NOT_SUBSUMED, $list_alt103);
        {
            SubLObject item_var = $genl_pred_arg_genl_not_subsumed_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_genl_not_subsumed_results$, $str_alt111$violators_of_kbi_module__GENL_PRE);
        {
            SubLObject item_var = $genl_pred_arg_genl_not_subsumed_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_genl_not_subsumed_time$, $str_alt113$run_time_of_predicate_application);
        {
            SubLObject item_var = $genl_pred_arg_genl_not_subsumed_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($genl_pred_arg_genl_not_subsumed_count$, $str_alt115$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($GENL_PRED_ARG_GENL_NOT_SUBSUMED, $list_alt117);
        {
            SubLObject item_var = $spec_pred_arg_isa_not_subsumed_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_isa_not_subsumed_results$, $str_alt121$violators_of_kbi_module__SPEC_PRE);
        {
            SubLObject item_var = $spec_pred_arg_isa_not_subsumed_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_isa_not_subsumed_time$, $str_alt123$run_time_of_predicate_application);
        {
            SubLObject item_var = $spec_pred_arg_isa_not_subsumed_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_isa_not_subsumed_count$, $str_alt125$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SPEC_PRED_ARG_ISA_NOT_SUBSUMED, $list_alt127);
        {
            SubLObject item_var = $spec_pred_arg_genl_not_subsumed_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_genl_not_subsumed_results$, $str_alt133$violators_of_kbi_module__SPEC_PRE);
        {
            SubLObject item_var = $spec_pred_arg_genl_not_subsumed_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_genl_not_subsumed_time$, $str_alt135$run_time_of_predicate_application);
        {
            SubLObject item_var = $spec_pred_arg_genl_not_subsumed_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($spec_pred_arg_genl_not_subsumed_count$, $str_alt137$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($SPEC_PRED_ARG_GENL_NOT_SUBSUMED, $list_alt139);
        {
            SubLObject item_var = $sym142$_RULE_MACRO_PREDICATE_W_O_EXPANSION_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym142$_RULE_MACRO_PREDICATE_W_O_EXPANSION_RESULTS_, $str_alt143$violators_of_kbi_module__RULE_MAC);
        {
            SubLObject item_var = $sym144$_RULE_MACRO_PREDICATE_W_O_EXPANSION_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym144$_RULE_MACRO_PREDICATE_W_O_EXPANSION_TIME_, $str_alt145$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym146$_RULE_MACRO_PREDICATE_W_O_EXPANSION_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym146$_RULE_MACRO_PREDICATE_W_O_EXPANSION_COUNT_, $str_alt147$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION, $list_alt149);
        return NIL;
    }



    public static final SubLSymbol $predicate_not_cached_results$ = makeSymbol("*PREDICATE-NOT-CACHED-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__PREDICAT = makeString("violators of kbi module :PREDICATE-NOT-CACHED");

    public static final SubLSymbol $predicate_not_cached_time$ = makeSymbol("*PREDICATE-NOT-CACHED-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :PREDICATE-NOT-CACHED");

    public static final SubLSymbol $predicate_not_cached_count$ = makeSymbol("*PREDICATE-NOT-CACHED-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :PREDICATE-NOT-CACHED");

    private static final SubLSymbol $PREDICATE_NOT_CACHED = makeKeyword("PREDICATE-NOT-CACHED");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*PREDICATE-NOT-CACHED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*PREDICATE-NOT-CACHED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*PREDICATE-NOT-CACHED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-PREDICATE-NOT-CACHED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("PREDICATE-NOT-CACHED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-PREDICATE-NOT-CACHED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-PREDICATE-NOT-CACHED?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-LEVEL"), $SBHL, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test PREDICATE fort for missing from forts typed predicate") });

    static private final SubLString $str_alt14$_s_is_not_among_the_cached_predic = makeString("~s is not among the cached predicates");

    static private final SubLSymbol $sym15$_RELATED_PRED_W_O_SAME_ARITY_RESULTS_ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-RESULTS*");

    static private final SubLString $str_alt16$violators_of_kbi_module__RELATED_ = makeString("violators of kbi module :RELATED-PRED-W/O-SAME-ARITY");

    static private final SubLSymbol $sym17$_RELATED_PRED_W_O_SAME_ARITY_TIME_ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-TIME*");

    static private final SubLString $str_alt18$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATED-PRED-W/O-SAME-ARITY");

    static private final SubLSymbol $sym19$_RELATED_PRED_W_O_SAME_ARITY_COUNT_ = makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-COUNT*");

    static private final SubLString $str_alt20$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATED-PRED-W/O-SAME-ARITY");

    public static final SubLSymbol $kw21$RELATED_PRED_W_O_SAME_ARITY = makeKeyword("RELATED-PRED-W/O-SAME-ARITY");

    static private final SubLList $list_alt22 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATED-PRED-W/O-SAME-ARITY-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATED-PRED-W/O-SAME-ARITY"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATED-PRED-W/O-SAME-ARITY?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATED-PRED-W/O-SAME-ARITY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATED-PRED-W/O-SAME-ARITY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test PREDICATE fort for related preds (e.g., #$genlPreds) that have a different #$arity") });

    static private final SubLString $str_alt23$ = makeString("");

    static private final SubLList $list_alt24 = list(makeSymbol("ARITY"), makeSymbol("MODE"), makeSymbol("REL-PRED"), makeSymbol("REL-ARITY"), makeSymbol("INVERSE?"), makeSymbol("MT"));



    public static final SubLObject $$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));



    static private final SubLString $str_alt29$is_a__s_of = makeString("is a ~s of");

    static private final SubLString $str_alt30$has__s = makeString("has ~s");

    static private final SubLString $str_alt31$___s_has___arity__s_but__a__s_wit = makeString("~%~s has #$arity ~s but ~a ~s with #$arity ~s [in ~s]");

    static private final SubLList $list_alt32 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("negationPreds")), constant_handles.reader_make_constant_shell(makeString("negationInverse")));

    static private final SubLSymbol $sym33$_PREDICATE_W_O_ARG_FORMAT_RESULTS_ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-RESULTS*");

    static private final SubLString $str_alt34$violators_of_kbi_module__PREDICAT = makeString("violators of kbi module :PREDICATE-W/O-ARG-FORMAT");

    static private final SubLSymbol $sym35$_PREDICATE_W_O_ARG_FORMAT_TIME_ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-TIME*");

    static private final SubLString $str_alt36$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :PREDICATE-W/O-ARG-FORMAT");

    static private final SubLSymbol $sym37$_PREDICATE_W_O_ARG_FORMAT_COUNT_ = makeSymbol("*PREDICATE-W/O-ARG-FORMAT-COUNT*");

    static private final SubLString $str_alt38$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :PREDICATE-W/O-ARG-FORMAT");

    public static final SubLSymbol $kw39$PREDICATE_W_O_ARG_FORMAT = makeKeyword("PREDICATE-W/O-ARG-FORMAT");

    static private final SubLList $list_alt40 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*PREDICATE-W/O-ARG-FORMAT-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*PREDICATE-W/O-ARG-FORMAT-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*PREDICATE-W/O-ARG-FORMAT-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-PREDICATE-W/O-ARG-FORMAT"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("PREDICATE-W/O-ARG-FORMAT?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-PREDICATE-W/O-ARG-FORMAT?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-PREDICATE-W/O-ARG-FORMAT?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test PREDICATE for missing arg-format (e.g., #$arg1Format ...) assertions") });

    static private final SubLString $str_alt41$_s_missing = makeString("~s missing");

    static private final SubLString $str_alt42$_____a__in_mt__s_ = makeString("~%  ~a [in mt ~s]");

    private static final SubLSymbol ARGN_FORMAT_PRED = makeSymbol("ARGN-FORMAT-PRED");



    static private final SubLString $str_alt45$__ = makeString(", ");

    static private final SubLString $str_alt46$__and_ = makeString(", and ");

    static private final SubLSymbol $sym47$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_RESULTS_ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-RESULTS*");

    static private final SubLString $str_alt48$violators_of_kbi_module__PREDICAT = makeString("violators of kbi module :PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP");

    static private final SubLSymbol $sym49$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_TIME_ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-TIME*");

    static private final SubLString $str_alt50$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP");

    static private final SubLSymbol $sym51$_PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP_COUNT_ = makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-COUNT*");

    static private final SubLString $str_alt52$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP");

    public static final SubLSymbol $kw53$PREDICATE_NEGATES_W_O_ARG_ISA_OVERLAP = makeKeyword("PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP");

    static private final SubLList $list_alt54 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-REQUIRED-FN"), makeSymbol("AUTO-NEGATING-PREDICATE?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-PREDICATE-NEGATES-W/O-ARG-ISA-OVERLAP?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test negating PREDICATE (e.g., #$AsymmetricBinaryPredicate) for #$arg1Isa not overlapping #$arg2Isa"), makeKeyword("KBI-COMMENT"), makeString("by convention, the inference engine assumes possibly overlapping arg constraints for these negating preds") });

    static private final SubLList $list_alt55 = list(makeSymbol("TYPES"), makeSymbol("PRED1"), makeSymbol("ARG1"), makeSymbol("PRED2"), makeSymbol("ARG2"), makeSymbol("MT"));

    static private final SubLString $str_alt56$___s___isa__a_but_has_non_overlap = makeString("~%~s #$isa ~a but has non-overlapping ~s ~s and ~s ~s [in ~s]");

    public static final SubLObject $$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));

    public static final SubLObject $$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));

    public static final SubLObject $$arg1Genl = constant_handles.reader_make_constant_shell(makeString("arg1Genl"));

    public static final SubLObject $$arg2Genl = constant_handles.reader_make_constant_shell(makeString("arg2Genl"));

    static private final SubLList $list_alt61 = list(constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate")));

    public static final SubLSymbol $auto_negating_pred_types$ = makeSymbol("*AUTO-NEGATING-PRED-TYPES*");

    static private final SubLString $str_alt63$collections_of_predicates_that_ma = makeString("collections of predicates that may negate when args are swapped");

    static private final SubLSymbol $sym64$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_RESULTS_ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-RESULTS*");

    static private final SubLString $str_alt65$violators_of_kbi_module__PREDICAT = makeString("violators of kbi module :PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY");

    static private final SubLSymbol $sym66$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_TIME_ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-TIME*");

    static private final SubLString $str_alt67$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY");

    static private final SubLSymbol $sym68$_PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY_COUNT_ = makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-COUNT*");

    static private final SubLString $str_alt69$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY");

    public static final SubLSymbol $kw70$PREDICATE_SYMMETRY_W_O_ARG_CONSTRAINT_SYMMETRY = makeKeyword("PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY");

    static private final SubLList $list_alt71 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-REQUIRED-FN"), makeSymbol("SYMMETRIC-PREDICATE?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-PREDICATE-SYMMETRY-W/O-ARG-CONTRAINT-SYMMETRY"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-PREDICATE-SYMMETRY-W/O-ARG-CONSTRAINT-SYMMETRY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test symmetric PREDICATE for arg1 cosntraints different from arg2 constraints") });

    static private final SubLList $list_alt72 = list(makeSymbol("ARG-CONSTRAINT-PRED-1"), makeSymbol("ARG-CONSTRAINTS"), makeSymbol("ARG-CONSTRAINT-PRED-2"), makeSymbol("MT"));

    static private final SubLString $str_alt73$___s___isa___SymmetricBinaryPredi = makeString("~%~s #$isa #$SymmetricBinaryPredicate ~%  but has ~s (~a) ~%  not also ~s ~%  [in ~s]");

    private static final SubLSymbol OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");

    public static final SubLObject $$ArgConstraintPredicate = constant_handles.reader_make_constant_shell(makeString("ArgConstraintPredicate"));

    static private final SubLList $list_alt76 = list(ONE_INTEGER);



    public static final SubLObject $$arg1Format = constant_handles.reader_make_constant_shell(makeString("arg1Format"));

    public static final SubLObject $$arg2Format = constant_handles.reader_make_constant_shell(makeString("arg2Format"));

    public static final SubLObject $$interArgIsa1_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-2"));

    public static final SubLObject $$interArgIsa2_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1"));

    public static final SubLObject $$interArgFormat1_2 = constant_handles.reader_make_constant_shell(makeString("interArgFormat1-2"));

    public static final SubLObject $$interArgFormat2_1 = constant_handles.reader_make_constant_shell(makeString("interArgFormat2-1"));

    static private final SubLSymbol $sym84$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_RESULTS_ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-RESULTS*");

    static private final SubLString $str_alt85$violators_of_kbi_module__PREDICAT = makeString("violators of kbi module :PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA");

    static private final SubLSymbol $sym86$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_TIME_ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-TIME*");

    static private final SubLString $str_alt87$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA");

    static private final SubLSymbol $sym88$_PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA_COUNT_ = makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-COUNT*");

    static private final SubLString $str_alt89$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA");

    public static final SubLSymbol $kw90$PREDICATE_REFLEXIVE_W_O_ACCOMMODATING_ARG_ISA = makeKeyword("PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA");

    static private final SubLList $list_alt91 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-REQUIRED-FN"), makeSymbol("REFLEXIVE-PREDICATE?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-PREDICATE-REFLEXIVE-W/O-ACCOMMODATING-ARG-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test reflexive PREDICATE for arg2 constraints not subsumed by arg1 constraints") });

    static private final SubLList $list_alt92 = list(makeSymbol("ARG1-PRED"), makeSymbol("ARG1S"), makeSymbol("ARG2-PRED"), makeSymbol("MT"));

    static private final SubLString $str_alt93$___s___isa___ReflexiveBinaryPredi = makeString("~%~s #$isa #$ReflexiveBinaryPredicate but has ~s ~a not also required by ~s [in ~s]");

    static private final SubLString $str_alt94$_and_ = makeString(" and ");

    public static final SubLObject $$ArgTypePredicate = constant_handles.reader_make_constant_shell(makeString("ArgTypePredicate"));

    public static final SubLSymbol $genl_pred_arg_isa_not_subsumed_results$ = makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*");

    static private final SubLString $str_alt97$violators_of_kbi_module__GENL_PRE = makeString("violators of kbi module :GENL-PRED-ARG-ISA-NOT-SUBSUMED");

    public static final SubLSymbol $genl_pred_arg_isa_not_subsumed_time$ = makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-TIME*");

    static private final SubLString $str_alt99$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :GENL-PRED-ARG-ISA-NOT-SUBSUMED");

    public static final SubLSymbol $genl_pred_arg_isa_not_subsumed_count$ = makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*");

    static private final SubLString $str_alt101$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :GENL-PRED-ARG-ISA-NOT-SUBSUMED");

    private static final SubLSymbol $GENL_PRED_ARG_ISA_NOT_SUBSUMED = makeKeyword("GENL-PRED-ARG-ISA-NOT-SUBSUMED");

    static private final SubLList $list_alt103 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*GENL-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-GENL-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("GENL-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-GENL-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-GENL-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test PREDICATE for #$genlPreds having arg-isa (e.g., #$arg1Isa ...) not satisfied by this predicate's arg-isa") });

    static private final SubLList $list_alt104 = list(makeSymbol("REL-PRED"), makeSymbol("GENL-PRED"), makeSymbol("N"), makeSymbol("GENL-ARG-ISA"), makeSymbol("ARG-ISA"), makeSymbol("MT"));

    static private final SubLString $str_alt105$___s_has__s__a____and_has__s__s_w = makeString("~%~s has ~s ~a~%  and has ~s ~s which has unsubsumed ~s ~s ~%  [in ~s]");

    public static final SubLObject $$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    static private final SubLString $str_alt108$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLSymbol $genl_pred_arg_genl_not_subsumed_results$ = makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*");

    static private final SubLString $str_alt111$violators_of_kbi_module__GENL_PRE = makeString("violators of kbi module :GENL-PRED-ARG-GENL-NOT-SUBSUMED");

    public static final SubLSymbol $genl_pred_arg_genl_not_subsumed_time$ = makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-TIME*");

    static private final SubLString $str_alt113$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :GENL-PRED-ARG-GENL-NOT-SUBSUMED");

    public static final SubLSymbol $genl_pred_arg_genl_not_subsumed_count$ = makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*");

    static private final SubLString $str_alt115$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :GENL-PRED-ARG-GENL-NOT-SUBSUMED");

    private static final SubLSymbol $GENL_PRED_ARG_GENL_NOT_SUBSUMED = makeKeyword("GENL-PRED-ARG-GENL-NOT-SUBSUMED");

    static private final SubLList $list_alt117 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*GENL-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-GENL-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("GENL-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-GENL-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-GENL-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test PREDICATE for #$genlPreds having arg-genl (e.g., #$arg1Isa ...) not satisfied by this predicate's arg-genl") });

    static private final SubLList $list_alt118 = list(makeSymbol("REL-PRED"), makeSymbol("GENL-PRED"), makeSymbol("N"), makeSymbol("GENL-ARG-GENL"), makeSymbol("ARG-GENL"), makeSymbol("MT"));

    static private final SubLString $str_alt119$___s_has__s__a_____and_has__s__s_ = makeString("~%~s has ~s ~a ~%  and has ~s ~s which has unsubsumed ~s ~s ~%  [in ~s]");

    public static final SubLSymbol $spec_pred_arg_isa_not_subsumed_results$ = makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*");

    static private final SubLString $str_alt121$violators_of_kbi_module__SPEC_PRE = makeString("violators of kbi module :SPEC-PRED-ARG-ISA-NOT-SUBSUMED");

    public static final SubLSymbol $spec_pred_arg_isa_not_subsumed_time$ = makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-TIME*");

    static private final SubLString $str_alt123$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SPEC-PRED-ARG-ISA-NOT-SUBSUMED");

    public static final SubLSymbol $spec_pred_arg_isa_not_subsumed_count$ = makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*");

    static private final SubLString $str_alt125$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SPEC-PRED-ARG-ISA-NOT-SUBSUMED");

    private static final SubLSymbol $SPEC_PRED_ARG_ISA_NOT_SUBSUMED = makeKeyword("SPEC-PRED-ARG-ISA-NOT-SUBSUMED");

    static private final SubLList $list_alt127 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SPEC-PRED-ARG-ISA-NOT-SUBSUMED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SPEC-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SPEC-PRED-ARG-ISA-NOT-SUBSUMED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test PREDICATE for having arg-isa (e.g., #$arg1Isa ...) not satisfied by the arg-isa of spec-preds") });

    static private final SubLList $list_alt128 = list(makeSymbol("REL-PRED"), makeSymbol("SPEC-PRED"), makeSymbol("N"), makeSymbol("M"), makeSymbol("ARG-ISA"), makeSymbol("SPEC-ARG-ISA"), makeSymbol("MT"));

    static private final SubLString $$$spec_pred = makeString("spec pred");

    static private final SubLString $$$spec_inverse = makeString("spec inverse");

    static private final SubLString $str_alt131$___s_has__s__s____which_is_not_su = makeString("~%~s has ~s ~s~%  which is not subsumed by any ~s of ~a ~s : ~a~%  [in ~s]");

    public static final SubLSymbol $spec_pred_arg_genl_not_subsumed_results$ = makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*");

    static private final SubLString $str_alt133$violators_of_kbi_module__SPEC_PRE = makeString("violators of kbi module :SPEC-PRED-ARG-GENL-NOT-SUBSUMED");

    public static final SubLSymbol $spec_pred_arg_genl_not_subsumed_time$ = makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-TIME*");

    static private final SubLString $str_alt135$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :SPEC-PRED-ARG-GENL-NOT-SUBSUMED");

    public static final SubLSymbol $spec_pred_arg_genl_not_subsumed_count$ = makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*");

    static private final SubLString $str_alt137$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :SPEC-PRED-ARG-GENL-NOT-SUBSUMED");

    private static final SubLSymbol $SPEC_PRED_ARG_GENL_NOT_SUBSUMED = makeKeyword("SPEC-PRED-ARG-GENL-NOT-SUBSUMED");

    static private final SubLList $list_alt139 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*SPEC-PRED-ARG-GENL-NOT-SUBSUMED-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("SPEC-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-SPEC-PRED-ARG-GENL-NOT-SUBSUMED?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test PREDICATE for having arg-genl (e.g., #$arg1Genl ...) not satisfied by the arg-genl of spec-preds") });

    static private final SubLList $list_alt140 = list(makeSymbol("REL-PRED"), makeSymbol("SPEC-PRED"), makeSymbol("N"), makeSymbol("M"), makeSymbol("ARG-GENL"), makeSymbol("SPEC-ARG-GENL"), makeSymbol("MT"));

    static private final SubLString $str_alt141$___s_has__s__s_____which_is_not_s = makeString("~%~s has ~s ~s ~%  which is not subsumed by any ~s of ~a ~s : ~a~%  [in ~s]");

    static private final SubLSymbol $sym142$_RULE_MACRO_PREDICATE_W_O_EXPANSION_RESULTS_ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-RESULTS*");

    static private final SubLString $str_alt143$violators_of_kbi_module__RULE_MAC = makeString("violators of kbi module :RULE-MACRO-PREDICATE-W/O-EXPANSION");

    static private final SubLSymbol $sym144$_RULE_MACRO_PREDICATE_W_O_EXPANSION_TIME_ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-TIME*");

    static private final SubLString $str_alt145$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RULE-MACRO-PREDICATE-W/O-EXPANSION");

    static private final SubLSymbol $sym146$_RULE_MACRO_PREDICATE_W_O_EXPANSION_COUNT_ = makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-COUNT*");

    static private final SubLString $str_alt147$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RULE-MACRO-PREDICATE-W/O-EXPANSION");

    public static final SubLSymbol $kw148$RULE_MACRO_PREDICATE_W_O_EXPANSION = makeKeyword("RULE-MACRO-PREDICATE-W/O-EXPANSION");

    static private final SubLList $list_alt149 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RULE-MACRO-PREDICATE-W/O-EXPANSION-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("PREDICATE"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RULE-MACRO-PREDICATE-W/O-EXPANSION"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RULE-MACRO-PREDICATE-W/O-EXPANSION?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RULE-MACRO-PREDICATE-W/O-EXPANSION?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RULE-MACRO-PREDICATE-W/O-EXPANSION?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("verify rule macro PREDICATE has an #$expansion.") });

    static private final SubLString $str_alt150$___s___isa___RuleMacroPredicate_w = makeString("~%~s #$isa #$RuleMacroPredicate w/o an #$expansion [in ~s]");

    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt154 = list(constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate")));

    public static final SubLObject $$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));

    public static final SubLObject $$expansion = constant_handles.reader_make_constant_shell(makeString("expansion"));

    static private final SubLList $list_alt157 = list(makeSymbol("??EXPANSION"));

    static private final SubLString $str_alt158$____Consider_asserting___________ = makeString("~%  Consider asserting: ~%    '(#$ist ~s (#$expansion ~s ~s))");

    static private final SubLString $str_alt159$________motivated_by___________a = makeString("~%      motivated by: ~%      ~a");

    private static final SubLSymbol ASSERTION_FI_IST_FORMULA = makeSymbol("ASSERTION-FI-IST-FORMULA");

    static private final SubLString $str_alt161$__________ = makeString("~%        ");

    private static final SubLSymbol FI_ADD_ARGUMENT = makeSymbol("FI-ADD-ARGUMENT");



    static private final SubLList $list_alt164 = list(makeKeyword("FORWARD"), T);

    private static final SubLSymbol KE_ASSERT = makeSymbol("KE-ASSERT");

    public static final SubLObject $$RuleMacroPredicate = constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate"));



    public static final SubLObject $$expansionAxiom = constant_handles.reader_make_constant_shell(makeString("expansionAxiom"));







    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

    // // Initializers
    public void declareFunctions() {
        declare_kbi_predicate_file();
    }

    public void initializeVariables() {
        init_kbi_predicate_file();
    }

    public void runTopLevelForms() {
        setup_kbi_predicate_file();
    }
}

