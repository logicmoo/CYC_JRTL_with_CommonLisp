/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      KBI-RELATION
 *  source file: /cyc/top/cycl/kbi-relation.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_relation extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_relation() {
    }

    public static final SubLFile me = new kbi_relation();


    // // Definitions
    public static final SubLObject diagnose_qua_relation(SubLObject relation) {
        return kbi_utilities.diagnose_qua_sub_domains(relation, $RELATION);
    }

    // defparameter
    public static final SubLSymbol $relation_wXo_arity_results$ = makeSymbol("*RELATION-W/O-ARITY-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arity_time$ = makeSymbol("*RELATION-W/O-ARITY-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arity_count$ = makeSymbol("*RELATION-W/O-ARITY-COUNT*");

    /**
     * test RELATION for missing #$arity assertions
     */
    public static final SubLObject relation_wXo_arityP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw7$RELATION_W_O_ARITY)) && (NIL != kbi_utilities.kbi_applies_toP($kw7$RELATION_W_O_ARITY, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw7$RELATION_W_O_ARITY);
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
                                                        kbi_relation_wXo_arityP(relation);
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
                    kbi_utilities.kbi_increment_time($kw7$RELATION_W_O_ARITY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/O-ARITY applies to RELATION
     */
    public static final SubLObject why_relation_wXo_arityP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw7$RELATION_W_O_ARITY, relation)) {
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
                                                    kbi_relation_wXo_arityP(relation);
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
                                return list($kw7$RELATION_W_O_ARITY, relation, data);
                            } else {
                                return list($kw7$RELATION_W_O_ARITY, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXo_arityP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXo_arityP(SubLObject relation, SubLObject data) {
        return format(NIL, $str_alt14$_s_isa___Relation_but_has_no___ar, relation, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$_and_));
    }

    public static final SubLObject kbi_relation_wXo_arityP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(relation, $$Relation, mt, UNPROVIDED)) {
                            if (NIL == arity.arity(relation)) {
                                if (NIL == arity.variable_arityP(relation)) {
                                    kbi_utilities.add_kbi_result(mt);
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $relation_wXmal_arity_results$ = makeSymbol("*RELATION-W/MAL-ARITY-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXmal_arity_time$ = makeSymbol("*RELATION-W/MAL-ARITY-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXmal_arity_count$ = makeSymbol("*RELATION-W/MAL-ARITY-COUNT*");

    /**
     * test RELATION for invalid #$arity assertions
     */
    public static final SubLObject relation_wXmal_arityP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw25$RELATION_W_MAL_ARITY)) && (NIL != kbi_utilities.kbi_applies_toP($kw25$RELATION_W_MAL_ARITY, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw25$RELATION_W_MAL_ARITY);
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
                                                        kbi_relation_wXmal_arityP(relation);
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
                    kbi_utilities.kbi_increment_time($kw25$RELATION_W_MAL_ARITY, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/MAL-ARITY applies to RELATION
     */
    public static final SubLObject why_relation_wXmal_arityP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw25$RELATION_W_MAL_ARITY, relation)) {
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
                                                    kbi_relation_wXmal_arityP(relation);
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
                                return list($kw25$RELATION_W_MAL_ARITY, relation, data);
                            } else {
                                return list($kw25$RELATION_W_MAL_ARITY, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXmal_arityP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXmal_arityP(SubLObject relation, SubLObject data) {
        if (NIL != data) {
            return format(NIL, $str_alt27$_s_ascribed_invalid___arity___a, relation, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$_and_));
        }
        return NIL;
    }

    public static final SubLObject kbi_relation_wXmal_arityP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_any_mt(relation, $$arity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject v_arity = NIL;
                    for (v_arity = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_arity = csome_list_var.first()) {
                        if (NIL == el_utilities.valid_arity_p(v_arity)) {
                            kbi_utilities.add_kbi_result(v_arity);
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $relation_wXo_args_isa_results$ = makeSymbol("*RELATION-W/O-ARGS-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXo_args_isa_time$ = makeSymbol("*RELATION-W/O-ARGS-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXo_args_isa_count$ = makeSymbol("*RELATION-W/O-ARGS-ISA-COUNT*");

    /**
     * test RELATION for missing #$argsIsa assertions
     */
    public static final SubLObject relation_wXo_args_isaP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw35$RELATION_W_O_ARGS_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw35$RELATION_W_O_ARGS_ISA, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw35$RELATION_W_O_ARGS_ISA);
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
                                            SubLObject _prev_bind_0_9 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_relation_wXo_args_isaP(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_9, thread);
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
                    kbi_utilities.kbi_increment_time($kw35$RELATION_W_O_ARGS_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/O-ARGS-ISA applies to RELATION
     */
    public static final SubLObject why_relation_wXo_args_isaP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw35$RELATION_W_O_ARGS_ISA, relation)) {
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
                                        SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_relation_wXo_args_isaP(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw35$RELATION_W_O_ARGS_ISA, relation, data);
                            } else {
                                return list($kw35$RELATION_W_O_ARGS_ISA, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXo_args_isaP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXo_args_isaP(SubLObject relation, SubLObject data) {
        if (NIL != data) {
            return format(NIL, $str_alt37$_s_missing___argsIsa_in_mts___a, relation, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$_and_));
        }
        return NIL;
    }

    public static final SubLObject kbi_relation_wXo_args_isaP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(relation, $$Relation, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(relation)) {
                                if (NIL == kb_accessors.args_isa(relation, mt)) {
                                    kbi_utilities.add_kbi_result(mt);
                                    doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_isa_results$ = makeSymbol("*RELATION-W/O-ARG-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_isa_time$ = makeSymbol("*RELATION-W/O-ARG-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_isa_count$ = makeSymbol("*RELATION-W/O-ARG-ISA-COUNT*");

    /**
     * test RELATION for missing arg-isa (e.g., #$arg1Isa ...) assertions
     */
    public static final SubLObject relation_wXo_arg_isaP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw44$RELATION_W_O_ARG_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw44$RELATION_W_O_ARG_ISA, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw44$RELATION_W_O_ARG_ISA);
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
                                            SubLObject _prev_bind_0_13 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_relation_wXo_arg_isa(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
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
                                kbi_macros.$kbi_result$.rebind(_prev_bind_2, thread);
                                kbi_macros.$kbi_booleanP$.rebind(_prev_bind_1, thread);
                                kbi_macros.$kbi_doneP_fn$.rebind(_prev_bind_0, thread);
                            }
                        }
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    kbi_utilities.kbi_increment_time($kw44$RELATION_W_O_ARG_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/O-ARG-ISA applies to RELATION
     */
    public static final SubLObject why_relation_wXo_arg_isaP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw44$RELATION_W_O_ARG_ISA, relation)) {
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
                                        SubLObject _prev_bind_0_15 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_relation_wXo_arg_isa(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
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
                            kbi_macros.$kbi_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject pcase_var = mode;
                        if (pcase_var.eql($EL)) {
                            if (NIL != data) {
                                return list($kw44$RELATION_W_O_ARG_ISA, relation, data);
                            } else {
                                return list($kw44$RELATION_W_O_ARG_ISA, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXo_arg_isaP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXo_arg_isaP(SubLObject relation, SubLObject data) {
        if (NIL != data) {
            {
                SubLObject nl_result = format(NIL, $str_alt46$_s_missing, relation);
                SubLObject cdolist_list_var = data;
                SubLObject mt_args = NIL;
                for (mt_args = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_args = cdolist_list_var.first()) {
                    {
                        SubLObject mt = mt_args.first();
                        SubLObject arg_isa_preds = NIL;
                        SubLObject cdolist_list_var_17 = mt_args.rest();
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , arg = cdolist_list_var_17.first()) {
                            {
                                SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
                                if (NIL != arg_isa_pred) {
                                    arg_isa_preds = cons(string_utilities.object_to_string(arg_isa_pred), arg_isa_preds);
                                } else {
                                    arg_isa_preds = cons(format(NIL, $str_alt47$__arg_aIsa, arg), arg_isa_preds);
                                }
                            }
                        }
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt48$_____a__in__s_, string_utilities.stringify_items(nreverse(arg_isa_preds), symbol_function(IDENTITY), $str_alt16$__, $str_alt17$_and_), mt));
                    }
                }
                return nl_result;
            }
        }
        return NIL;
    }

    public static final SubLObject kbi_relation_wXo_arg_isa(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(relation, $$Relation, mt, UNPROVIDED)) {
                            if (NIL == arity.variable_arityP(relation)) {
                                {
                                    SubLObject v_arity = arity.arity(relation);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        {
                                            SubLObject mal_args = NIL;
                                            SubLObject n = NIL;
                                            for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                                                if (NIL == kb_accessors.argn_isa(relation, add(ONE_INTEGER, n), mt)) {
                                                    mal_args = cons(add(ONE_INTEGER, n), mal_args);
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
    public static final SubLSymbol $relation_wXo_args_genl_results$ = makeSymbol("*RELATION-W/O-ARGS-GENL-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXo_args_genl_time$ = makeSymbol("*RELATION-W/O-ARGS-GENL-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXo_args_genl_count$ = makeSymbol("*RELATION-W/O-ARGS-GENL-COUNT*");

    /**
     * test RELATION for missing #$argsGenl assertions
     */
    public static final SubLObject relation_wXo_args_genlP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw55$RELATION_W_O_ARGS_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($kw55$RELATION_W_O_ARGS_GENL, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw55$RELATION_W_O_ARGS_GENL);
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
                                            SubLObject _prev_bind_0_18 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_relation_wXo_args_genlP(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_18, thread);
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
                    kbi_utilities.kbi_increment_time($kw55$RELATION_W_O_ARGS_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/O-ARGS-GENL applies to RELATION
     */
    public static final SubLObject why_relation_wXo_args_genlP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw55$RELATION_W_O_ARGS_GENL, relation)) {
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
                                        SubLObject _prev_bind_0_20 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_relation_wXo_args_genlP(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_20, thread);
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
                                return list($kw55$RELATION_W_O_ARGS_GENL, relation, data);
                            } else {
                                return list($kw55$RELATION_W_O_ARGS_GENL, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXo_args_genlP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXo_args_genlP(SubLObject relation, SubLObject data) {
        return format(NIL, $str_alt57$_s_missing___argsGenl_in_mts___a, relation, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$_and_));
    }

    public static final SubLObject kbi_relation_wXo_args_genlP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(relation, $$Relation, mt, UNPROVIDED)) {
                            if (NIL != arity.variable_arityP(relation)) {
                                if (NIL == kb_accessors.args_genl(relation, mt)) {
                                    {
                                        SubLObject colP = NIL;
                                        if (NIL == colP) {
                                            {
                                                SubLObject csome_list_var_22 = kb_accessors.args_isa(relation, mt);
                                                SubLObject v_isa = NIL;
                                                for (v_isa = csome_list_var_22.first(); !((NIL != colP) || (NIL == csome_list_var_22)); csome_list_var_22 = csome_list_var_22.rest() , v_isa = csome_list_var_22.first()) {
                                                    colP = genls.genlsP(v_isa, $$Collection, mt, UNPROVIDED);
                                                }
                                            }
                                        }
                                        if (NIL != colP) {
                                            kbi_utilities.add_kbi_result(mt);
                                        }
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_genl_results$ = makeSymbol("*RELATION-W/O-ARG-GENL-RESULTS*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_genl_time$ = makeSymbol("*RELATION-W/O-ARG-GENL-TIME*");

    // defparameter
    public static final SubLSymbol $relation_wXo_arg_genl_count$ = makeSymbol("*RELATION-W/O-ARG-GENL-COUNT*");

    /**
     * test RELATION for missing arg-genl (e.g., #$arg1Genl ...) assertions
     */
    public static final SubLObject relation_wXo_arg_genlP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw65$RELATION_W_O_ARG_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($kw65$RELATION_W_O_ARG_GENL, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw65$RELATION_W_O_ARG_GENL);
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
                                                        kbi_relation_wXo_arg_genlP(relation);
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
                    kbi_utilities.kbi_increment_time($kw65$RELATION_W_O_ARG_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-W/O-ARG-GENL applies to RELATION
     */
    public static final SubLObject why_relation_wXo_arg_genlP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw65$RELATION_W_O_ARG_GENL, relation)) {
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
                                                    kbi_relation_wXo_arg_genlP(relation);
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
                                return list($kw65$RELATION_W_O_ARG_GENL, relation, data);
                            } else {
                                return list($kw65$RELATION_W_O_ARG_GENL, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_wXo_arg_genlP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_wXo_arg_genlP(SubLObject relation, SubLObject data) {
        {
            SubLObject nl_result = format(NIL, $str_alt46$_s_missing, relation);
            SubLObject cdolist_list_var = data;
            SubLObject arg_mts = NIL;
            for (arg_mts = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_mts = cdolist_list_var.first()) {
                {
                    SubLObject mt = arg_mts.first();
                    SubLObject args = arg_mts.rest();
                    nl_result = cconcatenate(nl_result, format(NIL, $str_alt48$_____a__in__s_, string_utilities.stringify_items(Mapping.mapcar(symbol_function(ARG_GENL_PRED), args), symbol_function(STR), $str_alt16$__, $str_alt68$__and_), mt));
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_relation_wXo_arg_genlP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != isa.isaP(relation, $$Relation, mt, UNPROVIDED)) {
                            if (NIL == arity.variable_arityP(relation)) {
                                {
                                    SubLObject v_arity = arity.arity(relation);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        {
                                            SubLObject mal_args = NIL;
                                            SubLObject n = NIL;
                                            for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                                                {
                                                    SubLObject colP = NIL;
                                                    if (NIL == colP) {
                                                        {
                                                            SubLObject csome_list_var_27 = kb_accessors.argn_isa(relation, add(ONE_INTEGER, n), mt);
                                                            SubLObject v_isa = NIL;
                                                            for (v_isa = csome_list_var_27.first(); !((NIL != colP) || (NIL == csome_list_var_27)); csome_list_var_27 = csome_list_var_27.rest() , v_isa = csome_list_var_27.first()) {
                                                                colP = genls.genlP(v_isa, $$Collection, mt, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                    if (NIL != colP) {
                                                        if (NIL == kb_accessors.argn_genl(relation, add(ONE_INTEGER, n), mt)) {
                                                            mal_args = cons(add(ONE_INTEGER, n), mal_args);
                                                        }
                                                    }
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
    public static final SubLSymbol $commutative_relation_wXo_common_arg_types_results$ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-RESULTS*");

    // defparameter
    public static final SubLSymbol $commutative_relation_wXo_common_arg_types_time$ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-TIME*");

    // defparameter
    public static final SubLSymbol $commutative_relation_wXo_common_arg_types_count$ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-COUNT*");

    /**
     * test commutative RELATION for #$arg1Isa not same as #$arg2Isa (similar for other arg typing constraints)
     */
    public static final SubLObject commutative_relation_wXo_common_arg_typesP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES)) && (NIL != kbi_utilities.kbi_applies_toP($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES);
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
                                            SubLObject _prev_bind_0_28 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_commutative_relation_wXo_common_arg_typesP(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_28, thread);
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
                    kbi_utilities.kbi_increment_time($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES applies to RELATION
     */
    public static final SubLObject why_commutative_relation_wXo_common_arg_typesP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, relation)) {
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
                                        SubLObject _prev_bind_0_30 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_commutative_relation_wXo_common_arg_typesP(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_30, thread);
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
                                return list($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, relation, data);
                            } else {
                                return list($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_commutative_relation_wXo_common_arg_typesP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject commutative_relations_without_common_arg_types(SubLObject relation_col) {
        if (relation_col == UNPROVIDED) {
            relation_col = $$Relation;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject relations = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        relations = isa.all_fort_instances(relation_col, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject list_var = relations;
                    utilities_macros.$progress_note$.setDynamicValue($str_alt79$Checking_for_commutative_relation, thread);
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
                                SubLObject relation = NIL;
                                for (relation = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , relation = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if (NIL != kbi_commutative_relation_wXo_common_arg_typesP(relation)) {
                                        result = cons(relation, result);
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
                return result;
            }
        }
    }

    public static final SubLObject kbi_nl_why_commutative_relation_wXo_common_arg_typesP(SubLObject relation, SubLObject data) {
        {
            SubLObject nl_result = $str_alt80$;
            SubLObject cdolist_list_var = data;
            SubLObject pred1Xarg1Xpred2Xarg2Xmt = NIL;
            for (pred1Xarg1Xpred2Xarg2Xmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred1Xarg1Xpred2Xarg2Xmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = pred1Xarg1Xpred2Xarg2Xmt;
                    SubLObject current = datum;
                    SubLObject pred1 = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject pred2 = NIL;
                    SubLObject arg2 = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    pred1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    pred2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    arg2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt82$__commutative__s_has__s___a__but_, new SubLObject[]{ relation, pred1, string_utilities.stringify_items(arg1, symbol_function(STR), $str_alt16$__, $str_alt17$_and_), pred2, string_utilities.stringify_items(arg2, symbol_function(STR), $str_alt16$__, $str_alt17$_and_), mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt81);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_commutative_relation_wXo_common_arg_typesP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.arg_type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.commutative_relationP(relation)) {
                            kbi_commutative_relation_wXo_common_arg_type_in_mtP(relation, mt);
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    public static final SubLObject kbi_commutative_relation_wXo_common_arg_type_in_mtP(SubLObject relation, SubLObject mt) {
        {
            SubLObject doneP = NIL;
            SubLObject v_arity = NIL;
            if (NIL == v_arity) {
                if (NIL != arity.variable_arityP(relation)) {
                    v_arity = kbi_utilities.max_type_constrained_arg(relation, mt);
                }
            }
            if (NIL != el_utilities.valid_arity_p(v_arity)) {
                if (NIL == doneP) {
                    {
                        SubLObject end_var = number_utilities.f_1X(v_arity);
                        SubLObject arg = NIL;
                        for (arg = ONE_INTEGER; !((NIL != doneP) || arg.numGE(end_var)); arg = number_utilities.f_1X(arg)) {
                            kbi_commutative_relation_wXo_common_type_for_arg_n_of_mP(relation, arg, v_arity, mt);
                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                        }
                    }
                }
            }
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_commutative_relation_wXo_common_type_for_arg_n_of_mP(SubLObject relation, SubLObject arg, SubLObject v_arity, SubLObject mt) {
        kbi_commutative_relation_wXo_common_isa_for_argP(relation, arg, v_arity, mt);
        if (NIL == kbi_utilities.kbi_doneP(UNPROVIDED)) {
            kbi_commutative_relation_wXo_common_genl_for_argP(relation, arg, v_arity, mt);
        }
        return kbi_utilities.kbi_result();
    }

    public static final SubLObject kbi_commutative_relation_wXo_common_isa_for_argP(SubLObject relation, SubLObject arg, SubLObject v_arity, SubLObject mt) {
        {
            SubLObject doneP = NIL;
            SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg, UNPROVIDED, UNPROVIDED);
            SubLObject arg_isa = (NIL != arg_isa_pred) ? ((SubLObject) (genls.min_cols(kb_accessors.argn_isa(relation, arg, mt), mt, UNPROVIDED))) : NIL;
            if (NIL != arg_isa) {
                {
                    SubLObject starting_arg2 = number_utilities.f_1X(arg);
                    SubLObject ending_arg2 = add(starting_arg2, subtract(v_arity, arg));
                    if (NIL == doneP) {
                        {
                            SubLObject end_var = number_utilities.f_1X(ending_arg2);
                            SubLObject arg2 = NIL;
                            for (arg2 = starting_arg2; !((NIL != doneP) || arg2.numGE(end_var)); arg2 = number_utilities.f_1X(arg2)) {
                                if (!arg.numE(arg2)) {
                                    {
                                        SubLObject arg2_isa_pred = kb_accessors.arg_isa_pred(arg2, UNPROVIDED, UNPROVIDED);
                                        SubLObject arg2_isa = (NIL != arg2_isa_pred) ? ((SubLObject) (genls.min_cols(kb_accessors.argn_isa(relation, arg2, mt), mt, UNPROVIDED))) : NIL;
                                        if (NIL == list_utilities.sets_equalP(arg_isa, arg2_isa, symbol_function($sym83$EQUALS_))) {
                                            kbi_utilities.add_kbi_result(list(arg_isa_pred, arg_isa, arg2_isa_pred, arg2_isa, mt));
                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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

    public static final SubLObject kbi_commutative_relation_wXo_common_genl_for_argP(SubLObject relation, SubLObject arg, SubLObject v_arity, SubLObject mt) {
        {
            SubLObject doneP = NIL;
            SubLObject arg_genl_pred = kb_accessors.arg_genl_pred(arg, UNPROVIDED, UNPROVIDED);
            SubLObject arg_genl = (NIL != arg_genl_pred) ? ((SubLObject) (genls.min_cols(kb_accessors.argn_genl(relation, arg, mt), mt, UNPROVIDED))) : NIL;
            if (NIL != arg_genl) {
                {
                    SubLObject starting_arg2 = number_utilities.f_1X(arg);
                    SubLObject ending_arg2 = add(starting_arg2, subtract(v_arity, arg));
                    if (NIL == doneP) {
                        {
                            SubLObject end_var = number_utilities.f_1X(ending_arg2);
                            SubLObject arg2 = NIL;
                            for (arg2 = starting_arg2; !((NIL != doneP) || arg2.numGE(end_var)); arg2 = number_utilities.f_1X(arg2)) {
                                if (!arg.numE(arg2)) {
                                    {
                                        SubLObject arg2_genl_pred = kb_accessors.arg_genl_pred(arg2, UNPROVIDED, UNPROVIDED);
                                        SubLObject arg2_genl = (NIL != arg2_genl_pred) ? ((SubLObject) (genls.min_cols(kb_accessors.argn_genl(relation, arg2, mt), mt, UNPROVIDED))) : NIL;
                                        if (NIL == list_utilities.sets_equalP(arg_genl, arg2_genl, symbol_function($sym83$EQUALS_))) {
                                            kbi_utilities.add_kbi_result(list(arg_genl_pred, arg_genl, arg2_genl_pred, arg2_genl, mt));
                                            doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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







    /**
     * test RELATION for inter-arg-isa not subsumed by arg-isa
     */
    public static final SubLObject relation_inter_arg_isa_not_subsumed_by_arg_isaP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA);
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
                                            SubLObject _prev_bind_0_32 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_relation_inter_arg_isa_not_subsumed_by_arg_isaP(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_32, thread);
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
                    kbi_utilities.kbi_increment_time($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA applies to RELATION
     */
    public static final SubLObject why_relation_inter_arg_isa_not_subsumed_by_arg_isaP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, relation)) {
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
                                        SubLObject _prev_bind_0_34 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_relation_inter_arg_isa_not_subsumed_by_arg_isaP(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_34, thread);
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
                                return list($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, relation, data);
                            } else {
                                return list($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_inter_arg_isa_not_subsumed_by_arg_isaP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_inter_arg_isa_not_subsumed_by_arg_isaP(SubLObject relation, SubLObject data) {
        {
            SubLObject nl_result = $str_alt80$;
            SubLObject cdolist_list_var = data;
            SubLObject pred1Xarg1Xpred2Xarg2Xmt = NIL;
            for (pred1Xarg1Xpred2Xarg2Xmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred1Xarg1Xpred2Xarg2Xmt = cdolist_list_var.first()) {
                {
                    SubLObject datum = pred1Xarg1Xpred2Xarg2Xmt;
                    SubLObject current = datum;
                    SubLObject pred1 = NIL;
                    SubLObject arg1 = NIL;
                    SubLObject pred2 = NIL;
                    SubLObject arg2 = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    pred1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    arg1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    pred2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    arg2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt92$___s_has__s___a__but_has__s___a__, new SubLObject[]{ relation, pred1, arg1, pred2, arg2, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt81);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_relation_inter_arg_isa_not_subsumed_by_arg_isaP(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.arg_type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != term.kb_relationP(relation)) {
                            if (NIL != arity.variable_arityP(relation)) {
                                kbi_relation_inter_arg_isa_not_subsumed_by_arg_isa_in_mtP(relation, ZERO_INTEGER, mt);
                            } else {
                                {
                                    SubLObject v_arity = arity.arity(relation);
                                    if (NIL != el_utilities.valid_arity_p(v_arity)) {
                                        if (NIL == doneP) {
                                            {
                                                SubLObject end_var = number_utilities.f_1X(v_arity);
                                                SubLObject arg = NIL;
                                                for (arg = ONE_INTEGER; !((NIL != doneP) || arg.numGE(end_var)); arg = number_utilities.f_1X(arg)) {
                                                    kbi_relation_inter_arg_isa_not_subsumed_by_arg_isa_in_mtP(relation, arg, mt);
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

    public static final SubLObject kbi_relation_inter_arg_isa_not_subsumed_by_arg_isa_in_mtP(SubLObject relation, SubLObject arg, SubLObject mt) {
        {
            SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg, relation, mt);
            SubLObject argn_isa = genls.min_cols(kb_accessors.argn_isa(relation, arg, mt), mt, UNPROVIDED);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.inter_arg_isa_preds_dep(arg);
                    SubLObject inter_arg_pred = NIL;
                    for (inter_arg_pred = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_pred = csome_list_var.first()) {
                        {
                            SubLObject inter_arg_isa_dep = genls.min_cols(kb_accessors.inter_arg_isa_dep(relation, inter_arg_pred, mt), mt, UNPROVIDED);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_36 = inter_arg_isa_dep;
                                    SubLObject dep = NIL;
                                    for (dep = csome_list_var_36.first(); !((NIL != doneP) || (NIL == csome_list_var_36)); csome_list_var_36 = csome_list_var_36.rest() , dep = csome_list_var_36.first()) {
                                        if (NIL == genls.all_genlP(dep, argn_isa, mt, UNPROVIDED)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var_37 = argn_isa;
                                                    SubLObject v_isa = NIL;
                                                    for (v_isa = csome_list_var_37.first(); !((NIL != doneP) || (NIL == csome_list_var_37)); csome_list_var_37 = csome_list_var_37.rest() , v_isa = csome_list_var_37.first()) {
                                                        if (NIL == genls.genlsP(dep, v_isa, mt, UNPROVIDED)) {
                                                            kbi_utilities.add_kbi_result(list(arg_isa_pred, v_isa, inter_arg_pred, dep, mt));
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
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = kb_accessors.inter_arg_isa_preds_indep(arg);
                    SubLObject inter_arg_pred = NIL;
                    for (inter_arg_pred = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , inter_arg_pred = csome_list_var.first()) {
                        {
                            SubLObject inter_arg_isa_indep = genls.min_cols(kb_accessors.inter_arg_isa_indep(relation, inter_arg_pred, mt), mt, UNPROVIDED);
                            if (NIL == doneP) {
                                {
                                    SubLObject csome_list_var_38 = inter_arg_isa_indep;
                                    SubLObject indep = NIL;
                                    for (indep = csome_list_var_38.first(); !((NIL != doneP) || (NIL == csome_list_var_38)); csome_list_var_38 = csome_list_var_38.rest() , indep = csome_list_var_38.first()) {
                                        if (NIL == genls.all_genlP(indep, argn_isa, mt, UNPROVIDED)) {
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var_39 = argn_isa;
                                                    SubLObject v_isa = NIL;
                                                    for (v_isa = csome_list_var_39.first(); !((NIL != doneP) || (NIL == csome_list_var_39)); csome_list_var_39 = csome_list_var_39.rest() , v_isa = csome_list_var_39.first()) {
                                                        if (NIL == genls.genlsP(indep, v_isa, mt, UNPROVIDED)) {
                                                            kbi_utilities.add_kbi_result(list(arg_isa_pred, v_isa, inter_arg_pred, indep, mt));
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
        return kbi_utilities.kbi_result();
    }







    /**
     * test RELATION fort for variable arity but not commutative
     */
    public static final SubLObject relation_variable_arity_not_commutativeP(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE)) && (NIL != kbi_utilities.kbi_applies_toP($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, relation))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE);
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
                                            SubLObject _prev_bind_0_40 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_relation_variable_arity_not_commutative_in_mts(relation);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_40, thread);
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
                    kbi_utilities.kbi_increment_time($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE applies to RELATION
     */
    public static final SubLObject why_relation_variable_arity_not_commutativeP(SubLObject relation, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, relation)) {
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
                                        SubLObject _prev_bind_0_42 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_relation_variable_arity_not_commutative_in_mts(relation);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_42, thread);
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
                                return list($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, relation, data);
                            } else {
                                return list($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, relation);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_relation_variable_arity_not_commutativeP(relation, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_relation_variable_arity_not_commutativeP(SubLObject relation, SubLObject data) {
        return format(NIL, $str_alt101$_s_is_variable_arity_but_not_comm, relation, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$_and_));
    }

    public static final SubLObject kbi_relation_variable_arity_not_commutative_in_mts(SubLObject relation) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(relation);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != arity.variable_arityP(relation)) {
                            if (!((NIL != fort_types_interface.commutative_relationP(relation)) || (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(relation, $$commutativeInArgsAndRest, mt, UNPROVIDED, UNPROVIDED)))) {
                                if (NIL == isa.isaP(relation, $$UnitOfMeasure, mt, UNPROVIDED)) {
                                    if (NIL == subl_promotions.memberP($$List, kb_accessors.result_isa(relation, mt), UNPROVIDED, UNPROVIDED)) {
                                        kbi_utilities.add_kbi_result(mt);
                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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

    public static final SubLObject declare_kbi_relation_file() {
        declareFunction("diagnose_qua_relation", "DIAGNOSE-QUA-RELATION", 1, 0, false);
        declareFunction("relation_wXo_arityP", "RELATION-W/O-ARITY?", 1, 0, false);
        declareFunction("why_relation_wXo_arityP", "WHY-RELATION-W/O-ARITY?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXo_arityP", "KBI-NL-WHY-RELATION-W/O-ARITY?", 2, 0, false);
        declareFunction("kbi_relation_wXo_arityP", "KBI-RELATION-W/O-ARITY?", 1, 0, false);
        declareFunction("relation_wXmal_arityP", "RELATION-W/MAL-ARITY?", 1, 0, false);
        declareFunction("why_relation_wXmal_arityP", "WHY-RELATION-W/MAL-ARITY?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXmal_arityP", "KBI-NL-WHY-RELATION-W/MAL-ARITY?", 2, 0, false);
        declareFunction("kbi_relation_wXmal_arityP", "KBI-RELATION-W/MAL-ARITY?", 1, 0, false);
        declareFunction("relation_wXo_args_isaP", "RELATION-W/O-ARGS-ISA?", 1, 0, false);
        declareFunction("why_relation_wXo_args_isaP", "WHY-RELATION-W/O-ARGS-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXo_args_isaP", "KBI-NL-WHY-RELATION-W/O-ARGS-ISA?", 2, 0, false);
        declareFunction("kbi_relation_wXo_args_isaP", "KBI-RELATION-W/O-ARGS-ISA?", 1, 0, false);
        declareFunction("relation_wXo_arg_isaP", "RELATION-W/O-ARG-ISA?", 1, 0, false);
        declareFunction("why_relation_wXo_arg_isaP", "WHY-RELATION-W/O-ARG-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXo_arg_isaP", "KBI-NL-WHY-RELATION-W/O-ARG-ISA?", 2, 0, false);
        declareFunction("kbi_relation_wXo_arg_isa", "KBI-RELATION-W/O-ARG-ISA", 1, 0, false);
        declareFunction("relation_wXo_args_genlP", "RELATION-W/O-ARGS-GENL?", 1, 0, false);
        declareFunction("why_relation_wXo_args_genlP", "WHY-RELATION-W/O-ARGS-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXo_args_genlP", "KBI-NL-WHY-RELATION-W/O-ARGS-GENL?", 2, 0, false);
        declareFunction("kbi_relation_wXo_args_genlP", "KBI-RELATION-W/O-ARGS-GENL?", 1, 0, false);
        declareFunction("relation_wXo_arg_genlP", "RELATION-W/O-ARG-GENL?", 1, 0, false);
        declareFunction("why_relation_wXo_arg_genlP", "WHY-RELATION-W/O-ARG-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_wXo_arg_genlP", "KBI-NL-WHY-RELATION-W/O-ARG-GENL?", 2, 0, false);
        declareFunction("kbi_relation_wXo_arg_genlP", "KBI-RELATION-W/O-ARG-GENL?", 1, 0, false);
        declareFunction("commutative_relation_wXo_common_arg_typesP", "COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?", 1, 0, false);
        declareFunction("why_commutative_relation_wXo_common_arg_typesP", "WHY-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?", 1, 1, false);
        declareFunction("commutative_relations_without_common_arg_types", "COMMUTATIVE-RELATIONS-WITHOUT-COMMON-ARG-TYPES", 0, 1, false);
        declareFunction("kbi_nl_why_commutative_relation_wXo_common_arg_typesP", "KBI-NL-WHY-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?", 2, 0, false);
        declareFunction("kbi_commutative_relation_wXo_common_arg_typesP", "KBI-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?", 1, 0, false);
        declareFunction("kbi_commutative_relation_wXo_common_arg_type_in_mtP", "KBI-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPE-IN-MT?", 2, 0, false);
        declareFunction("kbi_commutative_relation_wXo_common_type_for_arg_n_of_mP", "KBI-COMMUTATIVE-RELATION-W/O-COMMON-TYPE-FOR-ARG-N-OF-M?", 4, 0, false);
        declareFunction("kbi_commutative_relation_wXo_common_isa_for_argP", "KBI-COMMUTATIVE-RELATION-W/O-COMMON-ISA-FOR-ARG?", 4, 0, false);
        declareFunction("kbi_commutative_relation_wXo_common_genl_for_argP", "KBI-COMMUTATIVE-RELATION-W/O-COMMON-GENL-FOR-ARG?", 4, 0, false);
        declareFunction("relation_inter_arg_isa_not_subsumed_by_arg_isaP", "RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?", 1, 0, false);
        declareFunction("why_relation_inter_arg_isa_not_subsumed_by_arg_isaP", "WHY-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_inter_arg_isa_not_subsumed_by_arg_isaP", "KBI-NL-WHY-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?", 2, 0, false);
        declareFunction("kbi_relation_inter_arg_isa_not_subsumed_by_arg_isaP", "KBI-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?", 1, 0, false);
        declareFunction("kbi_relation_inter_arg_isa_not_subsumed_by_arg_isa_in_mtP", "KBI-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-IN-MT?", 3, 0, false);
        declareFunction("relation_variable_arity_not_commutativeP", "RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?", 1, 0, false);
        declareFunction("why_relation_variable_arity_not_commutativeP", "WHY-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?", 1, 1, false);
        declareFunction("kbi_nl_why_relation_variable_arity_not_commutativeP", "KBI-NL-WHY-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?", 2, 0, false);
        declareFunction("kbi_relation_variable_arity_not_commutative_in_mts", "KBI-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE-IN-MTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_relation_file() {
        defparameter("*RELATION-W/O-ARITY-RESULTS*", NIL);
        defparameter("*RELATION-W/O-ARITY-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARITY-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-W/MAL-ARITY-RESULTS*", NIL);
        defparameter("*RELATION-W/MAL-ARITY-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/MAL-ARITY-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARGS-ISA-RESULTS*", NIL);
        defparameter("*RELATION-W/O-ARGS-ISA-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARGS-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARG-ISA-RESULTS*", NIL);
        defparameter("*RELATION-W/O-ARG-ISA-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARG-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARGS-GENL-RESULTS*", NIL);
        defparameter("*RELATION-W/O-ARGS-GENL-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARGS-GENL-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARG-GENL-RESULTS*", NIL);
        defparameter("*RELATION-W/O-ARG-GENL-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-W/O-ARG-GENL-COUNT*", ZERO_INTEGER);
        defparameter("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-RESULTS*", NIL);
        defparameter("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-TIME*", ZERO_INTEGER);
        defparameter("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-COUNT*", ZERO_INTEGER);
        defparameter("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-RESULTS*", NIL);
        defparameter("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-TIME*", ZERO_INTEGER);
        defparameter("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-RESULTS*", NIL);
        defparameter("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-TIME*", ZERO_INTEGER);
        defparameter("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_relation_file() {
                {
            SubLObject item_var = $sym1$_RELATION_W_O_ARITY_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym1$_RELATION_W_O_ARITY_RESULTS_, $str_alt2$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym3$_RELATION_W_O_ARITY_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym3$_RELATION_W_O_ARITY_TIME_, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym5$_RELATION_W_O_ARITY_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym5$_RELATION_W_O_ARITY_COUNT_, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw7$RELATION_W_O_ARITY, $list_alt13);
        {
            SubLObject item_var = $sym19$_RELATION_W_MAL_ARITY_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym19$_RELATION_W_MAL_ARITY_RESULTS_, $str_alt20$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym21$_RELATION_W_MAL_ARITY_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym21$_RELATION_W_MAL_ARITY_TIME_, $str_alt22$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym23$_RELATION_W_MAL_ARITY_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym23$_RELATION_W_MAL_ARITY_COUNT_, $str_alt24$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw25$RELATION_W_MAL_ARITY, $list_alt26);
        {
            SubLObject item_var = $sym29$_RELATION_W_O_ARGS_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym29$_RELATION_W_O_ARGS_ISA_RESULTS_, $str_alt30$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym31$_RELATION_W_O_ARGS_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym31$_RELATION_W_O_ARGS_ISA_TIME_, $str_alt32$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym33$_RELATION_W_O_ARGS_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym33$_RELATION_W_O_ARGS_ISA_COUNT_, $str_alt34$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw35$RELATION_W_O_ARGS_ISA, $list_alt36);
        {
            SubLObject item_var = $sym38$_RELATION_W_O_ARG_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym38$_RELATION_W_O_ARG_ISA_RESULTS_, $str_alt39$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym40$_RELATION_W_O_ARG_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym40$_RELATION_W_O_ARG_ISA_TIME_, $str_alt41$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym42$_RELATION_W_O_ARG_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym42$_RELATION_W_O_ARG_ISA_COUNT_, $str_alt43$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw44$RELATION_W_O_ARG_ISA, $list_alt45);
        {
            SubLObject item_var = $sym49$_RELATION_W_O_ARGS_GENL_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym49$_RELATION_W_O_ARGS_GENL_RESULTS_, $str_alt50$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym51$_RELATION_W_O_ARGS_GENL_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym51$_RELATION_W_O_ARGS_GENL_TIME_, $str_alt52$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym53$_RELATION_W_O_ARGS_GENL_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym53$_RELATION_W_O_ARGS_GENL_COUNT_, $str_alt54$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw55$RELATION_W_O_ARGS_GENL, $list_alt56);
        {
            SubLObject item_var = $sym59$_RELATION_W_O_ARG_GENL_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym59$_RELATION_W_O_ARG_GENL_RESULTS_, $str_alt60$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $sym61$_RELATION_W_O_ARG_GENL_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym61$_RELATION_W_O_ARG_GENL_TIME_, $str_alt62$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym63$_RELATION_W_O_ARG_GENL_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym63$_RELATION_W_O_ARG_GENL_COUNT_, $str_alt64$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw65$RELATION_W_O_ARG_GENL, $list_alt66);
        {
            SubLObject item_var = $sym69$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym69$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_RESULTS_, $str_alt70$violators_of_kbi_module__COMMUTAT);
        {
            SubLObject item_var = $sym71$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym71$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_TIME_, $str_alt72$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym73$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym73$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_COUNT_, $str_alt74$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES, $list_alt76);
        {
            SubLObject item_var = $relation_inter_arg_isa_not_subsumed_by_arg_isa_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($relation_inter_arg_isa_not_subsumed_by_arg_isa_results$, $str_alt85$violators_of_kbi_module__RELATION);
        {
            SubLObject item_var = $relation_inter_arg_isa_not_subsumed_by_arg_isa_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($relation_inter_arg_isa_not_subsumed_by_arg_isa_time$, $str_alt87$run_time_of_predicate_application);
        {
            SubLObject item_var = $relation_inter_arg_isa_not_subsumed_by_arg_isa_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($relation_inter_arg_isa_not_subsumed_by_arg_isa_count$, $str_alt89$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA, $list_alt91);
        {
            SubLObject item_var = $variable_arity_relation_not_commutative_results$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($variable_arity_relation_not_commutative_results$, $str_alt94$violators_of_kbi_module__VARIABLE);
        {
            SubLObject item_var = $variable_arity_relation_not_commutative_time$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($variable_arity_relation_not_commutative_time$, $str_alt96$run_time_of_predicate_application);
        {
            SubLObject item_var = $variable_arity_relation_not_commutative_count$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($variable_arity_relation_not_commutative_count$, $str_alt98$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE, $list_alt100);
        return NIL;
    }



    static private final SubLSymbol $sym1$_RELATION_W_O_ARITY_RESULTS_ = makeSymbol("*RELATION-W/O-ARITY-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/O-ARITY");

    static private final SubLSymbol $sym3$_RELATION_W_O_ARITY_TIME_ = makeSymbol("*RELATION-W/O-ARITY-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/O-ARITY");

    static private final SubLSymbol $sym5$_RELATION_W_O_ARITY_COUNT_ = makeSymbol("*RELATION-W/O-ARITY-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/O-ARITY");

    public static final SubLSymbol $kw7$RELATION_W_O_ARITY = makeKeyword("RELATION-W/O-ARITY");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/O-ARITY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/O-ARITY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/O-ARITY-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/O-ARITY?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/O-ARITY?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/O-ARITY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/O-ARITY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for missing #$arity assertions") });

    static private final SubLString $str_alt14$_s_isa___Relation_but_has_no___ar = makeString("~s isa #$Relation but has no #$arity in mts: ~a");



    static private final SubLString $str_alt16$__ = makeString(", ");

    static private final SubLString $str_alt17$_and_ = makeString(" and ");

    public static final SubLObject $$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));

    static private final SubLSymbol $sym19$_RELATION_W_MAL_ARITY_RESULTS_ = makeSymbol("*RELATION-W/MAL-ARITY-RESULTS*");

    static private final SubLString $str_alt20$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/MAL-ARITY");

    static private final SubLSymbol $sym21$_RELATION_W_MAL_ARITY_TIME_ = makeSymbol("*RELATION-W/MAL-ARITY-TIME*");

    static private final SubLString $str_alt22$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/MAL-ARITY");

    static private final SubLSymbol $sym23$_RELATION_W_MAL_ARITY_COUNT_ = makeSymbol("*RELATION-W/MAL-ARITY-COUNT*");

    static private final SubLString $str_alt24$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/MAL-ARITY");

    public static final SubLSymbol $kw25$RELATION_W_MAL_ARITY = makeKeyword("RELATION-W/MAL-ARITY");

    static private final SubLList $list_alt26 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/MAL-ARITY-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/MAL-ARITY-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/MAL-ARITY-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/MAL-ARITY?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/MAL-ARITY?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/MAL-ARITY?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/MAL-ARITY?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for invalid #$arity assertions") });

    static private final SubLString $str_alt27$_s_ascribed_invalid___arity___a = makeString("~s ascribed invalid #$arity: ~a");

    public static final SubLObject $$arity = constant_handles.reader_make_constant_shell(makeString("arity"));

    static private final SubLSymbol $sym29$_RELATION_W_O_ARGS_ISA_RESULTS_ = makeSymbol("*RELATION-W/O-ARGS-ISA-RESULTS*");

    static private final SubLString $str_alt30$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/O-ARGS-ISA");

    static private final SubLSymbol $sym31$_RELATION_W_O_ARGS_ISA_TIME_ = makeSymbol("*RELATION-W/O-ARGS-ISA-TIME*");

    static private final SubLString $str_alt32$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/O-ARGS-ISA");

    static private final SubLSymbol $sym33$_RELATION_W_O_ARGS_ISA_COUNT_ = makeSymbol("*RELATION-W/O-ARGS-ISA-COUNT*");

    static private final SubLString $str_alt34$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/O-ARGS-ISA");

    public static final SubLSymbol $kw35$RELATION_W_O_ARGS_ISA = makeKeyword("RELATION-W/O-ARGS-ISA");

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/O-ARGS-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/O-ARGS-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/O-ARGS-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/O-ARGS-ISA?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/O-ARGS-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/O-ARGS-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/O-ARGS-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for missing #$argsIsa assertions") });

    static private final SubLString $str_alt37$_s_missing___argsIsa_in_mts___a = makeString("~s missing #$argsIsa in mts: ~a");

    static private final SubLSymbol $sym38$_RELATION_W_O_ARG_ISA_RESULTS_ = makeSymbol("*RELATION-W/O-ARG-ISA-RESULTS*");

    static private final SubLString $str_alt39$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/O-ARG-ISA");

    static private final SubLSymbol $sym40$_RELATION_W_O_ARG_ISA_TIME_ = makeSymbol("*RELATION-W/O-ARG-ISA-TIME*");

    static private final SubLString $str_alt41$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/O-ARG-ISA");

    static private final SubLSymbol $sym42$_RELATION_W_O_ARG_ISA_COUNT_ = makeSymbol("*RELATION-W/O-ARG-ISA-COUNT*");

    static private final SubLString $str_alt43$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/O-ARG-ISA");

    public static final SubLSymbol $kw44$RELATION_W_O_ARG_ISA = makeKeyword("RELATION-W/O-ARG-ISA");

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/O-ARG-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/O-ARG-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/O-ARG-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/O-ARG-ISA"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/O-ARG-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/O-ARG-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/O-ARG-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for missing arg-isa (e.g., #$arg1Isa ...) assertions") });

    static private final SubLString $str_alt46$_s_missing = makeString("~s missing");

    static private final SubLString $str_alt47$__arg_aIsa = makeString("#$arg~aIsa");

    static private final SubLString $str_alt48$_____a__in__s_ = makeString("~%  ~a [in ~s]");

    static private final SubLSymbol $sym49$_RELATION_W_O_ARGS_GENL_RESULTS_ = makeSymbol("*RELATION-W/O-ARGS-GENL-RESULTS*");

    static private final SubLString $str_alt50$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/O-ARGS-GENL");

    static private final SubLSymbol $sym51$_RELATION_W_O_ARGS_GENL_TIME_ = makeSymbol("*RELATION-W/O-ARGS-GENL-TIME*");

    static private final SubLString $str_alt52$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/O-ARGS-GENL");

    static private final SubLSymbol $sym53$_RELATION_W_O_ARGS_GENL_COUNT_ = makeSymbol("*RELATION-W/O-ARGS-GENL-COUNT*");

    static private final SubLString $str_alt54$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/O-ARGS-GENL");

    public static final SubLSymbol $kw55$RELATION_W_O_ARGS_GENL = makeKeyword("RELATION-W/O-ARGS-GENL");

    static private final SubLList $list_alt56 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/O-ARGS-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/O-ARGS-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/O-ARGS-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/O-ARGS-GENL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/O-ARGS-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/O-ARGS-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/O-ARGS-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for missing #$argsGenl assertions") });

    static private final SubLString $str_alt57$_s_missing___argsGenl_in_mts___a = makeString("~s missing #$argsGenl in mts: ~a");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    static private final SubLSymbol $sym59$_RELATION_W_O_ARG_GENL_RESULTS_ = makeSymbol("*RELATION-W/O-ARG-GENL-RESULTS*");

    static private final SubLString $str_alt60$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-W/O-ARG-GENL");

    static private final SubLSymbol $sym61$_RELATION_W_O_ARG_GENL_TIME_ = makeSymbol("*RELATION-W/O-ARG-GENL-TIME*");

    static private final SubLString $str_alt62$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-W/O-ARG-GENL");

    static private final SubLSymbol $sym63$_RELATION_W_O_ARG_GENL_COUNT_ = makeSymbol("*RELATION-W/O-ARG-GENL-COUNT*");

    static private final SubLString $str_alt64$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-W/O-ARG-GENL");

    public static final SubLSymbol $kw65$RELATION_W_O_ARG_GENL = makeKeyword("RELATION-W/O-ARG-GENL");

    static private final SubLList $list_alt66 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-W/O-ARG-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-W/O-ARG-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-W/O-ARG-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-W/O-ARG-GENL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-W/O-ARG-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-W/O-ARG-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-W/O-ARG-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test RELATION for missing arg-genl (e.g., #$arg1Genl ...) assertions") });

    private static final SubLSymbol ARG_GENL_PRED = makeSymbol("ARG-GENL-PRED");

    static private final SubLString $str_alt68$__and_ = makeString(", and ");

    static private final SubLSymbol $sym69$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_RESULTS_ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-RESULTS*");

    static private final SubLString $str_alt70$violators_of_kbi_module__COMMUTAT = makeString("violators of kbi module :COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES");

    static private final SubLSymbol $sym71$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_TIME_ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-TIME*");

    static private final SubLString $str_alt72$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES");

    static private final SubLSymbol $sym73$_COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES_COUNT_ = makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-COUNT*");

    static private final SubLString $str_alt74$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES");

    public static final SubLSymbol $kw75$COMMUTATIVE_RELATION_W_O_COMMON_ARG_TYPES = makeKeyword("COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES");

    static private final SubLList $list_alt76 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-REQUIRED-FN"), makeSymbol("COMMUTATIVE-RELATION?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-COMMUTATIVE-RELATION-W/O-COMMON-ARG-TYPES?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test commutative RELATION for #$arg1Isa not same as #$arg2Isa (similar for other arg typing constraints)") });



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt79$Checking_for_commutative_relation = makeString("Checking for commutative relations without common arg types");

    static private final SubLString $str_alt80$ = makeString("");

    static private final SubLList $list_alt81 = list(makeSymbol("PRED1"), makeSymbol("ARG1"), makeSymbol("PRED2"), makeSymbol("ARG2"), makeSymbol("MT"));

    static private final SubLString $str_alt82$__commutative__s_has__s___a__but_ = makeString("~%commutative ~s has ~s (~a) but has ~s (~a) [in ~s]");

    static private final SubLSymbol $sym83$EQUALS_ = makeSymbol("EQUALS?");

    public static final SubLSymbol $relation_inter_arg_isa_not_subsumed_by_arg_isa_results$ = makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-RESULTS*");

    static private final SubLString $str_alt85$violators_of_kbi_module__RELATION = makeString("violators of kbi module :RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA");

    public static final SubLSymbol $relation_inter_arg_isa_not_subsumed_by_arg_isa_time$ = makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-TIME*");

    static private final SubLString $str_alt87$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA");

    public static final SubLSymbol $relation_inter_arg_isa_not_subsumed_by_arg_isa_count$ = makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-COUNT*");

    static private final SubLString $str_alt89$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA");

    private static final SubLSymbol $RELATION_INTER_ARG_ISA_NOT_SUBSUMED_BY_ARG_ISA = makeKeyword("RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA");

    static private final SubLList $list_alt91 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-INTER-ARG-ISA-NOT-SUBSUMED-BY-ARG-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test RELATION for inter-arg-isa not subsumed by arg-isa") });

    static private final SubLString $str_alt92$___s_has__s___a__but_has__s___a__ = makeString("~%~s has ~s (~a) but has ~s (~a) [in ~s]");

    public static final SubLSymbol $variable_arity_relation_not_commutative_results$ = makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-RESULTS*");

    static private final SubLString $str_alt94$violators_of_kbi_module__VARIABLE = makeString("violators of kbi module :VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE");

    public static final SubLSymbol $variable_arity_relation_not_commutative_time$ = makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-TIME*");

    static private final SubLString $str_alt96$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE");

    public static final SubLSymbol $variable_arity_relation_not_commutative_count$ = makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-COUNT*");

    static private final SubLString $str_alt98$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE");

    private static final SubLSymbol $VARIABLE_ARITY_RELATION_NOT_COMMUTATIVE = makeKeyword("VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE");

    static private final SubLList $list_alt100 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*VARIABLE-ARITY-RELATION-NOT-COMMUTATIVE-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("RELATION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-REQUIRED-FN"), makeSymbol("VARIABLE-ARITY?"), makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-RELATION-VARIABLE-ARITY-NOT-COMMUTATIVE?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), $WARN, makeKeyword("KBI-DOC"), makeString("test RELATION fort for variable arity but not commutative") });

    static private final SubLString $str_alt101$_s_is_variable_arity_but_not_comm = makeString("~s is variable arity but not commutative in mts: ~a");

    public static final SubLObject $$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell(makeString("commutativeInArgsAndRest"));

    public static final SubLObject $$UnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("UnitOfMeasure"));

    public static final SubLObject $$List = constant_handles.reader_make_constant_shell(makeString("List"));

    // // Initializers
    public void declareFunctions() {
        declare_kbi_relation_file();
    }

    public void initializeVariables() {
        init_kbi_relation_file();
    }

    public void runTopLevelForms() {
        setup_kbi_relation_file();
    }
}

