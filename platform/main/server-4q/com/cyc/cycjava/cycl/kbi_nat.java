/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-NAT
 *  source file: /cyc/top/cycl/kbi-nat.lisp
 *  created:     2019/07/03 17:39:06
 */
public final class kbi_nat extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_nat() {
    }

    public static final SubLFile me = new kbi_nat();


    // // Definitions
    public static final SubLObject diagnose_qua_nat(SubLObject nat) {
        return kbi_utilities.diagnose_qua_sub_domains(nat, $NAT);
    }

    // defparameter
    public static final SubLSymbol $nat_wXo_result_isa_results$ = makeSymbol("*NAT-W/O-RESULT-ISA-RESULTS*");

    // defparameter
    public static final SubLSymbol $nat_wXo_result_isa_time$ = makeSymbol("*NAT-W/O-RESULT-ISA-TIME*");

    // defparameter
    public static final SubLSymbol $nat_wXo_result_isa_count$ = makeSymbol("*NAT-W/O-RESULT-ISA-COUNT*");

    /**
     * test nat fort for #$isa not in compliance with applicable #$resultIsa
     */
    public static final SubLObject nat_wXo_result_isaP(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw7$NAT_W_O_RESULT_ISA)) && (NIL != kbi_utilities.kbi_applies_toP($kw7$NAT_W_O_RESULT_ISA, nat))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw7$NAT_W_O_RESULT_ISA);
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
                                                        kbi_nat_wXo_result_isaP(nat);
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
                    kbi_utilities.kbi_increment_time($kw7$NAT_W_O_RESULT_ISA, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :NAT-W/O-RESULT-ISA applies to NAT
     */
    public static final SubLObject why_nat_wXo_result_isaP(SubLObject nat, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw7$NAT_W_O_RESULT_ISA, nat)) {
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
                                                    kbi_nat_wXo_result_isaP(nat);
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
                                return list($kw7$NAT_W_O_RESULT_ISA, nat, data);
                            } else {
                                return list($kw7$NAT_W_O_RESULT_ISA, nat);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_nat_wXo_result_isaP(nat, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_nat_wXo_result_isaP(SubLObject nat, SubLObject data) {
        {
            SubLObject nl_result = $str_alt14$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXisa = NIL;
            for (mtXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXisa = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXisa;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject v_isa = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    v_isa = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt16$___s_is_not___isa__s_despite___re, new SubLObject[]{ nat, v_isa, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_nat_wXo_result_isaP(SubLObject nat) {
        {
            SubLObject tou = narts_high.nart_hl_formula(nat);
            SubLObject fn = cycl_utilities.nat_functor(tou);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(nat);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var_5 = kb_accessors.result_isa(fn, mt);
                                SubLObject result_isa = NIL;
                                for (result_isa = csome_list_var_5.first(); !((NIL != doneP) || (NIL == csome_list_var_5)); csome_list_var_5 = csome_list_var_5.rest() , result_isa = csome_list_var_5.first()) {
                                    if (NIL == isa.isaP(nat, result_isa, mt, UNPROVIDED)) {
                                        kbi_utilities.add_kbi_result(list(mt, result_isa));
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
    public static final SubLSymbol $nat_wXo_result_genl_results$ = makeSymbol("*NAT-W/O-RESULT-GENL-RESULTS*");

    // defparameter
    public static final SubLSymbol $nat_wXo_result_genl_time$ = makeSymbol("*NAT-W/O-RESULT-GENL-TIME*");

    // defparameter
    public static final SubLSymbol $nat_wXo_result_genl_count$ = makeSymbol("*NAT-W/O-RESULT-GENL-COUNT*");

    /**
     * test NAT for #$isa not in compliance with applicable #$resultIsa
     */
    public static final SubLObject nat_wXo_result_genlP(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw23$NAT_W_O_RESULT_GENL)) && (NIL != kbi_utilities.kbi_applies_toP($kw23$NAT_W_O_RESULT_GENL, nat))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw23$NAT_W_O_RESULT_GENL);
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
                                            SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    try {
                                                        kbi_nat_wXo_result_genlP(nat);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != kbi_macros.$kbi_result$.getDynamicValue(thread)) {
                                                                    malP = T;
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
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
                    kbi_utilities.kbi_increment_time($kw23$NAT_W_O_RESULT_GENL, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :NAT-W/O-RESULT-GENL applies to NAT
     */
    public static final SubLObject why_nat_wXo_result_genlP(SubLObject nat, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw23$NAT_W_O_RESULT_GENL, nat)) {
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
                                        SubLObject _prev_bind_0_8 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                try {
                                                    kbi_nat_wXo_result_genlP(nat);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            data = (kbi_macros.$kbi_result$.getDynamicValue(thread).isCons()) ? ((SubLObject) (nreverse(kbi_macros.$kbi_result$.getDynamicValue(thread)))) : kbi_macros.$kbi_result$.getDynamicValue(thread);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_8, thread);
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
                                return list($kw23$NAT_W_O_RESULT_GENL, nat, data);
                            } else {
                                return list($kw23$NAT_W_O_RESULT_GENL, nat);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_nat_wXo_result_genlP(nat, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_nat_wXo_result_genlP(SubLObject nat, SubLObject data) {
        {
            SubLObject nl_result = $str_alt14$;
            SubLObject cdolist_list_var = data;
            SubLObject mtXisa = NIL;
            for (mtXisa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mtXisa = cdolist_list_var.first()) {
                {
                    SubLObject datum = mtXisa;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject v_isa = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    v_isa = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        nl_result = cconcatenate(nl_result, format(NIL, $str_alt25$___s_is_not___genls__s_despite___, new SubLObject[]{ nat, v_isa, mt }));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
            }
            return nl_result;
        }
    }

    public static final SubLObject kbi_nat_wXo_result_genlP(SubLObject nat) {
        {
            SubLObject tou = narts_high.nart_hl_formula(nat);
            SubLObject fn = cycl_utilities.nat_functor(tou);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = isa.type_mts(nat);
                    SubLObject mt = NIL;
                    for (mt = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var_10 = kb_accessors.result_genl(fn, mt, UNPROVIDED);
                                SubLObject result_genl = NIL;
                                for (result_genl = csome_list_var_10.first(); !((NIL != doneP) || (NIL == csome_list_var_10)); csome_list_var_10 = csome_list_var_10.rest() , result_genl = csome_list_var_10.first()) {
                                    if (NIL == genls.genlP(nat, result_genl, mt, UNPROVIDED)) {
                                        kbi_utilities.add_kbi_result(list(mt, result_genl));
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
    public static final SubLSymbol $nat_wXo_unique_tou_results$ = makeSymbol("*NAT-W/O-UNIQUE-TOU-RESULTS*");

    // defparameter
    public static final SubLSymbol $nat_wXo_unique_tou_time$ = makeSymbol("*NAT-W/O-UNIQUE-TOU-TIME*");

    // defparameter
    public static final SubLSymbol $nat_wXo_unique_tou_count$ = makeSymbol("*NAT-W/O-UNIQUE-TOU-COUNT*");

    /**
     * test nat fort for multiple nonreified versions
     */
    public static final SubLObject nat_wXo_unique_touP(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw32$NAT_W_O_UNIQUE_TOU)) && (NIL != kbi_utilities.kbi_applies_toP($kw32$NAT_W_O_UNIQUE_TOU, nat))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw32$NAT_W_O_UNIQUE_TOU);
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
                                                        kbi_nat_wXo_unique_touP(nat);
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
                    kbi_utilities.kbi_increment_time($kw32$NAT_W_O_UNIQUE_TOU, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :NAT-W/O-UNIQUE-TOU applies to NAT
     */
    public static final SubLObject why_nat_wXo_unique_touP(SubLObject nat, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw32$NAT_W_O_UNIQUE_TOU, nat)) {
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
                                                    kbi_nat_wXo_unique_touP(nat);
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
                                return list($kw32$NAT_W_O_UNIQUE_TOU, nat, data);
                            } else {
                                return list($kw32$NAT_W_O_UNIQUE_TOU, nat);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_nat_wXo_unique_touP(nat, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_nat_wXo_unique_touP(SubLObject nat, SubLObject data) {
        return format(NIL, $str_alt34$_s_denotes_multiple_nats___a, nat, string_utilities.stringify_items(data, symbol_function(STR), $str_alt36$__, $str_alt37$_and_));
    }

    public static final SubLObject kbi_nat_wXo_unique_touP(SubLObject nat) {
        {
            SubLObject tou = narts_high.nart_hl_formula(nat);
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                if (NIL != kbi_utilities.kbi_result()) {
                    kbi_utilities.add_kbi_result(tou);
                }
            }
            return kbi_utilities.kbi_result();
        }
    }

    // defparameter
    public static final SubLSymbol $nat_wXsibling_results$ = makeSymbol("*NAT-W/SIBLING-RESULTS*");

    // defparameter
    public static final SubLSymbol $nat_wXsibling_time$ = makeSymbol("*NAT-W/SIBLING-TIME*");

    // defparameter
    public static final SubLSymbol $nat_wXsibling_count$ = makeSymbol("*NAT-W/SIBLING-COUNT*");

    /**
     * test nat fort for sibling nats denoting same nonreified terms
     */
    public static final SubLObject nat_wXsiblingP(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != kbi_utilities.run_kbi_moduleP($kw44$NAT_W_SIBLING)) && (NIL != kbi_utilities.kbi_applies_toP($kw44$NAT_W_SIBLING, nat))) {
                {
                    SubLObject malP = NIL;
                    SubLObject time = NIL;
                    kbi_utilities.kbi_increment_count($kw44$NAT_W_SIBLING);
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
                                                        kbi_nat_wXsiblingP(nat);
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
                    kbi_utilities.kbi_increment_time($kw44$NAT_W_SIBLING, time);
                    return malP;
                }
            }
            return NIL;
        }
    }

    /**
     * explanation of why kbi module :NAT-W/SIBLING applies to NAT
     */
    public static final SubLObject why_nat_wXsiblingP(SubLObject nat, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = kbi_vars.$kbi_iXo_mode$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != kbi_utilities.kbi_findingP($kw44$NAT_W_SIBLING, nat)) {
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
                                                    kbi_nat_wXsiblingP(nat);
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
                                return list($kw44$NAT_W_SIBLING, nat, data);
                            } else {
                                return list($kw44$NAT_W_SIBLING, nat);
                            }
                        } else
                            if (pcase_var.eql($NL)) {
                                return kbi_nl_why_nat_wXsiblingP(nat, data);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject kbi_nl_why_nat_wXsiblingP(SubLObject nat, SubLObject data) {
        return format(NIL, $str_alt46$_s__id____s__has_sibling_nat_a_wi, new SubLObject[]{ nat, nart_handles.nart_id(nat), NIL != data.rest() ? ((SubLObject) ($$$s)) : $str_alt14$, NIL != data.rest() ? ((SubLObject) ($$$s)) : $str_alt14$, string_utilities.stringify_items(Mapping.mapcar(NART_ID, data), symbol_function(STR), $str_alt36$__, $str_alt37$_and_), narts_high.nart_hl_formula(nat) });
    }

    public static final SubLObject kbi_nat_wXsiblingP(SubLObject nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tou = narts_high.nart_hl_formula(nat);
                SubLObject doneP = NIL;
                SubLObject idx = nart_handles.do_narts_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_NARTs, STRINGP);
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
                        utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_NARTs);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject nat_1 = NIL;
                                while (NIL != id) {
                                    nat_1 = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, nat_1, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == doneP) {
                                            {
                                                SubLObject tou_1 = narts_high.nart_hl_formula(nat_1);
                                                if (tou.equal(tou_1)) {
                                                    if (nat != nat_1) {
                                                        kbi_utilities.add_kbi_result(nat_1);
                                                        doneP = kbi_utilities.kbi_doneP(UNPROVIDED);
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
                return kbi_utilities.kbi_result();
            }
        }
    }

    public static final SubLObject declare_kbi_nat_file() {
        declareFunction("diagnose_qua_nat", "DIAGNOSE-QUA-NAT", 1, 0, false);
        declareFunction("nat_wXo_result_isaP", "NAT-W/O-RESULT-ISA?", 1, 0, false);
        declareFunction("why_nat_wXo_result_isaP", "WHY-NAT-W/O-RESULT-ISA?", 1, 1, false);
        declareFunction("kbi_nl_why_nat_wXo_result_isaP", "KBI-NL-WHY-NAT-W/O-RESULT-ISA?", 2, 0, false);
        declareFunction("kbi_nat_wXo_result_isaP", "KBI-NAT-W/O-RESULT-ISA?", 1, 0, false);
        declareFunction("nat_wXo_result_genlP", "NAT-W/O-RESULT-GENL?", 1, 0, false);
        declareFunction("why_nat_wXo_result_genlP", "WHY-NAT-W/O-RESULT-GENL?", 1, 1, false);
        declareFunction("kbi_nl_why_nat_wXo_result_genlP", "KBI-NL-WHY-NAT-W/O-RESULT-GENL?", 2, 0, false);
        declareFunction("kbi_nat_wXo_result_genlP", "KBI-NAT-W/O-RESULT-GENL?", 1, 0, false);
        declareFunction("nat_wXo_unique_touP", "NAT-W/O-UNIQUE-TOU?", 1, 0, false);
        declareFunction("why_nat_wXo_unique_touP", "WHY-NAT-W/O-UNIQUE-TOU?", 1, 1, false);
        declareFunction("kbi_nl_why_nat_wXo_unique_touP", "KBI-NL-WHY-NAT-W/O-UNIQUE-TOU?", 2, 0, false);
        declareFunction("kbi_nat_wXo_unique_touP", "KBI-NAT-W/O-UNIQUE-TOU?", 1, 0, false);
        declareFunction("nat_wXsiblingP", "NAT-W/SIBLING?", 1, 0, false);
        declareFunction("why_nat_wXsiblingP", "WHY-NAT-W/SIBLING?", 1, 1, false);
        declareFunction("kbi_nl_why_nat_wXsiblingP", "KBI-NL-WHY-NAT-W/SIBLING?", 2, 0, false);
        declareFunction("kbi_nat_wXsiblingP", "KBI-NAT-W/SIBLING?", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbi_nat_file() {
        defparameter("*NAT-W/O-RESULT-ISA-RESULTS*", NIL);
        defparameter("*NAT-W/O-RESULT-ISA-TIME*", ZERO_INTEGER);
        defparameter("*NAT-W/O-RESULT-ISA-COUNT*", ZERO_INTEGER);
        defparameter("*NAT-W/O-RESULT-GENL-RESULTS*", NIL);
        defparameter("*NAT-W/O-RESULT-GENL-TIME*", ZERO_INTEGER);
        defparameter("*NAT-W/O-RESULT-GENL-COUNT*", ZERO_INTEGER);
        defparameter("*NAT-W/O-UNIQUE-TOU-RESULTS*", NIL);
        defparameter("*NAT-W/O-UNIQUE-TOU-TIME*", ZERO_INTEGER);
        defparameter("*NAT-W/O-UNIQUE-TOU-COUNT*", ZERO_INTEGER);
        defparameter("*NAT-W/SIBLING-RESULTS*", NIL);
        defparameter("*NAT-W/SIBLING-TIME*", ZERO_INTEGER);
        defparameter("*NAT-W/SIBLING-COUNT*", ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kbi_nat_file() {
                {
            SubLObject item_var = $sym1$_NAT_W_O_RESULT_ISA_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym1$_NAT_W_O_RESULT_ISA_RESULTS_, $str_alt2$violators_of_kbi_module__NAT_W_O_);
        {
            SubLObject item_var = $sym3$_NAT_W_O_RESULT_ISA_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym3$_NAT_W_O_RESULT_ISA_TIME_, $str_alt4$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym5$_NAT_W_O_RESULT_ISA_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym5$_NAT_W_O_RESULT_ISA_COUNT_, $str_alt6$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw7$NAT_W_O_RESULT_ISA, $list_alt13);
        {
            SubLObject item_var = $sym17$_NAT_W_O_RESULT_GENL_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym17$_NAT_W_O_RESULT_GENL_RESULTS_, $str_alt18$violators_of_kbi_module__NAT_W_O_);
        {
            SubLObject item_var = $sym19$_NAT_W_O_RESULT_GENL_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym19$_NAT_W_O_RESULT_GENL_TIME_, $str_alt20$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym21$_NAT_W_O_RESULT_GENL_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym21$_NAT_W_O_RESULT_GENL_COUNT_, $str_alt22$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw23$NAT_W_O_RESULT_GENL, $list_alt24);
        {
            SubLObject item_var = $sym26$_NAT_W_O_UNIQUE_TOU_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym26$_NAT_W_O_UNIQUE_TOU_RESULTS_, $str_alt27$violators_of_kbi_module__NAT_W_O_);
        {
            SubLObject item_var = $sym28$_NAT_W_O_UNIQUE_TOU_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym28$_NAT_W_O_UNIQUE_TOU_TIME_, $str_alt29$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym30$_NAT_W_O_UNIQUE_TOU_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym30$_NAT_W_O_UNIQUE_TOU_COUNT_, $str_alt31$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw32$NAT_W_O_UNIQUE_TOU, $list_alt33);
        {
            SubLObject item_var = $sym38$_NAT_W_SIBLING_RESULTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym38$_NAT_W_SIBLING_RESULTS_, $str_alt39$violators_of_kbi_module__NAT_W_SI);
        {
            SubLObject item_var = $sym40$_NAT_W_SIBLING_TIME_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym40$_NAT_W_SIBLING_TIME_, $str_alt41$run_time_of_predicate_application);
        {
            SubLObject item_var = $sym42$_NAT_W_SIBLING_COUNT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym42$_NAT_W_SIBLING_COUNT_, $str_alt43$number_of_predicate_applications_);
        kbi_utilities.install_kbi_module($kw44$NAT_W_SIBLING, $list_alt45);
        return NIL;
    }



    static private final SubLSymbol $sym1$_NAT_W_O_RESULT_ISA_RESULTS_ = makeSymbol("*NAT-W/O-RESULT-ISA-RESULTS*");

    static private final SubLString $str_alt2$violators_of_kbi_module__NAT_W_O_ = makeString("violators of kbi module :NAT-W/O-RESULT-ISA");

    static private final SubLSymbol $sym3$_NAT_W_O_RESULT_ISA_TIME_ = makeSymbol("*NAT-W/O-RESULT-ISA-TIME*");

    static private final SubLString $str_alt4$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :NAT-W/O-RESULT-ISA");

    static private final SubLSymbol $sym5$_NAT_W_O_RESULT_ISA_COUNT_ = makeSymbol("*NAT-W/O-RESULT-ISA-COUNT*");

    static private final SubLString $str_alt6$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :NAT-W/O-RESULT-ISA");

    public static final SubLSymbol $kw7$NAT_W_O_RESULT_ISA = makeKeyword("NAT-W/O-RESULT-ISA");





    private static final SubLSymbol $KBI_ERROR = makeKeyword("KBI-ERROR");





    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*NAT-W/O-RESULT-ISA-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*NAT-W/O-RESULT-ISA-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*NAT-W/O-RESULT-ISA-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("NAT"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-NAT-W/O-RESULT-ISA?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("NAT-W/O-RESULT-ISA?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-NAT-W/O-RESULT-ISA?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-NAT-W/O-RESULT-ISA?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test nat fort for #$isa not in compliance with applicable #$resultIsa") });

    static private final SubLString $str_alt14$ = makeString("");

    static private final SubLList $list_alt15 = list(makeSymbol("MT"), makeSymbol("ISA"));

    static private final SubLString $str_alt16$___s_is_not___isa__s_despite___re = makeString("~%~s is not #$isa ~s despite #$resultIsa [in ~s]");

    static private final SubLSymbol $sym17$_NAT_W_O_RESULT_GENL_RESULTS_ = makeSymbol("*NAT-W/O-RESULT-GENL-RESULTS*");

    static private final SubLString $str_alt18$violators_of_kbi_module__NAT_W_O_ = makeString("violators of kbi module :NAT-W/O-RESULT-GENL");

    static private final SubLSymbol $sym19$_NAT_W_O_RESULT_GENL_TIME_ = makeSymbol("*NAT-W/O-RESULT-GENL-TIME*");

    static private final SubLString $str_alt20$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :NAT-W/O-RESULT-GENL");

    static private final SubLSymbol $sym21$_NAT_W_O_RESULT_GENL_COUNT_ = makeSymbol("*NAT-W/O-RESULT-GENL-COUNT*");

    static private final SubLString $str_alt22$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :NAT-W/O-RESULT-GENL");

    public static final SubLSymbol $kw23$NAT_W_O_RESULT_GENL = makeKeyword("NAT-W/O-RESULT-GENL");

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*NAT-W/O-RESULT-GENL-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*NAT-W/O-RESULT-GENL-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*NAT-W/O-RESULT-GENL-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("NAT"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-NAT-W/O-RESULT-GENL?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("NAT-W/O-RESULT-GENL?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-NAT-W/O-RESULT-GENL?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-NAT-W/O-RESULT-GENL?"), makeKeyword("KBI-CONCERN-FOR"), makeKeyword("TMS"), makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("GAP"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test NAT for #$isa not in compliance with applicable #$resultIsa") });

    static private final SubLString $str_alt25$___s_is_not___genls__s_despite___ = makeString("~%~s is not #$genls ~s despite #$resultGenl [in ~s]");

    static private final SubLSymbol $sym26$_NAT_W_O_UNIQUE_TOU_RESULTS_ = makeSymbol("*NAT-W/O-UNIQUE-TOU-RESULTS*");

    static private final SubLString $str_alt27$violators_of_kbi_module__NAT_W_O_ = makeString("violators of kbi module :NAT-W/O-UNIQUE-TOU");

    static private final SubLSymbol $sym28$_NAT_W_O_UNIQUE_TOU_TIME_ = makeSymbol("*NAT-W/O-UNIQUE-TOU-TIME*");

    static private final SubLString $str_alt29$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :NAT-W/O-UNIQUE-TOU");

    static private final SubLSymbol $sym30$_NAT_W_O_UNIQUE_TOU_COUNT_ = makeSymbol("*NAT-W/O-UNIQUE-TOU-COUNT*");

    static private final SubLString $str_alt31$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :NAT-W/O-UNIQUE-TOU");

    public static final SubLSymbol $kw32$NAT_W_O_UNIQUE_TOU = makeKeyword("NAT-W/O-UNIQUE-TOU");

    static private final SubLList $list_alt33 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*NAT-W/O-UNIQUE-TOU-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*NAT-W/O-UNIQUE-TOU-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*NAT-W/O-UNIQUE-TOU-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("NAT"), makeKeyword("KBI-LEVEL"), TWO_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-NAT-W/O-UNIQUE-TOU?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("NAT-W/O-UNIQUE-TOU?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-NAT-W/O-UNIQUE-TOU?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-NAT-W/O-UNIQUE-TOU?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test nat fort for multiple nonreified versions") });

    static private final SubLString $str_alt34$_s_denotes_multiple_nats___a = makeString("~s denotes multiple nats: ~a");



    static private final SubLString $str_alt36$__ = makeString(", ");

    static private final SubLString $str_alt37$_and_ = makeString(" and ");

    static private final SubLSymbol $sym38$_NAT_W_SIBLING_RESULTS_ = makeSymbol("*NAT-W/SIBLING-RESULTS*");

    static private final SubLString $str_alt39$violators_of_kbi_module__NAT_W_SI = makeString("violators of kbi module :NAT-W/SIBLING");

    static private final SubLSymbol $sym40$_NAT_W_SIBLING_TIME_ = makeSymbol("*NAT-W/SIBLING-TIME*");

    static private final SubLString $str_alt41$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module :NAT-W/SIBLING");

    static private final SubLSymbol $sym42$_NAT_W_SIBLING_COUNT_ = makeSymbol("*NAT-W/SIBLING-COUNT*");

    static private final SubLString $str_alt43$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module :NAT-W/SIBLING");

    public static final SubLSymbol $kw44$NAT_W_SIBLING = makeKeyword("NAT-W/SIBLING");

    static private final SubLList $list_alt45 = list(new SubLObject[]{ makeKeyword("KBI-RESULT-CACHE"), makeSymbol("*NAT-W/SIBLING-RESULTS*"), makeKeyword("KBI-TIME-CACHE"), makeSymbol("*NAT-W/SIBLING-TIME*"), makeKeyword("KBI-COUNT-CACHE"), makeSymbol("*NAT-W/SIBLING-COUNT*"), makeKeyword("KBI-DOMAIN"), makeKeyword("NAT"), makeKeyword("KBI-LEVEL"), THREE_INTEGER, makeKeyword("KBI-EVALUATION-FN"), makeSymbol("KBI-NAT-W/SIBLING?"), makeKeyword("KBI-PREDICATE-FN"), makeSymbol("NAT-W/SIBLING?"), makeKeyword("KBI-JUSTIFY-FN"), makeSymbol("WHY-NAT-W/SIBLING?"), makeKeyword("KBI-NL-JUST-FN"), makeSymbol("KBI-NL-WHY-NAT-W/SIBLING?"), makeKeyword("KBI-CONCERN-FOR"), $CODE, makeKeyword("KBI-CONCERN-TYPE"), makeKeyword("CONFLICT"), makeKeyword("KBI-RESULT-TYPE"), makeKeyword("ERROR"), makeKeyword("KBI-DOC"), makeString("test nat fort for sibling nats denoting same nonreified terms") });

    static private final SubLString $str_alt46$_s__id____s__has_sibling_nat_a_wi = makeString("~s (id = ~s) has sibling nat~a with id~a ~a");

    static private final SubLString $$$s = makeString("s");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    static private final SubLString $$$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");





    // // Initializers
    public void declareFunctions() {
        declare_kbi_nat_file();
    }

    public void initializeVariables() {
        init_kbi_nat_file();
    }

    public void runTopLevelForms() {
        setup_kbi_nat_file();
    }
}

