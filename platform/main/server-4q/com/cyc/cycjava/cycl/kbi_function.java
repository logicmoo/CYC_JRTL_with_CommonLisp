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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      KBI-FUNCTION
 *  source file: /cyc/top/cycl/kbi-function.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_function extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_function() {
    }

    public static final SubLFile me = new kbi_function();


    // // Definitions
    public static final SubLObject diagnose_qua_function(SubLObject function) {
        return kbi_utilities.diagnose_qua_sub_domains(function, $FUNCTION);
    }

    // defparameter
    public static final SubLSymbol $function_wXo_result_isa_results$ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $function_wXo_result_isa_time$ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $function_wXo_result_isa_count$ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-COUNT*");

    /**
     * test FUNCTION fort for missing #$resultIsa assertions
     */
    public static final SubLObject function_wXo_result_isaP(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw7$FUNCTION_W_O_RESULT_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw7$FUNCTION_W_O_RESULT_ISA, function))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw7$FUNCTION_W_O_RESULT_ISA);
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
                                                        kbi_function_wXo_result_isa_in_mts(function);
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
                    kbi_utilities.kbi_increment_time($kw7$FUNCTION_W_O_RESULT_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FUNCTION-W/O-RESULT-ISA applies to FUNCTION
     */
    public static final SubLObject why_function_wXo_result_isaP(SubLObject function, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw7$FUNCTION_W_O_RESULT_ISA, function)) {
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
                                                    kbi_function_wXo_result_isa_in_mts(function);
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
                                return list($kw7$FUNCTION_W_O_RESULT_ISA, function, data);
                            } else {
                                return list($kw7$FUNCTION_W_O_RESULT_ISA, function);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_function_wXo_result_isaP(function, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_function_wXo_result_isaP(SubLObject function, SubLObject data) {
        return format(NIL, $str_alt14$_s_isa___Function_Denotational_bu, function, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$__and_));
    }

    public static final SubLObject kbi_function_wXo_result_isa_in_mts(SubLObject function) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(function);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.non_predicate_functionP(function)) {
                            if (NIL == kb_accessors.result_isa(function, mt)) {
                                kbi_utilities.add_kbi_result(mt);
                                doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $function_wXo_result_genl_results$ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-RESULTS*");

    // defparameter
    public static final SubLSymbol $function_wXo_result_genl_time$ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-TIME*");

    // defparameter
    public static final SubLSymbol $function_wXo_result_genl_count$ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-COUNT*");

    /**
     * test FUNCTION fort for no #$resultGenl assertions
     */
    public static final SubLObject function_wXo_result_genlP(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw24$FUNCTION_W_O_RESULT_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($kw24$FUNCTION_W_O_RESULT_GENL, function))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw24$FUNCTION_W_O_RESULT_GENL);
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
                                                        kbi_function_wXo_result_genl_in_mts(function);
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
                    kbi_utilities.kbi_increment_time($kw24$FUNCTION_W_O_RESULT_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FUNCTION-W/O-RESULT-GENL applies to FUNCTION
     */
    public static final SubLObject why_function_wXo_result_genlP(SubLObject function, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw24$FUNCTION_W_O_RESULT_GENL, function)) {
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
                                                    kbi_function_wXo_result_genl_in_mts(function);
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
                                return list($kw24$FUNCTION_W_O_RESULT_GENL, function, data);
                            } else {
                                return list($kw24$FUNCTION_W_O_RESULT_GENL, function);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_function_wXo_result_genlP(function, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_function_wXo_result_genlP(SubLObject function, SubLObject data) {
        return format(NIL, $str_alt26$_s_isa___CollectionDenotingFuncti, function, string_utilities.stringify_items(data, symbol_function(STR), $str_alt16$__, $str_alt17$__and_));
    }

    public static final SubLObject kbi_function_wXo_result_genl_in_mts(SubLObject function) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(function);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.non_predicate_functionP(function)) {
                            if (NIL != isa.isaP(function, $$CollectionDenotingFunction, mt, UNPROVIDED)) {
                                if (NIL == kb_accessors.result_genl(function, mt, UNPROVIDED)) {
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
    public static final SubLSymbol $function_wXredundant_result_isa_results$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $function_wXredundant_result_isa_time$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $function_wXredundant_result_isa_count$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-COUNT*");

    /**
     * test FUNCTION fort for redundant #$resultIsa assertions
     */
    public static final SubLObject function_wXredundant_result_isaP(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, function))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA);
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
                                                        kbi_function_wXredundant_result_isa_in_mts(function);
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
                    kbi_utilities.kbi_increment_time($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FUNCTION-W/REDUNDANT-RESULT-ISA applies to FUNCTION
     */
    public static final SubLObject why_function_wXredundant_result_isaP(SubLObject function, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, function)) {
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
                                                    kbi_function_wXredundant_result_isa_in_mts(function);
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
                                return list($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, function, data);
                            } else {
                                return list($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, function);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_function_wXredundant_result_isaP(function, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_function_wXredundant_result_isaP(SubLObject function, SubLObject data) {
        {
            SubLObject nl_result = $str_alt36$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXtype = NIL;
            for (mtXtype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXtype = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXtype;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject types = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    types = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt38$___s_has_redundant___resultIsa__a, new SubLObject[]{ function, string_utilities.stringify_items(types, symbol_function(STR), $str_alt16$__, $str_alt17$__and_), mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt37);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_function_wXredundant_result_isa_in_mts(SubLObject function) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(function);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.non_predicate_functionP(function)) {
                            if (NIL != isa.isaP(function, $$CollectionDenotingFunction, mt, UNPROVIDED)) {
                                {
                                    SubLObject cols = kb_accessors.result_isa(function, mt);
                                    SubLObject mins = genls.min_cols(cols, mt, UNPROVIDED);
                                    SubLObject redundant = set_difference(cols, mins, UNPROVIDED, UNPROVIDED);
                                    if (NIL != redundant) {
                                        kbi_utilities.add_kbi_result(list(mt, redundant));
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
    public static final SubLSymbol $function_wXredundant_result_genl_results$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-RESULTS*");

    // defparameter
    public static final SubLSymbol $function_wXredundant_result_genl_time$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-TIME*");

    // defparameter
    public static final SubLSymbol $function_wXredundant_result_genl_count$ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-COUNT*");

    /**
     * test FUNCTION fort for redundant #$resultGenl assertions
     */
    public static final SubLObject function_wXredundant_result_genlP(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, function))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL);
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
                                                        kbi_function_wXredundant_result_genl_in_mts(function);
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
                    kbi_utilities.kbi_increment_time($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :FUNCTION-W/REDUNDANT-RESULT-GENL applies to FUNCTION
     */
    public static final SubLObject why_function_wXredundant_result_genlP(SubLObject function, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, function)) {
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
                                                    kbi_function_wXredundant_result_genl_in_mts(function);
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
                                return list($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, function, data);
                            } else {
                                return list($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, function);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_function_wXredundant_result_genlP(function, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_function_wXredundant_result_genlP(SubLObject function, SubLObject data) {
        {
            SubLObject nl_result = $str_alt36$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXtype = NIL;
            for (mtXtype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXtype = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXtype;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject types = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt37);
                    types = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt47$___s_has_redundant___resultGenl__, new SubLObject[]{ function, string_utilities.stringify_items(types, symbol_function(STR), $str_alt16$__, $str_alt17$__and_), mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt37);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_function_wXredundant_result_genl_in_mts(SubLObject function) {
        {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(function);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL != fort_types_interface.non_predicate_functionP(function)) {
                            if (NIL != isa.isaP(function, $$CollectionDenotingFunction, mt, UNPROVIDED)) {
                                {
                                    SubLObject cols = kb_accessors.result_genl(function, mt, UNPROVIDED);
                                    SubLObject mins = genls.min_cols(cols, mt, UNPROVIDED);
                                    SubLObject redundant = set_difference(cols, mins, UNPROVIDED, UNPROVIDED);
                                    if (NIL != redundant) {
                                        kbi_utilities.add_kbi_result(list(mt, redundant));
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

    public static final SubLObject declare_kbi_function_file() {
        declareFunction("diagnose_qua_function", "DIAGNOSE-QUA-FUNCTION", 1, 0, false);
        declareFunction("function_wXo_result_isaP", "FUNCTION-W/O-RESULT-ISA?", 1, 0, false);
        declareFunction("why_function_wXo_result_isaP", "WHY-FUNCTION-W/O-RESULT-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_function_wXo_result_isaP", "KBI-NL-WHY-FUNCTION-W/O-RESULT-ISA?", 2, 0, false);
        declareFunction("kbi_function_wXo_result_isa_in_mts", "KBI-FUNCTION-W/O-RESULT-ISA-IN-MTS", 1, 0, false);
        declareFunction("function_wXo_result_genlP", "FUNCTION-W/O-RESULT-GENL?", 1, 0, false);
        declareFunction("why_function_wXo_result_genlP", "WHY-FUNCTION-W/O-RESULT-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_function_wXo_result_genlP", "KBI-NL-WHY-FUNCTION-W/O-RESULT-GENL?", 2, 0, false);
        declareFunction("kbi_function_wXo_result_genl_in_mts", "KBI-FUNCTION-W/O-RESULT-GENL-IN-MTS", 1, 0, false);
        declareFunction("function_wXredundant_result_isaP", "FUNCTION-W/REDUNDANT-RESULT-ISA?", 1, 0, false);
        declareFunction("why_function_wXredundant_result_isaP", "WHY-FUNCTION-W/REDUNDANT-RESULT-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_function_wXredundant_result_isaP", "KBI-NL-WHY-FUNCTION-W/REDUNDANT-RESULT-ISA?", 2, 0, false);
        declareFunction("kbi_function_wXredundant_result_isa_in_mts", "KBI-FUNCTION-W/REDUNDANT-RESULT-ISA-IN-MTS", 1, 0, false);
        declareFunction("function_wXredundant_result_genlP", "FUNCTION-W/REDUNDANT-RESULT-GENL?", 1, 0, false);
        declareFunction("why_function_wXredundant_result_genlP", "WHY-FUNCTION-W/REDUNDANT-RESULT-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_function_wXredundant_result_genlP", "KBI-NL-WHY-FUNCTION-W/REDUNDANT-RESULT-GENL?", 2, 0, false);
        declareFunction("kbi_function_wXredundant_result_genl_in_mts", "KBI-FUNCTION-W/REDUNDANT-RESULT-GENL-IN-MTS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_function_file() {
        defparameter("*FUNCTION-W/O-RESULT-ISA-RESULTS*", NIL);
        defparameter("*FUNCTION-W/O-RESULT-ISA-TIME*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/O-RESULT-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/O-RESULT-GENL-RESULTS*", NIL);
        defparameter("*FUNCTION-W/O-RESULT-GENL-TIME*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/O-RESULT-GENL-COUNT*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-ISA-RESULTS*", NIL);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-ISA-TIME*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-GENL-RESULTS*", NIL);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-GENL-TIME*", ZERO_INTEGER);
        defparameter("*FUNCTION-W/REDUNDANT-RESULT-GENL-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_function_file() {
                {
            SubLObject item_var = $sym1$_FUNCTION_W_O_RESULT_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym1$_FUNCTION_W_O_RESULT_ISA_RESULTS_, $str_alt2$violators_of_kbi_module__FUNCTION);
        {
            SubLObject item_var = $sym3$_FUNCTION_W_O_RESULT_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym3$_FUNCTION_W_O_RESULT_ISA_TIME_, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym5$_FUNCTION_W_O_RESULT_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym5$_FUNCTION_W_O_RESULT_ISA_COUNT_, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw7$FUNCTION_W_O_RESULT_ISA, $list_alt13);
        {
            SubLObject item_var = $sym18$_FUNCTION_W_O_RESULT_GENL_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym18$_FUNCTION_W_O_RESULT_GENL_RESULTS_, $str_alt19$violators_of_kbi_module__FUNCTION);
        {
            SubLObject item_var = $sym20$_FUNCTION_W_O_RESULT_GENL_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym20$_FUNCTION_W_O_RESULT_GENL_TIME_, $str_alt21$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym22$_FUNCTION_W_O_RESULT_GENL_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym22$_FUNCTION_W_O_RESULT_GENL_COUNT_, $str_alt23$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw24$FUNCTION_W_O_RESULT_GENL, $list_alt25);
        {
            SubLObject item_var = $sym28$_FUNCTION_W_REDUNDANT_RESULT_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym28$_FUNCTION_W_REDUNDANT_RESULT_ISA_RESULTS_, $str_alt29$violators_of_kbi_module__FUNCTION);
        {
            SubLObject item_var = $sym30$_FUNCTION_W_REDUNDANT_RESULT_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym30$_FUNCTION_W_REDUNDANT_RESULT_ISA_TIME_, $str_alt31$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym32$_FUNCTION_W_REDUNDANT_RESULT_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym32$_FUNCTION_W_REDUNDANT_RESULT_ISA_COUNT_, $str_alt33$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw34$FUNCTION_W_REDUNDANT_RESULT_ISA, $list_alt35);
        {
            SubLObject item_var = $sym39$_FUNCTION_W_REDUNDANT_RESULT_GENL_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym39$_FUNCTION_W_REDUNDANT_RESULT_GENL_RESULTS_, $str_alt40$violators_of_kbi_module__FUNCTION);
        {
            SubLObject item_var = $sym41$_FUNCTION_W_REDUNDANT_RESULT_GENL_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym41$_FUNCTION_W_REDUNDANT_RESULT_GENL_TIME_, $str_alt42$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym43$_FUNCTION_W_REDUNDANT_RESULT_GENL_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym43$_FUNCTION_W_REDUNDANT_RESULT_GENL_COUNT_, $str_alt44$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw45$FUNCTION_W_REDUNDANT_RESULT_GENL, $list_alt46);
        return NIL;
    }



    static private final SubLSymbol $sym1$_FUNCTION_W_O_RESULT_ISA_RESULTS_ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__FUNCTION = makeString("violators of kbi module :FUNCTION-W/O-RESULT-ISA");

    static private final SubLSymbol $sym3$_FUNCTION_W_O_RESULT_ISA_TIME_ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FUNCTION-W/O-RESULT-ISA");

    static private final SubLSymbol $sym5$_FUNCTION_W_O_RESULT_ISA_COUNT_ = makeSymbol("*FUNCTION-W/O-RESULT-ISA-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FUNCTION-W/O-RESULT-ISA");

    public static final SubLSymbol $kw7$FUNCTION_W_O_RESULT_ISA = makeKeyword("FUNCTION-W/O-RESULT-ISA");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FUNCTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FUNCTION-W/O-RESULT-ISA-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FUNCTION-W/O-RESULT-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FUNCTION-W/O-RESULT-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FUNCTION-W/O-RESULT-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test FUNCTION fort for missing #$resultIsa assertions") });

    static private final SubLString $str_alt14$_s_isa___Function_Denotational_bu = makeString("~s isa #$Function-Denotational but has no #$resultIsa in mts: ~a");



    static private final SubLString $str_alt16$__ = makeString(", ");

    static private final SubLString $str_alt17$__and_ = makeString(", and ");

    static private final SubLSymbol $sym18$_FUNCTION_W_O_RESULT_GENL_RESULTS_ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-RESULTS*");

    static private final SubLString $str_alt19$violators_of_kbi_module__FUNCTION = makeString("violators of kbi module :FUNCTION-W/O-RESULT-GENL");

    static private final SubLSymbol $sym20$_FUNCTION_W_O_RESULT_GENL_TIME_ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-TIME*");

    static private final SubLString $str_alt21$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FUNCTION-W/O-RESULT-GENL");

    static private final SubLSymbol $sym22$_FUNCTION_W_O_RESULT_GENL_COUNT_ = makeSymbol("*FUNCTION-W/O-RESULT-GENL-COUNT*");

    static private final SubLString $str_alt23$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FUNCTION-W/O-RESULT-GENL");

    public static final SubLSymbol $kw24$FUNCTION_W_O_RESULT_GENL = makeKeyword("FUNCTION-W/O-RESULT-GENL");

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FUNCTION-W/O-RESULT-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FUNCTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FUNCTION-W/O-RESULT-GENL-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FUNCTION-W/O-RESULT-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FUNCTION-W/O-RESULT-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FUNCTION-W/O-RESULT-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test FUNCTION fort for no #$resultGenl assertions") });

    static private final SubLString $str_alt26$_s_isa___CollectionDenotingFuncti = makeString("~s isa #$CollectionDenotingFunction but has no #$resultGenl in mts: ~a");

    public static final SubLObject $$CollectionDenotingFunction = constant_handles.reader_make_constant_shell(makeString("CollectionDenotingFunction"));

    static private final SubLSymbol $sym28$_FUNCTION_W_REDUNDANT_RESULT_ISA_RESULTS_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-RESULTS*");

    static private final SubLString $str_alt29$violators_of_kbi_module__FUNCTION = makeString("violators of kbi module :FUNCTION-W/REDUNDANT-RESULT-ISA");

    static private final SubLSymbol $sym30$_FUNCTION_W_REDUNDANT_RESULT_ISA_TIME_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-TIME*");

    static private final SubLString $str_alt31$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FUNCTION-W/REDUNDANT-RESULT-ISA");

    static private final SubLSymbol $sym32$_FUNCTION_W_REDUNDANT_RESULT_ISA_COUNT_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-COUNT*");

    static private final SubLString $str_alt33$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FUNCTION-W/REDUNDANT-RESULT-ISA");

    public static final SubLSymbol $kw34$FUNCTION_W_REDUNDANT_RESULT_ISA = makeKeyword("FUNCTION-W/REDUNDANT-RESULT-ISA");

    static private final SubLList $list_alt35 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FUNCTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FUNCTION-W/REDUNDANT-RESULT-ISA-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FUNCTION-W/REDUNDANT-RESULT-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FUNCTION-W/REDUNDANT-RESULT-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FUNCTION-W/REDUNDANT-RESULT-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test FUNCTION fort for redundant #$resultIsa assertions") });

    static private final SubLString $str_alt36$ = makeString("");

    static private final SubLList $list_alt37 = list(makeSymbol("MT"), makeSymbol("TYPES"));

    static private final SubLString $str_alt38$___s_has_redundant___resultIsa__a = makeString("~%~s has redundant #$resultIsa ~a [in ~s]");

    static private final SubLSymbol $sym39$_FUNCTION_W_REDUNDANT_RESULT_GENL_RESULTS_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-RESULTS*");

    static private final SubLString $str_alt40$violators_of_kbi_module__FUNCTION = makeString("violators of kbi module :FUNCTION-W/REDUNDANT-RESULT-GENL");

    static private final SubLSymbol $sym41$_FUNCTION_W_REDUNDANT_RESULT_GENL_TIME_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-TIME*");

    static private final SubLString $str_alt42$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :FUNCTION-W/REDUNDANT-RESULT-GENL");

    static private final SubLSymbol $sym43$_FUNCTION_W_REDUNDANT_RESULT_GENL_COUNT_ = makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-COUNT*");

    static private final SubLString $str_alt44$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :FUNCTION-W/REDUNDANT-RESULT-GENL");

    public static final SubLSymbol $kw45$FUNCTION_W_REDUNDANT_RESULT_GENL = makeKeyword("FUNCTION-W/REDUNDANT-RESULT-GENL");

    static private final SubLList $list_alt46 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*FUNCTION-W/REDUNDANT-RESULT-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("FUNCTION"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-FUNCTION-W/REDUNDANT-RESULT-GENL-IN-MTS"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("FUNCTION-W/REDUNDANT-RESULT-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-FUNCTION-W/REDUNDANT-RESULT-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-FUNCTION-W/REDUNDANT-RESULT-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("KB"), makeKeyword("KBI-CONCERN-LEVEL"), makeKeyword("EL"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("REDUNDANCY"), makeKeyword("KBI-RESULT-TYPE"), $NOTE, makeKeyword("KBI-DOC"), makeString("test FUNCTION fort for redundant #$resultGenl assertions") });

    static private final SubLString $str_alt47$___s_has_redundant___resultGenl__ = makeString("~%~s has redundant #$resultGenl ~a [in ~s]");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_function_file();
    }

    public void initializeVariables() {
        init_kbi_function_file();
    }

    public void runTopLevelForms() {
        setup_kbi_function_file();
    }
}

